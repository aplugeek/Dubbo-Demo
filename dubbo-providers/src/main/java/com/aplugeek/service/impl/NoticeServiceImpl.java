package com.aplugeek.service.impl;

import com.aplugeek.dto.Notice;
import com.aplugeek.service.NoticeService;
import com.alibaba.dubbo.config.annotation.Service;

import java.util.Date;

/**
 * @Service dubbo Annotion  means expose interface
 */
@Service
public class NoticeServiceImpl implements NoticeService {

	@Override
	public Notice getNotice() {
		Notice notice = new Notice();
		notice.setId(1);
		notice.setName("Aplugeek");
		notice.setDate(new Date());
		
		return notice;
	}

}
