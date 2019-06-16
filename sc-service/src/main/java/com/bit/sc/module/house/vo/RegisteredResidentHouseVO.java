package com.bit.sc.module.house.vo;

import lombok.Data;

import java.util.Date;

@Data
public class RegisteredResidentHouseVO {

    //registeredResident部分
    /**
     * id
     */
    private Long id;
    /**
     * 姓名
     */
    private String realName;
    /**
     * 身份证号码
     */
    private String cardId;
    /**
     * 性别
     */
    private Long sex;
    /**
     * 户籍地址
     */
    private String hjdz;
    /**
     * 与户主关系
     */
    private String relationOwner;
    /**
     * 联系电话
     */
    private String mobile;


    //columns END


    //house部分
    //columns START


    /**
     * 地址编码
     */
    private String dzbm;
    /**
     * 地址元素类型
     */
    private String dzyslx;
    /**
     * 地址
     */
    private Long dz;
    /**
     * 建筑物名称
     */
    private String jzwmc;
    /**
     * 别名简称
     */
    private String bmjc;
    /**
     * 中心点横坐标
     */
    private String zxdhzb;
    /**
     * 中心点纵坐标
     */
    private String zxdzzb;
    /**
     * 警务责任区代码
     */
    private String jwzrqdm;
    /**
     * 所属最低一级行政区域_地址编码
     */
    private String sszdyjxzqxdzbm;
    /**
     * 所属街路巷（小区）_地址编码
     */
    private String ssjlxxqdzbm;
    /**
     * 地（住）址存在标识
     */
    private String dzzczbs;
    /**
     * 地（住）址在用标识
     */
    private String dzzzybs;
    /**
     * 更新时间
     */
    private Date gxsj;
    /**
     * 启用日期
     */
    private Date qyrq;
    /**
     * 停用日期
     */
    private Date tyrq;
    /**
     * 登记单位
     */
    private String djdw;
    /**
     * 房屋用途
     */
    private Long houseUsage;
    /**
     * 产权类型
     */
    private Long propertyType;
    /**
     * 是否是单位产权 0-是 1-不是
     */
    private Integer isCompanyOwned;
    /**
     * 实有单位信息
     */
    private Long companyInfo;
    /**
     * 房屋类别
     */
    private Long houseType;
    /**
     * 房屋性质
     */
    private Long houseCharacter;
    /**
     * 房间数
     */
    private Integer roomNumbers;
    /**
     * 房屋面积
     */
    private String houseSquare;
    /**
     * 房间使用用途
     */
    private Long houseUsagePurpose;
    /**
     * 居住(从业)人数
     */
    private Integer livingNumbers;
    /**
     * 境内人数
     */
    private Integer domesticNumber;
    /**
     * 境外人数
     */
    private Integer foreignerNumber;
    /**
     * 无户口人数
     */
    private Integer noHukouNumber;
    /**
     * 房东信息
     */
    private Long houseOwnerInfo;
    /**
     * 代管人信息
     */
    private Long custodianInfo;
    /**
     * 租赁人信息
     */
    private Long rentPersonInfo;
    /**
     * 人像照片地址
     */
    private String url;

    //columns END

    //字典表
    private String value1;
    //字典表
    private String value2;
    //字典表
    private String value3;
    //字典表
    private String value4;
    //字典表
    private String value5;


    /**
     * 是否户主 0-是 1-不是
     */
    private Integer isHouseholder;




}
