package com.driver;


public class Main {
  static class A{
    String meth(){
      return "Invoking method from class A";
    }
  }
  static class B extends A{
    @Override
    String meth(){
     return  "Method is overridden in Extendend class B";
    }
  }
  public static void main(String[] args){
    B b=new B();
    A a=new A();
//    System.out.println(a.meth());
    System.out.println(b.meth());
  }
  
}
