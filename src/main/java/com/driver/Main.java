package com.driver;

 class A {
   static  String meth(){
        return  "Invoking method from class A";
    }
}
class B extends A{
  @Override
    String meth(){
        return  "Method is overridden in Extendend class B";
    }

}
public class Main {
  public static void main(String[] args){
    B ex=new B();
    System.out.println(ex.meth());
  }
  
}
