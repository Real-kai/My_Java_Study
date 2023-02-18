package static_;

/**
 * @author 王凯
 * @version 1.0
 */
public class StaticMethod {
    public static void main(String[] args) {
        Student tom = new Student("Tom");
        Student.payFee(3000);
        Student rose = new Student("rose");
        Student.payFee(3000);
        Student jack = new Student("jack");
        Student.payFee(3000);
        Student.showFee();

        System.out.println("a+b的和是:"+ MyTools.sum(30,2317372));

        int [] arr={12,10,9,8,7,6,120,520,1000,1};
        MyTools.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

class MyTools{
    public static double sum(double a,double b){
        return a+b;
    }

    public static void  sort(int [] arr){
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
class Student{
    private String name;
    private static double fee = 0;

    public Student(String name) {
        this.name = name;
    }

    public static void payFee(double fee){
        Student.fee += fee;
    }

    public static void showFee(){
        System.out.println("学费总共是:"+fee+"元");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
