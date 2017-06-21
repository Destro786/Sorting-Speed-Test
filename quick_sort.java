public class quick_sort extends insertion_sort
{
    static long quick_time_old,quick_time_new;
    public static void quickSort(int lowerIndex, int higherIndex) 
    {
        int i = lowerIndex;
        int j = higherIndex;
        long pivot = quick[lowerIndex+(higherIndex-lowerIndex)/2];
        while(i<=j) 
        {
            while(quick[i]< pivot) 
                i++;
            while (quick[j] > pivot) 
                j--;
            if (i<=j) 
            {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex<j)
            quickSort(lowerIndex,j);
        if (i<higherIndex)
            quickSort(i,higherIndex);
    }

    public static void exchangeNumbers(int i, int j) 
    {
        long temp=quick[i];
        quick[i]=quick[j];
        quick[j]=temp;
    }

    public static void quick_sorting()
    {
        System.out.println("Quick Sorting Block");
        System.out.println("Calculating current time of the system");
        quick_time_old=System.currentTimeMillis();
        System.out.println("Time calculated successfully");
        System.out.println("Starting Quick Sorting Process.......");
        quickSort(0,n-1);
        System.out.println("Sorting Process Completed!!");
        System.out.println("Calculating current time of the system");
        quick_time_new=System.currentTimeMillis();
        System.out.println("Time calculated successfully");;
        System.out.println("Exiting Quick Sorting Process");
        System.out.println();
    }
}