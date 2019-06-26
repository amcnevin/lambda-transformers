package org.technodrome.transformers.model;

import org.technodrome.transformers.util.TransformerException;

/**
 * Created by Tony McNevin on 2019-06-26.
 */
@FunctionalInterface
public interface Transform<T, U> {
  
  U transform(T input, Object... args) throws TransformerException;
  
}
