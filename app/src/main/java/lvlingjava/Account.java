package lvlingjava;

public class Account {

    private int ownerId;
    public int getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    private int money;
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public Account(int ownerId, int money) {
        this.ownerId = ownerId;
        this.money = money;
    }
}
