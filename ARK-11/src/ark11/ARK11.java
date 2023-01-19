
package ark11;

import javax.swing.JOptionPane;

public class ARK11 {

    public static void main(String[] args) {
        int numero1;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        int numero2;
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo numero"));
        if (numero1 > numero2) {
            System.out.println("O Numero maior é: " + numero1);
        }
        if (numero2 > numero1) {
            System.out.println("O Numero maior é: " + numero2);
        }
        if (numero1 == numero2) {
            System.out.println("Os numeros digitados são Igual");
        }
    }
}
