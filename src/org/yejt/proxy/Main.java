package org.yejt.proxy;

/**
 * Created by Yejt on 2017/8/24 0024.
 */
public class Main
{
    public static void main(String[] args)
    {
        Graphic image = new Image();
        Graphic imageProxy = new ImageProxy(image);
        imageProxy.load("E:\\Programming\\Java\\DesignPattern\\src\\org\\yejt\\proxy\\1.jpg");
        imageProxy.draw();
        imageProxy.save("E:\\Programming\\Java\\DesignPattern\\src\\org\\yejt\\proxy\\new.jpg");
    }
}
