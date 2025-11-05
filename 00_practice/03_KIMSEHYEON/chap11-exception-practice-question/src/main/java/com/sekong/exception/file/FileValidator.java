package com.sekong.exception.file;

import java.util.Arrays;

public class FileValidator {
    public void validateExtension(String fileName) throws InvalidFileFormatException{
        // fileName = profile.jpg
        String[] str = fileName.split("\\.");
        System.out.println("str = " + Arrays.toString(str));
        if(str[1].equals("jpg")||str[1].equals("png")){
            System.out.println("파일 형식 검증 완료: "+fileName);
        }else{
            throw new InvalidFileFormatException("허용되지 않는 파일 형식입니다. (.jpg, .png 만 허용)");
        }
    }

}
