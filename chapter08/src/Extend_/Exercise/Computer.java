package Extend_.Exercise;

/**
 * @author 王凯
 * @version 1.0
 */
public class Computer {
   private String cpu;
   private String memory;
   private String hardDisk;

    public Computer(String cpu, String memory, String hardDisk) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDisk = hardDisk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getDetail(){
        return "CPU:"+cpu+" 内存:"+" 硬盘："+hardDisk;
    }
}

class PC extends Computer{
    String brand;

    public PC(String cpu,String memory,String hardDisk,String brand){
        super(cpu,memory,hardDisk);
        this.brand = brand;
    }
    public void getPcDetail(){
        System.out.println("PC的设备信息 "+getDetail()+" 品牌："+brand);
    }
}

class NotePad extends Computer{
    String color;

    public NotePad(String cpu,String memory,String hardDisk,String color){
        super(cpu,memory,hardDisk);
        this.color = color;
    }
    public void getNotePadDetail(){
        System.out.println("NotePad的设备信息 "+getDetail()+" 颜色："+color);
    }
}
