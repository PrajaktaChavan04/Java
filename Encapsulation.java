class Human
{
    private int age; //accesible in same class only.
    private String name; //accesible in same class only.

    // Constructor
    // Constructor never returns anything.
    // Default Constructor
    public Human()
    {
        age = 12;
        name = "John";
    }

    // Parametrized Constructor
    public Human(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }
}

class Encapsulation {
    public static void main(String a[])
    {
        Human h = new Human();
        // h.name = "Prajakta"; //not accessible here
        // h.age = 21; //not accessible here

        System.out.println(h.getName() + ": " + h.getAge());

        h.setName("Prajakta Chavan");
        h.setAge(21);
        System.out.println(h.getName() + ": " + h.getAge());

        Human h1 = new Human(18, "Sayali");
        System.out.println(h1.getName() + ": " + h1.getAge());

    }
}
