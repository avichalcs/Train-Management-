package train;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Schedule extends JFrame {

	private JPanel contentPane;
	private JLabel clk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Schedule frame = new Schedule();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void clock()
	{Thread clock=new Thread()
	{
		public void run()
		{
			try {while(true)
			{
				Calendar cal=new GregorianCalendar();
				int day=cal.get(Calendar.DAY_OF_MONTH);
				int month=cal.get(Calendar.MONTH);
				int year=cal.get(Calendar.YEAR);
				int second=cal.get(Calendar.SECOND);
				int minutes=cal.get(Calendar.MINUTE);
				int hour=cal.get(Calendar.HOUR_OF_DAY);
				try {
					clk.setText("Clock "+hour+":"+minutes+":"+second+" Date- "+day+"/"+month+"/"+year);}
					catch (NullPointerException s) {
						
					}
					sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		}
	};
	clock.start();
	}
	

	/**
	 * Create the frame.
	 */
	public Schedule() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\Eclipse Workplace\\Train Management\\Image\\L3zNCNHo.jpg"));
		setTitle("Schedule");
		clock();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 491);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		clk = new JLabel("");
		clk.setForeground(Color.DARK_GRAY);
		clk.setFont(new Font("Arial", Font.BOLD, 24));
		clk.setBounds(255, 0, 391, 33);
		contentPane.add(clk);
		
		JLabel lir2 = new JLabel("Indian Railways");
		lir2.setForeground(Color.DARK_GRAY);
		lir2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 26));
		lir2.setBounds(10, 0, 198, 33);
		contentPane.add(lir2);
		
		JLabel lpf2 = new JLabel("Platform 1");
		lpf2.setForeground(new Color(0, 0, 255));
		lpf2.setFont(new Font("Arial Black", Font.PLAIN, 24));
		lpf2.setBounds(300, 44, 165, 40);
		contentPane.add(lpf2);
		
		JLabel lblPlatform = new JLabel("Platform 2");
		lblPlatform.setBackground(Color.WHITE);
		lblPlatform.setForeground(new Color(0, 0, 139));
		lblPlatform.setFont(new Font("Arial Black", Font.PLAIN, 24));
		lblPlatform.setBounds(300, 231, 165, 45);
		contentPane.add(lblPlatform);
		
		JLabel lpfa = new JLabel("Rajdhani Express");
		lpfa.setForeground(new Color(0, 0, 0));
		lpfa.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lpfa.setBounds(60, 124, 198, 33);
		contentPane.add(lpfa);
		
		JLabel lpfb = new JLabel("Shatabdi Express");
		lpfb.setForeground(new Color(0, 0, 0));
		lpfb.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lpfb.setBounds(60, 157, 188, 33);
		contentPane.add(lpfb);
		
		JLabel lpfc = new JLabel("Intercity Express");
		lpfc.setForeground(new Color(0, 0, 0));
		lpfc.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lpfc.setBounds(60, 190, 198, 33);
		contentPane.add(lpfc);
		
		JLabel lpfd = new JLabel("GKP Express");
		lpfd.setForeground(new Color(0, 0, 0));
		lpfd.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lpfd.setBounds(60, 287, 198, 33);
		contentPane.add(lpfd);
		
		JLabel lpfe = new JLabel("Yoga Express");
		lpfe.setBackground(new Color(240, 240, 240));
		lpfe.setForeground(new Color(0, 0, 0));
		lpfe.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lpfe.setBounds(60, 317, 198, 33);
		contentPane.add(lpfe);
		
		JLabel lpfg = new JLabel("Aravali Express");
		lpfg.setForeground(new Color(0, 0, 0));
		lpfg.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lpfg.setBounds(60, 349, 198, 35);
		contentPane.add(lpfg);
		
		JLabel lpfa1 = new JLabel("AII to NDLS");
		lpfa1.setForeground(new Color(0, 0, 0));
		lpfa1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lpfa1.setBounds(284, 124, 159, 33);
		contentPane.add(lpfa1);
		
		JLabel lpfb1 = new JLabel("AII to NDLS");
		lpfb1.setForeground(new Color(0, 0, 0));
		lpfb1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lpfb1.setBounds(284, 157, 159, 33);
		contentPane.add(lpfb1);
		
		JLabel lpfc1 = new JLabel("AII to ADI");
		lpfc1.setForeground(new Color(0, 0, 0));
		lpfc1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lpfc1.setBounds(284, 190, 159, 33);
		contentPane.add(lpfc1);
		
		JLabel lpfd1 = new JLabel("GKP to ADI");
		lpfd1.setForeground(new Color(0, 0, 0));
		lpfd1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lpfd1.setBounds(284, 287, 159, 33);
		contentPane.add(lpfd1);
		
		JLabel lpfe1 = new JLabel("DL to HW");
		lpfe1.setForeground(new Color(0, 0, 0));
		lpfe1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lpfe1.setBounds(284, 317, 159, 33);
		contentPane.add(lpfe1);
		
		JLabel lpf1 = new JLabel("JP to CSTM");
		lpf1.setForeground(new Color(0, 0, 0));
		lpf1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lpf1.setBounds(284, 350, 159, 33);
		contentPane.add(lpf1);
		
		JLabel lz1 = new JLabel("12001");
		lz1.setForeground(new Color(0, 0, 0));
		lz1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lz1.setBounds(460, 124, 67, 33);
		contentPane.add(lz1);
		
		JLabel lz2 = new JLabel("12003");
		lz2.setForeground(new Color(0, 0, 0));
		lz2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lz2.setBounds(460, 157, 67, 33);
		contentPane.add(lz2);
		
		JLabel lz3 = new JLabel("15004");
		lz3.setForeground(new Color(0, 0, 0));
		lz3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lz3.setBounds(460, 190, 67, 33);
		contentPane.add(lz3);
		
		JLabel lz4 = new JLabel("19409");
		lz4.setForeground(new Color(0, 0, 0));
		lz4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lz4.setBounds(460, 287, 80, 33);
		contentPane.add(lz4);
		
		JLabel lz5 = new JLabel("12204");
		lz5.setForeground(new Color(0, 0, 0));
		lz5.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lz5.setBounds(460, 317, 80, 33);
		contentPane.add(lz5);
		
		JLabel lz6 = new JLabel("15502");
		lz6.setForeground(new Color(0, 0, 0));
		lz6.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lz6.setBounds(460, 350, 80, 33);
		contentPane.add(lz6);
		
		JLabel lt1 = new JLabel("11:05:00");
		lt1.setForeground(new Color(255, 255, 255));
		lt1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lt1.setBounds(593, 124, 108, 33);
		contentPane.add(lt1);
		
		JLabel lt2 = new JLabel("09:10:00");
		lt2.setForeground(new Color(255, 255, 255));
		lt2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lt2.setBounds(593, 157, 108, 33);
		contentPane.add(lt2);
		
		JLabel lt3 = new JLabel("16:22:00");
		lt3.setForeground(new Color(255, 255, 255));
		lt3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lt3.setBounds(593, 190, 108, 33);
		contentPane.add(lt3);
		
		JLabel lt4 = new JLabel("18:52:00");
		lt4.setForeground(new Color(255, 255, 255));
		lt4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lt4.setBounds(593, 287, 108, 33);
		contentPane.add(lt4);
		
		JLabel lt5 = new JLabel("22:20:00");
		lt5.setForeground(Color.WHITE);
		lt5.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lt5.setBounds(593, 317, 108, 33);
		contentPane.add(lt5);
		
		JLabel lt6 = new JLabel("05:40:00");
		lt6.setForeground(Color.WHITE);
		lt6.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lt6.setBounds(593, 350, 108, 33);
		contentPane.add(lt6);
		
		JLabel lb1 = new JLabel("Train Name");
		lb1.setBackground(Color.WHITE);
		lb1.setForeground(new Color(128, 0, 0));
		lb1.setFont(new Font("Arial", Font.BOLD, 22));
		lb1.setBounds(71, 95, 137, 33);
		contentPane.add(lb1);
		
		JLabel lb2 = new JLabel("Stations");
		lb2.setForeground(new Color(128, 0, 0));
		lb2.setFont(new Font("Arial", Font.BOLD, 22));
		lb2.setBounds(288, 95, 108, 33);
		contentPane.add(lb2);
		
		JLabel lb3 = new JLabel("Train No.");
		lb3.setForeground(new Color(128, 0, 0));
		lb3.setFont(new Font("Arial", Font.BOLD, 22));
		lb3.setBounds(443, 91, 104, 33);
		contentPane.add(lb3);
		
		JLabel lb4 = new JLabel("Time");
		lb4.setForeground(new Color(128, 0, 0));
		lb4.setFont(new Font("Arial", Font.BOLD, 22));
		lb4.setBounds(634, 91, 67, 33);
		contentPane.add(lb4);
		
		JButton bt1 = new JButton("Back");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Management mn=new Management();
				mn.setVisible(true);
				dispose();
			}
		});
		bt1.setForeground(new Color(0, 0, 0));
		bt1.setBackground(new Color(255, 255, 255));
		bt1.setFont(new Font("Arial Black", Font.BOLD, 20));
		bt1.setBounds(316, 394, 137, 40);
		contentPane.add(bt1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("G:\\Eclipse Workplace\\Train Management\\Image\\articlesprincipalestrain_1-696x348.jpg"));
		lblNewLabel.setBounds(53, 25, 660, 427);
		contentPane.add(lblNewLabel);
	}
}
