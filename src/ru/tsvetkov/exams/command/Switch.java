package ru.tsvetkov.exams.command;

/*the Invoker class*/

public class Switch {
    private Command start;
    private Command load;
    private Command exit;
    private Command save;

    public Switch(Command start, Command load, Command exit, Command save) {
        this.start = start;
        this.load = load;
        this.exit = exit;
        this.save = save;
    }

    public void start(){
        start.execute();
    }
    public void load(){
        load.execute();
    }
    public void exit(){
        exit.execute();
    }
    public void save(){
        save.execute();
    }
}
