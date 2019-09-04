package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceAnalysis
 */
public class BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceAnalysis   {
  private Object analysisAlgorithmInstanceAnalysisRecord = null;

  private String analysisAlgorithmInstanceAnalysisReportType = null;

  private String analysisAlgorithmInstanceAnalysisParameters = null;

  private Object analysisAlgorithmInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return analysisAlgorithmInstanceAnalysisRecord
  **/

  public Object getAnalysisAlgorithmInstanceAnalysisRecord() {
    return analysisAlgorithmInstanceAnalysisRecord;
  }

  public void setAnalysisAlgorithmInstanceAnalysisRecord(Object analysisAlgorithmInstanceAnalysisRecord) {
    this.analysisAlgorithmInstanceAnalysisRecord = analysisAlgorithmInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return analysisAlgorithmInstanceAnalysisReportType
  **/

  public String getAnalysisAlgorithmInstanceAnalysisReportType() {
    return analysisAlgorithmInstanceAnalysisReportType;
  }

  public void setAnalysisAlgorithmInstanceAnalysisReportType(String analysisAlgorithmInstanceAnalysisReportType) {
    this.analysisAlgorithmInstanceAnalysisReportType = analysisAlgorithmInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return analysisAlgorithmInstanceAnalysisParameters
  **/

  public String getAnalysisAlgorithmInstanceAnalysisParameters() {
    return analysisAlgorithmInstanceAnalysisParameters;
  }

  public void setAnalysisAlgorithmInstanceAnalysisParameters(String analysisAlgorithmInstanceAnalysisParameters) {
    this.analysisAlgorithmInstanceAnalysisParameters = analysisAlgorithmInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return analysisAlgorithmInstanceAnalysisReport
  **/

  public Object getAnalysisAlgorithmInstanceAnalysisReport() {
    return analysisAlgorithmInstanceAnalysisReport;
  }

  public void setAnalysisAlgorithmInstanceAnalysisReport(Object analysisAlgorithmInstanceAnalysisReport) {
    this.analysisAlgorithmInstanceAnalysisReport = analysisAlgorithmInstanceAnalysisReport;
  }


}

