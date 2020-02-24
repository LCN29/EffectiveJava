package com.lcn.syntax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-21 下午 01:22
 */
public class Main {

    public static void main(String[] args) {

        /**
         * 旧版本  需要指定泛型的类型
         */
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);
        System.out.println(map.get("one") + map.get("two"));

        /**
         * 改进：类型推导（type inference）自动推算出泛型类型
         */
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("three", 3);
        map2.put("four", 4);
        System.out.println(map2.get("three") + map2.get("four"));

        /**
         * JDK8 升级：方法类型推导
         *
         * List.addAll(Collection<? extends E> c)   在声明list时，指定了E 为String了,
         * 所以此处的addAll的参数为Collection<? extends String>
         * 所以此处的参数被推导为Collection<String>,由此可知 ArrayList的参数类型为String
         */
        List<String> list = new ArrayList<>();
        list.add("A");
        list.addAll(new ArrayList<>());

        /**
         * 原理讲解
         */
        TypeInference infer = new TypeInference();
        infer.typeArgument();
        infer.typeTarget();
        infer.typeReturn();
    }

}
