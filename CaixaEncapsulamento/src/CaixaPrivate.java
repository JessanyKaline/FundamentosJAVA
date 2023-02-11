
public class CaixaPrivate {
	
	
	private double saldo = 100;
	
	void adicionar (double valor) {
		this.saldo = this.saldo + valor;
	}
	
	void retirar (double valor) {
		this.saldo = this.saldo - valor; 
	}
	
	public double getSaldo() {
		return saldo;
	}

}
