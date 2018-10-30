package com.swagger.offline.model;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * 患者诊断信息
 * 
 * @author jdeng
 * @email jdeng263@163.com
 * @date 2018-09-27 14:34:53
 */
@ApiModel(value = "DiagnoseInfoDO", description = "患者诊断信息")
public class DiagnoseInfoDO{
	
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
	//躯体情况
		@ApiModelProperty(value="躯体情况")
		private String diagnoseBody;
	//初次发病日期
		@ApiModelProperty(value="初次发病日期")
		private String diagnoseFirst;
	//目前诊断类型
		@ApiModelProperty(value="目前诊断类型")
		private String diagnoseType;
	//有无肇事肇祸史0无1有
		@ApiModelProperty(value="有无肇事肇祸史0无1有")
		private Integer diagnoseIsTrouble;
	//肇事肇祸次数
		@ApiModelProperty(value="肇事肇祸次数")
		private Integer diagnoseTroubleCount;
	//上次肇事肇祸日期
		@ApiModelProperty(value="上次肇事肇祸日期")
		private String diagnoseTroubleDate;
	//危险评估等级
		@ApiModelProperty(value="危险评估等级")
		private String diagnoseLevel;
	//治疗情况
		@ApiModelProperty(value="治疗情况")
		private String diagnoseTreatStatus;
	//治疗医院名称
		@ApiModelProperty(value="治疗医院名称")
		private String diagnoseHospitalName;
	//住院治疗原因
		@ApiModelProperty(value="住院治疗原因")
		private String diagnoseTreatReason;
	//康复训练机构
		@ApiModelProperty(value="康复训练机构")
		private String diagnoseTreatOrg;
	//参与管理人员
		@ApiModelProperty(value="参与管理人员")
		private String diagnoseManager;
	//帮扶计划
		@ApiModelProperty(value="帮扶计划")
		private String diagnoseHelp;
	//康复措施
		@ApiModelProperty(value="康复措施")
		private String diagnoseMeasure;
	//精神症状
		@ApiModelProperty(value="精神症状")
		private String diagnoseSymptoms;
	//药物不良反应
		@ApiModelProperty(value="药物不良反应")
		private String diagnoseReact;
	//服药情况
		@ApiModelProperty(value="服药情况")
		private String diagnoseStatus;
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
	 * 设置：躯体情况
	 */
	public void setDiagnoseBody(String diagnoseBody) {
		this.diagnoseBody = diagnoseBody;
	}
	/**
	 * 获取：躯体情况
	 */
	public String getDiagnoseBody() {
		return diagnoseBody;
	}
	/**
	 * 设置：初次发病日期
	 */
	public void setDiagnoseFirst(String diagnoseFirst) {
		this.diagnoseFirst = diagnoseFirst;
	}
	/**
	 * 获取：初次发病日期
	 */
	public String getDiagnoseFirst() {
		return diagnoseFirst;
	}
	/**
	 * 设置：目前诊断类型
	 */
	public void setDiagnoseType(String diagnoseType) {
		this.diagnoseType = diagnoseType;
	}
	/**
	 * 获取：目前诊断类型
	 */
	public String getDiagnoseType() {
		return diagnoseType;
	}
	/**
	 * 设置：有无肇事肇祸史0无1有
	 */
	public void setDiagnoseIsTrouble(Integer diagnoseIsTrouble) {
		this.diagnoseIsTrouble = diagnoseIsTrouble;
	}
	/**
	 * 获取：有无肇事肇祸史0无1有
	 */
	public Integer getDiagnoseIsTrouble() {
		return diagnoseIsTrouble;
	}
	/**
	 * 设置：肇事肇祸次数
	 */
	public void setDiagnoseTroubleCount(Integer diagnoseTroubleCount) {
		this.diagnoseTroubleCount = diagnoseTroubleCount;
	}
	/**
	 * 获取：肇事肇祸次数
	 */
	public Integer getDiagnoseTroubleCount() {
		return diagnoseTroubleCount;
	}
	/**
	 * 设置：上次肇事肇祸日期
	 */
	public void setDiagnoseTroubleDate(String diagnoseTroubleDate) {
		this.diagnoseTroubleDate = diagnoseTroubleDate;
	}
	/**
	 * 获取：上次肇事肇祸日期
	 */
	public String getDiagnoseTroubleDate() {
		return diagnoseTroubleDate;
	}
	/**
	 * 设置：危险评估等级
	 */
	public void setDiagnoseLevel(String diagnoseLevel) {
		this.diagnoseLevel = diagnoseLevel;
	}
	/**
	 * 获取：危险评估等级
	 */
	public String getDiagnoseLevel() {
		return diagnoseLevel;
	}
	/**
	 * 设置：治疗情况
	 */
	public void setDiagnoseTreatStatus(String diagnoseTreatStatus) {
		this.diagnoseTreatStatus = diagnoseTreatStatus;
	}
	/**
	 * 获取：治疗情况
	 */
	public String getDiagnoseTreatStatus() {
		return diagnoseTreatStatus;
	}
	/**
	 * 设置：治疗医院名称
	 */
	public void setDiagnoseHospitalName(String diagnoseHospitalName) {
		this.diagnoseHospitalName = diagnoseHospitalName;
	}
	/**
	 * 获取：治疗医院名称
	 */
	public String getDiagnoseHospitalName() {
		return diagnoseHospitalName;
	}
	/**
	 * 设置：住院治疗原因
	 */
	public void setDiagnoseTreatReason(String diagnoseTreatReason) {
		this.diagnoseTreatReason = diagnoseTreatReason;
	}
	/**
	 * 获取：住院治疗原因
	 */
	public String getDiagnoseTreatReason() {
		return diagnoseTreatReason;
	}
	/**
	 * 设置：康复训练机构
	 */
	public void setDiagnoseTreatOrg(String diagnoseTreatOrg) {
		this.diagnoseTreatOrg = diagnoseTreatOrg;
	}
	/**
	 * 获取：康复训练机构
	 */
	public String getDiagnoseTreatOrg() {
		return diagnoseTreatOrg;
	}
	/**
	 * 设置：参与管理人员
	 */
	public void setDiagnoseManager(String diagnoseManager) {
		this.diagnoseManager = diagnoseManager;
	}
	/**
	 * 获取：参与管理人员
	 */
	public String getDiagnoseManager() {
		return diagnoseManager;
	}
	/**
	 * 设置：帮扶计划
	 */
	public void setDiagnoseHelp(String diagnoseHelp) {
		this.diagnoseHelp = diagnoseHelp;
	}
	/**
	 * 获取：帮扶计划
	 */
	public String getDiagnoseHelp() {
		return diagnoseHelp;
	}
	/**
	 * 设置：康复措施
	 */
	public void setDiagnoseMeasure(String diagnoseMeasure) {
		this.diagnoseMeasure = diagnoseMeasure;
	}
	/**
	 * 获取：康复措施
	 */
	public String getDiagnoseMeasure() {
		return diagnoseMeasure;
	}
	/**
	 * 设置：精神症状
	 */
	public void setDiagnoseSymptoms(String diagnoseSymptoms) {
		this.diagnoseSymptoms = diagnoseSymptoms;
	}
	/**
	 * 获取：精神症状
	 */
	public String getDiagnoseSymptoms() {
		return diagnoseSymptoms;
	}
	/**
	 * 设置：药物不良反应
	 */
	public void setDiagnoseReact(String diagnoseReact) {
		this.diagnoseReact = diagnoseReact;
	}
	/**
	 * 获取：药物不良反应
	 */
	public String getDiagnoseReact() {
		return diagnoseReact;
	}
	/**
	 * 设置：服药情况
	 */
	public void setDiagnoseStatus(String diagnoseStatus) {
		this.diagnoseStatus = diagnoseStatus;
	}
	/**
	 * 获取：服药情况
	 */
	public String getDiagnoseStatus() {
		return diagnoseStatus;
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
