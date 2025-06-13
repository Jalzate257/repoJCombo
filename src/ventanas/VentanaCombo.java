package ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaCombo extends JFrame implements ActionListener {

    public VentanaCombo() {
        iniciarComponentes();
    }

    private JTextField txtNombre, txtDocumento, txtDireccion, txtTelefono;
    private JButton btnRegistrar;
    private JComboBox comboPersonas;
    private JTable tablaPersonas;
    private JScrollPane mibarral;
    private JLabel lblTitulo, lblNombre, lblSeleccion, lblLista, lblDocumento, lblDireccion, lblTelefono, lblCombo, lblRegistro;
    private JSeparator separator;

    public void iniciarComponentes() {
        setTitle("Registro de Persona");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);

        lblTitulo = new JLabel("GESTIONAR PERSONAS");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitulo.setBounds(180, 10, 250, 30);
        panel.add(lblTitulo);

        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(30, 60, 80, 25);
        panel.add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(100, 60, 150, 25);
        panel.add(txtNombre);

        lblDocumento = new JLabel("Documento:");
        lblDocumento.setBounds(300, 60, 80, 25);
        panel.add(lblDocumento);

        txtDocumento = new JTextField();
        txtDocumento.setBounds(390, 60, 150, 25);
        panel.add(txtDocumento);

        lblDireccion = new JLabel("Direccion:");
        lblDireccion.setBounds(30, 100, 80, 25);
        panel.add(lblDireccion);

        txtDireccion = new JTextField();
        txtDireccion.setBounds(100, 100, 150, 25);
        panel.add(txtDireccion);

        lblTelefono = new JLabel("Telefono:");
        lblTelefono.setBounds(300, 100, 80, 25);
        panel.add(lblTelefono);

        txtTelefono = new JTextField();
        txtTelefono.setBounds(390, 100, 150, 25);
        panel.add(txtTelefono);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(430, 140, 110, 30);
        btnRegistrar.addActionListener(this);
        panel.add(btnRegistrar);

        separator = new JSeparator();
        separator.setBounds(20, 180, 540, 10);
        panel.add(separator);

        lblCombo = new JLabel("Combo Personas");
        lblCombo.setBounds(30, 200, 120, 25);
        panel.add(lblCombo);

        comboPersonas = new JComboBox();
        comboPersonas.setModel(new DefaultComboBoxModel(new String[]{"Seleccione"}));
        comboPersonas.setBounds(150, 200, 150, 25);
        comboPersonas.addActionListener(this);
        panel.add(comboPersonas);

        lblLista = new JLabel("Lista Personas");
        lblLista.setBounds(30, 240, 120, 25);
        panel.add(lblLista);

        lblSeleccion = new JLabel();
        lblSeleccion.setBounds(320, 200, 250, 25);
        panel.add(lblSeleccion);

        lblRegistro = new JLabel();
        lblRegistro.setBounds(30, 400, 120, 25);
        panel.add(lblRegistro);

        tablaPersonas = new JTable();
        mibarral = new JScrollPane(tablaPersonas);
        mibarral.setBounds(30, 270, 510, 120);
        panel.add(mibarral);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}