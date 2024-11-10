package com.javaprograms.Poly;

public class Game {
public String gamename="cricket";
private int teamsize=15;
protected double salary=40000;
protected void printsal() {
	System.out.println("printing protected value: "+salary);
	
}
public void PlayGame() {
	System.out.println("I am playing game:" +gamename);

}
private void playprivateGame() {
	System.out.println("i am playing game :"+gamename);
}
}
