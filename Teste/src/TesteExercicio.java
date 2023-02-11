
public class TesteExercicio {

	public static void main(String[] args) {

		double salario = 3300.0;

		if (salario >= 1900.00 && salario <= 2800.00) {
			System.out.println("Será deduzido 7,5% do seu salário ");

		} else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("Será deduzido 15% do seu salário ");

		} else {
			System.out.println("Será deduzido 22,5% do seu salário ");
		}
	}
}
