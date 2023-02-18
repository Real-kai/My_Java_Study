package house;

/**
 * @author 王凯
 * @version 1.0
 */
public class HouseInfo {
 private String name;
 private int phoneNum;
 private String address;
 private double monthlyRent;
 private String state;


 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public int getPhoneNum() {
  return phoneNum;
 }

 public void setPhoneNum(int phoneNum) {
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
  return
          name + "\t" + phoneNum +"\t"+ address + "\t" + monthlyRent +"\t"+ state;
 }
}
