package org.technodrome.transformers.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Tony McNevin on 2019-06-26.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transformer {
  
  // name of input field
  private String source;
  
  // name of destination field
  private String destination;
  
  // handle on the Transform function
  private Transform transform;
  
  // optional arguments for function
  private Object[] args;
  
  
}
