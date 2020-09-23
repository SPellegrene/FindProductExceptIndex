import java.util.HashSet;


/*
 * My goals is to find the first recurring string within a string.
 *       - I want to achieve a worst case time complexity of O(n). [linear]
 *       - I want to allow duplicates so I will use a Hashset.
 *       - I want to return as soon as the first character achieves a value greater than 1
 * */

public class RecurringString {

    static char iterateString(String str) {
        char[] ch = str.toCharArray(); //convert string to character array
        HashSet<Character> count = new HashSet<>(); //create hashset with character type

        for (int i = 0; i <= ch.length-1; i++) { //loop through each character in array
            char c = ch[i];
            if (count.contains(c)) { //if the hashset contains the character
                return c; //print the character
            } else {
                count.add(c); //else add it to the hashset
            }
        }
        return '\0'; //return once the first character in the set achieves a value greater than 1
    }

    public static void main(String[] args) {
        String testString1 = "DABCTDBB";
        String testString2 = "DTTYLOMNWDYTTJK";
        System.out.println(iterateString(testString1));
        System.out.println();
        System.out.println(iterateString(testString2));
    }
}

