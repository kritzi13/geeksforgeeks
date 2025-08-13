class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int a = 0;
        int sum = 0;
        int dup=n;
        while(n>0){
            a = n%10;
            sum += (int)Math.pow(a, 3); 
            n = n/10;
        }
        if (dup == sum){
            return true;
        }
        else{
            return false;
        }
    }
}
