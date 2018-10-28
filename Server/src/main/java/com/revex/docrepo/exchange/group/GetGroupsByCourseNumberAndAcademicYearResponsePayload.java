package com.revex.docrepo.exchange.group;

import com.revex.docrepo.database.views.GroupView;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GetGroupsByCourseNumberAndAcademicYearResponsePayload {
	private List<GroupView> groups;
}
