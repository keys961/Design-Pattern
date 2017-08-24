package org.yejt.proxy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Yejt on 2017/8/24 0024.
 */
public class ImageProxy implements Graphic //Virtual & Protection Proxy
{
    private Graphic graphic;

    public ImageProxy(Graphic graphic)
    {
        this.graphic = graphic;
    }

    @Override
    public void load(String path)
    {
        File file = new File(path);
        if(file.exists())
            graphic.load(path);
        else
            System.out.println("Load the image failed!");
    }

    @Override
    public void save(String path)
    {
        File newFile = new File(path);
        if(!newFile.exists() && graphic.isLoaded())
        {
            boolean status = false;
            try
            {
                status = newFile.createNewFile();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            if(status)
                graphic.save(path);
        }
        else
        {
            System.out.println("Save the image failed!");
        }
    }

    @Override
    public boolean isLoaded()
    {
        return graphic.isLoaded();
    }

    @Override
    public void draw()
    {
        if(isLoaded())
            graphic.draw();
    }
}
