package hr.fer.oop.labosi.samostalnilabos4.cjepivo;

import java.util.List;

public class Record {
    private String username;
    private int id;
    private Vaccine vaccine;
    private List<SideEffect> sideEffects;

    public Record(String username, int id, Vaccine vaccine, List<SideEffect> sideEffects) {
        this.username = username;
        this.id = id;
        this.vaccine = vaccine;
        this.sideEffects = sideEffects;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public List<SideEffect> getSideEffects() {
        return sideEffects;
    }
}
