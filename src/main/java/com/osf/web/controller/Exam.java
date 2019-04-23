package com.osf.web.controller;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Exam {
	public String str;
	
	/*
	 * Log4j level 순서 
	 * 1. TRACE		되게 상세한 정보
	 * 2. DEBUG  	개발할때 필요한 정보
	 * 3. INFO   	인포메이션
	 * 4. WARW    	동작은 하지만 위험하다
	 * 5. ERROR    	실제 에러
	 * 6. FATAL    	진짜 치명적인 에러
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		String str=null;
		Exam e= new Exam();

		if("홍길동".equals(str)) {
			log.info("I'm name is 홍길동");
		}else {
			log.debug("나는  ? ?");
			log.info("I'm not name is 홍갈동");
		}
		log.warn("프로그햄 비정상 종요, 그치만 문제는 없음 .");
	}
}
