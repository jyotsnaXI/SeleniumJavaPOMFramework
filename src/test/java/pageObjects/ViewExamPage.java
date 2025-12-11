package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.JavaScriptUtils;
import utils.TestBase;
import utils.WaitUtils;

public class ViewExamPage extends TestBase {

	public WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public ViewExamPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnViewExam")
	WebElement viewExamButton;
	@FindBy(id = "divPhysiciaReportTab")
	WebElement physicianReportTab;
	@FindBy(id = "divLabAnalysisTab")
	WebElement labAnalysisTab;
	@FindBy(id = "divFitnessConclusionTab")
	WebElement fitnessConclusionTab;
	@FindBy(id = "btnSavePhysicianReport")
	WebElement savePhysicianReportButton;
	@FindBy(id = "btnSaveLabAnalysis")
	WebElement saveLabAnalysisButton;
	@FindBy(id = "btnSubmit")
	WebElement finalSaveButton;

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

	// Physician's Report Tab - Vision - BP
	@FindBy(id = "gdvVisionAndHearing_ctl10_ddlPhysicianResult")
	WebElement drpColorVisionBP;

	// Physician's Report Tab - Vision - AL
	@FindBy(id = "gdvVisionAndHearing_ctl10_ddlPhysicianResult")
	WebElement drpAudiogramAL;

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

	// Lab Analysis - Additional Blood Test - MY
	@FindBy(id = "gdvAdditionalBloodTest_ctl02_chkAdditionalBloodTestPerformed")
	WebElement checkBoxHbA1cAL;
	@FindBy(id = "gdvAdditionalBloodTest_ctl02_chkAdditionalBloodTestPerformed")
	WebElement checkBoxHbA1cMY;
	@FindBy(id = "gdvAdditionalBloodTest_ctl03_ddlLabAnalysisResult")
	WebElement drpQuantiferonGoldTBTest;
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
	WebElement drpParasitesMY;
	@FindBy(id = "gdvStoolAnalysis_ctl03_ddlLabAnalysisResult")
	WebElement drpBloodForStoolMY;
	@FindBy(id = "gdvStoolAnalysis_ctl02_ddlLabAnalysisResult")
	WebElement drpBloodForStoolMI;
	
	// Fitness Conclusion
	@FindBy(id = "ddlProviderFitnessStatus")
	WebElement drpFitnessStatus;
	@FindBy(id = "txtProviderComment")
	WebElement physicianComments;

	// Intl. SOS Review
	@FindBy(id = "ddlTypeofCase")
	WebElement drpTypeofCase;
	@FindBy(id = "lstISOSReviewerStatus_0")
	WebElement checkBoxFitnessStatusIntlSOS;
	@FindBy(id = "txtISOSReviewerComment")
	WebElement CommentsforEmployee;
	@FindBy(id = "btnSubmit")
	WebElement submitForSOSREview;

	public void clickViewExam() {
		viewExamButton.click();
	}

	public void clickPhysicianReportTab() throws InterruptedException {
		physicianReportTab.click();
		// WaitUtils.sleep(5);
		WaitUtils.waitForPageLoad(driver);
		JavaScriptUtils.scrollDown(driver);
	}

	// Switching to the frame - Physician Report Tab //
	// ****************************************************************************
	public void modifyAllDropdownAndCheckboxPhysicianReportTab() {

		String companyName = driver
				.findElement(By.xpath("//div[@class='MedicalNormalText']//table/tbody/tr/td[2]/table/tbody/tr/td[2]"))
				.getText();
		driver.switchTo().frame(0);
		if (companyName.equalsIgnoreCase("Schlumberger")) {
			// Medical Examination

			if (!drpEyesAndPupils.isSelected()) {
				Select selectEyesAndPupils = new Select(drpEyesAndPupils);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpEarNoseThroat.isSelected()) {
				Select selectNoseThroat = new Select(drpEarNoseThroat);
				selectNoseThroat.selectByVisibleText("Not Performed");
			}

			if (!drpTeethAndMouth.isSelected()) {
				Select selectTeethAndMouth = new Select(drpTeethAndMouth);
				selectTeethAndMouth.selectByVisibleText("Not Performed");
			}

			if (!drpLungsAndChest.isSelected()) {
				Select selectLungsAndChest = new Select(drpLungsAndChest);
				selectLungsAndChest.selectByVisibleText("Not Performed");
			}

			if (!drpCardiovascular.isSelected()) {
				Select selectCardiovascular = new Select(drpCardiovascular);
				selectCardiovascular.selectByVisibleText("Not Performed");
			}

			if (!drpAbdoViscera.isSelected()) {
				Select selectAbdoViscera = new Select(drpAbdoViscera);
				selectAbdoViscera.selectByVisibleText("Not Performed");
			}

			if (!drpHernialOrifices.isSelected()) {
				Select selectHernialOrifices = new Select(drpHernialOrifices);
				selectHernialOrifices.selectByVisibleText("Not Performed");
			}

			if (!drpAnusAndRectum.isSelected()) {
				Select selectAnusAndRectum = new Select(drpAnusAndRectum);
				selectAnusAndRectum.selectByVisibleText("Not Performed");
			}

			if (!drpGenitoUrinary.isSelected()) {
				Select selectGenitoUrinary = new Select(drpGenitoUrinary);
				selectGenitoUrinary.selectByVisibleText("Not Performed");
			}

			if (!drpExtremities.isSelected()) {
				Select selectExtremities = new Select(drpExtremities);
				selectExtremities.selectByVisibleText("Not Performed");
			}

			if (!drpMusculoskeletal.isSelected()) {
				Select selectMusculoSkeletal = new Select(drpMusculoskeletal);
				selectMusculoSkeletal.selectByVisibleText("Not Performed");
			}

			if (!drpSkinVaricoseveins.isSelected()) {
				Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveins);
				selectSkinVaricoseVeins.selectByVisibleText("Not Performed");
			}

			if (!drpNeurologicalMentalfitness.isSelected()) {
				Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitness);
				selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");
			}

			if (!drpBreast.isSelected()) {
				Select selectBreast = new Select(drpBreast);
				selectBreast.selectByVisibleText("Not Performed");
			}

			if (!drpEndocrinology.isSelected()) {
				Select selectEndocrinology = new Select(drpEndocrinology);
				selectEndocrinology.selectByVisibleText("Not Performed");
			}

			if (!drpLymphnodes.isSelected()) {
				Select selectLymphNodes = new Select(drpLymphnodes);
				selectLymphNodes.selectByVisibleText("Not Performed");
			}

			// Physician's Report Tab - Other Information
			if (!checkBoxHeight.isSelected())
				checkBoxHeight.click();

			if (!checkBoxWeight.isSelected())
				checkBoxWeight.click();

			if (!checkBoxBloodPressureSYS.isSelected())
				checkBoxBloodPressureSYS.click();

			if (!checkBoxBloodPressureDIA.isSelected())
				checkBoxBloodPressureDIA.click();

			if (!checkBoxPulse.isSelected())
				checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			if (!drpHearingRight.isSelected()) {
				Select hearingRight = new Select(drpHearingRight);
				hearingRight.selectByVisibleText("Not Performed");
			}

			if (!drpHearingLeft.isSelected()) {
				Select hearingLeft = new Select(drpHearingLeft);
				hearingLeft.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionRight.isSelected()) {
				Select visionRight = new Select(drpDistantVisionRight);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionLeft.isSelected()) {
				Select DistantvisionLeft = new Select(drpDistantVisionLeft);
				DistantvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionRight.isSelected()) {
				Select visionRight = new Select(drpNearVisionRight);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionLeft.isSelected()) {
				Select NearvisionLeft = new Select(drpNearVisionLeft);
				NearvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpTestedWithGlasses.isSelected()) {
				Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
				selectTestedWithGlasses.selectByVisibleText("Not Performed");
			}

			if (!drpColorVision.isSelected()) {
				Select selectColoVision = new Select(drpColorVision);
				selectColoVision.selectByVisibleText("Not Performed");
			}

