package service;

import model.BaseClient;
import model.Client;

import java.util.Collection;
import java.util.HashSet;

public class MailBoxOnSet implements MailBox {

    private Collection<Client> clients = new HashSet<>();

   @Override
    public void addClient(Client client) {
        clients.add(client);
    }

    @Override
    public Object[] getClients() {
        return clients.toArray();
    }
}
