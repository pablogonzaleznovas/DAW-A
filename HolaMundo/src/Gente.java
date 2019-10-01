public class Gente {
    private String nombre,dni;
    private char sexo;
    private int edad;
    private double peso,altura;

//Constructor personalizado
public Gente(String nombre, int edad, String dni, char sexo,double peso, double altura) {
            this.nombre = nombre;
            if (esCorrectaEdad(edad)) this.edad=edad;
            this.dni=dni;
            if (esCorrectoSexo(sexo)) this.sexo = sexo;
            this.peso = peso;
            this.altura = altura;
}

//Métodos 
public double calcularIMC(){
    return (this.peso/Math.pow(this.altura,2));    
}

boolean esMayorEdad(){
    return (this.edad>=18);    
}

boolean esCorrectoSexo(char sexo){
    return ((sexo=='H')||(sexo=='M'));    
}

public boolean esCorrectaEdad(int edad){
    return (edad>0 && edad<150);    
}

//Metodo
public String mostrarinformacion() {
String info="## Nombre: "+nombre+", Edad: "+edad+", DNI: "+dni+", Sexo: "+sexo+", Peso: "+peso+" Atltura: "+altura+" ##";        
return info;
}

//Getter y Setter

    public char getSexo() {
        return sexo;
    }    

    public void setSexo(char sexo) {
	if (esCorrectoSexo(sexo)) this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
	if (esCorrectaEdad(edad)) this.edad=edad;
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso>0 && peso<200)this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
       if (altura>0 &&altura<3) this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getDni() {
        return dni;
    }
}