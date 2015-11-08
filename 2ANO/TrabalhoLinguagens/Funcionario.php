<?php

include 'Pessoa.php';

class Funcionario extends Pessoa {
    public $cargo = null;
}

$funcionario = new Pessoa('Joao', new \DateTime('01/01/1994'));
echo "Idade de $funcionario->nome tem " . $funcionario->idade() . " anos\n";

?>
