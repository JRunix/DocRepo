package com.revex.docrepo.exchange.works;

import com.revex.docrepo.database.entities.QualificationWork;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class GetAllCourseWorksResponsePayload {
    private Set<QualificationWork> courseWorks;
}
