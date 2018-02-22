package com.eigpay.syntax.two;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-22 上午 10:15
 */
public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.sayWord();

        Teacher teacher = new Teacher();
        teacher.sayWord();

        Person.saySomeWord();
    }

}
