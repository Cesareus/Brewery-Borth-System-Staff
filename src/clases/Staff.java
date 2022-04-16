package clases;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Staff extends JFrame implements ActionListener{

private JMenuBar menubar;
private JMenu menu1,menu2,calcular,Opciones_usuarios,subir_Precio;
private JMenuItem rubia,roja,negra,nuevo,registro,volver,creador,condicionesv,promociones,variedades,Stock,PMayo,PMino;
private JLabel label1,label2,label3,label4,label5,maltab,maltac30,maltac60,maltac120,maltacho,maltanegra,cebadatost,lupulo,avena,etiquetas,tapas,otros,gas,luz,litros,Rubia,Roja,Negra;
private JTextField campo1,campo2,campo3,campo4,campo5,campo6,campo7,campo8,campo9,campo10,campo11,campo12,campo13,campo14,campo15,campo16,campo17,campo18;
private JTextArea area1;
private JScrollPane scroll1;
String nombre="",area_texto="";
float blonde,red,black;
 

 public Staff(){

  setLayout(null);

  setDefaultCloseOperation(EXIT_ON_CLOSE);

  getContentPane().setBackground(new Color(193,172,73));
 
  setIconImage(new ImageIcon(getClass().getResource("/Icono.png")).getImage());

  setTitle("Staff");

  ImageIcon imagen= new ImageIcon("imagenes/logo-borthMm.png");
  Bienvenida bien= new Bienvenida();
  nombre= bien.texto;

  label1= new JLabel(imagen);
  label1.setBounds(420,5,200,80);
  add(label1);

  label2= new JLabel("Bienvenido/a");
  label2.setBounds(420,90,200,26);
  label2.setFont(new Font("Andale Mono",3,25));
  label2.setForeground(new Color(55,52,53));
  add(label2);

  label4= new JLabel(nombre);
  label4.setBounds(420,120,250,25);
  label4.setFont(new Font("Andale Mono",3,17));
  label4.setForeground(new Color(55,52,53));
  add(label4);

  label3= new JLabel("@Borth Cerveza Artesanal-Valle de Paravachasca");
  label3.setFont(new Font("Andale Mono",1,14));
  label3.setForeground(new Color(55,52,53));
  label3.setBounds(130,425,350,25);
  add(label3);
 
  label5= new JLabel("cel:xxxxxx");
  label5.setFont(new Font("Andale Mono",1,14));
  label5.setForeground(new Color(55,52,53));
  label5.setBounds(205,440,250,25);
  add(label5);

  maltab= new JLabel("Malta Base x 25 kgs");
  maltab.setFont(new Font("Andale Mono",1,11));
  maltab.setForeground(new Color(55,52,53));
  maltab.setBounds(10,10,120,25);
  add(maltab);

  campo1= new JTextField();
  campo1.setFont(new Font("Andale Mono",1,12));
  campo1.setForeground(new Color(55,52,53));
  campo1.setBounds(140,10,50,25);
  add(campo1);

  maltac30= new JLabel("Malta Caramelo 30°L");
  maltac30.setFont(new Font("Andale Mono",1,11));
  maltac30.setForeground(new Color(55,52,53));
  maltac30.setBounds(10,45,120,25);
  add(maltac30);

  campo2= new JTextField();
  campo2.setFont(new Font("Andale Mono",1,12));
  campo2.setForeground(new Color(55,52,53));
  campo2.setBounds(140,45,50,25);
  add(campo2);

  maltac60= new JLabel("Malta Caramelo 60°L");
  maltac60.setFont(new Font("Andale Mono",1,11));
  maltac60.setForeground(new Color(55,52,53));
  maltac60.setBounds(10,80,120,25);
  add(maltac60);

  campo3= new JTextField();
  campo3.setFont(new Font("Andale Mono",1,12));
  campo3.setForeground(new Color(55,52,53));
  campo3.setBounds(140,80,50,25);
  add(campo3);

  maltac120= new JLabel("Malta Caramelo 120°L");
  maltac120.setFont(new Font("Andale Mono",1,11));
  maltac120.setForeground(new Color(55,52,53));
  maltac120.setBounds(10,115,120,25);
  add(maltac120);

  campo4= new JTextField();
  campo4.setFont(new Font("Andale Mono",1,12));
  campo4.setForeground(new Color(55,52,53));
  campo4.setBounds(140,115,50,25);
  add(campo4);

  maltacho= new JLabel("Malta Chocolate");
  maltacho.setFont(new Font("Andale Mono",1,11));
  maltacho.setForeground(new Color(55,52,53));
  maltacho.setBounds(10,150,120,25);
  add(maltacho);

  campo5= new JTextField();
  campo5.setFont(new Font("Andale Mono",1,12));
  campo5.setForeground(new Color(55,52,53));
  campo5.setBounds(140,150,50,25);
  add(campo5);

  maltanegra= new JLabel("Malta Tostada");
  maltanegra.setFont(new Font("Andale Mono",1,11));
  maltanegra.setForeground(new Color(55,52,53));
  maltanegra.setBounds(10,185,120,25);
  add(maltanegra);

  campo6= new JTextField();
  campo6.setFont(new Font("Andale Mono",1,12));
  campo6.setForeground(new Color(55,52,53));
  campo6.setBounds(140,185,50,25);
  add(campo6);

  cebadatost= new JLabel("Cebada Tostada");
  cebadatost.setFont(new Font("Andale Mono",1,11));
  cebadatost.setForeground(new Color(55,52,53));
  cebadatost.setBounds(10,220,120,25);
  add(cebadatost);

  campo7= new JTextField();
  campo7.setFont(new Font("Andale Mono",1,12));
  campo7.setForeground(new Color(55,52,53));
  campo7.setBounds(140,220,50,25);
  add(campo7);

  avena= new JLabel("Avena Arrollada");
  avena.setFont(new Font("Andale Mono",1,11));
  avena.setForeground(new Color(55,52,53));
  avena.setBounds(10,255,120,25);
  add(avena);

  campo8= new JTextField();
  campo8.setFont(new Font("Andale Mono",1,12));
  campo8.setForeground(new Color(55,52,53));
  campo8.setBounds(140,255,50,25);
  add(campo8);

  lupulo= new JLabel("Lupulo x 100grs");
  lupulo.setFont(new Font("Andale Mono",1,11));
  lupulo.setForeground(new Color(55,52,53));
  lupulo.setBounds(10,290,120,25);
  add(lupulo);

  campo9= new JTextField();
  campo9.setFont(new Font("Andale Mono",1,12));
  campo9.setForeground(new Color(55,52,53));
  campo9.setBounds(140,290,50,25);
  add(campo9);

  etiquetas= new JLabel("Etiquetas x 100");
  etiquetas.setFont(new Font("Andale Mono",1,11));
  etiquetas.setForeground(new Color(55,52,53));
  etiquetas.setBounds(10,325,120,25);
  add(etiquetas);

  campo10= new JTextField();
  campo10.setFont(new Font("Andale Mono",1,12));
  campo10.setForeground(new Color(55,52,53));
  campo10.setBounds(140,325,50,25);
  add(campo10);

  tapas= new JLabel("Tapas x 100");
  tapas.setFont(new Font("Andale Mono",1,11));
  tapas.setForeground(new Color(55,52,53));
  tapas.setBounds(10,360,120,25);
  add(tapas);

  campo11= new JTextField();
  campo11.setFont(new Font("Andale Mono",1,12));
  campo11.setForeground(new Color(55,52,53));
  campo11.setBounds(140,360,50,25);
  add(campo11);

  gas= new JLabel("Gas");
  gas.setFont(new Font("Andale Mono",1,11));
  gas.setForeground(new Color(55,52,53));
  gas.setBounds(220,10,120,25);
  add(gas);

  campo12= new JTextField();
  campo12.setFont(new Font("Andale Mono",1,12));
  campo12.setForeground(new Color(55,52,53));
  campo12.setBounds(310,10,50,25);
  add(campo12);

  luz= new JLabel("Luz");
  luz.setFont(new Font("Andale Mono",1,11));
  luz.setForeground(new Color(55,52,53));
  luz.setBounds(220,45,120,25);
  add(luz);

  campo13= new JTextField();
  campo13.setFont(new Font("Andale Mono",1,12));
  campo13.setForeground(new Color(55,52,53));
  campo13.setBounds(310,45,50,25);
  add(campo13);

  otros= new JLabel("Otros");
  otros.setFont(new Font("Andale Mono",1,11));
  otros.setForeground(new Color(55,52,53));
  otros.setBounds(220,80,120,25);
  add(otros);

  campo14= new JTextField();
  campo14.setFont(new Font("Andale Mono",1,12));
  campo14.setForeground(new Color(55,52,53));
  campo14.setBounds(310,80,50,25);
  add(campo14);

  litros= new JLabel("Litros Bach");
  litros.setFont(new Font("Andale Mono",1,14));
  litros.setForeground(new Color(55,52,53));
  litros.setBounds(220,125,130,25);
  add(litros);

  campo15= new JTextField();
  campo15.setFont(new Font("Andale Mono",1,12));
  campo15.setForeground(new Color(55,52,53));
  campo15.setBounds(310,125,50,25);
  add(campo15);
  
  Rubia= new JLabel("Precio Rubia");
  Rubia.setFont(new Font("Andale Mono",1,11));
  Rubia.setForeground(new Color(55,52,53));
  Rubia.setBounds(220,180,130,25);
  add(Rubia);

  campo16= new JTextField();
  campo16.setFont(new Font("Andale Mono",1,12));
  campo16.setForeground(new Color(55,52,53));
  campo16.setBounds(310,180,50,25);
  add(campo16);
  
  Roja= new JLabel("Precio Roja");
  Roja.setFont(new Font("Andale Mono",1,11));
  Roja.setForeground(new Color(55,52,53));
  Roja.setBounds(220,215,130,25);
  add(Roja);

  campo17= new JTextField();
  campo17.setFont(new Font("Andale Mono",1,12));
  campo17.setForeground(new Color(55,52,53));
  campo17.setBounds(310,215,50,25);
  add(campo17);
  
  Negra= new JLabel("Precio Negra");
  Negra.setFont(new Font("Andale Mono",1,11));
  Negra.setForeground(new Color(55,52,53));
  Negra.setBounds(220,250,130,25);
  add(Negra);

  campo18= new JTextField();
  campo18.setFont(new Font("Andale Mono",1,12));
  campo18.setForeground(new Color(55,52,53));
  campo18.setBounds(310,250,50,25);
  add(campo18);

  area1= new JTextArea();
  area1.setFont(new Font("Andale Mono",1,14));
  area1.setForeground(new Color(55,52,53));
  area1.setBackground(new Color(255,255,255));
  area1.setEditable(false);
  scroll1=new JScrollPane(area1);
  scroll1.setBounds(430,285,180,100);
  add(scroll1);

  menubar = new JMenuBar();
  setJMenuBar(menubar);
  menubar.setBackground(new Color(193,172,73));

  menu1= new JMenu("Opciones");
  menu1.setFont(new Font("Andale Mono",1,14));
  menu1.setForeground(new Color(55,52,53));
  menubar.add(menu1);
  
  Opciones_usuarios= new JMenu("Opciones usuarios");
  Opciones_usuarios.setFont(new Font("Andale Mono",1,14));
  Opciones_usuarios.setForeground(new Color(55,52,53));
  menu1.add(Opciones_usuarios); 
  
  condicionesv = new JMenuItem("Condiciones Venta");
  condicionesv.setFont(new Font("Andale Mono",1,14));
  condicionesv.setForeground(new Color(55,52,53));
  condicionesv.addActionListener(this);
  Opciones_usuarios.add(condicionesv); 
  
  promociones = new JMenuItem("Promociones");
  promociones.setFont(new Font("Andale Mono",1,14));
  promociones.setForeground(new Color(55,52,53));
  promociones.addActionListener(this);
  Opciones_usuarios.add(promociones);   
  
  variedades = new JMenuItem("Variedades");
  variedades.setFont(new Font("Andale Mono",1,14));
  variedades.setForeground(new Color(55,52,53));
  variedades.addActionListener(this);
  Opciones_usuarios.add(variedades); 

  calcular= new JMenu("Calcular Precio");
  calcular.setFont(new Font("Andale Mono",1,14));
  calcular.setForeground(new Color(55,52,53));
  menu1.add(calcular); 
  
  rubia= new JMenuItem("Rubia");
  rubia.setFont(new Font("Andale Mono",1,14));
  rubia.setForeground(new Color(55,52,53));
  rubia.addActionListener(this);
  calcular.add(rubia); 

  roja= new JMenuItem("Roja");
  roja.setFont(new Font("Andale Mono",1,14));
  roja.setForeground(new Color(55,52,53));
  roja.addActionListener(this);
  calcular.add(roja); 

  negra= new JMenuItem("Negra");
  negra.setFont(new Font("Andale Mono",1,14));
  negra.setForeground(new Color(55,52,53));
  negra.addActionListener(this);
  calcular.add(negra); 
  
  subir_Precio= new JMenu("Subir Precios");
  subir_Precio.setFont(new Font("Andale Mono",1,14));
  subir_Precio.setForeground(new Color(55,52,53));
  menu1.add(subir_Precio); 
  
  PMayo= new JMenuItem("Precio Mayorista");
  PMayo.setFont(new Font("Andale Mono",1,14));
  PMayo.setForeground(new Color(55,52,53));
  PMayo.addActionListener(this);
  subir_Precio.add(PMayo); 
  
  PMino= new JMenuItem("Precio Minorista");
  PMino.setFont(new Font("Andale Mono",1,14));
  PMino.setForeground(new Color(55,52,53));
  PMino.addActionListener(this);
  subir_Precio.add(PMino); 
  
  nuevo= new JMenuItem("Nuevo Cálculo");
  nuevo.setFont(new Font("Andale Mono",1,14));
  nuevo.setForeground(new Color(55,52,53));
  nuevo.addActionListener(this);
  menu1.add(nuevo);
  
  Stock= new JMenuItem("Stock");
  Stock.setFont(new Font("Andale Mono",1,14));
  Stock.setForeground(new Color(55,52,53));
  Stock.addActionListener(this);
  menu1.add(Stock);
  
  registro= new JMenuItem("Registro de usuarios");
  registro.setFont(new Font("Andale Mono",1,14));
  registro.setForeground(new Color(55,52,53));
  registro.addActionListener(this);
  menu1.add(registro);

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

float num1=0,num2=0,num3=0,num4=0,num5=0,num6,num7,num8,num9,num10,num11,num12,num13,num14,num15;

String cad1=campo1.getText();
String cad2=campo2.getText();
String cad3=campo3.getText();
String cad4=campo4.getText();
String cad5=campo5.getText();
String cad6=campo6.getText();
String cad7=campo7.getText();
String cad8=campo8.getText();
String cad9=campo9.getText();
String cad10=campo10.getText();
String cad11=campo11.getText();
String cad12=campo12.getText();
String cad13=campo13.getText();
String cad14=campo14.getText();
String cad15=campo15.getText();



 if(e.getSource() == rubia){
if(cad1.equals("") || cad8.equals("") || cad9.equals("") || cad10.equals("")|| cad11.equals("")|| cad12.equals("")|| cad13.equals("")|| cad14.equals("")|| cad15.equals("")){

 JOptionPane.showMessageDialog(null,"Debes llenar todos los campos");

 }
  else{
  
  num1= Float.parseFloat(cad1);
  num8= Float.parseFloat(cad8);
  num9= Float.parseFloat(cad9);
  num10= Float.parseFloat(cad10);
  num11= Float.parseFloat(cad11);
  num12= Float.parseFloat(cad12);
  num13= Float.parseFloat(cad13);
  num14= Float.parseFloat(cad14);
  num15= Float.parseFloat(cad15);
    
  Float mbasepre= (Float)(num1*(Float)(20f/70f))/25;
  Float lupupre= (num9*(Float)(95f/70f))/100;
  Float etiqpre= num10/100; 
  Float tapaspre= num11/100;
  Float avepre= num8*(float)(1.5f/70f);

  blonde=mbasepre+avepre+lupupre+etiqpre+tapaspre+num12/num15+num13/num15+num14/num15;
  area1.setText("Rubia: "+blonde+"\n");
  area_texto+="Rubia: "+blonde+"\n";

 } 
}

 if(e.getSource() == roja){
if(cad1.equals("") || cad4.equals("") || cad9.equals("") || cad10.equals("")|| cad11.equals("")|| cad12.equals("")|| cad13.equals("")|| cad14.equals("")|| cad15.equals("")){

 JOptionPane.showMessageDialog(null,"Debes llenar todos los campos");

 }
  else{
  
  num1= Float.parseFloat(cad1);
  num4= Float.parseFloat(cad4);  
  num9= Float.parseFloat(cad9);
  num10= Float.parseFloat(cad10);
  num11= Float.parseFloat(cad11);
  num12= Float.parseFloat(cad12);
  num13= Float.parseFloat(cad13);
  num14= Float.parseFloat(cad14);
  num15= Float.parseFloat(cad15);
    
  Float mbasepre= (Float)(num1*(Float)(19.6f/70f))/25;
  Float lupupre= (num9*(Float)(95f/70f))/100;
  Float etiqpre= num10/100; 
  Float tapaspre= num11/100;
  Float caramelo120= num4*(float)(1.4f/70f);

  red=mbasepre+caramelo120+lupupre+etiqpre+tapaspre+num12/num15+num13/num15+num14/num15;
  area1.setText(area_texto+"Roja: "+red+"\n");
  area_texto+= "roja: "+red+"\n";
  
 } 
}

 if(e.getSource() == negra){
if(cad1.equals("") || cad4.equals("") || cad5.equals("") || cad6.equals("") || cad7.equals("") || cad9.equals("") || cad10.equals("")|| cad11.equals("")|| cad12.equals("")|| cad13.equals("")|| cad14.equals("")|| cad15.equals("")){

 JOptionPane.showMessageDialog(null,"Debes llenar todos los campos");

 }
  else{
  
  num1= Float.parseFloat(cad1);
  num4= Float.parseFloat(cad4);
  num5= Float.parseFloat(cad5);
  num6= Float.parseFloat(cad6);
  num7= Float.parseFloat(cad7);
  num9= Float.parseFloat(cad9);
  num10= Float.parseFloat(cad10);
  num11= Float.parseFloat(cad11);
  num12= Float.parseFloat(cad12);
  num13= Float.parseFloat(cad13);
  num14= Float.parseFloat(cad14);
  num15= Float.parseFloat(cad15);
    
  Float mbasepre= (Float)(num1*(Float)(20f/70f))/25;  
  Float lupupre= (num9*(Float)(95f/70f))/100;
  Float etiqpre= num10/100; 
  Float tapaspre= num11/100;
  Float caramelo120= num4*(float)(1.2f/70f);
  Float chocolate= num5*(float)(1.2f/70f);
  Float tostada= num6*(float)(1.2f/70f);
  Float cebadatos= num7*(float)(1.2f/70f);

  black=mbasepre+caramelo120+chocolate+tostada+cebadatos+lupupre+etiqpre+tapaspre+num12/num15+num13/num15+num14/num15;
  area1.setText(area_texto+"Negra: "+black);
  
 } 
}

 if(e.getSource() == nuevo){
area1.setText("");
campo1.setText("");
campo2.setText("");
campo3.setText("");
campo4.setText("");
campo5.setText("");
campo6.setText("");
campo7.setText("");
campo8.setText("");
campo9.setText("");
campo10.setText("");
campo11.setText("");
campo12.setText("");
campo13.setText("");
campo14.setText("");
campo15.setText("");
area_texto="";
}

 if(e.getSource() == registro){
  Registro registro= new Registro();
  registro.setBounds(0,0,450,640);
  registro.setVisible(true);
  registro.setLocationRelativeTo(null);
  registro.setResizable(false);
  this.setVisible(false);
 }

 if(e.getSource() == volver){

  Bienvenida bien = new Bienvenida();
  bien.setBounds(0, 0, 350, 460);
  bien.setVisible(true);
  bien.setLocationRelativeTo(null);
  bien.setResizable(false);
  this.setVisible(false);
 }

 if(e.getSource() == creador){
 JOptionPane.showMessageDialog(null,"Creado por César Rosa.");
 }
 
 if(e.getSource()== condicionesv){
  CondicionesVenta opciones = new CondicionesVenta();
  opciones.setBounds(0,0,640,530);
  opciones.setVisible(true);
  opciones.setLocationRelativeTo(null);
  opciones.setResizable(false); 
  this.setVisible(false);
 }
 if(e.getSource()== promociones){
  Promociones promo = new Promociones();
  promo.setBounds(0,0,640,530);
  promo.setVisible(true);
  promo.setLocationRelativeTo(null);
  promo.setResizable(false); 
  this.setVisible(false);
 
 }
 
  if(e.getSource()== variedades){
  Variedades var = new Variedades();
  var.setBounds(0,0,640,530);
  var.setVisible(true);
  var.setLocationRelativeTo(null);
  var.setResizable(false); 
  this.setVisible(false); 
 }
 
  if(e.getSource()== PMayo){
      if(campo16.getText().equals("") || campo17.getText().equals("") || campo18.getText().equals("") ){
      JOptionPane.showMessageDialog(null, "Ponga el precio de las 3 variedades");
      }else{
      try {
        Connection cn = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/onsMAuvdE5","onsMAuvdE5", "EWpgsJuVTJ");
        PreparedStatement pst= cn.prepareStatement("update estilos set rubiamay=?,rojamay=?, negramay=? where ID = 1");
        
        pst.setFloat(1, Float.parseFloat(campo16.getText()));
        pst.setFloat(2, Float.parseFloat(campo17.getText()));
        pst.setFloat(3, Float.parseFloat(campo18.getText()));
        int rs= pst.executeUpdate();
        if (rs > 0) {
           JOptionPane.showMessageDialog(null, "Registro Exitoso"); 
        }
        
    } catch (SQLException evt) {
        JOptionPane.showMessageDialog(null, "!Error: "+evt);
    }
      campo16.setText("");
      campo17.setText("");
      campo18.setText("");
  }
  }
  if(e.getSource()== PMino){
       if(campo16.getText().equals("") || campo17.getText().equals("") || campo18.getText().equals("") ){
      JOptionPane.showMessageDialog(null, "Ponga el precio de las 3 variedades");
      }else{
      try {
        Connection cn = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/onsMAuvdE5","onsMAuvdE5", "EWpgsJuVTJ");
        PreparedStatement pst= cn.prepareStatement("update estilos set rubiamin=?,rojamin=?, negramin=? where ID = 1");
        
        pst.setFloat(1, Float.parseFloat(campo16.getText()));
        pst.setFloat(2, Float.parseFloat(campo17.getText()));
        pst.setFloat(3, Float.parseFloat(campo18.getText()));
        int rs= pst.executeUpdate();
        if (rs > 0) {
           JOptionPane.showMessageDialog(null, "Registro Exitoso"); 
        }
        
    } catch (SQLException evt) {
        JOptionPane.showMessageDialog(null, "!Error: "+evt);
    }
      campo16.setText("");
      campo17.setText("");
      campo18.setText("");
  }
  }
  if(e.getSource()== Stock){
        Stock stock = new Stock();
        stock.setBounds(0, 0, 350, 430);
        stock.setVisible(true);
        stock.setLocationRelativeTo(null);
        stock.setResizable(false);
        this.setVisible(true);
  }
  
}

 public static void main (String args[]){
  Staff staff = new Staff();
  staff.setBounds(0,0,640,530);
  staff.setVisible(true);
  staff.setLocationRelativeTo(null);
  staff.setResizable(false); 

 }
}


