package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchAnalysisRequestInputModelGeneralMarketResearchAnalysisInstanceRecord;
import org.bian.dto.CRGeneralMarketResearchAnalysisRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchAnalysisRequestInputModel
 */
public class CRGeneralMarketResearchAnalysisRequestInputModel   {
  private String marketAnalysisServicingSessionReference = null;

  private String generalMarketResearchAnalysisInstanceReference = null;

  private CRGeneralMarketResearchAnalysisRequestInputModelGeneralMarketResearchAnalysisInstanceRecord generalMarketResearchAnalysisInstanceRecord = null;

  private Object generalMarketResearchAnalysisRequestActionTaskRecord = null;

  private CRGeneralMarketResearchAnalysisRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRGeneralMarketResearchAnalysisRequestInputModelGeneralMarketResearchAnalysisInstanceRecord getGeneralMarketResearchAnalysisInstanceRecord() {
    return generalMarketResearchAnalysisInstanceRecord;
  }

  public void setGeneralMarketResearchAnalysisInstanceRecord(CRGeneralMarketResearchAnalysisRequestInputModelGeneralMarketResearchAnalysisInstanceRecord generalMarketResearchAnalysisInstanceRecord) {
    this.generalMarketResearchAnalysisInstanceRecord = generalMarketResearchAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return generalMarketResearchAnalysisRequestActionTaskRecord
  **/

  public Object getGeneralMarketResearchAnalysisRequestActionTaskRecord() {
    return generalMarketResearchAnalysisRequestActionTaskRecord;
  }

  public void setGeneralMarketResearchAnalysisRequestActionTaskRecord(Object generalMarketResearchAnalysisRequestActionTaskRecord) {
    this.generalMarketResearchAnalysisRequestActionTaskRecord = generalMarketResearchAnalysisRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRGeneralMarketResearchAnalysisRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRGeneralMarketResearchAnalysisRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

