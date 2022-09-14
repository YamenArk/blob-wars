import java.util.Scanner;
import java.lang.Math;
import java.util.Collections;
import java.util.PriorityQueue;

class Game {
    public static int counter=0;
    public static int alpha_beta_counter = 0;
    public static int level_of_hard = 2;
    public static α_and_β[] array_α_and_β;

    public static void  making_alpha_beta_object(int real_alpha_father)
    {
        alpha_beta_counter ++;
        array_α_and_β[alpha_beta_counter] = new α_and_β(array_α_and_β[real_alpha_father].α, array_α_and_β[real_alpha_father].β);
    }



    //////////////////////////////////////////////////

    public static boolean exist(int x1,int y1, int size)
    {
        if( x1 > -1 &&  x1 < size && y1 > -1 && y1 < size)
        {
            return true;
        }
        return false;
    }


    //////////////////////////////////////////////////

    public static void Attack(Ariies []states,int i,int size , int x,int y)
    {
        int color = states[i].MyArray[x][y].state ;
        int x1;
        int y1;

        boolean existing;

        if(color == 1)
        {
            x1 = x -1;
            y1 = y;
            existing = exist(x1, y1, size);
            if(existing)
            {
                if( states[i].MyArray[x1][y1].state == 2)
                {
                    states[i].MyArray[x1][y1].state = color;
                    states[i].numbers_of_red ++;   
                    states[i].numbers_of_blue --;
                }
            }

          
            x1 = x;
            y1 = y -1;
            existing = exist(x1, y1, size);
            if(existing)
            {
                if( states[i].MyArray[x1][y1].state == 2)
                {
                    states[i].MyArray[x1][y1].state = color;
                    states[i].numbers_of_red ++;   
                    states[i].numbers_of_blue --;
                }
            }
    
            x1 = x -1;
            y1 = y -1;
            existing = exist(x1, y1, size);
            if(existing)
            {
                if( states[i].MyArray[x1][y1].state == 2)
                {
                    states[i].MyArray[x1][y1].state = color;
                    states[i].numbers_of_red ++;   
                    states[i].numbers_of_blue --;
                }
            }
    
    
            x1 = x + 1;
            y1 = y + 1;
            existing = exist(x1, y1, size);
            if(existing)
            {
                if( states[i].MyArray[x1][y1].state == 2)
                {
                    states[i].MyArray[x1][y1].state = color;
                    states[i].numbers_of_red ++;   
                    states[i].numbers_of_blue --;
                }
            }
    
    
            x1 = x + 1;
            y1 = y;
            existing = exist(x1, y1, size);
            if(existing)
            {
                if( states[i].MyArray[x1][y1].state == 2)
                {
                    states[i].MyArray[x1][y1].state = color;
                    states[i].numbers_of_red ++;   
                    states[i].numbers_of_blue --;
                }
            }
            x1 = x;
            y1 = y + 1;
            
            existing = exist(x1, y1, size);
            if(existing)
            {
                if( states[i].MyArray[x1][y1].state == 2)
                {
                    states[i].MyArray[x1][y1].state = color;
                    states[i].numbers_of_red ++;   
                    states[i].numbers_of_blue --;
                }
            }
    
    
            x1 = x - 1;
            y1 = y + 1;
            existing = exist(x1, y1, size);
            if(existing)
            {
                if( states[i].MyArray[x1][y1].state == 2)
                {
                    states[i].MyArray[x1][y1].state = color;
                    states[i].numbers_of_red ++;   
                    states[i].numbers_of_blue --;
                }
            }
    
    
            x1 = x + 1;
            y1 = y - 1;
            existing = exist(x1, y1, size);
            if(existing)
            {
                if( states[i].MyArray[x1][y1].state == 2)
                {
                    states[i].MyArray[x1][y1].state = color;
                    states[i].numbers_of_red ++;   
                    states[i].numbers_of_blue --;
                }
            }
        }
        else
        {
            x1 = x -1;
            y1 = y;
            existing = exist(x1, y1, size);
            if(existing)
            {
                if( states[i].MyArray[x1][y1].state == 1)
                {
                    states[i].MyArray[x1][y1].state = color;
                    states[i].numbers_of_red --;   
                    states[i].numbers_of_blue ++;
                }
            }
    
            x1 = x;
            y1 = y -1;
            existing = exist(x1, y1, size);
            if(existing)
            {
                if( states[i].MyArray[x1][y1].state == 1)
                {
                    states[i].MyArray[x1][y1].state = color;
                    states[i].numbers_of_red --;   
                    states[i].numbers_of_blue ++;
                }
            }
    
    
            x1 = x -1;
            y1 = y -1;
            existing = exist(x1, y1, size);
            if(existing)
            {
                if( states[i].MyArray[x1][y1].state == 1)
                {
                    states[i].MyArray[x1][y1].state = color;
                    states[i].numbers_of_red --;   
                    states[i].numbers_of_blue ++;
                }
            }
    
    
            x1 = x + 1;
            y1 = y + 1;
            existing = exist(x1, y1, size);
            if(existing)
            {
                if( states[i].MyArray[x1][y1].state == 1)
                {
                    states[i].MyArray[x1][y1].state = color;
                    states[i].numbers_of_red --;   
                    states[i].numbers_of_blue ++;
                }
            }
    
    
            x1 = x + 1;
            y1 = y;
            existing = exist(x1, y1, size);
            if(existing)
            {
                if( states[i].MyArray[x1][y1].state == 1)
                {
                    states[i].MyArray[x1][y1].state = color;
                    states[i].numbers_of_red --;   
                    states[i].numbers_of_blue ++;
                }
            }
    
            x1 = x;
            y1 = y + 1;
            existing = exist(x1, y1, size);
            if(existing)
            {
                if( states[i].MyArray[x1][y1].state == 1)
                {
                    states[i].MyArray[x1][y1].state = color;
                    states[i].numbers_of_red --;   
                    states[i].numbers_of_blue ++;
                }
            }
    
    
            x1 = x - 1;
            y1 = y + 1;
            existing = exist(x1, y1, size);
            if(existing)
            {
                if( states[i].MyArray[x1][y1].state == 1)
                {
                    states[i].MyArray[x1][y1].state = color;
                    states[i].numbers_of_red --;   
                    states[i].numbers_of_blue ++;
                }
            }
    
    
            x1 = x + 1;
            y1 = y - 1;
            existing = exist(x1, y1, size);
            if(existing)
            {
                if( states[i].MyArray[x1][y1].state == 1)
                {
                    states[i].MyArray[x1][y1].state = color;
                    states[i].numbers_of_red --;   
                    states[i].numbers_of_blue ++;
                }
            }
        }  
    }
    
