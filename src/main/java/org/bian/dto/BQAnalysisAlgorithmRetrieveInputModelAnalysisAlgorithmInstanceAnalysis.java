package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalysisAlgorithmRetrieveInputModelAnalysisAlgorithmInstanceAnalysis
 */
public class BQAnalysisAlgorithmRetrieveInputModelAnalysisAlgorithmInstanceAnalysis   {
  private String analysisAlgorithmInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return analysisAlgorithmInstanceAnalysisReference
  **/

  public String getAnalysisAlgorithmInstanceAnalysisReference() {
    return analysisAlgorithmInstanceAnalysisReference;
  }

  public void setAnalysisAlgorithmInstanceAnalysisReference(String analysisAlgorithmInstanceAnalysisReference) {
    this.analysisAlgorithmInstanceAnalysisReference = analysisAlgorithmInstanceAnalysisReference;
  }


}

