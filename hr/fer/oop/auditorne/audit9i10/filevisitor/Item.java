package hr.fer.oop.auditorne.audit9i10.filevisitor;

import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;

public class Item implements Comparable<Item>{
    private Path path;
    private long size;

    public Item(Path path, long size) {
        this.path = path;
        this.size = size;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }


    @Override
    public int compareTo(@NotNull Item o) {
        return Long.compare(o.size, this.size); //poredak je KLJUCAN
    }
}
