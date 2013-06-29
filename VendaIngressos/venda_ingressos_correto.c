/* 
 * File:   main.c
 * Author: Lucas dos Santos Abreu <lucas.s.abreu@gmail.com>
 * Author: Fabricio Felisbino <fabricio.felisbino@outlook.com>
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
#include <semaphore.h>
#include <time.h>

const int N_PESSOA = 5;
const int N_LUGARES = 100;

int lugares[100];
int lug_comp[5][100];

// controla quantos vezes poderam ser comprados
int limite_compras = 0;

sem_t mutex;
sem_t s_compra;

void *pessoa(void *arg);

int main(int argc, char** argv) {
    pthread_t pessoas[N_PESSOA];

    int i = 0;
    int j = 0;

    // prepara as variaveis

    srand(time(NULL));

    for (i = 0; i < N_LUGARES; i++)
        lugares[i] = 0;

    // inicia a parte de threads
    sem_init(&mutex, 0, 1); //inicialização do semáforo
    sem_init(&s_compra, 0, 1); //inicialização do semáforo

    for (i = 0; i < N_PESSOA; i++)
        pthread_create(&pessoas[i], NULL, pessoa, (void *) (long) i); // criar uma thread

    for (i = 0; i < N_PESSOA; i++)
        pthread_join(pessoas[i], NULL);


    printf("                   +-------------------+\n");
    printf("                   |      Pessoas      |\n");
    printf("+-------+----------+---+---+---+---+---+\n");
    printf("| Lugar | Qt Compr | 1 | 2 | 3 | 4 | 5 |\n");
    printf("+-------+----------+---+---+---+---+---+\n");

    for (i = 0; i < N_LUGARES; i++) {
        printf("| %5d | %8d |", i, lugares[i]);

        for (j = 0; j < N_PESSOA; j++) {
            if (lug_comp[j][i] == 1)
                printf(" x |", lug_comp[j][i]);
            else
                printf("   |", lug_comp[j][i]);
        }

        printf("\n");
    }

    printf("+-------+----------+---+---+---+---+---+\n");

    printf("Fim da Execucao\n");

    return EXIT_SUCCESS;
}

/**
 * Thread para representar um pessoa
 * @param arg Indice unico da pessoa
 * @return void
 */
void *pessoa(void *arg) {
    int i_pessoa = (long) arg;

    int lugar = -1;

    sem_wait(&mutex);
    printf("Pessoa %d entrou no sistema.\n", i_pessoa);
    sem_post(&mutex);

    // controle do limite de compras, para que o sistema não rode para sempre (&& limite_compras < 10000)
    while (todos_vendidos() == 0) { // enquanto há lugares
        sem_wait(&s_compra); // inicia a zona crítica

        lugar = escolhe_lugar();

        if (lugares[lugar] == 0) {

            sleep(rand() % 3);
            lugares[lugar] = lugares[lugar] + 1;

            lug_comp[i_pessoa][lugar] = 1; // pessoa [i_pessoa] comprou lugar [lugar]

            limite_compras++;

            printf("Pessoa %d, comprou lugar %d\n", i_pessoa, lugar);
        }

        sem_post(&s_compra); // libera zona crítica
    }

    sem_wait(&mutex);
    printf("Pessoa %d saiu do sistema.\n", i_pessoa);
    sem_post(&mutex);

    pthread_exit(NULL);
}

/**
 * Retorna uma posicao aleatoria no vetor.
 * @return Indice de um lugar
 */
int escolhe_lugar() {
    int lugar = -1;

    lugar = rand() % N_LUGARES;

    return lugar;
}

/**
 * Verifica se todos os 
 * @return Retorna 0 se algum lugar estiver disponivel, ou 1 se todos ocupados
 */
int todos_vendidos() {

    int i = 0;
    for (i = 0; i < N_LUGARES; i++) {
        if (lugares[i] == 0) { // achou alguem
            return 0;
        }
    }

    return 1;
}
