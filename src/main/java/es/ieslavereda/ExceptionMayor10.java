package es.ieslavereda;

public class ExceptionMayor10 extends Exception{
    private int num;
    public ExceptionMayor10(int num){
        super();
        this.num = num;
    }

    @Override
    public String toString(){
        return "Excepcion mayor de 10. El numero " + num + " es mayor que 10.";
    }
}
