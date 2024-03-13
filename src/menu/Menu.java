package menu;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int escolha;
		
		do { 
			System.out.println("==== Bem vindo ao E-commerce E-tron Jogos! ====");
			System.out.println("1. Visualizar lista de jogos disponíveis");
			System.out.println("2. Adicionar jogo ao carrinho");
			System.out.println("3. Visualizar carrinho");
			System.out.println("4. Finalizar compra");
			System.out.println("Escolha uma opção: ");
			escolha = leia.nextInt();
			
			switch (escolha) {
			case 1: 
				System.out.println("Jogos diponiveis");
				break;
				
			case 2: 
				System.out.println("Adicionando jogo ao carrinho");
				break;
				
			case 3: 
				System.out.println("Visualizando o carrinho");
				break;
				
			case 4: 
				System.out.println("Finalizando a compra");
				break;
				
			case 0: 
				System.out.println("Saindo do sistema");
				break;
				default: 
					
					System.out.println("Opção inválida. Por favor escolha uma opção válida.");
			}

	}while (escolha != 0);

		leia.close();
	}
}
