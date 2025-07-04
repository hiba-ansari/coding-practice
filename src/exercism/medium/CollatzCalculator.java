package exercism.medium;

/*
https://exercism.org/tracks/java/exercises/collatz-conjecture/edit

Given a positive integer, return the number of steps it takes to reach 1 according to the rules of the Collatz
Conjecture:
If it's even, divide it by 2.
If it's odd, multiply it by 3 and add 1.
 */
class CollatzCalculator {
    int computeStepCount(int start) {
        //error handling
        if (start <= 0) {
            throw new IllegalArgumentException("Only positive integers are allowed");
        }

        //computation
        int steps = 0;

        while (start != 1) {
            if (start % 2 == 0) {
                start /= 2;
                steps++;
            }
            else {
                start = (start * 3) + 1;
                steps++;
            }
        }

        return steps;
    }

}

