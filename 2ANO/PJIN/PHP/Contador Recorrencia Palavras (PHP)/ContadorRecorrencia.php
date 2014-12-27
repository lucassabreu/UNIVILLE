<?php
// não consederar esta parte para a contagem de linhas
$script_start = microtime(true);
// fim da parte descriminada
$texto = " " . preg_replace("/\\W+/", " ", strtolower(file_get_contents($argv[1]))) . " ";
while (preg_match("/\\w+/", $texto)) {
    $p = strtok($texto, " ");
    $contador = 0;
    do {
        $contador += preg_match_all("/\\W+($p)\\W+/", $texto);
        $texto = preg_replace("/\\W+($p)\\W+/", " ", $texto);
    } while (preg_match("/\\W+($p)\\W+/", $texto));
    print "$p - $contador \n";
}
// não consederar esta parte para a contagem de linhas
echo "\nTempo Execucao: " . (round(microtime(true) - $script_start, 5) * 1000) . "\n";
// fim da parte descriminada
?>