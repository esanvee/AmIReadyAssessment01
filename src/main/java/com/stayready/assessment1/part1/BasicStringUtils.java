package com.stayready.assessment1.part1;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return null;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        
        String result = new StringBuilder(str).reverse().toString();

        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {

        String[] sentence = str.split(" ");
        String result = "";

        for (String word: sentence){
            result += reverse(word) + " ";

        }
        result = result.trim(); //clean up

        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        String sentence = "";
        String result = "";

        sentence = reverse(str);
        

        String[] sentenceAry = sentence.split(" ");
        

        for (String word: sentenceAry){
            
            String newWord = word.substring(0,1).toUpperCase() + word.substring(1);
            result += newWord + " ";


        }
        result = result.trim(); //clean up

        return result;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        String result = "";
        String[] sentence = str.split(" ");
        
        result += sentence[0].substring(1) + " ";

        for (int i = 1; i < sentence.length-1; i++){
            result += sentence[i] + " ";
        }
        

            String lastWord= sentence[sentence.length-1];
            lastWord = lastWord.substring(0, lastWord.length()-1);
            result += lastWord;

   

        return result;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++){

            char letter = str.charAt(i);

            if (letter >= 'A' && letter <= 'Z') {
                //Is upper case
                result += String.valueOf(letter).toLowerCase();;
            }
            else if(letter >= 'a' && letter <= 'z'){
                //Is lower case
                result += String.valueOf(letter).toUpperCase();;
                
            }else{
                result += letter;
            }
        }


        return result;
    }

}
