package cd.get.ready.algorithms;
/*
Froilan started a second job walking dogs!
 Normally he can walk one dog at a time but he can walk two if the dogs are the same size.
 Provided an array of dog sizes, how many walks will Frolian have to make?

For example, if the dogs Froilan had to walk are [1, 1, 3, 2, 3] then it would take him 3 hours.
He could walk two size 1 dogs together, two size 3 dogs together, and the size 2 dog by itself.
 */
import java.util.*;
public class DogWalker {
    public int numberOfWalksCalculator(int[] dogSizes)
    {
        int numberOfWalks = 0;
        HashSet<Integer> set = new HashSet<>();

        //Go through the array
        for (int i = 0; i < dogSizes.length; i++)
        {
            // If not present in array, then put it in hashtable and add its count onto numberOfWalks
            if (!set.contains(dogSizes[i]))
            {
                set.add(dogSizes[i]);
                numberOfWalks++;
            }
        }
        return numberOfWalks;
    }

}
