package exercism.easy;
/*
https://exercism.org/tracks/java/exercises/annalyns-infiltration/edit

Implement the (static) AnnalynsInfiltration.canFastAttack() method, which takes a boolean value indicating whether the
knight is awake. This method returns true if a fast attack can be made based on the state of the knight. Otherwise, it
returns false:

boolean knightIsAwake = true;
AnnalynsInfiltration.canFastAttack(knightIsAwake);
// => false
=============
Implement the (static) AnnalynsInfiltration.canSpy() method, which takes three boolean values indicating whether the
knight, archer, and prisoner, respectively, are awake. The method returns true if the group can be spied upon based on
the state of the three characters. Otherwise, it returns false:

boolean knightIsAwake = false;
boolean archerIsAwake = true;
boolean prisonerIsAwake = false;
AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);
// => true
=============
Implement the (static) AnnalynsInfiltration.canSignalPrisoner() method, which takes two boolean values indicating
whether the archer and the prisoner, respectively, are awake. The method returns true if the prisoner can be signaled
based on the state of the two characters. Otherwise, it returns false:

boolean archerIsAwake = false;
boolean prisonerIsAwake = true;
AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake);
// => true
=============
Implement the (static) AnnalynsInfiltration.canFreePrisoner() method, which takes four boolean values. The first three
parameters indicate whether the knight, archer, and prisoner, respectively, are awake. The last parameter indicates
whether Annalyn's pet dog is present. The method returns true if the prisoner can be freed based on the state of the
three characters and the presence of Annalyn's pet dog. Otherwise, it returns false:

boolean knightIsAwake = false;
boolean archerIsAwake = true;
boolean prisonerIsAwake = false;
boolean petDogIsPresent = false;
AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);
// => false
 */

class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return (knightIsAwake) ? false : true;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (knightIsAwake || archerIsAwake || prisonerIsAwake) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (!archerIsAwake && prisonerIsAwake) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent) {
            return (!archerIsAwake) ? true : false;
        }
        else {
            if (!knightIsAwake && !archerIsAwake && prisonerIsAwake) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}

