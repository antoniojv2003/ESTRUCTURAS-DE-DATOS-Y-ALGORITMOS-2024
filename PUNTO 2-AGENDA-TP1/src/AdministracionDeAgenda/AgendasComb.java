/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministracionDeAgenda;

/**
 *
 * @author Usuario
 */
public class AgendasComb { //PUNTO 3 DEL PRÁCTICO
    
    
    static void CombinacionAgendas(Agenda agenda1, Agenda agenda2)
    {
        Contacto auxiliar1;   
        Contacto auxiliar2;
        boolean agregar; //este nos diá si debo agregar a la agenda 1 el elemento de la agenda 2
        
        for(int i=1;i<=agenda2.cantidad();i++)
        {
            agregar=true;
            auxiliar2=agenda2.enPosicion(i);
            for(int j=1;j<=agenda1.cantidad();j++)
            {
                auxiliar1=agenda1.enPosicion(j);
                if(auxiliar2.equals(auxiliar1))
                {
                    agregar=false;
                    break;
                }
                
            }
            
            if(agregar==true)
            {
                agenda1.agregar(auxiliar2);
            }
        }
    }
    
    
    
    
}
