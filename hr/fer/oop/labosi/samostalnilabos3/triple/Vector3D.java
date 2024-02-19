package hr.fer.oop.labosi.samostalnilabos3.triple;

public class Vector3D extends Triple<Number> {

    public Vector3D(Number first, Number second, Number third) {
        super(first, second, third);
    }

    public static double dotProduct(Vector3D firstVector, Vector3D secondVector)
    {
        return (double) firstVector.getFirst() * (double) secondVector.getFirst() +
                (double) firstVector.getSecond() * (double) secondVector.getSecond() +
                (double) firstVector.getThird() * (double) secondVector.getThird();
    }
}
