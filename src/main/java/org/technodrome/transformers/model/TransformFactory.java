package org.technodrome.transformers.model;

/**
 * Created by Tony McNevin on 2019-06-26.
 */
public final class TransformFactory {
  
  // do not instantiate or extend
  private TransformFactory() {
  
  }
  
  /**
   * ignore
   *
   * @return input as is
   */
  public static Transform ignore() {
    return (Object input, Object... args) -> input;
  }
  
  /**
   * toUpper
   * convert input to UpperCase
   * requires input and output to be a String
   * @return input as upper case
   */
  public static Transform<String, String> toUpper() {
    return (String input, Object... args) -> input.toUpperCase();
  }
  
  /**
   * get
   * get a transform by name
   *
   * @param transformName
   * @return Transform
   */
  public static Transform get(String transformName) {
    
    Transform transform = ignore();
    
    switch (transformName) {
      case "toUpper":
        transform = toUpper();
        break;
      
      default:
        transform = ignore();
        break;
    }
    
    return transform;
  }
}
