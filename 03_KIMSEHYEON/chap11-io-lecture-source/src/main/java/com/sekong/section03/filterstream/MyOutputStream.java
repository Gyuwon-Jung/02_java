package com.sekong.section03.filterstream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.ObjectOutputStream;

public class MyOutputStream extends ObjectOutputStream {
    public MyOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException{

    }


}
