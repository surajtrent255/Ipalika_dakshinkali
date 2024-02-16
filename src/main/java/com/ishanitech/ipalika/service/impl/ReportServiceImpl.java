package com.ishanitech.ipalika.service.impl;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.ishanitech.ipalika.dto.*;
import com.ishanitech.ipalika.model.*;
import org.springframework.stereotype.Service;

import com.ishanitech.ipalika.dao.ReportDAO;
import com.ishanitech.ipalika.dao.ReportWardDAO;
import com.ishanitech.ipalika.service.DbService;
import com.ishanitech.ipalika.service.ReportService;
import com.ishanitech.ipalika.utils.ReportUtil;

@Service
public class ReportServiceImpl implements ReportService {
	private final ReportDAO reportDAO;
	private final ReportWardDAO reportWardDAO;

	public ReportServiceImpl(DbService dbService) {
		this.reportDAO = dbService.getDao(ReportDAO.class);
		this.reportWardDAO = dbService.getDao(ReportWardDAO.class);
	}

	@Override
	public void generateReport(int wardNo) {
		if(wardNo == 0) {
			reportDAO.generateReport();
		} else {
			reportWardDAO.generateReport(wardNo);
		}
	}

	@Override
	public List<PopulationReport> getAllPopulationReports(int wardNo) {
		List<PopulationReport> pReports = reportWardDAO.getAllPopulationReports(wardNo);
		if(wardNo == 1){
			ReportUtil.PIF = 1.5;
			for(PopulationReport report : pReports) {
			report.setOption1((double)((int) (report.getOption1() * ReportUtil.PIF)));
			report.setOption2((double)((int) (report.getOption2() * ReportUtil.PIF)));
			report.setOption3((double)((int) (report.getOption3() * ReportUtil.PIF)));
			report.setOption4((double)((int) (report.getOption4() * ReportUtil.PIF)));
			report.setOption5((double)((int) (report.getOption5() * ReportUtil.PIF)));
			report.setOption6((double)((int) (report.getOption6() * ReportUtil.PIF)));
			report.setOption7((double)((int) (report.getOption7() * ReportUtil.PIF)));
			report.setOption8((double)((int) (report.getOption8() * ReportUtil.PIF)));
			report.setOption9((double)((int) (report.getOption9() * ReportUtil.PIF)));
			report.setOption10((double)((int) (report.getOption10() * ReportUtil.PIF)));
			report.setOption11((double)((int) (report.getOption11() * ReportUtil.PIF)));
			report.setOption12((double)((int) (report.getOption12() * ReportUtil.PIF)));
			report.setOption13((double)((int) (report.getOption13() * ReportUtil.PIF)));
			report.setOption14((double)((int) (report.getOption14() * ReportUtil.PIF)));
			report.setOption15((double)((int) (report.getOption15() * ReportUtil.PIF)));
			report.setTotal((double)((int) (report.getTotal() * ReportUtil.PIF)));
			}
		} else if (wardNo == 2){
			ReportUtil.PIF = 1.4;
			for(PopulationReport report : pReports) {
				report.setOption1((double)((int) (report.getOption1() * ReportUtil.PIF)));
				report.setOption2((double)((int) (report.getOption2() * ReportUtil.PIF)));
				report.setOption3((double)((int) (report.getOption3() * ReportUtil.PIF)));
				report.setOption4((double)((int) (report.getOption4() * ReportUtil.PIF)));
				report.setOption5((double)((int) (report.getOption5() * ReportUtil.PIF)));
				report.setOption6((double)((int) (report.getOption6() * ReportUtil.PIF)));
				report.setOption7((double)((int) (report.getOption7() * ReportUtil.PIF)));
				report.setOption8((double)((int) (report.getOption8() * ReportUtil.PIF)));
				report.setOption9((double)((int) (report.getOption9() * ReportUtil.PIF)));
				report.setOption10((double)((int) (report.getOption10() * ReportUtil.PIF)));
				report.setOption11((double)((int) (report.getOption11() * ReportUtil.PIF)));
				report.setOption12((double)((int) (report.getOption12() * ReportUtil.PIF)));
				report.setOption13((double)((int) (report.getOption13() * ReportUtil.PIF)));
				report.setOption14((double)((int) (report.getOption14() * ReportUtil.PIF)));
				report.setOption15((double)((int) (report.getOption15() * ReportUtil.PIF)));
				report.setTotal((double)((int) (report.getTotal() * ReportUtil.PIF)));
			}
		} else if(wardNo == 5){
			ReportUtil.PIF = 1.5;
			for(PopulationReport report : pReports) {
				report.setOption1((double)((int) (report.getOption1() * ReportUtil.PIF)));
				report.setOption2((double)((int) (report.getOption2() * ReportUtil.PIF)));
				report.setOption3((double)((int) (report.getOption3() * ReportUtil.PIF)));
				report.setOption4((double)((int) (report.getOption4() * ReportUtil.PIF)));
				report.setOption5((double)((int) (report.getOption5() * ReportUtil.PIF)));
				report.setOption6((double)((int) (report.getOption6() * ReportUtil.PIF)));
				report.setOption7((double)((int) (report.getOption7() * ReportUtil.PIF)));
				report.setOption8((double)((int) (report.getOption8() * ReportUtil.PIF)));
				report.setOption9((double)((int) (report.getOption9() * ReportUtil.PIF)));
				report.setOption10((double)((int) (report.getOption10() * ReportUtil.PIF)));
				report.setOption11((double)((int) (report.getOption11() * ReportUtil.PIF)));
				report.setOption12((double)((int) (report.getOption12() * ReportUtil.PIF)));
				report.setOption13((double)((int) (report.getOption13() * ReportUtil.PIF)));
				report.setOption14((double)((int) (report.getOption14() * ReportUtil.PIF)));
				report.setOption15((double)((int) (report.getOption15() * ReportUtil.PIF)));
				report.setTotal((double)((int) (report.getTotal() * ReportUtil.PIF)));

			}
		} else if(wardNo == 8 || wardNo == 9){
			ReportUtil.PIF = 1.1;
			for(PopulationReport report : pReports) {
				report.setOption1((double)((int) (report.getOption1() * ReportUtil.PIF)));
				report.setOption2((double)((int) (report.getOption2() * ReportUtil.PIF)));
				report.setOption3((double)((int) (report.getOption3() * ReportUtil.PIF)));
				report.setOption4((double)((int) (report.getOption4() * ReportUtil.PIF)));
				report.setOption5((double)((int) (report.getOption5() * ReportUtil.PIF)));
				report.setOption6((double)((int) (report.getOption6() * ReportUtil.PIF)));
				report.setOption7((double)((int) (report.getOption7() * ReportUtil.PIF)));
				report.setOption8((double)((int) (report.getOption8() * ReportUtil.PIF)));
				report.setOption9((double)((int) (report.getOption9() * ReportUtil.PIF)));
				report.setOption10((double)((int) (report.getOption10() * ReportUtil.PIF)));
				report.setOption11((double)((int) (report.getOption11() * ReportUtil.PIF)));
				report.setOption12((double)((int) (report.getOption12() * ReportUtil.PIF)));
				report.setOption13((double)((int) (report.getOption13() * ReportUtil.PIF)));
				report.setOption14((double)((int) (report.getOption14() * ReportUtil.PIF)));
				report.setOption15((double)((int) (report.getOption15() * ReportUtil.PIF)));
				report.setTotal((double)((int) (report.getTotal() * ReportUtil.PIF)));
			}
		}  else if(wardNo == 0){
			Integer memberSankhya  = 0;
//			ward1
			List<PopulationReport> pReports1 =  reportWardDAO.getAllPopulationReports(1);
			memberSankhya += (int) (pReports1.get(0).getTotal() * 1.5);

			//ward2
			List<PopulationReport> pReports2 = reportWardDAO.getAllPopulationReports(2);
			memberSankhya += ((int) (pReports2.get(0).getTotal() * 1.4));

//			ward3
			List<PopulationReport> pReports3 = reportWardDAO.getAllPopulationReports(3);
			memberSankhya += (int) (pReports3.get(0).getTotal() * 1.3);

//			ward4
			List<PopulationReport> pReports4 = reportWardDAO.getAllPopulationReports(4);
			memberSankhya += (int) (pReports4.get(0).getTotal() * 1.3);

//			ward5
			List<PopulationReport> pReports5 = reportWardDAO.getAllPopulationReports(5);
			memberSankhya += (int) (pReports5.get(0).getTotal() * 1.5);

//			ward6
			List<PopulationReport> pReports6 = reportWardDAO.getAllPopulationReports(6);
			memberSankhya += (int) (pReports6.get(0).getTotal() * 1.3);

//			ward7
			List<PopulationReport> pReports7 = reportWardDAO.getAllPopulationReports(7);
			memberSankhya += (int)(pReports7.get(0).getTotal() * 1.3);

//			ward8
			List<PopulationReport> pReports8 = reportWardDAO.getAllPopulationReports(8);
			memberSankhya += (int)(pReports8.get(0).getTotal() * 1.1);

//			ward9
			List<PopulationReport> pReports9 = reportWardDAO.getAllPopulationReports(9);
			memberSankhya += (int)(pReports9.get(0).getTotal() * 1.1);
			ReportUtil.PIF = 1.3;
			for(PopulationReport report : pReports) {
				report.setOption1((double)((int) (report.getOption1() * ReportUtil.PIF)));
				report.setOption2((double)((int) (report.getOption2() * ReportUtil.PIF)));
				report.setOption3((double)((int) (report.getOption3() * ReportUtil.PIF)));
				report.setOption4((double)((int) (report.getOption4() * ReportUtil.PIF)));
				report.setOption5((double)((int) (report.getOption5() * ReportUtil.PIF)));
				report.setOption6((double)((int) (report.getOption6() * ReportUtil.PIF)));
				report.setOption7((double)((int) (report.getOption7() * ReportUtil.PIF)));
				report.setOption8((double)((int) (report.getOption8() * ReportUtil.PIF)));
				report.setOption9((double)((int) (report.getOption9() * ReportUtil.PIF)));
				report.setOption10((double)((int) (report.getOption10() * ReportUtil.PIF)));
				report.setOption11((double)((int) (report.getOption11() * ReportUtil.PIF)));
				report.setOption12((double)((int) (report.getOption12() * ReportUtil.PIF)));
				report.setOption13((double)((int) (report.getOption13() * ReportUtil.PIF)));
				report.setOption14((double)((int) (report.getOption14() * ReportUtil.PIF)));
				report.setOption15((double)((int) (report.getOption15() * ReportUtil.PIF)));
				report.setTotal((double)((int) (report.getTotal() * ReportUtil.PIF)));
			}
			pReports.get(0).setTotal(Double.valueOf(memberSankhya));
		}
		else {
			ReportUtil.PIF = 1.3;
			for(PopulationReport report : pReports) {
				report.setOption1((double)((int) (report.getOption1() * ReportUtil.PIF)));
				report.setOption2((double)((int) (report.getOption2() * ReportUtil.PIF)));
				report.setOption3((double)((int) (report.getOption3() * ReportUtil.PIF)));
				report.setOption4((double)((int) (report.getOption4() * ReportUtil.PIF)));
				report.setOption5((double)((int) (report.getOption5() * ReportUtil.PIF)));
				report.setOption6((double)((int) (report.getOption6() * ReportUtil.PIF)));
				report.setOption7((double)((int) (report.getOption7() * ReportUtil.PIF)));
				report.setOption8((double)((int) (report.getOption8() * ReportUtil.PIF)));
				report.setOption9((double)((int) (report.getOption9() * ReportUtil.PIF)));
				report.setOption10((double)((int) (report.getOption10() * ReportUtil.PIF)));
				report.setOption11((double)((int) (report.getOption11() * ReportUtil.PIF)));
				report.setOption12((double)((int) (report.getOption12() * ReportUtil.PIF)));
				report.setOption13((double)((int) (report.getOption13() * ReportUtil.PIF)));
				report.setOption14((double)((int) (report.getOption14() * ReportUtil.PIF)));
				report.setOption15((double)((int) (report.getOption15() * ReportUtil.PIF)));
				report.setTotal((double)((int) (report.getTotal() * ReportUtil.PIF)));
			}
		}
		//List<PopulationReport> newReports = new ArrayList<PopulationReport>();
//		if(wardNo == 1){
//			ReportUtil.PIF = 1.5;
//		} else if (wardNo == 2){
//			ReportUtil.PIF = 1.4;
//		} else if(wardNo == 5){
//			ReportUtil.PIF = 1.5;
//		}
//		else if(wardNo == 8 || wardNo == 9){
//			ReportUtil.PIF = 1.1;
//		} else {
//			ReportUtil.PIF = 1.3;
//		}
//		for(PopulationReport report : pReports) {
//			report.setOption1((double)((int) (report.getOption1() * ReportUtil.PIF)));
//			report.setOption2((double)((int) (report.getOption2() * ReportUtil.PIF)));
//			report.setOption3((double)((int) (report.getOption3() * ReportUtil.PIF)));
//			report.setOption4((double)((int) (report.getOption4() * ReportUtil.PIF)));
//			report.setOption5((double)((int) (report.getOption5() * ReportUtil.PIF)));
//			report.setOption6((double)((int) (report.getOption6() * ReportUtil.PIF)));
//			report.setOption7((double)((int) (report.getOption7() * ReportUtil.PIF)));
//			report.setOption8((double)((int) (report.getOption8() * ReportUtil.PIF)));
//			report.setOption9((double)((int) (report.getOption9() * ReportUtil.PIF)));
//			report.setOption10((double)((int) (report.getOption10() * ReportUtil.PIF)));
//			report.setOption11((double)((int) (report.getOption11() * ReportUtil.PIF)));
//			report.setOption12((double)((int) (report.getOption12() * ReportUtil.PIF)));
//			report.setOption13((double)((int) (report.getOption13() * ReportUtil.PIF)));
//			report.setOption14((double)((int) (report.getOption14() * ReportUtil.PIF)));
//			report.setOption15((double)((int) (report.getOption15() * ReportUtil.PIF)));
//
//			report.setTotal((double)((int) (report.getTotal() * ReportUtil.PIF)));
//
//
//		}
//
		
		return pReports;
				
	}

