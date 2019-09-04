package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchAnalysisRetrieveOutputModelGeneralMarketResearchAnalysisInstanceAnalysis
 */
public class CRGeneralMarketResearchAnalysisRetrieveOutputModelGeneralMarketResearchAnalysisInstanceAnalysis   {
  private String generalMarketResearchAnalysisInstanceAnalysisData = null;

  private String generalMarketResearchAnalysisInstanceAnalysisReportType = null;

  private Object generalMarketResearchAnalysisInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return generalMarketResearchAnalysisInstanceAnalysisData
  **/

  public String getGeneralMarketResearchAnalysisInstanceAnalysisData() {
    return generalMarketResearchAnalysisInstanceAnalysisData;
  }

  public void setGeneralMarketResearchAnalysisInstanceAnalysisData(String generalMarketResearchAnalysisInstanceAnalysisData) {
    this.generalMarketResearchAnalysisInstanceAnalysisData = generalMarketResearchAnalysisInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return generalMarketResearchAnalysisInstanceAnalysisReportType
  **/

  public String getGeneralMarketResearchAnalysisInstanceAnalysisReportType() {
    return generalMarketResearchAnalysisInstanceAnalysisReportType;
  }

  public void setGeneralMarketResearchAnalysisInstanceAnalysisReportType(String generalMarketResearchAnalysisInstanceAnalysisReportType) {
    this.generalMarketResearchAnalysisInstanceAnalysisReportType = generalMarketResearchAnalysisInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return generalMarketResearchAnalysisInstanceAnalysisReport
  **/

  public Object getGeneralMarketResearchAnalysisInstanceAnalysisReport() {
    return generalMarketResearchAnalysisInstanceAnalysisReport;
  }

  public void setGeneralMarketResearchAnalysisInstanceAnalysisReport(Object generalMarketResearchAnalysisInstanceAnalysisReport) {
    this.generalMarketResearchAnalysisInstanceAnalysisReport = generalMarketResearchAnalysisInstanceAnalysisReport;
  }


}

