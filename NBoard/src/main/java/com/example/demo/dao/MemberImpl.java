package com.example.demo.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.BlogDto;
import com.example.demo.dto.ContentsDto;

@Repository
public class MemberImpl extends CommonDao {
	@Autowired
	memberDao dao;

	public void insertMember(BlogDto dto) {

		try {
			dao.insertMember(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public BlogDto loginMember(BlogDto dto) {
		BlogDto result = null;
		try {
			result = dao.loginMember(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public void insertContents(ContentsDto dto) {
		try {
			dao.insertContents(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 블로그글목록
	public List<ContentsDto> selectContentsAll() {
		List<ContentsDto> result = null;
		try {
			result = dao.selectContentsAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// 상세글보기
	public ContentsDto selectContentsDetail(String conSeq) {
		ContentsDto result = null;
		try {
			result = dao.selectContentsDetail(conSeq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int deleteContents(String conSeq) {
		int result = 0;
		try {
			result = dao.deleteContents(conSeq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