	@Override
	public List<QuestionReport> getAllQuestionReports(int wardNo) {
//		List<QuestionReport> questionReports;
//		questionReports = reportWardDAO.getAllQuestionReport(wardNo);
//		return reportWardDAO.getAllQuestionReport(wardNo);
//		QuestionReport questionReport7 = questionReports.get(7);
//		questionReports.get(7).setOption1((double)((int)(questionReport7.getOption1() * ReportUtil.PIF)));
//		questionReports.get(7).setOption2((double)((int)(questionReport7.getOption2() * ReportUtil.PIF)));
//		questionReports.get(7).setOption3((double)((int)(questionReport7.getOption3() * ReportUtil.PIF)));
//		questionReports.get(7).setOption4((double)((int)(questionReport7.getOption4() * ReportUtil.PIF)));
//
//		QuestionReport questionReport19 = questionReports.get(19);
//		questionReports.get(19).setOption1((double)((int)(questionReport19.getOption1() * ReportUtil.PIF)));
//		questionReports.get(19).setOption2((double)((int)(questionReport19.getOption2() * ReportUtil.PIF)));
//		questionReports.get(19).setOption3((double)((int)(questionReport19.getOption3() * ReportUtil.PIF)));
//		questionReports.get(19).setOption4((double)((int)(questionReport19.getOption4() * ReportUtil.PIF)));

		if(wardNo == 1){
			ReportUtil.PIF = 1.5;
		} else if (wardNo == 2){
			ReportUtil.PIF = 1.2;
		} else if(wardNo == 5){
			ReportUtil.PIF = 1.5;
		}
		else if(wardNo == 8 || wardNo == 9){
			ReportUtil.PIF = 1.1;
		} else {
			ReportUtil.PIF = 1.3;
		}
		List<QuestionReport> questionReports = reportWardDAO.getAllQuestionReport(wardNo);

		for(QuestionReport report : questionReports) {
			report.setOption1((double)((int) (report.getOption1() * ReportUtil.PIF)));
			report.setOption2((double)((int) (report.getOption2() * ReportUtil.PIF)));
			report.setOption3((double)((int) (report.getOption3() * ReportUtil.PIF)));
			report.setOption4((double)((int) (report.getOption4() * ReportUtil.PIF)));
			report.setOption5((double)((int) (report.getOption5() * ReportUtil.PIF)));
			report.setOption6((double)((int) (report.getOption6() * ReportUtil.PIF)));
			report.setOption7((double)((int) (report.getOption7() * ReportUtil.PIF)));
			report.setOption8((double)((int) (report.getOption8() * ReportUtil.PIF)));
			report.setOption9((double)((int) (report.getOption9() * ReportUtil.PIF)));
			report.setOption10((double)((int) (report.getOption10() * ReportUtil.PIF)));
			report.setOption11((double)((int) (report.getOption11() * ReportUtil.PIF)));
			report.setOption12((double)((int) (report.getOption12() * ReportUtil.PIF)));
			report.setOption13((double)((int) (report.getOption13() * ReportUtil.PIF)));
			report.setOption14((double)((int) (report.getOption14() * ReportUtil.PIF)));
			report.setOption15((double)((int) (report.getOption15() * ReportUtil.PIF)));

			report.setTotal((double)((int) (report.getTotal() * ReportUtil.PIF)));
		}

		return questionReports;
	}


