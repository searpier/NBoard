package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.example.demo.dto.BlogDto;
import com.example.demo.dto.ContentsDto;

@Mapper
public interface memberDao {
	public void insertMember(BlogDto dto);//회원가입
	public BlogDto loginMember(BlogDto dto);//로그인
	public void insertContents(ContentsDto dto);//글쓰기
	public List<ContentsDto> selectContentsAll();//블로그글목록
	public ContentsDto selectContentsDetail(String conSeq);//상세글보기
	public int deleteContents(String conSeq);//글삭제
}