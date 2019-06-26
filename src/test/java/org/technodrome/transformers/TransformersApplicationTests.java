package org.technodrome.transformers;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.technodrome.transformers.model.TransformHolder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class TransformersApplicationTests {

  @Autowired
  public TransformHolder holder;
 
 
	@Test
	void contextLoads() {
	}

	
	@Test
  public void testToUpper() {
    Map<String, Object> testMap = new HashMap<>();
    testMap.put("x", "Hello");
    testMap.put("z", "World");
    
    testMap = holder.execute(testMap);
    assertNotNull(testMap);
    assertEquals("HELLO", testMap.get("y"));
  }
  
}
