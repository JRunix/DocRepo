package com.revex.docrepo.exchange.teacher;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateTeacherByParamResponsePayload {
    private boolean isSuccessful;
}
