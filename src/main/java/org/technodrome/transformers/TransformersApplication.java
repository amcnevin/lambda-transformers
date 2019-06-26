package org.technodrome.transformers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.technodrome.transformers.model.TransformHolder;

@SpringBootApplication
public class TransformersApplication {

 
	public static void main(String[] args) {
		ApplicationContext ac =  SpringApplication.run(TransformersApplication.class, args);
		
		Map<String, Object> test = new HashMap<String, Object>();
		
		test.put("x", "Hello");
		test.put("z", "World");
		test.put("abc", 5);
		
		TransformHolder holder = ac.getBean(TransformHolder.class);
		
    test = holder.execute(test);
		
		System.out.println(test);
	}

}
