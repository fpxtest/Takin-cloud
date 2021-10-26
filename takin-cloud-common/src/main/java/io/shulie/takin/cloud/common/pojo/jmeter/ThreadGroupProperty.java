package io.shulie.takin.cloud.common.pojo.jmeter;

import io.shulie.takin.cloud.common.enums.PressureTypeEnums;
import io.shulie.takin.cloud.common.pojo.AbstractEntry;
import lombok.Data;

/**
 * @Author: liyuanba
 * @Date: 2021/10/15 10:10 上午
 */
@Data
public class ThreadGroupProperty extends AbstractEntry {
    /**
     * 压测模式
     */
    private PressureTypeEnums type;
    /**
     * 最大并发线程数
     */
    private Integer maxThreadNum;
    /**
     * 压测时长
     */
    private Integer duration;
    /**
     * 线程启动时间,单位：秒
     */
    private Integer rampUp;
    /**
     * 线程启动时从0到最大线程数每次增加的步长
     */
    private Integer steps;
    /**
     * tps
     */
    private Integer tps;
}
