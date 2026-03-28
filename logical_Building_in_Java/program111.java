//Input : 4 4
/*
    
    * 
    * * 
    * * *        
    * * * *


*/

import java.util.*;

class Pattern
{
    public void Diplay(int iRow, int iCol)
    {
        int i = 0, j = 0;

        if(iRow != iCol) //Filter
        {
            System.out.println("Invalid input");
            return;
        }

        for(i = 1; i<= iRow; i++)
        {
           for(j = 1;j <= i ; j++) // n < nsquare
            {   
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}

class program111
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter number of Row: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of Columns: ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Diplay(iValue1,iValue2);
    }
}