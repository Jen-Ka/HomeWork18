package model;

public class BaseClient extends AllClients{

    public BaseClient(String fio){
        super(fio);
    }


    public BaseClient(){

    }

    @Override
    public String toString() {
        return "Обычный клиент, Id: " + getIdClient() + ", ФИО " + getFio();
    }
}
