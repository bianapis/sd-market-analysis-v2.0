package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecordAnalysisAlgorithmUsageRecord
 */
public class BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecordAnalysisAlgorithmUsageRecord   {
  private String analysisAlgorithmUsage = null;

  private String analysisAlgorithmImpact = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A record of the usage of the algorithm 
   * @return analysisAlgorithmUsage
  **/

  public String getAnalysisAlgorithmUsage() {
    return analysisAlgorithmUsage;
  }

  public void setAnalysisAlgorithmUsage(String analysisAlgorithmUsage) {
    this.analysisAlgorithmUsage = analysisAlgorithmUsage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A record of reported impact/accuracy of the algorithm 
   * @return analysisAlgorithmImpact
  **/

  public String getAnalysisAlgorithmImpact() {
    return analysisAlgorithmImpact;
  }

  public void setAnalysisAlgorithmImpact(String analysisAlgorithmImpact) {
    this.analysisAlgorithmImpact = analysisAlgorithmImpact;
  }


}

