package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Aluno;
import enums.Plano;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Aluno> lista = new ArrayList<>();

		System.out.println("Quantidade de alunos");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Matricula: ");
			int matricula = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.println();
			lista.add(new Aluno(matricula, nome, idade, Plano.GYM_PASS));
		}

		for (Aluno obj : lista) {
			System.out.println(obj);
		}
	}
}
