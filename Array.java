class Student
{
    int rollno; 
    String name;
    int marks;
}

class Array {
    public static void main(String a[])
    {
        int nums[] = {3, 7, 2, 4};
        nums[1] = 6;
        System.out.println(nums[1]);

        int nums1[] = new int[4];
        nums1[0] = 4;
        nums1[1] = 8;
        nums1[2] = 3;
        nums1[3] = 9;
        for(int i = 0; i < 4; i++)
        {
            System.out.println(nums1[i]);
        }

        int nums2[][] = new int[3][4];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                nums2[i][j] = (int)(Math.random() * 100);
            }
        }

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print(nums2[i][j] + " ");
            }
            System.out.println();
        }

        // Enhanced for Loop
        for(int n[]: nums2)
        {
            for(int m: n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // Jagged Array
        System.out.println();
        System.out.println("Jagged Array");
        int nums3[][] = new int[3][];
        nums3[0] = new int[3];
        nums3[1] = new int[4];
        nums3[2] = new int[2];

        for(int i = 0; i < nums3.length; i++)
        {
            for(int j= 0; j < nums3[i].length; j++)
            {
                nums3[i][j] = (int)(Math.random() * 100);
            }
        }
        for(int n[]: nums3)
        {
            for(int m: n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // Array of objects
        Student s1 = new Student();
        s1.rollno = 18;
        s1.name = "Prajakta";
        s1.marks = 100;
        
        Student s2 = new Student();
        s2.rollno = 24;
        s2.name = "Karuna";
        s2.marks = 100;

        Student s3 = new Student();
        s3.rollno = 80;
        s3.name = "Arya";
        s3.marks = 100;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i < students.length; i++)
        {
            System.out.println(students[i].name + ": " + students[i].marks);
        }

        for(Student s: students)
        {
            System.out.println(s.name + ": " + s.marks);
        }
    }
}