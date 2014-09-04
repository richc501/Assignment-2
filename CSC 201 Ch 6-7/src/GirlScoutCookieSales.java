import java.util.Scanner;
public class GirlScoutCookieSales {
	public static Scanner keyboard = new Scanner(System.in);
	private static int numberOfTroops;
	private static int numberOfBoxes;
	private static int numberOfCookiesSold;
	private static int arrayLength;
	private static int[] soldCookiesRanges = new int[0];
	private static int[] girlScoutTroops = new int[0];
	private static String output = " ";
	/*public GirlScoutCookieSales (int numberOfTroops, int numberOfBoxes)
	{
		this.numberOfTroops=numberOfTroops;
		this.numberOfBoxes=numberOfBoxes;
	}*/
	public static void main(String[]args)
	{
		System.out.println("Input number of girls in troops:");
		numberOfTroops = keyboard.nextInt();
		girlScoutTroops = new int[numberOfTroops];
		///////////////////////////////////////////////
		int max = 0;
		for(int i=0;i!=girlScoutTroops.length;i++)
		{
			System.out.println("Input boxes of cookies for girl # "+(i+1)+": ");
			girlScoutTroops[i]=keyboard.nextInt();
			if (girlScoutTroops[i]>max)
				max = girlScoutTroops[i];
		}
		//////////////////////////////////////////////
		int highestSold = max;
		while (max>0)
		{
			if (max%10==0)
			{
				max-=10;
				arrayLength++;
			}
			else if (max%10!=0)
			{
				int difference = max%10;
				max -= difference;
				arrayLength++;
			}
		}
		soldCookiesRanges = new int[arrayLength];		
		//////////////////////////////////////////////
		int rangeNumberLow=0, rangeNumberHigh = 10;
		for (int i=0;i!=soldCookiesRanges.length;i++)
		{
			if (girlScoutTroops[i]>rangeNumberLow&&girlScoutTroops[i]<=rangeNumberHigh)
			{
				soldCookiesRanges[i]++;
			}
					
		}
		/////////////////////////////////////////////
		
		//soldCookies = new int[arrayLength];
		//System.out.println(soldCookies.length);
		//InputSoldCookies();
		System.out.println(output);
		
	}
	private static int DetermineArrayLength()
	{
		int boxes = numberOfBoxes;
		while (boxes>0)
		{
			if (boxes%10==0)
			{
				boxes-=10;
				arrayLength++;
			}
			else if (boxes%10!=0)
			{
				int difference = boxes%10;
				boxes -= difference;
				arrayLength++;
			}
		}
		return arrayLength;
	}
/*	private static int InputSoldCookies()
	{
		int index = 0, min = 0,max=numberOfBoxes;
		
		while (index!=soldCookies.length)
		{
			soldCookies[index]=keyboard.nextInt();
			output = output+"\n"+soldCookies[index]+"\n";
			index++;
		}
		return numberOfCookiesSold;
	}*/
	public int getNumberOfTroops() {
		return numberOfTroops;
	}
	public void setNumberOfTroops(int numberOfTroops) {
		this.numberOfTroops = numberOfTroops;
	}
	public int getNumberOfBoxes() {
		return numberOfBoxes;
	}
	public void setNumberOfBoxes(int numberOfBoxes) {
		this.numberOfBoxes = numberOfBoxes;
	}
	public int getNumberOfCookiesSold() {
		return numberOfCookiesSold;
	}
	public void setNumberOfCookiesSold(int numberOfCookiesSold) {
		this.numberOfCookiesSold = numberOfCookiesSold;
	}

}
