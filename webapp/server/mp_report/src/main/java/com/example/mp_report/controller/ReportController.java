package com.example.mp_report.controller;

import com.example.mp_report.model.Report;
import com.example.mp_report.service.ReportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReportController {

	private final ReportService reportService;

	public ReportController(ReportService reportService) {
		this.reportService = reportService;
	}
	@GetMapping("/getReport")
	public List<Report> getReport(){
	return reportService.getAllReport();
	}
}