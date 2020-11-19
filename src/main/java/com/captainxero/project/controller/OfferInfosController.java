package com.captainxero.project.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.captainxero.project.entity.OfferInfos;
import com.captainxero.project.service.OfferInfosService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Dylan
 * @since 2020-11-18
 */
@RestController
@RequestMapping("/offerInfos")
public class OfferInfosController {
	@Autowired
	private OfferInfosService  offerInfosService;
	
	@ApiOperation(value="获取消费偏好数据", notes="消费偏好")
	 @ApiImplicitParams({
        @ApiImplicitParam(name = "offerId", value = "消费id:如1", required = false, dataType = "string"),
        @ApiImplicitParam(name = "offerNm", value = "消费类别名：如FOOD", required = false, dataType = "string"),
        @ApiImplicitParam(name = "openInd", value = "启用标志1,0", required = false, dataType = "string"),
        @ApiImplicitParam(name = "cardNo", value = "卡号", required = false, dataType = "string"),
        
	 })
	 @RequestMapping(value="/selOfferList", method=RequestMethod.GET)
	 @ResponseBody
	 public ResponseEntity<List<OfferInfos>> selOfferInfos(OfferInfos offerInfos){	     
	     Map<String,Object> columnMap = new HashMap<>();
	     columnMap.put("Offer_ID", offerInfos.getOfferId()); 
	     columnMap.put("Offer_Nm",  offerInfos.getOfferNm());
	     columnMap.put("Open_Ind", offerInfos.getOpenInd());
	     columnMap.put("Card_No",offerInfos.getCardNo());
	     
		 
	   	 List<OfferInfos> resList = offerInfosService.selectByMap(columnMap);
	   	 return new ResponseEntity<List<OfferInfos>>(resList,HttpStatus.OK);		 
	 }
	
	 @ApiOperation(value="更新offer数据", notes = "更新消费偏好")
	 @RequestMapping(value="/update",method=RequestMethod.POST)
	 @ResponseBody
	 public ResponseEntity<String> updateOfferInfos( @RequestBody List<OfferInfos> offerInfos){
		 System.out.println(offerInfos.toString());
		 
		 boolean res = offerInfosService.updateBatchById(offerInfos);
		 if(res) {
   		 return new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
		 }else {
			 return new ResponseEntity<String>("FAIL",HttpStatus.OK);   	 
		 }
	 }
}

