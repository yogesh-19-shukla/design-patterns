package org.example.commandPattern;

public class Remote {

    private Command command;
    private Command lastCommand;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        if(command!= null){
            command.execute();
            lastCommand = command;
        }
    }

    public void pressUndo(){
        if(lastCommand!= null){
            lastCommand.undo();
        } else {
            System.out.println("Nothing to undo");
        }
    }
}
