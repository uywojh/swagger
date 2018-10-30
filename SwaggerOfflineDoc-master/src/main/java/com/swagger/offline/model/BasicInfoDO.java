package com.swagger.offline.model;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * 患者基本信息
 * 
 * @author jdeng
 * @email jdeng263@163.com
 * @date 2018-09-29 14:04:39
 */
@ApiModel(value = "BasicInfoDO", description = "患者基本信息")
public class BasicInfoDO {
	
	//主键id
		private Long id;
	//组织id
		@ApiModelProperty(value="组织")
		private Integer orgId;
	//组织代码
		@ApiModelProperty(value="组织代码")
		private String orgCode;
	//创建时间
		@ApiModelProperty(value="创建时间")
		private Date createTime;
	//更新时间
		@ApiModelProperty(value="更新时间")
		private Date updateTime;
	//创建人
		@ApiModelProperty(value="创建人")
		private String createUser;
	//更新人
		@ApiModelProperty(value="更新人")
		private String updateUser;
	//状态0删除1存在
		@ApiModelProperty(value="状态0删除1存在")
		private Integer status;
	//患者名称
		@ApiModelProperty(value="患者名称")
		private String psyName;
	//患者性别1男2女
		@ApiModelProperty(value="患者性别1男2女")
		private Integer psySex;
	//患者曾用名
		@ApiModelProperty(value="患者曾用名")
		private String psyBeforeName;
	//患者身份证
		@ApiModelProperty(value="患者身份证")
		private String psyIdCard;
	//患者生日
		@ApiModelProperty(value="患者生日")
		private String psyBirth;
	//患者年龄
		@ApiModelProperty(value="患者年龄")
		private Integer psyAge;
	//患者民族
		@ApiModelProperty(value="患者民族")
		private String psyNation;
	//患者籍贯
		@ApiModelProperty(value="患者籍贯")
		private String psyNative;
	//患者婚姻状态1已婚0未婚
		@ApiModelProperty(value="患者婚姻状态1已婚0未婚")
		private Integer psyMarital;
	//患者政治面貌
		@ApiModelProperty(value="患者政治面貌")
		private String psyPolitic;
	//患者学历
		@ApiModelProperty(value="患者学历")
		private String psyBackground;
	//患者信仰
		@ApiModelProperty(value="患者信仰")
		private String psyFaith;
	//患者职业
		@ApiModelProperty(value="患者职业")
		private String psyJob;
	//患者服务场所
		@ApiModelProperty(value="患者服务场所")
		private String psyWorkspace;
	//患者联系方式
		@ApiModelProperty(value="患者联系方式")
		private String psyPhone;
	//患者关注等级
		@ApiModelProperty(value="患者关注等级")
		private String psyFocusLevel;
	//患者危险等级
		@ApiModelProperty(value="患者危险等级")
		private String psyDangerLevel;
	//患者籍贯地址
		@ApiModelProperty(value="患者籍贯地址")
		private String psyNationAddress;
	//患者现居地址
		@ApiModelProperty(value="患者现居地址")
		private String psyNowAddress;
	//患者家庭经济情况
		@ApiModelProperty(value="患者家庭经济情况")
		private String psyFamilyIncome;
	//患者是否纳入低保户1是0否
		@ApiModelProperty(value="患者是否纳入低保户1是0否")
		private Integer psyIsMinimum;
	//监护人姓名
		@ApiModelProperty(value="监护人姓名")
		private String psyGuardianName;
	//监护人身份证号
		@ApiModelProperty(value="监护人身份证号")
		private String psyGuardianId;
	//与监护人关系
		@ApiModelProperty(value="与监护人关系")
		private String psyGuardianRelation;
	//监护人家庭地址
		@ApiModelProperty(value="监护人家庭地址")
		private String psyGuardianAddress;
	//监护人联系方式
		@ApiModelProperty(value="监护人联系方式")
		private String psyGuardianPhone;
	//其他信息
		@ApiModelProperty(value="其他信息")
		private String psyOtherContent;
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
	 * 设置：患者名称
	 */
	public void setPsyName(String psyName) {
		this.psyName = psyName;
	}
	/**
	 * 获取：患者名称
	 */
	public String getPsyName() {
		return psyName;
	}
	/**
	 * 设置：患者性别1男2女
	 */
	public void setPsySex(Integer psySex) {
		this.psySex = psySex;
	}
	/**
	 * 获取：患者性别1男2女
	 */
	public Integer getPsySex() {
		return psySex;
	}
	/**
	 * 设置：患者曾用名
	 */
	public void setPsyBeforeName(String psyBeforeName) {
		this.psyBeforeName = psyBeforeName;
	}
	/**
	 * 获取：患者曾用名
	 */
	public String getPsyBeforeName() {
		return psyBeforeName;
	}
	/**
	 * 设置：患者身份证
	 */
	public void setPsyIdCard(String psyIdCard) {
		this.psyIdCard = psyIdCard;
	}
	/**
	 * 获取：患者身份证
	 */
	public String getPsyIdCard() {
		return psyIdCard;
	}
	/**
	 * 设置：患者生日
	 */
	public void setPsyBirth(String psyBirth) {
		this.psyBirth = psyBirth;
	}
	/**
	 * 获取：患者生日
	 */
	public String getPsyBirth() {
		return psyBirth;
	}
	/**
	 * 设置：患者年龄
	 */
	public void setPsyAge(Integer psyAge) {
		this.psyAge = psyAge;
	}
	/**
	 * 获取：患者年龄
	 */
	public Integer getPsyAge() {
		return psyAge;
	}
	/**
	 * 设置：患者民族
	 */
	public void setPsyNation(String psyNation) {
		this.psyNation = psyNation;
	}
	/**
	 * 获取：患者民族
	 */
	public String getPsyNation() {
		return psyNation;
	}
	/**
	 * 设置：患者籍贯
	 */
	public void setPsyNative(String psyNative) {
		this.psyNative = psyNative;
	}
	/**
	 * 获取：患者籍贯
	 */
	public String getPsyNative() {
		return psyNative;
	}
	/**
	 * 设置：患者婚姻状态1已婚0未婚
	 */
	public void setPsyMarital(Integer psyMarital) {
		this.psyMarital = psyMarital;
	}
	/**
	 * 获取：患者婚姻状态1已婚0未婚
	 */
	public Integer getPsyMarital() {
		return psyMarital;
	}
	/**
	 * 设置：患者政治面貌
	 */
	public void setPsyPolitic(String psyPolitic) {
		this.psyPolitic = psyPolitic;
	}
	/**
	 * 获取：患者政治面貌
	 */
	public String getPsyPolitic() {
		return psyPolitic;
	}
	/**
	 * 设置：患者学历
	 */
	public void setPsyBackground(String psyBackground) {
		this.psyBackground = psyBackground;
	}
	/**
	 * 获取：患者学历
	 */
	public String getPsyBackground() {
		return psyBackground;
	}
	/**
	 * 设置：患者信仰
	 */
	public void setPsyFaith(String psyFaith) {
		this.psyFaith = psyFaith;
	}
	/**
	 * 获取：患者信仰
	 */
	public String getPsyFaith() {
		return psyFaith;
	}
	/**
	 * 设置：患者职业
	 */
	public void setPsyJob(String psyJob) {
		this.psyJob = psyJob;
	}
	/**
	 * 获取：患者职业
	 */
	public String getPsyJob() {
		return psyJob;
	}
	/**
	 * 设置：患者服务场所
	 */
	public void setPsyWorkspace(String psyWorkspace) {
		this.psyWorkspace = psyWorkspace;
	}
	/**
	 * 获取：患者服务场所
	 */
	public String getPsyWorkspace() {
		return psyWorkspace;
	}
	/**
	 * 设置：患者联系方式
	 */
	public void setPsyPhone(String psyPhone) {
		this.psyPhone = psyPhone;
	}
	/**
	 * 获取：患者联系方式
	 */
	public String getPsyPhone() {
		return psyPhone;
	}
	/**
	 * 设置：患者关注等级
	 */
	public void setPsyFocusLevel(String psyFocusLevel) {
		this.psyFocusLevel = psyFocusLevel;
	}
	/**
	 * 获取：患者关注等级
	 */
	public String getPsyFocusLevel() {
		return psyFocusLevel;
	}
	/**
	 * 设置：患者危险等级
	 */
	public void setPsyDangerLevel(String psyDangerLevel) {
		this.psyDangerLevel = psyDangerLevel;
	}
	/**
	 * 获取：患者危险等级
	 */
	public String getPsyDangerLevel() {
		return psyDangerLevel;
	}
	/**
	 * 设置：患者籍贯地址
	 */
	public void setPsyNationAddress(String psyNationAddress) {
		this.psyNationAddress = psyNationAddress;
	}
	/**
	 * 获取：患者籍贯地址
	 */
	public String getPsyNationAddress() {
		return psyNationAddress;
	}
	/**
	 * 设置：患者现居地址
	 */
	public void setPsyNowAddress(String psyNowAddress) {
		this.psyNowAddress = psyNowAddress;
	}
	/**
	 * 获取：患者现居地址
	 */
	public String getPsyNowAddress() {
		return psyNowAddress;
	}
	/**
	 * 设置：患者家庭经济情况
	 */
	public void setPsyFamilyIncome(String psyFamilyIncome) {
		this.psyFamilyIncome = psyFamilyIncome;
	}
	/**
	 * 获取：患者家庭经济情况
	 */
	public String getPsyFamilyIncome() {
		return psyFamilyIncome;
	}
	/**
	 * 设置：患者是否纳入低保户1是0否
	 */
	public void setPsyIsMinimum(Integer psyIsMinimum) {
		this.psyIsMinimum = psyIsMinimum;
	}
	/**
	 * 获取：患者是否纳入低保户1是0否
	 */
	public Integer getPsyIsMinimum() {
		return psyIsMinimum;
	}
	/**
	 * 设置：监护人姓名
	 */
	public void setPsyGuardianName(String psyGuardianName) {
		this.psyGuardianName = psyGuardianName;
	}
	/**
	 * 获取：监护人姓名
	 */
	public String getPsyGuardianName() {
		return psyGuardianName;
	}
	/**
	 * 设置：监护人身份证号
	 */
	public void setPsyGuardianId(String psyGuardianId) {
		this.psyGuardianId = psyGuardianId;
	}
	/**
	 * 获取：监护人身份证号
	 */
	public String getPsyGuardianId() {
		return psyGuardianId;
	}
	/**
	 * 设置：与监护人关系
	 */
	public void setPsyGuardianRelation(String psyGuardianRelation) {
		this.psyGuardianRelation = psyGuardianRelation;
	}
	/**
	 * 获取：与监护人关系
	 */
	public String getPsyGuardianRelation() {
		return psyGuardianRelation;
	}
	/**
	 * 设置：监护人家庭地址
	 */
	public void setPsyGuardianAddress(String psyGuardianAddress) {
		this.psyGuardianAddress = psyGuardianAddress;
	}
	/**
	 * 获取：监护人家庭地址
	 */
	public String getPsyGuardianAddress() {
		return psyGuardianAddress;
	}
	/**
	 * 设置：监护人联系方式
	 */
	public void setPsyGuardianPhone(String psyGuardianPhone) {
		this.psyGuardianPhone = psyGuardianPhone;
	}
	/**
	 * 获取：监护人联系方式
	 */
	public String getPsyGuardianPhone() {
		return psyGuardianPhone;
	}
	/**
	 * 设置：其他信息
	 */
	public void setPsyOtherContent(String psyOtherContent) {
		this.psyOtherContent = psyOtherContent;
	}
	/**
	 * 获取：其他信息
	 */
	public String getPsyOtherContent() {
		return psyOtherContent;
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
