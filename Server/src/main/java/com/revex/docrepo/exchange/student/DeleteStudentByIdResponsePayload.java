package com.revex.docrepo.exchange.student;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DeleteStudentByIdResponsePayload {
	private boolean isSuccessful;
}
