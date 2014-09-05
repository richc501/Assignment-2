//Richard Cunningham
//Create a main method that will solve the previous problem statement.
//You may only use statements that are discussed in the book through Chapter 6.
//You must not use any Array class or Array method included in the Java libraries to solve this problem.
//Use the following input values for the final test of this program:
//Total number of girls in the troop 8
//Boxes of cookies for girl #1            43
//Boxes of cookies for girl #2            18
//Boxes of cookies for girl #3            23
//Boxes of cookies for girl #4            20
//Boxes of cookies for girl #5            35
//Boxes of cookies for girl #6            17
//Boxes of cookies for girl #7            11
//Boxes of cookies for girl #8            25
//Save your complete output to a text file to turn in with this assignment.
//Upload your Java source code file and your output text file in Blackboard using the Assignment Upload area below.

//Ask user for input on how many girls are in troop
//make array length based on that number
//ask user to input each amount of cookies sold for each girl
//use another to count the ranges 
//output results
import java.util.Scanner;
public class GirlScoutCookieSales {
	public static Scanner keyboard = new Scanner(System.in);
	private static int numberOfTroops;//Population of troop
	private static int[] soldCookiesRanges = new int[5];//counts the amount of cookies per range
	private static int[] girlScoutTroops = new int[0];//troops amounts of cookies per girl


	public static void main(String[]args)
	{
		System.out.println("Input number of girls in troops:");
		do
		{
			numberOfTroops = keyboard.nextInt();//Determines length of array
			if(numberOfTroops<=0)
				System.out.println("Please input number greater than 0.");
		}while(numberOfTroops<=0);//makes user input till > 0 troops can not be negative or zero
		girlScoutTroops = new int[numberOfTroops];//sets array to length of troop size
		///////////////////////////////////////////////

		for(int i=0;i!=girlScoutTroops.length;i++)//go through array for input of cookies for each girl
		{
			System.out.println("Input boxes of cookies for girl # "+(i+1)+": ");
			do
			{
				girlScoutTroops[i]=keyboard.nextInt();//Amount of cookies per girl
				if(girlScoutTroops[i]<0)
					System.out.println("Please input postive numbers only");
			}while(girlScoutTroops[i]<0);//makes user input till >=0 can not negative sold cookies

			//determines which range of cookies sold and increments certain value of range array
			if (girlScoutTroops[i]>0&&girlScoutTroops[i]<=10)
				soldCookiesRanges[0]++;//increments 0 to 10
			else if (girlScoutTroops[i]>=11&&girlScoutTroops[i]<=20)
				soldCookiesRanges[1]++;//increments 11 to 20
			else if (girlScoutTroops[i]>=21&&girlScoutTroops[i]<=30)
				soldCookiesRanges[2]++;//increments 21 to 30
			else if (girlScoutTroops[i]>=31&&girlScoutTroops[i]<=40)
				soldCookiesRanges[3]++;//increments 31 to 40
			else if (girlScoutTroops[i]>=41)
				soldCookiesRanges[4]++;//increments 41 or more
		}
		/////////////////////////////////////////////

		output();


	}
	private static void output()//outputs results of Range array
	{
		System.out.println("0 to 10 cookies: "+soldCookiesRanges[0]);
		System.out.println("11 to 20 cookies: "+soldCookiesRanges[1]);
		System.out.println("21 to 30 cookies: "+soldCookiesRanges[2]);
		System.out.println("31 to 40 cookies: "+soldCookiesRanges[3]);
		System.out.println("41 or more cookies: "+soldCookiesRanges[4]);
	}

	//getters and setters
	public int getNumberOfTroops() {
		return numberOfTroops;
	}
	public void setNumberOfTroops(int numberOfTroops) {
		this.numberOfTroops = numberOfTroops;
	}
}
