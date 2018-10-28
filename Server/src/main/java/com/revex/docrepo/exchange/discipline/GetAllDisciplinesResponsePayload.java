package com.revex.docrepo.exchange.discipline;

import com.revex.docrepo.database.entities.Discipline;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GetAllDisciplinesResponsePayload {
	private List<Discipline> disciplines;
}
