package codility.easy;

/*
You parked your car in a parking lot and want to compute the total cost of the ticket. The billing rules are as follows:

- The entrance fee of the car parking lot is 2;
- The first full or partial hour costs 3;
- Each successive full or partial hour (after the first) costs 4.

You entered the car parking lot at time E and left at time L. In this task, times are represented as strings in the
format "HH:MM" (where "HH" is a two-digit number between 0 and 23, which stands for hours, and "MM" is a two-digit
number between 0 and 59, which stands for minutes).

Write a function:

class Solution { public int solution(String E, String L); }

that, given strings E and L specifying points in time in the format "HH:MM", returns the total cost of the parking bill
from your entry at time E to your exit at time L. You can assume that E describes a time before L on the same day.

For example, given "10:00" and "13:21" your function should return 17, because the entrance fee equals 2, the first hour
costs 3 and there are two more full hours and part of a further hour, so the total cost is 2 + 3 + (3 * 4) = 17. Given
"09:42" and "11:42" your function should return 9, because the entrance fee equals 2, the first hour costs 3 and the
second hour costs 4, so the total cost is 2 + 3 + 4 = 9.

Assume that:
- strings E and L follow the format "HH:MM" strictly;
- string E describes a time before L on the same day.

In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */
public class ParkingBill {
    public int solution(String E, String L) {
        int bill = 0;
        String[] entryTime = E.split(":");
        String[] leaveTime = L.split(":");

        if (E.equals(L)) {
            return 0;
        }
        else {
            bill += 5; //entry fee + first hour or partial hour (ignore first 60mins now)
            int leaveHour = Integer.parseInt(leaveTime[0]);
            int leaveMin = Integer.parseInt(leaveTime[1]);
            int entryHour = Integer.parseInt(entryTime[0]);
            int entryMin = Integer.parseInt(entryTime[1]);
            int totalMins = (leaveHour - entryHour) * 60 + (leaveMin - entryMin);
            int additionalTime = (int) Math.ceil((totalMins - 60) / 60.0);

            if (additionalTime > 0) {
                bill += 4 * additionalTime;
            }

            return bill;
        }
    }
}
