package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchAnalysisEvaluateInputModelGeneralMarketResearchAnalysisInstanceRecordGeneralMarketResearchAnalysisRequestRecord;
import org.bian.dto.CRGeneralMarketResearchAnalysisEvaluateInputModelGeneralMarketResearchAnalysisInstanceRecordGeneralMarketResearchAnalysisUsageRecord;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchAnalysisEvaluateInputModelGeneralMarketResearchAnalysisInstanceRecord
 */
public class CRGeneralMarketResearchAnalysisEvaluateInputModelGeneralMarketResearchAnalysisInstanceRecord   {
  private String generalMarketResearchAnalysisType = null;

  private String generalMarketResearchAnalysisAlgorithmReference = null;

  private CRGeneralMarketResearchAnalysisEvaluateInputModelGeneralMarketResearchAnalysisInstanceRecordGeneralMarketResearchAnalysisRequestRecord generalMarketResearchAnalysisRequestRecord = null;

  private CRGeneralMarketResearchAnalysisEvaluateInputModelGeneralMarketResearchAnalysisInstanceRecordGeneralMarketResearchAnalysisUsageRecord generalMarketResearchAnalysisUsageRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of research view provided by the research (e.g. competitor analysis) 
   * @return generalMarketResearchAnalysisType
  **/

  public String getGeneralMarketResearchAnalysisType() {
    return generalMarketResearchAnalysisType;
  }

  public void setGeneralMarketResearchAnalysisType(String generalMarketResearchAnalysisType) {
    this.generalMarketResearchAnalysisType = generalMarketResearchAnalysisType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the algorithm used to generate the analysis 
   * @return generalMarketResearchAnalysisAlgorithmReference
  **/

  public String getGeneralMarketResearchAnalysisAlgorithmReference() {
    return generalMarketResearchAnalysisAlgorithmReference;
  }

  public void setGeneralMarketResearchAnalysisAlgorithmReference(String generalMarketResearchAnalysisAlgorithmReference) {
    this.generalMarketResearchAnalysisAlgorithmReference = generalMarketResearchAnalysisAlgorithmReference;
  }


  /**
   * Get generalMarketResearchAnalysisRequestRecord
   * @return generalMarketResearchAnalysisRequestRecord
  **/

  public CRGeneralMarketResearchAnalysisEvaluateInputModelGeneralMarketResearchAnalysisInstanceRecordGeneralMarketResearchAnalysisRequestRecord getGeneralMarketResearchAnalysisRequestRecord() {
    return generalMarketResearchAnalysisRequestRecord;
  }

  public void setGeneralMarketResearchAnalysisRequestRecord(CRGeneralMarketResearchAnalysisEvaluateInputModelGeneralMarketResearchAnalysisInstanceRecordGeneralMarketResearchAnalysisRequestRecord generalMarketResearchAnalysisRequestRecord) {
    this.generalMarketResearchAnalysisRequestRecord = generalMarketResearchAnalysisRequestRecord;
  }


  /**
   * Get generalMarketResearchAnalysisUsageRecord
   * @return generalMarketResearchAnalysisUsageRecord
  **/

  public CRGeneralMarketResearchAnalysisEvaluateInputModelGeneralMarketResearchAnalysisInstanceRecordGeneralMarketResearchAnalysisUsageRecord getGeneralMarketResearchAnalysisUsageRecord() {
    return generalMarketResearchAnalysisUsageRecord;
  }

  public void setGeneralMarketResearchAnalysisUsageRecord(CRGeneralMarketResearchAnalysisEvaluateInputModelGeneralMarketResearchAnalysisInstanceRecordGeneralMarketResearchAnalysisUsageRecord generalMarketResearchAnalysisUsageRecord) {
    this.generalMarketResearchAnalysisUsageRecord = generalMarketResearchAnalysisUsageRecord;
  }


}

