<?php

echo firstname("Barack Obama") . "\n";

function firstname($name){
    $result = substr($name, 0, strpos($name, " "));
    return $result;
}

?>