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
public class Review {

    ArrayList<Libro> libros;
    ArrayList<Autor> autores;

    public Review() {
        libros = new ArrayList<>();
        autores = new ArrayList<>();
    }
}
