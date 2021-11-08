package user;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Receiver implements User {
    static int lastReceiverId = 0;
    @Getter
    private int id;

    public Receiver() {
        Receiver.lastReceiverId++;
        this.id = Receiver.lastReceiverId;
    }
    @Override
    public void update(String status) {
        System.out.println("Receiver got updated, status: " + status + '\n');
    }
}
