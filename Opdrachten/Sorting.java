package Working;

//Holds the sorting methods
public class Sorting 
{	
	SortChar[] ConvertToLowerCase(char[] currentArray) 
	{
		SortChar[] sortedChars = new SortChar[currentArray.length];
		for(int i = 0; i < sortedChars.length; i++)
			sortedChars[i] = new SortChar(); // init the array to prevent them from being null
		
		for(int i = 0; i < currentArray.length; i++)
		{
			SortChar element = sortedChars[i]; // cache class element
			element.character = currentArray[i]; // init character to the provided array element
			
			//Convert every upper case to lower case, and save the data so it can be converted back later
			if(Character.isUpperCase(element.character)) 
			{
				element.isUpperCase = true;
				element.character = Character.toLowerCase(element.character);
			}
			else // This is not upper case, set to false
				element.isUpperCase = false;
		}
		return sortedChars;
	}
	
	//Sort the given array of chars from highest to lowest 
	char[] SortArrayFromHighest(char[] currentArray) 
	{
		SortChar[] sortChars = this.ConvertToLowerCase(currentArray);	//Get Lower Case Data	
		char[] tempArray = new char[currentArray.length]; 		
		for(int i = 0; i < tempArray.length; i++)
		{
			SortChar highest = new SortChar(); // instantiate highest to default 0
			int index = 0;
			// Find the highest value for each iteration, then add to the tempList
			for(int j = 0; j < sortChars.length; j++)
			{
				if(sortChars[j].character > highest.character) 
				{
					highest = sortChars[j];
					index = j;
				}
			}
			
			if(highest.isUpperCase == true) // convert back to upper case if this was specified
				highest.character = Character.toUpperCase(highest.character);
			
			tempArray[i] = highest.character; //set current index to the highest
			sortChars[index].character = 0; //nullify the current highest value for next iteration
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
		SortChar[] sortChars = this.ConvertToLowerCase(currentArray);	//Get Lower Case Data	
		char[] tempArray = new char[currentArray.length];
		// Find the lowest value for each iteration, then add to the tempList
		for(int i = 0; i < tempArray.length; i++)
		{
			SortChar lowest = new SortChar(Character.MAX_VALUE); // init character to max value
			int index = 0;
			for(int j = 0; j < sortChars.length; j++)
			{
				if(sortChars[j].character < lowest.character) 
				{
					lowest = sortChars[j];
					index = j;
				}
			}
			
			if(lowest.isUpperCase == true) // convert back to upper case if this was specified
				lowest.character = Character.toUpperCase(lowest.character);
			
			tempArray[i] = lowest.character; //set current index to the lowest	
			sortChars[index].character = Character.MAX_VALUE; //nullify the current lowest value for next iteration
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

class SortChar
{
	boolean isUpperCase = false;
	char character = 0;
	SortChar(){} //Default Constructor
	
	//Optional Constructor
	SortChar(char character) 
	{
		this.character = character;
	}
	
    public String toString() 
	{
        return this.character + " : " + this.isUpperCase;
    }	
}
