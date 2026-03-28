
//_ _ _India_ _ _ _is_ _my_country_ _ _ _
// After trim
// India_ _ _ _is_ _my_country

import java.util.*;

class program518
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+"," "); //regular express one or more (+atleast one)

        char Arr[] = str.toCharArray();
        int iCount = 0, i = 0;

        for(i = 0;i < Arr.length;i++)
        {
            if(Arr[i] == ' ')
            {
                iCount++;
            }
        }

        System.out.println("Number os words are : "+(iCount+1));
    }
}