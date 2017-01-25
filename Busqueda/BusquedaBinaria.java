public class BusquedaBinaria {
    public int buscar(int[] vector, int buscado) { 
    	int posicionEncontrada = -1;
        double i = Math.log(vector.length)/ Math.log(2);
        int incial = 0;
        int fin = vector.length - 1;
        int valorMedio = (incial + fin)/2;
        while(posicionEncontrada == -1 && i > 0){
            if(buscado == vector[valorMedio]){ //1, 4, 78, 123, 234, 500, 600, 700, 701, 702
                posicionEncontrada = valorMedio;
            }else if(buscado < vector[valorMedio]){
                fin = valorMedio - 1;
                valorMedio = (incial + fin)/2;
            }else{
                incial = valorMedio + 1;
                valorMedio = (incial + fin)/2;
            }  
                i--;
        }  
        return posicionEncontrada;     
    }
}