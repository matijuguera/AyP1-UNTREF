
class CajaDeAhorro {
	String titularDeLaCuenta;
	double saldo;
	public CajaDeAhorro(String titularDeLaCuenta){
		this.titularDeLaCuenta = titularDeLaCuenta;
		saldo = 0;
		
	}
	public String obtenerTitular(){
		return titularDeLaCuenta;
	}
	public double consultarSaldo(){
		return saldo;
	}
	public void depositar(double monto){
		if(monto<=0){
			throw new Error("Ingresar un monto mayor a 0");
		}
		saldo += monto;
	}
	public void extraer(double monto){
		if(monto<=0 && monto >= saldo){
			throw new Error("Para extraer un monto, tendremos que ingresar un monto mayor a 0 y no tiene que ser mayor o igual que el saldo que tenemos");
		}
		saldo -= monto;
		
	}
}
