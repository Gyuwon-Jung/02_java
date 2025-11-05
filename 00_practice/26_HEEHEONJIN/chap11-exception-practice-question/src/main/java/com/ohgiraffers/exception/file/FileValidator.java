package com.ohgiraffers.exception.file;

public class FileValidator {
    public void validateExtension(String fileName) throws InvalidFileFormatException {
        fileName = fileName.toLowerCase();
        String[] arrStr = fileName.split(".");
        if (arrStr[1] != "jpg" || arrStr[1] != "png") {
            throw new InvalidFileFormatException("허용되지 않는 파일 형식입니다. (.jpg, .png 만 허용)");
        } else {
            System.out.println("파일 형식 검증 완료: " + fileName);
        }
    }
}
