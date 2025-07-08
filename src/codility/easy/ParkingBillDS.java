package codility.easy;

class ParkingBillDS {
    public int solution(String E, String L) {
        // Parse entry and exit times
        String[] entryParts = E.split(":");
        int entryHour = Integer.parseInt(entryParts[0]);
        int entryMin = Integer.parseInt(entryParts[1]);
        
        String[] exitParts = L.split(":");
        int exitHour = Integer.parseInt(exitParts[0]);
        int exitMin = Integer.parseInt(exitParts[1]);
        
        // Calculate total minutes parked
        int totalMinutes = (exitHour - entryHour) * 60 + (exitMin - entryMin);
        
        // Calculate parking cost
        int cost = 2; // Entrance fee
        
        if (totalMinutes > 0) {
            cost += 3; // First hour
            
            // Additional hours (rounded up)
            int additionalHours = (int) Math.ceil((totalMinutes - 60) / 60.0);
            if (additionalHours > 0) {
                cost += additionalHours * 4;
            }
        }
        
        return cost;
    }
}