/*
 * This class was created as a coding example by Jay Silverthorn.
 */

package permutations;

/**
 *
 * @author jaysilverthorn
 */
public class Anagram {

    /**
     * @param args the command line arguments - args[0] is anagram string
     */
    public static void main(String[] args) {

        String anagram;
        
        if (args.length >= 1) {
            
            anagram = args[0];
 
        } else {
            
            System.out.println("Enter an argument for Anagram");

            // Default anagram if no string given on command line
            
            anagram = "test";
        } 

        Permutations perm = new Permutations();

        perm.echoPermutations(anagram);

    }
}
