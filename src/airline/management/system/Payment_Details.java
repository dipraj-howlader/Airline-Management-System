

package airline.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class Payment_Details extends JFrame{ //Fifth

    JTextField textField;
    JTable table;
    JLabel Sector;
    JLabel label;

    public static void main(String[] args) {
        new Payment_Details();
    }

    public Payment_Details(){
	initialize();
    }

    private void initialize(){
        setTitle("PAYMENT_DETAILS");
	getContentPane().setBackground(Color.WHITE);
	setSize(860,486);
	setLayout(null);
		
	JLabel Fcode = new JLabel("PNR NO");
	Fcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
	Fcode.setBounds(60, 160, 150, 26);
	add(Fcode);
		
	textField = new JTextField();
	textField.setBounds(200, 160, 150, 26);
	add(textField);
	
        table = new JTable();
	table.setBounds(45, 329, 766, 87);
	add(table);
		
	JButton Show = new JButton("SHOW");
	Show.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Show.setBackground(Color.BLACK);
        Show.setForeground(Color.WHITE);
	Show.setBounds(200, 210, 150, 26);
	add(Show);
		
	Sector = new JLabel("PAYMENT DETAILS");
	Sector.setForeground(Color.BLUE);
	Sector.setFont(new Font("Tahoma", Font.PLAIN, 31));
	Sector.setBounds(51, 17, 300, 39);
	add(Sector);
		
	JLabel pnr_no = new JLabel("PNR_NO");
	pnr_no.setFont(new Font("Tahoma", Font.PLAIN, 13));
	pnr_no.setBounds(84, 292, 108, 26);
	add(pnr_no);
		
	JLabel name = new JLabel("NAME");
	name.setFont(new Font("Tahoma", Font.PLAIN, 13));
	name.setBounds(183, 298, 92, 14);
	add(name);
		
	JLabel ph_no = new JLabel("PHONE NUMBER");
	ph_no.setFont(new Font("Tahoma", Font.PLAIN, 13));
	ph_no.setBounds(322, 294, 101, 24);
	add(ph_no);
		
	JLabel card_no = new JLabel("CARD NO");
	card_no.setFont(new Font("Tahoma", Font.PLAIN, 13));
	card_no.setBounds(455, 298, 114, 14);
	add(card_no);
		
	label = new JLabel("");
	label.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/payment.png")));
	label.setBounds(425, 15, 239, 272);
	add(label);
		
	JLabel f_code = new JLabel("FLIGHT CODE");
	f_code.setFont(new Font("Tahoma", Font.PLAIN, 13));
	f_code.setBounds(602, 299, 101, 19);
	add(f_code);
		
	JLabel paid_amt = new JLabel("PAID AMOUNT");
	paid_amt.setFont(new Font("Tahoma", Font.PLAIN, 13));
	paid_amt.setBounds(712, 294, 86, 24);
	add(paid_amt);

	JLabel pay_date = new JLabel("PAY DATE");
	pay_date.setFont(new Font("Tahoma", Font.PLAIN, 13));
	pay_date.setBounds(852, 294, 86, 24);
	add(pay_date);
	
        setVisible(true);
		
	Show.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
		
                try {
                    String code  = textField.getText();
                    
                    conn c = new conn();
                    String str = "select pnr_no,name,ph_no,card_no,f_code,paid_amt,pay_date from payment where pnr_no = '"+code+"'";
					
                    ResultSet rs = c.s.executeQuery(str);
		
                    table.setModel(DbUtils.resultSetToTableModel(rs));
					
		}catch(SQLException e) {
                    e.printStackTrace();
                }
            }
	});
		
	setSize(960,590);
        setLocation(100,40);
	setVisible(true);

    }
}
