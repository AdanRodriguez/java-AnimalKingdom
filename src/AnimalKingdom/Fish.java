package AnimalKingdom;

public class Fish extends AbstractAnimals
{
    //constructor
    public Fish(String name, int year)
    {
        super(name, year);
    }

    //methods
    @Override
    public String getPath()
    {
        return "swims";
    }

    @Override
    public String getBreathe()
    {
        return "gills";
    }

    @Override
    public String getReproduce()
    {
        return "eggs";
    }

    @Override
    public String toString()
    {
        return "Fish{" + 
                "Name='" + name + '\'' +
                ", Year =" + year + '}';
    }
}