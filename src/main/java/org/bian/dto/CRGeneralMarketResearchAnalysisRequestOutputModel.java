package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchAnalysisExecuteOutputModelGeneralMarketResearchAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchAnalysisRequestOutputModel
 */
public class CRGeneralMarketResearchAnalysisRequestOutputModel   {
  private CRGeneralMarketResearchAnalysisExecuteOutputModelGeneralMarketResearchAnalysisInstanceRecord generalMarketResearchAnalysisInstanceRecord = null;

  private String generalMarketResearchAnalysisRequestActionTaskReference = null;

  private Object generalMarketResearchAnalysisRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get generalMarketResearchAnalysisInstanceRecord
   * @return generalMarketResearchAnalysisInstanceRecord
  **/

  public CRGeneralMarketResearchAnalysisExecuteOutputModelGeneralMarketResearchAnalysisInstanceRecord getGeneralMarketResearchAnalysisInstanceRecord() {
    return generalMarketResearchAnalysisInstanceRecord;
  }

  public void setGeneralMarketResearchAnalysisInstanceRecord(CRGeneralMarketResearchAnalysisExecuteOutputModelGeneralMarketResearchAnalysisInstanceRecord generalMarketResearchAnalysisInstanceRecord) {
    this.generalMarketResearchAnalysisInstanceRecord = generalMarketResearchAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a General Market Research Analysis instance request service call 
   * @return generalMarketResearchAnalysisRequestActionTaskReference
  **/

  public String getGeneralMarketResearchAnalysisRequestActionTaskReference() {
    return generalMarketResearchAnalysisRequestActionTaskReference;
  }

  public void setGeneralMarketResearchAnalysisRequestActionTaskReference(String generalMarketResearchAnalysisRequestActionTaskReference) {
    this.generalMarketResearchAnalysisRequestActionTaskReference = generalMarketResearchAnalysisRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

