package model;

public class VipClient extends AllClients {

    public VipClient(String fio){
        super(fio);
    }


    public VipClient(){

    }

    @Override
    public String toString() {
        return "ВИП Клиент, Id: " + getIdClient() + ", ФИО " + getFio();
    }
}
