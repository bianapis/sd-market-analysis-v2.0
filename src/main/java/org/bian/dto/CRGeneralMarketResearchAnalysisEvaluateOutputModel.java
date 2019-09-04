package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchAnalysisEvaluateOutputModelGeneralMarketResearchAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchAnalysisEvaluateOutputModel
 */
public class CRGeneralMarketResearchAnalysisEvaluateOutputModel   {
  private String generalMarketResearchAnalysisInstanceReference = null;

  private String generalMarketResearchAnalysisEvaluateActionReference = null;

  private Object generalMarketResearchAnalysisEvaluateActionRecord = null;

  private String generalMarketResearchAnalysisInstanceStatus = null;

  private CRGeneralMarketResearchAnalysisEvaluateOutputModelGeneralMarketResearchAnalysisInstanceRecord generalMarketResearchAnalysisInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return generalMarketResearchAnalysisEvaluateActionReference
  **/

  public String getGeneralMarketResearchAnalysisEvaluateActionReference() {
    return generalMarketResearchAnalysisEvaluateActionReference;
  }

  public void setGeneralMarketResearchAnalysisEvaluateActionReference(String generalMarketResearchAnalysisEvaluateActionReference) {
    this.generalMarketResearchAnalysisEvaluateActionReference = generalMarketResearchAnalysisEvaluateActionReference;
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

  public CRGeneralMarketResearchAnalysisEvaluateOutputModelGeneralMarketResearchAnalysisInstanceRecord getGeneralMarketResearchAnalysisInstanceRecord() {
    return generalMarketResearchAnalysisInstanceRecord;
  }

  public void setGeneralMarketResearchAnalysisInstanceRecord(CRGeneralMarketResearchAnalysisEvaluateOutputModelGeneralMarketResearchAnalysisInstanceRecord generalMarketResearchAnalysisInstanceRecord) {
    this.generalMarketResearchAnalysisInstanceRecord = generalMarketResearchAnalysisInstanceRecord;
  }


}

