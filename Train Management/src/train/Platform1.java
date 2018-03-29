package train;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.util.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
public class Platform1 extends JFrame {

	private JPanel contentPane;
    private JLabel clk,clkh1,clkh2,clkh3,clkh4,clkh5,clkh6;
    private int second,minutes,hour;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Platform1 frame = new Platform1();
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
				 second=cal.get(Calendar.SECOND);
				 minutes=cal.get(Calendar.MINUTE);
				 hour=cal.get(Calendar.HOUR_OF_DAY);
				try {
					clk.setText("Clock "+hour+":"+minutes+":"+second+" Date- "+day+"/"+month+"/"+year);	
					
				    int a1=(11*60+05)-(hour*60+minutes);
					int h1=a1/60;
					int m1=a1%60;
					if(h1<0||m1<0) {
						clkh1.setText("Departed");
					}
					else {	
					clkh1.setText(""+h1+":"+m1+":"+00);}
					
					
					
					int a2=(9*60+10)-(hour*60+minutes);
					int h2=a2/60;
					int m2=a2%60;
					if(h2==0&&m2==0) {
						clkh2.setText("Arrived");
					}
					else if(h2<0||m2<0){
						clkh2.setText("Departed");
					}
					else {
						clkh2.setText(""+h2+":"+m2+":"+00);
					}
					
					
					
					
					
					int a3=(16*60+22)-(hour*60+minutes);
					int h3=a3/60;
					int m3=a3%60;
					if(h3==0&&m3==0){
						clkh3.setText("Arrived");
					}
					else if(h3<0||m3<0){
						clkh3.setText("Departed");
					}
					else {
					clkh3.setText(""+h3+":"+m3+":"+00);
					}
					
					
					
					
					int a4=(18*60+52)-(hour*60+minutes);
					int h4=a4/60;
					int m4=a4%60;
					if(h4==0&&m4==0){
						clkh4.setText("Arrived");
					}
					else if(h4<0||m4<0){
						clkh4.setText("Departed");
					}
					else {
					clkh4.setText(""+h4+":"+m4+":"+00);
					}
					
					
					
					int a5=(22*60+20)-(hour*60+minutes);
					int h5=a5/60;
					int m5=a5%60;
					if(h5==0&&m5==0){
						clkh5.setText("Arrived");
					}
					else if(h5<0||m5<0){
						clkh5.setText("Departed");
					}
					else {
					clkh5.setText(""+h5+":"+m5+":"+00);
					}
					
					
					
					int a6=(05*60+40)-(hour*60+minutes);
					int h6=a6/60;
					int m6=a6%60;
					if(h6==0&&m6==0){
						clkh6.setText("Arrived");
					}
					else if(h6<0||m6<0){
						clkh6.setText("Departed");
					}
					else {
					clkh6.setText(""+h6+":"+m6+":"+00);
					}
					
					
					
					
					
					
			    
				
				
				}
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
	public Platform1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\Eclipse Workplace\\Train Management\\Image\\L3zNCNHo.jpg"));
		setTitle("Platform");
		clock();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 485);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 128, 114));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		clk = new JLabel("");
		clk.setForeground(new Color(0, 0, 128));
		clk.setFont(new Font("Arial", Font.BOLD, 24));
		clk.setBounds(255, 0, 391, 33);
		contentPane.add(clk);
		
		JLabel ly1 = new JLabel("Indian Railways");
		ly1.setForeground(new Color(75, 0, 130));
		ly1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 26));
		ly1.setBackground(Color.DARK_GRAY);
		ly1.setBounds(10, 0, 198, 33);
		contentPane.add(ly1);
		
		JLabel ly2 = new JLabel("Platform");
		ly2.setForeground(new Color(128, 0, 0));
		ly2.setBackground(new Color(255, 255, 255));
		ly2.setFont(new Font("Arial", Font.BOLD, 22));
		ly2.setBounds(494, 67, 95, 40);
		contentPane.add(ly2);
		
		JLabel ly3 = new JLabel("Train Name");
		ly3.setForeground(new Color(128, 0, 0));
		ly3.setFont(new Font("Arial", Font.BOLD, 22));
		ly3.setBounds(10, 71, 137, 33);
		contentPane.add(ly3);
		
		JLabel ly5 = new JLabel("Train No.");
		ly5.setForeground(new Color(128, 0, 0));
		ly5.setFont(new Font("Arial", Font.BOLD, 22));
		ly5.setBounds(373, 71, 104, 33);
		contentPane.add(ly5);
		
		JLabel ly6 = new JLabel("Time Left");
		ly6.setForeground(new Color(128, 0, 0));
		ly6.setFont(new Font("Arial", Font.BOLD, 22));
		ly6.setBounds(615, 71, 104, 33);
		contentPane.add(ly6);
		
		JLabel label = new JLabel("Stations");
		label.setForeground(new Color(128, 0, 0));
		label.setFont(new Font("Arial", Font.BOLD, 22));
		label.setBounds(218, 71, 108, 33);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Rajdhani Express");
		label_1.setBackground(new Color(255, 255, 255));
		label_1.setForeground(new Color(0, 0, 0));
		label_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_1.setBounds(10, 115, 198, 33);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Shatabdi Express");
		label_2.setForeground(new Color(0, 0, 0));
		label_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_2.setBounds(10, 157, 188, 33);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Intercity Express");
		label_3.setForeground(new Color(0, 0, 0));
		label_3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_3.setBounds(10, 201, 198, 33);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("AII to NDLS");
		label_4.setForeground(new Color(0, 0, 0));
		label_4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_4.setBounds(218, 115, 159, 33);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("AII to NDLS");
		label_5.setForeground(new Color(0, 0, 0));
		label_5.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_5.setBounds(218, 157, 159, 33);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("AII to ADI");
		label_6.setForeground(new Color(0, 0, 0));
		label_6.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_6.setBounds(218, 201, 159, 33);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("12001");
		label_7.setForeground(new Color(0, 0, 0));
		label_7.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_7.setBounds(386, 115, 67, 33);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("12003");
		label_8.setForeground(new Color(0, 0, 0));
		label_8.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_8.setBounds(386, 157, 67, 33);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("15004");
		label_9.setForeground(new Color(0, 0, 0));
		label_9.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_9.setBounds(386, 201, 67, 33);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("GKP Express");
		label_10.setForeground(new Color(0, 0, 0));
		label_10.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_10.setBounds(10, 244, 198, 33);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("Yoga Express");
		label_11.setForeground(new Color(0, 0, 0));
		label_11.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_11.setBackground(SystemColor.menu);
		label_11.setBounds(10, 288, 198, 33);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("Aravali Express");
		label_12.setForeground(new Color(0, 0, 0));
		label_12.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_12.setBounds(10, 332, 198, 35);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("GKP to ADI");
		label_13.setForeground(new Color(0, 0, 0));
		label_13.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_13.setBounds(218, 244, 159, 33);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("DL to HW");
		label_14.setForeground(new Color(0, 0, 0));
		label_14.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_14.setBounds(218, 288, 159, 33);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("JP to CSTM");
		label_15.setForeground(new Color(0, 0, 0));
		label_15.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_15.setBounds(218, 330, 159, 33);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("19409");
		label_16.setForeground(new Color(0, 0, 0));
		label_16.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_16.setBounds(386, 245, 80, 33);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("12204");
		label_17.setForeground(new Color(0, 0, 0));
		label_17.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_17.setBounds(386, 288, 80, 33);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("15502");
		label_18.setForeground(new Color(0, 0, 0));
		label_18.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_18.setBounds(386, 333, 80, 33);
		contentPane.add(label_18);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Management mn2=new Management();
				mn2.setVisible(true);
				dispose();
			}
		});
		button.setForeground(new Color(128, 0, 0));
		button.setFont(new Font("Arial Black", Font.BOLD, 20));
		button.setBackground(new Color(255, 255, 255));
		button.setBounds(316, 395, 137, 40);
		contentPane.add(button);
		
		JLabel label_19 = new JLabel("1");
		label_19.setForeground(new Color(0, 0, 0));
		label_19.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_19.setBounds(515, 115, 32, 33);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("1");
		label_20.setForeground(new Color(0, 0, 0));
		label_20.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_20.setBounds(515, 157, 32, 33);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("1");
		label_21.setForeground(new Color(0, 0, 0));
		label_21.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_21.setBounds(515, 201, 32, 33);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("2");
		label_22.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_22.setForeground(new Color(0, 0, 0));
		label_22.setBounds(515, 244, 32, 33);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("2");
		label_23.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_23.setForeground(new Color(0, 0, 0));
		label_23.setBounds(515, 288, 32, 33);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("2");
		label_24.setForeground(new Color(0, 0, 0));
		label_24.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		label_24.setBounds(515, 333, 32, 33);
		contentPane.add(label_24);
		
		clkh1 = new JLabel("");
		clkh1.setForeground(Color.BLUE);
		clkh1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		clkh1.setBounds(591, 115, 128, 33);
		contentPane.add(clkh1);
		
		clkh2 = new JLabel("");
		clkh2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		clkh2.setForeground(Color.BLUE);
		clkh2.setBounds(591, 157, 128, 33);
		contentPane.add(clkh2);
		
		clkh3 = new JLabel("");
		clkh3.setForeground(Color.BLUE);
		clkh3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		clkh3.setBounds(591, 201, 128, 33);
		contentPane.add(clkh3);
		
		clkh4 = new JLabel("");
		clkh4.setForeground(Color.BLUE);
		clkh4.setFont(new Font("Arial Black", Font.PLAIN, 18));
		clkh4.setBounds(591, 244, 128, 33);
		contentPane.add(clkh4);
		
		clkh5 = new JLabel("");
		clkh5.setForeground(Color.BLUE);
		clkh5.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		clkh5.setBounds(591, 288, 128, 33);
		contentPane.add(clkh5);
		
		clkh6 = new JLabel("");
		clkh6.setForeground(Color.BLUE);
		clkh6.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		clkh6.setBounds(591, 334, 128, 33);
		contentPane.add(clkh6);
		
		
	}
}
