package encapsulation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		CustomTime currTime = new CustomTime();  // object that stores the current time
		Scanner sc=new Scanner(System.in);		
		int hr=sc.nextInt();         // current hour obtained from currTime
		int min=sc.nextInt();        // current minute obtained from currTime
		int sec=sc.nextInt();        // current second obtained from currTime		
		int[] temp;		
		currTime.setTime(hr, min, sec);
		temp = currTime.getTime();
		hr = temp[0];
		min = temp[1];
		sec = temp[2];		
		System.out.println("The current time is set to: "+ hr + ":" + min + ":" + sec);	
		currTime.incrementTime();
		temp = currTime.getTime();
		hr = temp[0];
		min = temp[1];
		sec = temp[2];
		System.out.println("After incrementing the time, the current time is: "+ hr + ":" + min + ":" + sec);
	}
}