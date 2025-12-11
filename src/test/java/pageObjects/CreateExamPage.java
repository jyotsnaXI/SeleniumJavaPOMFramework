package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.JavaScriptUtils;
import utils.TestBase;
import utils.WaitUtils;

public class CreateExamPage extends TestBase {

	public WebDriver driver;

	public CreateExamPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='MedicalNormalText']//table/tbody/tr/td[2]/table/tbody/tr/td[2]")
	WebElement companyName;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnCreateExam")
	WebElement createExamButton;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_radDisclosure1Option1")
	WebElement authRadioButton;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_lvISOSTeam_ddlReasonForTest")
	WebElement drpReasonMedical;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_lvISOSTeam_calDateOfExam_txtDate")
	WebElement DOExam;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_lvISOSTeam_ddlMedicalCenter")
	WebElement drpMedicalCenter;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSubmit")
	WebElement submitForCreateExam;

	@FindBy(id = "divPhysiciaReportTab")
	WebElement physicianReportTab;

	@FindBy(id = "divLabAnalysisTab")
	WebElement labAnalysisTab;

	@FindBy(id = "divFitnessConclusionTab")
	WebElement fitnessConclusionTab;

	@FindBy(id = "btnSavePhysicianReport")
	WebElement savePhysicianReportButton;

	@FindBy(id = "btnSaveLabAnalysis")
	WebElement saveButtonForLabAnalysis;

	// Physician's Report Tab - Medical Examination
	@FindBy(id = "gdvMedicalExamGroup_ctl02_ddlPhysicianResult")
	WebElement drpEyesAndPupils;
	@FindBy(id = "gdvMedicalExamGroup_ctl03_ddlPhysicianResult")
	WebElement drpEarNoseThroat;
	@FindBy(id = "gdvMedicalExamGroup_ctl04_ddlPhysicianResult")
	WebElement drpTeethAndMouth;
	@FindBy(id = "gdvMedicalExamGroup_ctl05_ddlPhysicianResult")
	WebElement drpLungsAndChest;
	@FindBy(id = "gdvMedicalExamGroup_ctl06_ddlPhysicianResult")
	WebElement drpCardiovascular;
	@FindBy(id = "gdvMedicalExamGroup_ctl07_ddlPhysicianResult")
	WebElement drpAbdoViscera;
	@FindBy(id = "gdvMedicalExamGroup_ctl08_ddlPhysicianResult")
	WebElement drpHernialOrifices;
	@FindBy(id = "gdvMedicalExamGroup_ctl09_ddlPhysicianResult")
	WebElement drpAnusAndRectum;
	@FindBy(id = "gdvMedicalExamGroup_ctl10_ddlPhysicianResult")
	WebElement drpGenitoUrinary;
	@FindBy(id = "gdvMedicalExamGroup_ctl11_ddlPhysicianResult")
	WebElement drpExtremities;
	@FindBy(id = "gdvMedicalExamGroup_ctl12_ddlPhysicianResult")
	WebElement drpMusculoskeletal;
	@FindBy(id = "gdvMedicalExamGroup_ctl13_ddlPhysicianResult")
	WebElement drpSkinVaricoseveins;
	@FindBy(id = "gdvMedicalExamGroup_ctl14_ddlPhysicianResult")
	WebElement drpNeurologicalMentalfitness;
	@FindBy(id = "gdvMedicalExamGroup_ctl15_ddlPhysicianResult")
	WebElement drpBreast;
	@FindBy(id = "gdvMedicalExamGroup_ctl16_ddlPhysicianResult")
	WebElement drpEndocrinology;
	@FindBy(id = "gdvMedicalExamGroup_ctl17_ddlPhysicianResult")
	WebElement drpLymphnodes;
	@FindBy(id = "gdvMedicalExamGroup_ctl15_ddlPhysicianResult")
	WebElement drpLymphnodesMY;

	// Physician's Report Tab - Medical Examination - CGG
	@FindBy(id = "gdvMedicalExamGroup_ctl02_chkMedicalExamPerformed")
	WebElement ChkBoxPsychosocialAssessmentScale;
	@FindBy(id = "gdvMedicalExamGroup_ctl03_ddlPhysicianResult")
	WebElement drpEyesAndPupilsCGG;
	@FindBy(id = "gdvMedicalExamGroup_ctl04_ddlPhysicianResult")
	WebElement drpEarNoseThroatCGG;
	@FindBy(id = "gdvMedicalExamGroup_ctl05_ddlPhysicianResult")
	WebElement drpTeethAndMouthCGG;
	@FindBy(id = "gdvMedicalExamGroup_ctl06_ddlPhysicianResult")
	WebElement drpLungsAndChestCGG;
	@FindBy(id = "gdvMedicalExamGroup_ctl07_ddlPhysicianResult")
	WebElement drpCardiovascularCGG;
	@FindBy(id = "gdvMedicalExamGroup_ctl08_ddlPhysicianResult")
	WebElement drpAbdominalCGG;
	@FindBy(id = "gdvMedicalExamGroup_ctl09_ddlPhysicianResult")
	WebElement drpHernialOrificesCGG;
	@FindBy(id = "gdvMedicalExamGroup_ctl10_ddlPhysicianResult")
	WebElement drpAnusAndRectumCGG;
	@FindBy(id = "gdvMedicalExamGroup_ctl11_ddlPhysicianResult")
	WebElement drpGenitoUrinaryCGG;
	@FindBy(id = "gdvMedicalExamGroup_ctl12_ddlPhysicianResult")
	WebElement drpExtremitiesCGG;
	@FindBy(id = "gdvMedicalExamGroup_ctl13_ddlPhysicianResult")
	WebElement drpMusculoskeletalCGG;
	@FindBy(id = "gdvMedicalExamGroup_ctl14_ddlPhysicianResult")
	WebElement drpSkinVaricoseveinsCGG;
	@FindBy(id = "gdvMedicalExamGroup_ctl15_ddlPhysicianResult")
	WebElement drpNeurologicalMentalfitnessCGG;
	@FindBy(id = "gdvMedicalExamGroup_ctl16_ddlPhysicianResult")
	WebElement drpBreastCGG;
	@FindBy(id = "gdvMedicalExamGroup_ctl17_ddlPhysicianResult")
	WebElement drpEndocrinologyCGG;
	@FindBy(id = "gdvMedicalExamGroup_ctl18_ddlPhysicianResult")
	WebElement drpLymphnodesCGG;

	// Physician's Report Tab - Medical Examination - BP
	@FindBy(id = "gdvMedicalExamGroup_ctl07_ddlPhysicianResult")
	WebElement drpHernialOrificesBP;
	@FindBy(id = "gdvMedicalExamGroup_ctl08_ddlPhysicianResult")
	WebElement drpAnusAndRectumBP;
	@FindBy(id = "gdvMedicalExamGroup_ctl09_ddlPhysicianResult")
	WebElement drpGenitoUrinaryBP;
	@FindBy(id = "gdvMedicalExamGroup_ctl10_ddlPhysicianResult")
	WebElement drpExtremitiesBP;
	@FindBy(id = "gdvMedicalExamGroup_ctl11_ddlPhysicianResult")
	WebElement drpMusculoskeletalBP;
	@FindBy(id = "gdvMedicalExamGroup_ctl12_ddlPhysicianResult")
	WebElement drpSkinVaricoseveinsBP;
	@FindBy(id = "gdvMedicalExamGroup_ctl13_ddlPhysicianResult")
	WebElement drpNeurologicalMentalfitnessBP;
	@FindBy(id = "gdvMedicalExamGroup_ctl14_ddlPhysicianResult")
	WebElement drpBreastBP;
	@FindBy(id = "gdvMedicalExamGroup_ctl15_ddlPhysicianResult")
	WebElement drpEndocrinologyBP;
	@FindBy(id = "gdvMedicalExamGroup_ctl16_ddlPhysicianResult")
	WebElement drpBloodDiseaseBP;

	// Physician's Report Tab - Medical Examination - MI
	@FindBy(id = "gdvMedicalExamGroup_ctl07_ddlPhysicianResult")
	WebElement drpAbdominalMI;
	@FindBy(id = "gdvMedicalExamGroup_ctl08_ddlPhysicianResult")
	WebElement drpHernialOrificesMI;
	@FindBy(id = "gdvMedicalExamGroup_ctl09_ddlPhysicianResult")
	WebElement drpAnusAndRectumMI;
	@FindBy(id = "gdvMedicalExamGroup_ctl10_ddlPhysicianResult")
	WebElement drpGenitoUrinaryMI;
	@FindBy(id = "gdvMedicalExamGroup_ctl11_ddlPhysicianResult")
	WebElement drpExtremitiesMI;
	@FindBy(id = "gdvMedicalExamGroup_ctl12_ddlPhysicianResult")
	WebElement drpMusculoskeletalMI;
	@FindBy(id = "gdvMedicalExamGroup_ctl13_ddlPhysicianResult")
	WebElement drpSkinVaricoseveinsMI;
	@FindBy(id = "gdvMedicalExamGroup_ctl14_ddlPhysicianResult")
	WebElement drpNeurologicalMentalfitnessMI;
	@FindBy(id = "gdvMedicalExamGroup_ctl15_ddlPhysicianResult")
	WebElement drpBreastMI;
	@FindBy(id = "gdvMedicalExamGroup_ctl16_ddlPhysicianResult")
	WebElement drpEndocrinologyMI;
	@FindBy(id = "gdvMedicalExamGroup_ctl17_ddlPhysicianResult")
	WebElement drpLymphnodesMI;

	// Physician's Report Tab - Other Information
	@FindBy(id = "gdvOtherInformation_ctl02_chkPerformed")
	WebElement checkBoxHeight;
	@FindBy(id = "gdvOtherInformation_ctl03_chkPerformed")
	WebElement checkBoxWeight;
	@FindBy(id = "gdvOtherInformation_ctl04_chkPerformed")
	WebElement checkBoxBloodPressureSYS;
	@FindBy(id = "gdvOtherInformation_ctl05_chkPerformed")
	WebElement checkBoxBloodPressureDIA;
	@FindBy(id = "gdvOtherInformation_ctl06_chkPerformed")
	WebElement checkBoxPulse;

	// Physician's Report Tab - Vision
	@FindBy(id = "gdvVisionAndHearing_ctl02_ddlPhysicianResult")
	WebElement drpHearingRight;
	@FindBy(id = "gdvVisionAndHearing_ctl03_ddlPhysicianResult")
	WebElement drpHearingLeft;
	@FindBy(id = "gdvVisionAndHearing_ctl04_ddlPhysicianResult")
	WebElement drpDistantVisionRight;
	@FindBy(id = "gdvVisionAndHearing_ctl05_ddlPhysicianResult")
	WebElement drpDistantVisionLeft;
	@FindBy(id = "gdvVisionAndHearing_ctl06_ddlPhysicianResult")
	WebElement drpNearVisionRight;
	@FindBy(id = "gdvVisionAndHearing_ctl07_ddlPhysicianResult")
	WebElement drpNearVisionLeft;
	@FindBy(id = "gdvVisionAndHearing_ctl08_ddlPhysicianResult")
	WebElement drpTestedWithGlasses;
	@FindBy(id = "gdvVisionAndHearing_ctl09_ddlPhysicianResult")
	WebElement drpColorVision;
	@FindBy(id = "gdvVisionAndHearing_ctl10_ddlPhysicianResult")
	WebElement drpAudiogram;

	// Physician's Report Tab - Vision - KN
	@FindBy(id = "gdvVisionAndHearing_ctl02_ddlPhysicianResult")
	WebElement drpVisualFieldKN;
	@FindBy(id = "gdvVisionAndHearing_ctl03_ddlPhysicianResult")
	WebElement drpHearingRightKN;
	@FindBy(id = "gdvVisionAndHearing_ctl04_ddlPhysicianResult")
	WebElement drpHearingLeftKN;
	@FindBy(id = "gdvVisionAndHearing_ctl05_ddlPhysicianResult")
	WebElement drpDistantVisionRightKN;
	@FindBy(id = "gdvVisionAndHearing_ctl06_ddlPhysicianResult")
	WebElement drpDistantVisionLeftKN;
	@FindBy(id = "gdvVisionAndHearing_ctl07_ddlPhysicianResult")
	WebElement drpNearVisionRightKN;
	@FindBy(id = "gdvVisionAndHearing_ctl08_ddlPhysicianResult")
	WebElement drpNearVisionLeftKN;
	@FindBy(id = "gdvVisionAndHearing_ctl09_ddlPhysicianResult")
	WebElement drpTestedWithGlassesKN;
	@FindBy(id = "gdvVisionAndHearing_ctl10_ddlPhysicianResult")
	WebElement drpColorVisionKN;
	@FindBy(id = "gdvVisionAndHearing_ctl11_ddlPhysicianResult")
	WebElement drpAudiogramKN;

	// Physician's Report Tab - Vision - AL RHT
	@FindBy(id = "gdvVisionAndHearing_ctl10_ddlPhysicianResult")
	WebElement drpAudiogramAL_RHT;
	
	// Physician's Report Tab - Vision - BP
	@FindBy(id = "gdvVisionAndHearing_ctl10_ddlPhysicianResult")
	WebElement drpColorVisionBP;

	// Physician's Report Tab - Vision - MI
	@FindBy(id = "gdvVisionAndHearing_ctl10_ddlPhysicianResult")
	WebElement drpAudiogramMI;

	// Physician's Report Tab - Vision - ET
	@FindBy(id = "gdvVisionAndHearing_ctl10_ddlPhysicianResult")
	WebElement drpAudiogramET;

	// Lab Analysis Tab - Para Clinical Examination
	@FindBy(id = "gdvParaClinicalExamination_ctl02_ddlLabAnalysisResult")
	WebElement drpECG;
	@FindBy(id = "gdvParaClinicalExamination_ctl03_ddlLabAnalysisResult")
	WebElement drpStressTest;
	@FindBy(id = "gdvParaClinicalExamination_ctl04_ddlLabAnalysisResult")
	WebElement drpChestXRay;
	@FindBy(id = "gdvParaClinicalExamination_ctl05_ddlLabAnalysisResult")
	WebElement drpFunctionalRespiratoryTesting;
	@FindBy(id = "gdvParaClinicalExamination_ctl06_ddlLabAnalysisResult")
	WebElement drpAbdominalPelvicEchography;
	@FindBy(id = "gdvParaClinicalExamination_ctl07_ddlLabAnalysisResult")
	WebElement drpCarotidEchoDoppler;
	@FindBy(id = "gdvParaClinicalExamination_ctl08_ddlLabAnalysisResult")
	WebElement drpCardiacEchography;
	@FindBy(id = "gdvParaClinicalExamination_ctl09_ddlLabAnalysisResult")
	WebElement drpMammogram;
	@FindBy(id = "gdvParaClinicalExamination_ctl10_ddlLabAnalysisResult")
	WebElement drpPAPSmear;

	// Lab Analysis Tab - Para Clinical Examination - BP
	@FindBy(id = "gdvParaClinicalExamination_ctl03_ddlLabAnalysisResult")
	WebElement drpECGBP;
	@FindBy(id = "gdvParaClinicalExamination_ctl04_ddlLabAnalysisResult")
	WebElement drpRestingECGBP;
	@FindBy(id = "gdvParaClinicalExamination_ctl05_ddlLabAnalysisResult")
	WebElement drpStressTestyBP;
	@FindBy(id = "gdvParaClinicalExamination_ctl06_ddlLabAnalysisResult")
	WebElement drpChestXRayBP;

	// MI, MY Company
	@FindBy(id = "gdvParaClinicalExamination_ctl03_ddlLabAnalysisResult")
	WebElement drpFunctionalRespiratoryTestingMIAL;
	
	@FindBy(id = "gdvParaClinicalExamination_ctl04_ddlLabAnalysisResult")
	WebElement drpFunctionalRespiratoryTestingMY;

	// Lab Analysis Tab - Para Clinical Examination - KN
	@FindBy(id = "gdvParaClinicalExamination_ctl03_ddlLabAnalysisResult")
	WebElement drpTreadmillKN;

	// Lab Analysis Tab - Para Clinical Examination - RT
	@FindBy(id = "gdvParaClinicalExamination_ctl02_ddlLabAnalysisResult")
	WebElement drpBoneDensitometry;
	@FindBy(id = "gdvParaClinicalExamination_ctl03_ddlLabAnalysisResult")
	WebElement drpUltrasoundThyroid;
	@FindBy(id = "gdvParaClinicalExamination_ctl04_ddlLabAnalysisResult")
	WebElement drpECGRT;
	@FindBy(id = "gdvParaClinicalExamination_ctl05_ddlLabAnalysisResult")
	WebElement drpTreadmill;
	@FindBy(id = "gdvParaClinicalExamination_ctl06_ddlLabAnalysisResult")
	WebElement drpChestXRayRT;
	@FindBy(id = "gdvParaClinicalExamination_ctl07_ddlLabAnalysisResult")
	WebElement drpFunctionalRespiratoryTestingRT;
	@FindBy(id = "gdvParaClinicalExamination_ctl08_ddlLabAnalysisResult")
	WebElement drpAbdominalPelvicEchographyRT;
	@FindBy(id = "gdvParaClinicalExamination_ctl09_ddlLabAnalysisResult")
	WebElement drpCarotidEchoDopplerRT;
	@FindBy(id = "gdvParaClinicalExamination_ctl10_ddlLabAnalysisResult")
	WebElement drpCardiacEchographyRT;
	@FindBy(id = "gdvParaClinicalExamination_ctl11_ddlLabAnalysisResult")
	WebElement drpMammographyRT;
	@FindBy(id = "gdvParaClinicalExamination_ctl12_ddlLabAnalysisResult")
	WebElement drpPAPSmearRT;

	// Lab Analysis Tab - Para Clinical Examination - MAIN BY
	@FindBy(id = "gdvParaClinicalExamination_ctl02_ddlLabAnalysisResult")
	WebElement drpECGMY;
	@FindBy(id = "gdvParaClinicalExamination_ctl03_ddlLabAnalysisResult")
	WebElement drpChestXRayMY;

	// Lab Analysis Tab - Para Clinical Examination - NOVARTIS
	@FindBy(id = "gdvParaClinicalExamination_ctl04_ddlLabAnalysisResult")
	WebElement drpPAPSmearNOV;

	// Lab Analysis - Blood Analysis
	@FindBy(id = "gdvBloodAnalysis_ctl02_chkBloodAnalysisPerformed")
	WebElement checkBoxRBC;
	@FindBy(id = "gdvBloodAnalysis_ctl03_chkBloodAnalysisPerformed")
	WebElement checkBoxWBC;
	@FindBy(id = "gdvBloodAnalysis_ctl04_chkBloodAnalysisPerformed")
	WebElement checkBoxNEUTRO;
	@FindBy(id = "gdvBloodAnalysis_ctl05_chkBloodAnalysisPerformed")
	WebElement checkBoxEOSINO;
	@FindBy(id = "gdvBloodAnalysis_ctl06_chkBloodAnalysisPerformed")
	WebElement checkBoxBASO;
	@FindBy(id = "gdvBloodAnalysis_ctl07_chkBloodAnalysisPerformed")
	WebElement checkBoxLYMPHO;
	@FindBy(id = "gdvBloodAnalysis_ctl08_chkBloodAnalysisPerformed")
	WebElement checkBoxMONO;
	@FindBy(id = "gdvBloodAnalysis_ctl09_chkBloodAnalysisPerformed")
	WebElement checkBoxHEMATOCRIT;
	@FindBy(id = "gdvBloodAnalysis_ctl10_chkBloodAnalysisPerformed")
	WebElement checkBoxHEMOGLOBIN;
	@FindBy(id = "gdvBloodAnalysis_ctl11_chkBloodAnalysisPerformed")
	WebElement checkBoxESR;
	@FindBy(id = "gdvBloodAnalysis_ctl12_chkBloodAnalysisPerformed")
	WebElement checkBoxSGOTASAT;
	@FindBy(id = "gdvBloodAnalysis_ctl13_chkBloodAnalysisPerformed")
	WebElement checkBoxSGPTALAT;
	@FindBy(id = "gdvBloodAnalysis_ctl14_chkBloodAnalysisPerformed")
	WebElement checkBoxGAMMAGT;
	@FindBy(id = "gdvBloodAnalysis_ctl15_chkBloodAnalysisPerformed")
	WebElement checkBoxGLYCEMIA;
	@FindBy(id = "gdvBloodAnalysis_ctl16_chkBloodAnalysisPerformed")
	WebElement checkBoxCHOLESTEROL;
	@FindBy(id = "gdvBloodAnalysis_ctl17_chkBloodAnalysisPerformed")
	WebElement checkBoxHDL;
	@FindBy(id = "gdvBloodAnalysis_ctl18_chkBloodAnalysisPerformed")
	WebElement checkBoxLDL;
	@FindBy(id = "gdvBloodAnalysis_ctl19_chkBloodAnalysisPerformed")
	WebElement checkBoxCREATININE;
	@FindBy(id = "gdvBloodAnalysis_ctl20_chkBloodAnalysisPerformed")
	WebElement checkBoxURICACID;
	@FindBy(id = "gdvBloodAnalysis_ctl21_chkBloodAnalysisPerformed")
	WebElement checkBoxTRIGLYCERIDES;

	// Lab Analysis - Blood Analysis - BP
	@FindBy(id = "gdvBloodAnalysis_ctl11_chkBloodAnalysisPerformed")
	WebElement checkBoxSGOTASATBP;
	@FindBy(id = "gdvBloodAnalysis_ctl12_chkBloodAnalysisPerformed")
	WebElement checkBoxSGPTALATBP;
	@FindBy(id = "gdvBloodAnalysis_ctl13_chkBloodAnalysisPerformed")
	WebElement checkBoxGAMMAGTBP;
	@FindBy(id = "gdvBloodAnalysis_ctl14_chkBloodAnalysisPerformed")
	WebElement checkBoxGLYCEMIABP;
	@FindBy(id = "gdvBloodAnalysis_ctl15_chkBloodAnalysisPerformed")
	WebElement checkBoxCHOLESTEROLBP;
	@FindBy(id = "gdvBloodAnalysis_ctl16_chkBloodAnalysisPerformed")
	WebElement checkBoxHDLBP;
	@FindBy(id = "gdvBloodAnalysis_ctl17_chkBloodAnalysisPerformed")
	WebElement checkBoxLDLBP;
	@FindBy(id = "gdvBloodAnalysis_ctl18_chkBloodAnalysisPerformed")
	WebElement checkBoxCREATININEBP;
	@FindBy(id = "gdvBloodAnalysis_ctl19_chkBloodAnalysisPerformed")
	WebElement checkBoxURICACIDBP;
	@FindBy(id = "gdvBloodAnalysis_ctl20_chkBloodAnalysisPerformed")
	WebElement checkBoxTRIGLYCERIDESBP;

	// Lab Analysis - Blood Analysis - RT
	@FindBy(id = "gdvBloodAnalysis_ctl02_chkBloodAnalysisPerformed")
	WebElement checkBoxFerritinRT;
	@FindBy(id = "gdvBloodAnalysis_ctl03_chkBloodAnalysisPerformed")
	WebElement checkBoxRBCRTKN;
	@FindBy(id = "gdvBloodAnalysis_ctl04_chkBloodAnalysisPerformed")
	WebElement checkBoxWBCRTKN;
	@FindBy(id = "gdvBloodAnalysis_ctl05_chkBloodAnalysisPerformed")
	WebElement checkBoxNEUTRORTKN;
	@FindBy(id = "gdvBloodAnalysis_ctl06_chkBloodAnalysisPerformed")
	WebElement checkBoxEOSINORTKN;
	@FindBy(id = "gdvBloodAnalysis_ctl07_chkBloodAnalysisPerformed")
	WebElement checkBoxBASORTKN;
	@FindBy(id = "gdvBloodAnalysis_ctl08_chkBloodAnalysisPerformed")
	WebElement checkBoxLYMPHORTKN;
	@FindBy(id = "gdvBloodAnalysis_ctl09_chkBloodAnalysisPerformed")
	WebElement checkBoxMONORTKN;
	@FindBy(id = "gdvBloodAnalysis_ctl10_chkBloodAnalysisPerformed")
	WebElement checkBoxHEMATOCRITRTKN;
	@FindBy(id = "gdvBloodAnalysis_ctl11_chkBloodAnalysisPerformed")
	WebElement checkBoxHEMOGLOBINRTKN;
	@FindBy(id = "gdvBloodAnalysis_ctl12_chkBloodAnalysisPerformed")
	WebElement checkBoxESRRTKN;
	@FindBy(id = "gdvBloodAnalysis_ctl13_chkBloodAnalysisPerformed")
	WebElement checkBoxSGOTASATRTKN;
	@FindBy(id = "gdvBloodAnalysis_ctl14_chkBloodAnalysisPerformed")
	WebElement checkBoxSGPTALATRTKN;
	@FindBy(id = "gdvBloodAnalysis_ctl15_chkBloodAnalysisPerformed")
	WebElement checkBoxGAMMAGTRTKN;
	@FindBy(id = "gdvBloodAnalysis_ctl16_chkBloodAnalysisPerformed")
	WebElement checkBoxGLYCEMIARTKN;
	@FindBy(id = "gdvBloodAnalysis_ctl17_chkBloodAnalysisPerformed")
	WebElement checkBoxCHOLESTEROLRTKN;
	@FindBy(id = "gdvBloodAnalysis_ctl18_chkBloodAnalysisPerformed")
	WebElement checkBoxHDLRTKN;
	@FindBy(id = "gdvBloodAnalysis_ctl19_chkBloodAnalysisPerformed")
	WebElement checkBoxLDLRTKN;
	@FindBy(id = "gdvBloodAnalysis_ctl20_chkBloodAnalysisPerformed")
	WebElement checkBoxCREATININERTKN;
	@FindBy(id = "gdvBloodAnalysis_ctl21_chkBloodAnalysisPerformed")
	WebElement checkBoxURICACIDRTKN;
	@FindBy(id = "gdvBloodAnalysis_ctl22_chkBloodAnalysisPerformed")
	WebElement checkBoxTRIGLYCERIDESRTKN;

	// Lab Analysis - Blood Analysis - MAINBY SA
	@FindBy(id = "gdvBloodAnalysis_ctl11_chkBloodAnalysisPerformed")
	WebElement checkBoxESRMY;
	@FindBy(id = "gdvBloodAnalysis_ctl12_chkBloodAnalysisPerformed")
	WebElement checkBoxGLYCEMIAMY;
	@FindBy(id = "gdvBloodAnalysis_ctl13_chkBloodAnalysisPerformed")
	WebElement checkBoxCHOLESTEROLMY;
	@FindBy(id = "gdvBloodAnalysis_ctl14_chkBloodAnalysisPerformed")
	WebElement checkBoxHDLMY;
	@FindBy(id = "gdvBloodAnalysis_ctl15_chkBloodAnalysisPerformed")
	WebElement checkBoxLDLMY;
	@FindBy(id = "gdvBloodAnalysis_ctl16_chkBloodAnalysisPerformed")
	WebElement checkBoxCREATININEMY;
	@FindBy(id = "gdvBloodAnalysis_ctl17_chkBloodAnalysisPerformed")
	WebElement checkBoxURICACIDMY;
	@FindBy(id = "gdvBloodAnalysis_ctl18_chkBloodAnalysisPerformed")
	WebElement checkBoxTRIGLYCERIDESMY;

	// Lab Analysis - Blood Analysis - ET
	@FindBy(id = "gdvParaClinicalExamination_ctl03_ddlLabAnalysisResult")
	WebElement drpECGET;
	@FindBy(id = "gdvParaClinicalExamination_ctl04_ddlLabAnalysisResult")
	WebElement drpFunctionalRespiratoryTestingET;

	// Lab Analysis - Blood Analysis - KN
	@FindBy(id = "gdvBloodAnalysis_ctl02_chkBloodAnalysisPerformed")
	WebElement checkBoxBloodHbA1cKN;

	// Lab Analysis - Blood Analysis - NOVARTIS
	@FindBy(id = "gdvBloodAnalysis_ctl02_chkBloodAnalysisPerformed")
	WebElement checkBoxFerritin;

	// Lab Analysis - Additional Blood Test - KN
	@FindBy(id = "gdvAdditionalBloodTest_ctl02_chkAdditionalBloodTestPerformed")
	WebElement checkBoxVitaminD2;
	@FindBy(id = "gdvAdditionalBloodTest_ctl03_chkAdditionalBloodTestPerformed")
	WebElement checkBoxHbA1cKN;
	@FindBy(id = "gdvAdditionalBloodTest_ctl04_chkAdditionalBloodTestPerformed")
	WebElement checkBoxElectrolytesSodium;
	@FindBy(id = "gdvAdditionalBloodTest_ctl05_chkAdditionalBloodTestPerformed")
	WebElement checkBoxElectrolytesCalcium;
	@FindBy(id = "gdvAdditionalBloodTest_ctl06_chkAdditionalBloodTestPerformed")
	WebElement checkBoxElectrolytesPotassium;
	@FindBy(id = "gdvAdditionalBloodTest_ctl07_ddlLabAnalysisResult")
	WebElement drpQuantiferonGoldTBTestKN;
	@FindBy(id = "gdvAdditionalBloodTest_ctl08_chkAdditionalBloodTestPerformed")
	WebElement checkBoxTSHKN;
	@FindBy(id = "gdvAdditionalBloodTest_ctl09_chkAdditionalBloodTestPerformed")
	WebElement checkBoxAlkalinePhosphataseKN;

	// Lab Analysis - Eyes
	@FindBy(id = "gdvEyesExam_ctl02_chkEyesExamPerformed")
	WebElement checkBoxTonometryRightEye;
	@FindBy(id = "gdvEyesExam_ctl03_chkEyesExamPerformed")
	WebElement checkBoxTonometryLeftEye;

	// Lab Analysis - Additional Blood Test
	@FindBy(id = "gdvAdditionalBloodTest_ctl03_chkAdditionalBloodTestPerformed")
	WebElement checkBoxCEA;
	@FindBy(id = "gdvAdditionalBloodTest_ctl04_chkAdditionalBloodTestPerformed")
	WebElement checkBoxTSH;
	@FindBy(id = "gdvAdditionalBloodTest_ctl05_chkAdditionalBloodTestPerformed")
	WebElement checkBoxAlkalinePhosphatase;

	// Lab Analysis - Additional Blood Test - Michilen
	@FindBy(id = "gdvBloodAnalysis_ctl11_chkBloodAnalysisPerformed")
	WebElement checkBoxESRMI;
	@FindBy(id = "gdvAdditionalBloodTest_ctl02_chkAdditionalBloodTestPerformed")
	WebElement checkBoxAlkalinePhosphataseMI;

	// Lab Analysis - Additional Blood Test - AL
	@FindBy(id = "gdvAdditionalBloodTest_ctl02_chkAdditionalBloodTestPerformed")
	WebElement checkBoxHbA1cMY;
	@FindBy(id = "gdvAdditionalBloodTest_ctl03_ddlLabAnalysisResult")
	WebElement drpQuantiferonGoldTBTest;
	@FindBy(id = "gdvAdditionalBloodTest_ctl03_chkAdditionalBloodTestPerformed")
	WebElement checkBoxHbA1cAL;
	@FindBy(id = "gdvAdditionalBloodTest_ctl07_chkAdditionalBloodTestPerformed")
	WebElement checkBoxTSHAL;
	@FindBy(id = "gdvAdditionalBloodTest_ctl08_chkAdditionalBloodTestPerformed")
	WebElement checkBoxAlkalinePhosphataseAL;

	// Lab Analysis - Additional Blood Test - BP USA
	@FindBy(id = "gdvParaClinicalExamination_ctl03_ddlLabAnalysisResult")
	WebElement drpChestXRayBPUSA;
	@FindBy(id = "gdvAdditionalBloodTest_ctl03_ddlLabAnalysisResult")
	WebElement drpQuantiferonGoldTBTestBP;
	@FindBy(id = "gdvAdditionalBloodTest_ctl02_chkAdditionalBloodTestPerformed")
	WebElement checkBoxUREABP;
	@FindBy(id = "gdvAdditionalBloodTest_ctl04_chkAdditionalBloodTestPerformed")
	WebElement checkBoxPSABP;
	@FindBy(id = "gdvAdditionalBloodTest_ctl05_chkAdditionalBloodTestPerformed")
	WebElement checkBoxCEABP;
	@FindBy(id = "gdvAdditionalBloodTest_ctl06_chkAdditionalBloodTestPerformed")
	WebElement checkBoxTSHBP;

	// Lab Analysis - Additional Blood Test - MAINBY
	@FindBy(id = "gdvAdditionalBloodTest_ctl02_chkAdditionalBloodTestPerformed")
	WebElement checkBoxPSA;
	@FindBy(id = "gdvAdditionalBloodTest_ctl03_chkAdditionalBloodTestPerformed")
	WebElement checkBoxPlateletCount;
	@FindBy(id = "gdvAdditionalBloodTest_ctl04_chkAdditionalBloodTestPerformed")
	WebElement checkBoxAlkalinePhosphataseMY;

	// Lab Analysis - Additional Blood Test - Richmont
	@FindBy(id = "gdvAdditionalBloodTest_ctl02_chkAdditionalBloodTestPerformed")
	WebElement checkBoxHbA1c;
	@FindBy(id = "gdvAdditionalBloodTest_ctl03_chkAdditionalBloodTestPerformed")
	WebElement checkBoxAlkalinePhosphataseRT;

	// Lab Analysis - Urine Analysis
	@FindBy(id = "gdvUrineAnalysis_ctl02_ddlLabAnalysisResult")
	WebElement drpAlbumin;
	@FindBy(id = "gdvUrineAnalysis_ctl03_ddlLabAnalysisResult")
	WebElement drpSugar;
	@FindBy(id = "gdvUrineAnalysis_ctl04_ddlLabAnalysisResult")
	WebElement drpBloodForUrine;
	@FindBy(id = "gdvUrineAnalysis_ctl05_ddlLabAnalysisResult")
	WebElement drpNitrates;
	@FindBy(id = "gdvUrineAnalysis_ctl06_ddlLabAnalysisResult")
	WebElement drpLeukocytes;
	@FindBy(id = "gdvUrineAnalysis_ctl07_ddlLabAnalysisResult")
	WebElement drpKetones;
	@FindBy(id = "gdvStoolAnalysis_ctl02_ddlLabAnalysisResult")
	WebElement drpParasitesMY;
	@FindBy(id = "gdvStoolAnalysis_ctl03_ddlLabAnalysisResult")
	WebElement drpBloodForStoolMY;

	// Lab Analysis - Urine Analysis - BioMerieux
	@FindBy(id = "gdvUrineAnalysis_ctl02_ddlLabAnalysisResult")
	WebElement drpUrinePCRChlamydiaGonorrheaBM;
	@FindBy(id = "gdvUrineAnalysis_ctl03_ddlLabAnalysisResult")
	WebElement drpAlbuminBM;
	@FindBy(id = "gdvUrineAnalysis_ctl04_ddlLabAnalysisResult")
	WebElement drpSugarBM;
	@FindBy(id = "gdvUrineAnalysis_ctl05_ddlLabAnalysisResult")
	WebElement drpBloodForUrineBM;
	@FindBy(id = "gdvUrineAnalysis_ctl06_ddlLabAnalysisResult")
	WebElement drpNitratesBM;
	@FindBy(id = "gdvUrineAnalysis_ctl07_ddlLabAnalysisResult")
	WebElement drpLeukocytesBM;
	@FindBy(id = "gdvUrineAnalysis_ctl08_ddlLabAnalysisResult")
	WebElement drpKetonesBM;

	// Lab Analysis - Stool Analysis
	@FindBy(id = "gdvStoolAnalysis_ctl02_ddlLabAnalysisResult")
	WebElement drpParasiteForStool;
	@FindBy(id = "gdvStoolAnalysis_ctl03_ddlLabAnalysisResult")
	WebElement drpBloodForStool;

	@FindBy(id = "gdvStoolAnalysis_ctl02_ddlLabAnalysisResult")
	WebElement drpBloodForStoolMIAL;

	// Fitness Conclusion
	@FindBy(id = "ddlProviderFitnessStatus")
	WebElement dropFitnessStatus;
	@FindBy(id = "txtProviderComment")
	WebElement physicianComments;

	// Intl. SOS Review
	@FindBy(id = "ddlTypeofCase")
	WebElement dropTypeofCase;
	@FindBy(id = "lstISOSReviewerStatus_0")
	WebElement checkBoxFitnessStatusIntlSOS;
	@FindBy(id = "txtISOSReviewerComment")
	WebElement CommentsforEmployee;

	@FindBy(id = "btnSubmit")
	WebElement submitButton;

	@FindBy(linkText = "You can create a medical exam.")
	WebElement medicalExamCreationLink;

	public void clickCreateExam() {
		WaitUtils.sleep(3);
		createExamButton.click();
	}

	public void clickYouCanCreateMedicalExam() throws InterruptedException {
		JavaScriptUtils.scrollUp(driver, medicalExamCreationLink);
		medicalExamCreationLink.click();
	}

	public void clickRadioButtonIAuth() {
		authRadioButton.click();
	}

	public void selectReasonForMedical(String medicalReason) throws InterruptedException {
		JavaScriptUtils.moveToElement(driver, drpReasonMedical);
		Select selectReasonForMedical = new Select(drpReasonMedical);
		selectReasonForMedical.selectByIndex(1);
		//selectReasonForMedical.selectByVisibleText(medicalReason);
	}

	public void enterdateofExam(String DOE) {
		DOExam.sendKeys(DOE);
	}

	public void selectMedicalCenter(String medicalCenter) {
		Select selectMedicalCenter = new Select(drpMedicalCenter);
		selectMedicalCenter.selectByIndex(1);
		// selectMedicalCenter.selectByVisibleText(medicalCenter);
	}

	public void submitCreateExam() throws InterruptedException {
		JavaScriptUtils.moveToElement(driver, submitForCreateExam);
		submitForCreateExam.click();
	}

	public void clickPhysicianReportTab() throws InterruptedException {
		WaitUtils.waitForPageLoad(driver);
		physicianReportTab.click();
		WaitUtils.sleep(5);
		JavaScriptUtils.scrollDown(driver);
	}

	// Switching to the frame - Physician Report Tab //
	// ****************************************************************************
	public void selectAllDropdownAndChkBoxesPhysicianReportTab() {

		String companyName = driver
				.findElement(By.xpath("//div[@class='MedicalNormalText']//table/tbody/tr/td[2]/table/tbody/tr/td[2]"))
				.getText();
		driver.switchTo().frame(0);
		if (companyName.equalsIgnoreCase("Schlumberger")) {
			// Medical Examination

			Select selectEyesAndPupils = new Select(drpEyesAndPupils);
			selectEyesAndPupils.selectByVisibleText("Not Performed");

			Select selectNoseThroat = new Select(drpEarNoseThroat);
			selectNoseThroat.selectByVisibleText("Not Performed");

			Select selectTeethAndMouth = new Select(drpTeethAndMouth);
			selectTeethAndMouth.selectByVisibleText("Not Performed");

			Select selectLungsAndChest = new Select(drpLungsAndChest);
			selectLungsAndChest.selectByVisibleText("Not Performed");

			Select selectCardiovascular = new Select(drpCardiovascular);
			selectCardiovascular.selectByVisibleText("Not Performed");

			Select selectAbdoViscera = new Select(drpAbdoViscera);
			selectAbdoViscera.selectByVisibleText("Not Performed");

			Select selectHernialOrifices = new Select(drpHernialOrifices);
			selectHernialOrifices.selectByVisibleText("Not Performed");

			Select selectAnusAndRectum = new Select(drpAnusAndRectum);
			selectAnusAndRectum.selectByVisibleText("Not Performed");

			Select selectGenitoUrinary = new Select(drpGenitoUrinary);
			selectGenitoUrinary.selectByVisibleText("Not Performed");

			Select selectExtremities = new Select(drpExtremities);
			selectExtremities.selectByVisibleText("Not Performed");

			Select selectMusculoSkeletal = new Select(drpMusculoskeletal);
			selectMusculoSkeletal.selectByVisibleText("Not Performed");

			Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveins);
			selectSkinVaricoseVeins.selectByVisibleText("Not Performed");

			Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitness);
			selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");

			Select selectBreast = new Select(drpBreast);
			selectBreast.selectByVisibleText("Not Performed");

			Select selectEndocrinology = new Select(drpEndocrinology);
			selectEndocrinology.selectByVisibleText("Not Performed");

			Select selectLymphNodes = new Select(drpLymphnodes);
			selectLymphNodes.selectByVisibleText("Not Performed");

			// Physician's Report Tab - Other Information
			checkBoxHeight.click();

			checkBoxWeight.click();
			checkBoxBloodPressureSYS.click();
			checkBoxBloodPressureDIA.click();
			checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			Select hearingRight = new Select(drpHearingRight);
			hearingRight.selectByVisibleText("Not Performed");

			Select hearingLeft = new Select(drpHearingLeft);
			hearingLeft.selectByVisibleText("Not Performed");

			Select VisionRight = new Select(drpDistantVisionRight);
			VisionRight.selectByVisibleText("Not Performed");

			Select DistantvisionLeft = new Select(drpDistantVisionLeft);
			DistantvisionLeft.selectByVisibleText("Not Performed");

			Select visionRight = new Select(drpNearVisionRight);
			visionRight.selectByVisibleText("Not Performed");

			Select NearvisionLeft = new Select(drpNearVisionLeft);
			NearvisionLeft.selectByVisibleText("Not Performed");

			Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
			selectTestedWithGlasses.selectByVisibleText("Not Performed");

			Select selectColoVision = new Select(drpColorVision);
			selectColoVision.selectByVisibleText("Not Performed");

			Select selectAudiogram = new Select(drpAudiogram);
			selectAudiogram.selectByVisibleText("Not Performed");

		} else if (companyName.equalsIgnoreCase("bp International Limited")) {
			// Medical Examination
			Select selectEyesAndPupils = new Select(drpEyesAndPupils);
			selectEyesAndPupils.selectByVisibleText("Not Performed");

			Select selectNoseThroat = new Select(drpEarNoseThroat);
			selectNoseThroat.selectByVisibleText("Not Performed");

			Select selectTeethAndMouth = new Select(drpTeethAndMouth);
			selectTeethAndMouth.selectByVisibleText("Not Performed");

			Select selectLungsAndChest = new Select(drpLungsAndChest);
			selectLungsAndChest.selectByVisibleText("Not Performed");

			Select selectCardiovascular = new Select(drpCardiovascular);
			selectCardiovascular.selectByVisibleText("Not Performed");

			Select selectHernialOrifices = new Select(drpHernialOrificesBP);
			selectHernialOrifices.selectByVisibleText("Not Performed");

			Select selectAnusAndRectum = new Select(drpAnusAndRectumBP);
			selectAnusAndRectum.selectByVisibleText("Not Performed");

			Select selectGenitoUrinary = new Select(drpGenitoUrinaryBP);
			selectGenitoUrinary.selectByVisibleText("Not Performed");

			Select selectExtremities = new Select(drpExtremitiesBP);
			selectExtremities.selectByVisibleText("Not Performed");

			Select selectMusculoSkeletal = new Select(drpMusculoskeletalBP);
			selectMusculoSkeletal.selectByVisibleText("Not Performed");

			Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveinsBP);
			selectSkinVaricoseVeins.selectByVisibleText("Not Performed");

			Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitnessBP);
			selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");

			Select selectBreast = new Select(drpBreastBP);
			selectBreast.selectByVisibleText("Not Performed");

			Select selectEndocrinology = new Select(drpEndocrinologyBP);
			selectEndocrinology.selectByVisibleText("Not Performed");
			
			Select selectBloodDisease = new Select(drpBloodDiseaseBP);
			selectBloodDisease.selectByVisibleText("Not Performed");

	// Vision (with corrective lenses if worn) and Hearing
			Select hearingRight = new Select(drpHearingRight);
			hearingRight.selectByVisibleText("Not Performed");

			Select hearingLeft = new Select(drpHearingLeft);
			hearingLeft.selectByVisibleText("Not Performed");

			Select VisionRight = new Select(drpDistantVisionRight);
			VisionRight.selectByVisibleText("Not Performed");

			Select DistantvisionLeft = new Select(drpDistantVisionLeft);
			DistantvisionLeft.selectByVisibleText("Not Performed");

			Select visionRight = new Select(drpNearVisionRight);
			visionRight.selectByVisibleText("Not Performed");

			Select NearvisionLeft = new Select(drpNearVisionLeft);
			NearvisionLeft.selectByVisibleText("Not Performed");

			Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
			selectTestedWithGlasses.selectByVisibleText("Not Performed");

			Select selectColoVision = new Select(drpColorVision);
			selectColoVision.selectByVisibleText("Not Performed");
			
			Select selectAudiogram = new Select(drpColorVisionBP);
			selectAudiogram.selectByVisibleText("Not Performed");

			// Physician's Report Tab - Other Information
			checkBoxHeight.click();
			checkBoxWeight.click();
			checkBoxBloodPressureSYS.click();
			checkBoxBloodPressureDIA.click();
			checkBoxPulse.click();

		} else if (companyName.equalsIgnoreCase("SBM International Personnel Services SA")) {
			// Nothing to select as UI page is empty

		} else if (companyName.equalsIgnoreCase("Michelin")) {

			// Medical Examination
			Select selectEyesAndPupils = new Select(drpEyesAndPupils);
			selectEyesAndPupils.selectByVisibleText("Not Performed");

			Select selectNoseThroat = new Select(drpEarNoseThroat);
			selectNoseThroat.selectByVisibleText("Not Performed");

			Select selectTeethAndMouth = new Select(drpTeethAndMouth);
			selectTeethAndMouth.selectByVisibleText("Not Performed");

			Select selectLungsAndChest = new Select(drpLungsAndChest);
			selectLungsAndChest.selectByVisibleText("Not Performed");

			Select selectCardiovascular = new Select(drpCardiovascular);
			selectCardiovascular.selectByVisibleText("Not Performed");

			Select selectAbdoViscera = new Select(drpAbdoViscera);
			selectAbdoViscera.selectByVisibleText("Not Performed");

			Select selectHernialOrifices = new Select(drpHernialOrifices);
			selectHernialOrifices.selectByVisibleText("Not Performed");

			Select selectAnusAndRectum = new Select(drpAnusAndRectum);
			selectAnusAndRectum.selectByVisibleText("Not Performed");

			Select selectGenitoUrinary = new Select(drpGenitoUrinary);
			selectGenitoUrinary.selectByVisibleText("Not Performed");

			Select selectExtremities = new Select(drpExtremities);
			selectExtremities.selectByVisibleText("Not Performed");

			Select selectMusculoSkeletal = new Select(drpMusculoskeletal);
			selectMusculoSkeletal.selectByVisibleText("Not Performed");

			Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveins);
			selectSkinVaricoseVeins.selectByVisibleText("Not Performed");

			Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitness);
			selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");

			Select selectBreast = new Select(drpBreast);
			selectBreast.selectByVisibleText("Not Performed");

			Select selectEndocrinology = new Select(drpEndocrinology);
			selectEndocrinology.selectByVisibleText("Not Performed");

			Select selectLymphNodes = new Select(drpLymphnodes);
			selectLymphNodes.selectByVisibleText("Not Performed");

			// Physician's Report Tab - Other Information
			checkBoxHeight.click();
			checkBoxWeight.click();
			checkBoxBloodPressureSYS.click();
			checkBoxBloodPressureDIA.click();
			checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			Select hearingRight = new Select(drpHearingRight);
			hearingRight.selectByVisibleText("Not Performed");

			Select hearingLeft = new Select(drpHearingLeft);
			hearingLeft.selectByVisibleText("Not Performed");

			Select VisionRight = new Select(drpDistantVisionRight);
			VisionRight.selectByVisibleText("Not Performed");

			Select DistantvisionLeft = new Select(drpDistantVisionLeft);
			DistantvisionLeft.selectByVisibleText("Not Performed");

			Select visionRight = new Select(drpNearVisionRight);
			visionRight.selectByVisibleText("Not Performed");

			Select NearvisionLeft = new Select(drpNearVisionLeft);
			NearvisionLeft.selectByVisibleText("Not Performed");

			Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
			selectTestedWithGlasses.selectByVisibleText("Not Performed");

			Select selectColoVision = new Select(drpColorVision);
			selectColoVision.selectByVisibleText("Not Performed");

			Select selectAudiogram = new Select(drpAudiogramMI);
			selectAudiogram.selectByVisibleText("Not Performed");

		} else if (companyName.equalsIgnoreCase("Richemont")) {
			// Medical Examination

			Select selectEyesAndPupils = new Select(drpEyesAndPupils);
			selectEyesAndPupils.selectByVisibleText("Not Performed");

			Select selectNoseThroat = new Select(drpEarNoseThroat);
			selectNoseThroat.selectByVisibleText("Not Performed");

			Select selectTeethAndMouth = new Select(drpTeethAndMouth);
			selectTeethAndMouth.selectByVisibleText("Not Performed");

			Select selectLungsAndChest = new Select(drpLungsAndChest);
			selectLungsAndChest.selectByVisibleText("Not Performed");

			Select selectCardiovascular = new Select(drpCardiovascular);
			selectCardiovascular.selectByVisibleText("Not Performed");

			Select selectAbdoViscera = new Select(drpAbdoViscera);
			selectAbdoViscera.selectByVisibleText("Not Performed");

			Select selectHernialOrifices = new Select(drpHernialOrifices);
			selectHernialOrifices.selectByVisibleText("Not Performed");

			Select selectAnusAndRectum = new Select(drpAnusAndRectum);
			selectAnusAndRectum.selectByVisibleText("Not Performed");

			Select selectGenitoUrinary = new Select(drpGenitoUrinary);
			selectGenitoUrinary.selectByVisibleText("Not Performed");

			Select selectExtremities = new Select(drpExtremities);
			selectExtremities.selectByVisibleText("Not Performed");

			Select selectMusculoSkeletal = new Select(drpMusculoskeletal);
			selectMusculoSkeletal.selectByVisibleText("Not Performed");

			Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveins);
			selectSkinVaricoseVeins.selectByVisibleText("Not Performed");

			Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitness);
			selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");

			Select selectBreast = new Select(drpBreast);
			selectBreast.selectByVisibleText("Not Performed");

			Select selectEndocrinology = new Select(drpEndocrinology);
			selectEndocrinology.selectByVisibleText("Not Performed");

			Select selectLymphNodes = new Select(drpLymphnodes);
			selectLymphNodes.selectByVisibleText("Not Performed");

			// Physician's Report Tab - Other Information
			checkBoxHeight.click();
			checkBoxWeight.click();
			checkBoxBloodPressureSYS.click();
			checkBoxBloodPressureDIA.click();
			checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			Select hearingRight = new Select(drpHearingRight);
			hearingRight.selectByVisibleText("Not Performed");

			Select hearingLeft = new Select(drpHearingLeft);
			hearingLeft.selectByVisibleText("Not Performed");

			Select VisionRight = new Select(drpDistantVisionRight);
			VisionRight.selectByVisibleText("Not Performed");

			Select DistantvisionLeft = new Select(drpDistantVisionLeft);
			DistantvisionLeft.selectByVisibleText("Not Performed");

			Select visionRight = new Select(drpNearVisionRight);
			visionRight.selectByVisibleText("Not Performed");

			Select NearvisionLeft = new Select(drpNearVisionLeft);
			NearvisionLeft.selectByVisibleText("Not Performed");

			Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
			selectTestedWithGlasses.selectByVisibleText("Not Performed");

			Select selectColoVision = new Select(drpColorVision);
			selectColoVision.selectByVisibleText("Not Performed");

			Select selectAudiogram = new Select(drpAudiogramAL_RHT);
			selectAudiogram.selectByVisibleText("Not Performed");

		} else if (companyName.equalsIgnoreCase("MAINBY SA")) {
			// Medical Examination

			Select selectEyesAndPupils = new Select(drpEyesAndPupils);
			selectEyesAndPupils.selectByVisibleText("Not Performed");

			Select selectNoseThroat = new Select(drpEarNoseThroat);
			selectNoseThroat.selectByVisibleText("Not Performed");

			Select selectTeethAndMouth = new Select(drpTeethAndMouth);
			selectTeethAndMouth.selectByVisibleText("Not Performed");

			Select selectLungsAndChest = new Select(drpLungsAndChest);
			selectLungsAndChest.selectByVisibleText("Not Performed");

			Select selectCardiovascular = new Select(drpCardiovascular);
			selectCardiovascular.selectByVisibleText("Not Performed");

			Select selectAbdoViscera = new Select(drpAbdoViscera);
			selectAbdoViscera.selectByVisibleText("Not Performed");

			Select selectHernialOrifices = new Select(drpHernialOrifices);
			selectHernialOrifices.selectByVisibleText("Not Performed");

			Select selectAnusAndRectum = new Select(drpAnusAndRectum);
			selectAnusAndRectum.selectByVisibleText("Not Performed");

			Select selectGenitoUrinary = new Select(drpGenitoUrinary);
			selectGenitoUrinary.selectByVisibleText("Not Performed");

			Select selectExtremities = new Select(drpExtremities);
			selectExtremities.selectByVisibleText("Not Performed");

			Select selectMusculoSkeletal = new Select(drpMusculoskeletal);
			selectMusculoSkeletal.selectByVisibleText("Not Performed");

			Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveins);
			selectSkinVaricoseVeins.selectByVisibleText("Not Performed");

			Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitness);
			selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");

			Select selectBreast = new Select(drpBreast);
			selectBreast.selectByVisibleText("Not Performed");

			Select selectEndocrinology = new Select(drpEndocrinology);
			selectEndocrinology.selectByVisibleText("Not Performed");

			Select selectLymphNodes = new Select(drpLymphnodes);
			selectLymphNodes.selectByVisibleText("Not Performed");

			// Physician's Report Tab - Other Information
			checkBoxHeight.click();
			checkBoxWeight.click();
			checkBoxBloodPressureSYS.click();
			checkBoxBloodPressureDIA.click();
			checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			Select hearingRight = new Select(drpHearingRight);
			hearingRight.selectByVisibleText("Not Performed");

			Select hearingLeft = new Select(drpHearingLeft);
			hearingLeft.selectByVisibleText("Not Performed");

			Select VisionRight = new Select(drpDistantVisionRight);
			VisionRight.selectByVisibleText("Not Performed");

			Select DistantvisionLeft = new Select(drpDistantVisionLeft);
			DistantvisionLeft.selectByVisibleText("Not Performed");

			Select visionRight = new Select(drpNearVisionRight);
			visionRight.selectByVisibleText("Not Performed");

			Select NearvisionLeft = new Select(drpNearVisionLeft);
			NearvisionLeft.selectByVisibleText("Not Performed");

			Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
			selectTestedWithGlasses.selectByVisibleText("Not Performed");

			Select selectColoVision = new Select(drpColorVision);
			selectColoVision.selectByVisibleText("Not Performed");

		} else if (companyName.equalsIgnoreCase("Kinross")) {
			// Medical Examination
			Select selectEyesAndPupils = new Select(drpEyesAndPupils);
			selectEyesAndPupils.selectByVisibleText("Not Performed");

			Select selectNoseThroat = new Select(drpEarNoseThroat);
			selectNoseThroat.selectByVisibleText("Not Performed");

			Select selectTeethAndMouth = new Select(drpTeethAndMouth);
			selectTeethAndMouth.selectByVisibleText("Not Performed");

			Select selectLungsAndChest = new Select(drpLungsAndChest);
			selectLungsAndChest.selectByVisibleText("Not Performed");

			Select selectCardiovascular = new Select(drpCardiovascular);
			selectCardiovascular.selectByVisibleText("Not Performed");

			Select selectAbdoViscera = new Select(drpAbdominalMI);
			selectAbdoViscera.selectByVisibleText("Not Performed");

			Select selectHernialOrifices = new Select(drpHernialOrificesMI);
			selectHernialOrifices.selectByVisibleText("Not Performed");

			Select selectAnusAndRectum = new Select(drpAnusAndRectumMI);
			selectAnusAndRectum.selectByVisibleText("Not Performed");

			Select selectGenitoUrinary = new Select(drpGenitoUrinaryMI);
			selectGenitoUrinary.selectByVisibleText("Not Performed");

			Select selectExtremities = new Select(drpExtremitiesMI);
			selectExtremities.selectByVisibleText("Not Performed");

			Select selectMusculoSkeletal = new Select(drpMusculoskeletalMI);
			selectMusculoSkeletal.selectByVisibleText("Not Performed");

			Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveinsMI);
			selectSkinVaricoseVeins.selectByVisibleText("Not Performed");

			Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitnessMI);
			selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");

			Select selectBreast = new Select(drpBreastMI);
			selectBreast.selectByVisibleText("Not Performed");

			Select selectEndocrinology = new Select(drpEndocrinologyMI);
			selectEndocrinology.selectByVisibleText("Not Performed");

			Select selectLymphNodes = new Select(drpLymphnodesMI);
			selectLymphNodes.selectByVisibleText("Not Performed");

			// Physician's Report Tab - Other Information
			checkBoxHeight.click();
			checkBoxWeight.click();
			checkBoxBloodPressureSYS.click();
			checkBoxBloodPressureDIA.click();
			checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			Select Visualfield = new Select(drpVisualFieldKN);
			Visualfield.selectByVisibleText("Not Performed");

			Select hearingRight = new Select(drpHearingRightKN);
			hearingRight.selectByVisibleText("Not Performed");

			Select hearingLeft = new Select(drpHearingLeftKN);
			hearingLeft.selectByVisibleText("Not Performed");

			Select VisionRight = new Select(drpDistantVisionRightKN);
			VisionRight.selectByVisibleText("Not Performed");

			Select DistantvisionLeft = new Select(drpDistantVisionLeftKN);
			DistantvisionLeft.selectByVisibleText("Not Performed");

			Select visionRight = new Select(drpNearVisionRightKN);
			visionRight.selectByVisibleText("Not Performed");

			Select NearvisionLeft = new Select(drpNearVisionLeftKN);
			NearvisionLeft.selectByVisibleText("Not Performed");

			Select selectTestedWithGlasses = new Select(drpTestedWithGlassesKN);
			selectTestedWithGlasses.selectByVisibleText("Not Performed");

			Select selectColoVision = new Select(drpColorVisionKN);
			selectColoVision.selectByVisibleText("Not Performed");

			Select selectAudiogram = new Select(drpAudiogramKN);
			selectAudiogram.selectByVisibleText("Not Performed");

		} else if (companyName.equalsIgnoreCase("Frontex")) {
			// Nothing to do as all fields are empty.

		} else if (companyName.equalsIgnoreCase("Eramet")) {

			// Medical Examination
			Select selectEyesAndPupils = new Select(drpEyesAndPupils);
			selectEyesAndPupils.selectByVisibleText("Not Performed");

			Select selectNoseThroat = new Select(drpEarNoseThroat);
			selectNoseThroat.selectByVisibleText("Not Performed");

			Select selectTeethAndMouth = new Select(drpTeethAndMouth);
			selectTeethAndMouth.selectByVisibleText("Not Performed");

			Select selectLungsAndChest = new Select(drpLungsAndChest);
			selectLungsAndChest.selectByVisibleText("Not Performed");

			Select selectCardiovascular = new Select(drpCardiovascular);
			selectCardiovascular.selectByVisibleText("Not Performed");

			Select selectAbdoViscera = new Select(drpAbdominalMI);
			selectAbdoViscera.selectByVisibleText("Not Performed");

			Select selectHernialOrifices = new Select(drpHernialOrificesMI);
			selectHernialOrifices.selectByVisibleText("Not Performed");

			Select selectAnusAndRectum = new Select(drpAnusAndRectumMI);
			selectAnusAndRectum.selectByVisibleText("Not Performed");

			Select selectGenitoUrinary = new Select(drpGenitoUrinaryMI);
			selectGenitoUrinary.selectByVisibleText("Not Performed");

			Select selectExtremities = new Select(drpExtremitiesMI);
			selectExtremities.selectByVisibleText("Not Performed");

			Select selectMusculoSkeletal = new Select(drpMusculoskeletalMI);
			selectMusculoSkeletal.selectByVisibleText("Not Performed");

			Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveinsMI);
			selectSkinVaricoseVeins.selectByVisibleText("Not Performed");

			Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitnessMI);
			selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");

			Select selectBreast = new Select(drpBreastMI);
			selectBreast.selectByVisibleText("Not Performed");

			Select selectEndocrinology = new Select(drpEndocrinologyMI);
			selectEndocrinology.selectByVisibleText("Not Performed");

			Select selectLymphNodes = new Select(drpLymphnodesMI);
			selectLymphNodes.selectByVisibleText("Not Performed");

			// Physician's Report Tab - Other Information
			checkBoxHeight.click();
			checkBoxWeight.click();
			checkBoxBloodPressureSYS.click();
			checkBoxBloodPressureDIA.click();
			checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			Select hearingRight = new Select(drpHearingRight);
			hearingRight.selectByVisibleText("Not Performed");

			Select hearingLeft = new Select(drpHearingLeft);
			hearingLeft.selectByVisibleText("Not Performed");

			Select VisionRight = new Select(drpDistantVisionRight);
			VisionRight.selectByVisibleText("Not Performed");

			if (!drpDistantVisionLeft.isSelected()) {
				Select DistantvisionLeft = new Select(drpDistantVisionLeft);
				DistantvisionLeft.selectByVisibleText("Not Performed");
			}

			Select visionRight = new Select(drpNearVisionRight);
			visionRight.selectByVisibleText("Not Performed");

			Select NearvisionLeft = new Select(drpNearVisionLeft);
			NearvisionLeft.selectByVisibleText("Not Performed");

			Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
			selectTestedWithGlasses.selectByVisibleText("Not Performed");

			Select selectColoVision = new Select(drpColorVision);
			selectColoVision.selectByVisibleText("Not Performed");

			Select selectAudiogram = new Select(drpAudiogramET);
			selectAudiogram.selectByVisibleText("Not Performed");

		} else if (companyName.equalsIgnoreCase("bp USA")) {
			// Medical Examination
			Select selectEyesAndPupils = new Select(drpEyesAndPupils);
			selectEyesAndPupils.selectByVisibleText("Not Performed");

			Select selectNoseThroat = new Select(drpEarNoseThroat);
			selectNoseThroat.selectByVisibleText("Not Performed");

			Select selectTeethAndMouth = new Select(drpTeethAndMouth);
			selectTeethAndMouth.selectByVisibleText("Not Performed");

			Select selectLungsAndChest = new Select(drpLungsAndChest);
			selectLungsAndChest.selectByVisibleText("Not Performed");

			Select selectCardiovascular = new Select(drpCardiovascular);
			selectCardiovascular.selectByVisibleText("Not Performed");

			Select selectHernialOrifices = new Select(drpHernialOrificesBP);
			selectHernialOrifices.selectByVisibleText("Not Performed");

			Select selectAnusAndRectum = new Select(drpAnusAndRectumBP);
			selectAnusAndRectum.selectByVisibleText("Not Performed");

			Select selectGenitoUrinary = new Select(drpGenitoUrinaryBP);
			selectGenitoUrinary.selectByVisibleText("Not Performed");

			Select selectExtremities = new Select(drpExtremitiesBP);
			selectExtremities.selectByVisibleText("Not Performed");

			Select selectMusculoSkeletal = new Select(drpMusculoskeletalBP);
			selectMusculoSkeletal.selectByVisibleText("Not Performed");

			Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveinsBP);
			selectSkinVaricoseVeins.selectByVisibleText("Not Performed");

			Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitnessBP);
			selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");

			Select selectBreast = new Select(drpBreastBP);
			selectBreast.selectByVisibleText("Not Performed");

			Select selectEndocrinology = new Select(drpEndocrinologyBP);
			selectEndocrinology.selectByVisibleText("Not Performed");

			// Physician's Report Tab - Other Information
			checkBoxHeight.click();
			checkBoxWeight.click();
			checkBoxBloodPressureSYS.click();
			checkBoxBloodPressureDIA.click();
			checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			Select hearingRight = new Select(drpHearingRight);
			hearingRight.selectByVisibleText("Not Performed");

			Select hearingLeft = new Select(drpHearingLeft);
			hearingLeft.selectByVisibleText("Not Performed");

			Select VisionRight = new Select(drpDistantVisionRight);
			VisionRight.selectByVisibleText("Not Performed");

			Select DistantvisionLeft = new Select(drpDistantVisionLeft);
			DistantvisionLeft.selectByVisibleText("Not Performed");

			Select visionRight = new Select(drpNearVisionRight);
			visionRight.selectByVisibleText("Not Performed");

			Select NearvisionLeft = new Select(drpNearVisionLeft);
			NearvisionLeft.selectByVisibleText("Not Performed");

			Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
			selectTestedWithGlasses.selectByVisibleText("Not Performed");

			Select selectColoVision = new Select(drpColorVision);
			selectColoVision.selectByVisibleText("Not Performed");

		} else if (companyName.equalsIgnoreCase("MY COMPANY")) {

			Select selectEyesAndPupils = new Select(drpEyesAndPupils);
			selectEyesAndPupils.selectByVisibleText("Not Performed");

			Select selectNoseThroat = new Select(drpEarNoseThroat);
			selectNoseThroat.selectByVisibleText("Not Performed");

			Select selectTeethAndMouth = new Select(drpTeethAndMouth);
			selectTeethAndMouth.selectByVisibleText("Not Performed");

			Select selectLungsAndChest = new Select(drpLungsAndChest);
			selectLungsAndChest.selectByVisibleText("Not Performed");

			Select selectCardiovascular = new Select(drpCardiovascular);
			selectCardiovascular.selectByVisibleText("Not Performed");

			Select selectAbdoViscera = new Select(drpAbdoViscera);
			selectAbdoViscera.selectByVisibleText("Not Performed");

			Select selectHernialOrifices = new Select(drpHernialOrifices);
			selectHernialOrifices.selectByVisibleText("Not Performed");

			Select selectAnusAndRectum = new Select(drpAnusAndRectum);
			selectAnusAndRectum.selectByVisibleText("Not Performed");

			Select selectGenitoUrinary = new Select(drpGenitoUrinary);
			selectGenitoUrinary.selectByVisibleText("Not Performed");

			Select selectExtremities = new Select(drpExtremities);
			selectExtremities.selectByVisibleText("Not Performed");

			Select selectMusculoSkeletal = new Select(drpMusculoskeletal);
			selectMusculoSkeletal.selectByVisibleText("Not Performed");

			Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveins);
			selectSkinVaricoseVeins.selectByVisibleText("Not Performed");

			Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitness);
			selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");

			Select selectBreast = new Select(drpBreast);
			selectBreast.selectByVisibleText("Not Performed");

			Select selectLymphNodes = new Select(drpLymphnodesMY);
			selectLymphNodes.selectByVisibleText("Not Performed");

			// Physician's Report Tab - Other Information
			checkBoxHeight.click();
			checkBoxWeight.click();
			checkBoxBloodPressureSYS.click();
			checkBoxBloodPressureDIA.click();
			checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			Select hearingRight = new Select(drpHearingRight);
			hearingRight.selectByVisibleText("Not Performed");

			Select hearingLeft = new Select(drpHearingLeft);
			hearingLeft.selectByVisibleText("Not Performed");

			Select VisionRight = new Select(drpDistantVisionRight);
			VisionRight.selectByVisibleText("Not Performed");

			Select DistantvisionLeft = new Select(drpDistantVisionLeft);
			DistantvisionLeft.selectByVisibleText("Not Performed");

			Select visionRight = new Select(drpNearVisionRight);
			visionRight.selectByVisibleText("Not Performed");

			Select NearvisionLeft = new Select(drpNearVisionLeft);
			NearvisionLeft.selectByVisibleText("Not Performed");

			Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
			selectTestedWithGlasses.selectByVisibleText("Not Performed");

			Select selectColoVision = new Select(drpColorVision);
			selectColoVision.selectByVisibleText("Not Performed");

			Select selectAudiogram = new Select(drpAudiogramAL_RHT);
			selectAudiogram.selectByVisibleText("Not Performed");

		} else if (companyName.equalsIgnoreCase("NOVARTIS")) {
			// Medical Examination

			Select selectEyesAndPupils = new Select(drpEyesAndPupils);
			selectEyesAndPupils.selectByVisibleText("Not Performed");

			Select selectNoseThroat = new Select(drpEarNoseThroat);
			selectNoseThroat.selectByVisibleText("Not Performed");

			Select selectTeethAndMouth = new Select(drpTeethAndMouth);
			selectTeethAndMouth.selectByVisibleText("Not Performed");

			Select selectLungsAndChest = new Select(drpLungsAndChest);
			selectLungsAndChest.selectByVisibleText("Not Performed");

			Select selectCardiovascular = new Select(drpCardiovascular);
			selectCardiovascular.selectByVisibleText("Not Performed");

			Select selectAbdoViscera = new Select(drpAbdoViscera);
			selectAbdoViscera.selectByVisibleText("Not Performed");

			Select selectHernialOrifices = new Select(drpHernialOrifices);
			selectHernialOrifices.selectByVisibleText("Not Performed");

			Select selectAnusAndRectum = new Select(drpAnusAndRectum);
			selectAnusAndRectum.selectByVisibleText("Not Performed");

			Select selectGenitoUrinary = new Select(drpGenitoUrinary);
			selectGenitoUrinary.selectByVisibleText("Not Performed");

			Select selectExtremities = new Select(drpExtremities);
			selectExtremities.selectByVisibleText("Not Performed");

			Select selectMusculoSkeletal = new Select(drpMusculoskeletal);
			selectMusculoSkeletal.selectByVisibleText("Not Performed");

			Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveins);
			selectSkinVaricoseVeins.selectByVisibleText("Not Performed");

			Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitness);
			selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");

			Select selectBreast = new Select(drpBreast);
			selectBreast.selectByVisibleText("Not Performed");

			Select selectEndocrinology = new Select(drpEndocrinology);
			selectEndocrinology.selectByVisibleText("Not Performed");

			Select selectLymphNodes = new Select(drpLymphnodes);
			selectLymphNodes.selectByVisibleText("Not Performed");

			// Physician's Report Tab - Other Information
			checkBoxHeight.click();
			checkBoxWeight.click();
			checkBoxBloodPressureSYS.click();
			checkBoxBloodPressureDIA.click();
			checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			Select hearingRight = new Select(drpHearingRight);
			hearingRight.selectByVisibleText("Not Performed");

			Select hearingLeft = new Select(drpHearingLeft);
			hearingLeft.selectByVisibleText("Not Performed");

			Select VisionRight = new Select(drpDistantVisionRight);
			VisionRight.selectByVisibleText("Not Performed");

			Select DistantvisionLeft = new Select(drpDistantVisionLeft);
			DistantvisionLeft.selectByVisibleText("Not Performed");

			Select visionRight = new Select(drpNearVisionRight);
			visionRight.selectByVisibleText("Not Performed");

			Select NearvisionLeft = new Select(drpNearVisionLeft);
			NearvisionLeft.selectByVisibleText("Not Performed");

			Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
			selectTestedWithGlasses.selectByVisibleText("Not Performed");

			Select selectColoVision = new Select(drpColorVision);
			selectColoVision.selectByVisibleText("Not Performed");

			Select selectAudiogram = new Select(drpAudiogram);
			selectAudiogram.selectByVisibleText("Not Performed");

		} else if (companyName.equalsIgnoreCase("BioMerieux")) {
			// Medical Examination

			Select selectEyesAndPupils = new Select(drpEyesAndPupils);
			selectEyesAndPupils.selectByVisibleText("Not Performed");

			Select selectNoseThroat = new Select(drpEarNoseThroat);
			selectNoseThroat.selectByVisibleText("Not Performed");

			Select selectTeethAndMouth = new Select(drpTeethAndMouth);
			selectTeethAndMouth.selectByVisibleText("Not Performed");

			Select selectLungsAndChest = new Select(drpLungsAndChest);
			selectLungsAndChest.selectByVisibleText("Not Performed");

			Select selectCardiovascular = new Select(drpCardiovascular);
			selectCardiovascular.selectByVisibleText("Not Performed");

			Select selectAbdoViscera = new Select(drpAbdoViscera);
			selectAbdoViscera.selectByVisibleText("Not Performed");

			Select selectHernialOrifices = new Select(drpHernialOrifices);
			selectHernialOrifices.selectByVisibleText("Not Performed");

			Select selectAnusAndRectum = new Select(drpAnusAndRectum);
			selectAnusAndRectum.selectByVisibleText("Not Performed");

			Select selectGenitoUrinary = new Select(drpGenitoUrinary);
			selectGenitoUrinary.selectByVisibleText("Not Performed");

			Select selectExtremities = new Select(drpExtremities);
			selectExtremities.selectByVisibleText("Not Performed");

			Select selectMusculoSkeletal = new Select(drpMusculoskeletal);
			selectMusculoSkeletal.selectByVisibleText("Not Performed");

			Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveins);
			selectSkinVaricoseVeins.selectByVisibleText("Not Performed");

			Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitness);
			selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");

			Select selectBreast = new Select(drpBreast);
			selectBreast.selectByVisibleText("Not Performed");

			Select selectEndocrinology = new Select(drpEndocrinology);
			selectEndocrinology.selectByVisibleText("Not Performed");

			Select selectLymphNodes = new Select(drpLymphnodes);
			selectLymphNodes.selectByVisibleText("Not Performed");

			// Physician's Report Tab - Other Information
			checkBoxHeight.click();
			checkBoxWeight.click();
			checkBoxBloodPressureSYS.click();
			checkBoxBloodPressureDIA.click();
			checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			Select hearingRight = new Select(drpHearingRight);
			hearingRight.selectByVisibleText("Not Performed");

			Select hearingLeft = new Select(drpHearingLeft);
			hearingLeft.selectByVisibleText("Not Performed");

			Select VisionRight = new Select(drpDistantVisionRight);
			VisionRight.selectByVisibleText("Not Performed");

			Select DistantvisionLeft = new Select(drpDistantVisionLeft);
			DistantvisionLeft.selectByVisibleText("Not Performed");

			Select visionRight = new Select(drpNearVisionRight);
			visionRight.selectByVisibleText("Not Performed");

			Select NearvisionLeft = new Select(drpNearVisionLeft);
			NearvisionLeft.selectByVisibleText("Not Performed");

			Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
			selectTestedWithGlasses.selectByVisibleText("Not Performed");

			Select selectColoVision = new Select(drpColorVision);
			selectColoVision.selectByVisibleText("Not Performed");

			Select selectAudiogram = new Select(drpAudiogram);
			selectAudiogram.selectByVisibleText("Not Performed");

		} else if (companyName.equalsIgnoreCase("ARKEMA")) {

			// Medical Examination
			Select selectEyesAndPupils = new Select(drpEyesAndPupils);
			selectEyesAndPupils.selectByVisibleText("Not Performed");

			Select selectNoseThroat = new Select(drpEarNoseThroat);
			selectNoseThroat.selectByVisibleText("Not Performed");

			Select selectTeethAndMouth = new Select(drpTeethAndMouth);
			selectTeethAndMouth.selectByVisibleText("Not Performed");

			Select selectLungsAndChest = new Select(drpLungsAndChest);
			selectLungsAndChest.selectByVisibleText("Not Performed");

			Select selectCardiovascular = new Select(drpCardiovascular);
			selectCardiovascular.selectByVisibleText("Not Performed");

			Select selectAbdoViscera = new Select(drpAbdoViscera);
			selectAbdoViscera.selectByVisibleText("Not Performed");

			Select selectHernialOrifices = new Select(drpHernialOrifices);
			selectHernialOrifices.selectByVisibleText("Not Performed");

			Select selectAnusAndRectum = new Select(drpAnusAndRectum);
			selectAnusAndRectum.selectByVisibleText("Not Performed");

			Select selectGenitoUrinary = new Select(drpGenitoUrinary);
			selectGenitoUrinary.selectByVisibleText("Not Performed");

			Select selectExtremities = new Select(drpExtremities);
			selectExtremities.selectByVisibleText("Not Performed");

			Select selectMusculoSkeletal = new Select(drpMusculoskeletal);
			selectMusculoSkeletal.selectByVisibleText("Not Performed");

			Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveins);
			selectSkinVaricoseVeins.selectByVisibleText("Not Performed");

			Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitness);
			selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");

			Select selectBreast = new Select(drpBreast);
			selectBreast.selectByVisibleText("Not Performed");

			Select selectEndocrinology = new Select(drpEndocrinology);
			selectEndocrinology.selectByVisibleText("Not Performed");

			Select selectLymphNodes = new Select(drpLymphnodes);
			selectLymphNodes.selectByVisibleText("Not Performed");

			// Physician's Report Tab - Other Information
			checkBoxHeight.click();
			checkBoxWeight.click();
			checkBoxBloodPressureSYS.click();
			checkBoxBloodPressureDIA.click();
			checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			Select hearingRight = new Select(drpHearingRight);
			hearingRight.selectByVisibleText("Not Performed");

			Select hearingLeft = new Select(drpHearingLeft);
			hearingLeft.selectByVisibleText("Not Performed");

			Select VisionRight = new Select(drpDistantVisionRight);
			VisionRight.selectByVisibleText("Not Performed");

			Select DistantvisionLeft = new Select(drpDistantVisionLeft);
			DistantvisionLeft.selectByVisibleText("Not Performed");

			Select visionRight = new Select(drpNearVisionRight);
			visionRight.selectByVisibleText("Not Performed");

			Select NearvisionLeft = new Select(drpNearVisionLeft);
			NearvisionLeft.selectByVisibleText("Not Performed");

			Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
			selectTestedWithGlasses.selectByVisibleText("Not Performed");

			Select selectColoVision = new Select(drpColorVision);
			selectColoVision.selectByVisibleText("Not Performed");

			Select selectAudiogram = new Select(drpAudiogram);
			selectAudiogram.selectByVisibleText("Not Performed");

		} else if (companyName.equalsIgnoreCase("CGG International S.A.")) {

			// Medical Examination
			ChkBoxPsychosocialAssessmentScale.click();

			Select selectEyesAndPupils = new Select(drpEyesAndPupilsCGG);
			selectEyesAndPupils.selectByVisibleText("Not Performed");

			Select selectNoseThroat = new Select(drpEarNoseThroatCGG);
			selectNoseThroat.selectByVisibleText("Not Performed");

			Select selectTeethAndMouth = new Select(drpTeethAndMouthCGG);
			selectTeethAndMouth.selectByVisibleText("Not Performed");

			Select selectLungsAndChest = new Select(drpLungsAndChestCGG);
			selectLungsAndChest.selectByVisibleText("Not Performed");

			Select selectCardiovascular = new Select(drpCardiovascularCGG);
			selectCardiovascular.selectByVisibleText("Not Performed");

			Select selectAbdoViscera = new Select(drpAbdominalCGG);
			selectAbdoViscera.selectByVisibleText("Not Performed");

			Select selectHernialOrifices = new Select(drpHernialOrificesCGG);
			selectHernialOrifices.selectByVisibleText("Not Performed");

			Select selectAnusAndRectum = new Select(drpAnusAndRectumCGG);
			selectAnusAndRectum.selectByVisibleText("Not Performed");

			Select selectGenitoUrinary = new Select(drpGenitoUrinaryCGG);
			selectGenitoUrinary.selectByVisibleText("Not Performed");

			Select selectExtremities = new Select(drpExtremitiesCGG);
			selectExtremities.selectByVisibleText("Not Performed");

			Select selectMusculoSkeletal = new Select(drpMusculoskeletalCGG);
			selectMusculoSkeletal.selectByVisibleText("Not Performed");

			Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveinsCGG);
			selectSkinVaricoseVeins.selectByVisibleText("Not Performed");

			Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitnessCGG);
			selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");

			Select selectBreast = new Select(drpBreastCGG);
			selectBreast.selectByVisibleText("Not Performed");

			Select selectEndocrinology = new Select(drpEndocrinologyCGG);
			selectEndocrinology.selectByVisibleText("Not Performed");

			Select selectLymphNodes = new Select(drpLymphnodesCGG);
			selectLymphNodes.selectByVisibleText("Not Performed");

			// Physician's Report Tab - Other Information
			checkBoxHeight.click();
			checkBoxWeight.click();
			checkBoxBloodPressureSYS.click();
			checkBoxBloodPressureDIA.click();
			checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			Select hearingRight = new Select(drpHearingRight);
			hearingRight.selectByVisibleText("Not Performed");

			Select hearingLeft = new Select(drpHearingLeft);
			hearingLeft.selectByVisibleText("Not Performed");

			Select VisionRight = new Select(drpDistantVisionRight);
			VisionRight.selectByVisibleText("Not Performed");

			Select DistantvisionLeft = new Select(drpDistantVisionLeft);
			DistantvisionLeft.selectByVisibleText("Not Performed");

			Select visionRight = new Select(drpNearVisionRight);
			visionRight.selectByVisibleText("Not Performed");

			Select NearvisionLeft = new Select(drpNearVisionLeft);
			NearvisionLeft.selectByVisibleText("Not Performed");

			Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
			selectTestedWithGlasses.selectByVisibleText("Not Performed");

			Select selectColoVision = new Select(drpColorVision);
			selectColoVision.selectByVisibleText("Not Performed");

			Select selectAudiogram = new Select(drpAudiogram);
			selectAudiogram.selectByVisibleText("Not Performed");
		}

	}

	public void savePhysicianReportTab() throws InterruptedException {
		JavaScriptUtils.moveToElement(driver, savePhysicianReportButton);
		savePhysicianReportButton.click();
		driver.switchTo().defaultContent();
	}

