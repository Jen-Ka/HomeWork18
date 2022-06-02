package service;

import model.BaseClient;
import model.Client;
import model.VipClient;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class MailBoxOnList implements MailBox{

    private Collection<Client> clients = new ArrayList<>();

    private static Client selectAnyClient() {
        Random r = new Random();
        int i = r.nextInt(100);
        if(i % 2 == 0) {
            return new BaseClient();
        }
        return new VipClient();
    }

    @Override
    public void addClient(Client client) {
        clients.add(client);
    }

    @Override
    public Object[] getClients() {
        return clients.toArray();
    }
}
