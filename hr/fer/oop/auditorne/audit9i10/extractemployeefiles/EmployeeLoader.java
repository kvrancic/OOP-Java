package hr.fer.oop.auditorne.audit9i10.extractemployeefiles;

import hr.fer.oop.auditorne.audit9i10.extractemployeefiles.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;


public class EmployeeLoader {
    public static List<Employee> loadFromFile(String fileName) throws IOException {
        List<Employee> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while((line = br.readLine()) != null){
            String[] parts = line.split(";");
            list.add(new Employee(parts[0], Double.parseDouble(parts[1]),
                    LocalDate.of(Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), Integer.parseInt(parts[4]))));
        }
        return list;
    }
}
