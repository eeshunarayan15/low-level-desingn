package Lesson3.Interface.multipleInterface;

public class D implements  A , B {

    @Override
    public void print() {
        A.super.print();
        B.super.print();
        System.out.println("from d");
    }
}
