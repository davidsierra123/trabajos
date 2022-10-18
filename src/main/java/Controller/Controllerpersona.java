/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.JFLogin;
import Model.Modelpersona;
import View.JFPersona;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author SENA
 */
public class Controllerpersona implements ActionListener {

    private int documento = 0;
    private String nombre = null;
    private String apellido = null;
    private String usuario = null;
    private String Contraseña = null;

    JFLogin Persona;
    JFPersona Vistalogin = new JFPersona();

    ArrayList<Modelpersona> ListaPersona = new ArrayList<Modelpersona>();

    public Controllerpersona(JFLogin Persona) {
        this.Persona = Persona;
        this.Iniciar();
        this.Persona.Iniciar.addActionListener(this);
        this.Persona.guar.addActionListener(this);
        this.Persona.most.addActionListener(this);
        this.Persona.buscar.addActionListener(this);
        this.Persona.salir.addActionListener(this);
        this.Vistalogin.Salir1.addActionListener(this);
        /*this.Persona.ret.addActionListener(this);*/
        this.Vistalogin.Validar1.addActionListener(this);

    }

    public void Iniciar() {
        this.Persona.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.Persona.guar) {
            documento = Integer.parseInt(this.Persona.documen1.getText());
            nombre = this.Persona.nombr.getText();
            apellido = this.Persona.apellido.getText();
            usuario = this.Persona.Usuari.getText();
            Contraseña = this.Persona.Contra3.getText();
            ListaPersona.add(new Modelpersona(documento, nombre, apellido, usuario, Contraseña));
            
            tablainfo(this.Persona.Tablainfo, ListaPersona);
            
            this.Limpiar();
            JOptionPane.showMessageDialog(null, "Dato Registrado Con Exito");
        }

        if (e.getSource() == this.Persona.buscar) {
            documento = Integer.parseInt(this.Persona.documen1.getText());
            for (int i = 0; i < ListaPersona.size(); i++) {
                if (documento == ListaPersona.get(i).getDocument()) {
                    this.Persona.nombr.setText(ListaPersona.get(i).getNombre());
                    this.Persona.apellido.setText(ListaPersona.get(i).getApellido());

                }
            }
        }
        if (e.getSource() == this.Persona.most) {
            for (int i = 0; i < ListaPersona.size(); i++) {
                System.out.println("Documento: " + this.ListaPersona.get(i).getDocument() + "\n" + "Nombre : " + this.ListaPersona.get(i).getNombre() + "\n" + "Apellidos: " + this.ListaPersona.get(i).getApellido());
            }
        }
        if (e.getSource() == this.Persona.salir) {
            System.exit(0);

        }
        if (this.Persona.Iniciar == e.getSource()) {
            this.Vistalogin.setVisible(true);

        }

        if (e.getSource() == this.Vistalogin.Validar1) {
            usuario = this.Vistalogin.Usuari1.getText();
            Contraseña = this.Vistalogin.Contaseña2.getText();
            boolean bs = false;
            for (int i = 0; i < ListaPersona.size(); i++) {
                if (usuario.equals(ListaPersona.get(i).getUsuario()) && Contraseña.equals(ListaPersona.get(i).getContraseña())) {
                    JOptionPane.showMessageDialog(null, "Usuario: " + usuario + "\n" + "Contraseña: " + Contraseña);

                    bs = true;

                }
            }
            if (bs == false) {
                JOptionPane.showMessageDialog(null, "¡DATOS NO REGISTRADOS!");

            }
        }
        if (e.getSource() == Vistalogin.Salir1) {
            this.Vistalogin.dispose();

        }
    }
    public void tablainfo(JTable Tabla,ArrayList<Modelpersona>listpersona) {
        
        for (int i = 0; i < listpersona.size(); i++) {
            Tabla.setValueAt(listpersona.get(i).getDocument(),i,0);
            Tabla.setValueAt(listpersona.get(i).getNombre(),i,1);
            Tabla.setValueAt(listpersona.get(i).getApellido(),i,2);
            Tabla.setValueAt(listpersona.get(i).getUsuario(),i,3);
            
        }
        
    }

    private void Limpiar() {
        this.Persona.documen1.setText("");
        this.Persona.nombr.setText("");
        this.Persona.apellido.setText("");
        this.Persona.Usuari.setText("");
        this.Persona.Contra3.setText("");

    }
}
