package learnjava;

public class learnSortingArrays {
    public static void main(String[] args){
        int[] nums = {20, -10, 2, 6, 34, 78, -12, 65, 100, -27, 56};
        int a,b,t;
        System.out.println("The unsorted array is: ");
        for(int i=0; i<nums.length; i++){
            System.out.print("nums[" + i + "] = " + nums[i]);
            System.out.println();
        }

        for(a = 1; a<nums.length; a++){
            for(b = nums.length - 1; b>= a; b--){
                if(nums[b - 1] > nums[b]){
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }

            }
        }

        System.out.println("The sorted array is: ");
        for(int i=0; i<nums.length; i++){
            System.out.print("nums[" + i + "] = " + nums[i]);
            System.out.println();
        }
    }
}
