package com.study.chapter03;/*
 *@author bqlv
 *@version1.0
 */

import com.atguigu.chapter05.Event;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.util.stream.Stream;

/**
 * @ClassName translate_map
 * @Description TODO
 * @Author bqlv
 * @Date 2023/1/12 14:27
 * @Version 1.0
 */
public class translate_map {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);
        DataStreamSource<Event> stream = env.fromElements(
                new Event("Mary", "./home", 1000L),
                new Event("Bob", "./cart", 2000L)
        );
        SingleOutputStreamOperator<String> map = stream.map(new MapFunction<Event, String>() {
            @Override
            public String map(Event event) throws Exception {
                return "中国"+event.user;
            }
        });
        map.print();
        env.execute();
    }
}
