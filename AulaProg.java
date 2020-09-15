/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaprog;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class AulaProg {

    
    public static void main(String[] args) {
        
       ArrayList<Consulta> agenda = new ArrayList();
       
       Paciente p = new Paciente("Braia", 1);
       LocalDate d = LocalDate.now();
       Consulta c = new Consulta(d,p);
       
       Paciente p2 = new Paciente("Vin Diesel", 2);
       LocalDate d2 = LocalDate.of(2020, Month.MARCH, 1);
       Consulta c2 = new Consulta(d2, p2);
       
       Paciente p3 = new Paciente("Relampago Marquinhos", 3);
       LocalDate d3 = LocalDate.of(2020, Month.SEPTEMBER, 13);
       Consulta c3 = new Consulta(d3, p3);
       
       agenda.add(c);
       agenda.add(c2);
       
       
        System.out.println("Primeira Lista");
       for(Consulta aux : agenda){
           System.out.println(aux.getPaciente().getNome());
       }
       
        System.out.println("\n\n");
        
        agenda.set(0, c3);
        
        System.out.println("Depois de alterar");
        for(Consulta aux : agenda){
           System.out.println(aux.getPaciente().getNome());
       }
    
       System.out.println("\n\n");
       
       agenda.remove(1);
       
        System.out.println("Depois de remover");
        for(Consulta aux : agenda){
           System.out.println(aux.getPaciente().getNome());
       }
        
        agenda.clear();
        
        for(Consulta aux : agenda){
           System.out.println(aux.getPaciente().getNome());
       }
    }
    
}
