class Solution {
    public static int largest(int[] arr) {
        int largest = arr[0];
        for(int num:arr){
            if(num>largest)
                largest = num;
        }
        return largest;
    }
}
