package examencod;

import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introducir numero"));
        if (primos(num)) {
            JOptionPane.showMessageDialog(null, "Es numero primo");
        } else {
            JOptionPane.showMessageDialog(null, "NO es numero primo");
        }

        for (int x = num; x < 1000; x++) {
            if (primos(x)) {
                System.out.print(x + " ");
            }
        }
    }

    /**
     * Devuelve true si var es primo, false si var no es primo
     *
     * @param var
     * @return boolean aux
     */
    public static boolean primos(int var) {
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
