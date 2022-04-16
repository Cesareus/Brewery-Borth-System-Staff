package clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Stock extends JFrame implements ActionListener {

    JMenuBar menubar;
    JMenu menu1, menu2, Subir_Batch, PonerEnCero, Restar, MySQL_ext;
    JMenuItem Stock, creador, Rubia, Roja, Negra, blonde, red, black, Rubiaresta, Rojaresta, Negraresta, subir, obtener;
    private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9;
    private JTextField campo1, campo2, campo3, campo4;
    int totalcajones;

    public Stock() {
        setLayout(null);

        getContentPane().setBackground(new Color(193, 172, 73));

        setIconImage(new ImageIcon(getClass().getResource("/Icono.png")).getImage());
        setTitle("Stock");

        ImageIcon imagen = new ImageIcon("imagenes/logo-borthMm.png");

        label1 = new JLabel(imagen);
        label1.setBounds(60, 15, 200, 80);
        add(label1);

        menubar = new JMenuBar();
        setJMenuBar(menubar);
        menubar.setBackground(new Color(193, 172, 73));

        menu1 = new JMenu("Opciones");
        menu1.setFont(new Font("Andale Mono", 1, 14));
        menu1.setForeground(new Color(55, 52, 53));
        menubar.add(menu1);

        Stock = new JMenuItem("Consultar Stock");
        Stock.setFont(new Font("Andale Mono", 1, 14));
        Stock.setForeground(new Color(55, 52, 53));
        Stock.addActionListener(this);
        menu1.add(Stock);

        Subir_Batch = new JMenu("Subir Batch");
        Subir_Batch.setFont(new Font("Andale Mono", 1, 14));
        Subir_Batch.setForeground(new Color(55, 52, 53));
        Subir_Batch.addActionListener(this);
        menu1.add(Subir_Batch);

        Rubia = new JMenuItem("Rubia");
        Rubia.setFont(new Font("Andale Mono", 1, 14));
        Rubia.setForeground(new Color(55, 52, 53));
        Rubia.addActionListener(this);
        Subir_Batch.add(Rubia);

        Roja = new JMenuItem("Roja");
        Roja.setFont(new Font("Andale Mono", 1, 14));
        Roja.setForeground(new Color(55, 52, 53));
        Roja.addActionListener(this);
        Subir_Batch.add(Roja);

        Negra = new JMenuItem("Negra");
        Negra.setFont(new Font("Andale Mono", 1, 14));
        Negra.setForeground(new Color(55, 52, 53));
        Negra.addActionListener(this);
        Subir_Batch.add(Negra);

        Restar = new JMenu("Restar Litros");
        Restar.setFont(new Font("Andale Mono", 1, 14));
        Restar.setForeground(new Color(55, 52, 53));
        Restar.addActionListener(this);
        menu1.add(Restar);

        Rubiaresta = new JMenuItem("Rubia");
        Rubiaresta.setFont(new Font("Andale Mono", 1, 14));
        Rubiaresta.setForeground(new Color(55, 52, 53));
        Rubiaresta.addActionListener(this);
        Restar.add(Rubiaresta);

        Rojaresta = new JMenuItem("Roja");
        Rojaresta.setFont(new Font("Andale Mono", 1, 14));
        Rojaresta.setForeground(new Color(55, 52, 53));
        Rojaresta.addActionListener(this);
        Restar.add(Rojaresta);

        Negraresta = new JMenuItem("Negra");
        Negraresta.setFont(new Font("Andale Mono", 1, 14));
        Negraresta.setForeground(new Color(55, 52, 53));
        Negraresta.addActionListener(this);
        Restar.add(Negraresta);

        PonerEnCero = new JMenu("Poner en 0");
        PonerEnCero.setFont(new Font("Andale Mono", 1, 14));
        PonerEnCero.setForeground(new Color(55, 52, 53));
        PonerEnCero.addActionListener(this);
        menu1.add(PonerEnCero);

        blonde = new JMenuItem("Rubia");
        blonde.setFont(new Font("Andale Mono", 1, 14));
        blonde.setForeground(new Color(55, 52, 53));
        blonde.addActionListener(this);
        PonerEnCero.add(blonde);

        red = new JMenuItem("Roja");
        red.setFont(new Font("Andale Mono", 1, 14));
        red.setForeground(new Color(55, 52, 53));
        red.addActionListener(this);
        PonerEnCero.add(red);

        black = new JMenuItem("Negra");
        black.setFont(new Font("Andale Mono", 1, 14));
        black.setForeground(new Color(55, 52, 53));
        black.addActionListener(this);
        PonerEnCero.add(black);

        MySQL_ext = new JMenu("MySQL externa");
        MySQL_ext.setFont(new Font("Andale Mono", 1, 14));
        MySQL_ext.setForeground(new Color(55, 52, 53));
        MySQL_ext.addActionListener(this);
        menu1.add(MySQL_ext);
        
        subir = new JMenuItem("Subir a MySQL externa");
        subir.setFont(new Font("Andale Mono", 1, 14));
        subir.setForeground(new Color(55, 52, 53));
        subir.addActionListener(this);
        MySQL_ext.add(subir);

        obtener = new JMenuItem("Obtener y guardar de MySQL externa");
        obtener.setFont(new Font("Andale Mono", 1, 14));
        obtener.setForeground(new Color(55, 52, 53));
        obtener.addActionListener(this);
        MySQL_ext.add(obtener);

        menu2 = new JMenu("Acerca de");
        menu2.setFont(new Font("Andale Mono", 1, 14));
        menu2.setForeground(new Color(55, 52, 53));
        menubar.add(menu2);

        creador = new JMenuItem("El creador");
        creador.setFont(new Font("Andale Mono", 1, 14));
        creador.setForeground(new Color(55, 52, 53));
        creador.addActionListener(this);
        menu2.add(creador);

        label2 = new JLabel("Stock");
        label2.setBounds(45, 100, 300, 30);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(new Color(55, 52, 53));
        add(label2);

        label4 = new JLabel("Cerveza Rubia:");
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(new Color(55, 52, 53));
        label4.setBounds(45, 140, 100, 25);
        add(label4);

        campo1 = new JTextField();
        campo1.setFont(new Font("Andale Mono", 1, 14));
        campo1.setForeground(new Color(55, 52, 53));
        campo1.setBackground(new Color(255, 255, 255));
        campo1.setBounds(165, 140, 50, 25);
        add(campo1);

        label5 = new JLabel("Cerveza Roja:");
        label5.setFont(new Font("Andale Mono", 1, 12));
        label5.setForeground(new Color(55, 52, 53));
        label5.setBounds(45, 175, 100, 25);
        add(label5);

        campo2 = new JTextField();
        campo2.setFont(new Font("Andale Mono", 1, 14));
        campo2.setForeground(new Color(55, 52, 53));
        campo2.setBackground(new Color(255, 255, 255));
        campo2.setBounds(165, 175, 50, 25);
        add(campo2);

        label6 = new JLabel("Cerveza Negra:");
        label6.setFont(new Font("Andale Mono", 1, 12));
        label6.setForeground(new Color(55, 52, 53));
        label6.setBounds(45, 210, 100, 25);
        add(label6);

        campo3 = new JTextField();
        campo3.setFont(new Font("Andale Mono", 1, 14));
        campo3.setForeground(new Color(55, 52, 53));
        campo3.setBackground(new Color(255, 255, 255));
        campo3.setBounds(165, 210, 50, 25);
        add(campo3);

        label7 = new JLabel("Subir litros Batch");
        label7.setBounds(45, 245, 300, 30);
        label7.setFont(new Font("Andale Mono", 3, 18));
        label7.setForeground(new Color(55, 52, 53));
        add(label7);

        label9 = new JLabel("litros");
        label9.setBounds(45, 285, 300, 25);
        label9.setFont(new Font("Andale Mono", 1, 12));
        label9.setForeground(new Color(55, 52, 53));
        add(label9);

        campo4 = new JTextField();
        campo4.setFont(new Font("Andale Mono", 1, 14));
        campo4.setForeground(new Color(55, 52, 53));
        campo4.setBackground(new Color(255, 255, 255));
        campo4.setBounds(165, 285, 50, 25);
        add(campo4);

        label3 = new JLabel("@Borth Cerveza Artesanal-Valle de Paravachasca");
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(55, 52, 53));
        label3.setBounds(20, 320, 300, 30);
        add(label3);

        label8 = new JLabel("cel:xxxxxx");
        label8.setFont(new Font("Andale Mono", 1, 12));
        label8.setForeground(new Color(55, 52, 53));
        label8.setBounds(85, 335, 300, 30);
        add(label8);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Stock) {
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/usuarios.borth", "root", "");
                PreparedStatement pst = cn.prepareStatement("select * from stock where ID = 1");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    campo1.setText(String.valueOf(rs.getInt(1)));
                    campo2.setText(String.valueOf(rs.getInt(2)));
                    campo3.setText(String.valueOf(rs.getInt(3)));

                }

            } catch (SQLException evt) {
            }
        }

        if (e.getSource() == Rubia) {
            int Lrubia = 0;

            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/usuarios.borth", "root", "");
                PreparedStatement pst = cn.prepareStatement("select * from stock where ID = 1");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    Lrubia = rs.getInt(1);
                }

            } catch (SQLException evt) {
            }

            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/usuarios.borth", "root", "");
                PreparedStatement pst = cn.prepareStatement("update stock set Rubia=? where ID = 1");

                Lrubia += Integer.parseInt(campo4.getText().trim());

                pst.setInt(1, Lrubia);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Modificación exitosa");

                campo4.setText("");

            } catch (SQLException evt) {
            }
        }

        if (e.getSource() == Roja) {
            int Lroja = 0;

            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/usuarios.borth", "root", "");
                PreparedStatement pst = cn.prepareStatement("select * from stock where ID = 1");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    Lroja = rs.getInt(2);
                }

            } catch (SQLException evt) {
            }

            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/usuarios.borth", "root", "");
                PreparedStatement pst = cn.prepareStatement("update stock set Roja=? where ID = 1");

                Lroja += Integer.parseInt(campo4.getText().trim());

                pst.setInt(1, Lroja);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Modificación exitosa");

                campo4.setText("");

            } catch (SQLException evt) {
            }
        }

        if (e.getSource() == Negra) {
            int Lnegra = 0;

            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/usuarios.borth", "root", "");
                PreparedStatement pst = cn.prepareStatement("select * from stock where ID = 1");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    Lnegra = rs.getInt(3);
                }

            } catch (SQLException evt) {
            }

            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/usuarios.borth", "root", "");
                PreparedStatement pst = cn.prepareStatement("update stock set Negra=? where ID = 1");

                Lnegra += Integer.parseInt(campo4.getText().trim());

                pst.setInt(1, Lnegra);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Modificación exitosa");

                campo4.setText("");

            } catch (SQLException evt) {
            }
        }

        if (e.getSource() == Rubiaresta) {
            int Lrubia = 0;

            if (campo1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese el valor en litros a restar en el campo Cerveza Rubia");
            } else {
                try {
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/usuarios.borth", "root", "");
                    PreparedStatement pst = cn.prepareStatement("select * from stock where ID = 1");

                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        Lrubia = rs.getInt(1);
                    }

                } catch (SQLException evt) {
                }
                try {
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/usuarios.borth", "root", "");
                    PreparedStatement pst = cn.prepareStatement("update stock set Rubia=? where ID = 1");

                    Lrubia -= Integer.parseInt(campo1.getText().trim());

                    pst.setInt(1, Lrubia);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Modificación exitosa");

                    campo1.setText("");
                    campo2.setText("");
                    campo3.setText("");
                    campo4.setText("");

                } catch (SQLException evt) {
                }
            }
        }

        if (e.getSource() == Rojaresta) {
            int Lroja = 0;

            if (campo2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese el valor en litros a restar en el campo Cerveza Roja");
            } else {
                try {
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/usuarios.borth", "root", "");
                    PreparedStatement pst = cn.prepareStatement("select * from stock where ID = 1");

                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        Lroja = rs.getInt(2);
                    }

                } catch (SQLException evt) {
                }
                try {
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/usuarios.borth", "root", "");
                    PreparedStatement pst = cn.prepareStatement("update stock set Roja=? where ID = 1");

                    Lroja -= Integer.parseInt(campo2.getText().trim());

                    pst.setInt(1, Lroja);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Modificación exitosa");

                    campo1.setText("");
                    campo2.setText("");
                    campo3.setText("");
                    campo4.setText("");

                } catch (SQLException evt) {
                }
            }
        }

        if (e.getSource() == Negraresta) {
            int Lnegra = 0;

            if (campo3.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese el valor en litros a restar en el campo Cerveza Negra");
            } else {
                try {
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/usuarios.borth", "root", "");
                    PreparedStatement pst = cn.prepareStatement("select * from stock where ID = 1");

                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        Lnegra = rs.getInt(3);
                    }

                } catch (SQLException evt) {
                }
                try {
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/usuarios.borth", "root", "");
                    PreparedStatement pst = cn.prepareStatement("update stock set Negra=? where ID = 1");

                    Lnegra -= Integer.parseInt(campo3.getText().trim());

                    pst.setInt(1, Lnegra);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Modificación exitosa");

                    campo1.setText("");
                    campo2.setText("");
                    campo3.setText("");
                    campo4.setText("");

                } catch (SQLException evt) {
                }
            }
        }

        if (e.getSource() == blonde) {
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/usuarios.borth", "root", "");
                PreparedStatement pst = cn.prepareStatement("update stock set Rubia=? where ID = 1");

                pst.setInt(1, 0);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Modificación exitosa");

            } catch (SQLException evt) {
            }
        }

        if (e.getSource() == red) {
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/usuarios.borth", "root", "");
                PreparedStatement pst = cn.prepareStatement("update stock set Roja=? where ID = 1");

                pst.setInt(1, 0);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Modificación exitosa");

            } catch (SQLException evt) {
            }
        }

        if (e.getSource() == black) {
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/usuarios.borth", "root", "");
                PreparedStatement pst = cn.prepareStatement("update stock set Negra=? where ID = 1");

                pst.setInt(1, 0);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Modificación exitosa");

            } catch (SQLException evt) {
            }
        }

        if (e.getSource() == creador) {

            JOptionPane.showMessageDialog(null, "Creado por César Rosa.");
        }

        if (e.getSource() == subir) {
            int localrubia = 0, localroja = 0, localnegra = 0;
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/usuarios.borth", "root", "");
                PreparedStatement pst = cn.prepareStatement("select * from stock where ID = 1");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    localrubia = rs.getInt(1);
                    localroja = rs.getInt(2);
                    localnegra = rs.getInt(3);
                }

            } catch (SQLException evt) {
                System.out.println("Opps Error:");
                evt.printStackTrace();
            }
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/onsMAuvdE5", "onsMAuvdE5", "EWpgsJuVTJ");
                PreparedStatement pst = cn.prepareStatement("update stock set Rubia=?,Roja=?,Negra=? where ID = 1");

                pst.setInt(1, localrubia);
                pst.setInt(2, localroja);
                pst.setInt(3, localnegra);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Modificación exitosa");

            } catch (SQLException evt) {
                System.out.println("Opps Error:");
                evt.printStackTrace();
            }
        }

        if (e.getSource() == obtener) {
            int localrubia = 0, localroja = 0, localnegra = 0;
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/onsMAuvdE5", "onsMAuvdE5", "EWpgsJuVTJ");
                PreparedStatement pst = cn.prepareStatement("select * from stock where ID = 1");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    localrubia = rs.getInt(1);
                    localroja = rs.getInt(2);
                    localnegra = rs.getInt(3);

                }

            } catch (SQLException evt) {
            }
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/usuarios.borth", "root", "");
                PreparedStatement pst = cn.prepareStatement("update stock set Rubia=?,Roja=?,Negra=? where ID = 1");

                pst.setInt(1, localrubia);
                pst.setInt(2, localroja);
                pst.setInt(3, localnegra);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Modificación exitosa");

            } catch (SQLException evt) {
            }
        }
    }

    public static void main(String args[]) {

        Stock stock = new Stock();
        stock.setBounds(0, 0, 350, 430);
        stock.setVisible(true);
        stock.setLocationRelativeTo(null);
        stock.setResizable(false);
    }
}
