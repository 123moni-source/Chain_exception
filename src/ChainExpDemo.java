public class ChainExpDemo {
    static void demoproc(){
        //creating an exception
        NullPointerException obj=new NullPointerException("top layer");
        //add a cause
        obj.initCause(new ArithmeticException("cause"));
        throw obj;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch(NullPointerException obj){
            System.out.println("Caught: "+obj);
            //display cause exception
            System.out.println("Original cause: "+obj.getCause());
        }
    }
}
