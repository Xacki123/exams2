package ru.tsvetkov.exams.command;

public class Save implements Command{
    private Menu menu;
    private String nameBlock;

    public Save(Menu menu, String nameBlock) {
        this.nameBlock = nameBlock;
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.saveGame(nameBlock);
    }
}
