package com.example.demo.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MemberImpl;
import com.example.demo.dao.memberDao;
import com.example.demo.dto.BlogDto;
import com.example.demo.dto.ContentsDto;

@Service
@MapperScan("com.example.demo.dao")
public class BlogService {

	@Autowired
	MemberImpl repo;

	public void insertMember(BlogDto dto) {

		try {
			repo.insertMember(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public BlogDto loginMember(BlogDto dto) {
		BlogDto result = null;
		try {
			result = repo.loginMember(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public void insertContents(ContentsDto dto) {
		try {
			repo.insertContents(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 블로그글목록
	public List<ContentsDto> selectContentsAll() {
		List<ContentsDto> result = null;
		try {
			result = repo.selectContentsAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// 상세글보기
	public ContentsDto selectContentsDetail(String conSeq) {
		ContentsDto result = null;
		try {
			result = repo.selectContentsDetail(conSeq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int deleteContents(String conSeq) {
		int result = 0;
		try {
			result = repo.deleteContents(conSeq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
