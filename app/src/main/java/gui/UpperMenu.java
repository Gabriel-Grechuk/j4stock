package gui;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class UpperMenu extends JMenuBar{
	public UpperMenu(){
		JMenu atendimento = new JMenu("Atendimento");
			JMenuItem pedidoDeVenda = new JMenuItem("Pedido de venda");
			JMenuItem consultaDeValores = new JMenuItem("Colsulta de valores");
			JMenuItem devolucao = new JMenuItem("Devolucao");
		this.add(atendimento);
		atendimento.add(pedidoDeVenda);
		atendimento.add(consultaDeValores);
		atendimento.add(devolucao);
		
		JMenu estoque = new JMenu("Estoque");
			JMenuItem entradaDeMercadoria = new JMenuItem("Entrada de mercadoria");
			JMenuItem consultarEstoque = new JMenuItem("Consultar estoque");
		this.add(estoque);
		estoque.add(entradaDeMercadoria);
		estoque.add(consultarEstoque);
		
		JMenu clientes = new JMenu("Clientes");
			JMenuItem cadastroDeCliente = new JMenuItem("Cadastro de clientes");
			JMenuItem consultaDeCliente = new JMenuItem("Colsulta de clientes");	
		this.add(clientes);
		clientes.add(cadastroDeCliente);
		clientes.add(consultaDeCliente);
		
		
		
		//----------------------------------------------------------------------
		// Eventos do menu Aendimento.
		pedidoDeVenda.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evento){
				// TODO: Abrir tela de Pedido de Venda.
				System.out.println("pedidoDeVenda Selecionado");
			}
		});
		
		consultaDeValores.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evento){
				// TODO: Abrir tela de Pedido de Venda.
				System.out.println("colsultaDeValores Selecionado");
			}
		});
		
		devolucao.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evento){
				// TODO: Abrir tela de Pedido de Venda.
				System.out.println("devolucao Selecionado");
			}
		});
		
		
		
		//----------------------------------------------------------------------
		// Eventos do menu Estoque.
		entradaDeMercadoria.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evento){
				// TODO: Abrir tela de Pedido de Venda.
				System.out.println("Entrada de mercadoria Selecionado");
			}
		});
		
		consultarEstoque.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evento){
				// TODO: Abrir tela de Pedido de Venda.
				System.out.println("consultaDeEstoque Selecionado");
			}
		});
		
		
		
		//----------------------------------------------------------------------
		// Eventos do menu Clientes.
		cadastroDeCliente.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evento){
				// TODO: Abrir tela de Pedido de Venda.
				System.out.println("cadastroDeCliente Selecionado");
			}
		});
		
		consultaDeCliente.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evento){
				// TODO: Abrir tela de Pedido de Venda.
				System.out.println("consultaDeCliente Selecionado");
			}
		});
	}
}
