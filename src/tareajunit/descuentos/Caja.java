package tareajunit.descuentos;

/**
 *
 * @author Marvin
 */
public class Caja {
    
    private int cantidad;
    private String tipo;

    public Caja(String tipo, int cantidad) {
        
        this.tipo = tipo;
        this.cantidad = cantidad;
        
    }  
    
    public int precioTipoCamisa(String tipo){
        
        int precio = 0;
        
        switch (tipo) {
            case "Camisa de manga corta":
                precio = 190;
                break;
            case "Camisa casual de manga larga":
                precio = 230;
                break;
            case "Camisa formal de manga larga":
                precio = 310;
                break;
            default:
                throw new AssertionError();
                
        }
        
        return precio;
        
    }
    
    public double calularPrecio(){
        
        double precio = 0;
        
        if(cantidad == 1 || cantidad == 2){
            
            precio = cantidad * precioTipoCamisa(tipo);
            
        }else if(cantidad >= 3 && cantidad <= 5){
            
            precio = cantidad * precioTipoCamisa(tipo);
            double descuento = precio * 0.05;
            precio = precio - descuento;
            
        }else if(cantidad > 5){
            
            precio = cantidad * precioTipoCamisa(tipo);
            double descuento = precio * 0.08;
            precio = precio - descuento;
            
        }else{
            
            System.out.println("Error.");
            
        }
       
        return precio;
        
    }
    
}
