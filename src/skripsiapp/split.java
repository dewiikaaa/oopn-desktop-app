/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsiapp;

/**
 *
 * @author dhealf
 */
public class split {

    public static void main(String[] args) {
        String text = "halo ?apa";
        String ar[] = text.split("\\?");
        if (ar == null) {
            System.out.println("Kosongan->"+ar.length);
        } else {
            for (int i = 0; i < ar.length; i++) {
                System.out.println(i + " -> " + ar[i]);
            }
        }
        System.out.println("Finally "+ar.length);
    }
}
