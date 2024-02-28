package com.trybe.java.regraprogressao;

import java.util.Arrays;
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

    String[] activityNames = new String[numberOfActivitiesToRegister];
    int[] weightActivities = new int[numberOfActivitiesToRegister];
    int[] activityNotes = new int[numberOfActivitiesToRegister];

    for (int i = 0; i < numberOfActivitiesToRegister; i++) {
      System.out.format("Digite o nome da atividade %d:\n", i + 1);
      String currentActivityName = scanner.nextLine();

      System.out.format("Digite o peso da atividade %d:\n", i + 1);
      int currentActivityWeight = Integer.parseInt(scanner.nextLine());

      System.out.format("Digite a nota obtida para %s:\n", currentActivityName);
      int currentNote = Integer.parseInt(scanner.nextLine());

      activityNames[i] = currentActivityName;
      weightActivities[i] = currentActivityWeight;
      activityNotes[i] = currentNote;
    }

    int sum = Arrays.stream(weightActivities).sum();
    if(sum > 100 || sum < 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }
  }
}