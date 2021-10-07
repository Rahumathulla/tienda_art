package com.essar.utils;


import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;
import javax.swing.JOptionPane;


public class PropertyUtil {
	public Properties readProperties() {
    	Properties prop =null;
    	//InputStream inStream = null;
    	//File jarPath=new File(PropertyUtil.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        //String propertiesPath=jarPath.getParentFile().getAbsolutePath();
        //System.out.println(" propertiesPath-"+propertiesPath);
        try {
        	//inStream = this.getClass().getResourceAsStream(propertiesPath+"/application.properties");
            prop = new Properties();
            prop.load(new FileInputStream("E:\\Applications\\Tienda\\config_art.properties"));
            //prop.load(new FileInputStream("application.properties"));
        } catch (IOException io) {
            JOptionPane.showConfirmDialog(null, "The configuration file is not found.");
            io.printStackTrace();
        }
        
        return prop;

    }

}
