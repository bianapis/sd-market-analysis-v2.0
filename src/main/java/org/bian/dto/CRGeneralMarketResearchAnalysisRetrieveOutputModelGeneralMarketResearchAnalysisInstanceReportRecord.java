package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchAnalysisRetrieveOutputModelGeneralMarketResearchAnalysisInstanceReportRecord
 */
public class CRGeneralMarketResearchAnalysisRetrieveOutputModelGeneralMarketResearchAnalysisInstanceReportRecord   {
  private String generalMarketResearchAnalysisInstanceReportData = null;

  private String generalMarketResearchAnalysisInstanceReportType = null;

  private Object generalMarketResearchAnalysisInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return generalMarketResearchAnalysisInstanceReportData
  **/

  public String getGeneralMarketResearchAnalysisInstanceReportData() {
    return generalMarketResearchAnalysisInstanceReportData;
  }

  public void setGeneralMarketResearchAnalysisInstanceReportData(String generalMarketResearchAnalysisInstanceReportData) {
    this.generalMarketResearchAnalysisInstanceReportData = generalMarketResearchAnalysisInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return generalMarketResearchAnalysisInstanceReportType
  **/

  public String getGeneralMarketResearchAnalysisInstanceReportType() {
    return generalMarketResearchAnalysisInstanceReportType;
  }

  public void setGeneralMarketResearchAnalysisInstanceReportType(String generalMarketResearchAnalysisInstanceReportType) {
    this.generalMarketResearchAnalysisInstanceReportType = generalMarketResearchAnalysisInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return generalMarketResearchAnalysisInstanceReport
  **/

  public Object getGeneralMarketResearchAnalysisInstanceReport() {
    return generalMarketResearchAnalysisInstanceReport;
  }

  public void setGeneralMarketResearchAnalysisInstanceReport(Object generalMarketResearchAnalysisInstanceReport) {
    this.generalMarketResearchAnalysisInstanceReport = generalMarketResearchAnalysisInstanceReport;
  }


}

