package com.example.mp_report.service;

import com.example.mp_report.model.Report;
import com.example.mp_report.repository.ReportRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReportService {
private final ReportRepo reportRepo;

	public ReportService(ReportRepo reportRepo) {
		this.reportRepo = reportRepo;
	}
	public List<Report> getAllReport(){
	return reportRepo.findAll();
	}

	public void saveReport(Report report){
	reportRepo.save(report);
	}
}
