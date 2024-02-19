package hr.fer.oop.labosi.samostalnilabos4.antealabos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Avengers {
    List<Superhero> superheroList;

    void addSuperhero(Superhero superhero){
        if(superheroList == null)
            superheroList = new LinkedList<>();
        superheroList.add(superhero);
    }

    List<Superhero> getAvengersByAlias(){
        List<Superhero> sortedAliasList = new ArrayList<>(superheroList);
        Collections.sort(sortedAliasList);
        return sortedAliasList;
    }

    List<Superhero> getAvengersBySupervillain(String supervillain){
        List<Superhero> heroesFightingSuperVillain = new ArrayList<>();
        for(Superhero hero : superheroList)
            if (hero.getSupervillains().contains(supervillain)) heroesFightingSuperVillain.add(hero);
        return heroesFightingSuperVillain;
    }
}
