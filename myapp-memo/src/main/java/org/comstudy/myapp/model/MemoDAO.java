package org.comstudy.myapp.model;

import java.util.ArrayList;
import java.util.List;

public class MemoDAO {
	public List<Memo> memoList = new ArrayList<Memo>();
	
	{
		memoList.add(new Memo(0, "memo 1", "memo content 1"));
		memoList.add(new Memo(1, "memo 2", "memo content 2"));
		memoList.add(new Memo(2, "memo 3", "memo content 3"));
		memoList.add(new Memo(3, "memo 4", "memo content 4"));
	}
	private int idCnt = 4;
	
	public List<Memo> getAllMemos() {
		return memoList;
	}
	
	public Memo getMemoById(int id) {
		for(Memo memo : memoList) {
			if (memo.getId() == id) return memo;
		}
		return null;
	}
	
	public void editMemo(int id, String title, String content) {
		for(Memo memo : memoList) {
			if (memo.getId() == id) {
				memo.setTitle(title);
				memo.setContent(content);
				return;
			};
		}
	}
	
	public void deleteMemo(int id) {
		for(Memo memo : memoList) {
			if (memo.getId() == id) {
				memoList.remove(memo);
				return;
			}
		}
	}
	
	public void addMemo(String title, String content) {
		Memo newMemo = new Memo(idCnt++, title, content);
		memoList.add(newMemo);
	}
}
