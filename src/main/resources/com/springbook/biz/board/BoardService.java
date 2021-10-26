package com.springbook.biz.board;

import java.util.List;

public interface BoardService {

	//추가
	void insertBoard(BoardVO vo);
	//수정
	void updateBoard(BoardVO vo);
	//삭제
	void deleteBoard(BoardVO vo);
	// 하나 가져오기
	BoardVO getBoard(BoardVO vo);
	// 전체검색
	List<BoardVO> getBoardList(BoardVO vo);

	
}
