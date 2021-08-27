// import java.util.Scanner;
// import java.util.StringTokenizer;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         String date = sc.nextLine();
//         sc.close();

//         StringTokenizer stn = new StringTokenizer(date,".");

//         String[] input = new String[3];
//         String tk;
//         for(int i=0; i<input.length; i++){
//             tk=stn.nextToken();
//             input[i] = tk;
//         }
//         int year = Integer.parseInt(input[0]);
//         int month = Integer.parseInt(input[1]);
//         int day = Integer.parseInt(input[2]);

//         System.out.printf("%04d.%02d.%02d", year, month, day);
//     }
// }