	@Override
	public List<ExtraReport> getExtraReports(int wardNo) {
		List<ExtraReport> eReports = reportWardDAO.getExtraReports(wardNo);
		if(wardNo == 1){
			ReportUtil.PIF = 1.5;
			for(ExtraReport report : eReports) {
				report.setData((int) (report.getData() * ReportUtil.PIF));
			}
		} else if (wardNo == 2){
			ReportUtil.PIF = 1.2;
			for(ExtraReport report : eReports) {
				report.setData((int) (report.getData() * ReportUtil.PIF));
			}
		} else if(wardNo == 5){
			ReportUtil.PIF = 1.7;
			for(ExtraReport report : eReports) {
				report.setData((int) (report.getData() * ReportUtil.PIF));
			}
		} else if(wardNo == 6){
			ReportUtil.PIF = 1.7;
			for(ExtraReport report : eReports) {
				report.setData((int) (report.getData() * ReportUtil.PIF));
			}
		} else if(wardNo == 8 || wardNo == 9){
			ReportUtil.PIF = 1.1;
			for(ExtraReport report : eReports) {
				report.setData((int) (report.getData() * ReportUtil.PIF));
			}
		}  else if(wardNo == 0){
			Integer sumjammaGharDhuri  = 0;
//			ward1
			List<ExtraReport> extraReports1 = reportWardDAO.getExtraReports(1);
			sumjammaGharDhuri += (int) (extraReports1.get(1).getData() * 1.5);

			//ward2
			List<ExtraReport> extraReports2 = reportWardDAO.getExtraReports(2);
			sumjammaGharDhuri += ((int) (extraReports2.get(1).getData() * 1.2));

//			ward3
			List<ExtraReport> extraReports3 = reportWardDAO.getExtraReports(3);
			sumjammaGharDhuri += (int) (extraReports3.get(1).getData() * 1.3);

//			ward4
			List<ExtraReport> extraReports4 = reportWardDAO.getExtraReports(4);
			sumjammaGharDhuri += (int) (extraReports4.get(1).getData() * 1.3);

//			ward5
			List<ExtraReport> extraReports5 = reportWardDAO.getExtraReports(5);
			sumjammaGharDhuri += (int) (extraReports5.get(1).getData() * 1.7);

//			ward6
			List<ExtraReport> extraReports6 = reportWardDAO.getExtraReports(6);
			sumjammaGharDhuri += (int) (extraReports6.get(1).getData() * 1.7);

//			ward7
			List<ExtraReport> extraReports7 = reportWardDAO.getExtraReports(7);
			sumjammaGharDhuri += (int)(extraReports7.get(1).getData() * 1.3);

//			ward8
			List<ExtraReport> extraReports8 = reportWardDAO.getExtraReports(8);
			sumjammaGharDhuri += (int)(extraReports8.get(1).getData() * 1.1);

//			ward9
			List<ExtraReport> extraReports9 = reportWardDAO.getExtraReports(9);
			sumjammaGharDhuri += (int)(extraReports9.get(1).getData() * 1.1);
			ReportUtil.PIF = 1.3;
			for(ExtraReport report : eReports) {
				report.setData((int)((double) (report.getData() * ReportUtil.PIF)));
			}
			eReports.get(1).setData(sumjammaGharDhuri);
		}
		else {
			ReportUtil.PIF = 1.3;
			for(ExtraReport report : eReports) {
				report.setData((int)((double) (report.getData() * ReportUtil.PIF)));
			}
		}


		return eReports;
	}

