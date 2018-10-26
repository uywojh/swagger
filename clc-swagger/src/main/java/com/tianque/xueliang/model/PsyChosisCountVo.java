package com.tianque.xueliang.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 精神病首页统计数据
 * 
 * @author wuwei
 * @date 2018年9月25日 下午1:45:19
 */
@Data
public class PsyChosisCountVo {

	/**
	 * 组织id
	 */
	@ApiModelProperty(value="组织id",example="25866")
	private Long orgId;
	/**
	 * 组织名称
	 */
	@ApiModelProperty(value="组织名称",example="浙江省")
	private String orgName;
	/**
	 * 查询月份
	 */
	@ApiModelProperty(value="查询月份",example="2018-09")
	private String month;
	/**
	 * 累积监管时间
	 */
	@ApiModelProperty(value="累积监管时间",example="123")
	private Long watchTime;

	/**
	 * 危险级别3级以上人数
	 */
	@ApiModelProperty(value="危险级别3级以上人数",example="12")
	private int dangerNums;

	/**
	 * 网格员人数总数
	 */
	@ApiModelProperty(value="网格员人数总数",example="121")
	private int gridNums;

	/**
	 * 监管人员总数
	 */
	@ApiModelProperty(value="监管人员总数",example="121")
	private int watcherNums;
	/**
	 * 在管总数
	 */
	@ApiModelProperty(value="在管总数",example="14")
	private int watcherOnlineNums;

	/**
	 * 预警总数
	 */
	@ApiModelProperty(value="预警总数",example="131")
	private int warnNums;
	/**
	 * 有效预警总数
	 */
	@ApiModelProperty(value="有效预警总数",example="14")
	private int validWarnNums;
	/**
	 * 正常预警
	 */
	@ApiModelProperty(value="正常预警",example="131")
	private int normalWarnNums;
	/**
	 * 一般预警
	 */
	@ApiModelProperty(value="一般预警",example="14")
	private int averageWarnNums;
	/**
	 * 重大预警
	 */
	@ApiModelProperty(value="重大预警",example="12")
	private int vitalWarnNums;
	/**
	 * 待处理总数
	 */
	@ApiModelProperty(value="待处理总数",example="212")
	private int noDealNums;
	/**
	 * 已处理总数
	 */
	@ApiModelProperty(value="已处理总数",example="123")
	private int hasDealNums;
	/**
	 * 模糊匹配抓拍总数
	 */
	@ApiModelProperty(value="模糊匹配抓拍总数",example="122")
	private int vaguePicNums;
	/**
	 * 一般匹配抓拍总数
	 */
	@ApiModelProperty(value="一般匹配抓拍总数",example="21")
	private int normalPicNums;
	/**
	 * 精准匹配抓拍总数
	 */
	@ApiModelProperty(value="精准匹配抓拍总数",example="12")
	private int accuratePicNums;
	/**
	 * 精神病患者总数
	 */
	@ApiModelProperty(value="精神病患者总数",example="1222")
	private int patientNums;
	/**
	 * 月均响应时间
	 */
	@ApiModelProperty(value="月均响应时间",example="12")
	private int monthAveCallTime;
	/**
	 * 月最快响应时间
	 */
	@ApiModelProperty(value="月最快响应时间",example="1")
	private int monthQukCallTime;
	/**
	 * 月平均处理时间
	 */
	@ApiModelProperty(value="月平均处理时间",example="20")
	private int monthAveDealTime;
	/**
	 * 月最快处理时间
	 */
	@ApiModelProperty(value="月最快处理时间",example="3")
	private int monthQukDealTime;
	/**
	 * 查询类型 1预警类型 2 处置及抓拍情况 3 监管数据 4 处理效能
	 */
	@ApiModelProperty(value="查询类型",example="1预警类型 2 处置及抓拍情况 3 监管数据 4 处理效能")
	private Integer queryType;

}
