import tools.ScientificCalc;
import tools.*;

class Demo extends AccessModifiers
{
    public void abc()
    {
        System.out.println(marks1);
    }
}

class Inheritance {
    public static void main(String a[])
    {
        ScientificCalc c = new ScientificCalc();
        int r1 = c.add(4, 5);
        int r2 = c.subtract(7, 3);
        int r3 = c.multiply(3, 2);
        int r4 = c.divide(4, 2);
        double r5 = c.power(2, 4);

        System.out.println("Sum: " + r1 + " Difference: " + r2 + " Product: " + r3 + " Divison: " + r4 + " Power: " + r5);

        AccessModifiers obj = new AccessModifiers();
        // System.out.println(obj.marks); -> error because this file is outside tools package and marks variable is private
        obj.show();

        Hello obj1 = new Hello();
        System.out.println(obj1.marks); //Same package
    }
}
