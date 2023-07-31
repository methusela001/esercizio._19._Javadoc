package org.example;
/* Create a class called WordGames that has two methods:
   addHelloWord method that takes one parameter as input called word and returns the String Hello [wordHere]
   getFullName method that takes two parameters as input called name and surname and returns their concatenation
   create a class called Tester that has the main method where you:
   create a new WordGames object
   print in console the result of the addHelloWord method invocation
   print in console the result of the getFullName method invocation
   add Javadoc comments to:
   the 2 classes with a short description and the author
   the 3 methods with a short description, the parameters and the return */

/**
 * In questa classe ho istanziato due metodi addHelloWord e getFullName dove ho richiamato dei parametri String
 * che ritornano una concatenazione di stringhe
 *
 * @Autore: Methusela Fernando
 */
public class WordGames {
    /**istanzio il metodo addHelloWord
     che mi ritorna la String "Hello" + la String word */
    public String addHelloWord(String word) {
        return "Hello " + word;
    }

    /**istanzio il metodo getFullName
     dove combino e voglio che mi tornino
     concatenate le stringhe fS e lS*/
    public String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;

    }
}
