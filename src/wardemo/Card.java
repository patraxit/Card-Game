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
public class Card{


private String suit;
private String rank;
private int value;

 
public Card(){
}

 
public Card(String suit, String rank){
this.suit = suit;
this.rank = rank;
  
 
if(rank.equals("2")){
value = 2;
}
else if(rank.equals("3")){
value = 3;
}
else if(rank.equals("4")){
value = 4;
}
else if(rank.equals("5")){
value = 5;
}
else if(rank.equals("6")){
value = 6;
}
else if(rank.equals("7")){
value = 7;
}
else if(rank.equals("8")){
value = 8;
}
else if(rank.equals("9")){
value = 9;
}
else if(rank.equals("10")){
value = 10;
}
else if(rank.equals("Jack")){
value = 11;
}
else if(rank.equals("Queen")){
value = 12;
}
else if(rank.equals("King")){
value = 13;
}
else if(rank.equals("Ace")){
value = 14;
}
 
}

 
public String getSuit(){
return suit;
}

public String getRank(){
return rank;
}

public int getValue(){
return value;
}
 
public void setSuit(String suit){
this.suit = suit;
}

public void setRank(String rank){
this.rank = rank;
}

public void setValue(int value){
this.value = value;
}
 

public String toString(){  
return rank + " " + suit;
}

public Card copy(Card card){  
Card temp = new Card (card.getSuit(), card.getRank());
return temp;
}

public int isGreater(Card card){  
int temp;
if (value > card.getValue()){  
temp = 1;
}
else if (value < card.getValue()){  
temp = 2;
}
else {  
temp = 3;
}
return temp;  
}
}