	@Override
	public List<BeekeepingDTO> getBeekeepingInfo(int wardNo) {
		if(wardNo == 0) {
			return reportDAO.getBeekeepingInfo();
		} else {
			return reportWardDAO.getBeekeepingInfo(wardNo);
		}
	}

	@Override
	public List<AgriculturalFarmDTO> getAgriculturaFarmInfo(int wardNo) {
		if(wardNo == 0) {
			return reportDAO.getAgriculturalFarmInfo();
		} else {
			return reportWardDAO.getAgriculturalFarmInfo(wardNo);
		}
	}

	@Override
	public List<FavouritePlaceReport> getFavouritePlaceReports(int wardNo) {
		List<FavouritePlaceReport> favouritePlaceReports;
		favouritePlaceReports = reportWardDAO.getAllFavouritePlaceReports(wardNo);
		return favouritePlaceReports;
	}


	@Override
	public List<AgeGroupDTO> getSisuReport() {
		return reportWardDAO.getAllSisusReport();
	}

	@Override
	public List<AgeGroupDTO> getBalBalikaReport(){
		return reportWardDAO.getAllBalBalikaReport();
	}

	@Override
	public List<AgeGroupDTO> getYuwaReport() {
		return reportWardDAO.getAllYuwaReport();
	}

	@Override
	public List<AgeGroupDTO> getAdhBaisaReport() {
		return reportWardDAO.getAllAdhBaisaReport();
	}

