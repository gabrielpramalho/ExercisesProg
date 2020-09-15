/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaprog;

/**
 *
 * @author Gabriel
 */
public class Paciente {
    private String nome;
    private int codigo;

    public Paciente(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getNome(){
        return this.nome;
    }
}
