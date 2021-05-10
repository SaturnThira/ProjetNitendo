package test;
import java.util.*;

import metier.*;

public class Test {

	public static void main(String[] args) 
	
	{
		List<Console> consoles = new ArrayList<Console>();
		Console Xbox = new Console("Xbox",300,"2018-01-01");
		Console PlayStation = new Console("PlayStation",300,"2018-01-01");
		Console SuperNintendo = new Console("SuperNintendo",300,"2018-01-01");
		Console Nintendo64 = new Console("Nintendo64",300,"2018-01-01");
		Console PC = new Console("PC best ever",300,"2018-01-01");
		
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
		
		String nom = "Sombrage";
		String prenom = "Ulfrich";

		List<Achat> achats = new ArrayList();
		
		Achat jeux1 = new Achat (wow,"2018-02-03",450,b1);
		Achat jeux2 = new Achat (pokemon,"2014-02-03",3500,b2);
		Achat jeux3 = new Achat (zelda,"20110-01-02",100,b1);
		
		achats.add(jeux1);
		achats.add(jeux2);
		achats.add(jeux3); 
		
		List<Jeu> jeux = new ArrayList();
		jeux.add(wow);
		jeux.add(zelda);
		jeux.add(pokemon);
		
		
		Client client1 = new Client(nom,prenom,achats);

	}

}
