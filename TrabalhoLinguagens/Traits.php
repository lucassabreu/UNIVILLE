<?php

trait Voador {
    public function voar() {
        echo "Voando...\n";
    }
}

class Aviao {
    use Voador;
}

class Passaro {
    use Voador;
}

$avaio = new Aviao();
$passaro = new Passaro();

echo "Aviao: ";
$avaio->voar();

echo "Passaro: ";
$passaro->voar();

?>
