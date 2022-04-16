package clases;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Promociones extends JFrame implements ActionListener{

JMenuBar menubar;
JMenu menu1,menu2;
JMenuItem Promo,volver,creador;
JLabel label1,label2,label4,label5,label6,label7,label8;
JTextField campo1,campo2;
JTextArea area1;
JScrollPane scroll1;
String nombre="";
 
 public Promociones(){

  setLayout(null);

  setDefaultCloseOperation(EXIT_ON_CLOSE);

  getContentPane().setBackground(new Color(193,172,73));
 
  setIconImage(new ImageIcon(getClass().getResource("/Icono.png")).getImage());

  setTitle("Promociones");

  ImageIcon imagen= new ImageIcon("imagenes/logo-borth.png");
  Bienvenida nuevo= new Bienvenida();
  nombre= nuevo.texto;

  label1= new JLabel(imagen);
  label1.setBounds(5,5,300,150);
  add(label1);

  label2= new JLabel("Bienvenido/a");
  label2.setBounds(330,20,250,30);
  label2.setFont(new Font("Andale Mono",3,35));
  label2.setForeground(new Color(55,52,53));
  add(label2);

  label4= new JLabel(nombre);
  label4.setBounds(330,60,250,50);
  label4.setFont(new Font("Andale Mono",3,17));
  label4.setForeground(new Color(55,52,53));
  add(label4);


  area1= new JTextArea();
  area1.setFont(new Font("Andale Mono",1,14));
  area1.setForeground(new Color(55,52,53));
  area1.setBackground(new Color(255,255,255));
  area1.setEditable(true);  
  scroll1=new JScrollPane(area1);
  scroll1.setBounds(20,150,580,240);  
  add(scroll1);
  
  label5= new JLabel("Porcentaje");
  label5.setFont(new Font("Andale Mono",1,14));
  label5.setForeground(new Color(55,52,53));
  label5.setBounds(20,410,80,25);
  add(label5);
  
  campo1= new JTextField("");
  campo1.setForeground(new Color(55,52,53));
  campo1.setFont(new Font("Andale Mono",1,14));
  campo1.setBounds(110,410,50,25);
  add(campo1);
  
  label6= new JLabel("0 predet");
  label6.setFont(new Font("Andale Mono",1,14));
  label6.setForeground(new Color(55,52,53));
  label6.setBounds(170,410,70,25);
  add(label6);
  
  label7= new JLabel("Cantidad");
  label7.setFont(new Font("Andale Mono",1,14));
  label7.setForeground(new Color(55,52,53));
  label7.setBounds(255,410,80,25);
  add(label7);
  
  campo2= new JTextField("");
  campo2.setForeground(new Color(55,52,53));
  campo2.setFont(new Font("Andale Mono",1,14));
  campo2.setBounds(335,410,50,25);
  add(campo2);
  
  label8= new JLabel("1 predet");
  label8.setFont(new Font("Andale Mono",1,14));
  label8.setForeground(new Color(55,52,53));
  label8.setBounds(395,410,70,25);
  add(label8);
  
  menubar = new JMenuBar();
  setJMenuBar(menubar);
  menubar.setBackground(new Color(193,172,73));

  menu1= new JMenu("Opciones");
  menu1.setFont(new Font("Andale Mono",1,14));
  menu1.setForeground(new Color(55,52,53));
  menubar.add(menu1);
  
  Promo= new JMenuItem("Subir Promo");
  Promo.setFont(new Font("Andale Mono",1,14));
  Promo.setForeground(new Color(55,52,53));
  Promo.addActionListener(this);
  menu1.add(Promo);

  volver= new JMenuItem("Volver");
  volver.setFont(new Font("Andale Mono",1,14));
  volver.setForeground(new Color(55,52,53));
  volver.addActionListener(this);
  menu1.add(volver);

  menu2= new JMenu("Acerca de");
  menu2.setFont(new Font("Andale Mono",1,14));
  menu2.setForeground(new Color(55,52,53));
  menubar.add(menu2);

  creador= new JMenuItem("El Creador");
  creador.setFont(new Font("Andale Mono",1,14));
  creador.setForeground(new Color(55,52,53));
  creador.addActionListener(this);
  menu2.add(creador);

}

 
 public void actionPerformed(ActionEvent e){

 if(e.getSource() == Promo){
     if(area1.getText().equals("") || campo1.getText().equals("")){
     JOptionPane.showMessageDialog(null,"Debes llenar todos los campos");
     }else{
 try {
        Connection cn = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/onsMAuvdE5","onsMAuvdE5", "EWpgsJuVTJ");
        PreparedStatement pst= cn.prepareStatement("update opciones set promouser=?,porcentaje=?,cajones=? where ID = 1");
        
        pst.setString(1, area1.getText());
        pst.setInt(2, Integer.parseInt(campo1.getText()));
        pst.setInt(3, Integer.parseInt(campo2.getText()));
        int rs= pst.executeUpdate();
        if (rs > 0) {
           JOptionPane.showMessageDialog(null, "Registro Exitoso");
           area1.setText("");
           campo1.setText("");
        }
        
    } catch (SQLException evt) {
        JOptionPane.showMessageDialog(null, "!Error: "+evt);
    }
 }
 }
 
 if(e.getSource() == volver){

  Staff staff = new Staff();
  staff.setBounds(0,0,640,530);
  staff.setVisible(true);
  staff.setLocationRelativeTo(null);
  staff.setResizable(false); 
  this.setVisible(false);
 }

 if(e.getSource() == creador){
 JOptionPane.showMessageDialog(null,"Creado por César Rosa.");
 }
}

 public static void main (String args[]){
  Promociones promo = new Promociones();
  promo.setBounds(0,0,640,530);
  promo.setVisible(true);
  promo.setLocationRelativeTo(null);
  promo.setResizable(false); 

 }
}


