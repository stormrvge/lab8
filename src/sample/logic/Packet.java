package sample.logic;

import sample.commands.Command;

import java.io.Serializable;

public class Packet implements Serializable {
    private final Command command;
    private final Object argument;
    private final User user;
    private Boolean isLogin;
    private Boolean boolAnswer;
    private Boolean syncCmd;

    public Packet(Object argument, Boolean syncCmd) {
        this.command = null;
        this.user = null;
        this.argument = argument;
        this.syncCmd = syncCmd;
    }

    public Packet(Command command, Object argument, User user) {
        this.command = command;
        this.argument = argument;
        this.user = user;
        this.syncCmd = false;
    }

    public Packet(Command command, Object argument, User user, Boolean boolAnswer) {
        this.command = command;
        this.argument = argument;
        this.user = user;
        this.boolAnswer = boolAnswer;
        this.syncCmd = false;
    }

    public Packet(Boolean boolAnswer) {
        this.command = null;
        this.argument = null;
        this.user = null;
        this.boolAnswer = boolAnswer;
        this.syncCmd = false;
    }


    public Command getCommand() {
        return command;
    }

    public Object getArgument() {
        return argument;
    }

    public User getUser() {
        return user;
    }

    public Boolean getBoolAnswer() {
        return boolAnswer;
    }

    public Boolean getSync() {
        return syncCmd;
    }

    public Boolean isLogin() {
        return isLogin;
    }

    public void setIsLogin(boolean isLogin) {
        this.isLogin = isLogin;
    }
}

