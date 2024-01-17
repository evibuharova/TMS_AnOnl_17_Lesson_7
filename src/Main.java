public class Main {
    public static void main(String[] args) {
        Phone Iphone = new Phone(653_48_49 ,"Iphone ", 100);
        Phone Sumsung = new Phone (884_20_75 ,"Sumsung ", 200);
        Phone Xiomi = new Phone(834_56_87 , "Xiomi ", 300);
        System.out.println(Iphone);
        System.out.println(Sumsung);
        System.out.println(Xiomi);
        Iphone.receiveCall("Zhinya");
        System.out.println(Iphone.getnumber());
        Sumsung.receiveCall("Tema");
        Sumsung.getnumber();
        System.out.println(Sumsung.getnumber());
        Xiomi.receiveCall("Mum");
        System.out.println(Xiomi.getnumber());
        Xiomi.getnumber();
        Iphone.receiveCall ("Mum", 888_21_21);
        Iphone.sendMessage (653_48_49, 884_20_75, 834_56_87);
    }
}