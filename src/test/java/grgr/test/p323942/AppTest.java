/*
 * Copyright 2010 Grzegorz Grzybek.
 * Created: 2010-02-11 09:02:41
 *
 * SVN: $Revision$ ($Date$) ($Author$)
 */

package grgr.test.p323942;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p></p>
 *
 * @author Grzegorz Grzybek
 */
public class AppTest
{
   private Logger log = LoggerFactory.getLogger(this.getClass().getName());

   @Test
   public void justLog()
   {
      log.info("SLF4J + Logback is working");
   }
}
