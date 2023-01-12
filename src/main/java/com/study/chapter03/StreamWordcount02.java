package com.study.chapter03;/*
 *@author bqlv
 *@version1.0
 */

import com.atguigu.chapter05.Event;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.util.ArrayList;

/**
 * @ClassName StreamWordcount02
 * @Description TODO
 * @Author bqlv
 * @Date 2023/1/12 11:54
 * @Version 1.0
 */
public class StreamWordcount02 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);
        //1.fromCollection：读取自定义的pojo
        //ArrayList<Event> events = new ArrayList<>();
        //events.add(new Event("Mary","./home",1000L));
        //events.add(new Event("Bob","./cart",2000L));
        //DataStreamSource<Event> eventDataStreamSource = env.fromCollection(events);
        //eventDataStreamSource.print();

        //2.readTextFile("clicks.csv");读取hdfs上的文件:需要先添加hadoop依赖
//        DataStreamSource<String> dataStreamSource = env.readTextFile("hdfs://hadoop102:8020/flinktxt.txt");
//        dataStreamSource.print();
//        env.execute();


    }
}
