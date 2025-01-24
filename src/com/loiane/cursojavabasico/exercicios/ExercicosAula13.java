package com.loiane.cursojavabasico.exercicios;

import java.util.Scanner;

public class ExercicosAula13 {

	public static void main(String[] args) {
		
		// quest�o 1:
		
		System.out.println("Al�, mundo!\n");
		
		
		// quest�o 2:
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero: ");		
		double numeroInformado = scan.nextDouble();
		System.out.println();
		
		System.out.println("O n�mero informado foi " + numeroInformado);
		System.out.println();
		
		
		// quest�o 3:
		
		System.out.println("Informe o primeiro n�mero: ");
		double primeiroNumero = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe o segundo n�mero: ");
		double segundoNumero = scan.nextDouble();
		System.out.println();
		
		double soma = primeiroNumero + segundoNumero;
		
		System.out.println("A soma dos n�meros � igual a " + soma);
		System.out.println();
		
		
		// quest�o 4:
		
		System.out.println("Informe a primeira nota: ");
		double primeiraNota = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe a segunda nota: ");
		double segundaNota = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe a terceira nota: ");
		double terceiraNota = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe a quarta nota: ");
		double quartaNota = scan.nextDouble();
		System.out.println();
		
		double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

		System.out.println("A m�dia das notas � igual a " + media);
		System.out.println();
		
		
		// quest�o 5:
		
		System.out.println("Informe a medi��o em metros: ");
		double medicaoMetro = scan.nextDouble();
		System.out.println();
		
		double medicaoCentimetro = medicaoMetro * 100;
		
		System.out.println("A medi��o em cent�metros � igual a " + medicaoCentimetro);
		System.out.println();
		
		
		// quest�o 6:
		
		System.out.println("Informe o raio de um c�rculo em cent�metros: ");
		double raioCirculo = scan.nextDouble();
		System.out.println();
		
		double areaCirculo = 2 * 3.14 * Math.pow(raioCirculo, 2);
		
		System.out.println("A �rea do c�rculo � igual a " + areaCirculo +" cm�");
		System.out.println();
		
		
		// quest�o 7:
		
		System.out.println("Informe o lado de um quadrado em cent�metros: ");
		double ladoQuadrado = scan.nextDouble();
		System.out.println();
		
		double areaQuadrado = ladoQuadrado * ladoQuadrado;
		
		System.out.println("A �rea do quadrado � igual a " + areaQuadrado +" cm�");
		System.out.println();
		
		double areaQuadradoDobrada = 2 * areaQuadrado;
		
		System.out.println("O dobro da �rea do quadrado � igual a " + areaQuadradoDobrada +" cm�");
		System.out.println();
		
		
		// quest�o 8:
		
		System.out.println("Informe o quanto voc� ganha por hora em reais: ");
		double ganhoPorHora = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe o n�mero de horas trabalhados no m�s: ");
		double horaMensal = scan.nextDouble();
		System.out.println();
		
		double salario = ganhoPorHora * horaMensal;
		
		System.out.println("O sal�rio � igual a " + salario + " R$");
		System.out.println();
		
		
		// quest�o 9: 
		
		System.out.println("Informe a temperatura em graus Farenheit: ");
		double temperaturaFarenheit = scan.nextDouble();
		System.out.println();
		
		double temperaturaCelsius = 5 * ((temperaturaFarenheit - 32) / 9);
		
		System.out.println("A temperatura em graus Celsius �: " + temperaturaCelsius + "�");
		System.out.println();
		
		
		// quest�o 10:
		
		System.out.println("Informe a temperatura em graus Celsius: ");
		double temperaturaCelsius2 = scan.nextDouble();
		System.out.println();
		
		double temperaturaFarenheit2 = ((temperaturaCelsius2 / 5) * 9) + 32;
		
		System.out.println("A temperatura em graus Farenheit �: " + temperaturaFarenheit2 + "�");
		System.out.println();
		
		
		// quest�o 11:
		
		
		
	}

}
