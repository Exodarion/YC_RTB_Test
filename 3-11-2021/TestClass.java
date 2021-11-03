package archief;

public class TestClass {

	public static void main(String[] args) 
    {
		//Split a String and print their individual values
		String someString = "Peer Appel Banaan";
		String[] splitString = someString.split(" ");
		for(int i = 0; i < splitString.length; i++)
			System.out.println(splitString[i]);
		
		//Check whether someString contains this char sequence
		if(someString.contains("A") && someString.contains("Peer"))
			System.out.println("true");
		else
			System.out.println("false");
    }
}



