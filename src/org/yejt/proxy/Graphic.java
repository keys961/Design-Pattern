package org.yejt.proxy;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Yejt on 2017/8/24 0024.
 */
public interface Graphic
{
    public void load(String path);

    public void save(String path);

    public void draw();

    public boolean isLoaded();
}
