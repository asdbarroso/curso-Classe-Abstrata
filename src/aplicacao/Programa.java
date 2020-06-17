package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoa;
import entidades.PessoaFisica;
import entidades.pessoaJuridica;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> listPessoas = new ArrayList<>();

		System.out.print("Iforme a quantidade de contribuintes: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados contribuinte #" + i);
			System.out.print("Fisica ou Juridica (f/j): ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Renda Anual: ");
			double rendaAnual = sc.nextDouble();

			if (ch == 'f') {
				System.out.print("Gasto com Saúde: ");
				double gastoSaude = sc.nextDouble();
				listPessoas.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			} else if (ch == 'j') {
				System.out.print("Quantidade de funcionários: ");
				int funcionarios = sc.nextInt();
				listPessoas.add(new pessoaJuridica(nome, rendaAnual, funcionarios));
			} else {
				System.out.println("Tipo de Pessoa Inextistente!!!");
			}

		}
System.out.println();
		System.out.println("IMPOSTOS PAGOS: ");
		double sum = 0.0;

		for (Pessoa p : listPessoas) {
			System.out.print(p);
			sum += p.calculaImposto();
		}
		System.out.println();
		System.out.printf("TOTAL IMPOSTO: R$ %.2f", sum);

	}

}
