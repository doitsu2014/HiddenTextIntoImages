package data;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class HiddenTextEncode extends javax.swing.JFrame {

    boolean isStart = false;

    public HiddenTextEncode() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSecretText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtOriginalPath = new javax.swing.JTextField();
        btnFileChooser = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblOriginalImage = new javax.swing.JLabel();
        lblStegoImage = new javax.swing.JLabel();
        btnHideText = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Hidding data in image using LSB substitution");

        jLabel2.setText("Secret text: ");

        jLabel3.setText("Original image file: ");

        btnFileChooser.setText("BROWSE");
        btnFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileChooserActionPerformed(evt);
            }
        });

        jLabel4.setText("Original Image");

        jLabel5.setText("Stego-Image");

        btnHideText.setText("Hide text");
        btnHideText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHideTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOriginalPath, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFileChooser))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSecretText)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(lblOriginalImage, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(lblStegoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(btnHideText, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSecretText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtOriginalPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFileChooser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblOriginalImage, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addComponent(lblStegoImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnHideText)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileChooserActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG & GIF & PNG Images", "jpg", "gif", "png");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            txtOriginalPath.setText(chooser.getSelectedFile().getAbsolutePath());
        }
        try {
            Icon icon = new ImageIcon(ImageIO.read(new File(txtOriginalPath.getText())).getScaledInstance(lblOriginalImage.getWidth(), lblOriginalImage.getHeight(), 100));
            lblOriginalImage.setIcon(icon);
            isStart = true;
        } catch (Exception e) {
            System.err.println("Should be images");
            JOptionPane.showMessageDialog(null, "Should be image");
        }
    }//GEN-LAST:event_btnFileChooserActionPerformed

    private void btnHideTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHideTextActionPerformed
        BufferedImage bimg;
        try {
            bimg = ImageIO.read(new File(txtOriginalPath.getText()));
            String msg = txtSecretText.getText();
            endcodeSte(bimg, msg);
        } catch (IOException ex) {
            System.err.println("Fail in hidding text");
        }

    }//GEN-LAST:event_btnHideTextActionPerformed

    private void endcodeSte(BufferedImage bimg, String msg) {
        if (isStart == false) {
            JOptionPane.showMessageDialog(this, "Fail!!!");
        } else {
            int w=bimg.getWidth();
            int h=bimg.getHeight();
            
            if (msg.length() > 255) {
                txtSecretText.setText("MESSAGE IS LARGE THAN 255 CHARACTERS");
            } else if (msg.length()*11 > w*h) {
                txtSecretText.setText("Image is too small");
            } else {
                byte[] msgBytes = msg.getBytes();
                int msglendecode = (bimg.getRGB(0, 0)>>8)<<8;

                msglendecode |= msg.length();
                bimg.setRGB(0, 0, msglendecode); // hide mess length at first position

                for (int i = 1,msgPos = 0, row= 0, j=0; row<h; row++) {
                    for (int col = 0; col < w && j<msgBytes.length; col++,i++) {
                        if(i%11==0){
                            int rgb = bimg.getRGB(col, row);
                            
                            int a = ((rgb >> 24) & 0xff);
                            
                            int r = (((rgb >> 16) & 0xff)>>3)<<3;
                            r=r|(msgBytes[msgPos]>>5);

                            int g = (((rgb >> 8) & 0xff)>>3)<<3;
                            g=g|((msgBytes[msgPos]>>2)& 7);

                            int b = ((rgb & 0xff)>>2)<<2;
                            b=b|(msgBytes[msgPos]&0x3);

                            rgb=0;
                            rgb=(rgb|(a<<24));
                            rgb=(rgb|(r<<16));
                            rgb=(rgb|(g<<8));
                            rgb=(rgb|b);
                            bimg.setRGB(col,row,rgb);
                            msgPos++;
                            j++;
                        }
                    }//second loop
                }//first loop
                ImageIcon ic = new ImageIcon(bimg.getScaledInstance(lblStegoImage.getWidth(), lblStegoImage.getHeight(), 100));
                lblStegoImage.setIcon(ic);
                
                try {
                    File tmp = new File(txtOriginalPath.getText());

                    File outputImage1 = new File("c:\\Users\\thd11\\Desktop\\"+tmp.getName());
                    File outputImage2 = new File(tmp.getName());

                    ImageIO.write(bimg,"png",outputImage1);
                    ImageIO.write(bimg,"png",outputImage2);
                } catch (Exception e) {
                    
                }
            }
        }
    }

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
            java.util.logging.Logger.getLogger(HiddenTextEncode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HiddenTextEncode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HiddenTextEncode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HiddenTextEncode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HiddenTextEncode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFileChooser;
    private javax.swing.JButton btnHideText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblOriginalImage;
    private javax.swing.JLabel lblStegoImage;
    private javax.swing.JTextField txtOriginalPath;
    private javax.swing.JTextField txtSecretText;
    // End of variables declaration//GEN-END:variables
}
