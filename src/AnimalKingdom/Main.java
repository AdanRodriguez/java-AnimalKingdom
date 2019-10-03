package AnimalKingdom;

import java.util.*;

public class Main
{
    public static void printAnimals(ArrayList<AbstractAnimals> animals, AnimalCheck tester)
  {
    for (AbstractAnimals a : animals)
    {
      if (tester.test(a))
      {
        System.out.println(a.toString());
      }
    }
  }
    public static void main(String[] args)
    {
        //mammals
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);

        //Birds
        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        //Fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        //Arraylist of all animals
        ArrayList<AbstractAnimals> myList = new ArrayList<AbstractAnimals>();
        myList.add(panda);
        myList.add(zebra);
        myList.add(koala);
        myList.add(sloth);
        myList.add(armadillo);
        myList.add(raccoon);
        myList.add(bigfoot);
        myList.add(pigeon);
        myList.add(peacock);
        myList.add(toucan);
        myList.add(parrot);
        myList.add(swan);
        myList.add(salmon);
        myList.add(catfish);
        myList.add(perch);

        //lambda expressions

        //List all the animals in descending order by year named
        System.out.println("\n***Descending year \n ");
        myList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        myList.forEach(a -> System.out.println(a.toString()));
    
        // List all the animals alphabetically
        System.out.println("\n***Alphabetically \n");
        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        myList.forEach(a -> System.out.println(a.toString()));
    
        // List all the animals order by how they move
        System.out.println("\n***How animals move \n");
        myList.sort((a1, a2) -> a1.getPath().compareToIgnoreCase(a2.getPath()));
        myList.forEach(a -> System.out.println(a.getName() + " " + a.getPath()));
    
        // List only those animals the breathe with lungs
        System.out.println("\n***Animals with lungs \n");
        // printAnimals(myList, a -> a.getBreathe() == "breathes with lungs");
        printAnimals(myList, a -> a.getBreathe().equals("lungs"));
    
        // List only those animals that breathe with lungs and were named in 1758
        System.out.println("\n***Animals with lungs and named in 1758 \n");
        printAnimals(myList, a -> (a.getBreathe() == "lungs" && a.getYear() == 1758));
    
        // List only those animals that lay eggs and breathe with lungs
        System.out.println("\n***Animals that lay eggs and have lungs \n");
        printAnimals(myList, a -> (a.getReproduce() == "eggs" && a.getBreathe() == "lungs"));
    
        // List alphabetically only those animals that were named in 1758
        System.out.println("\n***Animals that were named in 1758 \n");
        printAnimals(myList, a -> a.getYear() == 1758);
    
      









    }
}