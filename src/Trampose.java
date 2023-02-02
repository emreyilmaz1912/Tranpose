public class Trampose {
    public static void  trans(int [][] arr){

        int[][] arr2=new int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length ; i++) {
            for (int j = 0; j <arr.length ; j++) {

                arr2[i][j]=arr[j][i];
            }
        }
        for (int[] ints : arr2) {
            for (int j = 0; j < arr2[0].length; j++) {

                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
