#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");
    int i;

    printf("Os múltiplos de 7 entre 100 e 450 são: ");

    for(i=100; i<451; i++){
        if (i%7 == 0){
            printf("%i ", i);
        }
    }

    printf("\n\n");

    system("pause");
    return 0;
}
