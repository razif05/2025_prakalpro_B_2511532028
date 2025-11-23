package pekan8_2511532028;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperasiLogikaGUI_2511532028 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nilai1;
	private JTextField nilai2;
	private JTextField hasil1;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showConfirmDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesanError(String pesan) {
		JOptionPane.showConfirmDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperasiLogikaGUI_2511532028 frame = new OperasiLogikaGUI_2511532028();
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
	public OperasiLogikaGUI_2511532028() {
		setTitle("OperasiLogika");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Operasi Logika");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(154, 11, 125, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Input NIlai ke-1");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(34, 59, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Input Nilai ke-2");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(302, 59, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		nilai1 = new JTextField();
		nilai1.setBounds(34, 86, 86, 20);
		contentPane.add(nilai1);
		nilai1.setColumns(10);
		
		nilai2 = new JTextField();
		nilai2.setBounds(302, 86, 86, 20);
		contentPane.add(nilai2);
		nilai2.setColumns(10);
		
		JComboBox Operator = new JComboBox();
		Operator.setModel(new DefaultComboBoxModel(new String[] {"AND", "OR", "NEGASI"}));
		Operator.setBounds(172, 139, 86, 22);
		contentPane.add(Operator);
		
		hasil1 = new JTextField();
		hasil1.setBounds(172, 203, 86, 20);
		contentPane.add(hasil1);
		hasil1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Hasil");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(172, 178, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Operator");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(175, 114, 83, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("process");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			boolean hasil = false;
			if (nilai1.getText().trim().isEmpty()) { 
				pesanPeringatan("nilai 1 harus di isi");
			} else 
			if(nilai2.getText().trim().isEmpty()) {
				pesanPeringatan("nilai 2 harus di isi");
			}
			try { 
				String texta = nilai1.getText().trim();
				String textb = nilai2.getText().trim();
				boolean a1 = Boolean.parseBoolean(texta);
				boolean a2 = Boolean.parseBoolean(textb);
				if (!(texta.equalsIgnoreCase("true")|| texta.equalsIgnoreCase("false"))) {
					pesanError("nilai 1 harus di isi true atau false");
				} else
				if (!(textb.equalsIgnoreCase("true")|| textb.equalsIgnoreCase("false"))) {
					pesanError("nilai 2 harus di isi true atau false");
				}
				int z = Operator.getSelectedIndex();
				if (z==0) {hasil = a1 && a2;}
				if (z==1) {hasil = a1 || a2;}
				if (z==2) {hasil = !a1;}
			}
			catch (Exception ex) {
				pesanError("nilai 1 dan 2 harus berupa true atau false");
			}
			hasil1.setText(String.valueOf(hasil));
		}
		});
		btnNewButton.setBounds(287, 139, 89, 23);
		contentPane.add(btnNewButton);
		

	}
}
