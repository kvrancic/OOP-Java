package hr.fer.oop.labosi.lab4;

/**
 * Sucelje specificira funkcionalnosti vezane uz statisticku obradu bodova studenata.
 *
 */
interface StudentStatistics{
    /**
     *
     * Za studenta biljezi bodove. Mozete pretpostaviti da ce argumenti uvijek biti valjani (nece biti null).
     * Vazno: u praksi je moguce vise puta pozvati ovu metodu za istog studenta.
     * Npr.:
     *  stat.addStudentPoints("Luka", 1, 2);
     *  stat.addStudentPoints("Luka", 10);
     *
     *
     * @param student student za kojeg se biljeze bodovi
     * @param points bodovi studenta
     */
    void addStudentPoints(String student, Integer... points);
    /**
     * @return ukupni broj bodova od svih studenata
     */
    Integer getTotalPoints();
    /**
     * @return vraca broj zabiljezenih studenata
     */
    Integer getStudentSize();

    /**
     *
     * Za studenta vraca broj bodova. Ako ne postoji zapis studenta ova metoda vraca null
     *
     * @param student
     * @return
     */
    Integer getTotalPointsForStudent(String student);

}
