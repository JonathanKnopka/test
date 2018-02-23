import java.util.ArrayList;


public class Schüler
{
    String klasse;
    ArrayList kurse = new ArrayList();
    Mensch m;

    public Schüler(int alter, String name, String adresse) {
        m = new Mensch(alter, name, adresse);
        System.out.println("neuer Schüler: " + alter + " " + name + " " + adresse);
    }
    
    public int gibAlter()
    {
        return m.alter;
    }
    
    public String gibName()
    {
        return m.name;
    }
    
    public String gibAnschrift()
    {
        System.out.println(m.name + "\n" + m.adresse);
        return m.name + ", " + m.adresse;
    }
    
    public void versetztWerden() {
        // Der nächsthöheren Klasse zuordnen, z.B. von 8b zu 9b
    }
    
    public void druckeZeugnis() {
        // Das Zeugnis für diesen Schüler drucken
    }
    
    // Für Oberstufenschüler 
    public void kursZuweisen(String kursName) {
        kurse.add(kursName);
        System.out.println("Der Kurs "+kursName+" wurde hinzugefügt.");
    }
}
