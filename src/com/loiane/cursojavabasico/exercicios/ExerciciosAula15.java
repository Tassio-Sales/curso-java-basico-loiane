package com.loiane.cursojavabasico.exercicios;

import java.util.Scanner;

public class ExerciciosAula15 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		// quest�o 1:
		
		System.out.println("Informe o primeiro n�mero: ");
		double numero1 = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe o segundo n�mero: ");
		double numero2 = scan.nextDouble();
		System.out.println();
		
		if(numero1 > numero2) {
			System.out.println("O valor "+ numero1 + " � maior que o valor "+ numero2);
			
		} else if (numero1 < numero2) {
			System.out.println("O valor "+ numero1 + " � menor que o valor "+ numero2);
			
		} else {
			System.out.println("O valor "+ numero1 + " � igual ao valor "+ numero2);
			
		}
		
		
		// quest�o 2:
		
		System.out.println("Informe um valor: ");
		double valor = scan.nextDouble();
		System.out.println();
		
		if(valor > 0) {
			System.out.println("O valor "+ valor + " � positivo");
			
		} else if (valor < 0) {
			System.out.println("O valor "+ valor + " � negativo");
			
		} else {
			System.out.println("O valor "+ valor + " � igual a 0. Portanto, � um valor neutro");
			
		}
		
		
		// quest�o 3:
		
		System.out.println("Informe o seu sexo(M/F): ");
		String sexo = scan.next();
		System.out.println();
		
		if(sexo.equalsIgnoreCase("F")) {
			System.out.println("F - Feminino");
			
		} else if (sexo.equalsIgnoreCase("M")){
			System.out.println("M - Masculino");
			
		} else {			
			System.out.println("Sexo inv�lido");
			
		}
		
		// quest�o 4:
		
		System.out.println("Informe uma letra: ");
		String letra = scan.next();
		System.out.println();
		
		switch(letra){
			case "a":
			case "e":
			case "i":
			case "o":
			case "u": System.out.println("A letra informada � uma vogal!"); break;
			default: System.out.println("A lettra informada � uma consoante!");			
		}
		
		// quest�o 5:
		
		System.out.println("Informe a primeira nota parcial: ");
		double primeiraNota = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe a segunda nota parcial: ");
		double segundaNota = scan.nextDouble();
		System.out.println();
		
		double media = (primeiraNota + segundaNota) / 2;
		
		if(media == 10) {
			System.out.println("Aprovado com Distin��o!");
			
		} else if (media >= 7) {
			System.out.println("Aprovado!");
			
		} else {
			System.out.println("Reprovado!");
			
		}
		
		// quest�o 6:
		
		System.out.println("Informe o primeiro n�mero: ");
		double primeiroNumero = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe o segundo n�mero: ");
		double segundoNumero = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe o terceiro n�mero: ");
		double terceiroNumero = scan.nextDouble();
		System.out.println();
		
		if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O n�mero " + primeiroNumero + " � maior que os n�meros " + segundoNumero + " e " + terceiroNumero);
			
		} else if(segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
			System.out.println("O n�mero " + segundoNumero + " � maior que os n�meros " + primeiroNumero + " e " + terceiroNumero);
			
		} else if(terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) {
			System.out.println("O n�mero " + terceiroNumero + " � maior que os n�meros " + primeiroNumero + " e " + segundoNumero);
			
		} else if (primeiroNumero == segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("Os n�meros " + primeiroNumero + " e " + segundoNumero + " s�o iguais e maiores que o n�mero " + terceiroNumero);
			
		} else if (primeiroNumero == terceiroNumero && primeiroNumero > segundoNumero) {
			System.out.println("Os n�meros " + primeiroNumero + " e " + terceiroNumero + " s�o iguais e maiores que o n�mero " + segundoNumero);
			
		} else if (segundoNumero == terceiroNumero && segundoNumero > primeiroNumero) {
			System.out.println("Os n�meros " + segundoNumero + " e " + terceiroNumero + " s�o iguais e maiores que o n�mero " + primeiroNumero);
			
		} else {
			System.out.println("Os n�meros " + primeiroNumero + " e " + segundoNumero + " e " + terceiroNumero + " s�o iguais");
			
		}
		
		
		// quest�o 7:
		
		System.out.println("Informe o primeiro n�mero: ");
		double num1 = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe o segundo n�mero: ");
		double num2 = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe o terceiro n�mero: ");
		double num3 = scan.nextDouble();
		System.out.println();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O n�mero " + num1 + " � maior que os n�meros " + num2 + " e " + num3);
			
		} else if(num2 > num1 && num2 > num3) {
			System.out.println("O n�mero " + num2 + " � maior que os n�meros " + num1 + " e " + num3);
			
		} else if(num3 > num1 && num3 > num2) {
			System.out.println("O n�mero " + num3 + " � maior que os n�meros " + num1 + " e " + num2);
			
		} else if (num1 == num2 && num1 > num3) {
			System.out.println("Os n�meros " + num1 + " e " + num2 + " s�o iguais e maiores que o n�mero " + num3);
			
		} else if (num1 == num3 && num1 > num2) {
			System.out.println("Os n�meros " + num1 + " e " + num3 + " s�o iguais e maiores que o n�mero " + num2);
			
		} else if (num2 == num3 && num2 > num1) {
			System.out.println("Os n�meros " + num2 + " e " + num3 + " s�o iguais e maiores que o n�mero " + num1);
			
		} else {
			System.out.println("Os n�meros " + num1 + " e " + num2 + " e " + num3 + " s�o iguais");
			
		}
		
		
		scan.close();

	}

}
