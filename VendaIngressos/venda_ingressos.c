/* 
 * File:   venda_ingressos.c
 * 
 * Author: lucas.abreu
 * Author: fabricio.felisbino
 * 
 * Portanto, utilizando os conceitos de sincronismo processos, explique qual foi 
 * o problema que aconteceu com o sistema de ingressos da FIFA. Implemente uma 
 * simulação do sistema atual que está com problemas utilizando o ambiente UNIX 
 * e threads e uma solução para o problema utilizando semáforos.
 * 
 * Para a simulação utilize como exemplo a venda de 100 lugares com 05 acessos 
 * simultâneos ao sistema. Randomicamente os lugares devem ser solicitados pelos 
 * torcedores e sendo bloqueados até que todos os lugares sejam vendidos.
 * 
 * Em duplas, deverá ser enviado um relatório em PDF, explicando os motivos do 
 * problema e o código comentado da solução.
 */

#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>


const int N_PESSOAS = 5;

void *pessoa(void *arg);

int main(int argc, char** argv) {
    pthread_t pessoas[N_PESSOAS];
    int i = 0;

    for (i = 0; i < N_PESSOAS; i++)
        pthread_create(&pessoas[i], NULL, pessoa, (void *) (long) i); // criar uma thread

    for (i = 0; i < N_PESSOAS; i++)
        pthread_join(pessoas[i], NULL);

    return EXIT_SUCCESS;
}

void *pessoa(void *arg) {
    int i = (long) arg;

    printf("Oi eu sou a Thread: %d\n", i);

    pthread_exit(NULL);
}

