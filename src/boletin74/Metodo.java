package boletin74;

public class Metodo {
    float peso1,peso2;
    
    public Metodo(){
        
    }
    public Metodo(int a, int b){
        this.peso1=a;
        this.peso2=b;
    }
    
    public void setPeso1(float P1){
        peso1=P1;
    }
    public void setPeso2(float P2){
        peso2=P2;
    }
    public float getPeso1(){
        return peso1;
    }
    public float getPeso2(){
        return peso2;
    }
    
    public void resultado(){
        if (peso1>peso2){
            System.out.println("persona 1 pesa "+ (peso1-peso2)+" kg mas");
        }
        else{
            System.out.println("persona 2 pesa "+(peso2-peso1)+" kg mas");
        }
    }

}
