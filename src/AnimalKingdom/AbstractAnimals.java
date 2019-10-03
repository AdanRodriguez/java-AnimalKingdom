package AnimalKingdom;

public abstract class AbstractAnimals
{
    //fields
    protected static int maxId = 0;
    protected int id;
    // protected int food;
    protected String name;
    protected int year;

    //constructor
    public AbstractAnimals(String name, int year)
    {
        maxId++;
        id = maxId;
        // this.food = food;
        this.name = name;
        this.year = year;
    }


    // get and set

    // public int getFood()
    // {
    //     return food;
    // }

    // public void setFood()
    // {
    //     this.food = food;
    // }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    //abstract methods for children to implement
    public abstract String getPath();
    public abstract String getBreathe();
    public abstract String getReproduce();

    

}