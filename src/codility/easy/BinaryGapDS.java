package codility.easy;

class BinaryGapDS {
    public int solution(int N) {
        // Convert the number to binary string
        String binaryString = Integer.toBinaryString(N);
        
        int maxGap = 0;
        int currentGap = 0;
        boolean counting = false;
        
        for (int i = 0; i < binaryString.length(); i++) {
            char c = binaryString.charAt(i);
            
            if (c == '1') {
                if (counting) {
                    // End of a gap, update max if needed
                    maxGap = Math.max(maxGap, currentGap);
                    currentGap = 0;
                } else {
                    // Start counting gaps
                    counting = true;
                }
            } else {
                if (counting) {
                    // Inside a gap, increment count
                    currentGap++;
                }
            }
        }
        
        return maxGap;
    }
}