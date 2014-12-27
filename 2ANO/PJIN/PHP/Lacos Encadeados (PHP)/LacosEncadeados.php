<?php
// não consederar esta parte para a contagem de linhas
$script_start = microtime(true);
// fim da parte descriminada
$indice = intval($argv[1]);
$i = array(0, 0, 0, 0, 0, 0);
$soma = 0;
for ($i[0] = 0; $i[0] < $indice; $i[0]++)
    for ($i[1] = 0; $i[1] < $indice; $i[1]++)
        for ($i[2] = 0; $i[2] < $indice; $i[2]++)
            for ($i[3] = 0; $i[3] < $indice; $i[3]++)
                for ($i[4] = 0; $i[4] < $indice; $i[4]++)
                    for ($i[5] = 0; $i[5] < $indice; $i[5]++)
                        $soma++;
print "Resultado ($indice): $soma\n";
// não consederar esta parte para a contagem de linhas
echo "\nTempo Execucao: " . (round(microtime(true) - $script_start, 5) * 1000) . "\n";
// fim da parte descriminada
?>