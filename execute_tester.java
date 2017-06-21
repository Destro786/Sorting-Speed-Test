public class execute_tester extends quick_sort
{
    public static void main(String args[])
    {
        int k=0;
        System.out.println("Welcome to Speed Test");
        accept();
        generate();
        bubble_sorting();
        selection_sorting();
        insertion_sorting();
        quick_sorting();
        for(int i=0;i<n;i++)
        {
            if(bubble[i]==selection[i] && selection[i]==insertion[i] && insertion[i]==quick[i])
                continue;
            else
            {
                k=1;
                break;
            }
        }
        if(k==0)
        {
            System.out.println("Test Successfull");
            System.out.println();
            System.out.println("The number of array elements was : "+n);
            System.out.println("Time elapsed by bubble sorting is : "+(bubble_new-bubble_old)/1000+" seconds");
            System.out.println("Time elapsed by selection sorting is : "+(select_time_new-select_time_old)/1000+" seconds");
            System.out.println("Time elapsed by insertion sorting is : "+(insert_time_new-insert_time_old)/1000+" seconds");
            System.out.println("Time elapsed by quick sorting is : "+(quick_time_new-quick_time_old)/1000+" seconds");
        }
        else
            System.out.println("Oops..Something went wrong!!!");
    }
}
