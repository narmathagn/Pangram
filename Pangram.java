import java.util.*;
public class Pangram{
	public static void main(String args[]){
		System.out.println("Enter the string");
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		s1.toLowerCase();
		boolean[] b=new boolean[26];
		int flag=1;
		int index=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
			{
				index=s1.charAt(i)-'a';
			}
			b[index]=true;
		}
		for(int i=0;i<=25;i++)
		{
			if(b[i]==false)
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("PANGRAM");
		}
		else
		{
			System.out.println("NOT PANGRAM");
		}
	}
}