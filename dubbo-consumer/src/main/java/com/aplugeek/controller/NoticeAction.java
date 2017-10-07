package com.aplugeek.controller;

import com.aplugeek.dto.Notice;
import com.aplugeek.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/notice")
public class NoticeAction {

	@Autowired
	private NoticeService noticeService;

	/**
	 * 返回单个实体json
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/getNotice.json", method = RequestMethod.GET)
	@ResponseBody
	public Notice getNoticeBean(Model model) {
		return noticeService.getNotice();
	}

}
