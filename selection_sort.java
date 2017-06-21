public class selection_sort extends bubble_sort
{
    static long select_time_old,select_time_new;
    public static void selection_sorting()
    {
        long temp;
        int min;
        System.out.println("Selection Sorting Block");
        System.out.println("Calculating current time of the system");
        select_time_old=System.currentTimeMillis();
        System.out.println("Time calculated successfully");
        System.out.println("Starting Selection Sorting Process.......");
        for(int i=0;i<n;i++)
        {
            min=i;
            for(int j=i+1;j<n;j++)
            {
                if(selection[min]>selection[j])
                    min=j;
            }
            temp=selection[i];
            selection[i]=selection[min];
            selection[min]=temp;
        }
        System.out.println("Sorting Process Completed!!");
        System.out.println("Calculating current time of the system");
        select_time_new=System.currentTimeMillis();
        System.out.println("Time calculated successfully");
        System.out.println("Exiting Selection Sorting Process");
        System.out.println();
    }
}
