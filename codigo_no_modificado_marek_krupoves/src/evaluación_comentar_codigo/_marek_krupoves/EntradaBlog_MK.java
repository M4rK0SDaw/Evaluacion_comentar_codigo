/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluación_comentar_codigo._marek_krupoves;

/*Clase para manejar las entradas de un blog.
 * La clase se creó el 15-03-2021 por Marek.
 * Esta es la versión 2.3
 */

public class EntradaBlog_MK {

    /**
     * separador es el ccarácter que separa ENTRADA DE del nombre del autor
     */
    public static char separador = ':';
    private int id;
    private String texto;
    private String autor;

    /**
     * Constructor de la clase:
     *
     * @param id recibe el número de entrada
     * @param autor el nombre del autor de la entrada
     * @param texto el texto que contiene la entrada
     */
   public EntradaBlog_MK(int id,String autor,String texto) throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	

    @Override
    public String toString() {
        String cad = "";
        cad += "\n ENTRADA DE " + separador + autor;
        cad += "\n " + texto;
        return cad;
    }

    /**
     *
     * @return el número de la entrada
     */
    public int getId() {
        return this.id;
    }

    /**
     *
     * @return el texto completo de la entrada
     */
    public String getTexto() {
        return this.texto;
    }

    /**
     *
     * @return el nombre del autor de la entrada en mayúsculas
     */
    public String getAutor() {
        return this.autor.toUpperCase();
    }

    /**
     * Metodo que:
     * @return el nombre del autor
     */
    public String devuelveAutor() {
        return this.autor;
    }

    public static void main(String[] args) {
        
        EntradaBlog_MK e1 = new EntradaBlog_MK(3, " Marek", "Últimas noticias, está disponible BixBy 2.0 ");
        System.out.println(e1);
    }
}
