public class Array {
    public static boolean arrays(int nums[]){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                   return true;
                }
            }

        }
        return false;

    }
     public static int modifiedbinary(int num[], int target, int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(num[mid]==target){
            return mid;
        }//l1
        if(num[si]<=num[mid]){
            if(num[si]<=target&& target<=num[mid]){
                 return modifiedbinary(num, target, si, mid);
            }
            else{
                return  modifiedbinary(num, target, mid+1, ei);
            }
        }//l2
        else{
            if(num[mid]<=target && target<=num[ei]){
                return   modifiedbinary(num, target, mid+1, ei);
            }
            else{
                return modifiedbinary(num, target, si, mid-1);
            }

        }
 
     }
    

    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        System.out.println(arrays(nums));
        int num[]={4,5,6,7,0,1,2};
        int target=1;
        int idx= modifiedbinary(num, target, 0, num.length-1);
        System.out.println(idx);
    }
    
}
