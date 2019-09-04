package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchAnalysisExecuteInputModelExecuteRecordType;
import org.bian.dto.CRGeneralMarketResearchAnalysisExecuteInputModelGeneralMarketResearchAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchAnalysisExecuteInputModel
 */
public class CRGeneralMarketResearchAnalysisExecuteInputModel   {
  private String marketAnalysisServicingSessionReference = null;

  private String generalMarketResearchAnalysisInstanceReference = null;

  private CRGeneralMarketResearchAnalysisExecuteInputModelGeneralMarketResearchAnalysisInstanceRecord generalMarketResearchAnalysisInstanceRecord = null;

  private Object generalMarketResearchAnalysisExecuteActionTaskRecord = null;

  private CRGeneralMarketResearchAnalysisExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return marketAnalysisServicingSessionReference
  **/

  public String getMarketAnalysisServicingSessionReference() {
    return marketAnalysisServicingSessionReference;
  }

  public void setMarketAnalysisServicingSessionReference(String marketAnalysisServicingSessionReference) {
    this.marketAnalysisServicingSessionReference = marketAnalysisServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the General Market Research Analysis instance 
   * @return generalMarketResearchAnalysisInstanceReference
  **/

  public String getGeneralMarketResearchAnalysisInstanceReference() {
    return generalMarketResearchAnalysisInstanceReference;
  }

  public void setGeneralMarketResearchAnalysisInstanceReference(String generalMarketResearchAnalysisInstanceReference) {
    this.generalMarketResearchAnalysisInstanceReference = generalMarketResearchAnalysisInstanceReference;
  }


  /**
   * Get generalMarketResearchAnalysisInstanceRecord
   * @return generalMarketResearchAnalysisInstanceRecord
  **/

  public CRGeneralMarketResearchAnalysisExecuteInputModelGeneralMarketResearchAnalysisInstanceRecord getGeneralMarketResearchAnalysisInstanceRecord() {
    return generalMarketResearchAnalysisInstanceRecord;
  }

  public void setGeneralMarketResearchAnalysisInstanceRecord(CRGeneralMarketResearchAnalysisExecuteInputModelGeneralMarketResearchAnalysisInstanceRecord generalMarketResearchAnalysisInstanceRecord) {
    this.generalMarketResearchAnalysisInstanceRecord = generalMarketResearchAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return generalMarketResearchAnalysisExecuteActionTaskRecord
  **/

  public Object getGeneralMarketResearchAnalysisExecuteActionTaskRecord() {
    return generalMarketResearchAnalysisExecuteActionTaskRecord;
  }

  public void setGeneralMarketResearchAnalysisExecuteActionTaskRecord(Object generalMarketResearchAnalysisExecuteActionTaskRecord) {
    this.generalMarketResearchAnalysisExecuteActionTaskRecord = generalMarketResearchAnalysisExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRGeneralMarketResearchAnalysisExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRGeneralMarketResearchAnalysisExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

