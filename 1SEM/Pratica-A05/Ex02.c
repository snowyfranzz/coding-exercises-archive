#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "portuguese");
    int num, i;

    printf("Insira um número inteiro: ");
    scanf("%i", &num);

    system("cls");

    printf("Os números menores que %i divisíveis por 4 são: ", num);

    for(i=1; i<num; i++){
        if((i%4)==0){
            printf("%i ", i);
        }
    }

    printf("\n\n");


    system("pause");
    return 0;
}
