package com.revex.docrepo.exchange.teacher;

import com.revex.docrepo.database.views.TeacherView;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GetAllTeacherViewsResponsePayload {
    private List<TeacherView> teacherViews;
}
