package com.tyss.talenthunt.dao;

import java.util.List;

import com.tyss.talenthunt.dto.AddRequirment;
import com.tyss.talenthunt.dto.CandidateCreation;
import com.tyss.talenthunt.dto.ScheduleInterviewBean;

public interface AddRequirmentDAO {
	public AddRequirment addrequirement(AddRequirment reqinfo);

	public boolean updateRequirment(AddRequirment reqinfo);
	
	public List<AddRequirment> getAllRequirements();
	
	public CandidateCreation addCandidate(CandidateCreation candidateInfo);
	
	public List<CandidateCreation> getCandidate();
	
	public ScheduleInterviewBean addInterview(ScheduleInterviewBean interview);
	
	public List<ScheduleInterviewBean> getAllInterview();
}
