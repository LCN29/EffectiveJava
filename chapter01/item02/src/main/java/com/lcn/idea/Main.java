package com.lcn.idea;

import com.lcn.idea.model.Principal;
import com.lcn.idea.model.Student;
import com.lcn.idea.model.Teacher;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-20 下午 09:09
 */
public class Main {

    public static void main(String[] args) {
        // 可伸缩（telescoping constructor）构造方法模式
        Student student = new Student("学习","666");

        // JavaBean方式创建
        Teacher teacher = new Teacher();
        teacher.setName("教师");

        //builder方式
        Principal principal = new Principal.Builder("校长","123")
                .setPhone("7707").build();
        System.out.println(principal.getName());
    }

}
