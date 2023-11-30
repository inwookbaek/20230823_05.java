package com.lec.ex02_board;

public class BoardFactory {

	// Singleton, Factory
	// 외부에서 BoardFactory 생성하지 못하도록 선언
	private BoardFactory() {} 
	private static BoardDAOImpl bddao = null;
	public static BoardDAOImpl getInstance() {
		if(bddao == null) bddao = new BoardDAOImpl();
		return bddao;
	}
}
