import javafx.scene.layout.Pane;
/**
 *  Binärbaum
 */
public class Binaerbaum
{
    // Attribute
    private Baumelement wurzel;

    // Konstruktor
    public Binaerbaum()
    {
        // Am Anfang war der leere Baum!
        wurzel = new Abschluss();
    }

    // Methoden
    public void einfuegen(Person person)
    {
          wurzel = wurzel.einfuegen(person);
    }

    public Person suche(Person p)
    {
        return wurzel.suche(p);
    }
        
    
    /* Methoden zum Zeichnen des Baumes
     * 
     */
    public void zeichnen(Pane ausgabePane)
    {
        wurzel.xSetzen(0);
        wurzel.ySetzen(30);
        ausgabePane.getChildren().clear();
        wurzel.zeichnen(breiteGeben()/2,0,ausgabePane);
    }
    
       public int breiteGeben()
    {
        return wurzel.breiteGeben();
    }

}
