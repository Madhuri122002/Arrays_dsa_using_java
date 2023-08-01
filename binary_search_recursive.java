import java.util.*;
public class binary_search_recursive {
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
        System.out.println("Sorted array taken as input:");
        Arrays.sort(a);
        for(int i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Enter the search element:");
        int key=sc.nextInt();
        int result=binary_search(a,key,0,size-1);
        System.out.println("The elemenet is found in the index:"+result);
    }
    public static int binary_search(int a[],int key,int low,int high)
    {
        int mid=(low+high)/2;
        if(a[mid]==key)
            return mid;
        else if(key>a[mid])
            return binary_search(a,key,mid+1,high);
        else
            return binary_search(a,key,low,mid-1);
    }
}
