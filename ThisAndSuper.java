class A //Every class in Java extends Object class.
{
    public A()
    {
        System.out.println("In A...");
    }
    public A(int n)
    {
        System.out.println("In A int...");
    }
}

class B extends A
{
    public B()
    {
        // In every constructor, there is super() method at first by default.
        super();
        System.out.println("In B...");
    }

    public B(int n)
    {
        this(); //Executes constructor of same class.
        System.out.println("In B int...");
    }
}

class ThisAndSuper {
    public static void main(String a[])
    {
        B b = new B(5);
        System.out.println(b);

        new B(); //Anonymous Object
    }
}
