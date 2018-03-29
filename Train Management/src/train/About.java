package train;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
		setBackground(new Color(240, 240, 240));
		setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\Eclipse Workplace\\Train Management\\Image\\L3zNCNHo.jpg"));
		setTitle("About");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 493);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb1 = new JLabel("Developed\r\n");
		lb1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 34));
		lb1.setForeground(new Color(0, 0, 0));
		lb1.setBounds(253, 11, 224, 45);
		contentPane.add(lb1);
		
		JLabel lb2 = new JLabel("by-");
		lb2.setFont(new Font("Arial Black", Font.ITALIC, 34));
		lb2.setBounds(341, 39, 65, 45);
		contentPane.add(lb2);
		
		JLabel lblNewLabel = new JLabel("Avichal Mishra");
		lblNewLabel.setFont(new Font("Arial Black", Font.ITALIC, 36));
		lblNewLabel.setBounds(232, 319, 297, 52);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("G:\\Eclipse Workplace\\Train Management\\Image\\C360_2018-03-06-10-24-12-294.jpg"));
		label.setBounds(263, 82, 214, 240);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Management mn1=new Management();
				mn1.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(307, 385, 135, 35);
		contentPane.add(btnNewButton);
	}
}