			if (!drpAudiogram.isSelected()) {
				Select selectAudiogram = new Select(drpAudiogram);
				selectAudiogram.selectByVisibleText("Not Performed");
			}

		} else if (companyName.equalsIgnoreCase("bp International Limited")) {
			// Medical Examination
			if (!drpEyesAndPupils.isSelected()) {
				Select selectEyesAndPupils = new Select(drpEyesAndPupils);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpEarNoseThroat.isSelected()) {
				Select selectNoseThroat = new Select(drpEarNoseThroat);
				selectNoseThroat.selectByVisibleText("Not Performed");
			}

			if (!drpTeethAndMouth.isSelected()) {
				Select selectTeethAndMouth = new Select(drpTeethAndMouth);
				selectTeethAndMouth.selectByVisibleText("Not Performed");
			}

			if (!drpLungsAndChest.isSelected()) {
				Select selectLungsAndChest = new Select(drpLungsAndChest);
				selectLungsAndChest.selectByVisibleText("Not Performed");
			}

			if (!drpCardiovascular.isSelected()) {
				Select selectCardiovascular = new Select(drpCardiovascular);
				selectCardiovascular.selectByVisibleText("Not Performed");
			}

			if (!drpHernialOrificesBP.isSelected()) {
				Select selectHernialOrifices = new Select(drpHernialOrificesBP);
				selectHernialOrifices.selectByVisibleText("Not Performed");
			}

			if (!drpAnusAndRectumBP.isSelected()) {
				Select selectAnusAndRectum = new Select(drpAnusAndRectumBP);
				selectAnusAndRectum.selectByVisibleText("Not Performed");
			}

			if (!drpGenitoUrinaryBP.isSelected()) {
				Select selectGenitoUrinary = new Select(drpGenitoUrinaryBP);
				selectGenitoUrinary.selectByVisibleText("Not Performed");
			}

			if (!drpExtremitiesBP.isSelected()) {
				Select selectExtremities = new Select(drpExtremitiesBP);
				selectExtremities.selectByVisibleText("Not Performed");
			}

			if (!drpMusculoskeletalBP.isSelected()) {
				Select selectMusculoSkeletal = new Select(drpMusculoskeletalBP);
				selectMusculoSkeletal.selectByVisibleText("Not Performed");
			}

			if (!drpSkinVaricoseveinsBP.isSelected()) {
				Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveinsBP);
				selectSkinVaricoseVeins.selectByVisibleText("Not Performed");
			}

			if (!drpNeurologicalMentalfitnessBP.isSelected()) {
				Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitnessBP);
				selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");
			}

			if (!drpBreastBP.isSelected()) {
				Select selectBreast = new Select(drpBreastBP);
				selectBreast.selectByVisibleText("Not Performed");
			}

			if (!drpEndocrinologyBP.isSelected()) {
				Select selectEndocrinology = new Select(drpEndocrinologyBP);
				selectEndocrinology.selectByVisibleText("Not Performed");
			}

			if (!drpBloodDiseaseBP.isSelected()) {
				Select selectBloodDisease = new Select(drpBloodDiseaseBP);
				selectBloodDisease.selectByVisibleText("Not Performed");
			}

			// Vision (with corrective lenses if worn) and Hearing

			if (!drpHearingRight.isSelected()) {
				Select hearingRight = new Select(drpHearingRight);
				hearingRight.selectByVisibleText("Not Performed");
			}

			if (!drpHearingLeft.isSelected()) {
				Select hearingLeft = new Select(drpHearingLeft);
				hearingLeft.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionRight.isSelected()) {
				Select visionRight = new Select(drpDistantVisionRight);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionLeft.isSelected()) {
				Select DistantvisionLeft = new Select(drpDistantVisionLeft);
				DistantvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionRight.isSelected()) {
				Select visionRight = new Select(drpNearVisionRight);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionLeft.isSelected()) {
				Select NearvisionLeft = new Select(drpNearVisionLeft);
				NearvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpTestedWithGlasses.isSelected()) {
				Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
				selectTestedWithGlasses.selectByVisibleText("Not Performed");
			}

			if (!drpColorVision.isSelected()) {
				Select selectColoVision = new Select(drpColorVision);
				selectColoVision.selectByVisibleText("Not Performed");
			}

			if (!drpColorVision.isSelected()) {
				Select selectAudiogram = new Select(drpColorVisionBP);
				selectAudiogram.selectByVisibleText("Not Performed");
			}

			// Physician's Report Tab - Other Information
			if (!checkBoxHeight.isSelected())
				checkBoxHeight.click();

			if (!checkBoxWeight.isSelected())
				checkBoxWeight.click();

			if (!checkBoxBloodPressureSYS.isSelected())
				checkBoxBloodPressureSYS.click();

			if (!checkBoxBloodPressureDIA.isSelected())
				checkBoxBloodPressureDIA.click();

			if (!checkBoxPulse.isSelected())
				checkBoxPulse.click();

		} else if (companyName.equalsIgnoreCase("SBM International Personnel Services SA")) {
			// Nothing to select as UI page is empty

		} else if (companyName.equalsIgnoreCase("Michelin")) {

			// Medical Examination
			if (!drpEyesAndPupils.isSelected()) {
				Select selectEyesAndPupils = new Select(drpEyesAndPupils);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpEarNoseThroat.isSelected()) {
				Select selectNoseThroat = new Select(drpEarNoseThroat);
				selectNoseThroat.selectByVisibleText("Not Performed");
			}

			if (!drpTeethAndMouth.isSelected()) {
				Select selectTeethAndMouth = new Select(drpTeethAndMouth);
				selectTeethAndMouth.selectByVisibleText("Not Performed");
			}

			if (!drpLungsAndChest.isSelected()) {
				Select selectLungsAndChest = new Select(drpLungsAndChest);
				selectLungsAndChest.selectByVisibleText("Not Performed");
			}

			if (!drpCardiovascular.isSelected()) {
				Select selectCardiovascular = new Select(drpCardiovascular);
				selectCardiovascular.selectByVisibleText("Not Performed");
			}

			if (!drpAbdoViscera.isSelected()) {
				Select selectAbdoViscera = new Select(drpAbdoViscera);
				selectAbdoViscera.selectByVisibleText("Not Performed");
			}

			if (!drpHernialOrifices.isSelected()) {
				Select selectHernialOrifices = new Select(drpHernialOrifices);
				selectHernialOrifices.selectByVisibleText("Not Performed");
			}

			if (!drpAnusAndRectum.isSelected()) {
				Select selectAnusAndRectum = new Select(drpAnusAndRectum);
				selectAnusAndRectum.selectByVisibleText("Not Performed");
			}

			if (!drpGenitoUrinary.isSelected()) {
				Select selectGenitoUrinary = new Select(drpGenitoUrinary);
				selectGenitoUrinary.selectByVisibleText("Not Performed");
			}

			if (!drpExtremities.isSelected()) {
				Select selectExtremities = new Select(drpExtremities);
				selectExtremities.selectByVisibleText("Not Performed");
			}

			if (!drpMusculoskeletal.isSelected()) {
				Select selectMusculoSkeletal = new Select(drpMusculoskeletal);
				selectMusculoSkeletal.selectByVisibleText("Not Performed");
			}

			if (!drpSkinVaricoseveins.isSelected()) {
				Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveins);
				selectSkinVaricoseVeins.selectByVisibleText("Not Performed");
			}

			if (!drpNeurologicalMentalfitness.isSelected()) {
				Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitness);
				selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");
			}

			if (!drpBreast.isSelected()) {
				Select selectBreast = new Select(drpBreast);
				selectBreast.selectByVisibleText("Not Performed");
			}

			if (!drpEndocrinology.isSelected()) {
				Select selectEndocrinology = new Select(drpEndocrinology);
				selectEndocrinology.selectByVisibleText("Not Performed");
			}

			if (!drpLymphnodes.isSelected()) {
				Select selectLymphNodes = new Select(drpLymphnodes);
				selectLymphNodes.selectByVisibleText("Not Performed");
			}

			// Physician's Report Tab - Other Information
			if (!checkBoxHeight.isSelected())
				checkBoxHeight.click();

			if (!checkBoxWeight.isSelected())
				checkBoxWeight.click();

			if (!checkBoxBloodPressureSYS.isSelected())
				checkBoxBloodPressureSYS.click();

			if (!checkBoxBloodPressureDIA.isSelected())
				checkBoxBloodPressureDIA.click();

			if (!checkBoxPulse.isSelected())
				checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			if (!drpHearingRight.isSelected()) {
				Select hearingRight = new Select(drpHearingRight);
				hearingRight.selectByVisibleText("Not Performed");
			}

			if (!drpHearingLeft.isSelected()) {
				Select hearingLeft = new Select(drpHearingLeft);
				hearingLeft.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionRight.isSelected()) {
				Select visionRight = new Select(drpDistantVisionRight);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionLeft.isSelected()) {
				Select DistantvisionLeft = new Select(drpDistantVisionLeft);
				DistantvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionRight.isSelected()) {
				Select visionRight = new Select(drpNearVisionRight);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionLeft.isSelected()) {
				Select NearvisionLeft = new Select(drpNearVisionLeft);
				NearvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpTestedWithGlasses.isSelected()) {
				Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
				selectTestedWithGlasses.selectByVisibleText("Not Performed");
			}

			if (!drpColorVision.isSelected()) {
				Select selectColoVision = new Select(drpColorVision);
				selectColoVision.selectByVisibleText("Not Performed");
			}

			if (!drpAudiogram.isSelected()) {
				Select selectAudiogram = new Select(drpAudiogram);
				selectAudiogram.selectByVisibleText("Not Performed");
			}

		} else if (companyName.equalsIgnoreCase("Richemont")) {
			// Medical Examination

			if (!drpEyesAndPupils.isSelected()) {
				Select selectEyesAndPupils = new Select(drpEyesAndPupils);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpEarNoseThroat.isSelected()) {
				Select selectNoseThroat = new Select(drpEarNoseThroat);
				selectNoseThroat.selectByVisibleText("Not Performed");
			}

			if (!drpTeethAndMouth.isSelected()) {
				Select selectTeethAndMouth = new Select(drpTeethAndMouth);
				selectTeethAndMouth.selectByVisibleText("Not Performed");
			}

			if (!drpLungsAndChest.isSelected()) {
				Select selectLungsAndChest = new Select(drpLungsAndChest);
				selectLungsAndChest.selectByVisibleText("Not Performed");
			}

			if (!drpCardiovascular.isSelected()) {
				Select selectCardiovascular = new Select(drpCardiovascular);
				selectCardiovascular.selectByVisibleText("Not Performed");
			}

			if (!drpAbdoViscera.isSelected()) {
				Select selectAbdoViscera = new Select(drpAbdoViscera);
				selectAbdoViscera.selectByVisibleText("Not Performed");
			}

			if (!drpHernialOrifices.isSelected()) {
				Select selectHernialOrifices = new Select(drpHernialOrifices);
				selectHernialOrifices.selectByVisibleText("Not Performed");
			}

			if (!drpAnusAndRectum.isSelected()) {
				Select selectAnusAndRectum = new Select(drpAnusAndRectum);
				selectAnusAndRectum.selectByVisibleText("Not Performed");
			}

			if (!drpGenitoUrinary.isSelected()) {
				Select selectGenitoUrinary = new Select(drpGenitoUrinary);
				selectGenitoUrinary.selectByVisibleText("Not Performed");
			}

			if (!drpExtremities.isSelected()) {
				Select selectExtremities = new Select(drpExtremities);
				selectExtremities.selectByVisibleText("Not Performed");
			}

			if (!drpMusculoskeletal.isSelected()) {
				Select selectMusculoSkeletal = new Select(drpMusculoskeletal);
				selectMusculoSkeletal.selectByVisibleText("Not Performed");
			}

			if (!drpSkinVaricoseveins.isSelected()) {
				Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveins);
				selectSkinVaricoseVeins.selectByVisibleText("Not Performed");
			}

			if (!drpNeurologicalMentalfitness.isSelected()) {
				Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitness);
				selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");
			}

			if (!drpBreast.isSelected()) {
				Select selectBreast = new Select(drpBreast);
				selectBreast.selectByVisibleText("Not Performed");
			}

			if (!drpEndocrinology.isSelected()) {
				Select selectEndocrinology = new Select(drpEndocrinology);
				selectEndocrinology.selectByVisibleText("Not Performed");
			}

			if (!drpLymphnodes.isSelected()) {
				Select selectLymphNodes = new Select(drpLymphnodes);
				selectLymphNodes.selectByVisibleText("Not Performed");
			}

			// Physician's Report Tab - Other Information
			if (!checkBoxHeight.isSelected())
				checkBoxHeight.click();

			if (!checkBoxWeight.isSelected())
				checkBoxWeight.click();

			if (!checkBoxBloodPressureSYS.isSelected())
				checkBoxBloodPressureSYS.click();

			if (!checkBoxBloodPressureDIA.isSelected())
				checkBoxBloodPressureDIA.click();

			if (!checkBoxPulse.isSelected())
				checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			if (!drpHearingRight.isSelected()) {
				Select hearingRight = new Select(drpHearingRight);
				hearingRight.selectByVisibleText("Not Performed");
			}

			if (!drpHearingLeft.isSelected()) {
				Select hearingLeft = new Select(drpHearingLeft);
				hearingLeft.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionRight.isSelected()) {
				Select visionRight = new Select(drpDistantVisionRight);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionLeft.isSelected()) {
				Select DistantvisionLeft = new Select(drpDistantVisionLeft);
				DistantvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionRight.isSelected()) {
				Select visionRight = new Select(drpNearVisionRight);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionLeft.isSelected()) {
				Select NearvisionLeft = new Select(drpNearVisionLeft);
				NearvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpTestedWithGlasses.isSelected()) {
				Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
				selectTestedWithGlasses.selectByVisibleText("Not Performed");
			}

			if (!drpColorVision.isSelected()) {
				Select selectColoVision = new Select(drpColorVision);
				selectColoVision.selectByVisibleText("Not Performed");
			}

			if (!drpAudiogram.isSelected()) {
				Select selectAudiogram = new Select(drpAudiogram);
				selectAudiogram.selectByVisibleText("Not Performed");
			}

		} else if (companyName.equalsIgnoreCase("MAINBY SA")) {
			// Medical Examination

			if (!drpEyesAndPupils.isSelected()) {
				Select selectEyesAndPupils = new Select(drpEyesAndPupils);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpEarNoseThroat.isSelected()) {
				Select selectNoseThroat = new Select(drpEarNoseThroat);
				selectNoseThroat.selectByVisibleText("Not Performed");
			}

			if (!drpTeethAndMouth.isSelected()) {
				Select selectTeethAndMouth = new Select(drpTeethAndMouth);
				selectTeethAndMouth.selectByVisibleText("Not Performed");
			}

			if (!drpLungsAndChest.isSelected()) {
				Select selectLungsAndChest = new Select(drpLungsAndChest);
				selectLungsAndChest.selectByVisibleText("Not Performed");
			}

			if (!drpCardiovascular.isSelected()) {
				Select selectCardiovascular = new Select(drpCardiovascular);
				selectCardiovascular.selectByVisibleText("Not Performed");
			}

			if (!drpAbdoViscera.isSelected()) {
				Select selectAbdoViscera = new Select(drpAbdoViscera);
				selectAbdoViscera.selectByVisibleText("Not Performed");
			}

			if (!drpHernialOrifices.isSelected()) {
				Select selectHernialOrifices = new Select(drpHernialOrifices);
				selectHernialOrifices.selectByVisibleText("Not Performed");
			}

			if (!drpAnusAndRectum.isSelected()) {
				Select selectAnusAndRectum = new Select(drpAnusAndRectum);
				selectAnusAndRectum.selectByVisibleText("Not Performed");
			}

			if (!drpGenitoUrinary.isSelected()) {
				Select selectGenitoUrinary = new Select(drpGenitoUrinary);
				selectGenitoUrinary.selectByVisibleText("Not Performed");
			}

			if (!drpExtremities.isSelected()) {
				Select selectExtremities = new Select(drpExtremities);
				selectExtremities.selectByVisibleText("Not Performed");
			}

			if (!drpMusculoskeletal.isSelected()) {
				Select selectMusculoSkeletal = new Select(drpMusculoskeletal);
				selectMusculoSkeletal.selectByVisibleText("Not Performed");
			}

			if (!drpSkinVaricoseveins.isSelected()) {
				Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveins);
				selectSkinVaricoseVeins.selectByVisibleText("Not Performed");
			}

			if (!drpNeurologicalMentalfitness.isSelected()) {
				Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitness);
				selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");
			}

			if (!drpBreast.isSelected()) {
				Select selectBreast = new Select(drpBreast);
				selectBreast.selectByVisibleText("Not Performed");
			}

			if (!drpEndocrinology.isSelected()) {
				Select selectEndocrinology = new Select(drpEndocrinology);
				selectEndocrinology.selectByVisibleText("Not Performed");
			}

			if (!drpLymphnodes.isSelected()) {
				Select selectLymphNodes = new Select(drpLymphnodes);
				selectLymphNodes.selectByVisibleText("Not Performed");
			}

			// Physician's Report Tab - Other Information
			if (!checkBoxHeight.isSelected())
				checkBoxHeight.click();

			if (!checkBoxWeight.isSelected())
				checkBoxWeight.click();

			if (!checkBoxBloodPressureSYS.isSelected())
				checkBoxBloodPressureSYS.click();

			if (!checkBoxBloodPressureDIA.isSelected())
				checkBoxBloodPressureDIA.click();

			if (!checkBoxPulse.isSelected())
				checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			if (!drpHearingRight.isSelected()) {
				Select hearingRight = new Select(drpHearingRight);
				hearingRight.selectByVisibleText("Not Performed");
			}

			if (!drpHearingLeft.isSelected()) {
				Select hearingLeft = new Select(drpHearingLeft);
				hearingLeft.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionRight.isSelected()) {
				Select visionRight = new Select(drpDistantVisionRight);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionLeft.isSelected()) {
				Select DistantvisionLeft = new Select(drpDistantVisionLeft);
				DistantvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionRight.isSelected()) {
				Select visionRight = new Select(drpNearVisionRight);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionLeft.isSelected()) {
				Select NearvisionLeft = new Select(drpNearVisionLeft);
				NearvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpTestedWithGlasses.isSelected()) {
				Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
				selectTestedWithGlasses.selectByVisibleText("Not Performed");
			}

			if (!drpColorVision.isSelected()) {
				Select selectColoVision = new Select(drpColorVision);
				selectColoVision.selectByVisibleText("Not Performed");
			}

		} else if (companyName.equalsIgnoreCase("Kinross")) {
			// Medical Examination
			if (!drpEyesAndPupils.isSelected()) {
				Select selectEyesAndPupils = new Select(drpEyesAndPupils);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpEarNoseThroat.isSelected()) {
				Select selectNoseThroat = new Select(drpEarNoseThroat);
				selectNoseThroat.selectByVisibleText("Not Performed");
			}

			if (!drpTeethAndMouth.isSelected()) {
				Select selectTeethAndMouth = new Select(drpTeethAndMouth);
				selectTeethAndMouth.selectByVisibleText("Not Performed");
			}

			if (!drpLungsAndChest.isSelected()) {
				Select selectLungsAndChest = new Select(drpLungsAndChest);
				selectLungsAndChest.selectByVisibleText("Not Performed");
			}

			if (!drpCardiovascular.isSelected()) {
				Select selectCardiovascular = new Select(drpCardiovascular);
				selectCardiovascular.selectByVisibleText("Not Performed");
			}

			if (!drpAbdominalMI.isSelected()) {
				Select selectAbdoViscera = new Select(drpAbdominalMI);
				selectAbdoViscera.selectByVisibleText("Not Performed");
			}

			if (!drpHernialOrificesMI.isSelected()) {
				Select selectHernialOrifices = new Select(drpHernialOrificesMI);
				selectHernialOrifices.selectByVisibleText("Not Performed");
			}

			if (!drpAnusAndRectumMI.isSelected()) {
				Select selectAnusAndRectum = new Select(drpAnusAndRectumMI);
				selectAnusAndRectum.selectByVisibleText("Not Performed");
			}

			if (!drpGenitoUrinaryMI.isSelected()) {
				Select selectGenitoUrinary = new Select(drpGenitoUrinaryMI);
				selectGenitoUrinary.selectByVisibleText("Not Performed");
			}

			if (!drpExtremitiesMI.isSelected()) {
				Select selectExtremities = new Select(drpExtremitiesMI);
				selectExtremities.selectByVisibleText("Not Performed");
			}

			if (!drpMusculoskeletalMI.isSelected()) {
				Select selectMusculoSkeletal = new Select(drpMusculoskeletalMI);
				selectMusculoSkeletal.selectByVisibleText("Not Performed");
			}

			if (!drpSkinVaricoseveinsMI.isSelected()) {
				Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveinsMI);
				selectSkinVaricoseVeins.selectByVisibleText("Not Performed");
			}

			if (!drpNeurologicalMentalfitnessMI.isSelected()) {
				Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitnessMI);
				selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");
			}

			if (!drpBreastMI.isSelected()) {
				Select selectBreast = new Select(drpBreastMI);
				selectBreast.selectByVisibleText("Not Performed");
			}

			if (!drpEndocrinologyMI.isSelected()) {
				Select selectEndocrinology = new Select(drpEndocrinologyMI);
				selectEndocrinology.selectByVisibleText("Not Performed");
			}

			if (!drpLymphnodesMI.isSelected()) {
				Select selectLymphNodes = new Select(drpLymphnodesMI);
				selectLymphNodes.selectByVisibleText("Not Performed");
			}

			// Physician's Report Tab - Other Information
			if (!checkBoxHeight.isSelected())
				checkBoxHeight.click();

			if (!checkBoxWeight.isSelected())
				checkBoxWeight.click();

			if (!checkBoxBloodPressureSYS.isSelected())
				checkBoxBloodPressureSYS.click();

			if (!checkBoxBloodPressureDIA.isSelected())
				checkBoxBloodPressureDIA.click();

			if (!checkBoxPulse.isSelected())
				checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			if (!drpVisualFieldKN.isSelected()) {
				Select Visualfield = new Select(drpVisualFieldKN);
				Visualfield.selectByVisibleText("Not Performed");
			}

			if (!drpHearingRightKN.isSelected()) {
				Select hearingRight = new Select(drpHearingRightKN);
				hearingRight.selectByVisibleText("Not Performed");
			}

			if (!drpHearingLeftKN.isSelected()) {
				Select hearingLeft = new Select(drpHearingLeftKN);
				hearingLeft.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionRightKN.isSelected()) {
				Select visionRight = new Select(drpDistantVisionRightKN);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionLeftKN.isSelected()) {
				Select DistantvisionLeft = new Select(drpDistantVisionLeftKN);
				DistantvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionRightKN.isSelected()) {
				Select visionRight = new Select(drpNearVisionRightKN);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionLeftKN.isSelected()) {
				Select NearvisionLeft = new Select(drpNearVisionLeftKN);
				NearvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpTestedWithGlassesKN.isSelected()) {
				Select selectTestedWithGlasses = new Select(drpTestedWithGlassesKN);
				selectTestedWithGlasses.selectByVisibleText("Not Performed");
			}

			if (!drpColorVisionKN.isSelected()) {
				Select selectColoVision = new Select(drpColorVisionKN);
				selectColoVision.selectByVisibleText("Not Performed");
			}

			if (!drpAudiogramKN.isSelected()) {
				Select selectAudiogram = new Select(drpAudiogramKN);
				selectAudiogram.selectByVisibleText("Not Performed");
			}

		} else if (companyName.equalsIgnoreCase("Frontex")) {
			// Nothing to do as all fields are empty.

		} else if (companyName.equalsIgnoreCase("Eramet")) {

			// Medical Examination
			if (!drpEyesAndPupils.isSelected()) {
				Select selectEyesAndPupils = new Select(drpEyesAndPupils);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpEarNoseThroat.isSelected()) {
				Select selectNoseThroat = new Select(drpEarNoseThroat);
				selectNoseThroat.selectByVisibleText("Not Performed");
			}

			if (!drpTeethAndMouth.isSelected()) {
				Select selectTeethAndMouth = new Select(drpTeethAndMouth);
				selectTeethAndMouth.selectByVisibleText("Not Performed");
			}

			if (!drpLungsAndChest.isSelected()) {
				Select selectLungsAndChest = new Select(drpLungsAndChest);
				selectLungsAndChest.selectByVisibleText("Not Performed");
			}

			if (!drpCardiovascular.isSelected()) {
				Select selectCardiovascular = new Select(drpCardiovascular);
				selectCardiovascular.selectByVisibleText("Not Performed");
			}

			if (!drpAbdominalMI.isSelected()) {
				Select selectAbdoViscera = new Select(drpAbdominalMI);
				selectAbdoViscera.selectByVisibleText("Not Performed");
			}

			if (!drpHernialOrificesMI.isSelected()) {
				Select selectHernialOrifices = new Select(drpHernialOrificesMI);
				selectHernialOrifices.selectByVisibleText("Not Performed");
			}

			if (!drpAnusAndRectumMI.isSelected()) {
				Select selectAnusAndRectum = new Select(drpAnusAndRectumMI);
				selectAnusAndRectum.selectByVisibleText("Not Performed");
			}

			if (!drpGenitoUrinaryMI.isSelected()) {
				Select selectGenitoUrinary = new Select(drpGenitoUrinaryMI);
				selectGenitoUrinary.selectByVisibleText("Not Performed");
			}

			if (!drpExtremitiesMI.isSelected()) {
				Select selectExtremities = new Select(drpExtremitiesMI);
				selectExtremities.selectByVisibleText("Not Performed");
			}

			if (!drpMusculoskeletalMI.isSelected()) {
				Select selectMusculoSkeletal = new Select(drpMusculoskeletalMI);
				selectMusculoSkeletal.selectByVisibleText("Not Performed");
			}

			if (!drpSkinVaricoseveinsMI.isSelected()) {
				Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveinsMI);
				selectSkinVaricoseVeins.selectByVisibleText("Not Performed");
			}

			if (!drpNeurologicalMentalfitnessMI.isSelected()) {
				Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitnessMI);
				selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");
			}

			if (!drpBreastMI.isSelected()) {
				Select selectBreast = new Select(drpBreastMI);
				selectBreast.selectByVisibleText("Not Performed");
			}

			if (!drpEndocrinologyMI.isSelected()) {
				Select selectEndocrinology = new Select(drpEndocrinologyMI);
				selectEndocrinology.selectByVisibleText("Not Performed");
			}

			if (!drpLymphnodesMI.isSelected()) {
				Select selectLymphNodes = new Select(drpLymphnodesMI);
				selectLymphNodes.selectByVisibleText("Not Performed");
			}

			// Physician's Report Tab - Other Information
			if (!checkBoxHeight.isSelected())
				checkBoxHeight.click();

			if (!checkBoxWeight.isSelected())
				checkBoxWeight.click();

			if (!checkBoxBloodPressureSYS.isSelected())
				checkBoxBloodPressureSYS.click();

			if (!checkBoxBloodPressureDIA.isSelected())
				checkBoxBloodPressureDIA.click();

			if (!checkBoxPulse.isSelected())
				checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			if (!drpHearingRight.isSelected()) {
				Select hearingRight = new Select(drpHearingRight);
				hearingRight.selectByVisibleText("Not Performed");
			}

			if (!drpHearingLeft.isSelected()) {
				Select hearingLeft = new Select(drpHearingLeft);
				hearingLeft.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionRight.isSelected()) {
				Select visionRight = new Select(drpDistantVisionRight);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionLeft.isSelected()) {
				Select DistantvisionLeft = new Select(drpDistantVisionLeft);
				DistantvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionRight.isSelected()) {
				Select visionRight = new Select(drpNearVisionRight);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionLeft.isSelected()) {
				Select NearvisionLeft = new Select(drpNearVisionLeft);
				NearvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpTestedWithGlasses.isSelected()) {
				Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
				selectTestedWithGlasses.selectByVisibleText("Not Performed");
			}

			if (!drpColorVision.isSelected()) {
				Select selectColoVision = new Select(drpColorVision);
				selectColoVision.selectByVisibleText("Not Performed");
			}

			if (!drpAudiogram.isSelected()) {
				Select selectAudiogram = new Select(drpAudiogram);
				selectAudiogram.selectByVisibleText("Not Performed");
			}

		} else if (companyName.equalsIgnoreCase("bp USA")) {
			// Medical Examination
			if (!drpEyesAndPupils.isSelected()) {
				Select selectEyesAndPupils = new Select(drpEyesAndPupils);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpEarNoseThroat.isSelected()) {
				Select selectNoseThroat = new Select(drpEarNoseThroat);
				selectNoseThroat.selectByVisibleText("Not Performed");
			}

			if (!drpTeethAndMouth.isSelected()) {
				Select selectTeethAndMouth = new Select(drpTeethAndMouth);
				selectTeethAndMouth.selectByVisibleText("Not Performed");
			}

			if (!drpLungsAndChest.isSelected()) {
				Select selectLungsAndChest = new Select(drpLungsAndChest);
				selectLungsAndChest.selectByVisibleText("Not Performed");
			}

			if (!drpCardiovascular.isSelected()) {
				Select selectCardiovascular = new Select(drpCardiovascular);
				selectCardiovascular.selectByVisibleText("Not Performed");
			}

			if (!drpHernialOrificesBP.isSelected()) {
				Select selectHernialOrifices = new Select(drpHernialOrificesBP);
				selectHernialOrifices.selectByVisibleText("Not Performed");
			}

			if (!drpAnusAndRectumBP.isSelected()) {
				Select selectAnusAndRectum = new Select(drpAnusAndRectumBP);
				selectAnusAndRectum.selectByVisibleText("Not Performed");
			}

			if (!drpGenitoUrinaryBP.isSelected()) {
				Select selectGenitoUrinary = new Select(drpGenitoUrinaryBP);
				selectGenitoUrinary.selectByVisibleText("Not Performed");
			}

			if (!drpExtremitiesBP.isSelected()) {
				Select selectExtremities = new Select(drpExtremitiesBP);
				selectExtremities.selectByVisibleText("Not Performed");
			}

			if (!drpMusculoskeletalBP.isSelected()) {
				Select selectMusculoSkeletal = new Select(drpMusculoskeletalBP);
				selectMusculoSkeletal.selectByVisibleText("Not Performed");
			}

			if (!drpSkinVaricoseveinsBP.isSelected()) {
				Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveinsBP);
				selectSkinVaricoseVeins.selectByVisibleText("Not Performed");
			}

			if (!drpNeurologicalMentalfitnessBP.isSelected()) {
				Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitnessBP);
				selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");
			}

			if (!drpBreastBP.isSelected()) {
				Select selectBreast = new Select(drpBreastBP);
				selectBreast.selectByVisibleText("Not Performed");
			}

			if (!drpEndocrinologyBP.isSelected()) {
				Select selectEndocrinology = new Select(drpEndocrinologyBP);
				selectEndocrinology.selectByVisibleText("Not Performed");
			}

			// Physician's Report Tab - Other Information
			if (!checkBoxHeight.isSelected())
				checkBoxHeight.click();
			if (!checkBoxWeight.isSelected())
				checkBoxWeight.click();
			if (!checkBoxBloodPressureSYS.isSelected())
				checkBoxBloodPressureSYS.click();
			if (!checkBoxBloodPressureDIA.isSelected())
				checkBoxBloodPressureDIA.click();
			if (!checkBoxPulse.isSelected())
				checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			if (!drpHearingRight.isSelected()) {
				Select hearingRight = new Select(drpHearingRight);
				hearingRight.selectByVisibleText("Not Performed");
			}

			if (!drpHearingLeft.isSelected()) {
				Select hearingLeft = new Select(drpHearingLeft);
				hearingLeft.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionRight.isSelected()) {
				Select visionRight = new Select(drpDistantVisionRight);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionLeft.isSelected()) {
				Select DistantvisionLeft = new Select(drpDistantVisionLeft);
				DistantvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionRight.isSelected()) {
				Select visionRight = new Select(drpNearVisionRight);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionLeft.isSelected()) {
				Select NearvisionLeft = new Select(drpNearVisionLeft);
				NearvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpTestedWithGlasses.isSelected()) {
				Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
				selectTestedWithGlasses.selectByVisibleText("Not Performed");
			}

			if (!drpColorVision.isSelected()) {
				Select selectColoVision = new Select(drpColorVision);
				selectColoVision.selectByVisibleText("Not Performed");
			}

		} else if (companyName.equalsIgnoreCase("MY COMPANY")) {

			if (!drpEyesAndPupils.isSelected()) {
				Select selectEyesAndPupils = new Select(drpEyesAndPupils);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpEarNoseThroat.isSelected()) {
				Select selectNoseThroat = new Select(drpEarNoseThroat);
				selectNoseThroat.selectByVisibleText("Not Performed");
			}

			if (!drpTeethAndMouth.isSelected()) {
				Select selectTeethAndMouth = new Select(drpTeethAndMouth);
				selectTeethAndMouth.selectByVisibleText("Not Performed");
			}

			if (!drpLungsAndChest.isSelected()) {
				Select selectLungsAndChest = new Select(drpLungsAndChest);
				selectLungsAndChest.selectByVisibleText("Not Performed");
			}

			if (!drpCardiovascular.isSelected()) {
				Select selectCardiovascular = new Select(drpCardiovascular);
				selectCardiovascular.selectByVisibleText("Not Performed");
			}

			if (!drpAbdoViscera.isSelected()) {
				Select selectAbdoViscera = new Select(drpAbdoViscera);
				selectAbdoViscera.selectByVisibleText("Not Performed");
			}

			if (!drpHernialOrifices.isSelected()) {
				Select selectHernialOrifices = new Select(drpHernialOrifices);
				selectHernialOrifices.selectByVisibleText("Not Performed");
			}

			if (!drpAnusAndRectum.isSelected()) {
				Select selectAnusAndRectum = new Select(drpAnusAndRectum);
				selectAnusAndRectum.selectByVisibleText("Not Performed");
			}

			if (!drpGenitoUrinary.isSelected()) {
				Select selectGenitoUrinary = new Select(drpGenitoUrinary);
				selectGenitoUrinary.selectByVisibleText("Not Performed");
			}

			if (!drpExtremities.isSelected()) {
				Select selectExtremities = new Select(drpExtremities);
				selectExtremities.selectByVisibleText("Not Performed");
			}

			if (!drpMusculoskeletal.isSelected()) {
				Select selectMusculoSkeletal = new Select(drpMusculoskeletal);
				selectMusculoSkeletal.selectByVisibleText("Not Performed");
			}

			if (!drpSkinVaricoseveins.isSelected()) {
				Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveins);
				selectSkinVaricoseVeins.selectByVisibleText("Not Performed");
			}

			if (!drpNeurologicalMentalfitness.isSelected()) {
				Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitness);
				selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");
			}

			if (!drpBreast.isSelected()) {
				Select selectBreast = new Select(drpBreast);
				selectBreast.selectByVisibleText("Not Performed");
			}

			if (!drpLymphnodesMY.isSelected()) {
				Select selectLymphNodes = new Select(drpLymphnodesMY);
				selectLymphNodes.selectByVisibleText("Not Performed");
			}

			// Physician's Report Tab - Other Information
			if (!checkBoxHeight.isSelected())
				checkBoxHeight.click();

			if (!checkBoxWeight.isSelected())
				checkBoxWeight.click();

			if (!checkBoxBloodPressureSYS.isSelected())
				checkBoxBloodPressureSYS.click();

			if (!checkBoxBloodPressureDIA.isSelected())
				checkBoxBloodPressureDIA.click();

			if (!checkBoxPulse.isSelected())
				checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			if (!drpHearingRight.isSelected()) {
				Select hearingRight = new Select(drpHearingRight);
				hearingRight.selectByVisibleText("Not Performed");
			}

			if (!drpHearingLeft.isSelected()) {
				Select hearingLeft = new Select(drpHearingLeft);
				hearingLeft.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionRight.isSelected()) {
				Select visionRight = new Select(drpDistantVisionRight);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionLeft.isSelected()) {
				Select DistantvisionLeft = new Select(drpDistantVisionLeft);
				DistantvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionRight.isSelected()) {
				Select visionRight = new Select(drpNearVisionRight);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionLeft.isSelected()) {
				Select NearvisionLeft = new Select(drpNearVisionLeft);
				NearvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpTestedWithGlasses.isSelected()) {
				Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
				selectTestedWithGlasses.selectByVisibleText("Not Performed");
			}

			if (!drpColorVision.isSelected()) {
				Select selectColoVision = new Select(drpColorVision);
				selectColoVision.selectByVisibleText("Not Performed");
			}

			if (!drpAudiogram.isSelected()) {
				Select selectAudiogram = new Select(drpAudiogram);
				selectAudiogram.selectByVisibleText("Not Performed");
			}

		} else if (companyName.equalsIgnoreCase("NOVARTIS")) {
			// Medical Examination

			if (!drpEyesAndPupils.isSelected()) {
				Select selectEyesAndPupils = new Select(drpEyesAndPupils);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpEarNoseThroat.isSelected()) {
				Select selectNoseThroat = new Select(drpEarNoseThroat);
				selectNoseThroat.selectByVisibleText("Not Performed");
			}

			if (!drpTeethAndMouth.isSelected()) {
				Select selectTeethAndMouth = new Select(drpTeethAndMouth);
				selectTeethAndMouth.selectByVisibleText("Not Performed");
			}

			if (!drpLungsAndChest.isSelected()) {
				Select selectLungsAndChest = new Select(drpLungsAndChest);
				selectLungsAndChest.selectByVisibleText("Not Performed");
			}

			if (!drpCardiovascular.isSelected()) {
				Select selectCardiovascular = new Select(drpCardiovascular);
				selectCardiovascular.selectByVisibleText("Not Performed");
			}

			if (!drpAbdoViscera.isSelected()) {
				Select selectAbdoViscera = new Select(drpAbdoViscera);
				selectAbdoViscera.selectByVisibleText("Not Performed");
			}

			if (!drpHernialOrifices.isSelected()) {
				Select selectHernialOrifices = new Select(drpHernialOrifices);
				selectHernialOrifices.selectByVisibleText("Not Performed");
			}

			if (!drpAnusAndRectum.isSelected()) {
				Select selectAnusAndRectum = new Select(drpAnusAndRectum);
				selectAnusAndRectum.selectByVisibleText("Not Performed");
			}

			if (!drpGenitoUrinary.isSelected()) {
				Select selectGenitoUrinary = new Select(drpGenitoUrinary);
				selectGenitoUrinary.selectByVisibleText("Not Performed");
			}

			if (!drpExtremities.isSelected()) {
				Select selectExtremities = new Select(drpExtremities);
				selectExtremities.selectByVisibleText("Not Performed");
			}

			if (!drpMusculoskeletal.isSelected()) {
				Select selectMusculoSkeletal = new Select(drpMusculoskeletal);
				selectMusculoSkeletal.selectByVisibleText("Not Performed");
			}

			if (!drpSkinVaricoseveins.isSelected()) {
				Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveins);
				selectSkinVaricoseVeins.selectByVisibleText("Not Performed");
			}

			if (!drpNeurologicalMentalfitness.isSelected()) {
				Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitness);
				selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");
			}

			if (!drpBreast.isSelected()) {
				Select selectBreast = new Select(drpBreast);
				selectBreast.selectByVisibleText("Not Performed");
			}

			if (!drpEndocrinology.isSelected()) {
				Select selectEndocrinology = new Select(drpEndocrinology);
				selectEndocrinology.selectByVisibleText("Not Performed");
			}

			if (!drpLymphnodes.isSelected()) {
				Select selectLymphNodes = new Select(drpLymphnodes);
				selectLymphNodes.selectByVisibleText("Not Performed");
			}

			// Physician's Report Tab - Other Information
			if (!checkBoxHeight.isSelected())
				checkBoxHeight.click();

			if (!checkBoxWeight.isSelected())
				checkBoxWeight.click();

			if (!checkBoxBloodPressureSYS.isSelected())
				checkBoxBloodPressureSYS.click();

			if (!checkBoxBloodPressureDIA.isSelected())
				checkBoxBloodPressureDIA.click();

			if (!checkBoxPulse.isSelected())
				checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			if (!drpHearingRight.isSelected()) {
				Select hearingRight = new Select(drpHearingRight);
				hearingRight.selectByVisibleText("Not Performed");
			}

			if (!drpHearingLeft.isSelected()) {
				Select hearingLeft = new Select(drpHearingLeft);
				hearingLeft.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionRight.isSelected()) {
				Select VisionRight = new Select(drpDistantVisionRight);
				VisionRight.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionLeft.isSelected()) {
				Select DistantvisionLeft = new Select(drpDistantVisionLeft);
				DistantvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionRight.isSelected()) {
				Select visionRight = new Select(drpNearVisionRight);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionLeft.isSelected()) {
				Select NearvisionLeft = new Select(drpNearVisionLeft);
				NearvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpTestedWithGlasses.isSelected()) {
				Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
				selectTestedWithGlasses.selectByVisibleText("Not Performed");
			}

			if (!drpColorVision.isSelected()) {
				Select selectColoVision = new Select(drpColorVision);
				selectColoVision.selectByVisibleText("Not Performed");
			}

			if (!drpAudiogram.isSelected()) {
				Select selectAudiogram = new Select(drpAudiogram);
				selectAudiogram.selectByVisibleText("Not Performed");
			}

		} else if (companyName.equalsIgnoreCase("BioMerieux")) {
			// Medical Examination

			if (!drpEyesAndPupils.isSelected()) {
				Select selectEyesAndPupils = new Select(drpEyesAndPupils);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpEarNoseThroat.isSelected()) {
				Select selectNoseThroat = new Select(drpEarNoseThroat);
				selectNoseThroat.selectByVisibleText("Not Performed");
			}

			if (!drpTeethAndMouth.isSelected()) {
				Select selectTeethAndMouth = new Select(drpTeethAndMouth);
				selectTeethAndMouth.selectByVisibleText("Not Performed");
			}

			if (!drpLungsAndChest.isSelected()) {
				Select selectLungsAndChest = new Select(drpLungsAndChest);
				selectLungsAndChest.selectByVisibleText("Not Performed");
			}

			if (!drpCardiovascular.isSelected()) {
				Select selectCardiovascular = new Select(drpCardiovascular);
				selectCardiovascular.selectByVisibleText("Not Performed");
			}

			if (!drpAbdoViscera.isSelected()) {
				Select selectAbdoViscera = new Select(drpAbdoViscera);
				selectAbdoViscera.selectByVisibleText("Not Performed");
			}

			if (!drpHernialOrifices.isSelected()) {
				Select selectHernialOrifices = new Select(drpHernialOrifices);
				selectHernialOrifices.selectByVisibleText("Not Performed");
			}

			if (!drpAnusAndRectum.isSelected()) {
				Select selectAnusAndRectum = new Select(drpAnusAndRectum);
				selectAnusAndRectum.selectByVisibleText("Not Performed");
			}

			if (!drpGenitoUrinary.isSelected()) {
				Select selectGenitoUrinary = new Select(drpGenitoUrinary);
				selectGenitoUrinary.selectByVisibleText("Not Performed");
			}

			if (!drpExtremities.isSelected()) {
				Select selectExtremities = new Select(drpExtremities);
				selectExtremities.selectByVisibleText("Not Performed");
			}

			if (!drpMusculoskeletal.isSelected()) {
				Select selectMusculoSkeletal = new Select(drpMusculoskeletal);
				selectMusculoSkeletal.selectByVisibleText("Not Performed");
			}

			if (!drpSkinVaricoseveins.isSelected()) {
				Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveins);
				selectSkinVaricoseVeins.selectByVisibleText("Not Performed");
			}

			if (!drpNeurologicalMentalfitness.isSelected()) {
				Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitness);
				selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");
			}

			if (!drpBreast.isSelected()) {
				Select selectBreast = new Select(drpBreast);
				selectBreast.selectByVisibleText("Not Performed");
			}

			if (!drpEndocrinology.isSelected()) {
				Select selectEndocrinology = new Select(drpEndocrinology);
				selectEndocrinology.selectByVisibleText("Not Performed");
			}

			if (!drpLymphnodes.isSelected()) {
				Select selectLymphNodes = new Select(drpLymphnodes);
				selectLymphNodes.selectByVisibleText("Not Performed");
			}

			// Physician's Report Tab - Other Information
			if (!checkBoxHeight.isSelected())
				checkBoxHeight.click();

			if (!checkBoxWeight.isSelected())
				checkBoxWeight.click();

			if (!checkBoxBloodPressureSYS.isSelected())
				checkBoxBloodPressureSYS.click();

			if (!checkBoxBloodPressureDIA.isSelected())
				checkBoxBloodPressureDIA.click();

			if (!checkBoxPulse.isSelected())
				checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			if (!drpHearingRight.isSelected()) {
				Select hearingRight = new Select(drpHearingRight);
				hearingRight.selectByVisibleText("Not Performed");
			}

			if (!drpHearingLeft.isSelected()) {
				Select hearingLeft = new Select(drpHearingLeft);
				hearingLeft.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionRight.isSelected()) {
				Select VisionRight = new Select(drpDistantVisionRight);
				VisionRight.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionLeft.isSelected()) {
				Select DistantvisionLeft = new Select(drpDistantVisionLeft);
				DistantvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionRight.isSelected()) {
				Select visionRight = new Select(drpNearVisionRight);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionLeft.isSelected()) {
				Select NearvisionLeft = new Select(drpNearVisionLeft);
				NearvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpTestedWithGlasses.isSelected()) {
				Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
				selectTestedWithGlasses.selectByVisibleText("Not Performed");
			}

			if (!drpColorVision.isSelected()) {
				Select selectColoVision = new Select(drpColorVision);
				selectColoVision.selectByVisibleText("Not Performed");
			}

			if (!drpAudiogram.isSelected()) {
				Select selectAudiogram = new Select(drpAudiogram);
				selectAudiogram.selectByVisibleText("Not Performed");
			}

		} else if (companyName.equalsIgnoreCase("ARKEMA")) {

			// Medical Examination
			if (!drpEyesAndPupils.isSelected()) {
				Select selectEyesAndPupils = new Select(drpEyesAndPupils);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpEarNoseThroat.isSelected()) {
				Select selectNoseThroat = new Select(drpEarNoseThroat);
				selectNoseThroat.selectByVisibleText("Not Performed");
			}

			if (!drpTeethAndMouth.isSelected()) {
				Select selectTeethAndMouth = new Select(drpTeethAndMouth);
				selectTeethAndMouth.selectByVisibleText("Not Performed");
			}

			if (!drpLungsAndChest.isSelected()) {
				Select selectLungsAndChest = new Select(drpLungsAndChest);
				selectLungsAndChest.selectByVisibleText("Not Performed");
			}

			if (!drpCardiovascular.isSelected()) {
				Select selectCardiovascular = new Select(drpCardiovascular);
				selectCardiovascular.selectByVisibleText("Not Performed");
			}

			if (!drpAbdoViscera.isSelected()) {
				Select selectAbdoViscera = new Select(drpAbdoViscera);
				selectAbdoViscera.selectByVisibleText("Not Performed");
			}

			if (!drpHernialOrifices.isSelected()) {
				Select selectHernialOrifices = new Select(drpHernialOrifices);
				selectHernialOrifices.selectByVisibleText("Not Performed");
			}

			if (!drpAnusAndRectum.isSelected()) {
				Select selectAnusAndRectum = new Select(drpAnusAndRectum);
				selectAnusAndRectum.selectByVisibleText("Not Performed");
			}

			if (!drpGenitoUrinary.isSelected()) {
				Select selectGenitoUrinary = new Select(drpGenitoUrinary);
				selectGenitoUrinary.selectByVisibleText("Not Performed");
			}

			if (!drpExtremities.isSelected()) {
				Select selectExtremities = new Select(drpExtremities);
				selectExtremities.selectByVisibleText("Not Performed");
			}

			if (!drpMusculoskeletal.isSelected()) {
				Select selectMusculoSkeletal = new Select(drpMusculoskeletal);
				selectMusculoSkeletal.selectByVisibleText("Not Performed");
			}

			if (!drpSkinVaricoseveins.isSelected()) {
				Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveins);
				selectSkinVaricoseVeins.selectByVisibleText("Not Performed");
			}

			if (!drpNeurologicalMentalfitness.isSelected()) {
				Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitness);
				selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");
			}

			if (!drpBreast.isSelected()) {
				Select selectBreast = new Select(drpBreast);
				selectBreast.selectByVisibleText("Not Performed");
			}

			if (!drpEndocrinology.isSelected()) {
				Select selectEndocrinology = new Select(drpEndocrinology);
				selectEndocrinology.selectByVisibleText("Not Performed");
			}

			if (!drpLymphnodes.isSelected()) {
				Select selectLymphNodes = new Select(drpLymphnodes);
				selectLymphNodes.selectByVisibleText("Not Performed");
			}

			// Physician's Report Tab - Other Information
			if (!checkBoxHeight.isSelected())
				checkBoxHeight.click();

			if (!checkBoxWeight.isSelected())
				checkBoxWeight.click();

			if (!checkBoxBloodPressureSYS.isSelected())
				checkBoxBloodPressureSYS.click();

			if (!checkBoxBloodPressureDIA.isSelected())
				checkBoxBloodPressureDIA.click();

			if (!checkBoxPulse.isSelected())
				checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			if (!drpHearingRight.isSelected()) {
				Select hearingRight = new Select(drpHearingRight);
				hearingRight.selectByVisibleText("Not Performed");
			}

			if (!drpHearingLeft.isSelected()) {
				Select hearingLeft = new Select(drpHearingLeft);
				hearingLeft.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionRight.isSelected()) {
				Select VisionRight = new Select(drpDistantVisionRight);
				VisionRight.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionLeft.isSelected()) {
				Select DistantvisionLeft = new Select(drpDistantVisionLeft);
				DistantvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionRight.isSelected()) {
				Select visionRight = new Select(drpNearVisionRight);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionLeft.isSelected()) {
				Select NearvisionLeft = new Select(drpNearVisionLeft);
				NearvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpTestedWithGlasses.isSelected()) {
				Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
				selectTestedWithGlasses.selectByVisibleText("Not Performed");
			}

			if (!drpColorVision.isSelected()) {
				Select selectColoVision = new Select(drpColorVision);
				selectColoVision.selectByVisibleText("Not Performed");
			}

			if (!drpAudiogram.isSelected()) {
				Select selectAudiogram = new Select(drpAudiogram);
				selectAudiogram.selectByVisibleText("Not Performed");
			}

		} else if (companyName.equalsIgnoreCase("CGG International S.A.")) {

			// Medical Examination
			if (!ChkBoxPsychosocialAssessmentScale.isSelected())
				ChkBoxPsychosocialAssessmentScale.click();

			if (!drpEyesAndPupilsCGG.isSelected()) {
				Select selectEyesAndPupils = new Select(drpEyesAndPupilsCGG);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpEarNoseThroatCGG.isSelected()) {
				Select selectNoseThroat = new Select(drpEarNoseThroatCGG);
				selectNoseThroat.selectByVisibleText("Not Performed");
			}

			if (!drpTeethAndMouthCGG.isSelected()) {
				Select selectTeethAndMouth = new Select(drpTeethAndMouthCGG);
				selectTeethAndMouth.selectByVisibleText("Not Performed");
			}

			if (!drpLungsAndChestCGG.isSelected()) {
				Select selectLungsAndChest = new Select(drpLungsAndChestCGG);
				selectLungsAndChest.selectByVisibleText("Not Performed");
			}

			if (!drpCardiovascularCGG.isSelected()) {
				Select selectCardiovascular = new Select(drpCardiovascularCGG);
				selectCardiovascular.selectByVisibleText("Not Performed");
			}

			if (!drpAbdominalCGG.isSelected()) {
				Select selectAbdoViscera = new Select(drpAbdominalCGG);
				selectAbdoViscera.selectByVisibleText("Not Performed");
			}

			if (!drpHernialOrificesCGG.isSelected()) {
				Select selectHernialOrifices = new Select(drpHernialOrificesCGG);
				selectHernialOrifices.selectByVisibleText("Not Performed");
			}

			if (!drpAnusAndRectumCGG.isSelected()) {
				Select selectAnusAndRectum = new Select(drpAnusAndRectumCGG);
				selectAnusAndRectum.selectByVisibleText("Not Performed");
			}

			if (!drpGenitoUrinaryCGG.isSelected()) {
				Select selectGenitoUrinary = new Select(drpGenitoUrinaryCGG);
				selectGenitoUrinary.selectByVisibleText("Not Performed");
			}

			if (!drpExtremitiesCGG.isSelected()) {
				Select selectExtremities = new Select(drpExtremitiesCGG);
				selectExtremities.selectByVisibleText("Not Performed");
			}

			if (!drpMusculoskeletalCGG.isSelected()) {
				Select selectMusculoSkeletal = new Select(drpMusculoskeletalCGG);
				selectMusculoSkeletal.selectByVisibleText("Not Performed");
			}

			if (!drpSkinVaricoseveinsCGG.isSelected()) {
				Select selectSkinVaricoseVeins = new Select(drpSkinVaricoseveinsCGG);
				selectSkinVaricoseVeins.selectByVisibleText("Not Performed");
			}

			if (!drpNeurologicalMentalfitnessCGG.isSelected()) {
				Select selectNeurologicalMentalFitness = new Select(drpNeurologicalMentalfitnessCGG);
				selectNeurologicalMentalFitness.selectByVisibleText("Not Performed");
			}

			if (!drpBreastCGG.isSelected()) {
				Select selectBreast = new Select(drpBreastCGG);
				selectBreast.selectByVisibleText("Not Performed");
			}

			if (!drpEndocrinologyCGG.isSelected()) {
				Select selectEndocrinology = new Select(drpEndocrinologyCGG);
				selectEndocrinology.selectByVisibleText("Not Performed");
			}

			if (!drpLymphnodesCGG.isSelected()) {
				Select selectLymphNodes = new Select(drpLymphnodesCGG);
				selectLymphNodes.selectByVisibleText("Not Performed");
			}

			// Physician's Report Tab - Other Information
			if (!checkBoxHeight.isSelected())
				checkBoxHeight.click();

			if (!checkBoxWeight.isSelected())
				checkBoxWeight.click();

			if (!checkBoxBloodPressureSYS.isSelected())
				checkBoxBloodPressureSYS.click();

			if (!checkBoxBloodPressureDIA.isSelected())
				checkBoxBloodPressureDIA.click();

			if (!checkBoxPulse.isSelected())
				checkBoxPulse.click();

			// Vision (with corrective lenses if worn) and Hearing
			if (!drpHearingRight.isSelected()) {
				Select hearingRight = new Select(drpHearingRight);
				hearingRight.selectByVisibleText("Not Performed");
			}

			if (!drpHearingLeft.isSelected()) {
				Select hearingLeft = new Select(drpHearingLeft);
				hearingLeft.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionRight.isSelected()) {
				Select VisionRight = new Select(drpDistantVisionRight);
				VisionRight.selectByVisibleText("Not Performed");
			}

			if (!drpDistantVisionLeft.isSelected()) {
				Select DistantvisionLeft = new Select(drpDistantVisionLeft);
				DistantvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionRight.isSelected()) {
				Select visionRight = new Select(drpNearVisionRight);
				visionRight.selectByVisibleText("Not Performed");
			}

			if (!drpNearVisionLeft.isSelected()) {
				Select NearvisionLeft = new Select(drpNearVisionLeft);
				NearvisionLeft.selectByVisibleText("Not Performed");
			}

			if (!drpTestedWithGlasses.isSelected()) {
				Select selectTestedWithGlasses = new Select(drpTestedWithGlasses);
				selectTestedWithGlasses.selectByVisibleText("Not Performed");
			}

			if (!drpColorVision.isSelected()) {
				Select selectColoVision = new Select(drpColorVision);
				selectColoVision.selectByVisibleText("Not Performed");
			}

			if (!drpAudiogram.isSelected()) {
				Select selectAudiogram = new Select(drpAudiogram);
				selectAudiogram.selectByVisibleText("Not Performed");
			}
		}
	}
		
		
	public void clickPhysicianReportButton() throws InterruptedException {
		JavaScriptUtils.moveToElement(driver, savePhysicianReportButton);
		savePhysicianReportButton.click();
		driver.switchTo().defaultContent();
	}

	// Lab Analysis Tab
	public void clickLabAnalysisTab() {
		labAnalysisTab.click();
		WaitUtils.sleep(5);
	}

