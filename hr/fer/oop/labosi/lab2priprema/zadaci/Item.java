package hr.fer.oop.labosi.lab2priprema.zadaci;

interface CryptoSystem {
    /**
     * Pozivom metode simulira se kupovina jedne kriptovalute
     * Sukladno kupljenoj valuti (item) potrebno je azurirati porfolio
     *
     * @param item - kriptovaluta koja se kupuje
     */
    public void buy(Item item);
    /**
     * Kriptovalutu je moguce prodati samo ako je kriptovaluta dostupna u portfoliu
     * (argument ce se ignorirati ako kriptovaluta nije dostupna u portfoliu)
     * Sukladno prodanoj valuti (item) potrebno je azurirati porfolio
     *
     * @param item - kriptovaluta koja se prodaje
     */
    public void sell(Item item);
    /**
     * @return vraca trenutno stanje kriptovalute BTC u portfoliu
     */
    public int getBTCCount();

    /**
     * @return vraca trenutno stanje kriptovalute ETH u portfoliu
     */
    public int getETHCount();

}

public enum Item {
    ETH, BTC
}
