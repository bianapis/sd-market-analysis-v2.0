package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecordAnalysisAlgorithmReferencedMarketResearchRecord;
import org.bian.dto.BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecordAnalysisAlgorithmRequestRecord;
import org.bian.dto.BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecordAnalysisAlgorithmUsageRecord;

import javax.validation.Valid;
  
/**
 * BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecord
 */
public class BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecord   {
  private String analysisAlgorithmType = null;

  private String analysisAlgorithmSpecification = null;

  private String analysisAlgorithmGuidance = null;

  private BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecordAnalysisAlgorithmReferencedMarketResearchRecord analysisAlgorithmReferencedMarketResearchRecord = null;

  private BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecordAnalysisAlgorithmRequestRecord analysisAlgorithmRequestRecord = null;

  private BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecordAnalysisAlgorithmUsageRecord analysisAlgorithmUsageRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the type of algorithm (e.g. regression) 
   * @return analysisAlgorithmType
  **/

  public String getAnalysisAlgorithmType() {
    return analysisAlgorithmType;
  }

  public void setAnalysisAlgorithmType(String analysisAlgorithmType) {
    this.analysisAlgorithmType = analysisAlgorithmType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of the algorithm, in particular required inputs, the internal data, calculations and outputs 
   * @return analysisAlgorithmSpecification
  **/

  public String getAnalysisAlgorithmSpecification() {
    return analysisAlgorithmSpecification;
  }

  public void setAnalysisAlgorithmSpecification(String analysisAlgorithmSpecification) {
    this.analysisAlgorithmSpecification = analysisAlgorithmSpecification;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidance on usage of the algorithm 
   * @return analysisAlgorithmGuidance
  **/

  public String getAnalysisAlgorithmGuidance() {
    return analysisAlgorithmGuidance;
  }

  public void setAnalysisAlgorithmGuidance(String analysisAlgorithmGuidance) {
    this.analysisAlgorithmGuidance = analysisAlgorithmGuidance;
  }


  /**
   * Get analysisAlgorithmReferencedMarketResearchRecord
   * @return analysisAlgorithmReferencedMarketResearchRecord
  **/

  public BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecordAnalysisAlgorithmReferencedMarketResearchRecord getAnalysisAlgorithmReferencedMarketResearchRecord() {
    return analysisAlgorithmReferencedMarketResearchRecord;
  }

  public void setAnalysisAlgorithmReferencedMarketResearchRecord(BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecordAnalysisAlgorithmReferencedMarketResearchRecord analysisAlgorithmReferencedMarketResearchRecord) {
    this.analysisAlgorithmReferencedMarketResearchRecord = analysisAlgorithmReferencedMarketResearchRecord;
  }


  /**
   * Get analysisAlgorithmRequestRecord
   * @return analysisAlgorithmRequestRecord
  **/

  public BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecordAnalysisAlgorithmRequestRecord getAnalysisAlgorithmRequestRecord() {
    return analysisAlgorithmRequestRecord;
  }

  public void setAnalysisAlgorithmRequestRecord(BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecordAnalysisAlgorithmRequestRecord analysisAlgorithmRequestRecord) {
    this.analysisAlgorithmRequestRecord = analysisAlgorithmRequestRecord;
  }


  /**
   * Get analysisAlgorithmUsageRecord
   * @return analysisAlgorithmUsageRecord
  **/

  public BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecordAnalysisAlgorithmUsageRecord getAnalysisAlgorithmUsageRecord() {
    return analysisAlgorithmUsageRecord;
  }

  public void setAnalysisAlgorithmUsageRecord(BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecordAnalysisAlgorithmUsageRecord analysisAlgorithmUsageRecord) {
    this.analysisAlgorithmUsageRecord = analysisAlgorithmUsageRecord;
  }


}

