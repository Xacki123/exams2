package ru.tsvetkov.exams.command;


/*Receiver class*/

import ru.tsvetkov.exams.BinHandler;
import ru.tsvetkov.exams.Block;
import ru.tsvetkov.exams.InitBlock;

public class Menu {
    private InitBlock initBlock = new InitBlock();
    private String nameBlock;
    BinHandler<String> binHandler = new BinHandler<>();
    public void startGame(String nameBlock){
        initBlock.init();
        Block block = initBlock.getMap().get(nameBlock);
        block.start();

    }
    public void loadGame(){
        System.out.println("Загрузить игру из файла");
        nameBlock = binHandler.readFromFile();
        //System.out.println(nameBlock);
        startGame(nameBlock);
    }
    public void exit(){
        System.out.println("Выход из игры");
    }
    public void saveGame(String nameBlock){
        System.out.println("Сохранить игру");
        binHandler.writeToFile(nameBlock);



    }
}
