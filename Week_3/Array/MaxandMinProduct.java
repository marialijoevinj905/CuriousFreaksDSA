class Solution {
    private int findMax(int[] arr){
        int max=arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
    private int findMin(int[] arr){
        int min=arr[0];
        for(int num:arr){
            if(num<min){
                min=num;
            }
        }
        return min;
    }
    public long findMultiplication(int[] arr1, int[] arr2) {
        int max_arr1 = findMax(arr1);
        int min_arr2 = findMin(arr2);
        return (long)(max_arr1*min_arr2);
    }
}
