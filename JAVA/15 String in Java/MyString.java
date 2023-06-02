// String in Java 2023.06.02

import java.lang.annotation.Target;

public class MyString{
    public static void main(String args[]){
        String name1 = "Vithusan";
        String name2 = "vithusan";

        System.out.println("Name1 : " + name1);
        System.out.println("Name2 : " + name2);

        // print memory address
        System.out.println("Name1 : " + name1.hashCode());
        System.out.println("Name2 : " + name2.hashCode());

        // check equality
        System.out.println("Equals : " + name1.equals(name2));

        //check equality by ignoring Case which means omitting Capitalize or small
        System.out.println("Equals Ignore Case : " + name1.equalsIgnoreCase(name2));

        // find length
        System.out.println("Length of Name 1 : " + name1.length());

        // find a particular index
        System.out.println("charAt : " + name1.charAt(0));

        // change all letters to Uppercase
        System.out.println("Upper Case of Name 1 : " + name1.toUpperCase());

        // change all letters to small case
        System.out.println("Lower Case of Name 1 : " + name1.toLowerCase());

        // find and replace a word
        String word = "Please locate where 'locate' occurs";
        System.out.println("Replace : " + word.replace("locate", "Hello"));

        // find a particular word using contains or indexOf
        System.out.println("Find word : " + word.contains("occurs")); // this methode find that word there is or not
        System.out.println("Find word Using indexOf methode : " + word.indexOf("Please")); // this methode shows index of that word

        // check a string is it empty or not
        String word2 = "";
        System.out.println("Empty : " + word.isEmpty());
        System.out.println("Empty : " + word2.isEmpty());

        // find a word or string start with a particular letter and ends with a particular letter
        System.out.println("StartWith : " + name1.startsWith("Vi"));
        System.out.println("StartWith : " + name1.startsWith("i"));
        System.out.println("EndWith : " + name1.endsWith("an"));
        System.out.println("EndWith : " + name1.endsWith("a"));

        // cut string part by part using substring
        System.out.println("substring : " + name2.substring(2));
        System.out.println("substring : " + name2.substring(2,3));

        // convert char array
        char[] carray = name1.toCharArray();
        for(char c:carray){
            System.out.print(c + "  ");
        }

        // remove unwanted space using trim methode
        String name3 = " Nila ";
        System.out.println("\nLength of Name 3 : " + name3.length());
        System.out.println("Trim Name 3 : " + name3.trim());
        System.out.println("Trim Length of Name 3 : " + name3.trim().length());
    }
}