import java.util.*;

public class week1a
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int n,flag=0;
        System.out.println("Enter the number of Elements");
        int arr[] = new int[n];
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the Element to be Searched");
        int num = input.nextInt();
        int comp=0;
        {
            for(int i=0;i<n;i++)
            {
                if(arr[i] == num)
                {
                    flag = 1;
                    comp++;
                    break;
                }
                else 
                {
                    flag = 0;
                    comp++;
                }
            }
            if(flag==1)
            {
                System.out.println("Present " + comp);
            }
            else
            {
                System.out.println("Not Present " + comp);
            }
        }
    }
}
