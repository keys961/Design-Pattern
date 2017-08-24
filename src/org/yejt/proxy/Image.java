package org.yejt.proxy;

import javax.swing.*;
import java.awt.*;
import java.io.*;

/**
 * Created by Yejt on 2017/8/24 0024.
 */
public class Image implements Graphic
{
    private String originPath;

    @Override
    public boolean isLoaded()
    {
        return !originPath.equals("");
    }

    @Override
    public void load(String path)
    {
        this.originPath = path;
    }

    @Override
    public void save(String path)
    {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try
        {
            inputStream = new FileInputStream(originPath);
            outputStream = new FileOutputStream(path);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        try
        {
            byte[] buffer = new byte[1024];
            int readBytes = 0;
            while ((readBytes = inputStream.read(buffer)) != -1)
                outputStream.write(buffer, 0, readBytes);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        try
        {
            inputStream.close();
            outputStream.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    @Override
    public void draw()
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                JFrame frame = new JFrame();
                frame.setTitle("Image Viewer");
                frame.setSize(1024, 768);
                JLabel label = new JLabel();
                frame.add(label);

                label.setIcon(new ImageIcon(originPath));
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
