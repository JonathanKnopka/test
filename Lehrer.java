import java.util.ArrayList;

public class Lehrer
{
    ArrayList fächer = new ArrayList();
    int stundenAnzahl;
    String funktionsstelle;
    boolean istReferendar;
    Mensch m;
    
    public Lehrer(int alter, String name, String adresse) {
        m = new Mensch(alter, name, adresse);
        System.out.println("neuer Lehrer: " + alter + " " + name + " " + adresse);
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
    
    public ArrayList gibFächer()
    {
        return fächer;
    }
    
    public void befördere(String neueFunktion) {
        funktionsstelle = neueFunktion;
    }
    
}
