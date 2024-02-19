/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.fer.oop.homework_13.e07;

import hr.fer.oop.homework_13.e05.PollingResults;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author Krešimir Pripužić <kresimir.pripuzic@fer.hr>
 */
public class Main {

    public static void main(String[] args) throws IOException, BiffException {

                       //save zip from url
//        String url = "https://www.izbori.hr/lokalni2021/rezultati/1/zip/ZUP_21.zip";
        String file = "ZUP_21.zip";
//        try ( InputStream is = new BufferedInputStream(new URL(url).openStream())) {
            //one line solution to copy Inputstream contents to file
//            Files.copy(is, Path.of(file), StandardCopyOption.REPLACE_EXISTING);

            //multi-line solution to copy Inputstream contents to file
//            try ( BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("ZUP_21.zip"))) {
//                byte[] buffer = new byte[1024];
//                int bytesRead;
//                while ((bytesRead = is.read(buffer, 0, 1024)) != -1) {
//                    output.write(buffer, 0, bytesRead);
//                }
//            }
//        }

        //get workbook from zip
        try ( ZipFile zipFile = new ZipFile(file)) {
            //get the first entry in zip
            ZipEntry zipEntry = zipFile.stream().findFirst().get();
            
            //open the first entry in zip
            try ( InputStream is = zipFile.getInputStream(zipEntry)) {
                //open the workbook 
                Workbook workbook = Workbook.getWorkbook(is);
                
                //do something with the workbook
                //System.out.println(Arrays.toString(workbook.getSheetNames()));
                PollingResults pollingResults = new PollingResults(workbook);

                //print top-10 polling stations for a candidate
//                System.out.println("\nTop-10 polling stations for a candidate: ");
//                pollingResults.
//                        getMayorResults().
//                        entrySet().
//                        stream().
//                        map(entry -> new SimpleEntry<>(entry.getKey(), entry.getValue().get("ANKA MRAK-TARITAŠ"))).
//                        sorted(Comparator.comparing(Entry<PollingStation, Integer>::getValue).reversed()).
//                        limit(10).
//                        forEach(entry -> System.out.format("%nPollingStation{%d}=%d",
//                        entry.getKey().getId(), entry.getValue()));
                
                //print max percentages for a polling station
                System.out.println("\nMax percentage for a candidate: ");
                pollingResults.
                        getMayorResults().
                        entrySet().
                        stream().
                        flatMap(entry -> {
                            //calculate number of votes for a polling station
                            int sum = entry.getValue().values().stream().mapToInt(Integer::intValue).sum();
                            return entry.getValue().entrySet().stream().map(candidateEntry -> new SimpleEntry<>(candidateEntry.getKey(), candidateEntry.getValue() / (double) sum));
                        }).
                        collect(Collectors.toMap(Entry::getKey, Entry::getValue, Double::max)).
                        forEach((k, v) -> System.out.printf("%s %.2f%n", k, v));
            }
        }
    }
}
