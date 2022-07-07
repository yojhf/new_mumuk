package dao;

import java.util.List;

import dto.Menu;

public interface MenuDao
{
	// 데이터 넣기
	public void insert(Menu menu);
	
	// 데이터 전체검색
	public List<Menu> selectAll();

	// 데이터 메뉴검색
	public Menu search();

	// 데이터 업데이트
	public void update(Menu menu);

	// 데이터 랜덤추천
	public Menu random();

	// 데이터 삭제
	public void del(int id);



}
