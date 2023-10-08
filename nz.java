import java.awt.*;
import java.awt.event.*;

/**
 *
 * Description
 *
 * @version 1.0 from 15.04.2023
 * @author 
 */

public class nz extends Frame {
  // start attributes
  private TextField textField1 = new TextField();
  private Button bmogli1 = new Button();
  // end attributes
  
  public nz() { 
    // Frame init
    super();
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) { dispose(); }
    });
    int frameWidth = 300;
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("nz");
    setResizable(false);
    Panel cp = new Panel(null);
    add(cp);
    // start components
    
    textField1.setBounds(0, 16, 281, 105);
    textField1.setText("muffin");
    cp.add(textField1);
    bmogli1.setBounds(24, 144, 209, 73);
    bmogli1.setLabel("mogli");
    bmogli1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bmogli1_ActionPerformed(evt);
      }
    });
    cp.add(bmogli1);
    // end components
    
    setVisible(true);
  } // end of public nz
  
  // start methods
  
  public static void main(String[] args) {
    new nz();
  } // end of main
  
  public void bmogli1_ActionPerformed(ActionEvent evt) {
  int getpreis = eingabe.Nextint();
    
    getPreis + 3;
    
    // TODO add your code here
    
  } // end of bmogli1_ActionPerformed

  // end methods
} // end of class nz
