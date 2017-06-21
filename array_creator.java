import java.util.*;
public class array_creator extends array_range_acceptor
{  
    static long bubble[]=new long[1000000];
    static long selection[]=new long[1000000];
    static long insertion[]=new long[1000000];
    static long quick[]=new long[1000000];	
    public static void generate()
    {
        System.out.println("Creating Array For Bubble Sorting.....");
        System.out.println("Creating Array For Selection Sorting.....");
        System.out.println("Creating Array For Insertion Sorting.....");
        System.out.println("Creating Array For Quick Sorting.....");
        for(int i=0;i<n;i++)
            bubble[i]=selection[i]=insertion[i]=quick[i]=(long)(Math.random()*n);
        System.out.println("Creation of arrays successfull.");
        System.out.println();
    }
}