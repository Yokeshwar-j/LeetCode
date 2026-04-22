class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : fruits){
            hm.put(i,0);
        }
        int i=0,j=0,max=0,c=0;
        while(j<fruits.length){
            if(hm.get(fruits[j])==0){c++;}
            hm.put(fruits[j],hm.getOrDefault(fruits[j],0)+1);
           // System.out.println(fruits[j]+"(outside)->"+hm.get(fruits[j]));
            while(c>2){
                hm.put(fruits[i],hm.get(fruits[i])-1);
                //System.out.println(fruits[i]+"(indside)->"+hm.get(fruits[i]));
                if(hm.get(fruits[i])==0)c--;
                i++;
            }
            max=Math.max(j-i+1,max);
            j++;
        }
        return max;
        //[3,3,3,1,2,1,1,2,3,3,4]
    }
}