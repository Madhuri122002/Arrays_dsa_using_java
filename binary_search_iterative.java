import java.util.*;
public class binary_search_iterative
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=r.nextInt(50);
        }
        Arrays.sort(a);
        System.out.println("Sorted array taken as input:");
        for(int i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Enter the search element:");
        int key=sc.nextInt();
        int mid,low,high;
        low=0;
        high=size-1;
        mid=-1;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(key==a[mid])
                break;
            else if(key>a[mid])
                low=mid+1;
            else
                high=mid-1;
        }
        if(mid==-1)
        {
            System.out.println("The element is not found");
        }
        else{
            System.out.println("The element is found in the index "+mid);
        }
    }
}