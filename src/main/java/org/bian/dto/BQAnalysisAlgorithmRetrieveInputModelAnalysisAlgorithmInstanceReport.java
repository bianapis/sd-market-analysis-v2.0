package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalysisAlgorithmRetrieveInputModelAnalysisAlgorithmInstanceReport
 */
public class BQAnalysisAlgorithmRetrieveInputModelAnalysisAlgorithmInstanceReport   {
  private String analysisAlgorithmInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return analysisAlgorithmInstanceReportReference
  **/

  public String getAnalysisAlgorithmInstanceReportReference() {
    return analysisAlgorithmInstanceReportReference;
  }

  public void setAnalysisAlgorithmInstanceReportReference(String analysisAlgorithmInstanceReportReference) {
    this.analysisAlgorithmInstanceReportReference = analysisAlgorithmInstanceReportReference;
  }


}

