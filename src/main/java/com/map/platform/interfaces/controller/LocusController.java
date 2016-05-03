package com.map.platform.interfaces.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.map.platform.interfaces.beans.LocusInfo;
import com.map.platform.interfaces.service.ILocusService;

@Controller
@RequestMapping("/locus")
public class LocusController {
	@Resource  
    private ILocusService locusService;  
      
    @RequestMapping("/addLocus")
    @ResponseBody
    public String toIndex(@RequestParam("param") String param,@RequestParam("mac") String mac,HttpServletRequest request){  
    	LocusInfo locusInfo = new LocusInfo();
    	locusInfo.setAk(param);
    	locusInfo.setMac(mac);
    	try {
			locusService.add("LocusMapper.add", locusInfo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(param+"----------------"+mac);
        return "showUser";  
    } 
}
