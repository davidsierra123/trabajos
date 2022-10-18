/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author SENA
 */
public class Modelpersona {
    protected int documento;
    protected String nombre;
    protected String apellido;
    protected String usuario;
    protected String Contraseña;

    public Modelpersona(int document, String nombre, String apellido, String usuario, String Contraseña) {
        this.documento = document;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.Contraseña = Contraseña;
    }

    public int getDocument() {
        return documento;
    }

    public void setDocument(int document) {
        this.documento = document;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
}