package com.lcn.idea.assist;

import com.lcn.idea.model.impl.StudentImpl;
import com.lcn.idea.model.impl.TeacherImpl;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-20 下午 08:48
 */
public class GetPerson {

    public static StudentImpl getStudent(){
        return new StudentImpl();
    }

    public static TeacherImpl getTeacher(){
        return new TeacherImpl();
    }

}
