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
    
    public String go(){
        String s = null;
        int i = Generatea();
        int y = Generateb();
        int x = Generatec();
        int z = Generated();
      
        s = Integer.toString(i)+Integer.toString(y)+Integer.toString(x)+Integer.toString(z);
       
        return s;
    }


   public static void main(String []args) {
      createRand c = new createRand();
      System.out.println(c.go());
            
      
      
   }
} 
