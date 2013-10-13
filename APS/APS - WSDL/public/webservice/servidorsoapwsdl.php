<?php

require_once('Calculadora.class.php');

$opt = array('encoding' => 'UTF-8');
$server = new SoapServer('http://localhost:8070/webservice/calculadorasoap.wsdl', $opt);

$server->setClass('Calculadora');
$server->handle();
?>
