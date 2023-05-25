class Arithematic{
    public int add(int num1, int num2){
        return num1+num2;
    }
}

class Adder extends Arithematic{

    public Adder(){
        System.out.println("My superclass is: Arithmetic");
    }

}

public class ArithmeticAdder {

    public static void main(String args[]){
        Arithematic obj = new Adder();
        System.out.println(obj.add(12, 30));

        System.out.println(obj.add(6, 7));

        System.out.println(obj.add(17, 3));
    }
}