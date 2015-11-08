import sys
import time # nao considerar esta linha
tempoIni = time.time() # nao considerar esta linha
def ack (m, n):
    if m == 0:
        return n + 1
    else:
        if m > 0 and n == 0:
            return ack(m - 1, 1)
        else:
            if m > 0 and n > 0:
                return ack(m - 1, ack(m, n - 1))
    return 0
ack_return = ack(int(sys.argv[1]), int(sys.argv[2]))
print "Resultado: " + str(ack_return)
print "Tempo execucao: " + str((time.time() - tempoIni) * 1000) + " ms" # nao considerar esta linha