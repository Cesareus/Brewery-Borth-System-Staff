package clases;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Registro extends JFrame implements ActionListener{

JMenuBar menubar;
JMenu menu1,menu2;
JMenuItem nuevo,volver,creador;
private JButton boton1, boton2,boton3,boton4;
private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12;
private JTextField campo1,campo2,campo3,campo4,campo5,campo6,campo7,campo8,campo9;
String user,pass,nombre,dni,cuit_cuil,direccion,mail,grupo,consulta;

 public Registro(){
  setLayout(null);

  setDefaultCloseOperation(EXIT_ON_CLOSE);   

  getContentPane().setBackground(new Color(193,172,73));
  
  setIconImage(new ImageIcon(getClass().getResource("/Icono.png")).getImage());
  setTitle("Registro Usuarios");

  menubar = new JMenuBar();
  setJMenuBar(menubar);
  menubar.setBackground(new Color(193,172,73));

  menu1= new JMenu("Opciones");
  menu1.setFont(new Font("Andale Mono",1,14));
  menu1.setForeground(new Color(55,52,53));
  menubar.add(menu1);
 
  nuevo= new JMenuItem("Nuevo");
  nuevo.setFont(new Font("Andale Mono",1,14));
  nuevo.setForeground(new Color(55,52,53));
  nuevo.addActionListener(this);
  menu1.add(nuevo);

  volver= new JMenuItem("Volver");
  volver.setFont(new Font("Andale Mono",1,14));
  volver.setForeground(new Color(55,52,53));
  volver.addActionListener(this);
  menu1.add(volver);

  menu2= new JMenu("Acerca de");
  menu2.setFont(new Font("Andale Mono",1,14));
  menu2.setForeground(new Color(55,52,53));
  menubar.add(menu2);

  creador= new JMenuItem("El creador");
  creador.setFont(new Font("Andale Mono",1,14));
  creador.setForeground(new Color(55,52,53));
  creador.addActionListener(this);
  menu2.add(creador);


  label2= new JLabel("Registro Usuarios");
  label2.setBounds(135,5,300,25);
  label2.setFont(new Font("Andale Mono",3,18));
  label2.setForeground(new Color(55,52,53));
  add(label2);

  label4= new JLabel("Nombre de Usuario:");
  label4.setFont(new Font("Andale Mono",1,12));
  label4.setForeground(new Color(55,52,53));
  label4.setBounds(75,35,150,20);
  add(label4);


  campo1= new JTextField();
  campo1.setFont(new Font("Andale Mono",1,14));
  campo1.setForeground(new Color(55,52,53));
  campo1.setBackground(new Color(255,255,255));
  campo1.setBounds(75,55,270,25);
  add(campo1);

 
  label5= new JLabel("Contraseña:");
  label5.setFont(new Font("Andale Mono",1,12));
  label5.setForeground(new Color(55,52,53));
  label5.setBounds(75,85,150,20);
  add(label5);


  campo2= new JTextField();
  campo2.setFont(new Font("Andale Mono",1,14));
  campo2.setForeground(new Color(55,52,53));
  campo2.setBackground(new Color(255,255,255));
  campo2.setBounds(75,105,270,25);
  add(campo2);

  
  label6= new JLabel("Nombre y apellido:");
  label6.setFont(new Font("Andale Mono",1,12));
  label6.setForeground(new Color(55,52,53));
  label6.setBounds(75,135,150,20);
  add(label6);


  campo3= new JTextField();
  campo3.setFont(new Font("Andale Mono",1,14));
  campo3.setForeground(new Color(55,52,53));
  campo3.setBackground(new Color(255,255,255));
  campo3.setBounds(75,155,270,25);
  add(campo3);

  label7= new JLabel("DNI:");
  label7.setFont(new Font("Andale Mono",1,12));
  label7.setForeground(new Color(55,52,53));
  label7.setBounds(75,185,100,20);
  add(label7);

  campo4= new JTextField();
  campo4.setFont(new Font("Andale Mono",1,14));
  campo4.setForeground(new Color(55,52,53));
  campo4.setBackground(new Color(255,255,255));
  campo4.setBounds(75,205,270,25);
  add(campo4);
  
  label8= new JLabel("Telefono:");
  label8.setFont(new Font("Andale Mono",1,12));
  label8.setForeground(new Color(55,52,53));
  label8.setBounds(75,235,100,20);
  add(label8);

  campo5= new JTextField();
  campo5.setFont(new Font("Andale Mono",1,14));
  campo5.setForeground(new Color(55,52,53));
  campo5.setBackground(new Color(255,255,255));
  campo5.setBounds(75,255,270,25);
  add(campo5);

  label9= new JLabel("Dirección:");
  label9.setFont(new Font("Andale Mono",1,12));
  label9.setForeground(new Color(55,52,53));
  label9.setBounds(75,285,100,25);
  add(label9);

  campo6= new JTextField();
  campo6.setFont(new Font("Andale Mono",1,14));
  campo6.setForeground(new Color(55,52,53));
  campo6.setBackground(new Color(255,255,255));
  campo6.setBounds(75,310,270,25);
  add(campo6);


  label10= new JLabel("Correo Electrónico:");
  label10.setFont(new Font("Andale Mono",1,12));
  label10.setForeground(new Color(55,52,53));
  label10.setBounds(75,340,150,25);
  add(label10);

  campo7= new JTextField();
  campo7.setFont(new Font("Andale Mono",1,14));
  campo7.setForeground(new Color(55,52,53));
  campo7.setBackground(new Color(255,255,255));
  campo7.setBounds(75,365,270,25);
  add(campo7);
 
  label11= new JLabel("Usuarios o Staff:");
  label11.setFont(new Font("Andale Mono",1,12));
  label11.setForeground(new Color(55,52,53));
  label11.setBounds(75,395,200,25);
  add(label11);

  campo8= new JTextField();
  campo8.setFont(new Font("Andale Mono",1,14));
  campo8.setForeground(new Color(55,52,53));
  campo8.setBackground(new Color(255,255,255));
  campo8.setBounds(75,420,270,25);
  add(campo8);
  
  boton1= new JButton("Registrar");
  boton1.setFont(new Font("Andale Mono",1,12));
  boton1.setForeground(new Color(193,172,73));
  boton1.setBackground(new Color(55,52,53));
  boton1.setBounds(40,460,100,20);
  boton1.addActionListener(this);
  boton1.setEnabled(true);
  add(boton1);
  
  boton2= new JButton("Modificar");
  boton2.setFont(new Font("Andale Mono",1,12));
  boton2.setForeground(new Color(193,172,73));
  boton2.setBackground(new Color(55,52,53));
  boton2.setBounds(160,460,100,20);
  boton2.addActionListener(this);
  boton2.setEnabled(true);
  add(boton2);
  
  boton3= new JButton("Eliminar");
  boton3.setFont(new Font("Andale Mono",1,12));
  boton3.setForeground(new Color(193,172,73));
  boton3.setBackground(new Color(55,52,53));
  boton3.setBounds(280,460,100,20);
  boton3.addActionListener(this);
  boton3.setEnabled(true);
  add(boton3);

  boton4= new JButton("Buscar DNI:");
  boton4.setFont(new Font("Andale Mono",1,12));
  boton4.setForeground(new Color(193,172,73));
  boton4.setBackground(new Color(55,52,53));
  boton4.setBounds(10,500,100,20);
  boton4.addActionListener(this);
  boton4.setEnabled(true);
  add(boton4);
  
  campo9= new JTextField();
  campo9.setFont(new Font("Andale Mono",1,14));
  campo9.setForeground(new Color(55,52,53));
  campo9.setBackground(new Color(255,255,255));
  campo9.setBounds(120,495,270,30);
  add(campo9);
  
  label3= new JLabel("@Borth Cerveza Artesanal-Valle de Paravachasca");
  label3.setFont(new Font("Andale Mono",1,12));
  label3.setForeground(new Color(55,52,53));
  label3.setBounds(60,530,300,30);
  add(label3);

  label11= new JLabel("xxxxxx");
  label11.setFont(new Font("Andale Mono",1,12));
  label11.setForeground(new Color(55,52,53));
  label11.setBounds(125,550,300,30);
  add(label11);
 
}
 
 public void actionPerformed(ActionEvent e){
  
  user= campo1.getText().trim();
  pass= campo2.getText().trim();
  nombre= campo3.getText().trim();
  dni= campo4.getText().trim();
  cuit_cuil= campo5.getText().trim();
  direccion= campo6.getText().trim();
  mail= campo7.getText().trim();
  grupo= campo8.getText().trim();
  
  int num= user.length(), num1= pass.length();
  if(e.getSource() == boton1){
  if(user.equals("")||pass.equals("")||nombre.equals("")
          ||dni.equals("")||cuit_cuil.equals("")||direccion.equals("")||mail.equals("")||grupo.equals("")){
  JOptionPane.showMessageDialog(null,"Falta completar algún campo");}
  else if(num>10 || num1!=8 ){
    JOptionPane.showMessageDialog(null,"El nombre debe tener menos de 10 caracteres \n y la contraseña debe tener 8");
  }else {
   try{     
            Connection cn = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/onsMAuvdE5","onsMAuvdE5", "EWpgsJuVTJ");
            PreparedStatement pst = cn.prepareStatement("insert into usuarios values(?,?,?,?,?,?,?,?)");


            pst.setString(1, campo1.getText().trim());
            pst.setString(2, campo2.getText().trim());
            pst.setString(3, campo3.getText().trim());
            pst.setString(4, campo4.getText().trim());
            pst.setString(5, campo5.getText().trim());
            pst.setString(6, campo6.getText().trim());
            pst.setString(7, campo7.getText().trim());
            pst.setString(8, campo8.getText().trim());
            pst.executeUpdate();

            campo1.setText("");
            campo2.setText("");
            campo3.setText("");
            campo4.setText("");
            campo5.setText("");
            campo6.setText("");
            campo7.setText("");
            campo8.setText("");
            
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            
        }catch (SQLException evt){
            System.out.println("Opps Error:");
            evt.printStackTrace();
      }
    }  
  }
   if (e.getSource() == boton2) {
                try {
             
             Connection cn = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/onsMAuvdE5","onsMAuvdE5", "EWpgsJuVTJ");
             PreparedStatement pst = cn.prepareStatement("update usuarios set user=?, pass=?, nombre=?, dni=?, telefono=?,"
                     + " direccion=?, mail=?, grupo=?"+" where dni = '"+campo9.getText()+"'");
            
                        
            pst.setString(1, campo1.getText().trim());
            pst.setString(2, campo2.getText().trim());
            pst.setString(3, campo3.getText().trim());
            pst.setString(4, campo4.getText().trim());
            pst.setString(5, campo5.getText().trim());
            pst.setString(6, campo6.getText().trim());
            pst.setString(7, campo7.getText().trim());
            pst.setString(8, campo8.getText().trim());
            
            pst.executeUpdate();
            
            campo1.setText("");
            campo2.setText("");
            campo3.setText("");
            campo4.setText("");
            campo5.setText("");
            campo6.setText("");
            campo7.setText("");
            campo8.setText("");
            
            JOptionPane.showMessageDialog(null, "Modificación exitosa");
            
                
        } catch (SQLException evt){
            System.out.println("Opps Error:");
            evt.printStackTrace();
      }
     }
  
   if (e.getSource() == boton3) {
                try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/onsMAuvdE5","onsMAuvdE5", "EWpgsJuVTJ");
            PreparedStatement pst = cn.prepareStatement("delete from usuarios where dni = '"+campo9.getText()+"'");
            

            pst.executeUpdate();
            
            campo1.setText("");
            campo2.setText("");
            campo3.setText("");
            campo4.setText("");
            campo5.setText("");
            campo6.setText("");
            campo7.setText("");
            campo8.setText("");
            campo9.setText("");
         
                JOptionPane.showMessageDialog(null, "Registro eliminado");
                            
        } catch (SQLException evt){
            System.out.println("Opps Error:");
            evt.printStackTrace();
      }
     }
   
     if (e.getSource() == boton4) {
                try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/onsMAuvdE5","onsMAuvdE5", "EWpgsJuVTJ");
            PreparedStatement pst = cn.prepareStatement("select * from usuarios"+" where dni = '"+campo9.getText()+"'");
            
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                campo1.setText(rs.getString("user"));
                campo2.setText(rs.getString("pass"));
                campo3.setText(rs.getString("nombre"));
                campo4.setText(rs.getString("dni"));
                campo5.setText(rs.getString("telefono"));
                campo6.setText(rs.getString("direccion"));
                campo7.setText(rs.getString("mail"));
                campo8.setText(rs.getString("grupo"));
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no registrado");
            }
                
        } catch (SQLException evt){
            System.out.println("Opps Error:");
            evt.printStackTrace();
      }
     }

 if(e.getSource() == nuevo){
  campo1.setText("");
  campo2.setText("");
  campo3.setText("");
  campo4.setText("");
  campo5.setText("");
  campo6.setText("");
  campo7.setText("");
  campo8.setText("");
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

  Registro registro= new Registro();
  registro.setBounds(0,0,450,640);
  registro.setVisible(true);
  registro.setLocationRelativeTo(null);
  registro.setResizable(false);
 }
}