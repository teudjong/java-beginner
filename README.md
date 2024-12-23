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

    selectionner le bout de code a extrere et taper: Ctrl+Alt+M (pour extrere un bout de code dans une fonction ou METHODE ou comportement);
     Ctrl+Alt+V (pour extrere UNE VARIABLE); Ctrl+Alt+C (pour extrere UNE CONSTANTE); Ctrl+Alt+P (pour extrere UN PARAMETRE).                                         
    commentaire pour pouvoir generer de la documentataion officielle : /** taper entrer puis commenter.
    se placer sur la ligne de code que vous vouler dupliquer et taper: Ctrl+D (pour dupliquer une ligne de code).


RESUME SUR LES FONCTIONS :

	 UN PROGRAMME JAVA a au dessus de sa structure des packages(dossiers) qui contiennent des classes(fichiers) qui contiennent des fontions(methodes) qui constituent le comportement de nos classes.
	  (/**Commentaire*/)generer de la Javadoc a generer en HTML.
	  aucune logique dans la methode main : donc il faut toujours renommer le methode en mettant en nom qui sera comprehensible par tout developpeur.



LA PROGRAMMATION ORIENTE OBJET:  NOTION DE CLASSES, OBJETS,ATTRIBUTS

    La POO c'est quoi?
        Une variable c'est une combinaison de valeur,de nom et de type. parfois une variable ne suffit pas:
     exemple: Compte sur une application de rencontre 
       Nom:String, age:int, genre:String, mot de passe:String, taille: float ...
    ca en fait beaucoup des variables et de types!
     Creer un grand type COMPTE(nom,age,genre,...) rend la vie facile!
     C'est la PROGRAMMATION ORIENTEE OBJET
  

LA PORTEE DES VARIABLES: est son perimetre d'acces(accessibilite): est la zone ou la variable a ete declaree

       une variable est DECLAREES et ACCESSIBLE dans un contexte bien precis.
    exemple: un carton dans une chambre ne peut etre accessible depuis les autre pieces de la maison. il faut avoir les cles pour avoir acces a la variable(carton).
    
    on a: 
    la PORTEE GLOBALE:elle peut etre accessible dans toutes les methodes de la classe;dans tous les sous-blocs de code la zone.
    exemple: une variable(tele) qui est declare au salon peut etre utiliser dans la chambre et dans autre pieces de la maison.
    
    la PORTEE LOCALE: elle est uniquement accessible dans la methode qui l'a declare; dans le seul bloc de code de la zone.
    exemple: une variable(fer a repasse) qui est declare dans la chambre,ne peut etre utiliser dans d'autres pieces de la maison (pour l'utiliser il faut etre dans la chambre).

    une variable est aussi caracterise par un NIVEAU D'ACCES.
    exemple: ma maison a un salon et deux chambres, une personne exterieure peut acceder au que si elle a la cle du salon sans avoir la cle des chambres; un autre niveau d'acces cette meme personne peut acceder a une des chambres ssi on lui donne la cle de cette chambre.

    le niveau d'acces limite ou etend l'accessibilite grace a des mots cles a savoir:
    PUBLIC: c-a-d la variable peut etre visible par tous autre classe qui se situe dans le projet java ou a exterieur du dit projet.
    PROTECTED: c-a-d la variable peut etre accessible par ces 3 situations[depuis la classe qui a declarer la variable,depuis les classes et sous-classes(sous-classe :est une classe fille qui herite de tout les proprietes d'une classe mere.)de la classe declarente qui se situe dans le meme packaque que la classe declarente,les sous classes de la classe declarente qui se situe dans un autre package].
    PACKAGE-PROTECTED:lorsq'une variable est declaree ainsi ce qui est parametres par defaut: visible uniquement pour la classe declarante : ce cas est effectue quand on ne mets pas de niveau d'acces au niveau de la variable.
    PRIVATE: c-a-d la variable sera accessible uniquement a l'interieur de la classe declarante.

ILLUSTRATION DES NOTIONS DE VARIABLE GLOBALE ET LOCALES:

    completion: est une variable globale, parce qu'elle est utilisee dans les methodes sayHello et sayBay.
    welcomeMessage: est une variable locale ,parce qu'elle est utiliser dans la methode sayHello et ne peut etre utiliser dans d'autres methodes(exple: la methode sayBay).


UTILISATION DES BOUCLES:

    une boucle permet de repeter une instruction ou un ensemble d'instruction un nombre connu ou inconnu de fois.
Les types de boucles sont:

DENOMBREMENT: for:

    (elles sont utilisees lorsqu'on connais a l'avance combien de fois l'on veut effectuer la boucle)
                   exemple:Sauter a 5 reprises; Ajouter 2 points en plus a la note de chaque eleves.
        UNE ITERATION: est une repetition d'un bloc de code dans une boucle
     les boucles for: syntaxe
          for (initialisation; terminaison; incrementation)
           {
               // liste d'operations sur l'element traite
            }
illustration:exemple

           for (int i=0; i<5; i++){
                System.out.println("Je saute!");
            }

      Les boucles for: Syntaxe avancee
           for (element traite: collection d'elements){
                  //liste d'operations sur l'element traite
             }
        Exemple:
              for (Eleve eleve:tableauDesEleves) {
                    eleve.points += 2 ;
               }

Les boucles conditionnelles: while  | do ... while

    (elles sont utilisees losqu'on ne sait a l'avance combien de fois l'on veut effectuer la boucle)
         exemple: faire entrer les eleves jusqu'a ce que la salle soit pleine.

     la boucle while: Syntaxe	

         while(les conditions d'arret ou expression booleen ou logique){
                //operation tant que l'expression logique est vraie
          }

     si l'expression logique est fausse d'entree de jeu  alors on opere aucune fois c-a-d on entree jamais dans la boucle. 
        exemple:   while( salle.size>0){
                        ajouterEleve();
                      }

     la boucle do ... while: Syntaxe	

        do{
            // operer tant que l'expression logique est vraie
         }while(expresssionLogique)

     ici on opere au moins deux fois
     exemple:      int noombreSaut = 5;
                    do{
                      System.Out.Println("sauter");
                       nombresaut-1;
                     }while(nonmbreSaut > 0	)

Pour commenter un code taper: Ctrl+/ (il commente le code ligne par ligne)
                              Ctrl+Shift+/ (il commente le code par bloc)