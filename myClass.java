import java.util.Scanner;

public class myClass
{
	public static void main(String[] args)
	{
			Scanner myVar = new Scanner(System.in);
			int highest = 0;
			String message= "";
			int arr[] = new int[5];
			for(int i=0;i<5;i++)
			{
				System.out.print("Enter score for student " + (i+1) + ": ");
				highest = myVar.nextInt();
				arr[i]=highest;
			}
			
			System.out.println(message + checkHighest(arr) + grade(checkHighest(arr)));
	}
	
	private static int checkHighest(int[] arr)
	{
		int highest = 0;
		
		for(int i: arr)
		{
			if(i>highest)
				highest=i;
		}
		return highest;
	}
	
	public static String grade(int marks)
	{
		while(marks<1000)
		{
			System.out.println(marks);
			marks++;
		}
		return "";
	}
	
}