    ///////////////////////////////////////////////////////////////////////

    public static boolean check(Ariies []states,int size,int real_father,int x1,int y1)
    {
        if(x1 > -1 && x1 < size && y1 > -1 && y1 < size)
        {
            if(states[real_father].MyArray[x1][y1].state == 0)
            {
                return true;
            }
        }
        return false;
    }

   ///////////////////////////////////////////////////////////////////////












       public static boolean  making_object_for_red2(Ariies []states,int size,int real_father,int x,int y,int x1 ,int y1 , PriorityQueue<Arrie> ArrieePriorityQueue)
       {    



       
           
           int here;   
           counter++;
           states[counter] = new Ariies();
           states[counter].MyArray(states[real_father].MyArray, size , states[real_father].numbers_of_red,states[real_father].numbers_of_blue);
           if (Math.abs(x-x1) == 2 || Math.abs(y-y1) == 2) 
           {
               states[counter].MyArray[x][y].state = 0;
           }
           else
           {
               states[counter].numbers_of_red ++;
           }
           states[counter].MyArray[x1][y1].state = 1;
           Attack(states, counter, size, x1, y1);
           here = states[counter].numbers_of_blue - states[counter].numbers_of_red;
           ArrieePriorityQueue.add(new Arrie(counter,here));

           if(array_α_and_β[alpha_beta_counter].β > here )
           {
            array_α_and_β[alpha_beta_counter].β = here;
           }
           
           if(array_α_and_β[alpha_beta_counter].α >=  array_α_and_β[alpha_beta_counter].β)
           {
            System.out.println("we used alpha_beta here becuase the Weight α is  "+array_α_and_β[alpha_beta_counter].α+"  and the Weight in last β is   "+array_α_and_β[alpha_beta_counter].β);
            return true;
           }
           
            return false;
       }
    


