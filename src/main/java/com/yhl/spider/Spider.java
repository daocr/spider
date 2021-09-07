package com.yhl.spider;

/**
 *
 * @author : yhl
 * date : 2021-09-06
 */
public interface Spider {
    /**
     * 开始爬取
     *
     * @param bizId
     * @param taskId
     */
    void spider(String bizId, String taskId);
}
