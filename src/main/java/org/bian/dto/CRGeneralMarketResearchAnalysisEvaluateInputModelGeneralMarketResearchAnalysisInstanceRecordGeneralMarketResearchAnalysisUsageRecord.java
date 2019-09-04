package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchAnalysisEvaluateInputModelGeneralMarketResearchAnalysisInstanceRecordGeneralMarketResearchAnalysisUsageRecord
 */
public class CRGeneralMarketResearchAnalysisEvaluateInputModelGeneralMarketResearchAnalysisInstanceRecordGeneralMarketResearchAnalysisUsageRecord   {
  private String generalMarketResearchAnalysisUsage = null;

  private String generalMarketResearchAnalysisImpact = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A record of the usage of the analysis 
   * @return generalMarketResearchAnalysisUsage
  **/

  public String getGeneralMarketResearchAnalysisUsage() {
    return generalMarketResearchAnalysisUsage;
  }

  public void setGeneralMarketResearchAnalysisUsage(String generalMarketResearchAnalysisUsage) {
    this.generalMarketResearchAnalysisUsage = generalMarketResearchAnalysisUsage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A record of reported impact/accuracy of the analysis 
   * @return generalMarketResearchAnalysisImpact
  **/

  public String getGeneralMarketResearchAnalysisImpact() {
    return generalMarketResearchAnalysisImpact;
  }

  public void setGeneralMarketResearchAnalysisImpact(String generalMarketResearchAnalysisImpact) {
    this.generalMarketResearchAnalysisImpact = generalMarketResearchAnalysisImpact;
  }


}

