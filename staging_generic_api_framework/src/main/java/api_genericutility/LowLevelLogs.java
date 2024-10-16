package api_genericutility;

import com.aventstack.extentreports.Status;

import commonobjectutility.UtilityClassObject;

public class LowLevelLogs {

	public void getLowLevelLogInfo(String infoMessage) {

		UtilityClassObject.getTest().log(Status.INFO, infoMessage);

	}
	
	public void getLowLevelLogPass(String passMessage) {

		UtilityClassObject.getTest().log(Status.PASS, passMessage);

	}
	
	public void getLowLevelLogFail(String failMessage) {

		UtilityClassObject.getTest().log(Status.FAIL, failMessage);

	}
	
	


}
