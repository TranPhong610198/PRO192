package Test20_2_2024;

//import java.util.*;
//    class A {
//        public int i;  protected int j;
//    }    
//    class B extends A {
//        int j;
//        void display() {
//            super.j = 3;
//            System.out.println(i + " " + j);
//        }
//    } 
//public class Main {
//    public static void main(String args[]) {
//        B obj = new B();
//        obj.i=1; obj.j=2;   
//        obj.display();     
//    }
//}

//              class A {
//                   int i;
//                  public void display() {
//                       System.out.println(i);
//                   }    
//               }    
//
//               class B extends A {
//                   int j;
//                   public void display() {
//                  System.out.println(j);
//               }
//           }    
//
//           class Main {
//               public static void main(String args[])  {
//                   B obj2 = new B();
//                   obj2.i = 1; obj2.j = 2;
//                   A r;  r = obj2;  r.display();     
//               }
//          }


//               class A {
//                   public void display() {
//                       System.out.println("A");
//                   }    
//               }    
//
//               class B extends A {
//                   public void display() {
//                       System.out.println("B");
//                  }
//           }    
//
//           class Main {
//               public static void main(String args[])  {
//                   A obj1 = new A();   B obj2 = new B();
//                   A r;  r = obj1;  r.display();
//                   r = obj2;  r.display();     
//               }
//          }

//               class A {
//                   public int i;
//                   private int j;
//               }    
//
//               class B extends A {
//                   void display() {
//                       super.j = super.i + 1;
//                       System.out.println(super.i + " " + super.j);
//                   }
//           }    
//
//           class Main {
//               public static void main(String args[])  {
//                   B obj = new B();
//                   obj.i=1;  obj.j=2;   
//                   obj.display();     
//               }
//          }

//               class overload {
//                   int x, y;
//                   void add(int a){
//                       x =  a + 1;
//                   }
//                   void add(int a , int b){
//                       x =  a + 2;
//                   }        
//           }    
//
//           class Overload_methods {
//               public static void main(String args[]) {
//                  overload obj = new overload();   
//                   int a = 0;
//                   obj.add(6, 7);
//                   System.out.println(obj.x);     
//               }
//          }

   class overload {
      int x, y;
      void add(int a) {
          x =  a + 1;
       }
      void add(int a, int b){
          x =  a + 2;
       }        
   }    

   class Main {
       public static void main(String args[]) {
          overload obj = new overload();   
          int a = 0;
         obj.add(6);
          System.out.println(obj.x);     
        }
   }   
