package com.tianque.xueliang.model;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 精神病基础信息
 * @author wuwei
 * @date 2018年9月25日 下午2:58:32
 */
@Data
public class PsyChosisBasicVo {
	
	/**
	 * 精神病ID
	 */
	private Long id;
	/**
	 * 精神病姓名
	 */
	@ApiModelProperty(value="精神病姓名")
	private	String name;
	/**
	 * 精神病性别
	 */
	@ApiModelProperty(value="精神病性别")
	private String gender;
	/**
	 * 精神病曾用名
	 */
	@ApiModelProperty(value="精神病曾用名")
	private String usedName;
	/**
	 * 精神病身份证号
	 */
	@ApiModelProperty(value="精神病身份证号")
	private String idCardNo;
	/**
	 * 精神病出生日期
	 */
	@ApiModelProperty(value="精神病出生日期")
	private Date birthday;
	/**
	 * 精神病年龄
	 */
	@ApiModelProperty(value="精神病年龄")
	private int age;
	/**
	 * 精神病民族
	 */
	@ApiModelProperty(value="精神病民族")
	private String nation;
	/**
	 * 精神病籍贯-省
	 */
	@ApiModelProperty(value="精神病籍贯-省")
	private String province;
	/**
	 * 精神病籍贯-市
	 */
	@ApiModelProperty(value="精神病籍贯-市")
	private String city;
	/**
	 * 精神病籍贯-县
	 */
	@ApiModelProperty(value="精神病籍贯-县")
	private String district;
	/**
	 * 精神病婚姻状况
	 */
	@ApiModelProperty(value="精神病婚姻状况")
	private String maritalState;
	/**
	 * 精神病政治面貌
	 */
	@ApiModelProperty(value="精神病政治面貌")
	private String politicalBackground;
	/**
	 * 精神病学历
	 */
	@ApiModelProperty(value="精神病学历")
	private String schooling;
	/**
	 * 精神病宗教信仰
	 */
	@ApiModelProperty(value="精神病宗教信仰")
	private String faith;
	/**
	 * 精神病职业
	 */
	@ApiModelProperty(value="精神病职业")
	private String career;
	/**
	 * 服务场所
	 */
	@ApiModelProperty(value="服务场所")
	private String psyFwcs;
	/**
	 * 精神病手机
	 */
	@ApiModelProperty(value="精神病手机")
	private String mobileNumber;
	/**
	 * 精神病固定电话
	 */
	@ApiModelProperty(value="精神病固定电话")
	private String telephone;
	/**
	 * 精神病户籍地址
	 */
	@ApiModelProperty(value="精神病户籍地址")
	private String detailNativeAddress;
	/**
	 * 精神病现居地址
	 */
	@ApiModelProperty(value="精神病现居地址")
	private String currentAddress;
	/**
	 * 家庭经济情况
	 */
	@ApiModelProperty(value="家庭经济情况")
	private String economy;
	/**
	 * 是否纳入低保
	 */
	@ApiModelProperty(value="是否纳入低保")
	private byte psySfdb;
	/**
	 * 监护人姓名
	 */
	@ApiModelProperty(value="监护人姓名")
	private String psyJhrxm;
	/**
	 * 监护人身份证号
	 */
	@ApiModelProperty(value="监护人身份证号")
	private String psyJhrssz;
	/**
	 * 与监护人关系
	 */
	@ApiModelProperty(value="与监护人关系")
	private String psyJhgx;
	/**
	 * 监护人家庭地址
	 */
	@ApiModelProperty(value="监护人家庭地址")
	private String psyJhrjtdz;
	/**
	 * 监护人联系方式
	 */
	@ApiModelProperty(value="监护人联系方式")
	private String psyJhrlxfs;
	/**
	 * 其他信息
	 */
	@ApiModelProperty(value="其他信息")
	private String psyqtxx;

}
