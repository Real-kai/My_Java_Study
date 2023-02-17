package Extend_.Exercise;

/**
 * @author 王凯
 * @version 1.0
 */
public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("inter core i7","8G","1TB","HuaWei");
        NotePad notePad = new NotePad("Apple M1","4G","520G","土豪金");

        pc.getDetail();
        System.out.println("========================");
        pc.getPcDetail();
        System.out.println("========================");
        notePad.getNotePadDetail();
    }
}
