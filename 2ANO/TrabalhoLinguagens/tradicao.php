<?php

$nome = "Joao";
$idade = 18;

// função printf C
printf("%s tem %d anos\n\n", $nome, $idade);

// comando echo
echo "$nome tem $idade anos\n\n";

$_GET['total'] = 90;

$i = 0;
voltar:
$i++;
echo "Contando $i de 100\n";

if ($i < 100)
    goto voltar;

for ($i = 0; $i <= 100; $i++)
    echo "Contando $i de 100\n";
?>
