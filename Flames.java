import java.util.Scanner;
import java.util.*;  
public class Flames
{
	public static void main(String[] args) 
	{
	    String str="manirajkumar";
		String str1="srinithi";
	    ArrayList a1=new ArrayList();
	    ArrayList a2=new ArrayList();
	    for (int i=0; i<str.length(); i++)
	    {
	        a1.add(str.charAt(i));
	    }
	    for (int i=0; i<str1.length(); i++)
	    {
	        a2.add(str1.charAt(i));
	    }
		System.out.println(a1);
	    System.out.println(a2);
	    Iterator i=a1.iterator();
	    while (i.hasNext())
	    {
	        char ch=(char)i.next();
	        for (int j=0; j<a2.size(); j++)
			{
				char ch1=(char)a2.get(j);
				if (ch==ch1)
				{
					i.remove();
					a2.remove(j);
					break;
				}
			}
		}
	    System.out.println(a1);
	    System.out.println(a2);
		int t=a1.size()+a2.size();
		System.out.println(t);
		for (int k=0; k<=t; k++)
		{
			if (t==2 || t==4)
			{
				System.out.println("Enemy");
				break;
			}
			else if (t==3 || t==5)
			{
				System.out.println("Friends");
				break;
			}
			else if (t==1)
			{
				System.out.println("Sister");
				break;
			}
			else if (t==6)
			{
				System.out.println("Marriage");
				break;
			}
			else if (t>6)
			{
				int r=t-6;
        k=r;
			}
		}
	}
}
