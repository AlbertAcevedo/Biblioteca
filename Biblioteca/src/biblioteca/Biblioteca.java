/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;

/**
 *
 * @author mybas
 */
public class Biblioteca {

    ArrayList<Libro> libros;
    ArrayList<Autor> autores;
    ArrayList<Usuario> usuarios;

    public Biblioteca() {
        libros = new ArrayList<>();
        autores = new ArrayList<>();
    }

    public void agregarLibro(int id, String titulo) {
        Libro l = new Libro(id, titulo);
        libros.add(l);
    }

    public void agregarAutor(int id, String nombre) {
        Autor a = new Autor(id, nombre);
        autores.add(a);
    }

    public void agregarUsuario(int id) {
        Usuario u = new Usuario(id);
        usuarios.add(u);
    }

    public void agregarUsuario(int id, String nombre) {
        Usuario u = new Usuario(id, nombre);
        usuarios.add(u);
    }

    public static void main(String[] args) {

    }

}
