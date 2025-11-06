package shravyajavaprograms;

public class finalmethod {
    public static void main(String[] args) {
        kiran k = new kiran();
        k.greet();
    }
}

class arun {
    void greet() {  
        System.out.println("good morning");
    }
}

class kiran extends arun {
    void greet() {
        System.out.println("good night");
    }
}
