package Working;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MiniOpdracht 
{
	public static int autoID = 0; //Increments the Car ID's
	public static Random random = new Random(); //Cache a reference to Random
	public static Sorting sorting = new Sorting(); //Cache a reference to Sorting
	public static void main(String[] args) 
	{	
		MiniOpdracht MiniOpdracht = new MiniOpdracht();
//		MiniOpdracht.Opdracht1();
//		MiniOpdracht.Opdracht2();
//		MiniOpdracht.Opdracht3();
//		MiniOpdracht.Opdracht4();
//		MiniOpdracht.Opdracht5(5);		
//		MiniOpdracht.Opdracht6();
		
		MiniOpdracht.Opdracht7("society");
	}	
	
	String Opdracht1 ()
	{
		String str1 = "dop";
		String str2 = "erwt";
		String str3 = "en";
		
		return str1.concat(str2) + str3;
	}
	
	void Opdracht2 ()
	{
		int count = 0;
		String result = Opdracht1();
		for(int i = 0; i < result.length(); i++)
		{
			if(result.charAt(i) == 'e')
				count++;
		}		
		System.out.println("Aantal 'e' = " + count);
	}
	
	void Opdracht3 ()
	{
		int[] nummers = {1, 2, 3, 4};
		int result2 = 0;
		for(int i = 0; i < nummers.length; i++)
			result2 += nummers[i];
		
		System.out.println("Addition result = " + result2);
	}
	
	void Opdracht4 ()
	{
		int[] randomArray = new int[10];
		for(int i = 0; i < randomArray.length; i++)
			randomArray[i] = 1 + random.nextInt(100); //Fill array with random ints from 1 to 100	
		
		System.out.println("Original array content " + Arrays.toString(randomArray)); 
		
		//Print newly sorted arrays by value, by sending a copy of the original
		System.out.println("Array content from highest " + Arrays.toString(sorting.SortArrayFromHighest(Arrays.copyOf(randomArray, randomArray.length))));
		System.out.println("Array content from lowest " + Arrays.toString(sorting.SortArrayFromLowest(Arrays.copyOf(randomArray, randomArray.length))));		
		System.out.println("Original Array content should still be the same though " + Arrays.toString(randomArray)); 
		
		//Or otherwise, simply assign the return value, no need to send a copy in that case
		//randomArray content is now no longer original however
		randomArray = sorting.SortArrayFromHighest(randomArray);
		System.out.println("Assigned by return value instead without a copy " + Arrays.toString(randomArray));
	}
	
	void Opdracht5 (int iterations)
	{
		Monteur monteur = new Monteur("Piet", 45);		
		for(int i = 0; i < iterations; i++)
			System.out.println("Totale Kosten = " + monteur.GetRepareerKosten(new Auto()));
	}
	
	void Opdracht6 ()
	{
		Scanner scanner = new Scanner(System.in);
		char[] input = scanner.nextLine().toCharArray(); // convert entire line to char array first
		
		System.out.println("Original data = " + Arrays.toString(input));
		System.out.println("Sorted Alphabetical = " + Arrays.toString(sorting.SortArrayFromLowest(Arrays.copyOf(input, input.length))));
		System.out.println("Sorted anti-Alphabetical = " + Arrays.toString(sorting.SortArrayFromHighest(Arrays.copyOf(input, input.length))));
	}
	
	void Opdracht7 (String word)
	{
		String displayString = "";
		for(int i = 0; i < word.length(); i++)
			displayString += "__ ";
		
		System.out.println("Try to guess the following word \n" + displayString);
		
		char[] splitWord = word.toCharArray();
		Scanner scanner = new Scanner(System.in);
		
		boolean quitSimulation = false;
		while(quitSimulation == false) // continue the simulation if specified by the player
		{			
			String input = scanner.nextLine(); // convert entire line to char array first	
			char[] inputAsArray = input.toCharArray();
			boolean matchesLength = false;
			while(matchesLength == false) // continue this loop until the player selects a word with the proper length
			{
				if(input.length() != splitWord.length) 
				{
					System.out.println("The length of your guess does not match the provided word, try again.");
					input = scanner.nextLine(); // convert entire line to char array first
					inputAsArray = input.toCharArray();
				}
				else
					matchesLength = true;
			}
			
			//first check if the entire word aligns, and end the game if so
			if(word.equals(input))
			{
				System.out.println("Correct! Thanks for playing!");
				quitSimulation = true;
				return;
			}
			
			//Check the status for every element 
			displayString = "";
			for(int i = 0; i < word.length(); i++)
			{
				boolean foundState = false;
				if(inputAsArray[i] == splitWord[i]) 
				{ //The 2 letters are the same, add 2 and move to next iteration
					displayString += "2";
					continue; 
				}
					
				for(int j = 0; j < splitWord.length; j++)
				{ //Check the input against every individual letter of the given word
					if(inputAsArray[i] == splitWord[j])
					{ //This input letter exists somewhere else within the word, add 1 and break
						displayString += "1";
						foundState = true;
						break;
					}
				}
				
				if(foundState == false) 
					displayString += "0"; //Letter doesn't exist within this word, add 0
			}
			
			System.out.println("The result is the following \n" + displayString);		
			System.out.println("Would you like to continue playing? y/n");
			if(scanner.nextLine().equals("y") == false) 
				quitSimulation = true;
		}
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	// MISCELLANEOUS METHODS
	/////////////////////////////////////////////////////////////////////////////////////////////
}














