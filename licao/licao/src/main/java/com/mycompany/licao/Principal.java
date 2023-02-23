/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.licao;

/**
 *
 * @author dti
 */
public class Principal {
    
    public static void main(String[] args){
    
    Usuario usuario1 = new Usuario();
    
    usuario1.provarExistencia();
    
    usuario1.nome = "Raphaela";
    usuario1.email = "raphaela@etec.sp.gov.br";
    usuario1.login = " ";
    usuario1.senha = "123";
    
    System.out.println(usuario1.nome);
    System.out.println(usuario1.email);
    System.out.println(usuario1.login);
    System.out.println(usuario1.senha);
}
}
