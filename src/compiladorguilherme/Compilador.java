/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorguilherme;

import java.util.Iterator;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guilherme
 */
public class Compilador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String texto = "(*hhhh*) Program Guilherme; Procedure minharola2; 'literal da puta que pariu'";
        //String palavra = "";
        Stack<Character> pilha;
        Stack<Token> pilhaToken = new Stack<>();

        try {
            pilhaToken = new Lexico().analiseLexica(MontaPilha(texto));
        } catch (ErroLexico ex) {
            System.out.println(ex.getMessage());
        }
        pilha = MontaPilha(texto);
        
        
        
     
        while (!pilhaToken.isEmpty()) {
            System.out.println(pilhaToken.pop());
        }
        
    
       
        

    }

    public static Stack<Character> MontaPilha(String texto) {
        Stack<Character> pilha = new Stack<>();
        for (int i = texto.length() - 1; i >= 0; i--) {
            pilha.push(texto.charAt(i));
         
        }

        return pilha;
    }
    


}
