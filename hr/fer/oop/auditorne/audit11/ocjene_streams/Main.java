package hr.fer.oop.auditorne.audit11.ocjene_streams;

import hr.fer.oop.auditorne.audit11.ocjene_streams.Loader;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Map<String, Map<String, Integer>> gradeMaps = Loader.loadData();
        System.out.println("Average grade: " + getAverageGrade(gradeMaps));
        increaseGrades(gradeMaps, "arts");
        System.out.println("Average grade: " + getAverageGrade(gradeMaps));
    }

    private static void increaseGrades(Map<String, Map<String, Integer>> gradeMaps, String subject) {
        Map<String, Integer> stringIntegerMap = gradeMaps.get(subject);
        for(String name : stringIntegerMap.keySet()){
            stringIntegerMap.compute(name, (key, value) -> value < 5 ? value + 1 : value);
        }
    }


    public static double getAverageGrade(Map<String, Map<String, Integer>> inputMap){
        return inputMap.values().stream(). //imamo stream mapa
                flatMap(input -> input.values().stream()) //imamo stream Integera
                .mapToInt(Integer::intValue).average().getAsDouble();
    }

    public static Map<String, Double> getAverageCourseGrade(Map<String, Map<String, Integer>> inputMap){
         return inputMap.entrySet().stream().map(courseNameGradeMap -> new AbstractMap.SimpleEntry<>(courseNameGradeMap.getKey(),
                 courseNameGradeMap.getValue()
                         .values()
                         .stream()
                         .mapToInt(Integer::intValue)
                         .average()
                         .getAsDouble()
                 )).collect(Collectors.toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue));
    }


    public static Map<String, Double> getAverageStudentGrade(Map<String, Map<String, Integer>> inputMap){
        Map<String, List<Integer>> nameGradesMap = new HashMap<>();

        inputMap.values().stream()
                        .flatMap(nameGradeMap -> nameGradeMap.entrySet().stream())
                        .forEach(nameGradePair -> nameGradesMap.merge(nameGradePair.getKey(),
                                new LinkedList<> (Arrays.asList(nameGradePair.getValue())),
                                (oldGradeList, passedGradeList) -> {oldGradeList.addAll(passedGradeList);
                                        return oldGradeList;
                        }
                                ));

        return nameGradesMap.entrySet().stream().map(nameGradeList -> new AbstractMap.SimpleEntry<>(nameGradeList.getKey(),
                nameGradeList.getValue().stream().mapToInt(Integer::intValue).average().getAsDouble())).
                collect(Collectors.toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue));

    }

}
