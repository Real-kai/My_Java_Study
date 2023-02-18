package houserent.domain;

/**
 * @author 王凯
 * @version 1.0
 */
public class House {

        private int num;
        private String name;
        private String phoneNum;
        private String address;
        private double monthlyRent;
        private String state;

    public House() {
    }

    public House(int num, String name, String phoneNum, String address, double monthlyRent, String state) {
        this.num = num;
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.monthlyRent = monthlyRent;
        this.state = state;
    }

    public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNum() {
            return phoneNum;
        }

        public void setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public double getMonthlyRent() {
            return monthlyRent;
        }

        public void setMonthlyRent(double monthlyRent) {
            this.monthlyRent = monthlyRent;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        @Override
        public String toString() {
            return num+"\t\t"+name + "  \t\t" + phoneNum +"\t\t"+ address + "\t\t" + monthlyRent +"\t\t\t"+ state;
        }

}
