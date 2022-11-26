package ru.tsvetkov.exams;

import ru.tsvetkov.exams.command.*;

import java.util.Scanner;

public class Block {
    private String name;
    private String text;
    private String answerOne;
    private String answerTwo;
  //  private Switch aSwitch;

    private Menu menu = new Menu();
    private Start start = new Start(menu, name);
    private Exit exit = new Exit(menu);
    private Load load = new Load(menu);
    private Save save = new Save(menu, name);
    private Switch sw = new Switch(start,load,exit,save);
    public Block(String name, String text, String answerOne, String answerTwo){
        this.name = name;
        this.text = text;
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
       // this.aSwitch = aSwitch;
    }

    public Block(String name, String text) {
        this.name = name;
        this.text = text;
        this.answerTwo = "none";
        this.answerOne = "none";
    }

    // вывод содержимого в консоль
    public void start(){
        System.out.println(name);
        System.out.println(text);
        System.out.println("Если хотите - " + answerOne + " нажмите 1, " + "если хотите - " + answerTwo + " нажмите 2, " + "если хотите Выйти - нажмите 3, если хотите Сохранить игру - нажмите 4");
        if (checkEnd(answerOne)) return;
        choosing();
    }

    // Считывание ответа пользователя пользователя
    public int checkAnswer(){
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        return answer;
    }

    public void choosing(){
        switch (checkAnswer()){
            case 1 -> {
                System.out.println("Перехожу на блок " + answerOne);
                start = new Start(menu, answerOne);
                sw = new Switch(start,load,exit,save);
                sw.start();

            }
            case 2 -> {
                System.out.println("Перехожу на блок " + answerTwo);
                start = new Start(menu, answerTwo);
                sw = new Switch(start,load,exit,save);
                sw.start();
            }
            case 3 -> {
                sw.exit();
            }
            case 4 -> {
                save = new Save(menu, name);
                sw = new Switch(start,load,exit,save);
                sw.save();
            }
            default -> {
                System.out.println("Введено не корректно");
                start();
            }
        }
    }
    public boolean checkEnd(String string){
        return  string.equals("none");
    }
}
