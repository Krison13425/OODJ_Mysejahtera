package loopingstructureprogramming;


import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TestOptionPane02 {

    public static void main(String[] args) {
        new TestOptionPane02();
    }

    public TestOptionPane02() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (UnsupportedLookAndFeelException ex) {
                }

                JTextField textField = new JTextField(10);

                String btnString1 = "Save Object";
                String btnString2 = "Delete Object";

                //Create an array of the text and components to be displayed.
                String msgString1 = "Object label:";
                Object[] array = {msgString1, textField};
                //Create an array specifying the number of dialog buttons
                //and their text.
                Object[] options = {btnString1, btnString2};
                
                int result = JOptionPane.showOptionDialog(null, array, "", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                switch (result) {
                    case 0:
                        System.out.println("Save me");
                        break;
                    case 1:
                        System.out.println("Delete me");
                        break;
                }
            }
        });
    }
}