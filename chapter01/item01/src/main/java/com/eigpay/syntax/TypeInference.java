package com.eigpay.syntax;

import java.util.Collections;
import java.util.List;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-21 下午 03:06
 */
public class TypeInference {

    /**
     * 原理：参数类型推导
     * 根据方法的参数，推算出应该返回的类型
     *
     * typeArgumentInference : 接受1个T类型参数，返回一个T类型的结果
     * 返回的T结果由接受的参数类型决定。
     * 传入了一个字符串，推导出返回的结果为字符串
     */
    public void typeArgument() {
        // String
        String str = typeArgumentInference("123");
        System.out.println(str);

        // Integer
        Integer num = typeArgumentInference(123);
        System.out.println(num);
    }

    private <T> T typeArgumentInference (T a1) {
        return  a1;
    }

    /**
     * 原理： 目标类型推导
     * 根据方法需要的类型，推算出应该返回的泛型类型
     *
     * typeTargetInference： 需要接受一个List<String>的参数
     * 但是 Collections.emptyList方法返回的是List<T>
     * 根据方法需要的参数类型List<String>推算出emptyList的返回类型应该为List<String>
     */

    public void typeTarget() {
        typeTargetInference(Collections.emptyList());
    }

    private void typeTargetInference(List<String> list) {
        System.out.println(list.size()+"个");
    }

    /**
     * 原理： 返回类型推导
     * 根据 = 左边的返回类型，推导出自身应该返回的参数类型
     *
     * List<Integer> 指定了返回的List类型为Integer，Collections.emptyList()根据
     * 这个判断出自身应该返回的参数类型为Integer。
     */
    public void typeReturn() {
        List<Integer> list = Collections.emptyList();
        System.out.println(list.getClass().getName());
    }
}
