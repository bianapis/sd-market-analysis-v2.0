package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchAnalysisRetrieveInputModelGeneralMarketResearchAnalysisInstanceAnalysis
 */
public class CRGeneralMarketResearchAnalysisRetrieveInputModelGeneralMarketResearchAnalysisInstanceAnalysis   {
  private String generalMarketResearchAnalysisInstanceAnalysisReference = null;

  private String generalMarketResearchAnalysisInstanceAnalysisReportType = null;

  private String generalMarketResearchAnalysisInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return generalMarketResearchAnalysisInstanceAnalysisReference
  **/

  public String getGeneralMarketResearchAnalysisInstanceAnalysisReference() {
    return generalMarketResearchAnalysisInstanceAnalysisReference;
  }

  public void setGeneralMarketResearchAnalysisInstanceAnalysisReference(String generalMarketResearchAnalysisInstanceAnalysisReference) {
    this.generalMarketResearchAnalysisInstanceAnalysisReference = generalMarketResearchAnalysisInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return generalMarketResearchAnalysisInstanceAnalysisParameters
  **/

  public String getGeneralMarketResearchAnalysisInstanceAnalysisParameters() {
    return generalMarketResearchAnalysisInstanceAnalysisParameters;
  }

  public void setGeneralMarketResearchAnalysisInstanceAnalysisParameters(String generalMarketResearchAnalysisInstanceAnalysisParameters) {
    this.generalMarketResearchAnalysisInstanceAnalysisParameters = generalMarketResearchAnalysisInstanceAnalysisParameters;
  }


}

