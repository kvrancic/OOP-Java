package hr.fer.oop.auditorne.audit11.rendgen;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PopulationDataLoader {

    public static List<PopulationSample> loadData(String fileName) throws IOException {
        List<PopulationSample> list = new ArrayList<>();
        BufferedReader reader = Files.newBufferedReader(Path.of(fileName), StandardCharsets.UTF_8);
        String s;
        while((s = reader.readLine()) != null){
            String temp[] = s.split(";");
            list.add(new PopulationSample(temp[0], temp[1], Integer.parseInt(temp[2])));
        }

        return list;
    }
}
