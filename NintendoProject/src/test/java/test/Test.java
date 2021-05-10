package test;
import java.util.*;

import metier.*;

public class Test {

	public static void main(String[] args) 
	
	{
		List<Console> consoles = new ArrayList<Console>();
		Console Xbox = new Console("Xbox");
		Console PlayStation = new Console("PlayStation");
		Console SuperNintendo = new Console("SuperNintendo");
		Console Nintendo64 = new Console("Nintendo64");
		Console PC = new Console("PC best ever");
		
		consoles.add(Nintendo64);
		consoles.add(PlayStation);
		consoles.add(SuperNintendo);
		consoles.add(PC);
		consoles.add(Xbox);
		
		
		Adresse a1 = new Adresse (12, "rue", "ville");
		Adresse a2 = new Adresse (16, "rue3213", "ville654654");
		
	    List<Jeu> listeJeux = new ArrayList ();
		
		
		Boutique b1 = new Boutique ("Micromania",a1,listeJeux);
		Boutique b2 = new Boutique ("Gamecash", a2,listeJeux);
		
		
		
		Jeu wow = new Jeu("WoW", consoles,b1);
		Jeu mario = new Jeu("Super Mario", consoles,b1);
		Jeu genshi = new Jeu("Genshin", consoles,b2);
		Jeu zelda = new Jeu("Zelda", consoles,b1);
		Jeu pokemon = new Jeu("Pokemon", consoles,b2);

	}

}
