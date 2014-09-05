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
	private static int[][] highAndLowTemps = new int [12][2];//array for highs and lows
	private static String[] months = new String[12];//array of monthss
	
	public static void main(String[] args) {
		inputTempForYear();
		calculateAverageHigh(highAndLowTemps);
		calculateAverageLow(highAndLowTemps);
		findHighestTemp(highAndLowTemps);
		findLowestTemp(highAndLowTemps);
		//outputs results
		System.out.println("Average High: "+averageHigh);
		System.out.println("Average Low: "+averageLow);
		System.out.println("Highest Temp and Month: "+highAndLowTemps[indexOfHighestTemp][0]+" "+months[indexOfHighestTemp]);
		System.out.println("Lowest Temp and Month: "+highAndLowTemps[indexOfLowestTemp][1]+" "+months[indexOfLowestTemp]);
	}
	private static void inputTempForMonth(int[][] highAndLowTemps)
	{
		System.out.println("Input the high temperature for "+months[index]+":");
		highTemperature = keyboard.nextInt();//inputs months high temp
		highAndLowTemps[index][0]=highTemperature;
		System.out.println("Input the low temperature for "+months[index]+":");
		lowTemperature = keyboard.nextInt();//inputs months low temp
		highAndLowTemps[index][1]=lowTemperature;
	}
	private static int[][] inputTempForYear()
	{
		months[0]="January";
		months[1]="Febuary";
		months[2]="March";
		months[3]="April";
		months[4]="May";
		months[5]="June";
		months[6]="July";
		months[7]="August";
		months[8]="September";
		months[9]="October";
		months[10]="November";
		months[11]="December";//fills month array
		for (index=0;index<=11;index++)//fills array with highs and lows
		{
			inputTempForMonth(highAndLowTemps);
		}
		return highAndLowTemps;
	}
	private static int calculateAverageHigh(int[][] highAndLowTemps)
	{
		for(int i=0;i<=11;i++)//finds sum of high temps
		{
			averageHigh=averageHigh+highAndLowTemps[i][0];
		}
		averageHigh/=12;//calculates average
		return averageHigh;
	}
	private static int calculateAverageLow(int[][] highAndLowTemps)
	{
		for(int i=0;i<=11;i++)//finds sum of low temps
		{
			averageLow=averageLow+highAndLowTemps[i][1];
		}
		averageLow/=12;//calculates average
		return averageLow;
	}
	private static int findHighestTemp(int[][] highAndLowTemps)
	{
		double max=highAndLowTemps[0][0];
		int indexHigh;//index for highest
		for(indexHigh=0;indexHigh<11;indexHigh++)//find highest high temp
		{
			if(highAndLowTemps[indexHigh][0]>max)
			{
				max=highAndLowTemps[indexHigh][0];
				indexOfHighestTemp=indexHigh;
			}
		}
		return indexOfHighestTemp;
	}
	private static int findLowestTemp(int[][] highAndLowTemps)
	{
		double min=highAndLowTemps[0][1];
		int indexLow;//index for lowest
		for(indexLow=0;indexLow<11;indexLow++)//finds lowest low temp
		{
			if(highAndLowTemps[indexLow][1]<min)
			{
				min=highAndLowTemps[indexLow][1];
				indexOfLowestTemp=indexLow;
			}
		}
		return indexOfLowestTemp;
	}
}
