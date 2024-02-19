package hr.fer.oop.auditorne.audit3.glass;

//Napisati klasu GlassOfWater koja modelira čašu koja se može puniti vodom ili kockama leda.
//Atributi klase (zapremina čaše [u mililitrima], koliko vode i koliko kocki leda sadrži) trebaju biti
//enkapsulirani, a klasa mora imati dvije javne metode – addWater(int currentWaterAmount) i
//addIceCubes(int numberOfIceCubes) kojima se čaša puni vodom zadanom u mililitrima ili
//ledom zadanim brojem kocaka. Svaka kocka leda zauzima 50ml i kocke se mogu savršeno složiti u
//čašu. Zapremina čaše zadaje se konstruktorom. Ako se u čašu utoči previše vode ili doda previše
//leda, dolazi do prelijevanja. U slučaju prelijevanja prvo izlazi višak vode, a onda otpada višak kocaka
//leda. Enkapsulirati prelijevanje u zasebnu metodu koja se poziva iz javnih metoda klase za dodavanje
//vode ili leda. Pri dodavanju leda ili vode ispisati na ekran stanje čaše prije dodavanja, zatim količinu
//vode i leda koji se dodaju, a naposljetku nakon provjere prelijevanja ispisati novo stanje. U slučaju
//prelijevanja ispisati na ekran koliko se vode prelilo i koliko je kocki leda otpalo.

public class GlassOfWater {
    private int glassVolume;
    private int currentWaterAmount = 0;
    private int iceCubeCount = 0;

    public GlassOfWater(int glassVolume) {
        this.glassVolume = glassVolume;
    }

    public void addWater(int waterAmount) {
        System.out.printf("Glass contains %d milliliters of water and %d ice cubes before addition.\n",
                this.currentWaterAmount, this.iceCubeCount);
        System.out.println("Adding " + waterAmount + " milliliters of water");

        currentWaterAmount += waterAmount;
        checkForOverflow();

        System.out.printf("Glass contains %d milliliters of water and %d ice cubes before addition.\n",
                this.currentWaterAmount, this.iceCubeCount);
    }


    public void addIceCubes(int numberOfIceCubes) {
        System.out.printf("Glass contains %d milliliters of water and %d ice cubes before addition.\n",
                this.currentWaterAmount, this.iceCubeCount);
        System.out.println("Adding " + numberOfIceCubes + "ice cubes");

        iceCubeCount += numberOfIceCubes;
        checkForOverflow();

        System.out.printf("Glass contains %d milliliters of water and %d ice cubes after addition.\n",
                this.currentWaterAmount, this.iceCubeCount);
    }

    private void checkForOverflow() {
        int currentIceCubeVolume = iceCubeCount * 50;
        if (currentIceCubeVolume + currentWaterAmount > glassVolume) {
            int overflow = currentIceCubeVolume + currentWaterAmount - glassVolume;

            if (currentWaterAmount >= overflow) {
                currentWaterAmount -= overflow;
                System.out.println(overflow + " milliliters of water has overflown");
            } else {
                int x = iceCubeCount;
                iceCubeCount -= (int) (Math.ceil((overflow - currentWaterAmount) / 50.0));
                currentWaterAmount = 0;
                System.out.println("All water was overflown and " + (x - iceCubeCount) + " ice cubes have overflown");
            }
        }
    }
}


