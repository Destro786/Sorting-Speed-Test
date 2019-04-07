import java.util.*;
public class array_creator extends array_range_acceptor
{  
    static long bubble[]=new long[1000000];
    static long selection[]=new long[1000000];
    static long insertion[]=new long[1000000];
    static long quick[]=new long[1000000];	
    public static void generate()
    {
        System.out.println("Created array for bubble sorting.");
        System.out.println("Created array for selection sorting.");
        System.out.println("Created array for insertion sorting.");
        System.out.println("Created array for quick sorting.");
        for(int i=0;i<n;i++)
            bubble[i]=selection[i]=insertion[i]=quick[i]=(long)(Math.random()*n);
        System.out.println("\n Creation of arrays successfull.\n");
    }
}
