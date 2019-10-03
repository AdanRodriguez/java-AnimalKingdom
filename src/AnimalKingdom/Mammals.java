package AnimalKingdom;

public class Mammals extends AbstractAnimals
{
    //constructor
    public Mammals(String name, int year)
    {
        super(name, year);
    }

    //methods
    @Override
    public String getPath()
    {
        return "walks";
    }

    @Override
    public String getBreathe()
    {
        return "lungs";
    }

    @Override
    public String getReproduce()
    {
        return "live births";
    }

    @Override
    public String toString()
    {
        return "Mammals{" + 
                "Name='" + name + '\'' +
                ", Year =" + year + '}';
    }
}