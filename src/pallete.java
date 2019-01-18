import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class pallete extends JFrame {
	static int x=17;
	static int r=0,g=0,b=0;
	private JPanel contentPane;
	public Panel panel_3;
	public JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pallete frame = new pallete();
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
	public pallete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 328, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		myPanel panel = new myPanel();
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				x=arg0.getX();
				if(x<272 && x>17)
				{
				r=x-17;
				panel.setBackground(new Color(r,0,0));
				panel.repaint();
				panel_3.setBackground(new Color(r,g,b));
				lblNewLabel.setText("r="+r+" g="+g+" b="+b);
			}
			
		}
		});
		panel.setBackground(new Color(r,0,0));
		panel.setBounds(10, 10, 289, 44);
		contentPane.add(panel);
		
		myPanel panel_1 = new myPanel();
		panel_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				x=arg0.getX();
				if(x<272 && x>17)
				{
				g=x-17;
				panel_1.repaint();
				panel_1.setBackground(new Color(0,g,0));
				panel_3.setBackground(new Color(r,g,b));
				lblNewLabel.setText("r="+r+" g="+g+" b="+b);
			}
		}
		});
		panel_1.setBackground(new Color(0,g,0));
		panel_1.setBounds(10, 67, 289, 44);
		contentPane.add(panel_1);
		
		myPanel panel_2 = new myPanel();
		panel_2.setBackground(Color.BLACK);

		panel.setBackground(new Color(0,0,b));
		panel_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				x=arg0.getX();
				if(x<272 && x>17)
				{b=x-17;
				panel_2.repaint();
				panel_2.setBackground(new Color(0,0,b));
				panel_3.setBackground(new Color(r,g,b));
				lblNewLabel.setText("r="+r+" g="+g+" b="+b);
				}
			}
		});
		panel_2.setBounds(10, 124, 289, 44);
		contentPane.add(panel_2);
		
		panel_3 = new Panel();
		panel_3.setBounds(10, 186, 289, 103);
		panel_3.setBackground(new Color(r,g,b));
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("r="+r+" g="+g+" b="+b);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(60, 13, 181, 77);
		panel_3.add(lblNewLabel);
	}
}
