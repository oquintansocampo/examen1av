package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 11;
        if (parImpar(num)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int x = 2; x < 1000; x++) {
            if (parImpar(x)) {
                System.out.print(x + " ");
            }
        }
    }

    public static boolean parImpar(int var) {
        int j = 2;
        boolean aux = true;
        while ((aux) && (j != var)) {
            if (var % j == 0) {
                aux = false;
            }
            j++;
        }
        return aux;
    }

}
