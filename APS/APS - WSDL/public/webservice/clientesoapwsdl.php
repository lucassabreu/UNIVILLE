<?php

$opt = array('encoding' => 'UTF-8');

try {
    
    //fazendo a requisição do serviço
    $cliente = new SoapClient('http://localhost:8070/webservice/servidorsoapwsdl.php?wsdl', $opt);

    echo '<pre>';
    var_dump($cliente->__getFunctions()); //pegando os serviços disponíveis
    echo '</pre>';

    echo 'soma: ' . $cliente->somar(4, 3) . '<br>';

} catch (SoapFault $e) {
    echo $e->getMessage();
}

?>
