
public class Main {
    public static void main(String[] args) {
        System.out.println("Matris Transpozunu Bulma");
        int[][] matrixA = {
                {2,3,4},
                {5,6,4}
        };

         var trampose = new Trampose();
        trampose.trans(matrixA);
    }
}