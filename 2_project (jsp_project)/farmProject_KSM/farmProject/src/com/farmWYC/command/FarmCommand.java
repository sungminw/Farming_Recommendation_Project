package com.farmWYC.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.farmWYC.dto.FarmCropAreaDto;

public interface FarmCommand {
	void execute(HttpServletRequest request, HttpServletResponse response);
}
