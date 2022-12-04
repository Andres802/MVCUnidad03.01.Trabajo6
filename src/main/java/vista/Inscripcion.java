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
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author ochoa
 */
public class Inscripcion extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JButton> jButtonList;
    public List<JTextField> jTextFieldsList;
    public List<JComboBox> jComboBoxList;

    public Inscripcion(String title) throws HeadlessException {
        super(title);
        this.setSize(500, 300);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.iniciarPanel();
        this.iniciarLabel();
        this.iniciarTexTField();
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

        this.jPanelList.get(0).setBackground(Color.WHITE);
        this.jPanelList.get(0).setLayout(new GridLayout(6, 1));
        

        this.jPanelList.get(1).setBackground(Color.DARK_GRAY);
        this.jPanelList.get(1).setBorder(new LineBorder(Color.WHITE));
        this.jPanelList.get(0).setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Inscripciones"));
        this.jPanelList.get(2).setBackground(Color.white);

        this.jPanelList.get(2).setOpaque(true);

        this.jPanelList.get(3).setBackground(Color.white);
        this.jPanelList.get(4).setBackground(Color.white);
        this.jPanelList.get(5).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));

    }

    public void iniciarLabel() {

        var font = new Font("Verdana", Font.BOLD, 20);
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel(" INSCRIBETE "));
        this.jLabelList.add(new JLabel("Seleciona una \nSede : * "));
        this.jLabelList.add(new JLabel("Tipo Documento"));
        this.jLabelList.add(new JLabel("Ingrese su identificacion: * "));
        this.jLabelList.add(new JLabel());

        this.jLabelList.get(0).setForeground(Color.WHITE);
        this.jLabelList.get(0).setFont(font);
        

        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(3).add(this.jLabelList.get(2));
        this.jPanelList.get(4).add(this.jLabelList.get(3));

    }

    public void iniciarTexTField() {
        var font1 = new Font("Verdana", Font.ITALIC, 12);
        
        this.jTextFieldsList = new ArrayList<>();

        this.jTextFieldsList.add(new JTextField(10));
        this.jTextFieldsList.get(0).setFont(font1);
        
        this.jPanelList.get(4).add(this.jTextFieldsList.get(0));

    }

    public void iniciarComboBox() {
        var font1 = new Font("Verdana", Font.ITALIC, 12);
        
        this.jComboBoxList = new ArrayList<>();

        var listaPaises = new String[3];
        listaPaises[0] = "El Vecino";
        listaPaises[1] = "Quito";
        listaPaises[2] = "Guayaquil";

        var listaPaises2 = new String[2];
        listaPaises2[0] = "Cedula";
        listaPaises2[1] = "RUC";

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaPaises)));
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaPaises2)));

        this.jComboBoxList.get(0).setFont(font1);
        this.jComboBoxList.get(0).setBackground(Color.WHITE);
        
        this.jComboBoxList.get(1).setFont(font1);
        this.jComboBoxList.get(1).setBackground(Color.white);
        
        this.jPanelList.get(2).add(this.jComboBoxList.get(0));
        this.jPanelList.get(3).add(this.jComboBoxList.get(1));

    }

    public void iniciarButton() {
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton());

        this.jButtonList.get(0).setText("Ingresar");

        this.jPanelList.get(5).add(this.jButtonList.get(0));
    }

}
