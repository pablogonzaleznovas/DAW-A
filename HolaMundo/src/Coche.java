
public class Coche {
//Atributos
    private String marca;
    private String modelo;
    private double precio;
    
//Constructor 
    public Coche(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
 
//Método para mostar    
    public String mostrarinfo(){
        String info="El coche "+marca+"-"+modelo+" tiene un precio de "+precio+"€";
    return info;
    }
        
    
//Getters y Setters    
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
}
