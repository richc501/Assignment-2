//Richard Cunningham
//You may only use statements that are discussed in the book through Chapter 7.
//You must not use an ArrayList class from Java libraries to solve this problem.
//Console input and output must be used to solve this problem.
//Use the following input values for the final test of this program:
//January has a High of 40 and Low of -10
//February has a High of 55 and Low of 25
//March has a High of 60 and Low of 40
//April has a High of 88 and Low of 20
//May has a High of 72 and Low of 55
//June has a High of 95 and Low of 80
//July has a High of 97 and Low of 87
//August has a High of 110 and Low of 98
//September has a High of 79 and Low of 68
//October has a High of 31 and Low of 30
//November has a High of 58 and Low of -25
//December has a High of 32and Low of -20
//Save your complete console output to a text file to turn in with this assignment.
//Post your Java source code file and your output text file in Blackboard using the Assignment Upload link below.

//ask user to input highs and lows for each month
//calculate average for highs and lows
//find highest high and lowest low temp and their month
//output results
import java.util.Scanner;
public class Temperatures {
	public static Scanner keyboard = new Scanner(System.in);
	private static int highTemperature, lowTemperature,averageHigh, averageLow;
	private static int index;//keeps track of months
	private static int indexOfHighestTemp=0, indexOfLowestTemp=0;
	private static String currentMonth;//used for output certain months
	private static int[][] highAndLowTemps = new int [12][2];//array for highs and lows
	public static void main(String[] args) {
		inputTempForYear();
		calculateAverageHigh();
		calculateAverageLow();
		findHighestTemp();
		findLowestTemp();
		//outputs results
		System.out.println("Average High: "+averageHigh);
		System.out.println("Average Low: "+averageLow);
		findMonthForHighTemp();
		System.out.println("Highest Temp and Month: "+highAndLowTemps[indexOfHighestTemp][0]+" "+currentMonth+" "+indexOfHighestTemp);
		findMonthForLowTemp();
		System.out.println("Lowest Temp and Month: "+highAndLowTemps[indexOfLowestTemp][1]+" "+currentMonth+" "+indexOfLowestTemp);
	}
	private static void inputTempForMonth()
	{
		System.out.println("Input the high temperature for "+currentMonth+":");
		highTemperature = keyboard.nextInt();//inputs months high temp
		highAndLowTemps[index][0]=highTemperature;
		System.out.println("Input the low temperature for "+currentMonth+":");
		lowTemperature = keyboard.nextInt();//inputs months low temp
		highAndLowTemps[index][1]=lowTemperature;
	}
	private static int[][] inputTempForYear()
	{
		for (index=0;index<=11;index++)//fills array with highs and lows
		{
			if(index==0)
				currentMonth="January";
			else if(index==1)
				currentMonth="Febuary";
			else if(index==2)
				currentMonth="March";
			else if(index==3)
				currentMonth="April";
			else if(index==4)
				currentMonth="May";
			else if(index==5)
				currentMonth="June";
			else if(index==6)
				currentMonth="July";
			else if(index==7)
				currentMonth="August";
			else if(index==8)
				currentMonth="September";
			else if(index==9)
				currentMonth="October";
			else if(index==10)
				currentMonth="November";
			else if(index==11)
				currentMonth="December";
			inputTempForMonth();
		}
		return highAndLowTemps;
	}
	private static int calculateAverageHigh()
	{
		for(int i=0;i<=11;i++)//finds sum of high temps
		{
			averageHigh=averageHigh+highAndLowTemps[i][0];
		}
		averageHigh/=12;//calculates average
		return averageHigh;
	}
	private static int calculateAverageLow()
	{
		for(int i=0;i<=11;i++)//finds sum of low temps
		{
			averageLow=averageLow+highAndLowTemps[i][1];
		}
		averageLow/=12;//calculates average
		return averageLow;
	}
	private static int findHighestTemp()
	{
		double max=highAndLowTemps[0][0];
		int i;
		for(i=0;i<11;i++)//find highest high temp
		{
			if(highAndLowTemps[i][0]>max)
			{
				max=highAndLowTemps[i][0];
				System.out.println(max);
				indexOfHighestTemp=i;
				System.out.println(indexOfHighestTemp);
			}
		}
		return indexOfHighestTemp;
	}
	private static int findLowestTemp()
	{
		double min=highAndLowTemps[0][1];
		int i;
		for(i=0;i<11;i++)//finds lowest low temp
		{
			if(highAndLowTemps[i][1]<min)
			{
				min=highAndLowTemps[i][1];
				indexOfLowestTemp=i;
			}
		}
		return indexOfLowestTemp;
	}
	//finds month for highest and lowest temp
	private static String findMonthForHighTemp()
	{
		if(indexOfHighestTemp==0)
			currentMonth="January";
		else if(indexOfHighestTemp==1)
			currentMonth="Febuary";
		else if(indexOfHighestTemp==2)
			currentMonth="March";
		else if(indexOfHighestTemp==3)
			currentMonth="April";
		else if(indexOfHighestTemp==4)
			currentMonth="May";
		else if(indexOfHighestTemp==5)
			currentMonth="June";
		else if(indexOfHighestTemp==6)
			currentMonth="July";
		else if(indexOfHighestTemp==7)
			currentMonth="August";
		else if(indexOfHighestTemp==8)
			currentMonth="September";
		else if(indexOfHighestTemp==9)
			currentMonth="October";
		else if(indexOfHighestTemp==10)
			currentMonth="November";
		else if(indexOfHighestTemp==11)
			currentMonth="December";
		return currentMonth;
	}
	private static String findMonthForLowTemp()
	{
		if(indexOfLowestTemp==0)
			currentMonth="January";
		else if(indexOfLowestTemp==1)
			currentMonth="Febuary";
		else if(indexOfLowestTemp==2)
			currentMonth="March";
		else if(indexOfLowestTemp==3)
			currentMonth="April";
		else if(indexOfLowestTemp==4)
			currentMonth="May";
		else if(indexOfLowestTemp==5)
			currentMonth="June";
		else if(indexOfLowestTemp==6)
			currentMonth="July";
		else if(indexOfLowestTemp==7)
			currentMonth="August";
		else if(indexOfLowestTemp==8)
			currentMonth="September";
		else if(indexOfLowestTemp==9)
			currentMonth="October";
		else if(indexOfLowestTemp==10)
			currentMonth="November";
		else if(indexOfLowestTemp==11)
			currentMonth="December";
		return currentMonth;
	}
}
