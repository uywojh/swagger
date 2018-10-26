package com.tianque.xueliang.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tianque.xueliang.model.BasicInfoDO;
import com.tianque.xueliang.model.DiagnoseInfoDO;
import com.tianque.xueliang.model.PsyChosisBasicVo;
import com.tianque.xueliang.model.PsyChosisCountVo;
import com.tianque.xueliang.model.PsyChosisOrgCountVo;
import com.tianque.xueliang.model.TroubleDO;
import com.tianque.xueliang.model.VistorDO;
import com.tianque.xueliang.model.WatcherDO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * 精神病api
 * 
 * @author wuwei
 * @date 2018年9月25日 下午2:13:01
 */

@Api("精神病api")
@RestController
@RequestMapping("/api/psychosis/psychosis")
public class PsychosisController {

	@ApiOperation("精神病首页统计数据")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true),
		@ApiImplicitParam(paramType = "query", name = "orgId", value = "组织(可不传,不传默认为当前登陆用户组织)", dataType = "int", required = false),
		@ApiImplicitParam(paramType = "query", name = "queryType", value = "查询类型(预警类型 2 处置及抓拍情况 3 监管数据 4 处理效能  可不填,不填默认查询全部)", dataType = "int", required = false),
		@ApiImplicitParam(paramType = "query", name = "month", value = "查询年月(可不传,不传默认为当前年月)", dataType = "String", required = false) })
	@ApiResponses({ @ApiResponse(code = 404, message = "请求失败") })
	@RequestMapping(value = "/countPsyIndex", method = RequestMethod.POST)
	public @ResponseBody void countPsyIndex(@RequestBody @ApiParam(name="返回对象",value="json格式",required=false) PsyChosisCountVo psyChosisCountVo) {
	}

	@ApiOperation("精神病分页数据")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true),
			@ApiImplicitParam(name = "orgId", value = "组织机构ID", required = true, dataType = "Long", paramType = "query"),
			@ApiImplicitParam(name = "searchValue", value = "搜索值", required = false, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "page", value = "第几页", required = true, dataType = "int", paramType = "query"),
			@ApiImplicitParam(name = "rows", value = "每页条数", required = true, dataType = "int", paramType = "query") })
	@ApiResponses({ @ApiResponse(code = 404, message = "请求失败") })
	@RequestMapping(value = "/page", method = RequestMethod.POST)
	public @ResponseBody void page(@RequestBody @ApiParam(name="返回对象",value="json格式",required=false) PsyChosisBasicVo psyChosisBasicVo) {
	}

	@ApiOperation("精神病基础信息")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true),
			@ApiImplicitParam(paramType = "query", name = "userId", value = "查询精神病id", dataType = "Long", required = false),
			@ApiImplicitParam(paramType = "query", name = "psyIdCard", value = "查询精神病身份证id", dataType = "String", required = false) })
	@ApiResponses({ @ApiResponse(code = 404, message = "请求失败") })
	@RequestMapping(value = "/basicInfo", method = RequestMethod.POST)
	public @ResponseBody void basicInfo(@RequestBody @ApiParam(name="返回对象",value="json格式",required=false) BasicInfoDO basicInfoDO) {
	}

	@ApiOperation("精神诊断信息")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true),
			@ApiImplicitParam(paramType = "query", name = "userId", value = "查询精神病id", dataType = "Long", required = false),
			@ApiImplicitParam(paramType = "query", name = "psyIdCard", value = "查询精神病身份证id", dataType = "String", required = false) })
	@ApiResponses({ @ApiResponse(code = 404, message = "请求失败") })
	@RequestMapping(value = "/diagnoseInfo", method = RequestMethod.POST)
	public @ResponseBody void diagnoseInfo(@RequestBody @ApiParam(name="返回对象",value="json格式",required=false) DiagnoseInfoDO diagnoseInfoDO) {
	}

	@ApiOperation("监管人分页信息")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true),
			@ApiImplicitParam(name = "userId", value = "患者id", required = true, dataType = "Long", paramType = "query"),
			@ApiImplicitParam(name = "searchValue", value = "搜索值", required = false, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "page", value = "第几页", required = true, dataType = "int", paramType = "query"),
			@ApiImplicitParam(name = "rows", value = "每页条数", required = true, dataType = "int", paramType = "query"),
			@ApiImplicitParam(name = "sort", value = "排序字段", required = false, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "order", value = "排序方式", required = false, dataType = "String", paramType = "query") })
	@ApiResponses({ @ApiResponse(code = 404, message = "请求失败") })
	@RequestMapping(value = "/watchList", method = RequestMethod.POST)
	public @ResponseBody void watchList(@RequestBody @ApiParam(name="返回对象",value="json格式",required=false) WatcherDO watcherDO) {
	}

	@ApiOperation("日常走访信息")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true),
			@ApiImplicitParam(name = "userId", value = "患者id", required = true, dataType = "Long", paramType = "query"),
			@ApiImplicitParam(name = "searchValue", value = "搜索值", required = false, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "page", value = "第几页", required = true, dataType = "int", paramType = "query"),
			@ApiImplicitParam(name = "rows", value = "每页条数", required = true, dataType = "int", paramType = "query"),
			@ApiImplicitParam(name = "sort", value = "排序字段", required = false, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "order", value = "排序方式", required = false, dataType = "String", paramType = "query") })
	@ApiResponses({ @ApiResponse(code = 404, message = "请求失败") })
	@RequestMapping(value = "/vistorList", method = RequestMethod.POST)
	public @ResponseBody void vistorList(@RequestBody @ApiParam(name="返回对象",value="json格式",required=false) VistorDO vistorDO) {
	}

	@ApiOperation("肇事肇祸分页信息")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true),
			@ApiImplicitParam(name = "userId", value = "患者id", required = true, dataType = "Long", paramType = "query"),
			@ApiImplicitParam(name = "searchValue", value = "搜索值", required = false, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "page", value = "第几页", required = true, dataType = "int", paramType = "query"),
			@ApiImplicitParam(name = "rows", value = "每页条数", required = true, dataType = "int", paramType = "query"),
			@ApiImplicitParam(name = "sort", value = "排序字段", required = false, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "order", value = "排序方式", required = false, dataType = "String", paramType = "query") })
	@ApiResponses({ @ApiResponse(code = 404, message = "请求失败") })
	@RequestMapping(value = "/troubleList", method = RequestMethod.POST)
	public @ResponseBody void troubleList(@RequestBody @ApiParam(name="返回对象",value="json格式",required=false) TroubleDO troubleDO) {
	}

	@ApiOperation("人员关系画像")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true),
			@ApiImplicitParam(paramType = "query", name = "id", value = "查询精神病主键id", dataType = "Long", required = true) })
	@ApiResponses({ @ApiResponse(code = 404, message = "请求失败") })
	@RequestMapping(value = "/relationship", method = RequestMethod.POST)
	public @ResponseBody void relationship() {
	}

	@ApiOperation("患者轨迹")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true),
			@ApiImplicitParam(paramType = "query", name = "id", value = "查询精神病主键id", dataType = "Long", required = true),
			@ApiImplicitParam(paramType = "query", name = "start", value = "开始时间(时间戳，默认为结束时间前1天)", required = false, dataType = "Long"),
			@ApiImplicitParam(paramType = "query", name = "end", value = "结束时间(时间戳，默认为当前时间)", required = false, dataType = "Long") })
	@ApiResponses({ @ApiResponse(code = 404, message = "请求失败") })
	@RequestMapping(value = "/psyTrace", method = RequestMethod.POST)
	public @ResponseBody void psyTrace() {
	}

	@ApiOperation("患者地域热力图")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true),
			@ApiImplicitParam(paramType = "query", name = "orgId", value = "组织id(可不填,不填默认当前登陆用户组织id)", dataType = "Long", required = false)})
	@ApiResponses({ @ApiResponse(code = 404, message = "请求失败") })
	@RequestMapping(value = "/psyAreaRange", method = RequestMethod.POST)
	public @ResponseBody void psyAreaRange(@RequestBody @ApiParam(name="返回对象",value="json格式",required=false) PsyChosisOrgCountVo psyChosisOrgCountVo) {
	}

}
