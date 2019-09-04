package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceAnalysis;
import org.bian.dto.BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecord;
import org.bian.dto.BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceReport;
import org.bian.dto.BQAnalysisAlgorithmRetrieveOutputModelGeneralMarketResearchAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAnalysisAlgorithmRetrieveOutputModel
 */
public class BQAnalysisAlgorithmRetrieveOutputModel   {
  private BQAnalysisAlgorithmRetrieveOutputModelGeneralMarketResearchAnalysisInstanceRecord generalMarketResearchAnalysisInstanceRecord = null;

  private BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecord analysisAlgorithmInstanceRecord = null;

  private String analysisAlgorithmRetrieveActionTaskReference = null;

  private Object analysisAlgorithmRetrieveActionTaskRecord = null;

  private String analysisAlgorithmRetrieveActionResponse = null;

  private BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceReport analysisAlgorithmInstanceReport = null;

  private BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceAnalysis analysisAlgorithmInstanceAnalysis = null;


  /**
   * Get generalMarketResearchAnalysisInstanceRecord
   * @return generalMarketResearchAnalysisInstanceRecord
  **/

  public BQAnalysisAlgorithmRetrieveOutputModelGeneralMarketResearchAnalysisInstanceRecord getGeneralMarketResearchAnalysisInstanceRecord() {
    return generalMarketResearchAnalysisInstanceRecord;
  }

  public void setGeneralMarketResearchAnalysisInstanceRecord(BQAnalysisAlgorithmRetrieveOutputModelGeneralMarketResearchAnalysisInstanceRecord generalMarketResearchAnalysisInstanceRecord) {
    this.generalMarketResearchAnalysisInstanceRecord = generalMarketResearchAnalysisInstanceRecord;
  }


  /**
   * Get analysisAlgorithmInstanceRecord
   * @return analysisAlgorithmInstanceRecord
  **/

  public BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecord getAnalysisAlgorithmInstanceRecord() {
    return analysisAlgorithmInstanceRecord;
  }

  public void setAnalysisAlgorithmInstanceRecord(BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecord analysisAlgorithmInstanceRecord) {
    this.analysisAlgorithmInstanceRecord = analysisAlgorithmInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Analysis Algorithm instance retrieve service call 
   * @return analysisAlgorithmRetrieveActionTaskReference
  **/

  public String getAnalysisAlgorithmRetrieveActionTaskReference() {
    return analysisAlgorithmRetrieveActionTaskReference;
  }

  public void setAnalysisAlgorithmRetrieveActionTaskReference(String analysisAlgorithmRetrieveActionTaskReference) {
    this.analysisAlgorithmRetrieveActionTaskReference = analysisAlgorithmRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return analysisAlgorithmRetrieveActionTaskRecord
  **/

  public Object getAnalysisAlgorithmRetrieveActionTaskRecord() {
    return analysisAlgorithmRetrieveActionTaskRecord;
  }

  public void setAnalysisAlgorithmRetrieveActionTaskRecord(Object analysisAlgorithmRetrieveActionTaskRecord) {
    this.analysisAlgorithmRetrieveActionTaskRecord = analysisAlgorithmRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return analysisAlgorithmRetrieveActionResponse
  **/

  public String getAnalysisAlgorithmRetrieveActionResponse() {
    return analysisAlgorithmRetrieveActionResponse;
  }

  public void setAnalysisAlgorithmRetrieveActionResponse(String analysisAlgorithmRetrieveActionResponse) {
    this.analysisAlgorithmRetrieveActionResponse = analysisAlgorithmRetrieveActionResponse;
  }


  /**
   * Get analysisAlgorithmInstanceReport
   * @return analysisAlgorithmInstanceReport
  **/

  public BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceReport getAnalysisAlgorithmInstanceReport() {
    return analysisAlgorithmInstanceReport;
  }

  public void setAnalysisAlgorithmInstanceReport(BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceReport analysisAlgorithmInstanceReport) {
    this.analysisAlgorithmInstanceReport = analysisAlgorithmInstanceReport;
  }


  /**
   * Get analysisAlgorithmInstanceAnalysis
   * @return analysisAlgorithmInstanceAnalysis
  **/

  public BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceAnalysis getAnalysisAlgorithmInstanceAnalysis() {
    return analysisAlgorithmInstanceAnalysis;
  }

  public void setAnalysisAlgorithmInstanceAnalysis(BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceAnalysis analysisAlgorithmInstanceAnalysis) {
    this.analysisAlgorithmInstanceAnalysis = analysisAlgorithmInstanceAnalysis;
  }


}

