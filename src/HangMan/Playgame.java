/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.awt.Color;
import java.awt.Dialog;
import java.util.Arrays;
import javax.naming.spi.DirStateFactory;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Playgame extends javax.swing.JFrame {
   // String actualWord="";
   // String wordDisplayed="";
   private String wordDisplayed = "";
   private String actualWord = "";
    static int count=1;
    static int ar[]=new int[36];
    public Playgame(String actualWord,String wordDisplayed) {
        this.actualWord=actualWord;
        this.wordDisplayed=wordDisplayed;
        
        initComponents(); 
        WordDisplayField.setText(wordDisplayed);
    }
    public Playgame(){
        initComponents();
      
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iniTokenMaker1 = new org.fife.ui.rsyntaxtextarea.modes.IniTokenMaker();
        jPanel1 = new javax.swing.JPanel();
        WordDisplayField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ButtonS = new javax.swing.JButton();
        WButton = new javax.swing.JButton();
        ButtonU = new javax.swing.JButton();
        EButton = new javax.swing.JButton();
        RButton = new javax.swing.JButton();
        TButton = new javax.swing.JButton();
        YButton = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        ButtonI = new javax.swing.JButton();
        ButtonO = new javax.swing.JButton();
        QButton = new javax.swing.JButton();
        ButtonA = new javax.swing.JButton();
        ButtonF = new javax.swing.JButton();
        ButtonD = new javax.swing.JButton();
        ButtonX = new javax.swing.JButton();
        ButtonG = new javax.swing.JButton();
        ButtonH = new javax.swing.JButton();
        ButtonJ = new javax.swing.JButton();
        ButtonK = new javax.swing.JButton();
        ButtonL = new javax.swing.JButton();
        ButtonZ = new javax.swing.JButton();
        ButtonV = new javax.swing.JButton();
        ButtonC = new javax.swing.JButton();
        ButtonN = new javax.swing.JButton();
        ButtonB = new javax.swing.JButton();
        ButtonM = new javax.swing.JButton();
        ButtonP = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        QuitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WordDisplayField.setEditable(false);
        WordDisplayField.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        WordDisplayField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WordDisplayFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(WordDisplayField, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(WordDisplayField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/images/hangman1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        );

        ButtonS.setText("S");
        ButtonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSActionPerformed(evt);
            }
        });

        WButton.setText("W");
        WButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WButtonActionPerformed(evt);
            }
        });

        ButtonU.setText("U");
        ButtonU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUActionPerformed(evt);
            }
        });

        EButton.setText("E");
        EButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EButtonActionPerformed(evt);
            }
        });

        RButton.setText("R");
        RButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RButtonActionPerformed(evt);
            }
        });

        TButton.setText("T");
        TButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButtonActionPerformed(evt);
            }
        });

        YButton.setText("Y");
        YButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YButtonActionPerformed(evt);
            }
        });

        Button9.setText("9");
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        ButtonI.setText("I");
        ButtonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIActionPerformed(evt);
            }
        });

        ButtonO.setText("O");
        ButtonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOActionPerformed(evt);
            }
        });

        QButton.setText("Q");
        QButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QButtonActionPerformed(evt);
            }
        });

        ButtonA.setText("A");
        ButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAActionPerformed(evt);
            }
        });

        ButtonF.setText("F");
        ButtonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFActionPerformed(evt);
            }
        });

        ButtonD.setText("D");
        ButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDActionPerformed(evt);
            }
        });

        ButtonX.setText("X");
        ButtonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonXActionPerformed(evt);
            }
        });

        ButtonG.setText("G");
        ButtonG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGActionPerformed(evt);
            }
        });

        ButtonH.setText("H");
        ButtonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHActionPerformed(evt);
            }
        });

        ButtonJ.setText("J");
        ButtonJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonJActionPerformed(evt);
            }
        });

        ButtonK.setText("K");
        ButtonK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKActionPerformed(evt);
            }
        });

        ButtonL.setText("L");
        ButtonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLActionPerformed(evt);
            }
        });

        ButtonZ.setText("Z");
        ButtonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonZActionPerformed(evt);
            }
        });

        ButtonV.setText("V");
        ButtonV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVActionPerformed(evt);
            }
        });

        ButtonC.setText("C");
        ButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCActionPerformed(evt);
            }
        });

        ButtonN.setText("N");
        ButtonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNActionPerformed(evt);
            }
        });

        ButtonB.setText("B");
        ButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBActionPerformed(evt);
            }
        });

        ButtonM.setText("M");
        ButtonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMActionPerformed(evt);
            }
        });

        ButtonP.setText("P");
        ButtonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPActionPerformed(evt);
            }
        });

        Button4.setText("4");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button8.setText("8");
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button7.setText("7");
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button5.setText("5");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setText("6");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button3.setText("3");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button1.setText("1");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setText("2");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        QuitButton.setText("QUIT");
        QuitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(QButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(YButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonU, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonI, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonO, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonP, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(ButtonA, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonS, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(ButtonD, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonF, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonG, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonH, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonK, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonL, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(ButtonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonX, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonV, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(ButtonB, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonN, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonM, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(150, 150, 150)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(891, Short.MAX_VALUE)
                        .addComponent(QuitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonU, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonI, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonO, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonP, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonS, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonA, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonF, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonD, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonG, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonH, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonK, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonX, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonV, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonN, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonB, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonM, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(QuitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WButtonActionPerformed
        if(ar[1]==0)
        {
        int flag=keyMatched('W');
        if(flag==0){
            WButton.setBackground(Color.red);
            
        }
        else
        {
            WButton.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
        ar[1]++;
        }
    }//GEN-LAST:event_WButtonActionPerformed

    private void ButtonUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUActionPerformed

          if(ar[6]==0){
          int flag=keyMatched('U');
        if(flag==0){
            ButtonU.setBackground(Color.red);
            
        }
        else
        {
            ButtonU.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
          ar[6]++;}
    }//GEN-LAST:event_ButtonUActionPerformed

    private void EButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EButtonActionPerformed
       if(ar[2]==0){
        int flag=keyMatched('E');
        if(flag==0){
            EButton.setBackground(Color.red);
            
        }
        else
        {
            EButton.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
        ar[2]++;
       }
    }//GEN-LAST:event_EButtonActionPerformed

    private void RButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RButtonActionPerformed
       
          if(ar[3]==0){
        int flag=keyMatched('R');
        if(flag==0){
            RButton.setBackground(Color.red);
            
        }
        else
        {
            RButton.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
          ar[3]++;
          }
        
    }//GEN-LAST:event_RButtonActionPerformed

    private void TButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButtonActionPerformed
         
          if(ar[4]==0){
        int flag=keyMatched('T');
        if(flag==0){
            TButton.setBackground(Color.red);
            
        }
        else
        {
            TButton.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
        ar[4]++;
          }
        
    }//GEN-LAST:event_TButtonActionPerformed

    private void YButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YButtonActionPerformed
if(ar[5]==0){       
        int flag=keyMatched('Y');
        if(flag==0){
            YButton.setBackground(Color.red);
            
        }
        else
        {
            YButton.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
 ar[5]++;
}
    }//GEN-LAST:event_YButtonActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
         if(ar[28]==0){
          int flag=keyMatched('9');
        if(flag==0){
            Button9.setBackground(Color.red);
            
        }
        else
        {
            Button9.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
         ar[28]++;}
    }//GEN-LAST:event_Button9ActionPerformed

    private void ButtonIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIActionPerformed
  if(ar[7]==0){      
         int flag=keyMatched('I');
        if(flag==0){
            ButtonI.setBackground(Color.red);
            
        }
        else
        {
            ButtonI.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
  ar[7]++;}
        
    }//GEN-LAST:event_ButtonIActionPerformed

    private void ButtonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOActionPerformed
  if(ar[8]==0){      
          int flag=keyMatched('O');
        if(flag==0){
            ButtonO.setBackground(Color.red);
            
        }
        else
        {
            ButtonO.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
  ar[8]++;}
    }//GEN-LAST:event_ButtonOActionPerformed

    private void ButtonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFActionPerformed
      
        
           if(ar[13]==0){ int flag=keyMatched('F');
        if(flag==0){
            ButtonF.setBackground(Color.red);
            
        }
        else
        {
            ButtonF.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed);
        }
           ar[13]++;}
    }//GEN-LAST:event_ButtonFActionPerformed

    private void ButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDActionPerformed
          if(ar[12]==0){
        int flag=keyMatched('D');
        if(flag==0){
            ButtonD.setBackground(Color.red);
            
        }
        else
        {
            ButtonD.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
        ar[12]++;}
    }//GEN-LAST:event_ButtonDActionPerformed

    private void ButtonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonXActionPerformed
  if(ar[20]==0){
        int flag=keyMatched('X');
        if(flag==0){
            ButtonX.setBackground(Color.red);
            
        }
        else
        {
            ButtonX.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
        ar[20]++;}
    }//GEN-LAST:event_ButtonXActionPerformed

    private void ButtonGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGActionPerformed
  if(ar[14]==0){        
          int flag=keyMatched('G');
        if(flag==0){
            ButtonG.setBackground(Color.red);
            
        }
        else
        {
            ButtonG.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed);
        }
  ar[14]++;}
    }//GEN-LAST:event_ButtonGActionPerformed

    private void ButtonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHActionPerformed
  if(ar[15]==0){
        int flag=keyMatched('H');
        if(flag==0){
            ButtonH.setBackground(Color.red);
            
        }
        else
        {
            ButtonH.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed);
        }
  ar[15]++;}
        
    }//GEN-LAST:event_ButtonHActionPerformed

    private void ButtonJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonJActionPerformed
          if(ar[16]==0){
          int flag=keyMatched('J');
        if(flag==0){
            ButtonJ.setBackground(Color.red);
            
        }
        else
        {
            ButtonJ.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
          ar[16]++;}
    }//GEN-LAST:event_ButtonJActionPerformed

    private void ButtonKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKActionPerformed
  if(ar[17]==0){       
          int flag=keyMatched('K');
        if(flag==0){
            ButtonK.setBackground(Color.red);
            
        }
        else
        {
            ButtonK.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
  ar[17]++;}
        
    }//GEN-LAST:event_ButtonKActionPerformed

    private void ButtonLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLActionPerformed
  if(ar[18]==0){
        int flag=keyMatched('L');
        if(flag==0){
            ButtonL.setBackground(Color.red);
            
        }
        else
        {
            ButtonL.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
  ar[18]++;}
    }//GEN-LAST:event_ButtonLActionPerformed

    private void ButtonZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonZActionPerformed
  if(ar[19]==0){
        int flag=keyMatched('Z');
        if(flag==0){
            ButtonZ.setBackground(Color.red);
            
        }
        else
        {
            ButtonZ.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
  ar[19]++;}
    }//GEN-LAST:event_ButtonZActionPerformed

    private void ButtonVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVActionPerformed
  if(ar[22]==0){       
          int flag=keyMatched('V');
        if(flag==0){
            ButtonV.setBackground(Color.red);
            
        }
        else
        {
            ButtonV.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
        ar[22]++;}
    }//GEN-LAST:event_ButtonVActionPerformed

    private void ButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCActionPerformed
  if(ar[21]==0){       
         int flag=keyMatched('C');
        if(flag==0){
            ButtonC.setBackground(Color.red);
            
        }
        else
        {
            ButtonC.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
  ar[21]++;}
    }//GEN-LAST:event_ButtonCActionPerformed

    private void ButtonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNActionPerformed
         if(ar[24]==0){
          int flag=keyMatched('N');
        if(flag==0){
            ButtonN.setBackground(Color.red);
            
        }
        else
        {
            ButtonN.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
         ar[24]++;}
    }//GEN-LAST:event_ButtonNActionPerformed

    private void ButtonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBActionPerformed
  if(ar[23]==0){
        int flag=keyMatched('B');
        if(flag==0){
            ButtonB.setBackground(Color.red);
            
        }
        else
        {
            ButtonB.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
  ar[23]++;}
        
    }//GEN-LAST:event_ButtonBActionPerformed

    private void ButtonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMActionPerformed

          if(ar[25]==0){
          int flag=keyMatched('M');
        if(flag==0){
            ButtonM.setBackground(Color.red);
            
        }
        else
        {
            ButtonM.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
        ar[25]++;}
    }//GEN-LAST:event_ButtonMActionPerformed

    private void ButtonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPActionPerformed
  if(ar[9]==0){
        int flag=keyMatched('P');
        if(flag==0){
            ButtonP.setBackground(Color.red);
            
        }
        else
        {
            ButtonP.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
        
  ar[9]++;}
    }//GEN-LAST:event_ButtonPActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
  if(ar[29]==0){
        int flag=keyMatched('4');
        if(flag==0){
            Button4.setBackground(Color.red);
            
        }
        else
        {
            Button4.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
  ar[29]++;}
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
         if(ar[27]==0){
        int flag=keyMatched('8');
        if(flag==0){
            Button8.setBackground(Color.red);
            
        }
        else
        {
            Button8.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
         ar[27]++;}
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
  if(ar[26]==0){       
          int flag=keyMatched('7');
        if(flag==0){
            Button7.setBackground(Color.red);
            
        }
        else
        {
            Button7.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
  ar[26]++;}
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
         if(ar[30]==0){
         int flag=keyMatched('5');
        if(flag==0){
            Button5.setBackground(Color.red);
            
        }
        else
        {
            Button5.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
         ar[30]++;}
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
  if(ar[31]==0){
        int flag=keyMatched('6');
        if(flag==0){
            Button6.setBackground(Color.red);
            
        }
        else
        {
            Button6.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
        ar[31]++;}
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
  if(ar[34]==0){
        int flag=keyMatched('3');
        if(flag==0){
            Button3.setBackground(Color.red);
            
        }
        else
        {
            Button3.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
        ar[34]++;}
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
  if(ar[32]==0){
        int flag=keyMatched('1');
        if(flag==0){
            Button1.setBackground(Color.red);
           
        }
        else
        {
            Button1.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
  ar[32]++;}
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
  if(ar[33]==0){
        int flag=keyMatched('2');
        if(flag==0){
            Button2.setBackground(Color.red);
            
            
        }
        else
        {
  
            Button2.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
        ar[33]++;}
    }//GEN-LAST:event_Button2ActionPerformed

    private void QButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QButtonActionPerformed
        if(ar[0]==0)
        {
             int flag=keyMatched('Q');
        if(flag==0){
            QButton.setBackground(Color.red);
            
        }
        else
        {
            //setImage(count);
            QButton.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed);
        }
        ar[0]++;
        }
    }//GEN-LAST:event_QButtonActionPerformed

    private void WordDisplayFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WordDisplayFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WordDisplayFieldActionPerformed

    private void ButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAActionPerformed
  if(ar[10]==0){      
          int flag=keyMatched('A');
        if(flag==0){
            ButtonA.setBackground(Color.red);
            
        }
        else
        {
            ButtonA.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
  ar[10]++;} 
        
        
    }//GEN-LAST:event_ButtonAActionPerformed

    private void ButtonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSActionPerformed
  if(ar[11]==0){      
        
          int flag=keyMatched('S');
        if(flag==0){
            ButtonS.setBackground(Color.red);
            
        }
        else
        {
            ButtonS.setBackground(Color.GREEN);
            WordDisplayField.setText(wordDisplayed.toString());
        }
  ar[11]++;}
    }//GEN-LAST:event_ButtonSActionPerformed

    private void QuitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitButtonActionPerformed
       new Result(actualWord).setVisible(true);
    }//GEN-LAST:event_QuitButtonActionPerformed
    private int keyMatched(char c)
    {
       /* String str="_A";
        char arr[]=str.toCharArray();
        arr[0]='A';
        str=Arrays.toString(arr);*/
        
        int flag=0;
        int len=actualWord.length();
        for(int i=0;i<len;i++){
            if(wordDisplayed.charAt(i)=='_' && actualWord.charAt(i)==c)
            {
                wordDisplayed = wordDisplayed.substring(0,i)+c+wordDisplayed.substring(i+1);
         
               flag=1;
            }
        }
        if(actualWord.equals(wordDisplayed))
        {
             new Result(1,count).setVisible(true);
             this.setVisible(false);
        }
           
        if(flag==0)
        {
            count++;
            setImage(count);
        }
            
        return flag;
    }
    private void setImage(int count){
        switch(count){
            case 1:
                imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/images/hangman1.png")));
                break;
            case 2:
               imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/images/hangman2.png")));
               break;
            case 3:
               imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/images/hangman3.png")));
               break;
            case 4:
               imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/images/hangman4.png")));
               break;
            case 5:
               imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/images/hangman5.png")));
               break; 
            case 6:
               imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/images/hangman6.png")));
               break;
            case 7:
               imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/images/hangman7.png")));
               new Result(0,count).setVisible(true);
               this.setVisible(false);
               break;
        }
    }
    
  /*  public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Playgame().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton ButtonA;
    private javax.swing.JButton ButtonB;
    private javax.swing.JButton ButtonC;
    private javax.swing.JButton ButtonD;
    private javax.swing.JButton ButtonF;
    private javax.swing.JButton ButtonG;
    private javax.swing.JButton ButtonH;
    private javax.swing.JButton ButtonI;
    private javax.swing.JButton ButtonJ;
    private javax.swing.JButton ButtonK;
    private javax.swing.JButton ButtonL;
    private javax.swing.JButton ButtonM;
    private javax.swing.JButton ButtonN;
    private javax.swing.JButton ButtonO;
    private javax.swing.JButton ButtonP;
    private javax.swing.JButton ButtonS;
    private javax.swing.JButton ButtonU;
    private javax.swing.JButton ButtonV;
    private javax.swing.JButton ButtonX;
    private javax.swing.JButton ButtonZ;
    private javax.swing.JButton EButton;
    private javax.swing.JButton QButton;
    private javax.swing.JButton QuitButton;
    private javax.swing.JButton RButton;
    private javax.swing.JButton TButton;
    private javax.swing.JButton WButton;
    private javax.swing.JTextField WordDisplayField;
    private javax.swing.JButton YButton;
    private javax.swing.JLabel imageLabel;
    private org.fife.ui.rsyntaxtextarea.modes.IniTokenMaker iniTokenMaker1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
