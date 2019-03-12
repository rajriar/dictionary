
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rajdeep
 */
public class Assignment01 {

    //create enum classes to store raw data
    //each enum class refers to the sample output
    //to add more entries simply make a new enum class w/same constructure, create new arraylist to store values then add to hashmap
    enum CSC210 {
        ADJECTIVE1("CSC210 [adjective] : Comfortable with Objects and Classes"),
        ADJECTIVE2("CSC210 [adjective] : Ready for CSC 220"),
        NOUN("CSC210 [noun]Intro to Java "),
        VERB("CSC210 [verb] : To learn Java");

        private String value;

        CSC210(String s) {
            this.value = s;
        }

        public String getValue() {
            return value;
        }
    };

    enum CSC220 {
        ADJECTIVE("CSC220 [adjective} : Ready to create complex data structures"),
        NOUN("CSC220 [noun] : Data Structures"),
        VERB("CSC220 [verb] : To create data structures");

        private String value;

        CSC220(String s) {
            this.value = s;
        }

        public String getValue() {
            return value;
        }
    };

    enum ADJECTIVE {
        NOUN("Adjective [noun] : Adjective is a word that describes a person or thing, for example big, red and cleaver in a big house, red wine and a clever idea");

        private String value;

        ADJECTIVE(String s) {
            this.value = s;
        }

        public String getValue() {
            return value;
        }

    }

    enum CSC340 {
        ADJECTIVE("CSC340 [adjective] : = C++ version of CSC210 + CSC220 + more"),
        NOUN1("CSC340 [noun] : A CS upper division course"),
        NOUN2("CSC340 [noun] : Many hours outside of class"),
        NOUN3("CSC340 [noun] : Programming Methodology");

        private String value;

        CSC340(String s) {
            this.value = s;
        }

        public String getValue() {
            return value;
        }
    };

    enum CONJUNCTION {
        NOUN("Cunjunction [noun] : Conjunction is a word that joins words, phrases or sentences, for example 'and, 'but', 'or'.");

        private String value;

        CONJUNCTION(String s) {
            this.value = s;
        }

        public String getValue() {
            return value;
        }
    };

    //parts of speech only
    //DIFFERENT FROM PLACEHOLDER
    enum PartOfSpeech {
        ADJECTIVE("Placeholder [adjective] : To be updated..."),
        ADVERB("Placeholder [adverb] : To be updated..."),
        CONJUNCTION("Placeholder [conjunction] : To be updated..."),
        INTERJUNCTION("Placeholder [interjunction] : To be updated..."),
        NOUN("Placeholder [noun] : To be updated..."),
        PREPOSITION("Placeholder [preposition] : To be updated..."),
        PRONOUN("Placeholder [pronoun] : To be updated..."),
        VERB("Placeholder [verb] : To be updated...");

        private String value;

        PartOfSpeech(String s) {
            this.value = s;
        }

        public String getValue() {
            return value;
        }
    };

    enum placehOLder {
        ADJECTIVE("Placeholder [adjective] : To be updated..."),
        ADJECIVE1("Placeholder [adjective] : To be updated..."),
        ADVERB("Placeholder [adverb] : To be updated..."),
        CONJUNCTION("Placeholder [conjunction] : To be updated..."),
        INTERJUNCTION("Placeholder [interjunction] : To be updated..."),
        NOUN("Placeholder [noun] : To be updated..."),
        NOUN1("Placeholder [noun] : To be updated..."),
        NOUN2("Placeholder [noun] : To be updated..."),
        PREPOSITION("Placeholder [preposition] : To be updated..."),
        PRONOUN("Placeholder [pronoun] : To be updated..."),
        VERB("Placeholder [verb] : To be updated...");

        private String value;
        private String p;

        placehOLder(String s) {
            this.value = s;
        }

        public String getValue() {
            return value;
        }
    };

    enum OOPS {
        OOPS("<2nd argument must be a part of a speech or \"distinct\">");

        private String value;

        OOPS(String s) {
            this.value = s;
        }

        public String getValue() {
            return value;
        }
    };

    enum VERB {
        Noun("Verb [noun] : Verb is a word or group of words that expresses an action (such as eat), an event (such as happen) or a state (such as exist)");
        private String value;

        VERB(String s) {
            this.value = s;
        }

        public String getValue() {
            return value;
        }
    };

    enum BOOKABLE {
        ADJECTIVE("Bookable [adjective] : Can be ordered in advance.");

        private String value;

        BOOKABLE(String s) {
            this.value = s;
        }

        public String getValue() {
            return value;
        }

    };

    enum EXIT {
        NOTFOUND("<Not Found>"),
        EXIT("-----THANK YOU-----");

        private String value;

        EXIT(String s) {
            this.value = s;
        }

        public String getValue() {
            return value;
        }
    }

    enum INTERJECTION {
        NOUN("Interjection [noun] : Interjection is a short sound, word or phrase spoken suddenly to express an emotion. Oh!, Look out! and Ow! are interjections");

        private String value;

        INTERJECTION(String s) {
            this.value = s;
        }

