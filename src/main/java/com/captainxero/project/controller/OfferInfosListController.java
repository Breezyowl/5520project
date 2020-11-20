package com.captainxero.project.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.captainxero.project.entity.OfferInfos;
import com.captainxero.project.entity.OfferInfosList;
import com.captainxero.project.service.OfferInfosListService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Dylan
 * @since 2020-11-20
 */
@RestController
@RequestMapping("/offerInfosList")
public class OfferInfosListController {
	@Autowired
	private OfferInfosListService offerInfosListService;
	@ApiOperation(value="获取消费偏好数据", notes="消费偏好")
	 @ApiImplicitParams({
       @ApiImplicitParam(name = "offerId", value = "消费id:如1", required = false, dataType = "string"),
       @ApiImplicitParam(name = "offerNm", value = "消费类别名：如FOOD", required = false, dataType = "string")
	 })
	 @RequestMapping(value="/selList", method=RequestMethod.GET)
	 @ResponseBody
	 public ResponseEntity<List<OfferInfosList>> selOfferInfos(OfferInfosList offerInfosList ){	     
	     Map<String,Object> columnMap = new HashMap<>();
	     columnMap.put("Offer_ID", offerInfosList.getOfferId()); 
	     columnMap.put("Offer_Nm",  offerInfosList.getOfferNm());
	     
	     List<OfferInfosList> resList = offerInfosListService.selectByMap(columnMap);
	     return new ResponseEntity<List<OfferInfosList>>(resList,HttpStatus.OK);	

	}
	
}

