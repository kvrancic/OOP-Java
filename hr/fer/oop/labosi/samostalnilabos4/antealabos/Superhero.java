package hr.fer.oop.labosi.samostalnilabos4.antealabos;


import java.util.List;

class Superhero implements Comparable<Superhero> {
    private String name;
    private String alias;
    private List<String> supervillains;

    public Superhero(String name, String alias, List<String> supervillains) {
        this.name = name;
        this.alias = alias;
        this.supervillains = supervillains;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    public List<String> getSupervillains() {
        return supervillains;
    }

    @Override
    public String toString() {
        return alias + " = " + name;
    }


    @Override
    public int compareTo( Superhero o) {
        return alias.compareTo(o.alias);
    }
}
