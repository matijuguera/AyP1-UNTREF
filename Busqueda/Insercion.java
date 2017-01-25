class Insercion {
 
    public void ordenar(int[] vector) {
        int aux;
        int j;
        for (int p = 1; p < vector.length; p++) {
            aux = vector[p];
            j = p - 1;
            while ((j >= 0) && (aux < vector[j])) {
                vector[j + 1] = vector[j];
                j--;
            }
            vector[j + 1] = aux;
        }
    }
}