package com.eigpay.idea.assist;

import com.eigpay.idea.model.impl.StudentImpl;
import com.eigpay.idea.model.impl.TeacherImpl;

/**
 * @author LCN
 * @date 2018-02-20 下午 08:48
 * description:
 */
public class GetPerson {

    public static StudentImpl getStudent(){
        return new StudentImpl();
    }

    public static TeacherImpl getTeacher(){
        return new TeacherImpl();
    }

}
