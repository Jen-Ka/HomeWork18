package model;

import java.util.Objects;

public abstract class Client {

    private int idClient;
    private String fio;

    public Client(String fio){
        this.fio = fio;
    }

    public Client(){
    }

    public int getIdClient() {
        return idClient;
    }

    public String getFio() {
        return fio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(fio, client.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio);
    }
}
