package com.loiane.cursojavabasico.exercicios;

import java.util.Scanner;

public class ExercicosAula13 {

	public static void main(String[] args) {
		
		// questão 1:
		
		System.out.println("Alô, mundo!\n");
		
		
		// questão 2:
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número: ");		
		double numeroInformado = scan.nextDouble();
		System.out.println();
		
		System.out.println("O número informado foi " + numeroInformado);
		System.out.println();
		
		
		// questão 3:
		
		System.out.println("Informe o primeiro número: ");
		double primeiroNumero = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe o segundo número: ");
		double segundoNumero = scan.nextDouble();
		System.out.println();
		
		double soma = primeiroNumero + segundoNumero;
		
		System.out.println("A soma dos números é igual a " + soma);
		System.out.println();
		
		
		// questão 4:
		
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

		System.out.println("A média das notas é igual a " + media);
		System.out.println();
		
		
		// questão 5:
		
		System.out.println("Informe a medição em metros: ");
		double medicaoMetro = scan.nextDouble();
		System.out.println();
		
		double medicaoCentimetro = medicaoMetro * 100;
		
		System.out.println("A medição em centímetros é igual a " + medicaoCentimetro);
		System.out.println();
		
		
		// questão 6:
		
		System.out.println("Informe o raio de um círculo em centímetros: ");
		double raioCirculo = scan.nextDouble();
		System.out.println();
		
		double areaCirculo = 2 * 3.14 * Math.pow(raioCirculo, 2);
		
		System.out.println("A área do círculo é igual a " + areaCirculo +" cm²");
		System.out.println();
		
		
		// questão 7:
		
		System.out.println("Informe o lado de um quadrado em centímetros: ");
		double ladoQuadrado = scan.nextDouble();
		System.out.println();
		
		double areaQuadrado = ladoQuadrado * ladoQuadrado;
		
		System.out.println("A área do quadrado é igual a " + areaQuadrado +" cm²");
		System.out.println();
		
		double areaQuadradoDobrada = 2 * areaQuadrado;
		
		System.out.println("O dobro da área do quadrado é igual a " + areaQuadradoDobrada +" cm²");
		System.out.println();
		
		
		// questão 8:
		
		System.out.println("Informe o quanto você ganha por hora em reais: ");
		double ganhoPorHora = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe o número de horas trabalhados no mês: ");
		double horaMensal = scan.nextDouble();
		System.out.println();
		
		double salario = ganhoPorHora * horaMensal;
		
		System.out.println("O salário é igual a " + salario + " R$");
		System.out.println();
		
		
		// questão 9: 
		
		System.out.println("Informe a temperatura em graus Farenheit: ");
		double temperaturaFarenheit = scan.nextDouble();
		System.out.println();
		
		double temperaturaCelsius = 5 * ((temperaturaFarenheit - 32) / 9);
		
		System.out.println("A temperatura em graus Celsius é: " + temperaturaCelsius + "°");
		System.out.println();
		
		
		// questão 10:
		
		System.out.println("Informe a temperatura em graus Celsius: ");
		double temperaturaCelsius2 = scan.nextDouble();
		System.out.println();
		
		double temperaturaFarenheit2 = ((temperaturaCelsius2 / 5) * 9) + 32;
		
		System.out.println("A temperatura em graus Farenheit é: " + temperaturaFarenheit2 + "°");
		System.out.println();
		
		
		// questão 11:
		
		
		
	}

}