    ///////////////////////////////////////////////////////////
    public static boolean get_all_possible_for_red2(Ariies []states,int size,int real_father,int x,int y , PriorityQueue<Arrie> ArrieePriorityQueue)
    {
        boolean can_put;
        boolean alpha_beta2;
        int x1;
        int y1;
        x1 = x -1;
        y1 = y;
        can_put = check(states, size, real_father, x1, y1);


        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }

        }

        x1 = x;
        y1 = y -1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }


        x1 = x -1;
        y1 = y -1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }


        x1 = x + 1;
        y1 = y + 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }


        x1 = x + 1;
        y1 = y;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x;
        y1 = y + 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }


        x1 = x - 1;
        y1 = y + 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }


        x1 = x + 1;
        y1 = y - 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }


        x1 = x - 2;
        y1 = y;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }


        x1 = x;
        y1 = y-2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }


        x1 = x + 2;
        y1 = y;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x;
        y1 = y + 2 ;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x + 2;
        y1 = y + 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x + 2 ;
        y1 = y - 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x - 2;
        y1 = y - 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x - 2;
        y1 = y + 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x + 1;
        y1 = y + 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x -1;
        y1 = y + 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x + 1;
        y1 = y - 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x - 1;
        y1 = y - 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x + 2;
        y1 = y + 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x + 2;
        y1 = y - 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x - 2;
        y1 = y + 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x - 2;
        y1 = y - 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_red2(states, size, real_father,x,y ,x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
               return  true;
            }
        }
        return false;

    }
    ////////////////////////////////////////////////////////////
    public static int min2(Ariies []states,int size,int real_father,int real_alpha_father)
    {

        PriorityQueue<Arrie> ArrieePriorityQueue = new PriorityQueue<>();
        boolean alpha_beta2;


        making_alpha_beta_object(real_alpha_father);
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                
                if(states[real_father].MyArray[i][j].state == 1)
                {
                    alpha_beta2 = get_all_possible_for_red2(states, size, real_father, i, j, ArrieePriorityQueue);
                    if(alpha_beta2)
                    {
                        Arrie the_lowest = new Arrie();
                        the_lowest= ArrieePriorityQueue.remove();
                        return the_lowest.distance;
                    }
                }
            }
        }   
        if(ArrieePriorityQueue.isEmpty())
        {
            return states[real_father].numbers_of_blue - states[real_father].numbers_of_red;
        }
        
         Arrie the_lowest = new Arrie();
        the_lowest= ArrieePriorityQueue.remove();
        return the_lowest.distance;
    }











       ///////////////////////////////////////////////////////////////////////


       public static boolean  making_object_for_red(Ariies []states,int size,int real_father,int real_alpha_father,int x,int y,int x1 ,int y1 , PriorityQueue<Arrie> ArrieePriorityQueue)
       {   
           
        
             alpha_id_and_ditance id_and_ditance = new alpha_id_and_ditance();

           counter++;
           states[counter] = new Ariies();
           states[counter].MyArray(states[real_father].MyArray, size , states[real_father].numbers_of_red,states[real_father].numbers_of_blue);
           if (Math.abs(x-x1) == 2 || Math.abs(y-y1) == 2) 
           {
               states[counter].MyArray[x][y].state = 0;
           }
           else
           {
               states[counter].numbers_of_red ++;
           }
           states[counter].MyArray[x1][y1].state = 1;
           Attack(states, counter, size, x1, y1);



           int the_id_here = alpha_beta_counter;
           id_and_ditance = max2(states, size, counter, the_id_here);  
           System.out.println(id_and_ditance.distance);
           System.out.println("------------------------"); 
           int son = id_and_ditance.id;        
            ArrieePriorityQueue.add(new Arrie(counter,id_and_ditance.distance));


     


            if(array_α_and_β[real_alpha_father].β > array_α_and_β[son].α )
            {
                 array_α_and_β[real_alpha_father].β = array_α_and_β[son].α ;


                 if(array_α_and_β[real_alpha_father].β > array_α_and_β[son].β)
                 {
                   array_α_and_β[real_alpha_father].β = array_α_and_β[son].β ;
                 }
            }
            else if(array_α_and_β[real_alpha_father].β > array_α_and_β[son].β)
            {
              array_α_and_β[real_alpha_father].β = array_α_and_β[son].β ;
            }


            if(array_α_and_β[real_alpha_father].α >=  array_α_and_β[real_alpha_father].β)
           {
            System.out.println("we used alpha_beta here becuase the Weight α is  "+array_α_and_β[real_alpha_father].α+"  and the Weight in last β is   "+array_α_and_β[real_alpha_father].β);
            return true;
           }
         
            return false;


 
       }
    
      ///////////////////////////////////////////////////////////

      public static boolean get_all_possible_for_red(Ariies []states,int size,int real_father,int real_alpha_father,int x,int y , PriorityQueue<Arrie> ArrieePriorityQueue)
      {
          boolean can_put;
          boolean alpha_beta2;
          int x1;
          int y1;
  
          making_alpha_beta_object(real_alpha_father);



          x1 = x -1;
          y1 = y;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
          x1 = x;
          y1 = y -1;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
  
          x1 = x -1;
          y1 = y -1;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
  
          x1 = x + 1;
          y1 = y + 1;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
  
          x1 = x + 1;
          y1 = y;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
          x1 = x;
          y1 = y + 1;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
  
          x1 = x - 1;
          y1 = y + 1;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
  
          x1 = x + 1;
          y1 = y - 1;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
  
          x1 = x - 2;
          y1 = y;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
  
          x1 = x;
          y1 = y-2;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
  
          x1 = x + 2;
          y1 = y;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
          x1 = x;
          y1 = y + 2 ;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
          x1 = x + 2;
          y1 = y + 2;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
          x1 = x + 2 ;
          y1 = y - 2;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
          x1 = x - 2;
          y1 = y - 2;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
          x1 = x - 2;
          y1 = y + 2;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
          x1 = x + 1;
          y1 = y + 2;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
          x1 = x -1;
          y1 = y + 2;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
          x1 = x + 1;
          y1 = y - 2;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
          x1 = x - 1;
          y1 = y - 2;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
          x1 = x + 2;
          y1 = y + 1;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
          x1 = x + 2;
          y1 = y - 1;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
          x1 = x - 2;
          y1 = y + 1;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
  
          x1 = x - 2;
          y1 = y - 1;
          can_put = check(states, size, real_father, x1, y1);
          if(can_put)
          {
            alpha_beta2 =  making_object_for_red(states, size, real_father, real_alpha_father, x, y, x1, y1, ArrieePriorityQueue);
            if(alpha_beta2)
            {
                return true;
            }
          }
          return false;
  
      }
      ////////////////////////////////////////////////////////////

      public static alpha_id_and_ditance min(Ariies []states,int size,int real_father,int real_alpha_father)
      {
         boolean alpha_beta2;
          PriorityQueue<Arrie> ArrieePriorityQueue = new PriorityQueue<>();
          alpha_id_and_ditance id_and_ditance = new alpha_id_and_ditance();
          making_alpha_beta_object(real_alpha_father);
          id_and_ditance.id = alpha_beta_counter;

          for(int i=0;i<size;i++)
          {
              for(int j=0;j<size;j++)
              {
                  
                  if(states[real_father].MyArray[i][j].state == 1)
                  {
                    alpha_beta2 =  get_all_possible_for_red(states, size, real_father,real_alpha_father, i, j, ArrieePriorityQueue);
                    if(alpha_beta2)
                    {
                         
                        Arrie the_lowest = new Arrie();
                        the_lowest= ArrieePriorityQueue.remove(); 
                        id_and_ditance.distance = the_lowest.distance;
                        return id_and_ditance;
                    }
                  }
              }
          }   
  
          if(ArrieePriorityQueue.isEmpty())
          {
            id_and_ditance.distance = 9999;
            return id_and_ditance;
          }
           Arrie the_lowest = new Arrie();
          the_lowest= ArrieePriorityQueue.remove();
    
          id_and_ditance.distance = the_lowest.distance;
          return id_and_ditance;
      }

          ///////////////////////////////////////////////////////////////////////














          ////////////////////////////////////////////////////////////////////////

          public static boolean making_object_for_blue2(Ariies []states,int size,int real_father,int real_alpha_father,int x,int y,int x1 ,int y1 , PriorityQueue<Arrie> queue)
          {    
              int here;   
              int right_counter;
              counter++;
              right_counter = counter;
              states[counter] = new Ariies();
              states[counter].MyArray(states[real_father].MyArray, size , states[real_father].numbers_of_red,states[real_father].numbers_of_blue);
              if (Math.abs(x-x1) == 2 || Math.abs(y-y1) == 2) 
              {
                  states[counter].MyArray[x][y].state = 0;
              }
              else
              {
                  states[counter].numbers_of_blue ++;
              }
              states[counter].MyArray[x1][y1].state = 2;
              Attack(states, counter, size, x1, y1);
              here = min2(states, size, counter,real_alpha_father);
              int son = alpha_beta_counter;
              queue.offer(new Arrie(right_counter,here));

              if(array_α_and_β[real_alpha_father].α < array_α_and_β[son].α )
              {
                   array_α_and_β[real_alpha_father].α = array_α_and_β[son].α ;


                   if(array_α_and_β[real_alpha_father].α < array_α_and_β[son].β)
                   {
                     array_α_and_β[real_alpha_father].α = array_α_and_β[son].β ;
                   }
              }
              else if(array_α_and_β[real_alpha_father].α < array_α_and_β[son].β)
              {
                array_α_and_β[real_alpha_father].α = array_α_and_β[son].β ;
              }


            if(array_α_and_β[real_alpha_father].α >=  array_α_and_β[real_alpha_father].β)
           {
            System.out.println("we used alpha_beta here becuase the Weight α is  "+array_α_and_β[real_alpha_father].α+"  and the Weight in last β is   "+array_α_and_β[real_alpha_father].β);
            return true;
           }
           return false;
          }
      
          ///////////////////////////////////////////////////////////////////////



        
    public static boolean get_all_possible_for_blue2(Ariies []states,int size,int real_father,int real_alpha_father,int x,int y , PriorityQueue<Arrie> queue)
    {
        boolean can_put,alpha_beta2;
        int x1;
        int y1;



        x1 = x -1;
        y1 = y;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x;
        y1 = y -1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }


        x1 = x -1;
        y1 = y -1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }


        x1 = x + 1;
        y1 = y + 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }


        x1 = x + 1;
        y1 = y;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x;
        y1 = y + 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }


        x1 = x - 1;
        y1 = y + 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }


        x1 = x + 1;
        y1 = y - 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }


        x1 = x - 2;
        y1 = y;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }


        x1 = x;
        y1 = y-2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }


        x1 = x + 2;
        y1 = y;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x;
        y1 = y + 2 ;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x + 2;
        y1 = y + 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x + 2 ;
        y1 = y - 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x - 2;
        y1 = y - 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x - 2;
        y1 = y + 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x + 1;
        y1 = y + 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x -1;
        y1 = y + 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x + 1;
        y1 = y - 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x - 1;
        y1 = y - 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x + 2;
        y1 = y + 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x + 2;
        y1 = y - 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x - 2;
        y1 = y + 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        x1 = x - 2;
        y1 = y - 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 = making_object_for_blue2(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
               return  true;
            }
        }

        return false;

    }

    
    ////////////////////////////////////////////////////////////////

    public static alpha_id_and_ditance max2(Ariies []states,int size,int real_father,int real_alpha_father)
    {
        PriorityQueue<Arrie> queue = new PriorityQueue<>(10, Collections.reverseOrder());
        
        boolean alpha_beta2;
        alpha_id_and_ditance id_and_ditance = new alpha_id_and_ditance();
        making_alpha_beta_object(real_alpha_father);
        id_and_ditance.id = alpha_beta_counter;

          for(int i=0;i<size;i++)
          {
              for(int j=0;j<size;j++)
              {
                  
                  if(states[real_father].MyArray[i][j].state == 2)
                  {
                    alpha_beta2 =  get_all_possible_for_blue2(states, size, real_father,id_and_ditance.id, i, j, queue);
                    if(alpha_beta2)
                    {
                        Arrie the_highest = new Arrie();
                        the_highest = queue.poll(); 
                        id_and_ditance.distance = the_highest.distance;
                        return id_and_ditance;
                    }
                  }
              }
          }   
          if(queue.isEmpty())
          {
            id_and_ditance.distance = 9999;
          return id_and_ditance;
          }
          Arrie the_highest = new Arrie();
          the_highest = queue.poll(); 
          id_and_ditance.distance = the_highest.distance;
          System.out.println(id_and_ditance.distance);
          return id_and_ditance;
    }









    



    //////////////////////////////////////////////////////////////////



    

    public static boolean making_object_for_blue(Ariies []states,int size,int real_father,int real_alpha_father,int x,int y,int x1 ,int y1 , PriorityQueue<Arrie> queue)
    {    

        alpha_id_and_ditance id_and_ditance = new alpha_id_and_ditance(); 
        int right_counter;
        counter++;
        right_counter = counter;
        states[counter] = new Ariies();
        states[counter].MyArray(states[real_father].MyArray, size , states[real_father].numbers_of_red,states[real_father].numbers_of_blue);
        if (Math.abs(x-x1) == 2 || Math.abs(y-y1) == 2) 
        {
            states[counter].MyArray[x][y].state = 0;
        }
        else
        {
            states[counter].numbers_of_blue ++;
        }
        states[counter].MyArray[x1][y1].state = 2;
        Attack(states, counter, size, x1, y1);

        int the_id_here = real_alpha_father;
        if(level_of_hard ==1)
        {
            id_and_ditance.distance = min2(states, size, counter,the_id_here);
            id_and_ditance.id = alpha_beta_counter;
        }
        else
        {
            id_and_ditance = min(states, size, counter,the_id_here);
            
        }
        int son = id_and_ditance.id; 
        queue.offer(new Arrie(right_counter,id_and_ditance.distance));




        if(array_α_and_β[real_alpha_father].α < array_α_and_β[son].α )
        {
             array_α_and_β[real_alpha_father].α = array_α_and_β[son].α ;


             if(array_α_and_β[real_alpha_father].α < array_α_and_β[son].β)
             {
               array_α_and_β[real_alpha_father].α = array_α_and_β[son].β ;
             }
        }
        else if(array_α_and_β[real_alpha_father].α < array_α_and_β[son].β)
        {
          array_α_and_β[real_alpha_father].α = array_α_and_β[son].β ;
        }



      if(array_α_and_β[real_alpha_father].α >=  array_α_and_β[real_alpha_father].β)
     {
      System.out.println("we used alpha_beta here becuase the Weight α is  "+array_α_and_β[real_alpha_father].α+"  and the Weight in last β is   "+array_α_and_β[real_alpha_father].β);
      return true;
     }
     return false;

    }




    ///////////////////////////////////////////////////////////////////////
        
    public static boolean get_all_possible_for_blue(Ariies []states,int size,int real_father,int real_alpha_father,int x,int y , PriorityQueue<Arrie> queue)
    {
        boolean can_put;
        boolean alpha_beta2;
        int x1;
        int y1;
        x1 = x -1;
        y1 = y;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }

        }

        x1 = x;
        y1 = y -1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }


        x1 = x -1;
        y1 = y -1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }


        x1 = x + 1;
        y1 = y + 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }


        x1 = x + 1;
        y1 = y;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }

        x1 = x;
        y1 = y + 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }


        x1 = x - 1;
        y1 = y + 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }


        x1 = x + 1;
        y1 = y - 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }


        x1 = x - 2;
        y1 = y;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }


        x1 = x;
        y1 = y-2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }


        x1 = x + 2;
        y1 = y;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }

        x1 = x;
        y1 = y + 2 ;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }

        x1 = x + 2;
        y1 = y + 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }

        x1 = x + 2 ;
        y1 = y - 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }

        x1 = x - 2;
        y1 = y - 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }

        x1 = x - 2;
        y1 = y + 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }

        x1 = x + 1;
        y1 = y + 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }

        x1 = x -1;
        y1 = y + 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }

        x1 = x + 1;
        y1 = y - 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }

        x1 = x - 1;
        y1 = y - 2;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }

        x1 = x + 2;
        y1 = y + 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }

        x1 = x + 2;
        y1 = y - 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }

        x1 = x - 2;
        y1 = y + 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }

        x1 = x - 2;
        y1 = y - 1;
        can_put = check(states, size, real_father, x1, y1);
        if(can_put)
        {
            alpha_beta2 =  making_object_for_blue(states, size, real_father,real_alpha_father,x,y ,x1, y1, queue);
            if(alpha_beta2)
            {
                return true;
            }
        }
        return false;

    }

    
    ////////////////////////////////////////////////////////////////

    public static int max(Ariies []states,int size,int real_father)
    {
        PriorityQueue<Arrie> queue = new PriorityQueue<>(10, Collections.reverseOrder());

        boolean alpha_beta2;
        making_alpha_beta_object(0);
        int id = alpha_beta_counter;

          for(int i=0;i<size;i++)
          {
              for(int j=0;j<size;j++)
              {
                  
                  if(states[real_father].MyArray[i][j].state == 2)
                  {
                    alpha_beta2 = get_all_possible_for_blue(states, size, real_father,id, i, j, queue);
                    if(alpha_beta2)
                    {
                        Arrie the_highest = new Arrie();
                        the_highest = queue.poll(); 
                        states[the_highest.id].printl();
                        return the_highest.id; 
                    }
                  }
              }
          }   

          if(queue.isEmpty())
          {
            return -1;
          }
          Arrie the_highest = new Arrie();
          the_highest = queue.poll(); 
          states[the_highest.id].printl();

         
          return the_highest.id;
    }

    /////////////////////////////////////////////////////////////////////////








    
  
    public static void moving(Ariies []states , int real_father,int size,int x,int y,int x1,int y1,int color) 
    {
        counter++;
        states[counter] = new Ariies();
        states[counter].MyArray(states[real_father].MyArray, size , states[real_father].numbers_of_red,states[real_father].numbers_of_blue);
        if (Math.abs(x-x1) == 2 || Math.abs(y-y1) == 2) 
        {
            states[counter].MyArray[x][y].state=0; 
            states[counter].MyArray[x1][y1].state=color; 
                      
        }
        else 
        {
           states[counter].MyArray[x1][y1].state=color;
            states[counter].numbers_of_red ++; 
        }
        Attack(states, counter, size, x1, y1);
        states[counter].printl();
    }
    
    
    /////////////////////////////////////////////////////////////////////////

    public static void end(Ariies []states, int size,int real_father,int the_color)
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                
                if(states[real_father].MyArray[i][j].state == 0)
                {
                    states[real_father].MyArray[i][j].state = the_color;
                    if(the_color ==2)
                    {
                        states[real_father].numbers_of_blue ++;
                    }
                    else
                    {
                        states[real_father].numbers_of_red ++;
                    }
                }
            }
        }

        states[real_father].printl();
        if(states[real_father].numbers_of_blue > states[real_father].numbers_of_red)
        {  
            System.out.println("you have lost the game");
        }
        else if(states[real_father].numbers_of_blue < states[real_father].numbers_of_red)
        {
            System.out.println("you have won the game");
        }
        else 
        {
            System.out.println("its even");
        }

    }

    public static void main(String[] args) {
        int next_statments;
        boolean player = true;

        array_α_and_β = new α_and_β[4000];
        array_α_and_β[alpha_beta_counter] = new α_and_β(-100000, 100000);
        Scanner myInput = new Scanner(System.in);

        System.out.println("enter 1 to play in easy mood or 2 to play in a hard mode");
        level_of_hard =  myInput.nextInt();  

        System.out.println("plz enter the size");
        int size = myInput.nextInt();        
        piece [][] MyArray = new piece [size][size];
        for (int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                MyArray[i][j] = new piece();
                MyArray[i][j].state=0;            
            }
        }
        MyArray[0][0].state = 1;
        MyArray[0][size -1].state = 2;
        MyArray[size -1][0].state = 1;
        MyArray[size -1][size -1].state = 2;
        Ariies []states = new Ariies [400000];
        states[counter] = new Ariies();
        states[counter].MyArray(MyArray, size,2,2);
        states[counter].printl();    
        next_statments = counter;
        while(true)
        {
            if(player == true)
            {
                System.out.println("enter the soldier you want to use or -1 to pass\n");
                int x = myInput.nextInt();
                if(x == -1)
                {
                    end(states, size,next_statments,2);
                    myInput.close();
                    return ;
                }
                int y = myInput.nextInt();
                
                System.out.println("enter the place\n");
                int x1 = myInput.nextInt();
                int y1 = myInput.nextInt();
                if (Math.abs(x-x1) > 2 || Math.abs(y-y1) > 2 || states[next_statments].MyArray[x1][y1].state !=0 || states[next_statments].MyArray[x][y].state != 1) 
                {
                    System.out.println("you cant move like that");
                }
                else
                {
                    moving(states,next_statments, size, x, y, x1, y1,1);
    
                    player = false;

                }
            }
            else
            { 
                if(states[counter].numbers_of_blue == 0 )
                {
                    System.out.println("you have won the game");
                    myInput.close();
                    return ;
                }
                next_statments=max(states, size, counter);
                if(next_statments == -1)
                {
                    end(states, size,counter , 1);
                }

                if(states[next_statments].numbers_of_red == 0 )
                {
                    System.out.println("you have lost the game");
                    myInput.close();
                    return ;
                }
                

                player = true;
            }
        }     
    }
}