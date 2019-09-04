/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface MarketAnalysisApiService {

	SDMarketAnalysisActivateOutputModel activate(SDMarketAnalysisActivateInputModel request);
	
	SDMarketAnalysisConfigureOutputModel configure(String sdReferenceId, SDMarketAnalysisConfigureInputModel request);
	
	CRGeneralMarketResearchAnalysisEvaluateOutputModel evaluate(String sdReferenceId, CRGeneralMarketResearchAnalysisEvaluateInputModel request);
	
	CRGeneralMarketResearchAnalysisExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRGeneralMarketResearchAnalysisExecuteInputModel request);
	
	SDMarketAnalysisFeedbackOutputModel feedback(String sdReferenceId, SDMarketAnalysisFeedbackInputModel request);
	
	CRGeneralMarketResearchAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRGeneralMarketResearchAnalysisRequestInputModel request);
	
	BQAnalysisAlgorithmRetrieveOutputModel retrieveAnalysisalgorithm(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRGeneralMarketResearchAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDMarketAnalysisRetrieveOutputModel retrieveSD(String sdReferenceId);
	
}
