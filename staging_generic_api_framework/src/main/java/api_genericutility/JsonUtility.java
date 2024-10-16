package api_genericutility;

import io.restassured.response.Response;

public class JsonUtility {
	
	public Object getJsonFromBody(Response resp, String key)
	{
		Object obj = resp.jsonPath().get(key);
		return obj;
	}

}
