
//_ _ _India_ _ _ _is_ _my_country_ _ _ _
// After trim
// India_ _ _ _is_ _my_country

import java.util.*;

class program517
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+"," "); //regular express one or more (+atleast one)

        System.out.println(str);
    }
}