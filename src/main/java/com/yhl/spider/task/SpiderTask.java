package com.yhl.spider.task;

import com.yhl.convert.Convert;

import java.util.Map;

/**
 * @author : yhl
 * date : 2021-09-06
 */
public interface SpiderTask<OUT,IN> {

    /**
     * 保存数据
     *
     * @param spiderData
     */
    void save(OUT spiderData);


    /**
     * 获取转换器
     *
     * @return
     */
    Convert<OUT> getConvertOutData();


    /**
     * 获取转换器
     *
     * @return
     * @param out
     */
    Convert<IN> getConvertInData(OUT out);

    /**
     * 构建请求参数
     *
     * @param parameter
     * @return
     */
    RequestData getRequest(Map<String, String> parameter);
}
