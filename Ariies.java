public class Ariies {
        public static final String YELLOW = "\033[0;33m";  // YELLOW
        public static final String WHITE = "\033[0;37m";   // WHITE
        public static final String RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String BLUE = "\u001B[34m";

   
        piece[][]MyArray;
        int size;
        int numbers_of_red;
        int numbers_of_blue;

        public void MyArray(piece MyArray[][],int size,int numbers_of_red,int numbers_of_blue)
        {
            this.size = size;
            this.numbers_of_blue = numbers_of_blue;
            this.numbers_of_red = numbers_of_red;
            this.MyArray=new piece[MyArray.length][MyArray[0].length];
            for(int i=0;i<MyArray.length;i++)
            {
                for(int j=0;j<MyArray.length;j++)
                {
                    this.MyArray[i][j] = new piece();
                    this.MyArray[i][j].state=MyArray[i][j].state;
                }
            }
            
        }
        public void printl()
        {
           for (int i=0;i<size;i++)
            {
                System.out.print(YELLOW);
                System.out.print(i+"\t");
                
                for (int j=0;j<size;j++)
                {
                if(this.MyArray[i][j].state == 2)
                {
                    System.out.print(BLUE);
                    System.out.print("X\t");    
                }  
                else if(this.MyArray[i][j].state == 1)
                {
                    System.out.print(RED);
                    System.out.print("X\t");     
                }
                else  
                {
                    System.out.print(WHITE);         
                    System.out.print("-\t"); 
                }      
                }
              System.out.println();
            }
            System.out.print(YELLOW);
            System.out.print("\t");
            for (int i=0;i<size;i++)
            {
                System.out.print(i+"\t");
            }
            System.out.println();
            System.out.print(RED);  
            System.out.print("\tred : "+numbers_of_red);

            System.out.print(BLUE);
            System.out.println("\t\tblue : "+numbers_of_blue);
            System.out.print(YELLOW);
            System.out.println("---------------------------------------------------");
            System.out.print(WHITE);    
        }     
    }