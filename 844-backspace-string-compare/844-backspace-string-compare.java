class Solution {
    public boolean backspaceCompare(String s, String t) {
        int s_position = s.length()-1;
        int t_position = t.length()-1;
        
        int s_skip = 0;
        int t_skip = 0;
        
        while(s_position >= 0 || t_position >= 0){
            while(s_position >= 0){
                if(s.charAt(s_position) == '#'){
                    s_skip += 1;
                    s_position -= 1;
                }
                else if(s_skip > 0){
                    s_position -= 1;
                    s_skip -= 1;
                }
                else{
                    break;
                }
            }
            
            while(t_position >= 0){
                if(t.charAt(t_position) == '#'){
                    t_skip += 1;
                    t_position -= 1;
                }
                else if(t_skip > 0){
                    t_position -= 1;
                    t_skip -= 1;
                }
                else{
                    break;
                }
            }
            
            if(s_position >= 0 && t_position >= 0 && s.charAt(s_position) != t.charAt(t_position)){
                return false;
            }
            
            if((s_position >= 0) != (t_position >= 0)){
                return false;
            }
            
            s_position -= 1;
            t_position -= 1;
        }
        return true;
    }
}