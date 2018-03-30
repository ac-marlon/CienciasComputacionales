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

void ordenarInsercion(int *array, int &dim){
	int i, j, aux;
	for(i = 1; i < dim; i++){
		aux = array[i];
		j = i - 1;
		while((j >= 0) and (aux < array[j])){
			array[j + 1] = array[j];
			j--;
		}
		array[j + 1] = aux;
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
	ordenarInsercion(vector, dimension);
	for(int i = 0; i < dimension; i++) {
		cout << vector[i] <<" ";
	}	
	return 0;
}
