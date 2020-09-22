package br.com.telas;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


import br.com.automatizar.Automatizar;




	

public class TelaInicial implements ActionListener {
	
	
// criação dos objetos:
	
	
	//
		static Automatizar auto = new Automatizar();
	
	//Objetos de Frames
		static JFrame janelaLogin = new JFrame("Atualizar DM985");
		static JPanel painelLogin = new JPanel();
	//Botoes
		
		static JButton btnEntrar = new JButton();
		static JButton btnAtualizar = new JButton();
	
	//Lb's e txt's
		static Label lblFirm = new Label();
		
	

		
	// Diversos
		static JOptionPane caixaTexto = new JOptionPane();
		
		
	// Objetos de Classes 
		
		
		int contador =1 ;


		// método para o chmado da tela
		
		public void metodoJanelaLogin() {
			// setando as areas dos objetos

			janelaLogin.setBounds(680, 400, 420, 250);
			
			btnEntrar.setBounds(120, 160, 120, 20);
			
			btnAtualizar.setBounds(260, 160, 120, 20);
			
			lblFirm.setBounds(100, 55, 200, 55);
			
			
			// setando o tamanho do layout default
			painelLogin.setLayout(null);
			
			
			// método para abrir a tela
			janelaLogin.setVisible(true);

		

			// setando textos dos componentes
			
			lblFirm.setText("Click para atualizar o dm985, JesusTeAma");
			btnEntrar.setText("Entrar no site");
			
			btnAtualizar.setText("Atualizar");
			
			
	

			// setando atributos para click no botao
			btnEntrar.addActionListener((ActionListener) this);
			btnAtualizar.addActionListener((ActionListener)this);
			
			
			// * Quando clickar neste componente ele irá setar uma String com o texto "Entrar"
			btnEntrar.setActionCommand("Entrar");
			btnAtualizar.setActionCommand("Atualizar");
			
	
			

			

		
			// setando os componentes da tabela

			janelaLogin.add(painelLogin);
			
		
			painelLogin.add(lblFirm);
			painelLogin.add(btnEntrar);
//			painelLogin.add(btnAtualizar);
	
			
			janelaLogin.setDefaultCloseOperation(janelaLogin.EXIT_ON_CLOSE);

		}
		@Override
		public void actionPerformed(ActionEvent e) {

			String action;
	

			//*Está linha de comando ira pegar a String que foi referenciada no click do botão
			action = e.getActionCommand();
			//* Aqui iremos comparar String action com a String que foi setada no botão 
			switch (action) {
			case "Entrar":
				
				
			
				
				auto.entrandoNoSite();
			
			}
			switch(action){
			case "Atualizar":
			
				System.out.println("oi");
				
			}
			
		
				
				
					
				

				
		


		
	
	}
	}
	