        public String getValue() {
            return value;
        }
    }

    enum BOOK {
        Noun1("Book [noun] : A set of pages."),
        Noun2("Book [noun] : A written work published in printed or electronic form."),
        Verb1("Book [verb] : To arrange for someone to have a seat on a plane."),
        Verb2("Book [verb] : To arrange something on a particular date.");
        private String value;

        BOOK(String s) {
            this.value = s;
        }

        public String getValue() {
            return value;
        }
    }
    //----------------------------------- END OF RAW ENUM DATA----------------------------------------------
    //what does it mean to place static in

    public static void main(String[] args) {

        System.out.println("! Loading data...");
        System.out.println("");

        //use data structure of an arrayList
        //"transfer" all the raw data from enum classes VALUES and put it inside arrayList
        //once all the VALUES are in the array list make a hashmap with KEY VALUE PAIR
        //csc210
        List<String> csc210 = new ArrayList<>();
        Arrays.stream(CSC210.values()).forEach(PartOfSpeech -> csc210.add(PartOfSpeech.value));

        //csc210 noun
        List<String> csc210noun = new ArrayList<>();
        csc210noun.add(CSC210.NOUN.getValue());

        //csc210 adjective
        List<String> csc210adjective = new ArrayList<>();
        csc210adjective.add(CSC210.ADJECTIVE1.getValue());
        csc210adjective.add(CSC210.ADJECTIVE2.getValue());
        //csc210 verb
        List<String> csc210verb = new ArrayList<>();
        csc210verb.add(CSC210.VERB.getValue());

        //csc220
        List<String> csc220 = new ArrayList<>();
        Arrays.stream(CSC220.values()).forEach(PartOfSpeech -> csc220.add(PartOfSpeech.value));
        
        //csc220 noun
        List<String> csc220noun = new ArrayList<>();
        csc220noun.add(CSC220.NOUN.getValue());
        
        //csc220 verb
        List<String> csc220verb = new ArrayList<>();
        csc220verb.add(CSC220.VERB.getValue());
        
        //csc220 adj
        List<String> csc220adjective = new ArrayList<>();
        csc220adjective.add(CSC220.ADJECTIVE.getValue());
        
                
        //csc340
        List<String> csc340 = new ArrayList<>();
        Arrays.stream(CSC340.values()).forEach(PartOfSpeech -> csc340.add(PartOfSpeech.value));

        //csc340 noun
        List<String> cSC340noun = new ArrayList<>();
        cSC340noun.add(CSC340.NOUN1.getValue());
        cSC340noun.add(CSC340.NOUN2.getValue());
        cSC340noun.add(CSC340.NOUN3.getValue());

        //csc340 adj
        List<String> cSC340adjective = new ArrayList<>();
        cSC340adjective.add(CSC340.ADJECTIVE.getValue());

        //adjective
        List<String> adjective = new ArrayList<>();
        adjective.add(PartOfSpeech.ADJECTIVE.value);
        adjective.add(PartOfSpeech.ADJECTIVE.value);

        //adjective noun
        List<String> adjectiveNoun = new ArrayList<>();
        adjectiveNoun.add(ADJECTIVE.NOUN.getValue());

        //create list for PartOfSpeech
        List<String> posList = new ArrayList<>();
        posList.add(PartOfSpeech.ADJECTIVE.value);
        posList.add(PartOfSpeech.ADJECTIVE.value);
        posList.add(PartOfSpeech.ADVERB.value);
        posList.add(PartOfSpeech.CONJUNCTION.value);
        posList.add(PartOfSpeech.INTERJUNCTION.value);
        posList.add(PartOfSpeech.NOUN.value);
        posList.add(PartOfSpeech.NOUN.value);
        posList.add(PartOfSpeech.NOUN.value);
        posList.add(PartOfSpeech.PREPOSITION.value);
        posList.add(PartOfSpeech.PRONOUN.value);
        posList.add(PartOfSpeech.VERB.value);

        //create list for distinct use advanced for ea loop
        List<String> distinctList = new ArrayList<>();
        Arrays.stream(PartOfSpeech.values()).forEach(PartOfSpeech -> distinctList.add(PartOfSpeech.value));

        //placeholder
        List<String> placeholder = new ArrayList<>();
        Arrays.stream(placehOLder.values()).forEach(PartOfSpeech -> placeholder.add(PartOfSpeech.value));

        //book
        List<String> book = new ArrayList<>();
        Arrays.stream(BOOK.values()).forEach(value -> book.add(value.value));

        //book noun
        List<String> booknoun = new ArrayList<>();
        booknoun.add(BOOK.Noun1.getValue());
        booknoun.add(BOOK.Noun2.getValue());

        //book verb
        List<String> bookverb = new ArrayList<>();
        bookverb.add(BOOK.Verb1.getValue());
        bookverb.add(BOOK.Verb2.getValue());

        //conjunction
        List<String> conjunction = new ArrayList<>();
        conjunction.add(CONJUNCTION.NOUN.getValue());

        //noun
        List<String> noun = new ArrayList<>();
        noun.add(PartOfSpeech.NOUN.value);
        noun.add(PartOfSpeech.NOUN.value);
        noun.add(PartOfSpeech.NOUN.value);

        //noun distinct
        List<String> nounDistinct = new ArrayList<>();
        nounDistinct.add(PartOfSpeech.NOUN.value);

        //bookable
        List<String> bookable = new ArrayList<>();
        bookable.add(BOOKABLE.ADJECTIVE.getValue());

        //interjection noun
        List<String> interjectionNoun = new ArrayList<>();
        interjectionNoun.add(INTERJECTION.NOUN.getValue());

        //verb
        List<String> verb = new ArrayList<>();
        Arrays.stream(VERB.values()).forEach(value -> verb.add(value.value));

        //exit
        List<String> exit = new ArrayList<>();
        exit.add(EXIT.EXIT.getValue());

        //not found
        List<String> notFound = new ArrayList<>();
        notFound.add(EXIT.NOTFOUND.getValue());

        //at this point in the program, all the VALUES are stored inside arrayLists
        //create a dictionary by using hashmap data structure
        //use (key,value) pairs to create it
        //key being what the user will input or enum keys, and the values being the arrayLists
        //use .put() function to add stuff to hashmap
        Map<String, List<String>> myBook = new HashMap<>();

        myBook.put("", posList);
        myBook.put("distinct", distinctList);
        myBook.put("noun", noun);
        myBook.put("noundistinct", nounDistinct);
        myBook.put("adjective", adjective);
        myBook.put("oops", Arrays.asList(OOPS.OOPS.getValue()));
        myBook.put("csc210", csc210);
        myBook.put("csc210noun", csc210noun);
        myBook.put("csc210adjective", csc210adjective);
        myBook.put("csc210verb", csc210verb);
        myBook.put("csc220", csc220);
        myBook.put("csc220noun", csc220noun);
        myBook.put("csc220verb", csc220verb);
        myBook.put("csc220adjective", csc220adjective);
        myBook.put("csc340", csc340);
        myBook.put("csc340noun", cSC340noun);
        myBook.put("csc340adjective", cSC340adjective);
        myBook.put("placeholder", posList);
        myBook.put("verb", verb);
        myBook.put("verbnoun", verb);
        myBook.put("conjunction", conjunction);
        myBook.put("book", book);
        myBook.put("booknoun", booknoun);
        myBook.put("bookverb", bookverb);
        myBook.put("bookable", bookable);
        myBook.put("interjectionnoun", interjectionNoun);
        myBook.put("bookable", bookable);
        myBook.put("adjectivenoun", adjectiveNoun);
        myBook.put("exit", exit);
        myBook.put("notFound", notFound);

        //print out loading and loading complete 
        //top of the program
        System.out.println("! Loading completed...");
        System.out.println("");
        System.out.println("-----DICTIONARY 340 JAVA-----");
        System.out.println("");

        //Taking the input search parameter from user and displaying the required data from the dictionary using the search key
        while (true) {
            Scanner reader = new Scanner(System.in);
            String userInput = null;
            String searchString = null;
            System.out.print("Search: ");
            userInput = reader.nextLine().toLowerCase();

            //make the user input a string array and split it by a space
            //when the strings are split you can see how many arguments are taken
            //then display based off of each arguments
            String[] arr = userInput.split(" ");
            if (arr.length == 1) {
                searchString = arr[0];
                displaySearch(searchString, null, myBook);
            } else if (arr.length == 2) {
                if (arr[0].equalsIgnoreCase("placeholder")) {
                    searchString = arr[1];
                } else {
                    searchString = arr[0] + arr[1];
                }
                displaySearch(searchString, null, myBook);
            } else if (arr.length == 3) {
                if (arr[0].equalsIgnoreCase("placeholder")) {
                    searchString = arr[1];
                } else {
                    searchString = arr[0] + arr[1];
                }
                displaySearch(searchString, arr[2], myBook);
            }
        }
    }

    //create a method which takes displays search results
    //build in a quit program option
    //build in a not found option
    //ignore certain cases by using equalIgnoreCase(("String"))
    //use hashmap functions containsKey to compare etc..
    //refer to paper outline
    public static void displaySearch(String name, String arg2, Map myBook) {
        System.out.println("   |");
        List<String> searchResult = null;
        if (name.equalsIgnoreCase("!Q")) {
            searchResult = (List<String>) myBook.get("exit");
        } else if (myBook.containsKey(name)) {
            searchResult = (List<String>) myBook.get(name);
        } else {
            searchResult = (List<String>) myBook.get("notFound");
        }

        if (arg2 != null && arg2.equalsIgnoreCase("distinct")) {
            new HashSet<>(searchResult).stream().forEach(s -> {
                System.out.print("     ");
                System.out.println(s);
            });
        } else {
            searchResult.stream().forEach(s -> {
                System.out.print("     ");
                System.out.println(s);
            });
        }

        System.out.println("   |");
        if (name.equalsIgnoreCase("!Q")) {
            System.exit(0);
        }
    }
}
