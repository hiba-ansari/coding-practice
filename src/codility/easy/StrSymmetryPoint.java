package codility.easy;

/*
Write a function:

class Solution { public int solution(String S); }

that, given a string S, returns the index (counting from 0) of a character such that the part of the string to the left
of that character is a reversal of the part of the string to its right. The function should return −1 if no such index
exists.

Note: reversing an empty string (i.e. a string whose length is zero) gives an empty string.

For example, given a string:
"racecar"
the function should return 3, because the substring to the left of the character "e" at index 3 is "rac", and the one to
the right is "car".

Given a string:
"x"
the function should return 0, because both substrings are empty.

Write an efficient algorithm for the following assumptions:
- the length of string S is within the range [0..2,000,000].
 */
public class StrSymmetryPoint {
    public int solution(String S) {
        int index;

        if (S.length() == 1) {
            return 0;
        }
        else if (S.length() % 2 != 0) { //odd number, middle char exists
            index = S.length() / 2;
            String substring = S.substring(0, index); //first half
            String substring2 = S.substring(index+1); //second half
            StringBuilder sb = new StringBuilder(substring2);

            if (substring.contentEquals(sb.reverse())) {
                return index;
            }
            else return -1;
        }
        else return -1;
    }

    public static void main(String[] args) {
        StrSymmetryPoint strSymmetryPoint = new StrSymmetryPoint();
        System.out.println(strSymmetryPoint.solution("racecar"));
    }
}
