class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            return a[0]-b[0];
        });
        List<int[]> ls = new ArrayList<>();
        ls.add(intervals[0]);
       // arr[0]=intervals[0];
        int j=0;
        for(int i=1;i<intervals.length;i++){
            if(ls.get(j)[1]>=intervals[i][0]){
                int[] br = ls.get(j);
                if(br[1]<intervals[i][1])br[1]=intervals[i][1];
                ls.remove(ls.size()-1);
                ls.add(br);
            }else{
                j++;
                ls.add(intervals[i]);                
            }
        }
        int[][] arr = new int[ls.size()][2];
        //int k=0;
        for(int i=0;i<ls.size();i++){
            arr[i]=ls.get(i);
        }
        return arr;
    }
}