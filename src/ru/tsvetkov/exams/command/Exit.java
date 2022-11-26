package ru.tsvetkov.exams.command;

public class Exit implements Command{
    private Menu menu;

    public Exit(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.exit();
    }
}
