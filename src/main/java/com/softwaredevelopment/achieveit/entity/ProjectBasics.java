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
@ApiModel(value = "ProjectBasics对象", description = "")
public class ProjectBasics implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "客户ID 从客户管理系统中拉取详细信息")
    private Integer clientId;

    @ApiModelProperty(value = "预定时间 项目预期开始时间")
    private LocalDate scheduledDate;

    @ApiModelProperty(value = "交付日期 项目预期结束时间")
    private LocalDate deliveryDate;

    @ApiModelProperty(value = "项目上级 负责项目立项审批")
    private String superior;

    @ApiModelProperty(value = "主要里程碑?????")
    private String majorMilestone;

    @ApiModelProperty(value = "主要技术 语言 平台 架构 工具等")
    private String mainTechnique;

    @ApiModelProperty(value = "业务领域")
    private String businessField;

    @ApiModelProperty(value = "主要业务功能")
    private String mainFunction;

    @ApiModelProperty(value = "git仓库地址")
    private String gitAddress;

    @ApiModelProperty(value = "项目状态id")
    private Integer statusId;

    @ApiModelProperty(value = "项目是否归档")
    private Boolean isArchived;

    @ApiModelProperty(value = "项目基础数据表是否提交")
    private Boolean projectBasicDatasheet;

    @ApiModelProperty(value = "项目提案书是否提交")
    private Boolean projectProposal;

    @ApiModelProperty(value = "项目报价书是否提交")
    private Boolean projectQuotation;

    @ApiModelProperty(value = "项目估算表")
    private Boolean projectEstimates;

    @ApiModelProperty(value = "项目计划书")
    private Boolean projectPlan;

    @ApiModelProperty(value = "项目过程裁剪表")
    private Boolean projectProcessCropTable;

    @ApiModelProperty(value = "项目成本管理表")
    private Boolean projectCostManagementTable;

    @ApiModelProperty(value = "项目需求变更管理表")
    private Boolean projectRequirementsChangeManagementTable;

    @ApiModelProperty(value = "项目风险管理表")
    private Boolean projectRiskManagementTable;

    @ApiModelProperty(value = "客户验收问题表")
    private Boolean clientCheckProblemsTable;

    @ApiModelProperty(value = "客户验收报告")
    private Boolean clientCheckReport;

    @ApiModelProperty(value = "项目总结")
    private Boolean projectSummary;

    @ApiModelProperty(value = "最佳经验和教训")
    private Boolean experienceAndLessons;

    @ApiModelProperty(value = "开发工具")
    private Boolean developmentTools;

    @ApiModelProperty(value = "开发模板")
    private Boolean developmentTemplates;

    @ApiModelProperty(value = "各阶段检查单")
    private Boolean checkSheets;

    @ApiModelProperty(value = "QA总结")
    private Boolean qaSummary;


}
