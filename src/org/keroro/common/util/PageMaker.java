package org.keroro.common.util;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString //디버깅용
public class PageMaker {
	
	private boolean prev;
	private boolean next;
	private int start;
	private int end;
	private PageInfo pageInfo;
	private int total;
	
	
	public PageMaker(PageInfo pageInfo, int total) {
		
		this.total = total;
		this.pageInfo = pageInfo;
		
		//현재 페이지 번호
		int currentPage = pageInfo.getPage();
		//perSheet 개수
		
		//임시 마지막 번호 13 -> 1.3 -> 2.0 -> 20
		int tempEnd = (int)(Math.ceil(currentPage / 10.0) * 10);
		
		this.start = tempEnd - 9;
		
		//진짜 마지막 페이지 131 -> 14
		int realEnd = (int)(Math.ceil(total / (this.pageInfo.getPerSheet() * 1.0)));
		
		//end 값 설정
		this.end = realEnd < tempEnd ? realEnd : tempEnd; 
				
		//prev
		this.prev = start > 1;
		
		//next
		this.next = end * this.pageInfo.getPerSheet() < total ? true: false;

		
	}
	
}
