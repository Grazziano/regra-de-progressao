package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int numberOfActivitiesToRegister = Integer.parseInt(scanner.nextLine());

    String[] arrayDeString = new String[numberOfActivitiesToRegister];
    int[] arrayDeInteiros = new int[numberOfActivitiesToRegister];

    for (int i = 0; i < numberOfActivitiesToRegister; i++) {
      System.out.format("Digite o nome da atividade %d:\n", i + 1);
      String activityName = scanner.nextLine();

      System.out.format("Digite o peso da atividade %d:\n", i + 1);
      int activityNote = Integer.parseInt(scanner.nextLine());

      arrayDeString[i] = activityName;
      arrayDeInteiros[i] = activityNote;
    }
  }
}