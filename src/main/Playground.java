//select the class in the file explorer panel and do shift+F6 to rename

package main;

import basewindow.ComputerFileManager;
import lwjglwindow.LWJGLWindow;

import java.io.File;
import java.util.ArrayList;

public class Playground
{
    public static void main(String[] args)
    {
        boolean relaunch = System.getProperties().toString().contains("Mac OS X");

        for (int i = 0; i < args.length; i++)
        {
            if (args[i].equals("mac") || args[i].equals("no_relaunch"))
                relaunch = false;
        }
    }
}