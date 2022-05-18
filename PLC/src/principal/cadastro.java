package principal;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class cadastro extends JFrame implements ActionListener {
	String nomeUser;
	String senhaUser;

			//Campos
			JLabel lUser = new JLabel("Usuario");
			JTextField tUser = new JTextField();	
			JLabel lSenha = new JLabel("Senha");
			JPasswordField senha = new JPasswordField();
			JLabel logado = new JLabel("");
	
			//Botoes
			JButton confirm = new JButton("Confirmar");	
			JButton limpar = new JButton("Limpar");	
			//confirm.setForeground(Color); 
		
			int erros = 0;
			
		public cadastro() {
			
			Container c = getContentPane();
			
			System.out.println(erros);
			
			//modelagem da tela
			setVisible(true);
			setSize(400, 350);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLayout(null);
			getContentPane().setBackground(Color.YELLOW);
			confirm.setForeground(Color.PINK);
			confirm.setBackground(Color.GRAY);
			limpar.setForeground(Color.PINK);
			limpar.setBackground(Color.GRAY);
			
				
			//Adicionar botoes
			c.add(lUser);
			c.add(tUser);
			c.add(lSenha);
			c.add(senha);
			c.add(confirm);
			c.add(limpar);
			c.add(logado);
			confirm.addActionListener(this); 
			limpar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					tUser.setText("");
					senha.setText("");
					
				}
			});
			
			//organizar botoes
			lUser.setBounds(5, 50, 200, 20);
			tUser.setBounds(70, 50, 200, 20);
			lSenha.setBounds(5, 80, 200, 20);
			senha.setBounds(70, 80, 200, 20);
			confirm.setBounds(20, 150, 100, 30);
			limpar.setBounds(150, 150, 100, 30);
			
			
	}
	
	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(tUser.getText().equals(nomeUser) && senha.getText().equals(senhaUser)) {
					logado.setText("Conectado");
					JOptionPane.showMessageDialog(null, "Usuario " + tUser.getText() + " " + logado.getText(), "Ola!", JOptionPane.INFORMATION_MESSAGE, null);
				}else {
				 logado.setText("Usuario ou Senha Incorreta " +(erros ) +" tentativas ");
				JOptionPane.showMessageDialog(null, logado, "Ola!", JOptionPane.INFORMATION_MESSAGE, null); 
				erros++;
				}
				
				if (erros == 3 ) {
				logado.setText("Usuario Bloqueado!!!");
				JOptionPane.showMessageDialog(null, logado, "Atenção!!!", JOptionPane.INFORMATION_MESSAGE, null);
				}
				
				
			
	}
			
			
	public void setLoginSenha(String usuario, String senha) {
		
		this.nomeUser= usuario;
		this.senhaUser = senha;
	}

}