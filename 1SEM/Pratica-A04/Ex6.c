#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");
    int i, n;
    float x, soma;

    soma = 0;

    printf("Insira um valor n: ");
    scanf("%i", &n);

    system("cls");

    for(i=1; i<n+1; i++){

        printf("Insira o valor #%i: ", i);
        scanf("%f", &x);

        soma+=x;

    }

    system("cls");

    printf("A soma dos %i valores inseridos equivale a %.2f\n\n", n, soma);

    system("pause");
    return 0;
}
