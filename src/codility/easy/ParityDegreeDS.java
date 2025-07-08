package codility.easy;

class ParityDegreeDS {
    public int solution(int N) {
        int K = 0;
        while (N % 2 == 0) {
            N /= 2;
            K++;
        }
        return K;
    }
}