package main.thread_unisul;

public class Principal {
public static void main(String args[]) {
Trabalhador severino = new Trabalhador("sapato", 100);
Trabalhador raimundo = new Trabalhador("bota", 500);
Trabalhador roberto = new Trabalhador("sandália", 250);
severino.start();
raimundo.start();
roberto.start();
}
}