class Solution{
    public int corner_digitSum(int n){
        if(n<1){
            return -1;
        }
        int ld = n%10;
        if(n<10){
            return ld;
        }
        while(n>=10){
            n/=10;
        }
        int fd = n;
        return fd+ld;
    }
}
