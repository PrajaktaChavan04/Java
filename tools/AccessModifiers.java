package tools;

public class AccessModifiers {
    private int marks = 6; //Private variables are accessed within same class only.
    protected int marks1 = 5; //can be accessed outside the package but within subclass only

    public void show()
    {
        System.out.println(marks);
    }
}

/* 
                                    Private     Protected      Public       Default 

Same class                          Yes         Yes            Yes          Yes

Same package subclass               No          Yes            Yes          Yes

Same package non-subclass           No          Yes            Yes          Yes

Different package subclass          No          Yes            Yes          No

Different package non-subclass      No          No             Yes          No 

*/