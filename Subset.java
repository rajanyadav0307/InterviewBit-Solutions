import java.util.*;
import java.io.*;

public class Subset
{

    public static void subset_print(Stack<Integer> set, int nums[], int i)
    {
        if(i==nums.length)
        {
            System.out.println(set);
            return ;
        }
        set.push(nums[i]);
        subset_print(set,nums,i+1);
        set.pop();
        subset_print(set, nums, i+1);
        
    }

    public static void main(String args[])
    {
        int a[]={1,2,3,3};
        for(int i=0; i<a.length; i++)
        {
            Stack<Integer> set= new Stack<>();
            set.push(a[i]);
            subset_print(set,a,i+1);
        }
    }
}
