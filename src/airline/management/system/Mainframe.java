

package airline.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.awt.EventQueue;



public class Mainframe extends JFrame{

    public static void main(String[] args) {
        new Mainframe().setVisible(true);
    }
    
    public Mainframe() {
        super("AIRLINE MANAGEMENT SYSTEM");
      setForeground(Color.CYAN);
        setLayout(null); 

        JLabel NewLabel = new JLabel("");
NewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/biman.jpg")));
//        System.out.println(ClassLoader.getSystemResource(""));
        NewLabel.setBounds(-1150, 0, 2800, 1400); // x , y, length, breath
	add(NewLabel); 
        
        JLabel AirlineManagementSystem = new JLabel("WELCOME TO BIMAN BANGLADEASH ");
	AirlineManagementSystem.setForeground(Color.BLUE);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 36));
	AirlineManagementSystem.setBounds(1500, 60, 1000, 55);
	NewLabel.add(AirlineManagementSystem);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu AirlineSystem = new JMenu("AIRLINE SYSTEM");
        AirlineSystem.setForeground(Color.BLUE);
	menuBar.add(AirlineSystem);
		
        JMenuItem FlightDetails = new JMenuItem("FLIGHT INFO");
	AirlineSystem.add(FlightDetails);
		
	JMenuItem ReservationDetails = new JMenuItem("ADD CUSTOMER DETAILS");
	AirlineSystem.add(ReservationDetails);
		
	JMenuItem PassengerDetails = new JMenuItem("JOURNEY DETAILS");
	AirlineSystem.add(PassengerDetails);
		

		
	JMenuItem Cancellation = new JMenuItem("CANCELLATION");
	AirlineSystem.add(Cancellation);
	
        		
        JMenu PaymentSystem = new JMenu("PAYMENT SYSTEM");
        PaymentSystem.setForeground(Color.BLUE);
	menuBar.add(PaymentSystem);

        JMenuItem Pay = new JMenuItem("PAY");
        PaymentSystem.add(Pay);
        
//        JMenuItem SectorDetails_1 = new JMenuItem("PAYMENT DETAILS");
//	PaymentSystem.add(SectorDetails_1);
	
	JMenu Ticket = new JMenu("TICKET");
        Ticket.setForeground(Color.GREEN);
	menuBar.add(Ticket);

        
		
	FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Flight_Info();
            }
	});
        
	ReservationDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {  
                    new Add_Customer();
                    
		} catch (Exception e) {
                    e.printStackTrace();
		} 
            }
	});
		
        PassengerDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Journey_Details();
                } catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});

        Cancellation.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Cancel();
            }
	});
		
//        SectorDetails_1.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent ae){
//                try {
//                    new Payment_Details();
//		} catch (Exception e) {
//                    e.printStackTrace();
//		}
//            }
//	});

        Pay.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Payment();
		} catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
		
        setSize(1950,1090);
	setVisible(true);
    }

    
}
