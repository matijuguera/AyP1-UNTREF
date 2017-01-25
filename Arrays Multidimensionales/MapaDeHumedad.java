class MapaDeHumedad {
	
	private double[][] terreno;
	private double humedadTotal;
	private double maximo;
	private double minimo;
	private int cantidad;
	private int contador;
	
	
	public MapaDeHumedad(int x,int y){
		if(x == 1 && y == 1){
			throw new Error("rango no permitido, minimo 2 dimensiones.");
		}
		this.terreno = new double[x][y];
		

		
	}
	public void IngresarHumedad(double humedad,int x,int y){
		this.terreno[x][y]= humedad;
	}
	
	public double humedadPromedioDelTerreno(){
		this.cantidad = 0;
		this.humedadTotal = 0;
		for(int i=0;i<this.terreno.length;i++){
			for(int j=0;j<this.terreno[i].length;j++){
				this.cantidad++;
				this.humedadTotal += terreno[i][j];
			}
		}	
		return humedadTotal/cantidad;
	}
	
	public double calcularMaximo(){
		this.maximo = 0;
		for(int i=0;i<this.terreno.length;i++){
			for(int j=0;j<this.terreno[i].length;j++){
				if(this.terreno[i][j] > this.maximo){
					this.maximo = this.terreno[i][j];
				}
			}
		}
		return maximo;
	}
	
	public double calcularMinimo(){
		this.minimo = 100;
		for(int i=0;i<this.terreno.length;i++){
			for(int j=0;j<this.terreno[i].length;j++){
				if(terreno[i][j] < this.minimo){
					this.minimo = this.terreno[i][j];
				}
			}
		}	
		return minimo;
	}
	
	public double humedadPromedioDelContorno(){
		this.humedadTotal = 0;
		this.contador = 0;
		for(int j=0;j<this.terreno[0].length;j++){ // techo
			this.humedadTotal += this.terreno[0][j];
			this.contador++;
		}
		for(int i=1;i<this.terreno.length;i++){ // derecho
			this.humedadTotal += this.terreno[i][this.terreno.length-1];
			this.contador++;
		}
		for(int j=0;j<this.terreno[this.terreno.length-1].length-2;j++){
			this.humedadTotal += this.terreno[this.terreno.length-1][j];
			this.contador++;
		}
		for(int i=1;i<this.terreno.length-2;i++){
			this.humedadTotal += this.terreno[i][0];
			this.contador++;
		}
		return this.humedadTotal/contador;
		
	}

	public double cuantasMuestrasHay(int x,int xHasta,int y,int yHasta){
		this.contador = 0;
		for(int i=x;i<=xHasta;i++){
			for(int j=y;j<=yHasta;j++){
				if(terreno[i][j] > 0){
					contador++;
				}
			}
		}
		return contador;
	}
	public void remplazarMuestraPorValoresContiguos(int x,int y){

		if(x == 0 && y != 0 && y != (terreno[x].length-1)){
			this.terreno[x][y] = (this.terreno[x+1][y] + this.terreno[x][y+1] + this.terreno[x][y-1])/3;
		}
		if(x == (terreno.length-1) && y != 0 && y != (terreno[x].length-1) ){
			this.terreno[x][y] = (this.terreno[x-1][y] + this.terreno[x][y+1] + this.terreno[x][y-1])/3;
		}
		if(y == 0 && x != 0 && x != (terreno[x].length-1)){
			this.terreno[x][y] = (this.terreno[x-1][y] + this.terreno[x+1][y] + this.terreno[x][y+1])/3;
		}
		if(y == (terreno.length-1) && x != 0 && x != (terreno[x].length-1)){
			this.terreno[x][y] = (this.terreno[x-1][y] + this.terreno[x+1][y] + this.terreno[x][y-1])/3;
		}
		if(y == 0 && x== 0){
			this.terreno[x][y] = (this.terreno[x+1][y] + this.terreno[x][y+1])/2;
		}
		if(y == 0 && x == (terreno.length-1)){
			this.terreno[x][y] = (this.terreno[x-1][y] + this.terreno[x][y+1])/2;
		}
		if(y == (terreno[x].length-1) && x == 0 ){
			this.terreno[x][y] = (this.terreno[x+1][y] + this.terreno[x][y-1])/2;
		}
		if(y == (terreno[x].length-1) && x == (terreno.length-1)){
			this.terreno[x][y] = (this.terreno[x-1][y] + this.terreno[x][y-1])/2;
		}else{
			this.terreno[x][y] = (terreno[x-1][y] + terreno[x+1][y] + terreno[x][y-1] + terreno[x][y+1])/4; 
			}
	}
	
	public void remplazarValoresMenoresACeroYMayoresACien(){
		for(int i=0; i < terreno.length;i++){
			for(int j=0; j < terreno[i].length;j++){
				if(terreno[i][j] < 0 && terreno[i][j] > 100){
					remplazarMuestraPorValoresContiguos(i,j);	
				}
			}
		}
	}
}
