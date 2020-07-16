package cn.chinatelecom.pojo;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.log4j.Logger;
import cn.chinatelecom.tool.HanyuPinyinHelper;


/**
 * @ClassName : PersonImpl
 * @Description : My new person class
 * @Author : Caoguodong
 * @Date: 2020-07-09
 */

public class PersonImpl implements Person {

    private String firstName = "国栋" ;
    private String lastName = "曹";
    Logger logger = Logger.getLogger(PersonImpl.class);

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        PersonImpl person = (PersonImpl) o;

        return new EqualsBuilder()
                .append(firstName, person.firstName)
                .append(lastName, person.lastName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(firstName)
                .append(lastName)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("firstName", firstName)
                .append("lastName", lastName)
                .toString();
    }

    public String getFirstName() {
        logger.debug("这是调用getFirstName");
        return firstName;
    }


    public String getLastName() {
        logger.debug("这是调用getLastName");
        return lastName;
    }

    public String getFullName() {
        logger.debug("这是调用getFullName");
        return lastName+firstName;
    }
    public String getFirstNameSpell() {
        logger.debug("这是调用getFirstNameSpell");
        return HanyuPinyinHelper.toHanyuPinyin(firstName);
    }


    public String getLastNameSpell() {
        logger.debug("这是调用getLastNameSpell");
        return HanyuPinyinHelper.toHanyuPinyin(lastName);
    }

    public String getFullNameSpell() {
        logger.debug("这是调用getFullNameSpell");
        return HanyuPinyinHelper.toHanyuPinyin(lastName+firstName);
    }

    public static void main(String[] args) {
//        Logger logger = Logger.getLogger(PersonImpl.class);
//        logger.debug("这是debug");
//        logger.info("这是info");
//        logger.warn("这是warn");
//        logger.error("这是error");
//        logger.fatal("这是fatal");

        PersonImpl cgd = new PersonImpl();
        Person cgd2 = new PersonImpl();
        System.out.println("my fristname is "+cgd.getFirstName());
        System.out.println("my lastname is "+cgd.getLastName());
        System.out.println("my fullname is "+cgd.getFullName());
        System.out.println("my fristname spell is "+cgd.getFirstNameSpell());
        System.out.println("my lastname spell is "+cgd.getLastNameSpell());
        System.out.println("my fullname spell is "+cgd.getFullNameSpell());
//        System.out.println("toString: "+cgd);
//        System.out.println("==: "+(cgd==cgd2));
//        System.out.println("equal: "+(cgd.equals(cgd2)));
//        cgd2.setFirstName("小二");
//        System.out.println("equal2: "+(cgd.equals(cgd2)));
    }
}
