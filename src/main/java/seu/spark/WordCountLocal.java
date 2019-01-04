package seu.spark;

import org.apache.spark.SparkConf;

/**
 * 本地测试
 */
public class WordCountLocal {
    public static void main(String[] args) {
        /**
         * spark的配置信息sparkconf
         */
        SparkConf conf=new SparkConf()
                .setAppName("WordCountLocal")
                .setMaster("local");
        /**
         * 创建spark对象信息
         */
    }
}
