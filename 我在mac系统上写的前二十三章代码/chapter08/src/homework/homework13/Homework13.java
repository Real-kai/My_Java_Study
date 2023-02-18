package homework.homework13;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework13 {
    public static void main(String[] args) {
        Person[] arr = new Person[4];
        arr[0] = new Student("jack",18,'男',23);
        arr[1] = new Student("rose",17,'女',10);
        arr[2] = new Teacher("tom",34,'男',10);
        arr[3] = new Teacher("jerry",55,'女',30);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Homework13 homework13 = new Homework13();
        homework13.sort(arr);

        System.out.println("========下面是按照年龄从大到小========");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("===================");

        for (int i = 0; i < arr.length; i++) {
            homework13.study(arr[i]);
        }

    }
    public void sort(Person[] arr){
        Person temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j].getAge()<arr[j+1].getAge()){
                    temp = arr[j];arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    public void study(Person person){
            if (person instanceof Teacher){
                Teacher t = (Teacher) person;
                t.teach();
            }
            else if (person instanceof Student){
                Student s = (Student) person;
                s.study();
            }
            else {
                System.out.println("do nothing......");
            }
    }
}
