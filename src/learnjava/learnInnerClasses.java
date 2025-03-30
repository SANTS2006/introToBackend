package learnjava;

class outerClass{
    int[] nums;

    outerClass(int[] n){
        nums = n;
    }

    void analyze(){
        innerClass ic = new innerClass();
        System.out.println("minimum value = " + ic.min());
        System.out.println("Maximum value = " + ic.max());
        System.out.println("Average value = " + ic.avg());
    }

    class innerClass{

        int min(){
            int m = nums[0];
            for(int i=1; i<nums.length; i++){
                if(m > nums[i]){
                    return nums[i];
                }
            }
            return m;
        }

        int max(){
            int m = nums[0];
            for(int i=1; i<nums.length; i++){
                if(m < nums[i]){
                    return nums[i];
                }
            }
            return m;
        }

        int avg(){
            int avg = 0;
            for (int num : nums) {
                avg += num;
            }

            return avg/nums.length;
        }

    }
}


public class learnInnerClasses {
    public static void main(String[] args){

        int[] array = {2, 89, 6, 34, 10, -10, -3, 67, 23, 67};
        outerClass oc = new outerClass(array);
        oc.analyze();
    }
}
