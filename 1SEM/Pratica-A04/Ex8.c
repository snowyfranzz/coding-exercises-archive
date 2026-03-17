#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");
    int i, n, x, y, z, zStore;

    x = 0;
    y = 1;
    z = 1;

    printf("Insira um número n: ");
    scanf("%i", &n);

    for(i=0; i<n; i++){

        zStore = z;

        z = x + y;

        x = y;

        y = zStore;

        printf("%i ", x);

    }

    printf("\n\n");


    system("pause");
    return 0;
}
