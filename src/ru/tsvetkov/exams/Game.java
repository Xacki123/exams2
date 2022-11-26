package ru.tsvetkov.exams;

import ru.tsvetkov.exams.command.*;

import java.util.Scanner;

public class Game {
    private Menu menu = new Menu();
    private Start start = new Start(menu, "Лисенок");
    private Exit exit = new Exit(menu);
    private Load load = new Load(menu);
    private Save save = new Save(menu, "Лисенок");
    private Switch sw = new Switch(start,load,exit,save);

    public void startGame(){
        System.out.println("Нажмите 1 чтобы Начать игру, нажмите 2 чтобы загрузить игру, нажмите 3 чтобы выйти");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if (answer == 1){
            sw.start();
//            Block block1 = new Block("Лисенок", "Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком. Это утро не было исключением. Лисёнок пришёл на их обычное место встречи, но Бельчонка там не было. Лисёнок ждал, ждал, но так и не смог дождаться своего друга. \" Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду.\" - подумал Лисёнок. Как поступить Лисенку?", "Вернуться домой", "Отправиться на поиски", sw);
//            block1.start();
        } else if (answer == 2){
            sw.load();
        } else if (answer == 3){
            sw.exit();
        } else {
            System.out.println("Не верно введено значение");
            startGame();
        }
    }
}
