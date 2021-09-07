package com.yhl.spider.task.amap;


import com.yhl.convert.Convert;
import com.yhl.convert.amap.HotNameConvert;
import com.yhl.spider.task.RequestData;
import com.yhl.spider.task.SpiderTask;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 任务
 *
 * @author : yhl
 * date : 2021-09-06
 */
@Component
public class HotNameTask implements SpiderTask<HotNameConvert.OutData, HotNameConvert.InData> {

    private String url = "https://restapi.amap.com/v5/place/text";

    @Override
    public void save(HotNameConvert.OutData spiderData) {

    }

    @Override
    public Convert<HotNameConvert.OutData> getConvertOutData() {
        return new HotNameConvert();
    }

    @Override
    public Convert<HotNameConvert.InData> getConvertInData(HotNameConvert.OutData out) {
        return null;
    }

    @Override
    public RequestData getRequest(Map<String, String> parameter) {

        return RequestData.builder().url(url)
                .data(parameter).build();
    }

}
