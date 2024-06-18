class D 
{
    public void show()
    {
        System.out.println("In D show...");
    }

    public void config()
    {
        System.out.println("In D config...");
    }
}

class E extends D
{
    // Method Overriding
    public void show()
    {
        System.out.println("In E show...");
    }
}

class MethodOverriding {
   public static void main(String a[])
   {
        E e = new E();
        e.show();
        e.config();
   } 
}
