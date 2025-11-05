package com.sekong.exception.user;

public class UserValidator {
    public void validateUserInfo(String userId, String userName) throws MissingInfoException{
        if((userId == null)&&(userName == null)){
            throw new MissingInfoException("필수 정보 ID NAME이 누락되었습니다.");

        }else if(userId == null) {
            throw new MissingInfoException("필수 정보 Id가 누락되었습니다.");
        }else if(userName == null) {
            throw new MissingInfoException("필수 정보 name이 누락되었습니다.");
        }
        System.out.println("사용자 정보 검증 완료");
    }
}
