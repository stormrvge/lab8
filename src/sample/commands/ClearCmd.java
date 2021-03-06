package sample.commands;

import sample.connection.client.Client;
import sample.logic.Packet;
import sample.logic.User;
import sample.connection.server.Server;
import sample.commands.Command;

public class ClearCmd extends Command {

    public ClearCmd() {
        super("Clear", true, true);
    }

    public boolean getRequireLogin() {
        return require_login;
    }

    @Override
    public Packet execOnServer(Server server, Object args, User user) {
        return new Packet(null, server.getManager().clear(server, user), null);
    }

    @Override
    public Packet execOnClient(Client client, Object... args) {
        if (client.getUser().getLoginState()) {
            return new Packet(this, args, client.getUser());
        } else {
            System.err.println("You must login!");
            return null;
        }
    }
}
