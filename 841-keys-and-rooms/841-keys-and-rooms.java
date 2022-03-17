class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;
        
        Stack<Integer> keys = new Stack();
        keys.push(0);
        
        while(!keys.isEmpty()){
            int curr_key = keys.pop();
            for(int new_key : rooms.get(curr_key)){
                if(!seen[new_key]){
                    seen[new_key] = true;
                    keys.push(new_key);
                }
            }
        }
        
        for(boolean visited : seen){
            if(!visited){
                return false;
            }
        }
        return true;
    }
}