package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchAnalysisRetrieveInputModelGeneralMarketResearchAnalysisInstanceAnalysis;
import org.bian.dto.CRGeneralMarketResearchAnalysisRetrieveInputModelGeneralMarketResearchAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchAnalysisRetrieveInputModel
 */
public class CRGeneralMarketResearchAnalysisRetrieveInputModel   {
  private Object generalMarketResearchAnalysisRetrieveActionTaskRecord = null;

  private String generalMarketResearchAnalysisRetrieveActionRequest = null;

  private CRGeneralMarketResearchAnalysisRetrieveInputModelGeneralMarketResearchAnalysisInstanceReportRecord generalMarketResearchAnalysisInstanceReportRecord = null;

  private CRGeneralMarketResearchAnalysisRetrieveInputModelGeneralMarketResearchAnalysisInstanceAnalysis generalMarketResearchAnalysisInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return generalMarketResearchAnalysisRetrieveActionTaskRecord
  **/

  public Object getGeneralMarketResearchAnalysisRetrieveActionTaskRecord() {
    return generalMarketResearchAnalysisRetrieveActionTaskRecord;
  }

  public void setGeneralMarketResearchAnalysisRetrieveActionTaskRecord(Object generalMarketResearchAnalysisRetrieveActionTaskRecord) {
    this.generalMarketResearchAnalysisRetrieveActionTaskRecord = generalMarketResearchAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return generalMarketResearchAnalysisRetrieveActionRequest
  **/

  public String getGeneralMarketResearchAnalysisRetrieveActionRequest() {
    return generalMarketResearchAnalysisRetrieveActionRequest;
  }

  public void setGeneralMarketResearchAnalysisRetrieveActionRequest(String generalMarketResearchAnalysisRetrieveActionRequest) {
    this.generalMarketResearchAnalysisRetrieveActionRequest = generalMarketResearchAnalysisRetrieveActionRequest;
  }


  /**
   * Get generalMarketResearchAnalysisInstanceReportRecord
   * @return generalMarketResearchAnalysisInstanceReportRecord
  **/

  public CRGeneralMarketResearchAnalysisRetrieveInputModelGeneralMarketResearchAnalysisInstanceReportRecord getGeneralMarketResearchAnalysisInstanceReportRecord() {
    return generalMarketResearchAnalysisInstanceReportRecord;
  }

  public void setGeneralMarketResearchAnalysisInstanceReportRecord(CRGeneralMarketResearchAnalysisRetrieveInputModelGeneralMarketResearchAnalysisInstanceReportRecord generalMarketResearchAnalysisInstanceReportRecord) {
    this.generalMarketResearchAnalysisInstanceReportRecord = generalMarketResearchAnalysisInstanceReportRecord;
  }


  /**
   * Get generalMarketResearchAnalysisInstanceAnalysis
   * @return generalMarketResearchAnalysisInstanceAnalysis
  **/

  public CRGeneralMarketResearchAnalysisRetrieveInputModelGeneralMarketResearchAnalysisInstanceAnalysis getGeneralMarketResearchAnalysisInstanceAnalysis() {
    return generalMarketResearchAnalysisInstanceAnalysis;
  }

  public void setGeneralMarketResearchAnalysisInstanceAnalysis(CRGeneralMarketResearchAnalysisRetrieveInputModelGeneralMarketResearchAnalysisInstanceAnalysis generalMarketResearchAnalysisInstanceAnalysis) {
    this.generalMarketResearchAnalysisInstanceAnalysis = generalMarketResearchAnalysisInstanceAnalysis;
  }


}

