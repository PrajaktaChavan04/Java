class Loops {
    public static void main(String a[])
    {
        // Conditional Statements
        int x = 18;
      /*if(x > 10)
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Bye");
        } */ 
        // x = 28; 
        if(x > 10 && x <= 20)
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Bye");
        }

        int b = 5, c = 7, d = 9;
        if(b > c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }

        if(b > c && b > d)
        {
            System.out.println(b);
        }
        else if(c > b && c > d)
        {
            System.out.println(c);
        }
        else
        {
            System.out.println(d);
        }

        // Ternary Operator
        int n = 4;
        int result = 0;

      /*if(n % 2 == 0)
            result = 10;
        else
            result = 20;
        
        System.out.println(result); */  
        result = n % 2 == 0 ? 10 : 20;
        System.out.println(result);

        // Switch Statement
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid number");
        }

        // Loops - while, do while, for
        int i = 0;
        while(i < 5)
        {
            System.out.println("Hi " + i);
            int j = 0;
            while(j < 3)
            {
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }
        i = 5;
        do{
            System.out.println("Hi " + i);
            i++;
        }while(i < 5);
        for(i = 0; i < 5; i++)
        {
            System.out.println("Hi " + i);
        }
        for(i = 0; i < 5; i++)
        {
            System.out.println("DAY " + (i+1));
            for(int j = 0; j < 9; j++)
            {
                System.out.println("    " + (j+9) + " - " + (j+10));
            }
        }
    }
}
