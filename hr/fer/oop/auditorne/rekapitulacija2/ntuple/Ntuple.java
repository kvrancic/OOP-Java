package hr.fer.oop.auditorne.rekapitulacija2.ntuple;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Ntuple<T extends Comparable<T>> implements Comparable<Ntuple<T>> {
    private List<T> ntuple;
    private int length;

    @SafeVarargs
    public Ntuple(T... arguments) {
        if (arguments.length < 2) throw new IllegalArgumentException();
        ntuple = new LinkedList<>();
        ntuple.addAll(List.of(arguments));
        length = arguments.length;
    }

    public T get(int index) {
        return ntuple.get(index - 1);
    }

    public void set(int index, T element){
        ntuple.set(index - 1, element);
    }

    public int size(){
        return ntuple.size();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ntuple);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Ntuple<?>)) return false;
        Ntuple<?> other = (Ntuple<?>) obj; //NE MOZEMO STAVITI T, MORA ICI UPITNIK
        if(other.size() != ntuple.size()) return false;

        for(int i = 0; i < ntuple.size(); i++){
            if(!ntuple.get(i).equals(other.ntuple.get(i))) return false;
            // POZIVA SE "OBICNI" EQUALS JER ZOVEMO NAD OBJEKTOM KLASE KOJA NIJE NTUPLE
        }
        return true;
        //druga mogucnost: return Objects.equal(ntuple,other.ntuple);
    }

    @Override
    public int compareTo(@NotNull Ntuple<T> o) {
        for(int i = 0; i < Math.min(ntuple.size(), o.ntuple.size()); i++){
            int compare = ntuple.get(i).compareTo(o.ntuple.get(i));
            //old compareTo is used because T implements Comparable, so you can compare it the way T does it
            if(compare != 0)
                return compare;
        }
        return ntuple.size() - o.ntuple.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for(int i = 0; i < ntuple.size(); i++){
            sb.append(ntuple.get(i));
            if(i != ntuple.size() - 1) sb.append(", ");
        }
        sb.append(")");

        return sb.toString();
    }
}
