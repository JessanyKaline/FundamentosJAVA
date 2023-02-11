
public class FluxoDeCaixa {
	
	public static void main(String[] args) {
		Caixa caixa = new Caixa();
		
		caixa.saldo = 50.65;
		
		System.out.println("O saldo inicial é de: R$ " + caixa.saldo);
		
		caixa.adicionar(500);
		
		System.out.println("Houve uma entrada de valor no caixa, o saldo atual é: R$ " + caixa.saldo );
		
		caixa.retirar(100);
		
		System.out.println("Houve uma emergência, agora o saldo atual é: R$ " + caixa.saldo );
		
		
	}
}
