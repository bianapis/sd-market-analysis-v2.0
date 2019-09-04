package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGeneralMarketResearchAnalysisEvaluateOutputModelGeneralMarketResearchAnalysisInstanceRecordGeneralMarketResearchAnalysisRequestRecord;

import javax.validation.Valid;
  
/**
 * CRGeneralMarketResearchAnalysisExecuteOutputModelGeneralMarketResearchAnalysisInstanceRecord
 */
public class CRGeneralMarketResearchAnalysisExecuteOutputModelGeneralMarketResearchAnalysisInstanceRecord   {
  private CRGeneralMarketResearchAnalysisEvaluateOutputModelGeneralMarketResearchAnalysisInstanceRecordGeneralMarketResearchAnalysisRequestRecord generalMarketResearchAnalysisRequestRecord = null;


  /**
   * Get generalMarketResearchAnalysisRequestRecord
   * @return generalMarketResearchAnalysisRequestRecord
  **/

  public CRGeneralMarketResearchAnalysisEvaluateOutputModelGeneralMarketResearchAnalysisInstanceRecordGeneralMarketResearchAnalysisRequestRecord getGeneralMarketResearchAnalysisRequestRecord() {
    return generalMarketResearchAnalysisRequestRecord;
  }

  public void setGeneralMarketResearchAnalysisRequestRecord(CRGeneralMarketResearchAnalysisEvaluateOutputModelGeneralMarketResearchAnalysisInstanceRecordGeneralMarketResearchAnalysisRequestRecord generalMarketResearchAnalysisRequestRecord) {
    this.generalMarketResearchAnalysisRequestRecord = generalMarketResearchAnalysisRequestRecord;
  }


}

