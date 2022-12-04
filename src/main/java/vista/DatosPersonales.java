/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ochoa
 */
public class DatosPersonales extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldsList;

    public DatosPersonales(String title) throws HeadlessException {
        super(title);
        this.setSize(500, 500);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.iniciarPanel();
        this.iniciarLabel();
        this.iniciarTexTField();

        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarPanel() {

        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setBackground(Color.WHITE);
        this.jPanelList.get(0).setLayout(new GridLayout(10, 1));
        this.jPanelList.get(0).setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Personal"));

        this.jPanelList.get(1).setBackground(Color.DARK_GRAY);
        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(3).setBackground(Color.WHITE);
        this.jPanelList.get(4).setBackground(Color.WHITE);
        this.jPanelList.get(5).setBackground(Color.WHITE);
        this.jPanelList.get(6).setBackground(Color.WHITE);
        this.jPanelList.get(7).setBackground(Color.WHITE);
        this.jPanelList.get(8).setBackground(Color.WHITE);
        this.jPanelList.get(9).setBackground(Color.WHITE);
        this.jPanelList.get(10).setBackground(Color.WHITE);

        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(0).add(this.jPanelList.get(7));
        this.jPanelList.get(0).add(this.jPanelList.get(8));
        this.jPanelList.get(0).add(this.jPanelList.get(9));
        this.jPanelList.get(0).add(this.jPanelList.get(10));

    }

    public void iniciarLabel() {

        var font = new Font("Verdana", Font.BOLD, 20);
        var font1 = new Font("Verdana", Font.ITALIC, 12);
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel(" Datos Personales "));
        this.jLabelList.add(new JLabel("Apellidos:"));
        this.jLabelList.add(new JLabel("Ochoa Mendez"));
        this.jLabelList.add(new JLabel("Nombres:"));
        this.jLabelList.add(new JLabel("Andres Esteban"));
        this.jLabelList.add(new JLabel("Nacionalidad:"));
        this.jLabelList.add(new JLabel("Ecuador"));
        this.jLabelList.add(new JLabel("Genero:"));
        this.jLabelList.add(new JLabel("Masculino"));
        this.jLabelList.add(new JLabel("Correo Electronico Personal:"));
        this.jLabelList.add(new JLabel("ochoajrandres@gmail.com"));
        this.jLabelList.add(new JLabel("Fecha de Nacimiento:"));
        this.jLabelList.add(new JLabel("28-08-2002"));
        this.jLabelList.add(new JLabel("Telefono Domicilio:"));
        this.jLabelList.add(new JLabel("072241640"));
        this.jLabelList.add(new JLabel("Telefono De Celular:"));
        this.jLabelList.add(new JLabel("0998816281"));
        this.jLabelList.add(new JLabel("Whatsapp:"));

        this.jLabelList.get(0).setForeground(Color.WHITE);
        this.jLabelList.get(0).setFont(font);
        this.jLabelList.get(2).setFont(font1);
        this.jLabelList.get(4).setFont(font1);
        this.jLabelList.get(6).setFont(font1);
        this.jLabelList.get(8).setFont(font1);
        this.jLabelList.get(10).setFont(font1);
        this.jLabelList.get(12).setFont(font1);
        this.jLabelList.get(14).setFont(font1);
        this.jLabelList.get(16).setFont(font1);
       

        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(3).add(this.jLabelList.get(4));
        this.jPanelList.get(4).add(this.jLabelList.get(5));
        this.jPanelList.get(4).add(this.jLabelList.get(6));
        this.jPanelList.get(5).add(this.jLabelList.get(7));
        this.jPanelList.get(5).add(this.jLabelList.get(8));
        this.jPanelList.get(6).add(this.jLabelList.get(9));
        this.jPanelList.get(6).add(this.jLabelList.get(10));
        this.jPanelList.get(7).add(this.jLabelList.get(11));
        this.jPanelList.get(7).add(this.jLabelList.get(12));
        this.jPanelList.get(8).add(this.jLabelList.get(13));
        this.jPanelList.get(8).add(this.jLabelList.get(14));
        this.jPanelList.get(9).add(this.jLabelList.get(15));
        this.jPanelList.get(9).add(this.jLabelList.get(16));
        this.jPanelList.get(10).add(this.jLabelList.get(17));
    }

    public void iniciarTexTField() {

        var font1 = new Font("Verdana", Font.ITALIC, 12);
        
        this.jTextFieldsList = new ArrayList<>();

        this.jTextFieldsList.add(new JTextField(10));
        this.jTextFieldsList.get(0).setFont(font1);
       
        this.jPanelList.get(10).add(this.jTextFieldsList.get(0));

    }

}
