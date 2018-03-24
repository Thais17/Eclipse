package br.com.senac.estruturas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		double peso, altura, imc;
		String nome;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat ("#0.00");
		System.out.print("Digite seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite seu peso: ");
		peso = teclado.nextDouble();
		System.out.print("Digite sua altura: ");
		altura = teclado.nextDouble();
		System.out.println("");
		System.out.println("========================");
		System.out.println("Nome: " + nome);
		imc = peso/(altura * altura);
		System.out.println("IMC: " + formatador.format(imc));
		if (imc < 17) {
			System.out.println("Você está muito abaixo do peso!");
		} else if (imc >= 17 && imc < 18.5){
			System.out.println("Você está abaixo do peso!");
		}else if (imc >= 18.5 && imc < 25){
			System.out.println("Você está no peso normal!");
		}else if (imc >= 25 && imc < 30){
			System.out.println("Você está acima do peso!");
		}else if (imc >= 30 && imc < 35){
			System.out.println("Você está com Obesidade I!");
		}else if (imc >= 35 && imc < 40){
			System.out.println("Você está com Obesidade II!");
		}else{
			System.out.println("Você está com Obesidade III!");
		}
		
		}

}
