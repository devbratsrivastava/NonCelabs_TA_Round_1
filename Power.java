import java.lang.*;
import java.util.*;
public class Main
{
    public int power(int e)
    {
    int power=1, b=2;
       while(e>0)
	    	{
	    	    power=power*b;
    	    	e--;
    		}
        return power;
        
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		Main obj = new Main();
		int n= sc.nextInt();
	    int arr[] = new int[n+1];
	    for(int i=0;i<=n;++i)
     
        {
            arr[i]=obj.power(i);
        }
	    
		for(int i=0;i<=n;++i)
        {
            System.out.println(arr[i]);
        }
	}
}
