package com.sekong.exception.auth;

public class AuthChecker {
    public void checkAdminPermission(String userId, boolean isAdmin) throws PermissionDeniedException{
        if(!isAdmin){
            throw new PermissionDeniedException(userId+"님은 관리자 권한이 없습니다.");
        }
        System.out.println("관리자 권한이 확인되었습니다. "+userId+"님 환영합니다.");
    }

}
