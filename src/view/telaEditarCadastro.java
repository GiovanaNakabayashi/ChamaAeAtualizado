
package view;

import javax.swing.JOptionPane;
import model.Sessao;
import model.Usuarios;
import model.prestadores;
import controller.EditarCadastroController;
import dao.Conexao;
import java.sql.Connection;


public class telaEditarCadastro extends javax.swing.JFrame {
    private Usuarios usuario;
    
      public telaEditarCadastro(Usuarios usuario) {
        this.usuario = usuario;
        initComponents();
        setLocationRelativeTo(null);
        campoNomeSobrenome.setText(Sessao.nome);
        
        
        painelUsuario.setVisible(false);
        painelPrestador.setVisible(false);
        
        if (Sessao.status.equalsIgnoreCase("usuario")) {
        painelUsuario.setVisible(true);
        
        txtEditarCadastronomeusuario.setText(Sessao.nome);
        txtEditarCadastrocpfusuario.setText(Sessao.cpf);
        txtEditarCadastrocontatousuario.setText(Sessao.contato);
        txtEditarCadastroenderecousuario.setText(Sessao.endereco);
        
        
    } else if (Sessao.status.equalsIgnoreCase("prestador")) {
        painelPrestador.setVisible(true);
        
        txtEditarCadastronomePrestador.setText(Sessao.nome);
        txtEditarCadastrorgprestador.setText(Sessao.rg);
        txtEditarCadastroservicoprestador.setText(Sessao.servico);
        txtEditarCadastrocontatoPrestador.setText(Sessao.contato);
        txtEditarCadastrocidadeprestador.setText(Sessao.cidade);

    }
    }
      
    
    private final EditarCadastroController controller = new EditarCadastroController();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        painelPrestador = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEditarCadastronomePrestador = new javax.swing.JTextField();
        txtEditarCadastrorgprestador = new javax.swing.JTextField();
        txtEditarCadastroservicoprestador = new javax.swing.JTextField();
        txtEditarCadastrocidadeprestador = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtEditarCadastrocontatoPrestador = new javax.swing.JTextField();
        painelUsuario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEditarCadastronomeusuario = new javax.swing.JTextField();
        txtEditarCadastrocpfusuario = new javax.swing.JTextField();
        txtEditarCadastroenderecousuario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtEditarCadastrocontatousuario = new javax.swing.JTextField();
        btnEditar = new javax.swing.JToggleButton();
        btnVoltar2 = new javax.swing.JToggleButton();
        campoft = new javax.swing.JLabel();
        campoNomeSobrenome = new javax.swing.JLabel();
        btnSair = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(246, 231, 199));

        painelPrestador.setBackground(new java.awt.Color(246, 231, 199));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel5.setText("Nome:");

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel6.setText("RG:");

        jLabel7.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel7.setText("Serviço:");

        jLabel8.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel8.setText("Cidade:");

        txtEditarCadastronomePrestador.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N

        txtEditarCadastrorgprestador.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N

        txtEditarCadastroservicoprestador.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N

        txtEditarCadastrocidadeprestador.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel14.setText("Contato");

        txtEditarCadastrocontatoPrestador.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N

        javax.swing.GroupLayout painelPrestadorLayout = new javax.swing.GroupLayout(painelPrestador);
        painelPrestador.setLayout(painelPrestadorLayout);
        painelPrestadorLayout.setHorizontalGroup(
            painelPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrestadorLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(painelPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrestadorLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(26, 26, 26)
                        .addComponent(txtEditarCadastrocontatoPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(painelPrestadorLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                            .addComponent(txtEditarCadastrocidadeprestador, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelPrestadorLayout.createSequentialGroup()
                            .addGroup(painelPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(22, 22, 22)
                            .addGroup(painelPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEditarCadastrorgprestador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                .addComponent(txtEditarCadastroservicoprestador)
                                .addComponent(txtEditarCadastronomePrestador)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        painelPrestadorLayout.setVerticalGroup(
            painelPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrestadorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(painelPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEditarCadastronomePrestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEditarCadastrorgprestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(painelPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEditarCadastroservicoprestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEditarCadastrocidadeprestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(painelPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtEditarCadastrocontatoPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelUsuario.setBackground(new java.awt.Color(246, 231, 199));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel4.setText("Endereço:");

        txtEditarCadastronomeusuario.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N

        txtEditarCadastrocpfusuario.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N

        txtEditarCadastroenderecousuario.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel13.setText("Contato");

        txtEditarCadastrocontatousuario.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N

        javax.swing.GroupLayout painelUsuarioLayout = new javax.swing.GroupLayout(painelUsuario);
        painelUsuario.setLayout(painelUsuarioLayout);
        painelUsuarioLayout.setHorizontalGroup(
            painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelUsuarioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtEditarCadastrocontatousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelUsuarioLayout.createSequentialGroup()
                        .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEditarCadastronomeusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(txtEditarCadastrocpfusuario)
                            .addComponent(txtEditarCadastroenderecousuario, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        painelUsuarioLayout.setVerticalGroup(
            painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelUsuarioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEditarCadastronomeusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEditarCadastrocpfusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEditarCadastroenderecousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtEditarCadastrocontatousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        btnEditar.setBackground(new java.awt.Color(246, 231, 199));
        btnEditar.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnVoltar2.setBackground(new java.awt.Color(246, 231, 199));
        btnVoltar2.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btnVoltar2.setText("Voltar");
        btnVoltar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar2ActionPerformed(evt);
            }
        });

        campoft.setToolTipText("");
        campoft.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        campoNomeSobrenome.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        campoNomeSobrenome.setText(" Nome Sobrenome");

        btnSair.setBackground(new java.awt.Color(246, 231, 199));
        btnSair.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setBorder(null);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(campoft, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(campoNomeSobrenome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnSair)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252)
                .addComponent(btnVoltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(painelPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(campoft, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeSobrenome)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVoltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(85, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair)
                        .addGap(87, 87, 87))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
 
        try {
        
        
        if (Sessao.status.equalsIgnoreCase("usuario")) {
            Usuarios usuario = new Usuarios();
            usuario.setNome(txtEditarCadastronomeusuario.getText());
            usuario.setCpf(txtEditarCadastrocpfusuario.getText());
            usuario.setEndereco(txtEditarCadastroenderecousuario.getText());
            usuario.setContato(txtEditarCadastrocontatousuario.getText());
            usuario.setCadastro(Sessao.cadastroId);

             controller.atualizarUsuario(usuario);
        } else {
            prestadores prestador = new prestadores();
            prestador.setNome(txtEditarCadastronomePrestador.getText());
            prestador.setRg(txtEditarCadastrorgprestador.getText());
            prestador.setServico(txtEditarCadastroservicoprestador.getText());
            prestador.setContato(txtEditarCadastrocontatoPrestador.getText());
            prestador.setCidade(txtEditarCadastrocidadeprestador.getText());
            prestador.setCadastro(Sessao.cadastroId);

             controller.atualizarPrestador(prestador);
        }

          JOptionPane.showMessageDialog(this, "Alterações salvas com sucesso!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao salvar: " + e.getMessage());
        e.printStackTrace();
    }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar2ActionPerformed
       dispose();
    }//GEN-LAST:event_btnVoltar2ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
    dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(telaEditarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaEditarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaEditarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaEditarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnEditar;
    private javax.swing.JToggleButton btnSair;
    private javax.swing.JToggleButton btnVoltar2;
    private javax.swing.JLabel campoNomeSobrenome;
    private javax.swing.JLabel campoft;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel painelPrestador;
    private javax.swing.JPanel painelUsuario;
    private javax.swing.JTextField txtEditarCadastrocidadeprestador;
    private javax.swing.JTextField txtEditarCadastrocontatoPrestador;
    private javax.swing.JTextField txtEditarCadastrocontatousuario;
    private javax.swing.JTextField txtEditarCadastrocpfusuario;
    private javax.swing.JTextField txtEditarCadastroenderecousuario;
    private javax.swing.JTextField txtEditarCadastronomePrestador;
    private javax.swing.JTextField txtEditarCadastronomeusuario;
    private javax.swing.JTextField txtEditarCadastrorgprestador;
    private javax.swing.JTextField txtEditarCadastroservicoprestador;
    // End of variables declaration//GEN-END:variables
}
