package Working;

class Auto 
{
	int ID;
	Onderdeel[] onderdelen = 
	{
		new Onderdeel("motor"),
		new Onderdeel("deur"),
		new Onderdeel("voorruit"),
		new Onderdeel("uitlaat")
	};
	
	Auto()
	{
		this.ID = MiniOpdracht.autoID;
		MiniOpdracht.autoID += 1;
		
		for(int i = 0; i < onderdelen.length; i++) 
		{
			if((MiniOpdracht.random.nextInt(100) + 1) <= 50)
				onderdelen[i].isKapot = true;
		}
		System.out.println("Nieuwe Auto aangemaakt met ID " + this.ID);
	}
}

class Onderdeel
{
	String naam;
	boolean isKapot = false;
	Onderdeel(String naam)
	{
		this.naam = naam;
	}
}

class Monteur 
{
	String naam;
	int leeftijd;
	Monteur(String naam, int leeftijd)
	{
		this.naam = naam;
		this.leeftijd = leeftijd;
	}
	
	int GetRepareerKosten(Auto auto)
	{
		int kosten = 0;
		for(int i = 0; i < auto.onderdelen.length; i++) 
		{
			if(auto.onderdelen[i].isKapot == true) 
			{
				kosten += 25;
				System.out.println("Onderdeel " + auto.onderdelen[i].naam + " van Auto ID " + auto.ID +  " is kapot");
			}
		}
		return kosten;
	}
}

