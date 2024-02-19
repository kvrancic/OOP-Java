package hr.fer.oop.labosi.samostalnilabos4.studentscore;

import java.util.Collection;

/**
 * Sucelje specificira funkcionalnosti vezane uz statisticku obradu bodova studenata. Jedan student moze imati vise bodova
 *
 */
interface StudentScoreStatistics{
    /**
     *
     * Za studenta biljezi bodove. Mozete pretpostaviti da ce argumenti uvijek biti valjani (nece biti null).
     * Vazno: u praksi je moguce vise puta pozvati ovu metodu za istog studenta.
     * Npr.:
     *  stat.addStudentScores("Luka", 4, 1, 2);
     *  stat.addStudentScores("Luka", 1, 4);
     *
     *
     * @param student student za kojeg se biljeze bodovi
     * @param scores bodovi studenta
     */
    void addStudentScores(String student, Integer... scores);

    /**
     * @return Vraca kolekciju zabiljezenih studenata prema redoslijedu dodavanja. Vraca praznu kolekciju ako nema zabiljezenih studenata.
     */
    Collection<String> getInsertionOrderedStudents();

    /**
     *
     * @param student
     * @return vraca bodove za studenta, sortirane prema prirodnom poretku. Ako nema studenta metoda vraca null.
     */
    Collection<Integer> getNaturallySortedPointsForStudent(String student);

}