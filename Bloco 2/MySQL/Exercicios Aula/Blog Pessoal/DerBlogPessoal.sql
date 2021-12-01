-- MySQL Script generated by MySQL Workbench
-- Tue Nov 30 10:01:43 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`tb_usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`tb_usuarios` (
  `id_user` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NOT NULL,
  `usuario` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `foto` VARCHAR(45) NULL,
  PRIMARY KEY (`id_user`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`tb_postagens`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`tb_postagens` (
  `id_post` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(100) NOT NULL,
  `texto` VARCHAR(500) NOT NULL,
  `data` DATE NOT NULL,
  `id_fk` INT NULL,
  PRIMARY KEY (`id_post`),
  INDEX `fk_id_post_idx` (`id_fk` ASC) VISIBLE,
  CONSTRAINT `fk_id_post`
    FOREIGN KEY (`id_fk`)
    REFERENCES `mydb`.`tb_usuarios` (`id_user`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`tb_tema`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`tb_tema` (
  `id_tema` INT NOT NULL AUTO_INCREMENT,
  `livro` VARCHAR(45) NOT NULL,
  `musica` VARCHAR(45) NOT NULL,
  `tecnologia` VARCHAR(45) NOT NULL,
  `fk_postagem_id` INT NULL,
  `fk_usuario_id` INT NULL,
  PRIMARY KEY (`id_tema`),
  INDEX `fk_user_idx` (`fk_usuario_id` ASC) VISIBLE,
  INDEX `fk_post_idx` (`fk_postagem_id` ASC) VISIBLE,
  CONSTRAINT `fk_user`
    FOREIGN KEY (`fk_usuario_id`)
    REFERENCES `mydb`.`tb_usuarios` (`id_user`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_post`
    FOREIGN KEY (`fk_postagem_id`)
    REFERENCES `mydb`.`tb_postagens` (`id_post`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;