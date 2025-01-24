package com.loiane.cursojavabasico.aula11;

public class CuriosidadeInt {

	public static void main(String[] args) {
		
		int var1 = 2147483647; // valor máximo do int
		
		int var2 = 1;
		
		System.out.println(var1 + var2);
		
		/* -2147483648 volta pro número incial do intervalo, 
		pois em Java o escopo dos valores quando é ultrapassado funviona 
		como uma roleta que volta ao seu início*/


	}

}
