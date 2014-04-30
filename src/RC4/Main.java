/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RC4;

import RC4GUI.RC4StreamCipher;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author fariz.ikhwantri
 */
public class Main {

    public static void main(String... dingdong) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        RC4StreamCipher frame = new RC4StreamCipher();
        frame.setVisible(true);
    }
}
