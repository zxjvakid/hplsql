/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hive.hplsql;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.StringReader;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for HPL/SQL (Hive connection required)
 */
public class TestHplsqlDb {

  private final ByteArrayOutputStream out = new ByteArrayOutputStream();

  @Test
  public void testCmpRowCount() throws Exception {
    run("cmp_row_count");
  }
  
  @Test
  public void testCmpSum() throws Exception {
    run("cmp_sum");
  }
  
  @Test
  public void testCopyToFile() throws Exception {
    run("copy_to_file");
  }

  @Test
  public void testCopyToHdfs() throws Exception {
    run("copy_to_hdfs");
  }
  
  @Test
  public void testCopyToTable() throws Exception {
    run("copy_to_table");
  }

  @Test
  public void testCreateDropDatabase() throws Exception {
    run("create_drop_database");
  }
  
  @Test
  public void testCreateProcedureMssql() throws Exception {
    run("create_procedure_mssql");
  }
  
  @Test
  public void testCreateProcedureNoParams() throws Exception {
    run("create_procedure_no_params");
  }

  @Test
  public void testCreateProcedureReturnCursor() throws Exception {
    run("create_procedure_return_cursor");
  }

  @Test
  public void testCreateProcedureReturnCursor2() throws Exception {
    run("create_procedure_return_cursor2");
  }

  @Test
  public void testCursorAttributes() throws Exception {
    run("cursor_attributes");
  }

  @Test
  public void testDescribe() throws Exception {
    run("describe");
  }
  
  @Test
  public void testExecute() throws Exception {
    run("execute");
  }
  
  @Test
  public void testExpression() throws Exception {
    run("expression");
  }
  
  @Test
  public void testFor() throws Exception {
    run("for");
  }
  
  @Test
  public void testInsert() throws Exception {
    run("insert");
  }
  
  @Test
  public void testInsertDirectory() throws Exception {
    run("insert_directory");
  }
  
  @Test
  public void testMapObject() throws Exception {
    run("map_object");
  }
  
  @Test
  public void testPartCount() throws Exception {
    run("part_count");
  }

  @Test
  public void testPartCountBy() throws Exception {
    run("part_count_by");
  }
  
  @Test
  public void testRowtypeAttribute() throws Exception {
    run("rowtype_attribute");
  }
  
  @Test
  public void testSelectInto() throws Exception {
    run("select_into");
  }

  @Test
  public void testSelectInto2() throws Exception {
    run("select_into2");
  }

  @Test
  public void testSetCurrentSchema() throws Exception {
    run("set_current_schema");
  }
  
  @Test
  public void testSysRefcursor() throws Exception {
    run("sys_refcursor");
  }
  
  @Test
  public void testTruncateTable() throws Exception {
    run("truncate_table");
  }
  
  @Test
  public void testTypeAttribute() throws Exception {
    run("type_attribute");
  }
  
  @Test
  public void testUse() throws Exception {
    run("use");
  }
  
  /**
   * Run a test file
   */
  void run(String testFile) throws Exception {
    System.setOut(new PrintStream(out));
    Exec exec = new Exec();
    String[] args = { "-f", "src/test/queries/db/" + testFile + ".sql", "-trace" };
    exec.run(args);
    String s = getTestOutput(out.toString()).trim();
    FileUtils.writeStringToFile(new java.io.File("target/tmp/log/" + testFile + ".out.txt"), s);
    String t = FileUtils.readFileToString(new java.io.File("src/test/results/db/" + testFile + ".out.txt"), "utf-8").trim();
    System.setOut(null);
    Assert.assertEquals(s, t);
  }

  /**
   * Get test output
   */
  String getTestOutput(String s) throws Exception {
    StringBuilder sb = new StringBuilder();
    BufferedReader reader = new BufferedReader(new StringReader(s));
    String line = null;
    while ((line = reader.readLine()) != null) {
      if (!line.startsWith("log4j:") && !line.contains("INFO Log4j")) {
        sb.append(line);
        sb.append("\n");
      }
    }
    return sb.toString();
  }
}
