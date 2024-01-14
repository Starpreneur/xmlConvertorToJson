package com.example.xmlConvertorToJson.controller;

import com.example.xmlConvertorToJson.service.XmlToJsonConvertorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class xmlToJsonConvertorController {

    @Autowired
    XmlToJsonConvertorService xmlToJsonConvertorService;

    @PostMapping("/xmlToJson")
    public String xmlToJsonConversion(@RequestBody String xml) throws Exception {
        String json  = xmlToJsonConvertorService.convertXmlToJson(xml);
        return json;
    }

}
