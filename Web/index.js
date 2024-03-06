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
    res.send('Página encontrada!')
})

app.get('/criar', function(req, res){
    res.send('Página encontrada!')
})

app.get('/home', function(req, res){
    res.send('Página encontrada!')
})

app.get('/opcoes', function(req, res){
    res.send('Página encontrada!')
})

app.get('/usuarios', function(req, res){
    res.send('Página encontrada!')
})

app.listen(PORT , () => {
    console.log('Servidor rondando na porta 3000!')
})

