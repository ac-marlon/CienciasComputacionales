#include <iostream>
#include <cstdlib>
#include <time.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

using namespace std;

void vectorAleatorio(int *array, int &dim) {
	int i;
	srand(time(0));
	for(i = 0; i < dim; i++) {
		array[i] = rand() % 999;
	}
}

void ordenarSeleccion(int *array, int &dim){
	int i, j, menor, aux;
	menor = 0;
	for(i = 0; i < dim; i++){
		for(j = i; j < dim; j++){
			if(array[j] < array[menor]){
				menor = j;
			}
		}
		aux = array[i];
		array[i] = array[menor];
		array[menor] = aux;
		menor = i + 1;
	}
}

int main(int argc, char** argv) {
	int dimension;
	cout << "Dimension del array: " << endl;
	cin >> dimension;
	int vector[dimension];
	vectorAleatorio(vector, dimension);
	cout << "Vector original: " << endl;
	for(int i = 0; i < dimension; i++) {
		cout << vector[i] <<" ";
	}
	cout << "" << endl;
	cout << "Vector ordenado: " << endl;
	ordenarSeleccion(vector, dimension);
	for(int i = 0; i < dimension; i++) {
		cout << vector[i] <<" ";
	}	
	return 0;
}
