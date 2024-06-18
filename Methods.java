/*class Computer
{
    public void playMusic()
    {
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost)
    {
        if(cost >= 10)
        {
            return "Pen";
        }
        return "Nothing"; 
    }
}*/

class Calculator
{
    // Method Overloading
    public int add(int num1, int num2)
    {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3)
    {
        return num1 + num2 + num3;
    }

    public double add(double num1, int num2)
    {
        return num1 + num2;
    }
}

class Methods {
    public static void main(String a[])
    {
      /*Computer comp = new Computer();
        comp.playMusic();
        String str = comp.getMeAPen(12);
        System.out.println(str); */ 
        
        Calculator calc = new Calculator();
        int r1 = calc.add(3, 4);
        System.out.println(r1);

        int r2 = calc.add(3, 4, 5);
        System.out.println(r2);

        double r3 = calc.add(5.6, 3);
        System.out.println(r3);
    }
}
