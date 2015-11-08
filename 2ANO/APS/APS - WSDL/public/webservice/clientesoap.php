<?php

$opt = array('location' => 'http://localhost:8070/webservice/servidorsoap.php',
    'uri' => 'http://localhost:8070/webservice/',
    'encoding' => 'UTF-8');

try {
    $cliente = new SoapClient(null, $opt);
    
    echo 'soma: ' . $cliente->somar(2, 3) . '<br>';
    echo 'substracao: ' . $cliente->subtrair(2, 3) . '<br>';
    echo 'multiplicacao: ' . $cliente->multiplicar(2, 3) . '<br>';
    echo 'divisao: ' . $cliente->dividir(2, 3) . '<br>';
} catch (SoapFault $e) {
    echo $e->getMessage();
}
?>
