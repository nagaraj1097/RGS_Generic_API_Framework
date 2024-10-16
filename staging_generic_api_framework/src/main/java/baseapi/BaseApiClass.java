package baseapi;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.fasterxml.jackson.databind.ObjectMapper;

import api_genericutility.ExcelUtility;
import api_genericutility.FileUtility;

@Listeners(api_listnerimplementation.ListImpClass.class)
public class BaseApiClass {
	
	public ObjectMapper map = new ObjectMapper();
	

	ExcelUtility eu = new ExcelUtility();
	FileUtility fu = new FileUtility();
	public String baseUrl;

	// Main data
	public String token;
	public String playerId;
	public String gameType;
	public String jurisdiction;
	public int amount;
	public String freeBetId = null;
	public String freeBetAmount = null;
	public String startDate;
	public String endDate;
	public String gameId;
	public String userId;
	public boolean isFreeBet;
	
	
	// Extra Data
	public int betAmount;
	public int betAmountAfterTax;
	public String cashOutMultiplier = null; 
	public String cashOutType;
//	String roundId;
	public String platformId;
	public String operatorId;
	public String brand;
	public String region;
	public String currency;
	public String playerName;
	public boolean isFreeGame;

	@BeforeSuite
	public void variables() throws EncryptedDocumentException, IOException {
		
		/* baseUrl */
		baseUrl = fu.getDataFromProperties("baseurl");
		
		/*Initializing main data*/
		
		token = eu.getDataFromExcel("Dragonfly", 2, 2);
		playerId = eu.getDataFromExcel("Dragonfly", 3, 2);
		gameType = eu.getDataFromExcel("Dragonfly", 4, 2);
		jurisdiction = eu.getDataFromExcel("Dragonfly", 5, 2);
		amount = Integer.parseInt(eu.getDataFromExcel("Dragonfly", 6, 2));
		
//		startDate =
//		endDate=
		
		gameId= eu.getDataFromExcel("Dragonfly", 11, 2);
//		userId=
		isFreeBet = Boolean.valueOf(eu.getDataFromExcel("Dragonfly", 13, 2));
		
		/* Initializing Extra Data*/
		
		betAmount = Integer.valueOf(eu.getDataFromExcel("Dragonfly", 17, 2));
		betAmountAfterTax = Integer.valueOf(eu.getDataFromExcel("Dragonfly", 18, 2));
		cashOutType=eu.getDataFromExcel("Dragonfly", 20, 2);
		
//		roundId= eu.getDataFromExcel("Dragonfly", 2, 2);
		
		platformId=eu.getDataFromExcel("Dragonfly", 22, 2);
		operatorId=eu.getDataFromExcel("Dragonfly", 23, 2);
		brand=eu.getDataFromExcel("Dragonfly", 24, 2);
		region=eu.getDataFromExcel("Dragonfly", 25, 2);
		currency=eu.getDataFromExcel("Dragonfly", 26, 2);
		playerName=eu.getDataFromExcel("Dragonfly", 29, 2);
		isFreeGame= Boolean.valueOf(eu.getDataFromExcel("Dragonfly", 30, 2));
		
		
				


	}

}
