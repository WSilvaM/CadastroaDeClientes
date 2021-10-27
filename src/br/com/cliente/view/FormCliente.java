/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cliente.view;

import br.com.cliente.bean.Cliente;
import br.com.cliente.bean.MaskCampo;
import br.com.cliente.controle.ClienteCT;
import java.text.ParseException;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author tecsistem
 */
public class FormCliente extends javax.swing.JFrame {

    private String Genero;
    
    public FormCliente() {
        initComponents();
        Mascaras();
        
        jRadioButtM.setSelected(true);
        
        CarregarLista();
         }
    
        public void Mascaras(){
           MaskCampo mask = new MaskCampo(); 
           
           try{
               new JFormattedTextField(mask.maskCep(jFortxtCEP));
                  new JFormattedTextField(mask.maskCelefone(jFormTextCEL));
                  new JFormattedTextField(mask.maskCnpj(jForTextCNPJ));
                    new JFormattedTextField(mask.maskTelefone(jForTextTEL));
                    new JFormattedTextField(mask.maskCpf(jFormTexCPF));
                            
              }catch(ParseException e){
               e.printStackTrace();
           }
        }
  
        public Cliente montaCliente(){
            Cliente c = new Cliente();
            
            c.setNome(jTextFieldNOE.getText());
            c.setEndereco(jTextFieldEND.getText());
            c.setCelular(jFormTextCEL.getText());
            c.setMunicipio(jTextFieldMUN.getText());
            c.setCep(jFortxtCEP.getText());
            c.setTelefone(jForTextTEL.getText());
            c.setCpf(jFormTexCPF.getText());
            c.setCnpj(jForTextCNPJ.getText());
            c.setGenero(Genero);
            
      if(jTextFieldID.getText() != null && jTextFieldID.getText().equals("")){
            c.setId(Integer.parseInt(jTextFieldID.getText()));
        }
          return c;   
        }
        public void LimparTela(){
            jCombBoxPESQ.setSelectedIndex(0);
            jTextFieldID.setText("");
            jForTextCNPJ.setText("");
            jFormTexCPF.setText("");
            jFortxtCEP.setText("");
            jTextFieldEND.setText("");
            jForTextTEL.setText("");
            jFormTextCEL.setText("");
            jTextFieldMUN.setText("");
            jTextFieldNOE.setText("");

            
            jRadioButtM.setSelected(true);
           //jRadioButtoF.setSelected(true);
            
        
    }
        
        public void ClienteSelecinado(Cliente c) {
            jTextFieldNOE.setText(c.getNome());
            jTextFieldEND.setText(c.getEndereco());
            jForTextCNPJ.setText(c.getCnpj());
            jForTextTEL.setText(c.getTelefone());
            jFormTextCEL.setText(c.getCelular());
            jFormTexCPF.setText(c.getCpf());
            jFortxtCEP.setText(c.getCep());
            jTextFieldMUN.setText(c.getMunicipio());
        //jTextFieldID.setText(c.getid());
        
        if(c.getGenero().equals("F")){
            jRadioButtoF.setSelected(true);
            jRadioButtM.setSelected(false);
        }else if (c.getGenero().equals("M")){
            jRadioButtM.setSelected(true);
            jRadioButtoF.setSelected(false);
        }
        if(c.getId()!= null && c.getId() >0){
            jTextFieldID.setText(c.getId().toString());
        }
    }
        
