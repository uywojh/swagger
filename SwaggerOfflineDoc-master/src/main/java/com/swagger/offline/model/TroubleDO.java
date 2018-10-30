package com.swagger.offline.model;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * 肇事肇祸信息
 * 
 * @author jdeng
 * @email jdeng263@163.com
 * @date 2018-09-27 14:34:53
 */
@ApiModel(value = "TroubleDO", description = "肇事肇祸信息")
public class TroubleDO {
	
	//主键id
		private Long id;
	//组织id
		private Integer orgId;
	//组织代码
		private String orgCode;
	//创建时间
		private Date createTime;
	//更新时间
		private Date updateTime;
	//创建人
		private String createUser;
	//更新人
		private String updateUser;
	//状态0删除1存在
		private Integer status;
	//事件发生地址
		@ApiModelProperty(value="事件发生地址")
		private String troubleAddress;
	//事件详情
		@ApiModelProperty(value="事件详情")
		private String troubleDetail;
	//事件处理结果
		@ApiModelProperty(value="事件处理结果")
		private String troubleResult;
	//患者id
		@ApiModelProperty(value="患者id")
		private Long userId;
	//患者类型
		@ApiModelProperty(value="患者类型")
		private Integer userType;

	/**
	 * 设置：主键id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：组织id
	 */
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	/**
	 * 获取：组织id
	 */
	public Integer getOrgId() {
		return orgId;
	}
	/**
	 * 设置：组织代码
	 */
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	/**
	 * 获取：组织代码
	 */
	public String getOrgCode() {
		return orgCode;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：创建人
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	/**
	 * 获取：创建人
	 */
	public String getCreateUser() {
		return createUser;
	}
	/**
	 * 设置：更新人
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	/**
	 * 获取：更新人
	 */
	public String getUpdateUser() {
		return updateUser;
	}
	/**
	 * 设置：状态0删除1存在
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态0删除1存在
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：事件发生地址
	 */
	public void setTroubleAddress(String troubleAddress) {
		this.troubleAddress = troubleAddress;
	}
	/**
	 * 获取：事件发生地址
	 */
	public String getTroubleAddress() {
		return troubleAddress;
	}
	/**
	 * 设置：事件详情
	 */
	public void setTroubleDetail(String troubleDetail) {
		this.troubleDetail = troubleDetail;
	}
	/**
	 * 获取：事件详情
	 */
	public String getTroubleDetail() {
		return troubleDetail;
	}
	/**
	 * 设置：事件处理结果
	 */
	public void setTroubleResult(String troubleResult) {
		this.troubleResult = troubleResult;
	}
	/**
	 * 获取：事件处理结果
	 */
	public String getTroubleResult() {
		return troubleResult;
	}
	/**
	 * 设置：患者id
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：患者id
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：患者类型
	 */
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	/**
	 * 获取：患者类型
	 */
	public Integer getUserType() {
		return userType;
	}
}
