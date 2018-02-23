public class Angestellte
{
    String name;
    String adresse;
    String beruf;
    Mensch m;

    public Angestellte(int alter, String name, String adresse){
        m = new Mensch(alter, name, adresse);
        System.out.println("neuer Angestellter: " + alter + " " + name + " " + adresse);
    }

    public String gibName()
    {
        return name;
    }

    public String gibAnschrift()
    {
        System.out.println(name + "\n" + adresse);
        return name + ", " + adresse;
    }

    public String gibBeruf()
    {
        return beruf;
    }

}
