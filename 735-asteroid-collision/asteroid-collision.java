class Solution {
    public int[] asteroidCollision(int[] as) {
        Stack<Integer> sm = new Stack<>();
        boolean con = true;
        int v1=0,v2=0;
        for(int i=0;i<as.length;i++){
            con=false;
            if(sm.empty())sm.push(as[i]);
            else{
                if(as[i]>0){
                    sm.push(as[i]);
                }else{
                    if(sm.peek()<0)sm.push(as[i]);
                    else{
                    do{
                    v1=sm.peek();
                    v2=-as[i];
                    if(v2>v1){sm.pop();}
                    else if(v1>v2){con=true;break;}
                    else{sm.pop();con=true;break;}
                    }while(!sm.empty() && sm.peek()>0);
                    if(!con){sm.push(as[i]);}
                    }
                }
            }
        }
        int[] arr = new int[sm.size()];
        for(int i=sm.size()-1;i>=0;i--){
            arr[i]=sm.pop();
        }
        return arr;
    }
}