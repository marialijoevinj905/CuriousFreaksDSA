class Solution {
    public int[] countOddEven(int[] arr) {
        int[] count = new int[2];
        int evenCount=0, oddCount=0;
        for(int num:arr){
            if(num%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        count[0] = oddCount;
        count[1] = evenCount;
        return count;
    }
}
