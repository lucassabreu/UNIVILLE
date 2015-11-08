import sys
import re
import time # nao considerar esta linha
tempoIni = time.time() # nao considerar esta linha
texto = "".join(open(sys.argv[1]).readlines())
texto = " " + re.sub("\W+", " ", texto, flags=re.IGNORECASE) + " "
m = re.search("\w+", texto)
while m is not None:
    p = m.group()
    rexp = re.compile("\W+" + p + "\W+", flags=re.IGNORECASE)
    contador = 0
    while rexp.search(texto):
        contador += len(rexp.findall(texto))
        texto = rexp.sub(" ", texto)
    print p + " - " + str(contador)
    m = re.search("\w+", texto, flags=re.IGNORECASE)
print "Tempo execucao: " + str((time.time() - tempoIni) * 1000) + " ms" # nao considerar esta linha