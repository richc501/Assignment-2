import java.util.Scanner;
public class Diving 
{
	private static double validScore, degreeOfDifficulty, totalScore, max=0, min=0;
	private static int index;
	private static double[] divingScores=new double[7]; 
	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[]args)
	{
		inputAllScores();
		calculateScore();
		System.out.println("The final score is: "+totalScore);
	}
	private static double inputValidScore()
	{
		do
		{
			System.out.println("Input valid score between 0 and 10.");
			validScore = keyboard.nextDouble();
			if(validScore<0||validScore>10)
				System.out.println("Invalid Input");
		}while(validScore<0||validScore>10);//Checks for valid score
		return validScore;
	}
	private static double[] inputAllScores()
	{
		inputValidDegreeOfDifficulty();
		for (index=0;index<7;index++)//fills array with valid scores
		{
			inputValidScore();
			divingScores[index]=validScore;
		}
		//sorts array from lowest to highest
		boolean lowestToHighest; 
		double temporaryNumber;
		do
		{
			for(int i=0; i<=divingScores.length-2;i++)
			{
				
				int nextNumber=i+1;
				if(divingScores[i]>divingScores[nextNumber])
				{
					temporaryNumber=divingScores[nextNumber];
					divingScores[nextNumber]=divingScores[i];
					divingScores[i]=temporaryNumber;
				}
			}
			lowestToHighest = divingScores[0]<divingScores[1]&&divingScores[1]<divingScores[2]&&divingScores[2]<divingScores[3]&&divingScores[3]<divingScores[4]&&divingScores[4]<divingScores[5]&&divingScores[5]<divingScores[6]&&divingScores[6]>divingScores[0];
		}while(lowestToHighest==false);
//		System.out.println(divingScores[0]);
//		System.out.println(divingScores[1]);
//		System.out.println(divingScores[2]);
//		System.out.println(divingScores[3]);
//		System.out.println(divingScores[4]);
//		System.out.println(divingScores[5]);
//		System.out.println(divingScores[6]);
		return divingScores;
	}
	private static double inputValidDegreeOfDifficulty()
	{
		do
		{
			System.out.println("Input valid degree of difficulty between 1.2 and 3.8");
			degreeOfDifficulty=keyboard.nextDouble();
			if(degreeOfDifficulty<1.2||degreeOfDifficulty>3.2)
				System.out.println("Invalid Input");
		}while(degreeOfDifficulty<1.2||degreeOfDifficulty>3.2);//Checks for valid degree of difficulty
		return degreeOfDifficulty;
	}
	private static double calculateScore()
	{
		double sum=0;
		for(int i=1;i<(divingScores.length-1);i++)
		{
			sum=sum+divingScores[i];
		}
		totalScore=(sum*degreeOfDifficulty)*0.6;
		return totalScore;
	}
}
