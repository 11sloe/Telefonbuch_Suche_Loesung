import javafx.scene.layout.Pane;
/**
 * Abstrakte Klasse Baumelement
 */
public abstract class Baumelement
{
    // Attribute keine!

    // nur abstrakte Methoden
    public abstract Baumelement naechsterLinksGeben();

    public abstract Baumelement naechsterRechtsGeben();

    public abstract Person inhaltGeben();

    //rekursive Methoden
    public abstract Baumelement einfuegen(Person person);
    public abstract Person suche(Person p);

    /* 
     * Zum Zeichnen des Baumes
     */

    public abstract int breiteGeben();

    public abstract void xSetzen(int x_alt);

    public abstract void ySetzen(int y_alt);

    public abstract void zeichnen(int x, int y,Pane pane);
}
