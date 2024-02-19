package hr.fer.oop.auditorne.audit11.rendgen;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        List<PopulationSample> list = PopulationDataLoader.loadData("data.csv");

        int min = list.stream().
                mapToInt(PopulationSample::getAge).
                min().getAsInt();

        long noOfWomen = list.stream().
                filter(person -> Objects.equals(person.getGender(), "F")).count();

        PopulationSample oldestSample = list.stream().max(Comparator.comparingInt(PopulationSample::getAge)).get();


    }
}
