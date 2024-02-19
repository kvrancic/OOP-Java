package hr.fer.oop.labosi.samostalnilabos4.javaprojectfilevisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.LinkedHashMap;
import java.util.Map;

public class JavaProjectFileVisitor extends SimpleFileVisitor<Path> {
   private Map<String, Long> fileExtensionSizes = new LinkedHashMap<>();

    public Map<String, Long> getProjectFileSizeInfo(){
        return fileExtensionSizes;
    }


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(attrs.isDirectory()) return FileVisitResult.CONTINUE;

        String filename = file.getFileName().toString();
        String fileExtension = filename.substring(filename.lastIndexOf("."));

        if(!fileExtensionSizes.containsKey(fileExtension))
            fileExtensionSizes.put(fileExtension, 0L);

        Long size = fileExtensionSizes.get(fileExtension);
        size += attrs.size();
        fileExtensionSizes.put(fileExtension, size);

        return FileVisitResult.CONTINUE;
    }
}
