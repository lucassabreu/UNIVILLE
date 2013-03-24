<?php
class Pessoa {
    public $nome;
    public $dataNascimento;

    function __construct($nome, \DateTime $dataNascimento) {
        $this->nome = $nome;
        $this->dataNascimento = $dataNascimento;
    }

    public function idade() {
        return intval($this->dataNascimento->diff(new \DateTime)->format('%y'));
    }
}

$pessoa = new Pessoa('Joao', '085489655478', '5612448', new \DateTime('01/01/1994'));
echo "Idade de $pessoa->nome eh " . $pessoa->idade() . "\n";
?>