package utils;

import java.util.*;
import java.io.*;
public class ReadProperties {

        public static String readProperties(String key)throws Exception{
            FileReader reader=new FileReader("env/default.properties");

            Properties p=new Properties();
            p.load(reader);
            return p.getProperty(key);
        }

}
