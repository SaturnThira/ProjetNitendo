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
		
		Jeu wow = new Jeu("WoW", consoles);
		Jeu mario = new Jeu("Super Mario", consoles);
		Jeu genshi = new Jeu("Genshin", consoles);
		Jeu zelda = new Jeu("Zelda", consoles);
		Jeu pokemon = new Jeu("Pokemon", consoles);

	}

}
