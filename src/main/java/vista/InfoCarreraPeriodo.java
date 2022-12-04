/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author ochoa
 */
public class InfoCarreraPeriodo extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JComboBox> jComboBoxList;

    public InfoCarreraPeriodo(String title) throws HeadlessException {
        super(title);
        this.setSize(700, 400);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        this.iniciarPanel();
        this.iniciarLable();
        this.inciarComboBox();
        
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

        this.jPanelList.get(0).setLayout(new FlowLayout());
        this.jPanelList.get(0).setBackground(Color.WHITE);
        
        this.jPanelList.get(1).setBackground(Color.WHITE);
        this.jPanelList.get(1).setBorder(new LineBorder(Color.LIGHT_GRAY));
        
        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(2).setBorder(new LineBorder(Color.LIGHT_GRAY));
        
        this.jPanelList.get(3).setBackground(Color.WHITE);
        this.jPanelList.get(3).setBorder(new LineBorder(Color.LIGHT_GRAY));
        
        this.jPanelList.get(4).setBackground(Color.WHITE);
        this.jPanelList.get(4).setBorder(new LineBorder(Color.LIGHT_GRAY));
        
        this.jPanelList.get(5).setBackground(Color.WHITE);
        this.jPanelList.get(5).setBorder(new LineBorder(Color.LIGHT_GRAY));
        
        this.jPanelList.get(6).setBackground(Color.WHITE);
        this.jPanelList.get(6).setBorder(new LineBorder(Color.LIGHT_GRAY));
        
        this.jPanelList.get(7).setBackground(Color.WHITE);
        this.jPanelList.get(7).setBorder(new LineBorder(Color.LIGHT_GRAY));

        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(0).add(this.jPanelList.get(7));
    }

    public void iniciarLable() {
        
        var font1 = new Font("Verdana", Font.ITALIC, 12);
        
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Sede:"));
        this.jLabelList.add(new JLabel("Campus/ Extension:"));
        this.jLabelList.add(new JLabel("Carrera:"));
        this.jLabelList.add(new JLabel("Codigo del Proyecto:"));
        this.jLabelList.add(new JLabel("Modalidad:"));
        this.jLabelList.add(new JLabel("Periodo Academico:"));
        this.jLabelList.add(new JLabel("Fecha de Inicio de Clases:"));
        this.jLabelList.add(new JLabel("28/03/2022 al 06/08/2022"));
        
        this.jLabelList.get(7).setFont(font1);
        
        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(3).add(this.jLabelList.get(2));
        this.jPanelList.get(4).add(this.jLabelList.get(3));
        this.jPanelList.get(5).add(this.jLabelList.get(4));
        this.jPanelList.get(6).add(this.jLabelList.get(5));
        this.jPanelList.get(7).add(this.jLabelList.get(6));
        this.jPanelList.get(7).add(this.jLabelList.get(7));

    }
    
    public void inciarComboBox(){
        
        var font1 = new Font("Verdana", Font.ITALIC, 12);
        
        this.jComboBoxList = new ArrayList<>();
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
       
        this.jComboBoxList.get(0).setFont(font1);
        
        this.jComboBoxList.get(0).setBackground(Color.WHITE);
        this.jComboBoxList.get(0).addItem("Matriz Cuenca");
        this.jComboBoxList.get(0).addItem("Guayaquil");
        this.jComboBoxList.get(0).addItem("Quito");
        
        this.jComboBoxList.get(1).setFont(font1);
        
        this.jComboBoxList.get(1).setBackground(Color.WHITE);
        this.jComboBoxList.get(1).addItem("El Vecino");
        this.jComboBoxList.get(1).addItem("El Sur");
        this.jComboBoxList.get(1).addItem("Quito");
        
        this.jComboBoxList.get(2).setFont(font1);
        
        this.jComboBoxList.get(2).setBackground(Color.WHITE);
        this.jComboBoxList.get(2).addItem("Agropecuario");
        this.jComboBoxList.get(2).addItem("Electronica");
        this.jComboBoxList.get(2).addItem("Ingenieria Civil");
        
        this.jComboBoxList.get(3).setFont(font1);
        
        this.jComboBoxList.get(3).setBackground(Color.WHITE);
        this.jComboBoxList.get(3).addItem("Agropecuaria [Rediseno]- NUEVA O REDISENO");
        this.jComboBoxList.get(3).addItem("Electronica [Rediseno]- NUEVA O REDISENO");
        this.jComboBoxList.get(3).addItem("Ingenieria Civil [Rediseno]- NUEVA");
        
        this.jComboBoxList.get(4).setFont(font1);
        
        this.jComboBoxList.get(4).setBackground(Color.WHITE);
        this.jComboBoxList.get(4).addItem("Presencial");
        this.jComboBoxList.get(4).addItem("Virtual");
        
        this.jComboBoxList.get(5).setFont(font1);
        
        this.jComboBoxList.get(5).setBackground(Color.WHITE);
        this.jComboBoxList.get(5).addItem("2022-2022");
        this.jComboBoxList.get(5).addItem("2021-2022");
        this.jComboBoxList.get(5).addItem("2021-2021");
        
        this.jPanelList.get(1).add(this.jComboBoxList.get(0));
        this.jPanelList.get(2).add(this.jComboBoxList.get(1));
        this.jPanelList.get(3).add(this.jComboBoxList.get(2));
        this.jPanelList.get(4).add(this.jComboBoxList.get(3));
        this.jPanelList.get(5).add(this.jComboBoxList.get(4));
        this.jPanelList.get(6).add(this.jComboBoxList.get(5));
    }
}
