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
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author ochoa
 */
public class CrearGrupo extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JButton> jButtonList;
    public List<JTextField> jTextFieldsList;
    public List<JCheckBox> jCheckBox;
    public List<JComboBox> jComboBoxList;

    public CrearGrupo(String title) throws HeadlessException {
        super(title);
        this.setSize(700, 500);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.iniciarPanel();
        this.iniciarLabel();
        this.iniciarTextField();
        this.iniciarComboBox();
        this.IniciarCheckBox();
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
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setLayout(new GridLayout(14, 14));
        this.jPanelList.get(0).setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Crear Grupo"));

        this.jPanelList.get(0).setBackground(Color.white);
        this.jPanelList.get(1).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(2).setBackground(Color.white);
        this.jPanelList.get(2).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(3).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(4).setBorder(new LineBorder(Color.GRAY));
        this.jPanelList.get(4).setBackground(Color.white);

        this.jPanelList.get(5).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(6).setBorder(new LineBorder(Color.GRAY));
        this.jPanelList.get(6).setBackground(Color.white);

        this.jPanelList.get(7).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(8).setBorder(new LineBorder(Color.GRAY));
        this.jPanelList.get(8).setBackground(Color.white);

        this.jPanelList.get(9).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(10).setBorder(new LineBorder(Color.GRAY));
        this.jPanelList.get(10).setBackground(Color.white);

        this.jPanelList.get(11).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(12).setBorder(new LineBorder(Color.GRAY));
        this.jPanelList.get(12).setBackground(Color.white);

        this.jPanelList.get(13).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(14).setBorder(new LineBorder(Color.GRAY));
        this.jPanelList.get(14).setBackground(Color.white);

        this.jPanelList.get(15).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(16).setBorder(new LineBorder(Color.GRAY));
        this.jPanelList.get(16).setBackground(Color.white);

        this.jPanelList.get(17).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(18).setBorder(new LineBorder(Color.GRAY));
        this.jPanelList.get(18).setBackground(Color.white);

        this.jPanelList.get(19).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(20).setBorder(new LineBorder(Color.GRAY));
        this.jPanelList.get(20).setBackground(Color.white);

        this.jPanelList.get(21).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(22).setBorder(new LineBorder(Color.GRAY));
        this.jPanelList.get(22).setBackground(Color.white);
        
        this.jPanelList.get(23).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(24).setBorder(new LineBorder(Color.GRAY));
        this.jPanelList.get(24).setBackground(Color.white);
        
        this.jPanelList.get(25).setBorder(new LineBorder(Color.GRAY));

        this.jPanelList.get(26).setBorder(new LineBorder(Color.GRAY));
        this.jPanelList.get(26).setBackground(Color.white);
        
        this.jPanelList.get(27).setBackground(Color.white);
        
        this.jPanelList.get(28).setBackground(Color.white);

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
        this.jPanelList.get(0).add(this.jPanelList.get(11));
        this.jPanelList.get(0).add(this.jPanelList.get(12));
        this.jPanelList.get(0).add(this.jPanelList.get(13));
        this.jPanelList.get(0).add(this.jPanelList.get(14));
        this.jPanelList.get(0).add(this.jPanelList.get(15));
        this.jPanelList.get(0).add(this.jPanelList.get(16));
        this.jPanelList.get(0).add(this.jPanelList.get(17));
        this.jPanelList.get(0).add(this.jPanelList.get(18));
        this.jPanelList.get(0).add(this.jPanelList.get(19));
        this.jPanelList.get(0).add(this.jPanelList.get(20));
        this.jPanelList.get(0).add(this.jPanelList.get(21));
        this.jPanelList.get(0).add(this.jPanelList.get(22));
        this.jPanelList.get(0).add(this.jPanelList.get(23));
        this.jPanelList.get(0).add(this.jPanelList.get(24));
        this.jPanelList.get(0).add(this.jPanelList.get(25));
        this.jPanelList.get(0).add(this.jPanelList.get(26));
        this.jPanelList.get(0).add(this.jPanelList.get(27));
        this.jPanelList.get(0).add(this.jPanelList.get(28));

    }

    public void iniciarLabel() {

        var font1 = new Font("Verdana", Font.ITALIC, 12);

        this.jLabelList = new ArrayList<>();

        this.jLabelList.add(new JLabel("Periodo Academico:"));
        this.jLabelList.add(new JLabel("2022-2022"));
        this.jLabelList.add(new JLabel("Sede:"));
        this.jLabelList.add(new JLabel("Matriz Cuenca"));
        this.jLabelList.add(new JLabel("Campus/Extension:"));
        this.jLabelList.add(new JLabel("El Vecino"));
        this.jLabelList.add(new JLabel("Modalidad:"));
        this.jLabelList.add(new JLabel("Presencial"));
        this.jLabelList.add(new JLabel("Carrera:"));
        this.jLabelList.add(new JLabel("Agropecuaria"));
        this.jLabelList.add(new JLabel("Codigo de proyecto:"));
        this.jLabelList.add(new JLabel("Agropecuaria [Rediseno]- NUEVA O REDISENO"));
        this.jLabelList.add(new JLabel("Asignatura:"));
        this.jLabelList.add(new JLabel("E-CV-IAG-003 BOTANICA"));
        this.jLabelList.add(new JLabel("Nombre de Grupo:"));
        this.jLabelList.add(new JLabel("Grupo 1"));
        this.jLabelList.add(new JLabel("Cupos por Grupo:"));
        this.jLabelList.add(new JLabel("Autorizacion sobre:"));
        this.jLabelList.add(new JLabel("Selecionar la Jornada por Grupo:"));
        this.jLabelList.add(new JLabel("Oferta de Estudiantes:"));
        this.jLabelList.add(new JLabel("Aplica Cambios de Grupos:"));

        this.jLabelList.get(1).setFont(font1);
        this.jLabelList.get(3).setFont(font1);
        this.jLabelList.get(5).setFont(font1);
        this.jLabelList.get(7).setFont(font1);
        this.jLabelList.get(9).setFont(font1);
        this.jLabelList.get(11).setFont(font1);
        this.jLabelList.get(13).setFont(font1);

        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(3).add(this.jLabelList.get(2));
        this.jPanelList.get(4).add(this.jLabelList.get(3));
        this.jPanelList.get(5).add(this.jLabelList.get(4));
        this.jPanelList.get(6).add(this.jLabelList.get(5));
        this.jPanelList.get(7).add(this.jLabelList.get(6));
        this.jPanelList.get(8).add(this.jLabelList.get(7));
        this.jPanelList.get(9).add(this.jLabelList.get(8));
        this.jPanelList.get(10).add(this.jLabelList.get(9));
        this.jPanelList.get(11).add(this.jLabelList.get(10));
        this.jPanelList.get(12).add(this.jLabelList.get(11));
        this.jPanelList.get(13).add(this.jLabelList.get(12));
        this.jPanelList.get(14).add(this.jLabelList.get(13));
        this.jPanelList.get(15).add(this.jLabelList.get(14));
        this.jPanelList.get(17).add(this.jLabelList.get(16));
        this.jPanelList.get(19).add(this.jLabelList.get(17));
        this.jPanelList.get(21).add(this.jLabelList.get(18));
        this.jPanelList.get(23).add(this.jLabelList.get(19));
        this.jPanelList.get(25).add(this.jLabelList.get(20));

    }

    public void iniciarTextField() {

        var font1 = new Font("Verdana", Font.ITALIC, 12);

        this.jTextFieldsList = new ArrayList<>();
        this.jTextFieldsList.add(new JTextField(12));
        this.jTextFieldsList.add(new JTextField(12));

        this.jTextFieldsList.get(0).setFont(font1);
        this.jTextFieldsList.get(0).setText("Grupo 1");

        this.jTextFieldsList.get(1).setFont(font1);

        this.jPanelList.get(16).add(this.jTextFieldsList.get(0));
        this.jPanelList.get(18).add(this.jTextFieldsList.get(1));

    }

    public void iniciarComboBox() {

        var font1 = new Font("Verdana", Font.ITALIC, 12);

        this.jComboBoxList = new ArrayList<>();
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());

        this.jComboBoxList.get(0).setFont(font1);
        this.jComboBoxList.get(0).setBackground(Color.WHITE);
        this.jComboBoxList.get(0).addItem("Si");
        this.jComboBoxList.get(0).addItem("No");

        this.jComboBoxList.get(1).setFont(font1);
        this.jComboBoxList.get(1).setBackground(Color.WHITE);
        this.jComboBoxList.get(1).addItem("Jornadas Disponibles");
        this.jComboBoxList.get(1).addItem("Matutina");
        this.jComboBoxList.get(1).addItem("Vispertina");
        this.jComboBoxList.get(1).addItem("Diurna");
        
        this.jComboBoxList.get(2).setFont(font1);
        this.jComboBoxList.get(2).setBackground(Color.WHITE);
        this.jComboBoxList.get(2).addItem("Si");
        this.jComboBoxList.get(2).addItem("No");

        this.jPanelList.get(20).add(this.jComboBoxList.get(0));
        this.jPanelList.get(22).add(this.jComboBoxList.get(1));
        this.jPanelList.get(26).add(this.jComboBoxList.get(2));


    }
    public void IniciarCheckBox (){
        
        this.jCheckBox = new ArrayList<>();
        this.jCheckBox.add(new JCheckBox("Nuevos"));
        
        this.jCheckBox.get(0).setBackground(Color.WHITE);
        
        this.jPanelList.get(24).add(this.jCheckBox.get(0));
        
    }
    
    public void iniciarButton(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.add(new JButton("Salir"));
        
        this.jPanelList.get(27).add(this.jButtonList.get(0));
        this.jPanelList.get(28).add(this.jButtonList.get(1));
        
        
        
    }
}
