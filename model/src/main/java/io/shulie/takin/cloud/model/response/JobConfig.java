package io.shulie.takin.cloud.model.response;

import java.util.HashMap;

import lombok.Data;

/**
 * 任务配置
 *
 * @author <a href="mailto:472546172@qq.com">张天赐</a>
 */
@Data
public class JobConfig {
    /**
     * 关键字
     */
    private String ref;
    /**
     * 关键字
     */
    private Integer mode;
    /**
     * 配置内容
     */
    private HashMap<String, Object> context;
}
