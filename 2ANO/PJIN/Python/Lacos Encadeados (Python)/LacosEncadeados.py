import sys
import time # nao considerar esta linha
tempoIni = time.time() # nao considerar esta linha
i = [0, 0, 0, 0, 0, 0]
indice = int(sys.argv[1])  # recupera o parametro de execucao
soma = 0
for i[0] in range(0, indice):
    for i[1] in range(0, indice):
        for i[2] in range(0, indice):
            for i[3] in range(0, indice):
                for i[4] in range(0, indice):
                    for i[5] in range(0, indice):
                        soma += 1                
print "Resultado: " + str(soma)
print "Tempo execucao: " + str((time.time() - tempoIni) * 1000) + " ms" # nao considerar esta linha