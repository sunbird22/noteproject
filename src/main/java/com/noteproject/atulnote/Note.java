package com.noteproject.atulnote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created on 8/26/2014.
 */
public class Note {
  private static final Logger log = LoggerFactory.getLogger(Note.class);

  public Note(){

  }

  private void start() {

  }

  private void stop() {

  }

  public static void main(String[] args) {
    log.info("Note");
    try {
      new Note().start();
    } catch (Throwable t) {
      t.printStackTrace();
      System.exit(1);
    }
  }
}
