package hr.fer.oop.labosi.samostalnilabos4.labtaskradnici;

import java.util.*;

public class LabTask {
    public static Map<Integer, Set<String>> underpayed(Map<String, Map<Integer, List<Integer>>> salaries) {
        Map<String, Map<Integer, Integer>> averageSalaryMap = new HashMap<>();
        Set<Integer> years = new HashSet<>();

        //racunanje prosjecne place po radniku
        for(String id : salaries.keySet()){
            Map<Integer, List<Integer>> salaryByYear = salaries.get(id);

            Map<Integer, Integer> yearlyAverages = new HashMap<>();
            for(Integer year : salaryByYear.keySet()){
                years.add(year);

                int avgSalary = 0;
                for(Integer pay : salaryByYear.get(year)){
                    avgSalary += pay;
                }
                avgSalary /= 12;
                yearlyAverages.put(year, avgSalary);
            }
            averageSalaryMap.put(id, yearlyAverages);
        }

        //racunanje siromasnih radnika
        Map<Integer, Set<String>> poorWorkers = new HashMap<>();
        for(Integer year : years){
            int yearTotal = 0;
            int yearWorkerCount = 0;

            for(Map<Integer, Integer> averageSalary : averageSalaryMap.values())
            {
                if(!averageSalary.containsKey(year))
                    continue;
                yearTotal += averageSalary.get(year);
                yearWorkerCount++;
            }

            double threshold = (double) yearTotal / yearWorkerCount * 7;

            for(String id : averageSalaryMap.keySet()){
                if(!averageSalaryMap.get(id).containsKey(year)) continue;
                if(averageSalaryMap.get(id).get(year) < threshold){
                    if(!poorWorkers.containsKey(year))
                        poorWorkers.put(year, new HashSet<>());
                    poorWorkers.get(year).add(id);
                }

            }
        }
        return null;
    }
}

    /*    Map<Integer, Set<String>> map = new HashMap<>();
        for(Map<Integer, List<Integer>> yearMap : salaries.values()){
            for(Integer year : yearMap.keySet()) {
                map.put(year, new HashSet<>());
                for (List<Integer> yearList : yearMap.values()) {
                    int totalSalary = 0;
                    int averageSalary;
                    for (Integer salary : yearList) {
                        totalSalary += salary;
                    }
                    averageSalary = totalSalary / yearList.size();
                    for (Integer salary : yearList) {
                        if (salary < 0.7 * averageSalary)
                            map.get(year).add(salaries.)
                    }
                }
            }
        }*/
