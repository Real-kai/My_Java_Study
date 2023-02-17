package Annotation.homework;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
    CellPhone cellPhone = new CellPhone();
    cellPhone.testWork(new ICalculate() {
        @Override
        public double work(double n1, double n2) {
            return n1*n2;
        }
    },21,356);
    cellPhone.testWork(new ICalculate() {
        @Override
        public double work(double n1, double n2) {
            return n1+n2;
        }
    },20,50);
}}
interface ICalculate{
    double work(double n1,double n2);
}
class CellPhone{
    public void testWork(ICalculate iCalculate,double n1,double n2){

        System.out.println("运算之后的结果是:" +iCalculate.work(n1,n2));
    }
}
