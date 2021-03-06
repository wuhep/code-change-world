package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wuhp on 2018/2/5
 * 为什么删不干净呢，因为remove执行后，arraylist.size()不断变小，导致原来下标的数据没了（对，到其他地方去了），所以删不干净。
 * 报错ConcurrentModificationException，单线程和双线程-原因及解决方案
 * https://www.cnblogs.com/dolphin0520/p/3933551.html
 */
public class ListDeleteTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> list = new ArrayList<>();
        list.add("2");
        list.add("2");
        list.add("3");//会报错使用Iterator就不会
        // 使用for循环 不能删除干净
//        for (String item : list) {
//            if ("2".equals(item)) {
//                list.remove(item);
//            }
//        }
        //使用迭代器 这样才行
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = (String) iterator.next();
            if ("2".equals(next)) {
                iterator.remove();
            }
        }
        System.out.println(list.toString());

        // 删除List里的对象：
        // 方式一：增强for循环，remove(Obj) => 快速失败
        // 方式二：fori循环，remove(index) => 第二遍size会变/第二次get会OutOfBounds
        // 方式三：lambda表达式filter，可行
        // 方式四：for循环重新add到一个新的数据中(CopyOnWriterArrayList)
        // 方式五：使用迭代器循环并remove(多线程) => 快速失败
    }
}
