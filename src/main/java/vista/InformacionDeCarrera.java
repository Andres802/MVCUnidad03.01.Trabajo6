/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author ochoa
 */
public class InformacionDeCarrera extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JButton> jButtonList;
    public List<JComboBox> jComboBoxList;
    public LocalDate fecha;

    public InformacionDeCarrera(String title) throws HeadlessException {
        super(title);
        this.setSize(500, 500);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.iniciarPanel();
        this.iniciarLabel();
        this.iniciarComboBox();
        this.iniciarButton();

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

        this.jPanelList.get(0).setBackground(Color.WHITE);
        this.jPanelList.get(0).setLayout(new GridLayout(8, 1));

        this.jPanelList.get(1).setBackground(Color.DARK_GRAY);
        this.jPanelList.get(1).setBorder(new LineBorder(Color.WHITE));

        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(3).setBackground(Color.WHITE);
        this.jPanelList.get(4).setBackground(Color.WHITE);
        this.jPanelList.get(5).setBackground(Color.WHITE);
        this.jPanelList.get(6).setBackground(Color.WHITE);
        this.jPanelList.get(7).setBackground(Color.WHITE);
        this.jPanelList.get(8).setBackground(Color.WHITE);

        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(0).add(this.jPanelList.get(7));
        this.jPanelList.get(0).add(this.jPanelList.get(8));

    }

    public void iniciarLabel() {

        int yearActual = LocalDate.now().getYear();
        int mesActual = LocalDate.now().getMonthValue();
        int diaActual = LocalDate.now().getDayOfMonth();

        var font = new Font("Verdana", Font.BOLD, 20);
        var font1 = new Font("Verdana", Font.ITALIC, 12);

        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Informacion de Carrera"));
        this.jLabelList.add(new JLabel("Periodo Academico:"));
        this.jLabelList.add(new JLabel("2022-2022"));
        this.jLabelList.add(new JLabel("Carrera:*"));
        this.jLabelList.add(new JLabel("Modalidad:*"));
        this.jLabelList.add(new JLabel("Sede:*"));
        this.jLabelList.add(new JLabel("Jornada:*"));
        this.jLabelList.add(new JLabel("Fecha de registro:"));
        this.jLabelList.add(new JLabel(diaActual + "/" + mesActual + "/" + yearActual));

        this.jLabelList.get(0).setForeground(Color.WHITE);
        this.jLabelList.get(0).setFont(font);
        this.jLabelList.get(2).setFont(font1);
        this.jLabelList.get(8).setFont(font1);

        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jLabelList.get(5));
        this.jPanelList.get(6).add(this.jLabelList.get(6));
        this.jPanelList.get(7).add(this.jLabelList.get(7));
        this.jPanelList.get(7).add(this.jLabelList.get(8));

    }

    public void iniciarComboBox() {

        var font1 = new Font("Verdana", Font.ITALIC, 12);

        this.jComboBoxList = new ArrayList<>();
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        //-------------------------Carrera-------------------//
        this.jComboBoxList.get(0).setFont(font1);
        this.jComboBoxList.get(0).setBackground(Color.WHITE);
        this.jComboBoxList.get(0).addItem("Arquitectura");
        this.jComboBoxList.get(0).addItem("Electronica y Automatizacion");
        this.jComboBoxList.get(0).addItem("Ingenieria Electrica");
        this.jComboBoxList.get(0).addItem("Ingenieria Industrial");

        //-----------------------Modalidad -----------------//
        this.jComboBoxList.get(1).setFont(font1);
        this.jComboBoxList.get(1).setBackground(Color.WHITE);
        this.jComboBoxList.get(1).addItem("Presencial");
        this.jComboBoxList.get(1).addItem("Virtual");

        //---------------------------------------------------//
        this.jComboBoxList.get(2).setFont(font1);
        this.jComboBoxList.get(2).setBackground(Color.WHITE);
        this.jComboBoxList.get(2).addItem("Matriz Cuenca");
        this.jComboBoxList.get(2).addItem("Guayaquil");
        this.jComboBoxList.get(2).addItem("Quito");

        //--------------------------------------------------//
        this.jComboBoxList.get(3).setFont(font1);
        this.jComboBoxList.get(3).setBackground(Color.WHITE);
        this.jComboBoxList.get(3).addItem("Selecione Una Opcion");
        this.jComboBoxList.get(3).addItem("Matutina");
        this.jComboBoxList.get(3).addItem("Diurna");

        this.jPanelList.get(3).add(this.jComboBoxList.get(0));
        this.jPanelList.get(4).add(this.jComboBoxList.get(1));
        this.jPanelList.get(5).add(this.jComboBoxList.get(2));
        this.jPanelList.get(6).add(this.jComboBoxList.get(3));
    }
    
    public void iniciarButton(){
        this.jButtonList = new ArrayList<>();
        
        this.jButtonList.add(new JButton("Siguiente"));
        
        this.jPanelList.get(8).add(this.jButtonList.get(0));
        
        
    }

}
