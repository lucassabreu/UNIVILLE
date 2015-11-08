<?php
// não consederar esta parte para a contagem de linhas
$script_start = microtime(true);
// fim da parte descriminada
echo "Hello World";
// não consederar esta parte para a contagem de linhas
echo "\nTempo Execucao: " . (round(microtime(true) - $script_start, 5) * 1000) . "\n";
// fim da parte descriminada
?>