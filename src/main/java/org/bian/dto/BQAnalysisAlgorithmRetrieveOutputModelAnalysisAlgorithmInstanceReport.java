package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceReport
 */
public class BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceReport   {
  private Object analysisAlgorithmInstanceReportRecord = null;

  private String analysisAlgorithmInstanceReportType = null;

  private String analysisAlgorithmInstanceReportParameters = null;

  private Object analysisAlgorithmInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return analysisAlgorithmInstanceReportRecord
  **/

  public Object getAnalysisAlgorithmInstanceReportRecord() {
    return analysisAlgorithmInstanceReportRecord;
  }

  public void setAnalysisAlgorithmInstanceReportRecord(Object analysisAlgorithmInstanceReportRecord) {
    this.analysisAlgorithmInstanceReportRecord = analysisAlgorithmInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return analysisAlgorithmInstanceReportType
  **/

  public String getAnalysisAlgorithmInstanceReportType() {
    return analysisAlgorithmInstanceReportType;
  }

  public void setAnalysisAlgorithmInstanceReportType(String analysisAlgorithmInstanceReportType) {
    this.analysisAlgorithmInstanceReportType = analysisAlgorithmInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return analysisAlgorithmInstanceReportParameters
  **/

  public String getAnalysisAlgorithmInstanceReportParameters() {
    return analysisAlgorithmInstanceReportParameters;
  }

  public void setAnalysisAlgorithmInstanceReportParameters(String analysisAlgorithmInstanceReportParameters) {
    this.analysisAlgorithmInstanceReportParameters = analysisAlgorithmInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return analysisAlgorithmInstanceReport
  **/

  public Object getAnalysisAlgorithmInstanceReport() {
    return analysisAlgorithmInstanceReport;
  }

  public void setAnalysisAlgorithmInstanceReport(Object analysisAlgorithmInstanceReport) {
    this.analysisAlgorithmInstanceReport = analysisAlgorithmInstanceReport;
  }


}

