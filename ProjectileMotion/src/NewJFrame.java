


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author sejudav20
 */
public class NewJFrame extends javax.swing.JFrame {
  NewJPanel jp=new NewJPanel();
  double jFrameHeight=this.getHeight()-10;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
      
        this.add(jp);
        jp.setSize(this.getWidth(),this.getHeight()-10);
        jp.setLocation(0, 0);
        jp.setVisible(true);
        
    }

    public void run(){
        jp.changeLocation(jFrameHeight);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        NewJPanel = new javax.swing.JPanel();

        javax.swing.GroupLayout NewJPanelLayout = new javax.swing.GroupLayout(NewJPanel);
        NewJPanel.setLayout(NewJPanelLayout);
        NewJPanelLayout.setHorizontalGroup(
            NewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        NewJPanelLayout.setVerticalGroup(
            NewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify                     
    private javax.swing.JPanel NewJPanel;
    // End of variables declaration                   
}
