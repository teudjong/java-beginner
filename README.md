# java-beginner


           
UNE VARIABLE: est un conteneur qui permet de stocker des donnees en memoire pour uneutilisation ulterieure dans un programme.

    elle est caracterisee par: un nom, un type,une valeur
    exemple: nom: masse  type:nombredecimal   valeur: 23,5kg

    si la variable est longue et elle doit etre lisible par des humains: si le nom de la variableest longue on utilise la notation CamelCase : exemple(totalAnnuelDesVentes)
    si la variable est tres longue on utilise la notation Snake_Cmel_Case: exemple(prix_Unitaire_Par_Produit_De_Reference)

    les types de variables en java sont: les types primitifs:
    byte(entier: -128....127) ; short(entier: -32768...32767) ; int(entier positif:0 ...4294967295 ) ; long(entier positif: 0...2^64-1)
    float(nbre decimal avec virgule et a 7 chiffres) ; double(nbre decimal avec virgule et a +7 chiffres) ; boolean(true ou false)  ; char (un caratere: a,$,4...)

    les types d'encapsulation:
    Integer(encapsule le type primitif); Double(encapsule le type primitif double:resp long) ; Boolean(encapsule le type primitif boolean) ; String(plusieurs chaines de caracteres

LES CONSTANTES : sont des valeus qui ne changent JAMAIS  (exemple: nbre de mois de annee: 12; nbre etages du batiment:3).
		 
	unboxing: prendre une variable qui est un type qui est encapsulant pour la transforme en une variable de type encapsule.
	autoboxing: est tprendre une variable de type encapsule pour la transforme en une variable de type qui est encapsulant.
	
	
RESUME SUR LES VARIABLES:
	
	-nombre entiers(mot-cle int);
	-nombres decimaux (mots cles float et double);
	-chaines de caracteres(mot cle String);
	-effectuer operations numeriques sur des nombres du meme type;
	-sur des types differents, CAST a la ressource;
	-utiliser de preference les types primitifs pour eviter de l'autoboxing et de l'unboxing inutile;
	-mettre les chaines de bout en bout grace a la CONCATENATION.
la CONCATENATION: signifie mettre bout à bout des chaînes de caractères, ce qui donne une chaîne de caractères
	
	
La fonction principale de la fonction principale un programme JAVA:
	
	     - un programme est compose de plusieurs fonctions(est un ensemble de taches qu'une personne ou un object est censer faire)
		  -chaque fonction reslise une taches specifique dans le programme
		  -elles ont un nom
		  -et sont executees lorsqu'elles sont mentionnees par leur noms dans d'autres fonction
		  -il faut donc une fonction principale, declenchee en premier
		  -en java il s'agit de main 
		  
LES FONCTIONS en java, sont logees dans les classes; une classe a des proprietes(attributs) et des fonctions(methodes ou comportemments)
	les classes sont logees dans des packages

COMMANDES:
	  
javac src/com/zerofiltre/parkinfbot/ParkingBot.java: pour compiler\demarrer un programme.
	  
java --class-path src com.zerofiltre.parkingbot.ParkingBot Ebeno : pour executer un fichier .class avec pour argument Ebeno.

    selectionner le bout de code a extrere et taper: Ctrl+Alt+M (pour extrere un bout de code dans une fonction ou methode ou comportement).
    commentaire pour pouvoir generer de la documentataion officielle : /** taper entrer puis commenter.

RESUME SUR LES FONCTIONS :

	 UN PROGRAMME JAVA a au dessus de sa structure des packages(dossiers) qui contiennent des classes(fichiers) qui contiennent des fontions(methodes) qui constituent le comportement de nos classes.
	  (/**Commentaire*/)generer de la Javadoc a generer en HTML.
	  aucune logique dans la methode main : donc il faut toujours renommer le methode en mettant en nom qui sera comprehensible par tout developpeur.


LA PORTEE DES VARIABLES: est son perimetre d'acces(accessibilite)

       une variable est DECLAREES et ACCESSIBLE dans un contexte bien precis.
    exemple: un carton dans une chambre ne peut etre accessible depuis les autre pieces de la maison. il faut avoir les cles pour avoir acces a la variable(carton).
    
    on a: 
    la PORTEE GLOBALE:elle peut etre accessible dans toutes les methodes de la classe.
    exemple: une variable(tele) qui est declare au salon peut etre utiliser dans la chambre et dans autre pieces de la maison.
    
    la PORTEE LOCALE: elle est uniquement accessible dans la methode qui l'a declare.
    exemple: une variable(fer a repasse) qui est declare dans la chambre,ne peut etre utiliser dans d'autres pieces de la maison (pour l'utiliser il faut etre dans la chambre).

    une variable est aussi caracterise par un NIVEAU D'ACCES.
    exemple: ma maison a un salon et deux chambres, une personne exterieure peut acceder au que si elle a la cle du salon sans avoir la cle des chambres; un autre niveau d'acces cette meme personne peut acceder a une des chambres ssi on lui donne la cle de cette chambre.

    le niveau d'acces linite ou etend l'accessibilite grace a des mots cles a savoir:
    PUBLIC: c-a-d la variable peut etre visible par tous autre classe qui se situe dans le projet java ou a exterieur du dit projet.
    PROTECTED: c-a-d la variable peut etre accessible par ces 3 situations(depuis la classe qui a declarer la variable,depuis les classes et sous-classes de la classe declarente,)