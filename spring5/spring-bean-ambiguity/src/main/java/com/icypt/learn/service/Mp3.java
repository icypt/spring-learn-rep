package com.icypt.learn.service;

import com.icypt.learn.annotation.Say;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/4/20 10:56
 * version：1.0
 * description：
 */
@Component
public class Mp3 {
    private Music music;

//    @Autowired
//     public Mp3(Music music) {
//        this.music = music;
//    }

    public String getMuiscType() {
        return music.getMusicType();
    }

//    @Autowired
//    @Qualifier("fashionMusic")
//    public void setMusic(Music music) {
//        this.music = music;
//    }

//    @Autowired
//    @Qualifier("fashion")
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    @Autowired
    @Qualifier("fashion")
    @Say
    public void setMusic(Music music) {
        this.music = music;
    }
}
