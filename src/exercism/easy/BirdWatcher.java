package exercism.easy;

/*
https://exercism.org/tracks/java/exercises/bird-watcher/edit

You're an avid bird watcher who keeps track of how many birds have visited your garden in the last seven days.

You have six tasks, all dealing with the numbers of birds that visited your garden.
 */

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] birdsLastWeek = {0, 2, 5, 3, 7, 8, 4};
        return birdsLastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == getToday()) {
                birdsPerDay[i] += 1;
            }
        }
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int totalCount = 0;
        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }
        for (int i = 0; i < numberOfDays; i++) {
            totalCount += birdsPerDay[i];
        }
        return totalCount;
    }

    public int getBusyDays() {
        int numBusyDays = 0;
        for (int birds : birdsPerDay) {
            if (birds >= 5) {
                numBusyDays += 1;
            }
        }
        return numBusyDays;
    }
}

