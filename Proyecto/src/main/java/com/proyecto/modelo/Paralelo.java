/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.modelo;
import java.util.ArrayList;

public class Paralelo {
//Atribbutos:
    private String numero;
    private ArrayList<Estudiante> estudiantes;
// Costructor:
    public Paralelo(String numero){
        this.numero = numero;
        estudiantes = new ArrayList<Estudiante>();
    }
//Sobrecarga de constructor:
    public Paralelo(String numero, ArrayList<Estudiante> estudiantes){
        this.numero = numero;
        this.estudiantes = estudiantes;
    }
//Getters:
    public String getNumero(){
        return numero;
    }

    public ArrayList<Estudiante> getEstudiantes(){
        return estudiantes;
    }
//Setters:
    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes){
        this.estudiantes = estudiantes;
    }
//Método para agrefar estudiantes a la lista de estudiantes:
    public void addEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }
    public String toString(){
        return numero;
    }
}
