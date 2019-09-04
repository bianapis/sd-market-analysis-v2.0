package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchAnalysisEvaluateInputModelGeneralMarketResearchAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchAnalysisEvaluateInputModel
 */
public class CRGeneralMarketResearchAnalysisEvaluateInputModel   {
  private String marketAnalysisServicingSessionReference = null;

  private Object generalMarketResearchAnalysisEvaluateActionRecord = null;

  private String generalMarketResearchAnalysisInstanceStatus = null;

  private CRGeneralMarketResearchAnalysisEvaluateInputModelGeneralMarketResearchAnalysisInstanceRecord generalMarketResearchAnalysisInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return generalMarketResearchAnalysisEvaluateActionRecord
  **/

  public Object getGeneralMarketResearchAnalysisEvaluateActionRecord() {
    return generalMarketResearchAnalysisEvaluateActionRecord;
  }

  public void setGeneralMarketResearchAnalysisEvaluateActionRecord(Object generalMarketResearchAnalysisEvaluateActionRecord) {
    this.generalMarketResearchAnalysisEvaluateActionRecord = generalMarketResearchAnalysisEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the General Market Research Analysis instance (e.g. initialised, pending, active) 
   * @return generalMarketResearchAnalysisInstanceStatus
  **/

  public String getGeneralMarketResearchAnalysisInstanceStatus() {
    return generalMarketResearchAnalysisInstanceStatus;
  }

  public void setGeneralMarketResearchAnalysisInstanceStatus(String generalMarketResearchAnalysisInstanceStatus) {
    this.generalMarketResearchAnalysisInstanceStatus = generalMarketResearchAnalysisInstanceStatus;
  }


  /**
   * Get generalMarketResearchAnalysisInstanceRecord
   * @return generalMarketResearchAnalysisInstanceRecord
  **/

  public CRGeneralMarketResearchAnalysisEvaluateInputModelGeneralMarketResearchAnalysisInstanceRecord getGeneralMarketResearchAnalysisInstanceRecord() {
    return generalMarketResearchAnalysisInstanceRecord;
  }

  public void setGeneralMarketResearchAnalysisInstanceRecord(CRGeneralMarketResearchAnalysisEvaluateInputModelGeneralMarketResearchAnalysisInstanceRecord generalMarketResearchAnalysisInstanceRecord) {
    this.generalMarketResearchAnalysisInstanceRecord = generalMarketResearchAnalysisInstanceRecord;
  }


}

