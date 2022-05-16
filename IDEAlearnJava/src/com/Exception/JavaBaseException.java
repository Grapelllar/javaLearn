package com.Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class JavaBaseException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            int a = s.nextInt();
        }catch (InputMismatchException e){
            System.out.println("a");
        }
    }
}

//从RuntimeException派生BaseException
class BaseException extends RuntimeException{
    public BaseException(){
        super();
    }

    public BaseException(String message, Throwable cause){
        super(message,cause);
    }

    public BaseException(String message){
        super(message);
    }

    public BaseException(Throwable cause){
        super(cause);
    }
}

//从BaseException派生自定义异常
class UserNotFoundException extends BaseException{

}


