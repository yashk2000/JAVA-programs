import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;
import java.util.Arrays;  


public class Driver implements ActionListener {
	public static void main(String[] args) {
		JFrame regfrom  = new JFrame("Registration Form");
		regfrom.setSize(400, 520);
		JTextField uname = new JTextField();
		JLabel u = new JLabel("Username");
		uname.setBounds(150, 50, 200, 30);
		u.setBounds(10, 50, 200, 30);

		JPasswordField pwd = new JPasswordField();
		JLabel p = new JLabel("Password");
		pwd.setBounds(150, 100, 200, 30);
		p.setBounds(10, 100, 200, 30);


		JPasswordField pw = new JPasswordField();
		JLabel pp = new JLabel("Confirm Password");
		pw.setBounds(150, 150, 200, 30);
		pp.setBounds(10, 150, 200, 30);

		JLabel country = new JLabel("Country"); 
		country.setBounds(10, 200, 200, 30);
		String cou[] = {"India","United States of America","Nepal","Mauritius","Japan"};
		JComboBox cb = new JComboBox(cou);
		cb.setBounds(150, 200, 200, 30);


		JLabel gender = new JLabel("Gender"); 
		gender.setBounds(10, 250, 200, 30);
		JRadioButton r1 = new JRadioButton("A. Male");
		JRadioButton r2 = new JRadioButton("B. Female");
		r1.setBounds(150,250,100,30);
		r2.setBounds(270, 250, 200,30);


		JLabel skills = new JLabel("Programming Skills"); 
		skills.setBounds(10, 300, 200, 30);
		JCheckBox cb1 = new JCheckBox("JAVA");
		JCheckBox cb2 = new JCheckBox("C");
		cb1.setBounds(180, 300,70,30);
		cb2.setBounds(270, 300,200,30);

		JButton b = new JButton("Select");
		JButton b1 = new JButton("Cancel");
		b.setBounds(50, 380, 130,50 );
		b1.setBounds(200, 380, 130,50);


		regfrom.add(b);
		regfrom.add(b1);
		regfrom.add(cb1);
		regfrom.add(cb2);
		regfrom.add(skills);
		regfrom.add(r1);
		regfrom.add(r2);
		regfrom.add(gender);
		regfrom.add(cb);
		regfrom.add(country);
		regfrom.add(pw);
		regfrom.add(pp);
		regfrom.add(p);
		regfrom.add(pwd);
		regfrom.add(uname);
		regfrom.add(u);
		regfrom.setLayout(null);	   
		regfrom.setVisible(true);  

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				char[] password = pwd.getPassword();
				char[] cpassword = pw.getPassword();

				if(!(Arrays.equals(password,cpassword))){
					JOptionPane.showMessageDialog(regfrom, "Passwords don't match");
				} else if (password.length < 4){
					JOptionPane.showMessageDialog(regfrom, "Password is too short");
				} else if (!r1.isSelected() && !r2.isSelected()){
					JOptionPane.showMessageDialog(regfrom, "Gender not selected");
				} else if(!cb1.isSelected() && !cb2.isSelected())
					JOptionPane.showMessageDialog(regfrom, "Programming skill(s) not selected");
				else {
					JOptionPane.showMessageDialog(regfrom, "Registeration Successful");
				}
			}});

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				regfrom.setVisible(false);


			}});
		r1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				r2.setSelected(false);
			}

		}
				);
		r2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

				r1.setSelected(false);
			}
		}
				);

	}

}


