package hr.fer.oop.labosi.samostalnilabos4.file_editor;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileEditor {
    public static void processFile(Path inputFile, Path outputFile) throws IOException
    {
        BufferedWriter izlaz = Files.newBufferedWriter(outputFile, StandardCharsets.UTF_8);
        BufferedReader ulaz = Files.newBufferedReader(inputFile, StandardCharsets.UTF_8);
        String s;
        while((s = ulaz.readLine()) != null)
            izlaz.write(s + "\n");
        izlaz.close();
        ulaz.close();
    }
}
