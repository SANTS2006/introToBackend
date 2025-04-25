package learnjava;

import static java.lang.System.out;

public class learnArgs {
    public static void main(String[] args){
        String[][] numbers = {
                                {"Tom", "555-3322"},
                                {"Mary", "555-8976"},
                                {"Jon", "555-1037"},
                                {"Rachel", "555-1400"}
        };
        int i;

        if(args.length != 1){
            out.println("Usage: java Phone <name>");
        }
        else{
            for (i=0; i<numbers.length; i++){
                if(numbers[i][0].equals(args[0])){
                    out.println(numbers[i][0] + " = " + numbers[i][1]);
                   return;
                }

                if(i == numbers.length){
                    out.println("Name not found");
                }
            }
        }



//            String[][] name = {{"17", "18"},{"Newton", "Tamba"}, {"Sam", "Kolo"}};
//        for(int i=0; i<4; i++){
//            for(int j=0; j<2; j++){
//
//                    out.print(numbers[i][j] + " ");
//            }
//            out.println();
//        }
//        out.println();
//        out.println();
//        out.println();
//
//
//        for(int i=0; i<3; i++){
//            for(int j=0; j<2; j++){
//
//                    out.print(name[i][j] + " ");
//            }
//            out.println();
//        }
    }
}
