package test;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Data
public class TestLombok {
	
    private Long id;
    private String summary;
    private String description;
    
    public String test(){
    	
    	log.info("TEST");
    	
    	return "return";
    }
    
}