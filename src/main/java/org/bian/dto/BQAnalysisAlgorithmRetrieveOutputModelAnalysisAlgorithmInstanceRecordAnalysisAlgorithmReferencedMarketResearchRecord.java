package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecordAnalysisAlgorithmReferencedMarketResearchRecord
 */
public class BQAnalysisAlgorithmRetrieveOutputModelAnalysisAlgorithmInstanceRecordAnalysisAlgorithmReferencedMarketResearchRecord   {
  private String marketResearchReportTypeReference = null;

  private String marketResearchReportTypeDefinition = null;

  private String marketResearchReportVersionPeriod = null;

  private Object marketResearchReport = null;

  private String generalMarketResearchDirectoryEntryInstanceReference = null;

  private Object generalMarketResearchDirectoryEntryInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a specific type of predefined market research report or database 
   * @return marketResearchReportTypeReference
  **/

  public String getMarketResearchReportTypeReference() {
    return marketResearchReportTypeReference;
  }

  public void setMarketResearchReportTypeReference(String marketResearchReportTypeReference) {
    this.marketResearchReportTypeReference = marketResearchReportTypeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Describes the available market research report content (e.g. customer social network usage analysis) 
   * @return marketResearchReportTypeDefinition
  **/

  public String getMarketResearchReportTypeDefinition() {
    return marketResearchReportTypeDefinition;
  }

  public void setMarketResearchReportTypeDefinition(String marketResearchReportTypeDefinition) {
    this.marketResearchReportTypeDefinition = marketResearchReportTypeDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the version and period covered by the research 
   * @return marketResearchReportVersionPeriod
  **/

  public String getMarketResearchReportVersionPeriod() {
    return marketResearchReportVersionPeriod;
  }

  public void setMarketResearchReportVersionPeriod(String marketResearchReportVersionPeriod) {
    this.marketResearchReportVersionPeriod = marketResearchReportVersionPeriod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Is the content of the report or database in any suitable form 
   * @return marketResearchReport
  **/

  public Object getMarketResearchReport() {
    return marketResearchReport;
  }

  public void setMarketResearchReport(Object marketResearchReport) {
    this.marketResearchReport = marketResearchReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an internally maintained market research viewpoint 
   * @return generalMarketResearchDirectoryEntryInstanceReference
  **/

  public String getGeneralMarketResearchDirectoryEntryInstanceReference() {
    return generalMarketResearchDirectoryEntryInstanceReference;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceReference(String generalMarketResearchDirectoryEntryInstanceReference) {
    this.generalMarketResearchDirectoryEntryInstanceReference = generalMarketResearchDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The market research viewpoint definition and content 
   * @return generalMarketResearchDirectoryEntryInstanceRecord
  **/

  public Object getGeneralMarketResearchDirectoryEntryInstanceRecord() {
    return generalMarketResearchDirectoryEntryInstanceRecord;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceRecord(Object generalMarketResearchDirectoryEntryInstanceRecord) {
    this.generalMarketResearchDirectoryEntryInstanceRecord = generalMarketResearchDirectoryEntryInstanceRecord;
  }


}

