class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int gcd = gcd(n, m);
        
        int lcm = (n * m) / gcd;
        
        answer[0] = gcd;
        answer[1] = lcm;
        
        return answer;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}