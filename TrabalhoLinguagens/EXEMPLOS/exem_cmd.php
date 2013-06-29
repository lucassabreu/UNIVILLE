<?php

if ($argc <> 2) {
    echo "Este script recebe apenas um parametro, que deve ser um arquivo XML.\n";
    return -1;
} else
    $xmlFile = $argv[1];

if (!file_exists($xmlFile)) {
    echo "O arquivo '$xmlFile' informado nao foi encontrado!\n";
    return -1;
} else
    $xml = simplexml_load_file($xmlFile);

foreach ($xml->livro as $livro) {
    echo "Livro: " . $livro->attributes()->id . "\n";
    echo " * Titulo: $livro->titulo\n";
    echo " * Categoria: $livro->categoria\n";
    echo " * Ano: $livro->ano\n";
    echo " * N. Paginas: $livro->paginas\n\n";
}
?>