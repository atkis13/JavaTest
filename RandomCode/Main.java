public class createRand {
    int a;
    int b;
    int c;
    int d;
    
    
    public  int Generatea(){
        a = (int)(Math.random() *101);
        return a;
    }
    
    public  int Generateb(){
        b = (int)(Math.random() *101);
        return b;
    }
    
    public  int Generatec(){
        c = (int)(Math.random() *101);
        return c;
    }
    
    public  int Generated(){
        d = (int)(Math.random() *101);
        return d;
    }


   public static void main(String []args) {
      createRand c = new createRand();
      int i = c.Generatea();
      int y = c.Generateb();
      int x = c.Generatec();
      int z = c.Generated();
      
