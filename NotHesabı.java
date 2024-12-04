package Pack1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class NotHesabı {

	private JFrame frame;
	private JTextField vizeI;
	private JTextField vizeOut;
	private JTextField finalI;
	private JTextField finalOut;
	private JTextField quizI;
	private JTextField quizOut;
	private JTable table;
	private JLabel lblNewLabel;
	
	public String harfNotu(double x) {
	 if (x<50) {
		 return "F2";
	 }else if(x>=50 && x<60) {
		 return "F1";
	 }else if(x>=60 && x<65 ) {
		 return "C3";
	 }else if(x>=65 && x<70 ) {
		 return "C2";
	 }else if(x>=70 && x<75 ) {
		 return "C1";
	 }else if(x>=75 && x<80 ) {
		 return "B3";
	 }else if(x>=80 && x<85 ) {
		 return "B2";
	 }else if(x>=85 && x<90 ) {
		 return "B1";
	 }else if(x>=90) {
		 return "A";
	 }
	 return " ";
 }
	public String sonuc(double x) {
		if(x>=60) {
			return "Geçtiniz";
		}
		return "Kaldınız";
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotHesabı window = new NotHesabı();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public NotHesabı() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame("Geçme Notu");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\burak\\Desktop\\Simgeler\\Homework\\copywriting_7200238.png"));
		frame.getContentPane().setBackground(new Color(210, 180, 140));
		frame.setType(Type.POPUP);
		frame.setForeground(new Color(0, 0, 0));
		frame.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frame.getContentPane().setForeground(SystemColor.activeCaption);
		frame.setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 698, 683);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		vizeI = new JTextField();
		vizeI.setBounds(120, 112, 96, 19);
		frame.getContentPane().add(vizeI);
		vizeI.setColumns(10);
		
		vizeOut = new JTextField();
		vizeOut.setBounds(412, 112, 96, 19);
		frame.getContentPane().add(vizeOut);
		vizeOut.setColumns(10);
		
		finalI = new JTextField();
		finalI.setBounds(120, 206, 96, 19);
		frame.getContentPane().add(finalI);
		finalI.setColumns(10);
		
		finalOut = new JTextField();
		finalOut.setBounds(412, 206, 96, 19);
		frame.getContentPane().add(finalOut);
		finalOut.setColumns(10);
		
		
		
		
		
		JLabel vizeN = new JLabel("Vize Notunuzu Giriniz");
		vizeN.setBounds(120, 71, 191, 13);
		frame.getContentPane().add(vizeN);
		
		JLabel vizeO = new JLabel("Vize Etki Oranı(%)");
		vizeO.setBounds(412, 71, 131, 13);
		frame.getContentPane().add(vizeO);
		
		JLabel finalN = new JLabel("Final Notunuzu Giriniz");
		finalN.setBounds(120, 163, 243, 13);
		frame.getContentPane().add(finalN);
		
		JLabel finalO = new JLabel("Final Etki Oranı(%)");
		finalO.setBounds(412, 163, 131, 13);
		frame.getContentPane().add(finalO);
		
		JLabel quizN = new JLabel("Quiz Notunu Giriniz");
		quizN.setBounds(120, 249, 116, 13);
		frame.getContentPane().add(quizN);
		quizN.setVisible(false);
		
		JLabel quizO = new JLabel("Quiz Etki Oranı(%)");
		quizO.setBounds(412, 249, 116, 13);
		frame.getContentPane().add(quizO);
		quizO.setVisible(false);
		
		quizI = new JTextField();
		quizI.setVisible(false);
		quizI.setBounds(120, 288, 96, 19);
		frame.getContentPane().add(quizI);
		quizI.setColumns(10);
		
		quizOut = new JTextField();
		quizOut.setVisible(false);
		quizOut.setBounds(412, 288, 96, 19);
		frame.getContentPane().add(quizOut);
		quizOut.setColumns(10);
		
		JCheckBox quiz = new JCheckBox("Quiz Var");
		quiz.setOpaque(false);
		//quiz.setBackground(new Color(210, 180, 140));
		quiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(quiz.isSelected()) {
					quizO.setVisible(true);
					quizN.setVisible(true);
					quizOut.setVisible(true);
					quizI.setVisible(true);
				}else {
					quizI.setText("0");
					quizOut.setText("0");
				}
			}
		});
		quiz.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		quiz.setVerticalAlignment(SwingConstants.TOP);
		quiz.setBounds(120, 357, 93, 21);
		frame.getContentPane().add(quiz);
		
		String [][] tablo =new String[3][2];
		tablo [0][0]="Not";
		tablo [0][1]="";
		tablo [1][0]="Harf Notu";
		tablo [1][1]="";
		tablo [2][0]="Sonuç";
		tablo [2][1]="";
		
		String [] baslik = {"B","A"};
		
		table = new JTable(tablo,baslik);
		table.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		
		table.setBounds(222, 535, 176, 48);
		frame.getContentPane().add(table);
		
		
		JButton total = new JButton("Hesapla");
		total.setFont(new Font("Tahoma", Font.PLAIN, 10));
		total.setBackground(new Color(135, 206, 235));
		total.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
			
				double toplam;
				double a = Double.parseDouble(vizeI.getText());
				double b = Double.parseDouble(vizeOut.getText());
				double c = Double.parseDouble(finalI.getText());
				double d = Double.parseDouble(finalOut.getText());

				if(quiz.isSelected()) {
					double f = Double.parseDouble(quizI.getText());
					double g= Double.parseDouble(quizOut.getText());
					toplam= (a*(b/100)) + (c*(d/100)) + (f*(g/100)) ;
					System.out.println(toplam);
				}else {
					toplam= (a*(b/100)) + (c*(d/100));
				}
				
				table.setValueAt(String.valueOf(toplam), 0, 1);
				table.setValueAt(harfNotu(toplam), 1, 1);
				table.setValueAt(sonuc(toplam), 2, 1);
				
				
				
			

	            

			}
		});
		total.setBounds(222, 466, 176, 19);
		frame.getContentPane().add(total);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\burak\\Desktop\\Java Uygulamaları\\Simgeler\\board-5599231_1280.png"));
		lblNewLabel.setBounds(0, 0, 1245, 816);
		frame.getContentPane().add(lblNewLabel);
		
		

		

	
	
	
	}
}
