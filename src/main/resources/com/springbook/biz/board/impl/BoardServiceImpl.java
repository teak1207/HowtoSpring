package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
//private Log4jAdvice log;

	public BoardServiceImpl() {
	}

	@Override
	public void insertBoard(BoardVO vo) {
//		 boardDAO.insertBoard(vo);
//		if (vo.getSeq() == 0) {
//			throw new IllegalArgumentException("0번은 글은 등록할 수 없습니다");
//		}
		boardDAO.insertBoard(vo);

	}

	@Override
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		// log.printLogging();
		return boardDAO.getBoardList(vo);
	}

}
