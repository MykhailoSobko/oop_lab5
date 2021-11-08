package user;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Sender implements User {
    static int lastSenderId = 0;
    @Getter
    private int id;

    public Sender() {
        Sender.lastSenderId++;
        this.id = Sender.lastSenderId;
    }

    @Override
    public void update(String status) {
        System.out.println("Sender got updated, status: " + status + '\n');
    }
}
