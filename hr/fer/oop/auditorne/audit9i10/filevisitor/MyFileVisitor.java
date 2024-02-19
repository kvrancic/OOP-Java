package hr.fer.oop.auditorne.audit9i10.filevisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.TreeSet;

public class MyFileVisitor extends SimpleFileVisitor<Path> {
    private List<String> extensions;
    private long sum;
    private TreeSet<Item> topTen;

    public MyFileVisitor(List<String> extensions) {
        this.extensions = extensions;
        topTen = new TreeSet<>();
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        for(String ex : extensions)
        {
            if(file.toString().endsWith(ex)){
                long fileSize = attrs.size();
                sum += fileSize;
                topTen.add(new Item(file, fileSize));
                if(topTen.size() > 10) topTen.remove(topTen.last()); //makni zadnji da ne trpamo stablo
                break; //ne trebamo gledati druge ekstenzije jer ne moze imati file dvije ekstenzije
            }
        }
        return FileVisitResult.CONTINUE;
    }

    public List<String> getExtensions() {
        return extensions;
    }

    public void setExtensions(List<String> extensions) {
        this.extensions = extensions;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public TreeSet<Item> getTopTen() {
        return topTen;
    }

    public void setTopTen(TreeSet<Item> topTen) {
        this.topTen = topTen;
    }
}
