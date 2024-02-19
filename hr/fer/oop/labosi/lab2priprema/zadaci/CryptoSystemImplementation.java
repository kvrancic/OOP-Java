package hr.fer.oop.labosi.lab2priprema.zadaci;

public class CryptoSystemImplementation implements CryptoSystem{
    private int BTCAmount = 0;
    private int ETHAmount = 0;

    public CryptoSystemImplementation() {
    }

    @Override
    public void buy(Item item) {
        if(item == Item.BTC)
            BTCAmount++;
        else if(item == Item.ETH)
            ETHAmount++;
    }

    @Override
    public void sell(Item item) {
        if(item == Item.BTC && BTCAmount > 0)
            BTCAmount--;
        else if(item == Item.ETH && ETHAmount > 0)
            ETHAmount--;
    }

    @Override
    public int getBTCCount() {
        return BTCAmount;
    }

    @Override
    public int getETHCount() {
        return ETHAmount;
    }

    public static void main(String[] args) {

        CryptoSystemImplementation cs = new CryptoSystemImplementation();

        //init:
        cs.getETHCount(); // vraca 0
        cs.getBTCCount(); // vraca 0
        System.out.println(cs.getETHCount()+ " " + cs.getBTCCount());

        // kupi ETH:
        for(int i=0; i<50;i++) {
            cs.buy(Item.ETH);
        }
        cs.getETHCount(); // vraca 50
        cs.getBTCCount(); // vraca 0
        System.out.println(cs.getETHCount()+ " " + cs.getBTCCount());

        // prodaj ETH:
        for(int i=0; i<10;i++) {
            cs.sell(Item.ETH);
        }
        cs.getETHCount(); // vraca 40
        cs.getBTCCount(); // vraca 0
        System.out.println(cs.getETHCount()+ " " + cs.getBTCCount());

        cs.sell(Item.BTC);
        cs.getETHCount(); // vraca 40
        cs.getBTCCount(); // vraca 0
        System.out.println(cs.getETHCount()+ " " + cs.getBTCCount());
    }
}
