package hr.fer.oop.labosi.samostalnilabos2;

public class Block {
    private byte[] prevHash;
    private String[] transactions;
    private int index = 0;
    private int maxTransactions;
    Hasher hasher;

    public Block(int maxTransactions) {
        this(maxTransactions, new SHAHasher());
    }

    public Block(int maxTransactions, Hasher hasher) {
        this.index = 0;
        this.transactions = new String[maxTransactions];
        this.hasher = hasher;
    }

    public byte[] getPrevHash() {
        return prevHash;
    }

    public void setPrevHash(byte[] prevHash) {
        this.prevHash = prevHash;
    }

    public int add(String transaction)
    {
        transactions[index] = transaction;
        return index++;
    }

    void remove(int index)
    {
        //brisanje transakcije s određenim iznosom iz polja u koje je dodana transakcija
        String[] tempTransactions = new String[transactions.length - 1];
        for(int i = index ; i < this.index; i++){
            transactions[i] = transactions[i + 1];
        }
        this.index--;
    }

    public byte[] hash(byte[] prevHash) {
        return hasher.hash(prevHash, this.transactions);
    }

    public static void main(String[] args) {
        Blockchain sbc = new Blockchain(100);
        Block firstBlock = new Block(10);
        firstBlock.add("some transaction 1");
        firstBlock.add("some transaction 2");
        sbc.add(firstBlock);
        byte[] firstBlockHash = firstBlock.hash(new byte[]{0});
        System.out.println(sbc.isAltered(0, firstBlockHash)); //false

        Block secondBlock = new Block(10);
        secondBlock.add("some transaction 3");
        secondBlock.add("some transaction 4");
        sbc.add(secondBlock);
        byte[] secondBlockHash = secondBlock.hash(firstBlockHash);
        System.out.println(sbc.isAltered(1, secondBlockHash)); //false

        //check remove transaction in a previous block
        firstBlock.remove(1);
        System.out.println(sbc.isAltered(1, secondBlockHash)); //true
        firstBlock.add("some transaction 2"); //return removed transaction
        System.out.println(sbc.isAltered(1, secondBlockHash)); //false

        //check modification of the block with index blockIndex
        secondBlock.add("some transaction 5");
        System.out.println(sbc.isAltered(1, secondBlockHash)); //true
        secondBlock.remove(2);//remove added transaction
        System.out.println(sbc.isAltered(1, secondBlockHash)); //false

        //check add transaction in a previous block
        firstBlock.add("some additional transaction");
        System.out.println(sbc.isAltered(1, secondBlockHash)); //true

        //check prevHash modification
        byte[] alteredFirstBlockHash = firstBlock.hash(new byte[]{0});
        secondBlock.setPrevHash(alteredFirstBlockHash);
    }

}
