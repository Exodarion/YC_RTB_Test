package archief;

// class
// object
// field
// methode
// argument parameter
// static final
// has - a relatie
// returntype

// constructor
// overloading
//  Objecttype als parameter
// Objecttype als return type

public class Demo 
{
    public static void main(String[] args) 
    {
		//Stuur.vorm = "rond";
		Auto newAuto = new Auto(new Stuur("Audi", 25, 50));
		newAuto.opstarten();	
		newAuto.opstarten("Biep!!!");	
		System.out.println(newAuto.setSnelheid(10));
		System.out.println(newAuto.getStuur().hoogte);
    }
}

class Auto
{
	Stuur _stuur; 
	int snelheid;
	Auto(Stuur stuur)
	{
		_stuur = stuur;
	}
	
	void opstarten()
	{
		System.out.println("Vroem!!!");
	}
	
	void opstarten(String geluid)
	{
		System.out.println(geluid);
	}
	
	int setSnelheid(int startSnelheid)
	{
		snelheid = startSnelheid + 10;
		return snelheid;
	}
	
	Stuur getStuur() {
		return _stuur;
	}
}

class Stuur
{
	Stuur(String _merkNaam, int _hoogte, int _breedte)
	{
		merkNaam = _merkNaam;
		breedte = _breedte;
		hoogte = _hoogte;
	}
	static String vorm = "rond"; 
	final String merkNaam;
	int breedte;
	int hoogte;
}