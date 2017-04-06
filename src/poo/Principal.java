package poo;

import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 * Projeto exemplo para conhecer alguns componentes do Swing, seus eventos e propriedades
 * 
 * Esse projeto está incompleto e o aluno precisaria fazer os ajustes finais para 
 * que a aplicação fique correta.
 * 
 * @author Emerson Ribeiro de Mello
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        // O Frame será desenhado no centro da área de trabalho
        this.setLocationRelativeTo(null);
        
        // Ou altera as propriedades do componente JList no editor de propriedades
        // do Netbeans ou faz por meio da linha abaixo
        //jLPermissoes.setModel(new DefaultListModel<>());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGSexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jRBFeminino = new javax.swing.JRadioButton();
        jRBMasculino = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jFTFCpf = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jCBPermissoes = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLPermissoes = new javax.swing.JList<>();
        jBExcluir = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jCBTarde = new javax.swing.JCheckBox();
        jCBManha = new javax.swing.JCheckBox();
        jCBNoite = new javax.swing.JCheckBox();
        jBRemover = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jBAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exemplo Java Swing");
        setResizable(false);

        jLabel1.setText("Nome:");

        jTFNome.setNextFocusableComponent(jFTFCpf);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        bGSexo.add(jRBFeminino);
        jRBFeminino.setText("Feminino");
        jRBFeminino.setNextFocusableComponent(jRBMasculino);

        bGSexo.add(jRBMasculino);
        jRBMasculino.setText("Masculino");
        jRBMasculino.setNextFocusableComponent(jCBManha);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jRBFeminino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRBMasculino)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jRBFeminino)
                .addComponent(jRBMasculino))
        );

        jLabel2.setText("CPF:");

        try {
            jFTFCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFCpf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFTFCpf.setNextFocusableComponent(jRBFeminino);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Permissões"));

        jCBPermissoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Leitura", "Escrita", "Execução" }));
        jCBPermissoes.setSelectedIndex(-1);
        jCBPermissoes.setNextFocusableComponent(jLPermissoes);
        jCBPermissoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBPermissoesActionPerformed(evt);
            }
        });

        jLPermissoes.setModel(new DefaultListModel<>());
        jLPermissoes.setNextFocusableComponent(jBExcluir);
        jScrollPane1.setViewportView(jLPermissoes);

        jBExcluir.setText("Excluir");
        jBExcluir.setNextFocusableComponent(jBLimpar);
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBLimpar.setText("Limpar");
        jBLimpar.setNextFocusableComponent(jBAdicionar);
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBPermissoes, 0, 237, Short.MAX_VALUE)
                    .addComponent(jBExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCBPermissoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBLimpar)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Turno de trabalho"));

        jCBTarde.setText("Tarde");
        jCBTarde.setNextFocusableComponent(jCBNoite);

        jCBManha.setText("Manhã");
        jCBManha.setNextFocusableComponent(jCBTarde);

        jCBNoite.setText("Noite");
        jCBNoite.setNextFocusableComponent(jCBPermissoes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCBManha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(jCBTarde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(jCBNoite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jCBNoite)
                    .addComponent(jCBTarde)
                    .addComponent(jCBManha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBRemover.setText("Remover");
        jBRemover.setEnabled(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Sexo", "Turno", "Permissões"
            }
        ));
        jTableUsuarios.setFocusable(false);
        jTableUsuarios.setNextFocusableComponent(jBRemover);
        jTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableUsuariosMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTableUsuarios);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jBAdicionar.setText("Adicionar");
        jBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBRemover))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jTFNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jFTFCpf)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRemover)
                    .addComponent(jBAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jCBPermissoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBPermissoesActionPerformed
        
        // obtendo o índice do item selecionado
        int index = jCBPermissoes.getSelectedIndex();
        
        if (index >= 0) {
            String permissao = jCBPermissoes.getItemAt(index);

            // adicionando elemento selecionado na lista
            DefaultListModel<String> modeloLista = (DefaultListModel<String>) jLPermissoes.getModel();
            
            // só adiciona se o elemento não estiver na lista
            if (! modeloLista.contains(permissao)){
                modeloLista.addElement(permissao);
            }

            // deixando a seleção em branco
            jCBPermissoes.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_jCBPermissoesActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed

        // deixando a seleção em branco
        jCBPermissoes.setSelectedIndex(-1);

        // Limpando todos itens da lista
        jLPermissoes.setModel(new DefaultListModel<>());
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        
        DefaultListModel<String> modeloLista = (DefaultListModel<String>) jLPermissoes.getModel();
        
        // percorrendo as linhas e as removendo
        for(String item : jLPermissoes.getSelectedValuesList()){
            modeloLista.removeElement(item);
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarActionPerformed
        
        
        DefaultTableModel modelo = (DefaultTableModel) jTableUsuarios.getModel();
        String linha[] = new String[5];
        linha[0] = jTFNome.getText();
        linha[1] = jFTFCpf.getText();
        linha[2] =  (jRBFeminino.isSelected()) ? "Feminino " : "Masculino";
        
        if (jCBManha.isSelected()){
            linha[3] = "Manha";
            // precisa terminar de fazer a lógica
        }

        DefaultListModel<String> modeloLista = (DefaultListModel<String>) jLPermissoes.getModel();
        
        linha[4] = modeloLista.toString();
        
        modelo.addRow(linha);
        
        // limpando todos os campos
        jTFNome.setText("");
        // ..... falta fazer para os demais
        
        //mudando o foco do teclado para o campo Nome
        jTFNome.requestFocus();
        
        
    }//GEN-LAST:event_jBAdicionarActionPerformed

    private void jTableUsuariosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosMouseReleased
        
        // habilitando o botão que permitirá remover as linhas selecionadas
        jBRemover.setEnabled(true);
        
    }//GEN-LAST:event_jTableUsuariosMouseReleased

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGSexo;
    private javax.swing.JButton jBAdicionar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBRemover;
    private javax.swing.JCheckBox jCBManha;
    private javax.swing.JCheckBox jCBNoite;
    private javax.swing.JComboBox<String> jCBPermissoes;
    private javax.swing.JCheckBox jCBTarde;
    private javax.swing.JFormattedTextField jFTFCpf;
    private javax.swing.JList<String> jLPermissoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRBFeminino;
    private javax.swing.JRadioButton jRBMasculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTable jTableUsuarios;
    // End of variables declaration//GEN-END:variables
}
