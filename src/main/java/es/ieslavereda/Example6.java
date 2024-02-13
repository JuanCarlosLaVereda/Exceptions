package es.ieslavereda;

public class Example6 {
    public static void main(String[] args) {

        try {
            numero(2);
            numero(17);
        } catch (ExceptionMayor10 e){
            System.err.println(e);
        } finally {
            System.out.println("FIN");
        }
    }

    public static void numero(int num) throws ExceptionMayor10{
        if (num>=10){
            throw new ExceptionMayor10(num);
        }
        System.out.println("Nº: " + num);
    }
}
