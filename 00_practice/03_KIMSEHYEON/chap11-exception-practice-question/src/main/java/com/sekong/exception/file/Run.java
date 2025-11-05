package com.sekong.exception.file;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test7();
    }
    public void test7(){
        String fileName1 = "profile.jpg";
        String fileName2 = "document.pdf";


        FileValidator fv = new FileValidator();
        try{
            fv.validateExtension(fileName1);
            fv.validateExtension(fileName2);
        }catch(InvalidFileFormatException e){
            System.out.println(e.getMessage());
        }

    }
}