// Lab Analysis Tab
	public void clickLabAnalysisTab() {
		labAnalysisTab.click();
		WaitUtils.sleep(5);
	}

//Switching to the frame - Lab Analysis Tab ***************************************************************************************
	public void selectAllDrpdwnChkboxesLabAnalysisTab() {
		String companyName = driver
				.findElement(By.xpath("//div[@class='MedicalNormalText']//table/tbody/tr/td[2]/table/tbody/tr/td[2]"))
				.getText();
		driver.switchTo().frame(0);
		if (companyName.equalsIgnoreCase("Schlumberger")) {
			WaitUtils.sleep(2);

			// Para Clinical Examination
			Select selectparaClinicalExamination = new Select(drpECG);
			selectparaClinicalExamination.selectByVisibleText("Not Performed");

			Select selectChestXRay = new Select(drpChestXRay);
			selectChestXRay.selectByVisibleText("Not Performed");

			Select selectStressTest = new Select(drpStressTest);
			selectStressTest.selectByVisibleText("Not Performed");

			Select selectFunctionalRespiratoryTesting = new Select(drpFunctionalRespiratoryTesting);
			selectFunctionalRespiratoryTesting.selectByVisibleText("Not Performed");

			Select selectAbdominalPelvicEchography = new Select(drpAbdominalPelvicEchography);
			selectAbdominalPelvicEchography.selectByVisibleText("Not Performed");

			Select selectCarotidEchoDoppler = new Select(drpCarotidEchoDoppler);
			selectCarotidEchoDoppler.selectByVisibleText("Not Performed");

			Select selectCardiacEchography = new Select(drpCardiacEchography);
			selectCardiacEchography.selectByVisibleText("Not Performed");

			Select selectMammogram = new Select(drpMammogram);
			selectMammogram.selectByVisibleText("Not Performed");

			Select selectPAPSmear = new Select(drpPAPSmear);
			selectPAPSmear.selectByVisibleText("Not Performed");

			// Blood Analysis
			checkBoxRBC.click();
			checkBoxWBC.click();
			checkBoxNEUTRO.click();
			checkBoxEOSINO.click();
			checkBoxBASO.click();
			checkBoxLYMPHO.click();
			checkBoxMONO.click();
			checkBoxHEMATOCRIT.click();
			checkBoxHEMOGLOBIN.click();
			checkBoxESR.click();
			checkBoxSGOTASAT.click();
			checkBoxSGPTALAT.click();
			checkBoxGAMMAGT.click();
			checkBoxGLYCEMIA.click();
			checkBoxCHOLESTEROL.click();
			checkBoxHDL.click();
			checkBoxLDL.click();
			checkBoxCREATININE.click();
			checkBoxURICACID.click();
			checkBoxTRIGLYCERIDES.click();

			// Eyes
			checkBoxTonometryRightEye.click();
			checkBoxTonometryLeftEye.click();

			// Additional Blood Test
			checkBoxPSA.click();
			checkBoxCEA.click();
			checkBoxTSH.click();
			checkBoxAlkalinePhosphatase.click();

			// Urine Analysis
			Select SelectAlbumin = new Select(drpAlbumin);
			SelectAlbumin.selectByVisibleText("Not Performed");

			Select SelectSugar = new Select(drpSugar);
			SelectSugar.selectByVisibleText("Not Performed");

			Select SelectBlood = new Select(drpBloodForUrine);
			SelectBlood.selectByVisibleText("Not Performed");

			// Stool Analysis
			Select selectBloodForStool = new Select(drpParasiteForStool);
			selectBloodForStool.selectByVisibleText("Not Performed");

			Select selectBloodForStool1 = new Select(drpBloodForStool);
			selectBloodForStool1.selectByVisibleText("Not Performed");

		} else if (companyName.equalsIgnoreCase("bp International Limited")) {

			// Para Clinical Examination
			Select selectECG = new Select(drpECGBP);
			selectECG.selectByVisibleText("Not Performed");
			
			Select selectRestingECG = new Select(drpRestingECGBP);
			selectRestingECG.selectByVisibleText("Not Performed");
			
			Select selectStressTest = new Select(drpStressTestyBP);
			selectStressTest.selectByVisibleText("Not Performed");
			
			Select selectChestXRay = new Select(drpChestXRayBP);
			selectChestXRay.selectByVisibleText("Not Performed");

			// Blood Analysis
			checkBoxRBC.click();
			checkBoxWBC.click();
			checkBoxNEUTRO.click();
			checkBoxEOSINO.click();
			checkBoxBASO.click();
			checkBoxLYMPHO.click();
			checkBoxMONO.click();
			checkBoxHEMATOCRIT.click();
			checkBoxHEMOGLOBIN.click();
			checkBoxSGOTASATBP.click();
			checkBoxSGPTALATBP.click();
			checkBoxGAMMAGTBP.click();
			checkBoxGLYCEMIABP.click();
			checkBoxCHOLESTEROLBP.click();
			checkBoxHDLBP.click();
			checkBoxLDLBP.click();
			checkBoxCREATININEBP.click();
			checkBoxURICACIDBP.click();
			checkBoxTRIGLYCERIDESBP.click();

			// Eyes

			// Additional Blood Test
			checkBoxUREABP.click();
			checkBoxPSABP.click();
			checkBoxCEABP.click();
			checkBoxTSHBP.click();
			Select SelectAlbumin = new Select(drpQuantiferonGoldTBTestBP);
			SelectAlbumin.selectByVisibleText("Not Performed");

			// Urine Analysis
			Select selectAlbumin = new Select(drpAlbumin);
			selectAlbumin.selectByVisibleText("Not Performed");

			Select SelectSugar = new Select(drpSugar);
			SelectSugar.selectByVisibleText("Not Performed");

			Select selectBloodForUrine = new Select(drpBloodForUrine);
			selectBloodForUrine.selectByVisibleText("Not Performed");

			Select selectNitrates = new Select(drpNitrates);
			selectNitrates.selectByVisibleText("Not Performed");

			Select selectLeukocytes = new Select(drpLeukocytes);
			selectLeukocytes.selectByVisibleText("Not Performed");

			Select selectKetones = new Select(drpKetones);
			selectKetones.selectByVisibleText("Not Performed");

			// Stool Analysis

		} else if (companyName.equalsIgnoreCase("SBM International Personnel Services SA")) {
			// Nothing to select as UI page is empty

		} else if (companyName.equalsIgnoreCase("Michelin")) {

			// Para Clinical Examination
			Select selectChestXRay = new Select(drpECG);
			selectChestXRay.selectByVisibleText("Not Performed");

			Select selectRespiratoryTestingMIAL = new Select(drpFunctionalRespiratoryTestingMIAL);
			selectRespiratoryTestingMIAL.selectByVisibleText("Not Performed");

			// Blood Analysis
			checkBoxRBC.click();
			checkBoxWBC.click();
			checkBoxNEUTRO.click();
			checkBoxEOSINO.click();
			checkBoxBASO.click();
			checkBoxLYMPHO.click();
			checkBoxMONO.click();
			checkBoxHEMATOCRIT.click();
			checkBoxHEMOGLOBIN.click();
			checkBoxESRMI.click();
			checkBoxSGOTASAT.click();
			checkBoxSGPTALAT.click();
			checkBoxGAMMAGT.click();
			checkBoxGLYCEMIA.click();
			checkBoxCHOLESTEROL.click();
			checkBoxHDL.click();
			checkBoxLDL.click();
			checkBoxCREATININE.click();
			checkBoxURICACID.click();
			checkBoxTRIGLYCERIDES.click();

			// Eyes

			// Additional Blood Test
			checkBoxAlkalinePhosphataseMI.click();

			// Urine Analysis
			Select SelectAlbumin = new Select(drpAlbumin);
			SelectAlbumin.selectByVisibleText("Not Performed");

			Select SelectSugar = new Select(drpSugar);
			SelectSugar.selectByVisibleText("Not Performed");

			Select SelectBlood = new Select(drpBloodForUrine);
			SelectBlood.selectByVisibleText("Not Performed");

			Select SelectNitrates = new Select(drpNitrates);
			SelectNitrates.selectByVisibleText("Not Performed");

			Select SelectLeukocytes = new Select(drpLeukocytes);
			SelectLeukocytes.selectByVisibleText("Not Performed");

			Select SelectKetones = new Select(drpKetones);
			SelectKetones.selectByVisibleText("Not Performed");

			// Stool Analysis
			Select SelectBloodForStoolMIAL = new Select(drpBloodForStoolMIAL);
			SelectBloodForStoolMIAL.selectByVisibleText("Not Performed");

		} else if (companyName.equalsIgnoreCase("Richemont")) {

			Select selectEyesAndPupils = new Select(drpBoneDensitometry);
			selectEyesAndPupils.selectByVisibleText("Not Performed");

			Select selectUltrasoundThyroid = new Select(drpUltrasoundThyroid);
			selectUltrasoundThyroid.selectByVisibleText("Not Performed");

			Select selectECGRT = new Select(drpECGRT);
			selectECGRT.selectByVisibleText("Not Performed");

			Select selectTreadmill = new Select(drpTreadmill);
			selectTreadmill.selectByVisibleText("Not Performed");

			Select selectChestXRayRT = new Select(drpChestXRayRT);
			selectChestXRayRT.selectByVisibleText("Not Performed");

			Select selectFunctionalRespiratoryTestingRT = new Select(drpFunctionalRespiratoryTestingRT);
			selectFunctionalRespiratoryTestingRT.selectByVisibleText("Not Performed");

			Select selectAbdominalPelvicEchographyRT = new Select(drpAbdominalPelvicEchographyRT);
			selectAbdominalPelvicEchographyRT.selectByVisibleText("Not Performed");

			Select selectCarotidEchoDopplerRT = new Select(drpCarotidEchoDopplerRT);
			selectCarotidEchoDopplerRT.selectByVisibleText("Not Performed");

			Select selectCardiacEchographyRT = new Select(drpCardiacEchographyRT);
			selectCardiacEchographyRT.selectByVisibleText("Not Performed");

			Select selectMammographyRT = new Select(drpMammographyRT);
			selectMammographyRT.selectByVisibleText("Not Performed");

			Select selectPAPSmearRT = new Select(drpPAPSmearRT);
			selectPAPSmearRT.selectByVisibleText("Not Performed");

			// Blood Analysis
			checkBoxFerritinRT.click();
			checkBoxRBCRTKN.click();
			checkBoxWBCRTKN.click();
			checkBoxNEUTRORTKN.click();
			checkBoxEOSINORTKN.click();
			checkBoxBASORTKN.click();
			checkBoxLYMPHORTKN.click();
			checkBoxMONORTKN.click();
			checkBoxHEMATOCRITRTKN.click();
			checkBoxHEMOGLOBINRTKN.click();
			checkBoxESRRTKN.click();
			checkBoxSGOTASATRTKN.click();
			checkBoxSGPTALATRTKN.click();
			checkBoxGAMMAGTRTKN.click();
			checkBoxGLYCEMIARTKN.click();
			checkBoxCHOLESTEROLRTKN.click();
			checkBoxHDLRTKN.click();
			checkBoxLDLRTKN.click();
			checkBoxCREATININERTKN.click();
			checkBoxURICACIDRTKN.click();
			checkBoxTRIGLYCERIDESRTKN.click();

			// Eyes
			checkBoxTonometryRightEye.click();
			checkBoxTonometryLeftEye.click();

			// Additional Blood Test
			checkBoxHbA1c.click();
			checkBoxAlkalinePhosphataseRT.click();

			// Urine Analysis
			Select SelectAlbumin = new Select(drpAlbumin);
			SelectAlbumin.selectByVisibleText("Not Performed");

			Select SelectSugar = new Select(drpSugar);
			SelectSugar.selectByVisibleText("Not Performed");

			Select SelectBloodForUrine = new Select(drpBloodForUrine);
			SelectBloodForUrine.selectByVisibleText("Not Performed");

			Select SelectNitrates = new Select(drpNitrates);
			SelectNitrates.selectByVisibleText("Not Performed");

			Select SelectLeukocytes = new Select(drpLeukocytes);
			SelectLeukocytes.selectByVisibleText("Not Performed");

			Select SelectKetones = new Select(drpKetones);
			SelectKetones.selectByVisibleText("Not Performed");

			// Stool Analysis

		} else if (companyName.equalsIgnoreCase("MAINBY SA")) {
			// Para Clinical Examination
			Select selectparaClinicalExamination = new Select(drpECGMY);
			selectparaClinicalExamination.selectByVisibleText("Not Performed");

			Select selectChestXRay = new Select(drpChestXRayMY);
			selectChestXRay.selectByVisibleText("Not Performed");

			// Blood Analysis
			checkBoxRBC.click();
			checkBoxWBC.click();
			checkBoxNEUTRO.click();
			checkBoxEOSINO.click();
			checkBoxBASO.click();
			checkBoxLYMPHO.click();
			checkBoxMONO.click();
			checkBoxHEMATOCRIT.click();
			checkBoxHEMOGLOBIN.click();
			checkBoxESRMY.click();
			checkBoxGLYCEMIAMY.click();
			checkBoxCHOLESTEROLMY.click();
			checkBoxHDLMY.click();
			checkBoxLDLMY.click();
			checkBoxCREATININEMY.click();
			checkBoxURICACIDMY.click();
			checkBoxTRIGLYCERIDESMY.click();

			// Eyes

			// Additional Blood Test
			checkBoxPSA.click();
			checkBoxPlateletCount.click();
			checkBoxAlkalinePhosphataseMY.click();

			// Urine Analysis
			Select SelectAlbumin = new Select(drpAlbumin);
			SelectAlbumin.selectByVisibleText("Not Performed");

			Select SelectSugar = new Select(drpSugar);
			SelectSugar.selectByVisibleText("Not Performed");

			Select SelectBlood = new Select(drpBloodForUrine);
			SelectBlood.selectByVisibleText("Not Performed");

			// Stool Analysis

		} else if (companyName.equalsIgnoreCase("Kinross")) {
			WaitUtils.sleep(2);

			// Para Clinical Examination
			Select selectECGRT = new Select(drpECG);
			selectECGRT.selectByVisibleText("Not Performed");

			Select selectTreadmill = new Select(drpTreadmillKN);
			selectTreadmill.selectByVisibleText("Not Performed");

			Select selectChestXRayRT = new Select(drpChestXRay);
			selectChestXRayRT.selectByVisibleText("Not Performed");

			Select selectFunctionalRespiratoryTestingRT = new Select(drpFunctionalRespiratoryTesting);
			selectFunctionalRespiratoryTestingRT.selectByVisibleText("Not Performed");

			// Blood Analysis
			checkBoxBloodHbA1cKN.click();
			checkBoxRBCRTKN.click();
			checkBoxWBCRTKN.click();
			checkBoxNEUTRORTKN.click();
			checkBoxEOSINORTKN.click();
			checkBoxBASORTKN.click();
			checkBoxLYMPHORTKN.click();
			checkBoxMONORTKN.click();
			checkBoxHEMATOCRITRTKN.click();
			checkBoxHEMOGLOBINRTKN.click();
			checkBoxESRRTKN.click();
			checkBoxSGOTASATRTKN.click();
			checkBoxSGPTALATRTKN.click();
			checkBoxGAMMAGTRTKN.click();
			checkBoxGLYCEMIARTKN.click();
			checkBoxCHOLESTEROLRTKN.click();
			checkBoxHDLRTKN.click();
			checkBoxLDLRTKN.click();
			checkBoxCREATININERTKN.click();
			checkBoxURICACIDRTKN.click();
			checkBoxTRIGLYCERIDESRTKN.click();

			// Eyes

			// Additional Blood Test
			checkBoxVitaminD2.click();
			checkBoxHbA1cKN.click();
			checkBoxElectrolytesSodium.click();
			checkBoxElectrolytesCalcium.click();
			checkBoxElectrolytesPotassium.click();
			Select SelectQuantiferonGoldTBTestKN = new Select(drpQuantiferonGoldTBTestKN);
			SelectQuantiferonGoldTBTestKN.selectByVisibleText("Not Performed");

			checkBoxTSHKN.click();
			checkBoxAlkalinePhosphataseKN.click();

			// Urine Analysis
			Select SelectAlbuminKN = new Select(drpAlbumin);
			SelectAlbuminKN.selectByVisibleText("Not Performed");

			Select SelectSugar = new Select(drpSugar);
			SelectSugar.selectByVisibleText("Not Performed");

			Select SelectBloodUrine = new Select(drpBloodForUrine);
			SelectBloodUrine.selectByVisibleText("Not Performed");

			Select SelectNitratesKN = new Select(drpNitrates);
			SelectNitratesKN.selectByVisibleText("Not Performed");

			Select SelectLeukocytes = new Select(drpLeukocytes);
			SelectLeukocytes.selectByVisibleText("Not Performed");

			Select SelectKetones = new Select(drpKetones);
			SelectKetones.selectByVisibleText("Not Performed");

			// Stool Analysis

		} else if (companyName.equalsIgnoreCase("Frontex")) {
			WaitUtils.sleep(2);

			// Para Clinical Examination
		} else if (companyName.equalsIgnoreCase("Eramet")) {
			WaitUtils.sleep(2);

			// Para Clinical Examination

			Select selectECGRT = new Select(drpECGET);
			selectECGRT.selectByVisibleText("Not Performed");

			Select selectFunctionalRespiratoryTestingET = new Select(drpFunctionalRespiratoryTestingET);
			selectFunctionalRespiratoryTestingET.selectByVisibleText("Not Performed");

			// Blood Analysis
			checkBoxRBC.click();
			checkBoxWBC.click();
			checkBoxNEUTRO.click();
			checkBoxEOSINO.click();
			checkBoxBASO.click();
			checkBoxLYMPHO.click();
			checkBoxMONO.click();
			checkBoxHEMATOCRIT.click();
			checkBoxHEMOGLOBIN.click();
			checkBoxESR.click();
			checkBoxSGOTASAT.click();
			checkBoxSGPTALAT.click();
			checkBoxGAMMAGT.click();
			checkBoxGLYCEMIA.click();
			checkBoxCHOLESTEROL.click();
			checkBoxHDL.click();
			checkBoxLDL.click();
			checkBoxCREATININE.click();
			checkBoxURICACID.click();
			checkBoxTRIGLYCERIDES.click();

			// Eyes

			// Additional Blood Test
			checkBoxHbA1c.click();
			checkBoxAlkalinePhosphataseRT.click();

			// Urine Analysis
			Select SelectAlbuminKN = new Select(drpAlbumin);
			SelectAlbuminKN.selectByVisibleText("Not Performed");

			Select SelectSugar = new Select(drpSugar);
			SelectSugar.selectByVisibleText("Not Performed");

			Select SelectBloodUrine = new Select(drpBloodForUrine);
			SelectBloodUrine.selectByVisibleText("Not Performed");

			Select SelectNitratesKN = new Select(drpNitrates);
			SelectNitratesKN.selectByVisibleText("Not Performed");

			Select SelectLeukocytes = new Select(drpLeukocytes);
			SelectLeukocytes.selectByVisibleText("Not Performed");

			Select SelectKetones = new Select(drpKetones);
			SelectKetones.selectByVisibleText("Not Performed");

			// Stool Analysis
		} else if (companyName.equalsIgnoreCase("bp USA")) {
			WaitUtils.sleep(2);

			// Para Clinical Examination
			Select selectChestXRay = new Select(drpChestXRayBPUSA);
			selectChestXRay.selectByVisibleText("Not Performed");

			// Blood Analysis
			checkBoxRBC.click();
			checkBoxWBC.click();
			checkBoxNEUTRO.click();
			checkBoxEOSINO.click();
			checkBoxBASO.click();
			checkBoxLYMPHO.click();
			checkBoxMONO.click();
			checkBoxHEMATOCRIT.click();
			checkBoxHEMOGLOBIN.click();
			checkBoxSGOTASATBP.click();
			checkBoxSGPTALATBP.click();
			checkBoxGAMMAGTBP.click();
			checkBoxGLYCEMIABP.click();
			checkBoxCHOLESTEROLBP.click();
			checkBoxHDLBP.click();
			checkBoxTRIGLYCERIDESBP.click();

			// Eyes

			// Additional Blood Test
			Select selectAlbuminKN = new Select(drpQuantiferonGoldTBTestBP);
			selectAlbuminKN.selectByVisibleText("Not Performed");

			// Urine Analysis
			Select SelectAlbumin = new Select(drpAlbumin);
			SelectAlbumin.selectByVisibleText("Not Performed");

			Select selectSugar = new Select(drpSugar);
			selectSugar.selectByVisibleText("Not Performed");

			Select selectBloodUrine = new Select(drpBloodForUrine);
			selectBloodUrine.selectByVisibleText("Not Performed");

			Select selectNitratesKN = new Select(drpNitrates);
			selectNitratesKN.selectByVisibleText("Not Performed");

			Select selectLeukocytes = new Select(drpLeukocytes);
			selectLeukocytes.selectByVisibleText("Not Performed");

			Select selectKetones = new Select(drpKetones);
			selectKetones.selectByVisibleText("Not Performed");

			// Stool Analysis
		} else if (companyName.equalsIgnoreCase("MY COMPANY")) {
			WaitUtils.sleep(2);

			// Para Clinical Examination
			
			Select selectECG = new Select(drpECG);
			selectECG.selectByVisibleText("Not Performed");
			
			Select selectChestXRay = new Select(drpChestXRayMY);
			selectChestXRay.selectByVisibleText("Not Performed");

			Select selectFunctionalRespiratoryTesting = new Select(drpFunctionalRespiratoryTestingMY);
			selectFunctionalRespiratoryTesting.selectByVisibleText("Not Performed");

			// Blood Analysis
			checkBoxRBC.click();
			checkBoxWBC.click();
			checkBoxNEUTRO.click();
			checkBoxEOSINO.click();
			checkBoxBASO.click();
			checkBoxLYMPHO.click();
			checkBoxMONO.click();
			checkBoxHEMATOCRIT.click();
			checkBoxHEMOGLOBIN.click();
			checkBoxESR.click();
			checkBoxSGOTASAT.click();
			checkBoxSGPTALAT.click();
			checkBoxGAMMAGT.click();
			checkBoxGLYCEMIA.click();
			checkBoxCHOLESTEROL.click();
			checkBoxHDL.click();
			checkBoxLDL.click();
			checkBoxCREATININE.click();
			checkBoxURICACID.click();
			checkBoxTRIGLYCERIDES.click();

			// Eyes

			// Additional Blood Test
			checkBoxVitaminD2.click();
			checkBoxHbA1cMY.click();
			Select SelQuantiferonGoldTBTest = new Select(drpQuantiferonGoldTBTest);
			SelQuantiferonGoldTBTest.selectByVisibleText("Not Performed");
			

			// Urine Analysis
			Select SelectAlbumin1 = new Select(drpAlbumin);
			SelectAlbumin1.selectByVisibleText("Not Performed");

			Select selectSugar1 = new Select(drpSugar);
			selectSugar1.selectByVisibleText("Not Performed");

			Select SelectBlood = new Select(drpNitrates);
			SelectBlood.selectByVisibleText("Not Performed");

			Select SelectNitrates1 = new Select(drpBloodForUrine);
			SelectNitrates1.selectByVisibleText("Not Performed");

			Select selectLeukocytes1 = new Select(drpLeukocytes);
			selectLeukocytes1.selectByVisibleText("Not Performed");

			Select SelectKetones1 = new Select(drpKetones);
			SelectKetones1.selectByVisibleText("Not Performed");

			// Stool Analysis
			Select selectBloodForStool = new Select(drpBloodForStoolMY);
			selectBloodForStool.selectByVisibleText("Not Performed");
			
			Select selectParasitesMY = new Select(drpParasitesMY);
			selectParasitesMY.selectByVisibleText("Not Performed");

		} else if (companyName.equalsIgnoreCase("NOVARTIS")) {
			WaitUtils.sleep(2);

			// Para Clinical Examination
			Select selectECGRT = new Select(drpECG);
			selectECGRT.selectByVisibleText("Not Performed");

			Select selectTreadmill = new Select(drpTreadmillKN);
			selectTreadmill.selectByVisibleText("Not Performed");

			Select selectPAPSmear = new Select(drpPAPSmearNOV);
			selectPAPSmear.selectByVisibleText("Not Performed");

			// Blood Analysis
			checkBoxFerritin.click();
			checkBoxRBCRTKN.click();
			checkBoxWBCRTKN.click();
			checkBoxNEUTRORTKN.click();
			checkBoxEOSINORTKN.click();
			checkBoxBASORTKN.click();
			checkBoxLYMPHORTKN.click();
			checkBoxMONORTKN.click();
			checkBoxHEMATOCRITRTKN.click();
			checkBoxHEMOGLOBINRTKN.click();
			checkBoxESRRTKN.click();
			checkBoxSGOTASATRTKN.click();
			checkBoxSGPTALATRTKN.click();
			checkBoxGAMMAGTRTKN.click();
			checkBoxGLYCEMIARTKN.click();
			checkBoxCHOLESTEROLRTKN.click();
			checkBoxHDLRTKN.click();
			checkBoxLDLRTKN.click();
			checkBoxCREATININERTKN.click();
			checkBoxURICACIDRTKN.click();
			checkBoxTRIGLYCERIDESRTKN.click();

			// Eyes

			// Additional Blood Test
			checkBoxHbA1c.click();
			checkBoxPlateletCount.click();
			checkBoxAlkalinePhosphataseMY.click();

			// Urine Analysis
			Select SelectAlbuminKN = new Select(drpAlbumin);
			SelectAlbuminKN.selectByVisibleText("Not Performed");

			Select SelectSugar = new Select(drpSugar);
			SelectSugar.selectByVisibleText("Not Performed");

			Select SelectBloodUrine = new Select(drpBloodForUrine);
			SelectBloodUrine.selectByVisibleText("Not Performed");

			Select SelectNitratesKN = new Select(drpNitrates);
			SelectNitratesKN.selectByVisibleText("Not Performed");

			Select SelectLeukocytes = new Select(drpLeukocytes);
			SelectLeukocytes.selectByVisibleText("Not Performed");

			Select SelectKetones = new Select(drpKetones);
			SelectKetones.selectByVisibleText("Not Performed");

			// Stool Analysis
			Select SelectBloodStool = new Select(drpBloodForStoolMIAL);
			SelectBloodStool.selectByVisibleText("Not Performed");
		}

		else if (companyName.equalsIgnoreCase("ARKEMA")) {
			WaitUtils.sleep(2);

			// Para Clinical Examination
			Select selectECGRT = new Select(drpECG);
			selectECGRT.selectByVisibleText("Not Performed");

			Select selectChestXRayRT = new Select(drpChestXRayBP);
			selectChestXRayRT.selectByVisibleText("Not Performed");

			// Blood Analysis
			checkBoxRBC.click();
			checkBoxWBC.click();
			checkBoxNEUTRO.click();
			checkBoxEOSINO.click();
			checkBoxBASO.click();
			checkBoxLYMPHO.click();
			checkBoxMONO.click();
			checkBoxHEMATOCRIT.click();
			checkBoxHEMOGLOBIN.click();
			checkBoxESR.click();
			checkBoxSGOTASAT.click();
			checkBoxSGPTALAT.click();
			checkBoxGAMMAGT.click();
			checkBoxGLYCEMIA.click();
			checkBoxCHOLESTEROL.click();
			checkBoxHDL.click();
			checkBoxLDL.click();
			checkBoxCREATININE.click();
			checkBoxURICACID.click();
			checkBoxTRIGLYCERIDES.click();

			// Eyes

			// Additional Blood Test
			checkBoxAlkalinePhosphataseMI.click();

			// Urine Analysis
			Select SelectAlbuminKN = new Select(drpAlbumin);
			SelectAlbuminKN.selectByVisibleText("Not Performed");

			Select SelectSugar = new Select(drpSugar);
			SelectSugar.selectByVisibleText("Not Performed");

			Select SelectBloodUrine = new Select(drpBloodForUrine);
			SelectBloodUrine.selectByVisibleText("Not Performed");

			Select SelectNitratesKN = new Select(drpNitrates);
			SelectNitratesKN.selectByVisibleText("Not Performed");

			Select SelectLeukocytes = new Select(drpLeukocytes);
			SelectLeukocytes.selectByVisibleText("Not Performed");

			Select SelectKetones = new Select(drpKetones);
			SelectKetones.selectByVisibleText("Not Performed");

			// Stool Analysis
		}

		else if (companyName.equalsIgnoreCase("BioMerieux")) {
			WaitUtils.sleep(2);

			// Para Clinical Examination
			Select selectECGRT = new Select(drpECG);
			selectECGRT.selectByVisibleText("Not Performed");

			// Blood Analysis
			checkBoxRBC.click();
			checkBoxWBC.click();
			checkBoxNEUTRO.click();
			checkBoxEOSINO.click();
			checkBoxBASO.click();
			checkBoxLYMPHO.click();
			checkBoxMONO.click();
			checkBoxHEMATOCRIT.click();
			checkBoxHEMOGLOBIN.click();
			checkBoxESR.click();
			checkBoxSGOTASAT.click();
			checkBoxSGPTALAT.click();
			checkBoxGAMMAGT.click();
			checkBoxGLYCEMIA.click();
			checkBoxCHOLESTEROL.click();
			checkBoxHDL.click();
			checkBoxLDL.click();
			checkBoxCREATININE.click();
			checkBoxURICACID.click();
			checkBoxTRIGLYCERIDES.click();

			// Eyes

			// Additional Blood Test
			checkBoxHbA1c.click();
			checkBoxAlkalinePhosphataseRT.click();

			// Urine Analysis
			Select SelectPCRChlamydiaGonorrhea = new Select(drpUrinePCRChlamydiaGonorrheaBM);
			SelectPCRChlamydiaGonorrhea.selectByVisibleText("Not Performed");

			Select SelectAlbuminKN = new Select(drpAlbuminBM);
			SelectAlbuminKN.selectByVisibleText("Not Performed");

			Select SelectSugar = new Select(drpSugarBM);
			SelectSugar.selectByVisibleText("Not Performed");

			Select SelectBloodUrine = new Select(drpBloodForUrineBM);
			SelectBloodUrine.selectByVisibleText("Not Performed");

			Select SelectNitratesKN = new Select(drpNitratesBM);
			SelectNitratesKN.selectByVisibleText("Not Performed");

			Select SelectLeukocytes = new Select(drpLeukocytesBM);
			SelectLeukocytes.selectByVisibleText("Not Performed");

			Select SelectKetones = new Select(drpKetonesBM);
			SelectKetones.selectByVisibleText("Not Performed");

			// Stool Analysis
			Select SelectBloodStool = new Select(drpBloodForStoolMIAL);
			SelectBloodStool.selectByVisibleText("Not Performed");
		}

		else if (companyName.equalsIgnoreCase("CGG International S.A.")) {
			WaitUtils.sleep(2);

			// Para Clinical Examination
			Select selectECGRT = new Select(drpECG);
			selectECGRT.selectByVisibleText("Not Performed");

			Select selectTreadmill = new Select(drpTreadmillKN);
			selectTreadmill.selectByVisibleText("Not Performed");

			Select selectChestXRayRT = new Select(drpChestXRay);
			selectChestXRayRT.selectByVisibleText("Not Performed");

			// Blood Analysis
			checkBoxRBC.click();
			checkBoxWBC.click();
			checkBoxNEUTRO.click();
			checkBoxEOSINO.click();
			checkBoxBASO.click();
			checkBoxLYMPHO.click();
			checkBoxMONO.click();
			checkBoxHEMATOCRIT.click();
			checkBoxHEMOGLOBIN.click();
			checkBoxESR.click();
			checkBoxSGOTASAT.click();
			checkBoxSGPTALAT.click();
			checkBoxGAMMAGT.click();
			checkBoxGLYCEMIA.click();
			checkBoxCHOLESTEROL.click();
			checkBoxHDL.click();
			checkBoxLDL.click();
			checkBoxCREATININE.click();
			checkBoxURICACID.click();
			checkBoxTRIGLYCERIDES.click();

			// Eyes

			// Additional Blood Test
			checkBoxAlkalinePhosphataseMI.click();

			// Urine Analysis
			Select SelectAlbuminKN = new Select(drpAlbumin);
			SelectAlbuminKN.selectByVisibleText("Not Performed");

			Select SelectSugar = new Select(drpSugar);
			SelectSugar.selectByVisibleText("Not Performed");

			Select SelectBloodUrine = new Select(drpBloodForUrine);
			SelectBloodUrine.selectByVisibleText("Not Performed");

			Select SelectNitratesKN = new Select(drpNitrates);
			SelectNitratesKN.selectByVisibleText("Not Performed");

			Select SelectLeukocytes = new Select(drpLeukocytes);
			SelectLeukocytes.selectByVisibleText("Not Performed");

			Select SelectKetones = new Select(drpKetones);
			SelectKetones.selectByVisibleText("Not Performed");

			// Stool Analysis

		}
	}

	public void savelabReport() throws InterruptedException {
		JavaScriptUtils.moveToElement(driver, saveButtonForLabAnalysis);
		saveButtonForLabAnalysis.click();
		driver.switchTo().defaultContent();
	}

	// Fitness Conclusion Tab
	public void SelectFitnessConclusionTab() {
		fitnessConclusionTab.click();
		WaitUtils.sleep(5);
	}

	public void SelectFitnesStatus(String FitnesStatus) {
		driver.switchTo().frame(0); // Switching to the frame
		Select selectFitnesStatus = new Select(dropFitnessStatus);
		selectFitnesStatus.selectByIndex(1);
	}

	public void enterPhysicianCommentsForEmployee(String comments) {
		physicianComments.sendKeys(comments);
	}

	public void saveButtonForforSavingPhysicianComments() throws InterruptedException {
		JavaScriptUtils.moveToElement(driver, submitButton);
		submitButton.click();
		WaitUtils.sleep(2);
		driver.switchTo().defaultContent(); // Switching to the frame
	}

	public void SelectCase(String TypeOfCase) {
		String companyName = driver
				.findElement(By.xpath("//div[@class='MedicalNormalText']//table/tbody/tr/td[2]/table/tbody/tr/td[2]"))
				.getText();
		driver.switchTo().frame(0); // Switching to the frame
		if (companyName.equalsIgnoreCase("Frontex")) {
			driver.findElement(By.id("lstClientReviewerStatus_0")).click();
			driver.findElement(By.id("txtClientReviewerComment")).sendKeys("Comments for Employee from client review");

		} else {

			Select selectCaseOfType = new Select(dropTypeofCase);
			selectCaseOfType.selectByVisibleText(TypeOfCase);
			checkBoxFitnessStatusIntlSOS.click();
			CommentsforEmployee.sendKeys("Comments from Intl. SOS");
		}
	}

	/*
	 * public void SelectFitnesStatus() { checkBoxFitnessStatusIntlSOS.click(); }
	 * 
	 * public void selectComments(String comments) {
	 * CommentsforEmployee.sendKeys(comments); }
	 */

	public void SubmitButtonForCreateExam() {
		submitButton.click();
	}

	public void employeeCreatedSuccessMsg() throws InterruptedException {
		driver.switchTo().defaultContent(); // Switching to the frame
		WaitUtils.sleep(3);
		driver.switchTo().frame(0); // Switching to the frame
		String SuccessMsg = "Thank you. The comments have been saved successfully.";
		String FailureMsg = "Please select at least one";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.contains(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}
	}

}
