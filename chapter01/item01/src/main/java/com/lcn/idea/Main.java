package com.lcn.idea;

import com.lcn.idea.assist.GetPerson;
import com.lcn.idea.model.Person;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-20 下午 08:48
 */
public class Main {

    public static void main(String[] args) {
        // 通过静态工厂方式获取实例
        Person student = GetPerson.getStudent();
        Person teacher = GetPerson.getTeacher();

        student.showJob();
        teacher.showJob();
    }

}
