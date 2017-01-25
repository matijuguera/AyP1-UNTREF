class Burbujeo {
   
    public void ordenar(int[] vector) {
        int aux;
        for(int i = 0; i < vector.length; i++) {
            for(int j = 0; j < vector.length - 1; j++) {
                if(vector[j] > vector[j+1]) {
                    aux = vector[j+1];
                    vector[j+1] = vector[j];
                    vector[j] = aux;
                }
            }
        }
    }
}
 