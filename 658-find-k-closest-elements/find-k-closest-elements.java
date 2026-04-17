class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ls = new ArrayList<>();
        int i = bs(arr,x);
        //System.out.println(i);
        find(ls,arr,i,k,x);
        return ls;
    }
    public int bs(int[]arr, int x){
        int i=0,j=arr.length-1;
        while(i<j){
            int mid = (i+j)/2;
            if(arr[mid]==x)return mid;
            else if(arr[mid]<x){i=mid+1;}
            else j=mid-1;
        }
        if(j<0)return i;
        //else if(i>arr.length-1)return j;
        else return j;
    }
    public void find(List<Integer>ls , int[] arr , int i,int k,int x){
        int l = i-k , r = i+k;
        //System.out.println("hi");
        while(r-l!=k-1){
            if(l<0){l++;}
            else if(r>=arr.length){r--;}
            else if(Math.abs(arr[l]-x)<=Math.abs(arr[r]-x)){r--;}
            else if(Math.abs(arr[l]-x)>Math.abs(arr[r]-x)){l++;}
        }
        for(int m=l;m<=r;m++){ls.add(arr[m]);}
    }
}