package service.face;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import dto.Profile;

public interface ProfileService {

	/*
	*//**
		 * 게시글 전체 조회
		 * 
		 * @return
		 *//*
			 * public List<Profile> getList();
			 */

	/*
	 * 프로필 회원정보 가져오기
	 */
	public Profile getProfile(HttpServletRequest req);

	//프로필업데이트
	public void updateProfile(HttpServletRequest req);
	
	
}


