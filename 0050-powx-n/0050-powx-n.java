class Solution {
    public double myPow(double x, int n) {
        double answer = 1.00;
        long exp = n;
        if(exp < 0) 
            exp = -1 * exp; 
        while(exp > 0) {
            if(exp % 2 == 1) {
                answer =  answer * x;
                exp = exp-1;
            }
            else {
                x = x * x;
                exp = exp/2;
            }
        }
        if(n < 0)
            answer = (double) 1 / (double) answer;
        return answer;
    }
}