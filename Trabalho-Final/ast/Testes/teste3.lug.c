#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

float SomaPares(float x) {
    float resultado;
    float i;
    resultado = 0.0;
    i = 2.0;
    while(i < (x + 1.0)) {
		resultado = (resultado + i);
		i = (i + 2.0);
}
    return resultado;
}

int main() {
    float n;
    float soma;
    float i;
    n = 10.0;
    soma = SomaPares(n);
    i = 2.0;
    while(i < (soma + 1.0)) {
		i = (i + 2.0);
    }
    printf("%f\n", soma);
    return 0;
}
