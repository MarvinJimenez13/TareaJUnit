package tareajunit;

import javax.swing.JOptionPane;

/**
 *
 * @author Marvin
 */
public class TareaJUnit {

    public static void main(String[] args) {
        
        String[] carreras = {
            "Camisa de manga corta",
            "Camisa casual de manga larga",
            "Camisa formal de manga larga"
        };
        MyIcon icon = new MyIcon();
        String resp = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de camisa", "Camisa", JOptionPane.DEFAULT_OPTION, icon, carreras, carreras[0]);
        String cantidad = JOptionPane.showInputDialog(null, "Ingresa la cantidad de camisas.", "Cantidad", JOptionPane.DEFAULT_OPTION);
        
        if(cantidad != null){
            
            int catindadInt = Integer.parseInt(cantidad);
            
        }else{
            
            System.out.println("Sin selección");
            
        }
        
    }
    
}
