<?php

$var = 100;

// if padrao
if ($var == 10) {
    echo "Var eh 10.\n";
} else {
    if ($var < 10) {
        echo "Var menor que 10.\n";
    } else {
        echo "Var maior que 10.\n";
    }
}

//if alternativo
if ($var == 10) :
    echo "Var eh 10";
elseif ($var < 10):
    echo "Var menor que 10.\n";
else:
    echo "Var maior que 10.\n";
endif;

// for padrao
for ($i = 0; $i < 10; $i++) {
    echo "Contando: $i.\n";
}

// for alternativo
for ($i = 0; $i < 10; $i++):
    echo "Contando: $i.\n";
endfor;

$arr = array(1, 2, 3, 4, 5);
// foreach padrao
foreach ($arr as $item) {
    echo "Listando: $item.\n";
}

// foreach alternativo
foreach ($arr as $item):
    echo "Listando: $item.\n";
endforeach;

$var = 1;
//switch padrao
switch ($var) {
    case 1:
        echo "Acao 1";
        break;
    case 2:
        echo "Acao 2";
        break;
    default:
        echo "Acao desconhecida";
}

//switch alternativo
switch ($var):
    case 1:
        echo "Acao 1";
        break;
    case 2:
        echo "Acao 2";
        break;
    default:
        echo "Acao desconhecida";
endswitch;
?>
