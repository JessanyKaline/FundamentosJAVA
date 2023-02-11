
public class TesteWhileSomando {
	
	public static void main(String[] args) {
        int contador = 0;
        int total = 0;

        while(contador <= 10) {
            total = total + contador;
            contador++;
            System.out.println(total);
            }
            System.out.println("o valor final é " + total);
    }

}
