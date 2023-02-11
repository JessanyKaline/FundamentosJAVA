
public class FluxoDeCaixaPrivate {
	
	public static void main(String[] args) {
		CaixaPrivate caixa = new CaixaPrivate();
		
	
		
		System.out.println("O saldo inicial é de: R$ " + caixa.getSaldo());
		
		caixa.adicionar(1000);
		
		System.out.println("Houve uma entrada no caixa, o saldo atual é: R$ " + caixa.getSaldo() );
		
		caixa.retirar(200);
		
		System.out.println("Houve uma emergência, agora o saldo atual é: R$ " + caixa.getSaldo() );
		
		
	}
}
