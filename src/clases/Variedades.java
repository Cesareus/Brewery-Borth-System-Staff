package clases;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Variedades extends JFrame implements ActionListener{

JMenuBar menubar;
JMenu menu1,menu3;
JMenuItem subir,volver,creador;
JLabel label1,label2,label4;
JTextArea area1;
JScrollPane scroll1;
String nombre="";
 
 public Variedades(){

  setLayout(null);

  setDefaultCloseOperation(EXIT_ON_CLOSE);

  getContentPane().setBackground(new Color(193,172,73));
 
  setIconImage(new ImageIcon(getClass().getResource("/Icono.png")).getImage());

  setTitle("Variedades Cerveza");

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
  scroll1.setBounds(20,150,580,260);  
  add(scroll1);


  menubar = new JMenuBar();
  setJMenuBar(menubar);
  menubar.setBackground(new Color(193,172,73));

  menu1= new JMenu("Opciones");
  menu1.setFont(new Font("Andale Mono",1,14));
  menu1.setForeground(new Color(55,52,53));
  menubar.add(menu1);

  subir= new JMenuItem("Subir");
  subir.setFont(new Font("Andale Mono",1,14));
  subir.setForeground(new Color(55,52,53));
  subir.addActionListener(this);
  menu1.add(subir);  

  volver= new JMenuItem("Volver");
  volver.setFont(new Font("Andale Mono",1,14));
  volver.setForeground(new Color(55,52,53));
  volver.addActionListener(this);
  menu1.add(volver);

  menu3= new JMenu("Acerca de");
  menu3.setFont(new Font("Andale Mono",1,14));
  menu3.setForeground(new Color(55,52,53));
  menubar.add(menu3);

  creador= new JMenuItem("El Creador");
  creador.setFont(new Font("Andale Mono",1,14));
  creador.setForeground(new Color(55,52,53));
  creador.addActionListener(this);
  menu3.add(creador);

}

 
 public void actionPerformed(ActionEvent e){

 if(e.getSource() == subir){
   if(area1.getText().equals("")){
     JOptionPane.showMessageDialog(null,"Debes llenar todos los campos");
     }else{
 try {
        Connection cn = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/onsMAuvdE5","onsMAuvdE5", "EWpgsJuVTJ");
        PreparedStatement pst= cn.prepareStatement("update opciones set variedades=?where ID = 1");
        
        pst.setString(1, area1.getText());        
        int rs= pst.executeUpdate();
        if (rs > 0) {
           JOptionPane.showMessageDialog(null, "Registro Exitoso");
           area1.setText("");           
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
  Variedades opciones = new Variedades();
  opciones.setBounds(0,0,640,530);
  opciones.setVisible(true);
  opciones.setLocationRelativeTo(null);
  opciones.setResizable(false); 

 }
}


