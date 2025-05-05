class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> alternate = new ArrayList<>();
        for(int i=1;i<=arr.length;i++){
            if(i%2!=0){
                alternate.add(arr[i-1]);
            }
        }
        return alternate;
    }
}
