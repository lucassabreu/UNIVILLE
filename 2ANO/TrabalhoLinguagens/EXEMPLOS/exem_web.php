<?php

if (isset($_GET['nome'])) {
    $nome = $_GET['nome'];
} else {
    $nome = "Mundo";
}

echo "Ola $nome!";
?>
