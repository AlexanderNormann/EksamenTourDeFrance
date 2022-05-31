package com.example.tourdefranceproject.exceptions;

import java.io.Serial;

public class NotFoundException extends RuntimeException {
  @Serial
  private static final long serialVersionUID = 0;

  public NotFoundException(String message) {
    super(message);
  }

}