	@Override
	public List<AgeGroupDTO> getBriddhaReport() {
		return reportWardDAO.getAllBriddhaReport();
	}

	@Override
	public List<AgeGroupDTO> getJesthaNagarikReport() {
		return reportWardDAO.getAllJesthaNagarikReport();
	}

	@Override
	public List<AgeGroupDTO> getAcademicQualificationReport(String qualType) {
		return reportWardDAO.getAcademicQualificationReport(qualType);
		}

	@Override
	public List<LifeStyleAndCultureDTO> getCasteGroupHouseholdReport(Integer casteNo) {
		return reportWardDAO.getCasteGroupHouseholdReport(casteNo);
	}

	@Override
	public List<LifeStyleAndCultureDTO> getReligionGroupHouseholdReport(Integer religionNo) {
		return reportWardDAO.getReligionGroupHouseHoldReport(religionNo);
	}

	@Override
	public List<LifeStyleAndCultureDTO> getMotherTongueHouseholdReport(Integer motherTongueNo) {
		return reportWardDAO.getMotherTongueHouseHoldReport(motherTongueNo);
	}

	@Override
	public List<LifeStyleAndCultureDTO> getAnnualIncomeExpReport(int id, String type) {
		List<LifeStyleAndCultureDTO> annualIncomeExpReport = new ArrayList<>();
		switch (type){
			case "inc":
				annualIncomeExpReport = reportDAO.getAnnualIncomeReport(id);
				break;

			case "exp":
				annualIncomeExpReport = reportDAO.getAnnualExpenseReport(id);
				break;
		}
		return annualIncomeExpReport;
	}

