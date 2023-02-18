package reflection.ClassLoad;

/**
 * @author 王凯
 * @version 1.0
 */
public class SuanFa {
    public static void main(String[] args) {
       //1.
//        int [] arrayA = new int[100];
//        int [] arrayB = new int[100];
//        int [] arrayC = new int[100];
//        int k = 0;
//        for (int a = 0; a <=100; a++) {
//            for (int b = 0; b <= 100 ; b++) {
//                for (int c = 0; c <= 100 ; c++) {
//                    if ((a+b+c==100)&&(5*a+3*b+c/3==100)&&(c%3==0)){
//                        arrayA[k] = a;arrayB[k] = b;arrayC[k] = c;
//                        k = k+1;
//                    }
//                }
//            }
//        }

        //2.
        int [] arrayA = new int[100];
        int [] arrayB = new int[100];
        int [] arrayC = new int[100];
        int k = 0;
        int c;
        for (int a = 0; a <=20; a++) {
            for (int b = 0; b <= 33 ; b++) {
                c = 100-a-b;
                    if ((5*a+3*b+c/3==100)&&(c%3==0)){
                        arrayA[k] = a;arrayB[k] = b;arrayC[k] = c;
                        k = k+1;
                    }
                
            }
        }

        System.out.println("共有"+k+"种方式");
        for (int i = 0; i < k ; i++) {
            System.out.println(arrayA[i]+" "+arrayB[i]+" "+arrayC[i]);
    }
    }
}
