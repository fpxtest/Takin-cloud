

package io.shulie.takin.cloud.open.resp.report;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import io.shulie.takin.cloud.common.bean.scenemanage.ScriptNodeSummaryBean;
import lombok.EqualsAndHashCode;
import io.shulie.takin.cloud.common.bean.scenemanage.BusinessActivitySummaryBean;
import io.shulie.takin.cloud.common.bean.scenemanage.StopReasonBean;
import io.shulie.takin.cloud.common.bean.scenemanage.WarnBean;
import io.shulie.takin.cloud.common.bean.sla.SlaBean;
import io.shulie.takin.ext.content.user.CloudUserCommonRequestExt;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* @author 无涯
* @date 2021/2/3 11:46 上午
*/
@EqualsAndHashCode(callSuper = true)
@Data
public class ReportDetailResp extends CloudUserCommonRequestExt implements Serializable {

    private static final long serialVersionUID = 6093881590337487184L;

    @ApiModelProperty(value = "报告状态：0/就绪状态，1/生成中, 2/完成生成")
    private Integer taskStatus;

    @ApiModelProperty(value = "sla熔断数据")
    private SlaBean slaMsg;

    @ApiModelProperty(value = "停止原因")
    private List<StopReasonBean> stopReasons;

    @ApiModelProperty(value = "报告ID")
    private Long id;

    @ApiModelProperty(value = "消耗流量")
    private BigDecimal amount;


    @ApiModelProperty(value = "场景名称")
    private Long sceneId;

    @ApiModelProperty(value = "场景名称")
    private String sceneName;

    @ApiModelProperty(value = "开始时间")
    private String startTime;

    @ApiModelProperty(value = "结束时间")
    private Date endTime;

    @ApiModelProperty(value = "压测结论: 0/不通过，1/通过")
    private Integer conclusion;

    @ApiModelProperty(value = "压测结论描述")
    private String conclusionRemark;

    @ApiModelProperty(value = "警告次数")
    private Long totalWarn;

    @ApiModelProperty(value = "请求总数")
    private Long totalRequest;

    @ApiModelProperty(value = "最大并发")
    private Integer concurrent;

    @ApiModelProperty(value = "施压类型,0:并发,1:tps,2:自定义;不填默认为0")
    private Integer pressureType;

    @ApiModelProperty(value = "平均并发数")
    private BigDecimal avgConcurrent;

    @ApiModelProperty(value = "目标TPS")
    private Integer tps;

    @ApiModelProperty(value = "平均TPS")
    private BigDecimal avgTps;

    @ApiModelProperty(value = "平均RT")
    private BigDecimal avgRt;

    @ApiModelProperty(value = "成功率")
    private BigDecimal successRate;

    @ApiModelProperty(value = "sa")
    private BigDecimal sa;

    @ApiModelProperty(value = "测试时长")
    private String testTime;

    @ApiModelProperty(value = "测试总时长")
    private String testTotalTime;

    @ApiModelProperty(value = "警告列表")
    private List<WarnBean> warn;

    @ApiModelProperty(value = "业务活动链路概览")
    private List<BusinessActivitySummaryBean> businessActivity;

    @ApiModelProperty(value = "节点链路详情")
    private List<ScriptNodeSummaryBean> nodeDetail;

    private Long scriptId;
}
