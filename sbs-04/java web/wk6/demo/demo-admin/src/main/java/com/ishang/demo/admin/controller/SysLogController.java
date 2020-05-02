package com.ishang.demo.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ishang.demo.admin.model.SysLog;
import com.ishang.demo.admin.service.SysLogService;
import com.ishang.demo.core.http.HttpResult;
import com.ishang.demo.core.page.PageRequest;

/**
 * 操作日志控制器
 * create by zhayao 2020年3月30日
 */
@RestController
@RequestMapping("log")
public class SysLogController {

	@Autowired
	private SysLogService sysLogService;

	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(sysLogService.findPage(pageRequest));
	}
	
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<SysLog> records) {
		return HttpResult.ok(sysLogService.delete(records));
	}
}
