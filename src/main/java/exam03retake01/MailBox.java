package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();

    public List<Mail> findByCriteria(String criteria) {
        List<Mail> result = new ArrayList<>();
        for (Mail mail : mails) {
            if (mail.getFrom().getName().startsWith("from") || mail.getFrom().getEmail().startsWith("from")) {
                result.add(mail);
                System.out.println("from:" + mail.getFrom());
            }
            if (mail.getTo().getName().startsWith("to") || mail.getFrom().getEmail().startsWith("to")) {
                result.add(mail);
                System.out.println("to:" + mail.getTo());
            } else if (mail.getSubject().contains(String criteria)) {
                System.out.println(mail);
            }
        }


        return result;
    }


    public List<Mail> getMails() {
        return mails;
    }
}
