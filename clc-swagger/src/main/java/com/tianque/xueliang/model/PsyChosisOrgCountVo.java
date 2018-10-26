package com.tianque.xueliang.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 患者地域分布信息
 * 最下级为社区
 * 省->市->区->街道->社区
 * @author wuwei
 * @date 2018年9月25日 下午6:07:37
 */
@Data
public class PsyChosisOrgCountVo {
	
	/**
	 * 组织id
	 */
	@ApiModelProperty(value="组织id")
	private Long orgId;
	/**
	 * 组织患者总数
	 */
	@ApiModelProperty(value="组织患者总数")
	private int totalCount;

}
