
class Calculadora {
	private int contadorDeDivisores;
	
	public int contarDivisores(int numero){
		contadorDeDivisores = 0;
		if(numero == 0){
			throw new Error("No podes dividir un numero por 0");
		}
		if(numero>0){
			for(int i=1;i<=numero;i++){
				if(numero%i == 0){
					contadorDeDivisores++;
				}
			
			}
		}else{
			for(int i=numero;i<0;i++){
				if(numero%i == 0){
					contadorDeDivisores++;
				}
			}
		}
		
		return contadorDeDivisores*2;
		
		
	}
}
