package AnimalKingdom;

public class Birds extends AbstractAnimals
{
    //constructor
    public Birds(String name, int year)
    {
        super(name, year);
    }

    //methods
    @Override
    public String getPath()
    {
        return "flies";
    }

    @Override
    public String getBreathe()
    {
        return "lungs";
    }

    @Override
    public String getReproduce()
    {
        return "eggs";
    }

    @Override
    public String toString()
    {
        return "Birds{" + 
                "Name='" + name + '\'' +
                ", Year =" + year + '}';
    }
}