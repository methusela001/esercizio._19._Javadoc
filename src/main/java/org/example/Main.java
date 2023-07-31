package org.example;
//create a class called Tester that has the main method where you:
//create a new WordGames object
//print in console the result of the addHelloWord method invocation
//print in console the result of the getFullName method invocation
//add Javadoc comments to:
//the 2 classes with a short description and the author
//the 3 methods with a short description, the parameters and the return

/**
 * In questa classe ho creato un obj wordGames che richiama i metodi addHelloWord e getFullName della classe WordGames
 * e li stampa in console
 *
 * @Autore: Andrea Zora
 **/
public class Main {
    /**
     * dopo aver creato la classe tester in un main method creo un nuovo obj WordGames
     */
    public static void main(String[] args) {
        /** nell' obj wordGames ho richiamato i due metodi addHelloWord e getFullName per stampare in console */
        WordGames wordGames = new WordGames();
        System.out.printf(wordGames.addHelloWord("boy! I'm "));
        System.out.println(wordGames.getFullName("John", "Smith"));
    }
}
