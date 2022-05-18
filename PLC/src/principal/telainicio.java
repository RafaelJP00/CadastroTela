package principal;

import javax.swing.JOptionPane;

public class telainicio {

	public static void main(String[] args) {
	
	String user = JOptionPane.showInputDialog("Cadastro de usuario", "Digite o usuario");
	String senha = JOptionPane.showInputDialog("Cadastro de senha", "Digite a senha");
	cadastro cadastro = new cadastro();
	cadastro.setLoginSenha(user, senha);
	

	}

}

