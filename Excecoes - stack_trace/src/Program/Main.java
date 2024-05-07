package Program;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Configura o idioma padrão para entrada de dados como US para suporte ao
		// formato de números com ponto decimal
		Locale.setDefault(Locale.US);

		// Cria um objeto Scanner para capturar entrada do teclado
		Scanner scanner = new Scanner(System.in);

		// Chamando o método method2() e passando o scanner como parâmetro
		method1(scanner);

		// Mensagem de fim de programa
		System.out.println(" End of program ");

		// Fecha o scanner
		scanner.close();
	}

	
	
	public static void method1(Scanner scanner) {
		System.out.println("****** METHOD1 START *****");

		method2(scanner);

		System.out.println("****** METHOD1 END *****");

	}
	
	

	public static void method2(Scanner scanner) {
		System.out.println("****** METHOD2 START *****");

		// Tenta ler a entrada do usuário e manipular exceções, se ocorrerem
		try {
			// Lê a entrada do usuário e divide em uma matriz de strings
			String[] vect = scanner.nextLine().split(" ");

			// Lê a posição desejada
			int position = scanner.nextInt();
			scanner.nextLine(); // Consumir o restante da linha

			// Imprime o elemento na posição especificada
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			// Captura uma exceção se a posição fornecida estiver fora dos limites
			System.out.println(" Invalid position ");
			e.printStackTrace();
			scanner.next();
			
			
			
		} catch (InputMismatchException e) {
			// Captura uma exceção se a entrada não for do tipo esperado
			System.out.println(" Input error ");
		}

		System.out.println("****** METHOD2 END *****");
	}
}
