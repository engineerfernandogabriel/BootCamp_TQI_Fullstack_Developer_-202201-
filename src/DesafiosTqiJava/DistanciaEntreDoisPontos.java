package DesafiosTqiJava;

import java.io.IOException;
import java.util.Scanner;

/*
 Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a dist�ncia entre eles, mostrando 4 casas decimais ap�s a v�rgula, conforme a f�rmula:

 Distancia = ((x2 - x1)^2 + (y2 - y1)^2)^1/2

ENTRADA
 O arquivo de entrada cont�m duas linhas de dados. A primeira linha cont�m dois valores de ponto flutuante: x1 y1 e a segunda linha cont�m dois valores de ponto flutuante x2 y2.

SA�DA
 Calcule e imprima o valor da dist�ncia segundo a f�rmula fornecida, com 4 casas ap�s o ponto decimal.
 */

public class DistanciaEntreDoisPontos {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double distancia =  Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
		
		System.out.println(String.format("%.4f", distancia));

	}

}
