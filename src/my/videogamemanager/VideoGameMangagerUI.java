/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.videogamemanager;
import java.util.Vector;
import javax.swing.JOptionPane;
/**
 *This program allows for a user to track their video game library by entering
 * the title, rating, and release year of a video game.
 * The UI will validate the entries given by the user to make sure all three
 * fields have acceptable data.
 * @author Brent
 */
public class VideoGameMangagerUI extends javax.swing.JFrame {

    /**
     * Creates new form VideoGameMangagerUI
     */
    public VideoGameMangagerUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Input"));

        jLabel1.setText("Title:");

        jLabel2.setText("Rating:");

        jLabel3.setText("Release Year:");

        jRadioButton1.setText("E");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("T");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("M");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        jTextPane1.setEditable(false);
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    Method that allows a press of the 'clear' button that clears out all fields and sets the
    radio buttons to 'unselected'
    @param evt is the action event of clicking the clear button
    */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    jTextField1.setText("");
    jTextField2.setText("");
    jRadioButton1.setSelected(false);
    jRadioButton2.setSelected(false);
    jRadioButton3.setSelected(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /*
    Method that acts on a press of the 'submit' button and adds a new 
    video game record to the library after all validations are completed
    @param evt is the action event of clicking the submit button
    */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // creat a new video game object
       VideoGame tempGame = new VideoGame();
       
       //create a boolean variable to determine if the value returned by the 
       //setTitle() method is valid and if it's not, display an error messeage
       //and stop further processing of the function.
       boolean validTitle = tempGame.setTitle(jTextField1.getText());
       if (!validTitle)
       {
           JOptionPane.showMessageDialog(null, "You must enter a Title");
           return;
       }
       
       //check which radio button is selected and if none, display error message
       //and stop further processing of the function
       if (jRadioButton1.isSelected())
       {
           tempGame.setRating("E");
       }
       else if (jRadioButton2.isSelected())
       {
           tempGame.setRating("T");
       }
       else if (jRadioButton3.isSelected())
       {
          tempGame.setRating("M");
       }
       else
       {
          JOptionPane.showMessageDialog(null, "You must select a Rating");
           return; 
       }
       
       //create a new string consisting of the text in release year field
       String field2String = jTextField2.getText();
       
       //check if there are values in the field and if there are, etner into the
       //parse attempt
       if (!"".equals(field2String))
       {
           //create a new int variable
           int parsedString;
           //try to parse the string to an int
           try 
           {
            parsedString = Integer.parseInt(field2String);
           }
           //if the string cannot be parsed (no integers entered) catch the
           //exception and display an error message, again stopping further
           //processing of the function
           catch(NumberFormatException e)
           {
             JOptionPane.showMessageDialog(null, "Release Year must be a number");
             return;
           }
           
           //check if setReleaseYear returns a valid entry and if not, display
           //an error message and stop further processing of the function
           boolean validYear = tempGame.setReleaseYear(parsedString);
           if (!validYear)
            {
                JOptionPane.showMessageDialog(null, "Release Year must be greater than 0");
                return;
            }
           
       }
       //if no value in the sting at all, display error message and stop further
       //processing of the function
       else
       {
       JOptionPane.showMessageDialog(null, "You must enter a Release Year");
                return;
       }
       
       
       
       //now that the video game object is validated, add it to the vector
       gameLibrary.add(tempGame);
       
       //create a new string with the current text in the library panel
       String currentOutput = jTextPane1.getText();
       
       //check if the library panel is null or empty and if so, set the text
       //to the toString for the newly created game
       if (currentOutput == null || "".equals(currentOutput))
       {
          jTextPane1.setText(tempGame.toString()); 
       }
       //if their is previous text in the library pane, add a toString for the
       //new game object on a new line
       else
       {
          String newOutput = currentOutput + "\n" + tempGame.toString();
          jTextPane1.setText(newOutput);
       }
         
       
      // clear out all fields after game object is created
       jTextField1.setText("");
       jTextField2.setText("");
       jRadioButton1.setSelected(false);
       jRadioButton2.setSelected(false);
       jRadioButton3.setSelected(false);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    /*
    method that selects the E radio button option and de-selects all other radio
    buttons as only one can be chosen
    @param evt is the action event of clicking the radio button
    */
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

     /*
    method that selects the T radio button option and de-selects all other radio
    buttons as only one can be chosen
    @param evt is the action event of clicking the radio button
    */
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jRadioButton1.setSelected(false);
        jRadioButton3.setSelected(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

     /*
    method that selects the M radio button option and de-selects all other radio
    buttons as only one can be chosen
    @param evt is the action event of clicking the radio button
    */
    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VideoGameMangagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VideoGameMangagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VideoGameMangagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VideoGameMangagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VideoGameMangagerUI().setVisible(true);
            }
        });
    }
    //Additional Variables needed
    
    private Vector gameLibrary = new Vector();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
