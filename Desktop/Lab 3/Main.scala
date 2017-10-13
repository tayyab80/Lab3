

object Main 
{
  def main(args: Array[String]) 
  {
     // println("Hello, world!") // prints Hello World
        var arr=List(1,34,5,6,3);
        LastNth(2,arr);
        Prime(4);
  }
  
 def LastNth(index: Int , list: List[Int] ) : Int = {
   
   val right = list.takeRight(index)
	val a =right(0)
	println(a);
   return a
   }
 
 
  def AND(a:Boolean,b:Boolean):Any=
  
  {
    if((a==true) && (b==true))
    {
      return true;
    }
    else if ((a==true) && (b==false))
    {
      return false;
    }
    else if ((a==false) && (b==true))
    {
      return false;
    }
    else if ((a==false) && (b==false))
    {
      return false;
    }
  }
  
  
  def XOR(a:Boolean,b:Boolean):Any=
  {
    if((a==true) && (b==true))
    {
      
      return false;
    }
    
    else if((a==true) && (b==false))
    {
      
      return true;
    }
    
    else if((a==false) && (b==true))
    {
      
      return true;
    }
    
    else if((a==false) && (b==false))
    {
      
      return true;
    }
   
    
  }
  
   def NAND(a:Boolean,b:Boolean):Any=
  
  {
    if((a==true) && (b==true))
    {
      return false;
    }
    
    else if ((a==true) && (b==false))
    {
      return true;
    }
    
    else if ((a==false) && (b==true))
    {
      return true;
    }
    
    else if ((a==false) && (b==false))
    {
      return true;
    }
    
    
  }
  
   
   def Prime(num:Int):Boolean=
   {
     if(num<2)
     {
       println("Not Prime");
      return false
      
     }
     
     else if (num ==2 )
     {
        println("Prime");
       true
     }
      
     else
     {
       
      if(true== !(2 to (num-1) ).exists(y =>num %y==0))
      {
         println("Prime");
        return true;
      }
      
      else 
        
        {
        println("Not Prime");
        return false;
         
        }
        
       
     }
     
     
     
   
   
   
   }
  
}