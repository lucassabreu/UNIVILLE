<?php

/**
 * Classe Calculadora
 * 
 * Classe que simula uma calculadora.
 * 
 * @author Alexandre A. de Melo
 * @since 2013
 * @version 1 
 */
class Calculadora {

    // Método que será disponibilizado como serviço
    public function somar($n1, $n2) {
        return $n1 + $n2;
    }

    // Método que será disponibilizado como serviço
    public function subtrair($n1, $n2) {
        return $n1 - $n2;
    }

    // Método que será disponibilizado como serviço
    public function dividir($n1, $n2) {
        return $n1 / $n2;
    }

    // Método que será disponibilizado como serviço
    public function multiplicar($n1, $n2) {
        return $n1 * $n2;
    }

}

?>
