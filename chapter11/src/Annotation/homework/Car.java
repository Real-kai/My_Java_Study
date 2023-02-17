package Annotation.homework;

/**
 * @author 王凯
 * @version 1.0
 */
public class Car{
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    public Air getAir(){
        return new Air();
    }

    class Air{
        public void flow(){
            if (temperature > 40){
                System.out.println("吹冷风");
            }else if( temperature <0){
                System.out.println("吹热风");
            }else {
                System.out.println("关闭空调");
            }
        }
    }

}
