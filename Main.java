class Main 
{
    public static void print(Object o) 
    {
          System.out.print(o);
    } 
    
    public static void main (String[] args)
    {
      printFlag(15);
    }
    
    public static void printFlag(int row)
    {
  
      for ( int i = 0; i <= (row/2); i++) {
          
          for ( int j = 0; j < (i*2)+1; j++ ) print("*");
          for ( int j = 0; j < 2; j++ ) print(" ");
          for ( int j = 0; j < 1; j++ ) print("++");
          for ( int j = 0; j < 4; j++ ) print(" ");
          for ( int j = 0; j < (row/2-i)*2 + 1; j++ ) print("*");
          for ( int j = 0; j < row/2; j++ ) print("|");
          for ( int j = 0; j < (row/2-i)*2 + 1; j++ ) print("*"); 
          for ( int j = 0; j < 4; j++ ) print(" ");
          for ( int j = 0; j < 1; j++ ) print("++");
          for ( int j = 0; j < 2; j++ ) print(" ");
          for ( int j = 0; j < (i*2)+1; j++ ) print("*");
          print("\n");
      }
      for ( int i = (row/2); i <= (row/2)+(row/5); i++) {
          for ( int j = 0; j < 20+(row/2)*5; j++){
          print("|");
          }
          print("\n");  
        
      }
      for ( int i = 1; i <= (row/2)+1; i++) {
          
          for ( int j = 0; j < ((row/2)+1-i)*2+1; j++ ) print("*");
          for ( int j = 0; j < 4; j++ ) print(" ");
          for ( int j = 0; j < 1; j++ ) print("++");
          for ( int j = 0; j < 2; j++ ) print(" ");
          for ( int j = 0; j < ((i)+(-1))*2+1 ; j++ ) print("*");
          for ( int j = 0; j < row/2; j++ ) print("|");
          for ( int j = 0; j < ((i)+(-1))*2+1; j++ ) print("*"); 
          for ( int j = 0; j < 2; j++ ) print(" ");
          for ( int j = 0; j < 1; j++ ) print("++");
          for ( int j = 0; j < 4; j++ ) print(" ");
          for ( int j = 0; j < ((row/2)+1-i)*2+1; j++ ) print("*");
          print("\n");
      
      }
      
    }  
}