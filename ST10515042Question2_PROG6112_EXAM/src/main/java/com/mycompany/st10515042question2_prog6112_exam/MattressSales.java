package com.mycompany.st10515042question2_prog6112_exam;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.*;

public class MattressSales extends JFrame{//start of class
    
    //componenets required:
    private String Name;
    private String ProductName;
    private double VAT;
    private double commision;
    private double Total;
    
    private static final String Seq_File = "data.txt";
    
    //Frame:
    public MattressSales(){
        setTitle("Product App");
        setSize(520,360);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //JMenuBar:
        JMenuBar Bar = new JMenuBar();
        
        //Menu: File(Exit) AND Tools
        JMenu File = new JMenu("File");
        JMenuItem Exit = new JMenuItem("Exit");
        File.add(Exit);
        Bar.add(File);
        
        JMenu Tools = new JMenu("Tools");
        JMenuItem Process = new JMenuItem("Process");
        JMenuItem Clear = new JMenuItem("Clear");
        Tools.add(Process);
        Tools.add(Clear);
        Bar.add(Tools);
        
        setJMenuBar(Bar);
        
        //JLabel: CustomerName, SelectProduct, EnterPrice
        JLabel CustomerName = new JLabel("Customer Name:");
        CustomerName.setBounds(30, 40, 150, 30);
        add(CustomerName);
        
        JLabel SelectProduct = new JLabel("Select Product:");
        SelectProduct.setBounds(30, 100, 150, 30);
        add(SelectProduct);
        
        JLabel EnterPrice = new JLabel("Enter Price:");
        EnterPrice.setBounds(30, 160, 150, 30);
        add(EnterPrice);
        
        //JTextField: Name
        JTextField Name = new JTextField();
        Name.setBounds(170, 40, 300, 30);
        add(Name);
        
        //JComboBox: Product
        JComboBox Product = new JComboBox(
                new String[]{"Cozy Nights Monarch","Restonic Barbados","Sealy Phuket"});
        Product.setBounds(170, 100, 300, 30);
        add(Product);
        
        //JTextField: Price
        JTextField Price = new JTextField();
        Price.setBounds(170, 160, 300, 30);
        add(Price);
        
        //JButton: ProcessBTN
        JButton ProcessBTN = new JButton("PROCESS");
        ProcessBTN.setBounds(170, 220, 300, 30);
        add(ProcessBTN);
        
        ProcessBTN.addActionListener(e -> Calculations());
        ProcessBTN.addActionListener(e -> ProcessSection());
    }
    
    //Method that will display the total and the details:
    public void Calculations(){
        JOptionPane.showMessageDialog(this, "Customer Name: " + Name+ "\n"
                + "Product: " + "\n"
                + "VAT:"+ "\n"
                + "COMMISION: " + "\n"
                + "TOTAL: ");
    }
    
        public void ProcessSection(){
        File file = new File(Seq_File);
        if(file.exists()){
            return;
        }
        try(PrintWriter out = new PrintWriter(new FileWriter(file))){
            out.println("DATA LOG");
            out.println("*******************************************");
            out.println("Customer Name: " + Name);
            out.println("Product: ");
            out.println("VAT: R");
            out.println("COMMISION: R");
            out.println("TOTAL: R");
            out.println("*******************************************");
        }catch(IOException ex){
            
        }
    }
}//end of class
