//Função para o botão navBar
function trocar() {
    let header = document.querySelector('header')
    header.classList.toggle('ativo')
  }

  /*
Case Sensitive = reconhece letras maiusculas e minusculas
por Tag: getElementByTagName()
por Id: getElementById()
por Nome: getElementsByName()
por Classe: getElementsByClassName()
por Seletor: querySelector()
no JS as funções não são tipadas, tipo float, int, String

Var = Variavel de escopo (determinado local) global, pode ser acessado por todo o codigo
Let = Não pode ser acessada por todo o código (mais utilizada)
Const = Variavel constante e pouco utilizada, não pode ser modificada

*/

let nome = window.document.getElementById('nome') 
let email = window.document.querySelector('#email') // tanto faz usar window ou não.
let assunto = window.document.querySelector('#assunto') //# por causa de um seletor e por ser um id, se fosse classe seria "."
let nomeOk = false
let emailOk = false
let assuntoOk = false
let mapa = document.querySelector('#mapa')

nome.style.width= '100%' //alterar o estilo através do javaScript, mesma coisa que pelo CSS
email.style.width = '100%'
assunto.style.width = '100%'

function validaNome() {
  let txtNome = document.querySelector('#txtNome')
   if (nome.value.length < 3) {
      txtNome.innerHTML = 'Nome Inválido, tente novamente.'
      txtNome.style.color = 'red' 
   } else {
      txtNome.innerHTML = 'Nome Válido'
      txtNome.style.color = 'green'
      nomeOk = true
   }
  }

function validaEmail() {
  let txtEmail = document.querySelector('#txtEmail') 

  if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1 ) {
     txtEmail.innerHTML = 'E-mail inválido, tente novamente.'
     txtEmail.style.color = 'red'
  } else {
     txtEmail.innerHTML = 'E-mail válido'
     txtEmail.style.color = 'green'
     emailOk = true
  }
}

function validaAssunto() {
  let txtAssunto = document.querySelector('#txtAssunto')

  if (assunto.value.length >= 100) {
     txtAssunto.innerHTML = 'Texto é muito grande, digite no máximo 100 caracteres'
     txtAssunto.style.color = 'red'
     txtAssunto.style.display = 'block'
  } else {
     txtAssunto.style.display = 'none'
     assuntoOk = true
  }
}

function enviar() {
  if (nomeOk == true && emailOk == true && assuntoOk == true) {
     alert ('Formulário enviado com sucesso!')
  } else {
     alert ('Preencha o formulário corretamente antes de enviar...')
  }
}
function mapaZoom() {
  mapa.style.width = '800px'
  mapa.style.height = '600px'
}

function mapaNormal() {
  mapa.style.width = '400px'
  mapa.style.height = '250px'
}