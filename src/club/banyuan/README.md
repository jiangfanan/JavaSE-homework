1.
class Base {
    final public void show() {
       System.out.println("Base::show() called");
    }
}
  
class Derived extends Base {
    public void show() {
       System.out.println("Derived::show() called");
    }
}
  
class Main {
    public static void main(String[] args) {
        Base b = new Derived();;
        b.show();
    }
}
输出结果：编译出错，final修饰的方法，子类中不能重名。


2.class Base {
      public static void show() {
         System.out.println("Base::show() called");
      }
  }
    
  class Derived extends Base {
      public static void show() {
         System.out.println("Derived::show() called");
      }
  }
    
  class Main {
      public static void main(String[] args) {
          Base b = new Derived();;
          b.show();
      }
  }
 输出结果： Base::show() called
 
 
 3.class Base {
       public void Print() {
           System.out.println("Base");
       }         
   }
    
   class Derived extends Base {    
       public void Print() {
           System.out.println("Derived");
       }
   }
    
   class Main{
       public static void DoPrint( Base o ) {
           o.Print();   
       }
       public static void main(String[] args) {
           Base x = new Base();
           Base y = new Derived();
           Derived z = new Derived();
           DoPrint(x);
           DoPrint(y);
           DoPrint(z);
       }
   }
   输出结果： Base
            Derived
            Derived
            
 4. class Base {
        public void foo() { System.out.println("Base"); }
    }
      
    class Derived extends Base {
        private void foo() { System.out.println("Derived"); } 
    }
      
    public class Main {
        public static void main(String args[]) {
            Base b = new Derived();
            b.foo();
        }
    } 

输出结果：  编译错误，父类为public，子类为private，访问权限变小了

 5.public class NewClass { 
   	public static class superclass { 
   		static void print() 
   		{ 
   			System.out.println("print in superclass."); 
   		} 
   	} 
   	public static class subclass extends superclass { 
   		static void print() 
   		{ 
   			System.out.println("print in subclass."); 
   		} 
   	} 
   	public static void main(String[] args) 
   	{ 
   		superclass A = new superclass(); 
   		superclass B = new subclass(); 
   		A.print(); 
   		B.print(); 
   	} 
   } 
   输出结果：   print in superclass.
              print in superclass.
              
              
 6.public class NewClass { 
   	public static class superclass { 
   		void print() 
   		{ 
   			System.out.println("print in superclass."); 
   		} 
   	} 
   	public static class subclass extends superclass { 
   		@Override
   		void print() 
   		{ 
   			System.out.println("print in subclass."); 
   		} 
   	} 
   	public static void main(String[] args) 
   	{ 
   		superclass A = new superclass(); 
   		superclass B = new subclass(); 
   		A.print(); 
   		B.print(); 
   	} 
   }     
   输出结果：        print in superclass.
                   print in subclass.
 
 7.class ClassOne
   { 
       protected void getData() 
       { 
           System.out.println("Inside ClassOne");
       } 
   } 
   class ClassTwo extends ClassOne
   { 
       protected void getData() 
       { 
           System.out.println("Inside ClassTwo");
       } 
   } 
     
   public class Test 
   { 
       public static void main(String[] args) 
       { 
           ClassOne obj = new ClassTwo();
           obj.getData(); 
       } 
   } 
   
   输出结果：Inside ClassTwo
   
   
  8.class Test 
    { 
        void myMethod() 
        { 
            System.out.println("Test");
        } 
    } 
    class Derived extends Test
    { 
        void myMethod() 
        { 
            System.out.println("Derived");
        }    
        public static void main(String[] args) 
        { 
            Derived object = new Test(); 
            object.myMethod(); 
        } 
    } 
    
   输出结果：编译错误   子类引用不能指向父类实例对象
   
   

  
  9.class ClassOne
     { 
         protected void getData() 
         { 
             System.out.println("Inside ClassOne");
         } 
     } 
     class ClassTwo extends ClassOne
     { 
         protected void getData() 
         { 
             System.out.println("Inside ClassTwo");
         }    
         protected void getValue() 
         { 
             System.out.println("ClassTwo");
         } 
     } 
     public class Test 
     { 
         public static void main(String[] args) 
         { 
             ClassOne obj = new ClassTwo();
             obj.getValue(); 
         } 
     }   
     输出结果：编译错误  getValue()方法父类中没有