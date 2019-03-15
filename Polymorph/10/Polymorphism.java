public class PolymorphismDemo
{
public static void main(String[] args)
    {
        Person[] people = new Person[4];
        people[0] = new Undergradute("Cotty, Manny", 4910, 1);
        people[1] = new Student("DeBanque, Robin", 8812);
        people[2] = new Faculty("Bugg, June", 9901, "Chemistry", "Professer");
        people[3] = new Staff("Kick, Anita", 9931, "Math", "Best math teacher", 10);
  
        for (Person p : people)
        {
            p.writeOutput();
            System.out.println();
        }
        

    }
}
