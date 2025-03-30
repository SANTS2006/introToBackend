package learnjava;

public class learnArrays {

    public static void main(String[] args){
//        int[] sample = new int[10];
//        int i;
//
//        for (i = 0; i < 10; i = i + 1) {
//            sample[i] = i;
//        }

//        for(i = 0; i< 10; i += 1){
//            System.out.println("This is sample[" + i + "] : " + sample[i]);
//        }


        int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a,b,t,size = 10;

        for(int i=0; i<size; i++){
            System.out.print(" " + nums[i]);
        }

        for(a =1; a<size; a++){
            for(b=size-1; b>=a; b--){
                if(nums[b-1] > nums[b]){
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        System.out.println("Sorted Array is ");
        for(int i=0; i<size; i++){
            System.out.print(" " + nums[i]);
        }
        System.out.println();
        int [][] table = new int[3][4];
        int t1,i;
        for(t1=0; t1<3; t1++){
            for(i =0; i<4; i++){
               table[t1][i] = (t1*4) + i+1;
                System.out.print(table[t1][i] + " ");
                System.out.println();
            }
        }
    }
}
