package cn.hp.exception;

import javax.servlet.GenericServlet;
import javax.servlet.http.HttpServlet;
import java.io.FileNotFoundException;

class Test2{
    public int fun(){
        int a = 10 ;
        try {
//            int i = a /0 ;
            return a++ ;  // 执行完毕 暂存区 return 10 ;  a = 11 ;
        }catch (RuntimeException e){
            return  a ;  // 暂存区  return 10 ; //被干掉
        }finally {
            ++a ; // a = 11
            System.out.println("aaaa" + a);
//            return  a ; // return 11 ;
        }
    }
}

public class Test01 {
    public static void main(String[] args) throws RuntimeException{

        int fun = new Test2().fun();
        System.out.println("fun" + fun);

        // 程序由上往下执行， 执行的是 主线程， main方法的线程，
//         异常走的是一个新的子线程，这个线程会慢于主线程 ；

//        Staff staff = new Staff();
//        staff.work();

//        Grandma zs = new Grandma();
//        try {
//            zs.crossTheStreet();
//        }catch (RuntimeException e){
//            System.out.println("送去医院");
//        }

//        System.out.println("上课！");

//        try {
//            Student.class.newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }

//        Student zs = new Student("zs");
//        Person person = new Staff() ;
//        Student zs1 =  (Student) person;
//
//
//        int i = 1 /0 ;
//
//        int[] arr = {'z',2,4,5,6,7,1};
//        System.out.println(arr[10]);


//        Person person = null ;

//        Class.forName("com.mysql.jdbc.Driver");
//
//        Student yantao = (Student) person ;
//
//        yantao = new Student() ;

//        yantao = null ;

//        Student zs = new Student() ;
//        try {
//            System.out.println("准备开吃");
//            zs.eat();
//            System.out.println("吃完");
//        }catch ( RuntimeException r){
//            System.out.println("张三 gg ");
//        }
//
//        System.out.println("吃完上课");
//
//        yantao.eat();
//        if( 是否存在 RuntimeException ){
//            System.out.println("张三 gg ");
//        }else{
//            zs.eat();
//        }

    }
}


class Staff extends Person{

    public void work(){

        try {
            System.out.println("异常");
            Class.forName("");
        }catch (ClassNotFoundException e){
//            直接做其他处理
            System.out.println("其他处理");
//            打印当前异常
            e.printStackTrace();
        }
        System.out.println("下面操作");
    }
}

class Student extends Person{

    private Student(){

    }
    public void eat(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (Exception e){
            System.out.println("Exception");
        }

//        int i = 1/0 ;
        System.out.println("吃饭");
    }

}

class Person{
    String name ;
    String sex ;
    int age ;
}

class Grandma{
    public int crossTheStreet(){
        throw new RuntimeException();   // 产生一个异常
//        System.out.println("aaa");
    }
}

interface Rule{

//    抽象方法，  abstract  因为接口中的方法必须被实现，所以需要使用公共权限修饰符 public
    String study();
}


