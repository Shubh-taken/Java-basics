// import java.util.*;

// public class patterns {
//     public static void main(String args[]) {
//         // n = no of rows
//         int n = 4;
//         // m = no of coloumns
//         int m = 5;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= m; j++) {
//                 System.out.print("*");

//             }
//             System.out.println();
//         }

//     }

// }

import java.util.*;

public class patterns {

    public static void main(String args[]) {

        int n = 4;
        int m = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Moved outside the j loop!
        }
    }
}