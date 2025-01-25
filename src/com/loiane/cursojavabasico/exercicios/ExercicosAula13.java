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
		
		double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4.0;

		System.out.println("A m�dia das notas � igual a " + media);
		System.out.println();
		
		
		// quest�o 5:
		
		System.out.println("Informe a medi��o em metros: ");
		double medicaoMetro = scan.nextDouble();
		System.out.println();
		
		double medicaoCentimetro = medicaoMetro * 100.0;
		
		System.out.println("A medi��o em cent�metros � igual a " + medicaoCentimetro);
		System.out.println();
		
		
		// quest�o 6:
		
		System.out.println("Informe o raio de um c�rculo em cent�metros: ");
		double raioCirculo = scan.nextDouble();
		System.out.println();
		
		double areaCirculo = Math.PI * Math.pow(raioCirculo, 2);
		
		System.out.println("A �rea do c�rculo � igual a " + areaCirculo +" cm�");
		System.out.println();
		
		
		// quest�o 7:
		
		System.out.println("Informe o lado de um quadrado em cent�metros: ");
		double ladoQuadrado = scan.nextDouble();
		System.out.println();
		
		double areaQuadrado = Math.pow(ladoQuadrado, 2);
		
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
		
		double temperaturaCelsius = 5 * ((temperaturaFarenheit - 32.0) / 9.0);
		
		System.out.println("A temperatura em graus Celsius �: " + temperaturaCelsius + "�");
		System.out.println();
		
		
		// quest�o 10:
		
		System.out.println("Informe a temperatura em graus Celsius: ");
		double temperaturaCelsius2 = scan.nextDouble();
		System.out.println();
		
		double temperaturaFarenheit2 = ((temperaturaCelsius2 / 5.0) * 9.0) + 32.0;
		
		System.out.println("A temperatura em graus Farenheit �: " + temperaturaFarenheit2 + "�");
		System.out.println();
		
		
		// quest�o 11:
		
		System.out.println("Informe o primeiro n�mero inteiro: ");
		double primeiroInteiro = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe o segundo n�mero inteiro: ");
		double segundoInteiro = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe um n�mero real: ");
		double numeroReal = scan.nextDouble();
		System.out.println();
		
		double produtoDobroPrimeiroMetadeSegundo = (2.0 * primeiroInteiro) * (segundoInteiro / 2.0);
		
		double somaTriploPrimeiroMaisNumeroReal = (3.0 * primeiroInteiro) + numeroReal;
		
		double cuboNumeroReal = Math.pow(numeroReal, 3);
		
		System.out.println("O produto do dobro do primeiro n�mero inteiro com a metade do segundo n�mero inteiro � igual a " + produtoDobroPrimeiroMetadeSegundo);
		System.out.println();
		
		System.out.println("A soma do triplo do primeiro inteiro mais o n�mero real � igual a " + somaTriploPrimeiroMaisNumeroReal);
		System.out.println();
		
		System.out.println("O cubo do n�mero real � igual a " + cuboNumeroReal);
		System.out.println();
		
		
		// quest�o 12:
		
		System.out.println("Informe a sua altura em metros: ");
		double altura = scan.nextDouble();
		System.out.println();
		
		
		double pesoIdeal = (72.7 * altura) - 58.0;
		
		System.out.println("O seu peso ideial deve ser " + pesoIdeal +" kg");
		System.out.println();
		
		
		// quest�o 13:
		
		
		System.out.println("Informe a sua altura em metros: ");
		double altura2 = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe o seu sexo (M/F): ");
		String sexo = scan.next();
		System.out.println();
		
		System.out.println("Informe o seu peso em Kg: ");
		double pesoReal = scan.nextDouble();
		System.out.println();
		
		if (sexo.equalsIgnoreCase("M")) {
			
			double pesoIdealMasculino = (72.7 * altura2) - 58.0;
			
			if (pesoIdealMasculino != pesoReal) {
			
				System.out.println("O seu peso ideal deve ser " + pesoIdealMasculino +" kg");
				System.out.println();
			
			} else {
				System.out.println("Parab�ns! Voc� est� em seu peso ideal!");
			}
			
		} else if (sexo.equalsIgnoreCase("F")) {
			
			double pesoIdealFeminino = (62.1 * altura2) - 44.7;
			
			if (pesoIdealFeminino != pesoReal) {
				
				System.out.println("O seu peso ideal deve ser " + pesoIdealFeminino +" kg");
				System.out.println();
				
				} else {
					System.out.println("Parab�ns! Voc� est� em seu peso ideal!");
				}
			
		} else {
			System.out.println("Sexo informado inv�lido. Por favor, escolha entre as op��es Masculino(M) ou Feminino(F)");
			
		}		
		
		
		// quest�o 14:
		
		System.out.println("Informe o peso dos peixes em kg: ");
		double pesoPeixe = scan.nextDouble();
		System.out.println();
		
		double excesso;
		double multa;
		
		if (pesoPeixe > 50.0) {
			excesso = pesoPeixe - 50.0;
			multa = excesso * 4.0;
			
			System.out.println("O peso excedido foi de " + excesso + " kg");
			System.out.println("A multa ser� no valor de " + multa + " R$");
			System.out.println();
			
		} else {
			excesso = 0.0;
			multa = 0.0;
			System.out.println("O peso excedido foi de " + excesso + " kg");
			System.out.println("A multa ser� no valor de " + multa + " R$");
			System.out.println();
			
		}
		
		
		// quest�o 15:
		
		
		System.out.println("Informe o quanto voc� ganha por hora em reais: ");
		double ganhoHora = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe o n�mero de horas trabalhados no m�s: ");
		double horaMes = scan.nextDouble();
		System.out.println();
		
		double salarioBruto = ganhoHora * horaMes;
		double impostoRenda = salarioBruto * (11.0 / 100.0);
		double inss = salarioBruto * (8.0 / 100.0);
		double sindicato = salarioBruto * (5.0 / 100.0);
		double salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;
		
		System.out.println("+ Sal�rio Bruto: R$ " + salarioBruto + " - IR (11%): R$ " + impostoRenda + " - INSS (8%): R$ " + inss + " - Sindicato (5%): R$ " + sindicato + " = Sal�rio Liquido: R$ " + salarioLiquido);
		System.out.println();		
		
		
		// quest�o 16:
		
		System.out.println("Informe o tamanho em metros quadrados da �rea a ser pintada: ");
		double areaParaPintar = scan.nextDouble();
		System.out.println();
		
		double litrosTintaNecessario = areaParaPintar / 3.0;
		double lataTinta = 18.0;
		double precoLata = 80.0;
		
		int latasNecessarias = (int) Math.ceil(litrosTintaNecessario / lataTinta); 
		double dinheiroGastoLata = latasNecessarias * precoLata;
		
		System.out.println("Ser�o necess�rias " + latasNecessarias + " latas para a pintura");
		System.out.println("O valor gasto com as latas ser� de " + dinheiroGastoLata + " R$");
		System.out.println();
		
		
		// quest�o 17:
		
		System.out.println("Informe o tamanho em metros quadrados da �rea a ser pintada: ");
		double areaParaPintar2 = scan.nextDouble();
		System.out.println();
		
		double coberturaTinta = 6.0;
		double tintaLata = 18.0;
		double valorLata = 80.0;
		double galaoTinta = 3.6;
		double valorGalao = 25.0;
		
		double quantidadeTintaNecessaria = areaParaPintar2 / coberturaTinta;
		
		int apenasLata = (int) Math.ceil(quantidadeTintaNecessaria / tintaLata); 
		double valorApenasLata = apenasLata * valorLata;
		
		int apenasGalao = (int) Math.ceil(quantidadeTintaNecessaria / galaoTinta); 
		double valorApenasGalao = apenasGalao * valorGalao;
		
		int latasMistura = (int) (quantidadeTintaNecessaria / tintaLata); 
	    double restante = quantidadeTintaNecessaria % tintaLata; 
	    int galoesMistura = (int) Math.ceil(restante / galaoTinta);
	    double precoMistura = (latasMistura * valorLata) + (galoesMistura * valorGalao);
	    
	    System.out.println("\nResultados:");
	    System.out.println();
	    
        System.out.println("1. Apenas latas de 18 litros:");
        System.out.println("   Quantidade de latas: " + apenasLata);
        System.out.printf("   Pre�o total: R$ %.2f\n", valorApenasLata);
        System.out.println();
        
        System.out.println("2. Apenas gal�es de 3,6 litros:");
        System.out.println("   Quantidade de gal�es: " + apenasGalao);
        System.out.printf("   Pre�o total: R$ %.2f\n", valorApenasGalao);
        System.out.println();

        System.out.println("3. Mistura de latas e gal�es:");
        System.out.println("   Quantidade de latas: " + latasMistura);
        System.out.println("   Quantidade de gal�es: " + galoesMistura);
        System.out.printf("   Pre�o total: R$ %.2f\n", precoMistura);
        System.out.println();
        
        
        // quest�o 18:
        
        System.out.println("Informe o tamanho do arquivo para download em Megabytes: ");
		double tamanhoMegabyte = scan.nextDouble();
		System.out.println();
		
		System.out.println("Informe a velocidade do link de internet em Mbps: ");
		double velocidadeLink = scan.nextDouble();
		System.out.println();
		
		
		double tempoDownloadSegundo = tamanhoMegabyte / velocidadeLink;
		
		double tempoDownloadMinuto = tempoDownloadSegundo / 60;
		
		System.out.println("O tempo necess�rio para o download ser� de "+ tempoDownloadMinuto +" min");
		System.out.println();
		
		scan.close();
	}	
}
