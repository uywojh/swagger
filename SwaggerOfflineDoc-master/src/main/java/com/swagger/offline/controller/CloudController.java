package com.swagger.offline.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api("云图api")
@RestController
@RequestMapping("/api/cloud" )
public class CloudController {

	@ApiOperation(value = "分类重点人员统计", notes = "重点人员分类统计")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true) })
	@ResponseBody
	@RequestMapping(value = "/keyPersonClassifyStatistics", method = RequestMethod.POST)
	public void keyPersonClassifyStatistics() {
	}

	@ApiOperation(value = "各区重点人员统计", notes = "下辖重点人员统计")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true) })
	@ResponseBody
	@RequestMapping(value = "/underKeyPersonStatistics", method = RequestMethod.POST)
	public void underKeyPersonStatistics() {
	}

	@ApiOperation(value = "预警事件统计", notes = "预警事件统计")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true) })
	@ResponseBody
	@RequestMapping(value = "/warningEventStatistics", method = RequestMethod.POST)
	public void warningEventStatistics() {
	}

	@ApiOperation(value = "下辖预警事件统计", notes = "下辖预警事件统计")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true) })
	@ResponseBody
	@RequestMapping(value = "/underWarningEventStatistics", method = RequestMethod.POST)
	public void underWarningEventStatistics() {
	}
	
	@ApiOperation(value = "预警类型统计", notes = "预警类型统计")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true) })
	@ResponseBody
	@RequestMapping(value = "/underWarningEventByType", method = RequestMethod.POST)
	public void underWarningEventByType() {
	}

	@ApiOperation(value = "预警事件等级统计", notes = "预警事件等级统计")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true)})
	@ResponseBody
	@RequestMapping(value = "/warningEventLevelStatistics", method = RequestMethod.POST)
	public void warningEventLevelStatistics() {
	}

	@ApiOperation(value = "当日预警事件列表", notes = "当日预警事件列表")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true)})
	@ResponseBody
	@RequestMapping(value = "/warningEventList", method = RequestMethod.POST)
	public void warningEventList() {
	}
	
	@ApiOperation(value = "根据ID获取预警事件详情", notes = "根据ID获取预警事件详情")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true),
		@ApiImplicitParam(name = "id", value = "预警事件ID", required = true, dataType = "Long", paramType = "query")
	})
	@ResponseBody
	@RequestMapping(value = "/getWarningEventById", method = RequestMethod.POST)
	public void getWarningEventById() {
	}
	
	@ApiOperation(value = "摄像头点位列表", notes = "摄像头点位列表")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true),
		@ApiImplicitParam(name = "page", value = "页数", required = true, dataType = "Integer", paramType = "query"),
		@ApiImplicitParam(name = "rows", value = "每页条数", required = true, dataType = "Integer", paramType = "query")
	})
	@ResponseBody
	@RequestMapping(value = "/cameraList", method = RequestMethod.POST)
	public void cameraList() {
	}
	
	@ApiOperation(value = "布控人员列表", notes = "布控人员列表")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true),
			@ApiImplicitParam(name = "page", value = "页数", required = true, dataType = "Integer", paramType = "query"),
			@ApiImplicitParam(name = "rows", value = "每页条数", required = true, dataType = "Integer", paramType = "query")
	})
	@ResponseBody
	@RequestMapping(value = "/personList", method = RequestMethod.POST)
	public void personList() {
	}
	
	@ApiOperation(value="布控车辆列表", notes="布控车辆列表")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true),
		@ApiImplicitParam(name = "page", value = "页数", required = true, dataType = "int", paramType = "query"),
		@ApiImplicitParam(name = "rows", value = "每页条数", required = true, dataType = "int", paramType = "query")
	})
	@ResponseBody
	@RequestMapping(value = "/vehicleList", method = RequestMethod.POST)
	public void vehicleList() {
	}
	
	@ApiOperation(value = "视频资源统计", notes = "视频资源统计")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query", name = "sid", value = "登录sid", dataType = "String", required = true)
	})
	@ResponseBody
	@RequestMapping(value = "/cameraStatistics", method = RequestMethod.POST)
	public void cameraStatistics() {
	}

}
