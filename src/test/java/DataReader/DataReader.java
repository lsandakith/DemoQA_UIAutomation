package DataReader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class DataReader {
    Properties GetData;

    public  DataReader() {
        try {
            GetData = new Properties();
            File filepath = new File("src/test/java/Utility/Data.properties");
            FileInputStream path = new FileInputStream(filepath);
            GetData.load(path);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public String Chromepath()
    {
        String cromepath= GetData.getProperty("Chromepath");
        return cromepath;
    }

    public String url()
    {
        String url= GetData.getProperty("url");
        return url;
    }

    public String Username()
    {
        String Username= GetData.getProperty("Username");
        return Username;
    }

    public String Password()
    {
        String Password=GetData.getProperty("Password");
        return Password;
    }

}
