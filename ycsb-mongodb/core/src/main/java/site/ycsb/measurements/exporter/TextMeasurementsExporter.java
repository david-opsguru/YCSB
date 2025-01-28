/**
 * Copyright (c) 2010-2016 Yahoo! Inc., 2017 YCSB contributors All rights reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You
 * may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License. See accompanying
 * LICENSE file.
 */
package site.ycsb.measurements.exporter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Write human-readable text. Tries to emulate the previous print report method.
 */
public class TextMeasurementsExporter implements MeasurementsExporter {
    private static final Logger log = LoggerFactory.getLogger(TextMeasurementsExporter.class);

  public TextMeasurementsExporter() { }

  public void write(String metric, String measurement, int i) throws IOException {
    log.info("[" + metric + "], " + measurement + ", " + i);
  }

  public void write(String metric, String measurement, long i) throws IOException {
    log.info("[" + metric + "], " + measurement + ", " + i);
  }

  public void write(String metric, String measurement, double d) throws IOException {
    log.info("[" + metric + "], " + measurement + ", " + d);
  }
}
