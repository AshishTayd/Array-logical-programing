package org.example.pack2;

public class Singleton {
    private static Singleton singleton;

    private Singleton(){
        System.out.println("singleton");
    }

    public static Singleton getInstance() {

        if (singleton == null) {
            synchronized (Singleton.class){
                if (singleton == null) {

                    return new Singleton();
                }

            }
        }
        return singleton;
    }


}
