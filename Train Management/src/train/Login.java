package train;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\Eclipse Workplace\\Train Management\\Image\\L3zNCNHo.jpg"));
		setBackground(new Color(65, 105, 225));
		setFont(new Font("Arial Black", Font.PLAIN, 14));
		setForeground(Color.LIGHT_GRAY);
		setTitle("Train Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 498);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(220, 20, 60));
		contentPane.setForeground(new Color(85, 107, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Indian Railways");
		l1.setBounds(174, 27, 348, 52);
		l1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 34));
		l1.setForeground(Color.BLACK);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("User ID");
		l2.setBounds(268, 197, 110, 25);
		l2.setFont(new Font("Arial Black", Font.BOLD, 20));
		contentPane.add(l2);
		
		JTextPane t1 = new JTextPane();
		t1.setBounds(418, 197, 202, 25);
		contentPane.add(t1);
		
		JLabel l4 = new JLabel("Password");
		l4.setBounds(268, 255, 130, 25);
		l4.setFont(new Font("Arial Black", Font.PLAIN, 20));
		contentPane.add(l4);
		
		p1 = new JPasswordField();
		p1.setBounds(418, 255, 202, 25);
		contentPane.add(p1);
		
		JButton b1 = new JButton("Log In");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String uname=t1.getText();
				String pd=p1.getText();
				if((uname.equals("Indian") && pd.equals("Railways"))||uname.equals("Geca") && pd.equals("Ajmer")){
					Management m1=new Management();
					m1.setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Invalid user ID or Password");
				}
			}
		});

		b1.setBounds(368, 327, 116, 34);
		b1.setFont(new Font("Arial Black", Font.BOLD, 16));
		contentPane.add(b1);
		
		JLabel l5 = new JLabel("Train Management System");
		l5.setBounds(285, 113, 320, 45);
		l5.setFont(new Font("Arial Black", Font.BOLD, 20));
		contentPane.add(l5);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("G:\\Eclipse Workplace\\Train Management\\Image\\L3zNCNHo.jpeg"));
		label.setBounds(0, 101, 260, 260);
		contentPane.add(label);
	}
}
