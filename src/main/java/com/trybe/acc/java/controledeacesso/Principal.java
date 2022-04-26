package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;

import java.util.ArrayList;

import java.util.Scanner;

public class Principal {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    // ESCREVA SEU CÓDIGO AQUI
    Short option = 0;
    ArrayList<Short> young = new ArrayList<Short>();
    ArrayList<Short> adult = new ArrayList<Short>();
    ArrayList<Short> old = new ArrayList<Short>();
    Scanner scan = new Scanner(System.in);
    while (option != 2) {
      System.out.println("Entre com o número correspondente à opção desejada: ");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostrar relatório");
      option = scan.nextShort();
      System.out.println(adult + "" + old + "" + young);
      if (option == 1) {
        System.out.println("Entre com a idade: ");
        Short age = scan.nextShort();
        if (age < 18) {
          young.add(age);
          System.out.println("Pessoa cliente menor de idade, catraca liberada!");
        } else if (age >= 18 && age <= 49) {
          adult.add(age);
          System.out.println("Pessoa adulta, catraca liberada!");
        } else {
          old.add(age);
          System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
        }
      } else if (option == 3) {
        System.out.println("Entre com uma opção válida!");

      }

    }
    scan.close();
    System.out.println("----- Quantidade -----");
    System.out.println("menores: " + young.size());
    System.out.println("adultas: " + adult.size());
    System.out.println("a partir de 50: " + old.size());
    int totalPeople = young.size() + adult.size() + old.size();
    double percentYoung = ((float) young.size() / (float) totalPeople) * 100;
    double percentAdult = ((float) adult.size() / (float) totalPeople) * 100;
    double percentOld = ((float) old.size() / (float) totalPeople) * 100;
    DecimalFormat df = new DecimalFormat("0.00");

    System.out.println("----- Percentual -----");
    System.out.println("menores: " + df.format(percentYoung) + "%");
    System.out.println("adultas: " + df.format(percentAdult) + "%");
    System.out.println("a partir de 50: " + df.format(percentOld) + "%");

  }
}
