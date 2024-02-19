package hr.fer.oop.labosi.samostalnilabos4.cjepivo;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class VaccineDatabase {

    List<Record> recordList = new LinkedList<>();
    Map<Vaccine, Integer> sideEffectsMap = new LinkedHashMap<>();

    void addRecordToDatabase(Record record){
        recordList.add(record);
        if(!sideEffectsMap.containsKey(record.getVaccine()))
            sideEffectsMap.put(record.getVaccine(), record.getSideEffects().size());
        else if (record.getSideEffects().size() > sideEffectsMap.get(record.getVaccine()))
            sideEffectsMap.replace(record.getVaccine(), record.getSideEffects().size());
    }

    List<Record> getRecordsByVaccine (Vaccine vac){
        List<Record> specificVaccine = new LinkedList<>();
        for(Record r : recordList)
            if(r.getVaccine() == vac) specificVaccine.add(r);
        return specificVaccine;
    }

    Map<Vaccine, Integer> getNumberOfSideEffects(){
        return sideEffectsMap;
    }

}
