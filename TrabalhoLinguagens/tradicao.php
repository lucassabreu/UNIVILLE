<?php
$nome = "Joao";
$idade = 18;

// função printf C
printf("%s tem %d anos\n\n", $nome, $idade);

// comando echo
echo "$nome tem $idade anos\n\n";

$_GET['total'] = 90;

$total = 0;
voltar:
    $total = $_GET['total'] + $total;
    
    if ($total < 100)
        goto voltar;
    else
        echo $total . "\n";
?>
