/*Java is an Object Oriented Programming(OOP) Language.
Class - Blueprint of object
Objects - Properties and Behaviour*/

class Calculator
{
    int a;

    public int add(int num1, int num2)
    {
        int res = num1 + num2;
        return res;
    }
}

class ClassAndObjects {
    public static void main(String a[])
    {
        int num1 = 4, num2 = 5;
        // int result = num1 + num2;
        // System.out.println(result);
        Calculator  calc = new Calculator();
        // int result = calc.add(4, 3);
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}
