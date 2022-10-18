/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciojf;
import Controller.Controllerpersona;
import View.JFLogin;

/**
 *
 * @author SENA
 */
public class JFramePersonas {

    public static void main(String[] args) {
        
        JFLogin Persona = new JFLogin();
        Controllerpersona cp = new Controllerpersona(Persona);
        cp.Iniciar();
        
    }
}