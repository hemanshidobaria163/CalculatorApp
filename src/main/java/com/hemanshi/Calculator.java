package com.hemanshi;

import java.util.Scanner;


/**
 * Hello world!
 */
public class Calculator {

  Addition add = new Addition();
  Division div = new Division();
  Modulo mod = new Modulo();
  Multiplication mul = new Multiplication();
  Substraction sub = new Substraction();

  public static void main(String[] args) throws Exception {

    Calculator calculator = new Calculator();
    calculator.askForInput();
  }

  void askForInput() throws Exception {
    Scanner in = new Scanner(System.in);
    System.out.println("Basic calculator app.");
    System.out.println("You can use 'add', 'mul', 'sub', 'div', 'mod' as command with numeric arguments");
    System.out.println("Ex: add 1 2");

    while(true){
      System.out.println("Command Input:");
      String command = in.nextLine();
      if(command.split(" ").length != 3){
        System.out.println("You need to enter 3 arguments space separated. Ex:add 1 2");
        continue;
      }
      try{
        calculate(command);
      } catch (Exception ex){
        ex.printStackTrace();
      }
    }

  }

  void calculate(String command) throws Exception {

    String[] splitCommand = command.split(" ");
    if (splitCommand[0].toLowerCase().contains("add")) {
      System.out.println("Answer is:"+add.doOperation(splitCommand[1], splitCommand[2]));
    } else if (splitCommand[0].toLowerCase().contains("sub")) {
      System.out.println("Answer is:"+sub.doOperation(splitCommand[1], splitCommand[2]));
    } else if (splitCommand[0].toLowerCase().contains("mul")) {
      System.out.println("Answer is:"+mul.doOperation(splitCommand[1], splitCommand[2]));
    } else if (splitCommand[0].toLowerCase().contains("div")) {
      System.out.println("Answer is:"+div.doOperation(splitCommand[1], splitCommand[2]));
    } else if (splitCommand[0].toLowerCase().contains("mod")) {
      System.out.println("Answer is: "+mod.doOperation(splitCommand[1], splitCommand[2]));
    } else {
      System.out.println("Unknown command");
      System.out.println("You can use 'add', 'mul', 'sub', 'div', 'mod' as command with numeric arguments");
    }
  }
}
