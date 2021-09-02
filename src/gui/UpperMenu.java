package gui;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;

class UpperMenu extends JMenuBar{
	public UpperMenu(){
		JMenu atendimento = new JMenu("Atendimento");
			JMenuItem pedidoDeVenda = new JMenuItem("Pedido de venda");
			JMenuItem consultaDeValores = new JMenuItem("Colsulta de valores");
			JMenuItem devolucao = new JMenuItem("Devolucao");
		
		JMenu estoque = new JMenu("Estoque");
			JMenuItem entradaDeMercadoria = new JMenuItem("Entrada de mercadoria");
			JMenuItem consultarEstoque = new JMenuItem("Consultar estoque");
		
		JMenu clientes = new JMenu("Clientes");
			JMenuItem cadastroDeCliente = new JMenuItem("Cadastro de clientes");
			JMenuItem consultaDeCliente = new JMenuItem("Colsulta de clientes");
			
		this.add(atendimento);
		this.add(estoque);
		this.add(clientes);
		
		atendimento.add(pedidoDeVenda);
		atendimento.add(consultaDeValores);
		atendimento.add(devolucao);
		
		estoque.add(entradaDeMercadoria);
		estoque.add(consultarEstoque);
		
		clientes.add(cadastroDeCliente);
		clientes.add(consultaDeCliente);
	}
}
