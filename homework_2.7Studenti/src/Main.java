public class Main {
    public static void main(String[] args) {
        Curs curs = new Curs();

        // Înscriem studenți
        curs.inscrieStudent(new Student("Dani"));
        curs.inscrieStudent(new Student("Ionel"));
        curs.inscrieStudent(new Student("Marian"));

        // Simulăm 3 apeluri la prezenta()
        curs.prezenta();
        curs.prezenta();
        curs.prezenta();
    }
}
