package com.ui.pojo;

import java.util.Map;

public class Config {
	
	
	/*{
  "environments": {
    "DEV": {   --> key 
      "url": "http://www.automationpractice.pl"  --> value 
    },
    "QA": {
      "url": "http://www.automationpractice.pl"
    },
    "UAT": {
      "url": "http://www.automationpractice.pl"
    }
  }
}
	 * go to environments field from there take my key which is string in nature take dev then go to envirnment class
	 * take url from ther take gettter url 
	 * 
	 * getEnvironment.get("dev").getUrl
	 * 
	 * 
	 */

	 //pojo class
	  
	  Map<String ,Environment> environments; // instance variable   //dev 

	public Map<String, Environment> getEnvironments() {
		return environments;
	}

	public void setEnvironments(Map<String, Environment> environments) {
		this.environments = environments;
	}
	  
	  
}
