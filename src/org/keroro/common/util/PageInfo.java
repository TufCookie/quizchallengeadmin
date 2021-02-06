package org.keroro.common.util;

import lombok.Getter;
import lombok.Builder.Default;

@Getter //jsp에서 getParameter하기 위해서 선언한다.
public class PageInfo {
	@Default
	private int page = 1; //default를 하면 생성자를 안만들고 기본값을 준다.
						  //Setter를 따로 잡으려고 한다
						  
	@Default
	private int perSheet = 10;
	
	//setter를 따로 잡는 부분이다.
	public void setPage(int page) {
		
		if(page <= 0) {
			this.page = 1;
			return;
		}
		
		this.page = page;
		
	}
	
	public void setPerSheet(int perSheet) {
		
		if(perSheet > 100) {
			this.perSheet = 100;
			return;
		}
		
		if(perSheet < 10) {
			this.perSheet = 10;
			return;
		}
		
		this.perSheet = perSheet;
		
	}
}
