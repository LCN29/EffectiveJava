package com.lcn.idea;

import com.lcn.idea.singleton.One;
import com.lcn.idea.singleton.Three;
import com.lcn.idea.singleton.Two;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-20 下午 09:20
 */
public class Main {

    public static void main(String[] args) {

        One one = One.INSTANCE;
        one.test();

        Two two = Two.getInstance();
        two.test();

        /**
         * 创建一个使用这两种方法的单例类,仅仅implements Serializable添加到声明中是不够的,
         * 为了维护单例的保证，声明所有的实例属性为transient，并提供一个readResolve方法。
         * private Object readResolve() {  // 返回单例  return INSTANCE; }
         * 否则，每当序列化实例被反序列化时，就会创建一个新的实例
         */

        Three.INSTATNCE.test();
    }

}
