import java.util.ArrayList;

public class Verwaltung
{
    ArrayList s = new ArrayList();
    ArrayList l = new ArrayList();
    
    public Verwaltung()
    {
        
    }
    
    public void legeOberstufenschülerAn() {
        Schüler schüler = new Schüler(18, "Jonathan Knopka", "Seehofstr.");
        schüler.kursZuweisen("Informatik");
        s.add(schüler);
    }
    
    public void legeLehrerAn() {
        Lehrer lehrer = new Lehrer(25, "Reher", "Berlin");
        lehrer.befördere("Fachbereichsleiter Informatik");
        l.add(lehrer);
    }
}
