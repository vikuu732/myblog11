package com.myblog.myblog11;

public class SampleTest {
    public static int test1() {
        SampleTest sampleTest = new SampleTest();
        sampleTest.returnOtp();
        int otp = sampleTest.returnOtp();
        return otp;
    }

    public int returnOtp(){
        return 123456;
    }
}
