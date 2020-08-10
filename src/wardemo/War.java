/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wardemo;

/**
 *
 * @author Dua
 */
import java.util.Scanner;  
import java.util.ArrayList; 
public class War{
    
    
public static void war(){  
System.out.println("--------------------------------------Round over-------------------------------------------");
}

public static void endwar(){  
System.out.println("---------------------------------Another round started-------------------------------------");
}

public static void shift(ArrayList<Card> warDeck) {  
warDeck.add(warDeck.get(3));
warDeck.remove(3);
warDeck.add(2, warDeck.get(7));
warDeck.remove(7);
}

public static void divideDeck(ArrayList<Card> Deck1, ArrayList<Card> Deck2, Deck deck){  
for (int x = 0; x < 26; x++){
Deck1.add(deck.getFromShuffledDeck(x));
Deck2.add(deck.getFromShuffledDeck(x+26));
}
}

public static void warDeckTransfer(ArrayList<Card> Deck1, ArrayList<Card> Deck2, ArrayList<Card> warDeck){  
for (int y = 0; y < 4 && Deck1.size() < 48; y++){
warDeck.add(Deck1.get(0));
Deck1.remove(0);
}
for (int y = 0; y < 4 && Deck2.size() < 48; y++){
warDeck.add(Deck2.get(0));
Deck2.remove(0);
}
}
    
public static void main(String[] args){
Scanner scan = new Scanner(System.in); 
  
 
String player1;
String player2;
String option;
String roundwinner = "";
String gamewinner = "";
  
 
int temp;
int play = 1;
  
 
boolean winner;
  
while (play != 0){ 
winner = false; 
Deck deck = new Deck();  
deck.shuffle();  


ArrayList<Card> Deck1 = new ArrayList<>(56);
ArrayList<Card> Deck2 = new ArrayList<>(56);
ArrayList<Card> warDeck = new ArrayList<>(9);
divideDeck(Deck1, Deck2, deck);  
 
System.out.println("Welcome to WAR! Let's Play!\n");
System.out.print("Enter the name of the first player: ");
player1 = scan.nextLine();
System.out.print("Enter the name of the second player: ");
player2 = scan.nextLine();
System.out.println(player1 + "\t\t\t" + player2 + "\t\t\tWinner");
 

while (!winner){  
System.out.print(Deck1.get(0) + " \t" + Deck1.size() + "\t\t" + Deck2.get(0) + " \t" + Deck2.size() + "\t\t");  
int x = Deck1.get(0).isGreater(Deck2.get(0));
if (x == 1){ 
Deck1.add(Deck2.get(0));
Deck1.add(Deck1.get(0));
Deck1.remove(0);
Deck2.remove(0);
roundwinner = player1;
}
if (x == 2){ 
Deck2.add(Deck1.get(0));
Deck2.add(Deck2.get(0));
Deck2.remove(Deck2.get(0));
Deck1.remove(0);
roundwinner = player2;
}
if (x == 3)  
roundwinner = "WAR";
System.out.println(roundwinner);
if (x == 3){  
roundwinner = "WAR";
System.out.println(roundwinner);
war();
System.out.print(Deck1.get(0) + " \t" + Deck1.size() + "\t\t" + Deck2.get(0) + " \t" + Deck2.size() + "\t\t");
if (Deck1.size() <= 4){  
roundwinner = player2;
System.out.println(roundwinner);
endwar();
gamewinner = player2;
break; 
}
else if (Deck2.size() <= 4){ 
roundwinner = player1;
System.out.println(roundwinner);
endwar();
gamewinner = player1;
break;  
}

warDeckTransfer(Deck1, Deck2, warDeck); 
temp = warDeck.get(3).isGreater(warDeck.get(7));

 if(temp == 1){  
while (warDeck.size() != 0) {
Deck1.add(warDeck.get(0));
warDeck.remove(0);
roundwinner = player1;
}
}
else if (temp == 2){  
while (warDeck.size() != 0){
Deck2.add(warDeck.get(0));
warDeck.remove(0);
roundwinner = player2;
}
}
//^
  
else{  
shift(warDeck);  
temp = warDeck.get(3).isGreater(warDeck.get(7));

 
if (temp == 1){  
while (warDeck.size() != 0){
Deck1.add(warDeck.get(0));
warDeck.remove(0);
roundwinner = player1;
}
}
else if (temp == 2){  
while (warDeck.size() != 0){
Deck2.add(warDeck.get(0));
warDeck.remove(0);
roundwinner = player2;
}
}
 
}
System.out.println(roundwinner);
endwar();
}
if (Deck1.size() == 10){  
gamewinner = player1;
winner = true;
}
if (Deck2.size() == 10){ 
gamewinner = player2;
winner = true;
}
}


System.out.println(gamewinner + " is the WINNER!");
System.out.print("Play again (y/n)? ");


option = scan.nextLine().toLowerCase();
option = "" + option.charAt(0);
while (!(option.equals("y") || option.equals("n"))){  
System.out.print("Invalid option. Please enter y or n: ");
option = scan.nextLine().toLowerCase();
option = "" + option.charAt(0);
}
if (option.equals("y")){  
play = 1;
System.out.println();
}
else{  
play = 0;
}
} 
System.out.print("Bye! Take care");
}

}
