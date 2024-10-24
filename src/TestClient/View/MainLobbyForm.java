/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TestClient.View;

import TestClient.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 *
 * @author ACER
 */
public class MainLobbyForm extends javax.swing.JFrame {

    /**
     * Creates new form MainLobbyForm
     */
    public MainLobbyForm() {
        initComponents();
        this.setIconImage(new ImageIcon("src/assets/icon/avt.png").getImage());
        ImageIcon avt = new ImageIcon("src/assets/avatar/" + Client.player.getAvatar() + ".jpg");
        lblAvatar.setIcon(new ImageIcon(avt.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH)));
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblAvatar = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtTotalGame = new javax.swing.JTextField();
        txtWinRate = new javax.swing.JTextField();
        txtScore = new javax.swing.JTextField();
        txtRanking = new javax.swing.JTextField();
        txtMyChat = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnRandomMatch = new javax.swing.JButton();
        btnFindRoom = new javax.swing.JButton();
        btnCreateNewRoom = new javax.swing.JButton();
        btnOnlineList = new javax.swing.JButton();
        btnRankings = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnSendMyChat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaAllChat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Game HCGD");
        jLabel17.setText("Nickname:");
        jLabel18.setText("Tổng số trận:");
        jLabel19.setText("Tỷ lệ thắng:");
        jLabel20.setText("Điểm số:");
        jLabel21.setText("Xếp hạng:");

        txtUsername.setText(Client.player.getNickName());
        txtUsername.setEditable(false);

        txtTotalGame.setText(String.valueOf(Client.player.getNumberOfGame()));
        txtTotalGame.setEditable(false);

        txtWinRate.setText(Client.player.getWinRate());
        txtWinRate.setEditable(false);;

        txtScore.setText(String.valueOf(Client.player.getScore()));
        txtScore.setEditable(false);;
        txtRanking.setEditable(false);;

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTotalGame)
                                        .addComponent(txtUsername)
                                        .addComponent(txtWinRate)
                                        .addComponent(txtScore)
                                        .addComponent(txtRanking, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel17)
                                                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel18)
                                                        .addComponent(txtTotalGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel19)
                                                        .addComponent(txtWinRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel20)
                                                        .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel21)
                                                        .addComponent(txtRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(lblAvatar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        btnRandomMatch.setText("Chơi nhanh");
        btnRandomMatch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRandomMatchActionPerformed(evt);
            }
        });

        btnFindRoom.setText("Tìm phòng");
        btnFindRoom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnFindRoomActionPerformed(evt);
            }
        });

        btnCreateNewRoom.setText("Tạo phòng");
        btnCreateNewRoom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCreateNewRoomActionPerformed(evt);
            }
        });

        btnOnlineList.setText("Danh sách online");
        btnOnlineList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    btnOnlineListActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        btnRankings.setText("Bảng xếp hạng");
        btnRankings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    btnRankingsActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        btnExit.setText("Thoát game");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    btnExitActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnOnlineList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(btnRandomMatch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRankings, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnFindRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreateNewRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRandomMatch)
                    .addComponent(btnFindRoom)
                    .addComponent(btnCreateNewRoom))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOnlineList)
                    .addComponent(btnRankings)
                    .addComponent(btnExit)))
        );

        btnSendMyChat.setText("Gửi");
        btnSendMyChat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSendMyChatActionPerformed(e);
            }
        });
        txtaAllChat.setColumns(20);
        txtaAllChat.setRows(5);
        jScrollPane1.setViewportView(txtaAllChat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMyChat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSendMyChat)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMyChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSendMyChat))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateNewRoomActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCreateNewRoomActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn đặt mật khẩu cho phòng không?", "Tạo phòng", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            Client.closeView(Client.View.HOMEPAGE);
            Client.openView(Client.View.CREATE_ROOM_PASSWORD);
        } else if (res == JOptionPane.NO_OPTION) {
            try {
                Client.clientHandler.write("create-room,");
                Client.closeView(Client.View.HOMEPAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnCreateNewRoomActionPerformed

    private void btnRankingsActionPerformed(ActionEvent evt) throws IOException {//GEN-FIRST:event_btnRankingsActionPerformed
        // TODO add your handling code here:
        Client.openView(Client.View.RANK);
        Client.closeView(Client.View.HOMEPAGE);
        Client.clientHandler.write("leaderboard");
    }//GEN-LAST:event_btnRankingsActionPerformed

    private void btnOnlineListActionPerformed(ActionEvent evt) throws IOException {//GEN-FIRST:event_btnOnlineListActionPerformed
        // TODO add your handling code here:
        Client.openView(Client.View.ONLINE);
        Client.closeView(Client.View.HOMEPAGE);
    }//GEN-LAST:event_btnOnlineListActionPerformed

    private void btnFindRoomActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnFindRoomActionPerformed
        try {
            Client.closeView(Client.View.HOMEPAGE);
            Client.openView(Client.View.ROOM_LIST);
            Client.clientHandler.write("view-room-list,");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btnFindRoomActionPerformed

    private void btnExitActionPerformed(ActionEvent evt) throws IOException {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        Client.closeView(Client.View.HOMEPAGE);
        Client.openView(Client.View.LOGIN);
        Client.clientHandler.write("offline");
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnRandomMatchActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnRandomMatchActionPerformed
        Client.closeView(Client.View.HOMEPAGE);
        Client.openView(Client.View.FIND_ROOM);
    }//GEN-LAST:event_btnRandomMatchActionPerformed

    private void btnSendMyChatActionPerformed(ActionEvent evt) {
        sendMessage();
    }
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
            java.util.logging.Logger.getLogger(MainLobbyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLobbyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLobbyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLobbyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLobbyForm().setVisible(true);
            }
        });
    }

    private void sendMessage() {
        try {
            if (txtMyChat.getText().isEmpty()) {
                throw new Exception("Vui lòng nhập nội dung tin nhắn");
                //JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập nội dung tin nhắn");
            }
            String temp = txtaAllChat.getText();
            temp += "Tôi: " + txtMyChat.getText() + "\n";
            txtaAllChat.setText(temp);
            Client.clientHandler.write("chat-server," + txtMyChat.getText());
            txtMyChat.setText("");
            txtaAllChat.setCaretPosition(txtaAllChat.getDocument().getLength());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }

    public void addMessage(String message) {
        String temp = txtaAllChat.getText();
        temp += message + "\n";
        txtaAllChat.setText(temp);
        txtaAllChat.setCaretPosition(txtaAllChat.getDocument().getLength());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateNewRoom;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFindRoom;
    private javax.swing.JButton btnOnlineList;
    private javax.swing.JButton btnRandomMatch;
    private javax.swing.JButton btnRankings;
    private javax.swing.JButton btnSendMyChat;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtMyChat;
    private javax.swing.JTextField txtRanking;
    private javax.swing.JTextField txtScore;
    private javax.swing.JTextField txtTotalGame;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtWinRate;
    private javax.swing.JTextArea txtaAllChat;
    // End of variables declaration//GEN-END:variables
}