	@Override
	public List<LifeStyleAndCultureDTO> getHouseHoldInfantMortalityReport(int id) {
		List<LifeStyleAndCultureDTO> housholdInfantMortalityReport = reportDAO.getHouseholdInfantMortalityReport(id);
		return housholdInfantMortalityReport;
	}

	@Override
	public List<FavouritePlaceTypeDTO> getTypeWiseFavouritePlaceReport(String typeId) {
		List<FavouritePlaceTypeDTO> favouritePlaceReport = reportDAO.getTypeWiseFavouritePlaces(typeId);
		return favouritePlaceReport;
	}

	@Override
	public ByabasahikReportDTO getAllByabashahiReport(int wardNo) {
		ByabasahikReportDTO byabasahikReportDTO = new ByabasahikReportDTO();
		byabasahikReportDTO.setWardNo(wardNo);
			List<String> something = reportDAO.getVyabasaikReport(wardNo);
			String inputString = "1,2,3";

			something.forEach(e->{
				String[] words = e.split(",");
				for (int i=0; i< words.length; i++){
					int optionId = Integer.parseInt(words[i])+ 1;
					byabasahikReportDTO.setTotal(byabasahikReportDTO.getTotal() + 1);
					switch (optionId){
						case 1:
							byabasahikReportDTO.setBeautyParlour(byabasahikReportDTO.getBeautyParlour()+1);
							break;
						case 2:
							byabasahikReportDTO.setMasuPasal(byabasahikReportDTO.getMasuPasal()+1);
							break;
						case 3:
							byabasahikReportDTO.setKhudraPasal(byabasahikReportDTO.getKhudraPasal() + 1);
							break;
						case 4:
							byabasahikReportDTO.setKiranaPasal(byabasahikReportDTO.getKiranaPasal() + 1);
							break;
						case 5:
							byabasahikReportDTO.setJuttaPasal(byabasahikReportDTO.getJuttaPasal() + 1);
							break;
						case 6:
							byabasahikReportDTO.setHotel(byabasahikReportDTO.getHotel() + 1);
							break;
						case 7:
							byabasahikReportDTO.setKhajaPasal(byabasahikReportDTO.getKhajaPasal() + 1);
							break;
						case 8:
							byabasahikReportDTO.setMiniMart(byabasahikReportDTO.getMiniMart() + 1);
							break;
						case 9:
							byabasahikReportDTO.setResturant(byabasahikReportDTO.getResturant() + 1);
							break;
						case 10:
							byabasahikReportDTO.setFalfulPasal(byabasahikReportDTO.getFalfulPasal() + 1);
							break;
						case 11:
							byabasahikReportDTO.setPharmacy(byabasahikReportDTO.getPharmacy() + 1);
							break;
						case 12:
							byabasahikReportDTO.setClinic(byabasahikReportDTO.getClinic() + 1);
							break;
						case 13:
							byabasahikReportDTO.setBidhyalaya(byabasahikReportDTO.getBidhyalaya() + 1);
							break;
						case 14:
							byabasahikReportDTO.setTarkariPasal(byabasahikReportDTO.getTarkariPasal() + 1);
							break;
						case 15:
							byabasahikReportDTO.setDairyPasal(byabasahikReportDTO.getDairyPasal() + 1);
							break;
						case 16:
							byabasahikReportDTO.setOthers(byabasahikReportDTO.getOthers() + 1);
					}
				}
			});
			byabasahikReportDTO.setBeautyParlour((int)(Double.valueOf(byabasahikReportDTO.getBeautyParlour()) * 1.4));
		byabasahikReportDTO.setMasuPasal((int)(Double.valueOf(byabasahikReportDTO.getMasuPasal()) * 1.4));
		byabasahikReportDTO.setKhudraPasal((int)(Double.valueOf(byabasahikReportDTO.getKhudraPasal()) * 1.4));
		byabasahikReportDTO.setKiranaPasal((int)(Double.valueOf(byabasahikReportDTO.getKiranaPasal()) * 1.4));
		byabasahikReportDTO.setJuttaPasal((int)(Double.valueOf(byabasahikReportDTO.getJuttaPasal()) * 1.4));
		byabasahikReportDTO.setHotel((int)(Double.valueOf(byabasahikReportDTO.getHotel()) * 1.4));
		byabasahikReportDTO.setKhajaPasal((int)(Double.valueOf(byabasahikReportDTO.getKhajaPasal()) * 1.4));
		byabasahikReportDTO.setMiniMart((int)(Double.valueOf(byabasahikReportDTO.getMiniMart()) * 1.4));
		byabasahikReportDTO.setResturant((int)(Double.valueOf(byabasahikReportDTO.getResturant()) * 1.4));
		byabasahikReportDTO.setFalfulPasal((int)(Double.valueOf(byabasahikReportDTO.getFalfulPasal()) * 1.4));
		byabasahikReportDTO.setPharmacy((int)(Double.valueOf(byabasahikReportDTO.getPharmacy()) * 1.4));
		byabasahikReportDTO.setClinic((int)(Double.valueOf(byabasahikReportDTO.getClinic()) * 1.4));
		byabasahikReportDTO.setBidhyalaya((int)(Double.valueOf(byabasahikReportDTO.getBidhyalaya()) * 1.4));
		byabasahikReportDTO.setTarkariPasal((int)(Double.valueOf(byabasahikReportDTO.getTarkariPasal()) * 1.4));
		byabasahikReportDTO.setDairyPasal((int)(Double.valueOf(byabasahikReportDTO.getDairyPasal()) * 1.4));
		byabasahikReportDTO.setOthers((int)(Double.valueOf(byabasahikReportDTO.getOthers()) * 1.4));
		byabasahikReportDTO.setTotal((int)(Double.valueOf(byabasahikReportDTO.getTotal()) * 1.4));
		return byabasahikReportDTO;
	}

	@Override
	public List<LifeStyleAndCultureDTO> getHouseholdMedicalApproachesReport(int id) {
		List<LifeStyleAndCultureDTO> houseHoldsmedicalApproaches = reportDAO.getHouseholdsMedicalApproachesReport(id);
		return houseHoldsmedicalApproaches;
	}


}
