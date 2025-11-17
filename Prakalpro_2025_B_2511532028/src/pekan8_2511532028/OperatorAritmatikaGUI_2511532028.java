package pekan8_2511532028;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class OperatorAritmatikaGUI_2511532028 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Bil1;
	private JTextField Bil2;
	private JTextField Hasil;
	
	
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showConfirmDialog(this, pesan, "peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesanEror(String pesan) {
		JOptionPane.showConfirmDialog(this, pesan, "kesalahan", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511532028 frame = new OperatorAritmatikaGUI_2511532028();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OperatorAritmatikaGUI_2511532028() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Bill = new JLabel("BIlangan 1");
		Bill.setBounds(10, 50, 80, 14);
		contentPane.add(Bill);
		
		JLabel bill2 = new JLabel("Bilangan 2");
		bill2.setBounds(10, 96, 80, 14);
		contentPane.add(bill2);
		
		JLabel lblNewLabel_2 = new JLabel("Operator");
		lblNewLabel_2.setBounds(10, 141, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Head");
		lblNewLabel_3.setBounds(10, 193, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		Bil1 = new JTextField();
		Bil1.setColumns(10);
		Bil1.setBounds(100, 39, 59, 36);
		contentPane.add(Bil1);
		
		Bil2 = new JTextField();
		Bil2.setColumns(10);
		Bil2.setBounds(100, 85, 59, 36);
		contentPane.add(Bil2);
		
		Hasil = new JTextField();
		Hasil.setColumns(10);
		Hasil.setBounds(100, 190, 59, 36);
		contentPane.add(Hasil);
		
		JComboBox CbOperator = new JComboBox();
		CbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		CbOperator.setEditable(true);
		CbOperator.setBounds(100, 137, 59, 23);
		contentPane.add(CbOperator);
		
		JLabel lblOperatorAritmatika = new JLabel("Operator Aritmatika");
		lblOperatorAritmatika.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblOperatorAritmatika.setHorizontalAlignment(SwingConstants.CENTER);
		lblOperatorAritmatika.setBounds(129, 11, 175, 25);
		contentPane.add(lblOperatorAritmatika);
		
		JButton btnNewButton = new JButton("process");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hasil = 0;
				if (Bil1.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 1 Harus di isi");
				} else if (Bil2.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 2 Harus di isi");
				} else { 
					try {
						int a = Integer.parseInt(Bil1.getText());
						int b = Integer.parseInt(Bil2.getText());
						int c = CbOperator.getSelectedIndex();
						if (c==0) {hasil = a+b; }
						if (c==1) {hasil = a-b; }
						if (c==2) {hasil = a*b; }
						if (c==3) {hasil = a/b; }
						if (c==4) {hasil = a%b; }
				}
					catch (NumberFormatException ex) {	
						pesanEror("Bilangan 1 dan Bilangan 2 harus berupa angka");
				}
				
			}
				Hasil.setText(String.valueOf(hasil));
		}
			
		});
		btnNewButton.setBounds(202, 137, 89, 23);
		contentPane.add(btnNewButton);
		
		

	}
}
