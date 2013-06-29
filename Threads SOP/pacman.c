/* 
 * File:   pacman.c
 * Author: lucas
 *
 * Created on 23 de Junho de 2013, 16:37
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*
 * 
 */
int main(int argc, char** argv) {
    char *nome;
    printf("\n\n\t\tINFORME O SEU NOME: \n\n\t\t\t\t");
    scanf("%*c", &nome);
    printf("teste");
    nome = realloc((char*) nome, strlen(nome) * sizeof (char));

    return (EXIT_SUCCESS);
}

