

package airline.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.awt.EventQueue;

public class Payment extends JFrame {
     JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6,textField_7,textField_8,textField_9,textField_10,textField_11,textField_12,textField_13;

    public static void main(String[] args) {
        new Payment();
    }

    public Payment(){
	initialize();
    }

    private void initialize(){


    getContentPane().setForeground(Color.BLUE);
            getContentPane().setBackground(Color.WHITE);
            setTitle("GIVE PAYMENT INFO");
            
             setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            setSize(778,486);
            getContentPane().setLayout(null);

	JLabel FlightDetails = new JLabel("PAYMENT INFO");
	FlightDetails.setFont(new Font("Tahoma", Font.PLAIN, 36));
	FlightDetails.setForeground(new Color(100, 149, 237));
	FlightDetails.setBounds(300, 20, 570, 35);
	add(FlightDetails);
                
//            JLabel pnr_no = new JLabel("PASSENGER NO");
//            pnr_no.setFont(new Font("Tahoma", Font.PLAIN, 17));
//            pnr_no.setBounds(60, 80, 150, 27);
//            add(pnr_no);
//            
//            textField = new JTextField();
//            textField.setBounds(200, 80, 150, 27);
//            add(textField);
//            
//            JLabel name = new JLabel("NAME");
//            name.setFont(new Font("Tahoma", Font.PLAIN, 17));
//            name.setBounds(60, 120, 150, 27);
//            add(name);
//            
//            textField_1 = new JTextField();
//            textField_1.setBounds(200, 120, 150, 27);
//            add(textField_1);
//
//            JLabel phone = new JLabel("PHONE");
//            phone.setFont(new Font("Tahoma", Font.PLAIN, 17));
//            phone.setBounds(60, 160, 150, 27);
//            add(phone);
//            
//            textField_2 = new JTextField();
//            textField_2.setBounds(200, 160, 150, 27);
//            add(textField_2);
//
//            JLabel f_code = new JLabel("FLIGHT CODE");
//            f_code.setFont(new Font("Tahoma", Font.PLAIN, 17));
//            f_code.setBounds(60, 200, 150, 27);
//            add(f_code);
//            
//            textField_3 = new JTextField();
//            textField_3.setBounds(200, 200, 150, 27);
//            add(textField_3);
//
            
            JLabel ticket_id = new JLabel("TICKET ID");
            ticket_id.setFont(new Font("Tahoma", Font.PLAIN, 17));
            ticket_id.setBounds(60, 80, 150, 27);
            add(ticket_id);
            
            textField_4 = new JTextField();
            textField_4.setBounds(200, 80, 150, 27);
            add(textField_4);


            JLabel jny_date = new JLabel("JOURNEY DATE");
            jny_date.setFont(new Font("Tahoma", Font.PLAIN, 17));
            jny_date.setBounds(60, 120, 150, 27);
            add(jny_date);
            
            textField_5 = new JTextField();
            textField_5.setBounds(200, 120, 150, 27);
            add(textField_5);

            JLabel jny_time = new JLabel("JOURNEY TIME");
            jny_time.setFont(new Font("Tahoma", Font.PLAIN, 17));
            jny_time.setBounds(60, 160, 150, 27);
            add(jny_time);
            
            textField_6 = new JTextField();
            textField_6.setBounds(200, 160, 150, 27);
            add(textField_6);

            JLabel src = new JLabel("SOURCE");
            src.setFont(new Font("Tahoma", Font.PLAIN, 17));
            src.setBounds(60, 200, 150, 27);
            add(src);
            
            textField_7 = new JTextField();
            textField_7.setBounds(200, 200, 150, 27);
            add(textField_7);


            JLabel dst = new JLabel("DESTINATION");
            dst.setFont(new Font("Tahoma", Font.PLAIN, 17));
            dst.setBounds(60, 240, 150, 27);
            add(dst);
            
            textField_8 = new JTextField();
            textField_8.setBounds(200, 240, 150, 27);
            add(textField_8);

            JLabel seat_id = new JLabel("SEAT ID");
            seat_id.setFont(new Font("Tahoma", Font.PLAIN, 17));
            seat_id.setBounds(440, 80, 150, 27);
            add(seat_id);
            
            textField_9 = new JTextField();
            textField_9.setBounds(580, 80, 150, 27);
            add(textField_9);

//Again text and text field

            JLabel card_no = new JLabel("CARD NO");
            card_no.setFont(new Font("Tahoma", Font.PLAIN, 17));
            card_no.setBounds(440, 120, 150, 27);
            add(card_no);
            
            textField_10 = new JTextField();
            textField_10.setBounds(580, 120, 150, 27);
            add(textField_10);
//          Button
            JButton Next_2 = new JButton("CONFIRM PAYMENT");
            Next_2.setBounds(400, 460, 150, 30);
            Next_2.setBackground(Color.BLACK);
            Next_2.setForeground(Color.WHITE);
            add(Next_2);


//padi amo
            JLabel paid_amt = new JLabel("PAID AMOUNT");
            paid_amt.setFont(new Font("Tahoma", Font.PLAIN, 17));
            paid_amt.setBounds(440, 180, 150, 27);
            add(paid_amt);
            
            textField_11 = new JTextField();
            textField_11.setBounds(580, 180, 150, 27);
            add(textField_11);
//paydate
            JLabel pay_date = new JLabel("PAY DATE");
            pay_date.setFont(new Font("Tahoma", Font.PLAIN, 17));
            pay_date.setBounds(440, 220, 150, 27);
            add(pay_date);
            
            textField_12 = new JTextField();
            textField_12.setBounds(580, 220, 150, 27);
            add(textField_12);

// action listeners
//        Next.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent ae) {
//	
//                String code = textField.getText();
//                
//                try {
//                    conn c = new conn();
//                    String str = "select * from passenger where pnr_no = '"+code+"'";
//      
//                    ResultSet rs = c.s.executeQuery(str);
//                      if(rs.next()){
//                       textField_1.setText(rs.getString("name"));
//                       textField_2.setText(rs.getString("ph_no"));
//                       textField_3.setText(rs.getString("fl_code"));
//}
//                    
//                }catch(SQLException e){
//                    e.printStackTrace();
//                }
//            }
//        });

 Next_2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
//                    String pnr_no = textField.getText();
//                    String name = textField_1.getText();
//                    String phone =  textField_2.getText();
//                    String f_code = textField_3.getText();
                    String ticket_id = textField_4.getText();
                    String jny_date = textField_5.getText();
                    String jny_time = textField_6.getText();
                    String src  = textField_7.getText();
                    String dst  = textField_8.getText();
                    String seat_id  = textField_9.getText();
                    String card_no  = textField_10.getText();
                    String paid_amt  = textField_11.getText();
                    String pay_date  = textField_12.getText();
                    String pnr_no = Add_Customer.pnr_no;
                    String name = Add_Customer.name;
                    String f_code = Add_Customer.fl_code;
                    String ph_no = Add_Customer.ph_no;
                    
                    try {
                        conn c = new conn();
                        String str = "INSERT INTO payment values( '"+pnr_no+"', '"+name+"', '"+card_no+"','"+f_code+"', '"+ticket_id+"', '"+jny_date+"','"+jny_time+"', '"+src+"','"+dst+"','"+seat_id+"','"+paid_amt+"','"+pay_date+"')";
                       
                        c.s.executeUpdate(str);

                        JOptionPane.showMessageDialog(null,"Payment Done"); //pop up
                        setVisible(false);
                    
                    } catch (Exception e) {
                        e.printStackTrace();
        	    }
		}
            });




	setSize(960,590);
        setLocation(100,40);
	setVisible(true);

    }
}
