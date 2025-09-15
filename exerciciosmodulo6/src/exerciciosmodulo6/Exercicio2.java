package exerciciosmodulo6;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if(numero>0 && numero%2 ==0) {
			System.out.printf("O Número %d é par e positivo!", numero);
		}if(numero>0 && numero%2 !=0) {
			System.out.printf("O Número %d é ímpar e positivo!", numero);
		}if(numero<0 && numero%2 ==0) {
				System.out.printf("O Número %d é par e negativo!", numero);
		}if(numero<0 && numero%2 != 0) {
				System.out.printf("O Número %d é ímpar e negativo!", numero);
			}
		
			
			leia.close();
			
			}

	}