// Switching to the frame - Lab Analysis Tab ***************************************************************************************
	public void selectAllDrpdwnChkboxesLabAnalysisTab() {
		String companyName = driver
				.findElement(By.xpath("//div[@class='MedicalNormalText']//table/tbody/tr/td[2]/table/tbody/tr/td[2]"))
				.getText();
		driver.switchTo().frame(0);
		if (companyName.equalsIgnoreCase("Schlumberger")) {
			WaitUtils.sleep(2);

			// Para Clinical Examination
			if (!drpECG.isSelected()) {
				Select selectparaClinicalExamination = new Select(drpECG);
				selectparaClinicalExamination.selectByVisibleText("Not Performed");
			}

			if (!drpChestXRay.isSelected()) {
				Select selectChestXRay = new Select(drpChestXRay);
				selectChestXRay.selectByVisibleText("Not Performed");
			}

			if (!drpStressTest.isSelected()) {
				Select selectChestXRay = new Select(drpStressTest);
				selectChestXRay.selectByVisibleText("Not Performed");
			}

			if (!drpFunctionalRespiratoryTesting.isSelected()) {
				Select selectFunctionalRespiratoryTesting = new Select(drpFunctionalRespiratoryTesting);
				selectFunctionalRespiratoryTesting.selectByVisibleText("Not Performed");
			}

			if (!drpAbdominalPelvicEchography.isSelected()) {
				Select selectAbdominalPelvicEchography = new Select(drpAbdominalPelvicEchography);
				selectAbdominalPelvicEchography.selectByVisibleText("Not Performed");
			}

			if (!drpCarotidEchoDoppler.isSelected()) {
				Select selectCarotidEchoDoppler = new Select(drpCarotidEchoDoppler);
				selectCarotidEchoDoppler.selectByVisibleText("Not Performed");
			}

			if (!drpCardiacEchography.isSelected()) {
				Select selectCardiacEchography = new Select(drpCardiacEchography);
				selectCardiacEchography.selectByVisibleText("Not Performed");
			}

			if (!drpMammogram.isSelected()) {
				Select selectMammogram = new Select(drpMammogram);
				selectMammogram.selectByVisibleText("Not Performed");
			}

			if (!drpPAPSmear.isSelected()) {
				Select selectPAPSmear = new Select(drpPAPSmear);
				selectPAPSmear.selectByVisibleText("Not Performed");
			}

			// Blood Analysis
			if (!checkBoxRBC.isSelected())
				checkBoxRBC.click();
			if (!checkBoxWBC.isSelected())
				checkBoxWBC.click();
			if (!checkBoxNEUTRO.isSelected())
				checkBoxNEUTRO.click();
			if (!checkBoxEOSINO.isSelected())
				checkBoxEOSINO.click();
			if (!checkBoxBASO.isSelected())
				checkBoxBASO.click();
			if (!checkBoxLYMPHO.isSelected())
				checkBoxLYMPHO.click();
			if (!checkBoxMONO.isSelected())
				checkBoxMONO.click();
			if (!checkBoxHEMATOCRIT.isSelected())
				checkBoxHEMATOCRIT.click();
			if (!checkBoxHEMOGLOBIN.isSelected())
				checkBoxHEMOGLOBIN.click();
			if (!checkBoxESR.isSelected())
				checkBoxESR.click();
			if (!checkBoxSGOTASAT.isSelected())
				checkBoxSGOTASAT.click();
			if (!checkBoxSGPTALAT.isSelected())
				checkBoxSGPTALAT.click();
			if (!checkBoxGAMMAGT.isSelected())
				checkBoxGAMMAGT.click();
			if (!checkBoxGLYCEMIA.isSelected())
				checkBoxGLYCEMIA.click();
			if (!checkBoxCHOLESTEROL.isSelected())
				checkBoxCHOLESTEROL.click();
			if (!checkBoxHDL.isSelected())
				checkBoxHDL.click();
			if (!checkBoxLDL.isSelected())
				checkBoxLDL.click();
			if (!checkBoxCREATININE.isSelected())
				checkBoxCREATININE.click();
			if (!checkBoxURICACID.isSelected())
				checkBoxURICACID.click();
			if (!checkBoxTRIGLYCERIDES.isSelected())
				checkBoxTRIGLYCERIDES.click();

			// Eyes
			if (!checkBoxTonometryRightEye.isSelected())
				checkBoxTonometryRightEye.click();
			if (!checkBoxTonometryLeftEye.isSelected())
				checkBoxTonometryLeftEye.click();

			// Additional Blood Test
			if (!checkBoxPSA.isSelected())
				checkBoxPSA.click();
			if (!checkBoxCEA.isSelected())
				checkBoxCEA.click();
			if (!checkBoxTSH.isSelected())
				checkBoxTSH.click();
			if (!checkBoxAlkalinePhosphatase.isSelected())
				checkBoxAlkalinePhosphatase.click();

			// Urine Analysis
			if (!drpAlbumin.isSelected()) {
				Select SelectAlbumin = new Select(drpAlbumin);
				SelectAlbumin.selectByVisibleText("Not Performed");
			}

			if (!drpSugar.isSelected()) {
				Select SelectSugar = new Select(drpSugar);
				SelectSugar.selectByVisibleText("Not Performed");
			}

			if (!drpBloodForUrine.isSelected()) {
				Select SelectBlood = new Select(drpBloodForUrine);
				SelectBlood.selectByVisibleText("Not Performed");
			}

			// Stool Analysis
			if (!drpParasiteForStool.isSelected()) {
				Select selectBloodForStool = new Select(drpParasiteForStool);
				selectBloodForStool.selectByVisibleText("Not Performed");
			}

			if (!drpBloodForStool.isSelected()) {
				Select selectBloodForStool = new Select(drpBloodForStool);
				selectBloodForStool.selectByVisibleText("Not Performed");
			}

		} else if (companyName.equalsIgnoreCase("bp International Limited")) {

			// Para Clinical Examination
			if (!drpECGBP.isSelected()) {
				Select selectECG = new Select(drpECGBP);
				selectECG.selectByVisibleText("Not Performed");
			}
			
			if (!drpRestingECGBP.isSelected()) {
				Select selectRestingECG = new Select(drpRestingECGBP);
				selectRestingECG.selectByVisibleText("Not Performed");
			}
			
			if (!drpStressTestyBP.isSelected()) {
				Select selectStressTest = new Select(drpStressTestyBP);
				selectStressTest.selectByVisibleText("Not Performed");
			}
			
			if (!drpChestXRayBP.isSelected()) {
				Select selectChestXRay = new Select(drpChestXRayBP);
				selectChestXRay.selectByVisibleText("Not Performed");
			}

			// Blood Analysis
			if (!checkBoxRBC.isSelected())
				checkBoxRBC.click();
			if (!checkBoxWBC.isSelected())
				checkBoxWBC.click();
			if (!checkBoxNEUTRO.isSelected())
				checkBoxNEUTRO.click();
			if (!checkBoxEOSINO.isSelected())
				checkBoxEOSINO.click();
			if (!checkBoxBASO.isSelected())
				checkBoxBASO.click();
			if (!checkBoxLYMPHO.isSelected())
				checkBoxLYMPHO.click();
			if (!checkBoxMONO.isSelected())
				checkBoxMONO.click();
			if (!checkBoxHEMATOCRIT.isSelected())
				checkBoxHEMATOCRIT.click();
			if (!checkBoxHEMOGLOBIN.isSelected())
				checkBoxHEMOGLOBIN.click();
			if (!checkBoxSGOTASATBP.isSelected())
				checkBoxSGOTASATBP.click();
			if (!checkBoxSGPTALATBP.isSelected())
				checkBoxSGPTALATBP.click();
			if (!checkBoxGAMMAGTBP.isSelected())
				checkBoxGAMMAGTBP.click();
			if (!checkBoxGLYCEMIABP.isSelected())
				checkBoxGLYCEMIABP.click();
			if (!checkBoxCHOLESTEROLBP.isSelected())
				checkBoxCHOLESTEROLBP.click();
			if (!checkBoxHDLBP.isSelected())
				checkBoxHDLBP.click();
			if (!checkBoxLDLBP.isSelected())
				checkBoxLDLBP.click();
			if (!checkBoxCREATININEBP.isSelected())
				checkBoxCREATININEBP.click();
			if (!checkBoxURICACIDBP.isSelected())
				checkBoxURICACIDBP.click();
			if (!checkBoxTRIGLYCERIDESBP.isSelected())
				checkBoxTRIGLYCERIDESBP.click();

			// Eyes

			// Additional Blood Test
			if (!checkBoxUREABP.isSelected())
				checkBoxUREABP.click();
			if (!checkBoxPSABP.isSelected())
				checkBoxPSABP.click();
			if (!checkBoxCEABP.isSelected())
				checkBoxCEABP.click();
			if (!checkBoxTSHBP.isSelected())
				checkBoxTSHBP.click();
			
			if (!drpQuantiferonGoldTBTestBP.isSelected()) {
				Select SelectAlbumin = new Select(drpQuantiferonGoldTBTestBP);
				SelectAlbumin.selectByVisibleText("Not Performed");
			}

			// Urine Analysis
			if (!drpAlbumin.isSelected()) {
				Select SelectAlbumin = new Select(drpAlbumin);
				SelectAlbumin.selectByVisibleText("Not Performed");
			}

			if (!drpSugar.isSelected()) {
				Select SelectSugar = new Select(drpSugar);
				SelectSugar.selectByVisibleText("Not Performed");
			}

			if (!drpBloodForUrine.isSelected()) {
				Select SelectBlood = new Select(drpBloodForUrine);
				SelectBlood.selectByVisibleText("Not Performed");
			}

			if (!drpNitrates.isSelected()) {
				Select SelectBlood = new Select(drpNitrates);
				SelectBlood.selectByVisibleText("Not Performed");
			}

			if (!drpLeukocytes.isSelected()) {
				Select SelectBlood = new Select(drpLeukocytes);
				SelectBlood.selectByVisibleText("Not Performed");
			}

			if (!drpKetones.isSelected()) {
				Select SelectBlood = new Select(drpKetones);
				SelectBlood.selectByVisibleText("Not Performed");
			}

			// Stool Analysis

		} else if (companyName.equalsIgnoreCase("SBM International Personnel Services SA")) {
			// Nothing to select as UI page is empty

		} else if (companyName.equalsIgnoreCase("Michelin")) {

			// Para Clinical Examination
			if (!drpECG.isSelected()) {
				Select selectChestXRay = new Select(drpECG);
				selectChestXRay.selectByVisibleText("Not Performed");
			}

			if (!drpFunctionalRespiratoryTestingMIAL.isSelected()) {
				Select selectChestXRay = new Select(drpFunctionalRespiratoryTestingMIAL);
				selectChestXRay.selectByVisibleText("Not Performed");
			}

			// Blood Analysis
			if (!checkBoxRBC.isSelected())
				checkBoxRBC.click();
			if (!checkBoxWBC.isSelected())
				checkBoxWBC.click();
			if (!checkBoxNEUTRO.isSelected())
				checkBoxNEUTRO.click();
			if (!checkBoxEOSINO.isSelected())
				checkBoxEOSINO.click();
			if (!checkBoxBASO.isSelected())
				checkBoxBASO.click();
			if (!checkBoxLYMPHO.isSelected())
				checkBoxLYMPHO.click();
			if (!checkBoxMONO.isSelected())
				checkBoxMONO.click();
			if (!checkBoxHEMATOCRIT.isSelected())
				checkBoxHEMATOCRIT.click();
			if (!checkBoxHEMOGLOBIN.isSelected())
				checkBoxHEMOGLOBIN.click();
			if (!checkBoxESRMI.isSelected())
				checkBoxESRMI.click();
			if (!checkBoxSGOTASAT.isSelected())
				checkBoxSGOTASAT.click();
			if (!checkBoxSGPTALAT.isSelected())
				checkBoxSGPTALAT.click();
			if (!checkBoxGAMMAGT.isSelected())
				checkBoxGAMMAGT.click();
			if (!checkBoxGLYCEMIA.isSelected())
				checkBoxGLYCEMIA.click();
			if (!checkBoxCHOLESTEROL.isSelected())
				checkBoxCHOLESTEROL.click();
			if (!checkBoxHDL.isSelected())
				checkBoxHDL.click();
			if (!checkBoxLDL.isSelected())
				checkBoxLDL.click();
			if (!checkBoxCREATININE.isSelected())
				checkBoxCREATININE.click();
			if (!checkBoxURICACID.isSelected())
				checkBoxURICACID.click();
			if (!checkBoxTRIGLYCERIDES.isSelected())
				checkBoxTRIGLYCERIDES.click();

			// Eyes

			// Additional Blood Test
			if (!checkBoxAlkalinePhosphataseMI.isSelected()) {
				checkBoxAlkalinePhosphataseMI.click();
			}

			// Urine Analysis
			if (!drpAlbumin.isSelected()) {
				Select SelectAlbumin = new Select(drpAlbumin);
				SelectAlbumin.selectByVisibleText("Not Performed");
			}

			if (!drpSugar.isSelected()) {
				Select SelectSugar = new Select(drpSugar);
				SelectSugar.selectByVisibleText("Not Performed");
			}

			if (!drpBloodForUrine.isSelected()) {
				Select SelectBlood = new Select(drpBloodForUrine);
				SelectBlood.selectByVisibleText("Not Performed");
			}

			if (!drpNitrates.isSelected()) {
				Select SelectBlood = new Select(drpNitrates);
				SelectBlood.selectByVisibleText("Not Performed");
			}

			if (!drpLeukocytes.isSelected()) {
				Select SelectBlood = new Select(drpLeukocytes);
				SelectBlood.selectByVisibleText("Not Performed");
			}

			if (!drpKetones.isSelected()) {
				Select SelectBlood = new Select(drpKetones);
				SelectBlood.selectByVisibleText("Not Performed");
			}

		} else if (companyName.equalsIgnoreCase("Richemont")) {

			if (!drpBoneDensitometry.isSelected()) {
				Select selectEyesAndPupils = new Select(drpBoneDensitometry);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpUltrasoundThyroid.isSelected()) {
				Select selectEyesAndPupils = new Select(drpUltrasoundThyroid);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpECGRT.isSelected()) {
				Select selectEyesAndPupils = new Select(drpECGRT);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpTreadmill.isSelected()) {
				Select selectEyesAndPupils = new Select(drpTreadmill);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpChestXRayRT.isSelected()) {
				Select selectEyesAndPupils = new Select(drpChestXRayRT);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpFunctionalRespiratoryTestingRT.isSelected()) {
				Select selectEyesAndPupils = new Select(drpFunctionalRespiratoryTestingRT);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpAbdominalPelvicEchographyRT.isSelected()) {
				Select selectEyesAndPupils = new Select(drpAbdominalPelvicEchographyRT);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpCarotidEchoDopplerRT.isSelected()) {
				Select selectEyesAndPupils = new Select(drpCarotidEchoDopplerRT);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpCardiacEchographyRT.isSelected()) {
				Select selectEyesAndPupils = new Select(drpCardiacEchographyRT);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpMammographyRT.isSelected()) {
				Select selectEyesAndPupils = new Select(drpMammographyRT);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			if (!drpPAPSmearRT.isSelected()) {
				Select selectEyesAndPupils = new Select(drpPAPSmearRT);
				selectEyesAndPupils.selectByVisibleText("Not Performed");
			}

			// Blood Analysis
			if (!checkBoxFerritinRT.isSelected())
				checkBoxFerritinRT.click();
			if (!checkBoxRBCRTKN.isSelected())
				checkBoxRBCRTKN.click();
			if (!checkBoxWBCRTKN.isSelected())
				checkBoxWBCRTKN.click();
			if (!checkBoxNEUTRORTKN.isSelected())
				checkBoxNEUTRORTKN.click();
			if (!checkBoxEOSINORTKN.isSelected())
				checkBoxEOSINORTKN.click();
			if (!checkBoxBASORTKN.isSelected())
				checkBoxBASORTKN.click();
			if (!checkBoxLYMPHORTKN.isSelected())
				checkBoxLYMPHORTKN.click();
			if (!checkBoxMONORTKN.isSelected())
				checkBoxMONORTKN.click();
			if (!checkBoxHEMATOCRITRTKN.isSelected())
				checkBoxHEMATOCRITRTKN.click();
			if (!checkBoxHEMOGLOBINRTKN.isSelected())
				checkBoxHEMOGLOBINRTKN.click();
			if (!checkBoxESRRTKN.isSelected())
				checkBoxESRRTKN.click();
			if (!checkBoxSGOTASATRTKN.isSelected())
				checkBoxSGOTASATRTKN.click();
			if (!checkBoxSGPTALATRTKN.isSelected())
				checkBoxSGPTALATRTKN.click();
			if (!checkBoxGAMMAGTRTKN.isSelected())
				checkBoxGAMMAGTRTKN.click();
			if (!checkBoxGLYCEMIARTKN.isSelected())
				checkBoxGLYCEMIARTKN.click();
			if (!checkBoxCHOLESTEROLRTKN.isSelected())
				checkBoxCHOLESTEROLRTKN.click();
			if (!checkBoxHDLRTKN.isSelected())
				checkBoxHDLRTKN.click();
			if (!checkBoxLDLRTKN.isSelected())
				checkBoxLDLRTKN.click();
			if (!checkBoxCREATININERTKN.isSelected())
				checkBoxCREATININERTKN.click();
			if (!checkBoxURICACIDRTKN.isSelected())
				checkBoxURICACIDRTKN.click();
			if (!checkBoxTRIGLYCERIDESRTKN.isSelected())
				checkBoxTRIGLYCERIDESRTKN.click();

			// Eyes
			if (!checkBoxTonometryRightEye.isSelected())
				checkBoxTonometryRightEye.click();
			if (!checkBoxTonometryLeftEye.isSelected())
				checkBoxTonometryLeftEye.click();

			// Additional Blood Test
			if (!checkBoxHbA1c.isSelected())
				checkBoxHbA1c.click();
			/*
			 * if (!checkBoxPSART.isSelected()) checkBoxPSART.click();
			 */
			if (!checkBoxAlkalinePhosphataseRT.isSelected())
				checkBoxAlkalinePhosphataseRT.click();

			// Urine Analysis
			if (!drpAlbumin.isSelected()) {
				Select SelectAlbumin = new Select(drpAlbumin);
				SelectAlbumin.selectByVisibleText("Not Performed");
			}

			if (!drpSugar.isSelected()) {
				Select SelectSugar = new Select(drpSugar);
				SelectSugar.selectByVisibleText("Not Performed");
			}

			if (!drpBloodForUrine.isSelected()) {
				Select SelectBlood = new Select(drpBloodForUrine);
				SelectBlood.selectByVisibleText("Not Performed");
			}

			if (!drpNitrates.isSelected()) {
				Select SelectBlood = new Select(drpNitrates);
				SelectBlood.selectByVisibleText("Not Performed");
			}

			if (!drpLeukocytes.isSelected()) {
				Select SelectBlood = new Select(drpLeukocytes);
				SelectBlood.selectByVisibleText("Not Performed");
			}

			if (!drpKetones.isSelected()) {
				Select SelectBlood = new Select(drpKetones);
				SelectBlood.selectByVisibleText("Not Performed");
			}

			// Stool Analysis

		} else if (companyName.equalsIgnoreCase("MAINBY SA")) {
			// Para Clinical Examination
			if (!drpECGMY.isSelected()) {
				Select selectparaClinicalExamination = new Select(drpECGMY);
				selectparaClinicalExamination.selectByVisibleText("Not Performed");
			}

			if (!drpChestXRayMY.isSelected()) {
				Select selectChestXRay = new Select(drpChestXRayMY);
				selectChestXRay.selectByVisibleText("Not Performed");
			}

			// Blood Analysis
			if (!checkBoxRBC.isSelected())
				checkBoxRBC.click();
			if (!checkBoxWBC.isSelected())
				checkBoxWBC.click();
			if (!checkBoxNEUTRO.isSelected())
				checkBoxNEUTRO.click();
			if (!checkBoxEOSINO.isSelected())
				checkBoxEOSINO.click();
			if (!checkBoxBASO.isSelected())
				checkBoxBASO.click();
			if (!checkBoxLYMPHO.isSelected())
				checkBoxLYMPHO.click();
			if (!checkBoxMONO.isSelected())
				checkBoxMONO.click();
			if (!checkBoxHEMATOCRIT.isSelected())
				checkBoxHEMATOCRIT.click();
			if (!checkBoxHEMOGLOBIN.isSelected())
				checkBoxHEMOGLOBIN.click();
			if (!checkBoxESRMY.isSelected())
				checkBoxESRMY.click();
			if (!checkBoxGLYCEMIAMY.isSelected())
				checkBoxGLYCEMIAMY.click();
			if (!checkBoxCHOLESTEROLMY.isSelected())
				checkBoxCHOLESTEROLMY.click();
			if (!checkBoxHDLMY.isSelected())
				checkBoxHDLMY.click();
			if (!checkBoxLDLMY.isSelected())
				checkBoxLDLMY.click();
			if (!checkBoxCREATININEMY.isSelected())
				checkBoxCREATININEMY.click();
			if (!checkBoxURICACIDMY.isSelected())
				checkBoxURICACIDMY.click();
			if (!checkBoxTRIGLYCERIDESMY.isSelected())
				checkBoxTRIGLYCERIDESMY.click();

			// Eyes

			// Additional Blood Test
			if (!checkBoxPSA.isSelected())
				checkBoxPSA.click();
			if (!checkBoxPlateletCount.isSelected())
				checkBoxPlateletCount.click();
			if (!checkBoxAlkalinePhosphataseMY.isSelected())
				checkBoxAlkalinePhosphataseMY.click();

			// Urine Analysis
			if (!drpAlbumin.isSelected()) {
				Select SelectAlbumin = new Select(drpAlbumin);
				SelectAlbumin.selectByVisibleText("Not Performed");
			}

			if (!drpSugar.isSelected()) {
				Select SelectSugar = new Select(drpSugar);
				SelectSugar.selectByVisibleText("Not Performed");
			}

			if (!drpBloodForUrine.isSelected()) {
				Select SelectBlood = new Select(drpBloodForUrine);
				SelectBlood.selectByVisibleText("Not Performed");
			}

			// Stool Analysis

		} else if (companyName.equalsIgnoreCase("Kinross")) {
			WaitUtils.sleep(2);

			// Para Clinical Examination
			if (!drpECG.isSelected()) {
				Select selectECGRT = new Select(drpECG);
				selectECGRT.selectByVisibleText("Not Performed");
			}

			if (!drpTreadmillKN.isSelected()) {
				Select selectTreadmill = new Select(drpTreadmillKN);
				selectTreadmill.selectByVisibleText("Not Performed");
			}

			if (!drpChestXRay.isSelected()) {
				Select selectChestXRayRT = new Select(drpChestXRay);
				selectChestXRayRT.selectByVisibleText("Not Performed");
			}

			if (!drpFunctionalRespiratoryTesting.isSelected()) {
				Select selectFunctionalRespiratoryTestingRT = new Select(drpFunctionalRespiratoryTesting);
				selectFunctionalRespiratoryTestingRT.selectByVisibleText("Not Performed");
			}

			// Blood Analysis
			if (!checkBoxBloodHbA1cKN.isSelected())
				checkBoxBloodHbA1cKN.click();
			if (!checkBoxRBCRTKN.isSelected())
				checkBoxRBCRTKN.click();
			if (!checkBoxWBCRTKN.isSelected())
				checkBoxWBCRTKN.click();
			if (!checkBoxNEUTRORTKN.isSelected())
				checkBoxNEUTRORTKN.click();
			if (!checkBoxEOSINORTKN.isSelected())
				checkBoxEOSINORTKN.click();
			if (!checkBoxBASORTKN.isSelected())
				checkBoxBASORTKN.click();
			if (!checkBoxLYMPHORTKN.isSelected())
				checkBoxLYMPHORTKN.click();
			if (!checkBoxMONORTKN.isSelected())
				checkBoxMONORTKN.click();
			if (!checkBoxHEMATOCRITRTKN.isSelected())
				checkBoxHEMATOCRITRTKN.click();
			if (!checkBoxHEMOGLOBINRTKN.isSelected())
				checkBoxHEMOGLOBINRTKN.click();
			if (!checkBoxESRRTKN.isSelected())
				checkBoxESRRTKN.click();
			if (!checkBoxSGOTASATRTKN.isSelected())
				checkBoxSGOTASATRTKN.click();
			if (!checkBoxSGPTALATRTKN.isSelected())
				checkBoxSGPTALATRTKN.click();
			if (!checkBoxGAMMAGTRTKN.isSelected())
				checkBoxGAMMAGTRTKN.click();
			if (!checkBoxGLYCEMIARTKN.isSelected())
				checkBoxGLYCEMIARTKN.click();
			if (!checkBoxCHOLESTEROLRTKN.isSelected())
				checkBoxCHOLESTEROLRTKN.click();
			if (!checkBoxHDLRTKN.isSelected())
				checkBoxHDLRTKN.click();
			if (!checkBoxLDLRTKN.isSelected())
				checkBoxLDLRTKN.click();
			if (!checkBoxCREATININERTKN.isSelected())
				checkBoxCREATININERTKN.click();
			if (!checkBoxURICACIDRTKN.isSelected())
				checkBoxURICACIDRTKN.click();
			if (!checkBoxTRIGLYCERIDESRTKN.isSelected())
				checkBoxTRIGLYCERIDESRTKN.click();

			// Eyes

			// Additional Blood Test
			if (!checkBoxVitaminD2.isSelected())
				checkBoxVitaminD2.click();
			if (!checkBoxHbA1cKN.isSelected())
				checkBoxHbA1cKN.click();
			if (!checkBoxElectrolytesSodium.isSelected())
				checkBoxElectrolytesSodium.click();
			if (!checkBoxElectrolytesCalcium.isSelected())
				checkBoxElectrolytesCalcium.click();
			if (!checkBoxElectrolytesPotassium.isSelected())
				checkBoxElectrolytesPotassium.click();
			if (!drpQuantiferonGoldTBTestKN.isSelected()) {
				Select SelectQuantiferonGoldTBTestKN = new Select(drpQuantiferonGoldTBTestKN);
				SelectQuantiferonGoldTBTestKN.selectByVisibleText("Not Performed");
			}
			if (!checkBoxTSHKN.isSelected())
				checkBoxTSHKN.click();
			if (!checkBoxAlkalinePhosphataseKN.isSelected())
				checkBoxAlkalinePhosphataseKN.click();

			// Urine Analysis
			if (!drpAlbumin.isSelected()) {
				Select SelectAlbuminKN = new Select(drpAlbumin);
				SelectAlbuminKN.selectByVisibleText("Not Performed");
			}

			if (!drpSugar.isSelected()) {
				Select SelectSugar = new Select(drpSugar);
				SelectSugar.selectByVisibleText("Not Performed");
			}

			if (!drpBloodForUrine.isSelected()) {
				Select SelectBloodUrine = new Select(drpBloodForUrine);
				SelectBloodUrine.selectByVisibleText("Not Performed");
			}

			if (!drpNitrates.isSelected()) {
				Select SelectNitratesKN = new Select(drpNitrates);
				SelectNitratesKN.selectByVisibleText("Not Performed");
			}

			if (!drpLeukocytes.isSelected()) {
				Select SelectLeukocytes = new Select(drpLeukocytes);
				SelectLeukocytes.selectByVisibleText("Not Performed");
			}

			if (!drpKetones.isSelected()) {
				Select SelectKetones = new Select(drpKetones);
				SelectKetones.selectByVisibleText("Not Performed");
			}

			// Stool Analysis

		} else if (companyName.equalsIgnoreCase("Frontex")) {
			WaitUtils.sleep(2);

			// Para Clinical Examination
		} else if (companyName.equalsIgnoreCase("Eramet")) {
			WaitUtils.sleep(2);

			// Para Clinical Examination

			if (!drpECGET.isSelected()) {
				Select selectECGRT = new Select(drpECGET);
				selectECGRT.selectByVisibleText("Not Performed");
			}

			if (!drpFunctionalRespiratoryTestingET.isSelected()) {
				Select selectFunctionalRespiratoryTestingET = new Select(drpFunctionalRespiratoryTestingET);
				selectFunctionalRespiratoryTestingET.selectByVisibleText("Not Performed");
			}

			// Blood Analysis
			if (!checkBoxRBC.isSelected())
				checkBoxRBC.click();
			if (!checkBoxWBC.isSelected())
				checkBoxWBC.click();
			if (!checkBoxNEUTRO.isSelected())
				checkBoxNEUTRO.click();
			if (!checkBoxEOSINO.isSelected())
				checkBoxEOSINO.click();
			if (!checkBoxBASO.isSelected())
				checkBoxBASO.click();
			if (!checkBoxLYMPHO.isSelected())
				checkBoxLYMPHO.click();
			if (!checkBoxMONO.isSelected())
				checkBoxMONO.click();
			if (!checkBoxHEMATOCRIT.isSelected())
				checkBoxHEMATOCRIT.click();
			if (!checkBoxHEMOGLOBIN.isSelected())
				checkBoxHEMOGLOBIN.click();
			if (!checkBoxESR.isSelected())
				checkBoxESR.click();
			if (!checkBoxSGOTASAT.isSelected())
				checkBoxSGOTASAT.click();
			if (!checkBoxSGPTALAT.isSelected())
				checkBoxSGPTALAT.click();
			if (!checkBoxGAMMAGT.isSelected())
				checkBoxGAMMAGT.click();
			if (!checkBoxGLYCEMIA.isSelected())
				checkBoxGLYCEMIA.click();
			if (!checkBoxCHOLESTEROL.isSelected())
				checkBoxCHOLESTEROL.click();
			if (!checkBoxHDL.isSelected())
				;
			checkBoxHDL.click();
			if (!checkBoxLDL.isSelected())
				checkBoxLDL.click();
			if (!checkBoxCREATININE.isSelected())
				checkBoxCREATININE.click();
			if (!checkBoxURICACID.isSelected())
				checkBoxURICACID.click();
			if (!checkBoxTRIGLYCERIDES.isSelected())
				checkBoxTRIGLYCERIDES.click();

			// Eyes

			// Additional Blood Test
			if (!checkBoxHbA1c.isSelected())
				checkBoxHbA1c.click();
			if (!checkBoxAlkalinePhosphataseRT.isSelected())
				checkBoxAlkalinePhosphataseRT.click();

			// Urine Analysis
			if (!drpAlbumin.isSelected()) {
				Select SelectAlbuminKN = new Select(drpAlbumin);
				SelectAlbuminKN.selectByVisibleText("Not Performed");
			}

			if (!drpSugar.isSelected()) {
				Select SelectSugar = new Select(drpSugar);
				SelectSugar.selectByVisibleText("Not Performed");
			}

			if (!drpBloodForUrine.isSelected()) {
				Select SelectBloodUrine = new Select(drpBloodForUrine);
				SelectBloodUrine.selectByVisibleText("Not Performed");
			}

			if (!drpNitrates.isSelected()) {
				Select SelectNitratesKN = new Select(drpNitrates);
				SelectNitratesKN.selectByVisibleText("Not Performed");
			}

			if (!drpLeukocytes.isSelected()) {
				Select SelectLeukocytes = new Select(drpLeukocytes);
				SelectLeukocytes.selectByVisibleText("Not Performed");
			}

			if (!drpKetones.isSelected()) {
				Select SelectKetones = new Select(drpKetones);
				SelectKetones.selectByVisibleText("Not Performed");
			}

			// Stool Analysis
		} else if (companyName.equalsIgnoreCase("bp USA")) {
			WaitUtils.sleep(2);

			// Para Clinical Examination
			if (!drpChestXRayBPUSA.isSelected()) {
				Select selectECGRT = new Select(drpChestXRayBPUSA);
				selectECGRT.selectByVisibleText("Not Performed");
			}

			// Blood Analysis
			if (!checkBoxRBC.isSelected())
				checkBoxRBC.click();
			if (!checkBoxWBC.isSelected())
				checkBoxWBC.click();
			if (!checkBoxNEUTRO.isSelected())
				checkBoxNEUTRO.click();
			if (!checkBoxEOSINO.isSelected())
				checkBoxEOSINO.click();
			if (!checkBoxBASO.isSelected())
				checkBoxBASO.click();
			if (!checkBoxLYMPHO.isSelected())
				checkBoxLYMPHO.click();
			if (!checkBoxMONO.isSelected())
				checkBoxMONO.click();
			if (!checkBoxHEMATOCRIT.isSelected())
				checkBoxHEMATOCRIT.click();
			if (!checkBoxHEMOGLOBIN.isSelected())
				checkBoxHEMOGLOBIN.click();
			if (!checkBoxSGOTASATBP.isSelected())
				checkBoxSGOTASATBP.click();
			if (!checkBoxSGPTALATBP.isSelected())
				checkBoxSGPTALATBP.click();
			if (!checkBoxGAMMAGTBP.isSelected())
				checkBoxGAMMAGTBP.click();
			if (!checkBoxGLYCEMIABP.isSelected())
				checkBoxGLYCEMIABP.click();
			if (!checkBoxCHOLESTEROLBP.isSelected())
				checkBoxCHOLESTEROLBP.click();
			if (!checkBoxHDLBP.isSelected())
				checkBoxHDLBP.click();
			if (!checkBoxTRIGLYCERIDESBP.isSelected())
				checkBoxTRIGLYCERIDESBP.click();

			// Eyes

			// Additional Blood Test
			if (!drpQuantiferonGoldTBTestBP.isSelected()) {
				Select SelectAlbuminKN = new Select(drpQuantiferonGoldTBTestBP);
				SelectAlbuminKN.selectByVisibleText("Not Performed");
			}

			// Urine Analysis
			if (!drpAlbumin.isSelected()) {
				Select SelectAlbuminKN = new Select(drpAlbumin);
				SelectAlbuminKN.selectByVisibleText("Not Performed");
			}

			if (!drpSugar.isSelected()) {
				Select SelectSugar = new Select(drpSugar);
				SelectSugar.selectByVisibleText("Not Performed");
			}

			if (!drpBloodForUrine.isSelected()) {
				Select SelectBloodUrine = new Select(drpBloodForUrine);
				SelectBloodUrine.selectByVisibleText("Not Performed");
			}

			if (!drpNitrates.isSelected()) {
				Select SelectNitratesKN = new Select(drpNitrates);
				SelectNitratesKN.selectByVisibleText("Not Performed");
			}

			if (!drpLeukocytes.isSelected()) {
				Select SelectLeukocytes = new Select(drpLeukocytes);
				SelectLeukocytes.selectByVisibleText("Not Performed");
			}

			if (!drpKetones.isSelected()) {
				Select SelectKetones = new Select(drpKetones);
				SelectKetones.selectByVisibleText("Not Performed");
			}

			// Stool Analysis
		} else if (companyName.equalsIgnoreCase("MY COMPANY")) {
			WaitUtils.waitForPageLoad(driver);

			// Para Clinical Examination
			if (!drpECG.isSelected()) {
				Select selectECG = new Select(drpECG);
				selectECG.selectByVisibleText("Not Performed");
			}
			
			if (!drpChestXRayMY.isSelected()) {
				Select selectChestXRay = new Select(drpChestXRayMY);
				selectChestXRay.selectByVisibleText("Not Performed");
			}

			if (!drpFunctionalRespiratoryTestingMY.isSelected()) {
				Select selectFunctionalRespiratoryTesting = new Select(drpFunctionalRespiratoryTestingMY);
				selectFunctionalRespiratoryTesting.selectByVisibleText("Not Performed");
			}

			// Blood Analysis
			if (!checkBoxRBC.isSelected())
				checkBoxRBC.click();
			if (!checkBoxWBC.isSelected())
				checkBoxWBC.click();
			if (!checkBoxNEUTRO.isSelected())
				checkBoxNEUTRO.click();
			if (!checkBoxEOSINO.isSelected())
				checkBoxEOSINO.click();
			if (!checkBoxBASO.isSelected())
				checkBoxBASO.click();
			if (!checkBoxLYMPHO.isSelected())
				checkBoxLYMPHO.click();
			if (!checkBoxMONO.isSelected())
				checkBoxMONO.click();
			if (!checkBoxHEMATOCRIT.isSelected())
				checkBoxHEMATOCRIT.click();
			if (!checkBoxHEMOGLOBIN.isSelected())
				checkBoxHEMOGLOBIN.click();
			if (!checkBoxESR.isSelected())
				checkBoxESR.click();
			if (!checkBoxSGOTASAT.isSelected())
				checkBoxSGOTASAT.click();
			if (!checkBoxSGPTALAT.isSelected())
				checkBoxSGPTALAT.click();
			if (!checkBoxGAMMAGT.isSelected())
				checkBoxGAMMAGT.click();
			if (!checkBoxGLYCEMIA.isSelected())
				checkBoxGLYCEMIA.click();
			if (!checkBoxCHOLESTEROL.isSelected())
				checkBoxCHOLESTEROL.click();
			if (!checkBoxHDL.isSelected())
				checkBoxHDL.click();
			if (!checkBoxLDL.isSelected())
				checkBoxLDL.click();
			if (!checkBoxCREATININE.isSelected())
				checkBoxCREATININE.click();
			if (!checkBoxURICACID.isSelected())
				checkBoxURICACID.click();
			if (!checkBoxTRIGLYCERIDES.isSelected())
				checkBoxTRIGLYCERIDES.click();

			// Eyes

			// Additional Blood Test
			
			if (!checkBoxHbA1cMY.isSelected())
				checkBoxHbA1cMY.click();
			if (!drpQuantiferonGoldTBTest.isSelected()) {
				Select SelQuantiferonGoldTBTest = new Select(drpQuantiferonGoldTBTest);
				SelQuantiferonGoldTBTest.selectByVisibleText("Not Performed");
		}

			// Urine Analysis
			if (!drpAlbumin.isSelected()) {
				Select SelectAlbumin = new Select(drpAlbumin);
				SelectAlbumin.selectByVisibleText("Not Performed");
			}

			if (!drpSugar.isSelected()) {
				Select SelectSugar = new Select(drpSugar);
				SelectSugar.selectByVisibleText("Not Performed");
			}

			if (!drpNitrates.isSelected()) {
				Select SelectBlood = new Select(drpNitrates);
				SelectBlood.selectByVisibleText("Not Performed");
			}

			if (!drpBloodForUrine.isSelected()) {
				Select SelectNitrates = new Select(drpBloodForUrine);
				SelectNitrates.selectByVisibleText("Not Performed");
			}

			if (!drpLeukocytes.isSelected()) {
				Select SelectLeukocytes = new Select(drpLeukocytes);
				SelectLeukocytes.selectByVisibleText("Not Performed");
			}

			if (!drpKetones.isSelected()) {
				Select SelectKetones = new Select(drpKetones);
				SelectKetones.selectByVisibleText("Not Performed");
			}

			// Stool Analysis
			if (!drpBloodForStoolMY.isSelected()) {
				Select selectBloodForStool = new Select(drpBloodForStoolMY);
				selectBloodForStool.selectByVisibleText("Not Performed");
			}
			
			if (!drpParasitesMY.isSelected()) {
				Select selectParasitesMY = new Select(drpParasitesMY);
				selectParasitesMY.selectByVisibleText("Not Performed");
			}
			
		} else if (companyName.equalsIgnoreCase("NOVARTIS")) {
			WaitUtils.sleep(2);

			// Para Clinical Examination
			if (!drpECG.isSelected()) {
			Select selectECGRT = new Select(drpECG);
			selectECGRT.selectByVisibleText("Not Performed");
			}

			if (!drpTreadmillKN.isSelected()) {
			Select selectTreadmill = new Select(drpTreadmillKN);
			selectTreadmill.selectByVisibleText("Not Performed");
			}
			
			if (!drpPAPSmearNOV.isSelected()) {
			Select selectPAPSmear = new Select(drpPAPSmearNOV);
			selectPAPSmear.selectByVisibleText("Not Performed");
			}
			
			// Blood Analysis
			if (!checkBoxFerritin.isSelected())
			checkBoxFerritin.click();
			
			if (!checkBoxRBCRTKN.isSelected())
			checkBoxRBCRTKN.click();
			
			if (!checkBoxWBCRTKN.isSelected())
			checkBoxWBCRTKN.click();
			
			if (!checkBoxNEUTRORTKN.isSelected())
			checkBoxNEUTRORTKN.click();
			
			if (!checkBoxEOSINORTKN.isSelected())
			checkBoxEOSINORTKN.click();
			
			if (!checkBoxBASORTKN.isSelected())
			checkBoxBASORTKN.click();
			
			if (!checkBoxLYMPHORTKN.isSelected())
			checkBoxLYMPHORTKN.click();
			
			if (!checkBoxMONORTKN.isSelected())
			checkBoxMONORTKN.click();
			
			if (!checkBoxHEMATOCRITRTKN.isSelected())
			checkBoxHEMATOCRITRTKN.click();
			
			if (!checkBoxHEMOGLOBINRTKN.isSelected())
			checkBoxHEMOGLOBINRTKN.click();
			
			if (!checkBoxESRRTKN.isSelected())
			checkBoxESRRTKN.click();
			
			if (!checkBoxSGOTASATRTKN.isSelected())
			checkBoxSGOTASATRTKN.click();
			
			if (!checkBoxSGPTALATRTKN.isSelected())
			checkBoxSGPTALATRTKN.click();
			
			if (!checkBoxGAMMAGTRTKN.isSelected())
			checkBoxGAMMAGTRTKN.click();
			
			if (!checkBoxGLYCEMIARTKN.isSelected())
			checkBoxGLYCEMIARTKN.click();
			
			if (!checkBoxCHOLESTEROLRTKN.isSelected())
			checkBoxCHOLESTEROLRTKN.click();
			
			if (!checkBoxHDLRTKN.isSelected())
			checkBoxHDLRTKN.click();
			
			if (!checkBoxLDLRTKN.isSelected())
			checkBoxLDLRTKN.click();
			
			if (!checkBoxCREATININERTKN.isSelected())
			checkBoxCREATININERTKN.click();
			
			if (!checkBoxURICACIDRTKN.isSelected())
			checkBoxURICACIDRTKN.click();
			
			if (!checkBoxTRIGLYCERIDESRTKN.isSelected())
			checkBoxTRIGLYCERIDESRTKN.click();

			// Eyes

			// Additional Blood Test
			if (!checkBoxHbA1c.isSelected())
			checkBoxHbA1c.click();
			
			if (!checkBoxPlateletCount.isSelected())
			checkBoxPlateletCount.click();
			
			if (!checkBoxAlkalinePhosphataseMY.isSelected())
			checkBoxAlkalinePhosphataseMY.click();

			// Urine Analysis
			if (!drpAlbumin.isSelected()) {
			Select SelectAlbuminKN = new Select(drpAlbumin);
			SelectAlbuminKN.selectByVisibleText("Not Performed");
			}
			
			if (!drpSugar.isSelected()) {
			Select SelectSugar = new Select(drpSugar);
			SelectSugar.selectByVisibleText("Not Performed");
			}
			
			if (!drpBloodForUrine.isSelected()) {
			Select SelectBloodUrine = new Select(drpBloodForUrine);
			SelectBloodUrine.selectByVisibleText("Not Performed");
			}
			
			if (!drpNitrates.isSelected()) {
			Select SelectNitratesKN = new Select(drpNitrates);
			SelectNitratesKN.selectByVisibleText("Not Performed");
			}
			
			if (!drpLeukocytes.isSelected()) {
			Select SelectLeukocytes = new Select(drpLeukocytes);
			SelectLeukocytes.selectByVisibleText("Not Performed");
			}
			
			if (!drpKetones.isSelected()) {
			Select SelectKetones = new Select(drpKetones);
			SelectKetones.selectByVisibleText("Not Performed");
			}
			
			// Stool Analysis
			if (!drpBloodForStoolMI.isSelected()) {
			Select SelectBloodStoolMI = new Select(drpBloodForStoolMI);
			SelectBloodStoolMI.selectByVisibleText("Not Performed");
			}
		}

		else if (companyName.equalsIgnoreCase("ARKEMA")) {
			WaitUtils.sleep(2);

			// Para Clinical Examination
			if (!drpECG.isSelected()) {
			Select selectECGRT = new Select(drpECG);
			selectECGRT.selectByVisibleText("Not Performed");
			}

			if (!drpChestXRayBP.isSelected()) {
			Select selectChestXRayRT = new Select(drpChestXRayBP);
			selectChestXRayRT.selectByVisibleText("Not Performed");
			}
			
			// Blood Analysis
			if (!checkBoxRBC.isSelected())
			checkBoxRBC.click();
			
			if (!checkBoxWBC.isSelected())
			checkBoxWBC.click();
			
			if (!checkBoxNEUTRO.isSelected())
			checkBoxNEUTRO.click();
			
			if (!checkBoxEOSINO.isSelected())
			checkBoxEOSINO.click();
			
			if (!checkBoxBASO.isSelected())
			checkBoxBASO.click();
			
			if (!checkBoxLYMPHO.isSelected())
			checkBoxLYMPHO.click();
			
			if (!checkBoxMONO.isSelected())
			checkBoxMONO.click();
			
			if (!checkBoxHEMATOCRIT.isSelected())
			checkBoxHEMATOCRIT.click();
			
			if (!checkBoxHEMOGLOBIN.isSelected())
			checkBoxHEMOGLOBIN.click();
			
			if (!checkBoxESR.isSelected())
			checkBoxESR.click();
			
			if (!checkBoxSGOTASAT.isSelected())
			checkBoxSGOTASAT.click();
			
			if (!checkBoxSGPTALAT.isSelected())
			checkBoxSGPTALAT.click();
			
			if (!checkBoxGAMMAGT.isSelected())
			checkBoxGAMMAGT.click();
			
			if (!checkBoxGLYCEMIA.isSelected())
			checkBoxGLYCEMIA.click();
			
			if (!checkBoxCHOLESTEROL.isSelected())
			checkBoxCHOLESTEROL.click();
			
			if (!checkBoxHDL.isSelected())
			checkBoxHDL.click();
			
			if (!checkBoxLDL.isSelected())
			checkBoxLDL.click();
			
			if (!checkBoxCREATININE.isSelected())
			checkBoxCREATININE.click();
			
			if (!checkBoxURICACID.isSelected())
			checkBoxURICACID.click();
			
			if (!checkBoxTRIGLYCERIDES.isSelected())
			checkBoxTRIGLYCERIDES.click();

			// Eyes

			// Additional Blood Test
			if (!checkBoxAlkalinePhosphataseMI.isSelected())
			checkBoxAlkalinePhosphataseMI.click();

			// Urine Analysis
			if (!drpAlbumin.isSelected()) {
			Select SelectAlbuminKN = new Select(drpAlbumin);
			SelectAlbuminKN.selectByVisibleText("Not Performed");
			}
			
			if (!drpSugar.isSelected()) {
			Select SelectSugar = new Select(drpSugar);
			SelectSugar.selectByVisibleText("Not Performed");
			}
			
			if (!drpBloodForUrine.isSelected()) {
			Select SelectBloodUrine = new Select(drpBloodForUrine);
			SelectBloodUrine.selectByVisibleText("Not Performed");
			}
			
			if (!drpNitrates.isSelected()) {
			Select SelectNitratesKN = new Select(drpNitrates);
			SelectNitratesKN.selectByVisibleText("Not Performed");
			}
			
			if (!drpLeukocytes.isSelected()) {
			Select SelectLeukocytes = new Select(drpLeukocytes);
			SelectLeukocytes.selectByVisibleText("Not Performed");
			}
			
			if (!drpKetones.isSelected()) {
			Select SelectKetones = new Select(drpKetones);
			SelectKetones.selectByVisibleText("Not Performed");
			}
			
			// Stool Analysis
		}

		else if (companyName.equalsIgnoreCase("BioMerieux")) {
			WaitUtils.sleep(2);

			// Para Clinical Examination
			if (!drpECG.isSelected()) {
			Select selectECGRT = new Select(drpECG);
			selectECGRT.selectByVisibleText("Not Performed");
			}

			// Blood Analysis
			if (!checkBoxRBC.isSelected())
			checkBoxRBC.click();
			
			if (!checkBoxWBC.isSelected())
			checkBoxWBC.click();
			
			if (!checkBoxNEUTRO.isSelected())
			checkBoxNEUTRO.click();
			
			if (!checkBoxEOSINO.isSelected())
			checkBoxEOSINO.click();
			
			if (!checkBoxBASO.isSelected())
			checkBoxBASO.click();
			
			if (!checkBoxLYMPHO.isSelected())
			checkBoxLYMPHO.click();
			
			if (!checkBoxMONO.isSelected())
			checkBoxMONO.click();
			
			if (!checkBoxHEMATOCRIT.isSelected())
			checkBoxHEMATOCRIT.click();
			
			if (!checkBoxHEMOGLOBIN.isSelected())
			checkBoxHEMOGLOBIN.click();
			
			if (!checkBoxESR.isSelected())
			checkBoxESR.click();
			
			if (!checkBoxSGOTASAT.isSelected())
			checkBoxSGOTASAT.click();
			
			if (!checkBoxSGPTALAT.isSelected())
			checkBoxSGPTALAT.click();
			
			if (!checkBoxGAMMAGT.isSelected())
			checkBoxGAMMAGT.click();
			
			if (!checkBoxGLYCEMIA.isSelected())
			checkBoxGLYCEMIA.click();
			
			if (!checkBoxCHOLESTEROL.isSelected())
			checkBoxCHOLESTEROL.click();
			
			if (!checkBoxHDL.isSelected())
			checkBoxHDL.click();
			
			if (!checkBoxLDL.isSelected())
			checkBoxLDL.click();
			
			if (!checkBoxCREATININE.isSelected())
			checkBoxCREATININE.click();
			
			if (!checkBoxURICACID.isSelected())
			checkBoxURICACID.click();
			
			if (!checkBoxTRIGLYCERIDES.isSelected())
			checkBoxTRIGLYCERIDES.click();

			// Eyes

			// Additional Blood Test
			if (!checkBoxHbA1c.isSelected())
			checkBoxHbA1c.click();
			
			if (!checkBoxAlkalinePhosphataseRT.isSelected())
			checkBoxAlkalinePhosphataseRT.click();

			// Urine Analysis
			if (!drpUrinePCRChlamydiaGonorrheaBM.isSelected()) {
			Select SelectPCRChlamydiaGonorrhea = new Select(drpUrinePCRChlamydiaGonorrheaBM);
			SelectPCRChlamydiaGonorrhea.selectByVisibleText("Not Performed");
			}

			if (!drpAlbuminBM.isSelected()) {
			Select SelectAlbuminKN = new Select(drpAlbuminBM);
			SelectAlbuminKN.selectByVisibleText("Not Performed");
			}
			
			if (!drpSugarBM.isSelected()) {
			Select SelectSugar = new Select(drpSugarBM);
			SelectSugar.selectByVisibleText("Not Performed");
			}
			
			if (!drpBloodForUrineBM.isSelected()) {
			Select SelectBloodUrine = new Select(drpBloodForUrineBM);
			SelectBloodUrine.selectByVisibleText("Not Performed");
			}
			
			if (!drpNitratesBM.isSelected()) {
			Select SelectNitratesKN = new Select(drpNitratesBM);
			SelectNitratesKN.selectByVisibleText("Not Performed");
			}
			
			if (!drpLeukocytesBM.isSelected()) {
			Select SelectLeukocytes = new Select(drpLeukocytesBM);
			SelectLeukocytes.selectByVisibleText("Not Performed");
			}
			
			if (!drpKetonesBM.isSelected()) {
			Select SelectKetones = new Select(drpKetonesBM);
			SelectKetones.selectByVisibleText("Not Performed");
			}
			
			// Stool Analysis
			if (!drpBloodForStoolMI.isSelected()) {
			Select SelectBloodStool = new Select(drpBloodForStoolMI);
			SelectBloodStool.selectByVisibleText("Not Performed");
			}
		}

		else if (companyName.equalsIgnoreCase("CGG International S.A.")) {
			WaitUtils.sleep(2);

			// Para Clinical Examination
			if (!drpECG.isSelected()) {
			Select selectECGRT = new Select(drpECG);
			selectECGRT.selectByVisibleText("Not Performed");
			}

			if (!drpTreadmillKN.isSelected()) {
			Select selectTreadmill = new Select(drpTreadmillKN);
			selectTreadmill.selectByVisibleText("Not Performed");
			}
			
			if (!drpChestXRay.isSelected()) {
			Select selectChestXRayRT = new Select(drpChestXRay);
			selectChestXRayRT.selectByVisibleText("Not Performed");
			}
			
			// Blood Analysis
			if (!checkBoxRBC.isSelected())
			checkBoxRBC.click();
			
			if (!checkBoxWBC.isSelected())
			checkBoxWBC.click();
			
			if (!checkBoxNEUTRO.isSelected())
			checkBoxNEUTRO.click();
			
			if (!checkBoxEOSINO.isSelected())
			checkBoxEOSINO.click();
			
			if (!checkBoxBASO.isSelected())
			checkBoxBASO.click();
			
			if (!checkBoxLYMPHO.isSelected())
			checkBoxLYMPHO.click();
			
			if (!checkBoxMONO.isSelected())
			checkBoxMONO.click();
			
			if (!checkBoxHEMATOCRIT.isSelected())
			checkBoxHEMATOCRIT.click();
			
			if (!checkBoxHEMOGLOBIN.isSelected())
			checkBoxHEMOGLOBIN.click();
			
			if (!checkBoxESR.isSelected())
			checkBoxESR.click();
			
			if (!checkBoxSGOTASAT.isSelected())
			checkBoxSGOTASAT.click();
			
			if (!checkBoxSGPTALAT.isSelected())
			checkBoxSGPTALAT.click();
			
			if (!checkBoxGAMMAGT.isSelected())
			checkBoxGAMMAGT.click();
			
			if (!checkBoxGLYCEMIA.isSelected())
			checkBoxGLYCEMIA.click();
			
			if (!checkBoxCHOLESTEROL.isSelected())
			checkBoxCHOLESTEROL.click();
			
			if (!checkBoxHDL.isSelected())
			checkBoxHDL.click();
			
			if (!checkBoxLDL.isSelected())
			checkBoxLDL.click();
			
			if (!checkBoxCREATININE.isSelected())
			checkBoxCREATININE.click();
			
			if (!checkBoxURICACID.isSelected())
			checkBoxURICACID.click();
			
			if (!checkBoxTRIGLYCERIDES.isSelected())
			checkBoxTRIGLYCERIDES.click();

			// Eyes

			// Additional Blood Test
			if (!checkBoxAlkalinePhosphataseMI.isSelected())
			checkBoxAlkalinePhosphataseMI.click();

			// Urine Analysis
			if (!drpAlbumin.isSelected()) {
			Select SelectAlbuminKN = new Select(drpAlbumin);
			SelectAlbuminKN.selectByVisibleText("Not Performed");
			}
			
			if (!drpSugar.isSelected()) {
			Select SelectSugar = new Select(drpSugar);
			SelectSugar.selectByVisibleText("Not Performed");
			}
			
			if (!drpBloodForUrine.isSelected()) {
			Select SelectBloodUrine = new Select(drpBloodForUrine);
			SelectBloodUrine.selectByVisibleText("Not Performed");
			}
			
			if (!drpNitrates.isSelected()) {
			Select SelectNitratesKN = new Select(drpNitrates);
			SelectNitratesKN.selectByVisibleText("Not Performed");
			}
			
			if (!drpLeukocytes.isSelected()) {
			Select SelectLeukocytes = new Select(drpLeukocytes);
			SelectLeukocytes.selectByVisibleText("Not Performed");
			}
			
			if (!drpKetones.isSelected()) {
			Select SelectKetones = new Select(drpKetones);
			SelectKetones.selectByVisibleText("Not Performed");
			}
			
			// Stool Analysis
		}
	}
	
	public void labReportSaveButton() throws InterruptedException {
		JavaScriptUtils.moveToElement(driver, saveLabAnalysisButton);
		saveLabAnalysisButton.click();
		WaitUtils.sleep(2);
		driver.switchTo().defaultContent();
	}

	// Fitness Conclusion Tab
	public void SelectFitnessConclusionTab() {
		fitnessConclusionTab.click();
		WaitUtils.sleep(5);
	}

	// Switching to the frame

	public void SelectFitnesStatus(String FitnesStatus) {
		driver.switchTo().frame(0);
		if (!drpFitnessStatus.isSelected()) {
			Select selectFitnesStatus = new Select(drpFitnessStatus);
			selectFitnesStatus.selectByIndex(1);
		}
	}

	public void editPhysicianCommentsForEmployee(String comments) {
		physicianComments.clear();
		physicianComments.sendKeys(comments);
	}

	public void submitButtonForSOSREview() throws InterruptedException {
		WaitUtils.waitForElementToBeClickable(driver, submitForSOSREview);
		submitForSOSREview.click();
		driver.switchTo().defaultContent();// Switching to the frame

		// submitForSOSREview.click();
	}

	public void SelectTypeOfCase(String TypeOfCase) throws InterruptedException {
		String companyName = driver
				.findElement(By.xpath("//div[@class='MedicalNormalText']//table/tbody/tr/td[2]/table/tbody/tr/td[2]"))
				.getText();
		driver.switchTo().frame(0);// Switching to the frame
		if (companyName.equalsIgnoreCase("Frontex")) {
			if (!driver.findElement(By.id("lstClientReviewerStatus_0")).isSelected())
				driver.findElement(By.id("lstClientReviewerStatus_0")).click();

			driver.findElement(By.id("txtClientReviewerComment")).clear();
			driver.findElement(By.id("txtClientReviewerComment"))
					.sendKeys("Comments for Employee from client review - modified comment");

		} else {
			//JavaScriptUtils.moveToElement(driver, drpTypeofCase);
			WaitUtils.waitForPageLoad(driver);

			if (!drpTypeofCase.isSelected()) {
				Select selectTypeOfCase = new Select(drpTypeofCase);
				selectTypeOfCase.selectByVisibleText(TypeOfCase);

				if (!checkBoxFitnessStatusIntlSOS.isSelected())
					checkBoxFitnessStatusIntlSOS.click();

				CommentsforEmployee.clear();
				CommentsforEmployee.sendKeys("Comments from Intl. SOS - modified comment");
			}
		}
	}

	/*
	 * public void SelectFitnesStatusCheckbox() { if
	 * (!checkBoxFitnessStatusIntlSOS.isSelected())
	 * checkBoxFitnessStatusIntlSOS.click(); }
	 * 
	 * public void selectCommentsForEmployee(String comments) {
	 * CommentsforEmployee.clear(); CommentsforEmployee.sendKeys(comments); }
	 */

	public void clickFinalSaveButton() throws InterruptedException {
		finalSaveButton.click();
		// employeeModifySuccessMsg();
	}

	public void employeeModifySuccessMsg() throws InterruptedException {
		driver.switchTo().defaultContent();// Switching to the frame
		WaitUtils.sleep(3);
		driver.switchTo().frame(0);// Switching to the frame
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
