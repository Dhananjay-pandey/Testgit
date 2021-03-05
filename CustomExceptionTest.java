class MyException extends Exception{
}

class CustomExceptionTest{
public static void checkAge(int age) throws MyException{
if(age<18)
throw new MyException();
else
System.out.println("Eligible to vote..!!");
}

public static void main(String args[]){
try{
checkAge(14);
}
catch(MyException m)
{
System.out.println(m);
}
}
}