package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Product.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.Product.Smartphone;
import com.kh.chap01_beforeVSafter.before.model.vo.Product.Tv;

public class Run {
    public static void main(String[] args) {
        Desktop d = new Desktop();
        System.out.println(d.information());

        Desktop d2 = new Desktop("삼성","ss-01","삼성데스크탑",200,true);
        System.out.println(d2.information());
        Smartphone s2 =new Smartphone("삼성","22","갤럭시 22ultra",100,"kt");
        System.out.println(s2.information());

    }
}
