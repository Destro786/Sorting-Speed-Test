public class insertion_sort extends selection_sort
{
    static long insert_time_old,insert_time_new;
    public static void insertion_sorting()
    {
        long temp;
        int x;
        System.out.println("Insertion Sorting Block");
        System.out.println("Calculating current time of the system");
        insert_time_old=System.currentTimeMillis();
        System.out.println("Time calculated successfully");
        System.out.println("Starting Insertion Sorting Process.......");
        for(int i=1;i<n;i++)
        {
            temp=insertion[i];
            x=i;
            while(x>0 && insertion[x-1]>=temp)
            {
                insertion[x]=insertion[x-1];
                --x;
            }
            insertion[x]=temp;
        }
        System.out.println("Sorting Process Completed!!");
        System.out.println("Calculating current time of the system");
        insert_time_new=System.currentTimeMillis();
        System.out.println("Time calculated successfully");
        System.out.println("Exiting Insertion Sorting Process");
        System.out.println();
    }
}