package SingletonDesignPattern;

public class Client {
    private int i = 1;
    private static Client clientInstance;

    private Client(int i){
        this.i = i;
        // This should be private so, no other class can call it.
        // Only getInstance method can provide the singleton Class Instance
    }
    public static Client getInstance(int i){
        if(clientInstance==null) clientInstance = new Client(i);
        return clientInstance;
    }
    public static void main(String[] args) {
        Client c = Client.getInstance(5);
        System.out.println(c.i);
        Client c2 = Client.getInstance(2);
        System.out.println(c2.i);
    }

}
