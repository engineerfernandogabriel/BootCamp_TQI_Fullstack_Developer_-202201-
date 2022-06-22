package DesafiosTqiJava;

import java.io.IOException;
import java.util.Scanner;

/*
 O objetivo deste desafio � resolv�-lo utilizando o seu conhecimento sobre Arrays, uma estrutura de dados que armazena uma cole��o de dados em um bloco de mem�ria.

 Voc� est� desenvolvendo um sistema para um local de eventos, neste local, � necess�rio que a entrada seja permitida apenas para pessoas acima de 18 anos. 
 
 Fa�a um programa para ler um n�mero N, a idade de N pessoas. Depois disso, coloque a idade m�nima permitida  para se entrar no local, conforme exemplo.

 Retorne �s idades de quem n�o puder entrar.
 */

public class ProibidoEntradaDeMenores {

	public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        
        int N= scan.nextInt();
        String string = scan.nextLine();
        
        String[] s = string.split(" ");

        int[] idade = new int[N];

        for (int i = 0; i < N; i++){
            idade[i] = scan.nextInt();
        }

        System.out.println("Nao poderao entrar as idades: ");
        for (int i = 0; i < N; i++){
            if ( idade[i]<18 ){
                System.out.println( idade[i]  );
            }
        }
    }

}