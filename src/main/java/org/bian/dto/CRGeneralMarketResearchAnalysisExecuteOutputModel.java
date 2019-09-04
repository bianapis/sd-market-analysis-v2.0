package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchAnalysisExecuteOutputModelGeneralMarketResearchAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchAnalysisExecuteOutputModel
 */
public class CRGeneralMarketResearchAnalysisExecuteOutputModel   {
  private CRGeneralMarketResearchAnalysisExecuteOutputModelGeneralMarketResearchAnalysisInstanceRecord generalMarketResearchAnalysisInstanceRecord = null;

  private String generalMarketResearchAnalysisExecuteActionTaskReference = null;

  private Object generalMarketResearchAnalysisExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a General Market Research Analysis instance execute service call 
   * @return generalMarketResearchAnalysisExecuteActionTaskReference
  **/

  public String getGeneralMarketResearchAnalysisExecuteActionTaskReference() {
    return generalMarketResearchAnalysisExecuteActionTaskReference;
  }

  public void setGeneralMarketResearchAnalysisExecuteActionTaskReference(String generalMarketResearchAnalysisExecuteActionTaskReference) {
    this.generalMarketResearchAnalysisExecuteActionTaskReference = generalMarketResearchAnalysisExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

