#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

float Max(float x, float y) {
    if (x > y) {
        return x;
    }
    return y;
}

int main() {
    float a;
    float b;
    float maior;
    float contador;
    a = 15.0;
    b = 20.0;
    contador = 0.0;
    maior = Max(a, b);
    while(contador < maior) {
		printf("%f\n", contador);
		contador = (contador + 1.0);
    }
    printf("%f\n", contador);
    return 0;
}
