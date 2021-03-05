class A extends Thread{
public void run(){
System.out.println("Hello");
}
}

class B extends Thread{
public void run(){
System.out.println("Heyy");
}
}

class C extends Thread{
public void run(){
System.out.println("Welcome");
}
}

class MultiThreading{
public static void main(String args[]){
A a1 = new A();
B b1 = new B();
C c1 = new C();

a1.start();
b1.start();
c1.start();
try{
a1.sleep(500);
//b1.sleep(600);
//c1.sleep(700);
}catch(Exception e)
{
System.out.println(e);
}
}
}