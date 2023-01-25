package main;

public class Hedgehog {

    private String name;
    private int age;

    public Hedgehog () {
        name = "Pikseli";
        age = 5;
    }

    public Hedgehog (String n, int a) {
        name = n;
        age = a;
    }

    public void speak (String s) {

        String says = s;
        if (says.isEmpty() == true) {
            System.out.println("Olen " + name + " ja ikäni on " + age + " vuotta, mutta antaisitko silti syötteen?");
        } else {
            System.out.println(name + ": " + says);
        }
    }

    public void run (int r) {
        for (int i = 1; i <= r; i++) {
            System.out.println(name + " juoksee kovaa vauhtia!");
        }
    }
}
