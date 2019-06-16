package com.bit.sc.module.group.vo;

import java.util.Date;
import com.bit.base.vo.BasePageVo;
import lombok.Data;

/**
 * GroupRel
 * @author generator
 */
@Data
public class GroupRelVO extends BasePageVo{

	//columns START

    /**
     * id
     */	
	private Long id;
    /**
     * 组id
     */	
	private Long groupId;
    /**
     * id
     */	
	private Long relId;
    /**
     * 种类:0人,1设备
     */	
	private Integer type;
    /**
     * 组名称
     */
	private String groupName;

    /**
     * 人或设备的名称
     */
    private String relName;


    //columns END

}


