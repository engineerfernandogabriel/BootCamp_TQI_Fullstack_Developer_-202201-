package DesafiosTqiJava;

import java.io.IOException;
import java.util.Scanner;

/*
 O jogo PAR ou ÍMPAR vem decidindo o destino de pessoas ao longo de décadas. 
 As regras são simples: dois jogadores informam um número e se a soma desses números for par o jogador que escolheu PAR ganha e vice-versa. 
 Em um jogo que as crianças do bairro estão jogando, eles não conseguem decidir quem será o próximo a escolher as regras da brincadeira. 
 Para solucionar esse problema, você foi chamado.

 Basicamente a brincadeira só poderá ser jogada de dois em dois jogadores e para escolher o próximo jogador uma das  crianças pediu sua ajuda para desenvolver 
um programa que, dado o nome dos jogadores, suas respectivas escolhas PAR ou IMPAR e os números, informe quem foi o vencedor.

ENTRADA
 A primeira linha de entrada contém um número inteiro QT (1 ≤ QT ≤ 100), indicando a quantidade de casos de teste que vem a seguir. 
 Cada caso de teste contém duas linhas. 
 Na primeira linha será informado o nome do jogador 1 seguido de sua escolha, “PAR” ou “IMPAR” e logo após, o nome do jogador 2 seguido de sua escolha, “PAR” ou “IMPAR”. 
 Na segunda linha de entrada, contém 2 números inteiros N (1 ≤ N ≤ 10⁹) e M (1 ≤ M ≤ 10⁹), representando respectivamente os números escolhidos pelo jogador 1 e pelo jogador 2. 
 É garantido que a escolha (PAR ou IMPAR) do jogador 1 será diferente da escolha (PAR ou IMPAR) do jogador 2 e que o nome dos jogares são formados somente por letras e não ultrapassarão 100 caracteres.

SAÍDA
 Para cada caso de teste, imprima uma única linha contendo o nome do jogador vencedor.
 */

public class DeQuemEaVez {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);

		int qt = input.nextInt();

		for (int i = 0; i < qt; i++) {
			String nome1 = input.next();
			String escolha1 = input.next();
			String nome2 = input.next();
			String escolha2 = input.next();
			
			int m = input.nextInt();
			int n = input.nextInt();
			
			if((n + m) % 2 == 0 && escolha1.equalsIgnoreCase("PAR")) {
				System.out.println(nome1);
			} else if (((n + m) % 2 != 0 && escolha1.equalsIgnoreCase("IMPAR"))){
				System.out.println(nome1);
			} else {
				System.out.println(nome2);
			}
		}
	}
}