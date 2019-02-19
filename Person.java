
/**
 *  Person
 */
public class Person
{
    // Attribute
    private String name;
    private String nummer;

    // Konstruktor

    public Person(String name_, String nummer_)
    {
        name = name_;
        nummer = nummer_;
    }

    // Methoden
    public void datenwertAusgeben()
    {
        System.out.println(name);

    }

    public String datenwertGeben()
    {
        return name+"\n"+nummer;
    }

    public boolean istKleiner(Person person2)
    {

        return name.compareTo(person2.name)<0;
    }

    public boolean istGleich(Person person2)
    {
        return name.compareTo(person2.name) == 0;
    }
}
