package hr.fer.oop.auditorne.audit9i10.anteaVisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyFileVisitor<Path> extends SimpleFileVisitor<Path> {
     private Path put;
     private List<String> extensions;
     private int size;
     private Map<String, Long> sizeMap;

    public MyFileVisitor(Path put, List<String> extensions) {
        this.put = put;
        this.extensions = extensions;
        Map<String, Long> sizeMap = new HashMap<>();
        int size = 0;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        for(String extension : extensions){
            if(file.toString().endsWith(extension)){
                size += attrs.size();
                sizeMap.put(file.toString(), attrs.size());
                break;
            }
        }
        return FileVisitResult.CONTINUE;
    }

    public static Map<String, Long> getTopTen{

    }
}
