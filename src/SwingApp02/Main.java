package SwingApp02;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Main {
    public static void main (String[] args){
        Runnable t = new Runnable (){
         public void run (){
             criarGUI();
         }
    };
        SwingUtilities.invokeLater(t);
    }
       // Para Criar a tela com Java Swing.
   public static void criarGUI(){
       JFrame tela = new JFrame();
       
       // Tamanho da tela.
       Dimension d = new Dimension(400,600);
       tela.setMinimumSize(d);
       // Abrir e fechar a tela do programa.
       tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // Título da tela.
       tela.setTitle("Swing App 02");
       // Tela sobre tela.
       JPanel panel = new JPanel();
       tela.getContentPane().add (panel);
       
       // Criar CheckBox.
       JCheckBox checkbox = new JCheckBox("Clique aqui");
       tela.add(checkbox);
       
       
       ItemListener itemlistener = new ItemListener(){

           public void itemStateChanged(ItemEvent e) {
               if(e.getStateChange()== ItemEvent.SELECTED);
               System.out.println("Selecionado");
           }

       };
       checkbox.addItemListener(itemlistener);
       // Conteúdo da tela.
       JLabel label = new JLabel("Login: ");
       panel.add(label);
       
       // Entrada de dados (texto).
       final JTextField field = new JTextField(10);
       panel.add(field);
       
       // Adissionar botão.
       JButton button = new JButton("Next");
       panel.add(button);
       
       // Adicionar ação para o botão.
       button.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(tela,"Nome: "+field.getText());
           }
       });
       
       // Tela automatica.
       tela.pack();
       tela.setVisible(true);
       
   }
}
