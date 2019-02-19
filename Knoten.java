import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

/**
 *  Knoten
 */
public class Knoten extends Baumelement
{

    // Attribute
    private Baumelement naechsterLinks;
    private Baumelement naechsterRechts;

    private KnotenFX knoten;
    private int x,y; //Koordinaten des Knotens
    private int knotenBreite = 70;
    private int knotenHoehe = 30;
    private int abstandY = 10;

    private Person inhalt;

    // Konstruktor
    public Knoten(Person inhalt_)
    {
        inhalt = inhalt_;
    }

    // Methoden
    
    public Person suche(Person p)
    {
        if (inhalt.istGleich(p))
        {
            return inhalt;
        }
        else
        {
            if (inhalt.istKleiner(p))
            {
                return naechsterRechts.suche(p);
            }
            else
            {
                return naechsterLinks.suche(p);
            }
        }
    }
        
        
        
        
    public Baumelement naechsterLinksGeben()
    {
        return naechsterLinks;
    }

    public Baumelement naechsterRechtsGeben()
    {
        return naechsterRechts;
    }

    
    public void naechsterLinksSetzen(Baumelement naechsterLinks_)
    {
        naechsterLinks = naechsterLinks_;
    }
    
     public void naechsterRechtsSetzen(Baumelement naechsterRechts_)
    {
        naechsterRechts = naechsterRechts_;
    }
    
        
    public Person inhaltGeben()
    {
        return inhalt;
    }

    // Rekursive Methoden
    
    public Baumelement einfuegen(Person person)
    {
        if (inhalt.istKleiner(person))
        {
            naechsterRechts = naechsterRechts.einfuegen(person);
        }
        else
        {
            naechsterLinks = naechsterLinks.einfuegen(person);
        }
        return this;
    }

    
    /*
     * Methoden zum Zeichnen des Baumes
     */
    public void zeichnen(int xA, int yA, Pane p)
    {
        // xA und yA sind die Koordinaten des Elternknotens und werden zum Zeichnen der Linie verwendet!
        naechsterLinks.zeichnen(x,y,p);
        naechsterRechts.zeichnen(x,y,p);

        // Zeichnet die Linie aber nicht für den Wurzelknoten!
        if (yA != 0)
        {
            Line line= new Line(x+knotenBreite/2,y+ knotenHoehe/2,xA+knotenBreite/2,yA+knotenHoehe/2);
            p.getChildren().add(line);
        }
        // Zeichnet den Knoten
        knoten = new KnotenFX(inhalt.datenwertGeben(), knotenBreite, knotenHoehe);
        knoten.setLayoutX(x);
        knoten.setLayoutY(y);
        p.getChildren().add(knoten);

    }

    public int breiteGeben()
    {
        return knotenBreite + naechsterLinks.breiteGeben() + naechsterRechts.breiteGeben();
    }

    public void xSetzen(int x_alt)
    {
        int breiteLinks = naechsterLinks.breiteGeben();
        x = x_alt + breiteLinks;
        naechsterLinks.xSetzen(x_alt);
        naechsterRechts.xSetzen(breiteLinks + knotenBreite + x_alt);
    }

    public void ySetzen(int y_alt)
    {
        y = y_alt;
        naechsterLinks.ySetzen(y + knotenHoehe + abstandY);
        naechsterRechts.ySetzen(y + knotenHoehe + abstandY);
    }

}
