import model.BaseClient;
import model.Client;
import model.VipClient;
import service.MailBox;
import service.MailBoxOnArray;
import service.MailBoxOnList;
import service.MailBoxOnSet;
import java.util.Random;

public class SetClientToMail {

    public static void main(String[] args) {

        //MailBox myMailBox = new MailBoxOnList();
        MailBox myMailBox = new MailBoxOnArray();
        //MailBox myMailBox = new MailBoxOnSet();

        for (int i = 0; i < 30; i++) {
            myMailBox.addClient(selectAnyClient());
        }
        for(int i = 0; i < myMailBox.getClients().length; i++)
            System.out.println("Index: " + i + " Client: "+ myMailBox.getClients()[i]);

    }

    private static Client selectAnyClient() {
        Random r = new Random();
        int i = r.nextInt(100);
        if (i % 2 == 0) {
            return new BaseClient();
        }
        return new VipClient();
    }
}
