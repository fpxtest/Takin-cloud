package io.shulie.takin.cloud.app.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

import com.fasterxml.jackson.core.JsonProcessingException;

import io.shulie.takin.cloud.app.entity.Watchman;
import io.shulie.takin.cloud.app.model.resource.Resource;

/**
 * 调度服务
 *
 * @author <a href="mailto:472546172@qq.com">张天赐</a>
 */
public interface WatchmanService {
    /**
     * 调度机列表
     *
     * @param pageNumber 分页页码
     * @param pageSize   分页容量
     * @return 分页列表
     */
    PageInfo<Watchman> list(int pageNumber, int pageSize);

    /**
     * 获取调度所属的资源列表
     *
     * @param watchmanId 调度主键
     * @return 资源列表
     */
    List<Resource> getResourceList(Long watchmanId) throws JsonProcessingException;

    /**
     * 资源实例概览
     *
     * @param resourceExampleId 资源实例主键
     * @return 概览信息
     */
    Object exampleOverview(Long resourceExampleId) throws JsonProcessingException;

}
