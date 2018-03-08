import javax.swing.*;
import java.awt.*;

public class GUI_SA extends JFrame
{
	//	menu
	JMenuBar menuBar = new JMenuBar();
	JMenu menu = new JMenu("File");

	//	Toolbar and its buttons
	JToolBar tbar = new JToolBar();
	JButton tbrbtn1 = new  JButton( new ImageIcon("left.gif") );
	JButton tbrbtn2 = new  JButton( new ImageIcon("right.gif"));
	JButton tbrbtn3 = new  JButton( new ImageIcon("open.gif"));
	JButton tbrbtn4 = new  JButton( new ImageIcon("save.gif"));
	JButton tbrbtn5 = new  JButton("Text Button");

	//	Label
	JLabel lb1 = new JLabel("First Name");
	JLabel lb2 = new JLabel("Last Name");
	JLabel lb3 = new JLabel("Login ID");
	JLabel lb4 = new JLabel("Password");
	JLabel lb5 = new JLabel("Gender");
	JLabel lb6 = new JLabel("Country");
	JLabel lb7 = new JLabel("Account Type");
	JLabel lb8 = new JLabel("Description");
	JLabel lb9 = new JLabel("Choose your Color");

	//	Text Field
	JTextField tf1= new JTextField(15);
	JTextField tf2= new JTextField(15);
	JTextField tf3= new JTextField(15);

	//	Password Field
	JPasswordField pf = new JPasswordField(15);

	//	Radio Button
	JRadioButton rb1 = new JRadioButton("Male" , true);
	JRadioButton rb2 = new JRadioButton("Female" , false);

	//	comboBox
	JComboBox jcb = new JComboBox();

	//	checkBoxes
	JCheckBox cb1 = new JCheckBox("A");
	JCheckBox cb2 = new JCheckBox("B");
	JCheckBox cb3 = new JCheckBox("C");

	//	TextArea
	JTextArea ta = new JTextArea("===>>Hello!!!<<===  " ,5,10);

	//	List
	String color[] = {"Black", "Red", "Green", "Blue", "Pink", "Grey"};
	JList list = new  JList(color);

	//	Button
	JButton bt = new JButton("Submit");

	//	Constructor
	public GUI_SA()
	{
		Container container = getContentPane();
		container.setLayout( new FlowLayout() );
		
		//add Menu and its items
		menuBar.add(menu);
		
		menu.add( new JMenuItem("Open") );	
		menu.add( new JMenuItem("Save") );
		menu.add( new JMenuItem("Save as") );
		menu.add( new JMenuItem("Quit") );

		//finalize your menu bar
		this.setJMenuBar(menuBar);

		//add toolbar and its buttons
		container.add(tbar);
	
		tbar.add(tbrbtn1);
		tbrbtn1.setToolTipText("left");

		tbar.add(tbrbtn2);
		tbrbtn1.setToolTipText("right");

		tbar.add(tbrbtn3);
		tbrbtn1.setToolTipText("Open File");

		tbar.add(tbrbtn4);
		tbrbtn1.setToolTipText("Save File");

		tbar.add(tbrbtn5);
		
		//add name and textField
		container.add(lb1);
		container.add(tf1);

		//add LastName and TextField
		container.add(lb2);
		container.add(tf2);

		//add Login and TextField
		container.add(lb3);
		container.add(tf3);

		//add Password and Field
		container.add(lb4);
		container.add(pf);

		//Add country and comboBox
		container.add(lb6);
		jcb.addItem("Pakistan");
		jcb.addItem("United Kingdom");
		jcb.addItem("United States of America");
		jcb.addItem("India");
		jcb.addItem("Japan");

		container.add(jcb);

		//Add gender and RadioButton
		container.add(lb5);
		container.add(rb1);
		container.add(rb2);

		ButtonGroup grp = new ButtonGroup();
		grp.add(rb1);
		grp.add(rb2);

		//add Type and checkBoxes
		container.add(lb7);
		container.add(cb1);
		container.add(cb2);
		container.add(cb3);

		//add TextArea and CheckBoxes
		container.add(lb8);
		container.add(ta);

		//Add List
		container.add(lb9);
		list.setVisibleRowCount(4);
		container.add(list);
		container.add(new JScrollPane(list));

		//add button
		container.add(bt);

		this.setVisible(true);
		this.setSize(270,500);
		this.setTitle("First GUI Form");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	public static void main(String [] args)
	{
		GUI_SA form = new GUI_SA();
	}	
}
