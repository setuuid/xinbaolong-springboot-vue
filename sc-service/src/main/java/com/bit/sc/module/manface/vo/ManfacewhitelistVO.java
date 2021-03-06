package com.bit.sc.module.manface.vo;

import java.util.Date;
import com.bit.base.vo.BasePageVo;
import lombok.Data;

/**
 * Manfacewhitelist
 * @author chenduo
 */
@Data
public class ManfacewhitelistVO extends BasePageVo{

	//columns START

    /**
     * 主键id
     */	
	private Long id;
    /**
     * 设备id
     */	
	private String deviceId;
    /**
     * 同步状态  1 成功  0 失败
     */	
	private Integer synchroStatus;
    /**
     * 同步时间
     */	
	private Date synchroTime;
    /**
     * 同步次数
     */	
	private Integer synchroCount;
    /**
     * 居民id
     */
    private Long residentId;
    /**
     * 平台对接id
     */
    private Long platformId;

	//columns END

    private String realName;
    private String cardId;
    private String addressDetail;
    /**
     * 当前管理员的负责小区id
     */
    private String addressCode;

}


