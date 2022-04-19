package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Projeto {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Produto> list = new ArrayList<>();

		System.out.print("Entre com o número de produtos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Produto #" + i);
			System.out.print("Classificação N(novo) U(usado) I(importado): ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Valor do produto: ");
			double preco = sc.nextDouble();
			
			if (ch == 'N') {
				list.add(new Produto(nome, preco));
			} 
			else if (ch == 'U') {
				System.out.print("Data do produto: ");
				Date data = sdf.parse(sc.next());
				list.add(new ProdutoUsado(nome, preco, data));
			} 
			else {
				System.out.print("Alfandega: ");
				double valorAlfandega = sc.nextDouble();
				list.add(new ProdutoImportado(nome, preco, valorAlfandega));
			}
		}

		System.out.println();
		System.out.println("Valores: ");
		for (Produto pro : list) {
			System.out.println(pro.precoTag());
		}

		sc.close();
	}

}
