
class Solution {
    public boolean isPalindrome(int x) {
        int k = x;
        int temp= 0;

        
         while( x > 0){
             int rev = x%10;
             temp = temp*10 +rev;
             x= x/10;          
         }
        if( k == temp){
            return true;
        }
        return  false;
    }
}


