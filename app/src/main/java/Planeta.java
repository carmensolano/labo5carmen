package com.carme.labo5carmen;
import android.widget.TextView;

/**
 * Created by uca on 04-16-18.
 */

public class Planeta  {
    private String name;
    private String info;

    public Planeta(String name,String info ){
        this.name= name;
        this.info= info;
    }

    public String getName(){return  name;}
    public String getInfo(){return info;}
}
