<?php

class Pessoa {

    public $nome;
    public $cpf;
    public $rg;
    public $dataNascimento;

    function __construct($nome, $cpf, $rg, \DateTime $dataNascimento) {
        $this->nome = $nome;
        $this->cpf = $cpf;
        $this->rg = $rg;
        $this->dataNascimento = $dataNascimento;
    }

    public function idade() {
        if ($this->dataNascimento === null)
            return 0;
        else
            return intval($this->dataNascimento->diff(new \DateTime)->format('%y'));
    }

}

$pessoa = new Pessoa('Joao', '085489655478', '5612448', new \DateTime('01/01/1994'));

echo $pessoa->idade() . "\n";
?>