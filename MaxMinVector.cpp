#include <iostream>
#include <cstdlib>
#include <time.h>
#include <random>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

using namespace std;

void vectorAleatorio(int *array, int &dim) {
	random_device rd;
	srand(time(0));
	mt19937 gen(rd() * rand());
	uniform_int_distribution<> dis(rand(), (9999999 % rand()) * rand());
	int i;
	for(i = 0; i < dim; i++) {
		array[i] = dis(gen); 
	}
}

int maxElementoVector(int *array, int &dim, int &posMaxElem) {
	int i;
	int mayorElem = array[0];
	posMaxElem = 0;
	for(i = 0; i < dim; i++) {
		if(array[i] > mayorElem) {
			mayorElem = array[i];
			posMaxElem = i;
		}
	}
	return mayorElem;
}

int minElementoVector(int *array, int &dim, int &posMinElem) {
	int i;
	int menorElem = array[0];
	posMinElem = 0;
	for(i = 0; i < dim; i++) {
		if(array[i] < menorElem) {
			menorElem = array[i];
			posMinElem = i;
		}
	}
	return menorElem;
}

void intercambiarElementoVector(int *array, int &posUno, int &posDos){
	int aux = array[posUno];
	array[posUno] = array[posDos];
	array[posDos] = aux;	
}

int main(int argc, char** argv) {
	int dimension, posElementoMayor, posElementoMenor, posIntercambioElemUno, posIntercambioElemDos;
	cout << "Dimension del array: " << endl;
	cin >> dimension;
	cout << "Posiciones de elementos para intercambio: " << endl;
	cin >> posIntercambioElemUno;
	cin >> posIntercambioElemDos;
	int vector[dimension];
	vectorAleatorio(vector, dimension);
	cout << "Mayor Elemento: " << maxElementoVector(vector, dimension, posElementoMayor) << endl;
	cout << "En la posicion: " << posElementoMayor << endl;
	cout << "Menor Elemento: " << minElementoVector(vector, dimension, posElementoMenor) << endl;
	cout << "En la posicion: " << posElementoMenor << endl;
	intercambiarElementoVector(vector, posIntercambioElemUno, posIntercambioElemDos);
	return 0;
}
