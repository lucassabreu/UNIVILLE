<?php

//Chamando a classe calculadora
require_once('Calculadora.class.php');

//Configurações de serviço
$opt = array('uri' => 'http://localhost:8070/webservice/',
    'encoding' => 'UTF-8');

//instanciando o servidor
$servidor = new SoapServer(null, $opt);

// Atribuir a classe que vai lidar com as requisições
$servidor->setClass('Calculadora');

//Atendendo aos chamados
$servidor->handle();
?>