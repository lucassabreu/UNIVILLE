<?php

echo firstname("Barack Obama") . "\n";

function firstname($name){
    return substr($name, 0, strpos($name, " "));
}

?>