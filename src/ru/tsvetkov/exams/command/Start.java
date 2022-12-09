package ru.tsvetkov.exams.command;

public class Start implements Command{
    private Menu menu;
    private String nameBlock;


    public Start(Menu menu, String nameBlock) {
        this.nameBlock = nameBlock;
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.startGame(nameBlock);
    }
}
