package com.captainxero.project.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.captainxero.project.entity.CardInfos;
import com.captainxero.project.service.CardInfosService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Dylan
 * @since 2020-11-17
 */
@RestController
@RequestMapping("/cardInfos")


public class CardInfosController {
	@Autowired
    private CardInfosService  cardInfosService;
	private static final Logger logger = LogManager.getLogger(CardInfosController.class);
    @ApiOperation(value="获取用户卡列表", notes="支付卡片")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "custId", value = "用户id", required = true, dataType = "String"),
            @ApiImplicitParam(name = "cardNo", value = "卡号", required = false, dataType = "String"),
            @ApiImplicitParam(name = "cardTyp", value = "卡类型", required = false, dataType = "String")
    })
    @RequestMapping(value="/selCardList", method=RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<CardInfos>> getCardInfosList(CardInfos cardInfos){
    	
    	Map<String,Object> columnMap = new HashMap<>();
    	columnMap.put("Cust_ID", cardInfos.getCustId());
    	columnMap.put("Card_No", cardInfos.getCardNo());
    	columnMap.put("Card_Typ", cardInfos.getCardTyp());
    	List<CardInfos> cardList =  cardInfosService.selectByMap(columnMap);
		return new ResponseEntity<List<CardInfos>>(cardList,HttpStatus.OK);
    	
    	
    }
}

