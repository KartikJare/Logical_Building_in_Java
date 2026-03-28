
//_ _ _India_ _ _ _is_ _my_country_ _ _ _
// After trim
// India_ _ _ _is_ _my_country

import java.util.*;

class program523
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String tokens[] = str.split(" ");

        int iMax = 0;
        int MaxIndex = 0;

        for(int i = 0; i <= tokens.length;i++)
        {
            if(tokens[i].length() > iMax)
            {
                iMax = tokens[i].length();
                MaxIndex = i;
            }

            System.out.println("Largest word is : "+tokens[MaxIndex]+" having lenght "+iMax);
        }
    }
}