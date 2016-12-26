package com.edw.mavenproject5.controller;

import com.edw.mavenproject5.service.DosenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <pre>
 *  com.edw.mavenproject5.controller.IndexController 
 * </pre>
 *
 * @author edwin < edwinkun at gmail dot com >
 * Dec 26, 2016 10:16:47 PM
 *
 */
@Controller
public class IndexController {
    
    @Autowired
    private DosenService dosenService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap modelMap){
        modelMap.put("dosens", dosenService.getDosens());
        return "index";
    }
    
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String get(ModelMap modelMap, String id){
        modelMap.put("dosen", dosenService.getDosen(id));
        return "index";
    }
}
