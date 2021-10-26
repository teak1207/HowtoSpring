package com.springbook.biz.board;

import java.util.List;

public interface BoardService {

	//�߰�
	void insertBoard(BoardVO vo);
	//����
	void updateBoard(BoardVO vo);
	//����
	void deleteBoard(BoardVO vo);
	// �ϳ� ��������
	BoardVO getBoard(BoardVO vo);
	// ��ü�˻�
	List<BoardVO> getBoardList(BoardVO vo);

	
}
