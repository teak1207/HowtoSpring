package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {

		// 스프링 구동
		AbstractApplicationContext container   = new GenericXmlApplicationContext("applicaionContext.xml");
		// 2.스프링 컨테이너로부터 BoardServiceImpl 객체를 LookUP한다
		BoardService boardservice = (BoardService) container.getBean("boardService");

		// 3. 글 등록 기능 테스트
		BoardVO vo = new BoardVO();
		vo.setTitle("temptitle");
		vo.setWriter("tempwriter");
		vo.setContent("tempcontent");
		boardservice.insertBoard(vo);

		// 4.글 목록 검색 기능 테스트
		List<BoardVO> boardList = boardservice.getBoardList(vo);
		
		for (BoardVO board : boardList) {
			System.out.println("===>" + board.toString());
		}
		
		container.close();
	}
}
