#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

float Fibonacci(float x) {
    if (x == 0.0) {
        return 0.0;
    }
    if (x == 1.0) {
        return 1.0;
    }
    return (Fibonacci((x - 1.0)) + Fibonacci((x - 2.0)));
}

int main() {
    float n;
    float i;
    n = 10.0;
    i = 0.0;
    while(i < n) {
		printf("%f\n", Fibonacci(i));
		i = (i + 1.0);
    }
    return 0;
}
