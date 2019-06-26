package org.technodrome.transformers.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * Created by Tony McNevin on 2019-06-26.
 */
@ConfigurationProperties(prefix="transforms")
@Data
public class TransformHolder {

  
  private List<Transformer> transformers = new ArrayList<Transformer>();
  private Map<String, Object> input;
  
  
  public Map<String, Object> execute(Map<String, Object> input) {
    
    for ( Transformer transformer : transformers) {
      String source = (String)input.get(transformer.getSource());
      String destination = transformer.getDestination();
      Transform transform = transformer.getTransform();
      Object[] args = transformer.getArgs();
      
      input.put(destination, transform.transform(source, args));
    }
    
    return input;
  }
}

