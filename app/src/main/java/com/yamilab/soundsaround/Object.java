package com.yamilab.soundsaround;

import java.io.Serializable;

/**
 * Created by Михаил on 29.03.2017.
 */

public class Object implements Serializable {

    private String name;
    private Integer image;

    private Integer sound;

    public Object(String name, Integer image, Integer sound){
        this.name= name;
        this.image = image;

        this.sound = sound;
    }

    public Object() {

    }

    public String getName(){
        return name;
    }

    public void  setName(String name){
        this.name = name;
    }

    public Integer getImageSmall(){
        return image;
    }

    public void  setImageSmall(Integer imageSmall){
        this.image = imageSmall;
    }



    public Integer getSound(){
        return sound;
    }

    public void  setSound(Integer sound){
        this.sound = sound;
    }
}
