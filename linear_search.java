import java.util.*;
public class linear_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++)
            a[i]=r.nextInt(10);
        System.out.println("Array elements:");
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Enter an element from 0-10 to check if the number is available in the array:");
        int key=sc.nextInt();
        int index=-1;
        for(int i=0;i<size;i++)
        {
            if(a[i]==key)
            {
                index=i;
                System.out.println("The "+key+" is available in the array and is found at index "+index);
            }
            else{
                continue;
            }
        }
        if(index==-1)
        {
            System.out.println("The element entered is not found in the array");
        }
        
    }
}


