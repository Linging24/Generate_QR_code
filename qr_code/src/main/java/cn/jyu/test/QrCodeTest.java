package cn.jyu.test;

import cn.jyu.utils.QRCodeUtil;

import java.util.UUID;

public class QrCodeTest {
    /*
        QRCodeUtil.encode(text, imgPath, destPath, true);
            text：编码到二维码中的内容，这里是“我是憨批”
            imgPath：要嵌入二维码的图片路径，如果不写或者为null则生成一个没有嵌入图片的纯净的二维码
            destPath：生成的二维码的存放路径
            true：表示将嵌入二维码的图片进行压缩，如果为“false”则表示不压缩。

        QRCodeUtil.decode(destPath);
            destPath：将要解析的二维码的存放路径
            该方法返回值为String类型，即返回解析出的文字或者数字等。
     */
    public static void main(String[] args) throws Exception {
        // 存放在二维码中的内容或者链接
        String text = "https://blog.csdn.net/Linging_24";
        // 嵌入二维码的图片路径
        //String imgPath = "C:/Users/Linging/Desktop/1.jpg";    //自定义路径
        String imgPath = QrCodeTest.class.getClassLoader().getResource("image/center.jpg").getPath();
        // 生成的二维码的路径及名称---自由填写
        String prePath = "C:/Users/Linging/Desktop/";   //二维码图片生成的目录
        String imageName = UUID.randomUUID().toString();    //二维码的名称
        String imageSuffix = ".jpg";                    //二维码生成的图片的后缀
        String destPath = prePath + imageName + imageSuffix;
        //生成二维码
        QRCodeUtil.encode(text, imgPath, destPath, true);
        // 解析二维码
        String str = QRCodeUtil.decode(destPath);
        // 打印出解析出的内容
        System.out.println(str);
    }
}

