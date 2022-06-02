import model.AllClients;
import model.BaseClient;
import model.VipClient;

import java.util.*;

public class FindClientToMail {
    public static void main(String[] args) {

       Collection<AllClients> clientsForMail = findClients();

        System.out.println(clientsForMail.contains(new VipClient("VIP")));

        //printInfoClients(clientsForMail);
    }

    private static void printInfoClients(List<AllClients> clientsForMail) {
        for(int i = 0; i < 1000; i++) {

            AllClients t = clientsForMail.get(i);
            if (t.getFio().contains("VIP")) {
                System.out.println("Index " + i + " " + t.toString());
                break;
            } else {
                System.out.println("Index " + i);
            }
        }
    }

    private static Collection<AllClients> findClients() {

        Random r = new Random();
        Set<AllClients> set = new HashSet<>();
        for(int i = 0; i < 1000; i++){
            if(i != 20)
            set.add(new BaseClient("клиент Василий"));
         else
             set.add(new VipClient("VIP"));
        }
        return set;
    }

}
