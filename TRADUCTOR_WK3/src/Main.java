import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Espaniol espaniol= new Espaniol("Español","gramatica en español","vocabulario en español","clasificacion en español");
        Ingles ingles= new Ingles("Ingles","gramatica en inglés","vocabulario en inglés","clasificacion en inglés");
        Americano americano= new Americano("Americano","gramatica americana","vocabularioAmericano","nombre","acento americano","jerga americana","expresiones","referencias","Miami","Influencia");
        JOptionPane.showMessageDialog(null,"Bienvenido a tu traductor de confianza ;)");

        String textoEntrada = JOptionPane.showInputDialog("Ingrese el texto a traducir ");
       Traductor traductor= new Traductor(textoEntrada,espaniol,americano,ingles,"saludo");



        System.out.println(traductor.traducir(textoEntrada,espaniol,ingles));

    }
}