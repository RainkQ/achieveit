package com.softwaredevelopment.achieveit.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 *
 * </p>
 *
 * @author RainkQ
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "Property对象", description = "")
public class Property implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "资产类型")
    private String type;

    @ApiModelProperty(value = "资产管理者")
    private Integer managerId;

    @ApiModelProperty(value = "资产使用期限")
    private LocalDate usageTimeLimit;

    @ApiModelProperty(value = "设备状态 是否完好")
    private String deviceCondition;

    @ApiModelProperty(value = "设备是否归还")
    private Boolean isReturned;

    @ApiModelProperty(value = "归还日期")
    private LocalDate returnDate;


}
