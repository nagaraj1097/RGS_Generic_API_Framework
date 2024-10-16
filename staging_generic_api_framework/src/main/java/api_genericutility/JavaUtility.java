package api_genericutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class JavaUtility {
	
	public int getRandomNum() {
		Random random = new Random();
		int randomNumber = random.nextInt(5000);
		return randomNumber;
	}
	
	public String getUuid()
	{
		 UUID uuid = UUID.randomUUID();
		 
		 return uuid.toString();
	}

	
}
