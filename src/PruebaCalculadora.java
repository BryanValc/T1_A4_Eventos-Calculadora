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
	
	JTextField areaTexto = new JTextField();
	
	JButton btnSumar = new JButton("+");
	JButton btnRestar = new JButton("-");
	JButton btnMultiplicar = new JButton("*");
	JButton btnDividir = new JButton("/");
	JButton btnResiduo = new JButton("%");
	JButton btn1X = new JButton("1/x");
	JButton btnPotencia = new JButton("x^2");
	JButton btnRaiz = new JButton("sqrt");
	JButton btnDel = new JButton("<[]");
	JButton btnCE = new JButton("CE");
	JButton btnResultado = new JButton("=");
	
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
