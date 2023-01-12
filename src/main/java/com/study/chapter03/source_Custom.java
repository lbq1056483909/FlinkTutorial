package com.study.chapter03;/*
 *@author bqlv
 *@version1.0
 */

import com.atguigu.chapter05.ClickSource;
import com.atguigu.chapter05.Event;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * @ClassName source_Custom
 * @Description TODO
 * @Author bqlv
 * @Date 2023/1/12 14:13
 * @Version 1.0
 */
public class source_Custom {
    public static void main(String[] args) throws Exception {
        //使用自定义的数据源
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);
        DataStreamSource<Event> eventDataStreamSource = env.addSource(new ClickSource());
        eventDataStreamSource.print();
        env.execute();

    }
}
