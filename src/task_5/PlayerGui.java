/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_5;

import java.awt.event.ActionListener;

/**
 *
 * @author ASUS ROG552VW
 */
public class PlayerGui extends javax.swing.JFrame {

    /**
     * Creates new form PlayerGui
     */
    public PlayerGui() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        listMusic = new javax.swing.JList<>();
        txFieldPlaying = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listMusic.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listMusic);

        txFieldPlaying.setEditable(false);
        txFieldPlaying.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txFieldPlayingActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Now Playing");

        btnAdd.setText("ADD");
        btnAdd.setToolTipText("");

        btnDelete.setText("DELETE");

        btnPrev.setText("<<");

        btnPlay.setText("PLAY");

        btnStop.setText("STOP");

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
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
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnAdd))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(txFieldPlaying))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(btnDelete)
                                .addGap(55, 55, 55)
                                .addComponent(btnPrev)
                                .addGap(64, 64, 64)
                                .addComponent(btnPlay)
                                .addGap(64, 64, 64)
                                .addComponent(btnStop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addComponent(btnNext)
                                .addGap(23, 23, 23)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txFieldPlaying, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnPrev)
                    .addComponent(btnPlay)
                    .addComponent(btnStop)
                    .addComponent(btnNext))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txFieldPlayingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txFieldPlayingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txFieldPlayingActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextActionPerformed

    public Object getBtnAdd(){
        return btnAdd;
    }

    public Object getBtnDelete(){
        return btnDelete;
    }
    
    public Object getBtnNext(){
        return btnNext;
    }
    
    public Object getBtnPlay(){
        return btnPlay;
    }
    
    public Object getBtnPrev(){
        return btnPrev;
    }
    
    public Object getBtnStop(){
        return btnStop;
    }
    
    public void SetListMusic(String[] musicList){
        listMusic.setListData(musicList);
    }
    
    public void setTxFieldPlaying(String filename){
        txFieldPlaying.setText(filename);
    }
    
    public int getSelectedMusic(){
        if(listMusic.getSelectedIndex() == -1){
            throw new IllegalStateException("Please select any music");
        }
        return listMusic.getSelectedIndex();
    }
    
    public void addListener(ActionListener e){
        btnAdd.addActionListener(e);
        btnDelete.addActionListener(e);
        btnNext.addActionListener(e);
        btnPlay.addActionListener(e);
        btnPrev.addActionListener(e);
        btnStop.addActionListener(e);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listMusic;
    private javax.swing.JTextField txFieldPlaying;
    // End of variables declaration//GEN-END:variables
}
