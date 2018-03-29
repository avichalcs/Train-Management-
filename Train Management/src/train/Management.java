package train;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.util.*;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Management extends JFrame {

	private JPanel contentPane;
    private JLabel clk;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Management frame = new Management();
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
	public Management(){
		setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\Eclipse Workplace\\Train Management\\Image\\L3zNCNHo.jpg"));
		clock();
		setTitle("Train Mangement");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		clk = new JLabel("");
		clk.setFont(new Font("Arial", Font.BOLD, 24));
		clk.setForeground(Color.WHITE);
		clk.setBounds(184, 23, 385, 38);
		contentPane.add(clk);
		
		JLabel lir = new JLabel("Indian Railways Welcomes You");
		lir.setForeground(Color.WHITE);
		lir.setFont(new Font("Arial Black", Font.BOLD, 28));
		lir.setBounds(81, 73, 546, 38);
		contentPane.add(lir);
		
		JButton bsch = new JButton("Check Schedule");
		bsch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Schedule sch1=new Schedule();
				sch1.setVisible(true);
				dispose();
			}
		});
		bsch.setForeground(new Color(0, 0, 0));
		bsch.setBackground(new Color(0, 191, 255));
		bsch.setFont(new Font("Arial", Font.BOLD, 18));
		bsch.setBounds(296, 132, 180, 43);
		contentPane.add(bsch);
		
		JButton bplt = new JButton("Platform");
		bplt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Platform1 plt=new Platform1();
				plt.setVisible(true);
				dispose();
			}
		});
		bplt.setForeground(Color.BLACK);
		bplt.setBackground(new Color(0, 191, 255));
		bplt.setFont(new Font("Arial", Font.BOLD, 18));
		bplt.setBounds(296, 196, 180, 43);
		contentPane.add(bplt);
		
		JButton bext = new JButton("Exit");
		bext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login ln=new Login();
				ln.setVisible(true);
				dispose();
			}
		});
		bext.setForeground(Color.BLACK);
		bext.setBackground(new Color(0, 191, 255));
		bext.setFont(new Font("Arial", Font.BOLD, 18));
		bext.setBounds(296, 326, 180, 38);
		contentPane.add(bext);
		
		JButton babt = new JButton("About");
		babt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About ab=new About();
				ab.setVisible(true);
				dispose();
			}
		});
		babt.setBackground(new Color(0, 191, 255));
		babt.setFont(new Font("Arial", Font.BOLD, 18));
		babt.setForeground(new Color(0, 0, 0));
		babt.setBounds(296, 262, 180, 38);
		contentPane.add(babt);
		
		JLabel limg = new JLabel("");
		limg.setIcon(new ImageIcon("G:\\Eclipse Workplace\\Train Management\\Image\\12066037_10153711725509040_2566388240549129990_n.jpg"));
		limg.setBounds(0, 4, 757, 431);
		contentPane.add(limg);
	}
}
