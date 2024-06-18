// Java Code(.java) -> Java Compiler -> Byte Code(.class) -> JVM(Java Virtual Machine).  JVM is OS dependent and Java is OS independent. JVM is part of JRE(Java Runtime Environment). JRE has various libraries along with JVM. Java Code runs in JRE and JVM is responsible to run it. As a developer you need JDK(Java Development Kit) but to run Java Code JDK is not required. JDK contains JRE and JVM already. Hence Java is said to be WORA(Write Once Run Anywhere).

// First file to be run is the file which contains public static void main(String a[]) method.

class Hello 
{
    int marks = 6; //Default access modifier -> can be accessed in same package
    public static void main(String a[])
    {
        System.out.println("Hello World!");

        // Java is strongly typed language.
        System.out.println(2 + 3);
        int num1 = 3;
        System.out.println(num1);
        int num2 = 5;
        System.out.println(num1 + num2);
        // int sum = num1 + num2;
        // System.out.println(sum);

      /*Integer: 
        int -> 4 bytes
        long -> 8 bytes -> 5854l or 5854L
        short -> 2 bytes 
        byte -> 1 byte Range -> -128 to 127 */

      /*Float:
        float -> 4 bytes -> 5.6f or 5.6F 
        double -> 8 bytes (default) */ 

      /*Character:
        char -> 2 bytes */

      /*Boolean:
        boolean -> always use true and false in Java instead of 1 and 0 */ 
       
        // Literals
        // byte by = 129; -> error: out of range 
      /*byte b = 127;
        short c = 558;
        long d = 5854l;

        float e = 5.8f;
        double f = 5.8;

        char g = 'p';

        boolean h = true; */  

        int i = 0b101; //Binary number
        System.out.println(i); //prints in decimal

        int j = 0x7E; //Hexadecimal number
        System.out.println(j); //prints decimal

        int k = 10_00_00_000; //easy way to count 0s -> put underscore
        System.out.println(k);

        //Type conversion
        double l = 56;
        System.out.println(l);
        double m = 12e10;
        System.out.println(m);

        byte b1 = 10;
        byte b2 = 30;
        // byte result = b1 * b2; -> error 
        int result = b1 * b2; //implicit type conversion
        System.out.println(result);
        
        // Type casting
        byte n = 127;
        int o = 257;
        // n = o; -> error because range of int is higher than range of byte irrespective of the value of int variable.
        n = (byte)o; //Type casting -> o%256. 256 is range of byte.
        System.out.println(n);

        float p = 5.6f;
        int q = (int)p;
        System.out.println(q);

        // Arithmetic Operators
      /*int sum = num1 + num2;
        int difference = num2 - num1;
        int product = num1 * num2;
        int division = num1 / num2;
        int remainder = num1 % num2; */  

        // num1 = num1 + 2;
        // num1 += 2; -> compound operator

        // num1++; -> post-increment -> first fetch the value and then increment.
        // ++num1; -> pre-increment -> first increment and the store the value.
        // num1--; -> post-decrement
        // --num1; -> pre-decrement

        // Comparison Operators
        boolean compare = num1 < num2;
        System.out.println(compare);

        compare = num1 > num2;
        System.out.println(compare);

        compare = num1 <= num2;
        System.out.println(compare);

        compare = num1 >= num2;
        System.out.println(compare);

        compare = num1 == num2;
        System.out.println(compare);

        compare = num1 != num2;
        System.out.println(compare);

        // Logical Operators
        boolean res = (num1 < num2 ) && (num1 > num2);
        System.out.println(res);

        res = (num1 < num2 ) || (num1 > num2);
        System.out.println(res);

        res = !((num1 < num2 ) && (num1 > num2));
        System.out.println(res);
    }
}
