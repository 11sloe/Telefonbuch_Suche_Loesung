import javafx.scene.layout.Pane;
/**
 *  Abschluss
 */
public class Abschluss extends Baumelement
{
    // Attribute

    // Konstruktor
    public Abschluss()
    {

    }

    // Methoden
    
    public Person suche(Person p)
    {
        return null;
    }
    
    public Baumelement naechsterLinksGeben()
    {
        return this;
    }

    public Baumelement naechsterRechtsGeben()
    {
        return this;
    }

    public Person inhaltGeben()
    {
        return null;
    }
    
      public Knoten einfuegen(Person person)
    {
        Knoten neu = new Knoten(person);
        neu.naechsterLinksSetzen(this);
        neu.naechsterRechtsSetzen(new Abschluss());
        return neu;
    }
    
    /*
     * Methoden zum Zeichnen des Baumes
     */

    public int breiteGeben()
    { 
        return 0;
    }

    public void xSetzen(int x)
    {
    }

    public void ySetzen(int y)
    {}

    public void zeichnen(int x, int y, Pane p)
    {}

  

}
