package com.study.chapter03;/*
 *@author bqlv
 *@version1.0
 */

import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * @ClassName source_hdfs
 * @Description TODO
 * @Author bqlv
 * @Date 2023/1/12 13:43
 * @Version 1.0
 */
public class source_hdfs {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);
        //2.readTextFile("clicks.csv");读取hdfs上的文件:需要先添加hadoop依赖
        DataStreamSource<String> dataStreamSource = env.readTextFile("hdfs://hadoop102:8020/flinktxt.txt");
        dataStreamSource.print();
        env.execute();
    }
}
