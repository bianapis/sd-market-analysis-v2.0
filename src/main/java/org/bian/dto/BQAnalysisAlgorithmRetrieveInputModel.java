package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAnalysisAlgorithmRetrieveInputModelAnalysisAlgorithmInstanceAnalysis;
import org.bian.dto.BQAnalysisAlgorithmRetrieveInputModelAnalysisAlgorithmInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAnalysisAlgorithmRetrieveInputModel
 */
public class BQAnalysisAlgorithmRetrieveInputModel   {
  private Object analysisAlgorithmRetrieveActionTaskRecord = null;

  private String analysisAlgorithmRetrieveActionRequest = null;

  private BQAnalysisAlgorithmRetrieveInputModelAnalysisAlgorithmInstanceReport analysisAlgorithmInstanceReport = null;

  private BQAnalysisAlgorithmRetrieveInputModelAnalysisAlgorithmInstanceAnalysis analysisAlgorithmInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return analysisAlgorithmRetrieveActionTaskRecord
  **/

  public Object getAnalysisAlgorithmRetrieveActionTaskRecord() {
    return analysisAlgorithmRetrieveActionTaskRecord;
  }

  public void setAnalysisAlgorithmRetrieveActionTaskRecord(Object analysisAlgorithmRetrieveActionTaskRecord) {
    this.analysisAlgorithmRetrieveActionTaskRecord = analysisAlgorithmRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return analysisAlgorithmRetrieveActionRequest
  **/

  public String getAnalysisAlgorithmRetrieveActionRequest() {
    return analysisAlgorithmRetrieveActionRequest;
  }

  public void setAnalysisAlgorithmRetrieveActionRequest(String analysisAlgorithmRetrieveActionRequest) {
    this.analysisAlgorithmRetrieveActionRequest = analysisAlgorithmRetrieveActionRequest;
  }


  /**
   * Get analysisAlgorithmInstanceReport
   * @return analysisAlgorithmInstanceReport
  **/

  public BQAnalysisAlgorithmRetrieveInputModelAnalysisAlgorithmInstanceReport getAnalysisAlgorithmInstanceReport() {
    return analysisAlgorithmInstanceReport;
  }

  public void setAnalysisAlgorithmInstanceReport(BQAnalysisAlgorithmRetrieveInputModelAnalysisAlgorithmInstanceReport analysisAlgorithmInstanceReport) {
    this.analysisAlgorithmInstanceReport = analysisAlgorithmInstanceReport;
  }


  /**
   * Get analysisAlgorithmInstanceAnalysis
   * @return analysisAlgorithmInstanceAnalysis
  **/

  public BQAnalysisAlgorithmRetrieveInputModelAnalysisAlgorithmInstanceAnalysis getAnalysisAlgorithmInstanceAnalysis() {
    return analysisAlgorithmInstanceAnalysis;
  }

  public void setAnalysisAlgorithmInstanceAnalysis(BQAnalysisAlgorithmRetrieveInputModelAnalysisAlgorithmInstanceAnalysis analysisAlgorithmInstanceAnalysis) {
    this.analysisAlgorithmInstanceAnalysis = analysisAlgorithmInstanceAnalysis;
  }


}

