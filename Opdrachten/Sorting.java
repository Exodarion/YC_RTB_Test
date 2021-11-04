package Working;

//Holds the sorting methods
public class Sorting 
{	
	//Sort the given array of chars from highest to lowest 
	char[] SortArrayFromHighest(char[] currentArray) 
	{
		char[] tempArray = new char[currentArray.length]; 
		for(int i = 0; i < tempArray.length; i++)
		{
			char highest = 0;
			int index = 0;
			// Find the highest value for each iteration, then add to the tempList
			for(int j = 0; j < currentArray.length; j++)
			{
				if(currentArray[j] > highest) 
				{
					highest = currentArray[j];
					index = j;
				}
			}
			currentArray[index] = 0; //nullify the current highest value for next iteration
			tempArray[i] = highest; //set current index to the highest		
		}
		return tempArray;
	}
	
	// Sort the given array of ints from highest to lowest 
	int[] SortArrayFromHighest(int[] currentArray) 
	{
		int[] tempArray = new int[currentArray.length]; 
		for(int i = 0; i < tempArray.length; i++)
		{
			int highest = 0;
			int index = 0;
			// Find the highest value for each iteration, then add to the tempList
			for(int j = 0; j < currentArray.length; j++)
			{
				if(currentArray[j] > highest) 
				{
					highest = currentArray[j];
					index = j;
				}
			}
			currentArray[index] = 0; //nullify the current highest value for next iteration
			tempArray[i] = highest; //set current index to the highest		
		}
		return tempArray;
	}
	
	// Sort the given array of chars from lowest to highest 
	char[] SortArrayFromLowest(char[] currentArray) 
	{		
		char[] tempArray = new char[currentArray.length];
		// Find the lowest value for each iteration, then add to the tempList
		for(int i = 0; i < tempArray.length; i++)
		{
			char lowest = Character.MAX_VALUE; // init to max value
			int index = 0;
			for(int j = 0; j < currentArray.length; j++)
			{
				if(currentArray[j] < lowest) 
				{
					lowest = currentArray[j];
					index = j;
				}
			}
			currentArray[index] = Character.MAX_VALUE; //nullify the current lowest value for next iteration
			tempArray[i] = lowest; //set current index to the lowest			
		}
		return tempArray;
	}
	
	// Sort the given array of ints from lowest to highest 
	int[] SortArrayFromLowest(int[] currentArray) 
	{		
		int[] tempArray = new int[currentArray.length];
		// Find the lowest value for each iteration, then add to the tempList
		for(int i = 0; i < tempArray.length; i++)
		{
			int lowest = Integer.MAX_VALUE; // init to max value
			int index = 0;
			for(int j = 0; j < currentArray.length; j++)
			{
				if(currentArray[j] < lowest) 
				{
					lowest = currentArray[j];
					index = j;
				}
			}
			currentArray[index] = Integer.MAX_VALUE; //nullify the current lowest value for next iteration
			tempArray[i] = lowest; //set current index to the lowest			
		}
		return tempArray;
	}
}
