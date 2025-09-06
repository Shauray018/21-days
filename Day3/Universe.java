public class Universe { 
    public static void main(String[] args) { 
        // a simple program to print statement I guess just check somethings
        /*
         * ye bhi sahi 
         * some thing to be proud off I guess!!
         */

         // BASE TYPES!!!
        boolean flag = true;
        boolean verbose, debug; // two variables declared but not yet initialized I see!!
        char grade  = 'A'; 
        byte b = 12; 
        short s = 24; 
        int i,j,k = 257; // three variables declared but only k initialized
        long l = 890L; 
        float pi = 3.1416F; 
        double e = 2.7545454, a = 6.022e23; 
        System.out.println("this is the universe!!" + k);
        String title = "Data Structutres and algorithm in java";
        var lenghtT = title.length();
        var x = title.charAt(0);
        for (i=0; i<lenghtT; i++) { 

        }
        System.out.println(x);


        // type conversion 
        double d1 = 3.2;
        double d2 = 3.9999; 
        int i1 = (int) d1; 
        int i2 = (int) d2;
        double d3 = (double) i2;

        String s1 = Integer.toString(i1);
        enum d { 
            MON, 
            TUE,
            WED,
            THU,
            FRI,
            SAT,
            SUN
        }
        // switch (d) {
        //     case MON:
        //     System.out.println("This is tough.");
        //     break;
        //     case TUE:
        //     System.out.println("This is getting better.");
        //     break;
        //     case WED:
        //     System.out.println("Half way there.");
        //     break;
        //     case THU:
        //     System.out.println("I can see the light.");
        //     break;
        //     case FRI:
        //     System.out.println("Now we are talking.");
        //     break;
        //     default:
        //     System.out.println("Day off!");
        // }

        int jar = 0;
        
        while (jar<100) {
            System.out.println(jar); 
            jar++;
        }

        do {
            System.out.println("something somrthin"); 
        } while (jar<1000);



    }
}

// public static double name(double[] data) { 
//     int sum = 0; 
//     for(int i=0;i<data.length; i++) { 
//         sum += data[i];
//     }
//     return sum;
// }


// public static double sum(double[] data) { 
//     double total = 0; 
//     for (double val : data) { 
//         total += val; 
//     } 
//     return total;
// }

// public static void scaleGood(double[] data, double factor) { 
//     for (double val: data){ 
//         val *= factor; 
//     }
    
// }