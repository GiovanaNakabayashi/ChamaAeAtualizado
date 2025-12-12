
package view;

import controller.TelaProcuraController;
import dao.Conexao;
import dao.UsuarioDAO;
import dao.prestadoresDAO;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Sessao;
import model.Usuarios;
import model.prestadores;
import service.PrestadorService;



public class telaProcura extends javax.swing.JFrame {
    
    private TableRowSorter<DefaultTableModel> sorter;
    private PrestadorService prestadorService;
      

    public telaProcura() {
        initComponents();
        setLocationRelativeTo(null);
        configurarFiltro();
        carregarTabela();
        campoNomeSobrenome.setText(Sessao.nome);
        
       } 
     
     public final void carregarTabela() {
          try{
              
        Connection conexao = Conexao.conectar();
        prestadoresDAO dao = new prestadoresDAO(conexao);
        
        List<prestadores> lista = dao.listarPrestadores();

        DefaultTableModel modelo = (DefaultTableModel) tabelaServicos.getModel();
        modelo.setRowCount(0);

        for (prestadores p : lista) {
            modelo.addRow(new Object[]{
                p.getNome(),
                p.getServico(),
                p.getContato(),
                p.getCidade(),
                
            });
            }
      sorter = new TableRowSorter<>(modelo);
      tabelaServicos.setRowSorter(sorter);
         
          } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar Lista: " + e.getMessage());
        }
     }
        private void configurarFiltro() {
        DocumentListener listener = new DocumentListener() {
        public void insertUpdate(DocumentEvent e) {filtrar(); }
        public void removeUpdate(DocumentEvent e) {filtrar();}
        public void changedUpdate(DocumentEvent e) {filtrar();}

        private void filtrar() {
            String servico = txtProcuraServico.getText().trim();
            String cidade = txtCidadePrestador.getText().trim();

            ArrayList<RowFilter<Object, Object>> filtros = new ArrayList<>();
            if (!servico.isEmpty()) {filtros.add(RowFilter.regexFilter("(?i)" + servico, 1));}
            if (!cidade.isEmpty()) { filtros.add(RowFilter.regexFilter("(?i)" + cidade, 3));}
            
           sorter.setRowFilter(filtros.isEmpty() ? null : RowFilter.andFilter(filtros));
            }
        
    };

    txtProcuraServico.getDocument().addDocumentListener(listener);
    txtCidadePrestador.getDocument().addDocumentListener(listener);
}
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCidadePrestador = new javax.swing.JTextField();
        txtProcuraServico = new javax.swing.JTextField();
        campoft = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaServicos = new javax.swing.JTable();
        btnConfig = new javax.swing.JToggleButton();
        btnSair = new javax.swing.JToggleButton();
        campoNomeSobrenome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(246, 231, 199));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setText("+`cidade:");

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel2.setText("o que procura?");

        campoft.setToolTipText("");
        campoft.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tabelaServicos.setAutoCreateRowSorter(true);
        tabelaServicos.setBackground(new java.awt.Color(246, 231, 199));
        tabelaServicos.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        tabelaServicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Serviço", "Contato", "Cidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaServicos);

        btnConfig.setBackground(new java.awt.Color(246, 231, 199));
        btnConfig.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        btnConfig.setText("Configurações");
        btnConfig.setBorder(null);
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(246, 231, 199));
        btnSair.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setBorder(null);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        campoNomeSobrenome.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        campoNomeSobrenome.setText(" Nome Sobrenome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnConfig)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(campoft, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProcuraServico, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidadePrestador, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(campoNomeSobrenome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoft, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCidadePrestador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtProcuraServico, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(70, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNomeSobrenome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfig)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair)
                        .addGap(89, 89, 89))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
       try {
        TelaProcuraController controller = new TelaProcuraController();
        Usuarios usuario = controller.buscarUsuarioLogado(Sessao.cadastroId);

        // Agora você passa o usuário para a tela de edição
        new telaEditarCadastro(usuario).setVisible(true);
        dispose();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage());
    }

    }//GEN-LAST:event_btnConfigActionPerformed

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
            java.util.logging.Logger.getLogger(telaProcura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaProcura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaProcura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaProcura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnConfig;
    private javax.swing.JToggleButton btnSair;
    private javax.swing.JLabel campoNomeSobrenome;
    private javax.swing.JLabel campoft;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaServicos;
    private javax.swing.JTextField txtCidadePrestador;
    private javax.swing.JTextField txtProcuraServico;
    // End of variables declaration//GEN-END:variables
}
