import java.util.Scanner;
public class Diving 
{
	private static double validScore, degreeOfDifficulty, totalScore, max=0, min=0;
	private static int index, setValuesOnce=0;
	private static double[] test=new double[7]; 
	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[]args)
	{
		inputAllScores();
		calculateScore();
		System.out.println(totalScore);
		System.out.println(max);
		System.out.println(min);
	}
	private static double inputValidScore()
	{
		validScore = keyboard.nextDouble();
		if (setValuesOnce==0)//sort array
		{
		max=validScore;
		min=validScore;
		setValuesOnce++;
		}
		if (validScore>max)
		{
			max=validScore;
		}
		else if (validScore<min)
		{
			min=validScore;
		}
		return validScore;
	}
	private static double[] inputAllScores()
	{
		for (index=0;index<7;index++)
		{
			inputValidScore();
			test[index]=validScore;
		}
		return test;
	}
	private static double inputValidDegreeOfDifficulty()
	{
		degreeOfDifficulty=keyboard.nextDouble();
		return degreeOfDifficulty;
	}
	private static double calculateScore()
	{
		double sum=0;
		inputValidDegreeOfDifficulty();
		for(int i=0;i<test.length;i++)
		{
			sum=sum+test[i];
		}
		totalScore=sum-(max+min);
		totalScore=sum*degreeOfDifficulty;
		totalScore*=0.6;
		return totalScore;
	}
}
