/*
 * This class was created as a coding example by Jay Silverthorn.
 */

package permutations;

import java.util.*;

/**
 *
 * @author jaysilverthorn
 */

class Permutations {

    private Set anagramSet = new HashSet();

    /**
     *
     * Print the complete anagram for a given input string.
     *
     * @param inputString the base string to derrive all unique permutations
     *
     * @return nothing
     *
     */
    public void echoPermutations(String inputString) {

        if (inputString == null) return;

        anagramSet.clear();

        ArrayList charList;

        charList = new ArrayList();

        Character chWrapper;

        for (int i=0; i<inputString.length(); i++) {

            chWrapper = new Character(inputString.charAt(i));

            charList.add(chWrapper);
        }

        recurse("", inputString, charList);

    }


    private void recurse(String pre, String post, ArrayList charList) {

        // First check for terminating condition for recursion.  In this case
        // there is no more input string to process.

        if (post.length() <= 0)  {

            String newWord = pre + post;

            /* Add each string to a Set Collection.  This is used as a test
             * for uniquemess as duplicates are not allowed in the Java
             * Set Collection.  A public method could be added to request the
             * andagramSet directly as an alternative to just printing to the
             * console.
            */

            if (anagramSet.add(newWord)) {
            
                System.out.println(newWord);
            }

            return;
        }

        /* Not at the end of the input string, so start with first characher in
         * string.
         *
         * Loop through all alternatives of the first character as saved in the
         * charList array.  The charList is updated by removing each character
         * from the list as it is used.
         *
         * Each subsequent call to recurse() then works with the remaining
         * characters not yet used moving from left to right.
         * Duplicate characters must be allowed but only counted for
         * for each unique anagram (I don't want to print one I found already).
         * I perform this check in the termination case by using the uniqueness
         * property of the Java Set Collection.
        */

        String newPost = (post.subSequence(1, post.length())).toString();

        // Loop through all possible characters from input string
        // These where saved in the charList

        for (int i=0; i<charList.size(); i++) {
            
            // Run through all the possibilities of the next leftmost char.
            // Each call to recurse() tracks the next left-most position
            // until the entire input string has been exhausted.

            String newPre = pre;

            Character chW = (Character) charList.get(i);

            newPre += chW.toString();
            
            ArrayList newCharList = (ArrayList) charList.clone();

            newCharList.remove(i);

            recurse(newPre, newPost, newCharList);
        }

    }

}