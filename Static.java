class Mobile
{
    String brand; //instance variable
    int price; //instance variable
    static String name; //Making common to all objects. So it is a class member common to all objects and not an object member.

    public Mobile()
    {
        brand = "";
        price = 200;
        System.out.println("In constructor...");
    }

    // static block
    static
    {
        name = "Phone";
        System.out.println("In static block...");
    }
    // Static block is used to initialize the static variables. Static block is executed only once irresepctive of the number of objects created.
    // Static block is always called first irrespective of its position in the code. Because first class loads and the objects are instantiated.
    // If objects are not created, static block does not execute.It means that if objects are not created, class does not load.

    // Instance Method 
    // The object needs to created to call instance method.
    public void show()
    {
        System.out.println(brand + ": " + price + ": " + name); // In non-static method, the static variables can be used. There is no harm.
    }

    // Static Method
    // Static method can be called using class name instead of creating objects.
  /*public static void show1()
    {
        System.out.println("In static method...");
        // System.out.println(brand + ": " + price + ": " + name); //Gives error: Staic variables can be used in static method but non-static variables can not be used in staic method. 
    } */  
    public static void show1(Mobile m)
    {
        System.out.println("In static method...");
        System.out.println(m.brand + ": " + m.price + ": " + name); //As we have mentioned a specific object, it won't give error. It knows which object should be accessed for brand and price.
    }
}

class Static {

    // main() method is static because if it will not be static, we have to create object of "Static" i.e. the <filename> class first. But as main() method is starting point of execution it will not be possible.
    public static void main(String a[]) 
    {
        // Class.forName("Mobile"); //If you want to load class without creating objects.

        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1500;
        Mobile.name = "Smartphone"; //Static variables should be used with their class name and not with the objects. It  can be used with objects but avoid it.

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 1700;
        Mobile.name = "Smartphone"; 

        Mobile m3 = new Mobile();

        m1.show();
        m2.show();
        m3.show();

        Mobile.show1(m1);
    }
}
