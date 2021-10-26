package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {

		// ������ ����
		AbstractApplicationContext container   = new GenericXmlApplicationContext("applicaionContext.xml");
		// 2.������ �����̳ʷκ��� BoardServiceImpl ��ü�� LookUP�Ѵ�
		BoardService boardservice = (BoardService) container.getBean("boardService");

		// 3. �� ��� ��� �׽�Ʈ
		BoardVO vo = new BoardVO();
		vo.setTitle("temptitle");
		vo.setWriter("tempwriter");
		vo.setContent("tempcontent");
		boardservice.insertBoard(vo);

		// 4.�� ��� �˻� ��� �׽�Ʈ
		List<BoardVO> boardList = boardservice.getBoardList(vo);
		
		for (BoardVO board : boardList) {
			System.out.println("===>" + board.toString());
		}
		
		container.close();
	}
}
