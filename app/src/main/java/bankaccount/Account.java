package bankaccount;

public class Account {

    private int ownerId;
    public int getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    // money should be 0 by default
    private int money=0;
    
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

    public Account(int ownerId) {
        this.ownerId = ownerId;
    }
}
