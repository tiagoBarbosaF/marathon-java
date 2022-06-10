package tiagobarbosa.marathonjava.javacore.ZZFthreads.main;

import tiagobarbosa.marathonjava.javacore.ZZFthreads.domain.Members;
import tiagobarbosa.marathonjava.javacore.ZZFthreads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryMain01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread tiago = new Thread(new EmailDeliveryService(members), "Tiago");
        Thread peter = new Thread(new EmailDeliveryService(members), "Peter");
        tiago.start();
        peter.start();

        while (true) {
            String email = JOptionPane.showInputDialog("Entry your email:");
            if (email == null || email.isEmpty()) {
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
