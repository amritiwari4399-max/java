 class Abstraction2 extends Abstraction {
    void start() {
        
        System.out.println("start the engine");
    }
    void disp() {   
        
        System.out.println("stop the engine");
    }
    public static void main(String[] args) {
        Abstraction2 obj = new Abstraction2();
        obj.start();
        obj.disp();
        
    }
    
}
