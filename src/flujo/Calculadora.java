package flujo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private String pres = "";
	private Double res = null;
	private String oper = null;

	public Calculadora() {
		setTitle("Calculadora");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 290, 396);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		final JLabel op = new JLabel("");
		final JButton sum = new JButton("+");
		final JButton rest = new JButton("-");
		final JButton mul = new JButton("*");
		final JButton igual = new JButton("=");
		final JButton div = new JButton("/");
		op.setBackground(Color.LIGHT_GRAY);
		op.setOpaque(true);
		op.setFont(new Font("Arial", Font.PLAIN, 18));
		op.setHorizontalAlignment(SwingConstants.RIGHT);
		op.setBounds(10, 11, 262, 40);
		contentPane.add(op);

		final JLabel rs = new JLabel("");
		rs.setOpaque(true);
		rs.setBackground(Color.LIGHT_GRAY);
		rs.setFont(new Font("Arial", Font.PLAIN, 18));
		rs.setBounds(10, 62, 262, 40);
		contentPane.add(rs);

		final JButton limpiar = new JButton("C");
		limpiar.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				limpiar.setBorderPainted(true);
				limpiar.setBackground(Color.LIGHT_GRAY);
			}
			public void mouseExited(MouseEvent arg0) {
				limpiar.setBackground(Color.GRAY);
			}
			public void mouseClicked(MouseEvent arg0) {
				op.setText("");
				rs.setText("");
				oper = null;
				pres = "";
				res = null;
				oper = null;
			}
		});
		limpiar.setBackground(Color.GRAY);
		limpiar.setBorderPainted(false);
		limpiar.setFocusPainted(false);
		limpiar.setBounds(10, 113, 194, 40);
		contentPane.add(limpiar);

		sum.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				sum.setBorderPainted(true);
				sum.setBackground(Color.LIGHT_GRAY);
			}
			public void mouseExited(MouseEvent arg0) {
				sum.setBackground(Color.GRAY);
			}
			public void mouseClicked(MouseEvent arg0) {

				if (op.getText()!= "" && rs.getText() == ""){
					if (res != null){
						if (oper == "+"){
							res = new Operacion().sum(Double.parseDouble(pres), res);
							op.setText(op.getText() + "+");
							oper = "+";
						}
						else if (oper == "-"){
							res = new Operacion().res(Double.parseDouble(pres), res);
							op.setText(op.getText() + "+");
							oper = "+";
						}
						else if (oper == "/"){
							res = new Operacion().div(Double.parseDouble(pres), res);
							op.setText(op.getText() + "+");
							oper = "+";
						}
						else if (oper == "*"){
							res = new Operacion().mul(Double.parseDouble(pres), res);
							op.setText(op.getText() + "+");
							oper = "+";
						}
						else {
							op.setText(op.getText() + "+");
							oper = "+";
						}
					}
					else{
						op.setText(op.getText() + "+");
						oper = "+";
						res = Double.parseDouble(pres);
					}
					pres = "";
				}
				
			}
		});
		sum.setBackground(Color.GRAY);
		sum.setBorderPainted(false);
		sum.setFocusPainted(false);
		sum.setBounds(214, 113, 58, 40);
		contentPane.add(sum);

		rest.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				rest.setBorderPainted(true);
				rest.setBackground(Color.LIGHT_GRAY);
			}
			public void mouseExited(MouseEvent arg0) {
				rest.setBackground(Color.GRAY);
			}
			public void mouseClicked(MouseEvent arg0) {
				if (op.getText() != "" && rs.getText() == ""){
					if (res != null){
						if (oper == "+"){
							res = new Operacion().sum(Double.parseDouble(pres), res);
							op.setText(op.getText() + "-");
							oper = "-";
						}
						else if (oper == "-"){
							res = new Operacion().res(Double.parseDouble(pres), res);
							op.setText(op.getText() + "-");
							oper = "-";
						}
						else if (oper == "/"){
							res = new Operacion().div(Double.parseDouble(pres), res);
							op.setText(op.getText() + "-");
							oper = "-";
						}
						else if (oper == "*"){
							res = new Operacion().mul(Double.parseDouble(pres), res);
							op.setText(op.getText() + "-");
							oper = "-";
						}
						else {
							op.setText(op.getText() + "-");
							oper = "-";
						}
					}
					else{
						op.setText(op.getText() + "-");
						oper = "-";
						res = Double.parseDouble(pres);
					}
					pres = "";
				}
			}
		});
		rest.setBackground(Color.GRAY);
		rest.setBorderPainted(false);
		rest.setFocusPainted(false);
		rest.setBounds(214, 164, 58, 40);
		contentPane.add(rest);

		mul.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				mul.setBorderPainted(true);
				mul.setBackground(Color.LIGHT_GRAY);
			}
			public void mouseExited(MouseEvent arg0) {
				mul.setBackground(Color.GRAY);
			}
			public void mouseClicked(MouseEvent arg0) {
				if (op.getText() != "" && rs.getText() == ""){
					if (res != null){
						if (oper == "+"){
							res = new Operacion().sum(Double.parseDouble(pres), res);
							op.setText(op.getText() + "*");
							oper = "*";
						}
						else if (oper == "-"){
							res = new Operacion().res(Double.parseDouble(pres), res);
							op.setText(op.getText() + "*");
							oper = "*";
						}
						else if (oper == "/"){
							res = new Operacion().div(Double.parseDouble(pres), res);
							op.setText(op.getText() + "*");
							oper = "*";
						}
						else if (oper == "*"){
							res = new Operacion().mul(Double.parseDouble(pres), res);
							op.setText(op.getText() + "*");
							oper = "+";
						}
						else {
							op.setText(op.getText() + "*");
							oper = "*";
						}
					}
					else{
						op.setText(op.getText() + "*");
						oper = "*";
						res = Double.parseDouble(pres);
					}
					pres = "";
				}
			}
		});
		mul.setBackground(Color.GRAY);
		mul.setBorderPainted(false);
		mul.setFocusPainted(false);
		mul.setBounds(214, 215, 58, 40);
		contentPane.add(mul);

		div.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				div.setBorderPainted(true);
				div.setBackground(Color.LIGHT_GRAY);
			}
			public void mouseExited(MouseEvent arg0) {
				div.setBackground(Color.GRAY);
			}
			public void mouseClicked(MouseEvent arg0) {
				if (op.getText() != "" && rs.getText() == ""){
					if (res != null){
						if (oper == "+"){
							res = new Operacion().sum(Double.parseDouble(pres), res);
							op.setText(op.getText() + "/");
							oper = "/";
						}
						else if (oper == "-"){
							res = new Operacion().res(Double.parseDouble(pres), res);
							op.setText(op.getText() + "/");
							oper = "/";
						}
						else if (oper == "/"){
							res = new Operacion().div(Double.parseDouble(pres), res);
							op.setText(op.getText() + "/");
							oper = "/";
						}
						else if (oper == "*"){
							res = new Operacion().mul(Double.parseDouble(pres), res);
							op.setText(op.getText() + "/");
							oper = "/";
						}
						else {
							op.setText(op.getText() + "/");
							oper = "/";
						}
					}
					else{
						op.setText(op.getText() + "/");
						oper = "/";
						res = Double.parseDouble(pres);
					}
					pres = "";
				}
			}
		});
		div.setBackground(Color.GRAY);
		div.setBorderPainted(false);
		div.setFocusPainted(false);
		div.setBounds(214, 266, 58, 40);
		contentPane.add(div);

		igual.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				igual.setBorderPainted(true);
				igual.setBackground(Color.LIGHT_GRAY);
			}
			public void mouseExited(MouseEvent arg0) {
				igual.setBackground(Color.GRAY);
			}
			//OJO falta esta funcion por implementar
			public void mouseClicked(MouseEvent arg0) {
				if (op.getText() != "" && rs.getText() == ""){
					if (res != null){
						
						/*if (res % 1 != 0){
							
						}*/
						
						if (oper == "+"){
							res = new Operacion().sum(Double.parseDouble(pres), res);
							if (res != null){
								rs.setText(res.toString());
							}
							else{
								rs.setText("!Indefinido");
							}
						}
						else if (oper == "-"){
							res = new Operacion().res(Double.parseDouble(pres), res);
							if (res != null){
								rs.setText(res.toString());
							}
							else{
								rs.setText("!Indefinido");
							}
						}
						else if (oper == "/"){
							res = new Operacion().div(Double.parseDouble(pres), res);
							if (res != null){
								rs.setText(res.toString());
							}
							else{
								rs.setText("!Indefinido");
							}
						}
						else if (oper == "*"){
							res = new Operacion().mul(Double.parseDouble(pres), res);
							if (res != null){
								rs.setText(res.toString());
							}
							else{
								rs.setText("!Indefinido");
							}
						}
					}

					else{
						rs.setText("NULL");
						op.setText("");
						rs.setText("");
						pres = "";
						
						res = null;
					}
				}
			}
		});
		igual.setBackground(Color.GRAY);
		igual.setBorderPainted(false);
		igual.setFocusPainted(false);
		igual.setBounds(214, 317, 58, 40);
		contentPane.add(igual);

		final JButton num1 = new JButton("1");
		num1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				num1.setBorderPainted(true);
				num1.setBackground(Color.LIGHT_GRAY);
			}
			public void mouseExited(MouseEvent arg0) {
				num1.setBackground(Color.GRAY);
			}
			public void mouseClicked(MouseEvent arg0) {
				op.setText(op.getText() + "1");
				pres += "1";
			}
		});
		num1.setBackground(Color.GRAY);
		num1.setBorderPainted(false);
		num1.setFocusPainted(false);
		num1.setBounds(10, 164, 58, 40);
		contentPane.add(num1);

		final JButton num2 = new JButton("2");
		num2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				num2.setBorderPainted(true);
				num2.setBackground(Color.LIGHT_GRAY);
			}
			public void mouseExited(MouseEvent arg0) {
				num2.setBackground(Color.GRAY);
			}
			public void mouseClicked(MouseEvent arg0) {
				op.setText(op.getText() + "2");
				pres += "2";
			}
		});
		num2.setBackground(Color.GRAY);
		num2.setBorderPainted(false);
		num2.setFocusPainted(false);
		num2.setBounds(78, 164, 58, 40);
		contentPane.add(num2);

		final JButton num3 = new JButton("3");
		num3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				num3.setBorderPainted(true);
				num3.setBackground(Color.LIGHT_GRAY);
			}
			public void mouseExited(MouseEvent arg0) {
				num3.setBackground(Color.GRAY);
			}
			public void mouseClicked(MouseEvent arg0) {
				op.setText(op.getText() + "3");
				pres += "3";
			}
		});
		num3.setBackground(Color.GRAY);
		num3.setBorderPainted(false);
		num3.setFocusPainted(false);
		num3.setBounds(146, 164, 58, 40);
		contentPane.add(num3);

		final JButton num4 = new JButton("4");
		num4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				num4.setBorderPainted(true);
				num4.setBackground(Color.LIGHT_GRAY);
			}
			public void mouseExited(MouseEvent arg0) {
				num4.setBackground(Color.GRAY);
			}
			public void mouseClicked(MouseEvent arg0) {
				op.setText(op.getText() + "4");
				pres += "4";
			}
		});
		num4.setBackground(Color.GRAY);
		num4.setBorderPainted(false);
		num4.setFocusPainted(false);
		num4.setBounds(10, 215, 58, 40);
		contentPane.add(num4);

		final JButton num5 = new JButton("5");
		num5.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				num5.setBorderPainted(true);
				num5.setBackground(Color.LIGHT_GRAY);
			}
			public void mouseExited(MouseEvent arg0) {
				num5.setBackground(Color.GRAY);
			}
			public void mouseClicked(MouseEvent arg0) {
				op.setText(op.getText() + "5");
				pres += "5";
			}
		});
		num5.setBackground(Color.GRAY);
		num5.setBorderPainted(false);
		num5.setFocusPainted(false);
		num5.setBounds(78, 215, 58, 40);
		contentPane.add(num5);

		final JButton num6 = new JButton("6");
		num6.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				num6.setBorderPainted(true);
				num6.setBackground(Color.LIGHT_GRAY);
			}
			public void mouseExited(MouseEvent arg0) {
				num6.setBackground(Color.GRAY);
			}
			public void mouseClicked(MouseEvent arg0) {
				op.setText(op.getText() + "6");
				pres += "6";
			}
		});
		num6.setBackground(Color.GRAY);
		num6.setBorderPainted(false);
		num6.setFocusPainted(false);
		num6.setBounds(146, 215, 58, 40);
		contentPane.add(num6);

		final JButton num7 = new JButton("7");
		num7.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				num7.setBorderPainted(true);
				num7.setBackground(Color.LIGHT_GRAY);
			}
			public void mouseExited(MouseEvent arg0) {
				num7.setBackground(Color.GRAY);
			}
			public void mouseClicked(MouseEvent arg0) {
				op.setText(op.getText() + "7");
				pres += "7";
			}
		});
		num7.setBackground(Color.GRAY);
		num7.setBorderPainted(false);
		num7.setFocusPainted(false);
		num7.setBounds(10, 266, 58, 40);
		contentPane.add(num7);

		final JButton num8 = new JButton("8");
		num8.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				num8.setBorderPainted(true);
				num8.setBackground(Color.LIGHT_GRAY);
			}
			public void mouseExited(MouseEvent arg0) {
				num8.setBackground(Color.GRAY);
			}
			public void mouseClicked(MouseEvent arg0) {
				op.setText(op.getText() + "8");
				pres += "8";
			}
		});
		num8.setBackground(Color.GRAY);
		num8.setBorderPainted(false);
		num8.setFocusPainted(false);
		num8.setBounds(78, 266, 58, 40);
		contentPane.add(num8);

		final JButton num9 = new JButton("9");
		num9.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				num9.setBorderPainted(true);
				num9.setBackground(Color.LIGHT_GRAY);
			}
			public void mouseExited(MouseEvent arg0) {
				num9.setBackground(Color.GRAY);
			}
			public void mouseClicked(MouseEvent arg0) {
				op.setText(op.getText() + "9");
				pres += "9";
			}
		});
		num9.setBackground(Color.GRAY);
		num9.setBorderPainted(false);
		num9.setFocusPainted(false);
		num9.setBounds(146, 266, 58, 40);
		contentPane.add(num9);

		final JButton num0 = new JButton("0");
		num0.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				num0.setBorderPainted(true);
				num0.setBackground(Color.LIGHT_GRAY);
			}
			public void mouseExited(MouseEvent arg0) {
				num0.setBackground(Color.GRAY);
			}
			public void mouseClicked(MouseEvent arg0) {
				op.setText(op.getText() + "0");
				pres += "0";
			}
		});
		num0.setBackground(Color.GRAY);
		num0.setBorderPainted(false);
		num0.setFocusPainted(false);
		num0.setBounds(10, 317, 126, 39);
		contentPane.add(num0);

		final JButton pto = new JButton(".");
		pto.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				pto.setBorderPainted(true);
				pto.setBackground(Color.LIGHT_GRAY);
			}
			public void mouseExited(MouseEvent arg0) {
				pto.setBackground(Color.GRAY);
			}
			public void mouseClicked(MouseEvent arg0) {
				if (!pres.contains(".")){
					op.setText(op.getText() + ".");
					pres += ".";
				}
			}
		});
		pto.setBackground(Color.GRAY);
		pto.setBorderPainted(false);
		pto.setFocusPainted(false);
		pto.setBounds(146, 317, 58, 39);
		contentPane.add(pto);
	}
}
