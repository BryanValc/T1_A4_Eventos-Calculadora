import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

class Calculadora extends JFrame implements ActionListener{

	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	JTextField areaTexto = new JTextField();//caja
	JButton btnSumar = new JButton("+");//operaciones
	JButton btnRestar = new JButton("-");
	JButton btnMultiplicar = new JButton("*");
	JButton btnDividir = new JButton("/");
	JButton btnResiduo = new JButton("%");
	JButton btn1X = new JButton("1/x");
	JButton btnPotencia = new JButton("x^2");
	JButton btnRaiz = new JButton("sqrt");
	JButton btnDel = new JButton("<[]");
	JButton btnCE = new JButton("CE");
	JButton btnResultado = new JButton("=");//numeros
	JButton btn0 = new JButton("0");
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btnDot= new JButton(".");
	
	public Calculadora() {
		
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Calculadora");
		gbc.fill=GridBagConstraints.BOTH;
		setVisible(true);
		
		btnSumar.addActionListener(this);
		btnRestar.addActionListener(this);
		btnMultiplicar.addActionListener(this);
		btnDividir.addActionListener(this);
		btnResiduo.addActionListener(this);
		btn1X.addActionListener(this);
		btnPotencia.addActionListener(this);
		btnRaiz.addActionListener(this);
		btnDel.addActionListener(this);
		btnCE.addActionListener(this);
		btnResultado.addActionListener(this);
		btn0.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btnDot.addActionListener(this);
		
		inst(areaTexto,0,0,4,1,GridBagConstraints.BOTH);
		
		inst(btnResiduo,0,1,1,1,GridBagConstraints.BOTH);
		inst(btnCE,1,1,1,1,GridBagConstraints.BOTH);
		inst(btnDel,2,1,2,1,GridBagConstraints.BOTH);
		
		inst(btn1X,0,2,1,1,GridBagConstraints.BOTH);
		inst(btnPotencia,1,2,1,1,GridBagConstraints.BOTH);
		inst(btnRaiz,2,2,1,1,GridBagConstraints.BOTH);
		inst(btnDividir,3,2,1,1,GridBagConstraints.BOTH);
		
		inst(btn7,0,3,1,1,GridBagConstraints.BOTH);
		inst(btn8,1,3,1,1,GridBagConstraints.BOTH);
		inst(btn9,2,3,1,1,GridBagConstraints.BOTH);
		inst(btnMultiplicar,3,3,1,1,GridBagConstraints.BOTH);
		
		inst(btn4,0,4,1,1,GridBagConstraints.BOTH);
		inst(btn5,1,4,1,1,GridBagConstraints.BOTH);
		inst(btn6,2,4,1,1,GridBagConstraints.BOTH);
		inst(btnRestar,3,4,1,1,GridBagConstraints.BOTH);
		
		inst(btn1,0,5,1,1,GridBagConstraints.BOTH);
		inst(btn2,1,5,1,1,GridBagConstraints.BOTH);
		inst(btn3,2,5,1,1,GridBagConstraints.BOTH);
		inst(btnSumar,3,5,1,1,GridBagConstraints.BOTH);

		inst(btnDot,0,6,1,1,GridBagConstraints.BOTH);
		inst(btn0,1,6,1,1,GridBagConstraints.BOTH);
		inst(btnResultado,2,6,2,1,GridBagConstraints.BOTH);
		
		pack();
	}
	
	public void inst(Component cmp,int gridx, int gridy, int gridwidth, int gridheight, int fill) {
		gbc.gridx=gridx;
		gbc.gridy=gridy;
		gbc.gridwidth=gridwidth;
		gbc.gridheight=gridheight;
		gbc.fill=fill;
		gbl.setConstraints(cmp, gbc);
		add(cmp);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	}
	
}


public class PruebaCalculadora {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Calculadora();
			}
		});
		

	}

}
