package org.gradle.entities;

import org.springframework.stereotype.Component;

@Component
public class Royals implements Team {
	public String getName() {
		return "Royals";
	}

}
