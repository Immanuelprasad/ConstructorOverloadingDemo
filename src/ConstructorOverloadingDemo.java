class Casio
{
    int num1;
    int num2;
    String operation;

    public Casio()
    {
        num1 = 0;
        num2 = 0;
        operation = "Nothing";
    }
    public Casio(int i)
    {
        num1 = i;
        num2 = 0;
        operation = "Nothing";
    }
    public Casio(int i,int j)
    {
        num1 = i;
        num2 = j;
        operation = "Nothing";
    }
    public Casio(int i,int j,String op)
    {
        num1 = i;
        num2 = j;
        operation = op;
    }
}
public class ConstructorOverloadingDemo {
    public static void main(String[] args)
    {
        Casio obj;
        obj = new Casio(8,9,"Add");
    }
}
