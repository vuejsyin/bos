package com.xr.base;

import com.xr.util.FileUtil;
import com.xr.util.ToFileUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class FileTest {
    private static final String UPLOAD_FOLDER = "/";
    @Test
    public void test() throws UnsupportedEncodingException {
        byte[] bytes = FileUtil.readBytesFromFile("D:/nm.ppt");
        System.out.println("bytes："+bytes);
        ToFileUtil.writeBytesToFileClassic(bytes, UPLOAD_FOLDER + "nm1.ppt");
        System.out.println(UPLOAD_FOLDER + "nm1.ppt");
    }
}
