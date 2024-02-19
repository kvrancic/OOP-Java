package hr.fer.oop.labosi.samostalnilabos2;

import java.util.Arrays;

public class Blockchain {
    private Block[] blocks;
    private int index;
    private int maxIndex;

    public Blockchain(int maxIndex) {
        this.blocks = new Block[maxIndex];
        this.index = 0;
    }

    int add(Block newBlock){
        blocks[index] = newBlock;
        if(index == 0)
            blocks[index].setPrevHash(new byte[]{0});
        else
            //blocks[index].hash(blocks[index].getPrevHash());
            blocks[index].setPrevHash(blocks[index - 1].hash(blocks[index - 1].getPrevHash()));

        return index++;
    }

    Block get(int index){
        return blocks[index];
    }

    boolean isAltered(int blockIndex, byte[] expectedHash){
        byte[] hash = get(0).getPrevHash();
        for (int i = 0; i <= blockIndex; i++) {
            hash = get(i).hash(hash);
        }
        return !Arrays.equals(hash, expectedHash);
        }
}

//for(int i = blockIndex; i > 0; i--){
//            //expected hash je hash samo jednog bloka na blockIndexu
//            if(Arrays.equals(expectedHash, blocks[i].hash(blocks[i].getPrevHash())))
//                return false;
//            expectedHash = blocks[i].getPrevHash();