import java.util.*;
public class substringh
{
	public static void main(String[] args) 
	{
	//how to count how many pairs is present in string Subtring is present in this string 

	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int a=0;
	int b=0;
	int count=0;
	for(char aa:s.toCharArray())
	{
	    if(aa=='A')
	    {
	        a++;       
	    }
	    if(aa=='B')
	    {
	        b++;
	    }
	if(a>0 && b>0 && a==b)
	{
	    count++;
	    a=0;
	    b=0;
	}
	}
	System.out.println(count);
	}
}

