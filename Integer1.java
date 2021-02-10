package JavaTest1;

import java.util.Scanner;

public class Integer1 {

	public static void main(String[] args) {
		
		int i,c1=0,c2=0,c3=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = input.nextInt();
		int age[] = new int[n];
		System.out.println("Enter the elements : ");
		for(i=0;i<n;i++)
		{
			age[i]=input.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			if(age[i]<18)
			{
				c1++;
			}
			
			else if(age[i]>= 18 && age[i]<=54)
			{
				c2++;
			}
			
			else
			{
				c3++;
			}
		}
		
		System.out.println("Children : "+c1 +"\n"+"Adult : "+c2+"\n"+ "Senior Citizen : "+c3);
		
		input.close();

	}

}
