/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class MarketAnalysisApiServiceImpl implements MarketAnalysisApiService {

	public SDMarketAnalysisActivateOutputModel activate(SDMarketAnalysisActivateInputModel request){
		return JsonReader.read("activate-SDMarketAnalysisActivateOutputModel.json",new TypeReference<SDMarketAnalysisActivateOutputModel>(){});
	}
	
	public SDMarketAnalysisConfigureOutputModel configure(String sdReferenceId, SDMarketAnalysisConfigureInputModel request){
		return JsonReader.read("configure-SDMarketAnalysisConfigureOutputModel.json",new TypeReference<SDMarketAnalysisConfigureOutputModel>(){});
	}
	
	public CRGeneralMarketResearchAnalysisEvaluateOutputModel evaluate(String sdReferenceId, CRGeneralMarketResearchAnalysisEvaluateInputModel request){
		return JsonReader.read("evaluate-CRGeneralMarketResearchAnalysisEvaluateOutputModel.json",new TypeReference<CRGeneralMarketResearchAnalysisEvaluateOutputModel>(){});
	}
	
	public CRGeneralMarketResearchAnalysisExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRGeneralMarketResearchAnalysisExecuteInputModel request){
		return JsonReader.read("execute-CRGeneralMarketResearchAnalysisExecuteOutputModel.json",new TypeReference<CRGeneralMarketResearchAnalysisExecuteOutputModel>(){});
	}
	
	public SDMarketAnalysisFeedbackOutputModel feedback(String sdReferenceId, SDMarketAnalysisFeedbackInputModel request){
		return JsonReader.read("feedback-SDMarketAnalysisFeedbackOutputModel.json",new TypeReference<SDMarketAnalysisFeedbackOutputModel>(){});
	}
	
	public CRGeneralMarketResearchAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRGeneralMarketResearchAnalysisRequestInputModel request){
		return JsonReader.read("request-CRGeneralMarketResearchAnalysisRequestOutputModel.json",new TypeReference<CRGeneralMarketResearchAnalysisRequestOutputModel>(){});
	}
	
	public BQAnalysisAlgorithmRetrieveOutputModel retrieveAnalysisalgorithm(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAnalysisAlgorithmRetrieveOutputModel.json",new TypeReference<BQAnalysisAlgorithmRetrieveOutputModel>(){});
	}
	
	public CRGeneralMarketResearchAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRGeneralMarketResearchAnalysisRetrieveOutputModel.json",new TypeReference<CRGeneralMarketResearchAnalysisRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDMarketAnalysisRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDMarketAnalysisRetrieveOutputModel.json",new TypeReference<SDMarketAnalysisRetrieveOutputModel>(){});
	}
	
}
