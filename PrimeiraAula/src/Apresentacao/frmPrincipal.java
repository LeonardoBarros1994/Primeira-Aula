
package Apresentacao;

public class frmPrincipal extends javax.swing.JFrame
{

  
    public frmPrincipal()
    {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblPrimeiroNumero = new javax.swing.JLabel();
        txfPrimeiroNumero = new javax.swing.JTextField();
        lblSegundoNumero = new javax.swing.JLabel();
        txfSegundoNumero = new javax.swing.JTextField();
        btnSomar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        btnSubitrair = new javax.swing.JToggleButton();
        btnMultiplicacao = new javax.swing.JToggleButton();
        btnDivisao = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Somar dois números");

        lblPrimeiroNumero.setText("Digite o Primeiro Número");

        lblSegundoNumero.setText("Digite o Segundo Número");

        btnSomar.setText("+");
        btnSomar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSomarActionPerformed(evt);
            }
        });

        btnSubitrair.setText("-");
        btnSubitrair.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSubitrairActionPerformed(evt);
            }
        });

        btnMultiplicacao.setText("*");
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMultiplicacaoActionPerformed(evt);
            }
        });

        btnDivisao.setText("/");
        btnDivisao.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDivisaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txfPrimeiroNumero)
                            .addComponent(txfSegundoNumero)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(lblPrimeiroNumero)
                                    .addComponent(lblSegundoNumero)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(15, 15, 15)))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSubitrair, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 61, Short.MAX_VALUE)))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblResultado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblPrimeiroNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfPrimeiroNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(lblSegundoNumero)
                .addGap(18, 18, 18)
                .addComponent(txfSegundoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubitrair, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(lblResultado)
                .addGap(79, 79, 79))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSomarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSomarActionPerformed
    {//GEN-HEADEREND:event_btnSomarActionPerformed
     Double n1 = 0.0, n2 = 0.0, resultado = 0.0;
     n1 = Double.parseDouble (txfPrimeiroNumero.getText());
     n2 = Double.parseDouble (txfSegundoNumero.getText());
     resultado = n1 + n2;
     lblResultado.setText(resultado.toString());
    }//GEN-LAST:event_btnSomarActionPerformed

    private void btnSubitrairActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSubitrairActionPerformed
    {//GEN-HEADEREND:event_btnSubitrairActionPerformed
     Double n1 = 0.0, n2 = 0.0, resultado = 0.0;
     n1 = Double.parseDouble (txfPrimeiroNumero.getText());
     n2 = Double.parseDouble (txfSegundoNumero.getText());
     resultado = n1 - n2;
     lblResultado.setText(resultado.toString());
    }//GEN-LAST:event_btnSubitrairActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMultiplicacaoActionPerformed
    {//GEN-HEADEREND:event_btnMultiplicacaoActionPerformed
     Double n1 = 0.0, n2 = 0.0, resultado = 0.0;
     n1 = Double.parseDouble (txfPrimeiroNumero.getText());
     n2 = Double.parseDouble (txfSegundoNumero.getText());
     resultado = n1 * n2;
     lblResultado.setText(resultado.toString());
        
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDivisaoActionPerformed
    {//GEN-HEADEREND:event_btnDivisaoActionPerformed
        Double n1 = 0.0, n2 = 0.0, resultado = 0.0;
        n1 = Double.parseDouble (txfPrimeiroNumero.getText());
        n2 = Double.parseDouble (txfSegundoNumero.getText());
        resultado = n1 / n2;
        lblResultado.setText(resultado.toString());
    }//GEN-LAST:event_btnDivisaoActionPerformed

    
    public static void main(String args[])
    {
       
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDivisao;
    private javax.swing.JToggleButton btnMultiplicacao;
    private javax.swing.JButton btnSomar;
    private javax.swing.JToggleButton btnSubitrair;
    private javax.swing.JLabel lblPrimeiroNumero;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSegundoNumero;
    private javax.swing.JTextField txfPrimeiroNumero;
    private javax.swing.JTextField txfSegundoNumero;
    // End of variables declaration//GEN-END:variables
}
