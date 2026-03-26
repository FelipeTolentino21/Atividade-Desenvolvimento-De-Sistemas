import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int OPCAO_CADASTRAR_USUARIO = 1;
		final int OPCAO_CADASTRAR_LIVRO = 2;
		final int OPCAO_EMPRESTAR = 3;
		final int OPCAO_DEVOLVER = 4;
		final int OPCAO_LISTAR_USUARIOS = 5;
		final int OPCAO_LISTAR_LIVROS = 6;
		final int OPCAO_LISTAR_EMPRESTIMOS = 7;
		final int OPCAO_SAIR = 8;

		Scanner sc = new Scanner(System.in);
		int escolhaOpcao = 0;
		while (escolhaOpcao != 8) {
			System.out.print("===== SISTEMA DE GERENCIAMENTO DE BIBLIOTECA =====\n"
					+ "Digite o número da opção que deseja selecionar.\n"
					+ "1. Cadastrar Usuário\n"
					+ "2. Cadastrar Livro\n"
					+ "3. Emprestar Livro\n"
					+ "4. Devolver Livro\n"
					+ "5. Listar Usuarios\n"
					+ "6. Listar Livros\n"
					+ "7. Listar Emprestimos\n"
					+ "8. Sair\n"
					+ "\nEscolha: ");

			escolhaOpcao = sc.nextInt();

			switch (escolhaOpcao) {
				case OPCAO_CADASTRAR_USUARIO:

					break;
				case OPCAO_CADASTRAR_LIVRO:

					break;
				case OPCAO_EMPRESTAR:

					break;
				case OPCAO_DEVOLVER:

					break;
				case OPCAO_LISTAR_USUARIOS:

					break;
				case OPCAO_LISTAR_LIVROS:

					break;
				case OPCAO_LISTAR_EMPRESTIMOS:

					break;
				case OPCAO_SAIR:
					break;
			}
		}

		sc.close();
	}
}
