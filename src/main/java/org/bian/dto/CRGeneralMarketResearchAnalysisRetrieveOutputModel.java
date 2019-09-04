package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchAnalysisRetrieveOutputModelGeneralMarketResearchAnalysisInstanceAnalysis;
import org.bian.dto.CRGeneralMarketResearchAnalysisRetrieveOutputModelGeneralMarketResearchAnalysisInstanceRecord;
import org.bian.dto.CRGeneralMarketResearchAnalysisRetrieveOutputModelGeneralMarketResearchAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchAnalysisRetrieveOutputModel
 */
public class CRGeneralMarketResearchAnalysisRetrieveOutputModel   {
  private CRGeneralMarketResearchAnalysisRetrieveOutputModelGeneralMarketResearchAnalysisInstanceRecord generalMarketResearchAnalysisInstanceRecord = null;

  private String generalMarketResearchAnalysisRetrieveActionTaskReference = null;

  private Object generalMarketResearchAnalysisRetrieveActionTaskRecord = null;

  private String generalMarketResearchAnalysisRetrieveActionResponse = null;

  private CRGeneralMarketResearchAnalysisRetrieveOutputModelGeneralMarketResearchAnalysisInstanceReportRecord generalMarketResearchAnalysisInstanceReportRecord = null;

  private CRGeneralMarketResearchAnalysisRetrieveOutputModelGeneralMarketResearchAnalysisInstanceAnalysis generalMarketResearchAnalysisInstanceAnalysis = null;


  /**
   * Get generalMarketResearchAnalysisInstanceRecord
   * @return generalMarketResearchAnalysisInstanceRecord
  **/

  public CRGeneralMarketResearchAnalysisRetrieveOutputModelGeneralMarketResearchAnalysisInstanceRecord getGeneralMarketResearchAnalysisInstanceRecord() {
    return generalMarketResearchAnalysisInstanceRecord;
  }

  public void setGeneralMarketResearchAnalysisInstanceRecord(CRGeneralMarketResearchAnalysisRetrieveOutputModelGeneralMarketResearchAnalysisInstanceRecord generalMarketResearchAnalysisInstanceRecord) {
    this.generalMarketResearchAnalysisInstanceRecord = generalMarketResearchAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a General Market Research Analysis instance retrieve service call 
   * @return generalMarketResearchAnalysisRetrieveActionTaskReference
  **/

  public String getGeneralMarketResearchAnalysisRetrieveActionTaskReference() {
    return generalMarketResearchAnalysisRetrieveActionTaskReference;
  }

  public void setGeneralMarketResearchAnalysisRetrieveActionTaskReference(String generalMarketResearchAnalysisRetrieveActionTaskReference) {
    this.generalMarketResearchAnalysisRetrieveActionTaskReference = generalMarketResearchAnalysisRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return generalMarketResearchAnalysisRetrieveActionResponse
  **/

  public String getGeneralMarketResearchAnalysisRetrieveActionResponse() {
    return generalMarketResearchAnalysisRetrieveActionResponse;
  }

  public void setGeneralMarketResearchAnalysisRetrieveActionResponse(String generalMarketResearchAnalysisRetrieveActionResponse) {
    this.generalMarketResearchAnalysisRetrieveActionResponse = generalMarketResearchAnalysisRetrieveActionResponse;
  }


  /**
   * Get generalMarketResearchAnalysisInstanceReportRecord
   * @return generalMarketResearchAnalysisInstanceReportRecord
  **/

  public CRGeneralMarketResearchAnalysisRetrieveOutputModelGeneralMarketResearchAnalysisInstanceReportRecord getGeneralMarketResearchAnalysisInstanceReportRecord() {
    return generalMarketResearchAnalysisInstanceReportRecord;
  }

  public void setGeneralMarketResearchAnalysisInstanceReportRecord(CRGeneralMarketResearchAnalysisRetrieveOutputModelGeneralMarketResearchAnalysisInstanceReportRecord generalMarketResearchAnalysisInstanceReportRecord) {
    this.generalMarketResearchAnalysisInstanceReportRecord = generalMarketResearchAnalysisInstanceReportRecord;
  }


  /**
   * Get generalMarketResearchAnalysisInstanceAnalysis
   * @return generalMarketResearchAnalysisInstanceAnalysis
  **/

  public CRGeneralMarketResearchAnalysisRetrieveOutputModelGeneralMarketResearchAnalysisInstanceAnalysis getGeneralMarketResearchAnalysisInstanceAnalysis() {
    return generalMarketResearchAnalysisInstanceAnalysis;
  }

  public void setGeneralMarketResearchAnalysisInstanceAnalysis(CRGeneralMarketResearchAnalysisRetrieveOutputModelGeneralMarketResearchAnalysisInstanceAnalysis generalMarketResearchAnalysisInstanceAnalysis) {
    this.generalMarketResearchAnalysisInstanceAnalysis = generalMarketResearchAnalysisInstanceAnalysis;
  }


}

