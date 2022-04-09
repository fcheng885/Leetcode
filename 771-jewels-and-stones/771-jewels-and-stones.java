class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int num_jewels = 0;
        
        for(int i=0; i<stones.length(); i++){
            if(jewels.indexOf(stones.charAt(i)) > -1){
                num_jewels += 1;
            }
        }
        
        return num_jewels;
    }
}