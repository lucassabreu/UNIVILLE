<?php
// não consederar esta parte para a contagem de linhas
$script_start = microtime(true);
// fim da parte descriminada
function ackermann($m, $n) {
    if ($m == 0)
        return $n + 1;
    else 
        if ($m > 0 && $n == 0)
            return ackermann($m - 1, 1);
        else
            if ($m > 0 && $n > 0)
                return ackermann($m - 1, ackermann($m, $n - 1));
    return 0;
}
$ack = ackermann(intval($argv[1]), intval($argv[2]));
print "Resultado: $ack\n";
// não consederar esta parte para a contagem de linhas
echo "\nTempo Execucao: " . (round(microtime(true) - $script_start, 5) * 1000) . "\n";
// fim da parte descriminada
?>