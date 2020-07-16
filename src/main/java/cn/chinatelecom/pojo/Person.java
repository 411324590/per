package cn.chinatelecom.pojo;
/**
 * @ClassName : Person
 * @Description : My new person class
 * @Author : Caoguodong
 * @Date: 2020-07-9
 */
public interface Person {
    public  void setLastName(String lastName);
    public  void setFirstName(String lastName);

    public  String getFirstName();
    public  String getLastName();
    public  String getFullName();


}
