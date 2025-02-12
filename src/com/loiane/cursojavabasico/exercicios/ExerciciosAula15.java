package com.loiane.cursojavabasico.exercicios;

import java.util.Scanner;

public class ExerciciosAula15 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		// questão 1:
		
		System.out.println("Informe o primeiro número: ");
		double numero1 = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe o segundo número: ");
		double numero2 = scan.nextDouble();
		System.out.println();
		
		if(numero1 > numero2) {
			System.out.println("O valor "+ numero1 + " é maior que o valor "+ numero2);
			
		} else if (numero1 < numero2) {
			System.out.println("O valor "+ numero1 + " é menor que o valor "+ numero2);
			
		} else {
			System.out.println("O valor "+ numero1 + " é igual ao valor "+ numero2);
			
		}
		
		
		// questão 2:
		
		System.out.println("Informe um valor: ");
		double valor = scan.nextDouble();
		System.out.println();
		
		if(valor > 0) {
			System.out.println("O valor "+ valor + " é positivo");
			
		} else if (valor < 0) {
			System.out.println("O valor "+ valor + " é negativo");
			
		} else {
			System.out.println("O valor "+ valor + " é igual a 0. Portanto, é um valor neutro");
			
		}
		
		
		// questão 3:
		
		System.out.println("Informe o seu sexo(M/F): ");
		String sexo = scan.next();
		System.out.println();
		
		if(sexo.equalsIgnoreCase("F")) {
			System.out.println("F - Feminino");
			
		} else if (sexo.equalsIgnoreCase("M")){
			System.out.println("M - Masculino");
			
		} else {			
			System.out.println("Sexo inválido");
			
		}
		
		// questão 4:
		
		System.out.println("Informe uma letra: ");
		String letra = scan.next();
		System.out.println();
		
		switch(letra){
			case "a":
			case "e":
			case "i":
			case "o":
			case "u": System.out.println("A letra informada é uma vogal!"); break;
			default: System.out.println("A lettra informada é uma consoante!");			
		}
		
		// questão 5:
		
		System.out.println("Informe a primeira nota parcial: ");
		double primeiraNota = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe a segunda nota parcial: ");
		double segundaNota = scan.nextDouble();
		System.out.println();
		
		double media = (primeiraNota + segundaNota) / 2;
		
		if(media == 10) {
			System.out.println("Aprovado com Distinção!");
			
		} else if (media >= 7) {
			System.out.println("Aprovado!");
			
		} else {
			System.out.println("Reprovado!");
			
		}
		
		// questão 6:
		
		System.out.println("Informe o primeiro número: ");
		double primeiroNumero = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe o segundo número: ");
		double segundoNumero = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe o terceiro número: ");
		double terceiroNumero = scan.nextDouble();
		System.out.println();
		
		if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O número " + primeiroNumero + " é maior que os números " + segundoNumero + " e " + terceiroNumero);
			
		} else if(segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
			System.out.println("O número " + segundoNumero + " é maior que os números " + primeiroNumero + " e " + terceiroNumero);
			
		} else if(terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) {
			System.out.println("O número " + terceiroNumero + " é maior que os números " + primeiroNumero + " e " + segundoNumero);
			
		} else if (primeiroNumero == segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("Os números " + primeiroNumero + " e " + segundoNumero + " são iguais e maiores que o número " + terceiroNumero);
			
		} else if (primeiroNumero == terceiroNumero && primeiroNumero > segundoNumero) {
			System.out.println("Os números " + primeiroNumero + " e " + terceiroNumero + " são iguais e maiores que o número " + segundoNumero);
			
		} else if (segundoNumero == terceiroNumero && segundoNumero > primeiroNumero) {
			System.out.println("Os números " + segundoNumero + " e " + terceiroNumero + " são iguais e maiores que o número " + primeiroNumero);
			
		} else {
			System.out.println("Os números " + primeiroNumero + " e " + segundoNumero + " e " + terceiroNumero + " são iguais");
			
		}
		
		
		// questão 7:
		
		System.out.println("Informe o primeiro número: ");
		double num1 = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe o segundo número: ");
		double num2 = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe o terceiro número: ");
		double num3 = scan.nextDouble();
		System.out.println();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O número " + num1 + " é maior que os números " + num2 + " e " + num3);
			
		} else if(num2 > num1 && num2 > num3) {
			System.out.println("O número " + num2 + " é maior que os números " + num1 + " e " + num3);
			
		} else if(num3 > num1 && num3 > num2) {
			System.out.println("O número " + num3 + " é maior que os números " + num1 + " e " + num2);
			
		} else if (num1 == num2 && num1 > num3) {
			System.out.println("Os números " + num1 + " e " + num2 + " são iguais e maiores que o número " + num3);
			
		} else if (num1 == num3 && num1 > num2) {
			System.out.println("Os números " + num1 + " e " + num3 + " são iguais e maiores que o número " + num2);
			
		} else if (num2 == num3 && num2 > num1) {
			System.out.println("Os números " + num2 + " e " + num3 + " são iguais e maiores que o número " + num1);
			
		} else {
			System.out.println("Os números " + num1 + " e " + num2 + " e " + num3 + " são iguais");
			
		}
		
		
		scan.close();

	}

}
