import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstFrame extends JFrame{
	private boolean pickOrEat;
	private JButton[] btnList = {new JButton("Pick up"),new JButton("Eat in hear")};
	public FirstFrame() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new PromotionImg(),BorderLayout.NORTH);
		c.add(new ChoiceWhere(),BorderLayout.CENTER);
		c.add(new AdminChange(),BorderLayout.SOUTH);
		c.setBackground(Color.white);
		setSize(500,700);
		setVisible(true);
	}
	class ChoiceWhere extends JPanel{
		public ChoiceWhere() {
			setLayout(new GridLayout(1,2));
			for(int i=0;i<2;i++) {
				btnList[i].setBackground(Color.white);
				add(btnList[i]);
			}
		}
	}
	class PromotionImg extends JPanel{
		public PromotionImg() {
			setLayout(new FlowLayout());
			ImageIcon ic= new ImageIcon("imgs/apple.jpg");
			Image img = ic.getImage();
			Image modify = img.getScaledInstance(500, 400,Image.SCALE_SMOOTH);
			JLabel promotionIcon = new JLabel(new ImageIcon(modify));
			add(promotionIcon);
		}
	}
	class AdminChange extends JPanel{
		public AdminChange() {
			setLayout(new FlowLayout(FlowLayout.RIGHT));
			ImageIcon ic= new ImageIcon("imgs/ic_setting.png");
			Image img = ic.getImage();
			Image modify = img.getScaledInstance(15, 15,Image.SCALE_SMOOTH);
			JLabel goToSettingIc = new JLabel(new ImageIcon(modify));
			
			goToSettingIc.setBackground(Color.white);
			add(goToSettingIc);
		}
	}
	class AdminInfo{
		private String id, passwd;
		AdminInfo(String id, String passwd){
			this.id = id;
			this.passwd = passwd;
		}
		@Override
		public String toString() {
			return this.id + ' ' + this.passwd;
		}
	}
	public static void main(String[] args) {
		new FirstFrame();
	}

}
