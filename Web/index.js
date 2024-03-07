const express = require('express')
const app = express()
const handlebars = require('express-handlebars')
const bodyParse = require('body-parser')

const PORT = 3000

app.engine('handlebars', handlebars.engine( {defaultLayout: 'main'} ))
app.set('view engine', 'handlebars')
app.use(bodyParse.urlencoded({extended: false}))
app.use(bodyParse.json())

app.get('/', function(req, res){
    
})

app.get('/entrar', function(req, res){
    res.render('auth/entrar')
})

app.get('/registrar', function(req, res){
    res.render('auth/registrar')
})

app.get('/1799312d41b066711ae55a5954ee4f664c2a620f', function(req, res){
    res.render('auth/recuperarSenha')
})

app.get('/1893c692e7eef1bd59d306b129e3e7cc6ef71d72', function(req, res){
    res.render('auth/confirmarOPT')
})

app.listen(PORT , () => {
    console.log('Servidor rondando na porta 3000!')
})

