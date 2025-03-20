#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

float Factorial(float x) {
    float resultado;
    resultado = 1.0;
    while(x > 1.0) {
		resultado = (resultado * x);
		x = (x - 1.0);
}
    return resultado;
}

int main() {
    float n;
    float fatorial;
    float i;
    n = 5.0;
    fatorial = Factorial(n);
    i = 1.0;
    while(i < (fatorial + 1.0)) {
		i = (i + 1.0);
    }
    printf("%f\n", fatorial);
    return 0;
}
