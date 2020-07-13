package pojo;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @ClassName : PersonImpl
 * @Description : My new person class
 * @Author : Caoguodong
 * @Date: 2020-07-09
 */

public class PersonImpl implements Person {

    private String firstName = "国栋" ;
    private String lastName = "曹";

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

        return "PersonImpl{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return lastName+firstName;
    }

    public static void main(String[] args) {
        Person cgd = new PersonImpl();
        Person cgd2 = new PersonImpl();
        System.out.println("my fristname is "+cgd.getFirstName());
        System.out.println("my lastname is "+cgd.getLastName());
        System.out.println("my fullname is "+cgd.getFullName());
        System.out.println("toString: "+cgd);
        System.out.println("==: "+(cgd==cgd2));
        System.out.println("equal: "+(cgd.equals(cgd2)));
        cgd2.setFirstName("小二");
        System.out.println("equal2: "+(cgd.equals(cgd2)));
    }
}
