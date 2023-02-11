
public class TesteBollean {
	
	public static void main(String[] args) {
		System.out.println("Teste de condicionais");
		
		int idade = 30;
		boolean adolescente  = idade <= 16;
		boolean crianca = idade <= 10;
		
		if (adolescente) {
		System.out.println("voce é adolescente e sua idade é " + idade);
		
		}else if (crianca){
			
			System.out.println("você é criança e sua idade é " + idade);
			
		}else if (adolescente == false && crianca == false){
			
			System.out.println("você já é adulto e sua idade é " + idade);
			
		}
	
		
	}

}
