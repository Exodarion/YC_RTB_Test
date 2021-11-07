package Working;

public class Ship 
{
	void Start() 
	{
		System.out.println("The ship sets sail");
	};
}

class Cruiser extends Ship
{
	void Start() 
	{
		System.out.println("The cruiser sets sail");
	}
}

class Captain
{
	void Sail(Ship ship) 
	{
		ship.Start();
	};
}

interface Vliegend
{
	
}

class Vliegtuig implements Vliegend
{
	
}

class Spreeuw implements Vliegend
{
	
}