       public void CarregarLista(){
            ClienteCT mbc = new  ClienteCT();
            
            List<Cliente> clienteDB = mbc.select();
            
            jCombBoxPESQ.removeAllItems();
            
            for (Cliente cliente : clienteDB) {
              jCombBoxPESQ.addItem(cliente.getNome());
            }
            }
           /* for (int i = o; i < ClienteDB.Size(); i ++){
                Cliente cliente = clienteDB.get(i);
                jCombBoxPESQ.addItem(clienete.getNome);
            }*/
    
 
        
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        contentPane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCombBoxPESQ = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextFieldNOE = new javax.swing.JTextField();
        jTextFieldEND = new javax.swing.JTextField();
        jTextFieldMUN = new javax.swing.JTextField();
        jFortxtCEP = new javax.swing.JFormattedTextField();
        jForTextTEL = new javax.swing.JFormattedTextField();
        jFormTextCEL = new javax.swing.JFormattedTextField();
        jLabelNOM = new javax.swing.JLabel();
        jLabelEND = new javax.swing.JLabel();
        jLabelMUN = new javax.swing.JLabel();
        jLabelCEP = new javax.swing.JLabel();
        jLabelTEL = new javax.swing.JLabel();
        jLabelCEL = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabelID = new javax.swing.JLabel();
        jRadioButtM = new javax.swing.JRadioButton();
        jRadioButtoF = new javax.swing.JRadioButton();
        jLabelPES = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel11CNPJ = new javax.swing.JLabel();
        jLabel12GEN = new javax.swing.JLabel();
        jFormTexCPF = new javax.swing.JFormattedTextField();
        jForTextCNPJ = new javax.swing.JFormattedTextField();
        jButLUP = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contentPane.setBackground(new java.awt.Color(0, 153, 153));
        contentPane.setForeground(new java.awt.Color(0, 153, 204));
        contentPane.setEnabled(false);
        contentPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de clientes");
        contentPane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 330, 30));

        jCombBoxPESQ.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCombBoxPESQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombBoxPESQActionPerformed(evt);
            }
        });
        contentPane.add(jCombBoxPESQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 240, -1));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\tecsistem\\Desktop\\Icones\\bttGravar.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        contentPane.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, 30));

        jTextFieldNOE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        contentPane.add(jTextFieldNOE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 290, -1));

        jTextFieldEND.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        contentPane.add(jTextFieldEND, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 360, -1));

        jTextFieldMUN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        contentPane.add(jTextFieldMUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 150, -1));

        try {
            jFortxtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        contentPane.add(jFortxtCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 180, -1));

        try {
            jForTextTEL.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        contentPane.add(jForTextTEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 180, -1));

        try {
            jFormTextCEL.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#,####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        contentPane.add(jFormTextCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 180, -1));

        jLabelNOM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelNOM.setForeground(new java.awt.Color(240, 240, 240));
        jLabelNOM.setText("Nome/Empre..");
        contentPane.add(jLabelNOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabelEND.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelEND.setForeground(new java.awt.Color(240, 240, 240));
        jLabelEND.setText("Endereço:");
        contentPane.add(jLabelEND, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabelMUN.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelMUN.setForeground(new java.awt.Color(240, 240, 240));
        jLabelMUN.setText("Municipio:");
        contentPane.add(jLabelMUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jLabelCEP.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelCEP.setForeground(new java.awt.Color(240, 240, 240));
        jLabelCEP.setText("Cep:");
        contentPane.add(jLabelCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabelTEL.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelTEL.setForeground(new java.awt.Color(240, 240, 240));
        jLabelTEL.setText("Tel:");
        contentPane.add(jLabelTEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 40, -1));

        jLabelCEL.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelCEL.setForeground(new java.awt.Color(240, 240, 240));
        jLabelCEL.setText("Cel:");
        contentPane.add(jLabelCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, 20));

        jLabelCPF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelCPF.setForeground(new java.awt.Color(240, 240, 240));
        jLabelCPF.setText("Cpf:");
        contentPane.add(jLabelCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\tecsistem\\Desktop\\Icones\\bttEditar.png")); // NOI18N
        contentPane.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, 30));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\tecsistem\\Desktop\\Icones\\bttExcluir.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        contentPane.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, 30));

        jLabelID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(240, 240, 240));
        jLabelID.setText("ID:");
        contentPane.add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 30, 20));

        buttonGroup1.add(jRadioButtM);
        jRadioButtM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButtM.setText("M");
        jRadioButtM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtMActionPerformed(evt);
            }
        });
        contentPane.add(jRadioButtM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, 20));

        buttonGroup1.add(jRadioButtoF);
        jRadioButtoF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButtoF.setText("F");
        jRadioButtoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtoFActionPerformed(evt);
            }
        });
        contentPane.add(jRadioButtoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, 20));

        jLabelPES.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelPES.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPES.setText("Pesquisar:");
        contentPane.add(jLabelPES, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, 20));

        jTextFieldID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldID.setText("1");
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });
        contentPane.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 60, -1));

        jLabel11CNPJ.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11CNPJ.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11CNPJ.setText("Cnpj:");
        contentPane.add(jLabel11CNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel12GEN.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12GEN.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12GEN.setText("Gênero:");
        contentPane.add(jLabel12GEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        try {
            jFormTexCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        contentPane.add(jFormTexCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 190, -1));

        try {
            jForTextCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        contentPane.add(jForTextCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 190, -1));

        jButLUP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cliente/view/bttPesquisar.png"))); // NOI18N
        jButLUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButLUPActionPerformed(evt);
            }
        });
        contentPane.add(jButLUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 30, -1));

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\tecsistem\\Desktop\\Icones\\bttLimpar.png")); // NOI18N
        contentPane.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, 30));

        getContentPane().add(contentPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCombBoxPESQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombBoxPESQActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jCombBoxPESQActionPerformed

    private void jRadioButtMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtMActionPerformed
        Genero = "M";
    }//GEN-LAST:event_jRadioButtMActionPerformed

    private void jRadioButtoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtoFActionPerformed
      Genero = "F";
    }//GEN-LAST:event_jRadioButtoFActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jButLUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButLUPActionPerformed
