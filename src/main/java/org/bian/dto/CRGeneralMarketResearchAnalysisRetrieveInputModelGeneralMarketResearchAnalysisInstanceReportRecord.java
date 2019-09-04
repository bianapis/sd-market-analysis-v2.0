package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchAnalysisRetrieveInputModelGeneralMarketResearchAnalysisInstanceReportRecord
 */
public class CRGeneralMarketResearchAnalysisRetrieveInputModelGeneralMarketResearchAnalysisInstanceReportRecord   {
  private String generalMarketResearchAnalysisInstanceReportReference = null;

  private String generalMarketResearchAnalysisInstanceReportType = null;

  private String generalMarketResearchAnalysisInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return generalMarketResearchAnalysisInstanceReportReference
  **/

  public String getGeneralMarketResearchAnalysisInstanceReportReference() {
    return generalMarketResearchAnalysisInstanceReportReference;
  }

  public void setGeneralMarketResearchAnalysisInstanceReportReference(String generalMarketResearchAnalysisInstanceReportReference) {
    this.generalMarketResearchAnalysisInstanceReportReference = generalMarketResearchAnalysisInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return generalMarketResearchAnalysisInstanceReportParameters
  **/

  public String getGeneralMarketResearchAnalysisInstanceReportParameters() {
    return generalMarketResearchAnalysisInstanceReportParameters;
  }

  public void setGeneralMarketResearchAnalysisInstanceReportParameters(String generalMarketResearchAnalysisInstanceReportParameters) {
    this.generalMarketResearchAnalysisInstanceReportParameters = generalMarketResearchAnalysisInstanceReportParameters;
  }


}

