public class LinearSearch {

    public  static  void main(String[] args){
        int[] nums ={1,2,3,4,5,6,7};
        LinearSearch ls=new LinearSearch();
        int target=6;
        int result=ls.search(nums,target);
        if(result!=-1){
            System.out.println("Element fiound at index ".concat(String.valueOf(result)));
        }
        else{
            System.out.println("Element not found");
        }
    }

    private int  search(int[] nums,int target) {

        for(int i=0;i<=nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;

    }
}