if(jCombBoxPESQ.getSelectedItem() != null 
               && !jCombBoxPESQ.getSelectedItem().equals("")){
    
    ClienteCT ct = new ClienteCT();
      Cliente c = ct.selectandname(jCombBoxPESQ.getSelectedItem().toString());
    ClienteSelecinado(c);
}else{
    JOptionPane.showMessageDialog(null,"Escolha um "
    + "cliente na lista para pesquisar!");
}     
    }//GEN-LAST:event_jButLUPActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String[] option = {"Sim", "Nao"};
        
        int conf = JOptionPane.showOptionDialog(null,
                  null, "CONFIRMAR EXCLUSÃO?",
                  JOptionPane.OK_CANCEL_OPTION,
                  JOptionPane.QUESTION_MESSAGE,
                  null,
                  option, option[1]);
        if(conf == JOptionPane.YES_OPTION){
            Cliente c = montaCliente();
            ClienteCT cbc = new ClienteCT();
            cbc.delete(c);
            LimparTela();
            CarregarLista();
            
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Cliente c = montaCliente();
       
       ClienteCT cbc = new ClienteCT();
       cbc.insert(c);
       
       LimparTela();
      
       CarregarLista();
       
       JOptionPane.showMessageDialog(null, "Cliente"
       + jTextFieldNOE.getText()+ " Cadastrado...");
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JPanel contentPane;
    private javax.swing.JButton jButLUP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jCombBoxPESQ;
    private javax.swing.JFormattedTextField jForTextCNPJ;
    private javax.swing.JFormattedTextField jForTextTEL;
    private javax.swing.JFormattedTextField jFormTexCPF;
    private javax.swing.JFormattedTextField jFormTextCEL;
    private javax.swing.JFormattedTextField jFortxtCEP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11CNPJ;
    private javax.swing.JLabel jLabel12GEN;
    private javax.swing.JLabel jLabelCEL;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelEND;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelMUN;
    private javax.swing.JLabel jLabelNOM;
    private javax.swing.JLabel jLabelPES;
    private javax.swing.JLabel jLabelTEL;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButton jRadioButtM;
    private javax.swing.JRadioButton jRadioButtoF;
    private javax.swing.JTextField jTextFieldEND;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldMUN;
    private javax.swing.JTextField jTextFieldNOE;
    // End of variables declaration//GEN-END:variables
}
