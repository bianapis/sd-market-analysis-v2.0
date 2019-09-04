package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchAnalysisEvaluateOutputModelGeneralMarketResearchAnalysisInstanceRecordGeneralMarketResearchAnalysisRequestRecord
 */
public class CRGeneralMarketResearchAnalysisEvaluateOutputModelGeneralMarketResearchAnalysisInstanceRecordGeneralMarketResearchAnalysisRequestRecord   {
  private String marketAnalysisRequestWorkProducts = null;

  private String generalMarketResearchAnalysisRequestResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the analysis 
   * @return marketAnalysisRequestWorkProducts
  **/

  public String getMarketAnalysisRequestWorkProducts() {
    return marketAnalysisRequestWorkProducts;
  }

  public void setMarketAnalysisRequestWorkProducts(String marketAnalysisRequestWorkProducts) {
    this.marketAnalysisRequestWorkProducts = marketAnalysisRequestWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The output from performing the analysis 
   * @return generalMarketResearchAnalysisRequestResult
  **/

  public String getGeneralMarketResearchAnalysisRequestResult() {
    return generalMarketResearchAnalysisRequestResult;
  }

  public void setGeneralMarketResearchAnalysisRequestResult(String generalMarketResearchAnalysisRequestResult) {
    this.generalMarketResearchAnalysisRequestResult = generalMarketResearchAnalysisRequestResult;
  }


}

