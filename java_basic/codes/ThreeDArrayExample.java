public class ThreeDArrayExample {
    public static void main(String[] args) {
        
        // 3D Array with 2 layers, 2 rows, 2 columns
        int[][][] arr = {
            { 
                {1,2,3},
                {5,6,7},
                {10,11,12}
            },   // Layer 0
            { 
                {8,9,10} 
                {12,14,15,16}
            }    // Layer 1
        };
        System.out.println(arr[0][2][0]);
        // System.out.println(arr[0][0][1]);
        // System.out.println(arr[0][0][1]);
        // System.out.println(arr[0][0][1]);
        // System.out.println(arr[0][0][1]);
        // System.out.println(arr[0][0][1]);
        // System.out.println(arr[0][0][1]);
        // System.out.println(arr[0][0][1]);
        // System.out.println(arr[0][0][1]);
    //     // Print all elements layer by layer
    //     for (int layer = 0; layer < arr.length; layer++) {
    //         System.out.println("Layer " + layer + ":");
            
    //         for (int row = 0; row < arr[layer].length; row++) {
    //             for (int col = 0; col < arr[layer][row].length; col++) {
    //                 System.out.print(arr[layer][row][col] + " ");
    //             }
    //             System.out.println(); // new line after row
    //         }
    //         System.out.println(); // space between layers
    //     }
    }
}
