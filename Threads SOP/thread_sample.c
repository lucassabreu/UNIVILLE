/* 
 * File:   main.c
 * Author: Lucas dos Santos Abreu <lucas.s.abreu@gmail.com>
 *
 * Programa básico em C para uso de Threads
 */

#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <string.h>

const int THREADS_N = 10;

void *thread(void *arg);

int t_main(int argc, char** argv) {
    // corte

    pthread_t threads[THREADS_N];
    int i = 0;

    for (i = 0; i < THREADS_N; i++)
        pthread_create(&threads[i], NULL, thread, (void *) (long) i); // criar uma thread

    for (i = 0; i < THREADS_N; i++)
        pthread_join(threads[i], NULL);

    return EXIT_SUCCESS;
}

void *thread(void *arg) {
    int i = (long) arg;

    printf("Oi eu sou a Thread: %d\n", i);

    pthread_exit(NULL);
}
