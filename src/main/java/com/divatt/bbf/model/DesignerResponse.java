package com.divatt.bbf.model;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class DesignerResponse {
	LocalDateTime timeStamp = LocalDateTime.now();
	private String status;
	private String message;
	private List<UserRegistrationUiVo> data;
}
