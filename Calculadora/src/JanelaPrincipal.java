import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class JanelaPrincipal extends JFrame implements ActionListener{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel panelVisor, panelNumeros,panelOperacoes;
	
	private JTextField visor;
	
	//botoes dos numeros
	private JButton button0;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	//private ListaButtons buttonsNumeros;
	
	//botoes das operacoes
	private JButton buttonSoma;
	private JButton buttonSubt;
	private JButton buttonDiv;
	private JButton buttonMult;
	private JButton buttonResult;
	//private ListaButtons buttonsOperacoes;
	
	private GridBagLayout layout;
    private GridBagConstraints constrainst;
    
	public JanelaPrincipal(String titulo) {
        super(titulo);
        criarComponentes();
        ajustarPropriedadesJanela();
        //buttonsNumeros = new ListaButtons();
        //buttonsOperacoes = new ListaButtons();
    }
        
    private void criarComponentes() {
 
    	constrainst = new GridBagConstraints();
        layout = new GridBagLayout();
    	
        Border border = BorderFactory.createEtchedBorder();
        
        //definimos o gerenciador de layout da nossa janela
        this.setLayout(layout);
        
        panelNumeros = new JPanel();
        panelNumeros.setLayout(layout);
        panelNumeros.setBorder(border);
        
        panelVisor = new JPanel();
        panelVisor.setLayout(layout);
        panelVisor.setBorder(border);
        
        panelOperacoes = new JPanel();
        panelOperacoes.setLayout(layout);
        panelOperacoes.setBorder(border);
        
        visor = new JTextField(20);
    	
    	button0 = new JButton("0");
    	button1 = new JButton("1");
    	button2 = new JButton("2");
    	button3 = new JButton("3");
    	button4 = new JButton("4");
    	button5 = new JButton("5");
    	button6 = new JButton("6");
    	button7 = new JButton("7");
    	button8 = new JButton("8");
    	button9 = new JButton("9");
    	
    	buttonDiv = new JButton("/");
    	buttonSoma = new JButton("+");
    	buttonSubt = new JButton("-");
    	buttonMult = new JButton("*");
    	buttonResult = new JButton("=");
    	
    	//adicionar todos os componentes
        
    	addComponente(panelVisor,visor, 0, 0,GridBagConstraints.NORTH,1,1,GridBagConstraints.BOTH);
    	
    	addComponente(panelNumeros,button7, 0, 0,GridBagConstraints.CENTER,1,1,GridBagConstraints.NONE);
        addComponente(panelNumeros,button8, 0, 1,GridBagConstraints.CENTER,1,1,GridBagConstraints.NONE);
        addComponente(panelNumeros,button9, 0, 2,GridBagConstraints.CENTER,1,1,GridBagConstraints.NONE);
        addComponente(panelNumeros,button4, 1, 0,GridBagConstraints.CENTER,1,1,GridBagConstraints.NONE);
        addComponente(panelNumeros,button5, 1, 1,GridBagConstraints.CENTER,1,1,GridBagConstraints.NONE);
        addComponente(panelNumeros,button6, 1, 2,GridBagConstraints.CENTER,1,1,GridBagConstraints.NONE);
        addComponente(panelNumeros,button1, 2, 0,GridBagConstraints.CENTER,1,1,GridBagConstraints.NONE);
        addComponente(panelNumeros,button2, 2, 1,GridBagConstraints.CENTER,1,1,GridBagConstraints.NONE);
        addComponente(panelNumeros,button3, 2, 2,GridBagConstraints.CENTER,1,1,GridBagConstraints.NONE);
        addComponente(panelNumeros,button0, 3, 0,GridBagConstraints.CENTER,1,1,GridBagConstraints.NONE);
        addComponente(panelNumeros,buttonResult, 3, 1,GridBagConstraints.CENTER,2,1,GridBagConstraints.BOTH);
        
        addComponente(panelOperacoes,buttonSoma, 0, 3,GridBagConstraints.CENTER,1,1,GridBagConstraints.NONE);
        addComponente(panelOperacoes,buttonSubt, 1, 3,GridBagConstraints.CENTER,1,1,GridBagConstraints.NONE);
        addComponente(panelOperacoes,buttonDiv, 2, 3,GridBagConstraints.CENTER,1,1,GridBagConstraints.NONE);
        addComponente(panelOperacoes,buttonMult, 3, 3,GridBagConstraints.CENTER,1,1,GridBagConstraints.NONE);
        
        addComponente(this, panelVisor, 0, 0, GridBagConstraints.SOUTH, 2, 1, GridBagConstraints.BOTH);
        addComponente(this, panelNumeros, 1, 0, GridBagConstraints.NORTH, 1, 1, GridBagConstraints.BOTH);
        addComponente(this, panelOperacoes, 1, 1, GridBagConstraints.NORTH, 1, 1, GridBagConstraints.BOTH);
    }
    
    private void addComponente(Container cont,JComponent comp, int y, int x, int pos, int lar, int alt, int pre) {
    	
    	constrainst.gridx = x; //coluna
    	constrainst.gridy = y; //linha
    	constrainst.anchor = pos; //posição do meu componente naquela "célula"
    	
    	constrainst.weightx = y;
    	constrainst.weighty = x;
    	
    	constrainst.gridwidth = lar;
    	constrainst.gridheight = alt;
    	
    	comp.setFont(new Font("arial",Font.PLAIN,36)); //fonte
    	constrainst.fill = pre; //preenchimento
    	constrainst.insets = new Insets(5,5,5,5); //espaçamentos
    	
    	layout.setConstraints(comp, constrainst);
    	
    	cont.add(comp);
    }
    
	/*private void addButtons(JButton...buttons,ListaButtons list,JComponent comp) {
        if(buttons != null) {
	    	for(JButton btn: buttons)
	    	{
	    		if(list.addButton(btn))
	    		{
		    		btn.addActionListener(new OuvinteBotao());
		    		comp.add(btn);
	    		}
	    	}
    	}
    	
        revalidate(); //instruçăo fixa (última instruçăo do método)
    }*/
    
    private void ajustarPropriedadesJanela() {
        setVisible(true);
        //setSize(800, 600);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	//objetivo: exibir o título do botăo clicado
    /*private class OuvinteBotao implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            //completar aqui
        	System.out.println(ae.getActionCommand());
        }
    }*/
}
