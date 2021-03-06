package com.revex.docrepo.exchange.stat;

import com.revex.docrepo.database.utils.QualificationWorkType;
import lombok.Data;

@Data
public class StatRequestPayload {
	private int beginYear;
	private int endYear;
	private String cathedra;
	private String specialty;
	private String faculty;
	private Long teacherId;
	private QualificationWorkType workType;
}
