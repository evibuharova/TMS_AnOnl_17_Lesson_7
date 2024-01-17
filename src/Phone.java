import java.util.Arrays;

public class Phone {
    int number;
    String model;
    int weight;

    public Phone (int number, String model, int weight) {
        this.number=number;
        this.model=model;
        this.weight=weight;
    }
    public Phone (int number, String model) {
        this.number=number;
        this.model=model;
    }
    public Phone () {}

    @Override
    public String toString () {
        return number+model+weight;
    }
    //peregryshennii metod
    public void receiveCall(String name) {
        System.out.println("Call " + name);
    }
    public void receiveCall(String name, int number) {
        System.out.println("Call " + name + " " + number);
    }
    public int getnumber() {
        return number;
    }
    public void sendMessage (int...numbers) {
        System.out.println("Message was send on numbers: " );
        System.out.println(Arrays.toString(numbers));
    }

}
