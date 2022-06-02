package service;

import model.Client;

public interface MailBox {

    void addClient(Client client);
    Object[] getClients();
}
