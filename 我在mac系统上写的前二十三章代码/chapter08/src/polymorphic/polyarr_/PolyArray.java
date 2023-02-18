package polymorphic.polyarr_;

/**
 * @author 王凯
 * @version 1.0
 */
public class PolyArray {
    public static void main(String[] args) {

        //向上转型
        Person p1 = new Student("张三",17,80);
        Person p2 = new Teacher("韩顺平",45,25000);
        Person p3 = new Student("王凯",25,100);
        Person p4 = new Teacher("韩小平",56,35000);
        Person p5 = new Person("smith",30);

        Person[] arr = {p1,p2,p3,p4,p5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].say());
        }

        System.out.println("=================");

        //向下转型
//        Student stu1 = (Student)arr[0];
//        Student stu2 = (Student)arr[2];
//        Teacher t1 = (Teacher)arr[1];
//        Teacher t2 = (Teacher)arr[3];
//
//        stu1.study();
//        stu2.study();
//        t1.teach();
//        t2.teach();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] instanceof Student){
                ((Student)arr[i]).study();
            } else if (arr[i] instanceof Teacher) {
                ((Teacher)arr[i]).teach();
            }
        }
    }

}
