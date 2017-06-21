public class bubble_sort extends array_creator
{
    static long bubble_old,bubble_new;
    public static void bubble_sorting()
    {
        long temp;
        System.out.println("Bubble Sorting Block");
        System.out.println("Calculating current time of the system");
        bubble_old=System.currentTimeMillis();
        System.out.println("Time calculated successfully");
        System.out.println("Starting Bubble Sorting Process.......");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)                
            {
                if(bubble[j]>bubble[j+1])
                {
                    temp=bubble[j+1];
                    bubble[j+1]=bubble[j];
                    bubble[j]=temp;
                }
            }
        }
        System.out.println("Bubble Sorting Process Completed!!");
        System.out.println("Calculating current time of the system");
        bubble_new=System.currentTimeMillis();
        System.out.println("Time calculated successfully");
        System.out.println("Exiting Bubble Sorting.");
        System.out.println();
    }
}
