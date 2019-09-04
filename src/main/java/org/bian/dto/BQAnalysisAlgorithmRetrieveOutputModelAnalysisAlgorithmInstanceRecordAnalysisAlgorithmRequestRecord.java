package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecordAnalysisAlgorithmRequestRecord
 */
public class BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecordAnalysisAlgorithmRequestRecord   {
  private String analysisAlgorithmRequest = null;

  private String analysisAlgorithmWorkProducts = null;

  private String analysisAlgorithmRequestResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The specific details of the request 
   * @return analysisAlgorithmRequest
  **/

  public String getAnalysisAlgorithmRequest() {
    return analysisAlgorithmRequest;
  }

  public void setAnalysisAlgorithmRequest(String analysisAlgorithmRequest) {
    this.analysisAlgorithmRequest = analysisAlgorithmRequest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the analysis 
   * @return analysisAlgorithmWorkProducts
  **/

  public String getAnalysisAlgorithmWorkProducts() {
    return analysisAlgorithmWorkProducts;
  }

  public void setAnalysisAlgorithmWorkProducts(String analysisAlgorithmWorkProducts) {
    this.analysisAlgorithmWorkProducts = analysisAlgorithmWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The output from executing the algorithm 
   * @return analysisAlgorithmRequestResult
  **/

  public String getAnalysisAlgorithmRequestResult() {
    return analysisAlgorithmRequestResult;
  }

  public void setAnalysisAlgorithmRequestResult(String analysisAlgorithmRequestResult) {
    this.analysisAlgorithmRequestResult = analysisAlgorithmRequestResult;
  }


}

