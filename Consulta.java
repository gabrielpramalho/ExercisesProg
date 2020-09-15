/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaprog;

import java.time.LocalDate;

/**
 *
 * @author Gabriel
 */
public class Consulta {
    
    private LocalDate data;
    private Paciente paciente;

    public Consulta(LocalDate data, Paciente paciente) {
        this.data = data;
        this.paciente = paciente;
    }
    
    public void setData(LocalDate data){
        this.data = data;
    }
    
    public LocalDate getData(){
        return this.data;
    }
    
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }
    
    public Paciente getPaciente(){
        return this.paciente;
    }
}
