package java_20190617.unicastclient;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField; 

public class UnicastClient implements ActionListener {
	private String id;
	private String ip;
	private int port;
	private JFrame jframe;
	private JTextArea jta;
	private JPanel jp1, jp2;
	private JLabel jl1, jl2;
	private JTextField jtf;
	private JButton jbtn;

	public UnicastClient(String id, String ip, int port) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.ip = ip;
		this.port = port;
		jframe = new JFrame("Unicast Chatting");

		jp1 = new JPanel();
		jp2 = new JPanel();

		jl1 = new JLabel("Usage ID: [" + id + "]"); 
		jl2 = new JLabel("IP : " + ip); 
		
		jp1.setLayout(new BorderLayout());
		
		
		jp1.add(jl1, BorderLayout.CENTER);
		jp1.add(jl2, BorderLayout.EAST);

		jtf = new JTextField(30);
		jtf.addActionListener(this);
		
		jbtn = new JButton("전송");
		jbtn.addActionListener(this);
		
		jp2.setLayout(new BorderLayout());
		jp2.add(jtf,BorderLayout.CENTER);
		jp2.add(jbtn, BorderLayout.EAST);
		
		
		
		jta = new JTextArea("", 5, 50);
		jta.setEditable(false);
		jta.setBackground(Color.cyan);

		JScrollPane jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		jframe.add(jsp, BorderLayout.CENTER);

		jframe.add(jp1, BorderLayout.NORTH);
		jframe.add(jp2, BorderLayout.SOUTH);
		jframe.pack();
		jframe.setResizable(true);
		jframe.setVisible(true);

		jframe.addWindowFocusListener(new WindowAdapter() {
			public void windowClosing(WindowAdapter e) {
				System.exit(0);
			}
		});

	}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		UnicastClient uc = new UnicastClient("gomchan7", "127.0.0.1", 3002);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj=e.getSource();
		if(obj== jtf || obj== jbtn){
			String message = jtf.getText();// + "\n" 하면 개행된다. 하지만 유닉스에선 다르다 
			message += System.getProperty("line.separator");
			jta.append(id+":"+message);	//	System.out.println("들어왔니 ? "+message);
			jtf.setText("");		 
		}
		
	}
}
