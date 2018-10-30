package com.swagger.offline.model;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * 患者监管人信息
 * 
 * @author jdeng
 * @email jdeng263@163.com
 * @date 2018-09-27 14:34:53
 */
@ApiModel(value = "WatcherDO", description = "患者监管人信息")
public class WatcherDO  {
	
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
	//监管人姓名
		@ApiModelProperty(value="监管人姓名")
		private String watcherName;
	//监管人身份
		@ApiModelProperty(value="监管人身份")
		private String watcherPosition;
	//监管人职务
		@ApiModelProperty(value="监管人职务")
		private String watcherJob;
	//监管人所属机构
		@ApiModelProperty(value="监管人所属机构")
		private String positionOrg;
	//监管人所属区域
		@ApiModelProperty(value="监管人所属区域")
		private String positionRegion;
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
	 * 设置：监管人姓名
	 */
	public void setWatcherName(String watcherName) {
		this.watcherName = watcherName;
	}
	/**
	 * 获取：监管人姓名
	 */
	public String getWatcherName() {
		return watcherName;
	}
	/**
	 * 设置：监管人身份
	 */
	public void setWatcherPosition(String watcherPosition) {
		this.watcherPosition = watcherPosition;
	}
	/**
	 * 获取：监管人身份
	 */
	public String getWatcherPosition() {
		return watcherPosition;
	}
	/**
	 * 设置：监管人职务
	 */
	public void setWatcherJob(String watcherJob) {
		this.watcherJob = watcherJob;
	}
	/**
	 * 获取：监管人职务
	 */
	public String getWatcherJob() {
		return watcherJob;
	}
	/**
	 * 设置：监管人所属机构
	 */
	public void setPositionOrg(String positionOrg) {
		this.positionOrg = positionOrg;
	}
	/**
	 * 获取：监管人所属机构
	 */
	public String getPositionOrg() {
		return positionOrg;
	}
	/**
	 * 设置：监管人所属区域
	 */
	public void setPositionRegion(String positionRegion) {
		this.positionRegion = positionRegion;
	}
	/**
	 * 获取：监管人所属区域
	 */
	public String getPositionRegion() {
		return positionRegion;
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
