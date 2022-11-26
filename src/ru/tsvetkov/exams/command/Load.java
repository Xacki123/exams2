package ru.tsvetkov.exams.command;

public class Load implements Command{
    private Menu menu;

    public Load(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.loadGame();
    }
}
