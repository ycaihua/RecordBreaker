/*
 * Copyright (c) 2011, Cloudera, Inc. All Rights Reserved.
 *
 * Cloudera, Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"). You may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for
 * the specific language governing permissions and limitations under the
 * License.
 */
package com.cloudera.recordbreaker.learnstructure.test;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

/**
 * TestAngioplastyInference tests the LearnStructure component for 'angioplasty.txt' data
 *
 * @author "Michael Cafarella" <mjc@cloudera.com>
 * @version 1.0
 * @since 1.0
 * @see InferenceTest
 */
public class TestAngioplastyInference extends InferenceTest {
  /**
   * Creates a new <code>AngioplastyInferenceTest</code> instance.
   *
   */
  public TestAngioplastyInference() {
  }

  @Test(timeout=5000)
  public void testAngioplastyInference() {
    Assert.assertTrue(runSingletonTest(new File(sampleDir, "angioplasty.txt")));
  }
}
