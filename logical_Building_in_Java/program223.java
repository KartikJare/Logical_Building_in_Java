import java.util.Scanner;

class NNumberX
{
    private int Arr[]; //private

    public NNumberX(int iSize)
    {
        System.out.println("Allocating the resource....");
        Arr = new int[iSize];  //Resource Allocation
    }

    protected void finalize()
    {
        Arr = null;
        System.out.println("Deallocating the resource....");
    }

    public void Accept()
    {
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements :");
        for(iCnt = 0;iCnt < this.Arr.length;iCnt++)
        {
            this.Arr[iCnt] = sobj.nextInt();
        }

        sobj = null;
    }

    public void Display()
    {
        int iCnt = 0;

        System.out.println("Elements of the array are :");
        for(iCnt = 0;iCnt < this.Arr.length; iCnt++)
        {
            System.out.println(this.Arr[iCnt]);
        }
    }

    public int CountEven()
    {
        int iCount = 0,iCnt = 0;
        
        for(iCnt = 0; iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] % 2) == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class program223
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of element: ");
        int iSize = sobj.nextInt();

        NNumberX nobj = new NNumberX(iSize);

        nobj.Accept();

        nobj.Display();

        int iRet = 0;
        
        iRet = nobj.CountEven();

        System.out.println("Number of even elements :"+iRet);

        sobj = null;
        
        nobj = null;

        System.gc();

    }
} 