package service;

import model.Client;

public class MailBoxOnArray implements MailBox {

        private int basketIndex;

        private int regenArrayIndex;

        private Client[] clients = new Client[10];

        public void addProduct(Client client) {
            if (regenArrayIndex >= 10) {
                Client[] clients2 = new Client[clients.length + 10];
                System.arraycopy(clients, 0, clients2, 0, clients.length);
                clients = clients2;
                regenArrayIndex = 0;
            }

            clients[basketIndex++] = client;
            regenArrayIndex++;
        }

    @Override
    public void addClient(Client client) {

    }

    public Client[] getClients() {
            return clients;
        }
}
