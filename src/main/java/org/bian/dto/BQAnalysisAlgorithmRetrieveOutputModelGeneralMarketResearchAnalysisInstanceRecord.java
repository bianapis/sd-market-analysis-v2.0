package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAnalysisAlgorithmRetrieveOutputModelGeneralMarketResearchAnalysisInstanceRecordGeneralMarketResearchAnalysisRequestRecord;

import javax.validation.Valid;
  
/**
 * BQAnalysisAlgorithmRetrieveOutputModelGeneralMarketResearchAnalysisInstanceRecord
 */
public class BQAnalysisAlgorithmRetrieveOutputModelGeneralMarketResearchAnalysisInstanceRecord   {
  private String generalMarketResearchAnalysisType = null;

  private String generalMarketResearchAnalysisSpecification = null;

  private String generalMarketResearchAnalysisGuidance = null;

  private String generalMarketResearchAnalysisAlgorithmReference = null;

  private BQAnalysisAlgorithmRetrieveOutputModelGeneralMarketResearchAnalysisInstanceRecordGeneralMarketResearchAnalysisRequestRecord generalMarketResearchAnalysisRequestRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of the analysis 
   * @return generalMarketResearchAnalysisSpecification
  **/

  public String getGeneralMarketResearchAnalysisSpecification() {
    return generalMarketResearchAnalysisSpecification;
  }

  public void setGeneralMarketResearchAnalysisSpecification(String generalMarketResearchAnalysisSpecification) {
    this.generalMarketResearchAnalysisSpecification = generalMarketResearchAnalysisSpecification;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidance on usage and interpretation of the analysis 
   * @return generalMarketResearchAnalysisGuidance
  **/

  public String getGeneralMarketResearchAnalysisGuidance() {
    return generalMarketResearchAnalysisGuidance;
  }

  public void setGeneralMarketResearchAnalysisGuidance(String generalMarketResearchAnalysisGuidance) {
    this.generalMarketResearchAnalysisGuidance = generalMarketResearchAnalysisGuidance;
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

  public BQAnalysisAlgorithmRetrieveOutputModelGeneralMarketResearchAnalysisInstanceRecordGeneralMarketResearchAnalysisRequestRecord getGeneralMarketResearchAnalysisRequestRecord() {
    return generalMarketResearchAnalysisRequestRecord;
  }

  public void setGeneralMarketResearchAnalysisRequestRecord(BQAnalysisAlgorithmRetrieveOutputModelGeneralMarketResearchAnalysisInstanceRecordGeneralMarketResearchAnalysisRequestRecord generalMarketResearchAnalysisRequestRecord) {
    this.generalMarketResearchAnalysisRequestRecord = generalMarketResearchAnalysisRequestRecord;
  }


}

