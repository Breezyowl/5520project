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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.captainxero.project.entity.Transcation;
import com.captainxero.project.service.TranscationService;

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
@RequestMapping("/transcation")
public class TranscationController {
	@Autowired
    private TranscationService transcationService;
	private static final Logger logger = LogManager.getLogger(TranscationController.class);
    @ApiOperation(value="获取用户交易数据", notes="用户交易")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "custId", value = "用户id", required = true, dataType = "string"),
            @ApiImplicitParam(name = "cardNo", value = "卡号", required = false, dataType = "string"),
            @ApiImplicitParam(name = "trxType", value = "收入支出类别", required = false, dataType = "string"),
            @ApiImplicitParam(name = "consumeType", value = "消费类别", required = false, dataType = "string")
    })
    @RequestMapping(value="/selTrxList", method=RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Transcation>> getCardInfosList(Transcation transcation){
    	String custId = transcation.getCustId();
    	String cardNo = transcation.getCardNo();
    	String trxType = transcation.getTrxType();
    	String consumeType = transcation.getConsumeType();

    	Map<String,Object> columnMap = new HashMap<>();
    	columnMap.put("Cust_ID", custId);
    	columnMap.put("Card_No", cardNo);
    	columnMap.put("Trx_Type", trxType);
    	columnMap.put("Consume_Type", consumeType);
    	List<Transcation> resList =  transcationService.selectByMap(columnMap);
    	
    	System.out.println(columnMap.toString());
    	System.out.println(resList.toString());
		return new ResponseEntity<List<Transcation>>(resList,HttpStatus.OK);
    	
    	
    }
}

