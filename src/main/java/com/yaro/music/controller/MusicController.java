package com.yaro.music.controller;

import com.yaro.music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicController {

    private MusicService service;

    @Autowired
    public MusicController(MusicService service) {
        this.service = service;
    }

    @GetMapping("/test")
    public String test()
    {
        String id= service.searchSongId("出现又离开");
        return service.getPlayUrl(id);
    }
}
