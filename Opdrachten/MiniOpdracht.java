package Working;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MiniOpdracht 
{
	public static int autoID = 0; //Increments the Car ID's
	public static Random random = new Random(); //Cache a reference to Random
	public static void main(String[] args) 
	{	
		MiniOpdracht MiniOpdracht = new MiniOpdracht();
		MiniOpdracht.Opdracht1();
		MiniOpdracht.Opdracht2();
		MiniOpdracht.Opdracht3();
		MiniOpdracht.Opdracht4(random);
		MiniOpdracht.Opdracht5(5);
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
	
	void Opdracht4 (Random random)
	{
		int[] randomArray = new int[10];
		for(int i = 0; i < randomArray.length; i++)
			randomArray[i] = 1 + random.nextInt(100); //Fill array with random ints from 1 to 100	
		
		System.out.println("Original array content " + Arrays.toString(randomArray)); 
		
		//Print newly sorted arrays by value, by sending a copy of the original
		Sorting sorting = new Sorting();
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
}











