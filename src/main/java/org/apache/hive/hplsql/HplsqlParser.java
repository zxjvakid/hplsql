//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.apache.hive.hplsql;

import java.util.List;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

public class HplsqlParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache;
	public static final int T__0 = 1;
	public static final int T__1 = 2;
	public static final int T__2 = 3;
	public static final int T__3 = 4;
	public static final int T__4 = 5;
	public static final int T_ACTION = 6;
	public static final int T_ADD2 = 7;
	public static final int T_ALL = 8;
	public static final int T_ALLOCATE = 9;
	public static final int T_ALTER = 10;
	public static final int T_AND = 11;
	public static final int T_ANSI_NULLS = 12;
	public static final int T_ANSI_PADDING = 13;
	public static final int T_AS = 14;
	public static final int T_ASC = 15;
	public static final int T_ASSOCIATE = 16;
	public static final int T_AT = 17;
	public static final int T_AUTO_INCREMENT = 18;
	public static final int T_AVG = 19;
	public static final int T_BATCHSIZE = 20;
	public static final int T_BEGIN = 21;
	public static final int T_BETWEEN = 22;
	public static final int T_BIGINT = 23;
	public static final int T_BINARY_DOUBLE = 24;
	public static final int T_BINARY_FLOAT = 25;
	public static final int T_BINARY_INTEGER = 26;
	public static final int T_BIT = 27;
	public static final int T_BODY = 28;
	public static final int T_BREAK = 29;
	public static final int T_BY = 30;
	public static final int T_BYTE = 31;
	public static final int T_CALL = 32;
	public static final int T_CALLER = 33;
	public static final int T_CASCADE = 34;
	public static final int T_CASE = 35;
	public static final int T_CASESPECIFIC = 36;
	public static final int T_CAST = 37;
	public static final int T_CHAR = 38;
	public static final int T_CHARACTER = 39;
	public static final int T_CHARSET = 40;
	public static final int T_CLIENT = 41;
	public static final int T_CLOSE = 42;
	public static final int T_CLUSTERED = 43;
	public static final int T_CMP = 44;
	public static final int T_COLLECTION = 45;
	public static final int T_COMMENT = 46;
	public static final int T_CONSTANT = 47;
	public static final int T_COMMIT = 48;
	public static final int T_CONCAT = 49;
	public static final int T_CONDITION = 50;
	public static final int T_CONSTRAINT = 51;
	public static final int T_CONTINUE = 52;
	public static final int T_COPY = 53;
	public static final int T_COUNT = 54;
	public static final int T_COUNT_BIG = 55;
	public static final int T_CREATE = 56;
	public static final int T_CREATION = 57;
	public static final int T_CREATOR = 58;
	public static final int T_CS = 59;
	public static final int T_CURRENT = 60;
	public static final int T_CURRENT_SCHEMA = 61;
	public static final int T_CURSOR = 62;
	public static final int T_DATABASE = 63;
	public static final int T_DATE = 64;
	public static final int T_DATETIME = 65;
	public static final int T_DAY = 66;
	public static final int T_DAYS = 67;
	public static final int T_DEC = 68;
	public static final int T_DECIMAL = 69;
	public static final int T_DECLARE = 70;
	public static final int T_DEFAULT = 71;
	public static final int T_DEFERRED = 72;
	public static final int T_DEFINED = 73;
	public static final int T_DEFINER = 74;
	public static final int T_DEFINITION = 75;
	public static final int T_DELETE = 76;
	public static final int T_DELIMITED = 77;
	public static final int T_DELIMITER = 78;
	public static final int T_DESC = 79;
	public static final int T_DESCRIBE = 80;
	public static final int T_DIAGNOSTICS = 81;
	public static final int T_DIR = 82;
	public static final int T_DIRECTORY = 83;
	public static final int T_DISTINCT = 84;
	public static final int T_DISTRIBUTE = 85;
	public static final int T_DO = 86;
	public static final int T_DOUBLE = 87;
	public static final int T_DROP = 88;
	public static final int T_DYNAMIC = 89;
	public static final int T_ELSE = 90;
	public static final int T_ELSEIF = 91;
	public static final int T_ELSIF = 92;
	public static final int T_ENABLE = 93;
	public static final int T_END = 94;
	public static final int T_ENGINE = 95;
	public static final int T_ESCAPED = 96;
	public static final int T_EXCEPT = 97;
	public static final int T_EXEC = 98;
	public static final int T_EXECUTE = 99;
	public static final int T_EXCEPTION = 100;
	public static final int T_EXCLUSIVE = 101;
	public static final int T_EXISTS = 102;
	public static final int T_EXIT = 103;
	public static final int T_FALSE = 104;
	public static final int T_FETCH = 105;
	public static final int T_FIELDS = 106;
	public static final int T_FILE = 107;
	public static final int T_FILES = 108;
	public static final int T_FLOAT = 109;
	public static final int T_FOR = 110;
	public static final int T_FOREIGN = 111;
	public static final int T_FORMAT = 112;
	public static final int T_FOUND = 113;
	public static final int T_FROM = 114;
	public static final int T_FTP = 115;
	public static final int T_FULL = 116;
	public static final int T_FUNCTION = 117;
	public static final int T_GET = 118;
	public static final int T_GLOBAL = 119;
	public static final int T_GO = 120;
	public static final int T_GRANT = 121;
	public static final int T_GROUP = 122;
	public static final int T_HANDLER = 123;
	public static final int T_HASH = 124;
	public static final int T_HAVING = 125;
	public static final int T_HDFS = 126;
	public static final int T_HIVE = 127;
	public static final int T_HOST = 128;
	public static final int T_IDENTITY = 129;
	public static final int T_IF = 130;
	public static final int T_IGNORE = 131;
	public static final int T_IMMEDIATE = 132;
	public static final int T_IN = 133;
	public static final int T_INCLUDE = 134;
	public static final int T_INDEX = 135;
	public static final int T_INITRANS = 136;
	public static final int T_INNER = 137;
	public static final int T_INOUT = 138;
	public static final int T_INSERT = 139;
	public static final int T_INT = 140;
	public static final int T_INT2 = 141;
	public static final int T_INT4 = 142;
	public static final int T_INT8 = 143;
	public static final int T_INTEGER = 144;
	public static final int T_INTERSECT = 145;
	public static final int T_INTERVAL = 146;
	public static final int T_INTO = 147;
	public static final int T_INVOKER = 148;
	public static final int T_IS = 149;
	public static final int T_ISOPEN = 150;
	public static final int T_ITEMS = 151;
	public static final int T_JOIN = 152;
	public static final int T_KEEP = 153;
	public static final int T_KEY = 154;
	public static final int T_KEYS = 155;
	public static final int T_LANGUAGE = 156;
	public static final int T_LEAVE = 157;
	public static final int T_LEFT = 158;
	public static final int T_LIKE = 159;
	public static final int T_LIMIT = 160;
	public static final int T_LINES = 161;
	public static final int T_LOCAL = 162;
	public static final int T_LOCATION = 163;
	public static final int T_LOCATOR = 164;
	public static final int T_LOCATORS = 165;
	public static final int T_LOCKS = 166;
	public static final int T_LOG = 167;
	public static final int T_LOGGED = 168;
	public static final int T_LOGGING = 169;
	public static final int T_LOOP = 170;
	public static final int T_MAP = 171;
	public static final int T_MATCHED = 172;
	public static final int T_MAX = 173;
	public static final int T_MAXTRANS = 174;
	public static final int T_MERGE = 175;
	public static final int T_MESSAGE_TEXT = 176;
	public static final int T_MICROSECOND = 177;
	public static final int T_MICROSECONDS = 178;
	public static final int T_MIN = 179;
	public static final int T_MULTISET = 180;
	public static final int T_NCHAR = 181;
	public static final int T_NEW = 182;
	public static final int T_NVARCHAR = 183;
	public static final int T_NO = 184;
	public static final int T_NOCOUNT = 185;
	public static final int T_NOCOMPRESS = 186;
	public static final int T_NOLOGGING = 187;
	public static final int T_NONE = 188;
	public static final int T_NOT = 189;
	public static final int T_NOTFOUND = 190;
	public static final int T_NULL = 191;
	public static final int T_NUMERIC = 192;
	public static final int T_NUMBER = 193;
	public static final int T_OBJECT = 194;
	public static final int T_OFF = 195;
	public static final int T_ON = 196;
	public static final int T_ONLY = 197;
	public static final int T_OPEN = 198;
	public static final int T_OR = 199;
	public static final int T_ORDER = 200;
	public static final int T_OUT = 201;
	public static final int T_OUTER = 202;
	public static final int T_OVER = 203;
	public static final int T_OVERWRITE = 204;
	public static final int T_OWNER = 205;
	public static final int T_PACKAGE = 206;
	public static final int T_PARTITION = 207;
	public static final int T_PCTFREE = 208;
	public static final int T_PCTUSED = 209;
	public static final int T_PLS_INTEGER = 210;
	public static final int T_PRECISION = 211;
	public static final int T_PRESERVE = 212;
	public static final int T_PRIMARY = 213;
	public static final int T_PRINT = 214;
	public static final int T_PROC = 215;
	public static final int T_PROCEDURE = 216;
	public static final int T_QUERY_BAND = 217;
	public static final int T_QUOTED_IDENTIFIER = 218;
	public static final int T_RAISE = 219;
	public static final int T_REAL = 220;
	public static final int T_REFERENCES = 221;
	public static final int T_REGEXP = 222;
	public static final int T_REPLACE = 223;
	public static final int T_RESIGNAL = 224;
	public static final int T_RESTRICT = 225;
	public static final int T_RESULT = 226;
	public static final int T_RESULT_SET_LOCATOR = 227;
	public static final int T_RETURN = 228;
	public static final int T_RETURNS = 229;
	public static final int T_REVERSE = 230;
	public static final int T_RIGHT = 231;
	public static final int T_RLIKE = 232;
	public static final int T_ROLE = 233;
	public static final int T_ROLLBACK = 234;
	public static final int T_ROW = 235;
	public static final int T_ROWS = 236;
	public static final int T_ROWTYPE = 237;
	public static final int T_ROW_COUNT = 238;
	public static final int T_RR = 239;
	public static final int T_RS = 240;
	public static final int T_PWD = 241;
	public static final int T_TRIM = 242;
	public static final int T_SCHEMA = 243;
	public static final int T_SECURITY = 244;
	public static final int T_SEGMENT = 245;
	public static final int T_SEL = 246;
	public static final int T_SELECT = 247;
	public static final int T_SET = 248;
	public static final int T_SESSION = 249;
	public static final int T_SESSIONS = 250;
	public static final int T_SETS = 251;
	public static final int T_SHARE = 252;
	public static final int T_SIGNAL = 253;
	public static final int T_SIMPLE_DOUBLE = 254;
	public static final int T_SIMPLE_FLOAT = 255;
	public static final int T_SIMPLE_INTEGER = 256;
	public static final int T_SMALLDATETIME = 257;
	public static final int T_SMALLINT = 258;
	public static final int T_SQL = 259;
	public static final int T_SQLEXCEPTION = 260;
	public static final int T_SQLINSERT = 261;
	public static final int T_SQLSTATE = 262;
	public static final int T_SQLWARNING = 263;
	public static final int T_STEP = 264;
	public static final int T_STORAGE = 265;
	public static final int T_STRING = 266;
	public static final int T_SUBDIR = 267;
	public static final int T_SUBSTRING = 268;
	public static final int T_SUM = 269;
	public static final int T_SYS_REFCURSOR = 270;
	public static final int T_TABLE = 271;
	public static final int T_TABLESPACE = 272;
	public static final int T_TEMPORARY = 273;
	public static final int T_TERMINATED = 274;
	public static final int T_TEXTIMAGE_ON = 275;
	public static final int T_THEN = 276;
	public static final int T_TIMESTAMP = 277;
	public static final int T_TINYINT = 278;
	public static final int T_TITLE = 279;
	public static final int T_TO = 280;
	public static final int T_TOP = 281;
	public static final int T_TRANSACTION = 282;
	public static final int T_TRUE = 283;
	public static final int T_TRUNCATE = 284;
	public static final int T_TYPE = 285;
	public static final int T_UNION = 286;
	public static final int T_UNIQUE = 287;
	public static final int T_UPDATE = 288;
	public static final int T_UR = 289;
	public static final int T_USE = 290;
	public static final int T_USING = 291;
	public static final int T_VALUE = 292;
	public static final int T_VALUES = 293;
	public static final int T_VAR = 294;
	public static final int T_VARCHAR = 295;
	public static final int T_VARCHAR2 = 296;
	public static final int T_VARYING = 297;
	public static final int T_VOLATILE = 298;
	public static final int T_WHEN = 299;
	public static final int T_WHERE = 300;
	public static final int T_WHILE = 301;
	public static final int T_WITH = 302;
	public static final int T_WITHOUT = 303;
	public static final int T_WORK = 304;
	public static final int T_XACT_ABORT = 305;
	public static final int T_XML = 306;
	public static final int T_ACTIVITY_COUNT = 307;
	public static final int T_CUME_DIST = 308;
	public static final int T_CURRENT_DATE = 309;
	public static final int T_CURRENT_TIMESTAMP = 310;
	public static final int T_CURRENT_USER = 311;
	public static final int T_DENSE_RANK = 312;
	public static final int T_FIRST_VALUE = 313;
	public static final int T_LAG = 314;
	public static final int T_LAST_VALUE = 315;
	public static final int T_LEAD = 316;
	public static final int T_MAX_PART_STRING = 317;
	public static final int T_MIN_PART_STRING = 318;
	public static final int T_MAX_PART_INT = 319;
	public static final int T_MIN_PART_INT = 320;
	public static final int T_MAX_PART_DATE = 321;
	public static final int T_MIN_PART_DATE = 322;
	public static final int T_PART_COUNT = 323;
	public static final int T_PART_LOC = 324;
	public static final int T_RANK = 325;
	public static final int T_ROW_NUMBER = 326;
	public static final int T_STDEV = 327;
	public static final int T_SYSDATE = 328;
	public static final int T_VARIANCE = 329;
	public static final int T_USER = 330;
	public static final int T_ADD = 331;
	public static final int T_COLON = 332;
	public static final int T_COMMA = 333;
	public static final int T_PIPE = 334;
	public static final int T_DIV = 335;
	public static final int T_DOT2 = 336;
	public static final int T_EQUAL = 337;
	public static final int T_EQUAL2 = 338;
	public static final int T_NOTEQUAL = 339;
	public static final int T_NOTEQUAL2 = 340;
	public static final int T_GREATER = 341;
	public static final int T_GREATEREQUAL = 342;
	public static final int T_LESS = 343;
	public static final int T_LESSEQUAL = 344;
	public static final int T_MUL = 345;
	public static final int T_OPEN_B = 346;
	public static final int T_OPEN_P = 347;
	public static final int T_OPEN_SB = 348;
	public static final int T_CLOSE_B = 349;
	public static final int T_CLOSE_P = 350;
	public static final int T_CLOSE_SB = 351;
	public static final int T_SEMICOLON = 352;
	public static final int T_SUB = 353;
	public static final int L_ID = 354;
	public static final int L_S_STRING = 355;
	public static final int L_D_STRING = 356;
	public static final int L_INT = 357;
	public static final int L_DEC = 358;
	public static final int L_WS = 359;
	public static final int L_M_COMMENT = 360;
	public static final int L_S_COMMENT = 361;
	public static final int L_FILE = 362;
	public static final int L_LABEL = 363;
	public static final int RULE_program = 0;
	public static final int RULE_block = 1;
	public static final int RULE_begin_end_block = 2;
	public static final int RULE_single_block_stmt = 3;
	public static final int RULE_block_end = 4;
	public static final int RULE_proc_block = 5;
	public static final int RULE_stmt = 6;
	public static final int RULE_semicolon_stmt = 7;
	public static final int RULE_exception_block = 8;
	public static final int RULE_exception_block_item = 9;
	public static final int RULE_null_stmt = 10;
	public static final int RULE_expr_stmt = 11;
	public static final int RULE_assignment_stmt = 12;
	public static final int RULE_assignment_stmt_item = 13;
	public static final int RULE_assignment_stmt_single_item = 14;
	public static final int RULE_assignment_stmt_multiple_item = 15;
	public static final int RULE_assignment_stmt_select_item = 16;
	public static final int RULE_allocate_cursor_stmt = 17;
	public static final int RULE_associate_locator_stmt = 18;
	public static final int RULE_begin_transaction_stmt = 19;
	public static final int RULE_break_stmt = 20;
	public static final int RULE_call_stmt = 21;
	public static final int RULE_declare_stmt = 22;
	public static final int RULE_declare_block = 23;
	public static final int RULE_declare_block_inplace = 24;
	public static final int RULE_declare_stmt_item = 25;
	public static final int RULE_declare_var_item = 26;
	public static final int RULE_declare_condition_item = 27;
	public static final int RULE_declare_cursor_item = 28;
	public static final int RULE_cursor_with_return = 29;
	public static final int RULE_cursor_without_return = 30;
	public static final int RULE_declare_handler_item = 31;
	public static final int RULE_declare_temporary_table_item = 32;
	public static final int RULE_create_table_stmt = 33;
	public static final int RULE_create_local_temp_table_stmt = 34;
	public static final int RULE_create_table_columns = 35;
	public static final int RULE_create_table_columns_item = 36;
	public static final int RULE_column_name = 37;
	public static final int RULE_create_table_column_inline_cons = 38;
	public static final int RULE_create_table_column_cons = 39;
	public static final int RULE_create_table_fk_action = 40;
	public static final int RULE_create_table_preoptions = 41;
	public static final int RULE_create_table_preoptions_item = 42;
	public static final int RULE_create_table_options = 43;
	public static final int RULE_create_table_options_item = 44;
	public static final int RULE_create_table_options_ora_item = 45;
	public static final int RULE_create_table_options_db2_item = 46;
	public static final int RULE_create_table_options_hive_item = 47;
	public static final int RULE_create_table_hive_row_format = 48;
	public static final int RULE_create_table_hive_row_format_fields = 49;
	public static final int RULE_create_table_options_mssql_item = 50;
	public static final int RULE_create_table_options_mysql_item = 51;
	public static final int RULE_alter_table_stmt = 52;
	public static final int RULE_alter_table_item = 53;
	public static final int RULE_alter_table_add_constraint = 54;
	public static final int RULE_alter_table_add_constraint_item = 55;
	public static final int RULE_dtype = 56;
	public static final int RULE_dtype_len = 57;
	public static final int RULE_dtype_attr = 58;
	public static final int RULE_dtype_default = 59;
	public static final int RULE_create_database_stmt = 60;
	public static final int RULE_create_database_option = 61;
	public static final int RULE_create_function_stmt = 62;
	public static final int RULE_create_function_return = 63;
	public static final int RULE_create_package_stmt = 64;
	public static final int RULE_package_spec = 65;
	public static final int RULE_package_spec_item = 66;
	public static final int RULE_create_package_body_stmt = 67;
	public static final int RULE_package_body = 68;
	public static final int RULE_package_body_item = 69;
	public static final int RULE_create_procedure_stmt = 70;
	public static final int RULE_create_routine_params = 71;
	public static final int RULE_create_routine_param_item = 72;
	public static final int RULE_create_routine_options = 73;
	public static final int RULE_create_routine_option = 74;
	public static final int RULE_drop_stmt = 75;
	public static final int RULE_end_transaction_stmt = 76;
	public static final int RULE_exec_stmt = 77;
	public static final int RULE_if_stmt = 78;
	public static final int RULE_if_plsql_stmt = 79;
	public static final int RULE_if_tsql_stmt = 80;
	public static final int RULE_elseif_block = 81;
	public static final int RULE_else_block = 82;
	public static final int RULE_include_stmt = 83;
	public static final int RULE_insert_stmt = 84;
	public static final int RULE_insert_stmt_cols = 85;
	public static final int RULE_insert_stmt_rows = 86;
	public static final int RULE_insert_stmt_row = 87;
	public static final int RULE_insert_directory_stmt = 88;
	public static final int RULE_exit_stmt = 89;
	public static final int RULE_get_diag_stmt = 90;
	public static final int RULE_get_diag_stmt_item = 91;
	public static final int RULE_get_diag_stmt_exception_item = 92;
	public static final int RULE_get_diag_stmt_rowcount_item = 93;
	public static final int RULE_grant_stmt = 94;
	public static final int RULE_grant_stmt_item = 95;
	public static final int RULE_leave_stmt = 96;
	public static final int RULE_map_object_stmt = 97;
	public static final int RULE_open_stmt = 98;
	public static final int RULE_fetch_stmt = 99;
	public static final int RULE_close_stmt = 100;
	public static final int RULE_cmp_stmt = 101;
	public static final int RULE_cmp_source = 102;
	public static final int RULE_copy_from_ftp_stmt = 103;
	public static final int RULE_copy_from_local_stmt = 104;
	public static final int RULE_copy_stmt = 105;
	public static final int RULE_copy_source = 106;
	public static final int RULE_copy_target = 107;
	public static final int RULE_copy_option = 108;
	public static final int RULE_copy_file_option = 109;
	public static final int RULE_copy_ftp_option = 110;
	public static final int RULE_commit_stmt = 111;
	public static final int RULE_create_index_stmt = 112;
	public static final int RULE_create_index_col = 113;
	public static final int RULE_index_storage_clause = 114;
	public static final int RULE_index_mssql_storage_clause = 115;
	public static final int RULE_print_stmt = 116;
	public static final int RULE_raise_stmt = 117;
	public static final int RULE_resignal_stmt = 118;
	public static final int RULE_return_stmt = 119;
	public static final int RULE_rollback_stmt = 120;
	public static final int RULE_set_session_option = 121;
	public static final int RULE_set_current_schema_option = 122;
	public static final int RULE_set_mssql_session_option = 123;
	public static final int RULE_set_teradata_session_option = 124;
	public static final int RULE_signal_stmt = 125;
	public static final int RULE_truncate_stmt = 126;
	public static final int RULE_use_stmt = 127;
	public static final int RULE_values_into_stmt = 128;
	public static final int RULE_while_stmt = 129;
	public static final int RULE_for_cursor_stmt = 130;
	public static final int RULE_for_range_stmt = 131;
	public static final int RULE_label = 132;
	public static final int RULE_using_clause = 133;
	public static final int RULE_select_stmt = 134;
	public static final int RULE_cte_select_stmt = 135;
	public static final int RULE_cte_select_stmt_item = 136;
	public static final int RULE_cte_select_cols = 137;
	public static final int RULE_fullselect_stmt = 138;
	public static final int RULE_fullselect_stmt_item = 139;
	public static final int RULE_fullselect_set_clause = 140;
	public static final int RULE_subselect_stmt = 141;
	public static final int RULE_select_list = 142;
	public static final int RULE_select_list_set = 143;
	public static final int RULE_select_list_limit = 144;
	public static final int RULE_select_list_item = 145;
	public static final int RULE_select_list_alias = 146;
	public static final int RULE_select_list_asterisk = 147;
	public static final int RULE_into_clause = 148;
	public static final int RULE_from_clause = 149;
	public static final int RULE_from_table_clause = 150;
	public static final int RULE_from_table_name_clause = 151;
	public static final int RULE_from_subselect_clause = 152;
	public static final int RULE_from_join_clause = 153;
	public static final int RULE_from_join_type_clause = 154;
	public static final int RULE_from_table_values_clause = 155;
	public static final int RULE_from_table_values_row = 156;
	public static final int RULE_from_alias_clause = 157;
	public static final int RULE_table_name = 158;
	public static final int RULE_where_clause = 159;
	public static final int RULE_group_by_clause = 160;
	public static final int RULE_having_clause = 161;
	public static final int RULE_order_by_clause = 162;
	public static final int RULE_select_options = 163;
	public static final int RULE_select_options_item = 164;
	public static final int RULE_update_stmt = 165;
	public static final int RULE_update_assignment = 166;
	public static final int RULE_update_table = 167;
	public static final int RULE_update_upsert = 168;
	public static final int RULE_merge_stmt = 169;
	public static final int RULE_merge_table = 170;
	public static final int RULE_merge_condition = 171;
	public static final int RULE_merge_action = 172;
	public static final int RULE_delete_stmt = 173;
	public static final int RULE_describe_stmt = 174;
	public static final int RULE_bool_expr = 175;
	public static final int RULE_bool_expr_atom = 176;
	public static final int RULE_bool_expr_unary = 177;
	public static final int RULE_bool_expr_single_in = 178;
	public static final int RULE_bool_expr_multi_in = 179;
	public static final int RULE_bool_expr_binary = 180;
	public static final int RULE_bool_expr_logical_operator = 181;
	public static final int RULE_bool_expr_binary_operator = 182;
	public static final int RULE_expr = 183;
	public static final int RULE_expr_atom = 184;
	public static final int RULE_expr_interval = 185;
	public static final int RULE_interval_item = 186;
	public static final int RULE_expr_concat = 187;
	public static final int RULE_expr_concat_item = 188;
	public static final int RULE_expr_case = 189;
	public static final int RULE_expr_case_simple = 190;
	public static final int RULE_expr_case_searched = 191;
	public static final int RULE_expr_cursor_attribute = 192;
	public static final int RULE_expr_agg_window_func = 193;
	public static final int RULE_expr_func_all_distinct = 194;
	public static final int RULE_expr_func_over_clause = 195;
	public static final int RULE_expr_func_partition_by_clause = 196;
	public static final int RULE_expr_spec_func = 197;
	public static final int RULE_expr_func = 198;
	public static final int RULE_expr_func_params = 199;
	public static final int RULE_func_param = 200;
	public static final int RULE_expr_select = 201;
	public static final int RULE_expr_file = 202;
	public static final int RULE_hive = 203;
	public static final int RULE_hive_item = 204;
	public static final int RULE_host = 205;
	public static final int RULE_host_cmd = 206;
	public static final int RULE_host_stmt = 207;
	public static final int RULE_file_name = 208;
	public static final int RULE_date_literal = 209;
	public static final int RULE_timestamp_literal = 210;
	public static final int RULE_ident = 211;
	public static final int RULE_string = 212;
	public static final int RULE_int_number = 213;
	public static final int RULE_dec_number = 214;
	public static final int RULE_bool_literal = 215;
	public static final int RULE_null_const = 216;
	public static final int RULE_non_reserved_words = 217;
	public static final String[] ruleNames;
	private static final String[] _LITERAL_NAMES;
	private static final String[] _SYMBOLIC_NAMES;
	public static final Vocabulary VOCABULARY;
	/** @deprecated */
	@Deprecated
	public static final String[] tokenNames;
	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 = "\u0003а훑舆괭䐗껱趀ꫝ\u0003ŭಞ\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0004\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010\t\u0010\u0004\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013\u0004\u0014\t\u0014\u0004\u0015\t\u0015\u0004\u0016\t\u0016\u0004\u0017\t\u0017\u0004\u0018\t\u0018\u0004\u0019\t\u0019\u0004\u001a\t\u001a\u0004\u001b\t\u001b\u0004\u001c\t\u001c\u0004\u001d\t\u001d\u0004\u001e\t\u001e\u0004\u001f\t\u001f\u0004 \t \u0004!\t!\u0004\"\t\"\u0004#\t#\u0004$\t$\u0004%\t%\u0004&\t&\u0004'\t'\u0004(\t(\u0004)\t)\u0004*\t*\u0004+\t+\u0004,\t,\u0004-\t-\u0004.\t.\u0004/\t/\u00040\t0\u00041\t1\u00042\t2\u00043\t3\u00044\t4\u00045\t5\u00046\t6\u00047\t7\u00048\t8\u00049\t9\u0004:\t:\u0004;\t;\u0004<\t<\u0004=\t=\u0004>\t>\u0004?\t?\u0004@\t@\u0004A\tA\u0004B\tB\u0004C\tC\u0004D\tD\u0004E\tE\u0004F\tF\u0004G\tG\u0004H\tH\u0004I\tI\u0004J\tJ\u0004K\tK\u0004L\tL\u0004M\tM\u0004N\tN\u0004O\tO\u0004P\tP\u0004Q\tQ\u0004R\tR\u0004S\tS\u0004T\tT\u0004U\tU\u0004V\tV\u0004W\tW\u0004X\tX\u0004Y\tY\u0004Z\tZ\u0004[\t[\u0004\\\t\\\u0004]\t]\u0004^\t^\u0004_\t_\u0004`\t`\u0004a\ta\u0004b\tb\u0004c\tc\u0004d\td\u0004e\te\u0004f\tf\u0004g\tg\u0004h\th\u0004i\ti\u0004j\tj\u0004k\tk\u0004l\tl\u0004m\tm\u0004n\tn\u0004o\to\u0004p\tp\u0004q\tq\u0004r\tr\u0004s\ts\u0004t\tt\u0004u\tu\u0004v\tv\u0004w\tw\u0004x\tx\u0004y\ty\u0004z\tz\u0004{\t{\u0004|\t|\u0004}\t}\u0004~\t~\u0004\u007f\t\u007f\u0004\u0080\t\u0080\u0004\u0081\t\u0081\u0004\u0082\t\u0082\u0004\u0083\t\u0083\u0004\u0084\t\u0084\u0004\u0085\t\u0085\u0004\u0086\t\u0086\u0004\u0087\t\u0087\u0004\u0088\t\u0088\u0004\u0089\t\u0089\u0004\u008a\t\u008a\u0004\u008b\t\u008b\u0004\u008c\t\u008c\u0004\u008d\t\u008d\u0004\u008e\t\u008e\u0004\u008f\t\u008f\u0004\u0090\t\u0090\u0004\u0091\t\u0091\u0004\u0092\t\u0092\u0004\u0093\t\u0093\u0004\u0094\t\u0094\u0004\u0095\t\u0095\u0004\u0096\t\u0096\u0004\u0097\t\u0097\u0004\u0098\t\u0098\u0004\u0099\t\u0099\u0004\u009a\t\u009a\u0004\u009b\t\u009b\u0004\u009c\t\u009c\u0004\u009d\t\u009d\u0004\u009e\t\u009e\u0004\u009f\t\u009f\u0004 \t \u0004¡\t¡\u0004¢\t¢\u0004£\t£\u0004¤\t¤\u0004¥\t¥\u0004¦\t¦\u0004§\t§\u0004¨\t¨\u0004©\t©\u0004ª\tª\u0004«\t«\u0004¬\t¬\u0004\u00ad\t\u00ad\u0004®\t®\u0004¯\t¯\u0004°\t°\u0004±\t±\u0004²\t²\u0004³\t³\u0004´\t´\u0004µ\tµ\u0004¶\t¶\u0004·\t·\u0004¸\t¸\u0004¹\t¹\u0004º\tº\u0004»\t»\u0004¼\t¼\u0004½\t½\u0004¾\t¾\u0004¿\t¿\u0004À\tÀ\u0004Á\tÁ\u0004Â\tÂ\u0004Ã\tÃ\u0004Ä\tÄ\u0004Å\tÅ\u0004Æ\tÆ\u0004Ç\tÇ\u0004È\tÈ\u0004É\tÉ\u0004Ê\tÊ\u0004Ë\tË\u0004Ì\tÌ\u0004Í\tÍ\u0004Î\tÎ\u0004Ï\tÏ\u0004Ð\tÐ\u0004Ñ\tÑ\u0004Ò\tÒ\u0004Ó\tÓ\u0004Ô\tÔ\u0004Õ\tÕ\u0004Ö\tÖ\u0004×\t×\u0004Ø\tØ\u0004Ù\tÙ\u0004Ú\tÚ\u0004Û\tÛ\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0005\u0003ƻ\n\u0003\u0003\u0003\u0005\u0003ƾ\n\u0003\u0006\u0003ǀ\n\u0003\r\u0003\u000e\u0003ǁ\u0003\u0004\u0005\u0004ǅ\n\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004Ǌ\n\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005Ǒ\n\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005Ǘ\n\u0005\u0005\u0005Ǚ\n\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0006\u0007Ǡ\n\u0007\r\u0007\u000e\u0007ǡ\u0003\u0007\u0005\u0007ǥ\n\u0007\u0005\u0007ǧ\n\u0007\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0005\bȤ\n\b\u0003\t\u0003\t\u0003\n\u0003\n\u0006\nȪ\n\n\r\n\u000e\nȫ\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\f\u0003\f\u0003\r\u0003\r\u0003\r\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000eȼ\n\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0007\u000eɁ\n\u000e\f\u000e\u000e\u000eɄ\u000b\u000e\u0005\u000eɆ\n\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000fɋ\n\u000f\u0003\u0010\u0003\u0010\u0005\u0010ɏ\n\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010ɘ\n\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010ɝ\n\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0007\u0011ɣ\n\u0011\f\u0011\u000e\u0011ɦ\u000b\u0011\u0003\u0011\u0003\u0011\u0005\u0011ɪ\n\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0007\u0011ɱ\n\u0011\f\u0011\u000e\u0011ɴ\u000b\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0007\u0012ɽ\n\u0012\f\u0012\u000e\u0012ʀ\u000b\u0012\u0003\u0012\u0003\u0012\u0005\u0012ʄ\n\u0012\u0003\u0012\u0005\u0012ʇ\n\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013ʕ\n\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0005\u0014ʜ\n\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0007\u0014ʣ\n\u0014\f\u0014\u000e\u0014ʦ\u000b\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017ʶ\n\u0017\u0003\u0017\u0003\u0017\u0005\u0017ʺ\n\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0007\u0018ˀ\n\u0018\f\u0018\u000e\u0018˃\u000b\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0007\u0019ˋ\n\u0019\f\u0019\u000e\u0019ˎ\u000b\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0007\u001a˕\n\u001a\f\u001a\u000e\u001a˘\u000b\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0005\u001b˟\n\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0007\u001cˤ\n\u001c\f\u001c\u000e\u001c˧\u000b\u001c\u0003\u001c\u0005\u001c˪\n\u001c\u0003\u001c\u0003\u001c\u0005\u001cˮ\n\u001c\u0003\u001c\u0007\u001c˱\n\u001c\f\u001c\u000e\u001c˴\u000b\u001c\u0003\u001c\u0005\u001c˷\n\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c˼\n\u001c\u0003\u001c\u0003\u001c\u0005\u001c̀\n\u001c\u0003\u001c\u0003\u001c\u0005\u001c̄\n\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e̎\n\u001e\u0003\u001e\u0003\u001e\u0005\u001e̒\n\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e̗\n\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0005\u001f̜\n\u001f\u0003\u001f\u0003\u001f\u0005\u001f̠\n\u001f\u0003 \u0003 \u0003 \u0003!\u0003!\u0003!\u0003!\u0003!\u0003!\u0003!\u0003!\u0005!̭\n!\u0003!\u0003!\u0003\"\u0005\"̲\n\"\u0003\"\u0003\"\u0003\"\u0003\"\u0005\"̸\n\"\u0003\"\u0003\"\u0003\"\u0003\"\u0003\"\u0005\"̿\n\"\u0003\"\u0003\"\u0003\"\u0003\"\u0003\"\u0005\"͆\n\"\u0003\"\u0005\"͉\n\"\u0003#\u0003#\u0003#\u0003#\u0003#\u0005#͐\n#\u0003#\u0003#\u0003#\u0003#\u0003#\u0005#͗\n#\u0003$\u0003$\u0003$\u0003$\u0005$͝\n$\u0003$\u0005$͠\n$\u0003$\u0003$\u0003$\u0005$ͥ\n$\u0003$\u0003$\u0003$\u0003$\u0005$ͫ\n$\u0003%\u0003%\u0003%\u0007%Ͱ\n%\f%\u000e%ͳ\u000b%\u0003&\u0003&\u0003&\u0005&\u0378\n&\u0003&\u0007&ͻ\n&\f&\u000e&;\u000b&\u0003&\u0007&\u0381\n&\f&\u000e&΄\u000b&\u0003&\u0003&\u0005&Έ\n&\u0003&\u0005&\u038b\n&\u0003'\u0003'\u0003(\u0003(\u0005(Α\n(\u0003(\u0003(\u0003(\u0003(\u0003(\u0003(\u0003(\u0003(\u0003(\u0003(\u0007(Ν\n(\f(\u000e(Π\u000b(\u0003(\u0003(\u0003(\u0003(\u0003(\u0007(Χ\n(\f(\u000e(Ϊ\u000b(\u0003(\u0003(\u0003(\u0005(ί\n(\u0003)\u0003)\u0003)\u0005)δ\n)\u0003)\u0003)\u0003)\u0005)ι\n)\u0003)\u0003)\u0003)\u0005)ξ\n)\u0007)π\n)\f)\u000e)σ\u000b)\u0003)\u0003)\u0005)χ\n)\u0003)\u0005)ϊ\n)\u0003)\u0003)\u0003)\u0003)\u0003)\u0003)\u0007)ϒ\n)\f)\u000e)ϕ\u000b)\u0003)\u0003)\u0003)\u0003)\u0003)\u0003)\u0003)\u0007)Ϟ\n)\f)\u000e)ϡ\u000b)\u0003)\u0003)\u0007)ϥ\n)\f)\u000e)Ϩ\u000b)\u0005)Ϫ\n)\u0003*\u0003*\u0003*\u0003*\u0003*\u0003*\u0003*\u0003*\u0003*\u0003*\u0005*϶\n*\u0003+\u0003+\u0006+Ϻ\n+\r+\u000e+ϻ\u0003,\u0005,Ͽ\n,\u0003,\u0003,\u0003-\u0006-Є\n-\r-\u000e-Ѕ\u0003.\u0003.\u0003.\u0003.\u0003.\u0003.\u0003.\u0003.\u0003.\u0005.Б\n.\u0003/\u0003/\u0003/\u0003/\u0003/\u0003/\u0003/\u0003/\u0003/\u0003/\u0003/\u0006/О\n/\r/\u000e/П\u0003/\u0003/\u0003/\u0005/Х\n/\u00030\u00030\u00030\u00030\u00030\u00030\u00030\u00030\u00030\u00030\u00030\u00070в\n0\f0\u000e0е\u000b0\u00030\u00030\u00030\u00030\u00030\u00030\u00030\u00050о\n0\u00031\u00031\u00032\u00032\u00032\u00032\u00072ц\n2\f2\u000e2щ\u000b2\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00053ђ\n3\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00053Ѧ\n3\u00034\u00034\u00034\u00034\u00054Ѭ\n4\u00035\u00035\u00055Ѱ\n5\u00035\u00035\u00035\u00055ѵ\n5\u00035\u00035\u00055ѹ\n5\u00035\u00035\u00035\u00055Ѿ\n5\u00035\u00055ҁ\n5\u00035\u00035\u00035\u00055҆\n5\u00035\u00055҉\n5\u00036\u00036\u00036\u00036\u00036\u00037\u00037\u00038\u00038\u00038\u00058ҕ\n8\u00038\u00038\u00039\u00039\u00039\u00059Ҝ\n9\u00039\u00039\u00039\u00059ҡ\n9\u00039\u00039\u00039\u00059Ҧ\n9\u00079Ҩ\n9\f9\u000e9ҫ\u000b9\u00039\u00039\u00059ү\n9\u00039\u00059Ҳ\n9\u00039\u00039\u00039\u00039\u00039\u00039\u00079Һ\n9\f9\u000e9ҽ\u000b9\u00039\u00039\u00039\u00039\u00039\u00039\u00039\u00079ӆ\n9\f9\u000e9Ӊ\u000b9\u00039\u00039\u00079Ӎ\n9\f9\u000e9Ӑ\u000b9\u00039\u00039\u00039\u00039\u00039\u00059ӗ\n9\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0005:ӥ\n:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0005:Ԅ\n:\u0005:Ԇ\n:\u0003;\u0003;\u0003;\u0005;ԋ\n;\u0003;\u0003;\u0005;ԏ\n;\u0003;\u0003;\u0003<\u0005<Ԕ\n<\u0003<\u0003<\u0003<\u0003<\u0003<\u0005<ԛ\n<\u0003<\u0005<Ԟ\n<\u0003=\u0005=ԡ\n=\u0003=\u0003=\u0003=\u0003=\u0005=ԧ\n=\u0003>\u0003>\u0003>\u0003>\u0003>\u0005>\u052e\n>\u0003>\u0003>\u0007>Բ\n>\f>\u000e>Ե\u000b>\u0003?\u0003?\u0003?\u0003?\u0005?Ի\n?\u0003@\u0003@\u0003@\u0003@\u0005@Ձ\n@\u0003@\u0005@Մ\n@\u0003@\u0003@\u0003@\u0005@Չ\n@\u0003@\u0003@\u0005@Ս\n@\u0003@\u0005@Ր\n@\u0003@\u0003@\u0003A\u0003A\u0003A\u0005A\u0557\nA\u0003B\u0003B\u0003B\u0003B\u0005B՝\nB\u0003B\u0005B\u0560\nB\u0003B\u0003B\u0003B\u0003B\u0003B\u0003B\u0003B\u0003B\u0005Bժ\nB\u0003C\u0003C\u0003C\u0003C\u0003C\u0007Cձ\nC\fC\u000eCմ\u000bC\u0003D\u0003D\u0003D\u0003D\u0005Dպ\nD\u0003D\u0003D\u0003D\u0003D\u0003D\u0005Dց\nD\u0005Dփ\nD\u0003E\u0003E\u0003E\u0003E\u0005E։\nE\u0003E\u0005E\u058c\nE\u0003E\u0003E\u0003E\u0003E\u0003E\u0003E\u0003E\u0003E\u0003E\u0005E֗\nE\u0003F\u0003F\u0003F\u0003F\u0003F\u0007F֞\nF\fF\u000eF֡\u000bF\u0003G\u0003G\u0003G\u0005G֦\nG\u0003H\u0003H\u0003H\u0003H\u0005H֬\nH\u0003H\u0005H֯\nH\u0003H\u0003H\u0003H\u0005Hִ\nH\u0003H\u0005Hַ\nH\u0003H\u0005Hֺ\nH\u0003H\u0005Hֽ\nH\u0003H\u0005H׀\nH\u0003H\u0003H\u0003H\u0003H\u0005H׆\nH\u0003I\u0003I\u0003I\u0003I\u0003I\u0003I\u0007I\u05ce\nI\fI\u000eIב\u000bI\u0003I\u0003I\u0003I\u0003I\u0003I\u0003I\u0007Iי\nI\fI\u000eIל\u000bI\u0005Iמ\nI\u0003J\u0003J\u0003J\u0003J\u0003J\u0005Jץ\nJ\u0003J\u0003J\u0003J\u0005Jת\nJ\u0003J\u0007J\u05ed\nJ\fJ\u000eJװ\u000bJ\u0003J\u0005J׳\nJ\u0003J\u0003J\u0003J\u0003J\u0003J\u0003J\u0005J\u05fb\nJ\u0003J\u0003J\u0005J\u05ff\nJ\u0003J\u0007J\u0602\nJ\fJ\u000eJ\u0605\u000bJ\u0003J\u0005J؈\nJ\u0005J؊\nJ\u0003K\u0006K؍\nK\rK\u000eK؎\u0003L\u0003L\u0003L\u0003L\u0003L\u0003L\u0005Lؗ\nL\u0003L\u0003L\u0003L\u0005L\u061c\nL\u0003M\u0003M\u0003M\u0003M\u0005Mآ\nM\u0003M\u0003M\u0003M\u0003M\u0003M\u0005Mة\nM\u0003M\u0005Mج\nM\u0003N\u0003N\u0003N\u0003O\u0003O\u0005Oس\nO\u0003O\u0003O\u0003O\u0003O\u0003O\u0003O\u0005Oػ\nO\u0003O\u0003O\u0003O\u0003O\u0007Oف\nO\fO\u000eOل\u000bO\u0005Oن\nO\u0003O\u0005Oى\nO\u0003P\u0003P\u0005Pٍ\nP\u0003Q\u0003Q\u0003Q\u0003Q\u0003Q\u0007Qٔ\nQ\fQ\u000eQٗ\u000bQ\u0003Q\u0005Qٚ\nQ\u0003Q\u0003Q\u0003Q\u0003R\u0003R\u0003R\u0003R\u0003R\u0005R٤\nR\u0003S\u0003S\u0003S\u0003S\u0003S\u0003T\u0003T\u0003T\u0003U\u0003U\u0003U\u0005Uٱ\nU\u0003V\u0003V\u0003V\u0003V\u0003V\u0005Vٸ\nV\u0005Vٺ\nV\u0003V\u0003V\u0005Vپ\nV\u0003V\u0003V\u0005Vڂ\nV\u0003W\u0003W\u0003W\u0003W\u0007Wڈ\nW\fW\u000eWڋ\u000bW\u0003W\u0003W\u0003X\u0003X\u0003X\u0003X\u0007Xړ\nX\fX\u000eXږ\u000bX\u0003Y\u0003Y\u0003Y\u0003Y\u0007Yڜ\nY\fY\u000eYڟ\u000bY\u0003Y\u0003Y\u0003Z\u0003Z\u0003Z\u0005Zڦ\nZ\u0003Z\u0003Z\u0003Z\u0003Z\u0003[\u0003[\u0005[ڮ\n[\u0003[\u0003[\u0005[ڲ\n[\u0003\\\u0003\\\u0003\\\u0003\\\u0003]\u0003]\u0005]ں\n]\u0003^\u0003^\u0003^\u0003^\u0003^\u0003^\u0003_\u0003_\u0003_\u0003_\u0003`\u0003`\u0003`\u0003`\u0007`ۊ\n`\f`\u000e`ۍ\u000b`\u0003`\u0003`\u0003`\u0003`\u0003a\u0003a\u0003a\u0003a\u0003a\u0003b\u0003b\u0005bۚ\nb\u0003c\u0003c\u0003c\u0003c\u0003c\u0005cۡ\nc\u0003c\u0003c\u0005cۥ\nc\u0003d\u0003d\u0003d\u0003d\u0003d\u0005d۬\nd\u0005dۮ\nd\u0003e\u0003e\u0005e۲\ne\u0003e\u0003e\u0003e\u0003e\u0003e\u0007e۹\ne\fe\u000eeۼ\u000be\u0003f\u0003f\u0003f\u0003g\u0003g\u0003g\u0003g\u0003g\u0003g\u0003h\u0003h\u0005h܉\nh\u0003h\u0003h\u0003h\u0003h\u0005h\u070f\nh\u0003h\u0003h\u0005hܓ\nh\u0003i\u0003i\u0003i\u0003i\u0003i\u0007iܚ\ni\fi\u000eiܝ\u000bi\u0003j\u0003j\u0003j\u0003j\u0003j\u0003j\u0007jܥ\nj\fj\u000ejܨ\u000bj\u0003j\u0003j\u0003j\u0007jܭ\nj\fj\u000ejܰ\u000bj\u0003k\u0003k\u0003k\u0003k\u0003k\u0003k\u0005kܸ\nk\u0003k\u0003k\u0005kܼ\nk\u0003k\u0003k\u0007k݀\nk\fk\u000ek݃\u000bk\u0003l\u0003l\u0003l\u0005l݈\nl\u0003m\u0003m\u0005m\u074c\nm\u0003n\u0003n\u0003n\u0003n\u0003n\u0003n\u0003n\u0003n\u0005nݖ\nn\u0003o\u0003o\u0003p\u0003p\u0003p\u0003p\u0003p\u0003p\u0003p\u0005pݡ\np\u0003p\u0003p\u0003p\u0003p\u0003p\u0003p\u0003p\u0003p\u0003p\u0005pݬ\np\u0003p\u0003p\u0005pݰ\np\u0005pݲ\np\u0003q\u0003q\u0005qݶ\nq\u0003r\u0003r\u0005rݺ\nr\u0003r\u0003r\u0003r\u0003r\u0003r\u0003r\u0003r\u0003r\u0007rބ\nr\fr\u000erއ\u000br\u0003r\u0003r\u0003s\u0003s\u0005sލ\ns\u0003t\u0003t\u0003u\u0003u\u0003u\u0003u\u0003u\u0003u\u0003u\u0003u\u0003u\u0003u\u0007uޛ\nu\fu\u000euޞ\u000bu\u0003u\u0003u\u0007uޢ\nu\fu\u000euޥ\u000bu\u0003v\u0003v\u0003v\u0003v\u0003v\u0003v\u0003v\u0005vޮ\nv\u0003w\u0003w\u0003x\u0003x\u0003x\u0005x\u07b5\nx\u0003x\u0003x\u0003x\u0003x\u0003x\u0005x\u07bc\nx\u0005x\u07be\nx\u0003y\u0003y\u0005y߂\ny\u0003z\u0003z\u0005z߆\nz\u0003{\u0003{\u0003{\u0005{ߋ\n{\u0003|\u0005|ߎ\n|\u0003|\u0003|\u0005|ߒ\n|\u0003|\u0005|ߕ\n|\u0003|\u0003|\u0003}\u0003}\u0003}\u0003~\u0003~\u0003~\u0003~\u0005~ߠ\n~\u0003~\u0005~ߣ\n~\u0003~\u0003~\u0003~\u0003\u007f\u0003\u007f\u0003\u007f\u0003\u0080\u0003\u0080\u0005\u0080߭\n\u0080\u0003\u0080\u0003\u0080\u0003\u0081\u0003\u0081\u0003\u0081\u0003\u0082\u0003\u0082\u0005\u0082߶\n\u0082\u0003\u0082\u0003\u0082\u0003\u0082\u0007\u0082\u07fb\n\u0082\f\u0082\u000e\u0082\u07fe\u000b\u0082\u0003\u0082\u0005\u0082ࠁ\n\u0082\u0003\u0082\u0003\u0082\u0005\u0082ࠅ\n\u0082\u0003\u0082\u0003\u0082\u0003\u0082\u0007\u0082ࠊ\n\u0082\f\u0082\u000e\u0082ࠍ\u000b\u0082\u0003\u0082\u0005\u0082ࠐ\n\u0082\u0003\u0083\u0003\u0083\u0003\u0083\u0003\u0083\u0003\u0083\u0003\u0083\u0005\u0083࠘\n\u0083\u0003\u0084\u0003\u0084\u0003\u0084\u0003\u0084\u0005\u0084ࠞ\n\u0084\u0003\u0084\u0003\u0084\u0005\u0084ࠢ\n\u0084\u0003\u0084\u0003\u0084\u0003\u0084\u0003\u0084\u0003\u0084\u0003\u0085\u0003\u0085\u0003\u0085\u0003\u0085\u0005\u0085࠭\n\u0085\u0003\u0085\u0003\u0085\u0003\u0085\u0003\u0085\u0003\u0085\u0005\u0085࠴\n\u0085\u0003\u0085\u0003\u0085\u0003\u0085\u0003\u0085\u0003\u0085\u0003\u0086\u0003\u0086\u0003\u0086\u0003\u0086\u0003\u0086\u0003\u0086\u0005\u0086ࡁ\n\u0086\u0003\u0087\u0003\u0087\u0003\u0087\u0003\u0087\u0007\u0087ࡇ\n\u0087\f\u0087\u000e\u0087ࡊ\u000b\u0087\u0003\u0088\u0005\u0088ࡍ\n\u0088\u0003\u0088\u0003\u0088\u0003\u0089\u0003\u0089\u0003\u0089\u0003\u0089\u0007\u0089ࡕ\n\u0089\f\u0089\u000e\u0089ࡘ\u000b\u0089\u0003\u008a\u0003\u008a\u0005\u008a\u085c\n\u008a\u0003\u008a\u0003\u008a\u0003\u008a\u0003\u008a\u0003\u008a\u0003\u008b\u0003\u008b\u0003\u008b\u0003\u008b\u0007\u008b\u0867\n\u008b\f\u008b\u000e\u008b\u086a\u000b\u008b\u0003\u008b\u0003\u008b\u0003\u008c\u0003\u008c\u0003\u008c\u0003\u008c\u0007\u008c\u0872\n\u008c\f\u008c\u000e\u008c\u0875\u000b\u008c\u0003\u008d\u0003\u008d\u0003\u008d\u0003\u008d\u0003\u008d\u0005\u008d\u087c\n\u008d\u0003\u008e\u0003\u008e\u0005\u008e\u0880\n\u008e\u0003\u008e\u0003\u008e\u0005\u008e\u0884\n\u008e\u0003\u008e\u0003\u008e\u0005\u008e\u0888\n\u008e\u0005\u008e\u088a\n\u008e\u0003\u008f\u0003\u008f\u0003\u008f\u0005\u008f\u088f\n\u008f\u0003\u008f\u0005\u008f\u0892\n\u008f\u0003\u008f\u0005\u008f\u0895\n\u008f\u0003\u008f\u0005\u008f\u0898\n\u008f\u0003\u008f\u0005\u008f\u089b\n\u008f\u0003\u008f\u0005\u008f\u089e\n\u008f\u0003\u008f\u0005\u008f\u08a1\n\u008f\u0003\u0090\u0005\u0090ࢤ\n\u0090\u0003\u0090\u0005\u0090ࢧ\n\u0090\u0003\u0090\u0003\u0090\u0003\u0090\u0007\u0090ࢬ\n\u0090\f\u0090\u000e\u0090\u08af\u000b\u0090\u0003\u0091\u0003\u0091\u0003\u0092\u0003\u0092\u0003\u0092\u0003\u0093\u0003\u0093\u0003\u0093\u0005\u0093\u08b9\n\u0093\u0003\u0093\u0003\u0093\u0005\u0093\u08bd\n\u0093\u0003\u0093\u0005\u0093\u08c0\n\u0093\u0003\u0094\u0003\u0094\u0005\u0094\u08c4\n\u0094\u0003\u0094\u0003\u0094\u0003\u0094\u0003\u0094\u0003\u0094\u0005\u0094\u08cb\n\u0094\u0003\u0095\u0003\u0095\u0005\u0095\u08cf\n\u0095\u0003\u0095\u0003\u0095\u0003\u0096\u0003\u0096\u0003\u0096\u0003\u0096\u0007\u0096\u08d7\n\u0096\f\u0096\u000e\u0096\u08da\u000b\u0096\u0003\u0097\u0003\u0097\u0003\u0097\u0007\u0097\u08df\n\u0097\f\u0097\u000e\u0097\u08e2\u000b\u0097\u0003\u0098\u0003\u0098\u0003\u0098\u0005\u0098ࣧ\n\u0098\u0003\u0099\u0003\u0099\u0005\u0099࣫\n\u0099\u0003\u009a\u0003\u009a\u0003\u009a\u0003\u009a\u0005\u009aࣱ\n\u009a\u0003\u009b\u0003\u009b\u0003\u009b\u0003\u009b\u0003\u009b\u0003\u009b\u0003\u009b\u0005\u009bࣺ\n\u009b\u0003\u009c\u0005\u009cࣽ\n\u009c\u0003\u009c\u0003\u009c\u0003\u009c\u0005\u009cं\n\u009c\u0003\u009c\u0005\u009cअ\n\u009c\u0003\u009d\u0003\u009d\u0003\u009d\u0003\u009d\u0003\u009d\u0003\u009d\u0007\u009dऍ\n\u009d\f\u009d\u000e\u009dऐ\u000b\u009d\u0003\u009d\u0003\u009d\u0005\u009dऔ\n\u009d\u0003\u009e\u0003\u009e\u0003\u009e\u0003\u009e\u0003\u009e\u0007\u009eछ\n\u009e\f\u009e\u000e\u009eञ\u000b\u009e\u0003\u009e\u0003\u009e\u0005\u009eढ\n\u009e\u0003\u009f\u0003\u009f\u0005\u009fद\n\u009f\u0003\u009f\u0003\u009f\u0003\u009f\u0003\u009f\u0003\u009f\u0007\u009fभ\n\u009f\f\u009f\u000e\u009fर\u000b\u009f\u0003\u009f\u0005\u009fळ\n\u009f\u0003 \u0003 \u0003¡\u0003¡\u0003¡\u0003¢\u0003¢\u0003¢\u0003¢\u0003¢\u0007¢ि\n¢\f¢\u000e¢ू\u000b¢\u0003£\u0003£\u0003£\u0003¤\u0003¤\u0003¤\u0003¤\u0005¤ो\n¤\u0003¤\u0003¤\u0003¤\u0005¤ॐ\n¤\u0007¤॒\n¤\f¤\u000e¤ॕ\u000b¤\u0003¥\u0006¥क़\n¥\r¥\u000e¥ख़\u0003¦\u0003¦\u0003¦\u0003¦\u0003¦\u0003¦\u0003¦\u0003¦\u0003¦\u0005¦॥\n¦\u0005¦१\n¦\u0003§\u0003§\u0003§\u0003§\u0003§\u0005§८\n§\u0003§\u0005§ॱ\n§\u0003¨\u0003¨\u0003¨\u0007¨ॶ\n¨\f¨\u000e¨ॹ\u000b¨\u0003©\u0003©\u0003©\u0003©\u0003©\u0005©\u0980\n©\u0003©\u0005©ঃ\n©\u0003©\u0005©আ\n©\u0003ª\u0003ª\u0003ª\u0003«\u0003«\u0003«\u0003«\u0003«\u0003«\u0003«\u0003«\u0006«ও\n«\r«\u000e«ঔ\u0003¬\u0003¬\u0003¬\u0003¬\u0003¬\u0005¬জ\n¬\u0003¬\u0005¬ট\n¬\u0003¬\u0005¬ঢ\n¬\u0003\u00ad\u0003\u00ad\u0005\u00adদ\n\u00ad\u0003\u00ad\u0003\u00ad\u0003\u00ad\u0005\u00adফ\n\u00ad\u0003\u00ad\u0003\u00ad\u0003\u00ad\u0003\u00ad\u0005\u00ad\u09b1\n\u00ad\u0003®\u0003®\u0005®\u09b5\n®\u0003®\u0003®\u0003®\u0003®\u0003®\u0003®\u0003®\u0007®া\n®\f®\u000e®ু\u000b®\u0003®\u0005®ৄ\n®\u0003®\u0005®ে\n®\u0003¯\u0003¯\u0005¯ো\n¯\u0003¯\u0003¯\u0005¯\u09cf\n¯\u0003¯\u0005¯\u09d2\n¯\u0003¯\u0005¯\u09d5\n¯\u0003°\u0003°\u0005°\u09d9\n°\u0003°\u0003°\u0003±\u0003±\u0005±য়\n±\u0003±\u0003±\u0003±\u0003±\u0003±\u0005±০\n±\u0003±\u0003±\u0003±\u0003±\u0007±৬\n±\f±\u000e±৯\u000b±\u0003²\u0003²\u0003²\u0005²৴\n²\u0003³\u0003³\u0003³\u0005³৹\n³\u0003³\u0003³\u0003³\u0003³\u0003³\u0003³\u0003³\u0003³\u0003³\u0003³\u0005³ਅ\n³\u0003´\u0003´\u0005´ਉ\n´\u0003´\u0003´\u0003´\u0003´\u0003´\u0007´ਐ\n´\f´\u000e´ਓ\u000b´\u0003´\u0005´ਖ\n´\u0003´\u0003´\u0003µ\u0003µ\u0003µ\u0003µ\u0007µਞ\nµ\fµ\u000eµਡ\u000bµ\u0003µ\u0003µ\u0005µਥ\nµ\u0003µ\u0003µ\u0003µ\u0003µ\u0003µ\u0003¶\u0003¶\u0003¶\u0003¶\u0003·\u0003·\u0003¸\u0003¸\u0003¸\u0003¸\u0003¸\u0003¸\u0003¸\u0003¸\u0003¸\u0005¸\u0a3b\n¸\u0003¸\u0005¸ਾ\n¸\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0005¹੍\n¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0007¹\u0a5d\n¹\f¹\u000e¹\u0a60\u000b¹\u0003º\u0003º\u0003º\u0003º\u0003º\u0003º\u0003º\u0003º\u0005º੪\nº\u0003»\u0003»\u0003»\u0003»\u0003¼\u0003¼\u0003½\u0003½\u0003½\u0003½\u0003½\u0007½\u0a77\n½\f½\u000e½\u0a7a\u000b½\u0003¾\u0003¾\u0003¾\u0003¾\u0003¾\u0003¾\u0003¾\u0003¾\u0003¾\u0005¾અ\n¾\u0003¿\u0003¿\u0005¿ઉ\n¿\u0003À\u0003À\u0003À\u0003À\u0003À\u0003À\u0003À\u0006À\u0a92\nÀ\rÀ\u000eÀઓ\u0003À\u0003À\u0005Àઘ\nÀ\u0003À\u0003À\u0003Á\u0003Á\u0003Á\u0003Á\u0003Á\u0003Á\u0006Áઢ\nÁ\rÁ\u000eÁણ\u0003Á\u0003Á\u0005Áન\nÁ\u0003Á\u0003Á\u0003Â\u0003Â\u0003Â\u0003Â\u0003Ã\u0003Ã\u0003Ã\u0005Ãળ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ãસ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ãઽ\nÃ\u0003Ã\u0003Ã\u0005Ãુ\nÃ\u0003Ã\u0003Ã\u0005Ãૅ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ã\u0aca\nÃ\u0003Ã\u0003Ã\u0005Ã\u0ace\nÃ\u0003Ã\u0003Ã\u0005Ã\u0ad2\nÃ\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0005Ã૩\nÃ\u0005Ã૫\nÃ\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0005Ã\u0afd\nÃ\u0005Ã\u0aff\nÃ\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0005Ãଇ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ãଌ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ã\u0b11\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ãଖ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0005Ãଣ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ãନ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ãଭ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ãଲ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ãଷ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ã଼\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ãୁ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ã\u0b46\nÃ\u0005Ãୈ\nÃ\u0003Ä\u0003Ä\u0003Å\u0003Å\u0003Å\u0005Å\u0b4f\nÅ\u0003Å\u0005Å\u0b52\nÅ\u0003Å\u0003Å\u0003Æ\u0003Æ\u0003Æ\u0003Æ\u0003Æ\u0007Æ\u0b5b\nÆ\fÆ\u000eÆ\u0b5e\u000bÆ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0005Ç୧\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0005Ç୯\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0005Ç\u0b78\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0005Ç\u0b7e\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0007Ç\u0b8d\nÇ\fÇ\u000eÇஐ\u000bÇ\u0005Çஒ\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0007Ç\u0ba0\nÇ\fÇ\u000eÇண\u000bÇ\u0005Ç\u0ba5\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0007Çள\nÇ\fÇ\u000eÇஶ\u000bÇ\u0005Çஸ\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0007Çெ\nÇ\fÇ\u000eÇ\u0bc9\u000bÇ\u0005Çோ\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0007Ç\u0bd9\nÇ\fÇ\u000eÇ\u0bdc\u000bÇ\u0005Ç\u0bde\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0007Ç௬\nÇ\fÇ\u000eÇ௯\u000bÇ\u0005Ç௱\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0007Ç\u0bfd\nÇ\fÇ\u000eÇ\u0c00\u000bÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0006Çఌ\nÇ\rÇ\u000eÇ\u0c0d\u0003Ç\u0003Ç\u0005Çఒ\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0005Çఢ\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0005Çన\nÇ\u0003È\u0003È\u0003È\u0005Èభ\nÈ\u0003È\u0003È\u0003É\u0003É\u0003É\u0007É\u0c34\nÉ\fÉ\u000eÉష\u000bÉ\u0003Ê\u0003Ê\u0003Ê\u0003Ê\u0005Êఽ\nÊ\u0005Êి\nÊ\u0003Ê\u0003Ê\u0003Ë\u0003Ë\u0005Ë\u0c45\nË\u0003Ì\u0003Ì\u0005Ì\u0c49\nÌ\u0003Í\u0003Í\u0007Í్\nÍ\fÍ\u000eÍ\u0c50\u000bÍ\u0003Î\u0003Î\u0003Î\u0003Î\u0003Î\u0003Î\u0003Î\u0003Î\u0003Î\u0003Î\u0003Î\u0003Î\u0005Î\u0c5e\nÎ\u0003Ï\u0003Ï\u0003Ï\u0003Ï\u0003Ï\u0005Ï\u0c65\nÏ\u0003Ð\u0007Ð౨\nÐ\fÐ\u000eÐ౫\u000bÐ\u0003Ñ\u0003Ñ\u0003Ñ\u0003Ò\u0003Ò\u0003Ò\u0003Ò\u0005Ò\u0c74\nÒ\u0003Ò\u0003Ò\u0003Ò\u0007Ò౹\nÒ\fÒ\u000eÒ౼\u000bÒ\u0005Ò౾\nÒ\u0003Ó\u0003Ó\u0003Ó\u0003Ô\u0003Ô\u0003Ô\u0003Õ\u0003Õ\u0005Õಈ\nÕ\u0003Ö\u0003Ö\u0005Öಌ\nÖ\u0003×\u0005×ಏ\n×\u0003×\u0003×\u0003Ø\u0005Øಔ\nØ\u0003Ø\u0003Ø\u0003Ù\u0003Ù\u0003Ú\u0003Ú\u0003Û\u0003Û\u0003Û\u0003౩\u0004ŠŰÜ\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e ¢¤¦¨ª¬®°²´¶¸º¼¾ÀÂÄÆÈÊÌÎÐÒÔÖØÚÜÞàâäæèêìîðòôöøúüþĀĂĄĆĈĊČĎĐĒĔĖĘĚĜĞĠĢĤĦĨĪĬĮİĲĴĶĸĺļľŀłńņňŊŌŎŐŒŔŖŘŚŜŞŠŢŤŦŨŪŬŮŰŲŴŶŸźżžƀƂƄƆƈƊƌƎƐƒƔƖƘƚƜƞƠƢƤƦƨƪƬƮưƲƴ\u00020\u0005\u0002\u0003\u0004őőŢŢ\u0004\u0002``ĭĭ\u0003\u0002¦§\u0005\u0002\u0010\u0010pp\u0097\u0097\u0004\u0002##++\u0004\u000266ii\u0004\u0002¶¶úú\u0004\u0002\u0011\u0011QQ\u0004\u0002NNĢĢ\u0004\u0002NNÖÖ\u0004\u0002JJ\u0086\u0086\u0005\u0002\u008a\u008a°°ÒÓ\u0004\u0002««½½\u0004\u0002ïïğğ\u0004\u0002¯¯ŧŧ\u0004\u0002!!((\u0004\u0002&&==\u0004\u0002AAõõ\u0004\u0002\u0010\u0010\u0097\u0097\u0003\u0002æç\u0003\u0002ÙÚ\u0006\u0002<<LL\u0096\u0096ÏÏ\u0003\u0002de\u0003\u0002]^\u0004\u0002ððďď\u0005\u0002NN\u0085\u0085ÎÎ\u0006\u0002\u000e\u000f»»ÜÜĳĳ\u0003\u0002ÅÆ\u0004\u0002ûûĜĜ\u0006\u0002\u0017\u0017XX¬¬ĖĖ\u0004\u0002¬¬įį\u0004\u0002  ĊĊ\u0003\u0002øù\u0004\u0002\n\nVV\u0005\u0002vv  éé\u0005\u0002==ñòģģ\u0005\u0002ggþþĢĢ\u0003\u0002QR\u0004\u0002\r\rÉÉ\u0005\u0002¡¡ààêê\u0004\u0002DE³´\u0004\u000233ŐŐ\u0005\u0002ss\u0098\u0098ÀÀ\u0004\u0002ōōţţ\u0004\u0002jjĝĝ\u000e\u0002\b\u001b\u001d[__aÀÂÓÕîðāăėęĞġĬįľŅŌ\u0e3d\u0002ƶ\u0003\u0002\u0002\u0002\u0004ƿ\u0003\u0002\u0002\u0002\u0006Ǆ\u0003\u0002\u0002\u0002\bǘ\u0003\u0002\u0002\u0002\nǚ\u0003\u0002\u0002\u0002\fǦ\u0003\u0002\u0002\u0002\u000eȣ\u0003\u0002\u0002\u0002\u0010ȥ\u0003\u0002\u0002\u0002\u0012ȧ\u0003\u0002\u0002\u0002\u0014ȭ\u0003\u0002\u0002\u0002\u0016ȳ\u0003\u0002\u0002\u0002\u0018ȵ\u0003\u0002\u0002\u0002\u001aɅ\u0003\u0002\u0002\u0002\u001cɊ\u0003\u0002\u0002\u0002\u001eɜ\u0003\u0002\u0002\u0002 ɞ\u0003\u0002\u0002\u0002\"ʃ\u0003\u0002\u0002\u0002$ʍ\u0003\u0002\u0002\u0002&ʘ\u0003\u0002\u0002\u0002(ʬ\u0003\u0002\u0002\u0002*ʯ\u0003\u0002\u0002\u0002,ʱ\u0003\u0002\u0002\u0002.ʻ\u0003\u0002\u0002\u00020˄\u0003\u0002\u0002\u00022ˏ\u0003\u0002\u0002\u00024˞\u0003\u0002\u0002\u00026̃\u0003\u0002\u0002\u00028̅\u0003\u0002\u0002\u0002:̍\u0003\u0002\u0002\u0002<̘\u0003\u0002\u0002\u0002>̡\u0003\u0002\u0002\u0002@̤\u0003\u0002\u0002\u0002Ḇ\u0003\u0002\u0002\u0002D͊\u0003\u0002\u0002\u0002F͘\u0003\u0002\u0002\u0002Hͬ\u0003\u0002\u0002\u0002JΊ\u0003\u0002\u0002\u0002LΌ\u0003\u0002\u0002\u0002Nή\u0003\u0002\u0002\u0002Pϩ\u0003\u0002\u0002\u0002Rϫ\u0003\u0002\u0002\u0002TϹ\u0003\u0002\u0002\u0002VϾ\u0003\u0002\u0002\u0002XЃ\u0003\u0002\u0002\u0002ZА\u0003\u0002\u0002\u0002\\Ф\u0003\u0002\u0002\u0002^н\u0003\u0002\u0002\u0002`п\u0003\u0002\u0002\u0002bс\u0003\u0002\u0002\u0002dѥ\u0003\u0002\u0002\u0002fѫ\u0003\u0002\u0002\u0002h҈\u0003\u0002\u0002\u0002jҊ\u0003\u0002\u0002\u0002lҏ\u0003\u0002\u0002\u0002nґ\u0003\u0002\u0002\u0002pӖ\u0003\u0002\u0002\u0002rԅ\u0003\u0002\u0002\u0002tԇ\u0003\u0002\u0002\u0002vԝ\u0003\u0002\u0002\u0002xԦ\u0003\u0002\u0002\u0002z\u0528\u0003\u0002\u0002\u0002|Ժ\u0003\u0002\u0002\u0002~Ճ\u0003\u0002\u0002\u0002\u0080Փ\u0003\u0002\u0002\u0002\u0082՟\u0003\u0002\u0002\u0002\u0084ի\u0003\u0002\u0002\u0002\u0086ւ\u0003\u0002\u0002\u0002\u0088\u058b\u0003\u0002\u0002\u0002\u008a֘\u0003\u0002\u0002\u0002\u008c֥\u0003\u0002\u0002\u0002\u008e֮\u0003\u0002\u0002\u0002\u0090ם\u0003\u0002\u0002\u0002\u0092؉\u0003\u0002\u0002\u0002\u0094،\u0003\u0002\u0002\u0002\u0096؛\u0003\u0002\u0002\u0002\u0098ث\u0003\u0002\u0002\u0002\u009aح\u0003\u0002\u0002\u0002\u009cذ\u0003\u0002\u0002\u0002\u009eٌ\u0003\u0002\u0002\u0002 َ\u0003\u0002\u0002\u0002¢ٞ\u0003\u0002\u0002\u0002¤٥\u0003\u0002\u0002\u0002¦٪\u0003\u0002\u0002\u0002¨٭\u0003\u0002\u0002\u0002ªٲ\u0003\u0002\u0002\u0002¬ڃ\u0003\u0002\u0002\u0002®ڎ\u0003\u0002\u0002\u0002°ڗ\u0003\u0002\u0002\u0002²ڢ\u0003\u0002\u0002\u0002´ګ\u0003\u0002\u0002\u0002¶ڳ\u0003\u0002\u0002\u0002¸ڹ\u0003\u0002\u0002\u0002ºڻ\u0003\u0002\u0002\u0002¼ہ\u0003\u0002\u0002\u0002¾ۅ\u0003\u0002\u0002\u0002Àے\u0003\u0002\u0002\u0002Âۗ\u0003\u0002\u0002\u0002Äۛ\u0003\u0002\u0002\u0002Æۦ\u0003\u0002\u0002\u0002Èۯ\u0003\u0002\u0002\u0002Ê۽\u0003\u0002\u0002\u0002Ì܀\u0003\u0002\u0002\u0002Î\u070e\u0003\u0002\u0002\u0002Ðܔ\u0003\u0002\u0002\u0002Òܞ\u0003\u0002\u0002\u0002Ôܱ\u0003\u0002\u0002\u0002Ö݇\u0003\u0002\u0002\u0002Ø\u074b\u0003\u0002\u0002\u0002Úݕ\u0003\u0002\u0002\u0002Üݗ\u0003\u0002\u0002\u0002Þݱ\u0003\u0002\u0002\u0002àݳ\u0003\u0002\u0002\u0002âݷ\u0003\u0002\u0002\u0002äފ\u0003\u0002\u0002\u0002æގ\u0003\u0002\u0002\u0002èސ\u0003\u0002\u0002\u0002êޭ\u0003\u0002\u0002\u0002ìޯ\u0003\u0002\u0002\u0002îޱ\u0003\u0002\u0002\u0002ð\u07bf\u0003\u0002\u0002\u0002ò߃\u0003\u0002\u0002\u0002ôߊ\u0003\u0002\u0002\u0002öߑ\u0003\u0002\u0002\u0002øߘ\u0003\u0002\u0002\u0002úߛ\u0003\u0002\u0002\u0002üߧ\u0003\u0002\u0002\u0002þߪ\u0003\u0002\u0002\u0002Ā߰\u0003\u0002\u0002\u0002Ă߳\u0003\u0002\u0002\u0002Ąࠑ\u0003\u0002\u0002\u0002Ć࠙\u0003\u0002\u0002\u0002Ĉࠨ\u0003\u0002\u0002\u0002Ċࡀ\u0003\u0002\u0002\u0002Čࡂ\u0003\u0002\u0002\u0002Ďࡌ\u0003\u0002\u0002\u0002Đࡐ\u0003\u0002\u0002\u0002Ē࡙\u0003\u0002\u0002\u0002Ĕ\u0862\u0003\u0002\u0002\u0002Ė\u086d\u0003\u0002\u0002\u0002Ę\u087b\u0003\u0002\u0002\u0002Ě\u0889\u0003\u0002\u0002\u0002Ĝ\u088b\u0003\u0002\u0002\u0002Ğࢣ\u0003\u0002\u0002\u0002Ġ\u08b0\u0003\u0002\u0002\u0002Ģ\u08b2\u0003\u0002\u0002\u0002Ĥ\u08bf\u0003\u0002\u0002\u0002Ħ\u08ca\u0003\u0002\u0002\u0002Ĩ\u08ce\u0003\u0002\u0002\u0002Ī\u08d2\u0003\u0002\u0002\u0002Ĭ\u08db\u0003\u0002\u0002\u0002Įࣦ\u0003\u0002\u0002\u0002İࣨ\u0003\u0002\u0002\u0002Ĳ࣬\u0003\u0002\u0002\u0002Ĵࣹ\u0003\u0002\u0002\u0002Ķऄ\u0003\u0002\u0002\u0002ĸआ\u0003\u0002\u0002\u0002ĺड\u0003\u0002\u0002\u0002ļण\u0003\u0002\u0002\u0002ľऴ\u0003\u0002\u0002\u0002ŀश\u0003\u0002\u0002\u0002łह\u0003\u0002\u0002\u0002ńृ\u0003\u0002\u0002\u0002ņॆ\u0003\u0002\u0002\u0002ňॗ\u0003\u0002\u0002\u0002Ŋ०\u0003\u0002\u0002\u0002Ō२\u0003\u0002\u0002\u0002Ŏॲ\u0003\u0002\u0002\u0002Őॿ\u0003\u0002\u0002\u0002Œই\u0003\u0002\u0002\u0002Ŕঊ\u0003\u0002\u0002\u0002Ŗছ\u0003\u0002\u0002\u0002Řর\u0003\u0002\u0002\u0002Ś\u09c6\u0003\u0002\u0002\u0002Ŝৈ\u0003\u0002\u0002\u0002Ş\u09d6\u0003\u0002\u0002\u0002Š\u09e5\u0003\u0002\u0002\u0002Ţ৳\u0003\u0002\u0002\u0002Ť\u0a04\u0003\u0002\u0002\u0002Ŧਆ\u0003\u0002\u0002\u0002Ũਙ\u0003\u0002\u0002\u0002Ūਫ\u0003\u0002\u0002\u0002Ŭਯ\u0003\u0002\u0002\u0002Ů\u0a3d\u0003\u0002\u0002\u0002Űੌ\u0003\u0002\u0002\u0002Ų੩\u0003\u0002\u0002\u0002Ŵ੫\u0003\u0002\u0002\u0002Ŷ੯\u0003\u0002\u0002\u0002Ÿੱ\u0003\u0002\u0002\u0002ź\u0a84\u0003\u0002\u0002\u0002żઈ\u0003\u0002\u0002\u0002žઊ\u0003\u0002\u0002\u0002ƀછ\u0003\u0002\u0002\u0002Ƃફ\u0003\u0002\u0002\u0002Ƅେ\u0003\u0002\u0002\u0002Ɔ\u0b49\u0003\u0002\u0002\u0002ƈୋ\u0003\u0002\u0002\u0002Ɗ\u0b55\u0003\u0002\u0002\u0002ƌధ\u0003\u0002\u0002\u0002Ǝ\u0c29\u0003\u0002\u0002\u0002Ɛర\u0003\u0002\u0002\u0002ƒస\u0003\u0002\u0002\u0002Ɣౄ\u0003\u0002\u0002\u0002Ɩై\u0003\u0002\u0002\u0002Ƙొ\u0003\u0002\u0002\u0002ƚ\u0c5d\u0003\u0002\u0002\u0002Ɯ\u0c64\u0003\u0002\u0002\u0002ƞ౩\u0003\u0002\u0002\u0002Ơ౬\u0003\u0002\u0002\u0002Ƣ౽\u0003\u0002\u0002\u0002Ƥ౿\u0003\u0002\u0002\u0002Ʀಂ\u0003\u0002\u0002\u0002ƨಇ\u0003\u0002\u0002\u0002ƪಋ\u0003\u0002\u0002\u0002Ƭಎ\u0003\u0002\u0002\u0002Ʈಓ\u0003\u0002\u0002\u0002ưಗ\u0003\u0002\u0002\u0002Ʋಙ\u0003\u0002\u0002\u0002ƴಛ\u0003\u0002\u0002\u0002ƶƷ\u0005\u0004\u0003\u0002Ʒ\u0003\u0003\u0002\u0002\u0002Ƹƻ\u0005\u0006\u0004\u0002ƹƻ\u0005\u000e\b\u0002ƺƸ\u0003\u0002\u0002\u0002ƺƹ\u0003\u0002\u0002\u0002ƻƽ\u0003\u0002\u0002\u0002Ƽƾ\u0007z\u0002\u0002ƽƼ\u0003\u0002\u0002\u0002ƽƾ\u0003\u0002\u0002\u0002ƾǀ\u0003\u0002\u0002\u0002ƿƺ\u0003\u0002\u0002\u0002ǀǁ\u0003\u0002\u0002\u0002ǁƿ\u0003\u0002\u0002\u0002ǁǂ\u0003\u0002\u0002\u0002ǂ\u0005\u0003\u0002\u0002\u0002ǃǅ\u00050\u0019\u0002Ǆǃ\u0003\u0002\u0002\u0002Ǆǅ\u0003\u0002\u0002\u0002ǅǆ\u0003\u0002\u0002\u0002ǆǇ\u0007\u0017\u0002\u0002Ǉǉ\u0005\u0004\u0003\u0002ǈǊ\u0005\u0012\n\u0002ǉǈ\u0003\u0002\u0002\u0002ǉǊ\u0003\u0002\u0002\u0002Ǌǋ\u0003\u0002\u0002\u0002ǋǌ\u0005\n\u0006\u0002ǌ\u0007\u0003\u0002\u0002\u0002Ǎǎ\u0007\u0017\u0002\u0002ǎǐ\u0005\u0004\u0003\u0002ǏǑ\u0005\u0012\n\u0002ǐǏ\u0003\u0002\u0002\u0002ǐǑ\u0003\u0002\u0002\u0002Ǒǒ\u0003\u0002\u0002\u0002ǒǓ\u0005\n\u0006\u0002ǓǙ\u0003\u0002\u0002\u0002ǔǖ\u0005\u000e\b\u0002ǕǗ\u0007Ţ\u0002\u0002ǖǕ\u0003\u0002\u0002\u0002ǖǗ\u0003\u0002\u0002\u0002ǗǙ\u0003\u0002\u0002\u0002ǘǍ\u0003\u0002\u0002\u0002ǘǔ\u0003\u0002\u0002\u0002Ǚ\t\u0003\u0002\u0002\u0002ǚǛ\u0006\u0006\u0002\u0002Ǜǜ\u0007`\u0002\u0002ǜ\u000b\u0003\u0002\u0002\u0002ǝǧ\u0005\u0006\u0004\u0002ǞǠ\u0005\u000e\b\u0002ǟǞ\u0003\u0002\u0002\u0002Ǡǡ\u0003\u0002\u0002\u0002ǡǟ\u0003\u0002\u0002\u0002ǡǢ\u0003\u0002\u0002\u0002ǢǤ\u0003\u0002\u0002\u0002ǣǥ\u0007z\u0002\u0002Ǥǣ\u0003\u0002\u0002\u0002Ǥǥ\u0003\u0002\u0002\u0002ǥǧ\u0003\u0002\u0002\u0002Ǧǝ\u0003\u0002\u0002\u0002Ǧǟ\u0003\u0002\u0002\u0002ǧ\r\u0003\u0002\u0002\u0002ǨȤ\u0005\u001a\u000e\u0002ǩȤ\u0005$\u0013\u0002ǪȤ\u0005j6\u0002ǫȤ\u0005&\u0014\u0002ǬȤ\u0005(\u0015\u0002ǭȤ\u0005*\u0016\u0002ǮȤ\u0005,\u0017\u0002ǯȤ\u0005Êf\u0002ǰȤ\u0005Ìg\u0002ǱȤ\u0005Ði\u0002ǲȤ\u0005Òj\u0002ǳȤ\u0005Ôk\u0002ǴȤ\u0005àq\u0002ǵȤ\u0005z>\u0002ǶȤ\u0005~@\u0002ǷȤ\u0005âr\u0002ǸȤ\u0005F$\u0002ǹȤ\u0005\u0082B\u0002ǺȤ\u0005\u0088E\u0002ǻȤ\u0005\u008eH\u0002ǼȤ\u0005D#\u0002ǽȤ\u0005.\u0018\u0002ǾȤ\u0005Ŝ¯\u0002ǿȤ\u0005Ş°\u0002ȀȤ\u0005\u0098M\u0002ȁȤ\u0005\u009aN\u0002ȂȤ\u0005\u009cO\u0002ȃȤ\u0005´[\u0002ȄȤ\u0005Èe\u0002ȅȤ\u0005Ć\u0084\u0002ȆȤ\u0005Ĉ\u0085\u0002ȇȤ\u0005\u009eP\u0002ȈȤ\u0005¨U\u0002ȉȤ\u0005ªV\u0002ȊȤ\u0005²Z\u0002ȋȤ\u0005¶\\\u0002ȌȤ\u0005¾`\u0002ȍȤ\u0005Âb\u0002ȎȤ\u0005Äc\u0002ȏȤ\u0005Ŕ«\u0002ȐȤ\u0005Æd\u0002ȑȤ\u0005êv\u0002ȒȤ\u0005ìw\u0002ȓȤ\u0005îx\u0002ȔȤ\u0005ðy\u0002ȕȤ\u0005òz\u0002ȖȤ\u0005Ď\u0088\u0002ȗȤ\u0005ü\u007f\u0002ȘȤ\u0005Ō§\u0002șȤ\u0005Ā\u0081\u0002ȚȤ\u0005þ\u0080\u0002țȤ\u0005Ă\u0082\u0002ȜȤ\u0005Ą\u0083\u0002ȝȤ\u0005Ċ\u0086\u0002ȞȤ\u0005ƘÍ\u0002ȟȤ\u0005ƜÏ\u0002ȠȤ\u0005\u0016\f\u0002ȡȤ\u0005\u0018\r\u0002ȢȤ\u0005\u0010\t\u0002ȣǨ\u0003\u0002\u0002\u0002ȣǩ\u0003\u0002\u0002\u0002ȣǪ\u0003\u0002\u0002\u0002ȣǫ\u0003\u0002\u0002\u0002ȣǬ\u0003\u0002\u0002\u0002ȣǭ\u0003\u0002\u0002\u0002ȣǮ\u0003\u0002\u0002\u0002ȣǯ\u0003\u0002\u0002\u0002ȣǰ\u0003\u0002\u0002\u0002ȣǱ\u0003\u0002\u0002\u0002ȣǲ\u0003\u0002\u0002\u0002ȣǳ\u0003\u0002\u0002\u0002ȣǴ\u0003\u0002\u0002\u0002ȣǵ\u0003\u0002\u0002\u0002ȣǶ\u0003\u0002\u0002\u0002ȣǷ\u0003\u0002\u0002\u0002ȣǸ\u0003\u0002\u0002\u0002ȣǹ\u0003\u0002\u0002\u0002ȣǺ\u0003\u0002\u0002\u0002ȣǻ\u0003\u0002\u0002\u0002ȣǼ\u0003\u0002\u0002\u0002ȣǽ\u0003\u0002\u0002\u0002ȣǾ\u0003\u0002\u0002\u0002ȣǿ\u0003\u0002\u0002\u0002ȣȀ\u0003\u0002\u0002\u0002ȣȁ\u0003\u0002\u0002\u0002ȣȂ\u0003\u0002\u0002\u0002ȣȃ\u0003\u0002\u0002\u0002ȣȄ\u0003\u0002\u0002\u0002ȣȅ\u0003\u0002\u0002\u0002ȣȆ\u0003\u0002\u0002\u0002ȣȇ\u0003\u0002\u0002\u0002ȣȈ\u0003\u0002\u0002\u0002ȣȉ\u0003\u0002\u0002\u0002ȣȊ\u0003\u0002\u0002\u0002ȣȋ\u0003\u0002\u0002\u0002ȣȌ\u0003\u0002\u0002\u0002ȣȍ\u0003\u0002\u0002\u0002ȣȎ\u0003\u0002\u0002\u0002ȣȏ\u0003\u0002\u0002\u0002ȣȐ\u0003\u0002\u0002\u0002ȣȑ\u0003\u0002\u0002\u0002ȣȒ\u0003\u0002\u0002\u0002ȣȓ\u0003\u0002\u0002\u0002ȣȔ\u0003\u0002\u0002\u0002ȣȕ\u0003\u0002\u0002\u0002ȣȖ\u0003\u0002\u0002\u0002ȣȗ\u0003\u0002\u0002\u0002ȣȘ\u0003\u0002\u0002\u0002ȣș\u0003\u0002\u0002\u0002ȣȚ\u0003\u0002\u0002\u0002ȣț\u0003\u0002\u0002\u0002ȣȜ\u0003\u0002\u0002\u0002ȣȝ\u0003\u0002\u0002\u0002ȣȞ\u0003\u0002\u0002\u0002ȣȟ\u0003\u0002\u0002\u0002ȣȠ\u0003\u0002\u0002\u0002ȣȡ\u0003\u0002\u0002\u0002ȣȢ\u0003\u0002\u0002\u0002Ȥ\u000f\u0003\u0002\u0002\u0002ȥȦ\t\u0002\u0002\u0002Ȧ\u0011\u0003\u0002\u0002\u0002ȧȩ\u0007f\u0002\u0002ȨȪ\u0005\u0014\u000b\u0002ȩȨ\u0003\u0002\u0002\u0002Ȫȫ\u0003\u0002\u0002\u0002ȫȩ\u0003\u0002\u0002\u0002ȫȬ\u0003\u0002\u0002\u0002Ȭ\u0013\u0003\u0002\u0002\u0002ȭȮ\u0007ĭ\u0002\u0002Ȯȯ\u0007Ť\u0002\u0002ȯȰ\u0007Ė\u0002\u0002Ȱȱ\u0005\u0004\u0003\u0002ȱȲ\n\u0003\u0002\u0002Ȳ\u0015\u0003\u0002\u0002\u0002ȳȴ\u0007Á\u0002\u0002ȴ\u0017\u0003\u0002\u0002\u0002ȵȶ\u0006\r\u0003\u0002ȶȷ\u0005Ű¹\u0002ȷ\u0019\u0003\u0002\u0002\u0002ȸȹ\u0007ú\u0002\u0002ȹɆ\u0005ô{\u0002Ⱥȼ\u0007ú\u0002\u0002ȻȺ\u0003\u0002\u0002\u0002Ȼȼ\u0003\u0002\u0002\u0002ȼȽ\u0003\u0002\u0002\u0002Ƚɂ\u0005\u001c\u000f\u0002Ⱦȿ\u0007ŏ\u0002\u0002ȿɁ\u0005\u001c\u000f\u0002ɀȾ\u0003\u0002\u0002\u0002ɁɄ\u0003\u0002\u0002\u0002ɂɀ\u0003\u0002\u0002\u0002ɂɃ\u0003\u0002\u0002\u0002ɃɆ\u0003\u0002\u0002\u0002Ʉɂ\u0003\u0002\u0002\u0002Ʌȸ\u0003\u0002\u0002\u0002ɅȻ\u0003\u0002\u0002\u0002Ɇ\u001b\u0003\u0002\u0002\u0002ɇɋ\u0005\u001e\u0010\u0002Ɉɋ\u0005 \u0011\u0002ɉɋ\u0005\"\u0012\u0002Ɋɇ\u0003\u0002\u0002\u0002ɊɈ\u0003\u0002\u0002\u0002Ɋɉ\u0003\u0002\u0002\u0002ɋ\u001d\u0003\u0002\u0002\u0002ɌɎ\u0005ƨÕ\u0002ɍɏ\u0007Ŏ\u0002\u0002Ɏɍ\u0003\u0002\u0002\u0002Ɏɏ\u0003\u0002\u0002\u0002ɏɐ\u0003\u0002\u0002\u0002ɐɑ\u0007œ\u0002\u0002ɑɒ\u0005Ű¹\u0002ɒɝ\u0003\u0002\u0002\u0002ɓɔ\u0007ŝ\u0002\u0002ɔɕ\u0005ƨÕ\u0002ɕɗ\u0007Š\u0002\u0002ɖɘ\u0007Ŏ\u0002\u0002ɗɖ\u0003\u0002\u0002\u0002ɗɘ\u0003\u0002\u0002\u0002ɘə\u0003\u0002\u0002\u0002əɚ\u0007œ\u0002\u0002ɚɛ\u0005Ű¹\u0002ɛɝ\u0003\u0002\u0002\u0002ɜɌ\u0003\u0002\u0002\u0002ɜɓ\u0003\u0002\u0002\u0002ɝ\u001f\u0003\u0002\u0002\u0002ɞɟ\u0007ŝ\u0002\u0002ɟɤ\u0005ƨÕ\u0002ɠɡ\u0007ŏ\u0002\u0002ɡɣ\u0005ƨÕ\u0002ɢɠ\u0003\u0002\u0002\u0002ɣɦ\u0003\u0002\u0002\u0002ɤɢ\u0003\u0002\u0002\u0002ɤɥ\u0003\u0002\u0002\u0002ɥɧ\u0003\u0002\u0002\u0002ɦɤ\u0003\u0002\u0002\u0002ɧɩ\u0007Š\u0002\u0002ɨɪ\u0007Ŏ\u0002\u0002ɩɨ\u0003\u0002\u0002\u0002ɩɪ\u0003\u0002\u0002\u0002ɪɫ\u0003\u0002\u0002\u0002ɫɬ\u0007œ\u0002\u0002ɬɭ\u0007ŝ\u0002\u0002ɭɲ\u0005Ű¹\u0002ɮɯ\u0007ŏ\u0002\u0002ɯɱ\u0005Ű¹\u0002ɰɮ\u0003\u0002\u0002\u0002ɱɴ\u0003\u0002\u0002\u0002ɲɰ\u0003\u0002\u0002\u0002ɲɳ\u0003\u0002\u0002\u0002ɳɵ\u0003\u0002\u0002\u0002ɴɲ\u0003\u0002\u0002\u0002ɵɶ\u0007Š\u0002\u0002ɶ!\u0003\u0002\u0002\u0002ɷʄ\u0005ƨÕ\u0002ɸɹ\u0007ŝ\u0002\u0002ɹɾ\u0005ƨÕ\u0002ɺɻ\u0007ŏ\u0002\u0002ɻɽ\u0005ƨÕ\u0002ɼɺ\u0003\u0002\u0002\u0002ɽʀ\u0003\u0002\u0002\u0002ɾɼ\u0003\u0002\u0002\u0002ɾɿ\u0003\u0002\u0002\u0002ɿʁ\u0003\u0002\u0002\u0002ʀɾ\u0003\u0002\u0002\u0002ʁʂ\u0007Š\u0002\u0002ʂʄ\u0003\u0002\u0002\u0002ʃɷ\u0003\u0002\u0002\u0002ʃɸ\u0003\u0002\u0002\u0002ʄʆ\u0003\u0002\u0002\u0002ʅʇ\u0007Ŏ\u0002\u0002ʆʅ\u0003\u0002\u0002\u0002ʆʇ\u0003\u0002\u0002\u0002ʇʈ\u0003\u0002\u0002\u0002ʈʉ\u0007œ\u0002\u0002ʉʊ\u0007ŝ\u0002\u0002ʊʋ\u0005Ď\u0088\u0002ʋʌ\u0007Š\u0002\u0002ʌ#\u0003\u0002\u0002\u0002ʍʎ\u0007\u000b\u0002\u0002ʎʏ\u0005ƨÕ\u0002ʏʐ\u0007@\u0002\u0002ʐʔ\u0007p\u0002\u0002ʑʒ\u0007ä\u0002\u0002ʒʕ\u0007ú\u0002\u0002ʓʕ\u0007Ú\u0002\u0002ʔʑ\u0003\u0002\u0002\u0002ʔʓ\u0003\u0002\u0002\u0002ʕʖ\u0003\u0002\u0002\u0002ʖʗ\u0005ƨÕ\u0002ʗ%\u0003\u0002\u0002\u0002ʘʛ\u0007\u0012\u0002\u0002ʙʚ\u0007ä\u0002\u0002ʚʜ\u0007ú\u0002\u0002ʛʙ\u0003\u0002\u0002\u0002ʛʜ\u0003\u0002\u0002\u0002ʜʝ\u0003\u0002\u0002\u0002ʝʞ\t\u0004\u0002\u0002ʞʟ\u0007ŝ\u0002\u0002ʟʤ\u0005ƨÕ\u0002ʠʡ\u0007ŏ\u0002\u0002ʡʣ\u0005ƨÕ\u0002ʢʠ\u0003\u0002\u0002\u0002ʣʦ\u0003\u0002\u0002\u0002ʤʢ\u0003\u0002\u0002\u0002ʤʥ\u0003\u0002\u0002\u0002ʥʧ\u0003\u0002\u0002\u0002ʦʤ\u0003\u0002\u0002\u0002ʧʨ\u0007Š\u0002\u0002ʨʩ\u0007İ\u0002\u0002ʩʪ\u0007Ú\u0002\u0002ʪʫ\u0005ƨÕ\u0002ʫ'\u0003\u0002\u0002\u0002ʬʭ\u0007\u0017\u0002\u0002ʭʮ\u0007Ĝ\u0002\u0002ʮ)\u0003\u0002\u0002\u0002ʯʰ\u0007\u001f\u0002\u0002ʰ+\u0003\u0002\u0002\u0002ʱʲ\u0007\"\u0002\u0002ʲʹ\u0005ƨÕ\u0002ʳʵ\u0007ŝ\u0002\u0002ʴʶ\u0005ƐÉ\u0002ʵʴ\u0003\u0002\u0002\u0002ʵʶ\u0003\u0002\u0002\u0002ʶʷ\u0003\u0002\u0002\u0002ʷʺ\u0007Š\u0002\u0002ʸʺ\u0005ƐÉ\u0002ʹʳ\u0003\u0002\u0002\u0002ʹʸ\u0003\u0002\u0002\u0002ʹʺ\u0003\u0002\u0002\u0002ʺ-\u0003\u0002\u0002\u0002ʻʼ\u0007H\u0002\u0002ʼˁ\u00054\u001b\u0002ʽʾ\u0007ŏ\u0002\u0002ʾˀ\u00054\u001b\u0002ʿʽ\u0003\u0002\u0002\u0002ˀ˃\u0003\u0002\u0002\u0002ˁʿ\u0003\u0002\u0002\u0002ˁ˂\u0003\u0002\u0002\u0002˂/\u0003\u0002\u0002\u0002˃ˁ\u0003\u0002\u0002\u0002˄˅\u0007H\u0002\u0002˅ˆ\u00054\u001b\u0002ˆˌ\u0007Ţ\u0002\u0002ˇˈ\u00054\u001b\u0002ˈˉ\u0007Ţ\u0002\u0002ˉˋ\u0003\u0002\u0002\u0002ˊˇ\u0003\u0002\u0002\u0002ˋˎ\u0003\u0002\u0002\u0002ˌˊ\u0003\u0002\u0002\u0002ˌˍ\u0003\u0002\u0002\u0002ˍ1\u0003\u0002\u0002\u0002ˎˌ\u0003\u0002\u0002\u0002ˏː\u00054\u001b\u0002ː˖\u0007Ţ\u0002\u0002ˑ˒\u00054\u001b\u0002˒˓\u0007Ţ\u0002\u0002˓˕\u0003\u0002\u0002\u0002˔ˑ\u0003\u0002\u0002\u0002˕˘\u0003\u0002\u0002\u0002˖˔\u0003\u0002\u0002\u0002˖˗\u0003\u0002\u0002\u0002˗3\u0003\u0002\u0002\u0002˘˖\u0003\u0002\u0002\u0002˙˟\u0005:\u001e\u0002˚˟\u00056\u001c\u0002˛˟\u00058\u001d\u0002˜˟\u0005@!\u0002˝˟\u0005B\"\u0002˞˙\u0003\u0002\u0002\u0002˞˚\u0003\u0002\u0002\u0002˞˛\u0003\u0002\u0002\u0002˞˜\u0003\u0002\u0002\u0002˞˝\u0003\u0002\u0002\u0002˟5\u0003\u0002\u0002\u0002ˠ˥\u0005ƨÕ\u0002ˡˢ\u0007ŏ\u0002\u0002ˢˤ\u0005ƨÕ\u0002ˣˡ\u0003\u0002\u0002\u0002ˤ˧\u0003\u0002\u0002\u0002˥ˣ\u0003\u0002\u0002\u0002˥˦\u0003\u0002\u0002\u0002˦˩\u0003\u0002\u0002\u0002˧˥\u0003\u0002\u0002\u0002˨˪\u0007\u0010\u0002\u0002˩˨\u0003\u0002\u0002\u0002˩˪\u0003\u0002\u0002\u0002˪˫\u0003\u0002\u0002\u0002˫˭\u0005r:\u0002ˬˮ\u0005t;\u0002˭ˬ\u0003\u0002\u0002\u0002˭ˮ\u0003\u0002\u0002\u0002ˮ˲\u0003\u0002\u0002\u0002˯˱\u0005v<\u0002˰˯\u0003\u0002\u0002\u0002˱˴\u0003\u0002\u0002\u0002˲˰\u0003\u0002\u0002\u0002˲˳\u0003\u0002\u0002\u0002˳˶\u0003\u0002\u0002\u0002˴˲\u0003\u0002\u0002\u0002˵˷\u0005x=\u0002˶˵\u0003\u0002\u0002\u0002˶˷\u0003\u0002\u0002\u0002˷̄\u0003\u0002\u0002\u0002˸˹\u0005ƨÕ\u0002˹˻\u00071\u0002\u0002˺˼\u0007\u0010\u0002\u0002˻˺\u0003\u0002\u0002\u0002˻˼\u0003\u0002\u0002\u0002˼˽\u0003\u0002\u0002\u0002˽˿\u0005r:\u0002˾̀\u0005t;\u0002˿˾\u0003\u0002\u0002\u0002˿̀\u0003\u0002\u0002\u0002̀́\u0003\u0002\u0002\u0002́̂\u0005x=\u0002̂̄\u0003\u0002\u0002\u0002̃ˠ\u0003\u0002\u0002\u0002̃˸\u0003\u0002\u0002\u0002̄7\u0003\u0002\u0002\u0002̅̆\u0005ƨÕ\u0002̆̇\u00074\u0002\u0002̇9\u0003\u0002\u0002\u0002̈̉\u0007@\u0002\u0002̉̎\u0005ƨÕ\u0002̊̋\u0005ƨÕ\u0002̋̌\u0007@\u0002\u0002̌̎\u0003\u0002\u0002\u0002̍̈\u0003\u0002\u0002\u0002̍̊\u0003\u0002\u0002\u0002̎̑\u0003\u0002\u0002\u0002̏̒\u0005<\u001f\u0002̐̒\u0005> \u0002̑̏\u0003\u0002\u0002\u0002̑̐\u0003\u0002\u0002\u0002̑̒\u0003\u0002\u0002\u0002̒̓\u0003\u0002\u0002\u0002̖̓\t\u0005\u0002\u0002̗̔\u0005Ď\u0088\u0002̗̕\u0005Ű¹\u0002̖̔\u0003\u0002\u0002\u0002̖̕\u0003\u0002\u0002\u0002̗;\u0003\u0002\u0002\u0002̘̙\u0007İ\u0002\u0002̛̙\u0007æ\u0002\u0002̜̚\u0007Ç\u0002\u0002̛̚\u0003\u0002\u0002\u0002̛̜\u0003\u0002\u0002\u0002̜̟\u0003\u0002\u0002\u0002̝̞\u0007Ě\u0002\u0002̞̠\t\u0006\u0002\u0002̟̝\u0003\u0002\u0002\u0002̟̠\u0003\u0002\u0002\u0002̠=\u0003\u0002\u0002\u0002̡̢\u0007ı\u0002\u0002̢̣\u0007æ\u0002\u0002̣?\u0003\u0002\u0002\u0002̤̥\t\u0007\u0002\u0002̥̦\u0007}\u0002\u0002̦̬\u0007p\u0002\u0002̧̭\u0007Ć\u0002\u0002̨̭\u0007ĉ\u0002\u0002̩̪\u0007¿\u0002\u0002̪̭\u0007s\u0002\u0002̫̭\u0005ƨÕ\u0002̧̬\u0003\u0002\u0002\u0002̨̬\u0003\u0002\u0002\u0002̬̩\u0003\u0002\u0002\u0002̬̫\u0003\u0002\u0002\u0002̭̮\u0003\u0002\u0002\u0002̮̯\u0005\b\u0005\u0002̯A\u0003\u0002\u0002\u0002̰̲\u0007y\u0002\u0002̱̰\u0003\u0002\u0002\u0002̱̲\u0003\u0002\u0002\u0002̲̳\u0003\u0002\u0002\u0002̴̳\u0007ē\u0002\u0002̴̵\u0007đ\u0002\u0002̵ͅ\u0005ƨÕ\u0002̶̸\u0007\u0010\u0002\u0002̷̶\u0003\u0002\u0002\u0002̷̸\u0003\u0002\u0002\u0002̸̹\u0003\u0002\u0002\u0002̹̺\u0007ŝ\u0002\u0002̺̻\u0005Ď\u0088\u0002̻̼\u0007Š\u0002\u0002̼͆\u0003\u0002\u0002\u0002̽̿\u0007\u0010\u0002\u0002̾̽\u0003\u0002\u0002\u0002̾̿\u0003\u0002\u0002\u0002̿̀\u0003\u0002\u0002\u0002̀͆\u0005Ď\u0088\u0002́͂\u0007ŝ\u0002\u0002͂̓\u0005H%\u0002̓̈́\u0007Š\u0002\u0002̈́͆\u0003\u0002\u0002\u0002̷ͅ\u0003\u0002\u0002\u0002̾ͅ\u0003\u0002\u0002\u0002́ͅ\u0003\u0002\u0002\u0002͈͆\u0003\u0002\u0002\u0002͇͉\u0005X-\u0002͈͇\u0003\u0002\u0002\u0002͈͉\u0003\u0002\u0002\u0002͉C\u0003\u0002\u0002\u0002͊͋\u0007:\u0002\u0002͋͏\u0007đ\u0002\u0002͍͌\u0007\u0084\u0002\u0002͍͎\u0007¿\u0002\u0002͎͐\u0007h\u0002\u0002͏͌\u0003\u0002\u0002\u0002͏͐\u0003\u0002\u0002\u0002͐͑\u0003\u0002\u0002\u0002͑͒\u0005ľ \u0002͓͒\u0007ŝ\u0002\u0002͓͔\u0005H%\u0002͔͖\u0007Š\u0002\u0002͕͗\u0005X-\u0002͖͕\u0003\u0002\u0002\u0002͖͗\u0003\u0002\u0002\u0002͗E\u0003\u0002\u0002\u0002͘͟\u0007:\u0002\u0002͙͚\u0007¤\u0002\u0002͚͠\u0007ē\u0002\u0002͛͝\t\b\u0002\u0002͛͜\u0003\u0002\u0002\u0002͜͝\u0003\u0002\u0002\u0002͝͞\u0003\u0002\u0002\u0002͞͠\u0007Ĭ\u0002\u0002͙͟\u0003\u0002\u0002\u0002͟͜\u0003\u0002\u0002\u0002͠͡\u0003\u0002\u0002\u0002͢͡\u0007đ\u0002\u0002ͤ͢\u0005ƨÕ\u0002ͣͥ\u0005T+\u0002ͤͣ\u0003\u0002\u0002\u0002ͤͥ\u0003\u0002\u0002\u0002ͥͦ\u0003\u0002\u0002\u0002ͦͧ\u0007ŝ\u0002\u0002ͧͨ\u0005H%\u0002ͨͪ\u0007Š\u0002\u0002ͩͫ\u0005X-\u0002ͪͩ\u0003\u0002\u0002\u0002ͪͫ\u0003\u0002\u0002\u0002ͫG\u0003\u0002\u0002\u0002ͬͱ\u0005J&\u0002ͭͮ\u0007ŏ\u0002\u0002ͮͰ\u0005J&\u0002ͯͭ\u0003\u0002\u0002\u0002Ͱͳ\u0003\u0002\u0002\u0002ͱͯ\u0003\u0002\u0002\u0002ͱͲ\u0003\u0002\u0002\u0002ͲI\u0003\u0002\u0002\u0002ͳͱ\u0003\u0002\u0002\u0002ʹ͵\u0005L'\u0002͵ͷ\u0005r:\u0002Ͷ\u0378\u0005t;\u0002ͷͶ\u0003\u0002\u0002\u0002ͷ\u0378\u0003\u0002\u0002\u0002\u0378ͼ\u0003\u0002\u0002\u0002\u0379ͻ\u0005v<\u0002ͺ\u0379\u0003\u0002\u0002\u0002ͻ;\u0003\u0002\u0002\u0002ͼͺ\u0003\u0002\u0002\u0002ͼͽ\u0003\u0002\u0002\u0002ͽ\u0382\u0003\u0002\u0002\u0002;ͼ\u0003\u0002\u0002\u0002\u037f\u0381\u0005N(\u0002\u0380\u037f\u0003\u0002\u0002\u0002\u0381΄\u0003\u0002\u0002\u0002\u0382\u0380\u0003\u0002\u0002\u0002\u0382\u0383\u0003\u0002\u0002\u0002\u0383\u038b\u0003\u0002\u0002\u0002΄\u0382\u0003\u0002\u0002\u0002΅Ά\u00075\u0002\u0002ΆΈ\u0005ƨÕ\u0002·΅\u0003\u0002\u0002\u0002·Έ\u0003\u0002\u0002\u0002ΈΉ\u0003\u0002\u0002\u0002Ή\u038b\u0005P)\u0002Ίʹ\u0003\u0002\u0002\u0002Ί·\u0003\u0002\u0002\u0002\u038bK\u0003\u0002\u0002\u0002Ό\u038d\u0005ƨÕ\u0002\u038dM\u0003\u0002\u0002\u0002Ύί\u0005x=\u0002ΏΑ\u0007¿\u0002\u0002ΐΏ\u0003\u0002\u0002\u0002ΐΑ\u0003\u0002\u0002\u0002ΑΒ\u0003\u0002\u0002\u0002Βί\u0007Á\u0002\u0002ΓΔ\u0007×\u0002\u0002Δί\u0007\u009c\u0002\u0002Εί\u0007ġ\u0002\u0002ΖΗ\u0007ß\u0002\u0002ΗΘ\u0005ľ \u0002ΘΙ\u0007ŝ\u0002\u0002ΙΚ\u0005ƨÕ\u0002ΚΞ\u0007Š\u0002\u0002ΛΝ\u0005R*\u0002ΜΛ\u0003\u0002\u0002\u0002ΝΠ\u0003\u0002\u0002\u0002ΞΜ\u0003\u0002\u0002\u0002ΞΟ\u0003\u0002\u0002\u0002Οί\u0003\u0002\u0002\u0002ΠΞ\u0003\u0002\u0002\u0002Ρ\u03a2\u0007\u0083\u0002\u0002\u03a2Σ\u0007ŝ\u0002\u0002ΣΨ\u0007ŧ\u0002\u0002ΤΥ\u0007ŏ\u0002\u0002ΥΧ\u0007ŧ\u0002\u0002ΦΤ\u0003\u0002\u0002\u0002ΧΪ\u0003\u0002\u0002\u0002ΨΦ\u0003\u0002\u0002\u0002ΨΩ\u0003\u0002\u0002\u0002ΩΫ\u0003\u0002\u0002\u0002ΪΨ\u0003\u0002\u0002\u0002Ϋί\u0007Š\u0002\u0002άί\u0007\u0014\u0002\u0002έί\u0007_\u0002\u0002ήΎ\u0003\u0002\u0002\u0002ήΐ\u0003\u0002\u0002\u0002ήΓ\u0003\u0002\u0002\u0002ήΕ\u0003\u0002\u0002\u0002ήΖ\u0003\u0002\u0002\u0002ήΡ\u0003\u0002\u0002\u0002ήά\u0003\u0002\u0002\u0002ήέ\u0003\u0002\u0002\u0002ίO\u0003\u0002\u0002\u0002ΰα\u0007×\u0002\u0002αγ\u0007\u009c\u0002\u0002βδ\u0007-\u0002\u0002γβ\u0003\u0002\u0002\u0002γδ\u0003\u0002\u0002\u0002δε\u0003\u0002\u0002\u0002εζ\u0007ŝ\u0002\u0002ζθ\u0005ƨÕ\u0002ηι\t\t\u0002\u0002θη\u0003\u0002\u0002\u0002θι\u0003\u0002\u0002\u0002ιρ\u0003\u0002\u0002\u0002κλ\u0007ŏ\u0002\u0002λν\u0005ƨÕ\u0002μξ\t\t\u0002\u0002νμ\u0003\u0002\u0002\u0002νξ\u0003\u0002\u0002\u0002ξπ\u0003\u0002\u0002\u0002οκ\u0003\u0002\u0002\u0002πσ\u0003\u0002\u0002\u0002ρο\u0003\u0002\u0002\u0002ρς\u0003\u0002\u0002\u0002ςτ\u0003\u0002\u0002\u0002σρ\u0003\u0002\u0002\u0002τφ\u0007Š\u0002\u0002υχ\u0007_\u0002\u0002φυ\u0003\u0002\u0002\u0002φχ\u0003\u0002\u0002\u0002χω\u0003\u0002\u0002\u0002ψϊ\u0005æt\u0002ωψ\u0003\u0002\u0002\u0002ωϊ\u0003\u0002\u0002\u0002ϊϪ\u0003\u0002\u0002\u0002ϋό\u0007q\u0002\u0002όύ\u0007\u009c\u0002\u0002ύώ\u0007ŝ\u0002\u0002ώϓ\u0005ƨÕ\u0002Ϗϐ\u0007ŏ\u0002\u0002ϐϒ\u0005ƨÕ\u0002ϑϏ\u0003\u0002\u0002\u0002ϒϕ\u0003\u0002\u0002\u0002ϓϑ\u0003\u0002\u0002\u0002ϓϔ\u0003\u0002\u0002\u0002ϔϖ\u0003\u0002\u0002\u0002ϕϓ\u0003\u0002\u0002\u0002ϖϗ\u0007Š\u0002\u0002ϗϘ\u0007ß\u0002\u0002Ϙϙ\u0005ľ \u0002ϙϚ\u0007ŝ\u0002\u0002Ϛϟ\u0005ƨÕ\u0002ϛϜ\u0007ŏ\u0002\u0002ϜϞ\u0005ƨÕ\u0002ϝϛ\u0003\u0002\u0002\u0002Ϟϡ\u0003\u0002\u0002\u0002ϟϝ\u0003\u0002\u0002\u0002ϟϠ\u0003\u0002\u0002\u0002ϠϢ\u0003\u0002\u0002\u0002ϡϟ\u0003\u0002\u0002\u0002ϢϦ\u0007Š\u0002\u0002ϣϥ\u0005R*\u0002Ϥϣ\u0003\u0002\u0002\u0002ϥϨ\u0003\u0002\u0002\u0002ϦϤ\u0003\u0002\u0002\u0002Ϧϧ\u0003\u0002\u0002\u0002ϧϪ\u0003\u0002\u0002\u0002ϨϦ\u0003\u0002\u0002\u0002ϩΰ\u0003\u0002\u0002\u0002ϩϋ\u0003\u0002\u0002\u0002ϪQ\u0003\u0002\u0002\u0002ϫϬ\u0007Æ\u0002\u0002Ϭϵ\t\n\u0002\u0002ϭϮ\u0007º\u0002\u0002Ϯ϶\u0007\b\u0002\u0002ϯ϶\u0007ã\u0002\u0002ϰϱ\u0007ú\u0002\u0002ϱ϶\u0007Á\u0002\u0002ϲϳ\u0007ú\u0002\u0002ϳ϶\u0007I\u0002\u0002ϴ϶\u0007$\u0002\u0002ϵϭ\u0003\u0002\u0002\u0002ϵϯ\u0003\u0002\u0002\u0002ϵϰ\u0003\u0002\u0002\u0002ϵϲ\u0003\u0002\u0002\u0002ϵϴ\u0003\u0002\u0002\u0002϶S\u0003\u0002\u0002\u0002Ϸϸ\u0007ŏ\u0002\u0002ϸϺ\u0005V,\u0002ϹϷ\u0003\u0002\u0002\u0002Ϻϻ\u0003\u0002\u0002\u0002ϻϹ\u0003\u0002\u0002\u0002ϻϼ\u0003\u0002\u0002\u0002ϼU\u0003\u0002\u0002\u0002ϽϿ\u0007º\u0002\u0002ϾϽ\u0003\u0002\u0002\u0002ϾϿ\u0003\u0002\u0002\u0002ϿЀ\u0003\u0002\u0002\u0002ЀЁ\u0007©\u0002\u0002ЁW\u0003\u0002\u0002\u0002ЂЄ\u0005Z.\u0002ЃЂ\u0003\u0002\u0002\u0002ЄЅ\u0003\u0002\u0002\u0002ЅЃ\u0003\u0002\u0002\u0002ЅІ\u0003\u0002\u0002\u0002ІY\u0003\u0002\u0002\u0002ЇЈ\u0007Æ\u0002\u0002ЈЉ\u00072\u0002\u0002ЉЊ\t\u000b\u0002\u0002ЊБ\u0007î\u0002\u0002ЋБ\u0005\\/\u0002ЌБ\u0005^0\u0002ЍБ\u0005`1\u0002ЎБ\u0005f4\u0002ЏБ\u0005h5\u0002АЇ\u0003\u0002\u0002\u0002АЋ\u0003\u0002\u0002\u0002АЌ\u0003\u0002\u0002\u0002АЍ\u0003\u0002\u0002\u0002АЎ\u0003\u0002\u0002\u0002АЏ\u0003\u0002\u0002\u0002Б[\u0003\u0002\u0002\u0002ВГ\u0007÷\u0002\u0002ГД\u0007;\u0002\u0002ДХ\t\f\u0002\u0002ЕЖ\t\r\u0002\u0002ЖХ\u0007ŧ\u0002\u0002ЗХ\u0007¼\u0002\u0002ИХ\t\u000e\u0002\u0002ЙК\u0007ċ\u0002\u0002КН\u0007ŝ\u0002\u0002ЛО\u0005ƨÕ\u0002МО\u0007ŧ\u0002\u0002НЛ\u0003\u0002\u0002\u0002НМ\u0003\u0002\u0002\u0002ОП\u0003\u0002\u0002\u0002ПН\u0003\u0002\u0002\u0002ПР\u0003\u0002\u0002\u0002РС\u0003\u0002\u0002\u0002СХ\u0007Š\u0002\u0002ТУ\u0007Ē\u0002\u0002УХ\u0005ƨÕ\u0002ФВ\u0003\u0002\u0002\u0002ФЕ\u0003\u0002\u0002\u0002ФЗ\u0003\u0002\u0002\u0002ФИ\u0003\u0002\u0002\u0002ФЙ\u0003\u0002\u0002\u0002ФТ\u0003\u0002\u0002\u0002Х]\u0003\u0002\u0002\u0002ЦЧ\u0007\u0087\u0002\u0002Чо\u0005ƨÕ\u0002ШЩ\u0007İ\u0002\u0002Що\u0007á\u0002\u0002ЪЫ\u0007W\u0002\u0002ЫЬ\u0007 \u0002\u0002ЬЭ\u0007~\u0002\u0002ЭЮ\u0007ŝ\u0002\u0002Юг\u0005ƨÕ\u0002Яа\u0007ŏ\u0002\u0002ав\u0005ƨÕ\u0002бЯ\u0003\u0002\u0002\u0002ве\u0003\u0002\u0002\u0002гб\u0003\u0002\u0002\u0002гд\u0003\u0002\u0002\u0002дж\u0003\u0002\u0002\u0002ег\u0003\u0002\u0002\u0002жз\u0007Š\u0002\u0002зо\u0003\u0002\u0002\u0002ио\u0007ª\u0002\u0002йк\u0007¿\u0002\u0002ко\u0007ª\u0002\u0002лм\u0007M\u0002\u0002мо\u0007Ç\u0002\u0002нЦ\u0003\u0002\u0002\u0002нШ\u0003\u0002\u0002\u0002нЪ\u0003\u0002\u0002\u0002ни\u0003\u0002\u0002\u0002нй\u0003\u0002\u0002\u0002нл\u0003\u0002\u0002\u0002о_\u0003\u0002\u0002\u0002пр\u0005b2\u0002рa\u0003\u0002\u0002\u0002ст\u0007í\u0002\u0002ту\u0007r\u0002\u0002уч\u0007O\u0002\u0002фц\u0005d3\u0002хф\u0003\u0002\u0002\u0002цщ\u0003\u0002\u0002\u0002чх\u0003\u0002\u0002\u0002чш\u0003\u0002\u0002\u0002шc\u0003\u0002\u0002\u0002щч\u0003\u0002\u0002\u0002ъы\u0007l\u0002\u0002ыь\u0007Ĕ\u0002\u0002ьэ\u0007 \u0002\u0002эё\u0005Ű¹\u0002юя\u0007b\u0002\u0002яѐ\u0007 \u0002\u0002ѐђ\u0005Ű¹\u0002ёю\u0003\u0002\u0002\u0002ёђ\u0003\u0002\u0002\u0002ђѦ\u0003\u0002\u0002\u0002ѓє\u0007/\u0002\u0002єѕ\u0007\u0099\u0002\u0002ѕі\u0007Ĕ\u0002\u0002ії\u0007 \u0002\u0002їѦ\u0005Ű¹\u0002јљ\u0007\u00ad\u0002\u0002љњ\u0007\u009d\u0002\u0002њћ\u0007Ĕ\u0002\u0002ћќ\u0007 \u0002\u0002ќѦ\u0005Ű¹\u0002ѝў\u0007£\u0002\u0002ўџ\u0007Ĕ\u0002\u0002џѠ\u0007 \u0002\u0002ѠѦ\u0005Ű¹\u0002ѡѢ\u0007Á\u0002\u0002Ѣѣ\u0007K\u0002\u0002ѣѤ\u0007\u0010\u0002\u0002ѤѦ\u0005Ű¹\u0002ѥъ\u0003\u0002\u0002\u0002ѥѓ\u0003\u0002\u0002\u0002ѥј\u0003\u0002\u0002\u0002ѥѝ\u0003\u0002\u0002\u0002ѥѡ\u0003\u0002\u0002\u0002Ѧe\u0003\u0002\u0002\u0002ѧѨ\u0007Æ\u0002\u0002ѨѬ\u0005ƨÕ\u0002ѩѪ\u0007ĕ\u0002\u0002ѪѬ\u0005ƨÕ\u0002ѫѧ\u0003\u0002\u0002\u0002ѫѩ\u0003\u0002\u0002\u0002Ѭg\u0003\u0002\u0002\u0002ѭѯ\u0007\u0014\u0002\u0002ѮѰ\u0007œ\u0002\u0002ѯѮ\u0003\u0002\u0002\u0002ѯѰ\u0003\u0002\u0002\u0002Ѱѱ\u0003\u0002\u0002\u0002ѱ҉\u0005Ű¹\u0002ѲѴ\u00070\u0002\u0002ѳѵ\u0007œ\u0002\u0002Ѵѳ\u0003\u0002\u0002\u0002Ѵѵ\u0003\u0002\u0002\u0002ѵѶ\u0003\u0002\u0002\u0002Ѷ҉\u0005Ű¹\u0002ѷѹ\u0007I\u0002\u0002Ѹѷ\u0003\u0002\u0002\u0002Ѹѹ\u0003\u0002\u0002\u0002ѹѽ\u0003\u0002\u0002\u0002Ѻѻ\u0007)\u0002\u0002ѻѾ\u0007ú\u0002\u0002ѼѾ\u0007*\u0002\u0002ѽѺ\u0003\u0002\u0002\u0002ѽѼ\u0003\u0002\u0002\u0002ѾҀ\u0003\u0002\u0002\u0002ѿҁ\u0007œ\u0002\u0002Ҁѿ\u0003\u0002\u0002\u0002Ҁҁ\u0003\u0002\u0002\u0002ҁ҂\u0003\u0002\u0002\u0002҂҉\u0005Ű¹\u0002҃҅\u0007a\u0002\u0002҄҆\u0007œ\u0002\u0002҅҄\u0003\u0002\u0002\u0002҅҆\u0003\u0002\u0002\u0002҆҇\u0003\u0002\u0002\u0002҇҉\u0005Ű¹\u0002҈ѭ\u0003\u0002\u0002\u0002҈Ѳ\u0003\u0002\u0002\u0002҈Ѹ\u0003\u0002\u0002\u0002҈҃\u0003\u0002\u0002\u0002҉i\u0003\u0002\u0002\u0002Ҋҋ\u0007\f\u0002\u0002ҋҌ\u0007đ\u0002\u0002Ҍҍ\u0005ľ \u0002ҍҎ\u0005l7\u0002Ҏk\u0003\u0002\u0002\u0002ҏҐ\u0005n8\u0002Ґm\u0003\u0002\u0002\u0002ґҔ\u0007\t\u0002\u0002Ғғ\u00075\u0002\u0002ғҕ\u0005ƨÕ\u0002ҔҒ\u0003\u0002\u0002\u0002Ҕҕ\u0003\u0002\u0002\u0002ҕҖ\u0003\u0002\u0002\u0002Җҗ\u0005p9\u0002җo\u0003\u0002\u0002\u0002Ҙҙ\u0007×\u0002\u0002ҙқ\u0007\u009c\u0002\u0002ҚҜ\u0007-\u0002\u0002қҚ\u0003\u0002\u0002\u0002қҜ\u0003\u0002\u0002\u0002Ҝҝ\u0003\u0002\u0002\u0002ҝҞ\u0007ŝ\u0002\u0002ҞҠ\u0005ƨÕ\u0002ҟҡ\t\t\u0002\u0002Ҡҟ\u0003\u0002\u0002\u0002Ҡҡ\u0003\u0002\u0002\u0002ҡҩ\u0003\u0002\u0002\u0002Ңң\u0007ŏ\u0002\u0002ңҥ\u0005ƨÕ\u0002ҤҦ\t\t\u0002\u0002ҥҤ\u0003\u0002\u0002\u0002ҥҦ\u0003\u0002\u0002\u0002ҦҨ\u0003\u0002\u0002\u0002ҧҢ\u0003\u0002\u0002\u0002Ҩҫ\u0003\u0002\u0002\u0002ҩҧ\u0003\u0002\u0002\u0002ҩҪ\u0003\u0002\u0002\u0002ҪҬ\u0003\u0002\u0002\u0002ҫҩ\u0003\u0002\u0002\u0002ҬҮ\u0007Š\u0002\u0002ҭү\u0007_\u0002\u0002Үҭ\u0003\u0002\u0002\u0002Үү\u0003\u0002\u0002\u0002үұ\u0003\u0002\u0002\u0002ҰҲ\u0005æt\u0002ұҰ\u0003\u0002\u0002\u0002ұҲ\u0003\u0002\u0002\u0002Ҳӗ\u0003\u0002\u0002\u0002ҳҴ\u0007q\u0002\u0002Ҵҵ\u0007\u009c\u0002\u0002ҵҶ\u0007ŝ\u0002\u0002Ҷһ\u0005ƨÕ\u0002ҷҸ\u0007ŏ\u0002\u0002ҸҺ\u0005ƨÕ\u0002ҹҷ\u0003\u0002\u0002\u0002Һҽ\u0003\u0002\u0002\u0002һҹ\u0003\u0002\u0002\u0002һҼ\u0003\u0002\u0002\u0002ҼҾ\u0003\u0002\u0002\u0002ҽһ\u0003\u0002\u0002\u0002Ҿҿ\u0007Š\u0002\u0002ҿӀ\u0007ß\u0002\u0002ӀӁ\u0005ľ \u0002Ӂӂ\u0007ŝ\u0002\u0002ӂӇ\u0005ƨÕ\u0002Ӄӄ\u0007ŏ\u0002\u0002ӄӆ\u0005ƨÕ\u0002ӅӃ\u0003\u0002\u0002\u0002ӆӉ\u0003\u0002\u0002\u0002ӇӅ\u0003\u0002\u0002\u0002Ӈӈ\u0003\u0002\u0002\u0002ӈӊ\u0003\u0002\u0002\u0002ӉӇ\u0003\u0002\u0002\u0002ӊӎ\u0007Š\u0002\u0002ӋӍ\u0005R*\u0002ӌӋ\u0003\u0002\u0002\u0002ӍӐ\u0003\u0002\u0002\u0002ӎӌ\u0003\u0002\u0002\u0002ӎӏ\u0003\u0002\u0002\u0002ӏӗ\u0003\u0002\u0002\u0002Ӑӎ\u0003\u0002\u0002\u0002ӑӒ\u0007I\u0002\u0002Ӓӓ\u0005Ű¹\u0002ӓӔ\u0007p\u0002\u0002Ӕӕ\u0005ƨÕ\u0002ӕӗ\u0003\u0002\u0002\u0002ӖҘ\u0003\u0002\u0002\u0002Ӗҳ\u0003\u0002\u0002\u0002Ӗӑ\u0003\u0002\u0002\u0002ӗq\u0003\u0002\u0002\u0002ӘԆ\u0007(\u0002\u0002әԆ\u0007\u0019\u0002\u0002ӚԆ\u0007\u001a\u0002\u0002ӛԆ\u0007\u001b\u0002\u0002ӜԆ\u0007\u001c\u0002\u0002ӝԆ\u0007\u001d\u0002\u0002ӞԆ\u0007B\u0002\u0002ӟԆ\u0007C\u0002\u0002ӠԆ\u0007F\u0002\u0002ӡԆ\u0007G\u0002\u0002ӢӤ\u0007Y\u0002\u0002ӣӥ\u0007Õ\u0002\u0002Ӥӣ\u0003\u0002\u0002\u0002Ӥӥ\u0003\u0002\u0002\u0002ӥԆ\u0003\u0002\u0002\u0002ӦԆ\u0007o\u0002\u0002ӧԆ\u0007\u008e\u0002\u0002ӨԆ\u0007\u008f\u0002\u0002өԆ\u0007\u0090\u0002\u0002ӪԆ\u0007\u0091\u0002\u0002ӫԆ\u0007\u0092\u0002\u0002ӬԆ\u0007·\u0002\u0002ӭԆ\u0007¹\u0002\u0002ӮԆ\u0007Ã\u0002\u0002ӯԆ\u0007Â\u0002\u0002ӰԆ\u0007Ô\u0002\u0002ӱԆ\u0007Þ\u0002\u0002Ӳӳ\u0007å\u0002\u0002ӳԆ\u0007ī\u0002\u0002ӴԆ\u0007ā\u0002\u0002ӵԆ\u0007Ā\u0002\u0002ӶԆ\u0007Ă\u0002\u0002ӷԆ\u0007Ą\u0002\u0002ӸԆ\u0007ă\u0002\u0002ӹԆ\u0007Č\u0002\u0002ӺԆ\u0007Đ\u0002\u0002ӻԆ\u0007ė\u0002\u0002ӼԆ\u0007Ę\u0002\u0002ӽԆ\u0007ĩ\u0002\u0002ӾԆ\u0007Ī\u0002\u0002ӿԆ\u0007Ĵ\u0002\u0002Ԁԃ\u0007Ť\u0002\u0002ԁԂ\u0007\u0005\u0002\u0002ԂԄ\t\u000f\u0002\u0002ԃԁ\u0003\u0002\u0002\u0002ԃԄ\u0003\u0002\u0002\u0002ԄԆ\u0003\u0002\u0002\u0002ԅӘ\u0003\u0002\u0002\u0002ԅә\u0003\u0002\u0002\u0002ԅӚ\u0003\u0002\u0002\u0002ԅӛ\u0003\u0002\u0002\u0002ԅӜ\u0003\u0002\u0002\u0002ԅӝ\u0003\u0002\u0002\u0002ԅӞ\u0003\u0002\u0002\u0002ԅӟ\u0003\u0002\u0002\u0002ԅӠ\u0003\u0002\u0002\u0002ԅӡ\u0003\u0002\u0002\u0002ԅӢ\u0003\u0002\u0002\u0002ԅӦ\u0003\u0002\u0002\u0002ԅӧ\u0003\u0002\u0002\u0002ԅӨ\u0003\u0002\u0002\u0002ԅө\u0003\u0002\u0002\u0002ԅӪ\u0003\u0002\u0002\u0002ԅӫ\u0003\u0002\u0002\u0002ԅӬ\u0003\u0002\u0002\u0002ԅӭ\u0003\u0002\u0002\u0002ԅӮ\u0003\u0002\u0002\u0002ԅӯ\u0003\u0002\u0002\u0002ԅӰ\u0003\u0002\u0002\u0002ԅӱ\u0003\u0002\u0002\u0002ԅӲ\u0003\u0002\u0002\u0002ԅӴ\u0003\u0002\u0002\u0002ԅӵ\u0003\u0002\u0002\u0002ԅӶ\u0003\u0002\u0002\u0002ԅӷ\u0003\u0002\u0002\u0002ԅӸ\u0003\u0002\u0002\u0002ԅӹ\u0003\u0002\u0002\u0002ԅӺ\u0003\u0002\u0002\u0002ԅӻ\u0003\u0002\u0002\u0002ԅӼ\u0003\u0002\u0002\u0002ԅӽ\u0003\u0002\u0002\u0002ԅӾ\u0003\u0002\u0002\u0002ԅӿ\u0003\u0002\u0002\u0002ԅԀ\u0003\u0002\u0002\u0002Ԇs\u0003\u0002\u0002\u0002ԇԈ\u0007ŝ\u0002\u0002ԈԊ\t\u0010\u0002\u0002ԉԋ\t\u0011\u0002\u0002Ԋԉ\u0003\u0002\u0002\u0002Ԋԋ\u0003\u0002\u0002\u0002ԋԎ\u0003\u0002\u0002\u0002Ԍԍ\u0007ŏ\u0002\u0002ԍԏ\u0007ŧ\u0002\u0002ԎԌ\u0003\u0002\u0002\u0002Ԏԏ\u0003\u0002\u0002\u0002ԏԐ\u0003\u0002\u0002\u0002Ԑԑ\u0007Š\u0002\u0002ԑu\u0003\u0002\u0002\u0002ԒԔ\u0007¿\u0002\u0002ԓԒ\u0003\u0002\u0002\u0002ԓԔ\u0003\u0002\u0002\u0002Ԕԕ\u0003\u0002\u0002\u0002ԕԞ\u0007Á\u0002\u0002Ԗԗ\u0007)\u0002\u0002ԗԘ\u0007ú\u0002\u0002ԘԞ\u0005ƨÕ\u0002ԙԛ\u0007¿\u0002\u0002Ԛԙ\u0003\u0002\u0002\u0002Ԛԛ\u0003\u0002\u0002\u0002ԛԜ\u0003\u0002\u0002\u0002ԜԞ\t\u0012\u0002\u0002ԝԓ\u0003\u0002\u0002\u0002ԝԖ\u0003\u0002\u0002\u0002ԝԚ\u0003\u0002\u0002\u0002Ԟw\u0003\u0002\u0002\u0002ԟԡ\u0007Ŏ\u0002\u0002Ԡԟ\u0003\u0002\u0002\u0002Ԡԡ\u0003\u0002\u0002\u0002ԡԢ\u0003\u0002\u0002\u0002Ԣԣ\u0007œ\u0002\u0002ԣԧ\u0005Ű¹\u0002Ԥԥ\u0007I\u0002\u0002ԥԧ\u0005Ű¹\u0002ԦԠ\u0003\u0002\u0002\u0002ԦԤ\u0003\u0002\u0002\u0002ԧy\u0003\u0002\u0002\u0002\u0528\u0529\u0007:\u0002\u0002\u0529\u052d\t\u0013\u0002\u0002\u052a\u052b\u0007\u0084\u0002\u0002\u052b\u052c\u0007¿\u0002\u0002\u052c\u052e\u0007h\u0002\u0002\u052d\u052a\u0003\u0002\u0002\u0002\u052d\u052e\u0003\u0002\u0002\u0002\u052e\u052f\u0003\u0002\u0002\u0002\u052fԳ\u0005Ű¹\u0002\u0530Բ\u0005|?\u0002Ա\u0530\u0003\u0002\u0002\u0002ԲԵ\u0003\u0002\u0002\u0002ԳԱ\u0003\u0002\u0002\u0002ԳԴ\u0003\u0002\u0002\u0002Դ{\u0003\u0002\u0002\u0002ԵԳ\u0003\u0002\u0002\u0002ԶԷ\u00070\u0002\u0002ԷԻ\u0005Ű¹\u0002ԸԹ\u0007¥\u0002\u0002ԹԻ\u0005Ű¹\u0002ԺԶ\u0003\u0002\u0002\u0002ԺԸ\u0003\u0002\u0002\u0002Ի}\u0003\u0002\u0002\u0002ԼՄ\u0007\f\u0002\u0002ԽՀ\u0007:\u0002\u0002ԾԿ\u0007É\u0002\u0002ԿՁ\u0007á\u0002\u0002ՀԾ\u0003\u0002\u0002\u0002ՀՁ\u0003\u0002\u0002\u0002ՁՄ\u0003\u0002\u0002\u0002ՂՄ\u0007á\u0002\u0002ՃԼ\u0003\u0002\u0002\u0002ՃԽ\u0003\u0002\u0002\u0002ՃՂ\u0003\u0002\u0002\u0002ՃՄ\u0003\u0002\u0002\u0002ՄՅ\u0003\u0002\u0002\u0002ՅՆ\u0007w\u0002\u0002ՆՈ\u0005ƨÕ\u0002ՇՉ\u0005\u0090I\u0002ՈՇ\u0003\u0002\u0002\u0002ՈՉ\u0003\u0002\u0002\u0002ՉՊ\u0003\u0002\u0002\u0002ՊՌ\u0005\u0080A\u0002ՋՍ\t\u0014\u0002\u0002ՌՋ\u0003\u0002\u0002\u0002ՌՍ\u0003\u0002\u0002\u0002ՍՏ\u0003\u0002\u0002\u0002ՎՐ\u00052\u001a\u0002ՏՎ\u0003\u0002\u0002\u0002ՏՐ\u0003\u0002\u0002\u0002ՐՑ\u0003\u0002\u0002\u0002ՑՒ\u0005\b\u0005\u0002Ւ\u007f\u0003\u0002\u0002\u0002ՓՔ\t\u0015\u0002\u0002ՔՖ\u0005r:\u0002Օ\u0557\u0005t;\u0002ՖՕ\u0003\u0002\u0002\u0002Ֆ\u0557\u0003\u0002\u0002\u0002\u0557\u0081\u0003\u0002\u0002\u0002\u0558\u0560\u0007\f\u0002\u0002ՙ՜\u0007:\u0002\u0002՚՛\u0007É\u0002\u0002՛՝\u0007á\u0002\u0002՜՚\u0003\u0002\u0002\u0002՜՝\u0003\u0002\u0002\u0002՝\u0560\u0003\u0002\u0002\u0002՞\u0560\u0007á\u0002\u0002՟\u0558\u0003\u0002\u0002\u0002՟ՙ\u0003\u0002\u0002\u0002՟՞\u0003\u0002\u0002\u0002՟\u0560\u0003\u0002\u0002\u0002\u0560ա\u0003\u0002\u0002\u0002աբ\u0007Ð\u0002\u0002բգ\u0005ƨÕ\u0002գդ\t\u0014\u0002\u0002դե\u0005\u0084C\u0002եթ\u0007`\u0002\u0002զէ\u0005ƨÕ\u0002էը\u0007Ţ\u0002\u0002ըժ\u0003\u0002\u0002\u0002թզ\u0003\u0002\u0002\u0002թժ\u0003\u0002\u0002\u0002ժ\u0083\u0003\u0002\u0002\u0002իլ\u0005\u0086D\u0002լղ\u0007Ţ\u0002\u0002խծ\u0005\u0086D\u0002ծկ\u0007Ţ\u0002\u0002կձ\u0003\u0002\u0002\u0002հխ\u0003\u0002\u0002\u0002ձմ\u0003\u0002\u0002\u0002ղհ\u0003\u0002\u0002\u0002ղճ\u0003\u0002\u0002\u0002ճ\u0085\u0003\u0002\u0002\u0002մղ\u0003\u0002\u0002\u0002յփ\u00054\u001b\u0002նշ\u0007w\u0002\u0002շչ\u0005ƨÕ\u0002ոպ\u0005\u0090I\u0002չո\u0003\u0002\u0002\u0002չպ\u0003\u0002\u0002\u0002պջ\u0003\u0002\u0002\u0002ջռ\u0005\u0080A\u0002ռփ\u0003\u0002\u0002\u0002սվ\t\u0016\u0002\u0002վր\u0005ƨÕ\u0002տց\u0005\u0090I\u0002րտ\u0003\u0002\u0002\u0002րց\u0003\u0002\u0002\u0002ցփ\u0003\u0002\u0002\u0002ւյ\u0003\u0002\u0002\u0002ւն\u0003\u0002\u0002\u0002ւս\u0003\u0002\u0002\u0002փ\u0087\u0003\u0002\u0002\u0002ք\u058c\u0007\f\u0002\u0002օ\u0588\u0007:\u0002\u0002ֆև\u0007É\u0002\u0002և։\u0007á\u0002\u0002\u0588ֆ\u0003\u0002\u0002\u0002\u0588։\u0003\u0002\u0002\u0002։\u058c\u0003\u0002\u0002\u0002֊\u058c\u0007á\u0002\u0002\u058bք\u0003\u0002\u0002\u0002\u058bօ\u0003\u0002\u0002\u0002\u058b֊\u0003\u0002\u0002\u0002\u058b\u058c\u0003\u0002\u0002\u0002\u058c\u058d\u0003\u0002\u0002\u0002\u058d\u058e\u0007Ð\u0002\u0002\u058e֏\u0007\u001e\u0002\u0002֏\u0590\u0005ƨÕ\u0002\u0590֑\t\u0014\u0002\u0002֑֒\u0005\u008aF\u0002֖֒\u0007`\u0002\u0002֓֔\u0005ƨÕ\u0002֔֕\u0007Ţ\u0002\u0002֕֗\u0003\u0002\u0002\u0002֖֓\u0003\u0002\u0002\u0002֖֗\u0003\u0002\u0002\u0002֗\u0089\u0003\u0002\u0002\u0002֘֙\u0005\u008cG\u0002֙֟\u0007Ţ\u0002\u0002֛֚\u0005\u008cG\u0002֛֜\u0007Ţ\u0002\u0002֜֞\u0003\u0002\u0002\u0002֚֝\u0003\u0002\u0002\u0002֞֡\u0003\u0002\u0002\u0002֟֝\u0003\u0002\u0002\u0002֟֠\u0003\u0002\u0002\u0002֠\u008b\u0003\u0002\u0002\u0002֡֟\u0003\u0002\u0002\u0002֢֦\u00054\u001b\u0002֣֦\u0005~@\u0002֤֦\u0005\u008eH\u0002֥֢\u0003\u0002\u0002\u0002֥֣\u0003\u0002\u0002\u0002֥֤\u0003\u0002\u0002\u0002֦\u008d\u0003\u0002\u0002\u0002֧֯\u0007\f\u0002\u0002֨֫\u0007:\u0002\u0002֪֩\u0007É\u0002\u0002֪֬\u0007á\u0002\u0002֫֩\u0003\u0002\u0002\u0002֫֬\u0003\u0002\u0002\u0002֬֯\u0003\u0002\u0002\u0002֭֯\u0007á\u0002\u0002֧֮\u0003\u0002\u0002\u0002֮֨\u0003\u0002\u0002\u0002֭֮\u0003\u0002\u0002\u0002֮֯\u0003\u0002\u0002\u0002ְ֯\u0003\u0002\u0002\u0002ְֱ\t\u0016\u0002\u0002ֱֳ\u0005ƨÕ\u0002ֲִ\u0005\u0090I\u0002ֲֳ\u0003\u0002\u0002\u0002ֳִ\u0003\u0002\u0002\u0002ִֶ\u0003\u0002\u0002\u0002ֵַ\u0005\u0094K\u0002ֵֶ\u0003\u0002\u0002\u0002ֶַ\u0003\u0002\u0002\u0002ַֹ\u0003\u0002\u0002\u0002ָֺ\t\u0014\u0002\u0002ָֹ\u0003\u0002\u0002\u0002ֹֺ\u0003\u0002\u0002\u0002ֺּ\u0003\u0002\u0002\u0002ֻֽ\u00052\u001a\u0002ֻּ\u0003\u0002\u0002\u0002ּֽ\u0003\u0002\u0002\u0002ֽֿ\u0003\u0002\u0002\u0002־׀\u0005Ċ\u0086\u0002ֿ־\u0003\u0002\u0002\u0002ֿ׀\u0003\u0002\u0002\u0002׀ׁ\u0003\u0002\u0002\u0002ׁׅ\u0005\f\u0007\u0002ׂ׃\u0005ƨÕ\u0002׃ׄ\u0007Ţ\u0002\u0002ׄ׆\u0003\u0002\u0002\u0002ׂׅ\u0003\u0002\u0002\u0002ׅ׆\u0003\u0002\u0002\u0002׆\u008f\u0003\u0002\u0002\u0002ׇ\u05c8\u0007ŝ\u0002\u0002\u05c8מ\u0007Š\u0002\u0002\u05c9\u05ca\u0007ŝ\u0002\u0002\u05ca\u05cf\u0005\u0092J\u0002\u05cb\u05cc\u0007ŏ\u0002\u0002\u05cc\u05ce\u0005\u0092J\u0002\u05cd\u05cb\u0003\u0002\u0002\u0002\u05ceב\u0003\u0002\u0002\u0002\u05cf\u05cd\u0003\u0002\u0002\u0002\u05cfא\u0003\u0002\u0002\u0002אג\u0003\u0002\u0002\u0002ב\u05cf\u0003\u0002\u0002\u0002גד\u0007Š\u0002\u0002דמ\u0003\u0002\u0002\u0002הו\u0006I\u0004\u0002וך\u0005\u0092J\u0002זח\u0007ŏ\u0002\u0002חי\u0005\u0092J\u0002טז\u0003\u0002\u0002\u0002יל\u0003\u0002\u0002\u0002ךט\u0003\u0002\u0002\u0002ךכ\u0003\u0002\u0002\u0002כמ\u0003\u0002\u0002\u0002לך\u0003\u0002\u0002\u0002םׇ\u0003\u0002\u0002\u0002ם\u05c9\u0003\u0002\u0002\u0002םה\u0003\u0002\u0002\u0002מ\u0091\u0003\u0002\u0002\u0002ןץ\u0007\u0087\u0002\u0002נץ\u0007Ë\u0002\u0002סץ\u0007\u008c\u0002\u0002עף\u0007\u0087\u0002\u0002ףץ\u0007Ë\u0002\u0002פן\u0003\u0002\u0002\u0002פנ\u0003\u0002\u0002\u0002פס\u0003\u0002\u0002\u0002פע\u0003\u0002\u0002\u0002פץ\u0003\u0002\u0002\u0002ץצ\u0003\u0002\u0002\u0002צק\u0005ƨÕ\u0002קש\u0005r:\u0002רת\u0005t;\u0002שר\u0003\u0002\u0002\u0002שת\u0003\u0002\u0002\u0002ת\u05ee\u0003\u0002\u0002\u0002\u05eb\u05ed\u0005v<\u0002\u05ec\u05eb\u0003\u0002\u0002\u0002\u05edװ\u0003\u0002\u0002\u0002\u05ee\u05ec\u0003\u0002\u0002\u0002\u05ee\u05ef\u0003\u0002\u0002\u0002\u05efײ\u0003\u0002\u0002\u0002װ\u05ee\u0003\u0002\u0002\u0002ױ׳\u0005x=\u0002ײױ\u0003\u0002\u0002\u0002ײ׳\u0003\u0002\u0002\u0002׳؊\u0003\u0002\u0002\u0002״\u05fa\u0005ƨÕ\u0002\u05f5\u05fb\u0007\u0087\u0002\u0002\u05f6\u05fb\u0007Ë\u0002\u0002\u05f7\u05fb\u0007\u008c\u0002\u0002\u05f8\u05f9\u0007\u0087\u0002\u0002\u05f9\u05fb\u0007Ë\u0002\u0002\u05fa\u05f5\u0003\u0002\u0002\u0002\u05fa\u05f6\u0003\u0002\u0002\u0002\u05fa\u05f7\u0003\u0002\u0002\u0002\u05fa\u05f8\u0003\u0002\u0002\u0002\u05fa\u05fb\u0003\u0002\u0002\u0002\u05fb\u05fc\u0003\u0002\u0002\u0002\u05fc\u05fe\u0005r:\u0002\u05fd\u05ff\u0005t;\u0002\u05fe\u05fd\u0003\u0002\u0002\u0002\u05fe\u05ff\u0003\u0002\u0002\u0002\u05ff\u0603\u0003\u0002\u0002\u0002\u0600\u0602\u0005v<\u0002\u0601\u0600\u0003\u0002\u0002\u0002\u0602\u0605\u0003\u0002\u0002\u0002\u0603\u0601\u0003\u0002\u0002\u0002\u0603\u0604\u0003\u0002\u0002\u0002\u0604؇\u0003\u0002\u0002\u0002\u0605\u0603\u0003\u0002\u0002\u0002؆؈\u0005x=\u0002؇؆\u0003\u0002\u0002\u0002؇؈\u0003\u0002\u0002\u0002؈؊\u0003\u0002\u0002\u0002؉פ\u0003\u0002\u0002\u0002؉״\u0003\u0002\u0002\u0002؊\u0093\u0003\u0002\u0002\u0002؋؍\u0005\u0096L\u0002،؋\u0003\u0002\u0002\u0002؍؎\u0003\u0002\u0002\u0002؎،\u0003\u0002\u0002\u0002؎؏\u0003\u0002\u0002\u0002؏\u0095\u0003\u0002\u0002\u0002ؐؑ\u0007\u009e\u0002\u0002ؑ\u061c\u0007ą\u0002\u0002ؒؓ\u0007ą\u0002\u0002ؓؔ\u0007ö\u0002\u0002ؔ\u061c\t\u0017\u0002\u0002ؕؗ\u0007[\u0002\u0002ؖؕ\u0003\u0002\u0002\u0002ؖؗ\u0003\u0002\u0002\u0002ؘؗ\u0003\u0002\u0002\u0002ؘؙ\u0007ä\u0002\u0002ؙؚ\u0007ý\u0002\u0002ؚ\u061c\u0007ŧ\u0002\u0002؛ؐ\u0003\u0002\u0002\u0002؛ؒ\u0003\u0002\u0002\u0002؛ؖ\u0003\u0002\u0002\u0002\u061c\u0097\u0003\u0002\u0002\u0002\u061d؞\u0007Z\u0002\u0002؞ء\u0007đ\u0002\u0002؟ؠ\u0007\u0084\u0002\u0002ؠآ\u0007h\u0002\u0002ء؟\u0003\u0002\u0002\u0002ءآ\u0003\u0002\u0002\u0002آأ\u0003\u0002\u0002\u0002أج\u0005ľ \u0002ؤإ\u0007Z\u0002\u0002إب\t\u0013\u0002\u0002ئا\u0007\u0084\u0002\u0002اة\u0007h\u0002\u0002بئ\u0003\u0002\u0002\u0002بة\u0003\u0002\u0002\u0002ةت\u0003\u0002\u0002\u0002تج\u0005Ű¹\u0002ث\u061d\u0003\u0002\u0002\u0002ثؤ\u0003\u0002\u0002\u0002ج\u0099\u0003\u0002\u0002\u0002حخ\u0007`\u0002\u0002خد\u0007Ĝ\u0002\u0002د\u009b\u0003\u0002\u0002\u0002ذز\t\u0018\u0002\u0002رس\u0007\u0086\u0002\u0002زر\u0003\u0002\u0002\u0002زس\u0003\u0002\u0002\u0002سش\u0003\u0002\u0002\u0002شغ\u0005Ű¹\u0002صض\u0007ŝ\u0002\u0002ضط\u0005ƐÉ\u0002طظ\u0007Š\u0002\u0002ظػ\u0003\u0002\u0002\u0002عػ\u0005ƐÉ\u0002غص\u0003\u0002\u0002\u0002غع\u0003\u0002\u0002\u0002غػ\u0003\u0002\u0002\u0002ػم\u0003\u0002\u0002\u0002ؼؽ\u0007\u0095\u0002\u0002ؽق\u0007Ť\u0002\u0002ؾؿ\u0007ŏ\u0002\u0002ؿف\u0007Ť\u0002\u0002ـؾ\u0003\u0002\u0002\u0002فل\u0003\u0002\u0002\u0002قـ\u0003\u0002\u0002\u0002قك\u0003\u0002\u0002\u0002كن\u0003\u0002\u0002\u0002لق\u0003\u0002\u0002\u0002مؼ\u0003\u0002\u0002\u0002من\u0003\u0002\u0002\u0002نو\u0003\u0002\u0002\u0002هى\u0005Č\u0087\u0002وه\u0003\u0002\u0002\u0002وى\u0003\u0002\u0002\u0002ى\u009d\u0003\u0002\u0002\u0002يٍ\u0005 Q\u0002ًٍ\u0005¢R\u0002ٌي\u0003\u0002\u0002\u0002ًٌ\u0003\u0002\u0002\u0002ٍ\u009f\u0003\u0002\u0002\u0002َُ\u0007\u0084\u0002\u0002ُِ\u0005Š±\u0002ِّ\u0007Ė\u0002\u0002ّٕ\u0005\u0004\u0003\u0002ْٔ\u0005¤S\u0002ْٓ\u0003\u0002\u0002\u0002ٔٗ\u0003\u0002\u0002\u0002ٕٓ\u0003\u0002\u0002\u0002ٕٖ\u0003\u0002\u0002\u0002ٖٙ\u0003\u0002\u0002\u0002ٕٗ\u0003\u0002\u0002\u0002٘ٚ\u0005¦T\u0002ٙ٘\u0003\u0002\u0002\u0002ٙٚ\u0003\u0002\u0002\u0002ٚٛ\u0003\u0002\u0002\u0002ٜٛ\u0007`\u0002\u0002ٜٝ\u0007\u0084\u0002\u0002ٝ¡\u0003\u0002\u0002\u0002ٟٞ\u0007\u0084\u0002\u0002ٟ٠\u0005Š±\u0002٠٣\u0005\b\u0005\u0002١٢\u0007\\\u0002\u0002٢٤\u0005\b\u0005\u0002٣١\u0003\u0002\u0002\u0002٣٤\u0003\u0002\u0002\u0002٤£\u0003\u0002\u0002\u0002٥٦\t\u0019\u0002\u0002٦٧\u0005Š±\u0002٧٨\u0007Ė\u0002\u0002٨٩\u0005\u0004\u0003\u0002٩¥\u0003\u0002\u0002\u0002٪٫\u0007\\\u0002\u0002٫٬\u0005\u0004\u0003\u0002٬§\u0003\u0002\u0002\u0002٭ٰ\u0007\u0088\u0002\u0002ٮٱ\u0005ƢÒ\u0002ٯٱ\u0005Ű¹\u0002ٰٮ\u0003\u0002\u0002\u0002ٰٯ\u0003\u0002\u0002\u0002ٱ©\u0003\u0002\u0002\u0002ٲٹ\u0007\u008d\u0002\u0002ٳٴ\u0007Î\u0002\u0002ٴٺ\u0007đ\u0002\u0002ٵٷ\u0007\u0095\u0002\u0002ٶٸ\u0007đ\u0002\u0002ٷٶ\u0003\u0002\u0002\u0002ٷٸ\u0003\u0002\u0002\u0002ٸٺ\u0003\u0002\u0002\u0002ٹٳ\u0003\u0002\u0002\u0002ٹٵ\u0003\u0002\u0002\u0002ٺٻ\u0003\u0002\u0002\u0002ٻٽ\u0005ľ \u0002ټپ\u0005¬W\u0002ٽټ\u0003\u0002\u0002\u0002ٽپ\u0003\u0002\u0002\u0002پځ\u0003\u0002\u0002\u0002ٿڂ\u0005Ď\u0088\u0002ڀڂ\u0005®X\u0002ځٿ\u0003\u0002\u0002\u0002ځڀ\u0003\u0002\u0002\u0002ڂ«\u0003\u0002\u0002\u0002ڃڄ\u0007ŝ\u0002\u0002ڄډ\u0005ƨÕ\u0002څچ\u0007ŏ\u0002\u0002چڈ\u0005ƨÕ\u0002ڇڅ\u0003\u0002\u0002\u0002ڈڋ\u0003\u0002\u0002\u0002ډڇ\u0003\u0002\u0002\u0002ډڊ\u0003\u0002\u0002\u0002ڊڌ\u0003\u0002\u0002\u0002ڋډ\u0003\u0002\u0002\u0002ڌڍ\u0007Š\u0002\u0002ڍ\u00ad\u0003\u0002\u0002\u0002ڎڏ\u0007ħ\u0002\u0002ڏڔ\u0005°Y\u0002ڐڑ\u0007ŏ\u0002\u0002ڑړ\u0005°Y\u0002ڒڐ\u0003\u0002\u0002\u0002ړږ\u0003\u0002\u0002\u0002ڔڒ\u0003\u0002\u0002\u0002ڔڕ\u0003\u0002\u0002\u0002ڕ¯\u0003\u0002\u0002\u0002ږڔ\u0003\u0002\u0002\u0002ڗژ\u0007ŝ\u0002\u0002ژڝ\u0005Ű¹\u0002ڙښ\u0007ŏ\u0002\u0002ښڜ\u0005Ű¹\u0002ڛڙ\u0003\u0002\u0002\u0002ڜڟ\u0003\u0002\u0002\u0002ڝڛ\u0003\u0002\u0002\u0002ڝڞ\u0003\u0002\u0002\u0002ڞڠ\u0003\u0002\u0002\u0002ڟڝ\u0003\u0002\u0002\u0002ڠڡ\u0007Š\u0002\u0002ڡ±\u0003\u0002\u0002\u0002ڢڣ\u0007\u008d\u0002\u0002ڣڥ\u0007Î\u0002\u0002ڤڦ\u0007¤\u0002\u0002ڥڤ\u0003\u0002\u0002\u0002ڥڦ\u0003\u0002\u0002\u0002ڦڧ\u0003\u0002\u0002\u0002ڧڨ\u0007U\u0002\u0002ڨک\u0005ƖÌ\u0002کڪ\u0005ƔË\u0002ڪ³\u0003\u0002\u0002\u0002ګڭ\u0007i\u0002\u0002ڬڮ\u0007Ť\u0002\u0002ڭڬ\u0003\u0002\u0002\u0002ڭڮ\u0003\u0002\u0002\u0002ڮڱ\u0003\u0002\u0002\u0002گڰ\u0007ĭ\u0002\u0002ڰڲ\u0005Š±\u0002ڱگ\u0003\u0002\u0002\u0002ڱڲ\u0003\u0002\u0002\u0002ڲµ\u0003\u0002\u0002\u0002ڳڴ\u0007x\u0002\u0002ڴڵ\u0007S\u0002\u0002ڵڶ\u0005¸]\u0002ڶ·\u0003\u0002\u0002\u0002ڷں\u0005º^\u0002ڸں\u0005¼_\u0002ڹڷ\u0003\u0002\u0002\u0002ڹڸ\u0003\u0002\u0002\u0002ں¹\u0003\u0002\u0002\u0002ڻڼ\u0007f\u0002\u0002ڼڽ\u0007ŧ\u0002\u0002ڽھ\u0005ƨÕ\u0002ھڿ\u0007œ\u0002\u0002ڿۀ\u0007²\u0002\u0002ۀ»\u0003\u0002\u0002\u0002ہۂ\u0005ƨÕ\u0002ۂۃ\u0007œ\u0002\u0002ۃۄ\u0007ð\u0002\u0002ۄ½\u0003\u0002\u0002\u0002ۅۆ\u0007{\u0002\u0002ۆۋ\u0005Àa\u0002ۇۈ\u0007ŏ\u0002\u0002ۈۊ\u0005Àa\u0002ۉۇ\u0003\u0002\u0002\u0002ۊۍ\u0003\u0002\u0002\u0002ۋۉ\u0003\u0002\u0002\u0002ۋی\u0003\u0002\u0002\u0002یێ\u0003\u0002\u0002\u0002ۍۋ\u0003\u0002\u0002\u0002ێۏ\u0007Ě\u0002\u0002ۏې\u0007ë\u0002\u0002ېۑ\u0005ƨÕ\u0002ۑ¿\u0003\u0002\u0002\u0002ےۓ\u0007e\u0002\u0002ۓ۔\u0007Æ\u0002\u0002۔ە\u0007Ú\u0002\u0002ەۖ\u0005ƨÕ\u0002ۖÁ\u0003\u0002\u0002\u0002ۗۙ\u0007\u009f\u0002\u0002ۘۚ\u0007Ť\u0002\u0002ۙۘ\u0003\u0002\u0002\u0002ۙۚ\u0003\u0002\u0002\u0002ۚÃ\u0003\u0002\u0002\u0002ۛۜ\u0007\u00ad\u0002\u0002ۜ\u06dd\u0007Ä\u0002\u0002\u06dd۠\u0005Ű¹\u0002۞۟\u0007Ě\u0002\u0002۟ۡ\u0005Ű¹\u0002۠۞\u0003\u0002\u0002\u0002۠ۡ\u0003\u0002\u0002\u0002ۡۤ\u0003\u0002\u0002\u0002ۣۢ\u0007\u0013\u0002\u0002ۣۥ\u0005Ű¹\u0002ۤۢ\u0003\u0002\u0002\u0002ۤۥ\u0003\u0002\u0002\u0002ۥÅ\u0003\u0002\u0002\u0002ۦۧ\u0007È\u0002\u0002ۭۧ\u0007Ť\u0002\u0002ۨ۫\u0007p\u0002\u0002۩۬\u0005Ď\u0088\u0002۪۬\u0005Ű¹\u0002۫۩\u0003\u0002\u0002\u0002۪۫\u0003\u0002\u0002\u0002۬ۮ\u0003\u0002\u0002\u0002ۭۨ\u0003\u0002\u0002\u0002ۭۮ\u0003\u0002\u0002\u0002ۮÇ\u0003\u0002\u0002\u0002ۯ۱\u0007k\u0002\u0002۰۲\u0007t\u0002\u0002۱۰\u0003\u0002\u0002\u0002۱۲\u0003\u0002\u0002\u0002۲۳\u0003\u0002\u0002\u0002۳۴\u0007Ť\u0002\u0002۴۵\u0007\u0095\u0002\u0002۵ۺ\u0007Ť\u0002\u0002۶۷\u0007ŏ\u0002\u0002۷۹\u0007Ť\u0002\u0002۸۶\u0003\u0002\u0002\u0002۹ۼ\u0003\u0002\u0002\u0002ۺ۸\u0003\u0002\u0002\u0002ۺۻ\u0003\u0002\u0002\u0002ۻÉ\u0003\u0002\u0002\u0002ۼۺ\u0003\u0002\u0002\u0002۽۾\u0007,\u0002\u0002۾ۿ\u0007Ť\u0002\u0002ۿË\u0003\u0002\u0002\u0002܀܁\u0007.\u0002\u0002܁܂\t\u001a\u0002\u0002܂܃\u0005Îh\u0002܃܄\u0007ŏ\u0002\u0002܄܅\u0005Îh\u0002܅Í\u0003\u0002\u0002\u0002܆܈\u0005ľ \u0002܇܉\u0005ŀ¡\u0002܈܇\u0003\u0002\u0002\u0002܈܉\u0003\u0002\u0002\u0002܉\u070f\u0003\u0002\u0002\u0002܊܋\u0007ŝ\u0002\u0002܋܌\u0005Ď\u0088\u0002܌܍\u0007Š\u0002\u0002܍\u070f\u0003\u0002\u0002\u0002\u070e܆\u0003\u0002\u0002\u0002\u070e܊\u0003\u0002\u0002\u0002\u070fܒ\u0003\u0002\u0002\u0002ܐܑ\u0007\u0013\u0002\u0002ܑܓ\u0005ƨÕ\u0002ܒܐ\u0003\u0002\u0002\u0002ܒܓ\u0003\u0002\u0002\u0002ܓÏ\u0003\u0002\u0002\u0002ܔܕ\u00077\u0002\u0002ܕܖ\u0007t\u0002\u0002ܖܗ\u0007u\u0002\u0002ܗܛ\u0005Ű¹\u0002ܘܚ\u0005Þp\u0002ܙܘ\u0003\u0002\u0002\u0002ܚܝ\u0003\u0002\u0002\u0002ܛܙ\u0003\u0002\u0002\u0002ܛܜ\u0003\u0002\u0002\u0002ܜÑ\u0003\u0002\u0002\u0002ܝܛ\u0003\u0002\u0002\u0002ܞܟ\u00077\u0002\u0002ܟܠ\u0007t\u0002\u0002ܠܡ\u0007¤\u0002\u0002ܡܦ\u0005Öl\u0002ܢܣ\u0007ŏ\u0002\u0002ܣܥ\u0005Öl\u0002ܤܢ\u0003\u0002\u0002\u0002ܥܨ\u0003\u0002\u0002\u0002ܦܤ\u0003\u0002\u0002\u0002ܦܧ\u0003\u0002\u0002\u0002ܧܩ\u0003\u0002\u0002\u0002ܨܦ\u0003\u0002\u0002\u0002ܩܪ\u0007Ě\u0002\u0002ܪܮ\u0005Øm\u0002ܫܭ\u0005Üo\u0002ܬܫ\u0003\u0002\u0002\u0002ܭܰ\u0003\u0002\u0002\u0002ܮܬ\u0003\u0002\u0002\u0002ܮܯ\u0003\u0002\u0002\u0002ܯÓ\u0003\u0002\u0002\u0002ܰܮ\u0003\u0002\u0002\u0002ܱܷ\u00077\u0002\u0002ܸܲ\u0005ľ \u0002ܴܳ\u0007ŝ\u0002\u0002ܴܵ\u0005Ď\u0088\u0002ܵܶ\u0007Š\u0002\u0002ܸܶ\u0003\u0002\u0002\u0002ܷܲ\u0003\u0002\u0002\u0002ܷܳ\u0003\u0002\u0002\u0002ܸܹ\u0003\u0002\u0002\u0002ܹܻ\u0007Ě\u0002\u0002ܼܺ\u0007\u0080\u0002\u0002ܻܺ\u0003\u0002\u0002\u0002ܻܼ\u0003\u0002\u0002\u0002ܼܽ\u0003\u0002\u0002\u0002ܽ݁\u0005Øm\u0002ܾ݀\u0005Ún\u0002ܾܿ\u0003\u0002\u0002\u0002݀݃\u0003\u0002\u0002\u0002݁ܿ\u0003\u0002\u0002\u0002݂݁\u0003\u0002\u0002\u0002݂Õ\u0003\u0002\u0002\u0002݃݁\u0003\u0002\u0002\u0002݄݈\u0005ƨÕ\u0002݈݅\u0005Ű¹\u0002݆݈\u0007Ŭ\u0002\u0002݄݇\u0003\u0002\u0002\u0002݇݅\u0003\u0002\u0002\u0002݆݇\u0003\u0002\u0002\u0002݈×\u0003\u0002\u0002\u0002݉\u074c\u0005ƢÒ\u0002݊\u074c\u0005Ű¹\u0002\u074b݉\u0003\u0002\u0002\u0002\u074b݊\u0003\u0002\u0002\u0002\u074cÙ\u0003\u0002\u0002\u0002ݍݎ\u0007\u0013\u0002\u0002ݎݖ\u0005ƨÕ\u0002ݏݐ\u0007\u0016\u0002\u0002ݐݖ\u0005Ű¹\u0002ݑݒ\u0007P\u0002\u0002ݒݖ\u0005Ű¹\u0002ݓݔ\u0007ć\u0002\u0002ݔݖ\u0005ƨÕ\u0002ݕݍ\u0003\u0002\u0002\u0002ݕݏ\u0003\u0002\u0002\u0002ݕݑ\u0003\u0002\u0002\u0002ݕݓ\u0003\u0002\u0002\u0002ݖÛ\u0003\u0002\u0002\u0002ݗݘ\t\u001b\u0002\u0002ݘÝ\u0003\u0002\u0002\u0002ݙݚ\u0007Ō\u0002\u0002ݚݲ\u0005Ű¹\u0002ݛݜ\u0007ó\u0002\u0002ݜݲ\u0005Ű¹\u0002ݝݠ\u0007T\u0002\u0002ݞݡ\u0005ƢÒ\u0002ݟݡ\u0005Ű¹\u0002ݠݞ\u0003\u0002\u0002\u0002ݠݟ\u0003\u0002\u0002\u0002ݡݲ\u0003\u0002\u0002\u0002ݢݣ\u0007n\u0002\u0002ݣݲ\u0005Ű¹\u0002ݤݲ\u0007¸\u0002\u0002ݥݲ\u0007Î\u0002\u0002ݦݲ\u0007č\u0002\u0002ݧݨ\u0007ü\u0002\u0002ݨݲ\u0005Ű¹\u0002ݩݫ\u0007Ě\u0002\u0002ݪݬ\u0007¤\u0002\u0002ݫݪ\u0003\u0002\u0002\u0002ݫݬ\u0003\u0002\u0002\u0002ݬݯ\u0003\u0002\u0002\u0002ݭݰ\u0005ƢÒ\u0002ݮݰ\u0005Ű¹\u0002ݯݭ\u0003\u0002\u0002\u0002ݯݮ\u0003\u0002\u0002\u0002ݰݲ\u0003\u0002\u0002\u0002ݱݙ\u0003\u0002\u0002\u0002ݱݛ\u0003\u0002\u0002\u0002ݱݝ\u0003\u0002\u0002\u0002ݱݢ\u0003\u0002\u0002\u0002ݱݤ\u0003\u0002\u0002\u0002ݱݥ\u0003\u0002\u0002\u0002ݱݦ\u0003\u0002\u0002\u0002ݱݧ\u0003\u0002\u0002\u0002ݱݩ\u0003\u0002\u0002\u0002ݲß\u0003\u0002\u0002\u0002ݳݵ\u00072\u0002\u0002ݴݶ\u0007Ĳ\u0002\u0002ݵݴ\u0003\u0002\u0002\u0002ݵݶ\u0003\u0002\u0002\u0002ݶá\u0003\u0002\u0002\u0002ݷݹ\u0007:\u0002\u0002ݸݺ\u0007ġ\u0002\u0002ݹݸ\u0003\u0002\u0002\u0002ݹݺ\u0003\u0002\u0002\u0002ݺݻ\u0003\u0002\u0002\u0002ݻݼ\u0007\u0089\u0002\u0002ݼݽ\u0005ƨÕ\u0002ݽݾ\u0007Æ\u0002\u0002ݾݿ\u0005ľ \u0002ݿހ\u0007ŝ\u0002\u0002ހޅ\u0005äs\u0002ށނ\u0007ŏ\u0002\u0002ނބ\u0005äs\u0002ރށ\u0003\u0002\u0002\u0002ބއ\u0003\u0002\u0002\u0002ޅރ\u0003\u0002\u0002\u0002ޅކ\u0003\u0002\u0002\u0002ކވ\u0003\u0002\u0002\u0002އޅ\u0003\u0002\u0002\u0002ވމ\u0007Š\u0002\u0002މã\u0003\u0002\u0002\u0002ފތ\u0005ƨÕ\u0002ދލ\t\t\u0002\u0002ތދ\u0003\u0002\u0002\u0002ތލ\u0003\u0002\u0002\u0002ލå\u0003\u0002\u0002\u0002ގޏ\u0005èu\u0002ޏç\u0003\u0002\u0002\u0002ސޑ\u0007İ\u0002\u0002ޑޒ\u0007ŝ\u0002\u0002ޒޓ\u0005ƨÕ\u0002ޓޔ\u0007œ\u0002\u0002ޔޜ\u0005ƨÕ\u0002ޕޖ\u0007ŏ\u0002\u0002ޖޗ\u0005ƨÕ\u0002ޗޘ\u0007œ\u0002\u0002ޘޙ\u0005ƨÕ\u0002ޙޛ\u0003\u0002\u0002\u0002ޚޕ\u0003\u0002\u0002\u0002ޛޞ\u0003\u0002\u0002\u0002ޜޚ\u0003\u0002\u0002\u0002ޜޝ\u0003\u0002\u0002\u0002ޝޟ\u0003\u0002\u0002\u0002ޞޜ\u0003\u0002\u0002\u0002ޟޣ\u0007Š\u0002\u0002ޠޢ\u0005f4\u0002ޡޠ\u0003\u0002\u0002\u0002ޢޥ\u0003\u0002\u0002\u0002ޣޡ\u0003\u0002\u0002\u0002ޣޤ\u0003\u0002\u0002\u0002ޤé\u0003\u0002\u0002\u0002ޥޣ\u0003\u0002\u0002\u0002ަާ\u0007Ø\u0002\u0002ާޮ\u0005Ű¹\u0002ިީ\u0007Ø\u0002\u0002ީު\u0007ŝ\u0002\u0002ުޫ\u0005Ű¹\u0002ޫެ\u0007Š\u0002\u0002ެޮ\u0003\u0002\u0002\u0002ޭަ\u0003\u0002\u0002\u0002ޭި\u0003\u0002\u0002\u0002ޮë\u0003\u0002\u0002\u0002ޯް\u0007Ý\u0002\u0002ްí\u0003\u0002\u0002\u0002ޱ\u07bd\u0007â\u0002\u0002\u07b2\u07b4\u0007Ĉ\u0002\u0002\u07b3\u07b5\u0007Ħ\u0002\u0002\u07b4\u07b3\u0003\u0002\u0002\u0002\u07b4\u07b5\u0003\u0002\u0002\u0002\u07b5\u07b6\u0003\u0002\u0002\u0002\u07b6\u07bb\u0005Ű¹\u0002\u07b7\u07b8\u0007ú\u0002\u0002\u07b8\u07b9\u0007²\u0002\u0002\u07b9\u07ba\u0007œ\u0002\u0002\u07ba\u07bc\u0005Ű¹\u0002\u07bb\u07b7\u0003\u0002\u0002\u0002\u07bb\u07bc\u0003\u0002\u0002\u0002\u07bc\u07be\u0003\u0002\u0002\u0002\u07bd\u07b2\u0003\u0002\u0002\u0002\u07bd\u07be\u0003\u0002\u0002\u0002\u07beï\u0003\u0002\u0002\u0002\u07bf߁\u0007æ\u0002\u0002߀߂\u0005Ű¹\u0002߁߀\u0003\u0002\u0002\u0002߁߂\u0003\u0002\u0002\u0002߂ñ\u0003\u0002\u0002\u0002߃߅\u0007ì\u0002\u0002߄߆\u0007Ĳ\u0002\u0002߅߄\u0003\u0002\u0002\u0002߅߆\u0003\u0002\u0002\u0002߆ó\u0003\u0002\u0002\u0002߇ߋ\u0005ö|\u0002߈ߋ\u0005ø}\u0002߉ߋ\u0005ú~\u0002ߊ߇\u0003\u0002\u0002\u0002ߊ߈\u0003\u0002\u0002\u0002ߊ߉\u0003\u0002\u0002\u0002ߋõ\u0003\u0002\u0002\u0002ߌߎ\u0007>\u0002\u0002ߍߌ\u0003\u0002\u0002\u0002ߍߎ\u0003\u0002\u0002\u0002ߎߏ\u0003\u0002\u0002\u0002ߏߒ\u0007õ\u0002\u0002ߐߒ\u0007?\u0002\u0002ߑߍ\u0003\u0002\u0002\u0002ߑߐ\u0003\u0002\u0002\u0002ߒߔ\u0003\u0002\u0002\u0002ߓߕ\u0007œ\u0002\u0002ߔߓ\u0003\u0002\u0002\u0002ߔߕ\u0003\u0002\u0002\u0002ߕߖ\u0003\u0002\u0002\u0002ߖߗ\u0005Ű¹\u0002ߗ÷\u0003\u0002\u0002\u0002ߘߙ\t\u001c\u0002\u0002ߙߚ\t\u001d\u0002\u0002ߚù\u0003\u0002\u0002\u0002ߛߜ\u0007Û\u0002\u0002ߜߟ\u0007œ\u0002\u0002ߝߠ\u0005Ű¹\u0002ߞߠ\u0007¾\u0002\u0002ߟߝ\u0003\u0002\u0002\u0002ߟߞ\u0003\u0002\u0002\u0002ߠߢ\u0003\u0002\u0002\u0002ߡߣ\u0007Ģ\u0002\u0002ߢߡ\u0003\u0002\u0002\u0002ߢߣ\u0003\u0002\u0002\u0002ߣߤ\u0003\u0002\u0002\u0002ߤߥ\u0007p\u0002\u0002ߥߦ\t\u001e\u0002\u0002ߦû\u0003\u0002\u0002\u0002ߧߨ\u0007ÿ\u0002\u0002ߨߩ\u0005ƨÕ\u0002ߩý\u0003\u0002\u0002\u0002ߪ߬\u0007Ğ\u0002\u0002߫߭\u0007đ\u0002\u0002߬߫\u0003\u0002\u0002\u0002߬߭\u0003\u0002\u0002\u0002߭߮\u0003\u0002\u0002\u0002߮߯\u0005ľ \u0002߯ÿ\u0003\u0002\u0002\u0002߰߱\u0007Ĥ\u0002\u0002߲߱\u0005Ű¹\u0002߲ā\u0003\u0002\u0002\u0002߳ߵ\u0007ħ\u0002\u0002ߴ߶\u0007ŝ\u0002\u0002ߵߴ\u0003\u0002\u0002\u0002ߵ߶\u0003\u0002\u0002\u0002߶߷\u0003\u0002\u0002\u0002߷\u07fc\u0005Ű¹\u0002߸߹\u0007ŏ\u0002\u0002߹\u07fb\u0005Ű¹\u0002ߺ߸\u0003\u0002\u0002\u0002\u07fb\u07fe\u0003\u0002\u0002\u0002\u07fcߺ\u0003\u0002\u0002\u0002\u07fc\u07fd\u0003\u0002\u0002\u0002\u07fdࠀ\u0003\u0002\u0002\u0002\u07fe\u07fc\u0003\u0002\u0002\u0002\u07ffࠁ\u0007Š\u0002\u0002ࠀ\u07ff\u0003\u0002\u0002\u0002ࠀࠁ\u0003\u0002\u0002\u0002ࠁࠂ\u0003\u0002\u0002\u0002ࠂࠄ\u0007\u0095\u0002\u0002ࠃࠅ\u0007ŝ\u0002\u0002ࠄࠃ\u0003\u0002\u0002\u0002ࠄࠅ\u0003\u0002\u0002\u0002ࠅࠆ\u0003\u0002\u0002\u0002ࠆࠋ\u0005ƨÕ\u0002ࠇࠈ\u0007ŏ\u0002\u0002ࠈࠊ\u0005ƨÕ\u0002ࠉࠇ\u0003\u0002\u0002\u0002ࠊࠍ\u0003\u0002\u0002\u0002ࠋࠉ\u0003\u0002\u0002\u0002ࠋࠌ\u0003\u0002\u0002\u0002ࠌࠏ\u0003\u0002\u0002\u0002ࠍࠋ\u0003\u0002\u0002\u0002ࠎࠐ\u0007Š\u0002\u0002ࠏࠎ\u0003\u0002\u0002\u0002ࠏࠐ\u0003\u0002\u0002\u0002ࠐă\u0003\u0002\u0002\u0002ࠑࠒ\u0007į\u0002\u0002ࠒࠓ\u0005Š±\u0002ࠓࠔ\t\u001f\u0002\u0002ࠔࠕ\u0005\u0004\u0003\u0002ࠕࠗ\u0007`\u0002\u0002ࠖ࠘\t \u0002\u0002ࠗࠖ\u0003\u0002\u0002\u0002ࠗ࠘\u0003\u0002\u0002\u0002࠘ą\u0003\u0002\u0002\u0002࠙ࠚ\u0007p\u0002\u0002ࠚࠛ\u0007Ť\u0002\u0002ࠛࠝ\u0007\u0087\u0002\u0002ࠜࠞ\u0007ŝ\u0002\u0002ࠝࠜ\u0003\u0002\u0002\u0002ࠝࠞ\u0003\u0002\u0002\u0002ࠞࠟ\u0003\u0002\u0002\u0002ࠟࠡ\u0005Ď\u0088\u0002ࠠࠢ\u0007Š\u0002\u0002ࠡࠠ\u0003\u0002\u0002\u0002ࠡࠢ\u0003\u0002\u0002\u0002ࠢࠣ\u0003\u0002\u0002\u0002ࠣࠤ\u0007¬\u0002\u0002ࠤࠥ\u0005\u0004\u0003\u0002ࠥࠦ\u0007`\u0002\u0002ࠦࠧ\u0007¬\u0002\u0002ࠧć\u0003\u0002\u0002\u0002ࠨࠩ\u0007p\u0002\u0002ࠩࠪ\u0007Ť\u0002\u0002ࠪࠬ\u0007\u0087\u0002\u0002ࠫ࠭\u0007è\u0002\u0002ࠬࠫ\u0003\u0002\u0002\u0002ࠬ࠭\u0003\u0002\u0002\u0002࠭\u082e\u0003\u0002\u0002\u0002\u082e\u082f\u0005Ű¹\u0002\u082f࠰\u0007Œ\u0002\u0002࠰࠳\u0005Ű¹\u0002࠱࠲\t!\u0002\u0002࠲࠴\u0005Ű¹\u0002࠳࠱\u0003\u0002\u0002\u0002࠳࠴\u0003\u0002\u0002\u0002࠴࠵\u0003\u0002\u0002\u0002࠵࠶\u0007¬\u0002\u0002࠶࠷\u0005\u0004\u0003\u0002࠷࠸\u0007`\u0002\u0002࠸࠹\u0007¬\u0002\u0002࠹ĉ\u0003\u0002\u0002\u0002࠺ࡁ\u0007ŭ\u0002\u0002࠻࠼\u0007ř\u0002\u0002࠼࠽\u0007ř\u0002\u0002࠽࠾\u0007Ť\u0002\u0002࠾\u083f\u0007ŗ\u0002\u0002\u083fࡁ\u0007ŗ\u0002\u0002ࡀ࠺\u0003\u0002\u0002\u0002ࡀ࠻\u0003\u0002\u0002\u0002ࡁċ\u0003\u0002\u0002\u0002ࡂࡃ\u0007ĥ\u0002\u0002ࡃࡈ\u0005Ű¹\u0002ࡄࡅ\u0007ŏ\u0002\u0002ࡅࡇ\u0005Ű¹\u0002ࡆࡄ\u0003\u0002\u0002\u0002ࡇࡊ\u0003\u0002\u0002\u0002ࡈࡆ\u0003\u0002\u0002\u0002ࡈࡉ\u0003\u0002\u0002\u0002ࡉč\u0003\u0002\u0002\u0002ࡊࡈ\u0003\u0002\u0002\u0002ࡋࡍ\u0005Đ\u0089\u0002ࡌࡋ\u0003\u0002\u0002\u0002ࡌࡍ\u0003\u0002\u0002\u0002ࡍࡎ\u0003\u0002\u0002\u0002ࡎࡏ\u0005Ė\u008c\u0002ࡏď\u0003\u0002\u0002\u0002ࡐࡑ\u0007İ\u0002\u0002ࡑࡖ\u0005Ē\u008a\u0002ࡒࡓ\u0007ŏ\u0002\u0002ࡓࡕ\u0005Ē\u008a\u0002ࡔࡒ\u0003\u0002\u0002\u0002ࡕࡘ\u0003\u0002\u0002\u0002ࡖࡔ\u0003\u0002\u0002\u0002ࡖࡗ\u0003\u0002\u0002\u0002ࡗđ\u0003\u0002\u0002\u0002ࡘࡖ\u0003\u0002\u0002\u0002࡙࡛\u0005ƨÕ\u0002࡚\u085c\u0005Ĕ\u008b\u0002࡛࡚\u0003\u0002\u0002\u0002࡛\u085c\u0003\u0002\u0002\u0002\u085c\u085d\u0003\u0002\u0002\u0002\u085d࡞\u0007\u0010\u0002\u0002࡞\u085f\u0007ŝ\u0002\u0002\u085f\u0860\u0005Ė\u008c\u0002\u0860\u0861\u0007Š\u0002\u0002\u0861ē\u0003\u0002\u0002\u0002\u0862\u0863\u0007ŝ\u0002\u0002\u0863\u0868\u0005ƨÕ\u0002\u0864\u0865\u0007ŏ\u0002\u0002\u0865\u0867\u0005ƨÕ\u0002\u0866\u0864\u0003\u0002\u0002\u0002\u0867\u086a\u0003\u0002\u0002\u0002\u0868\u0866\u0003\u0002\u0002\u0002\u0868\u0869\u0003\u0002\u0002\u0002\u0869\u086b\u0003\u0002\u0002\u0002\u086a\u0868\u0003\u0002\u0002\u0002\u086b\u086c\u0007Š\u0002\u0002\u086cĕ\u0003\u0002\u0002\u0002\u086d\u0873\u0005Ę\u008d\u0002\u086e\u086f\u0005Ě\u008e\u0002\u086f\u0870\u0005Ę\u008d\u0002\u0870\u0872\u0003\u0002\u0002\u0002\u0871\u086e\u0003\u0002\u0002\u0002\u0872\u0875\u0003\u0002\u0002\u0002\u0873\u0871\u0003\u0002\u0002\u0002\u0873\u0874\u0003\u0002\u0002\u0002\u0874ė\u0003\u0002\u0002\u0002\u0875\u0873\u0003\u0002\u0002\u0002\u0876\u087c\u0005Ĝ\u008f\u0002\u0877\u0878\u0007ŝ\u0002\u0002\u0878\u0879\u0005Ė\u008c\u0002\u0879\u087a\u0007Š\u0002\u0002\u087a\u087c\u0003\u0002\u0002\u0002\u087b\u0876\u0003\u0002\u0002\u0002\u087b\u0877\u0003\u0002\u0002\u0002\u087cę\u0003\u0002\u0002\u0002\u087d\u087f\u0007Ġ\u0002\u0002\u087e\u0880\u0007\n\u0002\u0002\u087f\u087e\u0003\u0002\u0002\u0002\u087f\u0880\u0003\u0002\u0002\u0002\u0880\u088a\u0003\u0002\u0002\u0002\u0881\u0883\u0007c\u0002\u0002\u0882\u0884\u0007\n\u0002\u0002\u0883\u0882\u0003\u0002\u0002\u0002\u0883\u0884\u0003\u0002\u0002\u0002\u0884\u088a\u0003\u0002\u0002\u0002\u0885\u0887\u0007\u0093\u0002\u0002\u0886\u0888\u0007\n\u0002\u0002\u0887\u0886\u0003\u0002\u0002\u0002\u0887\u0888\u0003\u0002\u0002\u0002\u0888\u088a\u0003\u0002\u0002\u0002\u0889\u087d\u0003\u0002\u0002\u0002\u0889\u0881\u0003\u0002\u0002\u0002\u0889\u0885\u0003\u0002\u0002\u0002\u088aě\u0003\u0002\u0002\u0002\u088b\u088c\t\"\u0002\u0002\u088c\u088e\u0005Ğ\u0090\u0002\u088d\u088f\u0005Ī\u0096\u0002\u088e\u088d\u0003\u0002\u0002\u0002\u088e\u088f\u0003\u0002\u0002\u0002\u088f\u0891\u0003\u0002\u0002\u0002\u0890\u0892\u0005Ĭ\u0097\u0002\u0891\u0890\u0003\u0002";
	private static final String _serializedATNSegment1 = "\u0002\u0002\u0891\u0892\u0003\u0002\u0002\u0002\u0892\u0894\u0003\u0002\u0002\u0002\u0893\u0895\u0005ŀ¡\u0002\u0894\u0893\u0003\u0002\u0002\u0002\u0894\u0895\u0003\u0002\u0002\u0002\u0895\u0897\u0003\u0002\u0002\u0002\u0896\u0898\u0005ł¢\u0002\u0897\u0896\u0003\u0002\u0002\u0002\u0897\u0898\u0003\u0002\u0002\u0002\u0898\u089a\u0003\u0002\u0002\u0002\u0899\u089b\u0005ń£\u0002\u089a\u0899\u0003\u0002\u0002\u0002\u089a\u089b\u0003\u0002\u0002\u0002\u089b\u089d\u0003\u0002\u0002\u0002\u089c\u089e\u0005ņ¤\u0002\u089d\u089c\u0003\u0002\u0002\u0002\u089d\u089e\u0003\u0002\u0002\u0002\u089eࢠ\u0003\u0002\u0002\u0002\u089f\u08a1\u0005ň¥\u0002ࢠ\u089f\u0003\u0002\u0002\u0002ࢠ\u08a1\u0003\u0002\u0002\u0002\u08a1ĝ\u0003\u0002\u0002\u0002ࢢࢤ\u0005Ġ\u0091\u0002ࢣࢢ\u0003\u0002\u0002\u0002ࢣࢤ\u0003\u0002\u0002\u0002ࢤࢦ\u0003\u0002\u0002\u0002ࢥࢧ\u0005Ģ\u0092\u0002ࢦࢥ\u0003\u0002\u0002\u0002ࢦࢧ\u0003\u0002\u0002\u0002ࢧࢨ\u0003\u0002\u0002\u0002ࢨ\u08ad\u0005Ĥ\u0093\u0002ࢩࢪ\u0007ŏ\u0002\u0002ࢪࢬ\u0005Ĥ\u0093\u0002ࢫࢩ\u0003\u0002\u0002\u0002ࢬ\u08af\u0003\u0002\u0002\u0002\u08adࢫ\u0003\u0002\u0002\u0002\u08ad\u08ae\u0003\u0002\u0002\u0002\u08aeğ\u0003\u0002\u0002\u0002\u08af\u08ad\u0003\u0002\u0002\u0002\u08b0\u08b1\t#\u0002\u0002\u08b1ġ\u0003\u0002\u0002\u0002\u08b2\u08b3\u0007ě\u0002\u0002\u08b3\u08b4\u0005Ű¹\u0002\u08b4ģ\u0003\u0002\u0002\u0002\u08b5\u08b6\u0005ƨÕ\u0002\u08b6\u08b7\u0007œ\u0002\u0002\u08b7\u08b9\u0003\u0002\u0002\u0002\u08b8\u08b5\u0003\u0002\u0002\u0002\u08b8\u08b9\u0003\u0002\u0002\u0002\u08b9\u08ba\u0003\u0002\u0002\u0002\u08ba\u08bc\u0005Ű¹\u0002\u08bb\u08bd\u0005Ħ\u0094\u0002\u08bc\u08bb\u0003\u0002\u0002\u0002\u08bc\u08bd\u0003\u0002\u0002\u0002\u08bd\u08c0\u0003\u0002\u0002\u0002\u08be\u08c0\u0005Ĩ\u0095\u0002\u08bf\u08b8\u0003\u0002\u0002\u0002\u08bf\u08be\u0003\u0002\u0002\u0002\u08c0ĥ\u0003\u0002\u0002\u0002\u08c1\u08c3\u0006\u0094\u0005\u0002\u08c2\u08c4\u0007\u0010\u0002\u0002\u08c3\u08c2\u0003\u0002\u0002\u0002\u08c3\u08c4\u0003\u0002\u0002\u0002\u08c4\u08c5\u0003\u0002\u0002\u0002\u08c5\u08cb\u0005ƨÕ\u0002\u08c6\u08c7\u0007ŝ\u0002\u0002\u08c7\u08c8\u0007ę\u0002\u0002\u08c8\u08c9\u0007ť\u0002\u0002\u08c9\u08cb\u0007Š\u0002\u0002\u08ca\u08c1\u0003\u0002\u0002\u0002\u08ca\u08c6\u0003\u0002\u0002\u0002\u08cbħ\u0003\u0002\u0002\u0002\u08cc\u08cd\u0007Ť\u0002\u0002\u08cd\u08cf\u0007\u0006\u0002\u0002\u08ce\u08cc\u0003\u0002\u0002\u0002\u08ce\u08cf\u0003\u0002\u0002\u0002\u08cf\u08d0\u0003\u0002\u0002\u0002\u08d0\u08d1\u0007ś\u0002\u0002\u08d1ĩ\u0003\u0002\u0002\u0002\u08d2\u08d3\u0007\u0095\u0002\u0002\u08d3\u08d8\u0005ƨÕ\u0002\u08d4\u08d5\u0007ŏ\u0002\u0002\u08d5\u08d7\u0005ƨÕ\u0002\u08d6\u08d4\u0003\u0002\u0002\u0002\u08d7\u08da\u0003\u0002\u0002\u0002\u08d8\u08d6\u0003\u0002\u0002\u0002\u08d8\u08d9\u0003\u0002\u0002\u0002\u08d9ī\u0003\u0002\u0002\u0002\u08da\u08d8\u0003\u0002\u0002\u0002\u08db\u08dc\u0007t\u0002\u0002\u08dc\u08e0\u0005Į\u0098\u0002\u08dd\u08df\u0005Ĵ\u009b\u0002\u08de\u08dd\u0003\u0002\u0002\u0002\u08df\u08e2\u0003\u0002\u0002\u0002\u08e0\u08de\u0003\u0002\u0002\u0002\u08e0\u08e1\u0003\u0002\u0002\u0002\u08e1ĭ\u0003\u0002\u0002\u0002\u08e2\u08e0\u0003\u0002\u0002\u0002\u08e3ࣧ\u0005İ\u0099\u0002ࣤࣧ\u0005Ĳ\u009a\u0002ࣥࣧ\u0005ĸ\u009d\u0002ࣦ\u08e3\u0003\u0002\u0002\u0002ࣦࣤ\u0003\u0002\u0002\u0002ࣦࣥ\u0003\u0002\u0002\u0002ࣧį\u0003\u0002\u0002\u0002ࣨ࣪\u0005ľ \u0002ࣩ࣫\u0005ļ\u009f\u0002ࣩ࣪\u0003\u0002\u0002\u0002࣪࣫\u0003\u0002\u0002\u0002࣫ı\u0003\u0002\u0002\u0002࣭࣬\u0007ŝ\u0002\u0002࣭࣮\u0005Ď\u0088\u0002ࣰ࣮\u0007Š\u0002\u0002ࣱ࣯\u0005ļ\u009f\u0002ࣰ࣯\u0003\u0002\u0002\u0002ࣰࣱ\u0003\u0002\u0002\u0002ࣱĳ\u0003\u0002\u0002\u0002ࣲࣳ\u0007ŏ\u0002\u0002ࣺࣳ\u0005Į\u0098\u0002ࣴࣵ\u0005Ķ\u009c\u0002ࣶࣵ\u0005Į\u0098\u0002ࣶࣷ\u0007Æ\u0002\u0002ࣷࣸ\u0005Š±\u0002ࣺࣸ\u0003\u0002\u0002\u0002ࣲࣹ\u0003\u0002\u0002\u0002ࣹࣴ\u0003\u0002\u0002\u0002ࣺĵ\u0003\u0002\u0002\u0002ࣻࣽ\u0007\u008b\u0002\u0002ࣼࣻ\u0003\u0002\u0002\u0002ࣼࣽ\u0003\u0002\u0002\u0002ࣽࣾ\u0003\u0002\u0002\u0002ࣾअ\u0007\u009a\u0002\u0002\u08ffँ\t$\u0002\u0002ऀं\u0007Ì\u0002\u0002ँऀ\u0003\u0002\u0002\u0002ँं\u0003\u0002\u0002\u0002ंः\u0003\u0002\u0002\u0002ःअ\u0007\u009a\u0002\u0002ऄࣼ\u0003\u0002\u0002\u0002ऄ\u08ff\u0003\u0002\u0002\u0002अķ\u0003\u0002\u0002\u0002आइ\u0007đ\u0002\u0002इई\u0007ŝ\u0002\u0002ईउ\u0007ħ\u0002\u0002उऎ\u0005ĺ\u009e\u0002ऊऋ\u0007ŏ\u0002\u0002ऋऍ\u0005ĺ\u009e\u0002ऌऊ\u0003\u0002\u0002\u0002ऍऐ\u0003\u0002\u0002\u0002ऎऌ\u0003\u0002\u0002\u0002ऎए\u0003\u0002\u0002\u0002एऑ\u0003\u0002\u0002\u0002ऐऎ\u0003\u0002\u0002\u0002ऑओ\u0007Š\u0002\u0002ऒऔ\u0005ļ\u009f\u0002ओऒ\u0003\u0002\u0002\u0002ओऔ\u0003\u0002\u0002\u0002औĹ\u0003\u0002\u0002\u0002कढ\u0005Ű¹\u0002खग\u0007ŝ\u0002\u0002गज\u0005Ű¹\u0002घङ\u0007ŏ\u0002\u0002ङछ\u0005Ű¹\u0002चघ\u0003\u0002\u0002\u0002छञ\u0003\u0002\u0002\u0002जच\u0003\u0002\u0002\u0002जझ\u0003\u0002\u0002\u0002झट\u0003\u0002\u0002\u0002ञज\u0003\u0002\u0002\u0002टठ\u0007Š\u0002\u0002ठढ\u0003\u0002\u0002\u0002डक\u0003\u0002\u0002\u0002डख\u0003\u0002\u0002\u0002ढĻ\u0003\u0002\u0002\u0002णथ\u0006\u009f\u0006\u0002तद\u0007\u0010\u0002\u0002थत\u0003\u0002\u0002\u0002थद\u0003\u0002\u0002\u0002दध\u0003\u0002\u0002\u0002धल\u0005ƨÕ\u0002नऩ\u0007ŝ\u0002\u0002ऩम\u0007Ť\u0002\u0002पफ\u0007ŏ\u0002\u0002फभ\u0007Ť\u0002\u0002बप\u0003\u0002\u0002\u0002भर\u0003\u0002\u0002\u0002मब\u0003\u0002\u0002\u0002मय\u0003\u0002\u0002\u0002यऱ\u0003\u0002\u0002\u0002रम\u0003\u0002\u0002\u0002ऱळ\u0007Š\u0002\u0002लन\u0003\u0002\u0002\u0002लळ\u0003\u0002\u0002\u0002ळĽ\u0003\u0002\u0002\u0002ऴव\u0005ƨÕ\u0002वĿ\u0003\u0002\u0002\u0002शष\u0007Į\u0002\u0002षस\u0005Š±\u0002सŁ\u0003\u0002\u0002\u0002हऺ\u0007|\u0002\u0002ऺऻ\u0007 \u0002\u0002ऻी\u0005Ű¹\u0002़ऽ\u0007ŏ\u0002\u0002ऽि\u0005Ű¹\u0002ा़\u0003\u0002\u0002\u0002िू\u0003\u0002\u0002\u0002ीा\u0003\u0002\u0002\u0002ीु\u0003\u0002\u0002\u0002ुŃ\u0003\u0002\u0002\u0002ूी\u0003\u0002\u0002\u0002ृॄ\u0007\u007f\u0002\u0002ॄॅ\u0005Š±\u0002ॅŅ\u0003\u0002\u0002\u0002ॆे\u0007Ê\u0002\u0002ेै\u0007 \u0002\u0002ैॊ\u0005Ű¹\u0002ॉो\t\t\u0002\u0002ॊॉ\u0003\u0002\u0002\u0002ॊो\u0003\u0002\u0002\u0002ो॓\u0003\u0002\u0002\u0002ौ्\u0007ŏ\u0002\u0002्ॏ\u0005Ű¹\u0002ॎॐ\t\t\u0002\u0002ॏॎ\u0003\u0002\u0002\u0002ॏॐ\u0003\u0002\u0002\u0002ॐ॒\u0003\u0002\u0002\u0002॑ौ\u0003\u0002\u0002\u0002॒ॕ\u0003\u0002\u0002\u0002॓॑\u0003\u0002\u0002\u0002॓॔\u0003\u0002\u0002\u0002॔Ň\u0003\u0002\u0002\u0002ॕ॓\u0003\u0002\u0002\u0002ॖक़\u0005Ŋ¦\u0002ॗॖ\u0003\u0002\u0002\u0002क़ख़\u0003\u0002\u0002\u0002ख़ॗ\u0003\u0002\u0002\u0002ख़ग़\u0003\u0002\u0002\u0002ग़ŉ\u0003\u0002\u0002\u0002ज़ड़\u0007¢\u0002\u0002ड़१\u0005Ű¹\u0002ढ़फ़\u0007İ\u0002\u0002फ़।\t%\u0002\u0002य़ॠ\u0007Ĥ\u0002\u0002ॠॡ\u0007\r\u0002\u0002ॡॢ\u0007\u009b\u0002\u0002ॢॣ\t&\u0002\u0002ॣ॥\u0007¨\u0002\u0002।य़\u0003\u0002\u0002\u0002।॥\u0003\u0002\u0002\u0002॥१\u0003\u0002\u0002\u0002०ज़\u0003\u0002\u0002\u0002०ढ़\u0003\u0002\u0002\u0002१ŋ\u0003\u0002\u0002\u0002२३\u0007Ģ\u0002\u0002३४\u0005Ő©\u0002४५\u0007ú\u0002\u0002५७\u0005Ŏ¨\u0002६८\u0005ŀ¡\u0002७६\u0003\u0002\u0002\u0002७८\u0003\u0002\u0002\u0002८॰\u0003\u0002\u0002\u0002९ॱ\u0005Œª\u0002॰९\u0003\u0002\u0002\u0002॰ॱ\u0003\u0002\u0002\u0002ॱō\u0003\u0002\u0002\u0002ॲॷ\u0005\u001c\u000f\u0002ॳॴ\u0007ŏ\u0002\u0002ॴॶ\u0005\u001c\u000f\u0002ॵॳ\u0003\u0002\u0002\u0002ॶॹ\u0003\u0002\u0002\u0002ॷॵ\u0003\u0002\u0002\u0002ॷ\u0978\u0003\u0002\u0002\u0002\u0978ŏ\u0003\u0002\u0002\u0002ॹॷ\u0003\u0002\u0002\u0002ॺ\u0980\u0005ľ \u0002ॻॼ\u0007ŝ\u0002\u0002ॼॽ\u0005Ď\u0088\u0002ॽॾ\u0007Š\u0002\u0002ॾ\u0980\u0003\u0002\u0002\u0002ॿॺ\u0003\u0002\u0002\u0002ॿॻ\u0003\u0002\u0002\u0002\u0980অ\u0003\u0002\u0002\u0002ঁঃ\u0007\u0010\u0002\u0002ংঁ\u0003\u0002\u0002\u0002ংঃ\u0003\u0002\u0002\u0002ঃ\u0984\u0003\u0002\u0002\u0002\u0984আ\u0005ƨÕ\u0002অং\u0003\u0002\u0002\u0002অআ\u0003\u0002\u0002\u0002আő\u0003\u0002\u0002\u0002ইঈ\u0007\\\u0002\u0002ঈউ\u0005ªV\u0002উœ\u0003\u0002\u0002\u0002ঊঋ\u0007±\u0002\u0002ঋঌ\u0007\u0095\u0002\u0002ঌ\u098d\u0005Ŗ¬\u0002\u098d\u098e\u0007ĥ\u0002\u0002\u098eএ\u0005Ŗ¬\u0002এঐ\u0007Æ\u0002\u0002ঐ\u0992\u0005Š±\u0002\u0991ও\u0005Ř\u00ad\u0002\u0992\u0991\u0003\u0002\u0002\u0002ওঔ\u0003\u0002\u0002\u0002ঔ\u0992\u0003\u0002\u0002\u0002ঔক\u0003\u0002\u0002\u0002কŕ\u0003\u0002\u0002\u0002খজ\u0005ľ \u0002গঘ\u0007ŝ\u0002\u0002ঘঙ\u0005Ď\u0088\u0002ঙচ\u0007Š\u0002\u0002চজ\u0003\u0002\u0002\u0002ছখ\u0003\u0002\u0002\u0002ছগ\u0003\u0002\u0002\u0002জড\u0003\u0002\u0002\u0002ঝট\u0007\u0010\u0002\u0002ঞঝ\u0003\u0002\u0002\u0002ঞট\u0003\u0002\u0002\u0002টঠ\u0003\u0002\u0002\u0002ঠঢ\u0005ƨÕ\u0002ডঞ\u0003\u0002\u0002\u0002ডঢ\u0003\u0002\u0002\u0002ঢŗ\u0003\u0002\u0002\u0002ণথ\u0007ĭ\u0002\u0002তদ\u0007¿\u0002\u0002থত\u0003\u0002\u0002\u0002থদ\u0003\u0002\u0002\u0002দধ\u0003\u0002\u0002\u0002ধপ\u0007®\u0002\u0002ন\u09a9\u0007\r\u0002\u0002\u09a9ফ\u0005Š±\u0002পন\u0003\u0002\u0002\u0002পফ\u0003\u0002\u0002\u0002ফব\u0003\u0002\u0002\u0002বভ\u0007Ė\u0002\u0002ভ\u09b1\u0005Ś®\u0002ময\u0007\\\u0002\u0002য\u09b1\u0007\u0085\u0002\u0002রণ\u0003\u0002\u0002\u0002রম\u0003\u0002\u0002\u0002\u09b1ř\u0003\u0002\u0002\u0002ল\u09b4\u0007\u008d\u0002\u0002\u09b3\u09b5\u0005¬W\u0002\u09b4\u09b3\u0003\u0002\u0002\u0002\u09b4\u09b5\u0003\u0002\u0002\u0002\u09b5শ\u0003\u0002\u0002\u0002শষ\u0007ħ\u0002\u0002ষে\u0005°Y\u0002সহ\u0007Ģ\u0002\u0002হ\u09ba\u0007ú\u0002\u0002\u09baি\u0005\u001c\u000f\u0002\u09bb়\u0007ŏ\u0002\u0002়া\u0005\u001c\u000f\u0002ঽ\u09bb\u0003\u0002\u0002\u0002াু\u0003\u0002\u0002\u0002িঽ\u0003\u0002\u0002\u0002িী\u0003\u0002\u0002\u0002ীৃ\u0003\u0002\u0002\u0002ুি\u0003\u0002\u0002\u0002ূৄ\u0005ŀ¡\u0002ৃূ\u0003\u0002\u0002\u0002ৃৄ\u0003\u0002\u0002\u0002ৄে\u0003\u0002\u0002\u0002\u09c5ে\u0007N\u0002\u0002\u09c6ল\u0003\u0002\u0002\u0002\u09c6স\u0003\u0002\u0002\u0002\u09c6\u09c5\u0003\u0002\u0002\u0002েś\u0003\u0002\u0002\u0002ৈ\u09ca\u0007N\u0002\u0002\u09c9ো\u0007t\u0002\u0002\u09ca\u09c9\u0003\u0002\u0002\u0002\u09caো\u0003\u0002\u0002\u0002োৌ\u0003\u0002\u0002\u0002ৌ\u09d1\u0005ľ \u0002্\u09cf\u0007\u0010\u0002\u0002ৎ্\u0003\u0002\u0002\u0002ৎ\u09cf\u0003\u0002\u0002\u0002\u09cf\u09d0\u0003\u0002\u0002\u0002\u09d0\u09d2\u0005ƨÕ\u0002\u09d1ৎ\u0003\u0002\u0002\u0002\u09d1\u09d2\u0003\u0002\u0002\u0002\u09d2\u09d4\u0003\u0002\u0002\u0002\u09d3\u09d5\u0005ŀ¡\u0002\u09d4\u09d3\u0003\u0002\u0002\u0002\u09d4\u09d5\u0003\u0002\u0002\u0002\u09d5ŝ\u0003\u0002\u0002\u0002\u09d6\u09d8\t'\u0002\u0002ৗ\u09d9\u0007đ\u0002\u0002\u09d8ৗ\u0003\u0002\u0002\u0002\u09d8\u09d9\u0003\u0002\u0002\u0002\u09d9\u09da\u0003\u0002\u0002\u0002\u09da\u09db\u0005ľ \u0002\u09dbş\u0003\u0002\u0002\u0002ড়\u09de\b±\u0001\u0002ঢ়য়\u0007¿\u0002\u0002\u09deঢ়\u0003\u0002\u0002\u0002\u09deয়\u0003\u0002\u0002\u0002য়ৠ\u0003\u0002\u0002\u0002ৠৡ\u0007ŝ\u0002\u0002ৡৢ\u0005Š±\u0002ৢৣ\u0007Š\u0002\u0002ৣ০\u0003\u0002\u0002\u0002\u09e4০\u0005Ţ²\u0002\u09e5ড়\u0003\u0002\u0002\u0002\u09e5\u09e4\u0003\u0002\u0002\u0002০৭\u0003\u0002\u0002\u0002১২\f\u0004\u0002\u0002২৩\u0005Ŭ·\u0002৩৪\u0005Š±\u0005৪৬\u0003\u0002\u0002\u0002৫১\u0003\u0002\u0002\u0002৬৯\u0003\u0002\u0002\u0002৭৫\u0003\u0002\u0002\u0002৭৮\u0003\u0002\u0002\u0002৮š\u0003\u0002\u0002\u0002৯৭\u0003\u0002\u0002\u0002ৰ৴\u0005Ť³\u0002ৱ৴\u0005Ū¶\u0002৲৴\u0005Ű¹\u0002৳ৰ\u0003\u0002\u0002\u0002৳ৱ\u0003\u0002\u0002\u0002৳৲\u0003\u0002\u0002\u0002৴ţ\u0003\u0002\u0002\u0002৵৶\u0005Ű¹\u0002৶৸\u0007\u0097\u0002\u0002৷৹\u0007¿\u0002\u0002৸৷\u0003\u0002\u0002\u0002৸৹\u0003\u0002\u0002\u0002৹৺\u0003\u0002\u0002\u0002৺৻\u0007Á\u0002\u0002৻ਅ\u0003\u0002\u0002\u0002\u09fc\u09fd\u0005Ű¹\u0002\u09fd\u09fe\u0007\u0018\u0002\u0002\u09fe\u09ff\u0005Ű¹\u0002\u09ff\u0a00\u0007\r\u0002\u0002\u0a00ਁ\u0005Ű¹\u0002ਁਅ\u0003\u0002\u0002\u0002ਂਅ\u0005Ŧ´\u0002ਃਅ\u0005Ũµ\u0002\u0a04৵\u0003\u0002\u0002\u0002\u0a04\u09fc\u0003\u0002\u0002\u0002\u0a04ਂ\u0003\u0002\u0002\u0002\u0a04ਃ\u0003\u0002\u0002\u0002ਅť\u0003\u0002\u0002\u0002ਆਈ\u0005Ű¹\u0002ਇਉ\u0007¿\u0002\u0002ਈਇ\u0003\u0002\u0002\u0002ਈਉ\u0003\u0002\u0002\u0002ਉਊ\u0003\u0002\u0002\u0002ਊ\u0a0b\u0007\u0087\u0002\u0002\u0a0bਕ\u0007ŝ\u0002\u0002\u0a0c\u0a11\u0005Ű¹\u0002\u0a0d\u0a0e\u0007ŏ\u0002\u0002\u0a0eਐ\u0005Ű¹\u0002ਏ\u0a0d\u0003\u0002\u0002\u0002ਐਓ\u0003\u0002\u0002\u0002\u0a11ਏ\u0003\u0002\u0002\u0002\u0a11\u0a12\u0003\u0002\u0002\u0002\u0a12ਖ\u0003\u0002\u0002\u0002ਓ\u0a11\u0003\u0002\u0002\u0002ਔਖ\u0005Ď\u0088\u0002ਕ\u0a0c\u0003\u0002\u0002\u0002ਕਔ\u0003\u0002\u0002\u0002ਖਗ\u0003\u0002\u0002\u0002ਗਘ\u0007Š\u0002\u0002ਘŧ\u0003\u0002\u0002\u0002ਙਚ\u0007ŝ\u0002\u0002ਚਟ\u0005Ű¹\u0002ਛਜ\u0007ŏ\u0002\u0002ਜਞ\u0005Ű¹\u0002ਝਛ\u0003\u0002\u0002\u0002ਞਡ\u0003\u0002\u0002\u0002ਟਝ\u0003\u0002\u0002\u0002ਟਠ\u0003\u0002\u0002\u0002ਠਢ\u0003\u0002\u0002\u0002ਡਟ\u0003\u0002\u0002\u0002ਢਤ\u0007Š\u0002\u0002ਣਥ\u0007¿\u0002\u0002ਤਣ\u0003\u0002\u0002\u0002ਤਥ\u0003\u0002\u0002\u0002ਥਦ\u0003\u0002\u0002\u0002ਦਧ\u0007\u0087\u0002\u0002ਧਨ\u0007ŝ\u0002\u0002ਨ\u0a29\u0005Ď\u0088\u0002\u0a29ਪ\u0007Š\u0002\u0002ਪũ\u0003\u0002\u0002\u0002ਫਬ\u0005Ű¹\u0002ਬਭ\u0005Ů¸\u0002ਭਮ\u0005Ű¹\u0002ਮū\u0003\u0002\u0002\u0002ਯਰ\t(\u0002\u0002ਰŭ\u0003\u0002\u0002\u0002\u0a31ਾ\u0007œ\u0002\u0002ਲਾ\u0007Ŕ\u0002\u0002ਲ਼ਾ\u0007ŕ\u0002\u0002\u0a34ਾ\u0007Ŗ\u0002\u0002ਵਾ\u0007ř\u0002\u0002ਸ਼ਾ\u0007Ś\u0002\u0002\u0a37ਾ\u0007ŗ\u0002\u0002ਸਾ\u0007Ř\u0002\u0002ਹ\u0a3b\u0007¿\u0002\u0002\u0a3aਹ\u0003\u0002\u0002\u0002\u0a3a\u0a3b\u0003\u0002\u0002\u0002\u0a3b਼\u0003\u0002\u0002\u0002਼ਾ\t)\u0002\u0002\u0a3d\u0a31\u0003\u0002\u0002\u0002\u0a3dਲ\u0003\u0002\u0002\u0002\u0a3dਲ਼\u0003\u0002\u0002\u0002\u0a3d\u0a34\u0003\u0002\u0002\u0002\u0a3dਵ\u0003\u0002\u0002\u0002\u0a3dਸ਼\u0003\u0002\u0002\u0002\u0a3d\u0a37\u0003\u0002\u0002\u0002\u0a3dਸ\u0003\u0002\u0002\u0002\u0a3d\u0a3a\u0003\u0002\u0002\u0002ਾů\u0003\u0002\u0002\u0002ਿੀ\b¹\u0001\u0002ੀੁ\u0007ŝ\u0002\u0002ੁੂ\u0005Ű¹\u0002ੂ\u0a43\u0007Š\u0002\u0002\u0a43੍\u0003\u0002\u0002\u0002\u0a44੍\u0005Ŵ»\u0002\u0a45੍\u0005Ÿ½\u0002\u0a46੍\u0005ż¿\u0002ੇ੍\u0005ƂÂ\u0002ੈ੍\u0005ƄÃ\u0002\u0a49੍\u0005ƌÇ\u0002\u0a4a੍\u0005ƎÈ\u0002ੋ੍\u0005Ųº\u0002ੌਿ\u0003\u0002\u0002\u0002ੌ\u0a44\u0003\u0002\u0002\u0002ੌ\u0a45\u0003\u0002\u0002\u0002ੌ\u0a46\u0003\u0002\u0002\u0002ੌੇ\u0003\u0002\u0002\u0002ੌੈ\u0003\u0002\u0002\u0002ੌ\u0a49\u0003\u0002\u0002\u0002ੌ\u0a4a\u0003\u0002\u0002\u0002ੌੋ\u0003\u0002\u0002\u0002੍ਫ਼\u0003\u0002\u0002\u0002\u0a4e\u0a4f\f\u000f\u0002\u0002\u0a4f\u0a50\u0007ś\u0002\u0002\u0a50\u0a5d\u0005Ű¹\u0010ੑ\u0a52\f\u000e\u0002\u0002\u0a52\u0a53\u0007ő\u0002\u0002\u0a53\u0a5d\u0005Ű¹\u000f\u0a54\u0a55\f\r\u0002\u0002\u0a55\u0a56\u0007ō\u0002\u0002\u0a56\u0a5d\u0005Ű¹\u000e\u0a57\u0a58\f\f\u0002\u0002\u0a58ਖ਼\u0007ţ\u0002\u0002ਖ਼\u0a5d\u0005Ű¹\rਗ਼ਜ਼\f\u0010\u0002\u0002ਜ਼\u0a5d\u0005Ŷ¼\u0002ੜ\u0a4e\u0003\u0002\u0002\u0002ੜੑ\u0003\u0002\u0002\u0002ੜ\u0a54\u0003\u0002\u0002\u0002ੜ\u0a57\u0003\u0002\u0002\u0002ੜਗ਼\u0003\u0002\u0002\u0002\u0a5d\u0a60\u0003\u0002\u0002\u0002ਫ਼ੜ\u0003\u0002\u0002\u0002ਫ਼\u0a5f\u0003\u0002\u0002\u0002\u0a5fű\u0003\u0002\u0002\u0002\u0a60ਫ਼\u0003\u0002\u0002\u0002\u0a61੪\u0005ƤÓ\u0002\u0a62੪\u0005ƦÔ\u0002\u0a63੪\u0005ưÙ\u0002\u0a64੪\u0005ƨÕ\u0002\u0a65੪\u0005ƪÖ\u0002੦੪\u0005ƮØ\u0002੧੪\u0005Ƭ×\u0002੨੪\u0005ƲÚ\u0002੩\u0a61\u0003\u0002\u0002\u0002੩\u0a62\u0003\u0002\u0002\u0002੩\u0a63\u0003\u0002\u0002\u0002੩\u0a64\u0003\u0002\u0002\u0002੩\u0a65\u0003\u0002\u0002\u0002੩੦\u0003\u0002\u0002\u0002੩੧\u0003\u0002\u0002\u0002੩੨\u0003\u0002\u0002\u0002੪ų\u0003\u0002\u0002\u0002੫੬\u0007\u0094\u0002\u0002੬੭\u0005Ű¹\u0002੭੮\u0005Ŷ¼\u0002੮ŵ\u0003\u0002\u0002\u0002੯ੰ\t*\u0002\u0002ੰŷ\u0003\u0002\u0002\u0002ੱੲ\u0005ź¾\u0002ੲੳ\t+\u0002\u0002ੳ\u0a78\u0005ź¾\u0002ੴੵ\t+\u0002\u0002ੵ\u0a77\u0005ź¾\u0002\u0a76ੴ\u0003\u0002\u0002\u0002\u0a77\u0a7a\u0003\u0002\u0002\u0002\u0a78\u0a76\u0003\u0002\u0002\u0002\u0a78\u0a79\u0003\u0002\u0002\u0002\u0a79Ź\u0003\u0002\u0002\u0002\u0a7a\u0a78\u0003\u0002\u0002\u0002\u0a7b\u0a7c\u0007ŝ\u0002\u0002\u0a7c\u0a7d\u0005Ű¹\u0002\u0a7d\u0a7e\u0007Š\u0002\u0002\u0a7eઅ\u0003\u0002\u0002\u0002\u0a7fઅ\u0005ż¿\u0002\u0a80અ\u0005ƄÃ\u0002ઁઅ\u0005ƌÇ\u0002ંઅ\u0005ƎÈ\u0002ઃઅ\u0005Ųº\u0002\u0a84\u0a7b\u0003\u0002\u0002\u0002\u0a84\u0a7f\u0003\u0002\u0002\u0002\u0a84\u0a80\u0003\u0002\u0002\u0002\u0a84ઁ\u0003\u0002\u0002\u0002\u0a84ં\u0003\u0002\u0002\u0002\u0a84ઃ\u0003\u0002\u0002\u0002અŻ\u0003\u0002\u0002\u0002આઉ\u0005žÀ\u0002ઇઉ\u0005ƀÁ\u0002ઈઆ\u0003\u0002\u0002\u0002ઈઇ\u0003\u0002\u0002\u0002ઉŽ\u0003\u0002\u0002\u0002ઊઋ\u0007%\u0002\u0002ઋઑ\u0005Ű¹\u0002ઌઍ\u0007ĭ\u0002\u0002ઍ\u0a8e\u0005Ű¹\u0002\u0a8eએ\u0007Ė\u0002\u0002એઐ\u0005Ű¹\u0002ઐ\u0a92\u0003\u0002\u0002\u0002ઑઌ\u0003\u0002\u0002\u0002\u0a92ઓ\u0003\u0002\u0002\u0002ઓઑ\u0003\u0002\u0002\u0002ઓઔ\u0003\u0002\u0002\u0002ઔગ\u0003\u0002\u0002\u0002કખ\u0007\\\u0002\u0002ખઘ\u0005Ű¹\u0002ગક\u0003\u0002\u0002\u0002ગઘ\u0003\u0002\u0002\u0002ઘઙ\u0003\u0002\u0002\u0002ઙચ\u0007`\u0002\u0002ચſ\u0003\u0002\u0002\u0002છડ\u0007%\u0002\u0002જઝ\u0007ĭ\u0002\u0002ઝઞ\u0005Š±\u0002ઞટ\u0007Ė\u0002\u0002ટઠ\u0005Ű¹\u0002ઠઢ\u0003\u0002\u0002\u0002ડજ\u0003\u0002\u0002\u0002ઢણ\u0003\u0002\u0002\u0002ણડ\u0003\u0002\u0002\u0002ણત\u0003\u0002\u0002\u0002તધ\u0003\u0002\u0002\u0002થદ\u0007\\\u0002\u0002દન\u0005Ű¹\u0002ધથ\u0003\u0002\u0002\u0002ધન\u0003\u0002\u0002\u0002ન\u0aa9\u0003\u0002\u0002\u0002\u0aa9પ\u0007`\u0002\u0002પƁ\u0003\u0002\u0002\u0002ફબ\u0005ƨÕ\u0002બભ\u0007\u0005\u0002\u0002ભમ\t,\u0002\u0002મƃ\u0003\u0002\u0002\u0002યર\u0007\u0015\u0002\u0002રલ\u0007ŝ\u0002\u0002\u0ab1ળ\u0005ƆÄ\u0002લ\u0ab1\u0003\u0002\u0002\u0002લળ\u0003\u0002\u0002\u0002ળ\u0ab4\u0003\u0002\u0002\u0002\u0ab4વ\u0005Ű¹\u0002વષ\u0007Š\u0002\u0002શસ\u0005ƈÅ\u0002ષશ\u0003\u0002\u0002\u0002ષસ\u0003\u0002\u0002\u0002સୈ\u0003\u0002\u0002\u0002હ\u0aba\u00078\u0002\u0002\u0abaી\u0007ŝ\u0002\u0002\u0abbઽ\u0005ƆÄ\u0002઼\u0abb\u0003\u0002\u0002\u0002઼ઽ\u0003\u0002\u0002\u0002ઽા\u0003\u0002\u0002\u0002ાુ\u0005Ű¹\u0002િુ\u0007ś\u0002\u0002ી઼\u0003\u0002\u0002\u0002ીિ\u0003\u0002\u0002\u0002ુૂ\u0003\u0002\u0002\u0002ૂૄ\u0007Š\u0002\u0002ૃૅ\u0005ƈÅ\u0002ૄૃ\u0003\u0002\u0002\u0002ૄૅ\u0003\u0002\u0002\u0002ૅୈ\u0003\u0002\u0002\u0002\u0ac6ે\u00079\u0002\u0002ે્\u0007ŝ\u0002\u0002ૈ\u0aca\u0005ƆÄ\u0002ૉૈ\u0003\u0002\u0002\u0002ૉ\u0aca\u0003\u0002\u0002\u0002\u0acaો\u0003\u0002\u0002\u0002ો\u0ace\u0005Ű¹\u0002ૌ\u0ace\u0007ś\u0002\u0002્ૉ\u0003\u0002\u0002\u0002્ૌ\u0003\u0002\u0002\u0002\u0ace\u0acf\u0003\u0002\u0002\u0002\u0acf\u0ad1\u0007Š\u0002\u0002ૐ\u0ad2\u0005ƈÅ\u0002\u0ad1ૐ\u0003\u0002\u0002\u0002\u0ad1\u0ad2\u0003\u0002\u0002\u0002\u0ad2ୈ\u0003\u0002\u0002\u0002\u0ad3\u0ad4\u0007Ķ\u0002\u0002\u0ad4\u0ad5\u0007ŝ\u0002\u0002\u0ad5\u0ad6\u0007Š\u0002\u0002\u0ad6ୈ\u0005ƈÅ\u0002\u0ad7\u0ad8\u0007ĺ\u0002\u0002\u0ad8\u0ad9\u0007ŝ\u0002\u0002\u0ad9\u0ada\u0007Š\u0002\u0002\u0adaୈ\u0005ƈÅ\u0002\u0adb\u0adc\u0007Ļ\u0002\u0002\u0adc\u0add\u0007ŝ\u0002\u0002\u0add\u0ade\u0005Ű¹\u0002\u0ade\u0adf\u0007Š\u0002\u0002\u0adfૠ\u0005ƈÅ\u0002ૠୈ\u0003\u0002\u0002\u0002ૡૢ\u0007ļ\u0002\u0002ૢૣ\u0007ŝ\u0002\u0002ૣ૪\u0005Ű¹\u0002\u0ae4\u0ae5\u0007ŏ\u0002\u0002\u0ae5૨\u0005Ű¹\u0002૦૧\u0007ŏ\u0002\u0002૧૩\u0005Ű¹\u0002૨૦\u0003\u0002\u0002\u0002૨૩\u0003\u0002\u0002\u0002૩૫\u0003\u0002\u0002\u0002૪\u0ae4\u0003\u0002\u0002\u0002૪૫\u0003\u0002\u0002\u0002૫૬\u0003\u0002\u0002\u0002૬૭\u0007Š\u0002\u0002૭૮\u0005ƈÅ\u0002૮ୈ\u0003\u0002\u0002\u0002૯૰\u0007Ľ\u0002\u0002૰૱\u0007ŝ\u0002\u0002૱\u0af2\u0005Ű¹\u0002\u0af2\u0af3\u0007Š\u0002\u0002\u0af3\u0af4\u0005ƈÅ\u0002\u0af4ୈ\u0003\u0002\u0002\u0002\u0af5\u0af6\u0007ľ\u0002\u0002\u0af6\u0af7\u0007ŝ\u0002\u0002\u0af7\u0afe\u0005Ű¹\u0002\u0af8\u0af9\u0007ŏ\u0002\u0002\u0af9\u0afc\u0005Ű¹\u0002\u0afa\u0afb\u0007ŏ\u0002\u0002\u0afb\u0afd\u0005Ű¹\u0002\u0afc\u0afa\u0003\u0002\u0002\u0002\u0afc\u0afd\u0003\u0002\u0002\u0002\u0afd\u0aff\u0003\u0002\u0002\u0002\u0afe\u0af8\u0003\u0002\u0002\u0002\u0afe\u0aff\u0003\u0002\u0002\u0002\u0aff\u0b00\u0003\u0002\u0002\u0002\u0b00ଁ\u0007Š\u0002\u0002ଁଂ\u0005ƈÅ\u0002ଂୈ\u0003\u0002\u0002\u0002ଃ\u0b04\u0007¯\u0002\u0002\u0b04ଆ\u0007ŝ\u0002\u0002ଅଇ\u0005ƆÄ\u0002ଆଅ\u0003\u0002\u0002\u0002ଆଇ\u0003\u0002\u0002\u0002ଇଈ\u0003\u0002\u0002\u0002ଈଉ\u0005Ű¹\u0002ଉଋ\u0007Š\u0002\u0002ଊଌ\u0005ƈÅ\u0002ଋଊ\u0003\u0002\u0002\u0002ଋଌ\u0003\u0002\u0002\u0002ଌୈ\u0003\u0002\u0002\u0002\u0b0d\u0b0e\u0007µ\u0002\u0002\u0b0eଐ\u0007ŝ\u0002\u0002ଏ\u0b11\u0005ƆÄ\u0002ଐଏ\u0003\u0002\u0002\u0002ଐ\u0b11\u0003\u0002\u0002\u0002\u0b11\u0b12\u0003\u0002\u0002\u0002\u0b12ଓ\u0005Ű¹\u0002ଓକ\u0007Š\u0002\u0002ଔଖ\u0005ƈÅ\u0002କଔ\u0003\u0002\u0002\u0002କଖ\u0003\u0002\u0002\u0002ଖୈ\u0003\u0002\u0002\u0002ଗଘ\u0007Ň\u0002\u0002ଘଙ\u0007ŝ\u0002\u0002ଙଚ\u0007Š\u0002\u0002ଚୈ\u0005ƈÅ\u0002ଛଜ\u0007ň\u0002\u0002ଜଝ\u0007ŝ\u0002\u0002ଝଞ\u0007Š\u0002\u0002ଞୈ\u0005ƈÅ\u0002ଟଠ\u0007ŉ\u0002\u0002ଠଢ\u0007ŝ\u0002\u0002ଡଣ\u0005ƆÄ\u0002ଢଡ\u0003\u0002\u0002\u0002ଢଣ\u0003\u0002\u0002\u0002ଣତ\u0003\u0002\u0002\u0002ତଥ\u0005Ű¹\u0002ଥଧ\u0007Š\u0002\u0002ଦନ\u0005ƈÅ\u0002ଧଦ\u0003\u0002\u0002\u0002ଧନ\u0003\u0002\u0002\u0002ନୈ\u0003\u0002\u0002\u0002\u0b29ପ\u0007ď\u0002\u0002ପବ\u0007ŝ\u0002\u0002ଫଭ\u0005ƆÄ\u0002ବଫ\u0003\u0002\u0002\u0002ବଭ\u0003\u0002\u0002\u0002ଭମ\u0003\u0002\u0002\u0002ମଯ\u0005Ű¹\u0002ଯ\u0b31\u0007Š\u0002\u0002ରଲ\u0005ƈÅ\u0002\u0b31ର\u0003\u0002\u0002\u0002\u0b31ଲ\u0003\u0002\u0002\u0002ଲୈ\u0003\u0002\u0002\u0002ଳ\u0b34\u0007Ĩ\u0002\u0002\u0b34ଶ\u0007ŝ\u0002\u0002ଵଷ\u0005ƆÄ\u0002ଶଵ\u0003\u0002\u0002\u0002ଶଷ\u0003\u0002\u0002\u0002ଷସ\u0003\u0002\u0002\u0002ସହ\u0005Ű¹\u0002ହ\u0b3b\u0007Š\u0002\u0002\u0b3a଼\u0005ƈÅ\u0002\u0b3b\u0b3a\u0003\u0002\u0002\u0002\u0b3b଼\u0003\u0002\u0002\u0002଼ୈ\u0003\u0002\u0002\u0002ଽା\u0007ŋ\u0002\u0002ାୀ\u0007ŝ\u0002\u0002ିୁ\u0005ƆÄ\u0002ୀି\u0003\u0002\u0002\u0002ୀୁ\u0003\u0002\u0002\u0002ୁୂ\u0003\u0002\u0002\u0002ୂୃ\u0005Ű¹\u0002ୃ\u0b45\u0007Š\u0002\u0002ୄ\u0b46\u0005ƈÅ\u0002\u0b45ୄ\u0003\u0002\u0002\u0002\u0b45\u0b46\u0003\u0002\u0002\u0002\u0b46ୈ\u0003\u0002\u0002\u0002େય\u0003\u0002\u0002\u0002େહ\u0003\u0002\u0002\u0002େ\u0ac6\u0003\u0002\u0002\u0002େ\u0ad3\u0003\u0002\u0002\u0002େ\u0ad7\u0003\u0002\u0002\u0002େ\u0adb\u0003\u0002\u0002\u0002େૡ\u0003\u0002\u0002\u0002େ૯\u0003\u0002\u0002\u0002େ\u0af5\u0003\u0002\u0002\u0002େଃ\u0003\u0002\u0002\u0002େ\u0b0d\u0003\u0002\u0002\u0002େଗ\u0003\u0002\u0002\u0002େଛ\u0003\u0002\u0002\u0002େଟ\u0003\u0002\u0002\u0002େ\u0b29\u0003\u0002\u0002\u0002େଳ\u0003\u0002\u0002\u0002େଽ\u0003\u0002\u0002\u0002ୈƅ\u0003\u0002\u0002\u0002\u0b49\u0b4a\t#\u0002\u0002\u0b4aƇ\u0003\u0002\u0002\u0002ୋୌ\u0007Í\u0002\u0002ୌ\u0b4e\u0007ŝ\u0002\u0002୍\u0b4f\u0005ƊÆ\u0002\u0b4e୍\u0003\u0002\u0002\u0002\u0b4e\u0b4f\u0003\u0002\u0002\u0002\u0b4f\u0b51\u0003\u0002\u0002\u0002\u0b50\u0b52\u0005ņ¤\u0002\u0b51\u0b50\u0003\u0002\u0002\u0002\u0b51\u0b52\u0003\u0002\u0002\u0002\u0b52\u0b53\u0003\u0002\u0002\u0002\u0b53\u0b54\u0007Š\u0002\u0002\u0b54Ɖ\u0003\u0002\u0002\u0002\u0b55ୖ\u0007Ñ\u0002\u0002ୖୗ\u0007 \u0002\u0002ୗଡ଼\u0005Ű¹\u0002\u0b58\u0b59\u0007ŏ\u0002\u0002\u0b59\u0b5b\u0005Ű¹\u0002\u0b5a\u0b58\u0003\u0002\u0002\u0002\u0b5b\u0b5e\u0003\u0002\u0002\u0002ଡ଼\u0b5a\u0003\u0002\u0002\u0002ଡ଼ଢ଼\u0003\u0002\u0002\u0002ଢ଼Ƌ\u0003\u0002\u0002\u0002\u0b5eଡ଼\u0003\u0002\u0002\u0002ୟన\u0007ĵ\u0002\u0002ୠୡ\u0007'\u0002\u0002ୡୢ\u0007ŝ\u0002\u0002ୢୣ\u0005Ű¹\u0002ୣ\u0b64\u0007\u0010\u0002\u0002\u0b64୦\u0005r:\u0002\u0b65୧\u0005t;\u0002୦\u0b65\u0003\u0002\u0002\u0002୦୧\u0003\u0002\u0002\u0002୧୨\u0003\u0002\u0002\u0002୨୩\u0007Š\u0002\u0002୩న\u0003\u0002\u0002\u0002୪୫\u00078\u0002\u0002୫୮\u0007ŝ\u0002\u0002୬୯\u0005Ű¹\u0002୭୯\u0007ś\u0002\u0002୮୬\u0003\u0002\u0002\u0002୮୭\u0003\u0002\u0002\u0002୯୰\u0003\u0002\u0002\u0002୰న\u0007Š\u0002\u0002ୱన\u0007ķ\u0002\u0002୲୳\u0007>\u0002\u0002୳న\u0007B\u0002\u0002୴\u0b78\u0007ĸ\u0002\u0002୵୶\u0007>\u0002\u0002୶\u0b78\u0007ė\u0002\u0002୷୴\u0003\u0002\u0002\u0002୷୵\u0003\u0002\u0002\u0002\u0b78\u0b7d\u0003\u0002\u0002\u0002\u0b79\u0b7a\u0007ŝ\u0002\u0002\u0b7a\u0b7b\u0005Ű¹\u0002\u0b7b\u0b7c\u0007Š\u0002\u0002\u0b7c\u0b7e\u0003\u0002\u0002\u0002\u0b7d\u0b79\u0003\u0002\u0002\u0002\u0b7d\u0b7e\u0003\u0002\u0002\u0002\u0b7eన\u0003\u0002\u0002\u0002\u0b7fన\u0007Ĺ\u0002\u0002\u0b80\u0b81\u0007>\u0002\u0002\u0b81న\u0007Ō\u0002\u0002ஂஃ\u0007Ŀ\u0002\u0002ஃ\u0b84\u0007ŝ\u0002\u0002\u0b84\u0b91\u0005Ű¹\u0002அஆ\u0007ŏ\u0002\u0002ஆஎ\u0005Ű¹\u0002இஈ\u0007ŏ\u0002\u0002ஈஉ\u0005Ű¹\u0002உஊ\u0007œ\u0002\u0002ஊ\u0b8b\u0005Ű¹\u0002\u0b8b\u0b8d\u0003\u0002\u0002\u0002\u0b8cஇ\u0003\u0002\u0002\u0002\u0b8dஐ\u0003\u0002\u0002\u0002எ\u0b8c\u0003\u0002\u0002\u0002எஏ\u0003\u0002\u0002\u0002ஏஒ\u0003\u0002\u0002\u0002ஐஎ\u0003\u0002\u0002\u0002\u0b91அ\u0003\u0002\u0002\u0002\u0b91ஒ\u0003\u0002\u0002\u0002ஒஓ\u0003\u0002\u0002\u0002ஓஔ\u0007Š\u0002\u0002ஔన\u0003\u0002\u0002\u0002க\u0b96\u0007ŀ\u0002\u0002\u0b96\u0b97\u0007ŝ\u0002\u0002\u0b97த\u0005Ű¹\u0002\u0b98ங\u0007ŏ\u0002\u0002ங\u0ba1\u0005Ű¹\u0002ச\u0b9b\u0007ŏ\u0002\u0002\u0b9bஜ\u0005Ű¹\u0002ஜ\u0b9d\u0007œ\u0002\u0002\u0b9dஞ\u0005Ű¹\u0002ஞ\u0ba0\u0003\u0002\u0002\u0002டச\u0003\u0002\u0002\u0002\u0ba0ண\u0003\u0002\u0002\u0002\u0ba1ட\u0003\u0002\u0002\u0002\u0ba1\u0ba2\u0003\u0002\u0002\u0002\u0ba2\u0ba5\u0003\u0002\u0002\u0002ண\u0ba1\u0003\u0002\u0002\u0002த\u0b98\u0003\u0002\u0002\u0002த\u0ba5\u0003\u0002\u0002\u0002\u0ba5\u0ba6\u0003\u0002\u0002\u0002\u0ba6\u0ba7\u0007Š\u0002\u0002\u0ba7న\u0003\u0002\u0002\u0002நன\u0007Ł\u0002\u0002னப\u0007ŝ\u0002\u0002பஷ\u0005Ű¹\u0002\u0bab\u0bac\u0007ŏ\u0002\u0002\u0bacழ\u0005Ű¹\u0002\u0badம\u0007ŏ\u0002\u0002மய\u0005Ű¹\u0002யர\u0007œ\u0002\u0002ரற\u0005Ű¹\u0002றள\u0003\u0002\u0002\u0002ல\u0bad\u0003\u0002\u0002\u0002ளஶ\u0003\u0002\u0002\u0002ழல\u0003\u0002\u0002\u0002ழவ\u0003\u0002\u0002\u0002வஸ\u0003\u0002\u0002\u0002ஶழ\u0003\u0002\u0002\u0002ஷ\u0bab\u0003\u0002\u0002\u0002ஷஸ\u0003\u0002\u0002\u0002ஸஹ\u0003\u0002\u0002\u0002ஹ\u0bba\u0007Š\u0002\u0002\u0bbaన\u0003\u0002\u0002\u0002\u0bbb\u0bbc\u0007ł\u0002\u0002\u0bbc\u0bbd\u0007ŝ\u0002\u0002\u0bbdொ\u0005Ű¹\u0002ாி\u0007ŏ\u0002\u0002ிே\u0005Ű¹\u0002ீு\u0007ŏ\u0002\u0002ுூ\u0005Ű¹\u0002ூ\u0bc3\u0007œ\u0002\u0002\u0bc3\u0bc4\u0005Ű¹\u0002\u0bc4ெ\u0003\u0002\u0002\u0002\u0bc5ீ\u0003\u0002\u0002\u0002ெ\u0bc9\u0003\u0002\u0002\u0002ே\u0bc5\u0003\u0002\u0002\u0002ேை\u0003\u0002\u0002\u0002ைோ\u0003\u0002\u0002\u0002\u0bc9ே\u0003\u0002\u0002\u0002ொா\u0003\u0002\u0002\u0002ொோ\u0003\u0002\u0002\u0002ோௌ\u0003\u0002\u0002\u0002ௌ்\u0007Š\u0002\u0002்న\u0003\u0002\u0002\u0002\u0bce\u0bcf\u0007Ń\u0002\u0002\u0bcfௐ\u0007ŝ\u0002\u0002ௐ\u0bdd\u0005Ű¹\u0002\u0bd1\u0bd2\u0007ŏ\u0002\u0002\u0bd2\u0bda\u0005Ű¹\u0002\u0bd3\u0bd4\u0007ŏ\u0002\u0002\u0bd4\u0bd5\u0005Ű¹\u0002\u0bd5\u0bd6\u0007œ\u0002\u0002\u0bd6ௗ\u0005Ű¹\u0002ௗ\u0bd9\u0003\u0002\u0002\u0002\u0bd8\u0bd3\u0003\u0002\u0002\u0002\u0bd9\u0bdc\u0003\u0002\u0002\u0002\u0bda\u0bd8\u0003\u0002\u0002\u0002\u0bda\u0bdb\u0003\u0002\u0002\u0002\u0bdb\u0bde\u0003\u0002\u0002\u0002\u0bdc\u0bda\u0003\u0002\u0002\u0002\u0bdd\u0bd1\u0003\u0002\u0002\u0002\u0bdd\u0bde\u0003\u0002\u0002\u0002\u0bde\u0bdf\u0003\u0002\u0002\u0002\u0bdf\u0be0\u0007Š\u0002\u0002\u0be0న\u0003\u0002\u0002\u0002\u0be1\u0be2\u0007ń\u0002\u0002\u0be2\u0be3\u0007ŝ\u0002\u0002\u0be3௰\u0005Ű¹\u0002\u0be4\u0be5\u0007ŏ\u0002\u0002\u0be5௭\u0005Ű¹\u0002௦௧\u0007ŏ\u0002\u0002௧௨\u0005Ű¹\u0002௨௩\u0007œ\u0002\u0002௩௪\u0005Ű¹\u0002௪௬\u0003\u0002\u0002\u0002௫௦\u0003\u0002\u0002\u0002௬௯\u0003\u0002\u0002\u0002௭௫\u0003\u0002\u0002\u0002௭௮\u0003\u0002\u0002\u0002௮௱\u0003\u0002\u0002\u0002௯௭\u0003\u0002\u0002\u0002௰\u0be4\u0003\u0002\u0002\u0002௰௱\u0003\u0002\u0002\u0002௱௲\u0003\u0002\u0002\u0002௲௳\u0007Š\u0002\u0002௳న\u0003\u0002\u0002\u0002௴௵\u0007Ņ\u0002\u0002௵௶\u0007ŝ\u0002\u0002௶\u0bfe\u0005Ű¹\u0002௷௸\u0007ŏ\u0002\u0002௸௹\u0005Ű¹\u0002௹௺\u0007œ\u0002\u0002௺\u0bfb\u0005Ű¹\u0002\u0bfb\u0bfd\u0003\u0002\u0002\u0002\u0bfc௷\u0003\u0002\u0002\u0002\u0bfd\u0c00\u0003\u0002\u0002\u0002\u0bfe\u0bfc\u0003\u0002\u0002\u0002\u0bfe\u0bff\u0003\u0002\u0002\u0002\u0bffఁ\u0003\u0002\u0002\u0002\u0c00\u0bfe\u0003\u0002\u0002\u0002ఁం\u0007Š\u0002\u0002ంన\u0003\u0002\u0002\u0002ః\u0c04\u0007ņ\u0002\u0002\u0c04అ\u0007ŝ\u0002\u0002అఋ\u0005Ű¹\u0002ఆఇ\u0007ŏ\u0002\u0002ఇఈ\u0005Ű¹\u0002ఈఉ\u0007œ\u0002\u0002ఉఊ\u0005Ű¹\u0002ఊఌ\u0003\u0002\u0002\u0002ఋఆ\u0003\u0002\u0002\u0002ఌ\u0c0d\u0003\u0002\u0002\u0002\u0c0dఋ\u0003\u0002\u0002\u0002\u0c0dఎ\u0003\u0002\u0002\u0002ఎ\u0c11\u0003\u0002\u0002\u0002ఏఐ\u0007ŏ\u0002\u0002ఐఒ\u0005Ű¹\u0002\u0c11ఏ\u0003\u0002\u0002\u0002\u0c11ఒ\u0003\u0002\u0002\u0002ఒఓ\u0003\u0002\u0002\u0002ఓఔ\u0007Š\u0002\u0002ఔన\u0003\u0002\u0002\u0002కఖ\u0007ô\u0002\u0002ఖగ\u0007ŝ\u0002\u0002గఘ\u0005Ű¹\u0002ఘఙ\u0007Š\u0002\u0002ఙన\u0003\u0002\u0002\u0002చఛ\u0007Ď\u0002\u0002ఛజ\u0007ŝ\u0002\u0002జఝ\u0005Ű¹\u0002ఝఞ\u0007t\u0002\u0002ఞడ\u0005Ű¹\u0002టఠ\u0007p\u0002\u0002ఠఢ\u0005Ű¹\u0002డట\u0003\u0002\u0002\u0002డఢ\u0003\u0002\u0002\u0002ఢణ\u0003\u0002\u0002\u0002ణత\u0007Š\u0002\u0002తన\u0003\u0002\u0002\u0002థన\u0007Ŋ\u0002\u0002దన\u0007Ō\u0002\u0002ధୟ\u0003\u0002\u0002\u0002ధୠ\u0003\u0002\u0002\u0002ధ୪\u0003\u0002\u0002\u0002ధୱ\u0003\u0002\u0002\u0002ధ୲\u0003\u0002\u0002\u0002ధ୷\u0003\u0002\u0002\u0002ధ\u0b7f\u0003\u0002\u0002\u0002ధ\u0b80\u0003\u0002\u0002\u0002ధஂ\u0003\u0002\u0002\u0002ధக\u0003\u0002\u0002\u0002ధந\u0003\u0002\u0002\u0002ధ\u0bbb\u0003\u0002\u0002\u0002ధ\u0bce\u0003\u0002\u0002\u0002ధ\u0be1\u0003\u0002\u0002\u0002ధ௴\u0003\u0002\u0002\u0002ధః\u0003\u0002\u0002\u0002ధక\u0003\u0002\u0002\u0002ధచ\u0003\u0002\u0002\u0002ధథ\u0003\u0002\u0002\u0002ధద\u0003\u0002\u0002\u0002నƍ\u0003\u0002\u0002\u0002\u0c29ప\u0005ƨÕ\u0002పబ\u0007ŝ\u0002\u0002ఫభ\u0005ƐÉ\u0002బఫ\u0003\u0002\u0002\u0002బభ\u0003\u0002\u0002\u0002భమ\u0003\u0002\u0002\u0002మయ\u0007Š\u0002\u0002యƏ\u0003\u0002\u0002\u0002రవ\u0005ƒÊ\u0002ఱల\u0007ŏ\u0002\u0002ల\u0c34\u0005ƒÊ\u0002ళఱ\u0003\u0002\u0002\u0002\u0c34ష\u0003\u0002\u0002\u0002వళ\u0003\u0002\u0002\u0002వశ\u0003\u0002\u0002\u0002శƑ\u0003\u0002\u0002\u0002షవ\u0003\u0002\u0002\u0002సా\u0006Ê\r\u0002హ\u0c3a\u0005ƨÕ\u0002\u0c3a\u0c3c\u0007œ\u0002\u0002\u0c3bఽ\u0007ŗ\u0002\u0002\u0c3c\u0c3b\u0003\u0002\u0002\u0002\u0c3cఽ\u0003\u0002\u0002\u0002ఽి\u0003\u0002\u0002\u0002ాహ\u0003\u0002\u0002\u0002ాి\u0003\u0002\u0002\u0002ిీ\u0003\u0002\u0002\u0002ీు\u0005Ű¹\u0002ుƓ\u0003\u0002\u0002\u0002ూ\u0c45\u0005Ď\u0088\u0002ృ\u0c45\u0005Ű¹\u0002ౄూ\u0003\u0002\u0002\u0002ౄృ\u0003\u0002\u0002\u0002\u0c45ƕ\u0003\u0002\u0002\u0002ె\u0c49\u0005ƢÒ\u0002ే\u0c49\u0005Ű¹\u0002ైె\u0003\u0002\u0002\u0002ైే\u0003\u0002\u0002\u0002\u0c49Ɨ\u0003\u0002\u0002\u0002ొ\u0c4e\u0007\u0081\u0002\u0002ో్\u0005ƚÎ\u0002ౌో\u0003\u0002\u0002\u0002్\u0c50\u0003\u0002\u0002\u0002\u0c4eౌ\u0003\u0002\u0002\u0002\u0c4e\u0c4f\u0003\u0002\u0002\u0002\u0c4fƙ\u0003\u0002\u0002\u0002\u0c50\u0c4e\u0003\u0002\u0002\u0002\u0c51\u0c52\u0007ţ\u0002\u0002\u0c52\u0c53\u0005ƨÕ\u0002\u0c53\u0c54\u0005Ű¹\u0002\u0c54\u0c5e\u0003\u0002\u0002\u0002ౕౖ\u0007ţ\u0002\u0002ౖ\u0c57\u0005ƨÕ\u0002\u0c57ౘ\u0007Ť\u0002\u0002ౘౙ\u0007œ\u0002\u0002ౙ\u0c5a\u0005Ű¹\u0002\u0c5a\u0c5e\u0003\u0002\u0002\u0002\u0c5b\u0c5c\u0007ţ\u0002\u0002\u0c5c\u0c5e\u0005ƨÕ\u0002\u0c5d\u0c51\u0003\u0002\u0002\u0002\u0c5dౕ\u0003\u0002\u0002\u0002\u0c5d\u0c5b\u0003\u0002\u0002\u0002\u0c5eƛ\u0003\u0002\u0002\u0002\u0c5fౠ\u0007\u0007\u0002\u0002ౠౡ\u0005ƞÐ\u0002ౡౢ\u0007Ţ\u0002\u0002ౢ\u0c65\u0003\u0002\u0002\u0002ౣ\u0c65\u0005ƠÑ\u0002\u0c64\u0c5f\u0003\u0002\u0002\u0002\u0c64ౣ\u0003\u0002\u0002\u0002\u0c65Ɲ\u0003\u0002\u0002\u0002౦౨\u000b\u0002\u0002\u0002౧౦\u0003\u0002\u0002\u0002౨౫\u0003\u0002\u0002\u0002౩౪\u0003\u0002\u0002\u0002౩౧\u0003\u0002\u0002\u0002౪Ɵ\u0003\u0002\u0002\u0002౫౩\u0003\u0002\u0002\u0002౬౭\u0007\u0082\u0002\u0002౭౮\u0005Ű¹\u0002౮ơ\u0003\u0002\u0002\u0002౯౾\u0007Ŭ\u0002\u0002\u0c70\u0c74\u0007ő\u0002\u0002\u0c71\u0c72\u0007\u0006\u0002\u0002\u0c72\u0c74\u0007ő\u0002\u0002\u0c73\u0c70\u0003\u0002\u0002\u0002\u0c73\u0c71\u0003\u0002\u0002\u0002\u0c73\u0c74\u0003\u0002\u0002\u0002\u0c74\u0c75\u0003\u0002\u0002\u0002\u0c75౺\u0005ƨÕ\u0002\u0c76\u0c77\u0007ő\u0002\u0002\u0c77౹\u0005ƨÕ\u0002౸\u0c76\u0003\u0002\u0002\u0002౹౼\u0003\u0002\u0002\u0002౺౸\u0003\u0002\u0002\u0002౺౻\u0003\u0002\u0002\u0002౻౾\u0003\u0002\u0002\u0002౼౺\u0003\u0002\u0002\u0002౽౯\u0003\u0002\u0002\u0002౽\u0c73\u0003\u0002\u0002\u0002౾ƣ\u0003\u0002\u0002\u0002౿\u0c80\u0007B\u0002\u0002\u0c80\u0c81\u0005ƪÖ\u0002\u0c81ƥ\u0003\u0002\u0002\u0002ಂಃ\u0007ė\u0002\u0002ಃ\u0c84\u0005ƪÖ\u0002\u0c84Ƨ\u0003\u0002\u0002\u0002ಅಈ\u0007Ť\u0002\u0002ಆಈ\u0005ƴÛ\u0002ಇಅ\u0003\u0002\u0002\u0002ಇಆ\u0003\u0002\u0002\u0002ಈƩ\u0003\u0002\u0002\u0002ಉಌ\u0007ť\u0002\u0002ಊಌ\u0007Ŧ\u0002\u0002ಋಉ\u0003\u0002\u0002\u0002ಋಊ\u0003\u0002\u0002\u0002ಌƫ\u0003\u0002\u0002\u0002\u0c8dಏ\t-\u0002\u0002ಎ\u0c8d\u0003\u0002\u0002\u0002ಎಏ\u0003\u0002\u0002\u0002ಏಐ\u0003\u0002\u0002\u0002ಐ\u0c91\u0007ŧ\u0002\u0002\u0c91ƭ\u0003\u0002\u0002\u0002ಒಔ\t-\u0002\u0002ಓಒ\u0003\u0002\u0002\u0002ಓಔ\u0003\u0002\u0002\u0002ಔಕ\u0003\u0002\u0002\u0002ಕಖ\u0007Ũ\u0002\u0002ಖƯ\u0003\u0002\u0002\u0002ಗಘ\t.\u0002\u0002ಘƱ\u0003\u0002\u0002\u0002ಙಚ\u0007Á\u0002\u0002ಚƳ\u0003\u0002\u0002\u0002ಛಜ\t/\u0002\u0002ಜƵ\u0003\u0002\u0002\u0002ƙƺƽǁǄǉǐǖǘǡǤǦȣȫȻɂɅɊɎɗɜɤɩɲɾʃʆʔʛʤʵʹˁˌ˖˞˥˩˭˲˶˻˿̷̛̖̟̬̱͈̃̍̑̾ͅ͏͖ͤͪ͜͟ͱͷͼ\u0382·ΊΐΞΨήγθνρφωϓϟϦϩϵϻϾЅАНПФгнчёѥѫѯѴѸѽҀ҅҈ҔқҠҥҩҮұһӇӎӖӤԃԅԊԎԓԚԝԠԦ\u052dԳԺՀՃՈՌՏՖ՜՟թղչրւ\u0588\u058bֳֶֹּֿ֖֥ׅ֮֟֫\u05cfךםפש\u05eeײ\u05fa\u05fe\u0603؇؉؎ؖ؛ءبثزغقموٌٕٙ٣ٰٷٹٽځډڔڝڥڭڱڹۋۭۙ۠ۤ۫۱ۺ܈\u070eܒܛܦܮܷܻ݁݇\u074bݕݠݫݯݱݵݹޅތޜޣޭ\u07b4\u07bb\u07bd߁߅ߊߍߑߔߟߢ߬ߵ\u07fcࠀࠄࠋࠏࠗࠝࠡࠬ࠳ࡀࡈࡌࡖ࡛\u0868\u0873\u087b\u087f\u0883\u0887\u0889\u088e\u0891\u0894\u0897\u089a\u089dࢠࢣࢦ\u08ad\u08b8\u08bc\u08bf\u08c3\u08ca\u08ce\u08d8\u08e0ࣰࣦࣹ࣪ࣼँऄऎओजडथमलीॊॏ॓ख़।०७॰ॷॿংঅঔছঞডথপর\u09b4িৃ\u09c6\u09caৎ\u09d1\u09d4\u09d8\u09de\u09e5৭৳৸\u0a04ਈ\u0a11ਕਟਤ\u0a3a\u0a3dੌੜਫ਼੩\u0a78\u0a84ઈઓગણધલષ઼ીૄૉ્\u0ad1૨૪\u0afc\u0afeଆଋଐକଢଧବ\u0b31ଶ\u0b3bୀ\u0b45େ\u0b4e\u0b51ଡ଼୦୮୷\u0b7dஎ\u0b91\u0ba1தழஷேொ\u0bda\u0bdd௭௰\u0bfe\u0c0d\u0c11డధబవ\u0c3cాౄై\u0c4e\u0c5d\u0c64౩\u0c73౺౽ಇಋಎಓ";
	public static final String _serializedATN;
	public static final ATN _ATN;

	/** @deprecated */
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	public String getGrammarFileName() {
		return "Hplsql.g4";
	}

	public String[] getRuleNames() {
		return ruleNames;
	}

	public String getSerializedATN() {
		return _serializedATN;
	}

	public ATN getATN() {
		return _ATN;
	}

	public HplsqlParser(TokenStream input) {
		super(input);
		this._interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	public final HplsqlParser.ProgramContext program() throws RecognitionException {
		HplsqlParser.ProgramContext _localctx = new HplsqlParser.ProgramContext(this._ctx, this.getState());
		this.enterRule(_localctx, 0, 0);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(436);
			this.block();
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.BlockContext block() throws RecognitionException {
		HplsqlParser.BlockContext _localctx = new HplsqlParser.BlockContext(this._ctx, this.getState());
		this.enterRule(_localctx, 2, 1);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(445);
			this._errHandler.sync(this);
			int _alt = 1;

			do {
				switch(_alt) {
					case 1:
						this.setState(440);
						switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 0, this._ctx)) {
							case 1:
								this.setState(438);
								this.begin_end_block();
								break;
							case 2:
								this.setState(439);
								this.stmt();
						}

						this.setState(443);
						switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 1, this._ctx)) {
							case 1:
								this.setState(442);
								this.match(120);
						}

						this.setState(447);
						this._errHandler.sync(this);
						_alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 2, this._ctx);
						break;
					default:
						throw new NoViableAltException(this);
				}
			} while(_alt != 2 && _alt != 0);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Begin_end_blockContext begin_end_block() throws RecognitionException {
		HplsqlParser.Begin_end_blockContext _localctx = new HplsqlParser.Begin_end_blockContext(this._ctx, this.getState());
		this.enterRule(_localctx, 4, 2);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(450);
			int _la = this._input.LA(1);
			if (_la == 70) {
				this.setState(449);
				this.declare_block();
			}

			this.setState(452);
			this.match(21);
			this.setState(453);
			this.block();
			this.setState(455);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 4, this._ctx)) {
				case 1:
					this.setState(454);
					this.exception_block();
				default:
					this.setState(457);
					this.block_end();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Single_block_stmtContext single_block_stmt() throws RecognitionException {
		HplsqlParser.Single_block_stmtContext _localctx = new HplsqlParser.Single_block_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 6, 3);

		try {
			this.setState(470);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 7, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(459);
					this.match(21);
					this.setState(460);
					this.block();
					this.setState(462);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 5, this._ctx)) {
						case 1:
							this.setState(461);
							this.exception_block();
						default:
							this.setState(464);
							this.block_end();
							return _localctx;
					}
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(466);
					this.stmt();
					this.setState(468);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 6, this._ctx)) {
						case 1:
							this.setState(467);
							this.match(352);
					}
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Block_endContext block_end() throws RecognitionException {
		HplsqlParser.Block_endContext _localctx = new HplsqlParser.Block_endContext(this._ctx, this.getState());
		this.enterRule(_localctx, 8, 4);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(472);
			if (this._input.LT(2).getText().equalsIgnoreCase("TRANSACTION")) {
				throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			}

			this.setState(473);
			this.match(94);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Proc_blockContext proc_block() throws RecognitionException {
		HplsqlParser.Proc_blockContext _localctx = new HplsqlParser.Proc_blockContext(this._ctx, this.getState());
		this.enterRule(_localctx, 10, 5);

		try {
			this.setState(484);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 10, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(475);
					this.begin_end_block();
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(477);
					this._errHandler.sync(this);
					int _alt = 1;

					do {
						switch(_alt) {
							case 1:
								this.setState(476);
								this.stmt();
								this.setState(479);
								this._errHandler.sync(this);
								_alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 8, this._ctx);
								break;
							default:
								throw new NoViableAltException(this);
						}
					} while(_alt != 2 && _alt != 0);

					this.setState(482);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 9, this._ctx)) {
						case 1:
							this.setState(481);
							this.match(120);
					}
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.StmtContext stmt() throws RecognitionException {
		HplsqlParser.StmtContext _localctx = new HplsqlParser.StmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 12, 6);

		try {
			this.setState(545);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 11, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(486);
					this.assignment_stmt();
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(487);
					this.allocate_cursor_stmt();
					break;
				case 3:
					this.enterOuterAlt(_localctx, 3);
					this.setState(488);
					this.alter_table_stmt();
					break;
				case 4:
					this.enterOuterAlt(_localctx, 4);
					this.setState(489);
					this.associate_locator_stmt();
					break;
				case 5:
					this.enterOuterAlt(_localctx, 5);
					this.setState(490);
					this.begin_transaction_stmt();
					break;
				case 6:
					this.enterOuterAlt(_localctx, 6);
					this.setState(491);
					this.break_stmt();
					break;
				case 7:
					this.enterOuterAlt(_localctx, 7);
					this.setState(492);
					this.call_stmt();
					break;
				case 8:
					this.enterOuterAlt(_localctx, 8);
					this.setState(493);
					this.close_stmt();
					break;
				case 9:
					this.enterOuterAlt(_localctx, 9);
					this.setState(494);
					this.cmp_stmt();
					break;
				case 10:
					this.enterOuterAlt(_localctx, 10);
					this.setState(495);
					this.copy_from_ftp_stmt();
					break;
				case 11:
					this.enterOuterAlt(_localctx, 11);
					this.setState(496);
					this.copy_from_local_stmt();
					break;
				case 12:
					this.enterOuterAlt(_localctx, 12);
					this.setState(497);
					this.copy_stmt();
					break;
				case 13:
					this.enterOuterAlt(_localctx, 13);
					this.setState(498);
					this.commit_stmt();
					break;
				case 14:
					this.enterOuterAlt(_localctx, 14);
					this.setState(499);
					this.create_database_stmt();
					break;
				case 15:
					this.enterOuterAlt(_localctx, 15);
					this.setState(500);
					this.create_function_stmt();
					break;
				case 16:
					this.enterOuterAlt(_localctx, 16);
					this.setState(501);
					this.create_index_stmt();
					break;
				case 17:
					this.enterOuterAlt(_localctx, 17);
					this.setState(502);
					this.create_local_temp_table_stmt();
					break;
				case 18:
					this.enterOuterAlt(_localctx, 18);
					this.setState(503);
					this.create_package_stmt();
					break;
				case 19:
					this.enterOuterAlt(_localctx, 19);
					this.setState(504);
					this.create_package_body_stmt();
					break;
				case 20:
					this.enterOuterAlt(_localctx, 20);
					this.setState(505);
					this.create_procedure_stmt();
					break;
				case 21:
					this.enterOuterAlt(_localctx, 21);
					this.setState(506);
					this.create_table_stmt();
					break;
				case 22:
					this.enterOuterAlt(_localctx, 22);
					this.setState(507);
					this.declare_stmt();
					break;
				case 23:
					this.enterOuterAlt(_localctx, 23);
					this.setState(508);
					this.delete_stmt();
					break;
				case 24:
					this.enterOuterAlt(_localctx, 24);
					this.setState(509);
					this.describe_stmt();
					break;
				case 25:
					this.enterOuterAlt(_localctx, 25);
					this.setState(510);
					this.drop_stmt();
					break;
				case 26:
					this.enterOuterAlt(_localctx, 26);
					this.setState(511);
					this.end_transaction_stmt();
					break;
				case 27:
					this.enterOuterAlt(_localctx, 27);
					this.setState(512);
					this.exec_stmt();
					break;
				case 28:
					this.enterOuterAlt(_localctx, 28);
					this.setState(513);
					this.exit_stmt();
					break;
				case 29:
					this.enterOuterAlt(_localctx, 29);
					this.setState(514);
					this.fetch_stmt();
					break;
				case 30:
					this.enterOuterAlt(_localctx, 30);
					this.setState(515);
					this.for_cursor_stmt();
					break;
				case 31:
					this.enterOuterAlt(_localctx, 31);
					this.setState(516);
					this.for_range_stmt();
					break;
				case 32:
					this.enterOuterAlt(_localctx, 32);
					this.setState(517);
					this.if_stmt();
					break;
				case 33:
					this.enterOuterAlt(_localctx, 33);
					this.setState(518);
					this.include_stmt();
					break;
				case 34:
					this.enterOuterAlt(_localctx, 34);
					this.setState(519);
					this.insert_stmt();
					break;
				case 35:
					this.enterOuterAlt(_localctx, 35);
					this.setState(520);
					this.insert_directory_stmt();
					break;
				case 36:
					this.enterOuterAlt(_localctx, 36);
					this.setState(521);
					this.get_diag_stmt();
					break;
				case 37:
					this.enterOuterAlt(_localctx, 37);
					this.setState(522);
					this.grant_stmt();
					break;
				case 38:
					this.enterOuterAlt(_localctx, 38);
					this.setState(523);
					this.leave_stmt();
					break;
				case 39:
					this.enterOuterAlt(_localctx, 39);
					this.setState(524);
					this.map_object_stmt();
					break;
				case 40:
					this.enterOuterAlt(_localctx, 40);
					this.setState(525);
					this.merge_stmt();
					break;
				case 41:
					this.enterOuterAlt(_localctx, 41);
					this.setState(526);
					this.open_stmt();
					break;
				case 42:
					this.enterOuterAlt(_localctx, 42);
					this.setState(527);
					this.print_stmt();
					break;
				case 43:
					this.enterOuterAlt(_localctx, 43);
					this.setState(528);
					this.raise_stmt();
					break;
				case 44:
					this.enterOuterAlt(_localctx, 44);
					this.setState(529);
					this.resignal_stmt();
					break;
				case 45:
					this.enterOuterAlt(_localctx, 45);
					this.setState(530);
					this.return_stmt();
					break;
				case 46:
					this.enterOuterAlt(_localctx, 46);
					this.setState(531);
					this.rollback_stmt();
					break;
				case 47:
					this.enterOuterAlt(_localctx, 47);
					this.setState(532);
					this.select_stmt();
					break;
				case 48:
					this.enterOuterAlt(_localctx, 48);
					this.setState(533);
					this.signal_stmt();
					break;
				case 49:
					this.enterOuterAlt(_localctx, 49);
					this.setState(534);
					this.update_stmt();
					break;
				case 50:
					this.enterOuterAlt(_localctx, 50);
					this.setState(535);
					this.use_stmt();
					break;
				case 51:
					this.enterOuterAlt(_localctx, 51);
					this.setState(536);
					this.truncate_stmt();
					break;
				case 52:
					this.enterOuterAlt(_localctx, 52);
					this.setState(537);
					this.values_into_stmt();
					break;
				case 53:
					this.enterOuterAlt(_localctx, 53);
					this.setState(538);
					this.while_stmt();
					break;
				case 54:
					this.enterOuterAlt(_localctx, 54);
					this.setState(539);
					this.label();
					break;
				case 55:
					this.enterOuterAlt(_localctx, 55);
					this.setState(540);
					this.hive();
					break;
				case 56:
					this.enterOuterAlt(_localctx, 56);
					this.setState(541);
					this.host();
					break;
				case 57:
					this.enterOuterAlt(_localctx, 57);
					this.setState(542);
					this.null_stmt();
					break;
				case 58:
					this.enterOuterAlt(_localctx, 58);
					this.setState(543);
					this.expr_stmt();
					break;
				case 59:
					this.enterOuterAlt(_localctx, 59);
					this.setState(544);
					this.semicolon_stmt();
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Semicolon_stmtContext semicolon_stmt() throws RecognitionException {
		HplsqlParser.Semicolon_stmtContext _localctx = new HplsqlParser.Semicolon_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 14, 7);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(547);
			int _la = this._input.LA(1);
			if (_la != 1 && _la != 2 && _la != 335 && _la != 352) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Exception_blockContext exception_block() throws RecognitionException {
		HplsqlParser.Exception_blockContext _localctx = new HplsqlParser.Exception_blockContext(this._ctx, this.getState());
		this.enterRule(_localctx, 16, 8);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(549);
			this.match(100);
			this.setState(551);
			this._errHandler.sync(this);
			int _alt = 1;

			do {
				switch(_alt) {
					case 1:
						this.setState(550);
						this.exception_block_item();
						this.setState(553);
						this._errHandler.sync(this);
						_alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 12, this._ctx);
						break;
					default:
						throw new NoViableAltException(this);
				}
			} while(_alt != 2 && _alt != 0);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Exception_block_itemContext exception_block_item() throws RecognitionException {
		HplsqlParser.Exception_block_itemContext _localctx = new HplsqlParser.Exception_block_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 18, 9);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(555);
			this.match(299);
			this.setState(556);
			this.match(354);
			this.setState(557);
			this.match(276);
			this.setState(558);
			this.block();
			this.setState(559);
			int _la = this._input.LA(1);
			if (_la > 0 && _la != 94 && _la != 299) {
				this.consume();
			} else {
				this._errHandler.recoverInline(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Null_stmtContext null_stmt() throws RecognitionException {
		HplsqlParser.Null_stmtContext _localctx = new HplsqlParser.Null_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 20, 10);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(561);
			this.match(191);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Expr_stmtContext expr_stmt() throws RecognitionException {
		HplsqlParser.Expr_stmtContext _localctx = new HplsqlParser.Expr_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 22, 11);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(563);
			if (this._input.LT(1).getText().equalsIgnoreCase("GO")) {
				throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"GO\")");
			}

			this.setState(564);
			this.expr(0);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Assignment_stmtContext assignment_stmt() throws RecognitionException {
		HplsqlParser.Assignment_stmtContext _localctx = new HplsqlParser.Assignment_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 24, 12);

		try {
			this.setState(579);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 15, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(566);
					this.match(248);
					this.setState(567);
					this.set_session_option();
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(569);
					int _alt;
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 13, this._ctx)) {
						case 1:
							this.setState(568);
							this.match(248);
						default:
							this.setState(571);
							this.assignment_stmt_item();
							this.setState(576);
							this._errHandler.sync(this);
							_alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 14, this._ctx);
					}

					while(_alt != 2 && _alt != 0) {
						if (_alt == 1) {
							this.setState(572);
							this.match(333);
							this.setState(573);
							this.assignment_stmt_item();
						}

						this.setState(578);
						this._errHandler.sync(this);
						_alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 14, this._ctx);
					}
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Assignment_stmt_itemContext assignment_stmt_item() throws RecognitionException {
		HplsqlParser.Assignment_stmt_itemContext _localctx = new HplsqlParser.Assignment_stmt_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 26, 13);

		try {
			this.setState(584);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 16, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(581);
					this.assignment_stmt_single_item();
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(582);
					this.assignment_stmt_multiple_item();
					break;
				case 3:
					this.enterOuterAlt(_localctx, 3);
					this.setState(583);
					this.assignment_stmt_select_item();
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Assignment_stmt_single_itemContext assignment_stmt_single_item() throws RecognitionException {
		HplsqlParser.Assignment_stmt_single_itemContext _localctx = new HplsqlParser.Assignment_stmt_single_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 28, 14);

		try {
			this.setState(602);
			int _la;
			switch(this._input.LA(1)) {
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
				case 19:
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 27:
				case 28:
				case 29:
				case 30:
				case 31:
				case 32:
				case 33:
				case 34:
				case 35:
				case 36:
				case 37:
				case 38:
				case 39:
				case 40:
				case 41:
				case 42:
				case 43:
				case 44:
				case 45:
				case 46:
				case 47:
				case 48:
				case 49:
				case 50:
				case 51:
				case 52:
				case 53:
				case 54:
				case 55:
				case 56:
				case 57:
				case 58:
				case 59:
				case 60:
				case 61:
				case 62:
				case 63:
				case 64:
				case 65:
				case 66:
				case 67:
				case 68:
				case 69:
				case 70:
				case 71:
				case 72:
				case 73:
				case 74:
				case 75:
				case 76:
				case 77:
				case 78:
				case 79:
				case 80:
				case 81:
				case 82:
				case 83:
				case 84:
				case 85:
				case 86:
				case 87:
				case 88:
				case 89:
				case 93:
				case 95:
				case 96:
				case 97:
				case 98:
				case 99:
				case 100:
				case 101:
				case 102:
				case 103:
				case 104:
				case 105:
				case 106:
				case 107:
				case 108:
				case 109:
				case 110:
				case 111:
				case 112:
				case 113:
				case 114:
				case 115:
				case 116:
				case 117:
				case 118:
				case 119:
				case 120:
				case 121:
				case 122:
				case 123:
				case 124:
				case 125:
				case 126:
				case 127:
				case 128:
				case 129:
				case 130:
				case 131:
				case 132:
				case 133:
				case 134:
				case 135:
				case 136:
				case 137:
				case 138:
				case 139:
				case 140:
				case 141:
				case 142:
				case 143:
				case 144:
				case 145:
				case 146:
				case 147:
				case 148:
				case 149:
				case 150:
				case 151:
				case 152:
				case 153:
				case 154:
				case 155:
				case 156:
				case 157:
				case 158:
				case 159:
				case 160:
				case 161:
				case 162:
				case 163:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
				case 169:
				case 170:
				case 171:
				case 172:
				case 173:
				case 174:
				case 175:
				case 176:
				case 177:
				case 178:
				case 179:
				case 180:
				case 181:
				case 182:
				case 183:
				case 184:
				case 185:
				case 186:
				case 187:
				case 188:
				case 189:
				case 190:
				case 192:
				case 193:
				case 194:
				case 195:
				case 196:
				case 197:
				case 198:
				case 199:
				case 200:
				case 201:
				case 202:
				case 203:
				case 204:
				case 205:
				case 206:
				case 207:
				case 208:
				case 209:
				case 211:
				case 212:
				case 213:
				case 214:
				case 215:
				case 216:
				case 217:
				case 218:
				case 219:
				case 220:
				case 221:
				case 222:
				case 223:
				case 224:
				case 225:
				case 226:
				case 227:
				case 228:
				case 229:
				case 230:
				case 231:
				case 232:
				case 233:
				case 234:
				case 235:
				case 236:
				case 238:
				case 239:
				case 240:
				case 241:
				case 242:
				case 243:
				case 244:
				case 245:
				case 246:
				case 247:
				case 248:
				case 249:
				case 250:
				case 251:
				case 252:
				case 253:
				case 254:
				case 255:
				case 257:
				case 258:
				case 259:
				case 260:
				case 261:
				case 262:
				case 263:
				case 264:
				case 265:
				case 266:
				case 267:
				case 268:
				case 269:
				case 270:
				case 271:
				case 272:
				case 273:
				case 274:
				case 275:
				case 276:
				case 277:
				case 279:
				case 280:
				case 281:
				case 282:
				case 283:
				case 284:
				case 287:
				case 288:
				case 289:
				case 290:
				case 291:
				case 292:
				case 293:
				case 294:
				case 295:
				case 296:
				case 297:
				case 298:
				case 301:
				case 302:
				case 303:
				case 304:
				case 305:
				case 306:
				case 307:
				case 308:
				case 309:
				case 310:
				case 311:
				case 312:
				case 313:
				case 314:
				case 315:
				case 316:
				case 323:
				case 324:
				case 325:
				case 326:
				case 327:
				case 328:
				case 329:
				case 330:
				case 354:
					this.enterOuterAlt(_localctx, 1);
					this.setState(586);
					this.ident();
					this.setState(588);
					_la = this._input.LA(1);
					if (_la == 332) {
						this.setState(587);
						this.match(332);
					}

					this.setState(590);
					this.match(337);
					this.setState(591);
					this.expr(0);
					break;
				case 26:
				case 90:
				case 91:
				case 92:
				case 94:
				case 191:
				case 210:
				case 237:
				case 256:
				case 278:
				case 285:
				case 286:
				case 299:
				case 300:
				case 317:
				case 318:
				case 319:
				case 320:
				case 321:
				case 322:
				case 331:
				case 332:
				case 333:
				case 334:
				case 335:
				case 336:
				case 337:
				case 338:
				case 339:
				case 340:
				case 341:
				case 342:
				case 343:
				case 344:
				case 345:
				case 346:
				case 348:
				case 349:
				case 350:
				case 351:
				case 352:
				case 353:
				default:
					throw new NoViableAltException(this);
				case 347:
					this.enterOuterAlt(_localctx, 2);
					this.setState(593);
					this.match(347);
					this.setState(594);
					this.ident();
					this.setState(595);
					this.match(350);
					this.setState(597);
					_la = this._input.LA(1);
					if (_la == 332) {
						this.setState(596);
						this.match(332);
					}

					this.setState(599);
					this.match(337);
					this.setState(600);
					this.expr(0);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() throws RecognitionException {
		HplsqlParser.Assignment_stmt_multiple_itemContext _localctx = new HplsqlParser.Assignment_stmt_multiple_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 30, 15);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(604);
			this.match(347);
			this.setState(605);
			this.ident();
			this.setState(610);
			this._errHandler.sync(this);

			int _la;
			for(_la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
				this.setState(606);
				this.match(333);
				this.setState(607);
				this.ident();
				this.setState(612);
				this._errHandler.sync(this);
			}

			this.setState(613);
			this.match(350);
			this.setState(615);
			_la = this._input.LA(1);
			if (_la == 332) {
				this.setState(614);
				this.match(332);
			}

			this.setState(617);
			this.match(337);
			this.setState(618);
			this.match(347);
			this.setState(619);
			this.expr(0);
			this.setState(624);
			this._errHandler.sync(this);

			for(_la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
				this.setState(620);
				this.match(333);
				this.setState(621);
				this.expr(0);
				this.setState(626);
				this._errHandler.sync(this);
			}

			this.setState(627);
			this.match(350);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Assignment_stmt_select_itemContext assignment_stmt_select_item() throws RecognitionException {
		HplsqlParser.Assignment_stmt_select_itemContext _localctx = new HplsqlParser.Assignment_stmt_select_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 32, 16);

		try {
			int _la;
			label75: {
				this.enterOuterAlt(_localctx, 1);
				this.setState(641);
				switch(this._input.LA(1)) {
					case 6:
					case 7:
					case 8:
					case 9:
					case 10:
					case 11:
					case 12:
					case 13:
					case 14:
					case 15:
					case 16:
					case 17:
					case 18:
					case 19:
					case 20:
					case 21:
					case 22:
					case 23:
					case 24:
					case 25:
					case 27:
					case 28:
					case 29:
					case 30:
					case 31:
					case 32:
					case 33:
					case 34:
					case 35:
					case 36:
					case 37:
					case 38:
					case 39:
					case 40:
					case 41:
					case 42:
					case 43:
					case 44:
					case 45:
					case 46:
					case 47:
					case 48:
					case 49:
					case 50:
					case 51:
					case 52:
					case 53:
					case 54:
					case 55:
					case 56:
					case 57:
					case 58:
					case 59:
					case 60:
					case 61:
					case 62:
					case 63:
					case 64:
					case 65:
					case 66:
					case 67:
					case 68:
					case 69:
					case 70:
					case 71:
					case 72:
					case 73:
					case 74:
					case 75:
					case 76:
					case 77:
					case 78:
					case 79:
					case 80:
					case 81:
					case 82:
					case 83:
					case 84:
					case 85:
					case 86:
					case 87:
					case 88:
					case 89:
					case 93:
					case 95:
					case 96:
					case 97:
					case 98:
					case 99:
					case 100:
					case 101:
					case 102:
					case 103:
					case 104:
					case 105:
					case 106:
					case 107:
					case 108:
					case 109:
					case 110:
					case 111:
					case 112:
					case 113:
					case 114:
					case 115:
					case 116:
					case 117:
					case 118:
					case 119:
					case 120:
					case 121:
					case 122:
					case 123:
					case 124:
					case 125:
					case 126:
					case 127:
					case 128:
					case 129:
					case 130:
					case 131:
					case 132:
					case 133:
					case 134:
					case 135:
					case 136:
					case 137:
					case 138:
					case 139:
					case 140:
					case 141:
					case 142:
					case 143:
					case 144:
					case 145:
					case 146:
					case 147:
					case 148:
					case 149:
					case 150:
					case 151:
					case 152:
					case 153:
					case 154:
					case 155:
					case 156:
					case 157:
					case 158:
					case 159:
					case 160:
					case 161:
					case 162:
					case 163:
					case 164:
					case 165:
					case 166:
					case 167:
					case 168:
					case 169:
					case 170:
					case 171:
					case 172:
					case 173:
					case 174:
					case 175:
					case 176:
					case 177:
					case 178:
					case 179:
					case 180:
					case 181:
					case 182:
					case 183:
					case 184:
					case 185:
					case 186:
					case 187:
					case 188:
					case 189:
					case 190:
					case 192:
					case 193:
					case 194:
					case 195:
					case 196:
					case 197:
					case 198:
					case 199:
					case 200:
					case 201:
					case 202:
					case 203:
					case 204:
					case 205:
					case 206:
					case 207:
					case 208:
					case 209:
					case 211:
					case 212:
					case 213:
					case 214:
					case 215:
					case 216:
					case 217:
					case 218:
					case 219:
					case 220:
					case 221:
					case 222:
					case 223:
					case 224:
					case 225:
					case 226:
					case 227:
					case 228:
					case 229:
					case 230:
					case 231:
					case 232:
					case 233:
					case 234:
					case 235:
					case 236:
					case 238:
					case 239:
					case 240:
					case 241:
					case 242:
					case 243:
					case 244:
					case 245:
					case 246:
					case 247:
					case 248:
					case 249:
					case 250:
					case 251:
					case 252:
					case 253:
					case 254:
					case 255:
					case 257:
					case 258:
					case 259:
					case 260:
					case 261:
					case 262:
					case 263:
					case 264:
					case 265:
					case 266:
					case 267:
					case 268:
					case 269:
					case 270:
					case 271:
					case 272:
					case 273:
					case 274:
					case 275:
					case 276:
					case 277:
					case 279:
					case 280:
					case 281:
					case 282:
					case 283:
					case 284:
					case 287:
					case 288:
					case 289:
					case 290:
					case 291:
					case 292:
					case 293:
					case 294:
					case 295:
					case 296:
					case 297:
					case 298:
					case 301:
					case 302:
					case 303:
					case 304:
					case 305:
					case 306:
					case 307:
					case 308:
					case 309:
					case 310:
					case 311:
					case 312:
					case 313:
					case 314:
					case 315:
					case 316:
					case 323:
					case 324:
					case 325:
					case 326:
					case 327:
					case 328:
					case 329:
					case 330:
					case 354:
						this.setState(629);
						this.ident();
						break label75;
					case 26:
					case 90:
					case 91:
					case 92:
					case 94:
					case 191:
					case 210:
					case 237:
					case 256:
					case 278:
					case 285:
					case 286:
					case 299:
					case 300:
					case 317:
					case 318:
					case 319:
					case 320:
					case 321:
					case 322:
					case 331:
					case 332:
					case 333:
					case 334:
					case 335:
					case 336:
					case 337:
					case 338:
					case 339:
					case 340:
					case 341:
					case 342:
					case 343:
					case 344:
					case 345:
					case 346:
					case 348:
					case 349:
					case 350:
					case 351:
					case 352:
					case 353:
					default:
						throw new NoViableAltException(this);
					case 347:
						this.setState(630);
						this.match(347);
						this.setState(631);
						this.ident();
						this.setState(636);
						this._errHandler.sync(this);
						_la = this._input.LA(1);
				}

				while(true) {
					if (_la != 333) {
						this.setState(639);
						this.match(350);
						break;
					}

					this.setState(632);
					this.match(333);
					this.setState(633);
					this.ident();
					this.setState(638);
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
			}

			this.setState(644);
			_la = this._input.LA(1);
			if (_la == 332) {
				this.setState(643);
				this.match(332);
			}

			this.setState(646);
			this.match(337);
			this.setState(647);
			this.match(347);
			this.setState(648);
			this.select_stmt();
			this.setState(649);
			this.match(350);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Allocate_cursor_stmtContext allocate_cursor_stmt() throws RecognitionException {
		HplsqlParser.Allocate_cursor_stmtContext _localctx = new HplsqlParser.Allocate_cursor_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 34, 17);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(651);
			this.match(9);
			this.setState(652);
			this.ident();
			this.setState(653);
			this.match(62);
			this.setState(654);
			this.match(110);
			this.setState(658);
			switch(this._input.LA(1)) {
				case 216:
					this.setState(657);
					this.match(216);
					break;
				case 226:
					this.setState(655);
					this.match(226);
					this.setState(656);
					this.match(248);
					break;
				default:
					throw new NoViableAltException(this);
			}

			this.setState(660);
			this.ident();
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Associate_locator_stmtContext associate_locator_stmt() throws RecognitionException {
		HplsqlParser.Associate_locator_stmtContext _localctx = new HplsqlParser.Associate_locator_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 36, 18);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(662);
			this.match(16);
			this.setState(665);
			int _la = this._input.LA(1);
			if (_la == 226) {
				this.setState(663);
				this.match(226);
				this.setState(664);
				this.match(248);
			}

			this.setState(667);
			_la = this._input.LA(1);
			if (_la != 164 && _la != 165) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}

			this.setState(668);
			this.match(347);
			this.setState(669);
			this.ident();
			this.setState(674);
			this._errHandler.sync(this);

			for(_la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
				this.setState(670);
				this.match(333);
				this.setState(671);
				this.ident();
				this.setState(676);
				this._errHandler.sync(this);
			}

			this.setState(677);
			this.match(350);
			this.setState(678);
			this.match(302);
			this.setState(679);
			this.match(216);
			this.setState(680);
			this.ident();
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Begin_transaction_stmtContext begin_transaction_stmt() throws RecognitionException {
		HplsqlParser.Begin_transaction_stmtContext _localctx = new HplsqlParser.Begin_transaction_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 38, 19);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(682);
			this.match(21);
			this.setState(683);
			this.match(282);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Break_stmtContext break_stmt() throws RecognitionException {
		HplsqlParser.Break_stmtContext _localctx = new HplsqlParser.Break_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 40, 20);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(685);
			this.match(29);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Call_stmtContext call_stmt() throws RecognitionException {
		HplsqlParser.Call_stmtContext _localctx = new HplsqlParser.Call_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 42, 21);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(687);
			this.match(32);
			this.setState(688);
			this.ident();
			this.setState(695);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 30, this._ctx)) {
				case 1:
					this.setState(689);
					this.match(347);
					this.setState(691);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 29, this._ctx)) {
						case 1:
							this.setState(690);
							this.expr_func_params();
						default:
							this.setState(693);
							this.match(350);
							return _localctx;
					}
				case 2:
					this.setState(694);
					this.expr_func_params();
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Declare_stmtContext declare_stmt() throws RecognitionException {
		HplsqlParser.Declare_stmtContext _localctx = new HplsqlParser.Declare_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 44, 22);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(697);
			this.match(70);
			this.setState(698);
			this.declare_stmt_item();
			this.setState(703);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 31, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 31, this._ctx)) {
				if (_alt == 1) {
					this.setState(699);
					this.match(333);
					this.setState(700);
					this.declare_stmt_item();
				}

				this.setState(705);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Declare_blockContext declare_block() throws RecognitionException {
		HplsqlParser.Declare_blockContext _localctx = new HplsqlParser.Declare_blockContext(this._ctx, this.getState());
		this.enterRule(_localctx, 46, 23);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(706);
			this.match(70);
			this.setState(707);
			this.declare_stmt_item();
			this.setState(708);
			this.match(352);
			this.setState(714);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 32, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 32, this._ctx)) {
				if (_alt == 1) {
					this.setState(709);
					this.declare_stmt_item();
					this.setState(710);
					this.match(352);
				}

				this.setState(716);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Declare_block_inplaceContext declare_block_inplace() throws RecognitionException {
		HplsqlParser.Declare_block_inplaceContext _localctx = new HplsqlParser.Declare_block_inplaceContext(this._ctx, this.getState());
		this.enterRule(_localctx, 48, 24);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(717);
			this.declare_stmt_item();
			this.setState(718);
			this.match(352);
			this.setState(724);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 33, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 33, this._ctx)) {
				if (_alt == 1) {
					this.setState(719);
					this.declare_stmt_item();
					this.setState(720);
					this.match(352);
				}

				this.setState(726);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Declare_stmt_itemContext declare_stmt_item() throws RecognitionException {
		HplsqlParser.Declare_stmt_itemContext _localctx = new HplsqlParser.Declare_stmt_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 50, 25);

		try {
			this.setState(732);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 34, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(727);
					this.declare_cursor_item();
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(728);
					this.declare_var_item();
					break;
				case 3:
					this.enterOuterAlt(_localctx, 3);
					this.setState(729);
					this.declare_condition_item();
					break;
				case 4:
					this.enterOuterAlt(_localctx, 4);
					this.setState(730);
					this.declare_handler_item();
					break;
				case 5:
					this.enterOuterAlt(_localctx, 5);
					this.setState(731);
					this.declare_temporary_table_item();
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Declare_var_itemContext declare_var_item() throws RecognitionException {
		HplsqlParser.Declare_var_itemContext _localctx = new HplsqlParser.Declare_var_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 52, 26);

		try {
			this.setState(769);
			int _la;
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 42, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(734);
					this.ident();
					this.setState(739);
					this._errHandler.sync(this);

					for(_la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
						this.setState(735);
						this.match(333);
						this.setState(736);
						this.ident();
						this.setState(741);
						this._errHandler.sync(this);
					}

					this.setState(743);
					_la = this._input.LA(1);
					if (_la == 14) {
						this.setState(742);
						this.match(14);
					}

					this.setState(745);
					this.dtype();
					this.setState(747);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 37, this._ctx)) {
						case 1:
							this.setState(746);
							this.dtype_len();
						default:
							this.setState(752);
							this._errHandler.sync(this);

							for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 38, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 38, this._ctx)) {
								if (_alt == 1) {
									this.setState(749);
									this.dtype_attr();
								}

								this.setState(754);
								this._errHandler.sync(this);
							}

							this.setState(756);
							switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 39, this._ctx)) {
								case 1:
									this.setState(755);
									this.dtype_default();
									return _localctx;
								default:
									return _localctx;
							}
					}
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(758);
					this.ident();
					this.setState(759);
					this.match(47);
					this.setState(761);
					_la = this._input.LA(1);
					if (_la == 14) {
						this.setState(760);
						this.match(14);
					}

					this.setState(763);
					this.dtype();
					this.setState(765);
					_la = this._input.LA(1);
					if (_la == 347) {
						this.setState(764);
						this.dtype_len();
					}

					this.setState(767);
					this.dtype_default();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Declare_condition_itemContext declare_condition_item() throws RecognitionException {
		HplsqlParser.Declare_condition_itemContext _localctx = new HplsqlParser.Declare_condition_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 54, 27);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(771);
			this.ident();
			this.setState(772);
			this.match(50);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Declare_cursor_itemContext declare_cursor_item() throws RecognitionException {
		HplsqlParser.Declare_cursor_itemContext _localctx = new HplsqlParser.Declare_cursor_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 56, 28);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(779);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 43, this._ctx)) {
				case 1:
					this.setState(774);
					this.match(62);
					this.setState(775);
					this.ident();
					break;
				case 2:
					this.setState(776);
					this.ident();
					this.setState(777);
					this.match(62);
			}

			this.setState(783);
			switch(this._input.LA(1)) {
				case 14:
				case 110:
				case 149:
					break;
				case 302:
					this.setState(781);
					this.cursor_with_return();
					break;
				case 303:
					this.setState(782);
					this.cursor_without_return();
					break;
				default:
					throw new NoViableAltException(this);
			}

			this.setState(785);
			int _la = this._input.LA(1);
			if (_la != 14 && _la != 110 && _la != 149) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}

			this.setState(788);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 45, this._ctx)) {
				case 1:
					this.setState(786);
					this.select_stmt();
					break;
				case 2:
					this.setState(787);
					this.expr(0);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Cursor_with_returnContext cursor_with_return() throws RecognitionException {
		HplsqlParser.Cursor_with_returnContext _localctx = new HplsqlParser.Cursor_with_returnContext(this._ctx, this.getState());
		this.enterRule(_localctx, 58, 29);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(790);
			this.match(302);
			this.setState(791);
			this.match(228);
			this.setState(793);
			int _la = this._input.LA(1);
			if (_la == 197) {
				this.setState(792);
				this.match(197);
			}

			this.setState(797);
			_la = this._input.LA(1);
			if (_la == 280) {
				this.setState(795);
				this.match(280);
				this.setState(796);
				_la = this._input.LA(1);
				if (_la != 33 && _la != 41) {
					this._errHandler.recoverInline(this);
				} else {
					this.consume();
				}
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Cursor_without_returnContext cursor_without_return() throws RecognitionException {
		HplsqlParser.Cursor_without_returnContext _localctx = new HplsqlParser.Cursor_without_returnContext(this._ctx, this.getState());
		this.enterRule(_localctx, 60, 30);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(799);
			this.match(303);
			this.setState(800);
			this.match(228);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Declare_handler_itemContext declare_handler_item() throws RecognitionException {
		HplsqlParser.Declare_handler_itemContext _localctx = new HplsqlParser.Declare_handler_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 62, 31);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(802);
			int _la = this._input.LA(1);
			if (_la != 52 && _la != 103) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}

			this.setState(803);
			this.match(123);
			this.setState(804);
			this.match(110);
			this.setState(810);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 48, this._ctx)) {
				case 1:
					this.setState(805);
					this.match(260);
					break;
				case 2:
					this.setState(806);
					this.match(263);
					break;
				case 3:
					this.setState(807);
					this.match(189);
					this.setState(808);
					this.match(113);
					break;
				case 4:
					this.setState(809);
					this.ident();
			}

			this.setState(812);
			this.single_block_stmt();
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Declare_temporary_table_itemContext declare_temporary_table_item() throws RecognitionException {
		HplsqlParser.Declare_temporary_table_itemContext _localctx = new HplsqlParser.Declare_temporary_table_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 64, 32);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(815);
			int _la = this._input.LA(1);
			if (_la == 119) {
				this.setState(814);
				this.match(119);
			}

			this.setState(817);
			this.match(273);
			this.setState(818);
			this.match(271);
			this.setState(819);
			this.ident();
			this.setState(835);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 52, this._ctx)) {
				case 1:
					this.setState(821);
					_la = this._input.LA(1);
					if (_la == 14) {
						this.setState(820);
						this.match(14);
					}

					this.setState(823);
					this.match(347);
					this.setState(824);
					this.select_stmt();
					this.setState(825);
					this.match(350);
					break;
				case 2:
					this.setState(828);
					_la = this._input.LA(1);
					if (_la == 14) {
						this.setState(827);
						this.match(14);
					}

					this.setState(830);
					this.select_stmt();
					break;
				case 3:
					this.setState(831);
					this.match(347);
					this.setState(832);
					this.create_table_columns();
					this.setState(833);
					this.match(350);
			}

			this.setState(838);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 53, this._ctx)) {
				case 1:
					this.setState(837);
					this.create_table_options();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_table_stmtContext create_table_stmt() throws RecognitionException {
		HplsqlParser.Create_table_stmtContext _localctx = new HplsqlParser.Create_table_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 66, 33);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(840);
			this.match(56);
			this.setState(841);
			this.match(271);
			this.setState(845);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 54, this._ctx)) {
				case 1:
					this.setState(842);
					this.match(130);
					this.setState(843);
					this.match(189);
					this.setState(844);
					this.match(102);
				default:
					this.setState(847);
					this.table_name();
					this.setState(848);
					this.match(347);
					this.setState(849);
					this.create_table_columns();
					this.setState(850);
					this.match(350);
					this.setState(852);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 55, this._ctx)) {
						case 1:
							this.setState(851);
							this.create_table_options();
					}
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_local_temp_table_stmtContext create_local_temp_table_stmt() throws RecognitionException {
		HplsqlParser.Create_local_temp_table_stmtContext _localctx = new HplsqlParser.Create_local_temp_table_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 68, 34);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(854);
			this.match(56);
			this.setState(861);
			int _la;
			switch(this._input.LA(1)) {
				case 162:
					this.setState(855);
					this.match(162);
					this.setState(856);
					this.match(273);
					break;
				case 180:
				case 248:
				case 298:
					this.setState(858);
					_la = this._input.LA(1);
					if (_la == 180 || _la == 248) {
						this.setState(857);
						_la = this._input.LA(1);
						if (_la != 180 && _la != 248) {
							this._errHandler.recoverInline(this);
						} else {
							this.consume();
						}
					}

					this.setState(860);
					this.match(298);
					break;
				default:
					throw new NoViableAltException(this);
			}

			this.setState(863);
			this.match(271);
			this.setState(864);
			this.ident();
			this.setState(866);
			_la = this._input.LA(1);
			if (_la == 333) {
				this.setState(865);
				this.create_table_preoptions();
			}

			this.setState(868);
			this.match(347);
			this.setState(869);
			this.create_table_columns();
			this.setState(870);
			this.match(350);
			this.setState(872);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 59, this._ctx)) {
				case 1:
					this.setState(871);
					this.create_table_options();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_table_columnsContext create_table_columns() throws RecognitionException {
		HplsqlParser.Create_table_columnsContext _localctx = new HplsqlParser.Create_table_columnsContext(this._ctx, this.getState());
		this.enterRule(_localctx, 70, 35);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(874);
			this.create_table_columns_item();
			this.setState(879);
			this._errHandler.sync(this);

			for(int _la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
				this.setState(875);
				this.match(333);
				this.setState(876);
				this.create_table_columns_item();
				this.setState(881);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_table_columns_itemContext create_table_columns_item() throws RecognitionException {
		HplsqlParser.Create_table_columns_itemContext _localctx = new HplsqlParser.Create_table_columns_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 72, 36);

		try {
			this.setState(904);
			int _la;
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 65, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(882);
					this.column_name();
					this.setState(883);
					this.dtype();
					this.setState(885);
					_la = this._input.LA(1);
					if (_la == 347) {
						this.setState(884);
						this.dtype_len();
					}

					this.setState(890);
					this._errHandler.sync(this);

					for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 62, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 62, this._ctx)) {
						if (_alt == 1) {
							this.setState(887);
							this.dtype_attr();
						}

						this.setState(892);
						this._errHandler.sync(this);
					}

					this.setState(896);
					this._errHandler.sync(this);

					for(_la = this._input.LA(1); _la == 18 || (_la - 71 & -64) == 0 && (1L << _la - 71 & 288230376155906049L) != 0L || (_la - 189 & -64) == 0 && (1L << _la - 189 & 4311744517L) != 0L || (_la - 287 & -64) == 0 && (1L << _la - 287 & 1161084278931457L) != 0L; _la = this._input.LA(1)) {
						this.setState(893);
						this.create_table_column_inline_cons();
						this.setState(898);
						this._errHandler.sync(this);
					}

					return _localctx;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(901);
					_la = this._input.LA(1);
					if (_la == 51) {
						this.setState(899);
						this.match(51);
						this.setState(900);
						this.ident();
					}

					this.setState(903);
					this.create_table_column_cons();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Column_nameContext column_name() throws RecognitionException {
		HplsqlParser.Column_nameContext _localctx = new HplsqlParser.Column_nameContext(this._ctx, this.getState());
		this.enterRule(_localctx, 74, 37);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(906);
			this.ident();
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_table_column_inline_consContext create_table_column_inline_cons() throws RecognitionException {
		HplsqlParser.Create_table_column_inline_consContext _localctx = new HplsqlParser.Create_table_column_inline_consContext(this._ctx, this.getState());
		this.enterRule(_localctx, 76, 38);

		try {
			this.setState(940);
			int _la;
			switch(this._input.LA(1)) {
				case 18:
					this.enterOuterAlt(_localctx, 7);
					this.setState(938);
					this.match(18);
					break;
				case 71:
				case 332:
				case 337:
					this.enterOuterAlt(_localctx, 1);
					this.setState(908);
					this.dtype_default();
					break;
				case 93:
					this.enterOuterAlt(_localctx, 8);
					this.setState(939);
					this.match(93);
					break;
				case 129:
					this.enterOuterAlt(_localctx, 6);
					this.setState(927);
					this.match(129);
					this.setState(928);
					this.match(347);
					this.setState(929);
					this.match(357);
					this.setState(934);
					this._errHandler.sync(this);

					for(_la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
						this.setState(930);
						this.match(333);
						this.setState(931);
						this.match(357);
						this.setState(936);
						this._errHandler.sync(this);
					}

					this.setState(937);
					this.match(350);
					break;
				case 189:
				case 191:
					this.enterOuterAlt(_localctx, 2);
					this.setState(910);
					_la = this._input.LA(1);
					if (_la == 189) {
						this.setState(909);
						this.match(189);
					}

					this.setState(912);
					this.match(191);
					break;
				case 213:
					this.enterOuterAlt(_localctx, 3);
					this.setState(913);
					this.match(213);
					this.setState(914);
					this.match(154);
					break;
				case 221:
					this.enterOuterAlt(_localctx, 5);
					this.setState(916);
					this.match(221);
					this.setState(917);
					this.table_name();
					this.setState(918);
					this.match(347);
					this.setState(919);
					this.ident();
					this.setState(920);
					this.match(350);
					this.setState(924);
					this._errHandler.sync(this);

					for(_la = this._input.LA(1); _la == 196; _la = this._input.LA(1)) {
						this.setState(921);
						this.create_table_fk_action();
						this.setState(926);
						this._errHandler.sync(this);
					}

					return _localctx;
				case 287:
					this.enterOuterAlt(_localctx, 4);
					this.setState(915);
					this.match(287);
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_table_column_consContext create_table_column_cons() throws RecognitionException {
		HplsqlParser.Create_table_column_consContext _localctx = new HplsqlParser.Create_table_column_consContext(this._ctx, this.getState());
		this.enterRule(_localctx, 78, 39);

		try {
			this.setState(999);
			int _la;
			switch(this._input.LA(1)) {
				case 111:
					this.enterOuterAlt(_localctx, 2);
					this.setState(969);
					this.match(111);
					this.setState(970);
					this.match(154);
					this.setState(971);
					this.match(347);
					this.setState(972);
					this.ident();
					this.setState(977);
					this._errHandler.sync(this);

					for(_la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
						this.setState(973);
						this.match(333);
						this.setState(974);
						this.ident();
						this.setState(979);
						this._errHandler.sync(this);
					}

					this.setState(980);
					this.match(350);
					this.setState(981);
					this.match(221);
					this.setState(982);
					this.table_name();
					this.setState(983);
					this.match(347);
					this.setState(984);
					this.ident();
					this.setState(989);
					this._errHandler.sync(this);

					for(_la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
						this.setState(985);
						this.match(333);
						this.setState(986);
						this.ident();
						this.setState(991);
						this._errHandler.sync(this);
					}

					this.setState(992);
					this.match(350);
					this.setState(996);
					this._errHandler.sync(this);

					for(_la = this._input.LA(1); _la == 196; _la = this._input.LA(1)) {
						this.setState(993);
						this.create_table_fk_action();
						this.setState(998);
						this._errHandler.sync(this);
					}

					return _localctx;
				case 213:
					this.enterOuterAlt(_localctx, 1);
					this.setState(942);
					this.match(213);
					this.setState(943);
					this.match(154);
					this.setState(945);
					_la = this._input.LA(1);
					if (_la == 43) {
						this.setState(944);
						this.match(43);
					}

					this.setState(947);
					this.match(347);
					this.setState(948);
					this.ident();
					this.setState(950);
					_la = this._input.LA(1);
					if (_la == 15 || _la == 79) {
						this.setState(949);
						_la = this._input.LA(1);
						if (_la != 15 && _la != 79) {
							this._errHandler.recoverInline(this);
						} else {
							this.consume();
						}
					}

					this.setState(959);
					this._errHandler.sync(this);

					for(_la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
						this.setState(952);
						this.match(333);
						this.setState(953);
						this.ident();
						this.setState(955);
						_la = this._input.LA(1);
						if (_la == 15 || _la == 79) {
							this.setState(954);
							_la = this._input.LA(1);
							if (_la != 15 && _la != 79) {
								this._errHandler.recoverInline(this);
							} else {
								this.consume();
							}
						}

						this.setState(961);
						this._errHandler.sync(this);
					}

					this.setState(962);
					this.match(350);
					this.setState(964);
					_la = this._input.LA(1);
					if (_la == 93) {
						this.setState(963);
						this.match(93);
					}

					this.setState(967);
					_la = this._input.LA(1);
					if (_la == 302) {
						this.setState(966);
						this.index_storage_clause();
					}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_table_fk_actionContext create_table_fk_action() throws RecognitionException {
		HplsqlParser.Create_table_fk_actionContext _localctx = new HplsqlParser.Create_table_fk_actionContext(this._ctx, this.getState());
		this.enterRule(_localctx, 80, 40);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1001);
			this.match(196);
			this.setState(1002);
			int _la = this._input.LA(1);
			if (_la != 76 && _la != 288) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}

			this.setState(1011);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 80, this._ctx)) {
				case 1:
					this.setState(1003);
					this.match(184);
					this.setState(1004);
					this.match(6);
					break;
				case 2:
					this.setState(1005);
					this.match(225);
					break;
				case 3:
					this.setState(1006);
					this.match(248);
					this.setState(1007);
					this.match(191);
					break;
				case 4:
					this.setState(1008);
					this.match(248);
					this.setState(1009);
					this.match(71);
					break;
				case 5:
					this.setState(1010);
					this.match(34);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_table_preoptionsContext create_table_preoptions() throws RecognitionException {
		HplsqlParser.Create_table_preoptionsContext _localctx = new HplsqlParser.Create_table_preoptionsContext(this._ctx, this.getState());
		this.enterRule(_localctx, 82, 41);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1015);
			this._errHandler.sync(this);
			int _la = this._input.LA(1);

			do {
				this.setState(1013);
				this.match(333);
				this.setState(1014);
				this.create_table_preoptions_item();
				this.setState(1017);
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while(_la == 333);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_table_preoptions_itemContext create_table_preoptions_item() throws RecognitionException {
		HplsqlParser.Create_table_preoptions_itemContext _localctx = new HplsqlParser.Create_table_preoptions_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 84, 42);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1020);
			int _la = this._input.LA(1);
			if (_la == 184) {
				this.setState(1019);
				this.match(184);
			}

			this.setState(1022);
			this.match(167);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_table_optionsContext create_table_options() throws RecognitionException {
		HplsqlParser.Create_table_optionsContext _localctx = new HplsqlParser.Create_table_optionsContext(this._ctx, this.getState());
		this.enterRule(_localctx, 86, 43);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1025);
			this._errHandler.sync(this);
			int _alt = 1;

			do {
				switch(_alt) {
					case 1:
						this.setState(1024);
						this.create_table_options_item();
						this.setState(1027);
						this._errHandler.sync(this);
						_alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 83, this._ctx);
						break;
					default:
						throw new NoViableAltException(this);
				}
			} while(_alt != 2 && _alt != 0);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_table_options_itemContext create_table_options_item() throws RecognitionException {
		HplsqlParser.Create_table_options_itemContext _localctx = new HplsqlParser.Create_table_options_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 88, 44);

		try {
			this.setState(1038);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 84, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1029);
					this.match(196);
					this.setState(1030);
					this.match(48);
					this.setState(1031);
					int _la = this._input.LA(1);
					if (_la != 76 && _la != 212) {
						this._errHandler.recoverInline(this);
					} else {
						this.consume();
					}

					this.setState(1032);
					this.match(236);
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1033);
					this.create_table_options_ora_item();
					break;
				case 3:
					this.enterOuterAlt(_localctx, 3);
					this.setState(1034);
					this.create_table_options_db2_item();
					break;
				case 4:
					this.enterOuterAlt(_localctx, 4);
					this.setState(1035);
					this.create_table_options_hive_item();
					break;
				case 5:
					this.enterOuterAlt(_localctx, 5);
					this.setState(1036);
					this.create_table_options_mssql_item();
					break;
				case 6:
					this.enterOuterAlt(_localctx, 6);
					this.setState(1037);
					this.create_table_options_mysql_item();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_table_options_ora_itemContext create_table_options_ora_item() throws RecognitionException {
		HplsqlParser.Create_table_options_ora_itemContext _localctx = new HplsqlParser.Create_table_options_ora_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 90, 45);

		try {
			this.setState(1058);
			int _la;
			switch(this._input.LA(1)) {
				case 136:
				case 174:
				case 208:
				case 209:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1043);
					_la = this._input.LA(1);
					if (_la != 136 && _la != 174 && _la != 208 && _la != 209) {
						this._errHandler.recoverInline(this);
					} else {
						this.consume();
					}

					this.setState(1044);
					this.match(357);
					break;
				case 169:
				case 187:
					this.enterOuterAlt(_localctx, 4);
					this.setState(1046);
					_la = this._input.LA(1);
					if (_la != 169 && _la != 187) {
						this._errHandler.recoverInline(this);
					} else {
						this.consume();
					}
					break;
				case 186:
					this.enterOuterAlt(_localctx, 3);
					this.setState(1045);
					this.match(186);
					break;
				case 245:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1040);
					this.match(245);
					this.setState(1041);
					this.match(57);
					this.setState(1042);
					_la = this._input.LA(1);
					if (_la != 72 && _la != 132) {
						this._errHandler.recoverInline(this);
					} else {
						this.consume();
					}
					break;
				case 265:
					this.enterOuterAlt(_localctx, 5);
					this.setState(1047);
					this.match(265);
					this.setState(1048);
					this.match(347);
					this.setState(1051);
					this._errHandler.sync(this);
					_la = this._input.LA(1);

					do {
						do {
							do {
								do {
									do {
										do {
											this.setState(1051);
											switch(this._input.LA(1)) {
												case 6:
												case 7:
												case 8:
												case 9:
												case 10:
												case 11:
												case 12:
												case 13:
												case 14:
												case 15:
												case 16:
												case 17:
												case 18:
												case 19:
												case 20:
												case 21:
												case 22:
												case 23:
												case 24:
												case 25:
												case 27:
												case 28:
												case 29:
												case 30:
												case 31:
												case 32:
												case 33:
												case 34:
												case 35:
												case 36:
												case 37:
												case 38:
												case 39:
												case 40:
												case 41:
												case 42:
												case 43:
												case 44:
												case 45:
												case 46:
												case 47:
												case 48:
												case 49:
												case 50:
												case 51:
												case 52:
												case 53:
												case 54:
												case 55:
												case 56:
												case 57:
												case 58:
												case 59:
												case 60:
												case 61:
												case 62:
												case 63:
												case 64:
												case 65:
												case 66:
												case 67:
												case 68:
												case 69:
												case 70:
												case 71:
												case 72:
												case 73:
												case 74:
												case 75:
												case 76:
												case 77:
												case 78:
												case 79:
												case 80:
												case 81:
												case 82:
												case 83:
												case 84:
												case 85:
												case 86:
												case 87:
												case 88:
												case 89:
												case 93:
												case 95:
												case 96:
												case 97:
												case 98:
												case 99:
												case 100:
												case 101:
												case 102:
												case 103:
												case 104:
												case 105:
												case 106:
												case 107:
												case 108:
												case 109:
												case 110:
												case 111:
												case 112:
												case 113:
												case 114:
												case 115:
												case 116:
												case 117:
												case 118:
												case 119:
												case 120:
												case 121:
												case 122:
												case 123:
												case 124:
												case 125:
												case 126:
												case 127:
												case 128:
												case 129:
												case 130:
												case 131:
												case 132:
												case 133:
												case 134:
												case 135:
												case 136:
												case 137:
												case 138:
												case 139:
												case 140:
												case 141:
												case 142:
												case 143:
												case 144:
												case 145:
												case 146:
												case 147:
												case 148:
												case 149:
												case 150:
												case 151:
												case 152:
												case 153:
												case 154:
												case 155:
												case 156:
												case 157:
												case 158:
												case 159:
												case 160:
												case 161:
												case 162:
												case 163:
												case 164:
												case 165:
												case 166:
												case 167:
												case 168:
												case 169:
												case 170:
												case 171:
												case 172:
												case 173:
												case 174:
												case 175:
												case 176:
												case 177:
												case 178:
												case 179:
												case 180:
												case 181:
												case 182:
												case 183:
												case 184:
												case 185:
												case 186:
												case 187:
												case 188:
												case 189:
												case 190:
												case 192:
												case 193:
												case 194:
												case 195:
												case 196:
												case 197:
												case 198:
												case 199:
												case 200:
												case 201:
												case 202:
												case 203:
												case 204:
												case 205:
												case 206:
												case 207:
												case 208:
												case 209:
												case 211:
												case 212:
												case 213:
												case 214:
												case 215:
												case 216:
												case 217:
												case 218:
												case 219:
												case 220:
												case 221:
												case 222:
												case 223:
												case 224:
												case 225:
												case 226:
												case 227:
												case 228:
												case 229:
												case 230:
												case 231:
												case 232:
												case 233:
												case 234:
												case 235:
												case 236:
												case 238:
												case 239:
												case 240:
												case 241:
												case 242:
												case 243:
												case 244:
												case 245:
												case 246:
												case 247:
												case 248:
												case 249:
												case 250:
												case 251:
												case 252:
												case 253:
												case 254:
												case 255:
												case 257:
												case 258:
												case 259:
												case 260:
												case 261:
												case 262:
												case 263:
												case 264:
												case 265:
												case 266:
												case 267:
												case 268:
												case 269:
												case 270:
												case 271:
												case 272:
												case 273:
												case 274:
												case 275:
												case 276:
												case 277:
												case 279:
												case 280:
												case 281:
												case 282:
												case 283:
												case 284:
												case 287:
												case 288:
												case 289:
												case 290:
												case 291:
												case 292:
												case 293:
												case 294:
												case 295:
												case 296:
												case 297:
												case 298:
												case 301:
												case 302:
												case 303:
												case 304:
												case 305:
												case 306:
												case 307:
												case 308:
												case 309:
												case 310:
												case 311:
												case 312:
												case 313:
												case 314:
												case 315:
												case 316:
												case 323:
												case 324:
												case 325:
												case 326:
												case 327:
												case 328:
												case 329:
												case 330:
												case 354:
													this.setState(1049);
													this.ident();
													break;
												case 26:
												case 90:
												case 91:
												case 92:
												case 94:
												case 191:
												case 210:
												case 237:
												case 256:
												case 278:
												case 285:
												case 286:
												case 299:
												case 300:
												case 317:
												case 318:
												case 319:
												case 320:
												case 321:
												case 322:
												case 331:
												case 332:
												case 333:
												case 334:
												case 335:
												case 336:
												case 337:
												case 338:
												case 339:
												case 340:
												case 341:
												case 342:
												case 343:
												case 344:
												case 345:
												case 346:
												case 347:
												case 348:
												case 349:
												case 350:
												case 351:
												case 352:
												case 353:
												case 355:
												case 356:
												default:
													throw new NoViableAltException(this);
												case 357:
													this.setState(1050);
													this.match(357);
											}

											this.setState(1053);
											this._errHandler.sync(this);
											_la = this._input.LA(1);
										} while((_la & -64) == 0 && (1L << _la & -67108928L) != 0L);
									} while((_la - 64 & -64) == 0 && (1L << _la - 64 & -1543503873L) != 0L);
								} while((_la - 128 & -64) == 0 && (1L << _la - 128 & 9223372036854775807L) != 0L);
							} while((_la - 192 & -64) == 0 && (1L << _la - 192 & -35184372350977L) != 0L);
						} while((_la - 257 & -64) == 0 && (1L << _la - 257 & 1152908309659910143L) != 0L);
					} while((_la - 323 & -64) == 0 && (1L << _la - 323 & 19327353087L) != 0L);

					this.setState(1055);
					this.match(350);
					break;
				case 272:
					this.enterOuterAlt(_localctx, 6);
					this.setState(1056);
					this.match(272);
					this.setState(1057);
					this.ident();
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_table_options_db2_itemContext create_table_options_db2_item() throws RecognitionException {
		HplsqlParser.Create_table_options_db2_itemContext _localctx = new HplsqlParser.Create_table_options_db2_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 92, 46);

		try {
			this.setState(1083);
			switch(this._input.LA(1)) {
				case 75:
					this.enterOuterAlt(_localctx, 6);
					this.setState(1081);
					this.match(75);
					this.setState(1082);
					this.match(197);
					break;
				case 85:
					this.enterOuterAlt(_localctx, 3);
					this.setState(1064);
					this.match(85);
					this.setState(1065);
					this.match(30);
					this.setState(1066);
					this.match(124);
					this.setState(1067);
					this.match(347);
					this.setState(1068);
					this.ident();
					this.setState(1073);
					this._errHandler.sync(this);

					for(int _la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
						this.setState(1069);
						this.match(333);
						this.setState(1070);
						this.ident();
						this.setState(1075);
						this._errHandler.sync(this);
					}

					this.setState(1076);
					this.match(350);
					break;
				case 133:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1060);
					this.match(133);
					this.setState(1061);
					this.ident();
					break;
				case 168:
					this.enterOuterAlt(_localctx, 4);
					this.setState(1078);
					this.match(168);
					break;
				case 189:
					this.enterOuterAlt(_localctx, 5);
					this.setState(1079);
					this.match(189);
					this.setState(1080);
					this.match(168);
					break;
				case 302:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1062);
					this.match(302);
					this.setState(1063);
					this.match(223);
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_table_options_hive_itemContext create_table_options_hive_item() throws RecognitionException {
		HplsqlParser.Create_table_options_hive_itemContext _localctx = new HplsqlParser.Create_table_options_hive_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 94, 47);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1085);
			this.create_table_hive_row_format();
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_table_hive_row_formatContext create_table_hive_row_format() throws RecognitionException {
		HplsqlParser.Create_table_hive_row_formatContext _localctx = new HplsqlParser.Create_table_hive_row_formatContext(this._ctx, this.getState());
		this.enterRule(_localctx, 96, 48);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1087);
			this.match(235);
			this.setState(1088);
			this.match(112);
			this.setState(1089);
			this.match(77);
			this.setState(1093);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 90, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 90, this._ctx)) {
				if (_alt == 1) {
					this.setState(1090);
					this.create_table_hive_row_format_fields();
				}

				this.setState(1095);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields() throws RecognitionException {
		HplsqlParser.Create_table_hive_row_format_fieldsContext _localctx = new HplsqlParser.Create_table_hive_row_format_fieldsContext(this._ctx, this.getState());
		this.enterRule(_localctx, 98, 49);

		try {
			this.setState(1123);
			switch(this._input.LA(1)) {
				case 45:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1105);
					this.match(45);
					this.setState(1106);
					this.match(151);
					this.setState(1107);
					this.match(274);
					this.setState(1108);
					this.match(30);
					this.setState(1109);
					this.expr(0);
					break;
				case 106:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1096);
					this.match(106);
					this.setState(1097);
					this.match(274);
					this.setState(1098);
					this.match(30);
					this.setState(1099);
					this.expr(0);
					this.setState(1103);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 91, this._ctx)) {
						case 1:
							this.setState(1100);
							this.match(96);
							this.setState(1101);
							this.match(30);
							this.setState(1102);
							this.expr(0);
							return _localctx;
						default:
							return _localctx;
					}
				case 161:
					this.enterOuterAlt(_localctx, 4);
					this.setState(1115);
					this.match(161);
					this.setState(1116);
					this.match(274);
					this.setState(1117);
					this.match(30);
					this.setState(1118);
					this.expr(0);
					break;
				case 171:
					this.enterOuterAlt(_localctx, 3);
					this.setState(1110);
					this.match(171);
					this.setState(1111);
					this.match(155);
					this.setState(1112);
					this.match(274);
					this.setState(1113);
					this.match(30);
					this.setState(1114);
					this.expr(0);
					break;
				case 191:
					this.enterOuterAlt(_localctx, 5);
					this.setState(1119);
					this.match(191);
					this.setState(1120);
					this.match(73);
					this.setState(1121);
					this.match(14);
					this.setState(1122);
					this.expr(0);
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_table_options_mssql_itemContext create_table_options_mssql_item() throws RecognitionException {
		HplsqlParser.Create_table_options_mssql_itemContext _localctx = new HplsqlParser.Create_table_options_mssql_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 100, 50);

		try {
			this.setState(1129);
			switch(this._input.LA(1)) {
				case 196:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1125);
					this.match(196);
					this.setState(1126);
					this.ident();
					break;
				case 275:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1127);
					this.match(275);
					this.setState(1128);
					this.ident();
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_table_options_mysql_itemContext create_table_options_mysql_item() throws RecognitionException {
		HplsqlParser.Create_table_options_mysql_itemContext _localctx = new HplsqlParser.Create_table_options_mysql_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 102, 51);

		try {
			this.setState(1158);
			int _la;
			switch(this._input.LA(1)) {
				case 18:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1131);
					this.match(18);
					this.setState(1133);
					_la = this._input.LA(1);
					if (_la == 337) {
						this.setState(1132);
						this.match(337);
					}

					this.setState(1135);
					this.expr(0);
					break;
				case 39:
				case 40:
				case 71:
					this.enterOuterAlt(_localctx, 3);
					this.setState(1142);
					_la = this._input.LA(1);
					if (_la == 71) {
						this.setState(1141);
						this.match(71);
					}

					this.setState(1147);
					switch(this._input.LA(1)) {
						case 39:
							this.setState(1144);
							this.match(39);
							this.setState(1145);
							this.match(248);
							break;
						case 40:
							this.setState(1146);
							this.match(40);
							break;
						default:
							throw new NoViableAltException(this);
					}

					this.setState(1150);
					_la = this._input.LA(1);
					if (_la == 337) {
						this.setState(1149);
						this.match(337);
					}

					this.setState(1152);
					this.expr(0);
					break;
				case 46:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1136);
					this.match(46);
					this.setState(1138);
					_la = this._input.LA(1);
					if (_la == 337) {
						this.setState(1137);
						this.match(337);
					}

					this.setState(1140);
					this.expr(0);
					break;
				case 95:
					this.enterOuterAlt(_localctx, 4);
					this.setState(1153);
					this.match(95);
					this.setState(1155);
					_la = this._input.LA(1);
					if (_la == 337) {
						this.setState(1154);
						this.match(337);
					}

					this.setState(1157);
					this.expr(0);
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		HplsqlParser.Alter_table_stmtContext _localctx = new HplsqlParser.Alter_table_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 104, 52);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1160);
			this.match(10);
			this.setState(1161);
			this.match(271);
			this.setState(1162);
			this.table_name();
			this.setState(1163);
			this.alter_table_item();
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Alter_table_itemContext alter_table_item() throws RecognitionException {
		HplsqlParser.Alter_table_itemContext _localctx = new HplsqlParser.Alter_table_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 106, 53);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1165);
			this.alter_table_add_constraint();
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		HplsqlParser.Alter_table_add_constraintContext _localctx = new HplsqlParser.Alter_table_add_constraintContext(this._ctx, this.getState());
		this.enterRule(_localctx, 108, 54);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1167);
			this.match(7);
			this.setState(1170);
			int _la = this._input.LA(1);
			if (_la == 51) {
				this.setState(1168);
				this.match(51);
				this.setState(1169);
				this.ident();
			}

			this.setState(1172);
			this.alter_table_add_constraint_item();
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Alter_table_add_constraint_itemContext alter_table_add_constraint_item() throws RecognitionException {
		HplsqlParser.Alter_table_add_constraint_itemContext _localctx = new HplsqlParser.Alter_table_add_constraint_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 110, 55);

		try {
			this.setState(1236);
			int _la;
			switch(this._input.LA(1)) {
				case 71:
					this.enterOuterAlt(_localctx, 3);
					this.setState(1231);
					this.match(71);
					this.setState(1232);
					this.expr(0);
					this.setState(1233);
					this.match(110);
					this.setState(1234);
					this.ident();
					break;
				case 111:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1201);
					this.match(111);
					this.setState(1202);
					this.match(154);
					this.setState(1203);
					this.match(347);
					this.setState(1204);
					this.ident();
					this.setState(1209);
					this._errHandler.sync(this);

					for(_la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
						this.setState(1205);
						this.match(333);
						this.setState(1206);
						this.ident();
						this.setState(1211);
						this._errHandler.sync(this);
					}

					this.setState(1212);
					this.match(350);
					this.setState(1213);
					this.match(221);
					this.setState(1214);
					this.table_name();
					this.setState(1215);
					this.match(347);
					this.setState(1216);
					this.ident();
					this.setState(1221);
					this._errHandler.sync(this);

					for(_la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
						this.setState(1217);
						this.match(333);
						this.setState(1218);
						this.ident();
						this.setState(1223);
						this._errHandler.sync(this);
					}

					this.setState(1224);
					this.match(350);
					this.setState(1228);
					this._errHandler.sync(this);

					for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 110, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 110, this._ctx)) {
						if (_alt == 1) {
							this.setState(1225);
							this.create_table_fk_action();
						}

						this.setState(1230);
						this._errHandler.sync(this);
					}

					return _localctx;
				case 213:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1174);
					this.match(213);
					this.setState(1175);
					this.match(154);
					this.setState(1177);
					_la = this._input.LA(1);
					if (_la == 43) {
						this.setState(1176);
						this.match(43);
					}

					this.setState(1179);
					this.match(347);
					this.setState(1180);
					this.ident();
					this.setState(1182);
					_la = this._input.LA(1);
					if (_la == 15 || _la == 79) {
						this.setState(1181);
						_la = this._input.LA(1);
						if (_la != 15 && _la != 79) {
							this._errHandler.recoverInline(this);
						} else {
							this.consume();
						}
					}

					this.setState(1191);
					this._errHandler.sync(this);

					for(_la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
						this.setState(1184);
						this.match(333);
						this.setState(1185);
						this.ident();
						this.setState(1187);
						_la = this._input.LA(1);
						if (_la == 15 || _la == 79) {
							this.setState(1186);
							_la = this._input.LA(1);
							if (_la != 15 && _la != 79) {
								this._errHandler.recoverInline(this);
							} else {
								this.consume();
							}
						}

						this.setState(1193);
						this._errHandler.sync(this);
					}

					this.setState(1194);
					this.match(350);
					this.setState(1196);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 106, this._ctx)) {
						case 1:
							this.setState(1195);
							this.match(93);
						default:
							this.setState(1199);
							switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 107, this._ctx)) {
								case 1:
									this.setState(1198);
									this.index_storage_clause();
									return _localctx;
								default:
									return _localctx;
							}
					}
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.DtypeContext dtype() throws RecognitionException {
		HplsqlParser.DtypeContext _localctx = new HplsqlParser.DtypeContext(this._ctx, this.getState());
		this.enterRule(_localctx, 112, 56);

		try {
			this.setState(1283);
			switch(this._input.LA(1)) {
				case 23:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1239);
					this.match(23);
					break;
				case 24:
					this.enterOuterAlt(_localctx, 3);
					this.setState(1240);
					this.match(24);
					break;
				case 25:
					this.enterOuterAlt(_localctx, 4);
					this.setState(1241);
					this.match(25);
					break;
				case 26:
					this.enterOuterAlt(_localctx, 5);
					this.setState(1242);
					this.match(26);
					break;
				case 27:
					this.enterOuterAlt(_localctx, 6);
					this.setState(1243);
					this.match(27);
					break;
				case 38:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1238);
					this.match(38);
					break;
				case 64:
					this.enterOuterAlt(_localctx, 7);
					this.setState(1244);
					this.match(64);
					break;
				case 65:
					this.enterOuterAlt(_localctx, 8);
					this.setState(1245);
					this.match(65);
					break;
				case 68:
					this.enterOuterAlt(_localctx, 9);
					this.setState(1246);
					this.match(68);
					break;
				case 69:
					this.enterOuterAlt(_localctx, 10);
					this.setState(1247);
					this.match(69);
					break;
				case 87:
					this.enterOuterAlt(_localctx, 11);
					this.setState(1248);
					this.match(87);
					this.setState(1250);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 112, this._ctx)) {
						case 1:
							this.setState(1249);
							this.match(211);
							return _localctx;
						default:
							return _localctx;
					}
				case 109:
					this.enterOuterAlt(_localctx, 12);
					this.setState(1252);
					this.match(109);
					break;
				case 140:
					this.enterOuterAlt(_localctx, 13);
					this.setState(1253);
					this.match(140);
					break;
				case 141:
					this.enterOuterAlt(_localctx, 14);
					this.setState(1254);
					this.match(141);
					break;
				case 142:
					this.enterOuterAlt(_localctx, 15);
					this.setState(1255);
					this.match(142);
					break;
				case 143:
					this.enterOuterAlt(_localctx, 16);
					this.setState(1256);
					this.match(143);
					break;
				case 144:
					this.enterOuterAlt(_localctx, 17);
					this.setState(1257);
					this.match(144);
					break;
				case 181:
					this.enterOuterAlt(_localctx, 18);
					this.setState(1258);
					this.match(181);
					break;
				case 183:
					this.enterOuterAlt(_localctx, 19);
					this.setState(1259);
					this.match(183);
					break;
				case 192:
					this.enterOuterAlt(_localctx, 21);
					this.setState(1261);
					this.match(192);
					break;
				case 193:
					this.enterOuterAlt(_localctx, 20);
					this.setState(1260);
					this.match(193);
					break;
				case 210:
					this.enterOuterAlt(_localctx, 22);
					this.setState(1262);
					this.match(210);
					break;
				case 220:
					this.enterOuterAlt(_localctx, 23);
					this.setState(1263);
					this.match(220);
					break;
				case 227:
					this.enterOuterAlt(_localctx, 24);
					this.setState(1264);
					this.match(227);
					this.setState(1265);
					this.match(297);
					break;
				case 254:
					this.enterOuterAlt(_localctx, 26);
					this.setState(1267);
					this.match(254);
					break;
				case 255:
					this.enterOuterAlt(_localctx, 25);
					this.setState(1266);
					this.match(255);
					break;
				case 256:
					this.enterOuterAlt(_localctx, 27);
					this.setState(1268);
					this.match(256);
					break;
				case 257:
					this.enterOuterAlt(_localctx, 29);
					this.setState(1270);
					this.match(257);
					break;
				case 258:
					this.enterOuterAlt(_localctx, 28);
					this.setState(1269);
					this.match(258);
					break;
				case 266:
					this.enterOuterAlt(_localctx, 30);
					this.setState(1271);
					this.match(266);
					break;
				case 270:
					this.enterOuterAlt(_localctx, 31);
					this.setState(1272);
					this.match(270);
					break;
				case 277:
					this.enterOuterAlt(_localctx, 32);
					this.setState(1273);
					this.match(277);
					break;
				case 278:
					this.enterOuterAlt(_localctx, 33);
					this.setState(1274);
					this.match(278);
					break;
				case 295:
					this.enterOuterAlt(_localctx, 34);
					this.setState(1275);
					this.match(295);
					break;
				case 296:
					this.enterOuterAlt(_localctx, 35);
					this.setState(1276);
					this.match(296);
					break;
				case 306:
					this.enterOuterAlt(_localctx, 36);
					this.setState(1277);
					this.match(306);
					break;
				case 354:
					this.enterOuterAlt(_localctx, 37);
					this.setState(1278);
					this.match(354);
					this.setState(1281);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 113, this._ctx)) {
						case 1:
							this.setState(1279);
							this.match(3);
							this.setState(1280);
							int _la = this._input.LA(1);
							if (_la != 237 && _la != 285) {
								this._errHandler.recoverInline(this);
							} else {
								this.consume();
							}

							return _localctx;
						default:
							return _localctx;
					}
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Dtype_lenContext dtype_len() throws RecognitionException {
		HplsqlParser.Dtype_lenContext _localctx = new HplsqlParser.Dtype_lenContext(this._ctx, this.getState());
		this.enterRule(_localctx, 114, 57);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1285);
			this.match(347);
			this.setState(1286);
			int _la = this._input.LA(1);
			if (_la != 173 && _la != 357) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}

			this.setState(1288);
			_la = this._input.LA(1);
			if (_la == 31 || _la == 38) {
				this.setState(1287);
				_la = this._input.LA(1);
				if (_la != 31 && _la != 38) {
					this._errHandler.recoverInline(this);
				} else {
					this.consume();
				}
			}

			this.setState(1292);
			_la = this._input.LA(1);
			if (_la == 333) {
				this.setState(1290);
				this.match(333);
				this.setState(1291);
				this.match(357);
			}

			this.setState(1294);
			this.match(350);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Dtype_attrContext dtype_attr() throws RecognitionException {
		HplsqlParser.Dtype_attrContext _localctx = new HplsqlParser.Dtype_attrContext(this._ctx, this.getState());
		this.enterRule(_localctx, 116, 58);

		try {
			this.setState(1307);
			int _la;
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 119, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1297);
					_la = this._input.LA(1);
					if (_la == 189) {
						this.setState(1296);
						this.match(189);
					}

					this.setState(1299);
					this.match(191);
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1300);
					this.match(39);
					this.setState(1301);
					this.match(248);
					this.setState(1302);
					this.ident();
					break;
				case 3:
					this.enterOuterAlt(_localctx, 3);
					this.setState(1304);
					_la = this._input.LA(1);
					if (_la == 189) {
						this.setState(1303);
						this.match(189);
					}

					this.setState(1306);
					_la = this._input.LA(1);
					if (_la != 36 && _la != 59) {
						this._errHandler.recoverInline(this);
					} else {
						this.consume();
					}
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Dtype_defaultContext dtype_default() throws RecognitionException {
		HplsqlParser.Dtype_defaultContext _localctx = new HplsqlParser.Dtype_defaultContext(this._ctx, this.getState());
		this.enterRule(_localctx, 118, 59);

		try {
			this.setState(1316);
			switch(this._input.LA(1)) {
				case 71:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1314);
					this.match(71);
					this.setState(1315);
					this.expr(0);
					break;
				case 332:
				case 337:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1310);
					int _la = this._input.LA(1);
					if (_la == 332) {
						this.setState(1309);
						this.match(332);
					}

					this.setState(1312);
					this.match(337);
					this.setState(1313);
					this.expr(0);
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_database_stmtContext create_database_stmt() throws RecognitionException {
		HplsqlParser.Create_database_stmtContext _localctx = new HplsqlParser.Create_database_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 120, 60);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1318);
			this.match(56);
			this.setState(1319);
			int _la = this._input.LA(1);
			if (_la != 63 && _la != 243) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}

			this.setState(1323);
			int _alt;
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 122, this._ctx)) {
				case 1:
					this.setState(1320);
					this.match(130);
					this.setState(1321);
					this.match(189);
					this.setState(1322);
					this.match(102);
				default:
					this.setState(1325);
					this.expr(0);
					this.setState(1329);
					this._errHandler.sync(this);
					_alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 123, this._ctx);
			}

			while(_alt != 2 && _alt != 0) {
				if (_alt == 1) {
					this.setState(1326);
					this.create_database_option();
				}

				this.setState(1331);
				this._errHandler.sync(this);
				_alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 123, this._ctx);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_database_optionContext create_database_option() throws RecognitionException {
		HplsqlParser.Create_database_optionContext _localctx = new HplsqlParser.Create_database_optionContext(this._ctx, this.getState());
		this.enterRule(_localctx, 122, 61);

		try {
			this.setState(1336);
			switch(this._input.LA(1)) {
				case 46:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1332);
					this.match(46);
					this.setState(1333);
					this.expr(0);
					break;
				case 163:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1334);
					this.match(163);
					this.setState(1335);
					this.expr(0);
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_function_stmtContext create_function_stmt() throws RecognitionException {
		HplsqlParser.Create_function_stmtContext _localctx = new HplsqlParser.Create_function_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 124, 62);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1345);
			int _la;
			switch(this._input.LA(1)) {
				case 10:
					this.setState(1338);
					this.match(10);
					break;
				case 56:
					this.setState(1339);
					this.match(56);
					this.setState(1342);
					_la = this._input.LA(1);
					if (_la == 199) {
						this.setState(1340);
						this.match(199);
						this.setState(1341);
						this.match(223);
					}
				case 117:
					break;
				case 223:
					this.setState(1344);
					this.match(223);
					break;
				default:
					throw new NoViableAltException(this);
			}

			this.setState(1347);
			this.match(117);
			this.setState(1348);
			this.ident();
			this.setState(1350);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 127, this._ctx)) {
				case 1:
					this.setState(1349);
					this.create_routine_params();
			}

			this.setState(1352);
			this.create_function_return();
			this.setState(1354);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 128, this._ctx)) {
				case 1:
					this.setState(1353);
					_la = this._input.LA(1);
					if (_la != 14 && _la != 149) {
						this._errHandler.recoverInline(this);
					} else {
						this.consume();
					}
			}

			this.setState(1357);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 129, this._ctx)) {
				case 1:
					this.setState(1356);
					this.declare_block_inplace();
				default:
					this.setState(1359);
					this.single_block_stmt();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_function_returnContext create_function_return() throws RecognitionException {
		HplsqlParser.Create_function_returnContext _localctx = new HplsqlParser.Create_function_returnContext(this._ctx, this.getState());
		this.enterRule(_localctx, 126, 63);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1361);
			int _la = this._input.LA(1);
			if (_la != 228 && _la != 229) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}

			this.setState(1362);
			this.dtype();
			this.setState(1364);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 130, this._ctx)) {
				case 1:
					this.setState(1363);
					this.dtype_len();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_package_stmtContext create_package_stmt() throws RecognitionException {
		HplsqlParser.Create_package_stmtContext _localctx = new HplsqlParser.Create_package_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 128, 64);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1373);
			int _la;
			switch(this._input.LA(1)) {
				case 10:
					this.setState(1366);
					this.match(10);
					break;
				case 56:
					this.setState(1367);
					this.match(56);
					this.setState(1370);
					_la = this._input.LA(1);
					if (_la == 199) {
						this.setState(1368);
						this.match(199);
						this.setState(1369);
						this.match(223);
					}
				case 206:
					break;
				case 223:
					this.setState(1372);
					this.match(223);
					break;
				default:
					throw new NoViableAltException(this);
			}

			this.setState(1375);
			this.match(206);
			this.setState(1376);
			this.ident();
			this.setState(1377);
			_la = this._input.LA(1);
			if (_la != 14 && _la != 149) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}

			this.setState(1378);
			this.package_spec();
			this.setState(1379);
			this.match(94);
			this.setState(1383);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 133, this._ctx)) {
				case 1:
					this.setState(1380);
					this.ident();
					this.setState(1381);
					this.match(352);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Package_specContext package_spec() throws RecognitionException {
		HplsqlParser.Package_specContext _localctx = new HplsqlParser.Package_specContext(this._ctx, this.getState());
		this.enterRule(_localctx, 130, 65);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1385);
			this.package_spec_item();
			this.setState(1386);
			this.match(352);
			this.setState(1392);
			this._errHandler.sync(this);

			for(int _la = this._input.LA(1); (_la & -64) == 0 && (1L << _la & -67108928L) != 0L || (_la - 64 & -64) == 0 && (1L << _la - 64 & -1543503873L) != 0L || (_la - 128 & -64) == 0 && (1L << _la - 128 & 9223372036854775807L) != 0L || (_la - 192 & -64) == 0 && (1L << _la - 192 & -35184372350977L) != 0L || (_la - 257 & -64) == 0 && (1L << _la - 257 & 1152908309659910143L) != 0L || (_la - 323 & -64) == 0 && (1L << _la - 323 & 2147483903L) != 0L; _la = this._input.LA(1)) {
				this.setState(1387);
				this.package_spec_item();
				this.setState(1388);
				this.match(352);
				this.setState(1394);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Package_spec_itemContext package_spec_item() throws RecognitionException {
		HplsqlParser.Package_spec_itemContext _localctx = new HplsqlParser.Package_spec_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 132, 66);

		try {
			this.setState(1408);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 137, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1395);
					this.declare_stmt_item();
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1396);
					this.match(117);
					this.setState(1397);
					this.ident();
					this.setState(1399);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 135, this._ctx)) {
						case 1:
							this.setState(1398);
							this.create_routine_params();
						default:
							this.setState(1401);
							this.create_function_return();
							return _localctx;
					}
				case 3:
					this.enterOuterAlt(_localctx, 3);
					this.setState(1403);
					int _la = this._input.LA(1);
					if (_la != 215 && _la != 216) {
						this._errHandler.recoverInline(this);
					} else {
						this.consume();
					}

					this.setState(1404);
					this.ident();
					this.setState(1406);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 136, this._ctx)) {
						case 1:
							this.setState(1405);
							this.create_routine_params();
					}
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_package_body_stmtContext create_package_body_stmt() throws RecognitionException {
		HplsqlParser.Create_package_body_stmtContext _localctx = new HplsqlParser.Create_package_body_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 134, 67);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1417);
			int _la;
			switch(this._input.LA(1)) {
				case 10:
					this.setState(1410);
					this.match(10);
					break;
				case 56:
					this.setState(1411);
					this.match(56);
					this.setState(1414);
					_la = this._input.LA(1);
					if (_la == 199) {
						this.setState(1412);
						this.match(199);
						this.setState(1413);
						this.match(223);
					}
				case 206:
					break;
				case 223:
					this.setState(1416);
					this.match(223);
					break;
				default:
					throw new NoViableAltException(this);
			}

			this.setState(1419);
			this.match(206);
			this.setState(1420);
			this.match(28);
			this.setState(1421);
			this.ident();
			this.setState(1422);
			_la = this._input.LA(1);
			if (_la != 14 && _la != 149) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}

			this.setState(1423);
			this.package_body();
			this.setState(1424);
			this.match(94);
			this.setState(1428);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 140, this._ctx)) {
				case 1:
					this.setState(1425);
					this.ident();
					this.setState(1426);
					this.match(352);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Package_bodyContext package_body() throws RecognitionException {
		HplsqlParser.Package_bodyContext _localctx = new HplsqlParser.Package_bodyContext(this._ctx, this.getState());
		this.enterRule(_localctx, 136, 68);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1430);
			this.package_body_item();
			this.setState(1431);
			this.match(352);
			this.setState(1437);
			this._errHandler.sync(this);

			for(int _la = this._input.LA(1); (_la & -64) == 0 && (1L << _la & -67108928L) != 0L || (_la - 64 & -64) == 0 && (1L << _la - 64 & -1543503873L) != 0L || (_la - 128 & -64) == 0 && (1L << _la - 128 & 9223372036854775807L) != 0L || (_la - 192 & -64) == 0 && (1L << _la - 192 & -35184372350977L) != 0L || (_la - 257 & -64) == 0 && (1L << _la - 257 & 1152908309659910143L) != 0L || (_la - 323 & -64) == 0 && (1L << _la - 323 & 2147483903L) != 0L; _la = this._input.LA(1)) {
				this.setState(1432);
				this.package_body_item();
				this.setState(1433);
				this.match(352);
				this.setState(1439);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Package_body_itemContext package_body_item() throws RecognitionException {
		HplsqlParser.Package_body_itemContext _localctx = new HplsqlParser.Package_body_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 138, 69);

		try {
			this.setState(1443);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 142, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1440);
					this.declare_stmt_item();
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1441);
					this.create_function_stmt();
					break;
				case 3:
					this.enterOuterAlt(_localctx, 3);
					this.setState(1442);
					this.create_procedure_stmt();
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_procedure_stmtContext create_procedure_stmt() throws RecognitionException {
		HplsqlParser.Create_procedure_stmtContext _localctx = new HplsqlParser.Create_procedure_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 140, 70);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1452);
			int _la;
			switch(this._input.LA(1)) {
				case 10:
					this.setState(1445);
					this.match(10);
					break;
				case 56:
					this.setState(1446);
					this.match(56);
					this.setState(1449);
					_la = this._input.LA(1);
					if (_la == 199) {
						this.setState(1447);
						this.match(199);
						this.setState(1448);
						this.match(223);
					}
				case 215:
				case 216:
					break;
				case 223:
					this.setState(1451);
					this.match(223);
					break;
				default:
					throw new NoViableAltException(this);
			}

			this.setState(1454);
			_la = this._input.LA(1);
			if (_la != 215 && _la != 216) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}

			this.setState(1455);
			this.ident();
			this.setState(1457);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 145, this._ctx)) {
				case 1:
					this.setState(1456);
					this.create_routine_params();
				default:
					this.setState(1460);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 146, this._ctx)) {
						case 1:
							this.setState(1459);
							this.create_routine_options();
					}

					this.setState(1463);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 147, this._ctx)) {
						case 1:
							this.setState(1462);
							_la = this._input.LA(1);
							if (_la != 14 && _la != 149) {
								this._errHandler.recoverInline(this);
							} else {
								this.consume();
							}
					}

					this.setState(1466);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 148, this._ctx)) {
						case 1:
							this.setState(1465);
							this.declare_block_inplace();
						default:
							this.setState(1469);
							switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 149, this._ctx)) {
								case 1:
									this.setState(1468);
									this.label();
								default:
									this.setState(1471);
									this.proc_block();
									this.setState(1475);
									switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 150, this._ctx)) {
										case 1:
											this.setState(1472);
											this.ident();
											this.setState(1473);
											this.match(352);
									}
							}
					}
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_routine_paramsContext create_routine_params() throws RecognitionException {
		HplsqlParser.Create_routine_paramsContext _localctx = new HplsqlParser.Create_routine_paramsContext(this._ctx, this.getState());
		this.enterRule(_localctx, 142, 71);

		try {
			this.setState(1499);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 153, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1477);
					this.match(347);
					this.setState(1478);
					this.match(350);
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1479);
					this.match(347);
					this.setState(1480);
					this.create_routine_param_item();
					this.setState(1485);
					this._errHandler.sync(this);

					for(int _la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
						this.setState(1481);
						this.match(333);
						this.setState(1482);
						this.create_routine_param_item();
						this.setState(1487);
						this._errHandler.sync(this);
					}

					this.setState(1488);
					this.match(350);
					break;
				case 3:
					this.enterOuterAlt(_localctx, 3);
					this.setState(1490);
					if (this._input.LT(1).getText().equalsIgnoreCase("IS") || this._input.LT(1).getText().equalsIgnoreCase("AS")) {
						throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\")");
					}

					this.setState(1491);
					this.create_routine_param_item();
					this.setState(1496);
					this._errHandler.sync(this);

					for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 152, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 152, this._ctx)) {
						if (_alt == 1) {
							this.setState(1492);
							this.match(333);
							this.setState(1493);
							this.create_routine_param_item();
						}

						this.setState(1498);
						this._errHandler.sync(this);
					}
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_routine_param_itemContext create_routine_param_item() throws RecognitionException {
		HplsqlParser.Create_routine_param_itemContext _localctx = new HplsqlParser.Create_routine_param_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 144, 72);

		try {
			this.setState(1543);
			int _alt;
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 162, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1506);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 154, this._ctx)) {
						case 1:
							this.setState(1501);
							this.match(133);
							break;
						case 2:
							this.setState(1502);
							this.match(201);
							break;
						case 3:
							this.setState(1503);
							this.match(138);
							break;
						case 4:
							this.setState(1504);
							this.match(133);
							this.setState(1505);
							this.match(201);
					}

					this.setState(1508);
					this.ident();
					this.setState(1509);
					this.dtype();
					this.setState(1511);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 155, this._ctx)) {
						case 1:
							this.setState(1510);
							this.dtype_len();
						default:
							this.setState(1516);
							this._errHandler.sync(this);

							for(_alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 156, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 156, this._ctx)) {
								if (_alt == 1) {
									this.setState(1513);
									this.dtype_attr();
								}

								this.setState(1518);
								this._errHandler.sync(this);
							}

							this.setState(1520);
							switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 157, this._ctx)) {
								case 1:
									this.setState(1519);
									this.dtype_default();
									return _localctx;
								default:
									return _localctx;
							}
					}
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1522);
					this.ident();
					this.setState(1528);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 158, this._ctx)) {
						case 1:
							this.setState(1523);
							this.match(133);
							break;
						case 2:
							this.setState(1524);
							this.match(201);
							break;
						case 3:
							this.setState(1525);
							this.match(138);
							break;
						case 4:
							this.setState(1526);
							this.match(133);
							this.setState(1527);
							this.match(201);
					}

					this.setState(1530);
					this.dtype();
					this.setState(1532);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 159, this._ctx)) {
						case 1:
							this.setState(1531);
							this.dtype_len();
						default:
							this.setState(1537);
							this._errHandler.sync(this);
							_alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 160, this._ctx);
					}

					while(_alt != 2 && _alt != 0) {
						if (_alt == 1) {
							this.setState(1534);
							this.dtype_attr();
						}

						this.setState(1539);
						this._errHandler.sync(this);
						_alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 160, this._ctx);
					}

					this.setState(1541);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 161, this._ctx)) {
						case 1:
							this.setState(1540);
							this.dtype_default();
					}
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_routine_optionsContext create_routine_options() throws RecognitionException {
		HplsqlParser.Create_routine_optionsContext _localctx = new HplsqlParser.Create_routine_optionsContext(this._ctx, this.getState());
		this.enterRule(_localctx, 146, 73);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1546);
			this._errHandler.sync(this);
			int _alt = 1;

			do {
				switch(_alt) {
					case 1:
						this.setState(1545);
						this.create_routine_option();
						this.setState(1548);
						this._errHandler.sync(this);
						_alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 163, this._ctx);
						break;
					default:
						throw new NoViableAltException(this);
				}
			} while(_alt != 2 && _alt != 0);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_routine_optionContext create_routine_option() throws RecognitionException {
		HplsqlParser.Create_routine_optionContext _localctx = new HplsqlParser.Create_routine_optionContext(this._ctx, this.getState());
		this.enterRule(_localctx, 148, 74);

		try {
			this.setState(1561);
			int _la;
			switch(this._input.LA(1)) {
				case 89:
				case 226:
					this.enterOuterAlt(_localctx, 3);
					this.setState(1556);
					_la = this._input.LA(1);
					if (_la == 89) {
						this.setState(1555);
						this.match(89);
					}

					this.setState(1558);
					this.match(226);
					this.setState(1559);
					this.match(251);
					this.setState(1560);
					this.match(357);
					break;
				case 156:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1550);
					this.match(156);
					this.setState(1551);
					this.match(259);
					break;
				case 259:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1552);
					this.match(259);
					this.setState(1553);
					this.match(244);
					this.setState(1554);
					_la = this._input.LA(1);
					if (_la != 58 && _la != 74 && _la != 148 && _la != 205) {
						this._errHandler.recoverInline(this);
					} else {
						this.consume();
					}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Drop_stmtContext drop_stmt() throws RecognitionException {
		HplsqlParser.Drop_stmtContext _localctx = new HplsqlParser.Drop_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 150, 75);

		try {
			this.setState(1577);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 168, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1563);
					this.match(88);
					this.setState(1564);
					this.match(271);
					this.setState(1567);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 166, this._ctx)) {
						case 1:
							this.setState(1565);
							this.match(130);
							this.setState(1566);
							this.match(102);
						default:
							this.setState(1569);
							this.table_name();
							return _localctx;
					}
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1570);
					this.match(88);
					this.setState(1571);
					int _la = this._input.LA(1);
					if (_la != 63 && _la != 243) {
						this._errHandler.recoverInline(this);
					} else {
						this.consume();
					}

					this.setState(1574);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 167, this._ctx)) {
						case 1:
							this.setState(1572);
							this.match(130);
							this.setState(1573);
							this.match(102);
						default:
							this.setState(1576);
							this.expr(0);
					}
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.End_transaction_stmtContext end_transaction_stmt() throws RecognitionException {
		HplsqlParser.End_transaction_stmtContext _localctx = new HplsqlParser.End_transaction_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 152, 76);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1579);
			this.match(94);
			this.setState(1580);
			this.match(282);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Exec_stmtContext exec_stmt() throws RecognitionException {
		HplsqlParser.Exec_stmtContext _localctx = new HplsqlParser.Exec_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 154, 77);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1582);
			int _la = this._input.LA(1);
			if (_la != 98 && _la != 99) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}

			this.setState(1584);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 169, this._ctx)) {
				case 1:
					this.setState(1583);
					this.match(132);
				default:
					this.setState(1586);
					this.expr(0);
					this.setState(1592);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 170, this._ctx)) {
						case 1:
							this.setState(1587);
							this.match(347);
							this.setState(1588);
							this.expr_func_params();
							this.setState(1589);
							this.match(350);
							break;
						case 2:
							this.setState(1591);
							this.expr_func_params();
					}

					this.setState(1603);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 172, this._ctx)) {
						case 1:
							this.setState(1594);
							this.match(147);
							this.setState(1595);
							this.match(354);
							this.setState(1600);
							this._errHandler.sync(this);

							for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 171, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 171, this._ctx)) {
								if (_alt == 1) {
									this.setState(1596);
									this.match(333);
									this.setState(1597);
									this.match(354);
								}

								this.setState(1602);
								this._errHandler.sync(this);
							}
					}

					this.setState(1606);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 173, this._ctx)) {
						case 1:
							this.setState(1605);
							this.using_clause();
					}
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.If_stmtContext if_stmt() throws RecognitionException {
		HplsqlParser.If_stmtContext _localctx = new HplsqlParser.If_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 156, 78);

		try {
			this.setState(1610);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 174, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1608);
					this.if_plsql_stmt();
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1609);
					this.if_tsql_stmt();
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.If_plsql_stmtContext if_plsql_stmt() throws RecognitionException {
		HplsqlParser.If_plsql_stmtContext _localctx = new HplsqlParser.If_plsql_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 158, 79);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1612);
			this.match(130);
			this.setState(1613);
			this.bool_expr(0);
			this.setState(1614);
			this.match(276);
			this.setState(1615);
			this.block();
			this.setState(1619);
			this._errHandler.sync(this);

			int _la;
			for(_la = this._input.LA(1); _la == 91 || _la == 92; _la = this._input.LA(1)) {
				this.setState(1616);
				this.elseif_block();
				this.setState(1621);
				this._errHandler.sync(this);
			}

			this.setState(1623);
			_la = this._input.LA(1);
			if (_la == 90) {
				this.setState(1622);
				this.else_block();
			}

			this.setState(1625);
			this.match(94);
			this.setState(1626);
			this.match(130);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.If_tsql_stmtContext if_tsql_stmt() throws RecognitionException {
		HplsqlParser.If_tsql_stmtContext _localctx = new HplsqlParser.If_tsql_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 160, 80);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1628);
			this.match(130);
			this.setState(1629);
			this.bool_expr(0);
			this.setState(1630);
			this.single_block_stmt();
			this.setState(1633);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 177, this._ctx)) {
				case 1:
					this.setState(1631);
					this.match(90);
					this.setState(1632);
					this.single_block_stmt();
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Elseif_blockContext elseif_block() throws RecognitionException {
		HplsqlParser.Elseif_blockContext _localctx = new HplsqlParser.Elseif_blockContext(this._ctx, this.getState());
		this.enterRule(_localctx, 162, 81);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1635);
			int _la = this._input.LA(1);
			if (_la != 91 && _la != 92) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}

			this.setState(1636);
			this.bool_expr(0);
			this.setState(1637);
			this.match(276);
			this.setState(1638);
			this.block();
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Else_blockContext else_block() throws RecognitionException {
		HplsqlParser.Else_blockContext _localctx = new HplsqlParser.Else_blockContext(this._ctx, this.getState());
		this.enterRule(_localctx, 164, 82);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1640);
			this.match(90);
			this.setState(1641);
			this.block();
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Include_stmtContext include_stmt() throws RecognitionException {
		HplsqlParser.Include_stmtContext _localctx = new HplsqlParser.Include_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 166, 83);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1643);
			this.match(134);
			this.setState(1646);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 178, this._ctx)) {
				case 1:
					this.setState(1644);
					this.file_name();
					break;
				case 2:
					this.setState(1645);
					this.expr(0);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Insert_stmtContext insert_stmt() throws RecognitionException {
		HplsqlParser.Insert_stmtContext _localctx = new HplsqlParser.Insert_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 168, 84);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1648);
			this.match(139);
			this.setState(1655);
			label68:
			switch(this._input.LA(1)) {
				case 147:
					this.setState(1651);
					this.match(147);
					this.setState(1653);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 179, this._ctx)) {
						case 1:
							this.setState(1652);
							this.match(271);
						default:
							break label68;
					}
				case 204:
					this.setState(1649);
					this.match(204);
					this.setState(1650);
					this.match(271);
					break;
				default:
					throw new NoViableAltException(this);
			}

			this.setState(1657);
			this.table_name();
			this.setState(1659);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 181, this._ctx)) {
				case 1:
					this.setState(1658);
					this.insert_stmt_cols();
				default:
					this.setState(1663);
					switch(this._input.LA(1)) {
						case 246:
						case 247:
						case 302:
						case 347:
							this.setState(1661);
							this.select_stmt();
							break;
						case 293:
							this.setState(1662);
							this.insert_stmt_rows();
							break;
						default:
							throw new NoViableAltException(this);
					}
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Insert_stmt_colsContext insert_stmt_cols() throws RecognitionException {
		HplsqlParser.Insert_stmt_colsContext _localctx = new HplsqlParser.Insert_stmt_colsContext(this._ctx, this.getState());
		this.enterRule(_localctx, 170, 85);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1665);
			this.match(347);
			this.setState(1666);
			this.ident();
			this.setState(1671);
			this._errHandler.sync(this);

			for(int _la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
				this.setState(1667);
				this.match(333);
				this.setState(1668);
				this.ident();
				this.setState(1673);
				this._errHandler.sync(this);
			}

			this.setState(1674);
			this.match(350);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Insert_stmt_rowsContext insert_stmt_rows() throws RecognitionException {
		HplsqlParser.Insert_stmt_rowsContext _localctx = new HplsqlParser.Insert_stmt_rowsContext(this._ctx, this.getState());
		this.enterRule(_localctx, 172, 86);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1676);
			this.match(293);
			this.setState(1677);
			this.insert_stmt_row();
			this.setState(1682);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 184, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 184, this._ctx)) {
				if (_alt == 1) {
					this.setState(1678);
					this.match(333);
					this.setState(1679);
					this.insert_stmt_row();
				}

				this.setState(1684);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Insert_stmt_rowContext insert_stmt_row() throws RecognitionException {
		HplsqlParser.Insert_stmt_rowContext _localctx = new HplsqlParser.Insert_stmt_rowContext(this._ctx, this.getState());
		this.enterRule(_localctx, 174, 87);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1685);
			this.match(347);
			this.setState(1686);
			this.expr(0);
			this.setState(1691);
			this._errHandler.sync(this);

			for(int _la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
				this.setState(1687);
				this.match(333);
				this.setState(1688);
				this.expr(0);
				this.setState(1693);
				this._errHandler.sync(this);
			}

			this.setState(1694);
			this.match(350);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Insert_directory_stmtContext insert_directory_stmt() throws RecognitionException {
		HplsqlParser.Insert_directory_stmtContext _localctx = new HplsqlParser.Insert_directory_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 176, 88);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1696);
			this.match(139);
			this.setState(1697);
			this.match(204);
			this.setState(1699);
			int _la = this._input.LA(1);
			if (_la == 162) {
				this.setState(1698);
				this.match(162);
			}

			this.setState(1701);
			this.match(83);
			this.setState(1702);
			this.expr_file();
			this.setState(1703);
			this.expr_select();
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Exit_stmtContext exit_stmt() throws RecognitionException {
		HplsqlParser.Exit_stmtContext _localctx = new HplsqlParser.Exit_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 178, 89);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1705);
			this.match(103);
			this.setState(1707);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 187, this._ctx)) {
				case 1:
					this.setState(1706);
					this.match(354);
				default:
					this.setState(1711);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 188, this._ctx)) {
						case 1:
							this.setState(1709);
							this.match(299);
							this.setState(1710);
							this.bool_expr(0);
					}
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Get_diag_stmtContext get_diag_stmt() throws RecognitionException {
		HplsqlParser.Get_diag_stmtContext _localctx = new HplsqlParser.Get_diag_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 180, 90);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1713);
			this.match(118);
			this.setState(1714);
			this.match(81);
			this.setState(1715);
			this.get_diag_stmt_item();
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Get_diag_stmt_itemContext get_diag_stmt_item() throws RecognitionException {
		HplsqlParser.Get_diag_stmt_itemContext _localctx = new HplsqlParser.Get_diag_stmt_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 182, 91);

		try {
			this.setState(1719);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 189, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1717);
					this.get_diag_stmt_exception_item();
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1718);
					this.get_diag_stmt_rowcount_item();
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Get_diag_stmt_exception_itemContext get_diag_stmt_exception_item() throws RecognitionException {
		HplsqlParser.Get_diag_stmt_exception_itemContext _localctx = new HplsqlParser.Get_diag_stmt_exception_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 184, 92);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1721);
			this.match(100);
			this.setState(1722);
			this.match(357);
			this.setState(1723);
			this.ident();
			this.setState(1724);
			this.match(337);
			this.setState(1725);
			this.match(176);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Get_diag_stmt_rowcount_itemContext get_diag_stmt_rowcount_item() throws RecognitionException {
		HplsqlParser.Get_diag_stmt_rowcount_itemContext _localctx = new HplsqlParser.Get_diag_stmt_rowcount_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 186, 93);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1727);
			this.ident();
			this.setState(1728);
			this.match(337);
			this.setState(1729);
			this.match(238);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Grant_stmtContext grant_stmt() throws RecognitionException {
		HplsqlParser.Grant_stmtContext _localctx = new HplsqlParser.Grant_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 188, 94);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1731);
			this.match(121);
			this.setState(1732);
			this.grant_stmt_item();
			this.setState(1737);
			this._errHandler.sync(this);

			for(int _la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
				this.setState(1733);
				this.match(333);
				this.setState(1734);
				this.grant_stmt_item();
				this.setState(1739);
				this._errHandler.sync(this);
			}

			this.setState(1740);
			this.match(280);
			this.setState(1741);
			this.match(233);
			this.setState(1742);
			this.ident();
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Grant_stmt_itemContext grant_stmt_item() throws RecognitionException {
		HplsqlParser.Grant_stmt_itemContext _localctx = new HplsqlParser.Grant_stmt_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 190, 95);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1744);
			this.match(99);
			this.setState(1745);
			this.match(196);
			this.setState(1746);
			this.match(216);
			this.setState(1747);
			this.ident();
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Leave_stmtContext leave_stmt() throws RecognitionException {
		HplsqlParser.Leave_stmtContext _localctx = new HplsqlParser.Leave_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 192, 96);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1749);
			this.match(157);
			this.setState(1751);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 191, this._ctx)) {
				case 1:
					this.setState(1750);
					this.match(354);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Map_object_stmtContext map_object_stmt() throws RecognitionException {
		HplsqlParser.Map_object_stmtContext _localctx = new HplsqlParser.Map_object_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 194, 97);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1753);
			this.match(171);
			this.setState(1754);
			this.match(194);
			this.setState(1755);
			this.expr(0);
			this.setState(1758);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 192, this._ctx)) {
				case 1:
					this.setState(1756);
					this.match(280);
					this.setState(1757);
					this.expr(0);
				default:
					this.setState(1762);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 193, this._ctx)) {
						case 1:
							this.setState(1760);
							this.match(17);
							this.setState(1761);
							this.expr(0);
					}
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Open_stmtContext open_stmt() throws RecognitionException {
		HplsqlParser.Open_stmtContext _localctx = new HplsqlParser.Open_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 196, 98);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1764);
			this.match(198);
			this.setState(1765);
			this.match(354);
			this.setState(1771);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 195, this._ctx)) {
				case 1:
					this.setState(1766);
					this.match(110);
					this.setState(1769);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 194, this._ctx)) {
						case 1:
							this.setState(1767);
							this.select_stmt();
							break;
						case 2:
							this.setState(1768);
							this.expr(0);
					}
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Fetch_stmtContext fetch_stmt() throws RecognitionException {
		HplsqlParser.Fetch_stmtContext _localctx = new HplsqlParser.Fetch_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 198, 99);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1773);
			this.match(105);
			this.setState(1775);
			int _la = this._input.LA(1);
			if (_la == 114) {
				this.setState(1774);
				this.match(114);
			}

			this.setState(1777);
			this.match(354);
			this.setState(1778);
			this.match(147);
			this.setState(1779);
			this.match(354);
			this.setState(1784);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 197, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 197, this._ctx)) {
				if (_alt == 1) {
					this.setState(1780);
					this.match(333);
					this.setState(1781);
					this.match(354);
				}

				this.setState(1786);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Close_stmtContext close_stmt() throws RecognitionException {
		HplsqlParser.Close_stmtContext _localctx = new HplsqlParser.Close_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 200, 100);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1787);
			this.match(42);
			this.setState(1788);
			this.match(354);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Cmp_stmtContext cmp_stmt() throws RecognitionException {
		HplsqlParser.Cmp_stmtContext _localctx = new HplsqlParser.Cmp_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 202, 101);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1790);
			this.match(44);
			this.setState(1791);
			int _la = this._input.LA(1);
			if (_la != 238 && _la != 269) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}

			this.setState(1792);
			this.cmp_source();
			this.setState(1793);
			this.match(333);
			this.setState(1794);
			this.cmp_source();
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Cmp_sourceContext cmp_source() throws RecognitionException {
		HplsqlParser.Cmp_sourceContext _localctx = new HplsqlParser.Cmp_sourceContext(this._ctx, this.getState());
		this.enterRule(_localctx, 204, 102);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1804);
			label62:
			switch(this._input.LA(1)) {
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
				case 19:
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 27:
				case 28:
				case 29:
				case 30:
				case 31:
				case 32:
				case 33:
				case 34:
				case 35:
				case 36:
				case 37:
				case 38:
				case 39:
				case 40:
				case 41:
				case 42:
				case 43:
				case 44:
				case 45:
				case 46:
				case 47:
				case 48:
				case 49:
				case 50:
				case 51:
				case 52:
				case 53:
				case 54:
				case 55:
				case 56:
				case 57:
				case 58:
				case 59:
				case 60:
				case 61:
				case 62:
				case 63:
				case 64:
				case 65:
				case 66:
				case 67:
				case 68:
				case 69:
				case 70:
				case 71:
				case 72:
				case 73:
				case 74:
				case 75:
				case 76:
				case 77:
				case 78:
				case 79:
				case 80:
				case 81:
				case 82:
				case 83:
				case 84:
				case 85:
				case 86:
				case 87:
				case 88:
				case 89:
				case 93:
				case 95:
				case 96:
				case 97:
				case 98:
				case 99:
				case 100:
				case 101:
				case 102:
				case 103:
				case 104:
				case 105:
				case 106:
				case 107:
				case 108:
				case 109:
				case 110:
				case 111:
				case 112:
				case 113:
				case 114:
				case 115:
				case 116:
				case 117:
				case 118:
				case 119:
				case 120:
				case 121:
				case 122:
				case 123:
				case 124:
				case 125:
				case 126:
				case 127:
				case 128:
				case 129:
				case 130:
				case 131:
				case 132:
				case 133:
				case 134:
				case 135:
				case 136:
				case 137:
				case 138:
				case 139:
				case 140:
				case 141:
				case 142:
				case 143:
				case 144:
				case 145:
				case 146:
				case 147:
				case 148:
				case 149:
				case 150:
				case 151:
				case 152:
				case 153:
				case 154:
				case 155:
				case 156:
				case 157:
				case 158:
				case 159:
				case 160:
				case 161:
				case 162:
				case 163:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
				case 169:
				case 170:
				case 171:
				case 172:
				case 173:
				case 174:
				case 175:
				case 176:
				case 177:
				case 178:
				case 179:
				case 180:
				case 181:
				case 182:
				case 183:
				case 184:
				case 185:
				case 186:
				case 187:
				case 188:
				case 189:
				case 190:
				case 192:
				case 193:
				case 194:
				case 195:
				case 196:
				case 197:
				case 198:
				case 199:
				case 200:
				case 201:
				case 202:
				case 203:
				case 204:
				case 205:
				case 206:
				case 207:
				case 208:
				case 209:
				case 211:
				case 212:
				case 213:
				case 214:
				case 215:
				case 216:
				case 217:
				case 218:
				case 219:
				case 220:
				case 221:
				case 222:
				case 223:
				case 224:
				case 225:
				case 226:
				case 227:
				case 228:
				case 229:
				case 230:
				case 231:
				case 232:
				case 233:
				case 234:
				case 235:
				case 236:
				case 238:
				case 239:
				case 240:
				case 241:
				case 242:
				case 243:
				case 244:
				case 245:
				case 246:
				case 247:
				case 248:
				case 249:
				case 250:
				case 251:
				case 252:
				case 253:
				case 254:
				case 255:
				case 257:
				case 258:
				case 259:
				case 260:
				case 261:
				case 262:
				case 263:
				case 264:
				case 265:
				case 266:
				case 267:
				case 268:
				case 269:
				case 270:
				case 271:
				case 272:
				case 273:
				case 274:
				case 275:
				case 276:
				case 277:
				case 279:
				case 280:
				case 281:
				case 282:
				case 283:
				case 284:
				case 287:
				case 288:
				case 289:
				case 290:
				case 291:
				case 292:
				case 293:
				case 294:
				case 295:
				case 296:
				case 297:
				case 298:
				case 301:
				case 302:
				case 303:
				case 304:
				case 305:
				case 306:
				case 307:
				case 308:
				case 309:
				case 310:
				case 311:
				case 312:
				case 313:
				case 314:
				case 315:
				case 316:
				case 323:
				case 324:
				case 325:
				case 326:
				case 327:
				case 328:
				case 329:
				case 330:
				case 354:
					this.setState(1796);
					this.table_name();
					this.setState(1798);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 198, this._ctx)) {
						case 1:
							this.setState(1797);
							this.where_clause();
						default:
							break label62;
					}
				case 26:
				case 90:
				case 91:
				case 92:
				case 94:
				case 191:
				case 210:
				case 237:
				case 256:
				case 278:
				case 285:
				case 286:
				case 299:
				case 300:
				case 317:
				case 318:
				case 319:
				case 320:
				case 321:
				case 322:
				case 331:
				case 332:
				case 333:
				case 334:
				case 335:
				case 336:
				case 337:
				case 338:
				case 339:
				case 340:
				case 341:
				case 342:
				case 343:
				case 344:
				case 345:
				case 346:
				case 348:
				case 349:
				case 350:
				case 351:
				case 352:
				case 353:
				default:
					throw new NoViableAltException(this);
				case 347:
					this.setState(1800);
					this.match(347);
					this.setState(1801);
					this.select_stmt();
					this.setState(1802);
					this.match(350);
			}

			this.setState(1808);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 200, this._ctx)) {
				case 1:
					this.setState(1806);
					this.match(17);
					this.setState(1807);
					this.ident();
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Copy_from_ftp_stmtContext copy_from_ftp_stmt() throws RecognitionException {
		HplsqlParser.Copy_from_ftp_stmtContext _localctx = new HplsqlParser.Copy_from_ftp_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 206, 103);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1810);
			this.match(53);
			this.setState(1811);
			this.match(114);
			this.setState(1812);
			this.match(115);
			this.setState(1813);
			this.expr(0);
			this.setState(1817);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 201, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 201, this._ctx)) {
				if (_alt == 1) {
					this.setState(1814);
					this.copy_ftp_option();
				}

				this.setState(1819);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Copy_from_local_stmtContext copy_from_local_stmt() throws RecognitionException {
		HplsqlParser.Copy_from_local_stmtContext _localctx = new HplsqlParser.Copy_from_local_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 208, 104);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1820);
			this.match(53);
			this.setState(1821);
			this.match(114);
			this.setState(1822);
			this.match(162);
			this.setState(1823);
			this.copy_source();
			this.setState(1828);
			this._errHandler.sync(this);

			for(int _la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
				this.setState(1824);
				this.match(333);
				this.setState(1825);
				this.copy_source();
				this.setState(1830);
				this._errHandler.sync(this);
			}

			this.setState(1831);
			this.match(280);
			this.setState(1832);
			this.copy_target();
			this.setState(1836);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 203, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 203, this._ctx)) {
				if (_alt == 1) {
					this.setState(1833);
					this.copy_file_option();
				}

				this.setState(1838);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Copy_stmtContext copy_stmt() throws RecognitionException {
		HplsqlParser.Copy_stmtContext _localctx = new HplsqlParser.Copy_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 210, 105);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1839);
			this.match(53);
			this.setState(1845);
			switch(this._input.LA(1)) {
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
				case 19:
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 27:
				case 28:
				case 29:
				case 30:
				case 31:
				case 32:
				case 33:
				case 34:
				case 35:
				case 36:
				case 37:
				case 38:
				case 39:
				case 40:
				case 41:
				case 42:
				case 43:
				case 44:
				case 45:
				case 46:
				case 47:
				case 48:
				case 49:
				case 50:
				case 51:
				case 52:
				case 53:
				case 54:
				case 55:
				case 56:
				case 57:
				case 58:
				case 59:
				case 60:
				case 61:
				case 62:
				case 63:
				case 64:
				case 65:
				case 66:
				case 67:
				case 68:
				case 69:
				case 70:
				case 71:
				case 72:
				case 73:
				case 74:
				case 75:
				case 76:
				case 77:
				case 78:
				case 79:
				case 80:
				case 81:
				case 82:
				case 83:
				case 84:
				case 85:
				case 86:
				case 87:
				case 88:
				case 89:
				case 93:
				case 95:
				case 96:
				case 97:
				case 98:
				case 99:
				case 100:
				case 101:
				case 102:
				case 103:
				case 104:
				case 105:
				case 106:
				case 107:
				case 108:
				case 109:
				case 110:
				case 111:
				case 112:
				case 113:
				case 114:
				case 115:
				case 116:
				case 117:
				case 118:
				case 119:
				case 120:
				case 121:
				case 122:
				case 123:
				case 124:
				case 125:
				case 126:
				case 127:
				case 128:
				case 129:
				case 130:
				case 131:
				case 132:
				case 133:
				case 134:
				case 135:
				case 136:
				case 137:
				case 138:
				case 139:
				case 140:
				case 141:
				case 142:
				case 143:
				case 144:
				case 145:
				case 146:
				case 147:
				case 148:
				case 149:
				case 150:
				case 151:
				case 152:
				case 153:
				case 154:
				case 155:
				case 156:
				case 157:
				case 158:
				case 159:
				case 160:
				case 161:
				case 162:
				case 163:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
				case 169:
				case 170:
				case 171:
				case 172:
				case 173:
				case 174:
				case 175:
				case 176:
				case 177:
				case 178:
				case 179:
				case 180:
				case 181:
				case 182:
				case 183:
				case 184:
				case 185:
				case 186:
				case 187:
				case 188:
				case 189:
				case 190:
				case 192:
				case 193:
				case 194:
				case 195:
				case 196:
				case 197:
				case 198:
				case 199:
				case 200:
				case 201:
				case 202:
				case 203:
				case 204:
				case 205:
				case 206:
				case 207:
				case 208:
				case 209:
				case 211:
				case 212:
				case 213:
				case 214:
				case 215:
				case 216:
				case 217:
				case 218:
				case 219:
				case 220:
				case 221:
				case 222:
				case 223:
				case 224:
				case 225:
				case 226:
				case 227:
				case 228:
				case 229:
				case 230:
				case 231:
				case 232:
				case 233:
				case 234:
				case 235:
				case 236:
				case 238:
				case 239:
				case 240:
				case 241:
				case 242:
				case 243:
				case 244:
				case 245:
				case 246:
				case 247:
				case 248:
				case 249:
				case 250:
				case 251:
				case 252:
				case 253:
				case 254:
				case 255:
				case 257:
				case 258:
				case 259:
				case 260:
				case 261:
				case 262:
				case 263:
				case 264:
				case 265:
				case 266:
				case 267:
				case 268:
				case 269:
				case 270:
				case 271:
				case 272:
				case 273:
				case 274:
				case 275:
				case 276:
				case 277:
				case 279:
				case 280:
				case 281:
				case 282:
				case 283:
				case 284:
				case 287:
				case 288:
				case 289:
				case 290:
				case 291:
				case 292:
				case 293:
				case 294:
				case 295:
				case 296:
				case 297:
				case 298:
				case 301:
				case 302:
				case 303:
				case 304:
				case 305:
				case 306:
				case 307:
				case 308:
				case 309:
				case 310:
				case 311:
				case 312:
				case 313:
				case 314:
				case 315:
				case 316:
				case 323:
				case 324:
				case 325:
				case 326:
				case 327:
				case 328:
				case 329:
				case 330:
				case 354:
					this.setState(1840);
					this.table_name();
					break;
				case 26:
				case 90:
				case 91:
				case 92:
				case 94:
				case 191:
				case 210:
				case 237:
				case 256:
				case 278:
				case 285:
				case 286:
				case 299:
				case 300:
				case 317:
				case 318:
				case 319:
				case 320:
				case 321:
				case 322:
				case 331:
				case 332:
				case 333:
				case 334:
				case 335:
				case 336:
				case 337:
				case 338:
				case 339:
				case 340:
				case 341:
				case 342:
				case 343:
				case 344:
				case 345:
				case 346:
				case 348:
				case 349:
				case 350:
				case 351:
				case 352:
				case 353:
				default:
					throw new NoViableAltException(this);
				case 347:
					this.setState(1841);
					this.match(347);
					this.setState(1842);
					this.select_stmt();
					this.setState(1843);
					this.match(350);
			}

			this.setState(1847);
			this.match(280);
			this.setState(1849);
			int _alt;
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 205, this._ctx)) {
				case 1:
					this.setState(1848);
					this.match(126);
				default:
					this.setState(1851);
					this.copy_target();
					this.setState(1855);
					this._errHandler.sync(this);
					_alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 206, this._ctx);
			}

			while(_alt != 2 && _alt != 0) {
				if (_alt == 1) {
					this.setState(1852);
					this.copy_option();
				}

				this.setState(1857);
				this._errHandler.sync(this);
				_alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 206, this._ctx);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Copy_sourceContext copy_source() throws RecognitionException {
		HplsqlParser.Copy_sourceContext _localctx = new HplsqlParser.Copy_sourceContext(this._ctx, this.getState());
		this.enterRule(_localctx, 212, 106);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1861);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 207, this._ctx)) {
				case 1:
					this.setState(1858);
					this.ident();
					break;
				case 2:
					this.setState(1859);
					this.expr(0);
					break;
				case 3:
					this.setState(1860);
					this.match(362);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Copy_targetContext copy_target() throws RecognitionException {
		HplsqlParser.Copy_targetContext _localctx = new HplsqlParser.Copy_targetContext(this._ctx, this.getState());
		this.enterRule(_localctx, 214, 107);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1865);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 208, this._ctx)) {
				case 1:
					this.setState(1863);
					this.file_name();
					break;
				case 2:
					this.setState(1864);
					this.expr(0);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Copy_optionContext copy_option() throws RecognitionException {
		HplsqlParser.Copy_optionContext _localctx = new HplsqlParser.Copy_optionContext(this._ctx, this.getState());
		this.enterRule(_localctx, 216, 108);

		try {
			this.setState(1875);
			switch(this._input.LA(1)) {
				case 17:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1867);
					this.match(17);
					this.setState(1868);
					this.ident();
					break;
				case 20:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1869);
					this.match(20);
					this.setState(1870);
					this.expr(0);
					break;
				case 78:
					this.enterOuterAlt(_localctx, 3);
					this.setState(1871);
					this.match(78);
					this.setState(1872);
					this.expr(0);
					break;
				case 261:
					this.enterOuterAlt(_localctx, 4);
					this.setState(1873);
					this.match(261);
					this.setState(1874);
					this.ident();
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Copy_file_optionContext copy_file_option() throws RecognitionException {
		HplsqlParser.Copy_file_optionContext _localctx = new HplsqlParser.Copy_file_optionContext(this._ctx, this.getState());
		this.enterRule(_localctx, 218, 109);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1877);
			int _la = this._input.LA(1);
			if (_la != 76 && _la != 131 && _la != 204) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Copy_ftp_optionContext copy_ftp_option() throws RecognitionException {
		HplsqlParser.Copy_ftp_optionContext _localctx = new HplsqlParser.Copy_ftp_optionContext(this._ctx, this.getState());
		this.enterRule(_localctx, 220, 110);

		try {
			this.setState(1903);
			switch(this._input.LA(1)) {
				case 82:
					this.enterOuterAlt(_localctx, 3);
					this.setState(1883);
					this.match(82);
					this.setState(1886);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 210, this._ctx)) {
						case 1:
							this.setState(1884);
							this.file_name();
							return _localctx;
						case 2:
							this.setState(1885);
							this.expr(0);
							return _localctx;
						default:
							return _localctx;
					}
				case 108:
					this.enterOuterAlt(_localctx, 4);
					this.setState(1888);
					this.match(108);
					this.setState(1889);
					this.expr(0);
					break;
				case 182:
					this.enterOuterAlt(_localctx, 5);
					this.setState(1890);
					this.match(182);
					break;
				case 204:
					this.enterOuterAlt(_localctx, 6);
					this.setState(1891);
					this.match(204);
					break;
				case 241:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1881);
					this.match(241);
					this.setState(1882);
					this.expr(0);
					break;
				case 250:
					this.enterOuterAlt(_localctx, 8);
					this.setState(1893);
					this.match(250);
					this.setState(1894);
					this.expr(0);
					break;
				case 267:
					this.enterOuterAlt(_localctx, 7);
					this.setState(1892);
					this.match(267);
					break;
				case 280:
					this.enterOuterAlt(_localctx, 9);
					this.setState(1895);
					this.match(280);
					this.setState(1897);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 211, this._ctx)) {
						case 1:
							this.setState(1896);
							this.match(162);
						default:
							this.setState(1901);
							switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 212, this._ctx)) {
								case 1:
									this.setState(1899);
									this.file_name();
									return _localctx;
								case 2:
									this.setState(1900);
									this.expr(0);
									return _localctx;
								default:
									return _localctx;
							}
					}
				case 330:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1879);
					this.match(330);
					this.setState(1880);
					this.expr(0);
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Commit_stmtContext commit_stmt() throws RecognitionException {
		HplsqlParser.Commit_stmtContext _localctx = new HplsqlParser.Commit_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 222, 111);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1905);
			this.match(48);
			this.setState(1907);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 214, this._ctx)) {
				case 1:
					this.setState(1906);
					this.match(304);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_index_stmtContext create_index_stmt() throws RecognitionException {
		HplsqlParser.Create_index_stmtContext _localctx = new HplsqlParser.Create_index_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 224, 112);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1909);
			this.match(56);
			this.setState(1911);
			int _la = this._input.LA(1);
			if (_la == 287) {
				this.setState(1910);
				this.match(287);
			}

			this.setState(1913);
			this.match(135);
			this.setState(1914);
			this.ident();
			this.setState(1915);
			this.match(196);
			this.setState(1916);
			this.table_name();
			this.setState(1917);
			this.match(347);
			this.setState(1918);
			this.create_index_col();
			this.setState(1923);
			this._errHandler.sync(this);

			for(_la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
				this.setState(1919);
				this.match(333);
				this.setState(1920);
				this.create_index_col();
				this.setState(1925);
				this._errHandler.sync(this);
			}

			this.setState(1926);
			this.match(350);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Create_index_colContext create_index_col() throws RecognitionException {
		HplsqlParser.Create_index_colContext _localctx = new HplsqlParser.Create_index_colContext(this._ctx, this.getState());
		this.enterRule(_localctx, 226, 113);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1928);
			this.ident();
			this.setState(1930);
			int _la = this._input.LA(1);
			if (_la == 15 || _la == 79) {
				this.setState(1929);
				_la = this._input.LA(1);
				if (_la != 15 && _la != 79) {
					this._errHandler.recoverInline(this);
				} else {
					this.consume();
				}
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Index_storage_clauseContext index_storage_clause() throws RecognitionException {
		HplsqlParser.Index_storage_clauseContext _localctx = new HplsqlParser.Index_storage_clauseContext(this._ctx, this.getState());
		this.enterRule(_localctx, 228, 114);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1932);
			this.index_mssql_storage_clause();
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Index_mssql_storage_clauseContext index_mssql_storage_clause() throws RecognitionException {
		HplsqlParser.Index_mssql_storage_clauseContext _localctx = new HplsqlParser.Index_mssql_storage_clauseContext(this._ctx, this.getState());
		this.enterRule(_localctx, 230, 115);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1934);
			this.match(302);
			this.setState(1935);
			this.match(347);
			this.setState(1936);
			this.ident();
			this.setState(1937);
			this.match(337);
			this.setState(1938);
			this.ident();
			this.setState(1946);
			this._errHandler.sync(this);

			for(int _la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
				this.setState(1939);
				this.match(333);
				this.setState(1940);
				this.ident();
				this.setState(1941);
				this.match(337);
				this.setState(1942);
				this.ident();
				this.setState(1948);
				this._errHandler.sync(this);
			}

			this.setState(1949);
			this.match(350);
			this.setState(1953);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 219, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 219, this._ctx)) {
				if (_alt == 1) {
					this.setState(1950);
					this.create_table_options_mssql_item();
				}

				this.setState(1955);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Print_stmtContext print_stmt() throws RecognitionException {
		HplsqlParser.Print_stmtContext _localctx = new HplsqlParser.Print_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 232, 116);

		try {
			this.setState(1963);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 220, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1956);
					this.match(214);
					this.setState(1957);
					this.expr(0);
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1958);
					this.match(214);
					this.setState(1959);
					this.match(347);
					this.setState(1960);
					this.expr(0);
					this.setState(1961);
					this.match(350);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Raise_stmtContext raise_stmt() throws RecognitionException {
		HplsqlParser.Raise_stmtContext _localctx = new HplsqlParser.Raise_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 234, 117);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1965);
			this.match(219);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Resignal_stmtContext resignal_stmt() throws RecognitionException {
		HplsqlParser.Resignal_stmtContext _localctx = new HplsqlParser.Resignal_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 236, 118);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1967);
			this.match(224);
			this.setState(1979);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 223, this._ctx)) {
				case 1:
					this.setState(1968);
					this.match(262);
					this.setState(1970);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 221, this._ctx)) {
						case 1:
							this.setState(1969);
							this.match(292);
						default:
							this.setState(1972);
							this.expr(0);
							this.setState(1977);
							switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 222, this._ctx)) {
								case 1:
									this.setState(1973);
									this.match(248);
									this.setState(1974);
									this.match(176);
									this.setState(1975);
									this.match(337);
									this.setState(1976);
									this.expr(0);
							}
					}
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Return_stmtContext return_stmt() throws RecognitionException {
		HplsqlParser.Return_stmtContext _localctx = new HplsqlParser.Return_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 238, 119);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1981);
			this.match(228);
			this.setState(1983);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 224, this._ctx)) {
				case 1:
					this.setState(1982);
					this.expr(0);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Rollback_stmtContext rollback_stmt() throws RecognitionException {
		HplsqlParser.Rollback_stmtContext _localctx = new HplsqlParser.Rollback_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 240, 120);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1985);
			this.match(234);
			this.setState(1987);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 225, this._ctx)) {
				case 1:
					this.setState(1986);
					this.match(304);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Set_session_optionContext set_session_option() throws RecognitionException {
		HplsqlParser.Set_session_optionContext _localctx = new HplsqlParser.Set_session_optionContext(this._ctx, this.getState());
		this.enterRule(_localctx, 242, 121);

		try {
			this.setState(1992);
			switch(this._input.LA(1)) {
				case 12:
				case 13:
				case 185:
				case 218:
				case 305:
					this.enterOuterAlt(_localctx, 2);
					this.setState(1990);
					this.set_mssql_session_option();
					break;
				case 60:
				case 61:
				case 243:
					this.enterOuterAlt(_localctx, 1);
					this.setState(1989);
					this.set_current_schema_option();
					break;
				case 217:
					this.enterOuterAlt(_localctx, 3);
					this.setState(1991);
					this.set_teradata_session_option();
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Set_current_schema_optionContext set_current_schema_option() throws RecognitionException {
		HplsqlParser.Set_current_schema_optionContext _localctx = new HplsqlParser.Set_current_schema_optionContext(this._ctx, this.getState());
		this.enterRule(_localctx, 244, 122);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(1999);
			int _la;
			switch(this._input.LA(1)) {
				case 60:
				case 243:
					this.setState(1995);
					_la = this._input.LA(1);
					if (_la == 60) {
						this.setState(1994);
						this.match(60);
					}

					this.setState(1997);
					this.match(243);
					break;
				case 61:
					this.setState(1998);
					this.match(61);
					break;
				default:
					throw new NoViableAltException(this);
			}

			this.setState(2002);
			_la = this._input.LA(1);
			if (_la == 337) {
				this.setState(2001);
				this.match(337);
			}

			this.setState(2004);
			this.expr(0);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Set_mssql_session_optionContext set_mssql_session_option() throws RecognitionException {
		HplsqlParser.Set_mssql_session_optionContext _localctx = new HplsqlParser.Set_mssql_session_optionContext(this._ctx, this.getState());
		this.enterRule(_localctx, 246, 123);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2006);
			int _la = this._input.LA(1);
			if (_la != 12 && _la != 13 && _la != 185 && _la != 218 && _la != 305) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}

			this.setState(2007);
			_la = this._input.LA(1);
			if (_la != 195 && _la != 196) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Set_teradata_session_optionContext set_teradata_session_option() throws RecognitionException {
		HplsqlParser.Set_teradata_session_optionContext _localctx = new HplsqlParser.Set_teradata_session_optionContext(this._ctx, this.getState());
		this.enterRule(_localctx, 248, 124);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2009);
			this.match(217);
			this.setState(2010);
			this.match(337);
			this.setState(2013);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 230, this._ctx)) {
				case 1:
					this.setState(2011);
					this.expr(0);
					break;
				case 2:
					this.setState(2012);
					this.match(188);
			}

			this.setState(2016);
			int _la = this._input.LA(1);
			if (_la == 288) {
				this.setState(2015);
				this.match(288);
			}

			this.setState(2018);
			this.match(110);
			this.setState(2019);
			_la = this._input.LA(1);
			if (_la != 249 && _la != 282) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Signal_stmtContext signal_stmt() throws RecognitionException {
		HplsqlParser.Signal_stmtContext _localctx = new HplsqlParser.Signal_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 250, 125);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2021);
			this.match(253);
			this.setState(2022);
			this.ident();
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Truncate_stmtContext truncate_stmt() throws RecognitionException {
		HplsqlParser.Truncate_stmtContext _localctx = new HplsqlParser.Truncate_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 252, 126);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2024);
			this.match(284);
			this.setState(2026);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 232, this._ctx)) {
				case 1:
					this.setState(2025);
					this.match(271);
				default:
					this.setState(2028);
					this.table_name();
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Use_stmtContext use_stmt() throws RecognitionException {
		HplsqlParser.Use_stmtContext _localctx = new HplsqlParser.Use_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 254, 127);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2030);
			this.match(290);
			this.setState(2031);
			this.expr(0);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Values_into_stmtContext values_into_stmt() throws RecognitionException {
		HplsqlParser.Values_into_stmtContext _localctx = new HplsqlParser.Values_into_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 256, 128);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2033);
			this.match(293);
			this.setState(2035);
			int _la;
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 233, this._ctx)) {
				case 1:
					this.setState(2034);
					this.match(347);
				default:
					this.setState(2037);
					this.expr(0);
					this.setState(2042);
					this._errHandler.sync(this);
					_la = this._input.LA(1);
			}

			while(_la == 333) {
				this.setState(2038);
				this.match(333);
				this.setState(2039);
				this.expr(0);
				this.setState(2044);
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}

			this.setState(2046);
			_la = this._input.LA(1);
			if (_la == 350) {
				this.setState(2045);
				this.match(350);
			}

			this.setState(2048);
			this.match(147);
			this.setState(2050);
			_la = this._input.LA(1);
			if (_la == 347) {
				this.setState(2049);
				this.match(347);
			}

			this.setState(2052);
			this.ident();
			this.setState(2057);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 237, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 237, this._ctx)) {
				if (_alt == 1) {
					this.setState(2053);
					this.match(333);
					this.setState(2054);
					this.ident();
				}

				this.setState(2059);
				this._errHandler.sync(this);
			}

			this.setState(2061);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 238, this._ctx)) {
				case 1:
					this.setState(2060);
					this.match(350);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.While_stmtContext while_stmt() throws RecognitionException {
		HplsqlParser.While_stmtContext _localctx = new HplsqlParser.While_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 258, 129);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2063);
			this.match(301);
			this.setState(2064);
			this.bool_expr(0);
			this.setState(2065);
			int _la = this._input.LA(1);
			if (_la != 21 && _la != 86 && _la != 170 && _la != 276) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}

			this.setState(2066);
			this.block();
			this.setState(2067);
			this.match(94);
			this.setState(2069);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 239, this._ctx)) {
				case 1:
					this.setState(2068);
					_la = this._input.LA(1);
					if (_la != 170 && _la != 301) {
						this._errHandler.recoverInline(this);
					} else {
						this.consume();
					}
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.For_cursor_stmtContext for_cursor_stmt() throws RecognitionException {
		HplsqlParser.For_cursor_stmtContext _localctx = new HplsqlParser.For_cursor_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 260, 130);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2071);
			this.match(110);
			this.setState(2072);
			this.match(354);
			this.setState(2073);
			this.match(133);
			this.setState(2075);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 240, this._ctx)) {
				case 1:
					this.setState(2074);
					this.match(347);
				default:
					this.setState(2077);
					this.select_stmt();
					this.setState(2079);
					int _la = this._input.LA(1);
					if (_la == 350) {
						this.setState(2078);
						this.match(350);
					}

					this.setState(2081);
					this.match(170);
					this.setState(2082);
					this.block();
					this.setState(2083);
					this.match(94);
					this.setState(2084);
					this.match(170);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.For_range_stmtContext for_range_stmt() throws RecognitionException {
		HplsqlParser.For_range_stmtContext _localctx = new HplsqlParser.For_range_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 262, 131);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2086);
			this.match(110);
			this.setState(2087);
			this.match(354);
			this.setState(2088);
			this.match(133);
			this.setState(2090);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 242, this._ctx)) {
				case 1:
					this.setState(2089);
					this.match(230);
			}

			this.setState(2092);
			this.expr(0);
			this.setState(2093);
			this.match(336);
			this.setState(2094);
			this.expr(0);
			this.setState(2097);
			int _la = this._input.LA(1);
			if (_la == 30 || _la == 264) {
				this.setState(2095);
				_la = this._input.LA(1);
				if (_la != 30 && _la != 264) {
					this._errHandler.recoverInline(this);
				} else {
					this.consume();
				}

				this.setState(2096);
				this.expr(0);
			}

			this.setState(2099);
			this.match(170);
			this.setState(2100);
			this.block();
			this.setState(2101);
			this.match(94);
			this.setState(2102);
			this.match(170);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.LabelContext label() throws RecognitionException {
		HplsqlParser.LabelContext _localctx = new HplsqlParser.LabelContext(this._ctx, this.getState());
		this.enterRule(_localctx, 264, 132);

		try {
			this.setState(2110);
			switch(this._input.LA(1)) {
				case 343:
					this.enterOuterAlt(_localctx, 2);
					this.setState(2105);
					this.match(343);
					this.setState(2106);
					this.match(343);
					this.setState(2107);
					this.match(354);
					this.setState(2108);
					this.match(341);
					this.setState(2109);
					this.match(341);
					break;
				case 363:
					this.enterOuterAlt(_localctx, 1);
					this.setState(2104);
					this.match(363);
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Using_clauseContext using_clause() throws RecognitionException {
		HplsqlParser.Using_clauseContext _localctx = new HplsqlParser.Using_clauseContext(this._ctx, this.getState());
		this.enterRule(_localctx, 266, 133);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2112);
			this.match(291);
			this.setState(2113);
			this.expr(0);
			this.setState(2118);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 245, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 245, this._ctx)) {
				if (_alt == 1) {
					this.setState(2114);
					this.match(333);
					this.setState(2115);
					this.expr(0);
				}

				this.setState(2120);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Select_stmtContext select_stmt() throws RecognitionException {
		HplsqlParser.Select_stmtContext _localctx = new HplsqlParser.Select_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 268, 134);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2122);
			int _la = this._input.LA(1);
			if (_la == 302) {
				this.setState(2121);
				this.cte_select_stmt();
			}

			this.setState(2124);
			this.fullselect_stmt();
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Cte_select_stmtContext cte_select_stmt() throws RecognitionException {
		HplsqlParser.Cte_select_stmtContext _localctx = new HplsqlParser.Cte_select_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 270, 135);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2126);
			this.match(302);
			this.setState(2127);
			this.cte_select_stmt_item();
			this.setState(2132);
			this._errHandler.sync(this);

			for(int _la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
				this.setState(2128);
				this.match(333);
				this.setState(2129);
				this.cte_select_stmt_item();
				this.setState(2134);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Cte_select_stmt_itemContext cte_select_stmt_item() throws RecognitionException {
		HplsqlParser.Cte_select_stmt_itemContext _localctx = new HplsqlParser.Cte_select_stmt_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 272, 136);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2135);
			this.ident();
			this.setState(2137);
			int _la = this._input.LA(1);
			if (_la == 347) {
				this.setState(2136);
				this.cte_select_cols();
			}

			this.setState(2139);
			this.match(14);
			this.setState(2140);
			this.match(347);
			this.setState(2141);
			this.fullselect_stmt();
			this.setState(2142);
			this.match(350);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Cte_select_colsContext cte_select_cols() throws RecognitionException {
		HplsqlParser.Cte_select_colsContext _localctx = new HplsqlParser.Cte_select_colsContext(this._ctx, this.getState());
		this.enterRule(_localctx, 274, 137);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2144);
			this.match(347);
			this.setState(2145);
			this.ident();
			this.setState(2150);
			this._errHandler.sync(this);

			for(int _la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
				this.setState(2146);
				this.match(333);
				this.setState(2147);
				this.ident();
				this.setState(2152);
				this._errHandler.sync(this);
			}

			this.setState(2153);
			this.match(350);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Fullselect_stmtContext fullselect_stmt() throws RecognitionException {
		HplsqlParser.Fullselect_stmtContext _localctx = new HplsqlParser.Fullselect_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 276, 138);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2155);
			this.fullselect_stmt_item();
			this.setState(2161);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 250, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 250, this._ctx)) {
				if (_alt == 1) {
					this.setState(2156);
					this.fullselect_set_clause();
					this.setState(2157);
					this.fullselect_stmt_item();
				}

				this.setState(2163);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Fullselect_stmt_itemContext fullselect_stmt_item() throws RecognitionException {
		HplsqlParser.Fullselect_stmt_itemContext _localctx = new HplsqlParser.Fullselect_stmt_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 278, 139);

		try {
			this.setState(2169);
			switch(this._input.LA(1)) {
				case 246:
				case 247:
					this.enterOuterAlt(_localctx, 1);
					this.setState(2164);
					this.subselect_stmt();
					break;
				case 347:
					this.enterOuterAlt(_localctx, 2);
					this.setState(2165);
					this.match(347);
					this.setState(2166);
					this.fullselect_stmt();
					this.setState(2167);
					this.match(350);
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Fullselect_set_clauseContext fullselect_set_clause() throws RecognitionException {
		HplsqlParser.Fullselect_set_clauseContext _localctx = new HplsqlParser.Fullselect_set_clauseContext(this._ctx, this.getState());
		this.enterRule(_localctx, 280, 140);

		try {
			this.setState(2183);
			int _la;
			switch(this._input.LA(1)) {
				case 97:
					this.enterOuterAlt(_localctx, 2);
					this.setState(2175);
					this.match(97);
					this.setState(2177);
					_la = this._input.LA(1);
					if (_la == 8) {
						this.setState(2176);
						this.match(8);
					}
					break;
				case 145:
					this.enterOuterAlt(_localctx, 3);
					this.setState(2179);
					this.match(145);
					this.setState(2181);
					_la = this._input.LA(1);
					if (_la == 8) {
						this.setState(2180);
						this.match(8);
					}
					break;
				case 286:
					this.enterOuterAlt(_localctx, 1);
					this.setState(2171);
					this.match(286);
					this.setState(2173);
					_la = this._input.LA(1);
					if (_la == 8) {
						this.setState(2172);
						this.match(8);
					}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Subselect_stmtContext subselect_stmt() throws RecognitionException {
		HplsqlParser.Subselect_stmtContext _localctx = new HplsqlParser.Subselect_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 282, 141);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2185);
			int _la = this._input.LA(1);
			if (_la != 246 && _la != 247) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}

			this.setState(2186);
			this.select_list();
			this.setState(2188);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 256, this._ctx)) {
				case 1:
					this.setState(2187);
					this.into_clause();
				default:
					this.setState(2191);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 257, this._ctx)) {
						case 1:
							this.setState(2190);
							this.from_clause();
						default:
							this.setState(2194);
							switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 258, this._ctx)) {
								case 1:
									this.setState(2193);
									this.where_clause();
								default:
									this.setState(2197);
									switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 259, this._ctx)) {
										case 1:
											this.setState(2196);
											this.group_by_clause();
										default:
											this.setState(2200);
											switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 260, this._ctx)) {
												case 1:
													this.setState(2199);
													this.having_clause();
												default:
													this.setState(2203);
													switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 261, this._ctx)) {
														case 1:
															this.setState(2202);
															this.order_by_clause();
														default:
															this.setState(2206);
															switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 262, this._ctx)) {
																case 1:
																	this.setState(2205);
																	this.select_options();
															}
													}
											}
									}
							}
					}
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Select_listContext select_list() throws RecognitionException {
		HplsqlParser.Select_listContext _localctx = new HplsqlParser.Select_listContext(this._ctx, this.getState());
		this.enterRule(_localctx, 284, 142);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2209);
			int _alt;
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 263, this._ctx)) {
				case 1:
					this.setState(2208);
					this.select_list_set();
				default:
					this.setState(2212);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 264, this._ctx)) {
						case 1:
							this.setState(2211);
							this.select_list_limit();
						default:
							this.setState(2214);
							this.select_list_item();
							this.setState(2219);
							this._errHandler.sync(this);
							_alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 265, this._ctx);
					}
			}

			while(_alt != 2 && _alt != 0) {
				if (_alt == 1) {
					this.setState(2215);
					this.match(333);
					this.setState(2216);
					this.select_list_item();
				}

				this.setState(2221);
				this._errHandler.sync(this);
				_alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 265, this._ctx);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Select_list_setContext select_list_set() throws RecognitionException {
		HplsqlParser.Select_list_setContext _localctx = new HplsqlParser.Select_list_setContext(this._ctx, this.getState());
		this.enterRule(_localctx, 286, 143);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2222);
			int _la = this._input.LA(1);
			if (_la != 8 && _la != 84) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Select_list_limitContext select_list_limit() throws RecognitionException {
		HplsqlParser.Select_list_limitContext _localctx = new HplsqlParser.Select_list_limitContext(this._ctx, this.getState());
		this.enterRule(_localctx, 288, 144);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2224);
			this.match(281);
			this.setState(2225);
			this.expr(0);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Select_list_itemContext select_list_item() throws RecognitionException {
		HplsqlParser.Select_list_itemContext _localctx = new HplsqlParser.Select_list_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 290, 145);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2237);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 268, this._ctx)) {
				case 1:
					this.setState(2230);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 266, this._ctx)) {
						case 1:
							this.setState(2227);
							this.ident();
							this.setState(2228);
							this.match(337);
						default:
							this.setState(2232);
							this.expr(0);
							this.setState(2234);
							switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 267, this._ctx)) {
								case 1:
									this.setState(2233);
									this.select_list_alias();
									return _localctx;
								default:
									return _localctx;
							}
					}
				case 2:
					this.setState(2236);
					this.select_list_asterisk();
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Select_list_aliasContext select_list_alias() throws RecognitionException {
		HplsqlParser.Select_list_aliasContext _localctx = new HplsqlParser.Select_list_aliasContext(this._ctx, this.getState());
		this.enterRule(_localctx, 292, 146);

		try {
			this.setState(2248);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 270, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(2239);
					if (!this._input.LT(1).getText().equalsIgnoreCase("INTO") && !this._input.LT(1).getText().equalsIgnoreCase("FROM")) {
						this.setState(2241);
						switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 269, this._ctx)) {
							case 1:
								this.setState(2240);
								this.match(14);
							default:
								this.setState(2243);
								this.ident();
								return _localctx;
						}
					}

					throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") && !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(2244);
					this.match(347);
					this.setState(2245);
					this.match(279);
					this.setState(2246);
					this.match(355);
					this.setState(2247);
					this.match(350);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Select_list_asteriskContext select_list_asterisk() throws RecognitionException {
		HplsqlParser.Select_list_asteriskContext _localctx = new HplsqlParser.Select_list_asteriskContext(this._ctx, this.getState());
		this.enterRule(_localctx, 294, 147);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2252);
			int _la = this._input.LA(1);
			if (_la == 354) {
				this.setState(2250);
				this.match(354);
				this.setState(2251);
				this.match(4);
			}

			this.setState(2254);
			this.match(345);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Into_clauseContext into_clause() throws RecognitionException {
		HplsqlParser.Into_clauseContext _localctx = new HplsqlParser.Into_clauseContext(this._ctx, this.getState());
		this.enterRule(_localctx, 296, 148);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2256);
			this.match(147);
			this.setState(2257);
			this.ident();
			this.setState(2262);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 272, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 272, this._ctx)) {
				if (_alt == 1) {
					this.setState(2258);
					this.match(333);
					this.setState(2259);
					this.ident();
				}

				this.setState(2264);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.From_clauseContext from_clause() throws RecognitionException {
		HplsqlParser.From_clauseContext _localctx = new HplsqlParser.From_clauseContext(this._ctx, this.getState());
		this.enterRule(_localctx, 298, 149);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2265);
			this.match(114);
			this.setState(2266);
			this.from_table_clause();
			this.setState(2270);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 273, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 273, this._ctx)) {
				if (_alt == 1) {
					this.setState(2267);
					this.from_join_clause();
				}

				this.setState(2272);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.From_table_clauseContext from_table_clause() throws RecognitionException {
		HplsqlParser.From_table_clauseContext _localctx = new HplsqlParser.From_table_clauseContext(this._ctx, this.getState());
		this.enterRule(_localctx, 300, 150);

		try {
			this.setState(2276);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 274, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(2273);
					this.from_table_name_clause();
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(2274);
					this.from_subselect_clause();
					break;
				case 3:
					this.enterOuterAlt(_localctx, 3);
					this.setState(2275);
					this.from_table_values_clause();
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.From_table_name_clauseContext from_table_name_clause() throws RecognitionException {
		HplsqlParser.From_table_name_clauseContext _localctx = new HplsqlParser.From_table_name_clauseContext(this._ctx, this.getState());
		this.enterRule(_localctx, 302, 151);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2278);
			this.table_name();
			this.setState(2280);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 275, this._ctx)) {
				case 1:
					this.setState(2279);
					this.from_alias_clause();
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.From_subselect_clauseContext from_subselect_clause() throws RecognitionException {
		HplsqlParser.From_subselect_clauseContext _localctx = new HplsqlParser.From_subselect_clauseContext(this._ctx, this.getState());
		this.enterRule(_localctx, 304, 152);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2282);
			this.match(347);
			this.setState(2283);
			this.select_stmt();
			this.setState(2284);
			this.match(350);
			this.setState(2286);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 276, this._ctx)) {
				case 1:
					this.setState(2285);
					this.from_alias_clause();
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.From_join_clauseContext from_join_clause() throws RecognitionException {
		HplsqlParser.From_join_clauseContext _localctx = new HplsqlParser.From_join_clauseContext(this._ctx, this.getState());
		this.enterRule(_localctx, 306, 153);

		try {
			this.setState(2295);
			switch(this._input.LA(1)) {
				case 116:
				case 137:
				case 152:
				case 158:
				case 231:
					this.enterOuterAlt(_localctx, 2);
					this.setState(2290);
					this.from_join_type_clause();
					this.setState(2291);
					this.from_table_clause();
					this.setState(2292);
					this.match(196);
					this.setState(2293);
					this.bool_expr(0);
					break;
				case 333:
					this.enterOuterAlt(_localctx, 1);
					this.setState(2288);
					this.match(333);
					this.setState(2289);
					this.from_table_clause();
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.From_join_type_clauseContext from_join_type_clause() throws RecognitionException {
		HplsqlParser.From_join_type_clauseContext _localctx = new HplsqlParser.From_join_type_clauseContext(this._ctx, this.getState());
		this.enterRule(_localctx, 308, 154);

		try {
			this.setState(2306);
			int _la;
			switch(this._input.LA(1)) {
				case 116:
				case 158:
				case 231:
					this.enterOuterAlt(_localctx, 2);
					this.setState(2301);
					_la = this._input.LA(1);
					if (_la != 116 && _la != 158 && _la != 231) {
						this._errHandler.recoverInline(this);
					} else {
						this.consume();
					}

					this.setState(2303);
					_la = this._input.LA(1);
					if (_la == 202) {
						this.setState(2302);
						this.match(202);
					}

					this.setState(2305);
					this.match(152);
					break;
				case 137:
				case 152:
					this.enterOuterAlt(_localctx, 1);
					this.setState(2298);
					_la = this._input.LA(1);
					if (_la == 137) {
						this.setState(2297);
						this.match(137);
					}

					this.setState(2300);
					this.match(152);
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.From_table_values_clauseContext from_table_values_clause() throws RecognitionException {
		HplsqlParser.From_table_values_clauseContext _localctx = new HplsqlParser.From_table_values_clauseContext(this._ctx, this.getState());
		this.enterRule(_localctx, 310, 155);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2308);
			this.match(271);
			this.setState(2309);
			this.match(347);
			this.setState(2310);
			this.match(293);
			this.setState(2311);
			this.from_table_values_row();
			this.setState(2316);
			this._errHandler.sync(this);

			for(int _la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
				this.setState(2312);
				this.match(333);
				this.setState(2313);
				this.from_table_values_row();
				this.setState(2318);
				this._errHandler.sync(this);
			}

			this.setState(2319);
			this.match(350);
			this.setState(2321);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 282, this._ctx)) {
				case 1:
					this.setState(2320);
					this.from_alias_clause();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.From_table_values_rowContext from_table_values_row() throws RecognitionException {
		HplsqlParser.From_table_values_rowContext _localctx = new HplsqlParser.From_table_values_rowContext(this._ctx, this.getState());
		this.enterRule(_localctx, 312, 156);

		try {
			this.setState(2335);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 284, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(2323);
					this.expr(0);
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(2324);
					this.match(347);
					this.setState(2325);
					this.expr(0);
					this.setState(2330);
					this._errHandler.sync(this);

					for(int _la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
						this.setState(2326);
						this.match(333);
						this.setState(2327);
						this.expr(0);
						this.setState(2332);
						this._errHandler.sync(this);
					}

					this.setState(2333);
					this.match(350);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.From_alias_clauseContext from_alias_clause() throws RecognitionException {
		HplsqlParser.From_alias_clauseContext _localctx = new HplsqlParser.From_alias_clauseContext(this._ctx, this.getState());
		this.enterRule(_localctx, 314, 157);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2337);
			if (this._input.LT(1).getText().equalsIgnoreCase("EXEC") || this._input.LT(1).getText().equalsIgnoreCase("EXECUTE") || this._input.LT(1).getText().equalsIgnoreCase("GROUP") || this._input.LT(1).getText().equalsIgnoreCase("ORDER") || this._input.LT(1).getText().equalsIgnoreCase("LIMIT") || this._input.LT(1).getText().equalsIgnoreCase("WITH")) {
				throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") && \n        !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			}

			this.setState(2339);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 285, this._ctx)) {
				case 1:
					this.setState(2338);
					this.match(14);
			}

			this.setState(2341);
			this.ident();
			this.setState(2352);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 287, this._ctx)) {
				case 1:
					this.setState(2342);
					this.match(347);
					this.setState(2343);
					this.match(354);
					this.setState(2348);
					this._errHandler.sync(this);

					for(int _la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
						this.setState(2344);
						this.match(333);
						this.setState(2345);
						this.match(354);
						this.setState(2350);
						this._errHandler.sync(this);
					}

					this.setState(2351);
					this.match(350);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Table_nameContext table_name() throws RecognitionException {
		HplsqlParser.Table_nameContext _localctx = new HplsqlParser.Table_nameContext(this._ctx, this.getState());
		this.enterRule(_localctx, 316, 158);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2354);
			this.ident();
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Where_clauseContext where_clause() throws RecognitionException {
		HplsqlParser.Where_clauseContext _localctx = new HplsqlParser.Where_clauseContext(this._ctx, this.getState());
		this.enterRule(_localctx, 318, 159);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2356);
			this.match(300);
			this.setState(2357);
			this.bool_expr(0);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Group_by_clauseContext group_by_clause() throws RecognitionException {
		HplsqlParser.Group_by_clauseContext _localctx = new HplsqlParser.Group_by_clauseContext(this._ctx, this.getState());
		this.enterRule(_localctx, 320, 160);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2359);
			this.match(122);
			this.setState(2360);
			this.match(30);
			this.setState(2361);
			this.expr(0);
			this.setState(2366);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 288, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 288, this._ctx)) {
				if (_alt == 1) {
					this.setState(2362);
					this.match(333);
					this.setState(2363);
					this.expr(0);
				}

				this.setState(2368);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Having_clauseContext having_clause() throws RecognitionException {
		HplsqlParser.Having_clauseContext _localctx = new HplsqlParser.Having_clauseContext(this._ctx, this.getState());
		this.enterRule(_localctx, 322, 161);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2369);
			this.match(125);
			this.setState(2370);
			this.bool_expr(0);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Order_by_clauseContext order_by_clause() throws RecognitionException {
		HplsqlParser.Order_by_clauseContext _localctx = new HplsqlParser.Order_by_clauseContext(this._ctx, this.getState());
		this.enterRule(_localctx, 324, 162);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2372);
			this.match(200);
			this.setState(2373);
			this.match(30);
			this.setState(2374);
			this.expr(0);
			this.setState(2376);
			int _la;
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 289, this._ctx)) {
				case 1:
					this.setState(2375);
					_la = this._input.LA(1);
					if (_la != 15 && _la != 79) {
						this._errHandler.recoverInline(this);
					} else {
						this.consume();
					}
			}

			this.setState(2385);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 291, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 291, this._ctx)) {
				if (_alt == 1) {
					this.setState(2378);
					this.match(333);
					this.setState(2379);
					this.expr(0);
					this.setState(2381);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 290, this._ctx)) {
						case 1:
							this.setState(2380);
							_la = this._input.LA(1);
							if (_la != 15 && _la != 79) {
								this._errHandler.recoverInline(this);
							} else {
								this.consume();
							}
					}
				}

				this.setState(2387);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Select_optionsContext select_options() throws RecognitionException {
		HplsqlParser.Select_optionsContext _localctx = new HplsqlParser.Select_optionsContext(this._ctx, this.getState());
		this.enterRule(_localctx, 326, 163);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2389);
			this._errHandler.sync(this);
			int _alt = 1;

			do {
				switch(_alt) {
					case 1:
						this.setState(2388);
						this.select_options_item();
						this.setState(2391);
						this._errHandler.sync(this);
						_alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 292, this._ctx);
						break;
					default:
						throw new NoViableAltException(this);
				}
			} while(_alt != 2 && _alt != 0);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Select_options_itemContext select_options_item() throws RecognitionException {
		HplsqlParser.Select_options_itemContext _localctx = new HplsqlParser.Select_options_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 328, 164);

		try {
			this.setState(2404);
			switch(this._input.LA(1)) {
				case 160:
					this.enterOuterAlt(_localctx, 1);
					this.setState(2393);
					this.match(160);
					this.setState(2394);
					this.expr(0);
					break;
				case 302:
					this.enterOuterAlt(_localctx, 2);
					this.setState(2395);
					this.match(302);
					this.setState(2396);
					int _la = this._input.LA(1);
					if (_la == 59 || (_la - 239 & -64) == 0 && (1L << _la - 239 & 1125899906842627L) != 0L) {
						this.consume();
					} else {
						this._errHandler.recoverInline(this);
					}

					this.setState(2402);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 293, this._ctx)) {
						case 1:
							this.setState(2397);
							this.match(290);
							this.setState(2398);
							this.match(11);
							this.setState(2399);
							this.match(153);
							this.setState(2400);
							_la = this._input.LA(1);
							if (_la != 101 && _la != 252 && _la != 288) {
								this._errHandler.recoverInline(this);
							} else {
								this.consume();
							}

							this.setState(2401);
							this.match(166);
							return _localctx;
						default:
							return _localctx;
					}
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Update_stmtContext update_stmt() throws RecognitionException {
		HplsqlParser.Update_stmtContext _localctx = new HplsqlParser.Update_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 330, 165);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2406);
			this.match(288);
			this.setState(2407);
			this.update_table();
			this.setState(2408);
			this.match(248);
			this.setState(2409);
			this.update_assignment();
			this.setState(2411);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 295, this._ctx)) {
				case 1:
					this.setState(2410);
					this.where_clause();
				default:
					this.setState(2414);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 296, this._ctx)) {
						case 1:
							this.setState(2413);
							this.update_upsert();
					}
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Update_assignmentContext update_assignment() throws RecognitionException {
		HplsqlParser.Update_assignmentContext _localctx = new HplsqlParser.Update_assignmentContext(this._ctx, this.getState());
		this.enterRule(_localctx, 332, 166);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2416);
			this.assignment_stmt_item();
			this.setState(2421);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 297, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 297, this._ctx)) {
				if (_alt == 1) {
					this.setState(2417);
					this.match(333);
					this.setState(2418);
					this.assignment_stmt_item();
				}

				this.setState(2423);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Update_tableContext update_table() throws RecognitionException {
		HplsqlParser.Update_tableContext _localctx = new HplsqlParser.Update_tableContext(this._ctx, this.getState());
		this.enterRule(_localctx, 334, 167);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2429);
			switch(this._input.LA(1)) {
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
				case 19:
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 27:
				case 28:
				case 29:
				case 30:
				case 31:
				case 32:
				case 33:
				case 34:
				case 35:
				case 36:
				case 37:
				case 38:
				case 39:
				case 40:
				case 41:
				case 42:
				case 43:
				case 44:
				case 45:
				case 46:
				case 47:
				case 48:
				case 49:
				case 50:
				case 51:
				case 52:
				case 53:
				case 54:
				case 55:
				case 56:
				case 57:
				case 58:
				case 59:
				case 60:
				case 61:
				case 62:
				case 63:
				case 64:
				case 65:
				case 66:
				case 67:
				case 68:
				case 69:
				case 70:
				case 71:
				case 72:
				case 73:
				case 74:
				case 75:
				case 76:
				case 77:
				case 78:
				case 79:
				case 80:
				case 81:
				case 82:
				case 83:
				case 84:
				case 85:
				case 86:
				case 87:
				case 88:
				case 89:
				case 93:
				case 95:
				case 96:
				case 97:
				case 98:
				case 99:
				case 100:
				case 101:
				case 102:
				case 103:
				case 104:
				case 105:
				case 106:
				case 107:
				case 108:
				case 109:
				case 110:
				case 111:
				case 112:
				case 113:
				case 114:
				case 115:
				case 116:
				case 117:
				case 118:
				case 119:
				case 120:
				case 121:
				case 122:
				case 123:
				case 124:
				case 125:
				case 126:
				case 127:
				case 128:
				case 129:
				case 130:
				case 131:
				case 132:
				case 133:
				case 134:
				case 135:
				case 136:
				case 137:
				case 138:
				case 139:
				case 140:
				case 141:
				case 142:
				case 143:
				case 144:
				case 145:
				case 146:
				case 147:
				case 148:
				case 149:
				case 150:
				case 151:
				case 152:
				case 153:
				case 154:
				case 155:
				case 156:
				case 157:
				case 158:
				case 159:
				case 160:
				case 161:
				case 162:
				case 163:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
				case 169:
				case 170:
				case 171:
				case 172:
				case 173:
				case 174:
				case 175:
				case 176:
				case 177:
				case 178:
				case 179:
				case 180:
				case 181:
				case 182:
				case 183:
				case 184:
				case 185:
				case 186:
				case 187:
				case 188:
				case 189:
				case 190:
				case 192:
				case 193:
				case 194:
				case 195:
				case 196:
				case 197:
				case 198:
				case 199:
				case 200:
				case 201:
				case 202:
				case 203:
				case 204:
				case 205:
				case 206:
				case 207:
				case 208:
				case 209:
				case 211:
				case 212:
				case 213:
				case 214:
				case 215:
				case 216:
				case 217:
				case 218:
				case 219:
				case 220:
				case 221:
				case 222:
				case 223:
				case 224:
				case 225:
				case 226:
				case 227:
				case 228:
				case 229:
				case 230:
				case 231:
				case 232:
				case 233:
				case 234:
				case 235:
				case 236:
				case 238:
				case 239:
				case 240:
				case 241:
				case 242:
				case 243:
				case 244:
				case 245:
				case 246:
				case 247:
				case 248:
				case 249:
				case 250:
				case 251:
				case 252:
				case 253:
				case 254:
				case 255:
				case 257:
				case 258:
				case 259:
				case 260:
				case 261:
				case 262:
				case 263:
				case 264:
				case 265:
				case 266:
				case 267:
				case 268:
				case 269:
				case 270:
				case 271:
				case 272:
				case 273:
				case 274:
				case 275:
				case 276:
				case 277:
				case 279:
				case 280:
				case 281:
				case 282:
				case 283:
				case 284:
				case 287:
				case 288:
				case 289:
				case 290:
				case 291:
				case 292:
				case 293:
				case 294:
				case 295:
				case 296:
				case 297:
				case 298:
				case 301:
				case 302:
				case 303:
				case 304:
				case 305:
				case 306:
				case 307:
				case 308:
				case 309:
				case 310:
				case 311:
				case 312:
				case 313:
				case 314:
				case 315:
				case 316:
				case 323:
				case 324:
				case 325:
				case 326:
				case 327:
				case 328:
				case 329:
				case 330:
				case 354:
					this.setState(2424);
					this.table_name();
					break;
				case 26:
				case 90:
				case 91:
				case 92:
				case 94:
				case 191:
				case 210:
				case 237:
				case 256:
				case 278:
				case 285:
				case 286:
				case 299:
				case 300:
				case 317:
				case 318:
				case 319:
				case 320:
				case 321:
				case 322:
				case 331:
				case 332:
				case 333:
				case 334:
				case 335:
				case 336:
				case 337:
				case 338:
				case 339:
				case 340:
				case 341:
				case 342:
				case 343:
				case 344:
				case 345:
				case 346:
				case 348:
				case 349:
				case 350:
				case 351:
				case 352:
				case 353:
				default:
					throw new NoViableAltException(this);
				case 347:
					this.setState(2425);
					this.match(347);
					this.setState(2426);
					this.select_stmt();
					this.setState(2427);
					this.match(350);
			}

			this.setState(2435);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 300, this._ctx)) {
				case 1:
					this.setState(2432);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 299, this._ctx)) {
						case 1:
							this.setState(2431);
							this.match(14);
						default:
							this.setState(2434);
							this.ident();
					}
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Update_upsertContext update_upsert() throws RecognitionException {
		HplsqlParser.Update_upsertContext _localctx = new HplsqlParser.Update_upsertContext(this._ctx, this.getState());
		this.enterRule(_localctx, 336, 168);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2437);
			this.match(90);
			this.setState(2438);
			this.insert_stmt();
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Merge_stmtContext merge_stmt() throws RecognitionException {
		HplsqlParser.Merge_stmtContext _localctx = new HplsqlParser.Merge_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 338, 169);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2440);
			this.match(175);
			this.setState(2441);
			this.match(147);
			this.setState(2442);
			this.merge_table();
			this.setState(2443);
			this.match(291);
			this.setState(2444);
			this.merge_table();
			this.setState(2445);
			this.match(196);
			this.setState(2446);
			this.bool_expr(0);
			this.setState(2448);
			this._errHandler.sync(this);
			int _alt = 1;

			do {
				switch(_alt) {
					case 1:
						this.setState(2447);
						this.merge_condition();
						this.setState(2450);
						this._errHandler.sync(this);
						_alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 301, this._ctx);
						break;
					default:
						throw new NoViableAltException(this);
				}
			} while(_alt != 2 && _alt != 0);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Merge_tableContext merge_table() throws RecognitionException {
		HplsqlParser.Merge_tableContext _localctx = new HplsqlParser.Merge_tableContext(this._ctx, this.getState());
		this.enterRule(_localctx, 340, 170);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2457);
			switch(this._input.LA(1)) {
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
				case 19:
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 27:
				case 28:
				case 29:
				case 30:
				case 31:
				case 32:
				case 33:
				case 34:
				case 35:
				case 36:
				case 37:
				case 38:
				case 39:
				case 40:
				case 41:
				case 42:
				case 43:
				case 44:
				case 45:
				case 46:
				case 47:
				case 48:
				case 49:
				case 50:
				case 51:
				case 52:
				case 53:
				case 54:
				case 55:
				case 56:
				case 57:
				case 58:
				case 59:
				case 60:
				case 61:
				case 62:
				case 63:
				case 64:
				case 65:
				case 66:
				case 67:
				case 68:
				case 69:
				case 70:
				case 71:
				case 72:
				case 73:
				case 74:
				case 75:
				case 76:
				case 77:
				case 78:
				case 79:
				case 80:
				case 81:
				case 82:
				case 83:
				case 84:
				case 85:
				case 86:
				case 87:
				case 88:
				case 89:
				case 93:
				case 95:
				case 96:
				case 97:
				case 98:
				case 99:
				case 100:
				case 101:
				case 102:
				case 103:
				case 104:
				case 105:
				case 106:
				case 107:
				case 108:
				case 109:
				case 110:
				case 111:
				case 112:
				case 113:
				case 114:
				case 115:
				case 116:
				case 117:
				case 118:
				case 119:
				case 120:
				case 121:
				case 122:
				case 123:
				case 124:
				case 125:
				case 126:
				case 127:
				case 128:
				case 129:
				case 130:
				case 131:
				case 132:
				case 133:
				case 134:
				case 135:
				case 136:
				case 137:
				case 138:
				case 139:
				case 140:
				case 141:
				case 142:
				case 143:
				case 144:
				case 145:
				case 146:
				case 147:
				case 148:
				case 149:
				case 150:
				case 151:
				case 152:
				case 153:
				case 154:
				case 155:
				case 156:
				case 157:
				case 158:
				case 159:
				case 160:
				case 161:
				case 162:
				case 163:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
				case 169:
				case 170:
				case 171:
				case 172:
				case 173:
				case 174:
				case 175:
				case 176:
				case 177:
				case 178:
				case 179:
				case 180:
				case 181:
				case 182:
				case 183:
				case 184:
				case 185:
				case 186:
				case 187:
				case 188:
				case 189:
				case 190:
				case 192:
				case 193:
				case 194:
				case 195:
				case 196:
				case 197:
				case 198:
				case 199:
				case 200:
				case 201:
				case 202:
				case 203:
				case 204:
				case 205:
				case 206:
				case 207:
				case 208:
				case 209:
				case 211:
				case 212:
				case 213:
				case 214:
				case 215:
				case 216:
				case 217:
				case 218:
				case 219:
				case 220:
				case 221:
				case 222:
				case 223:
				case 224:
				case 225:
				case 226:
				case 227:
				case 228:
				case 229:
				case 230:
				case 231:
				case 232:
				case 233:
				case 234:
				case 235:
				case 236:
				case 238:
				case 239:
				case 240:
				case 241:
				case 242:
				case 243:
				case 244:
				case 245:
				case 246:
				case 247:
				case 248:
				case 249:
				case 250:
				case 251:
				case 252:
				case 253:
				case 254:
				case 255:
				case 257:
				case 258:
				case 259:
				case 260:
				case 261:
				case 262:
				case 263:
				case 264:
				case 265:
				case 266:
				case 267:
				case 268:
				case 269:
				case 270:
				case 271:
				case 272:
				case 273:
				case 274:
				case 275:
				case 276:
				case 277:
				case 279:
				case 280:
				case 281:
				case 282:
				case 283:
				case 284:
				case 287:
				case 288:
				case 289:
				case 290:
				case 291:
				case 292:
				case 293:
				case 294:
				case 295:
				case 296:
				case 297:
				case 298:
				case 301:
				case 302:
				case 303:
				case 304:
				case 305:
				case 306:
				case 307:
				case 308:
				case 309:
				case 310:
				case 311:
				case 312:
				case 313:
				case 314:
				case 315:
				case 316:
				case 323:
				case 324:
				case 325:
				case 326:
				case 327:
				case 328:
				case 329:
				case 330:
				case 354:
					this.setState(2452);
					this.table_name();
					break;
				case 26:
				case 90:
				case 91:
				case 92:
				case 94:
				case 191:
				case 210:
				case 237:
				case 256:
				case 278:
				case 285:
				case 286:
				case 299:
				case 300:
				case 317:
				case 318:
				case 319:
				case 320:
				case 321:
				case 322:
				case 331:
				case 332:
				case 333:
				case 334:
				case 335:
				case 336:
				case 337:
				case 338:
				case 339:
				case 340:
				case 341:
				case 342:
				case 343:
				case 344:
				case 345:
				case 346:
				case 348:
				case 349:
				case 350:
				case 351:
				case 352:
				case 353:
				default:
					throw new NoViableAltException(this);
				case 347:
					this.setState(2453);
					this.match(347);
					this.setState(2454);
					this.select_stmt();
					this.setState(2455);
					this.match(350);
			}

			this.setState(2463);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 304, this._ctx)) {
				case 1:
					this.setState(2460);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 303, this._ctx)) {
						case 1:
							this.setState(2459);
							this.match(14);
						default:
							this.setState(2462);
							this.ident();
					}
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Merge_conditionContext merge_condition() throws RecognitionException {
		HplsqlParser.Merge_conditionContext _localctx = new HplsqlParser.Merge_conditionContext(this._ctx, this.getState());
		this.enterRule(_localctx, 342, 171);

		try {
			this.setState(2478);
			switch(this._input.LA(1)) {
				case 90:
					this.enterOuterAlt(_localctx, 2);
					this.setState(2476);
					this.match(90);
					this.setState(2477);
					this.match(131);
					break;
				case 299:
					this.enterOuterAlt(_localctx, 1);
					this.setState(2465);
					this.match(299);
					this.setState(2467);
					int _la = this._input.LA(1);
					if (_la == 189) {
						this.setState(2466);
						this.match(189);
					}

					this.setState(2469);
					this.match(172);
					this.setState(2472);
					_la = this._input.LA(1);
					if (_la == 11) {
						this.setState(2470);
						this.match(11);
						this.setState(2471);
						this.bool_expr(0);
					}

					this.setState(2474);
					this.match(276);
					this.setState(2475);
					this.merge_action();
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Merge_actionContext merge_action() throws RecognitionException {
		HplsqlParser.Merge_actionContext _localctx = new HplsqlParser.Merge_actionContext(this._ctx, this.getState());
		this.enterRule(_localctx, 344, 172);

		try {
			this.setState(2500);
			switch(this._input.LA(1)) {
				case 76:
					this.enterOuterAlt(_localctx, 3);
					this.setState(2499);
					this.match(76);
					break;
				case 139:
					this.enterOuterAlt(_localctx, 1);
					this.setState(2480);
					this.match(139);
					this.setState(2482);
					int _la = this._input.LA(1);
					if (_la == 347) {
						this.setState(2481);
						this.insert_stmt_cols();
					}

					this.setState(2484);
					this.match(293);
					this.setState(2485);
					this.insert_stmt_row();
					break;
				case 288:
					this.enterOuterAlt(_localctx, 2);
					this.setState(2486);
					this.match(288);
					this.setState(2487);
					this.match(248);
					this.setState(2488);
					this.assignment_stmt_item();
					this.setState(2493);
					this._errHandler.sync(this);

					for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 309, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 309, this._ctx)) {
						if (_alt == 1) {
							this.setState(2489);
							this.match(333);
							this.setState(2490);
							this.assignment_stmt_item();
						}

						this.setState(2495);
						this._errHandler.sync(this);
					}

					this.setState(2497);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 310, this._ctx)) {
						case 1:
							this.setState(2496);
							this.where_clause();
							return _localctx;
						default:
							return _localctx;
					}
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Delete_stmtContext delete_stmt() throws RecognitionException {
		HplsqlParser.Delete_stmtContext _localctx = new HplsqlParser.Delete_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 346, 173);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2502);
			this.match(76);
			this.setState(2504);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 312, this._ctx)) {
				case 1:
					this.setState(2503);
					this.match(114);
				default:
					this.setState(2506);
					this.table_name();
					this.setState(2511);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 314, this._ctx)) {
						case 1:
							this.setState(2508);
							switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 313, this._ctx)) {
								case 1:
									this.setState(2507);
									this.match(14);
								default:
									this.setState(2510);
									this.ident();
							}
						default:
							this.setState(2514);
							switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 315, this._ctx)) {
								case 1:
									this.setState(2513);
									this.where_clause();
							}
					}
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Describe_stmtContext describe_stmt() throws RecognitionException {
		HplsqlParser.Describe_stmtContext _localctx = new HplsqlParser.Describe_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 348, 174);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2516);
			int _la = this._input.LA(1);
			if (_la != 79 && _la != 80) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}

			this.setState(2518);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 316, this._ctx)) {
				case 1:
					this.setState(2517);
					this.match(271);
				default:
					this.setState(2520);
					this.table_name();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Bool_exprContext bool_expr() throws RecognitionException {
		return this.bool_expr(0);
	}

	private HplsqlParser.Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = this._ctx;
		int _parentState = this.getState();
		HplsqlParser.Bool_exprContext _localctx = new HplsqlParser.Bool_exprContext(this._ctx, _parentState);
		int _startState = 350;
		this.enterRecursionRule(_localctx, 350, 175, _p);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2531);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 318, this._ctx)) {
				case 1:
					this.setState(2524);
					int _la = this._input.LA(1);
					if (_la == 189) {
						this.setState(2523);
						this.match(189);
					}

					this.setState(2526);
					this.match(347);
					this.setState(2527);
					this.bool_expr(0);
					this.setState(2528);
					this.match(350);
					break;
				case 2:
					this.setState(2530);
					this.bool_expr_atom();
			}

			this._ctx.stop = this._input.LT(-1);
			this.setState(2539);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 319, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 319, this._ctx)) {
				if (_alt == 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}

					_localctx = new HplsqlParser.Bool_exprContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, 175);
					this.setState(2533);
					if (!this.precpred(this._ctx, 2)) {
						throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					}

					this.setState(2534);
					this.bool_expr_logical_operator();
					this.setState(2535);
					this.bool_expr(3);
				}

				this.setState(2541);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var12) {
			_localctx.exception = var12;
			this._errHandler.reportError(this, var12);
			this._errHandler.recover(this, var12);
		} finally {
			this.unrollRecursionContexts(_parentctx);
		}

		return _localctx;
	}

	public final HplsqlParser.Bool_expr_atomContext bool_expr_atom() throws RecognitionException {
		HplsqlParser.Bool_expr_atomContext _localctx = new HplsqlParser.Bool_expr_atomContext(this._ctx, this.getState());
		this.enterRule(_localctx, 352, 176);

		try {
			this.setState(2545);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 320, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(2542);
					this.bool_expr_unary();
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(2543);
					this.bool_expr_binary();
					break;
				case 3:
					this.enterOuterAlt(_localctx, 3);
					this.setState(2544);
					this.expr(0);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Bool_expr_unaryContext bool_expr_unary() throws RecognitionException {
		HplsqlParser.Bool_expr_unaryContext _localctx = new HplsqlParser.Bool_expr_unaryContext(this._ctx, this.getState());
		this.enterRule(_localctx, 354, 177);

		try {
			this.setState(2562);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 322, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(2547);
					this.expr(0);
					this.setState(2548);
					this.match(149);
					this.setState(2550);
					int _la = this._input.LA(1);
					if (_la == 189) {
						this.setState(2549);
						this.match(189);
					}

					this.setState(2552);
					this.match(191);
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(2554);
					this.expr(0);
					this.setState(2555);
					this.match(22);
					this.setState(2556);
					this.expr(0);
					this.setState(2557);
					this.match(11);
					this.setState(2558);
					this.expr(0);
					break;
				case 3:
					this.enterOuterAlt(_localctx, 3);
					this.setState(2560);
					this.bool_expr_single_in();
					break;
				case 4:
					this.enterOuterAlt(_localctx, 4);
					this.setState(2561);
					this.bool_expr_multi_in();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Bool_expr_single_inContext bool_expr_single_in() throws RecognitionException {
		HplsqlParser.Bool_expr_single_inContext _localctx = new HplsqlParser.Bool_expr_single_inContext(this._ctx, this.getState());
		this.enterRule(_localctx, 356, 178);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2564);
			this.expr(0);
			this.setState(2566);
			int _la = this._input.LA(1);
			if (_la == 189) {
				this.setState(2565);
				this.match(189);
			}

			this.setState(2568);
			this.match(133);
			this.setState(2569);
			this.match(347);
			this.setState(2579);
			label67:
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 325, this._ctx)) {
				case 1:
					this.setState(2570);
					this.expr(0);
					this.setState(2575);
					this._errHandler.sync(this);
					_la = this._input.LA(1);

					while(true) {
						if (_la != 333) {
							break label67;
						}

						this.setState(2571);
						this.match(333);
						this.setState(2572);
						this.expr(0);
						this.setState(2577);
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
				case 2:
					this.setState(2578);
					this.select_stmt();
			}

			this.setState(2581);
			this.match(350);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Bool_expr_multi_inContext bool_expr_multi_in() throws RecognitionException {
		HplsqlParser.Bool_expr_multi_inContext _localctx = new HplsqlParser.Bool_expr_multi_inContext(this._ctx, this.getState());
		this.enterRule(_localctx, 358, 179);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2583);
			this.match(347);
			this.setState(2584);
			this.expr(0);
			this.setState(2589);
			this._errHandler.sync(this);

			int _la;
			for(_la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
				this.setState(2585);
				this.match(333);
				this.setState(2586);
				this.expr(0);
				this.setState(2591);
				this._errHandler.sync(this);
			}

			this.setState(2592);
			this.match(350);
			this.setState(2594);
			_la = this._input.LA(1);
			if (_la == 189) {
				this.setState(2593);
				this.match(189);
			}

			this.setState(2596);
			this.match(133);
			this.setState(2597);
			this.match(347);
			this.setState(2598);
			this.select_stmt();
			this.setState(2599);
			this.match(350);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Bool_expr_binaryContext bool_expr_binary() throws RecognitionException {
		HplsqlParser.Bool_expr_binaryContext _localctx = new HplsqlParser.Bool_expr_binaryContext(this._ctx, this.getState());
		this.enterRule(_localctx, 360, 180);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2601);
			this.expr(0);
			this.setState(2602);
			this.bool_expr_binary_operator();
			this.setState(2603);
			this.expr(0);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Bool_expr_logical_operatorContext bool_expr_logical_operator() throws RecognitionException {
		HplsqlParser.Bool_expr_logical_operatorContext _localctx = new HplsqlParser.Bool_expr_logical_operatorContext(this._ctx, this.getState());
		this.enterRule(_localctx, 362, 181);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2605);
			int _la = this._input.LA(1);
			if (_la != 11 && _la != 199) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Bool_expr_binary_operatorContext bool_expr_binary_operator() throws RecognitionException {
		HplsqlParser.Bool_expr_binary_operatorContext _localctx = new HplsqlParser.Bool_expr_binary_operatorContext(this._ctx, this.getState());
		this.enterRule(_localctx, 364, 182);

		try {
			this.setState(2619);
			switch(this._input.LA(1)) {
				case 159:
				case 189:
				case 222:
				case 232:
					this.enterOuterAlt(_localctx, 9);
					this.setState(2616);
					int _la = this._input.LA(1);
					if (_la == 189) {
						this.setState(2615);
						this.match(189);
					}

					this.setState(2618);
					_la = this._input.LA(1);
					if (_la != 159 && _la != 222 && _la != 232) {
						this._errHandler.recoverInline(this);
					} else {
						this.consume();
					}
					break;
				case 337:
					this.enterOuterAlt(_localctx, 1);
					this.setState(2607);
					this.match(337);
					break;
				case 338:
					this.enterOuterAlt(_localctx, 2);
					this.setState(2608);
					this.match(338);
					break;
				case 339:
					this.enterOuterAlt(_localctx, 3);
					this.setState(2609);
					this.match(339);
					break;
				case 340:
					this.enterOuterAlt(_localctx, 4);
					this.setState(2610);
					this.match(340);
					break;
				case 341:
					this.enterOuterAlt(_localctx, 7);
					this.setState(2613);
					this.match(341);
					break;
				case 342:
					this.enterOuterAlt(_localctx, 8);
					this.setState(2614);
					this.match(342);
					break;
				case 343:
					this.enterOuterAlt(_localctx, 5);
					this.setState(2611);
					this.match(343);
					break;
				case 344:
					this.enterOuterAlt(_localctx, 6);
					this.setState(2612);
					this.match(344);
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.ExprContext expr() throws RecognitionException {
		return this.expr(0);
	}

	private HplsqlParser.ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = this._ctx;
		int _parentState = this.getState();
		HplsqlParser.ExprContext _localctx = new HplsqlParser.ExprContext(this._ctx, _parentState);
		int _startState = 366;
		this.enterRecursionRule(_localctx, 366, 183, _p);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2634);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 330, this._ctx)) {
				case 1:
					this.setState(2622);
					this.match(347);
					this.setState(2623);
					this.expr(0);
					this.setState(2624);
					this.match(350);
					break;
				case 2:
					this.setState(2626);
					this.expr_interval();
					break;
				case 3:
					this.setState(2627);
					this.expr_concat();
					break;
				case 4:
					this.setState(2628);
					this.expr_case();
					break;
				case 5:
					this.setState(2629);
					this.expr_cursor_attribute();
					break;
				case 6:
					this.setState(2630);
					this.expr_agg_window_func();
					break;
				case 7:
					this.setState(2631);
					this.expr_spec_func();
					break;
				case 8:
					this.setState(2632);
					this.expr_func();
					break;
				case 9:
					this.setState(2633);
					this.expr_atom();
			}

			this._ctx.stop = this._input.LT(-1);
			this.setState(2652);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 332, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 332, this._ctx)) {
				if (_alt == 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}

					this.setState(2650);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 331, this._ctx)) {
						case 1:
							_localctx = new HplsqlParser.ExprContext(_parentctx, _parentState);
							this.pushNewRecursionContext(_localctx, _startState, 183);
							this.setState(2636);
							if (!this.precpred(this._ctx, 13)) {
								throw new FailedPredicateException(this, "precpred(_ctx, 13)");
							}

							this.setState(2637);
							this.match(345);
							this.setState(2638);
							this.expr(14);
							break;
						case 2:
							_localctx = new HplsqlParser.ExprContext(_parentctx, _parentState);
							this.pushNewRecursionContext(_localctx, _startState, 183);
							this.setState(2639);
							if (!this.precpred(this._ctx, 12)) {
								throw new FailedPredicateException(this, "precpred(_ctx, 12)");
							}

							this.setState(2640);
							this.match(335);
							this.setState(2641);
							this.expr(13);
							break;
						case 3:
							_localctx = new HplsqlParser.ExprContext(_parentctx, _parentState);
							this.pushNewRecursionContext(_localctx, _startState, 183);
							this.setState(2642);
							if (!this.precpred(this._ctx, 11)) {
								throw new FailedPredicateException(this, "precpred(_ctx, 11)");
							}

							this.setState(2643);
							this.match(331);
							this.setState(2644);
							this.expr(12);
							break;
						case 4:
							_localctx = new HplsqlParser.ExprContext(_parentctx, _parentState);
							this.pushNewRecursionContext(_localctx, _startState, 183);
							this.setState(2645);
							if (!this.precpred(this._ctx, 10)) {
								throw new FailedPredicateException(this, "precpred(_ctx, 10)");
							}

							this.setState(2646);
							this.match(353);
							this.setState(2647);
							this.expr(11);
							break;
						case 5:
							_localctx = new HplsqlParser.ExprContext(_parentctx, _parentState);
							this.pushNewRecursionContext(_localctx, _startState, 183);
							this.setState(2648);
							if (!this.precpred(this._ctx, 14)) {
								throw new FailedPredicateException(this, "precpred(_ctx, 14)");
							}

							this.setState(2649);
							this.interval_item();
					}
				}

				this.setState(2654);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var11) {
			_localctx.exception = var11;
			this._errHandler.reportError(this, var11);
			this._errHandler.recover(this, var11);
		} finally {
			this.unrollRecursionContexts(_parentctx);
		}

		return _localctx;
	}

	public final HplsqlParser.Expr_atomContext expr_atom() throws RecognitionException {
		HplsqlParser.Expr_atomContext _localctx = new HplsqlParser.Expr_atomContext(this._ctx, this.getState());
		this.enterRule(_localctx, 368, 184);

		try {
			this.setState(2663);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 333, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(2655);
					this.date_literal();
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(2656);
					this.timestamp_literal();
					break;
				case 3:
					this.enterOuterAlt(_localctx, 3);
					this.setState(2657);
					this.bool_literal();
					break;
				case 4:
					this.enterOuterAlt(_localctx, 4);
					this.setState(2658);
					this.ident();
					break;
				case 5:
					this.enterOuterAlt(_localctx, 5);
					this.setState(2659);
					this.string();
					break;
				case 6:
					this.enterOuterAlt(_localctx, 6);
					this.setState(2660);
					this.dec_number();
					break;
				case 7:
					this.enterOuterAlt(_localctx, 7);
					this.setState(2661);
					this.int_number();
					break;
				case 8:
					this.enterOuterAlt(_localctx, 8);
					this.setState(2662);
					this.null_const();
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Expr_intervalContext expr_interval() throws RecognitionException {
		HplsqlParser.Expr_intervalContext _localctx = new HplsqlParser.Expr_intervalContext(this._ctx, this.getState());
		this.enterRule(_localctx, 370, 185);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2665);
			this.match(146);
			this.setState(2666);
			this.expr(0);
			this.setState(2667);
			this.interval_item();
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Interval_itemContext interval_item() throws RecognitionException {
		HplsqlParser.Interval_itemContext _localctx = new HplsqlParser.Interval_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 372, 186);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2669);
			int _la = this._input.LA(1);
			if (_la != 66 && _la != 67 && _la != 177 && _la != 178) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Expr_concatContext expr_concat() throws RecognitionException {
		HplsqlParser.Expr_concatContext _localctx = new HplsqlParser.Expr_concatContext(this._ctx, this.getState());
		this.enterRule(_localctx, 374, 187);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2671);
			this.expr_concat_item();
			this.setState(2672);
			int _la = this._input.LA(1);
			if (_la != 49 && _la != 334) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}

			this.setState(2673);
			this.expr_concat_item();
			this.setState(2678);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 334, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 334, this._ctx)) {
				if (_alt == 1) {
					this.setState(2674);
					_la = this._input.LA(1);
					if (_la != 49 && _la != 334) {
						this._errHandler.recoverInline(this);
					} else {
						this.consume();
					}

					this.setState(2675);
					this.expr_concat_item();
				}

				this.setState(2680);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		HplsqlParser.Expr_concat_itemContext _localctx = new HplsqlParser.Expr_concat_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 376, 188);

		try {
			this.setState(2690);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 335, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(2681);
					this.match(347);
					this.setState(2682);
					this.expr(0);
					this.setState(2683);
					this.match(350);
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(2685);
					this.expr_case();
					break;
				case 3:
					this.enterOuterAlt(_localctx, 3);
					this.setState(2686);
					this.expr_agg_window_func();
					break;
				case 4:
					this.enterOuterAlt(_localctx, 4);
					this.setState(2687);
					this.expr_spec_func();
					break;
				case 5:
					this.enterOuterAlt(_localctx, 5);
					this.setState(2688);
					this.expr_func();
					break;
				case 6:
					this.enterOuterAlt(_localctx, 6);
					this.setState(2689);
					this.expr_atom();
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Expr_caseContext expr_case() throws RecognitionException {
		HplsqlParser.Expr_caseContext _localctx = new HplsqlParser.Expr_caseContext(this._ctx, this.getState());
		this.enterRule(_localctx, 378, 189);

		try {
			this.setState(2694);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 336, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(2692);
					this.expr_case_simple();
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(2693);
					this.expr_case_searched();
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Expr_case_simpleContext expr_case_simple() throws RecognitionException {
		HplsqlParser.Expr_case_simpleContext _localctx = new HplsqlParser.Expr_case_simpleContext(this._ctx, this.getState());
		this.enterRule(_localctx, 380, 190);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2696);
			this.match(35);
			this.setState(2697);
			this.expr(0);
			this.setState(2703);
			this._errHandler.sync(this);
			int _la = this._input.LA(1);

			do {
				this.setState(2698);
				this.match(299);
				this.setState(2699);
				this.expr(0);
				this.setState(2700);
				this.match(276);
				this.setState(2701);
				this.expr(0);
				this.setState(2705);
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while(_la == 299);

			this.setState(2709);
			_la = this._input.LA(1);
			if (_la == 90) {
				this.setState(2707);
				this.match(90);
				this.setState(2708);
				this.expr(0);
			}

			this.setState(2711);
			this.match(94);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Expr_case_searchedContext expr_case_searched() throws RecognitionException {
		HplsqlParser.Expr_case_searchedContext _localctx = new HplsqlParser.Expr_case_searchedContext(this._ctx, this.getState());
		this.enterRule(_localctx, 382, 191);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2713);
			this.match(35);
			this.setState(2719);
			this._errHandler.sync(this);
			int _la = this._input.LA(1);

			do {
				this.setState(2714);
				this.match(299);
				this.setState(2715);
				this.bool_expr(0);
				this.setState(2716);
				this.match(276);
				this.setState(2717);
				this.expr(0);
				this.setState(2721);
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while(_la == 299);

			this.setState(2725);
			_la = this._input.LA(1);
			if (_la == 90) {
				this.setState(2723);
				this.match(90);
				this.setState(2724);
				this.expr(0);
			}

			this.setState(2727);
			this.match(94);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Expr_cursor_attributeContext expr_cursor_attribute() throws RecognitionException {
		HplsqlParser.Expr_cursor_attributeContext _localctx = new HplsqlParser.Expr_cursor_attributeContext(this._ctx, this.getState());
		this.enterRule(_localctx, 384, 192);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2729);
			this.ident();
			this.setState(2730);
			this.match(3);
			this.setState(2731);
			int _la = this._input.LA(1);
			if (_la != 113 && _la != 150 && _la != 190) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Expr_agg_window_funcContext expr_agg_window_func() throws RecognitionException {
		HplsqlParser.Expr_agg_window_funcContext _localctx = new HplsqlParser.Expr_agg_window_funcContext(this._ctx, this.getState());
		this.enterRule(_localctx, 386, 193);

		try {
			this.setState(2885);
			int _la;
			switch(this._input.LA(1)) {
				case 19:
					this.enterOuterAlt(_localctx, 1);
					this.setState(2733);
					this.match(19);
					this.setState(2734);
					this.match(347);
					this.setState(2736);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 341, this._ctx)) {
						case 1:
							this.setState(2735);
							this.expr_func_all_distinct();
						default:
							this.setState(2738);
							this.expr(0);
							this.setState(2739);
							this.match(350);
							this.setState(2741);
							switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 342, this._ctx)) {
								case 1:
									this.setState(2740);
									this.expr_func_over_clause();
									return _localctx;
								default:
									return _localctx;
							}
					}
				case 54:
					this.enterOuterAlt(_localctx, 2);
					this.setState(2743);
					this.match(54);
					this.setState(2744);
					this.match(347);
					this.setState(2750);
					label248:
					switch(this._input.LA(1)) {
						case 6:
						case 7:
						case 8:
						case 9:
						case 10:
						case 11:
						case 12:
						case 13:
						case 14:
						case 15:
						case 16:
						case 17:
						case 18:
						case 19:
						case 20:
						case 21:
						case 22:
						case 23:
						case 24:
						case 25:
						case 27:
						case 28:
						case 29:
						case 30:
						case 31:
						case 32:
						case 33:
						case 34:
						case 35:
						case 36:
						case 37:
						case 38:
						case 39:
						case 40:
						case 41:
						case 42:
						case 43:
						case 44:
						case 45:
						case 46:
						case 47:
						case 48:
						case 49:
						case 50:
						case 51:
						case 52:
						case 53:
						case 54:
						case 55:
						case 56:
						case 57:
						case 58:
						case 59:
						case 60:
						case 61:
						case 62:
						case 63:
						case 64:
						case 65:
						case 66:
						case 67:
						case 68:
						case 69:
						case 70:
						case 71:
						case 72:
						case 73:
						case 74:
						case 75:
						case 76:
						case 77:
						case 78:
						case 79:
						case 80:
						case 81:
						case 82:
						case 83:
						case 84:
						case 85:
						case 86:
						case 87:
						case 88:
						case 89:
						case 93:
						case 95:
						case 96:
						case 97:
						case 98:
						case 99:
						case 100:
						case 101:
						case 102:
						case 103:
						case 104:
						case 105:
						case 106:
						case 107:
						case 108:
						case 109:
						case 110:
						case 111:
						case 112:
						case 113:
						case 114:
						case 115:
						case 116:
						case 117:
						case 118:
						case 119:
						case 120:
						case 121:
						case 122:
						case 123:
						case 124:
						case 125:
						case 126:
						case 127:
						case 128:
						case 129:
						case 130:
						case 131:
						case 132:
						case 133:
						case 134:
						case 135:
						case 136:
						case 137:
						case 138:
						case 139:
						case 140:
						case 141:
						case 142:
						case 143:
						case 144:
						case 145:
						case 146:
						case 147:
						case 148:
						case 149:
						case 150:
						case 151:
						case 152:
						case 153:
						case 154:
						case 155:
						case 156:
						case 157:
						case 158:
						case 159:
						case 160:
						case 161:
						case 162:
						case 163:
						case 164:
						case 165:
						case 166:
						case 167:
						case 168:
						case 169:
						case 170:
						case 171:
						case 172:
						case 173:
						case 174:
						case 175:
						case 176:
						case 177:
						case 178:
						case 179:
						case 180:
						case 181:
						case 182:
						case 183:
						case 184:
						case 185:
						case 186:
						case 187:
						case 188:
						case 189:
						case 190:
						case 191:
						case 192:
						case 193:
						case 194:
						case 195:
						case 196:
						case 197:
						case 198:
						case 199:
						case 200:
						case 201:
						case 202:
						case 203:
						case 204:
						case 205:
						case 206:
						case 207:
						case 208:
						case 209:
						case 211:
						case 212:
						case 213:
						case 214:
						case 215:
						case 216:
						case 217:
						case 218:
						case 219:
						case 220:
						case 221:
						case 222:
						case 223:
						case 224:
						case 225:
						case 226:
						case 227:
						case 228:
						case 229:
						case 230:
						case 231:
						case 232:
						case 233:
						case 234:
						case 235:
						case 236:
						case 238:
						case 239:
						case 240:
						case 241:
						case 242:
						case 243:
						case 244:
						case 245:
						case 246:
						case 247:
						case 248:
						case 249:
						case 250:
						case 251:
						case 252:
						case 253:
						case 254:
						case 255:
						case 257:
						case 258:
						case 259:
						case 260:
						case 261:
						case 262:
						case 263:
						case 264:
						case 265:
						case 266:
						case 267:
						case 268:
						case 269:
						case 270:
						case 271:
						case 272:
						case 273:
						case 274:
						case 275:
						case 276:
						case 277:
						case 279:
						case 280:
						case 281:
						case 282:
						case 283:
						case 284:
						case 287:
						case 288:
						case 289:
						case 290:
						case 291:
						case 292:
						case 293:
						case 294:
						case 295:
						case 296:
						case 297:
						case 298:
						case 301:
						case 302:
						case 303:
						case 304:
						case 305:
						case 306:
						case 307:
						case 308:
						case 309:
						case 310:
						case 311:
						case 312:
						case 313:
						case 314:
						case 315:
						case 316:
						case 317:
						case 318:
						case 319:
						case 320:
						case 321:
						case 322:
						case 323:
						case 324:
						case 325:
						case 326:
						case 327:
						case 328:
						case 329:
						case 330:
						case 331:
						case 347:
						case 353:
						case 354:
						case 355:
						case 356:
						case 357:
						case 358:
							this.setState(2746);
							switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 343, this._ctx)) {
								case 1:
									this.setState(2745);
									this.expr_func_all_distinct();
								default:
									this.setState(2748);
									this.expr(0);
									break label248;
							}
						case 26:
						case 90:
						case 91:
						case 92:
						case 94:
						case 210:
						case 237:
						case 256:
						case 278:
						case 285:
						case 286:
						case 299:
						case 300:
						case 332:
						case 333:
						case 334:
						case 335:
						case 336:
						case 337:
						case 338:
						case 339:
						case 340:
						case 341:
						case 342:
						case 343:
						case 344:
						case 346:
						case 348:
						case 349:
						case 350:
						case 351:
						case 352:
						default:
							throw new NoViableAltException(this);
						case 345:
							this.setState(2749);
							this.match(345);
					}

					this.setState(2752);
					this.match(350);
					this.setState(2754);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 345, this._ctx)) {
						case 1:
							this.setState(2753);
							this.expr_func_over_clause();
							return _localctx;
						default:
							return _localctx;
					}
				case 55:
					this.enterOuterAlt(_localctx, 3);
					this.setState(2756);
					this.match(55);
					this.setState(2757);
					this.match(347);
					this.setState(2763);
					label242:
					switch(this._input.LA(1)) {
						case 6:
						case 7:
						case 8:
						case 9:
						case 10:
						case 11:
						case 12:
						case 13:
						case 14:
						case 15:
						case 16:
						case 17:
						case 18:
						case 19:
						case 20:
						case 21:
						case 22:
						case 23:
						case 24:
						case 25:
						case 27:
						case 28:
						case 29:
						case 30:
						case 31:
						case 32:
						case 33:
						case 34:
						case 35:
						case 36:
						case 37:
						case 38:
						case 39:
						case 40:
						case 41:
						case 42:
						case 43:
						case 44:
						case 45:
						case 46:
						case 47:
						case 48:
						case 49:
						case 50:
						case 51:
						case 52:
						case 53:
						case 54:
						case 55:
						case 56:
						case 57:
						case 58:
						case 59:
						case 60:
						case 61:
						case 62:
						case 63:
						case 64:
						case 65:
						case 66:
						case 67:
						case 68:
						case 69:
						case 70:
						case 71:
						case 72:
						case 73:
						case 74:
						case 75:
						case 76:
						case 77:
						case 78:
						case 79:
						case 80:
						case 81:
						case 82:
						case 83:
						case 84:
						case 85:
						case 86:
						case 87:
						case 88:
						case 89:
						case 93:
						case 95:
						case 96:
						case 97:
						case 98:
						case 99:
						case 100:
						case 101:
						case 102:
						case 103:
						case 104:
						case 105:
						case 106:
						case 107:
						case 108:
						case 109:
						case 110:
						case 111:
						case 112:
						case 113:
						case 114:
						case 115:
						case 116:
						case 117:
						case 118:
						case 119:
						case 120:
						case 121:
						case 122:
						case 123:
						case 124:
						case 125:
						case 126:
						case 127:
						case 128:
						case 129:
						case 130:
						case 131:
						case 132:
						case 133:
						case 134:
						case 135:
						case 136:
						case 137:
						case 138:
						case 139:
						case 140:
						case 141:
						case 142:
						case 143:
						case 144:
						case 145:
						case 146:
						case 147:
						case 148:
						case 149:
						case 150:
						case 151:
						case 152:
						case 153:
						case 154:
						case 155:
						case 156:
						case 157:
						case 158:
						case 159:
						case 160:
						case 161:
						case 162:
						case 163:
						case 164:
						case 165:
						case 166:
						case 167:
						case 168:
						case 169:
						case 170:
						case 171:
						case 172:
						case 173:
						case 174:
						case 175:
						case 176:
						case 177:
						case 178:
						case 179:
						case 180:
						case 181:
						case 182:
						case 183:
						case 184:
						case 185:
						case 186:
						case 187:
						case 188:
						case 189:
						case 190:
						case 191:
						case 192:
						case 193:
						case 194:
						case 195:
						case 196:
						case 197:
						case 198:
						case 199:
						case 200:
						case 201:
						case 202:
						case 203:
						case 204:
						case 205:
						case 206:
						case 207:
						case 208:
						case 209:
						case 211:
						case 212:
						case 213:
						case 214:
						case 215:
						case 216:
						case 217:
						case 218:
						case 219:
						case 220:
						case 221:
						case 222:
						case 223:
						case 224:
						case 225:
						case 226:
						case 227:
						case 228:
						case 229:
						case 230:
						case 231:
						case 232:
						case 233:
						case 234:
						case 235:
						case 236:
						case 238:
						case 239:
						case 240:
						case 241:
						case 242:
						case 243:
						case 244:
						case 245:
						case 246:
						case 247:
						case 248:
						case 249:
						case 250:
						case 251:
						case 252:
						case 253:
						case 254:
						case 255:
						case 257:
						case 258:
						case 259:
						case 260:
						case 261:
						case 262:
						case 263:
						case 264:
						case 265:
						case 266:
						case 267:
						case 268:
						case 269:
						case 270:
						case 271:
						case 272:
						case 273:
						case 274:
						case 275:
						case 276:
						case 277:
						case 279:
						case 280:
						case 281:
						case 282:
						case 283:
						case 284:
						case 287:
						case 288:
						case 289:
						case 290:
						case 291:
						case 292:
						case 293:
						case 294:
						case 295:
						case 296:
						case 297:
						case 298:
						case 301:
						case 302:
						case 303:
						case 304:
						case 305:
						case 306:
						case 307:
						case 308:
						case 309:
						case 310:
						case 311:
						case 312:
						case 313:
						case 314:
						case 315:
						case 316:
						case 317:
						case 318:
						case 319:
						case 320:
						case 321:
						case 322:
						case 323:
						case 324:
						case 325:
						case 326:
						case 327:
						case 328:
						case 329:
						case 330:
						case 331:
						case 347:
						case 353:
						case 354:
						case 355:
						case 356:
						case 357:
						case 358:
							this.setState(2759);
							switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 346, this._ctx)) {
								case 1:
									this.setState(2758);
									this.expr_func_all_distinct();
								default:
									this.setState(2761);
									this.expr(0);
									break label242;
							}
						case 26:
						case 90:
						case 91:
						case 92:
						case 94:
						case 210:
						case 237:
						case 256:
						case 278:
						case 285:
						case 286:
						case 299:
						case 300:
						case 332:
						case 333:
						case 334:
						case 335:
						case 336:
						case 337:
						case 338:
						case 339:
						case 340:
						case 341:
						case 342:
						case 343:
						case 344:
						case 346:
						case 348:
						case 349:
						case 350:
						case 351:
						case 352:
						default:
							throw new NoViableAltException(this);
						case 345:
							this.setState(2762);
							this.match(345);
					}

					this.setState(2765);
					this.match(350);
					this.setState(2767);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 348, this._ctx)) {
						case 1:
							this.setState(2766);
							this.expr_func_over_clause();
							return _localctx;
						default:
							return _localctx;
					}
				case 173:
					this.enterOuterAlt(_localctx, 10);
					this.setState(2817);
					this.match(173);
					this.setState(2818);
					this.match(347);
					this.setState(2820);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 353, this._ctx)) {
						case 1:
							this.setState(2819);
							this.expr_func_all_distinct();
						default:
							this.setState(2822);
							this.expr(0);
							this.setState(2823);
							this.match(350);
							this.setState(2825);
							switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 354, this._ctx)) {
								case 1:
									this.setState(2824);
									this.expr_func_over_clause();
									return _localctx;
								default:
									return _localctx;
							}
					}
				case 179:
					this.enterOuterAlt(_localctx, 11);
					this.setState(2827);
					this.match(179);
					this.setState(2828);
					this.match(347);
					this.setState(2830);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 355, this._ctx)) {
						case 1:
							this.setState(2829);
							this.expr_func_all_distinct();
						default:
							this.setState(2832);
							this.expr(0);
							this.setState(2833);
							this.match(350);
							this.setState(2835);
							switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 356, this._ctx)) {
								case 1:
									this.setState(2834);
									this.expr_func_over_clause();
									return _localctx;
								default:
									return _localctx;
							}
					}
				case 269:
					this.enterOuterAlt(_localctx, 15);
					this.setState(2855);
					this.match(269);
					this.setState(2856);
					this.match(347);
					this.setState(2858);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 359, this._ctx)) {
						case 1:
							this.setState(2857);
							this.expr_func_all_distinct();
						default:
							this.setState(2860);
							this.expr(0);
							this.setState(2861);
							this.match(350);
							this.setState(2863);
							switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 360, this._ctx)) {
								case 1:
									this.setState(2862);
									this.expr_func_over_clause();
									return _localctx;
								default:
									return _localctx;
							}
					}
				case 294:
					this.enterOuterAlt(_localctx, 16);
					this.setState(2865);
					this.match(294);
					this.setState(2866);
					this.match(347);
					this.setState(2868);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 361, this._ctx)) {
						case 1:
							this.setState(2867);
							this.expr_func_all_distinct();
						default:
							this.setState(2870);
							this.expr(0);
							this.setState(2871);
							this.match(350);
							this.setState(2873);
							switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 362, this._ctx)) {
								case 1:
									this.setState(2872);
									this.expr_func_over_clause();
									return _localctx;
								default:
									return _localctx;
							}
					}
				case 308:
					this.enterOuterAlt(_localctx, 4);
					this.setState(2769);
					this.match(308);
					this.setState(2770);
					this.match(347);
					this.setState(2771);
					this.match(350);
					this.setState(2772);
					this.expr_func_over_clause();
					break;
				case 312:
					this.enterOuterAlt(_localctx, 5);
					this.setState(2773);
					this.match(312);
					this.setState(2774);
					this.match(347);
					this.setState(2775);
					this.match(350);
					this.setState(2776);
					this.expr_func_over_clause();
					break;
				case 313:
					this.enterOuterAlt(_localctx, 6);
					this.setState(2777);
					this.match(313);
					this.setState(2778);
					this.match(347);
					this.setState(2779);
					this.expr(0);
					this.setState(2780);
					this.match(350);
					this.setState(2781);
					this.expr_func_over_clause();
					break;
				case 314:
					this.enterOuterAlt(_localctx, 7);
					this.setState(2783);
					this.match(314);
					this.setState(2784);
					this.match(347);
					this.setState(2785);
					this.expr(0);
					this.setState(2792);
					_la = this._input.LA(1);
					if (_la == 333) {
						this.setState(2786);
						this.match(333);
						this.setState(2787);
						this.expr(0);
						this.setState(2790);
						_la = this._input.LA(1);
						if (_la == 333) {
							this.setState(2788);
							this.match(333);
							this.setState(2789);
							this.expr(0);
						}
					}

					this.setState(2794);
					this.match(350);
					this.setState(2795);
					this.expr_func_over_clause();
					break;
				case 315:
					this.enterOuterAlt(_localctx, 8);
					this.setState(2797);
					this.match(315);
					this.setState(2798);
					this.match(347);
					this.setState(2799);
					this.expr(0);
					this.setState(2800);
					this.match(350);
					this.setState(2801);
					this.expr_func_over_clause();
					break;
				case 316:
					this.enterOuterAlt(_localctx, 9);
					this.setState(2803);
					this.match(316);
					this.setState(2804);
					this.match(347);
					this.setState(2805);
					this.expr(0);
					this.setState(2812);
					_la = this._input.LA(1);
					if (_la == 333) {
						this.setState(2806);
						this.match(333);
						this.setState(2807);
						this.expr(0);
						this.setState(2810);
						_la = this._input.LA(1);
						if (_la == 333) {
							this.setState(2808);
							this.match(333);
							this.setState(2809);
							this.expr(0);
						}
					}

					this.setState(2814);
					this.match(350);
					this.setState(2815);
					this.expr_func_over_clause();
					break;
				case 325:
					this.enterOuterAlt(_localctx, 12);
					this.setState(2837);
					this.match(325);
					this.setState(2838);
					this.match(347);
					this.setState(2839);
					this.match(350);
					this.setState(2840);
					this.expr_func_over_clause();
					break;
				case 326:
					this.enterOuterAlt(_localctx, 13);
					this.setState(2841);
					this.match(326);
					this.setState(2842);
					this.match(347);
					this.setState(2843);
					this.match(350);
					this.setState(2844);
					this.expr_func_over_clause();
					break;
				case 327:
					this.enterOuterAlt(_localctx, 14);
					this.setState(2845);
					this.match(327);
					this.setState(2846);
					this.match(347);
					this.setState(2848);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 357, this._ctx)) {
						case 1:
							this.setState(2847);
							this.expr_func_all_distinct();
						default:
							this.setState(2850);
							this.expr(0);
							this.setState(2851);
							this.match(350);
							this.setState(2853);
							switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 358, this._ctx)) {
								case 1:
									this.setState(2852);
									this.expr_func_over_clause();
									return _localctx;
								default:
									return _localctx;
							}
					}
				case 329:
					this.enterOuterAlt(_localctx, 17);
					this.setState(2875);
					this.match(329);
					this.setState(2876);
					this.match(347);
					this.setState(2878);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 363, this._ctx)) {
						case 1:
							this.setState(2877);
							this.expr_func_all_distinct();
						default:
							this.setState(2880);
							this.expr(0);
							this.setState(2881);
							this.match(350);
							this.setState(2883);
							switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 364, this._ctx)) {
								case 1:
									this.setState(2882);
									this.expr_func_over_clause();
									return _localctx;
								default:
									return _localctx;
							}
					}
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Expr_func_all_distinctContext expr_func_all_distinct() throws RecognitionException {
		HplsqlParser.Expr_func_all_distinctContext _localctx = new HplsqlParser.Expr_func_all_distinctContext(this._ctx, this.getState());
		this.enterRule(_localctx, 388, 194);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2887);
			int _la = this._input.LA(1);
			if (_la != 8 && _la != 84) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Expr_func_over_clauseContext expr_func_over_clause() throws RecognitionException {
		HplsqlParser.Expr_func_over_clauseContext _localctx = new HplsqlParser.Expr_func_over_clauseContext(this._ctx, this.getState());
		this.enterRule(_localctx, 390, 195);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2889);
			this.match(203);
			this.setState(2890);
			this.match(347);
			this.setState(2892);
			int _la = this._input.LA(1);
			if (_la == 207) {
				this.setState(2891);
				this.expr_func_partition_by_clause();
			}

			this.setState(2895);
			_la = this._input.LA(1);
			if (_la == 200) {
				this.setState(2894);
				this.order_by_clause();
			}

			this.setState(2897);
			this.match(350);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Expr_func_partition_by_clauseContext expr_func_partition_by_clause() throws RecognitionException {
		HplsqlParser.Expr_func_partition_by_clauseContext _localctx = new HplsqlParser.Expr_func_partition_by_clauseContext(this._ctx, this.getState());
		this.enterRule(_localctx, 392, 196);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(2899);
			this.match(207);
			this.setState(2900);
			this.match(30);
			this.setState(2901);
			this.expr(0);
			this.setState(2906);
			this._errHandler.sync(this);

			for(int _la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
				this.setState(2902);
				this.match(333);
				this.setState(2903);
				this.expr(0);
				this.setState(2908);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Expr_spec_funcContext expr_spec_func() throws RecognitionException {
		HplsqlParser.Expr_spec_funcContext _localctx = new HplsqlParser.Expr_spec_funcContext(this._ctx, this.getState());
		this.enterRule(_localctx, 394, 197);

		try {
			this.setState(3109);
			int _la;
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 389, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(2909);
					this.match(307);
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(2910);
					this.match(37);
					this.setState(2911);
					this.match(347);
					this.setState(2912);
					this.expr(0);
					this.setState(2913);
					this.match(14);
					this.setState(2914);
					this.dtype();
					this.setState(2916);
					_la = this._input.LA(1);
					if (_la == 347) {
						this.setState(2915);
						this.dtype_len();
					}

					this.setState(2918);
					this.match(350);
					break;
				case 3:
					this.enterOuterAlt(_localctx, 3);
					this.setState(2920);
					this.match(54);
					this.setState(2921);
					this.match(347);
					this.setState(2924);
					switch(this._input.LA(1)) {
						case 6:
						case 7:
						case 8:
						case 9:
						case 10:
						case 11:
						case 12:
						case 13:
						case 14:
						case 15:
						case 16:
						case 17:
						case 18:
						case 19:
						case 20:
						case 21:
						case 22:
						case 23:
						case 24:
						case 25:
						case 27:
						case 28:
						case 29:
						case 30:
						case 31:
						case 32:
						case 33:
						case 34:
						case 35:
						case 36:
						case 37:
						case 38:
						case 39:
						case 40:
						case 41:
						case 42:
						case 43:
						case 44:
						case 45:
						case 46:
						case 47:
						case 48:
						case 49:
						case 50:
						case 51:
						case 52:
						case 53:
						case 54:
						case 55:
						case 56:
						case 57:
						case 58:
						case 59:
						case 60:
						case 61:
						case 62:
						case 63:
						case 64:
						case 65:
						case 66:
						case 67:
						case 68:
						case 69:
						case 70:
						case 71:
						case 72:
						case 73:
						case 74:
						case 75:
						case 76:
						case 77:
						case 78:
						case 79:
						case 80:
						case 81:
						case 82:
						case 83:
						case 84:
						case 85:
						case 86:
						case 87:
						case 88:
						case 89:
						case 93:
						case 95:
						case 96:
						case 97:
						case 98:
						case 99:
						case 100:
						case 101:
						case 102:
						case 103:
						case 104:
						case 105:
						case 106:
						case 107:
						case 108:
						case 109:
						case 110:
						case 111:
						case 112:
						case 113:
						case 114:
						case 115:
						case 116:
						case 117:
						case 118:
						case 119:
						case 120:
						case 121:
						case 122:
						case 123:
						case 124:
						case 125:
						case 126:
						case 127:
						case 128:
						case 129:
						case 130:
						case 131:
						case 132:
						case 133:
						case 134:
						case 135:
						case 136:
						case 137:
						case 138:
						case 139:
						case 140:
						case 141:
						case 142:
						case 143:
						case 144:
						case 145:
						case 146:
						case 147:
						case 148:
						case 149:
						case 150:
						case 151:
						case 152:
						case 153:
						case 154:
						case 155:
						case 156:
						case 157:
						case 158:
						case 159:
						case 160:
						case 161:
						case 162:
						case 163:
						case 164:
						case 165:
						case 166:
						case 167:
						case 168:
						case 169:
						case 170:
						case 171:
						case 172:
						case 173:
						case 174:
						case 175:
						case 176:
						case 177:
						case 178:
						case 179:
						case 180:
						case 181:
						case 182:
						case 183:
						case 184:
						case 185:
						case 186:
						case 187:
						case 188:
						case 189:
						case 190:
						case 191:
						case 192:
						case 193:
						case 194:
						case 195:
						case 196:
						case 197:
						case 198:
						case 199:
						case 200:
						case 201:
						case 202:
						case 203:
						case 204:
						case 205:
						case 206:
						case 207:
						case 208:
						case 209:
						case 211:
						case 212:
						case 213:
						case 214:
						case 215:
						case 216:
						case 217:
						case 218:
						case 219:
						case 220:
						case 221:
						case 222:
						case 223:
						case 224:
						case 225:
						case 226:
						case 227:
						case 228:
						case 229:
						case 230:
						case 231:
						case 232:
						case 233:
						case 234:
						case 235:
						case 236:
						case 238:
						case 239:
						case 240:
						case 241:
						case 242:
						case 243:
						case 244:
						case 245:
						case 246:
						case 247:
						case 248:
						case 249:
						case 250:
						case 251:
						case 252:
						case 253:
						case 254:
						case 255:
						case 257:
						case 258:
						case 259:
						case 260:
						case 261:
						case 262:
						case 263:
						case 264:
						case 265:
						case 266:
						case 267:
						case 268:
						case 269:
						case 270:
						case 271:
						case 272:
						case 273:
						case 274:
						case 275:
						case 276:
						case 277:
						case 279:
						case 280:
						case 281:
						case 282:
						case 283:
						case 284:
						case 287:
						case 288:
						case 289:
						case 290:
						case 291:
						case 292:
						case 293:
						case 294:
						case 295:
						case 296:
						case 297:
						case 298:
						case 301:
						case 302:
						case 303:
						case 304:
						case 305:
						case 306:
						case 307:
						case 308:
						case 309:
						case 310:
						case 311:
						case 312:
						case 313:
						case 314:
						case 315:
						case 316:
						case 317:
						case 318:
						case 319:
						case 320:
						case 321:
						case 322:
						case 323:
						case 324:
						case 325:
						case 326:
						case 327:
						case 328:
						case 329:
						case 330:
						case 331:
						case 347:
						case 353:
						case 354:
						case 355:
						case 356:
						case 357:
						case 358:
							this.setState(2922);
							this.expr(0);
							break;
						case 26:
						case 90:
						case 91:
						case 92:
						case 94:
						case 210:
						case 237:
						case 256:
						case 278:
						case 285:
						case 286:
						case 299:
						case 300:
						case 332:
						case 333:
						case 334:
						case 335:
						case 336:
						case 337:
						case 338:
						case 339:
						case 340:
						case 341:
						case 342:
						case 343:
						case 344:
						case 346:
						case 348:
						case 349:
						case 350:
						case 351:
						case 352:
						default:
							throw new NoViableAltException(this);
						case 345:
							this.setState(2923);
							this.match(345);
					}

					this.setState(2926);
					this.match(350);
					break;
				case 4:
					this.enterOuterAlt(_localctx, 4);
					this.setState(2927);
					this.match(309);
					break;
				case 5:
					this.enterOuterAlt(_localctx, 5);
					this.setState(2928);
					this.match(60);
					this.setState(2929);
					this.match(64);
					break;
				case 6:
					this.enterOuterAlt(_localctx, 6);
					this.setState(2933);
					switch(this._input.LA(1)) {
						case 60:
							this.setState(2931);
							this.match(60);
							this.setState(2932);
							this.match(277);
							break;
						case 310:
							this.setState(2930);
							this.match(310);
							break;
						default:
							throw new NoViableAltException(this);
					}

					this.setState(2939);
					switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 372, this._ctx)) {
						case 1:
							this.setState(2935);
							this.match(347);
							this.setState(2936);
							this.expr(0);
							this.setState(2937);
							this.match(350);
							return _localctx;
						default:
							return _localctx;
					}
				case 7:
					this.enterOuterAlt(_localctx, 7);
					this.setState(2941);
					this.match(311);
					break;
				case 8:
					this.enterOuterAlt(_localctx, 8);
					this.setState(2942);
					this.match(60);
					this.setState(2943);
					this.match(330);
					break;
				case 9:
					this.enterOuterAlt(_localctx, 9);
					this.setState(2944);
					this.match(317);
					this.setState(2945);
					this.match(347);
					this.setState(2946);
					this.expr(0);
					this.setState(2959);
					_la = this._input.LA(1);
					if (_la == 333) {
						this.setState(2947);
						this.match(333);
						this.setState(2948);
						this.expr(0);
						this.setState(2956);
						this._errHandler.sync(this);

						for(_la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
							this.setState(2949);
							this.match(333);
							this.setState(2950);
							this.expr(0);
							this.setState(2951);
							this.match(337);
							this.setState(2952);
							this.expr(0);
							this.setState(2958);
							this._errHandler.sync(this);
						}
					}

					this.setState(2961);
					this.match(350);
					break;
				case 10:
					this.enterOuterAlt(_localctx, 10);
					this.setState(2963);
					this.match(318);
					this.setState(2964);
					this.match(347);
					this.setState(2965);
					this.expr(0);
					this.setState(2978);
					_la = this._input.LA(1);
					if (_la == 333) {
						this.setState(2966);
						this.match(333);
						this.setState(2967);
						this.expr(0);
						this.setState(2975);
						this._errHandler.sync(this);

						for(_la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
							this.setState(2968);
							this.match(333);
							this.setState(2969);
							this.expr(0);
							this.setState(2970);
							this.match(337);
							this.setState(2971);
							this.expr(0);
							this.setState(2977);
							this._errHandler.sync(this);
						}
					}

					this.setState(2980);
					this.match(350);
					break;
				case 11:
					this.enterOuterAlt(_localctx, 11);
					this.setState(2982);
					this.match(319);
					this.setState(2983);
					this.match(347);
					this.setState(2984);
					this.expr(0);
					this.setState(2997);
					_la = this._input.LA(1);
					if (_la == 333) {
						this.setState(2985);
						this.match(333);
						this.setState(2986);
						this.expr(0);
						this.setState(2994);
						this._errHandler.sync(this);

						for(_la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
							this.setState(2987);
							this.match(333);
							this.setState(2988);
							this.expr(0);
							this.setState(2989);
							this.match(337);
							this.setState(2990);
							this.expr(0);
							this.setState(2996);
							this._errHandler.sync(this);
						}
					}

					this.setState(2999);
					this.match(350);
					break;
				case 12:
					this.enterOuterAlt(_localctx, 12);
					this.setState(3001);
					this.match(320);
					this.setState(3002);
					this.match(347);
					this.setState(3003);
					this.expr(0);
					this.setState(3016);
					_la = this._input.LA(1);
					if (_la == 333) {
						this.setState(3004);
						this.match(333);
						this.setState(3005);
						this.expr(0);
						this.setState(3013);
						this._errHandler.sync(this);

						for(_la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
							this.setState(3006);
							this.match(333);
							this.setState(3007);
							this.expr(0);
							this.setState(3008);
							this.match(337);
							this.setState(3009);
							this.expr(0);
							this.setState(3015);
							this._errHandler.sync(this);
						}
					}

					this.setState(3018);
					this.match(350);
					break;
				case 13:
					this.enterOuterAlt(_localctx, 13);
					this.setState(3020);
					this.match(321);
					this.setState(3021);
					this.match(347);
					this.setState(3022);
					this.expr(0);
					this.setState(3035);
					_la = this._input.LA(1);
					if (_la == 333) {
						this.setState(3023);
						this.match(333);
						this.setState(3024);
						this.expr(0);
						this.setState(3032);
						this._errHandler.sync(this);

						for(_la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
							this.setState(3025);
							this.match(333);
							this.setState(3026);
							this.expr(0);
							this.setState(3027);
							this.match(337);
							this.setState(3028);
							this.expr(0);
							this.setState(3034);
							this._errHandler.sync(this);
						}
					}

					this.setState(3037);
					this.match(350);
					break;
				case 14:
					this.enterOuterAlt(_localctx, 14);
					this.setState(3039);
					this.match(322);
					this.setState(3040);
					this.match(347);
					this.setState(3041);
					this.expr(0);
					this.setState(3054);
					_la = this._input.LA(1);
					if (_la == 333) {
						this.setState(3042);
						this.match(333);
						this.setState(3043);
						this.expr(0);
						this.setState(3051);
						this._errHandler.sync(this);

						for(_la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
							this.setState(3044);
							this.match(333);
							this.setState(3045);
							this.expr(0);
							this.setState(3046);
							this.match(337);
							this.setState(3047);
							this.expr(0);
							this.setState(3053);
							this._errHandler.sync(this);
						}
					}

					this.setState(3056);
					this.match(350);
					break;
				case 15:
					this.enterOuterAlt(_localctx, 15);
					this.setState(3058);
					this.match(323);
					this.setState(3059);
					this.match(347);
					this.setState(3060);
					this.expr(0);
					this.setState(3068);
					this._errHandler.sync(this);

					for(_la = this._input.LA(1); _la == 333; _la = this._input.LA(1)) {
						this.setState(3061);
						this.match(333);
						this.setState(3062);
						this.expr(0);
						this.setState(3063);
						this.match(337);
						this.setState(3064);
						this.expr(0);
						this.setState(3070);
						this._errHandler.sync(this);
					}

					this.setState(3071);
					this.match(350);
					break;
				case 16:
					this.enterOuterAlt(_localctx, 16);
					this.setState(3073);
					this.match(324);
					this.setState(3074);
					this.match(347);
					this.setState(3075);
					this.expr(0);
					this.setState(3081);
					this._errHandler.sync(this);
					int _alt = 1;

					do {
						switch(_alt) {
							case 1:
								this.setState(3076);
								this.match(333);
								this.setState(3077);
								this.expr(0);
								this.setState(3078);
								this.match(337);
								this.setState(3079);
								this.expr(0);
								this.setState(3083);
								this._errHandler.sync(this);
								_alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 386, this._ctx);
								break;
							default:
								throw new NoViableAltException(this);
						}
					} while(_alt != 2 && _alt != 0);

					this.setState(3087);
					_la = this._input.LA(1);
					if (_la == 333) {
						this.setState(3085);
						this.match(333);
						this.setState(3086);
						this.expr(0);
					}

					this.setState(3089);
					this.match(350);
					break;
				case 17:
					this.enterOuterAlt(_localctx, 17);
					this.setState(3091);
					this.match(242);
					this.setState(3092);
					this.match(347);
					this.setState(3093);
					this.expr(0);
					this.setState(3094);
					this.match(350);
					break;
				case 18:
					this.enterOuterAlt(_localctx, 18);
					this.setState(3096);
					this.match(268);
					this.setState(3097);
					this.match(347);
					this.setState(3098);
					this.expr(0);
					this.setState(3099);
					this.match(114);
					this.setState(3100);
					this.expr(0);
					this.setState(3103);
					_la = this._input.LA(1);
					if (_la == 110) {
						this.setState(3101);
						this.match(110);
						this.setState(3102);
						this.expr(0);
					}

					this.setState(3105);
					this.match(350);
					break;
				case 19:
					this.enterOuterAlt(_localctx, 19);
					this.setState(3107);
					this.match(328);
					break;
				case 20:
					this.enterOuterAlt(_localctx, 20);
					this.setState(3108);
					this.match(330);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Expr_funcContext expr_func() throws RecognitionException {
		HplsqlParser.Expr_funcContext _localctx = new HplsqlParser.Expr_funcContext(this._ctx, this.getState());
		this.enterRule(_localctx, 396, 198);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(3111);
			this.ident();
			this.setState(3112);
			this.match(347);
			this.setState(3114);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 390, this._ctx)) {
				case 1:
					this.setState(3113);
					this.expr_func_params();
				default:
					this.setState(3116);
					this.match(350);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Expr_func_paramsContext expr_func_params() throws RecognitionException {
		HplsqlParser.Expr_func_paramsContext _localctx = new HplsqlParser.Expr_func_paramsContext(this._ctx, this.getState());
		this.enterRule(_localctx, 398, 199);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(3118);
			this.func_param();
			this.setState(3123);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 391, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 391, this._ctx)) {
				if (_alt == 1) {
					this.setState(3119);
					this.match(333);
					this.setState(3120);
					this.func_param();
				}

				this.setState(3125);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Func_paramContext func_param() throws RecognitionException {
		HplsqlParser.Func_paramContext _localctx = new HplsqlParser.Func_paramContext(this._ctx, this.getState());
		this.enterRule(_localctx, 400, 200);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(3126);
			if (this._input.LT(1).getText().equalsIgnoreCase("INTO")) {
				throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
			}

			this.setState(3132);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 393, this._ctx)) {
				case 1:
					this.setState(3127);
					this.ident();
					this.setState(3128);
					this.match(337);
					this.setState(3130);
					int _la = this._input.LA(1);
					if (_la == 341) {
						this.setState(3129);
						this.match(341);
					}
				default:
					this.setState(3134);
					this.expr(0);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Expr_selectContext expr_select() throws RecognitionException {
		HplsqlParser.Expr_selectContext _localctx = new HplsqlParser.Expr_selectContext(this._ctx, this.getState());
		this.enterRule(_localctx, 402, 201);

		try {
			this.setState(3138);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 394, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(3136);
					this.select_stmt();
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(3137);
					this.expr(0);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Expr_fileContext expr_file() throws RecognitionException {
		HplsqlParser.Expr_fileContext _localctx = new HplsqlParser.Expr_fileContext(this._ctx, this.getState());
		this.enterRule(_localctx, 404, 202);

		try {
			this.setState(3142);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 395, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(3140);
					this.file_name();
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(3141);
					this.expr(0);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.HiveContext hive() throws RecognitionException {
		HplsqlParser.HiveContext _localctx = new HplsqlParser.HiveContext(this._ctx, this.getState());
		this.enterRule(_localctx, 406, 203);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(3144);
			this.match(127);
			this.setState(3148);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 396, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 396, this._ctx)) {
				if (_alt == 1) {
					this.setState(3145);
					this.hive_item();
				}

				this.setState(3150);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Hive_itemContext hive_item() throws RecognitionException {
		HplsqlParser.Hive_itemContext _localctx = new HplsqlParser.Hive_itemContext(this._ctx, this.getState());
		this.enterRule(_localctx, 408, 204);

		try {
			this.setState(3163);
			switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 397, this._ctx)) {
				case 1:
					this.enterOuterAlt(_localctx, 1);
					this.setState(3151);
					this.match(353);
					this.setState(3152);
					this.ident();
					this.setState(3153);
					this.expr(0);
					break;
				case 2:
					this.enterOuterAlt(_localctx, 2);
					this.setState(3155);
					this.match(353);
					this.setState(3156);
					this.ident();
					this.setState(3157);
					this.match(354);
					this.setState(3158);
					this.match(337);
					this.setState(3159);
					this.expr(0);
					break;
				case 3:
					this.enterOuterAlt(_localctx, 3);
					this.setState(3161);
					this.match(353);
					this.setState(3162);
					this.ident();
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.HostContext host() throws RecognitionException {
		HplsqlParser.HostContext _localctx = new HplsqlParser.HostContext(this._ctx, this.getState());
		this.enterRule(_localctx, 410, 205);

		try {
			this.setState(3170);
			switch(this._input.LA(1)) {
				case 5:
					this.enterOuterAlt(_localctx, 1);
					this.setState(3165);
					this.match(5);
					this.setState(3166);
					this.host_cmd();
					this.setState(3167);
					this.match(352);
					break;
				case 128:
					this.enterOuterAlt(_localctx, 2);
					this.setState(3169);
					this.host_stmt();
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Host_cmdContext host_cmd() throws RecognitionException {
		HplsqlParser.Host_cmdContext _localctx = new HplsqlParser.Host_cmdContext(this._ctx, this.getState());
		this.enterRule(_localctx, 412, 206);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(3175);
			this._errHandler.sync(this);

			for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 399, this._ctx); _alt != 1 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 399, this._ctx)) {
				if (_alt == 2) {
					this.setState(3172);
					this.matchWildcard();
				}

				this.setState(3177);
				this._errHandler.sync(this);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Host_stmtContext host_stmt() throws RecognitionException {
		HplsqlParser.Host_stmtContext _localctx = new HplsqlParser.Host_stmtContext(this._ctx, this.getState());
		this.enterRule(_localctx, 414, 207);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(3178);
			this.match(128);
			this.setState(3179);
			this.expr(0);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.File_nameContext file_name() throws RecognitionException {
		HplsqlParser.File_nameContext _localctx = new HplsqlParser.File_nameContext(this._ctx, this.getState());
		this.enterRule(_localctx, 416, 208);

		try {
			this.setState(3195);
			switch(this._input.LA(1)) {
				case 4:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
				case 19:
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 27:
				case 28:
				case 29:
				case 30:
				case 31:
				case 32:
				case 33:
				case 34:
				case 35:
				case 36:
				case 37:
				case 38:
				case 39:
				case 40:
				case 41:
				case 42:
				case 43:
				case 44:
				case 45:
				case 46:
				case 47:
				case 48:
				case 49:
				case 50:
				case 51:
				case 52:
				case 53:
				case 54:
				case 55:
				case 56:
				case 57:
				case 58:
				case 59:
				case 60:
				case 61:
				case 62:
				case 63:
				case 64:
				case 65:
				case 66:
				case 67:
				case 68:
				case 69:
				case 70:
				case 71:
				case 72:
				case 73:
				case 74:
				case 75:
				case 76:
				case 77:
				case 78:
				case 79:
				case 80:
				case 81:
				case 82:
				case 83:
				case 84:
				case 85:
				case 86:
				case 87:
				case 88:
				case 89:
				case 93:
				case 95:
				case 96:
				case 97:
				case 98:
				case 99:
				case 100:
				case 101:
				case 102:
				case 103:
				case 104:
				case 105:
				case 106:
				case 107:
				case 108:
				case 109:
				case 110:
				case 111:
				case 112:
				case 113:
				case 114:
				case 115:
				case 116:
				case 117:
				case 118:
				case 119:
				case 120:
				case 121:
				case 122:
				case 123:
				case 124:
				case 125:
				case 126:
				case 127:
				case 128:
				case 129:
				case 130:
				case 131:
				case 132:
				case 133:
				case 134:
				case 135:
				case 136:
				case 137:
				case 138:
				case 139:
				case 140:
				case 141:
				case 142:
				case 143:
				case 144:
				case 145:
				case 146:
				case 147:
				case 148:
				case 149:
				case 150:
				case 151:
				case 152:
				case 153:
				case 154:
				case 155:
				case 156:
				case 157:
				case 158:
				case 159:
				case 160:
				case 161:
				case 162:
				case 163:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
				case 169:
				case 170:
				case 171:
				case 172:
				case 173:
				case 174:
				case 175:
				case 176:
				case 177:
				case 178:
				case 179:
				case 180:
				case 181:
				case 182:
				case 183:
				case 184:
				case 185:
				case 186:
				case 187:
				case 188:
				case 189:
				case 190:
				case 192:
				case 193:
				case 194:
				case 195:
				case 196:
				case 197:
				case 198:
				case 199:
				case 200:
				case 201:
				case 202:
				case 203:
				case 204:
				case 205:
				case 206:
				case 207:
				case 208:
				case 209:
				case 211:
				case 212:
				case 213:
				case 214:
				case 215:
				case 216:
				case 217:
				case 218:
				case 219:
				case 220:
				case 221:
				case 222:
				case 223:
				case 224:
				case 225:
				case 226:
				case 227:
				case 228:
				case 229:
				case 230:
				case 231:
				case 232:
				case 233:
				case 234:
				case 235:
				case 236:
				case 238:
				case 239:
				case 240:
				case 241:
				case 242:
				case 243:
				case 244:
				case 245:
				case 246:
				case 247:
				case 248:
				case 249:
				case 250:
				case 251:
				case 252:
				case 253:
				case 254:
				case 255:
				case 257:
				case 258:
				case 259:
				case 260:
				case 261:
				case 262:
				case 263:
				case 264:
				case 265:
				case 266:
				case 267:
				case 268:
				case 269:
				case 270:
				case 271:
				case 272:
				case 273:
				case 274:
				case 275:
				case 276:
				case 277:
				case 279:
				case 280:
				case 281:
				case 282:
				case 283:
				case 284:
				case 287:
				case 288:
				case 289:
				case 290:
				case 291:
				case 292:
				case 293:
				case 294:
				case 295:
				case 296:
				case 297:
				case 298:
				case 301:
				case 302:
				case 303:
				case 304:
				case 305:
				case 306:
				case 307:
				case 308:
				case 309:
				case 310:
				case 311:
				case 312:
				case 313:
				case 314:
				case 315:
				case 316:
				case 323:
				case 324:
				case 325:
				case 326:
				case 327:
				case 328:
				case 329:
				case 330:
				case 335:
				case 354:
					this.enterOuterAlt(_localctx, 2);
					this.setState(3185);
					switch(this._input.LA(1)) {
						case 4:
							this.setState(3183);
							this.match(4);
							this.setState(3184);
							this.match(335);
							break;
						case 5:
						case 26:
						case 90:
						case 91:
						case 92:
						case 94:
						case 191:
						case 210:
						case 237:
						case 256:
						case 278:
						case 285:
						case 286:
						case 299:
						case 300:
						case 317:
						case 318:
						case 319:
						case 320:
						case 321:
						case 322:
						case 331:
						case 332:
						case 333:
						case 334:
						case 336:
						case 337:
						case 338:
						case 339:
						case 340:
						case 341:
						case 342:
						case 343:
						case 344:
						case 345:
						case 346:
						case 347:
						case 348:
						case 349:
						case 350:
						case 351:
						case 352:
						case 353:
						default:
							throw new NoViableAltException(this);
						case 6:
						case 7:
						case 8:
						case 9:
						case 10:
						case 11:
						case 12:
						case 13:
						case 14:
						case 15:
						case 16:
						case 17:
						case 18:
						case 19:
						case 20:
						case 21:
						case 22:
						case 23:
						case 24:
						case 25:
						case 27:
						case 28:
						case 29:
						case 30:
						case 31:
						case 32:
						case 33:
						case 34:
						case 35:
						case 36:
						case 37:
						case 38:
						case 39:
						case 40:
						case 41:
						case 42:
						case 43:
						case 44:
						case 45:
						case 46:
						case 47:
						case 48:
						case 49:
						case 50:
						case 51:
						case 52:
						case 53:
						case 54:
						case 55:
						case 56:
						case 57:
						case 58:
						case 59:
						case 60:
						case 61:
						case 62:
						case 63:
						case 64:
						case 65:
						case 66:
						case 67:
						case 68:
						case 69:
						case 70:
						case 71:
						case 72:
						case 73:
						case 74:
						case 75:
						case 76:
						case 77:
						case 78:
						case 79:
						case 80:
						case 81:
						case 82:
						case 83:
						case 84:
						case 85:
						case 86:
						case 87:
						case 88:
						case 89:
						case 93:
						case 95:
						case 96:
						case 97:
						case 98:
						case 99:
						case 100:
						case 101:
						case 102:
						case 103:
						case 104:
						case 105:
						case 106:
						case 107:
						case 108:
						case 109:
						case 110:
						case 111:
						case 112:
						case 113:
						case 114:
						case 115:
						case 116:
						case 117:
						case 118:
						case 119:
						case 120:
						case 121:
						case 122:
						case 123:
						case 124:
						case 125:
						case 126:
						case 127:
						case 128:
						case 129:
						case 130:
						case 131:
						case 132:
						case 133:
						case 134:
						case 135:
						case 136:
						case 137:
						case 138:
						case 139:
						case 140:
						case 141:
						case 142:
						case 143:
						case 144:
						case 145:
						case 146:
						case 147:
						case 148:
						case 149:
						case 150:
						case 151:
						case 152:
						case 153:
						case 154:
						case 155:
						case 156:
						case 157:
						case 158:
						case 159:
						case 160:
						case 161:
						case 162:
						case 163:
						case 164:
						case 165:
						case 166:
						case 167:
						case 168:
						case 169:
						case 170:
						case 171:
						case 172:
						case 173:
						case 174:
						case 175:
						case 176:
						case 177:
						case 178:
						case 179:
						case 180:
						case 181:
						case 182:
						case 183:
						case 184:
						case 185:
						case 186:
						case 187:
						case 188:
						case 189:
						case 190:
						case 192:
						case 193:
						case 194:
						case 195:
						case 196:
						case 197:
						case 198:
						case 199:
						case 200:
						case 201:
						case 202:
						case 203:
						case 204:
						case 205:
						case 206:
						case 207:
						case 208:
						case 209:
						case 211:
						case 212:
						case 213:
						case 214:
						case 215:
						case 216:
						case 217:
						case 218:
						case 219:
						case 220:
						case 221:
						case 222:
						case 223:
						case 224:
						case 225:
						case 226:
						case 227:
						case 228:
						case 229:
						case 230:
						case 231:
						case 232:
						case 233:
						case 234:
						case 235:
						case 236:
						case 238:
						case 239:
						case 240:
						case 241:
						case 242:
						case 243:
						case 244:
						case 245:
						case 246:
						case 247:
						case 248:
						case 249:
						case 250:
						case 251:
						case 252:
						case 253:
						case 254:
						case 255:
						case 257:
						case 258:
						case 259:
						case 260:
						case 261:
						case 262:
						case 263:
						case 264:
						case 265:
						case 266:
						case 267:
						case 268:
						case 269:
						case 270:
						case 271:
						case 272:
						case 273:
						case 274:
						case 275:
						case 276:
						case 277:
						case 279:
						case 280:
						case 281:
						case 282:
						case 283:
						case 284:
						case 287:
						case 288:
						case 289:
						case 290:
						case 291:
						case 292:
						case 293:
						case 294:
						case 295:
						case 296:
						case 297:
						case 298:
						case 301:
						case 302:
						case 303:
						case 304:
						case 305:
						case 306:
						case 307:
						case 308:
						case 309:
						case 310:
						case 311:
						case 312:
						case 313:
						case 314:
						case 315:
						case 316:
						case 323:
						case 324:
						case 325:
						case 326:
						case 327:
						case 328:
						case 329:
						case 330:
						case 354:
							break;
						case 335:
							this.setState(3182);
							this.match(335);
					}

					this.setState(3187);
					this.ident();
					this.setState(3192);
					this._errHandler.sync(this);

					for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 401, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 401, this._ctx)) {
						if (_alt == 1) {
							this.setState(3188);
							this.match(335);
							this.setState(3189);
							this.ident();
						}

						this.setState(3194);
						this._errHandler.sync(this);
					}

					return _localctx;
				case 5:
				case 26:
				case 90:
				case 91:
				case 92:
				case 94:
				case 191:
				case 210:
				case 237:
				case 256:
				case 278:
				case 285:
				case 286:
				case 299:
				case 300:
				case 317:
				case 318:
				case 319:
				case 320:
				case 321:
				case 322:
				case 331:
				case 332:
				case 333:
				case 334:
				case 336:
				case 337:
				case 338:
				case 339:
				case 340:
				case 341:
				case 342:
				case 343:
				case 344:
				case 345:
				case 346:
				case 347:
				case 348:
				case 349:
				case 350:
				case 351:
				case 352:
				case 353:
				case 355:
				case 356:
				case 357:
				case 358:
				case 359:
				case 360:
				case 361:
				default:
					throw new NoViableAltException(this);
				case 362:
					this.enterOuterAlt(_localctx, 1);
					this.setState(3181);
					this.match(362);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Date_literalContext date_literal() throws RecognitionException {
		HplsqlParser.Date_literalContext _localctx = new HplsqlParser.Date_literalContext(this._ctx, this.getState());
		this.enterRule(_localctx, 418, 209);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(3197);
			this.match(64);
			this.setState(3198);
			this.string();
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Timestamp_literalContext timestamp_literal() throws RecognitionException {
		HplsqlParser.Timestamp_literalContext _localctx = new HplsqlParser.Timestamp_literalContext(this._ctx, this.getState());
		this.enterRule(_localctx, 420, 210);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(3200);
			this.match(277);
			this.setState(3201);
			this.string();
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.IdentContext ident() throws RecognitionException {
		HplsqlParser.IdentContext _localctx = new HplsqlParser.IdentContext(this._ctx, this.getState());
		this.enterRule(_localctx, 422, 211);

		try {
			this.setState(3205);
			switch(this._input.LA(1)) {
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
				case 19:
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 27:
				case 28:
				case 29:
				case 30:
				case 31:
				case 32:
				case 33:
				case 34:
				case 35:
				case 36:
				case 37:
				case 38:
				case 39:
				case 40:
				case 41:
				case 42:
				case 43:
				case 44:
				case 45:
				case 46:
				case 47:
				case 48:
				case 49:
				case 50:
				case 51:
				case 52:
				case 53:
				case 54:
				case 55:
				case 56:
				case 57:
				case 58:
				case 59:
				case 60:
				case 61:
				case 62:
				case 63:
				case 64:
				case 65:
				case 66:
				case 67:
				case 68:
				case 69:
				case 70:
				case 71:
				case 72:
				case 73:
				case 74:
				case 75:
				case 76:
				case 77:
				case 78:
				case 79:
				case 80:
				case 81:
				case 82:
				case 83:
				case 84:
				case 85:
				case 86:
				case 87:
				case 88:
				case 89:
				case 93:
				case 95:
				case 96:
				case 97:
				case 98:
				case 99:
				case 100:
				case 101:
				case 102:
				case 103:
				case 104:
				case 105:
				case 106:
				case 107:
				case 108:
				case 109:
				case 110:
				case 111:
				case 112:
				case 113:
				case 114:
				case 115:
				case 116:
				case 117:
				case 118:
				case 119:
				case 120:
				case 121:
				case 122:
				case 123:
				case 124:
				case 125:
				case 126:
				case 127:
				case 128:
				case 129:
				case 130:
				case 131:
				case 132:
				case 133:
				case 134:
				case 135:
				case 136:
				case 137:
				case 138:
				case 139:
				case 140:
				case 141:
				case 142:
				case 143:
				case 144:
				case 145:
				case 146:
				case 147:
				case 148:
				case 149:
				case 150:
				case 151:
				case 152:
				case 153:
				case 154:
				case 155:
				case 156:
				case 157:
				case 158:
				case 159:
				case 160:
				case 161:
				case 162:
				case 163:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
				case 169:
				case 170:
				case 171:
				case 172:
				case 173:
				case 174:
				case 175:
				case 176:
				case 177:
				case 178:
				case 179:
				case 180:
				case 181:
				case 182:
				case 183:
				case 184:
				case 185:
				case 186:
				case 187:
				case 188:
				case 189:
				case 190:
				case 192:
				case 193:
				case 194:
				case 195:
				case 196:
				case 197:
				case 198:
				case 199:
				case 200:
				case 201:
				case 202:
				case 203:
				case 204:
				case 205:
				case 206:
				case 207:
				case 208:
				case 209:
				case 211:
				case 212:
				case 213:
				case 214:
				case 215:
				case 216:
				case 217:
				case 218:
				case 219:
				case 220:
				case 221:
				case 222:
				case 223:
				case 224:
				case 225:
				case 226:
				case 227:
				case 228:
				case 229:
				case 230:
				case 231:
				case 232:
				case 233:
				case 234:
				case 235:
				case 236:
				case 238:
				case 239:
				case 240:
				case 241:
				case 242:
				case 243:
				case 244:
				case 245:
				case 246:
				case 247:
				case 248:
				case 249:
				case 250:
				case 251:
				case 252:
				case 253:
				case 254:
				case 255:
				case 257:
				case 258:
				case 259:
				case 260:
				case 261:
				case 262:
				case 263:
				case 264:
				case 265:
				case 266:
				case 267:
				case 268:
				case 269:
				case 270:
				case 271:
				case 272:
				case 273:
				case 274:
				case 275:
				case 276:
				case 277:
				case 279:
				case 280:
				case 281:
				case 282:
				case 283:
				case 284:
				case 287:
				case 288:
				case 289:
				case 290:
				case 291:
				case 292:
				case 293:
				case 294:
				case 295:
				case 296:
				case 297:
				case 298:
				case 301:
				case 302:
				case 303:
				case 304:
				case 305:
				case 306:
				case 307:
				case 308:
				case 309:
				case 310:
				case 311:
				case 312:
				case 313:
				case 314:
				case 315:
				case 316:
				case 323:
				case 324:
				case 325:
				case 326:
				case 327:
				case 328:
				case 329:
				case 330:
					this.enterOuterAlt(_localctx, 2);
					this.setState(3204);
					this.non_reserved_words();
					break;
				case 26:
				case 90:
				case 91:
				case 92:
				case 94:
				case 191:
				case 210:
				case 237:
				case 256:
				case 278:
				case 285:
				case 286:
				case 299:
				case 300:
				case 317:
				case 318:
				case 319:
				case 320:
				case 321:
				case 322:
				case 331:
				case 332:
				case 333:
				case 334:
				case 335:
				case 336:
				case 337:
				case 338:
				case 339:
				case 340:
				case 341:
				case 342:
				case 343:
				case 344:
				case 345:
				case 346:
				case 347:
				case 348:
				case 349:
				case 350:
				case 351:
				case 352:
				case 353:
				default:
					throw new NoViableAltException(this);
				case 354:
					this.enterOuterAlt(_localctx, 1);
					this.setState(3203);
					this.match(354);
			}
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.StringContext string() throws RecognitionException {
		HplsqlParser.StringContext _localctx = new HplsqlParser.StringContext(this._ctx, this.getState());
		this.enterRule((ParserRuleContext)_localctx, 424, 212);

		try {
			this.setState(3209);
			switch(this._input.LA(1)) {
				case 355:
					_localctx = new HplsqlParser.Single_quotedStringContext((HplsqlParser.StringContext)_localctx);
					this.enterOuterAlt((ParserRuleContext)_localctx, 1);
					this.setState(3207);
					this.match(355);
					break;
				case 356:
					_localctx = new HplsqlParser.Double_quotedStringContext((HplsqlParser.StringContext)_localctx);
					this.enterOuterAlt((ParserRuleContext)_localctx, 2);
					this.setState(3208);
					this.match(356);
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException var6) {
			((HplsqlParser.StringContext)_localctx).exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return (HplsqlParser.StringContext)_localctx;
	}

	public final HplsqlParser.Int_numberContext int_number() throws RecognitionException {
		HplsqlParser.Int_numberContext _localctx = new HplsqlParser.Int_numberContext(this._ctx, this.getState());
		this.enterRule(_localctx, 426, 213);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(3212);
			int _la = this._input.LA(1);
			if (_la == 331 || _la == 353) {
				this.setState(3211);
				_la = this._input.LA(1);
				if (_la != 331 && _la != 353) {
					this._errHandler.recoverInline(this);
				} else {
					this.consume();
				}
			}

			this.setState(3214);
			this.match(357);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Dec_numberContext dec_number() throws RecognitionException {
		HplsqlParser.Dec_numberContext _localctx = new HplsqlParser.Dec_numberContext(this._ctx, this.getState());
		this.enterRule(_localctx, 428, 214);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(3217);
			int _la = this._input.LA(1);
			if (_la == 331 || _la == 353) {
				this.setState(3216);
				_la = this._input.LA(1);
				if (_la != 331 && _la != 353) {
					this._errHandler.recoverInline(this);
				} else {
					this.consume();
				}
			}

			this.setState(3219);
			this.match(358);
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Bool_literalContext bool_literal() throws RecognitionException {
		HplsqlParser.Bool_literalContext _localctx = new HplsqlParser.Bool_literalContext(this._ctx, this.getState());
		this.enterRule(_localctx, 430, 215);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(3221);
			int _la = this._input.LA(1);
			if (_la != 104 && _la != 283) {
				this._errHandler.recoverInline(this);
			} else {
				this.consume();
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Null_constContext null_const() throws RecognitionException {
		HplsqlParser.Null_constContext _localctx = new HplsqlParser.Null_constContext(this._ctx, this.getState());
		this.enterRule(_localctx, 432, 216);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(3223);
			this.match(191);
		} catch (RecognitionException var6) {
			_localctx.exception = var6;
			this._errHandler.reportError(this, var6);
			this._errHandler.recover(this, var6);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public final HplsqlParser.Non_reserved_wordsContext non_reserved_words() throws RecognitionException {
		HplsqlParser.Non_reserved_wordsContext _localctx = new HplsqlParser.Non_reserved_wordsContext(this._ctx, this.getState());
		this.enterRule(_localctx, 434, 217);

		try {
			this.enterOuterAlt(_localctx, 1);
			this.setState(3225);
			int _la = this._input.LA(1);
			if ((_la & -64) == 0 && (1L << _la & -67108928L) != 0L || (_la - 64 & -64) == 0 && (1L << _la - 64 & -1543503873L) != 0L || (_la - 128 & -64) == 0 && (1L << _la - 128 & 9223372036854775807L) != 0L || (_la - 192 & -64) == 0 && (1L << _la - 192 & -35184372350977L) != 0L || (_la - 257 & -64) == 0 && (1L << _la - 257 & 1152908309659910143L) != 0L || (_la - 323 & -64) == 0 && (1L << _la - 323 & 255L) != 0L) {
				this.consume();
			} else {
				this._errHandler.recoverInline(this);
			}
		} catch (RecognitionException var7) {
			_localctx.exception = var7;
			this._errHandler.reportError(this, var7);
			this._errHandler.recover(this, var7);
		} finally {
			this.exitRule();
		}

		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch(ruleIndex) {
			case 4:
				return this.block_end_sempred((HplsqlParser.Block_endContext)_localctx, predIndex);
			case 11:
				return this.expr_stmt_sempred((HplsqlParser.Expr_stmtContext)_localctx, predIndex);
			case 71:
				return this.create_routine_params_sempred((HplsqlParser.Create_routine_paramsContext)_localctx, predIndex);
			case 146:
				return this.select_list_alias_sempred((HplsqlParser.Select_list_aliasContext)_localctx, predIndex);
			case 157:
				return this.from_alias_clause_sempred((HplsqlParser.From_alias_clauseContext)_localctx, predIndex);
			case 175:
				return this.bool_expr_sempred((HplsqlParser.Bool_exprContext)_localctx, predIndex);
			case 183:
				return this.expr_sempred((HplsqlParser.ExprContext)_localctx, predIndex);
			case 200:
				return this.func_param_sempred((HplsqlParser.Func_paramContext)_localctx, predIndex);
			default:
				return true;
		}
	}

	private boolean block_end_sempred(HplsqlParser.Block_endContext _localctx, int predIndex) {
		switch(predIndex) {
			case 0:
				return !this._input.LT(2).getText().equalsIgnoreCase("TRANSACTION");
			default:
				return true;
		}
	}

	private boolean expr_stmt_sempred(HplsqlParser.Expr_stmtContext _localctx, int predIndex) {
		switch(predIndex) {
			case 1:
				return !this._input.LT(1).getText().equalsIgnoreCase("GO");
			default:
				return true;
		}
	}

	private boolean create_routine_params_sempred(HplsqlParser.Create_routine_paramsContext _localctx, int predIndex) {
		switch(predIndex) {
			case 2:
				return !this._input.LT(1).getText().equalsIgnoreCase("IS") && !this._input.LT(1).getText().equalsIgnoreCase("AS");
			default:
				return true;
		}
	}

	private boolean select_list_alias_sempred(HplsqlParser.Select_list_aliasContext _localctx, int predIndex) {
		switch(predIndex) {
			case 3:
				return !this._input.LT(1).getText().equalsIgnoreCase("INTO") && !this._input.LT(1).getText().equalsIgnoreCase("FROM");
			default:
				return true;
		}
	}

	private boolean from_alias_clause_sempred(HplsqlParser.From_alias_clauseContext _localctx, int predIndex) {
		switch(predIndex) {
			case 4:
				return !this._input.LT(1).getText().equalsIgnoreCase("EXEC") && !this._input.LT(1).getText().equalsIgnoreCase("EXECUTE") && !this._input.LT(1).getText().equalsIgnoreCase("GROUP") && !this._input.LT(1).getText().equalsIgnoreCase("ORDER") && !this._input.LT(1).getText().equalsIgnoreCase("LIMIT") && !this._input.LT(1).getText().equalsIgnoreCase("WITH");
			default:
				return true;
		}
	}

	private boolean bool_expr_sempred(HplsqlParser.Bool_exprContext _localctx, int predIndex) {
		switch(predIndex) {
			case 5:
				return this.precpred(this._ctx, 2);
			default:
				return true;
		}
	}

	private boolean expr_sempred(HplsqlParser.ExprContext _localctx, int predIndex) {
		switch(predIndex) {
			case 6:
				return this.precpred(this._ctx, 13);
			case 7:
				return this.precpred(this._ctx, 12);
			case 8:
				return this.precpred(this._ctx, 11);
			case 9:
				return this.precpred(this._ctx, 10);
			case 10:
				return this.precpred(this._ctx, 14);
			default:
				return true;
		}
	}

	private boolean func_param_sempred(HplsqlParser.Func_paramContext _localctx, int predIndex) {
		switch(predIndex) {
			case 11:
				return !this._input.LT(1).getText().equalsIgnoreCase("INTO");
			default:
				return true;
		}
	}

	static {
		RuntimeMetaData.checkVersion("4.5", "4.5");
		_sharedContextCache = new PredictionContextCache();
		ruleNames = new String[]{"program", "block", "begin_end_block", "single_block_stmt", "block_end", "proc_block", "stmt", "semicolon_stmt", "exception_block", "exception_block_item", "null_stmt", "expr_stmt", "assignment_stmt", "assignment_stmt_item", "assignment_stmt_single_item", "assignment_stmt_multiple_item", "assignment_stmt_select_item", "allocate_cursor_stmt", "associate_locator_stmt", "begin_transaction_stmt", "break_stmt", "call_stmt", "declare_stmt", "declare_block", "declare_block_inplace", "declare_stmt_item", "declare_var_item", "declare_condition_item", "declare_cursor_item", "cursor_with_return", "cursor_without_return", "declare_handler_item", "declare_temporary_table_item", "create_table_stmt", "create_local_temp_table_stmt", "create_table_columns", "create_table_columns_item", "column_name", "create_table_column_inline_cons", "create_table_column_cons", "create_table_fk_action", "create_table_preoptions", "create_table_preoptions_item", "create_table_options", "create_table_options_item", "create_table_options_ora_item", "create_table_options_db2_item", "create_table_options_hive_item", "create_table_hive_row_format", "create_table_hive_row_format_fields", "create_table_options_mssql_item", "create_table_options_mysql_item", "alter_table_stmt", "alter_table_item", "alter_table_add_constraint", "alter_table_add_constraint_item", "dtype", "dtype_len", "dtype_attr", "dtype_default", "create_database_stmt", "create_database_option", "create_function_stmt", "create_function_return", "create_package_stmt", "package_spec", "package_spec_item", "create_package_body_stmt", "package_body", "package_body_item", "create_procedure_stmt", "create_routine_params", "create_routine_param_item", "create_routine_options", "create_routine_option", "drop_stmt", "end_transaction_stmt", "exec_stmt", "if_stmt", "if_plsql_stmt", "if_tsql_stmt", "elseif_block", "else_block", "include_stmt", "insert_stmt", "insert_stmt_cols", "insert_stmt_rows", "insert_stmt_row", "insert_directory_stmt", "exit_stmt", "get_diag_stmt", "get_diag_stmt_item", "get_diag_stmt_exception_item", "get_diag_stmt_rowcount_item", "grant_stmt", "grant_stmt_item", "leave_stmt", "map_object_stmt", "open_stmt", "fetch_stmt", "close_stmt", "cmp_stmt", "cmp_source", "copy_from_ftp_stmt", "copy_from_local_stmt", "copy_stmt", "copy_source", "copy_target", "copy_option", "copy_file_option", "copy_ftp_option", "commit_stmt", "create_index_stmt", "create_index_col", "index_storage_clause", "index_mssql_storage_clause", "print_stmt", "raise_stmt", "resignal_stmt", "return_stmt", "rollback_stmt", "set_session_option", "set_current_schema_option", "set_mssql_session_option", "set_teradata_session_option", "signal_stmt", "truncate_stmt", "use_stmt", "values_into_stmt", "while_stmt", "for_cursor_stmt", "for_range_stmt", "label", "using_clause", "select_stmt", "cte_select_stmt", "cte_select_stmt_item", "cte_select_cols", "fullselect_stmt", "fullselect_stmt_item", "fullselect_set_clause", "subselect_stmt", "select_list", "select_list_set", "select_list_limit", "select_list_item", "select_list_alias", "select_list_asterisk", "into_clause", "from_clause", "from_table_clause", "from_table_name_clause", "from_subselect_clause", "from_join_clause", "from_join_type_clause", "from_table_values_clause", "from_table_values_row", "from_alias_clause", "table_name", "where_clause", "group_by_clause", "having_clause", "order_by_clause", "select_options", "select_options_item", "update_stmt", "update_assignment", "update_table", "update_upsert", "merge_stmt", "merge_table", "merge_condition", "merge_action", "delete_stmt", "describe_stmt", "bool_expr", "bool_expr_atom", "bool_expr_unary", "bool_expr_single_in", "bool_expr_multi_in", "bool_expr_binary", "bool_expr_logical_operator", "bool_expr_binary_operator", "expr", "expr_atom", "expr_interval", "interval_item", "expr_concat", "expr_concat_item", "expr_case", "expr_case_simple", "expr_case_searched", "expr_cursor_attribute", "expr_agg_window_func", "expr_func_all_distinct", "expr_func_over_clause", "expr_func_partition_by_clause", "expr_spec_func", "expr_func", "expr_func_params", "func_param", "expr_select", "expr_file", "hive", "hive_item", "host", "host_cmd", "host_stmt", "file_name", "date_literal", "timestamp_literal", "ident", "string", "int_number", "dec_number", "bool_literal", "null_const", "non_reserved_words"};
		_LITERAL_NAMES = new String[]{null, "'@'", "'#'", "'%'", "'.'", "'!'", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "'+'", "':'", "','", "'||'", "'/'", "'..'", "'='", "'=='", "'<>'", "'!='", "'>'", "'>='", "'<'", "'<='", "'*'", "'{'", "'('", "'['", "'}'", "')'", "']'", "';'", "'-'"};
		_SYMBOLIC_NAMES = new String[]{null, null, null, null, null, null, "T_ACTION", "T_ADD2", "T_ALL", "T_ALLOCATE", "T_ALTER", "T_AND", "T_ANSI_NULLS", "T_ANSI_PADDING", "T_AS", "T_ASC", "T_ASSOCIATE", "T_AT", "T_AUTO_INCREMENT", "T_AVG", "T_BATCHSIZE", "T_BEGIN", "T_BETWEEN", "T_BIGINT", "T_BINARY_DOUBLE", "T_BINARY_FLOAT", "T_BINARY_INTEGER", "T_BIT", "T_BODY", "T_BREAK", "T_BY", "T_BYTE", "T_CALL", "T_CALLER", "T_CASCADE", "T_CASE", "T_CASESPECIFIC", "T_CAST", "T_CHAR", "T_CHARACTER", "T_CHARSET", "T_CLIENT", "T_CLOSE", "T_CLUSTERED", "T_CMP", "T_COLLECTION", "T_COMMENT", "T_CONSTANT", "T_COMMIT", "T_CONCAT", "T_CONDITION", "T_CONSTRAINT", "T_CONTINUE", "T_COPY", "T_COUNT", "T_COUNT_BIG", "T_CREATE", "T_CREATION", "T_CREATOR", "T_CS", "T_CURRENT", "T_CURRENT_SCHEMA", "T_CURSOR", "T_DATABASE", "T_DATE", "T_DATETIME", "T_DAY", "T_DAYS", "T_DEC", "T_DECIMAL", "T_DECLARE", "T_DEFAULT", "T_DEFERRED", "T_DEFINED", "T_DEFINER", "T_DEFINITION", "T_DELETE", "T_DELIMITED", "T_DELIMITER", "T_DESC", "T_DESCRIBE", "T_DIAGNOSTICS", "T_DIR", "T_DIRECTORY", "T_DISTINCT", "T_DISTRIBUTE", "T_DO", "T_DOUBLE", "T_DROP", "T_DYNAMIC", "T_ELSE", "T_ELSEIF", "T_ELSIF", "T_ENABLE", "T_END", "T_ENGINE", "T_ESCAPED", "T_EXCEPT", "T_EXEC", "T_EXECUTE", "T_EXCEPTION", "T_EXCLUSIVE", "T_EXISTS", "T_EXIT", "T_FALSE", "T_FETCH", "T_FIELDS", "T_FILE", "T_FILES", "T_FLOAT", "T_FOR", "T_FOREIGN", "T_FORMAT", "T_FOUND", "T_FROM", "T_FTP", "T_FULL", "T_FUNCTION", "T_GET", "T_GLOBAL", "T_GO", "T_GRANT", "T_GROUP", "T_HANDLER", "T_HASH", "T_HAVING", "T_HDFS", "T_HIVE", "T_HOST", "T_IDENTITY", "T_IF", "T_IGNORE", "T_IMMEDIATE", "T_IN", "T_INCLUDE", "T_INDEX", "T_INITRANS", "T_INNER", "T_INOUT", "T_INSERT", "T_INT", "T_INT2", "T_INT4", "T_INT8", "T_INTEGER", "T_INTERSECT", "T_INTERVAL", "T_INTO", "T_INVOKER", "T_IS", "T_ISOPEN", "T_ITEMS", "T_JOIN", "T_KEEP", "T_KEY", "T_KEYS", "T_LANGUAGE", "T_LEAVE", "T_LEFT", "T_LIKE", "T_LIMIT", "T_LINES", "T_LOCAL", "T_LOCATION", "T_LOCATOR", "T_LOCATORS", "T_LOCKS", "T_LOG", "T_LOGGED", "T_LOGGING", "T_LOOP", "T_MAP", "T_MATCHED", "T_MAX", "T_MAXTRANS", "T_MERGE", "T_MESSAGE_TEXT", "T_MICROSECOND", "T_MICROSECONDS", "T_MIN", "T_MULTISET", "T_NCHAR", "T_NEW", "T_NVARCHAR", "T_NO", "T_NOCOUNT", "T_NOCOMPRESS", "T_NOLOGGING", "T_NONE", "T_NOT", "T_NOTFOUND", "T_NULL", "T_NUMERIC", "T_NUMBER", "T_OBJECT", "T_OFF", "T_ON", "T_ONLY", "T_OPEN", "T_OR", "T_ORDER", "T_OUT", "T_OUTER", "T_OVER", "T_OVERWRITE", "T_OWNER", "T_PACKAGE", "T_PARTITION", "T_PCTFREE", "T_PCTUSED", "T_PLS_INTEGER", "T_PRECISION", "T_PRESERVE", "T_PRIMARY", "T_PRINT", "T_PROC", "T_PROCEDURE", "T_QUERY_BAND", "T_QUOTED_IDENTIFIER", "T_RAISE", "T_REAL", "T_REFERENCES", "T_REGEXP", "T_REPLACE", "T_RESIGNAL", "T_RESTRICT", "T_RESULT", "T_RESULT_SET_LOCATOR", "T_RETURN", "T_RETURNS", "T_REVERSE", "T_RIGHT", "T_RLIKE", "T_ROLE", "T_ROLLBACK", "T_ROW", "T_ROWS", "T_ROWTYPE", "T_ROW_COUNT", "T_RR", "T_RS", "T_PWD", "T_TRIM", "T_SCHEMA", "T_SECURITY", "T_SEGMENT", "T_SEL", "T_SELECT", "T_SET", "T_SESSION", "T_SESSIONS", "T_SETS", "T_SHARE", "T_SIGNAL", "T_SIMPLE_DOUBLE", "T_SIMPLE_FLOAT", "T_SIMPLE_INTEGER", "T_SMALLDATETIME", "T_SMALLINT", "T_SQL", "T_SQLEXCEPTION", "T_SQLINSERT", "T_SQLSTATE", "T_SQLWARNING", "T_STEP", "T_STORAGE", "T_STRING", "T_SUBDIR", "T_SUBSTRING", "T_SUM", "T_SYS_REFCURSOR", "T_TABLE", "T_TABLESPACE", "T_TEMPORARY", "T_TERMINATED", "T_TEXTIMAGE_ON", "T_THEN", "T_TIMESTAMP", "T_TINYINT", "T_TITLE", "T_TO", "T_TOP", "T_TRANSACTION", "T_TRUE", "T_TRUNCATE", "T_TYPE", "T_UNION", "T_UNIQUE", "T_UPDATE", "T_UR", "T_USE", "T_USING", "T_VALUE", "T_VALUES", "T_VAR", "T_VARCHAR", "T_VARCHAR2", "T_VARYING", "T_VOLATILE", "T_WHEN", "T_WHERE", "T_WHILE", "T_WITH", "T_WITHOUT", "T_WORK", "T_XACT_ABORT", "T_XML", "T_ACTIVITY_COUNT", "T_CUME_DIST", "T_CURRENT_DATE", "T_CURRENT_TIMESTAMP", "T_CURRENT_USER", "T_DENSE_RANK", "T_FIRST_VALUE", "T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", "T_MIN_PART_STRING", "T_MAX_PART_INT", "T_MIN_PART_INT", "T_MAX_PART_DATE", "T_MIN_PART_DATE", "T_PART_COUNT", "T_PART_LOC", "T_RANK", "T_ROW_NUMBER", "T_STDEV", "T_SYSDATE", "T_VARIANCE", "T_USER", "T_ADD", "T_COLON", "T_COMMA", "T_PIPE", "T_DIV", "T_DOT2", "T_EQUAL", "T_EQUAL2", "T_NOTEQUAL", "T_NOTEQUAL2", "T_GREATER", "T_GREATEREQUAL", "T_LESS", "T_LESSEQUAL", "T_MUL", "T_OPEN_B", "T_OPEN_P", "T_OPEN_SB", "T_CLOSE_B", "T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON", "T_SUB", "L_ID", "L_S_STRING", "L_D_STRING", "L_INT", "L_DEC", "L_WS", "L_M_COMMENT", "L_S_COMMENT", "L_FILE", "L_LABEL"};
		VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
		tokenNames = new String[_SYMBOLIC_NAMES.length];

		int i;
		for(i = 0; i < tokenNames.length; ++i) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}

		_serializedATN = Utils.join(new String[]{"\u0003а훑舆괭䐗껱趀ꫝ\u0003ŭಞ\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0004\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010\t\u0010\u0004\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013\u0004\u0014\t\u0014\u0004\u0015\t\u0015\u0004\u0016\t\u0016\u0004\u0017\t\u0017\u0004\u0018\t\u0018\u0004\u0019\t\u0019\u0004\u001a\t\u001a\u0004\u001b\t\u001b\u0004\u001c\t\u001c\u0004\u001d\t\u001d\u0004\u001e\t\u001e\u0004\u001f\t\u001f\u0004 \t \u0004!\t!\u0004\"\t\"\u0004#\t#\u0004$\t$\u0004%\t%\u0004&\t&\u0004'\t'\u0004(\t(\u0004)\t)\u0004*\t*\u0004+\t+\u0004,\t,\u0004-\t-\u0004.\t.\u0004/\t/\u00040\t0\u00041\t1\u00042\t2\u00043\t3\u00044\t4\u00045\t5\u00046\t6\u00047\t7\u00048\t8\u00049\t9\u0004:\t:\u0004;\t;\u0004<\t<\u0004=\t=\u0004>\t>\u0004?\t?\u0004@\t@\u0004A\tA\u0004B\tB\u0004C\tC\u0004D\tD\u0004E\tE\u0004F\tF\u0004G\tG\u0004H\tH\u0004I\tI\u0004J\tJ\u0004K\tK\u0004L\tL\u0004M\tM\u0004N\tN\u0004O\tO\u0004P\tP\u0004Q\tQ\u0004R\tR\u0004S\tS\u0004T\tT\u0004U\tU\u0004V\tV\u0004W\tW\u0004X\tX\u0004Y\tY\u0004Z\tZ\u0004[\t[\u0004\\\t\\\u0004]\t]\u0004^\t^\u0004_\t_\u0004`\t`\u0004a\ta\u0004b\tb\u0004c\tc\u0004d\td\u0004e\te\u0004f\tf\u0004g\tg\u0004h\th\u0004i\ti\u0004j\tj\u0004k\tk\u0004l\tl\u0004m\tm\u0004n\tn\u0004o\to\u0004p\tp\u0004q\tq\u0004r\tr\u0004s\ts\u0004t\tt\u0004u\tu\u0004v\tv\u0004w\tw\u0004x\tx\u0004y\ty\u0004z\tz\u0004{\t{\u0004|\t|\u0004}\t}\u0004~\t~\u0004\u007f\t\u007f\u0004\u0080\t\u0080\u0004\u0081\t\u0081\u0004\u0082\t\u0082\u0004\u0083\t\u0083\u0004\u0084\t\u0084\u0004\u0085\t\u0085\u0004\u0086\t\u0086\u0004\u0087\t\u0087\u0004\u0088\t\u0088\u0004\u0089\t\u0089\u0004\u008a\t\u008a\u0004\u008b\t\u008b\u0004\u008c\t\u008c\u0004\u008d\t\u008d\u0004\u008e\t\u008e\u0004\u008f\t\u008f\u0004\u0090\t\u0090\u0004\u0091\t\u0091\u0004\u0092\t\u0092\u0004\u0093\t\u0093\u0004\u0094\t\u0094\u0004\u0095\t\u0095\u0004\u0096\t\u0096\u0004\u0097\t\u0097\u0004\u0098\t\u0098\u0004\u0099\t\u0099\u0004\u009a\t\u009a\u0004\u009b\t\u009b\u0004\u009c\t\u009c\u0004\u009d\t\u009d\u0004\u009e\t\u009e\u0004\u009f\t\u009f\u0004 \t \u0004¡\t¡\u0004¢\t¢\u0004£\t£\u0004¤\t¤\u0004¥\t¥\u0004¦\t¦\u0004§\t§\u0004¨\t¨\u0004©\t©\u0004ª\tª\u0004«\t«\u0004¬\t¬\u0004\u00ad\t\u00ad\u0004®\t®\u0004¯\t¯\u0004°\t°\u0004±\t±\u0004²\t²\u0004³\t³\u0004´\t´\u0004µ\tµ\u0004¶\t¶\u0004·\t·\u0004¸\t¸\u0004¹\t¹\u0004º\tº\u0004»\t»\u0004¼\t¼\u0004½\t½\u0004¾\t¾\u0004¿\t¿\u0004À\tÀ\u0004Á\tÁ\u0004Â\tÂ\u0004Ã\tÃ\u0004Ä\tÄ\u0004Å\tÅ\u0004Æ\tÆ\u0004Ç\tÇ\u0004È\tÈ\u0004É\tÉ\u0004Ê\tÊ\u0004Ë\tË\u0004Ì\tÌ\u0004Í\tÍ\u0004Î\tÎ\u0004Ï\tÏ\u0004Ð\tÐ\u0004Ñ\tÑ\u0004Ò\tÒ\u0004Ó\tÓ\u0004Ô\tÔ\u0004Õ\tÕ\u0004Ö\tÖ\u0004×\t×\u0004Ø\tØ\u0004Ù\tÙ\u0004Ú\tÚ\u0004Û\tÛ\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0005\u0003ƻ\n\u0003\u0003\u0003\u0005\u0003ƾ\n\u0003\u0006\u0003ǀ\n\u0003\r\u0003\u000e\u0003ǁ\u0003\u0004\u0005\u0004ǅ\n\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004Ǌ\n\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005Ǒ\n\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005Ǘ\n\u0005\u0005\u0005Ǚ\n\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0006\u0007Ǡ\n\u0007\r\u0007\u000e\u0007ǡ\u0003\u0007\u0005\u0007ǥ\n\u0007\u0005\u0007ǧ\n\u0007\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0005\bȤ\n\b\u0003\t\u0003\t\u0003\n\u0003\n\u0006\nȪ\n\n\r\n\u000e\nȫ\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\f\u0003\f\u0003\r\u0003\r\u0003\r\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000eȼ\n\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0007\u000eɁ\n\u000e\f\u000e\u000e\u000eɄ\u000b\u000e\u0005\u000eɆ\n\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000fɋ\n\u000f\u0003\u0010\u0003\u0010\u0005\u0010ɏ\n\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010ɘ\n\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010ɝ\n\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0007\u0011ɣ\n\u0011\f\u0011\u000e\u0011ɦ\u000b\u0011\u0003\u0011\u0003\u0011\u0005\u0011ɪ\n\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0007\u0011ɱ\n\u0011\f\u0011\u000e\u0011ɴ\u000b\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0007\u0012ɽ\n\u0012\f\u0012\u000e\u0012ʀ\u000b\u0012\u0003\u0012\u0003\u0012\u0005\u0012ʄ\n\u0012\u0003\u0012\u0005\u0012ʇ\n\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013ʕ\n\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0005\u0014ʜ\n\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0007\u0014ʣ\n\u0014\f\u0014\u000e\u0014ʦ\u000b\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017ʶ\n\u0017\u0003\u0017\u0003\u0017\u0005\u0017ʺ\n\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0007\u0018ˀ\n\u0018\f\u0018\u000e\u0018˃\u000b\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0007\u0019ˋ\n\u0019\f\u0019\u000e\u0019ˎ\u000b\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0007\u001a˕\n\u001a\f\u001a\u000e\u001a˘\u000b\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0005\u001b˟\n\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0007\u001cˤ\n\u001c\f\u001c\u000e\u001c˧\u000b\u001c\u0003\u001c\u0005\u001c˪\n\u001c\u0003\u001c\u0003\u001c\u0005\u001cˮ\n\u001c\u0003\u001c\u0007\u001c˱\n\u001c\f\u001c\u000e\u001c˴\u000b\u001c\u0003\u001c\u0005\u001c˷\n\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c˼\n\u001c\u0003\u001c\u0003\u001c\u0005\u001c̀\n\u001c\u0003\u001c\u0003\u001c\u0005\u001c̄\n\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e̎\n\u001e\u0003\u001e\u0003\u001e\u0005\u001e̒\n\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e̗\n\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0005\u001f̜\n\u001f\u0003\u001f\u0003\u001f\u0005\u001f̠\n\u001f\u0003 \u0003 \u0003 \u0003!\u0003!\u0003!\u0003!\u0003!\u0003!\u0003!\u0003!\u0005!̭\n!\u0003!\u0003!\u0003\"\u0005\"̲\n\"\u0003\"\u0003\"\u0003\"\u0003\"\u0005\"̸\n\"\u0003\"\u0003\"\u0003\"\u0003\"\u0003\"\u0005\"̿\n\"\u0003\"\u0003\"\u0003\"\u0003\"\u0003\"\u0005\"͆\n\"\u0003\"\u0005\"͉\n\"\u0003#\u0003#\u0003#\u0003#\u0003#\u0005#͐\n#\u0003#\u0003#\u0003#\u0003#\u0003#\u0005#͗\n#\u0003$\u0003$\u0003$\u0003$\u0005$͝\n$\u0003$\u0005$͠\n$\u0003$\u0003$\u0003$\u0005$ͥ\n$\u0003$\u0003$\u0003$\u0003$\u0005$ͫ\n$\u0003%\u0003%\u0003%\u0007%Ͱ\n%\f%\u000e%ͳ\u000b%\u0003&\u0003&\u0003&\u0005&\u0378\n&\u0003&\u0007&ͻ\n&\f&\u000e&;\u000b&\u0003&\u0007&\u0381\n&\f&\u000e&΄\u000b&\u0003&\u0003&\u0005&Έ\n&\u0003&\u0005&\u038b\n&\u0003'\u0003'\u0003(\u0003(\u0005(Α\n(\u0003(\u0003(\u0003(\u0003(\u0003(\u0003(\u0003(\u0003(\u0003(\u0003(\u0007(Ν\n(\f(\u000e(Π\u000b(\u0003(\u0003(\u0003(\u0003(\u0003(\u0007(Χ\n(\f(\u000e(Ϊ\u000b(\u0003(\u0003(\u0003(\u0005(ί\n(\u0003)\u0003)\u0003)\u0005)δ\n)\u0003)\u0003)\u0003)\u0005)ι\n)\u0003)\u0003)\u0003)\u0005)ξ\n)\u0007)π\n)\f)\u000e)σ\u000b)\u0003)\u0003)\u0005)χ\n)\u0003)\u0005)ϊ\n)\u0003)\u0003)\u0003)\u0003)\u0003)\u0003)\u0007)ϒ\n)\f)\u000e)ϕ\u000b)\u0003)\u0003)\u0003)\u0003)\u0003)\u0003)\u0003)\u0007)Ϟ\n)\f)\u000e)ϡ\u000b)\u0003)\u0003)\u0007)ϥ\n)\f)\u000e)Ϩ\u000b)\u0005)Ϫ\n)\u0003*\u0003*\u0003*\u0003*\u0003*\u0003*\u0003*\u0003*\u0003*\u0003*\u0005*϶\n*\u0003+\u0003+\u0006+Ϻ\n+\r+\u000e+ϻ\u0003,\u0005,Ͽ\n,\u0003,\u0003,\u0003-\u0006-Є\n-\r-\u000e-Ѕ\u0003.\u0003.\u0003.\u0003.\u0003.\u0003.\u0003.\u0003.\u0003.\u0005.Б\n.\u0003/\u0003/\u0003/\u0003/\u0003/\u0003/\u0003/\u0003/\u0003/\u0003/\u0003/\u0006/О\n/\r/\u000e/П\u0003/\u0003/\u0003/\u0005/Х\n/\u00030\u00030\u00030\u00030\u00030\u00030\u00030\u00030\u00030\u00030\u00030\u00070в\n0\f0\u000e0е\u000b0\u00030\u00030\u00030\u00030\u00030\u00030\u00030\u00050о\n0\u00031\u00031\u00032\u00032\u00032\u00032\u00072ц\n2\f2\u000e2щ\u000b2\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00053ђ\n3\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00033\u00053Ѧ\n3\u00034\u00034\u00034\u00034\u00054Ѭ\n4\u00035\u00035\u00055Ѱ\n5\u00035\u00035\u00035\u00055ѵ\n5\u00035\u00035\u00055ѹ\n5\u00035\u00035\u00035\u00055Ѿ\n5\u00035\u00055ҁ\n5\u00035\u00035\u00035\u00055҆\n5\u00035\u00055҉\n5\u00036\u00036\u00036\u00036\u00036\u00037\u00037\u00038\u00038\u00038\u00058ҕ\n8\u00038\u00038\u00039\u00039\u00039\u00059Ҝ\n9\u00039\u00039\u00039\u00059ҡ\n9\u00039\u00039\u00039\u00059Ҧ\n9\u00079Ҩ\n9\f9\u000e9ҫ\u000b9\u00039\u00039\u00059ү\n9\u00039\u00059Ҳ\n9\u00039\u00039\u00039\u00039\u00039\u00039\u00079Һ\n9\f9\u000e9ҽ\u000b9\u00039\u00039\u00039\u00039\u00039\u00039\u00039\u00079ӆ\n9\f9\u000e9Ӊ\u000b9\u00039\u00039\u00079Ӎ\n9\f9\u000e9Ӑ\u000b9\u00039\u00039\u00039\u00039\u00039\u00059ӗ\n9\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0005:ӥ\n:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0003:\u0005:Ԅ\n:\u0005:Ԇ\n:\u0003;\u0003;\u0003;\u0005;ԋ\n;\u0003;\u0003;\u0005;ԏ\n;\u0003;\u0003;\u0003<\u0005<Ԕ\n<\u0003<\u0003<\u0003<\u0003<\u0003<\u0005<ԛ\n<\u0003<\u0005<Ԟ\n<\u0003=\u0005=ԡ\n=\u0003=\u0003=\u0003=\u0003=\u0005=ԧ\n=\u0003>\u0003>\u0003>\u0003>\u0003>\u0005>\u052e\n>\u0003>\u0003>\u0007>Բ\n>\f>\u000e>Ե\u000b>\u0003?\u0003?\u0003?\u0003?\u0005?Ի\n?\u0003@\u0003@\u0003@\u0003@\u0005@Ձ\n@\u0003@\u0005@Մ\n@\u0003@\u0003@\u0003@\u0005@Չ\n@\u0003@\u0003@\u0005@Ս\n@\u0003@\u0005@Ր\n@\u0003@\u0003@\u0003A\u0003A\u0003A\u0005A\u0557\nA\u0003B\u0003B\u0003B\u0003B\u0005B՝\nB\u0003B\u0005B\u0560\nB\u0003B\u0003B\u0003B\u0003B\u0003B\u0003B\u0003B\u0003B\u0005Bժ\nB\u0003C\u0003C\u0003C\u0003C\u0003C\u0007Cձ\nC\fC\u000eCմ\u000bC\u0003D\u0003D\u0003D\u0003D\u0005Dպ\nD\u0003D\u0003D\u0003D\u0003D\u0003D\u0005Dց\nD\u0005Dփ\nD\u0003E\u0003E\u0003E\u0003E\u0005E։\nE\u0003E\u0005E\u058c\nE\u0003E\u0003E\u0003E\u0003E\u0003E\u0003E\u0003E\u0003E\u0003E\u0005E֗\nE\u0003F\u0003F\u0003F\u0003F\u0003F\u0007F֞\nF\fF\u000eF֡\u000bF\u0003G\u0003G\u0003G\u0005G֦\nG\u0003H\u0003H\u0003H\u0003H\u0005H֬\nH\u0003H\u0005H֯\nH\u0003H\u0003H\u0003H\u0005Hִ\nH\u0003H\u0005Hַ\nH\u0003H\u0005Hֺ\nH\u0003H\u0005Hֽ\nH\u0003H\u0005H׀\nH\u0003H\u0003H\u0003H\u0003H\u0005H׆\nH\u0003I\u0003I\u0003I\u0003I\u0003I\u0003I\u0007I\u05ce\nI\fI\u000eIב\u000bI\u0003I\u0003I\u0003I\u0003I\u0003I\u0003I\u0007Iי\nI\fI\u000eIל\u000bI\u0005Iמ\nI\u0003J\u0003J\u0003J\u0003J\u0003J\u0005Jץ\nJ\u0003J\u0003J\u0003J\u0005Jת\nJ\u0003J\u0007J\u05ed\nJ\fJ\u000eJװ\u000bJ\u0003J\u0005J׳\nJ\u0003J\u0003J\u0003J\u0003J\u0003J\u0003J\u0005J\u05fb\nJ\u0003J\u0003J\u0005J\u05ff\nJ\u0003J\u0007J\u0602\nJ\fJ\u000eJ\u0605\u000bJ\u0003J\u0005J؈\nJ\u0005J؊\nJ\u0003K\u0006K؍\nK\rK\u000eK؎\u0003L\u0003L\u0003L\u0003L\u0003L\u0003L\u0005Lؗ\nL\u0003L\u0003L\u0003L\u0005L\u061c\nL\u0003M\u0003M\u0003M\u0003M\u0005Mآ\nM\u0003M\u0003M\u0003M\u0003M\u0003M\u0005Mة\nM\u0003M\u0005Mج\nM\u0003N\u0003N\u0003N\u0003O\u0003O\u0005Oس\nO\u0003O\u0003O\u0003O\u0003O\u0003O\u0003O\u0005Oػ\nO\u0003O\u0003O\u0003O\u0003O\u0007Oف\nO\fO\u000eOل\u000bO\u0005Oن\nO\u0003O\u0005Oى\nO\u0003P\u0003P\u0005Pٍ\nP\u0003Q\u0003Q\u0003Q\u0003Q\u0003Q\u0007Qٔ\nQ\fQ\u000eQٗ\u000bQ\u0003Q\u0005Qٚ\nQ\u0003Q\u0003Q\u0003Q\u0003R\u0003R\u0003R\u0003R\u0003R\u0005R٤\nR\u0003S\u0003S\u0003S\u0003S\u0003S\u0003T\u0003T\u0003T\u0003U\u0003U\u0003U\u0005Uٱ\nU\u0003V\u0003V\u0003V\u0003V\u0003V\u0005Vٸ\nV\u0005Vٺ\nV\u0003V\u0003V\u0005Vپ\nV\u0003V\u0003V\u0005Vڂ\nV\u0003W\u0003W\u0003W\u0003W\u0007Wڈ\nW\fW\u000eWڋ\u000bW\u0003W\u0003W\u0003X\u0003X\u0003X\u0003X\u0007Xړ\nX\fX\u000eXږ\u000bX\u0003Y\u0003Y\u0003Y\u0003Y\u0007Yڜ\nY\fY\u000eYڟ\u000bY\u0003Y\u0003Y\u0003Z\u0003Z\u0003Z\u0005Zڦ\nZ\u0003Z\u0003Z\u0003Z\u0003Z\u0003[\u0003[\u0005[ڮ\n[\u0003[\u0003[\u0005[ڲ\n[\u0003\\\u0003\\\u0003\\\u0003\\\u0003]\u0003]\u0005]ں\n]\u0003^\u0003^\u0003^\u0003^\u0003^\u0003^\u0003_\u0003_\u0003_\u0003_\u0003`\u0003`\u0003`\u0003`\u0007`ۊ\n`\f`\u000e`ۍ\u000b`\u0003`\u0003`\u0003`\u0003`\u0003a\u0003a\u0003a\u0003a\u0003a\u0003b\u0003b\u0005bۚ\nb\u0003c\u0003c\u0003c\u0003c\u0003c\u0005cۡ\nc\u0003c\u0003c\u0005cۥ\nc\u0003d\u0003d\u0003d\u0003d\u0003d\u0005d۬\nd\u0005dۮ\nd\u0003e\u0003e\u0005e۲\ne\u0003e\u0003e\u0003e\u0003e\u0003e\u0007e۹\ne\fe\u000eeۼ\u000be\u0003f\u0003f\u0003f\u0003g\u0003g\u0003g\u0003g\u0003g\u0003g\u0003h\u0003h\u0005h܉\nh\u0003h\u0003h\u0003h\u0003h\u0005h\u070f\nh\u0003h\u0003h\u0005hܓ\nh\u0003i\u0003i\u0003i\u0003i\u0003i\u0007iܚ\ni\fi\u000eiܝ\u000bi\u0003j\u0003j\u0003j\u0003j\u0003j\u0003j\u0007jܥ\nj\fj\u000ejܨ\u000bj\u0003j\u0003j\u0003j\u0007jܭ\nj\fj\u000ejܰ\u000bj\u0003k\u0003k\u0003k\u0003k\u0003k\u0003k\u0005kܸ\nk\u0003k\u0003k\u0005kܼ\nk\u0003k\u0003k\u0007k݀\nk\fk\u000ek݃\u000bk\u0003l\u0003l\u0003l\u0005l݈\nl\u0003m\u0003m\u0005m\u074c\nm\u0003n\u0003n\u0003n\u0003n\u0003n\u0003n\u0003n\u0003n\u0005nݖ\nn\u0003o\u0003o\u0003p\u0003p\u0003p\u0003p\u0003p\u0003p\u0003p\u0005pݡ\np\u0003p\u0003p\u0003p\u0003p\u0003p\u0003p\u0003p\u0003p\u0003p\u0005pݬ\np\u0003p\u0003p\u0005pݰ\np\u0005pݲ\np\u0003q\u0003q\u0005qݶ\nq\u0003r\u0003r\u0005rݺ\nr\u0003r\u0003r\u0003r\u0003r\u0003r\u0003r\u0003r\u0003r\u0007rބ\nr\fr\u000erއ\u000br\u0003r\u0003r\u0003s\u0003s\u0005sލ\ns\u0003t\u0003t\u0003u\u0003u\u0003u\u0003u\u0003u\u0003u\u0003u\u0003u\u0003u\u0003u\u0007uޛ\nu\fu\u000euޞ\u000bu\u0003u\u0003u\u0007uޢ\nu\fu\u000euޥ\u000bu\u0003v\u0003v\u0003v\u0003v\u0003v\u0003v\u0003v\u0005vޮ\nv\u0003w\u0003w\u0003x\u0003x\u0003x\u0005x\u07b5\nx\u0003x\u0003x\u0003x\u0003x\u0003x\u0005x\u07bc\nx\u0005x\u07be\nx\u0003y\u0003y\u0005y߂\ny\u0003z\u0003z\u0005z߆\nz\u0003{\u0003{\u0003{\u0005{ߋ\n{\u0003|\u0005|ߎ\n|\u0003|\u0003|\u0005|ߒ\n|\u0003|\u0005|ߕ\n|\u0003|\u0003|\u0003}\u0003}\u0003}\u0003~\u0003~\u0003~\u0003~\u0005~ߠ\n~\u0003~\u0005~ߣ\n~\u0003~\u0003~\u0003~\u0003\u007f\u0003\u007f\u0003\u007f\u0003\u0080\u0003\u0080\u0005\u0080߭\n\u0080\u0003\u0080\u0003\u0080\u0003\u0081\u0003\u0081\u0003\u0081\u0003\u0082\u0003\u0082\u0005\u0082߶\n\u0082\u0003\u0082\u0003\u0082\u0003\u0082\u0007\u0082\u07fb\n\u0082\f\u0082\u000e\u0082\u07fe\u000b\u0082\u0003\u0082\u0005\u0082ࠁ\n\u0082\u0003\u0082\u0003\u0082\u0005\u0082ࠅ\n\u0082\u0003\u0082\u0003\u0082\u0003\u0082\u0007\u0082ࠊ\n\u0082\f\u0082\u000e\u0082ࠍ\u000b\u0082\u0003\u0082\u0005\u0082ࠐ\n\u0082\u0003\u0083\u0003\u0083\u0003\u0083\u0003\u0083\u0003\u0083\u0003\u0083\u0005\u0083࠘\n\u0083\u0003\u0084\u0003\u0084\u0003\u0084\u0003\u0084\u0005\u0084ࠞ\n\u0084\u0003\u0084\u0003\u0084\u0005\u0084ࠢ\n\u0084\u0003\u0084\u0003\u0084\u0003\u0084\u0003\u0084\u0003\u0084\u0003\u0085\u0003\u0085\u0003\u0085\u0003\u0085\u0005\u0085࠭\n\u0085\u0003\u0085\u0003\u0085\u0003\u0085\u0003\u0085\u0003\u0085\u0005\u0085࠴\n\u0085\u0003\u0085\u0003\u0085\u0003\u0085\u0003\u0085\u0003\u0085\u0003\u0086\u0003\u0086\u0003\u0086\u0003\u0086\u0003\u0086\u0003\u0086\u0005\u0086ࡁ\n\u0086\u0003\u0087\u0003\u0087\u0003\u0087\u0003\u0087\u0007\u0087ࡇ\n\u0087\f\u0087\u000e\u0087ࡊ\u000b\u0087\u0003\u0088\u0005\u0088ࡍ\n\u0088\u0003\u0088\u0003\u0088\u0003\u0089\u0003\u0089\u0003\u0089\u0003\u0089\u0007\u0089ࡕ\n\u0089\f\u0089\u000e\u0089ࡘ\u000b\u0089\u0003\u008a\u0003\u008a\u0005\u008a\u085c\n\u008a\u0003\u008a\u0003\u008a\u0003\u008a\u0003\u008a\u0003\u008a\u0003\u008b\u0003\u008b\u0003\u008b\u0003\u008b\u0007\u008b\u0867\n\u008b\f\u008b\u000e\u008b\u086a\u000b\u008b\u0003\u008b\u0003\u008b\u0003\u008c\u0003\u008c\u0003\u008c\u0003\u008c\u0007\u008c\u0872\n\u008c\f\u008c\u000e\u008c\u0875\u000b\u008c\u0003\u008d\u0003\u008d\u0003\u008d\u0003\u008d\u0003\u008d\u0005\u008d\u087c\n\u008d\u0003\u008e\u0003\u008e\u0005\u008e\u0880\n\u008e\u0003\u008e\u0003\u008e\u0005\u008e\u0884\n\u008e\u0003\u008e\u0003\u008e\u0005\u008e\u0888\n\u008e\u0005\u008e\u088a\n\u008e\u0003\u008f\u0003\u008f\u0003\u008f\u0005\u008f\u088f\n\u008f\u0003\u008f\u0005\u008f\u0892\n\u008f\u0003\u008f\u0005\u008f\u0895\n\u008f\u0003\u008f\u0005\u008f\u0898\n\u008f\u0003\u008f\u0005\u008f\u089b\n\u008f\u0003\u008f\u0005\u008f\u089e\n\u008f\u0003\u008f\u0005\u008f\u08a1\n\u008f\u0003\u0090\u0005\u0090ࢤ\n\u0090\u0003\u0090\u0005\u0090ࢧ\n\u0090\u0003\u0090\u0003\u0090\u0003\u0090\u0007\u0090ࢬ\n\u0090\f\u0090\u000e\u0090\u08af\u000b\u0090\u0003\u0091\u0003\u0091\u0003\u0092\u0003\u0092\u0003\u0092\u0003\u0093\u0003\u0093\u0003\u0093\u0005\u0093\u08b9\n\u0093\u0003\u0093\u0003\u0093\u0005\u0093\u08bd\n\u0093\u0003\u0093\u0005\u0093\u08c0\n\u0093\u0003\u0094\u0003\u0094\u0005\u0094\u08c4\n\u0094\u0003\u0094\u0003\u0094\u0003\u0094\u0003\u0094\u0003\u0094\u0005\u0094\u08cb\n\u0094\u0003\u0095\u0003\u0095\u0005\u0095\u08cf\n\u0095\u0003\u0095\u0003\u0095\u0003\u0096\u0003\u0096\u0003\u0096\u0003\u0096\u0007\u0096\u08d7\n\u0096\f\u0096\u000e\u0096\u08da\u000b\u0096\u0003\u0097\u0003\u0097\u0003\u0097\u0007\u0097\u08df\n\u0097\f\u0097\u000e\u0097\u08e2\u000b\u0097\u0003\u0098\u0003\u0098\u0003\u0098\u0005\u0098ࣧ\n\u0098\u0003\u0099\u0003\u0099\u0005\u0099࣫\n\u0099\u0003\u009a\u0003\u009a\u0003\u009a\u0003\u009a\u0005\u009aࣱ\n\u009a\u0003\u009b\u0003\u009b\u0003\u009b\u0003\u009b\u0003\u009b\u0003\u009b\u0003\u009b\u0005\u009bࣺ\n\u009b\u0003\u009c\u0005\u009cࣽ\n\u009c\u0003\u009c\u0003\u009c\u0003\u009c\u0005\u009cं\n\u009c\u0003\u009c\u0005\u009cअ\n\u009c\u0003\u009d\u0003\u009d\u0003\u009d\u0003\u009d\u0003\u009d\u0003\u009d\u0007\u009dऍ\n\u009d\f\u009d\u000e\u009dऐ\u000b\u009d\u0003\u009d\u0003\u009d\u0005\u009dऔ\n\u009d\u0003\u009e\u0003\u009e\u0003\u009e\u0003\u009e\u0003\u009e\u0007\u009eछ\n\u009e\f\u009e\u000e\u009eञ\u000b\u009e\u0003\u009e\u0003\u009e\u0005\u009eढ\n\u009e\u0003\u009f\u0003\u009f\u0005\u009fद\n\u009f\u0003\u009f\u0003\u009f\u0003\u009f\u0003\u009f\u0003\u009f\u0007\u009fभ\n\u009f\f\u009f\u000e\u009fर\u000b\u009f\u0003\u009f\u0005\u009fळ\n\u009f\u0003 \u0003 \u0003¡\u0003¡\u0003¡\u0003¢\u0003¢\u0003¢\u0003¢\u0003¢\u0007¢ि\n¢\f¢\u000e¢ू\u000b¢\u0003£\u0003£\u0003£\u0003¤\u0003¤\u0003¤\u0003¤\u0005¤ो\n¤\u0003¤\u0003¤\u0003¤\u0005¤ॐ\n¤\u0007¤॒\n¤\f¤\u000e¤ॕ\u000b¤\u0003¥\u0006¥क़\n¥\r¥\u000e¥ख़\u0003¦\u0003¦\u0003¦\u0003¦\u0003¦\u0003¦\u0003¦\u0003¦\u0003¦\u0005¦॥\n¦\u0005¦१\n¦\u0003§\u0003§\u0003§\u0003§\u0003§\u0005§८\n§\u0003§\u0005§ॱ\n§\u0003¨\u0003¨\u0003¨\u0007¨ॶ\n¨\f¨\u000e¨ॹ\u000b¨\u0003©\u0003©\u0003©\u0003©\u0003©\u0005©\u0980\n©\u0003©\u0005©ঃ\n©\u0003©\u0005©আ\n©\u0003ª\u0003ª\u0003ª\u0003«\u0003«\u0003«\u0003«\u0003«\u0003«\u0003«\u0003«\u0006«ও\n«\r«\u000e«ঔ\u0003¬\u0003¬\u0003¬\u0003¬\u0003¬\u0005¬জ\n¬\u0003¬\u0005¬ট\n¬\u0003¬\u0005¬ঢ\n¬\u0003\u00ad\u0003\u00ad\u0005\u00adদ\n\u00ad\u0003\u00ad\u0003\u00ad\u0003\u00ad\u0005\u00adফ\n\u00ad\u0003\u00ad\u0003\u00ad\u0003\u00ad\u0003\u00ad\u0005\u00ad\u09b1\n\u00ad\u0003®\u0003®\u0005®\u09b5\n®\u0003®\u0003®\u0003®\u0003®\u0003®\u0003®\u0003®\u0007®া\n®\f®\u000e®ু\u000b®\u0003®\u0005®ৄ\n®\u0003®\u0005®ে\n®\u0003¯\u0003¯\u0005¯ো\n¯\u0003¯\u0003¯\u0005¯\u09cf\n¯\u0003¯\u0005¯\u09d2\n¯\u0003¯\u0005¯\u09d5\n¯\u0003°\u0003°\u0005°\u09d9\n°\u0003°\u0003°\u0003±\u0003±\u0005±য়\n±\u0003±\u0003±\u0003±\u0003±\u0003±\u0005±০\n±\u0003±\u0003±\u0003±\u0003±\u0007±৬\n±\f±\u000e±৯\u000b±\u0003²\u0003²\u0003²\u0005²৴\n²\u0003³\u0003³\u0003³\u0005³৹\n³\u0003³\u0003³\u0003³\u0003³\u0003³\u0003³\u0003³\u0003³\u0003³\u0003³\u0005³ਅ\n³\u0003´\u0003´\u0005´ਉ\n´\u0003´\u0003´\u0003´\u0003´\u0003´\u0007´ਐ\n´\f´\u000e´ਓ\u000b´\u0003´\u0005´ਖ\n´\u0003´\u0003´\u0003µ\u0003µ\u0003µ\u0003µ\u0007µਞ\nµ\fµ\u000eµਡ\u000bµ\u0003µ\u0003µ\u0005µਥ\nµ\u0003µ\u0003µ\u0003µ\u0003µ\u0003µ\u0003¶\u0003¶\u0003¶\u0003¶\u0003·\u0003·\u0003¸\u0003¸\u0003¸\u0003¸\u0003¸\u0003¸\u0003¸\u0003¸\u0003¸\u0005¸\u0a3b\n¸\u0003¸\u0005¸ਾ\n¸\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0005¹੍\n¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0003¹\u0007¹\u0a5d\n¹\f¹\u000e¹\u0a60\u000b¹\u0003º\u0003º\u0003º\u0003º\u0003º\u0003º\u0003º\u0003º\u0005º੪\nº\u0003»\u0003»\u0003»\u0003»\u0003¼\u0003¼\u0003½\u0003½\u0003½\u0003½\u0003½\u0007½\u0a77\n½\f½\u000e½\u0a7a\u000b½\u0003¾\u0003¾\u0003¾\u0003¾\u0003¾\u0003¾\u0003¾\u0003¾\u0003¾\u0005¾અ\n¾\u0003¿\u0003¿\u0005¿ઉ\n¿\u0003À\u0003À\u0003À\u0003À\u0003À\u0003À\u0003À\u0006À\u0a92\nÀ\rÀ\u000eÀઓ\u0003À\u0003À\u0005Àઘ\nÀ\u0003À\u0003À\u0003Á\u0003Á\u0003Á\u0003Á\u0003Á\u0003Á\u0006Áઢ\nÁ\rÁ\u000eÁણ\u0003Á\u0003Á\u0005Áન\nÁ\u0003Á\u0003Á\u0003Â\u0003Â\u0003Â\u0003Â\u0003Ã\u0003Ã\u0003Ã\u0005Ãળ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ãસ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ãઽ\nÃ\u0003Ã\u0003Ã\u0005Ãુ\nÃ\u0003Ã\u0003Ã\u0005Ãૅ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ã\u0aca\nÃ\u0003Ã\u0003Ã\u0005Ã\u0ace\nÃ\u0003Ã\u0003Ã\u0005Ã\u0ad2\nÃ\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0005Ã૩\nÃ\u0005Ã૫\nÃ\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0005Ã\u0afd\nÃ\u0005Ã\u0aff\nÃ\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0005Ãଇ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ãଌ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ã\u0b11\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ãଖ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0003Ã\u0005Ãଣ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ãନ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ãଭ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ãଲ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ãଷ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ã଼\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ãୁ\nÃ\u0003Ã\u0003Ã\u0003Ã\u0005Ã\u0b46\nÃ\u0005Ãୈ\nÃ\u0003Ä\u0003Ä\u0003Å\u0003Å\u0003Å\u0005Å\u0b4f\nÅ\u0003Å\u0005Å\u0b52\nÅ\u0003Å\u0003Å\u0003Æ\u0003Æ\u0003Æ\u0003Æ\u0003Æ\u0007Æ\u0b5b\nÆ\fÆ\u000eÆ\u0b5e\u000bÆ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0005Ç୧\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0005Ç୯\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0005Ç\u0b78\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0005Ç\u0b7e\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0007Ç\u0b8d\nÇ\fÇ\u000eÇஐ\u000bÇ\u0005Çஒ\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0007Ç\u0ba0\nÇ\fÇ\u000eÇண\u000bÇ\u0005Ç\u0ba5\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0007Çள\nÇ\fÇ\u000eÇஶ\u000bÇ\u0005Çஸ\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0007Çெ\nÇ\fÇ\u000eÇ\u0bc9\u000bÇ\u0005Çோ\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0007Ç\u0bd9\nÇ\fÇ\u000eÇ\u0bdc\u000bÇ\u0005Ç\u0bde\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0007Ç௬\nÇ\fÇ\u000eÇ௯\u000bÇ\u0005Ç௱\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0007Ç\u0bfd\nÇ\fÇ\u000eÇ\u0c00\u000bÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0006Çఌ\nÇ\rÇ\u000eÇ\u0c0d\u0003Ç\u0003Ç\u0005Çఒ\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0005Çఢ\nÇ\u0003Ç\u0003Ç\u0003Ç\u0003Ç\u0005Çన\nÇ\u0003È\u0003È\u0003È\u0005Èభ\nÈ\u0003È\u0003È\u0003É\u0003É\u0003É\u0007É\u0c34\nÉ\fÉ\u000eÉష\u000bÉ\u0003Ê\u0003Ê\u0003Ê\u0003Ê\u0005Êఽ\nÊ\u0005Êి\nÊ\u0003Ê\u0003Ê\u0003Ë\u0003Ë\u0005Ë\u0c45\nË\u0003Ì\u0003Ì\u0005Ì\u0c49\nÌ\u0003Í\u0003Í\u0007Í్\nÍ\fÍ\u000eÍ\u0c50\u000bÍ\u0003Î\u0003Î\u0003Î\u0003Î\u0003Î\u0003Î\u0003Î\u0003Î\u0003Î\u0003Î\u0003Î\u0003Î\u0005Î\u0c5e\nÎ\u0003Ï\u0003Ï\u0003Ï\u0003Ï\u0003Ï\u0005Ï\u0c65\nÏ\u0003Ð\u0007Ð౨\nÐ\fÐ\u000eÐ౫\u000bÐ\u0003Ñ\u0003Ñ\u0003Ñ\u0003Ò\u0003Ò\u0003Ò\u0003Ò\u0005Ò\u0c74\nÒ\u0003Ò\u0003Ò\u0003Ò\u0007Ò౹\nÒ\fÒ\u000eÒ౼\u000bÒ\u0005Ò౾\nÒ\u0003Ó\u0003Ó\u0003Ó\u0003Ô\u0003Ô\u0003Ô\u0003Õ\u0003Õ\u0005Õಈ\nÕ\u0003Ö\u0003Ö\u0005Öಌ\nÖ\u0003×\u0005×ಏ\n×\u0003×\u0003×\u0003Ø\u0005Øಔ\nØ\u0003Ø\u0003Ø\u0003Ù\u0003Ù\u0003Ú\u0003Ú\u0003Û\u0003Û\u0003Û\u0003౩\u0004ŠŰÜ\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e ¢¤¦¨ª¬®°²´¶¸º¼¾ÀÂÄÆÈÊÌÎÐÒÔÖØÚÜÞàâäæèêìîðòôöøúüþĀĂĄĆĈĊČĎĐĒĔĖĘĚĜĞĠĢĤĦĨĪĬĮİĲĴĶĸĺļľŀłńņňŊŌŎŐŒŔŖŘŚŜŞŠŢŤŦŨŪŬŮŰŲŴŶŸźżžƀƂƄƆƈƊƌƎƐƒƔƖƘƚƜƞƠƢƤƦƨƪƬƮưƲƴ\u00020\u0005\u0002\u0003\u0004őőŢŢ\u0004\u0002``ĭĭ\u0003\u0002¦§\u0005\u0002\u0010\u0010pp\u0097\u0097\u0004\u0002##++\u0004\u000266ii\u0004\u0002¶¶úú\u0004\u0002\u0011\u0011QQ\u0004\u0002NNĢĢ\u0004\u0002NNÖÖ\u0004\u0002JJ\u0086\u0086\u0005\u0002\u008a\u008a°°ÒÓ\u0004\u0002««½½\u0004\u0002ïïğğ\u0004\u0002¯¯ŧŧ\u0004\u0002!!((\u0004\u0002&&==\u0004\u0002AAõõ\u0004\u0002\u0010\u0010\u0097\u0097\u0003\u0002æç\u0003\u0002ÙÚ\u0006\u0002<<LL\u0096\u0096ÏÏ\u0003\u0002de\u0003\u0002]^\u0004\u0002ððďď\u0005\u0002NN\u0085\u0085ÎÎ\u0006\u0002\u000e\u000f»»ÜÜĳĳ\u0003\u0002ÅÆ\u0004\u0002ûûĜĜ\u0006\u0002\u0017\u0017XX¬¬ĖĖ\u0004\u0002¬¬įį\u0004\u0002  ĊĊ\u0003\u0002øù\u0004\u0002\n\nVV\u0005\u0002vv  éé\u0005\u0002==ñòģģ\u0005\u0002ggþþĢĢ\u0003\u0002QR\u0004\u0002\r\rÉÉ\u0005\u0002¡¡ààêê\u0004\u0002DE³´\u0004\u000233ŐŐ\u0005\u0002ss\u0098\u0098ÀÀ\u0004\u0002ōōţţ\u0004\u0002jjĝĝ\u000e\u0002\b\u001b\u001d[__aÀÂÓÕîðāăėęĞġĬįľŅŌ\u0e3d\u0002ƶ\u0003\u0002\u0002\u0002\u0004ƿ\u0003\u0002\u0002\u0002\u0006Ǆ\u0003\u0002\u0002\u0002\bǘ\u0003\u0002\u0002\u0002\nǚ\u0003\u0002\u0002\u0002\fǦ\u0003\u0002\u0002\u0002\u000eȣ\u0003\u0002\u0002\u0002\u0010ȥ\u0003\u0002\u0002\u0002\u0012ȧ\u0003\u0002\u0002\u0002\u0014ȭ\u0003\u0002\u0002\u0002\u0016ȳ\u0003\u0002\u0002\u0002\u0018ȵ\u0003\u0002\u0002\u0002\u001aɅ\u0003\u0002\u0002\u0002\u001cɊ\u0003\u0002\u0002\u0002\u001eɜ\u0003\u0002\u0002\u0002 ɞ\u0003\u0002\u0002\u0002\"ʃ\u0003\u0002\u0002\u0002$ʍ\u0003\u0002\u0002\u0002&ʘ\u0003\u0002\u0002\u0002(ʬ\u0003\u0002\u0002\u0002*ʯ\u0003\u0002\u0002\u0002,ʱ\u0003\u0002\u0002\u0002.ʻ\u0003\u0002\u0002\u00020˄\u0003\u0002\u0002\u00022ˏ\u0003\u0002\u0002\u00024˞\u0003\u0002\u0002\u00026̃\u0003\u0002\u0002\u00028̅\u0003\u0002\u0002\u0002:̍\u0003\u0002\u0002\u0002<̘\u0003\u0002\u0002\u0002>̡\u0003\u0002\u0002\u0002@̤\u0003\u0002\u0002\u0002Ḇ\u0003\u0002\u0002\u0002D͊\u0003\u0002\u0002\u0002F͘\u0003\u0002\u0002\u0002Hͬ\u0003\u0002\u0002\u0002JΊ\u0003\u0002\u0002\u0002LΌ\u0003\u0002\u0002\u0002Nή\u0003\u0002\u0002\u0002Pϩ\u0003\u0002\u0002\u0002Rϫ\u0003\u0002\u0002\u0002TϹ\u0003\u0002\u0002\u0002VϾ\u0003\u0002\u0002\u0002XЃ\u0003\u0002\u0002\u0002ZА\u0003\u0002\u0002\u0002\\Ф\u0003\u0002\u0002\u0002^н\u0003\u0002\u0002\u0002`п\u0003\u0002\u0002\u0002bс\u0003\u0002\u0002\u0002dѥ\u0003\u0002\u0002\u0002fѫ\u0003\u0002\u0002\u0002h҈\u0003\u0002\u0002\u0002jҊ\u0003\u0002\u0002\u0002lҏ\u0003\u0002\u0002\u0002nґ\u0003\u0002\u0002\u0002pӖ\u0003\u0002\u0002\u0002rԅ\u0003\u0002\u0002\u0002tԇ\u0003\u0002\u0002\u0002vԝ\u0003\u0002\u0002\u0002xԦ\u0003\u0002\u0002\u0002z\u0528\u0003\u0002\u0002\u0002|Ժ\u0003\u0002\u0002\u0002~Ճ\u0003\u0002\u0002\u0002\u0080Փ\u0003\u0002\u0002\u0002\u0082՟\u0003\u0002\u0002\u0002\u0084ի\u0003\u0002\u0002\u0002\u0086ւ\u0003\u0002\u0002\u0002\u0088\u058b\u0003\u0002\u0002\u0002\u008a֘\u0003\u0002\u0002\u0002\u008c֥\u0003\u0002\u0002\u0002\u008e֮\u0003\u0002\u0002\u0002\u0090ם\u0003\u0002\u0002\u0002\u0092؉\u0003\u0002\u0002\u0002\u0094،\u0003\u0002\u0002\u0002\u0096؛\u0003\u0002\u0002\u0002\u0098ث\u0003\u0002\u0002\u0002\u009aح\u0003\u0002\u0002\u0002\u009cذ\u0003\u0002\u0002\u0002\u009eٌ\u0003\u0002\u0002\u0002 َ\u0003\u0002\u0002\u0002¢ٞ\u0003\u0002\u0002\u0002¤٥\u0003\u0002\u0002\u0002¦٪\u0003\u0002\u0002\u0002¨٭\u0003\u0002\u0002\u0002ªٲ\u0003\u0002\u0002\u0002¬ڃ\u0003\u0002\u0002\u0002®ڎ\u0003\u0002\u0002\u0002°ڗ\u0003\u0002\u0002\u0002²ڢ\u0003\u0002\u0002\u0002´ګ\u0003\u0002\u0002\u0002¶ڳ\u0003\u0002\u0002\u0002¸ڹ\u0003\u0002\u0002\u0002ºڻ\u0003\u0002\u0002\u0002¼ہ\u0003\u0002\u0002\u0002¾ۅ\u0003\u0002\u0002\u0002Àے\u0003\u0002\u0002\u0002Âۗ\u0003\u0002\u0002\u0002Äۛ\u0003\u0002\u0002\u0002Æۦ\u0003\u0002\u0002\u0002Èۯ\u0003\u0002\u0002\u0002Ê۽\u0003\u0002\u0002\u0002Ì܀\u0003\u0002\u0002\u0002Î\u070e\u0003\u0002\u0002\u0002Ðܔ\u0003\u0002\u0002\u0002Òܞ\u0003\u0002\u0002\u0002Ôܱ\u0003\u0002\u0002\u0002Ö݇\u0003\u0002\u0002\u0002Ø\u074b\u0003\u0002\u0002\u0002Úݕ\u0003\u0002\u0002\u0002Üݗ\u0003\u0002\u0002\u0002Þݱ\u0003\u0002\u0002\u0002àݳ\u0003\u0002\u0002\u0002âݷ\u0003\u0002\u0002\u0002äފ\u0003\u0002\u0002\u0002æގ\u0003\u0002\u0002\u0002èސ\u0003\u0002\u0002\u0002êޭ\u0003\u0002\u0002\u0002ìޯ\u0003\u0002\u0002\u0002îޱ\u0003\u0002\u0002\u0002ð\u07bf\u0003\u0002\u0002\u0002ò߃\u0003\u0002\u0002\u0002ôߊ\u0003\u0002\u0002\u0002öߑ\u0003\u0002\u0002\u0002øߘ\u0003\u0002\u0002\u0002úߛ\u0003\u0002\u0002\u0002üߧ\u0003\u0002\u0002\u0002þߪ\u0003\u0002\u0002\u0002Ā߰\u0003\u0002\u0002\u0002Ă߳\u0003\u0002\u0002\u0002Ąࠑ\u0003\u0002\u0002\u0002Ć࠙\u0003\u0002\u0002\u0002Ĉࠨ\u0003\u0002\u0002\u0002Ċࡀ\u0003\u0002\u0002\u0002Čࡂ\u0003\u0002\u0002\u0002Ďࡌ\u0003\u0002\u0002\u0002Đࡐ\u0003\u0002\u0002\u0002Ē࡙\u0003\u0002\u0002\u0002Ĕ\u0862\u0003\u0002\u0002\u0002Ė\u086d\u0003\u0002\u0002\u0002Ę\u087b\u0003\u0002\u0002\u0002Ě\u0889\u0003\u0002\u0002\u0002Ĝ\u088b\u0003\u0002\u0002\u0002Ğࢣ\u0003\u0002\u0002\u0002Ġ\u08b0\u0003\u0002\u0002\u0002Ģ\u08b2\u0003\u0002\u0002\u0002Ĥ\u08bf\u0003\u0002\u0002\u0002Ħ\u08ca\u0003\u0002\u0002\u0002Ĩ\u08ce\u0003\u0002\u0002\u0002Ī\u08d2\u0003\u0002\u0002\u0002Ĭ\u08db\u0003\u0002\u0002\u0002Įࣦ\u0003\u0002\u0002\u0002İࣨ\u0003\u0002\u0002\u0002Ĳ࣬\u0003\u0002\u0002\u0002Ĵࣹ\u0003\u0002\u0002\u0002Ķऄ\u0003\u0002\u0002\u0002ĸआ\u0003\u0002\u0002\u0002ĺड\u0003\u0002\u0002\u0002ļण\u0003\u0002\u0002\u0002ľऴ\u0003\u0002\u0002\u0002ŀश\u0003\u0002\u0002\u0002łह\u0003\u0002\u0002\u0002ńृ\u0003\u0002\u0002\u0002ņॆ\u0003\u0002\u0002\u0002ňॗ\u0003\u0002\u0002\u0002Ŋ०\u0003\u0002\u0002\u0002Ō२\u0003\u0002\u0002\u0002Ŏॲ\u0003\u0002\u0002\u0002Őॿ\u0003\u0002\u0002\u0002Œই\u0003\u0002\u0002\u0002Ŕঊ\u0003\u0002\u0002\u0002Ŗছ\u0003\u0002\u0002\u0002Řর\u0003\u0002\u0002\u0002Ś\u09c6\u0003\u0002\u0002\u0002Ŝৈ\u0003\u0002\u0002\u0002Ş\u09d6\u0003\u0002\u0002\u0002Š\u09e5\u0003\u0002\u0002\u0002Ţ৳\u0003\u0002\u0002\u0002Ť\u0a04\u0003\u0002\u0002\u0002Ŧਆ\u0003\u0002\u0002\u0002Ũਙ\u0003\u0002\u0002\u0002Ūਫ\u0003\u0002\u0002\u0002Ŭਯ\u0003\u0002\u0002\u0002Ů\u0a3d\u0003\u0002\u0002\u0002Űੌ\u0003\u0002\u0002\u0002Ų੩\u0003\u0002\u0002\u0002Ŵ੫\u0003\u0002\u0002\u0002Ŷ੯\u0003\u0002\u0002\u0002Ÿੱ\u0003\u0002\u0002\u0002ź\u0a84\u0003\u0002\u0002\u0002żઈ\u0003\u0002\u0002\u0002žઊ\u0003\u0002\u0002\u0002ƀછ\u0003\u0002\u0002\u0002Ƃફ\u0003\u0002\u0002\u0002Ƅେ\u0003\u0002\u0002\u0002Ɔ\u0b49\u0003\u0002\u0002\u0002ƈୋ\u0003\u0002\u0002\u0002Ɗ\u0b55\u0003\u0002\u0002\u0002ƌధ\u0003\u0002\u0002\u0002Ǝ\u0c29\u0003\u0002\u0002\u0002Ɛర\u0003\u0002\u0002\u0002ƒస\u0003\u0002\u0002\u0002Ɣౄ\u0003\u0002\u0002\u0002Ɩై\u0003\u0002\u0002\u0002Ƙొ\u0003\u0002\u0002\u0002ƚ\u0c5d\u0003\u0002\u0002\u0002Ɯ\u0c64\u0003\u0002\u0002\u0002ƞ౩\u0003\u0002\u0002\u0002Ơ౬\u0003\u0002\u0002\u0002Ƣ౽\u0003\u0002\u0002\u0002Ƥ౿\u0003\u0002\u0002\u0002Ʀಂ\u0003\u0002\u0002\u0002ƨಇ\u0003\u0002\u0002\u0002ƪಋ\u0003\u0002\u0002\u0002Ƭಎ\u0003\u0002\u0002\u0002Ʈಓ\u0003\u0002\u0002\u0002ưಗ\u0003\u0002\u0002\u0002Ʋಙ\u0003\u0002\u0002\u0002ƴಛ\u0003\u0002\u0002\u0002ƶƷ\u0005\u0004\u0003\u0002Ʒ\u0003\u0003\u0002\u0002\u0002Ƹƻ\u0005\u0006\u0004\u0002ƹƻ\u0005\u000e\b\u0002ƺƸ\u0003\u0002\u0002\u0002ƺƹ\u0003\u0002\u0002\u0002ƻƽ\u0003\u0002\u0002\u0002Ƽƾ\u0007z\u0002\u0002ƽƼ\u0003\u0002\u0002\u0002ƽƾ\u0003\u0002\u0002\u0002ƾǀ\u0003\u0002\u0002\u0002ƿƺ\u0003\u0002\u0002\u0002ǀǁ\u0003\u0002\u0002\u0002ǁƿ\u0003\u0002\u0002\u0002ǁǂ\u0003\u0002\u0002\u0002ǂ\u0005\u0003\u0002\u0002\u0002ǃǅ\u00050\u0019\u0002Ǆǃ\u0003\u0002\u0002\u0002Ǆǅ\u0003\u0002\u0002\u0002ǅǆ\u0003\u0002\u0002\u0002ǆǇ\u0007\u0017\u0002\u0002Ǉǉ\u0005\u0004\u0003\u0002ǈǊ\u0005\u0012\n\u0002ǉǈ\u0003\u0002\u0002\u0002ǉǊ\u0003\u0002\u0002\u0002Ǌǋ\u0003\u0002\u0002\u0002ǋǌ\u0005\n\u0006\u0002ǌ\u0007\u0003\u0002\u0002\u0002Ǎǎ\u0007\u0017\u0002\u0002ǎǐ\u0005\u0004\u0003\u0002ǏǑ\u0005\u0012\n\u0002ǐǏ\u0003\u0002\u0002\u0002ǐǑ\u0003\u0002\u0002\u0002Ǒǒ\u0003\u0002\u0002\u0002ǒǓ\u0005\n\u0006\u0002ǓǙ\u0003\u0002\u0002\u0002ǔǖ\u0005\u000e\b\u0002ǕǗ\u0007Ţ\u0002\u0002ǖǕ\u0003\u0002\u0002\u0002ǖǗ\u0003\u0002\u0002\u0002ǗǙ\u0003\u0002\u0002\u0002ǘǍ\u0003\u0002\u0002\u0002ǘǔ\u0003\u0002\u0002\u0002Ǚ\t\u0003\u0002\u0002\u0002ǚǛ\u0006\u0006\u0002\u0002Ǜǜ\u0007`\u0002\u0002ǜ\u000b\u0003\u0002\u0002\u0002ǝǧ\u0005\u0006\u0004\u0002ǞǠ\u0005\u000e\b\u0002ǟǞ\u0003\u0002\u0002\u0002Ǡǡ\u0003\u0002\u0002\u0002ǡǟ\u0003\u0002\u0002\u0002ǡǢ\u0003\u0002\u0002\u0002ǢǤ\u0003\u0002\u0002\u0002ǣǥ\u0007z\u0002\u0002Ǥǣ\u0003\u0002\u0002\u0002Ǥǥ\u0003\u0002\u0002\u0002ǥǧ\u0003\u0002\u0002\u0002Ǧǝ\u0003\u0002\u0002\u0002Ǧǟ\u0003\u0002\u0002\u0002ǧ\r\u0003\u0002\u0002\u0002ǨȤ\u0005\u001a\u000e\u0002ǩȤ\u0005$\u0013\u0002ǪȤ\u0005j6\u0002ǫȤ\u0005&\u0014\u0002ǬȤ\u0005(\u0015\u0002ǭȤ\u0005*\u0016\u0002ǮȤ\u0005,\u0017\u0002ǯȤ\u0005Êf\u0002ǰȤ\u0005Ìg\u0002ǱȤ\u0005Ði\u0002ǲȤ\u0005Òj\u0002ǳȤ\u0005Ôk\u0002ǴȤ\u0005àq\u0002ǵȤ\u0005z>\u0002ǶȤ\u0005~@\u0002ǷȤ\u0005âr\u0002ǸȤ\u0005F$\u0002ǹȤ\u0005\u0082B\u0002ǺȤ\u0005\u0088E\u0002ǻȤ\u0005\u008eH\u0002ǼȤ\u0005D#\u0002ǽȤ\u0005.\u0018\u0002ǾȤ\u0005Ŝ¯\u0002ǿȤ\u0005Ş°\u0002ȀȤ\u0005\u0098M\u0002ȁȤ\u0005\u009aN\u0002ȂȤ\u0005\u009cO\u0002ȃȤ\u0005´[\u0002ȄȤ\u0005Èe\u0002ȅȤ\u0005Ć\u0084\u0002ȆȤ\u0005Ĉ\u0085\u0002ȇȤ\u0005\u009eP\u0002ȈȤ\u0005¨U\u0002ȉȤ\u0005ªV\u0002ȊȤ\u0005²Z\u0002ȋȤ\u0005¶\\\u0002ȌȤ\u0005¾`\u0002ȍȤ\u0005Âb\u0002ȎȤ\u0005Äc\u0002ȏȤ\u0005Ŕ«\u0002ȐȤ\u0005Æd\u0002ȑȤ\u0005êv\u0002ȒȤ\u0005ìw\u0002ȓȤ\u0005îx\u0002ȔȤ\u0005ðy\u0002ȕȤ\u0005òz\u0002ȖȤ\u0005Ď\u0088\u0002ȗȤ\u0005ü\u007f\u0002ȘȤ\u0005Ō§\u0002șȤ\u0005Ā\u0081\u0002ȚȤ\u0005þ\u0080\u0002țȤ\u0005Ă\u0082\u0002ȜȤ\u0005Ą\u0083\u0002ȝȤ\u0005Ċ\u0086\u0002ȞȤ\u0005ƘÍ\u0002ȟȤ\u0005ƜÏ\u0002ȠȤ\u0005\u0016\f\u0002ȡȤ\u0005\u0018\r\u0002ȢȤ\u0005\u0010\t\u0002ȣǨ\u0003\u0002\u0002\u0002ȣǩ\u0003\u0002\u0002\u0002ȣǪ\u0003\u0002\u0002\u0002ȣǫ\u0003\u0002\u0002\u0002ȣǬ\u0003\u0002\u0002\u0002ȣǭ\u0003\u0002\u0002\u0002ȣǮ\u0003\u0002\u0002\u0002ȣǯ\u0003\u0002\u0002\u0002ȣǰ\u0003\u0002\u0002\u0002ȣǱ\u0003\u0002\u0002\u0002ȣǲ\u0003\u0002\u0002\u0002ȣǳ\u0003\u0002\u0002\u0002ȣǴ\u0003\u0002\u0002\u0002ȣǵ\u0003\u0002\u0002\u0002ȣǶ\u0003\u0002\u0002\u0002ȣǷ\u0003\u0002\u0002\u0002ȣǸ\u0003\u0002\u0002\u0002ȣǹ\u0003\u0002\u0002\u0002ȣǺ\u0003\u0002\u0002\u0002ȣǻ\u0003\u0002\u0002\u0002ȣǼ\u0003\u0002\u0002\u0002ȣǽ\u0003\u0002\u0002\u0002ȣǾ\u0003\u0002\u0002\u0002ȣǿ\u0003\u0002\u0002\u0002ȣȀ\u0003\u0002\u0002\u0002ȣȁ\u0003\u0002\u0002\u0002ȣȂ\u0003\u0002\u0002\u0002ȣȃ\u0003\u0002\u0002\u0002ȣȄ\u0003\u0002\u0002\u0002ȣȅ\u0003\u0002\u0002\u0002ȣȆ\u0003\u0002\u0002\u0002ȣȇ\u0003\u0002\u0002\u0002ȣȈ\u0003\u0002\u0002\u0002ȣȉ\u0003\u0002\u0002\u0002ȣȊ\u0003\u0002\u0002\u0002ȣȋ\u0003\u0002\u0002\u0002ȣȌ\u0003\u0002\u0002\u0002ȣȍ\u0003\u0002\u0002\u0002ȣȎ\u0003\u0002\u0002\u0002ȣȏ\u0003\u0002\u0002\u0002ȣȐ\u0003\u0002\u0002\u0002ȣȑ\u0003\u0002\u0002\u0002ȣȒ\u0003\u0002\u0002\u0002ȣȓ\u0003\u0002\u0002\u0002ȣȔ\u0003\u0002\u0002\u0002ȣȕ\u0003\u0002\u0002\u0002ȣȖ\u0003\u0002\u0002\u0002ȣȗ\u0003\u0002\u0002\u0002ȣȘ\u0003\u0002\u0002\u0002ȣș\u0003\u0002\u0002\u0002ȣȚ\u0003\u0002\u0002\u0002ȣț\u0003\u0002\u0002\u0002ȣȜ\u0003\u0002\u0002\u0002ȣȝ\u0003\u0002\u0002\u0002ȣȞ\u0003\u0002\u0002\u0002ȣȟ\u0003\u0002\u0002\u0002ȣȠ\u0003\u0002\u0002\u0002ȣȡ\u0003\u0002\u0002\u0002ȣȢ\u0003\u0002\u0002\u0002Ȥ\u000f\u0003\u0002\u0002\u0002ȥȦ\t\u0002\u0002\u0002Ȧ\u0011\u0003\u0002\u0002\u0002ȧȩ\u0007f\u0002\u0002ȨȪ\u0005\u0014\u000b\u0002ȩȨ\u0003\u0002\u0002\u0002Ȫȫ\u0003\u0002\u0002\u0002ȫȩ\u0003\u0002\u0002\u0002ȫȬ\u0003\u0002\u0002\u0002Ȭ\u0013\u0003\u0002\u0002\u0002ȭȮ\u0007ĭ\u0002\u0002Ȯȯ\u0007Ť\u0002\u0002ȯȰ\u0007Ė\u0002\u0002Ȱȱ\u0005\u0004\u0003\u0002ȱȲ\n\u0003\u0002\u0002Ȳ\u0015\u0003\u0002\u0002\u0002ȳȴ\u0007Á\u0002\u0002ȴ\u0017\u0003\u0002\u0002\u0002ȵȶ\u0006\r\u0003\u0002ȶȷ\u0005Ű¹\u0002ȷ\u0019\u0003\u0002\u0002\u0002ȸȹ\u0007ú\u0002\u0002ȹɆ\u0005ô{\u0002Ⱥȼ\u0007ú\u0002\u0002ȻȺ\u0003\u0002\u0002\u0002Ȼȼ\u0003\u0002\u0002\u0002ȼȽ\u0003\u0002\u0002\u0002Ƚɂ\u0005\u001c\u000f\u0002Ⱦȿ\u0007ŏ\u0002\u0002ȿɁ\u0005\u001c\u000f\u0002ɀȾ\u0003\u0002\u0002\u0002ɁɄ\u0003\u0002\u0002\u0002ɂɀ\u0003\u0002\u0002\u0002ɂɃ\u0003\u0002\u0002\u0002ɃɆ\u0003\u0002\u0002\u0002Ʉɂ\u0003\u0002\u0002\u0002Ʌȸ\u0003\u0002\u0002\u0002ɅȻ\u0003\u0002\u0002\u0002Ɇ\u001b\u0003\u0002\u0002\u0002ɇɋ\u0005\u001e\u0010\u0002Ɉɋ\u0005 \u0011\u0002ɉɋ\u0005\"\u0012\u0002Ɋɇ\u0003\u0002\u0002\u0002ɊɈ\u0003\u0002\u0002\u0002Ɋɉ\u0003\u0002\u0002\u0002ɋ\u001d\u0003\u0002\u0002\u0002ɌɎ\u0005ƨÕ\u0002ɍɏ\u0007Ŏ\u0002\u0002Ɏɍ\u0003\u0002\u0002\u0002Ɏɏ\u0003\u0002\u0002\u0002ɏɐ\u0003\u0002\u0002\u0002ɐɑ\u0007œ\u0002\u0002ɑɒ\u0005Ű¹\u0002ɒɝ\u0003\u0002\u0002\u0002ɓɔ\u0007ŝ\u0002\u0002ɔɕ\u0005ƨÕ\u0002ɕɗ\u0007Š\u0002\u0002ɖɘ\u0007Ŏ\u0002\u0002ɗɖ\u0003\u0002\u0002\u0002ɗɘ\u0003\u0002\u0002\u0002ɘə\u0003\u0002\u0002\u0002əɚ\u0007œ\u0002\u0002ɚɛ\u0005Ű¹\u0002ɛɝ\u0003\u0002\u0002\u0002ɜɌ\u0003\u0002\u0002\u0002ɜɓ\u0003\u0002\u0002\u0002ɝ\u001f\u0003\u0002\u0002\u0002ɞɟ\u0007ŝ\u0002\u0002ɟɤ\u0005ƨÕ\u0002ɠɡ\u0007ŏ\u0002\u0002ɡɣ\u0005ƨÕ\u0002ɢɠ\u0003\u0002\u0002\u0002ɣɦ\u0003\u0002\u0002\u0002ɤɢ\u0003\u0002\u0002\u0002ɤɥ\u0003\u0002\u0002\u0002ɥɧ\u0003\u0002\u0002\u0002ɦɤ\u0003\u0002\u0002\u0002ɧɩ\u0007Š\u0002\u0002ɨɪ\u0007Ŏ\u0002\u0002ɩɨ\u0003\u0002\u0002\u0002ɩɪ\u0003\u0002\u0002\u0002ɪɫ\u0003\u0002\u0002\u0002ɫɬ\u0007œ\u0002\u0002ɬɭ\u0007ŝ\u0002\u0002ɭɲ\u0005Ű¹\u0002ɮɯ\u0007ŏ\u0002\u0002ɯɱ\u0005Ű¹\u0002ɰɮ\u0003\u0002\u0002\u0002ɱɴ\u0003\u0002\u0002\u0002ɲɰ\u0003\u0002\u0002\u0002ɲɳ\u0003\u0002\u0002\u0002ɳɵ\u0003\u0002\u0002\u0002ɴɲ\u0003\u0002\u0002\u0002ɵɶ\u0007Š\u0002\u0002ɶ!\u0003\u0002\u0002\u0002ɷʄ\u0005ƨÕ\u0002ɸɹ\u0007ŝ\u0002\u0002ɹɾ\u0005ƨÕ\u0002ɺɻ\u0007ŏ\u0002\u0002ɻɽ\u0005ƨÕ\u0002ɼɺ\u0003\u0002\u0002\u0002ɽʀ\u0003\u0002\u0002\u0002ɾɼ\u0003\u0002\u0002\u0002ɾɿ\u0003\u0002\u0002\u0002ɿʁ\u0003\u0002\u0002\u0002ʀɾ\u0003\u0002\u0002\u0002ʁʂ\u0007Š\u0002\u0002ʂʄ\u0003\u0002\u0002\u0002ʃɷ\u0003\u0002\u0002\u0002ʃɸ\u0003\u0002\u0002\u0002ʄʆ\u0003\u0002\u0002\u0002ʅʇ\u0007Ŏ\u0002\u0002ʆʅ\u0003\u0002\u0002\u0002ʆʇ\u0003\u0002\u0002\u0002ʇʈ\u0003\u0002\u0002\u0002ʈʉ\u0007œ\u0002\u0002ʉʊ\u0007ŝ\u0002\u0002ʊʋ\u0005Ď\u0088\u0002ʋʌ\u0007Š\u0002\u0002ʌ#\u0003\u0002\u0002\u0002ʍʎ\u0007\u000b\u0002\u0002ʎʏ\u0005ƨÕ\u0002ʏʐ\u0007@\u0002\u0002ʐʔ\u0007p\u0002\u0002ʑʒ\u0007ä\u0002\u0002ʒʕ\u0007ú\u0002\u0002ʓʕ\u0007Ú\u0002\u0002ʔʑ\u0003\u0002\u0002\u0002ʔʓ\u0003\u0002\u0002\u0002ʕʖ\u0003\u0002\u0002\u0002ʖʗ\u0005ƨÕ\u0002ʗ%\u0003\u0002\u0002\u0002ʘʛ\u0007\u0012\u0002\u0002ʙʚ\u0007ä\u0002\u0002ʚʜ\u0007ú\u0002\u0002ʛʙ\u0003\u0002\u0002\u0002ʛʜ\u0003\u0002\u0002\u0002ʜʝ\u0003\u0002\u0002\u0002ʝʞ\t\u0004\u0002\u0002ʞʟ\u0007ŝ\u0002\u0002ʟʤ\u0005ƨÕ\u0002ʠʡ\u0007ŏ\u0002\u0002ʡʣ\u0005ƨÕ\u0002ʢʠ\u0003\u0002\u0002\u0002ʣʦ\u0003\u0002\u0002\u0002ʤʢ\u0003\u0002\u0002\u0002ʤʥ\u0003\u0002\u0002\u0002ʥʧ\u0003\u0002\u0002\u0002ʦʤ\u0003\u0002\u0002\u0002ʧʨ\u0007Š\u0002\u0002ʨʩ\u0007İ\u0002\u0002ʩʪ\u0007Ú\u0002\u0002ʪʫ\u0005ƨÕ\u0002ʫ'\u0003\u0002\u0002\u0002ʬʭ\u0007\u0017\u0002\u0002ʭʮ\u0007Ĝ\u0002\u0002ʮ)\u0003\u0002\u0002\u0002ʯʰ\u0007\u001f\u0002\u0002ʰ+\u0003\u0002\u0002\u0002ʱʲ\u0007\"\u0002\u0002ʲʹ\u0005ƨÕ\u0002ʳʵ\u0007ŝ\u0002\u0002ʴʶ\u0005ƐÉ\u0002ʵʴ\u0003\u0002\u0002\u0002ʵʶ\u0003\u0002\u0002\u0002ʶʷ\u0003\u0002\u0002\u0002ʷʺ\u0007Š\u0002\u0002ʸʺ\u0005ƐÉ\u0002ʹʳ\u0003\u0002\u0002\u0002ʹʸ\u0003\u0002\u0002\u0002ʹʺ\u0003\u0002\u0002\u0002ʺ-\u0003\u0002\u0002\u0002ʻʼ\u0007H\u0002\u0002ʼˁ\u00054\u001b\u0002ʽʾ\u0007ŏ\u0002\u0002ʾˀ\u00054\u001b\u0002ʿʽ\u0003\u0002\u0002\u0002ˀ˃\u0003\u0002\u0002\u0002ˁʿ\u0003\u0002\u0002\u0002ˁ˂\u0003\u0002\u0002\u0002˂/\u0003\u0002\u0002\u0002˃ˁ\u0003\u0002\u0002\u0002˄˅\u0007H\u0002\u0002˅ˆ\u00054\u001b\u0002ˆˌ\u0007Ţ\u0002\u0002ˇˈ\u00054\u001b\u0002ˈˉ\u0007Ţ\u0002\u0002ˉˋ\u0003\u0002\u0002\u0002ˊˇ\u0003\u0002\u0002\u0002ˋˎ\u0003\u0002\u0002\u0002ˌˊ\u0003\u0002\u0002\u0002ˌˍ\u0003\u0002\u0002\u0002ˍ1\u0003\u0002\u0002\u0002ˎˌ\u0003\u0002\u0002\u0002ˏː\u00054\u001b\u0002ː˖\u0007Ţ\u0002\u0002ˑ˒\u00054\u001b\u0002˒˓\u0007Ţ\u0002\u0002˓˕\u0003\u0002\u0002\u0002˔ˑ\u0003\u0002\u0002\u0002˕˘\u0003\u0002\u0002\u0002˖˔\u0003\u0002\u0002\u0002˖˗\u0003\u0002\u0002\u0002˗3\u0003\u0002\u0002\u0002˘˖\u0003\u0002\u0002\u0002˙˟\u0005:\u001e\u0002˚˟\u00056\u001c\u0002˛˟\u00058\u001d\u0002˜˟\u0005@!\u0002˝˟\u0005B\"\u0002˞˙\u0003\u0002\u0002\u0002˞˚\u0003\u0002\u0002\u0002˞˛\u0003\u0002\u0002\u0002˞˜\u0003\u0002\u0002\u0002˞˝\u0003\u0002\u0002\u0002˟5\u0003\u0002\u0002\u0002ˠ˥\u0005ƨÕ\u0002ˡˢ\u0007ŏ\u0002\u0002ˢˤ\u0005ƨÕ\u0002ˣˡ\u0003\u0002\u0002\u0002ˤ˧\u0003\u0002\u0002\u0002˥ˣ\u0003\u0002\u0002\u0002˥˦\u0003\u0002\u0002\u0002˦˩\u0003\u0002\u0002\u0002˧˥\u0003\u0002\u0002\u0002˨˪\u0007\u0010\u0002\u0002˩˨\u0003\u0002\u0002\u0002˩˪\u0003\u0002\u0002\u0002˪˫\u0003\u0002\u0002\u0002˫˭\u0005r:\u0002ˬˮ\u0005t;\u0002˭ˬ\u0003\u0002\u0002\u0002˭ˮ\u0003\u0002\u0002\u0002ˮ˲\u0003\u0002\u0002\u0002˯˱\u0005v<\u0002˰˯\u0003\u0002\u0002\u0002˱˴\u0003\u0002\u0002\u0002˲˰\u0003\u0002\u0002\u0002˲˳\u0003\u0002\u0002\u0002˳˶\u0003\u0002\u0002\u0002˴˲\u0003\u0002\u0002\u0002˵˷\u0005x=\u0002˶˵\u0003\u0002\u0002\u0002˶˷\u0003\u0002\u0002\u0002˷̄\u0003\u0002\u0002\u0002˸˹\u0005ƨÕ\u0002˹˻\u00071\u0002\u0002˺˼\u0007\u0010\u0002\u0002˻˺\u0003\u0002\u0002\u0002˻˼\u0003\u0002\u0002\u0002˼˽\u0003\u0002\u0002\u0002˽˿\u0005r:\u0002˾̀\u0005t;\u0002˿˾\u0003\u0002\u0002\u0002˿̀\u0003\u0002\u0002\u0002̀́\u0003\u0002\u0002\u0002́̂\u0005x=\u0002̂̄\u0003\u0002\u0002\u0002̃ˠ\u0003\u0002\u0002\u0002̃˸\u0003\u0002\u0002\u0002̄7\u0003\u0002\u0002\u0002̅̆\u0005ƨÕ\u0002̆̇\u00074\u0002\u0002̇9\u0003\u0002\u0002\u0002̈̉\u0007@\u0002\u0002̉̎\u0005ƨÕ\u0002̊̋\u0005ƨÕ\u0002̋̌\u0007@\u0002\u0002̌̎\u0003\u0002\u0002\u0002̍̈\u0003\u0002\u0002\u0002̍̊\u0003\u0002\u0002\u0002̎̑\u0003\u0002\u0002\u0002̏̒\u0005<\u001f\u0002̐̒\u0005> \u0002̑̏\u0003\u0002\u0002\u0002̑̐\u0003\u0002\u0002\u0002̑̒\u0003\u0002\u0002\u0002̒̓\u0003\u0002\u0002\u0002̖̓\t\u0005\u0002\u0002̗̔\u0005Ď\u0088\u0002̗̕\u0005Ű¹\u0002̖̔\u0003\u0002\u0002\u0002̖̕\u0003\u0002\u0002\u0002̗;\u0003\u0002\u0002\u0002̘̙\u0007İ\u0002\u0002̛̙\u0007æ\u0002\u0002̜̚\u0007Ç\u0002\u0002̛̚\u0003\u0002\u0002\u0002̛̜\u0003\u0002\u0002\u0002̜̟\u0003\u0002\u0002\u0002̝̞\u0007Ě\u0002\u0002̞̠\t\u0006\u0002\u0002̟̝\u0003\u0002\u0002\u0002̟̠\u0003\u0002\u0002\u0002̠=\u0003\u0002\u0002\u0002̡̢\u0007ı\u0002\u0002̢̣\u0007æ\u0002\u0002̣?\u0003\u0002\u0002\u0002̤̥\t\u0007\u0002\u0002̥̦\u0007}\u0002\u0002̦̬\u0007p\u0002\u0002̧̭\u0007Ć\u0002\u0002̨̭\u0007ĉ\u0002\u0002̩̪\u0007¿\u0002\u0002̪̭\u0007s\u0002\u0002̫̭\u0005ƨÕ\u0002̧̬\u0003\u0002\u0002\u0002̨̬\u0003\u0002\u0002\u0002̬̩\u0003\u0002\u0002\u0002̬̫\u0003\u0002\u0002\u0002̭̮\u0003\u0002\u0002\u0002̮̯\u0005\b\u0005\u0002̯A\u0003\u0002\u0002\u0002̰̲\u0007y\u0002\u0002̱̰\u0003\u0002\u0002\u0002̱̲\u0003\u0002\u0002\u0002̲̳\u0003\u0002\u0002\u0002̴̳\u0007ē\u0002\u0002̴̵\u0007đ\u0002\u0002̵ͅ\u0005ƨÕ\u0002̶̸\u0007\u0010\u0002\u0002̷̶\u0003\u0002\u0002\u0002̷̸\u0003\u0002\u0002\u0002̸̹\u0003\u0002\u0002\u0002̹̺\u0007ŝ\u0002\u0002̺̻\u0005Ď\u0088\u0002̻̼\u0007Š\u0002\u0002̼͆\u0003\u0002\u0002\u0002̽̿\u0007\u0010\u0002\u0002̾̽\u0003\u0002\u0002\u0002̾̿\u0003\u0002\u0002\u0002̿̀\u0003\u0002\u0002\u0002̀͆\u0005Ď\u0088\u0002́͂\u0007ŝ\u0002\u0002͂̓\u0005H%\u0002̓̈́\u0007Š\u0002\u0002̈́͆\u0003\u0002\u0002\u0002̷ͅ\u0003\u0002\u0002\u0002̾ͅ\u0003\u0002\u0002\u0002́ͅ\u0003\u0002\u0002\u0002͈͆\u0003\u0002\u0002\u0002͇͉\u0005X-\u0002͈͇\u0003\u0002\u0002\u0002͈͉\u0003\u0002\u0002\u0002͉C\u0003\u0002\u0002\u0002͊͋\u0007:\u0002\u0002͋͏\u0007đ\u0002\u0002͍͌\u0007\u0084\u0002\u0002͍͎\u0007¿\u0002\u0002͎͐\u0007h\u0002\u0002͏͌\u0003\u0002\u0002\u0002͏͐\u0003\u0002\u0002\u0002͐͑\u0003\u0002\u0002\u0002͑͒\u0005ľ \u0002͓͒\u0007ŝ\u0002\u0002͓͔\u0005H%\u0002͔͖\u0007Š\u0002\u0002͕͗\u0005X-\u0002͖͕\u0003\u0002\u0002\u0002͖͗\u0003\u0002\u0002\u0002͗E\u0003\u0002\u0002\u0002͘͟\u0007:\u0002\u0002͙͚\u0007¤\u0002\u0002͚͠\u0007ē\u0002\u0002͛͝\t\b\u0002\u0002͛͜\u0003\u0002\u0002\u0002͜͝\u0003\u0002\u0002\u0002͝͞\u0003\u0002\u0002\u0002͞͠\u0007Ĭ\u0002\u0002͙͟\u0003\u0002\u0002\u0002͟͜\u0003\u0002\u0002\u0002͠͡\u0003\u0002\u0002\u0002͢͡\u0007đ\u0002\u0002ͤ͢\u0005ƨÕ\u0002ͣͥ\u0005T+\u0002ͤͣ\u0003\u0002\u0002\u0002ͤͥ\u0003\u0002\u0002\u0002ͥͦ\u0003\u0002\u0002\u0002ͦͧ\u0007ŝ\u0002\u0002ͧͨ\u0005H%\u0002ͨͪ\u0007Š\u0002\u0002ͩͫ\u0005X-\u0002ͪͩ\u0003\u0002\u0002\u0002ͪͫ\u0003\u0002\u0002\u0002ͫG\u0003\u0002\u0002\u0002ͬͱ\u0005J&\u0002ͭͮ\u0007ŏ\u0002\u0002ͮͰ\u0005J&\u0002ͯͭ\u0003\u0002\u0002\u0002Ͱͳ\u0003\u0002\u0002\u0002ͱͯ\u0003\u0002\u0002\u0002ͱͲ\u0003\u0002\u0002\u0002ͲI\u0003\u0002\u0002\u0002ͳͱ\u0003\u0002\u0002\u0002ʹ͵\u0005L'\u0002͵ͷ\u0005r:\u0002Ͷ\u0378\u0005t;\u0002ͷͶ\u0003\u0002\u0002\u0002ͷ\u0378\u0003\u0002\u0002\u0002\u0378ͼ\u0003\u0002\u0002\u0002\u0379ͻ\u0005v<\u0002ͺ\u0379\u0003\u0002\u0002\u0002ͻ;\u0003\u0002\u0002\u0002ͼͺ\u0003\u0002\u0002\u0002ͼͽ\u0003\u0002\u0002\u0002ͽ\u0382\u0003\u0002\u0002\u0002;ͼ\u0003\u0002\u0002\u0002\u037f\u0381\u0005N(\u0002\u0380\u037f\u0003\u0002\u0002\u0002\u0381΄\u0003\u0002\u0002\u0002\u0382\u0380\u0003\u0002\u0002\u0002\u0382\u0383\u0003\u0002\u0002\u0002\u0383\u038b\u0003\u0002\u0002\u0002΄\u0382\u0003\u0002\u0002\u0002΅Ά\u00075\u0002\u0002ΆΈ\u0005ƨÕ\u0002·΅\u0003\u0002\u0002\u0002·Έ\u0003\u0002\u0002\u0002ΈΉ\u0003\u0002\u0002\u0002Ή\u038b\u0005P)\u0002Ίʹ\u0003\u0002\u0002\u0002Ί·\u0003\u0002\u0002\u0002\u038bK\u0003\u0002\u0002\u0002Ό\u038d\u0005ƨÕ\u0002\u038dM\u0003\u0002\u0002\u0002Ύί\u0005x=\u0002ΏΑ\u0007¿\u0002\u0002ΐΏ\u0003\u0002\u0002\u0002ΐΑ\u0003\u0002\u0002\u0002ΑΒ\u0003\u0002\u0002\u0002Βί\u0007Á\u0002\u0002ΓΔ\u0007×\u0002\u0002Δί\u0007\u009c\u0002\u0002Εί\u0007ġ\u0002\u0002ΖΗ\u0007ß\u0002\u0002ΗΘ\u0005ľ \u0002ΘΙ\u0007ŝ\u0002\u0002ΙΚ\u0005ƨÕ\u0002ΚΞ\u0007Š\u0002\u0002ΛΝ\u0005R*\u0002ΜΛ\u0003\u0002\u0002\u0002ΝΠ\u0003\u0002\u0002\u0002ΞΜ\u0003\u0002\u0002\u0002ΞΟ\u0003\u0002\u0002\u0002Οί\u0003\u0002\u0002\u0002ΠΞ\u0003\u0002\u0002\u0002Ρ\u03a2\u0007\u0083\u0002\u0002\u03a2Σ\u0007ŝ\u0002\u0002ΣΨ\u0007ŧ\u0002\u0002ΤΥ\u0007ŏ\u0002\u0002ΥΧ\u0007ŧ\u0002\u0002ΦΤ\u0003\u0002\u0002\u0002ΧΪ\u0003\u0002\u0002\u0002ΨΦ\u0003\u0002\u0002\u0002ΨΩ\u0003\u0002\u0002\u0002ΩΫ\u0003\u0002\u0002\u0002ΪΨ\u0003\u0002\u0002\u0002Ϋί\u0007Š\u0002\u0002άί\u0007\u0014\u0002\u0002έί\u0007_\u0002\u0002ήΎ\u0003\u0002\u0002\u0002ήΐ\u0003\u0002\u0002\u0002ήΓ\u0003\u0002\u0002\u0002ήΕ\u0003\u0002\u0002\u0002ήΖ\u0003\u0002\u0002\u0002ήΡ\u0003\u0002\u0002\u0002ήά\u0003\u0002\u0002\u0002ήέ\u0003\u0002\u0002\u0002ίO\u0003\u0002\u0002\u0002ΰα\u0007×\u0002\u0002αγ\u0007\u009c\u0002\u0002βδ\u0007-\u0002\u0002γβ\u0003\u0002\u0002\u0002γδ\u0003\u0002\u0002\u0002δε\u0003\u0002\u0002\u0002εζ\u0007ŝ\u0002\u0002ζθ\u0005ƨÕ\u0002ηι\t\t\u0002\u0002θη\u0003\u0002\u0002\u0002θι\u0003\u0002\u0002\u0002ιρ\u0003\u0002\u0002\u0002κλ\u0007ŏ\u0002\u0002λν\u0005ƨÕ\u0002μξ\t\t\u0002\u0002νμ\u0003\u0002\u0002\u0002νξ\u0003\u0002\u0002\u0002ξπ\u0003\u0002\u0002\u0002οκ\u0003\u0002\u0002\u0002πσ\u0003\u0002\u0002\u0002ρο\u0003\u0002\u0002\u0002ρς\u0003\u0002\u0002\u0002ςτ\u0003\u0002\u0002\u0002σρ\u0003\u0002\u0002\u0002τφ\u0007Š\u0002\u0002υχ\u0007_\u0002\u0002φυ\u0003\u0002\u0002\u0002φχ\u0003\u0002\u0002\u0002χω\u0003\u0002\u0002\u0002ψϊ\u0005æt\u0002ωψ\u0003\u0002\u0002\u0002ωϊ\u0003\u0002\u0002\u0002ϊϪ\u0003\u0002\u0002\u0002ϋό\u0007q\u0002\u0002όύ\u0007\u009c\u0002\u0002ύώ\u0007ŝ\u0002\u0002ώϓ\u0005ƨÕ\u0002Ϗϐ\u0007ŏ\u0002\u0002ϐϒ\u0005ƨÕ\u0002ϑϏ\u0003\u0002\u0002\u0002ϒϕ\u0003\u0002\u0002\u0002ϓϑ\u0003\u0002\u0002\u0002ϓϔ\u0003\u0002\u0002\u0002ϔϖ\u0003\u0002\u0002\u0002ϕϓ\u0003\u0002\u0002\u0002ϖϗ\u0007Š\u0002\u0002ϗϘ\u0007ß\u0002\u0002Ϙϙ\u0005ľ \u0002ϙϚ\u0007ŝ\u0002\u0002Ϛϟ\u0005ƨÕ\u0002ϛϜ\u0007ŏ\u0002\u0002ϜϞ\u0005ƨÕ\u0002ϝϛ\u0003\u0002\u0002\u0002Ϟϡ\u0003\u0002\u0002\u0002ϟϝ\u0003\u0002\u0002\u0002ϟϠ\u0003\u0002\u0002\u0002ϠϢ\u0003\u0002\u0002\u0002ϡϟ\u0003\u0002\u0002\u0002ϢϦ\u0007Š\u0002\u0002ϣϥ\u0005R*\u0002Ϥϣ\u0003\u0002\u0002\u0002ϥϨ\u0003\u0002\u0002\u0002ϦϤ\u0003\u0002\u0002\u0002Ϧϧ\u0003\u0002\u0002\u0002ϧϪ\u0003\u0002\u0002\u0002ϨϦ\u0003\u0002\u0002\u0002ϩΰ\u0003\u0002\u0002\u0002ϩϋ\u0003\u0002\u0002\u0002ϪQ\u0003\u0002\u0002\u0002ϫϬ\u0007Æ\u0002\u0002Ϭϵ\t\n\u0002\u0002ϭϮ\u0007º\u0002\u0002Ϯ϶\u0007\b\u0002\u0002ϯ϶\u0007ã\u0002\u0002ϰϱ\u0007ú\u0002\u0002ϱ϶\u0007Á\u0002\u0002ϲϳ\u0007ú\u0002\u0002ϳ϶\u0007I\u0002\u0002ϴ϶\u0007$\u0002\u0002ϵϭ\u0003\u0002\u0002\u0002ϵϯ\u0003\u0002\u0002\u0002ϵϰ\u0003\u0002\u0002\u0002ϵϲ\u0003\u0002\u0002\u0002ϵϴ\u0003\u0002\u0002\u0002϶S\u0003\u0002\u0002\u0002Ϸϸ\u0007ŏ\u0002\u0002ϸϺ\u0005V,\u0002ϹϷ\u0003\u0002\u0002\u0002Ϻϻ\u0003\u0002\u0002\u0002ϻϹ\u0003\u0002\u0002\u0002ϻϼ\u0003\u0002\u0002\u0002ϼU\u0003\u0002\u0002\u0002ϽϿ\u0007º\u0002\u0002ϾϽ\u0003\u0002\u0002\u0002ϾϿ\u0003\u0002\u0002\u0002ϿЀ\u0003\u0002\u0002\u0002ЀЁ\u0007©\u0002\u0002ЁW\u0003\u0002\u0002\u0002ЂЄ\u0005Z.\u0002ЃЂ\u0003\u0002\u0002\u0002ЄЅ\u0003\u0002\u0002\u0002ЅЃ\u0003\u0002\u0002\u0002ЅІ\u0003\u0002\u0002\u0002ІY\u0003\u0002\u0002\u0002ЇЈ\u0007Æ\u0002\u0002ЈЉ\u00072\u0002\u0002ЉЊ\t\u000b\u0002\u0002ЊБ\u0007î\u0002\u0002ЋБ\u0005\\/\u0002ЌБ\u0005^0\u0002ЍБ\u0005`1\u0002ЎБ\u0005f4\u0002ЏБ\u0005h5\u0002АЇ\u0003\u0002\u0002\u0002АЋ\u0003\u0002\u0002\u0002АЌ\u0003\u0002\u0002\u0002АЍ\u0003\u0002\u0002\u0002АЎ\u0003\u0002\u0002\u0002АЏ\u0003\u0002\u0002\u0002Б[\u0003\u0002\u0002\u0002ВГ\u0007÷\u0002\u0002ГД\u0007;\u0002\u0002ДХ\t\f\u0002\u0002ЕЖ\t\r\u0002\u0002ЖХ\u0007ŧ\u0002\u0002ЗХ\u0007¼\u0002\u0002ИХ\t\u000e\u0002\u0002ЙК\u0007ċ\u0002\u0002КН\u0007ŝ\u0002\u0002ЛО\u0005ƨÕ\u0002МО\u0007ŧ\u0002\u0002НЛ\u0003\u0002\u0002\u0002НМ\u0003\u0002\u0002\u0002ОП\u0003\u0002\u0002\u0002ПН\u0003\u0002\u0002\u0002ПР\u0003\u0002\u0002\u0002РС\u0003\u0002\u0002\u0002СХ\u0007Š\u0002\u0002ТУ\u0007Ē\u0002\u0002УХ\u0005ƨÕ\u0002ФВ\u0003\u0002\u0002\u0002ФЕ\u0003\u0002\u0002\u0002ФЗ\u0003\u0002\u0002\u0002ФИ\u0003\u0002\u0002\u0002ФЙ\u0003\u0002\u0002\u0002ФТ\u0003\u0002\u0002\u0002Х]\u0003\u0002\u0002\u0002ЦЧ\u0007\u0087\u0002\u0002Чо\u0005ƨÕ\u0002ШЩ\u0007İ\u0002\u0002Що\u0007á\u0002\u0002ЪЫ\u0007W\u0002\u0002ЫЬ\u0007 \u0002\u0002ЬЭ\u0007~\u0002\u0002ЭЮ\u0007ŝ\u0002\u0002Юг\u0005ƨÕ\u0002Яа\u0007ŏ\u0002\u0002ав\u0005ƨÕ\u0002бЯ\u0003\u0002\u0002\u0002ве\u0003\u0002\u0002\u0002гб\u0003\u0002\u0002\u0002гд\u0003\u0002\u0002\u0002дж\u0003\u0002\u0002\u0002ег\u0003\u0002\u0002\u0002жз\u0007Š\u0002\u0002зо\u0003\u0002\u0002\u0002ио\u0007ª\u0002\u0002йк\u0007¿\u0002\u0002ко\u0007ª\u0002\u0002лм\u0007M\u0002\u0002мо\u0007Ç\u0002\u0002нЦ\u0003\u0002\u0002\u0002нШ\u0003\u0002\u0002\u0002нЪ\u0003\u0002\u0002\u0002ни\u0003\u0002\u0002\u0002нй\u0003\u0002\u0002\u0002нл\u0003\u0002\u0002\u0002о_\u0003\u0002\u0002\u0002пр\u0005b2\u0002рa\u0003\u0002\u0002\u0002ст\u0007í\u0002\u0002ту\u0007r\u0002\u0002уч\u0007O\u0002\u0002фц\u0005d3\u0002хф\u0003\u0002\u0002\u0002цщ\u0003\u0002\u0002\u0002чх\u0003\u0002\u0002\u0002чш\u0003\u0002\u0002\u0002шc\u0003\u0002\u0002\u0002щч\u0003\u0002\u0002\u0002ъы\u0007l\u0002\u0002ыь\u0007Ĕ\u0002\u0002ьэ\u0007 \u0002\u0002эё\u0005Ű¹\u0002юя\u0007b\u0002\u0002яѐ\u0007 \u0002\u0002ѐђ\u0005Ű¹\u0002ёю\u0003\u0002\u0002\u0002ёђ\u0003\u0002\u0002\u0002ђѦ\u0003\u0002\u0002\u0002ѓє\u0007/\u0002\u0002єѕ\u0007\u0099\u0002\u0002ѕі\u0007Ĕ\u0002\u0002ії\u0007 \u0002\u0002їѦ\u0005Ű¹\u0002јљ\u0007\u00ad\u0002\u0002љњ\u0007\u009d\u0002\u0002њћ\u0007Ĕ\u0002\u0002ћќ\u0007 \u0002\u0002ќѦ\u0005Ű¹\u0002ѝў\u0007£\u0002\u0002ўџ\u0007Ĕ\u0002\u0002џѠ\u0007 \u0002\u0002ѠѦ\u0005Ű¹\u0002ѡѢ\u0007Á\u0002\u0002Ѣѣ\u0007K\u0002\u0002ѣѤ\u0007\u0010\u0002\u0002ѤѦ\u0005Ű¹\u0002ѥъ\u0003\u0002\u0002\u0002ѥѓ\u0003\u0002\u0002\u0002ѥј\u0003\u0002\u0002\u0002ѥѝ\u0003\u0002\u0002\u0002ѥѡ\u0003\u0002\u0002\u0002Ѧe\u0003\u0002\u0002\u0002ѧѨ\u0007Æ\u0002\u0002ѨѬ\u0005ƨÕ\u0002ѩѪ\u0007ĕ\u0002\u0002ѪѬ\u0005ƨÕ\u0002ѫѧ\u0003\u0002\u0002\u0002ѫѩ\u0003\u0002\u0002\u0002Ѭg\u0003\u0002\u0002\u0002ѭѯ\u0007\u0014\u0002\u0002ѮѰ\u0007œ\u0002\u0002ѯѮ\u0003\u0002\u0002\u0002ѯѰ\u0003\u0002\u0002\u0002Ѱѱ\u0003\u0002\u0002\u0002ѱ҉\u0005Ű¹\u0002ѲѴ\u00070\u0002\u0002ѳѵ\u0007œ\u0002\u0002Ѵѳ\u0003\u0002\u0002\u0002Ѵѵ\u0003\u0002\u0002\u0002ѵѶ\u0003\u0002\u0002\u0002Ѷ҉\u0005Ű¹\u0002ѷѹ\u0007I\u0002\u0002Ѹѷ\u0003\u0002\u0002\u0002Ѹѹ\u0003\u0002\u0002\u0002ѹѽ\u0003\u0002\u0002\u0002Ѻѻ\u0007)\u0002\u0002ѻѾ\u0007ú\u0002\u0002ѼѾ\u0007*\u0002\u0002ѽѺ\u0003\u0002\u0002\u0002ѽѼ\u0003\u0002\u0002\u0002ѾҀ\u0003\u0002\u0002\u0002ѿҁ\u0007œ\u0002\u0002Ҁѿ\u0003\u0002\u0002\u0002Ҁҁ\u0003\u0002\u0002\u0002ҁ҂\u0003\u0002\u0002\u0002҂҉\u0005Ű¹\u0002҃҅\u0007a\u0002\u0002҄҆\u0007œ\u0002\u0002҅҄\u0003\u0002\u0002\u0002҅҆\u0003\u0002\u0002\u0002҆҇\u0003\u0002\u0002\u0002҇҉\u0005Ű¹\u0002҈ѭ\u0003\u0002\u0002\u0002҈Ѳ\u0003\u0002\u0002\u0002҈Ѹ\u0003\u0002\u0002\u0002҈҃\u0003\u0002\u0002\u0002҉i\u0003\u0002\u0002\u0002Ҋҋ\u0007\f\u0002\u0002ҋҌ\u0007đ\u0002\u0002Ҍҍ\u0005ľ \u0002ҍҎ\u0005l7\u0002Ҏk\u0003\u0002\u0002\u0002ҏҐ\u0005n8\u0002Ґm\u0003\u0002\u0002\u0002ґҔ\u0007\t\u0002\u0002Ғғ\u00075\u0002\u0002ғҕ\u0005ƨÕ\u0002ҔҒ\u0003\u0002\u0002\u0002Ҕҕ\u0003\u0002\u0002\u0002ҕҖ\u0003\u0002\u0002\u0002Җҗ\u0005p9\u0002җo\u0003\u0002\u0002\u0002Ҙҙ\u0007×\u0002\u0002ҙқ\u0007\u009c\u0002\u0002ҚҜ\u0007-\u0002\u0002қҚ\u0003\u0002\u0002\u0002қҜ\u0003\u0002\u0002\u0002Ҝҝ\u0003\u0002\u0002\u0002ҝҞ\u0007ŝ\u0002\u0002ҞҠ\u0005ƨÕ\u0002ҟҡ\t\t\u0002\u0002Ҡҟ\u0003\u0002\u0002\u0002Ҡҡ\u0003\u0002\u0002\u0002ҡҩ\u0003\u0002\u0002\u0002Ңң\u0007ŏ\u0002\u0002ңҥ\u0005ƨÕ\u0002ҤҦ\t\t\u0002\u0002ҥҤ\u0003\u0002\u0002\u0002ҥҦ\u0003\u0002\u0002\u0002ҦҨ\u0003\u0002\u0002\u0002ҧҢ\u0003\u0002\u0002\u0002Ҩҫ\u0003\u0002\u0002\u0002ҩҧ\u0003\u0002\u0002\u0002ҩҪ\u0003\u0002\u0002\u0002ҪҬ\u0003\u0002\u0002\u0002ҫҩ\u0003\u0002\u0002\u0002ҬҮ\u0007Š\u0002\u0002ҭү\u0007_\u0002\u0002Үҭ\u0003\u0002\u0002\u0002Үү\u0003\u0002\u0002\u0002үұ\u0003\u0002\u0002\u0002ҰҲ\u0005æt\u0002ұҰ\u0003\u0002\u0002\u0002ұҲ\u0003\u0002\u0002\u0002Ҳӗ\u0003\u0002\u0002\u0002ҳҴ\u0007q\u0002\u0002Ҵҵ\u0007\u009c\u0002\u0002ҵҶ\u0007ŝ\u0002\u0002Ҷһ\u0005ƨÕ\u0002ҷҸ\u0007ŏ\u0002\u0002ҸҺ\u0005ƨÕ\u0002ҹҷ\u0003\u0002\u0002\u0002Һҽ\u0003\u0002\u0002\u0002һҹ\u0003\u0002\u0002\u0002һҼ\u0003\u0002\u0002\u0002ҼҾ\u0003\u0002\u0002\u0002ҽһ\u0003\u0002\u0002\u0002Ҿҿ\u0007Š\u0002\u0002ҿӀ\u0007ß\u0002\u0002ӀӁ\u0005ľ \u0002Ӂӂ\u0007ŝ\u0002\u0002ӂӇ\u0005ƨÕ\u0002Ӄӄ\u0007ŏ\u0002\u0002ӄӆ\u0005ƨÕ\u0002ӅӃ\u0003\u0002\u0002\u0002ӆӉ\u0003\u0002\u0002\u0002ӇӅ\u0003\u0002\u0002\u0002Ӈӈ\u0003\u0002\u0002\u0002ӈӊ\u0003\u0002\u0002\u0002ӉӇ\u0003\u0002\u0002\u0002ӊӎ\u0007Š\u0002\u0002ӋӍ\u0005R*\u0002ӌӋ\u0003\u0002\u0002\u0002ӍӐ\u0003\u0002\u0002\u0002ӎӌ\u0003\u0002\u0002\u0002ӎӏ\u0003\u0002\u0002\u0002ӏӗ\u0003\u0002\u0002\u0002Ӑӎ\u0003\u0002\u0002\u0002ӑӒ\u0007I\u0002\u0002Ӓӓ\u0005Ű¹\u0002ӓӔ\u0007p\u0002\u0002Ӕӕ\u0005ƨÕ\u0002ӕӗ\u0003\u0002\u0002\u0002ӖҘ\u0003\u0002\u0002\u0002Ӗҳ\u0003\u0002\u0002\u0002Ӗӑ\u0003\u0002\u0002\u0002ӗq\u0003\u0002\u0002\u0002ӘԆ\u0007(\u0002\u0002әԆ\u0007\u0019\u0002\u0002ӚԆ\u0007\u001a\u0002\u0002ӛԆ\u0007\u001b\u0002\u0002ӜԆ\u0007\u001c\u0002\u0002ӝԆ\u0007\u001d\u0002\u0002ӞԆ\u0007B\u0002\u0002ӟԆ\u0007C\u0002\u0002ӠԆ\u0007F\u0002\u0002ӡԆ\u0007G\u0002\u0002ӢӤ\u0007Y\u0002\u0002ӣӥ\u0007Õ\u0002\u0002Ӥӣ\u0003\u0002\u0002\u0002Ӥӥ\u0003\u0002\u0002\u0002ӥԆ\u0003\u0002\u0002\u0002ӦԆ\u0007o\u0002\u0002ӧԆ\u0007\u008e\u0002\u0002ӨԆ\u0007\u008f\u0002\u0002өԆ\u0007\u0090\u0002\u0002ӪԆ\u0007\u0091\u0002\u0002ӫԆ\u0007\u0092\u0002\u0002ӬԆ\u0007·\u0002\u0002ӭԆ\u0007¹\u0002\u0002ӮԆ\u0007Ã\u0002\u0002ӯԆ\u0007Â\u0002\u0002ӰԆ\u0007Ô\u0002\u0002ӱԆ\u0007Þ\u0002\u0002Ӳӳ\u0007å\u0002\u0002ӳԆ\u0007ī\u0002\u0002ӴԆ\u0007ā\u0002\u0002ӵԆ\u0007Ā\u0002\u0002ӶԆ\u0007Ă\u0002\u0002ӷԆ\u0007Ą\u0002\u0002ӸԆ\u0007ă\u0002\u0002ӹԆ\u0007Č\u0002\u0002ӺԆ\u0007Đ\u0002\u0002ӻԆ\u0007ė\u0002\u0002ӼԆ\u0007Ę\u0002\u0002ӽԆ\u0007ĩ\u0002\u0002ӾԆ\u0007Ī\u0002\u0002ӿԆ\u0007Ĵ\u0002\u0002Ԁԃ\u0007Ť\u0002\u0002ԁԂ\u0007\u0005\u0002\u0002ԂԄ\t\u000f\u0002\u0002ԃԁ\u0003\u0002\u0002\u0002ԃԄ\u0003\u0002\u0002\u0002ԄԆ\u0003\u0002\u0002\u0002ԅӘ\u0003\u0002\u0002\u0002ԅә\u0003\u0002\u0002\u0002ԅӚ\u0003\u0002\u0002\u0002ԅӛ\u0003\u0002\u0002\u0002ԅӜ\u0003\u0002\u0002\u0002ԅӝ\u0003\u0002\u0002\u0002ԅӞ\u0003\u0002\u0002\u0002ԅӟ\u0003\u0002\u0002\u0002ԅӠ\u0003\u0002\u0002\u0002ԅӡ\u0003\u0002\u0002\u0002ԅӢ\u0003\u0002\u0002\u0002ԅӦ\u0003\u0002\u0002\u0002ԅӧ\u0003\u0002\u0002\u0002ԅӨ\u0003\u0002\u0002\u0002ԅө\u0003\u0002\u0002\u0002ԅӪ\u0003\u0002\u0002\u0002ԅӫ\u0003\u0002\u0002\u0002ԅӬ\u0003\u0002\u0002\u0002ԅӭ\u0003\u0002\u0002\u0002ԅӮ\u0003\u0002\u0002\u0002ԅӯ\u0003\u0002\u0002\u0002ԅӰ\u0003\u0002\u0002\u0002ԅӱ\u0003\u0002\u0002\u0002ԅӲ\u0003\u0002\u0002\u0002ԅӴ\u0003\u0002\u0002\u0002ԅӵ\u0003\u0002\u0002\u0002ԅӶ\u0003\u0002\u0002\u0002ԅӷ\u0003\u0002\u0002\u0002ԅӸ\u0003\u0002\u0002\u0002ԅӹ\u0003\u0002\u0002\u0002ԅӺ\u0003\u0002\u0002\u0002ԅӻ\u0003\u0002\u0002\u0002ԅӼ\u0003\u0002\u0002\u0002ԅӽ\u0003\u0002\u0002\u0002ԅӾ\u0003\u0002\u0002\u0002ԅӿ\u0003\u0002\u0002\u0002ԅԀ\u0003\u0002\u0002\u0002Ԇs\u0003\u0002\u0002\u0002ԇԈ\u0007ŝ\u0002\u0002ԈԊ\t\u0010\u0002\u0002ԉԋ\t\u0011\u0002\u0002Ԋԉ\u0003\u0002\u0002\u0002Ԋԋ\u0003\u0002\u0002\u0002ԋԎ\u0003\u0002\u0002\u0002Ԍԍ\u0007ŏ\u0002\u0002ԍԏ\u0007ŧ\u0002\u0002ԎԌ\u0003\u0002\u0002\u0002Ԏԏ\u0003\u0002\u0002\u0002ԏԐ\u0003\u0002\u0002\u0002Ԑԑ\u0007Š\u0002\u0002ԑu\u0003\u0002\u0002\u0002ԒԔ\u0007¿\u0002\u0002ԓԒ\u0003\u0002\u0002\u0002ԓԔ\u0003\u0002\u0002\u0002Ԕԕ\u0003\u0002\u0002\u0002ԕԞ\u0007Á\u0002\u0002Ԗԗ\u0007)\u0002\u0002ԗԘ\u0007ú\u0002\u0002ԘԞ\u0005ƨÕ\u0002ԙԛ\u0007¿\u0002\u0002Ԛԙ\u0003\u0002\u0002\u0002Ԛԛ\u0003\u0002\u0002\u0002ԛԜ\u0003\u0002\u0002\u0002ԜԞ\t\u0012\u0002\u0002ԝԓ\u0003\u0002\u0002\u0002ԝԖ\u0003\u0002\u0002\u0002ԝԚ\u0003\u0002\u0002\u0002Ԟw\u0003\u0002\u0002\u0002ԟԡ\u0007Ŏ\u0002\u0002Ԡԟ\u0003\u0002\u0002\u0002Ԡԡ\u0003\u0002\u0002\u0002ԡԢ\u0003\u0002\u0002\u0002Ԣԣ\u0007œ\u0002\u0002ԣԧ\u0005Ű¹\u0002Ԥԥ\u0007I\u0002\u0002ԥԧ\u0005Ű¹\u0002ԦԠ\u0003\u0002\u0002\u0002ԦԤ\u0003\u0002\u0002\u0002ԧy\u0003\u0002\u0002\u0002\u0528\u0529\u0007:\u0002\u0002\u0529\u052d\t\u0013\u0002\u0002\u052a\u052b\u0007\u0084\u0002\u0002\u052b\u052c\u0007¿\u0002\u0002\u052c\u052e\u0007h\u0002\u0002\u052d\u052a\u0003\u0002\u0002\u0002\u052d\u052e\u0003\u0002\u0002\u0002\u052e\u052f\u0003\u0002\u0002\u0002\u052fԳ\u0005Ű¹\u0002\u0530Բ\u0005|?\u0002Ա\u0530\u0003\u0002\u0002\u0002ԲԵ\u0003\u0002\u0002\u0002ԳԱ\u0003\u0002\u0002\u0002ԳԴ\u0003\u0002\u0002\u0002Դ{\u0003\u0002\u0002\u0002ԵԳ\u0003\u0002\u0002\u0002ԶԷ\u00070\u0002\u0002ԷԻ\u0005Ű¹\u0002ԸԹ\u0007¥\u0002\u0002ԹԻ\u0005Ű¹\u0002ԺԶ\u0003\u0002\u0002\u0002ԺԸ\u0003\u0002\u0002\u0002Ի}\u0003\u0002\u0002\u0002ԼՄ\u0007\f\u0002\u0002ԽՀ\u0007:\u0002\u0002ԾԿ\u0007É\u0002\u0002ԿՁ\u0007á\u0002\u0002ՀԾ\u0003\u0002\u0002\u0002ՀՁ\u0003\u0002\u0002\u0002ՁՄ\u0003\u0002\u0002\u0002ՂՄ\u0007á\u0002\u0002ՃԼ\u0003\u0002\u0002\u0002ՃԽ\u0003\u0002\u0002\u0002ՃՂ\u0003\u0002\u0002\u0002ՃՄ\u0003\u0002\u0002\u0002ՄՅ\u0003\u0002\u0002\u0002ՅՆ\u0007w\u0002\u0002ՆՈ\u0005ƨÕ\u0002ՇՉ\u0005\u0090I\u0002ՈՇ\u0003\u0002\u0002\u0002ՈՉ\u0003\u0002\u0002\u0002ՉՊ\u0003\u0002\u0002\u0002ՊՌ\u0005\u0080A\u0002ՋՍ\t\u0014\u0002\u0002ՌՋ\u0003\u0002\u0002\u0002ՌՍ\u0003\u0002\u0002\u0002ՍՏ\u0003\u0002\u0002\u0002ՎՐ\u00052\u001a\u0002ՏՎ\u0003\u0002\u0002\u0002ՏՐ\u0003\u0002\u0002\u0002ՐՑ\u0003\u0002\u0002\u0002ՑՒ\u0005\b\u0005\u0002Ւ\u007f\u0003\u0002\u0002\u0002ՓՔ\t\u0015\u0002\u0002ՔՖ\u0005r:\u0002Օ\u0557\u0005t;\u0002ՖՕ\u0003\u0002\u0002\u0002Ֆ\u0557\u0003\u0002\u0002\u0002\u0557\u0081\u0003\u0002\u0002\u0002\u0558\u0560\u0007\f\u0002\u0002ՙ՜\u0007:\u0002\u0002՚՛\u0007É\u0002\u0002՛՝\u0007á\u0002\u0002՜՚\u0003\u0002\u0002\u0002՜՝\u0003\u0002\u0002\u0002՝\u0560\u0003\u0002\u0002\u0002՞\u0560\u0007á\u0002\u0002՟\u0558\u0003\u0002\u0002\u0002՟ՙ\u0003\u0002\u0002\u0002՟՞\u0003\u0002\u0002\u0002՟\u0560\u0003\u0002\u0002\u0002\u0560ա\u0003\u0002\u0002\u0002աբ\u0007Ð\u0002\u0002բգ\u0005ƨÕ\u0002գդ\t\u0014\u0002\u0002դե\u0005\u0084C\u0002եթ\u0007`\u0002\u0002զէ\u0005ƨÕ\u0002էը\u0007Ţ\u0002\u0002ըժ\u0003\u0002\u0002\u0002թզ\u0003\u0002\u0002\u0002թժ\u0003\u0002\u0002\u0002ժ\u0083\u0003\u0002\u0002\u0002իլ\u0005\u0086D\u0002լղ\u0007Ţ\u0002\u0002խծ\u0005\u0086D\u0002ծկ\u0007Ţ\u0002\u0002կձ\u0003\u0002\u0002\u0002հխ\u0003\u0002\u0002\u0002ձմ\u0003\u0002\u0002\u0002ղհ\u0003\u0002\u0002\u0002ղճ\u0003\u0002\u0002\u0002ճ\u0085\u0003\u0002\u0002\u0002մղ\u0003\u0002\u0002\u0002յփ\u00054\u001b\u0002նշ\u0007w\u0002\u0002շչ\u0005ƨÕ\u0002ոպ\u0005\u0090I\u0002չո\u0003\u0002\u0002\u0002չպ\u0003\u0002\u0002\u0002պջ\u0003\u0002\u0002\u0002ջռ\u0005\u0080A\u0002ռփ\u0003\u0002\u0002\u0002սվ\t\u0016\u0002\u0002վր\u0005ƨÕ\u0002տց\u0005\u0090I\u0002րտ\u0003\u0002\u0002\u0002րց\u0003\u0002\u0002\u0002ցփ\u0003\u0002\u0002\u0002ւյ\u0003\u0002\u0002\u0002ւն\u0003\u0002\u0002\u0002ւս\u0003\u0002\u0002\u0002փ\u0087\u0003\u0002\u0002\u0002ք\u058c\u0007\f\u0002\u0002օ\u0588\u0007:\u0002\u0002ֆև\u0007É\u0002\u0002և։\u0007á\u0002\u0002\u0588ֆ\u0003\u0002\u0002\u0002\u0588։\u0003\u0002\u0002\u0002։\u058c\u0003\u0002\u0002\u0002֊\u058c\u0007á\u0002\u0002\u058bք\u0003\u0002\u0002\u0002\u058bօ\u0003\u0002\u0002\u0002\u058b֊\u0003\u0002\u0002\u0002\u058b\u058c\u0003\u0002\u0002\u0002\u058c\u058d\u0003\u0002\u0002\u0002\u058d\u058e\u0007Ð\u0002\u0002\u058e֏\u0007\u001e\u0002\u0002֏\u0590\u0005ƨÕ\u0002\u0590֑\t\u0014\u0002\u0002֑֒\u0005\u008aF\u0002֖֒\u0007`\u0002\u0002֓֔\u0005ƨÕ\u0002֔֕\u0007Ţ\u0002\u0002֕֗\u0003\u0002\u0002\u0002֖֓\u0003\u0002\u0002\u0002֖֗\u0003\u0002\u0002\u0002֗\u0089\u0003\u0002\u0002\u0002֘֙\u0005\u008cG\u0002֙֟\u0007Ţ\u0002\u0002֛֚\u0005\u008cG\u0002֛֜\u0007Ţ\u0002\u0002֜֞\u0003\u0002\u0002\u0002֚֝\u0003\u0002\u0002\u0002֞֡\u0003\u0002\u0002\u0002֟֝\u0003\u0002\u0002\u0002֟֠\u0003\u0002\u0002\u0002֠\u008b\u0003\u0002\u0002\u0002֡֟\u0003\u0002\u0002\u0002֢֦\u00054\u001b\u0002֣֦\u0005~@\u0002֤֦\u0005\u008eH\u0002֥֢\u0003\u0002\u0002\u0002֥֣\u0003\u0002\u0002\u0002֥֤\u0003\u0002\u0002\u0002֦\u008d\u0003\u0002\u0002\u0002֧֯\u0007\f\u0002\u0002֨֫\u0007:\u0002\u0002֪֩\u0007É\u0002\u0002֪֬\u0007á\u0002\u0002֫֩\u0003\u0002\u0002\u0002֫֬\u0003\u0002\u0002\u0002֬֯\u0003\u0002\u0002\u0002֭֯\u0007á\u0002\u0002֧֮\u0003\u0002\u0002\u0002֮֨\u0003\u0002\u0002\u0002֭֮\u0003\u0002\u0002\u0002֮֯\u0003\u0002\u0002\u0002ְ֯\u0003\u0002\u0002\u0002ְֱ\t\u0016\u0002\u0002ֱֳ\u0005ƨÕ\u0002ֲִ\u0005\u0090I\u0002ֲֳ\u0003\u0002\u0002\u0002ֳִ\u0003\u0002\u0002\u0002ִֶ\u0003\u0002\u0002\u0002ֵַ\u0005\u0094K\u0002ֵֶ\u0003\u0002\u0002\u0002ֶַ\u0003\u0002\u0002\u0002ַֹ\u0003\u0002\u0002\u0002ָֺ\t\u0014\u0002\u0002ָֹ\u0003\u0002\u0002\u0002ֹֺ\u0003\u0002\u0002\u0002ֺּ\u0003\u0002\u0002\u0002ֻֽ\u00052\u001a\u0002ֻּ\u0003\u0002\u0002\u0002ּֽ\u0003\u0002\u0002\u0002ֽֿ\u0003\u0002\u0002\u0002־׀\u0005Ċ\u0086\u0002ֿ־\u0003\u0002\u0002\u0002ֿ׀\u0003\u0002\u0002\u0002׀ׁ\u0003\u0002\u0002\u0002ׁׅ\u0005\f\u0007\u0002ׂ׃\u0005ƨÕ\u0002׃ׄ\u0007Ţ\u0002\u0002ׄ׆\u0003\u0002\u0002\u0002ׂׅ\u0003\u0002\u0002\u0002ׅ׆\u0003\u0002\u0002\u0002׆\u008f\u0003\u0002\u0002\u0002ׇ\u05c8\u0007ŝ\u0002\u0002\u05c8מ\u0007Š\u0002\u0002\u05c9\u05ca\u0007ŝ\u0002\u0002\u05ca\u05cf\u0005\u0092J\u0002\u05cb\u05cc\u0007ŏ\u0002\u0002\u05cc\u05ce\u0005\u0092J\u0002\u05cd\u05cb\u0003\u0002\u0002\u0002\u05ceב\u0003\u0002\u0002\u0002\u05cf\u05cd\u0003\u0002\u0002\u0002\u05cfא\u0003\u0002\u0002\u0002אג\u0003\u0002\u0002\u0002ב\u05cf\u0003\u0002\u0002\u0002גד\u0007Š\u0002\u0002דמ\u0003\u0002\u0002\u0002הו\u0006I\u0004\u0002וך\u0005\u0092J\u0002זח\u0007ŏ\u0002\u0002חי\u0005\u0092J\u0002טז\u0003\u0002\u0002\u0002יל\u0003\u0002\u0002\u0002ךט\u0003\u0002\u0002\u0002ךכ\u0003\u0002\u0002\u0002כמ\u0003\u0002\u0002\u0002לך\u0003\u0002\u0002\u0002םׇ\u0003\u0002\u0002\u0002ם\u05c9\u0003\u0002\u0002\u0002םה\u0003\u0002\u0002\u0002מ\u0091\u0003\u0002\u0002\u0002ןץ\u0007\u0087\u0002\u0002נץ\u0007Ë\u0002\u0002סץ\u0007\u008c\u0002\u0002עף\u0007\u0087\u0002\u0002ףץ\u0007Ë\u0002\u0002פן\u0003\u0002\u0002\u0002פנ\u0003\u0002\u0002\u0002פס\u0003\u0002\u0002\u0002פע\u0003\u0002\u0002\u0002פץ\u0003\u0002\u0002\u0002ץצ\u0003\u0002\u0002\u0002צק\u0005ƨÕ\u0002קש\u0005r:\u0002רת\u0005t;\u0002שר\u0003\u0002\u0002\u0002שת\u0003\u0002\u0002\u0002ת\u05ee\u0003\u0002\u0002\u0002\u05eb\u05ed\u0005v<\u0002\u05ec\u05eb\u0003\u0002\u0002\u0002\u05edװ\u0003\u0002\u0002\u0002\u05ee\u05ec\u0003\u0002\u0002\u0002\u05ee\u05ef\u0003\u0002\u0002\u0002\u05efײ\u0003\u0002\u0002\u0002װ\u05ee\u0003\u0002\u0002\u0002ױ׳\u0005x=\u0002ײױ\u0003\u0002\u0002\u0002ײ׳\u0003\u0002\u0002\u0002׳؊\u0003\u0002\u0002\u0002״\u05fa\u0005ƨÕ\u0002\u05f5\u05fb\u0007\u0087\u0002\u0002\u05f6\u05fb\u0007Ë\u0002\u0002\u05f7\u05fb\u0007\u008c\u0002\u0002\u05f8\u05f9\u0007\u0087\u0002\u0002\u05f9\u05fb\u0007Ë\u0002\u0002\u05fa\u05f5\u0003\u0002\u0002\u0002\u05fa\u05f6\u0003\u0002\u0002\u0002\u05fa\u05f7\u0003\u0002\u0002\u0002\u05fa\u05f8\u0003\u0002\u0002\u0002\u05fa\u05fb\u0003\u0002\u0002\u0002\u05fb\u05fc\u0003\u0002\u0002\u0002\u05fc\u05fe\u0005r:\u0002\u05fd\u05ff\u0005t;\u0002\u05fe\u05fd\u0003\u0002\u0002\u0002\u05fe\u05ff\u0003\u0002\u0002\u0002\u05ff\u0603\u0003\u0002\u0002\u0002\u0600\u0602\u0005v<\u0002\u0601\u0600\u0003\u0002\u0002\u0002\u0602\u0605\u0003\u0002\u0002\u0002\u0603\u0601\u0003\u0002\u0002\u0002\u0603\u0604\u0003\u0002\u0002\u0002\u0604؇\u0003\u0002\u0002\u0002\u0605\u0603\u0003\u0002\u0002\u0002؆؈\u0005x=\u0002؇؆\u0003\u0002\u0002\u0002؇؈\u0003\u0002\u0002\u0002؈؊\u0003\u0002\u0002\u0002؉פ\u0003\u0002\u0002\u0002؉״\u0003\u0002\u0002\u0002؊\u0093\u0003\u0002\u0002\u0002؋؍\u0005\u0096L\u0002،؋\u0003\u0002\u0002\u0002؍؎\u0003\u0002\u0002\u0002؎،\u0003\u0002\u0002\u0002؎؏\u0003\u0002\u0002\u0002؏\u0095\u0003\u0002\u0002\u0002ؐؑ\u0007\u009e\u0002\u0002ؑ\u061c\u0007ą\u0002\u0002ؒؓ\u0007ą\u0002\u0002ؓؔ\u0007ö\u0002\u0002ؔ\u061c\t\u0017\u0002\u0002ؕؗ\u0007[\u0002\u0002ؖؕ\u0003\u0002\u0002\u0002ؖؗ\u0003\u0002\u0002\u0002ؘؗ\u0003\u0002\u0002\u0002ؘؙ\u0007ä\u0002\u0002ؙؚ\u0007ý\u0002\u0002ؚ\u061c\u0007ŧ\u0002\u0002؛ؐ\u0003\u0002\u0002\u0002؛ؒ\u0003\u0002\u0002\u0002؛ؖ\u0003\u0002\u0002\u0002\u061c\u0097\u0003\u0002\u0002\u0002\u061d؞\u0007Z\u0002\u0002؞ء\u0007đ\u0002\u0002؟ؠ\u0007\u0084\u0002\u0002ؠآ\u0007h\u0002\u0002ء؟\u0003\u0002\u0002\u0002ءآ\u0003\u0002\u0002\u0002آأ\u0003\u0002\u0002\u0002أج\u0005ľ \u0002ؤإ\u0007Z\u0002\u0002إب\t\u0013\u0002\u0002ئا\u0007\u0084\u0002\u0002اة\u0007h\u0002\u0002بئ\u0003\u0002\u0002\u0002بة\u0003\u0002\u0002\u0002ةت\u0003\u0002\u0002\u0002تج\u0005Ű¹\u0002ث\u061d\u0003\u0002\u0002\u0002ثؤ\u0003\u0002\u0002\u0002ج\u0099\u0003\u0002\u0002\u0002حخ\u0007`\u0002\u0002خد\u0007Ĝ\u0002\u0002د\u009b\u0003\u0002\u0002\u0002ذز\t\u0018\u0002\u0002رس\u0007\u0086\u0002\u0002زر\u0003\u0002\u0002\u0002زس\u0003\u0002\u0002\u0002سش\u0003\u0002\u0002\u0002شغ\u0005Ű¹\u0002صض\u0007ŝ\u0002\u0002ضط\u0005ƐÉ\u0002طظ\u0007Š\u0002\u0002ظػ\u0003\u0002\u0002\u0002عػ\u0005ƐÉ\u0002غص\u0003\u0002\u0002\u0002غع\u0003\u0002\u0002\u0002غػ\u0003\u0002\u0002\u0002ػم\u0003\u0002\u0002\u0002ؼؽ\u0007\u0095\u0002\u0002ؽق\u0007Ť\u0002\u0002ؾؿ\u0007ŏ\u0002\u0002ؿف\u0007Ť\u0002\u0002ـؾ\u0003\u0002\u0002\u0002فل\u0003\u0002\u0002\u0002قـ\u0003\u0002\u0002\u0002قك\u0003\u0002\u0002\u0002كن\u0003\u0002\u0002\u0002لق\u0003\u0002\u0002\u0002مؼ\u0003\u0002\u0002\u0002من\u0003\u0002\u0002\u0002نو\u0003\u0002\u0002\u0002هى\u0005Č\u0087\u0002وه\u0003\u0002\u0002\u0002وى\u0003\u0002\u0002\u0002ى\u009d\u0003\u0002\u0002\u0002يٍ\u0005 Q\u0002ًٍ\u0005¢R\u0002ٌي\u0003\u0002\u0002\u0002ًٌ\u0003\u0002\u0002\u0002ٍ\u009f\u0003\u0002\u0002\u0002َُ\u0007\u0084\u0002\u0002ُِ\u0005Š±\u0002ِّ\u0007Ė\u0002\u0002ّٕ\u0005\u0004\u0003\u0002ْٔ\u0005¤S\u0002ْٓ\u0003\u0002\u0002\u0002ٔٗ\u0003\u0002\u0002\u0002ٕٓ\u0003\u0002\u0002\u0002ٕٖ\u0003\u0002\u0002\u0002ٖٙ\u0003\u0002\u0002\u0002ٕٗ\u0003\u0002\u0002\u0002٘ٚ\u0005¦T\u0002ٙ٘\u0003\u0002\u0002\u0002ٙٚ\u0003\u0002\u0002\u0002ٚٛ\u0003\u0002\u0002\u0002ٜٛ\u0007`\u0002\u0002ٜٝ\u0007\u0084\u0002\u0002ٝ¡\u0003\u0002\u0002\u0002ٟٞ\u0007\u0084\u0002\u0002ٟ٠\u0005Š±\u0002٠٣\u0005\b\u0005\u0002١٢\u0007\\\u0002\u0002٢٤\u0005\b\u0005\u0002٣١\u0003\u0002\u0002\u0002٣٤\u0003\u0002\u0002\u0002٤£\u0003\u0002\u0002\u0002٥٦\t\u0019\u0002\u0002٦٧\u0005Š±\u0002٧٨\u0007Ė\u0002\u0002٨٩\u0005\u0004\u0003\u0002٩¥\u0003\u0002\u0002\u0002٪٫\u0007\\\u0002\u0002٫٬\u0005\u0004\u0003\u0002٬§\u0003\u0002\u0002\u0002٭ٰ\u0007\u0088\u0002\u0002ٮٱ\u0005ƢÒ\u0002ٯٱ\u0005Ű¹\u0002ٰٮ\u0003\u0002\u0002\u0002ٰٯ\u0003\u0002\u0002\u0002ٱ©\u0003\u0002\u0002\u0002ٲٹ\u0007\u008d\u0002\u0002ٳٴ\u0007Î\u0002\u0002ٴٺ\u0007đ\u0002\u0002ٵٷ\u0007\u0095\u0002\u0002ٶٸ\u0007đ\u0002\u0002ٷٶ\u0003\u0002\u0002\u0002ٷٸ\u0003\u0002\u0002\u0002ٸٺ\u0003\u0002\u0002\u0002ٹٳ\u0003\u0002\u0002\u0002ٹٵ\u0003\u0002\u0002\u0002ٺٻ\u0003\u0002\u0002\u0002ٻٽ\u0005ľ \u0002ټپ\u0005¬W\u0002ٽټ\u0003\u0002\u0002\u0002ٽپ\u0003\u0002\u0002\u0002پځ\u0003\u0002\u0002\u0002ٿڂ\u0005Ď\u0088\u0002ڀڂ\u0005®X\u0002ځٿ\u0003\u0002\u0002\u0002ځڀ\u0003\u0002\u0002\u0002ڂ«\u0003\u0002\u0002\u0002ڃڄ\u0007ŝ\u0002\u0002ڄډ\u0005ƨÕ\u0002څچ\u0007ŏ\u0002\u0002چڈ\u0005ƨÕ\u0002ڇڅ\u0003\u0002\u0002\u0002ڈڋ\u0003\u0002\u0002\u0002ډڇ\u0003\u0002\u0002\u0002ډڊ\u0003\u0002\u0002\u0002ڊڌ\u0003\u0002\u0002\u0002ڋډ\u0003\u0002\u0002\u0002ڌڍ\u0007Š\u0002\u0002ڍ\u00ad\u0003\u0002\u0002\u0002ڎڏ\u0007ħ\u0002\u0002ڏڔ\u0005°Y\u0002ڐڑ\u0007ŏ\u0002\u0002ڑړ\u0005°Y\u0002ڒڐ\u0003\u0002\u0002\u0002ړږ\u0003\u0002\u0002\u0002ڔڒ\u0003\u0002\u0002\u0002ڔڕ\u0003\u0002\u0002\u0002ڕ¯\u0003\u0002\u0002\u0002ږڔ\u0003\u0002\u0002\u0002ڗژ\u0007ŝ\u0002\u0002ژڝ\u0005Ű¹\u0002ڙښ\u0007ŏ\u0002\u0002ښڜ\u0005Ű¹\u0002ڛڙ\u0003\u0002\u0002\u0002ڜڟ\u0003\u0002\u0002\u0002ڝڛ\u0003\u0002\u0002\u0002ڝڞ\u0003\u0002\u0002\u0002ڞڠ\u0003\u0002\u0002\u0002ڟڝ\u0003\u0002\u0002\u0002ڠڡ\u0007Š\u0002\u0002ڡ±\u0003\u0002\u0002\u0002ڢڣ\u0007\u008d\u0002\u0002ڣڥ\u0007Î\u0002\u0002ڤڦ\u0007¤\u0002\u0002ڥڤ\u0003\u0002\u0002\u0002ڥڦ\u0003\u0002\u0002\u0002ڦڧ\u0003\u0002\u0002\u0002ڧڨ\u0007U\u0002\u0002ڨک\u0005ƖÌ\u0002کڪ\u0005ƔË\u0002ڪ³\u0003\u0002\u0002\u0002ګڭ\u0007i\u0002\u0002ڬڮ\u0007Ť\u0002\u0002ڭڬ\u0003\u0002\u0002\u0002ڭڮ\u0003\u0002\u0002\u0002ڮڱ\u0003\u0002\u0002\u0002گڰ\u0007ĭ\u0002\u0002ڰڲ\u0005Š±\u0002ڱگ\u0003\u0002\u0002\u0002ڱڲ\u0003\u0002\u0002\u0002ڲµ\u0003\u0002\u0002\u0002ڳڴ\u0007x\u0002\u0002ڴڵ\u0007S\u0002\u0002ڵڶ\u0005¸]\u0002ڶ·\u0003\u0002\u0002\u0002ڷں\u0005º^\u0002ڸں\u0005¼_\u0002ڹڷ\u0003\u0002\u0002\u0002ڹڸ\u0003\u0002\u0002\u0002ں¹\u0003\u0002\u0002\u0002ڻڼ\u0007f\u0002\u0002ڼڽ\u0007ŧ\u0002\u0002ڽھ\u0005ƨÕ\u0002ھڿ\u0007œ\u0002\u0002ڿۀ\u0007²\u0002\u0002ۀ»\u0003\u0002\u0002\u0002ہۂ\u0005ƨÕ\u0002ۂۃ\u0007œ\u0002\u0002ۃۄ\u0007ð\u0002\u0002ۄ½\u0003\u0002\u0002\u0002ۅۆ\u0007{\u0002\u0002ۆۋ\u0005Àa\u0002ۇۈ\u0007ŏ\u0002\u0002ۈۊ\u0005Àa\u0002ۉۇ\u0003\u0002\u0002\u0002ۊۍ\u0003\u0002\u0002\u0002ۋۉ\u0003\u0002\u0002\u0002ۋی\u0003\u0002\u0002\u0002یێ\u0003\u0002\u0002\u0002ۍۋ\u0003\u0002\u0002\u0002ێۏ\u0007Ě\u0002\u0002ۏې\u0007ë\u0002\u0002ېۑ\u0005ƨÕ\u0002ۑ¿\u0003\u0002\u0002\u0002ےۓ\u0007e\u0002\u0002ۓ۔\u0007Æ\u0002\u0002۔ە\u0007Ú\u0002\u0002ەۖ\u0005ƨÕ\u0002ۖÁ\u0003\u0002\u0002\u0002ۗۙ\u0007\u009f\u0002\u0002ۘۚ\u0007Ť\u0002\u0002ۙۘ\u0003\u0002\u0002\u0002ۙۚ\u0003\u0002\u0002\u0002ۚÃ\u0003\u0002\u0002\u0002ۛۜ\u0007\u00ad\u0002\u0002ۜ\u06dd\u0007Ä\u0002\u0002\u06dd۠\u0005Ű¹\u0002۞۟\u0007Ě\u0002\u0002۟ۡ\u0005Ű¹\u0002۠۞\u0003\u0002\u0002\u0002۠ۡ\u0003\u0002\u0002\u0002ۡۤ\u0003\u0002\u0002\u0002ۣۢ\u0007\u0013\u0002\u0002ۣۥ\u0005Ű¹\u0002ۤۢ\u0003\u0002\u0002\u0002ۤۥ\u0003\u0002\u0002\u0002ۥÅ\u0003\u0002\u0002\u0002ۦۧ\u0007È\u0002\u0002ۭۧ\u0007Ť\u0002\u0002ۨ۫\u0007p\u0002\u0002۩۬\u0005Ď\u0088\u0002۪۬\u0005Ű¹\u0002۫۩\u0003\u0002\u0002\u0002۪۫\u0003\u0002\u0002\u0002۬ۮ\u0003\u0002\u0002\u0002ۭۨ\u0003\u0002\u0002\u0002ۭۮ\u0003\u0002\u0002\u0002ۮÇ\u0003\u0002\u0002\u0002ۯ۱\u0007k\u0002\u0002۰۲\u0007t\u0002\u0002۱۰\u0003\u0002\u0002\u0002۱۲\u0003\u0002\u0002\u0002۲۳\u0003\u0002\u0002\u0002۳۴\u0007Ť\u0002\u0002۴۵\u0007\u0095\u0002\u0002۵ۺ\u0007Ť\u0002\u0002۶۷\u0007ŏ\u0002\u0002۷۹\u0007Ť\u0002\u0002۸۶\u0003\u0002\u0002\u0002۹ۼ\u0003\u0002\u0002\u0002ۺ۸\u0003\u0002\u0002\u0002ۺۻ\u0003\u0002\u0002\u0002ۻÉ\u0003\u0002\u0002\u0002ۼۺ\u0003\u0002\u0002\u0002۽۾\u0007,\u0002\u0002۾ۿ\u0007Ť\u0002\u0002ۿË\u0003\u0002\u0002\u0002܀܁\u0007.\u0002\u0002܁܂\t\u001a\u0002\u0002܂܃\u0005Îh\u0002܃܄\u0007ŏ\u0002\u0002܄܅\u0005Îh\u0002܅Í\u0003\u0002\u0002\u0002܆܈\u0005ľ \u0002܇܉\u0005ŀ¡\u0002܈܇\u0003\u0002\u0002\u0002܈܉\u0003\u0002\u0002\u0002܉\u070f\u0003\u0002\u0002\u0002܊܋\u0007ŝ\u0002\u0002܋܌\u0005Ď\u0088\u0002܌܍\u0007Š\u0002\u0002܍\u070f\u0003\u0002\u0002\u0002\u070e܆\u0003\u0002\u0002\u0002\u070e܊\u0003\u0002\u0002\u0002\u070fܒ\u0003\u0002\u0002\u0002ܐܑ\u0007\u0013\u0002\u0002ܑܓ\u0005ƨÕ\u0002ܒܐ\u0003\u0002\u0002\u0002ܒܓ\u0003\u0002\u0002\u0002ܓÏ\u0003\u0002\u0002\u0002ܔܕ\u00077\u0002\u0002ܕܖ\u0007t\u0002\u0002ܖܗ\u0007u\u0002\u0002ܗܛ\u0005Ű¹\u0002ܘܚ\u0005Þp\u0002ܙܘ\u0003\u0002\u0002\u0002ܚܝ\u0003\u0002\u0002\u0002ܛܙ\u0003\u0002\u0002\u0002ܛܜ\u0003\u0002\u0002\u0002ܜÑ\u0003\u0002\u0002\u0002ܝܛ\u0003\u0002\u0002\u0002ܞܟ\u00077\u0002\u0002ܟܠ\u0007t\u0002\u0002ܠܡ\u0007¤\u0002\u0002ܡܦ\u0005Öl\u0002ܢܣ\u0007ŏ\u0002\u0002ܣܥ\u0005Öl\u0002ܤܢ\u0003\u0002\u0002\u0002ܥܨ\u0003\u0002\u0002\u0002ܦܤ\u0003\u0002\u0002\u0002ܦܧ\u0003\u0002\u0002\u0002ܧܩ\u0003\u0002\u0002\u0002ܨܦ\u0003\u0002\u0002\u0002ܩܪ\u0007Ě\u0002\u0002ܪܮ\u0005Øm\u0002ܫܭ\u0005Üo\u0002ܬܫ\u0003\u0002\u0002\u0002ܭܰ\u0003\u0002\u0002\u0002ܮܬ\u0003\u0002\u0002\u0002ܮܯ\u0003\u0002\u0002\u0002ܯÓ\u0003\u0002\u0002\u0002ܰܮ\u0003\u0002\u0002\u0002ܱܷ\u00077\u0002\u0002ܸܲ\u0005ľ \u0002ܴܳ\u0007ŝ\u0002\u0002ܴܵ\u0005Ď\u0088\u0002ܵܶ\u0007Š\u0002\u0002ܸܶ\u0003\u0002\u0002\u0002ܷܲ\u0003\u0002\u0002\u0002ܷܳ\u0003\u0002\u0002\u0002ܸܹ\u0003\u0002\u0002\u0002ܹܻ\u0007Ě\u0002\u0002ܼܺ\u0007\u0080\u0002\u0002ܻܺ\u0003\u0002\u0002\u0002ܻܼ\u0003\u0002\u0002\u0002ܼܽ\u0003\u0002\u0002\u0002ܽ݁\u0005Øm\u0002ܾ݀\u0005Ún\u0002ܾܿ\u0003\u0002\u0002\u0002݀݃\u0003\u0002\u0002\u0002݁ܿ\u0003\u0002\u0002\u0002݂݁\u0003\u0002\u0002\u0002݂Õ\u0003\u0002\u0002\u0002݃݁\u0003\u0002\u0002\u0002݄݈\u0005ƨÕ\u0002݈݅\u0005Ű¹\u0002݆݈\u0007Ŭ\u0002\u0002݄݇\u0003\u0002\u0002\u0002݇݅\u0003\u0002\u0002\u0002݆݇\u0003\u0002\u0002\u0002݈×\u0003\u0002\u0002\u0002݉\u074c\u0005ƢÒ\u0002݊\u074c\u0005Ű¹\u0002\u074b݉\u0003\u0002\u0002\u0002\u074b݊\u0003\u0002\u0002\u0002\u074cÙ\u0003\u0002\u0002\u0002ݍݎ\u0007\u0013\u0002\u0002ݎݖ\u0005ƨÕ\u0002ݏݐ\u0007\u0016\u0002\u0002ݐݖ\u0005Ű¹\u0002ݑݒ\u0007P\u0002\u0002ݒݖ\u0005Ű¹\u0002ݓݔ\u0007ć\u0002\u0002ݔݖ\u0005ƨÕ\u0002ݕݍ\u0003\u0002\u0002\u0002ݕݏ\u0003\u0002\u0002\u0002ݕݑ\u0003\u0002\u0002\u0002ݕݓ\u0003\u0002\u0002\u0002ݖÛ\u0003\u0002\u0002\u0002ݗݘ\t\u001b\u0002\u0002ݘÝ\u0003\u0002\u0002\u0002ݙݚ\u0007Ō\u0002\u0002ݚݲ\u0005Ű¹\u0002ݛݜ\u0007ó\u0002\u0002ݜݲ\u0005Ű¹\u0002ݝݠ\u0007T\u0002\u0002ݞݡ\u0005ƢÒ\u0002ݟݡ\u0005Ű¹\u0002ݠݞ\u0003\u0002\u0002\u0002ݠݟ\u0003\u0002\u0002\u0002ݡݲ\u0003\u0002\u0002\u0002ݢݣ\u0007n\u0002\u0002ݣݲ\u0005Ű¹\u0002ݤݲ\u0007¸\u0002\u0002ݥݲ\u0007Î\u0002\u0002ݦݲ\u0007č\u0002\u0002ݧݨ\u0007ü\u0002\u0002ݨݲ\u0005Ű¹\u0002ݩݫ\u0007Ě\u0002\u0002ݪݬ\u0007¤\u0002\u0002ݫݪ\u0003\u0002\u0002\u0002ݫݬ\u0003\u0002\u0002\u0002ݬݯ\u0003\u0002\u0002\u0002ݭݰ\u0005ƢÒ\u0002ݮݰ\u0005Ű¹\u0002ݯݭ\u0003\u0002\u0002\u0002ݯݮ\u0003\u0002\u0002\u0002ݰݲ\u0003\u0002\u0002\u0002ݱݙ\u0003\u0002\u0002\u0002ݱݛ\u0003\u0002\u0002\u0002ݱݝ\u0003\u0002\u0002\u0002ݱݢ\u0003\u0002\u0002\u0002ݱݤ\u0003\u0002\u0002\u0002ݱݥ\u0003\u0002\u0002\u0002ݱݦ\u0003\u0002\u0002\u0002ݱݧ\u0003\u0002\u0002\u0002ݱݩ\u0003\u0002\u0002\u0002ݲß\u0003\u0002\u0002\u0002ݳݵ\u00072\u0002\u0002ݴݶ\u0007Ĳ\u0002\u0002ݵݴ\u0003\u0002\u0002\u0002ݵݶ\u0003\u0002\u0002\u0002ݶá\u0003\u0002\u0002\u0002ݷݹ\u0007:\u0002\u0002ݸݺ\u0007ġ\u0002\u0002ݹݸ\u0003\u0002\u0002\u0002ݹݺ\u0003\u0002\u0002\u0002ݺݻ\u0003\u0002\u0002\u0002ݻݼ\u0007\u0089\u0002\u0002ݼݽ\u0005ƨÕ\u0002ݽݾ\u0007Æ\u0002\u0002ݾݿ\u0005ľ \u0002ݿހ\u0007ŝ\u0002\u0002ހޅ\u0005äs\u0002ށނ\u0007ŏ\u0002\u0002ނބ\u0005äs\u0002ރށ\u0003\u0002\u0002\u0002ބއ\u0003\u0002\u0002\u0002ޅރ\u0003\u0002\u0002\u0002ޅކ\u0003\u0002\u0002\u0002ކވ\u0003\u0002\u0002\u0002އޅ\u0003\u0002\u0002\u0002ވމ\u0007Š\u0002\u0002މã\u0003\u0002\u0002\u0002ފތ\u0005ƨÕ\u0002ދލ\t\t\u0002\u0002ތދ\u0003\u0002\u0002\u0002ތލ\u0003\u0002\u0002\u0002ލå\u0003\u0002\u0002\u0002ގޏ\u0005èu\u0002ޏç\u0003\u0002\u0002\u0002ސޑ\u0007İ\u0002\u0002ޑޒ\u0007ŝ\u0002\u0002ޒޓ\u0005ƨÕ\u0002ޓޔ\u0007œ\u0002\u0002ޔޜ\u0005ƨÕ\u0002ޕޖ\u0007ŏ\u0002\u0002ޖޗ\u0005ƨÕ\u0002ޗޘ\u0007œ\u0002\u0002ޘޙ\u0005ƨÕ\u0002ޙޛ\u0003\u0002\u0002\u0002ޚޕ\u0003\u0002\u0002\u0002ޛޞ\u0003\u0002\u0002\u0002ޜޚ\u0003\u0002\u0002\u0002ޜޝ\u0003\u0002\u0002\u0002ޝޟ\u0003\u0002\u0002\u0002ޞޜ\u0003\u0002\u0002\u0002ޟޣ\u0007Š\u0002\u0002ޠޢ\u0005f4\u0002ޡޠ\u0003\u0002\u0002\u0002ޢޥ\u0003\u0002\u0002\u0002ޣޡ\u0003\u0002\u0002\u0002ޣޤ\u0003\u0002\u0002\u0002ޤé\u0003\u0002\u0002\u0002ޥޣ\u0003\u0002\u0002\u0002ަާ\u0007Ø\u0002\u0002ާޮ\u0005Ű¹\u0002ިީ\u0007Ø\u0002\u0002ީު\u0007ŝ\u0002\u0002ުޫ\u0005Ű¹\u0002ޫެ\u0007Š\u0002\u0002ެޮ\u0003\u0002\u0002\u0002ޭަ\u0003\u0002\u0002\u0002ޭި\u0003\u0002\u0002\u0002ޮë\u0003\u0002\u0002\u0002ޯް\u0007Ý\u0002\u0002ްí\u0003\u0002\u0002\u0002ޱ\u07bd\u0007â\u0002\u0002\u07b2\u07b4\u0007Ĉ\u0002\u0002\u07b3\u07b5\u0007Ħ\u0002\u0002\u07b4\u07b3\u0003\u0002\u0002\u0002\u07b4\u07b5\u0003\u0002\u0002\u0002\u07b5\u07b6\u0003\u0002\u0002\u0002\u07b6\u07bb\u0005Ű¹\u0002\u07b7\u07b8\u0007ú\u0002\u0002\u07b8\u07b9\u0007²\u0002\u0002\u07b9\u07ba\u0007œ\u0002\u0002\u07ba\u07bc\u0005Ű¹\u0002\u07bb\u07b7\u0003\u0002\u0002\u0002\u07bb\u07bc\u0003\u0002\u0002\u0002\u07bc\u07be\u0003\u0002\u0002\u0002\u07bd\u07b2\u0003\u0002\u0002\u0002\u07bd\u07be\u0003\u0002\u0002\u0002\u07beï\u0003\u0002\u0002\u0002\u07bf߁\u0007æ\u0002\u0002߀߂\u0005Ű¹\u0002߁߀\u0003\u0002\u0002\u0002߁߂\u0003\u0002\u0002\u0002߂ñ\u0003\u0002\u0002\u0002߃߅\u0007ì\u0002\u0002߄߆\u0007Ĳ\u0002\u0002߅߄\u0003\u0002\u0002\u0002߅߆\u0003\u0002\u0002\u0002߆ó\u0003\u0002\u0002\u0002߇ߋ\u0005ö|\u0002߈ߋ\u0005ø}\u0002߉ߋ\u0005ú~\u0002ߊ߇\u0003\u0002\u0002\u0002ߊ߈\u0003\u0002\u0002\u0002ߊ߉\u0003\u0002\u0002\u0002ߋõ\u0003\u0002\u0002\u0002ߌߎ\u0007>\u0002\u0002ߍߌ\u0003\u0002\u0002\u0002ߍߎ\u0003\u0002\u0002\u0002ߎߏ\u0003\u0002\u0002\u0002ߏߒ\u0007õ\u0002\u0002ߐߒ\u0007?\u0002\u0002ߑߍ\u0003\u0002\u0002\u0002ߑߐ\u0003\u0002\u0002\u0002ߒߔ\u0003\u0002\u0002\u0002ߓߕ\u0007œ\u0002\u0002ߔߓ\u0003\u0002\u0002\u0002ߔߕ\u0003\u0002\u0002\u0002ߕߖ\u0003\u0002\u0002\u0002ߖߗ\u0005Ű¹\u0002ߗ÷\u0003\u0002\u0002\u0002ߘߙ\t\u001c\u0002\u0002ߙߚ\t\u001d\u0002\u0002ߚù\u0003\u0002\u0002\u0002ߛߜ\u0007Û\u0002\u0002ߜߟ\u0007œ\u0002\u0002ߝߠ\u0005Ű¹\u0002ߞߠ\u0007¾\u0002\u0002ߟߝ\u0003\u0002\u0002\u0002ߟߞ\u0003\u0002\u0002\u0002ߠߢ\u0003\u0002\u0002\u0002ߡߣ\u0007Ģ\u0002\u0002ߢߡ\u0003\u0002\u0002\u0002ߢߣ\u0003\u0002\u0002\u0002ߣߤ\u0003\u0002\u0002\u0002ߤߥ\u0007p\u0002\u0002ߥߦ\t\u001e\u0002\u0002ߦû\u0003\u0002\u0002\u0002ߧߨ\u0007ÿ\u0002\u0002ߨߩ\u0005ƨÕ\u0002ߩý\u0003\u0002\u0002\u0002ߪ߬\u0007Ğ\u0002\u0002߫߭\u0007đ\u0002\u0002߬߫\u0003\u0002\u0002\u0002߬߭\u0003\u0002\u0002\u0002߭߮\u0003\u0002\u0002\u0002߮߯\u0005ľ \u0002߯ÿ\u0003\u0002\u0002\u0002߰߱\u0007Ĥ\u0002\u0002߲߱\u0005Ű¹\u0002߲ā\u0003\u0002\u0002\u0002߳ߵ\u0007ħ\u0002\u0002ߴ߶\u0007ŝ\u0002\u0002ߵߴ\u0003\u0002\u0002\u0002ߵ߶\u0003\u0002\u0002\u0002߶߷\u0003\u0002\u0002\u0002߷\u07fc\u0005Ű¹\u0002߸߹\u0007ŏ\u0002\u0002߹\u07fb\u0005Ű¹\u0002ߺ߸\u0003\u0002\u0002\u0002\u07fb\u07fe\u0003\u0002\u0002\u0002\u07fcߺ\u0003\u0002\u0002\u0002\u07fc\u07fd\u0003\u0002\u0002\u0002\u07fdࠀ\u0003\u0002\u0002\u0002\u07fe\u07fc\u0003\u0002\u0002\u0002\u07ffࠁ\u0007Š\u0002\u0002ࠀ\u07ff\u0003\u0002\u0002\u0002ࠀࠁ\u0003\u0002\u0002\u0002ࠁࠂ\u0003\u0002\u0002\u0002ࠂࠄ\u0007\u0095\u0002\u0002ࠃࠅ\u0007ŝ\u0002\u0002ࠄࠃ\u0003\u0002\u0002\u0002ࠄࠅ\u0003\u0002\u0002\u0002ࠅࠆ\u0003\u0002\u0002\u0002ࠆࠋ\u0005ƨÕ\u0002ࠇࠈ\u0007ŏ\u0002\u0002ࠈࠊ\u0005ƨÕ\u0002ࠉࠇ\u0003\u0002\u0002\u0002ࠊࠍ\u0003\u0002\u0002\u0002ࠋࠉ\u0003\u0002\u0002\u0002ࠋࠌ\u0003\u0002\u0002\u0002ࠌࠏ\u0003\u0002\u0002\u0002ࠍࠋ\u0003\u0002\u0002\u0002ࠎࠐ\u0007Š\u0002\u0002ࠏࠎ\u0003\u0002\u0002\u0002ࠏࠐ\u0003\u0002\u0002\u0002ࠐă\u0003\u0002\u0002\u0002ࠑࠒ\u0007į\u0002\u0002ࠒࠓ\u0005Š±\u0002ࠓࠔ\t\u001f\u0002\u0002ࠔࠕ\u0005\u0004\u0003\u0002ࠕࠗ\u0007`\u0002\u0002ࠖ࠘\t \u0002\u0002ࠗࠖ\u0003\u0002\u0002\u0002ࠗ࠘\u0003\u0002\u0002\u0002࠘ą\u0003\u0002\u0002\u0002࠙ࠚ\u0007p\u0002\u0002ࠚࠛ\u0007Ť\u0002\u0002ࠛࠝ\u0007\u0087\u0002\u0002ࠜࠞ\u0007ŝ\u0002\u0002ࠝࠜ\u0003\u0002\u0002\u0002ࠝࠞ\u0003\u0002\u0002\u0002ࠞࠟ\u0003\u0002\u0002\u0002ࠟࠡ\u0005Ď\u0088\u0002ࠠࠢ\u0007Š\u0002\u0002ࠡࠠ\u0003\u0002\u0002\u0002ࠡࠢ\u0003\u0002\u0002\u0002ࠢࠣ\u0003\u0002\u0002\u0002ࠣࠤ\u0007¬\u0002\u0002ࠤࠥ\u0005\u0004\u0003\u0002ࠥࠦ\u0007`\u0002\u0002ࠦࠧ\u0007¬\u0002\u0002ࠧć\u0003\u0002\u0002\u0002ࠨࠩ\u0007p\u0002\u0002ࠩࠪ\u0007Ť\u0002\u0002ࠪࠬ\u0007\u0087\u0002\u0002ࠫ࠭\u0007è\u0002\u0002ࠬࠫ\u0003\u0002\u0002\u0002ࠬ࠭\u0003\u0002\u0002\u0002࠭\u082e\u0003\u0002\u0002\u0002\u082e\u082f\u0005Ű¹\u0002\u082f࠰\u0007Œ\u0002\u0002࠰࠳\u0005Ű¹\u0002࠱࠲\t!\u0002\u0002࠲࠴\u0005Ű¹\u0002࠳࠱\u0003\u0002\u0002\u0002࠳࠴\u0003\u0002\u0002\u0002࠴࠵\u0003\u0002\u0002\u0002࠵࠶\u0007¬\u0002\u0002࠶࠷\u0005\u0004\u0003\u0002࠷࠸\u0007`\u0002\u0002࠸࠹\u0007¬\u0002\u0002࠹ĉ\u0003\u0002\u0002\u0002࠺ࡁ\u0007ŭ\u0002\u0002࠻࠼\u0007ř\u0002\u0002࠼࠽\u0007ř\u0002\u0002࠽࠾\u0007Ť\u0002\u0002࠾\u083f\u0007ŗ\u0002\u0002\u083fࡁ\u0007ŗ\u0002\u0002ࡀ࠺\u0003\u0002\u0002\u0002ࡀ࠻\u0003\u0002\u0002\u0002ࡁċ\u0003\u0002\u0002\u0002ࡂࡃ\u0007ĥ\u0002\u0002ࡃࡈ\u0005Ű¹\u0002ࡄࡅ\u0007ŏ\u0002\u0002ࡅࡇ\u0005Ű¹\u0002ࡆࡄ\u0003\u0002\u0002\u0002ࡇࡊ\u0003\u0002\u0002\u0002ࡈࡆ\u0003\u0002\u0002\u0002ࡈࡉ\u0003\u0002\u0002\u0002ࡉč\u0003\u0002\u0002\u0002ࡊࡈ\u0003\u0002\u0002\u0002ࡋࡍ\u0005Đ\u0089\u0002ࡌࡋ\u0003\u0002\u0002\u0002ࡌࡍ\u0003\u0002\u0002\u0002ࡍࡎ\u0003\u0002\u0002\u0002ࡎࡏ\u0005Ė\u008c\u0002ࡏď\u0003\u0002\u0002\u0002ࡐࡑ\u0007İ\u0002\u0002ࡑࡖ\u0005Ē\u008a\u0002ࡒࡓ\u0007ŏ\u0002\u0002ࡓࡕ\u0005Ē\u008a\u0002ࡔࡒ\u0003\u0002\u0002\u0002ࡕࡘ\u0003\u0002\u0002\u0002ࡖࡔ\u0003\u0002\u0002\u0002ࡖࡗ\u0003\u0002\u0002\u0002ࡗđ\u0003\u0002\u0002\u0002ࡘࡖ\u0003\u0002\u0002\u0002࡙࡛\u0005ƨÕ\u0002࡚\u085c\u0005Ĕ\u008b\u0002࡛࡚\u0003\u0002\u0002\u0002࡛\u085c\u0003\u0002\u0002\u0002\u085c\u085d\u0003\u0002\u0002\u0002\u085d࡞\u0007\u0010\u0002\u0002࡞\u085f\u0007ŝ\u0002\u0002\u085f\u0860\u0005Ė\u008c\u0002\u0860\u0861\u0007Š\u0002\u0002\u0861ē\u0003\u0002\u0002\u0002\u0862\u0863\u0007ŝ\u0002\u0002\u0863\u0868\u0005ƨÕ\u0002\u0864\u0865\u0007ŏ\u0002\u0002\u0865\u0867\u0005ƨÕ\u0002\u0866\u0864\u0003\u0002\u0002\u0002\u0867\u086a\u0003\u0002\u0002\u0002\u0868\u0866\u0003\u0002\u0002\u0002\u0868\u0869\u0003\u0002\u0002\u0002\u0869\u086b\u0003\u0002\u0002\u0002\u086a\u0868\u0003\u0002\u0002\u0002\u086b\u086c\u0007Š\u0002\u0002\u086cĕ\u0003\u0002\u0002\u0002\u086d\u0873\u0005Ę\u008d\u0002\u086e\u086f\u0005Ě\u008e\u0002\u086f\u0870\u0005Ę\u008d\u0002\u0870\u0872\u0003\u0002\u0002\u0002\u0871\u086e\u0003\u0002\u0002\u0002\u0872\u0875\u0003\u0002\u0002\u0002\u0873\u0871\u0003\u0002\u0002\u0002\u0873\u0874\u0003\u0002\u0002\u0002\u0874ė\u0003\u0002\u0002\u0002\u0875\u0873\u0003\u0002\u0002\u0002\u0876\u087c\u0005Ĝ\u008f\u0002\u0877\u0878\u0007ŝ\u0002\u0002\u0878\u0879\u0005Ė\u008c\u0002\u0879\u087a\u0007Š\u0002\u0002\u087a\u087c\u0003\u0002\u0002\u0002\u087b\u0876\u0003\u0002\u0002\u0002\u087b\u0877\u0003\u0002\u0002\u0002\u087cę\u0003\u0002\u0002\u0002\u087d\u087f\u0007Ġ\u0002\u0002\u087e\u0880\u0007\n\u0002\u0002\u087f\u087e\u0003\u0002\u0002\u0002\u087f\u0880\u0003\u0002\u0002\u0002\u0880\u088a\u0003\u0002\u0002\u0002\u0881\u0883\u0007c\u0002\u0002\u0882\u0884\u0007\n\u0002\u0002\u0883\u0882\u0003\u0002\u0002\u0002\u0883\u0884\u0003\u0002\u0002\u0002\u0884\u088a\u0003\u0002\u0002\u0002\u0885\u0887\u0007\u0093\u0002\u0002\u0886\u0888\u0007\n\u0002\u0002\u0887\u0886\u0003\u0002\u0002\u0002\u0887\u0888\u0003\u0002\u0002\u0002\u0888\u088a\u0003\u0002\u0002\u0002\u0889\u087d\u0003\u0002\u0002\u0002\u0889\u0881\u0003\u0002\u0002\u0002\u0889\u0885\u0003\u0002\u0002\u0002\u088aě\u0003\u0002\u0002\u0002\u088b\u088c\t\"\u0002\u0002\u088c\u088e\u0005Ğ\u0090\u0002\u088d\u088f\u0005Ī\u0096\u0002\u088e\u088d\u0003\u0002\u0002\u0002\u088e\u088f\u0003\u0002\u0002\u0002\u088f\u0891\u0003\u0002\u0002\u0002\u0890\u0892\u0005Ĭ\u0097\u0002\u0891\u0890\u0003\u0002", "\u0002\u0002\u0891\u0892\u0003\u0002\u0002\u0002\u0892\u0894\u0003\u0002\u0002\u0002\u0893\u0895\u0005ŀ¡\u0002\u0894\u0893\u0003\u0002\u0002\u0002\u0894\u0895\u0003\u0002\u0002\u0002\u0895\u0897\u0003\u0002\u0002\u0002\u0896\u0898\u0005ł¢\u0002\u0897\u0896\u0003\u0002\u0002\u0002\u0897\u0898\u0003\u0002\u0002\u0002\u0898\u089a\u0003\u0002\u0002\u0002\u0899\u089b\u0005ń£\u0002\u089a\u0899\u0003\u0002\u0002\u0002\u089a\u089b\u0003\u0002\u0002\u0002\u089b\u089d\u0003\u0002\u0002\u0002\u089c\u089e\u0005ņ¤\u0002\u089d\u089c\u0003\u0002\u0002\u0002\u089d\u089e\u0003\u0002\u0002\u0002\u089eࢠ\u0003\u0002\u0002\u0002\u089f\u08a1\u0005ň¥\u0002ࢠ\u089f\u0003\u0002\u0002\u0002ࢠ\u08a1\u0003\u0002\u0002\u0002\u08a1ĝ\u0003\u0002\u0002\u0002ࢢࢤ\u0005Ġ\u0091\u0002ࢣࢢ\u0003\u0002\u0002\u0002ࢣࢤ\u0003\u0002\u0002\u0002ࢤࢦ\u0003\u0002\u0002\u0002ࢥࢧ\u0005Ģ\u0092\u0002ࢦࢥ\u0003\u0002\u0002\u0002ࢦࢧ\u0003\u0002\u0002\u0002ࢧࢨ\u0003\u0002\u0002\u0002ࢨ\u08ad\u0005Ĥ\u0093\u0002ࢩࢪ\u0007ŏ\u0002\u0002ࢪࢬ\u0005Ĥ\u0093\u0002ࢫࢩ\u0003\u0002\u0002\u0002ࢬ\u08af\u0003\u0002\u0002\u0002\u08adࢫ\u0003\u0002\u0002\u0002\u08ad\u08ae\u0003\u0002\u0002\u0002\u08aeğ\u0003\u0002\u0002\u0002\u08af\u08ad\u0003\u0002\u0002\u0002\u08b0\u08b1\t#\u0002\u0002\u08b1ġ\u0003\u0002\u0002\u0002\u08b2\u08b3\u0007ě\u0002\u0002\u08b3\u08b4\u0005Ű¹\u0002\u08b4ģ\u0003\u0002\u0002\u0002\u08b5\u08b6\u0005ƨÕ\u0002\u08b6\u08b7\u0007œ\u0002\u0002\u08b7\u08b9\u0003\u0002\u0002\u0002\u08b8\u08b5\u0003\u0002\u0002\u0002\u08b8\u08b9\u0003\u0002\u0002\u0002\u08b9\u08ba\u0003\u0002\u0002\u0002\u08ba\u08bc\u0005Ű¹\u0002\u08bb\u08bd\u0005Ħ\u0094\u0002\u08bc\u08bb\u0003\u0002\u0002\u0002\u08bc\u08bd\u0003\u0002\u0002\u0002\u08bd\u08c0\u0003\u0002\u0002\u0002\u08be\u08c0\u0005Ĩ\u0095\u0002\u08bf\u08b8\u0003\u0002\u0002\u0002\u08bf\u08be\u0003\u0002\u0002\u0002\u08c0ĥ\u0003\u0002\u0002\u0002\u08c1\u08c3\u0006\u0094\u0005\u0002\u08c2\u08c4\u0007\u0010\u0002\u0002\u08c3\u08c2\u0003\u0002\u0002\u0002\u08c3\u08c4\u0003\u0002\u0002\u0002\u08c4\u08c5\u0003\u0002\u0002\u0002\u08c5\u08cb\u0005ƨÕ\u0002\u08c6\u08c7\u0007ŝ\u0002\u0002\u08c7\u08c8\u0007ę\u0002\u0002\u08c8\u08c9\u0007ť\u0002\u0002\u08c9\u08cb\u0007Š\u0002\u0002\u08ca\u08c1\u0003\u0002\u0002\u0002\u08ca\u08c6\u0003\u0002\u0002\u0002\u08cbħ\u0003\u0002\u0002\u0002\u08cc\u08cd\u0007Ť\u0002\u0002\u08cd\u08cf\u0007\u0006\u0002\u0002\u08ce\u08cc\u0003\u0002\u0002\u0002\u08ce\u08cf\u0003\u0002\u0002\u0002\u08cf\u08d0\u0003\u0002\u0002\u0002\u08d0\u08d1\u0007ś\u0002\u0002\u08d1ĩ\u0003\u0002\u0002\u0002\u08d2\u08d3\u0007\u0095\u0002\u0002\u08d3\u08d8\u0005ƨÕ\u0002\u08d4\u08d5\u0007ŏ\u0002\u0002\u08d5\u08d7\u0005ƨÕ\u0002\u08d6\u08d4\u0003\u0002\u0002\u0002\u08d7\u08da\u0003\u0002\u0002\u0002\u08d8\u08d6\u0003\u0002\u0002\u0002\u08d8\u08d9\u0003\u0002\u0002\u0002\u08d9ī\u0003\u0002\u0002\u0002\u08da\u08d8\u0003\u0002\u0002\u0002\u08db\u08dc\u0007t\u0002\u0002\u08dc\u08e0\u0005Į\u0098\u0002\u08dd\u08df\u0005Ĵ\u009b\u0002\u08de\u08dd\u0003\u0002\u0002\u0002\u08df\u08e2\u0003\u0002\u0002\u0002\u08e0\u08de\u0003\u0002\u0002\u0002\u08e0\u08e1\u0003\u0002\u0002\u0002\u08e1ĭ\u0003\u0002\u0002\u0002\u08e2\u08e0\u0003\u0002\u0002\u0002\u08e3ࣧ\u0005İ\u0099\u0002ࣤࣧ\u0005Ĳ\u009a\u0002ࣥࣧ\u0005ĸ\u009d\u0002ࣦ\u08e3\u0003\u0002\u0002\u0002ࣦࣤ\u0003\u0002\u0002\u0002ࣦࣥ\u0003\u0002\u0002\u0002ࣧį\u0003\u0002\u0002\u0002ࣨ࣪\u0005ľ \u0002ࣩ࣫\u0005ļ\u009f\u0002ࣩ࣪\u0003\u0002\u0002\u0002࣪࣫\u0003\u0002\u0002\u0002࣫ı\u0003\u0002\u0002\u0002࣭࣬\u0007ŝ\u0002\u0002࣭࣮\u0005Ď\u0088\u0002ࣰ࣮\u0007Š\u0002\u0002ࣱ࣯\u0005ļ\u009f\u0002ࣰ࣯\u0003\u0002\u0002\u0002ࣰࣱ\u0003\u0002\u0002\u0002ࣱĳ\u0003\u0002\u0002\u0002ࣲࣳ\u0007ŏ\u0002\u0002ࣺࣳ\u0005Į\u0098\u0002ࣴࣵ\u0005Ķ\u009c\u0002ࣶࣵ\u0005Į\u0098\u0002ࣶࣷ\u0007Æ\u0002\u0002ࣷࣸ\u0005Š±\u0002ࣺࣸ\u0003\u0002\u0002\u0002ࣲࣹ\u0003\u0002\u0002\u0002ࣹࣴ\u0003\u0002\u0002\u0002ࣺĵ\u0003\u0002\u0002\u0002ࣻࣽ\u0007\u008b\u0002\u0002ࣼࣻ\u0003\u0002\u0002\u0002ࣼࣽ\u0003\u0002\u0002\u0002ࣽࣾ\u0003\u0002\u0002\u0002ࣾअ\u0007\u009a\u0002\u0002\u08ffँ\t$\u0002\u0002ऀं\u0007Ì\u0002\u0002ँऀ\u0003\u0002\u0002\u0002ँं\u0003\u0002\u0002\u0002ंः\u0003\u0002\u0002\u0002ःअ\u0007\u009a\u0002\u0002ऄࣼ\u0003\u0002\u0002\u0002ऄ\u08ff\u0003\u0002\u0002\u0002अķ\u0003\u0002\u0002\u0002आइ\u0007đ\u0002\u0002इई\u0007ŝ\u0002\u0002ईउ\u0007ħ\u0002\u0002उऎ\u0005ĺ\u009e\u0002ऊऋ\u0007ŏ\u0002\u0002ऋऍ\u0005ĺ\u009e\u0002ऌऊ\u0003\u0002\u0002\u0002ऍऐ\u0003\u0002\u0002\u0002ऎऌ\u0003\u0002\u0002\u0002ऎए\u0003\u0002\u0002\u0002एऑ\u0003\u0002\u0002\u0002ऐऎ\u0003\u0002\u0002\u0002ऑओ\u0007Š\u0002\u0002ऒऔ\u0005ļ\u009f\u0002ओऒ\u0003\u0002\u0002\u0002ओऔ\u0003\u0002\u0002\u0002औĹ\u0003\u0002\u0002\u0002कढ\u0005Ű¹\u0002खग\u0007ŝ\u0002\u0002गज\u0005Ű¹\u0002घङ\u0007ŏ\u0002\u0002ङछ\u0005Ű¹\u0002चघ\u0003\u0002\u0002\u0002छञ\u0003\u0002\u0002\u0002जच\u0003\u0002\u0002\u0002जझ\u0003\u0002\u0002\u0002झट\u0003\u0002\u0002\u0002ञज\u0003\u0002\u0002\u0002टठ\u0007Š\u0002\u0002ठढ\u0003\u0002\u0002\u0002डक\u0003\u0002\u0002\u0002डख\u0003\u0002\u0002\u0002ढĻ\u0003\u0002\u0002\u0002णथ\u0006\u009f\u0006\u0002तद\u0007\u0010\u0002\u0002थत\u0003\u0002\u0002\u0002थद\u0003\u0002\u0002\u0002दध\u0003\u0002\u0002\u0002धल\u0005ƨÕ\u0002नऩ\u0007ŝ\u0002\u0002ऩम\u0007Ť\u0002\u0002पफ\u0007ŏ\u0002\u0002फभ\u0007Ť\u0002\u0002बप\u0003\u0002\u0002\u0002भर\u0003\u0002\u0002\u0002मब\u0003\u0002\u0002\u0002मय\u0003\u0002\u0002\u0002यऱ\u0003\u0002\u0002\u0002रम\u0003\u0002\u0002\u0002ऱळ\u0007Š\u0002\u0002लन\u0003\u0002\u0002\u0002लळ\u0003\u0002\u0002\u0002ळĽ\u0003\u0002\u0002\u0002ऴव\u0005ƨÕ\u0002वĿ\u0003\u0002\u0002\u0002शष\u0007Į\u0002\u0002षस\u0005Š±\u0002सŁ\u0003\u0002\u0002\u0002हऺ\u0007|\u0002\u0002ऺऻ\u0007 \u0002\u0002ऻी\u0005Ű¹\u0002़ऽ\u0007ŏ\u0002\u0002ऽि\u0005Ű¹\u0002ा़\u0003\u0002\u0002\u0002िू\u0003\u0002\u0002\u0002ीा\u0003\u0002\u0002\u0002ीु\u0003\u0002\u0002\u0002ुŃ\u0003\u0002\u0002\u0002ूी\u0003\u0002\u0002\u0002ृॄ\u0007\u007f\u0002\u0002ॄॅ\u0005Š±\u0002ॅŅ\u0003\u0002\u0002\u0002ॆे\u0007Ê\u0002\u0002ेै\u0007 \u0002\u0002ैॊ\u0005Ű¹\u0002ॉो\t\t\u0002\u0002ॊॉ\u0003\u0002\u0002\u0002ॊो\u0003\u0002\u0002\u0002ो॓\u0003\u0002\u0002\u0002ौ्\u0007ŏ\u0002\u0002्ॏ\u0005Ű¹\u0002ॎॐ\t\t\u0002\u0002ॏॎ\u0003\u0002\u0002\u0002ॏॐ\u0003\u0002\u0002\u0002ॐ॒\u0003\u0002\u0002\u0002॑ौ\u0003\u0002\u0002\u0002॒ॕ\u0003\u0002\u0002\u0002॓॑\u0003\u0002\u0002\u0002॓॔\u0003\u0002\u0002\u0002॔Ň\u0003\u0002\u0002\u0002ॕ॓\u0003\u0002\u0002\u0002ॖक़\u0005Ŋ¦\u0002ॗॖ\u0003\u0002\u0002\u0002क़ख़\u0003\u0002\u0002\u0002ख़ॗ\u0003\u0002\u0002\u0002ख़ग़\u0003\u0002\u0002\u0002ग़ŉ\u0003\u0002\u0002\u0002ज़ड़\u0007¢\u0002\u0002ड़१\u0005Ű¹\u0002ढ़फ़\u0007İ\u0002\u0002फ़।\t%\u0002\u0002य़ॠ\u0007Ĥ\u0002\u0002ॠॡ\u0007\r\u0002\u0002ॡॢ\u0007\u009b\u0002\u0002ॢॣ\t&\u0002\u0002ॣ॥\u0007¨\u0002\u0002।य़\u0003\u0002\u0002\u0002।॥\u0003\u0002\u0002\u0002॥१\u0003\u0002\u0002\u0002०ज़\u0003\u0002\u0002\u0002०ढ़\u0003\u0002\u0002\u0002१ŋ\u0003\u0002\u0002\u0002२३\u0007Ģ\u0002\u0002३४\u0005Ő©\u0002४५\u0007ú\u0002\u0002५७\u0005Ŏ¨\u0002६८\u0005ŀ¡\u0002७६\u0003\u0002\u0002\u0002७८\u0003\u0002\u0002\u0002८॰\u0003\u0002\u0002\u0002९ॱ\u0005Œª\u0002॰९\u0003\u0002\u0002\u0002॰ॱ\u0003\u0002\u0002\u0002ॱō\u0003\u0002\u0002\u0002ॲॷ\u0005\u001c\u000f\u0002ॳॴ\u0007ŏ\u0002\u0002ॴॶ\u0005\u001c\u000f\u0002ॵॳ\u0003\u0002\u0002\u0002ॶॹ\u0003\u0002\u0002\u0002ॷॵ\u0003\u0002\u0002\u0002ॷ\u0978\u0003\u0002\u0002\u0002\u0978ŏ\u0003\u0002\u0002\u0002ॹॷ\u0003\u0002\u0002\u0002ॺ\u0980\u0005ľ \u0002ॻॼ\u0007ŝ\u0002\u0002ॼॽ\u0005Ď\u0088\u0002ॽॾ\u0007Š\u0002\u0002ॾ\u0980\u0003\u0002\u0002\u0002ॿॺ\u0003\u0002\u0002\u0002ॿॻ\u0003\u0002\u0002\u0002\u0980অ\u0003\u0002\u0002\u0002ঁঃ\u0007\u0010\u0002\u0002ংঁ\u0003\u0002\u0002\u0002ংঃ\u0003\u0002\u0002\u0002ঃ\u0984\u0003\u0002\u0002\u0002\u0984আ\u0005ƨÕ\u0002অং\u0003\u0002\u0002\u0002অআ\u0003\u0002\u0002\u0002আő\u0003\u0002\u0002\u0002ইঈ\u0007\\\u0002\u0002ঈউ\u0005ªV\u0002উœ\u0003\u0002\u0002\u0002ঊঋ\u0007±\u0002\u0002ঋঌ\u0007\u0095\u0002\u0002ঌ\u098d\u0005Ŗ¬\u0002\u098d\u098e\u0007ĥ\u0002\u0002\u098eএ\u0005Ŗ¬\u0002এঐ\u0007Æ\u0002\u0002ঐ\u0992\u0005Š±\u0002\u0991ও\u0005Ř\u00ad\u0002\u0992\u0991\u0003\u0002\u0002\u0002ওঔ\u0003\u0002\u0002\u0002ঔ\u0992\u0003\u0002\u0002\u0002ঔক\u0003\u0002\u0002\u0002কŕ\u0003\u0002\u0002\u0002খজ\u0005ľ \u0002গঘ\u0007ŝ\u0002\u0002ঘঙ\u0005Ď\u0088\u0002ঙচ\u0007Š\u0002\u0002চজ\u0003\u0002\u0002\u0002ছখ\u0003\u0002\u0002\u0002ছগ\u0003\u0002\u0002\u0002জড\u0003\u0002\u0002\u0002ঝট\u0007\u0010\u0002\u0002ঞঝ\u0003\u0002\u0002\u0002ঞট\u0003\u0002\u0002\u0002টঠ\u0003\u0002\u0002\u0002ঠঢ\u0005ƨÕ\u0002ডঞ\u0003\u0002\u0002\u0002ডঢ\u0003\u0002\u0002\u0002ঢŗ\u0003\u0002\u0002\u0002ণথ\u0007ĭ\u0002\u0002তদ\u0007¿\u0002\u0002থত\u0003\u0002\u0002\u0002থদ\u0003\u0002\u0002\u0002দধ\u0003\u0002\u0002\u0002ধপ\u0007®\u0002\u0002ন\u09a9\u0007\r\u0002\u0002\u09a9ফ\u0005Š±\u0002পন\u0003\u0002\u0002\u0002পফ\u0003\u0002\u0002\u0002ফব\u0003\u0002\u0002\u0002বভ\u0007Ė\u0002\u0002ভ\u09b1\u0005Ś®\u0002ময\u0007\\\u0002\u0002য\u09b1\u0007\u0085\u0002\u0002রণ\u0003\u0002\u0002\u0002রম\u0003\u0002\u0002\u0002\u09b1ř\u0003\u0002\u0002\u0002ল\u09b4\u0007\u008d\u0002\u0002\u09b3\u09b5\u0005¬W\u0002\u09b4\u09b3\u0003\u0002\u0002\u0002\u09b4\u09b5\u0003\u0002\u0002\u0002\u09b5শ\u0003\u0002\u0002\u0002শষ\u0007ħ\u0002\u0002ষে\u0005°Y\u0002সহ\u0007Ģ\u0002\u0002হ\u09ba\u0007ú\u0002\u0002\u09baি\u0005\u001c\u000f\u0002\u09bb়\u0007ŏ\u0002\u0002়া\u0005\u001c\u000f\u0002ঽ\u09bb\u0003\u0002\u0002\u0002াু\u0003\u0002\u0002\u0002িঽ\u0003\u0002\u0002\u0002িী\u0003\u0002\u0002\u0002ীৃ\u0003\u0002\u0002\u0002ুি\u0003\u0002\u0002\u0002ূৄ\u0005ŀ¡\u0002ৃূ\u0003\u0002\u0002\u0002ৃৄ\u0003\u0002\u0002\u0002ৄে\u0003\u0002\u0002\u0002\u09c5ে\u0007N\u0002\u0002\u09c6ল\u0003\u0002\u0002\u0002\u09c6স\u0003\u0002\u0002\u0002\u09c6\u09c5\u0003\u0002\u0002\u0002েś\u0003\u0002\u0002\u0002ৈ\u09ca\u0007N\u0002\u0002\u09c9ো\u0007t\u0002\u0002\u09ca\u09c9\u0003\u0002\u0002\u0002\u09caো\u0003\u0002\u0002\u0002োৌ\u0003\u0002\u0002\u0002ৌ\u09d1\u0005ľ \u0002্\u09cf\u0007\u0010\u0002\u0002ৎ্\u0003\u0002\u0002\u0002ৎ\u09cf\u0003\u0002\u0002\u0002\u09cf\u09d0\u0003\u0002\u0002\u0002\u09d0\u09d2\u0005ƨÕ\u0002\u09d1ৎ\u0003\u0002\u0002\u0002\u09d1\u09d2\u0003\u0002\u0002\u0002\u09d2\u09d4\u0003\u0002\u0002\u0002\u09d3\u09d5\u0005ŀ¡\u0002\u09d4\u09d3\u0003\u0002\u0002\u0002\u09d4\u09d5\u0003\u0002\u0002\u0002\u09d5ŝ\u0003\u0002\u0002\u0002\u09d6\u09d8\t'\u0002\u0002ৗ\u09d9\u0007đ\u0002\u0002\u09d8ৗ\u0003\u0002\u0002\u0002\u09d8\u09d9\u0003\u0002\u0002\u0002\u09d9\u09da\u0003\u0002\u0002\u0002\u09da\u09db\u0005ľ \u0002\u09dbş\u0003\u0002\u0002\u0002ড়\u09de\b±\u0001\u0002ঢ়য়\u0007¿\u0002\u0002\u09deঢ়\u0003\u0002\u0002\u0002\u09deয়\u0003\u0002\u0002\u0002য়ৠ\u0003\u0002\u0002\u0002ৠৡ\u0007ŝ\u0002\u0002ৡৢ\u0005Š±\u0002ৢৣ\u0007Š\u0002\u0002ৣ০\u0003\u0002\u0002\u0002\u09e4০\u0005Ţ²\u0002\u09e5ড়\u0003\u0002\u0002\u0002\u09e5\u09e4\u0003\u0002\u0002\u0002০৭\u0003\u0002\u0002\u0002১২\f\u0004\u0002\u0002২৩\u0005Ŭ·\u0002৩৪\u0005Š±\u0005৪৬\u0003\u0002\u0002\u0002৫১\u0003\u0002\u0002\u0002৬৯\u0003\u0002\u0002\u0002৭৫\u0003\u0002\u0002\u0002৭৮\u0003\u0002\u0002\u0002৮š\u0003\u0002\u0002\u0002৯৭\u0003\u0002\u0002\u0002ৰ৴\u0005Ť³\u0002ৱ৴\u0005Ū¶\u0002৲৴\u0005Ű¹\u0002৳ৰ\u0003\u0002\u0002\u0002৳ৱ\u0003\u0002\u0002\u0002৳৲\u0003\u0002\u0002\u0002৴ţ\u0003\u0002\u0002\u0002৵৶\u0005Ű¹\u0002৶৸\u0007\u0097\u0002\u0002৷৹\u0007¿\u0002\u0002৸৷\u0003\u0002\u0002\u0002৸৹\u0003\u0002\u0002\u0002৹৺\u0003\u0002\u0002\u0002৺৻\u0007Á\u0002\u0002৻ਅ\u0003\u0002\u0002\u0002\u09fc\u09fd\u0005Ű¹\u0002\u09fd\u09fe\u0007\u0018\u0002\u0002\u09fe\u09ff\u0005Ű¹\u0002\u09ff\u0a00\u0007\r\u0002\u0002\u0a00ਁ\u0005Ű¹\u0002ਁਅ\u0003\u0002\u0002\u0002ਂਅ\u0005Ŧ´\u0002ਃਅ\u0005Ũµ\u0002\u0a04৵\u0003\u0002\u0002\u0002\u0a04\u09fc\u0003\u0002\u0002\u0002\u0a04ਂ\u0003\u0002\u0002\u0002\u0a04ਃ\u0003\u0002\u0002\u0002ਅť\u0003\u0002\u0002\u0002ਆਈ\u0005Ű¹\u0002ਇਉ\u0007¿\u0002\u0002ਈਇ\u0003\u0002\u0002\u0002ਈਉ\u0003\u0002\u0002\u0002ਉਊ\u0003\u0002\u0002\u0002ਊ\u0a0b\u0007\u0087\u0002\u0002\u0a0bਕ\u0007ŝ\u0002\u0002\u0a0c\u0a11\u0005Ű¹\u0002\u0a0d\u0a0e\u0007ŏ\u0002\u0002\u0a0eਐ\u0005Ű¹\u0002ਏ\u0a0d\u0003\u0002\u0002\u0002ਐਓ\u0003\u0002\u0002\u0002\u0a11ਏ\u0003\u0002\u0002\u0002\u0a11\u0a12\u0003\u0002\u0002\u0002\u0a12ਖ\u0003\u0002\u0002\u0002ਓ\u0a11\u0003\u0002\u0002\u0002ਔਖ\u0005Ď\u0088\u0002ਕ\u0a0c\u0003\u0002\u0002\u0002ਕਔ\u0003\u0002\u0002\u0002ਖਗ\u0003\u0002\u0002\u0002ਗਘ\u0007Š\u0002\u0002ਘŧ\u0003\u0002\u0002\u0002ਙਚ\u0007ŝ\u0002\u0002ਚਟ\u0005Ű¹\u0002ਛਜ\u0007ŏ\u0002\u0002ਜਞ\u0005Ű¹\u0002ਝਛ\u0003\u0002\u0002\u0002ਞਡ\u0003\u0002\u0002\u0002ਟਝ\u0003\u0002\u0002\u0002ਟਠ\u0003\u0002\u0002\u0002ਠਢ\u0003\u0002\u0002\u0002ਡਟ\u0003\u0002\u0002\u0002ਢਤ\u0007Š\u0002\u0002ਣਥ\u0007¿\u0002\u0002ਤਣ\u0003\u0002\u0002\u0002ਤਥ\u0003\u0002\u0002\u0002ਥਦ\u0003\u0002\u0002\u0002ਦਧ\u0007\u0087\u0002\u0002ਧਨ\u0007ŝ\u0002\u0002ਨ\u0a29\u0005Ď\u0088\u0002\u0a29ਪ\u0007Š\u0002\u0002ਪũ\u0003\u0002\u0002\u0002ਫਬ\u0005Ű¹\u0002ਬਭ\u0005Ů¸\u0002ਭਮ\u0005Ű¹\u0002ਮū\u0003\u0002\u0002\u0002ਯਰ\t(\u0002\u0002ਰŭ\u0003\u0002\u0002\u0002\u0a31ਾ\u0007œ\u0002\u0002ਲਾ\u0007Ŕ\u0002\u0002ਲ਼ਾ\u0007ŕ\u0002\u0002\u0a34ਾ\u0007Ŗ\u0002\u0002ਵਾ\u0007ř\u0002\u0002ਸ਼ਾ\u0007Ś\u0002\u0002\u0a37ਾ\u0007ŗ\u0002\u0002ਸਾ\u0007Ř\u0002\u0002ਹ\u0a3b\u0007¿\u0002\u0002\u0a3aਹ\u0003\u0002\u0002\u0002\u0a3a\u0a3b\u0003\u0002\u0002\u0002\u0a3b਼\u0003\u0002\u0002\u0002਼ਾ\t)\u0002\u0002\u0a3d\u0a31\u0003\u0002\u0002\u0002\u0a3dਲ\u0003\u0002\u0002\u0002\u0a3dਲ਼\u0003\u0002\u0002\u0002\u0a3d\u0a34\u0003\u0002\u0002\u0002\u0a3dਵ\u0003\u0002\u0002\u0002\u0a3dਸ਼\u0003\u0002\u0002\u0002\u0a3d\u0a37\u0003\u0002\u0002\u0002\u0a3dਸ\u0003\u0002\u0002\u0002\u0a3d\u0a3a\u0003\u0002\u0002\u0002ਾů\u0003\u0002\u0002\u0002ਿੀ\b¹\u0001\u0002ੀੁ\u0007ŝ\u0002\u0002ੁੂ\u0005Ű¹\u0002ੂ\u0a43\u0007Š\u0002\u0002\u0a43੍\u0003\u0002\u0002\u0002\u0a44੍\u0005Ŵ»\u0002\u0a45੍\u0005Ÿ½\u0002\u0a46੍\u0005ż¿\u0002ੇ੍\u0005ƂÂ\u0002ੈ੍\u0005ƄÃ\u0002\u0a49੍\u0005ƌÇ\u0002\u0a4a੍\u0005ƎÈ\u0002ੋ੍\u0005Ųº\u0002ੌਿ\u0003\u0002\u0002\u0002ੌ\u0a44\u0003\u0002\u0002\u0002ੌ\u0a45\u0003\u0002\u0002\u0002ੌ\u0a46\u0003\u0002\u0002\u0002ੌੇ\u0003\u0002\u0002\u0002ੌੈ\u0003\u0002\u0002\u0002ੌ\u0a49\u0003\u0002\u0002\u0002ੌ\u0a4a\u0003\u0002\u0002\u0002ੌੋ\u0003\u0002\u0002\u0002੍ਫ਼\u0003\u0002\u0002\u0002\u0a4e\u0a4f\f\u000f\u0002\u0002\u0a4f\u0a50\u0007ś\u0002\u0002\u0a50\u0a5d\u0005Ű¹\u0010ੑ\u0a52\f\u000e\u0002\u0002\u0a52\u0a53\u0007ő\u0002\u0002\u0a53\u0a5d\u0005Ű¹\u000f\u0a54\u0a55\f\r\u0002\u0002\u0a55\u0a56\u0007ō\u0002\u0002\u0a56\u0a5d\u0005Ű¹\u000e\u0a57\u0a58\f\f\u0002\u0002\u0a58ਖ਼\u0007ţ\u0002\u0002ਖ਼\u0a5d\u0005Ű¹\rਗ਼ਜ਼\f\u0010\u0002\u0002ਜ਼\u0a5d\u0005Ŷ¼\u0002ੜ\u0a4e\u0003\u0002\u0002\u0002ੜੑ\u0003\u0002\u0002\u0002ੜ\u0a54\u0003\u0002\u0002\u0002ੜ\u0a57\u0003\u0002\u0002\u0002ੜਗ਼\u0003\u0002\u0002\u0002\u0a5d\u0a60\u0003\u0002\u0002\u0002ਫ਼ੜ\u0003\u0002\u0002\u0002ਫ਼\u0a5f\u0003\u0002\u0002\u0002\u0a5fű\u0003\u0002\u0002\u0002\u0a60ਫ਼\u0003\u0002\u0002\u0002\u0a61੪\u0005ƤÓ\u0002\u0a62੪\u0005ƦÔ\u0002\u0a63੪\u0005ưÙ\u0002\u0a64੪\u0005ƨÕ\u0002\u0a65੪\u0005ƪÖ\u0002੦੪\u0005ƮØ\u0002੧੪\u0005Ƭ×\u0002੨੪\u0005ƲÚ\u0002੩\u0a61\u0003\u0002\u0002\u0002੩\u0a62\u0003\u0002\u0002\u0002੩\u0a63\u0003\u0002\u0002\u0002੩\u0a64\u0003\u0002\u0002\u0002੩\u0a65\u0003\u0002\u0002\u0002੩੦\u0003\u0002\u0002\u0002੩੧\u0003\u0002\u0002\u0002੩੨\u0003\u0002\u0002\u0002੪ų\u0003\u0002\u0002\u0002੫੬\u0007\u0094\u0002\u0002੬੭\u0005Ű¹\u0002੭੮\u0005Ŷ¼\u0002੮ŵ\u0003\u0002\u0002\u0002੯ੰ\t*\u0002\u0002ੰŷ\u0003\u0002\u0002\u0002ੱੲ\u0005ź¾\u0002ੲੳ\t+\u0002\u0002ੳ\u0a78\u0005ź¾\u0002ੴੵ\t+\u0002\u0002ੵ\u0a77\u0005ź¾\u0002\u0a76ੴ\u0003\u0002\u0002\u0002\u0a77\u0a7a\u0003\u0002\u0002\u0002\u0a78\u0a76\u0003\u0002\u0002\u0002\u0a78\u0a79\u0003\u0002\u0002\u0002\u0a79Ź\u0003\u0002\u0002\u0002\u0a7a\u0a78\u0003\u0002\u0002\u0002\u0a7b\u0a7c\u0007ŝ\u0002\u0002\u0a7c\u0a7d\u0005Ű¹\u0002\u0a7d\u0a7e\u0007Š\u0002\u0002\u0a7eઅ\u0003\u0002\u0002\u0002\u0a7fઅ\u0005ż¿\u0002\u0a80અ\u0005ƄÃ\u0002ઁઅ\u0005ƌÇ\u0002ંઅ\u0005ƎÈ\u0002ઃઅ\u0005Ųº\u0002\u0a84\u0a7b\u0003\u0002\u0002\u0002\u0a84\u0a7f\u0003\u0002\u0002\u0002\u0a84\u0a80\u0003\u0002\u0002\u0002\u0a84ઁ\u0003\u0002\u0002\u0002\u0a84ં\u0003\u0002\u0002\u0002\u0a84ઃ\u0003\u0002\u0002\u0002અŻ\u0003\u0002\u0002\u0002આઉ\u0005žÀ\u0002ઇઉ\u0005ƀÁ\u0002ઈઆ\u0003\u0002\u0002\u0002ઈઇ\u0003\u0002\u0002\u0002ઉŽ\u0003\u0002\u0002\u0002ઊઋ\u0007%\u0002\u0002ઋઑ\u0005Ű¹\u0002ઌઍ\u0007ĭ\u0002\u0002ઍ\u0a8e\u0005Ű¹\u0002\u0a8eએ\u0007Ė\u0002\u0002એઐ\u0005Ű¹\u0002ઐ\u0a92\u0003\u0002\u0002\u0002ઑઌ\u0003\u0002\u0002\u0002\u0a92ઓ\u0003\u0002\u0002\u0002ઓઑ\u0003\u0002\u0002\u0002ઓઔ\u0003\u0002\u0002\u0002ઔગ\u0003\u0002\u0002\u0002કખ\u0007\\\u0002\u0002ખઘ\u0005Ű¹\u0002ગક\u0003\u0002\u0002\u0002ગઘ\u0003\u0002\u0002\u0002ઘઙ\u0003\u0002\u0002\u0002ઙચ\u0007`\u0002\u0002ચſ\u0003\u0002\u0002\u0002છડ\u0007%\u0002\u0002જઝ\u0007ĭ\u0002\u0002ઝઞ\u0005Š±\u0002ઞટ\u0007Ė\u0002\u0002ટઠ\u0005Ű¹\u0002ઠઢ\u0003\u0002\u0002\u0002ડજ\u0003\u0002\u0002\u0002ઢણ\u0003\u0002\u0002\u0002ણડ\u0003\u0002\u0002\u0002ણત\u0003\u0002\u0002\u0002તધ\u0003\u0002\u0002\u0002થદ\u0007\\\u0002\u0002દન\u0005Ű¹\u0002ધથ\u0003\u0002\u0002\u0002ધન\u0003\u0002\u0002\u0002ન\u0aa9\u0003\u0002\u0002\u0002\u0aa9પ\u0007`\u0002\u0002પƁ\u0003\u0002\u0002\u0002ફબ\u0005ƨÕ\u0002બભ\u0007\u0005\u0002\u0002ભમ\t,\u0002\u0002મƃ\u0003\u0002\u0002\u0002યર\u0007\u0015\u0002\u0002રલ\u0007ŝ\u0002\u0002\u0ab1ળ\u0005ƆÄ\u0002લ\u0ab1\u0003\u0002\u0002\u0002લળ\u0003\u0002\u0002\u0002ળ\u0ab4\u0003\u0002\u0002\u0002\u0ab4વ\u0005Ű¹\u0002વષ\u0007Š\u0002\u0002શસ\u0005ƈÅ\u0002ષશ\u0003\u0002\u0002\u0002ષસ\u0003\u0002\u0002\u0002સୈ\u0003\u0002\u0002\u0002હ\u0aba\u00078\u0002\u0002\u0abaી\u0007ŝ\u0002\u0002\u0abbઽ\u0005ƆÄ\u0002઼\u0abb\u0003\u0002\u0002\u0002઼ઽ\u0003\u0002\u0002\u0002ઽા\u0003\u0002\u0002\u0002ાુ\u0005Ű¹\u0002િુ\u0007ś\u0002\u0002ી઼\u0003\u0002\u0002\u0002ીિ\u0003\u0002\u0002\u0002ુૂ\u0003\u0002\u0002\u0002ૂૄ\u0007Š\u0002\u0002ૃૅ\u0005ƈÅ\u0002ૄૃ\u0003\u0002\u0002\u0002ૄૅ\u0003\u0002\u0002\u0002ૅୈ\u0003\u0002\u0002\u0002\u0ac6ે\u00079\u0002\u0002ે્\u0007ŝ\u0002\u0002ૈ\u0aca\u0005ƆÄ\u0002ૉૈ\u0003\u0002\u0002\u0002ૉ\u0aca\u0003\u0002\u0002\u0002\u0acaો\u0003\u0002\u0002\u0002ો\u0ace\u0005Ű¹\u0002ૌ\u0ace\u0007ś\u0002\u0002્ૉ\u0003\u0002\u0002\u0002્ૌ\u0003\u0002\u0002\u0002\u0ace\u0acf\u0003\u0002\u0002\u0002\u0acf\u0ad1\u0007Š\u0002\u0002ૐ\u0ad2\u0005ƈÅ\u0002\u0ad1ૐ\u0003\u0002\u0002\u0002\u0ad1\u0ad2\u0003\u0002\u0002\u0002\u0ad2ୈ\u0003\u0002\u0002\u0002\u0ad3\u0ad4\u0007Ķ\u0002\u0002\u0ad4\u0ad5\u0007ŝ\u0002\u0002\u0ad5\u0ad6\u0007Š\u0002\u0002\u0ad6ୈ\u0005ƈÅ\u0002\u0ad7\u0ad8\u0007ĺ\u0002\u0002\u0ad8\u0ad9\u0007ŝ\u0002\u0002\u0ad9\u0ada\u0007Š\u0002\u0002\u0adaୈ\u0005ƈÅ\u0002\u0adb\u0adc\u0007Ļ\u0002\u0002\u0adc\u0add\u0007ŝ\u0002\u0002\u0add\u0ade\u0005Ű¹\u0002\u0ade\u0adf\u0007Š\u0002\u0002\u0adfૠ\u0005ƈÅ\u0002ૠୈ\u0003\u0002\u0002\u0002ૡૢ\u0007ļ\u0002\u0002ૢૣ\u0007ŝ\u0002\u0002ૣ૪\u0005Ű¹\u0002\u0ae4\u0ae5\u0007ŏ\u0002\u0002\u0ae5૨\u0005Ű¹\u0002૦૧\u0007ŏ\u0002\u0002૧૩\u0005Ű¹\u0002૨૦\u0003\u0002\u0002\u0002૨૩\u0003\u0002\u0002\u0002૩૫\u0003\u0002\u0002\u0002૪\u0ae4\u0003\u0002\u0002\u0002૪૫\u0003\u0002\u0002\u0002૫૬\u0003\u0002\u0002\u0002૬૭\u0007Š\u0002\u0002૭૮\u0005ƈÅ\u0002૮ୈ\u0003\u0002\u0002\u0002૯૰\u0007Ľ\u0002\u0002૰૱\u0007ŝ\u0002\u0002૱\u0af2\u0005Ű¹\u0002\u0af2\u0af3\u0007Š\u0002\u0002\u0af3\u0af4\u0005ƈÅ\u0002\u0af4ୈ\u0003\u0002\u0002\u0002\u0af5\u0af6\u0007ľ\u0002\u0002\u0af6\u0af7\u0007ŝ\u0002\u0002\u0af7\u0afe\u0005Ű¹\u0002\u0af8\u0af9\u0007ŏ\u0002\u0002\u0af9\u0afc\u0005Ű¹\u0002\u0afa\u0afb\u0007ŏ\u0002\u0002\u0afb\u0afd\u0005Ű¹\u0002\u0afc\u0afa\u0003\u0002\u0002\u0002\u0afc\u0afd\u0003\u0002\u0002\u0002\u0afd\u0aff\u0003\u0002\u0002\u0002\u0afe\u0af8\u0003\u0002\u0002\u0002\u0afe\u0aff\u0003\u0002\u0002\u0002\u0aff\u0b00\u0003\u0002\u0002\u0002\u0b00ଁ\u0007Š\u0002\u0002ଁଂ\u0005ƈÅ\u0002ଂୈ\u0003\u0002\u0002\u0002ଃ\u0b04\u0007¯\u0002\u0002\u0b04ଆ\u0007ŝ\u0002\u0002ଅଇ\u0005ƆÄ\u0002ଆଅ\u0003\u0002\u0002\u0002ଆଇ\u0003\u0002\u0002\u0002ଇଈ\u0003\u0002\u0002\u0002ଈଉ\u0005Ű¹\u0002ଉଋ\u0007Š\u0002\u0002ଊଌ\u0005ƈÅ\u0002ଋଊ\u0003\u0002\u0002\u0002ଋଌ\u0003\u0002\u0002\u0002ଌୈ\u0003\u0002\u0002\u0002\u0b0d\u0b0e\u0007µ\u0002\u0002\u0b0eଐ\u0007ŝ\u0002\u0002ଏ\u0b11\u0005ƆÄ\u0002ଐଏ\u0003\u0002\u0002\u0002ଐ\u0b11\u0003\u0002\u0002\u0002\u0b11\u0b12\u0003\u0002\u0002\u0002\u0b12ଓ\u0005Ű¹\u0002ଓକ\u0007Š\u0002\u0002ଔଖ\u0005ƈÅ\u0002କଔ\u0003\u0002\u0002\u0002କଖ\u0003\u0002\u0002\u0002ଖୈ\u0003\u0002\u0002\u0002ଗଘ\u0007Ň\u0002\u0002ଘଙ\u0007ŝ\u0002\u0002ଙଚ\u0007Š\u0002\u0002ଚୈ\u0005ƈÅ\u0002ଛଜ\u0007ň\u0002\u0002ଜଝ\u0007ŝ\u0002\u0002ଝଞ\u0007Š\u0002\u0002ଞୈ\u0005ƈÅ\u0002ଟଠ\u0007ŉ\u0002\u0002ଠଢ\u0007ŝ\u0002\u0002ଡଣ\u0005ƆÄ\u0002ଢଡ\u0003\u0002\u0002\u0002ଢଣ\u0003\u0002\u0002\u0002ଣତ\u0003\u0002\u0002\u0002ତଥ\u0005Ű¹\u0002ଥଧ\u0007Š\u0002\u0002ଦନ\u0005ƈÅ\u0002ଧଦ\u0003\u0002\u0002\u0002ଧନ\u0003\u0002\u0002\u0002ନୈ\u0003\u0002\u0002\u0002\u0b29ପ\u0007ď\u0002\u0002ପବ\u0007ŝ\u0002\u0002ଫଭ\u0005ƆÄ\u0002ବଫ\u0003\u0002\u0002\u0002ବଭ\u0003\u0002\u0002\u0002ଭମ\u0003\u0002\u0002\u0002ମଯ\u0005Ű¹\u0002ଯ\u0b31\u0007Š\u0002\u0002ରଲ\u0005ƈÅ\u0002\u0b31ର\u0003\u0002\u0002\u0002\u0b31ଲ\u0003\u0002\u0002\u0002ଲୈ\u0003\u0002\u0002\u0002ଳ\u0b34\u0007Ĩ\u0002\u0002\u0b34ଶ\u0007ŝ\u0002\u0002ଵଷ\u0005ƆÄ\u0002ଶଵ\u0003\u0002\u0002\u0002ଶଷ\u0003\u0002\u0002\u0002ଷସ\u0003\u0002\u0002\u0002ସହ\u0005Ű¹\u0002ହ\u0b3b\u0007Š\u0002\u0002\u0b3a଼\u0005ƈÅ\u0002\u0b3b\u0b3a\u0003\u0002\u0002\u0002\u0b3b଼\u0003\u0002\u0002\u0002଼ୈ\u0003\u0002\u0002\u0002ଽା\u0007ŋ\u0002\u0002ାୀ\u0007ŝ\u0002\u0002ିୁ\u0005ƆÄ\u0002ୀି\u0003\u0002\u0002\u0002ୀୁ\u0003\u0002\u0002\u0002ୁୂ\u0003\u0002\u0002\u0002ୂୃ\u0005Ű¹\u0002ୃ\u0b45\u0007Š\u0002\u0002ୄ\u0b46\u0005ƈÅ\u0002\u0b45ୄ\u0003\u0002\u0002\u0002\u0b45\u0b46\u0003\u0002\u0002\u0002\u0b46ୈ\u0003\u0002\u0002\u0002େય\u0003\u0002\u0002\u0002େહ\u0003\u0002\u0002\u0002େ\u0ac6\u0003\u0002\u0002\u0002େ\u0ad3\u0003\u0002\u0002\u0002େ\u0ad7\u0003\u0002\u0002\u0002େ\u0adb\u0003\u0002\u0002\u0002େૡ\u0003\u0002\u0002\u0002େ૯\u0003\u0002\u0002\u0002େ\u0af5\u0003\u0002\u0002\u0002େଃ\u0003\u0002\u0002\u0002େ\u0b0d\u0003\u0002\u0002\u0002େଗ\u0003\u0002\u0002\u0002େଛ\u0003\u0002\u0002\u0002େଟ\u0003\u0002\u0002\u0002େ\u0b29\u0003\u0002\u0002\u0002େଳ\u0003\u0002\u0002\u0002େଽ\u0003\u0002\u0002\u0002ୈƅ\u0003\u0002\u0002\u0002\u0b49\u0b4a\t#\u0002\u0002\u0b4aƇ\u0003\u0002\u0002\u0002ୋୌ\u0007Í\u0002\u0002ୌ\u0b4e\u0007ŝ\u0002\u0002୍\u0b4f\u0005ƊÆ\u0002\u0b4e୍\u0003\u0002\u0002\u0002\u0b4e\u0b4f\u0003\u0002\u0002\u0002\u0b4f\u0b51\u0003\u0002\u0002\u0002\u0b50\u0b52\u0005ņ¤\u0002\u0b51\u0b50\u0003\u0002\u0002\u0002\u0b51\u0b52\u0003\u0002\u0002\u0002\u0b52\u0b53\u0003\u0002\u0002\u0002\u0b53\u0b54\u0007Š\u0002\u0002\u0b54Ɖ\u0003\u0002\u0002\u0002\u0b55ୖ\u0007Ñ\u0002\u0002ୖୗ\u0007 \u0002\u0002ୗଡ଼\u0005Ű¹\u0002\u0b58\u0b59\u0007ŏ\u0002\u0002\u0b59\u0b5b\u0005Ű¹\u0002\u0b5a\u0b58\u0003\u0002\u0002\u0002\u0b5b\u0b5e\u0003\u0002\u0002\u0002ଡ଼\u0b5a\u0003\u0002\u0002\u0002ଡ଼ଢ଼\u0003\u0002\u0002\u0002ଢ଼Ƌ\u0003\u0002\u0002\u0002\u0b5eଡ଼\u0003\u0002\u0002\u0002ୟన\u0007ĵ\u0002\u0002ୠୡ\u0007'\u0002\u0002ୡୢ\u0007ŝ\u0002\u0002ୢୣ\u0005Ű¹\u0002ୣ\u0b64\u0007\u0010\u0002\u0002\u0b64୦\u0005r:\u0002\u0b65୧\u0005t;\u0002୦\u0b65\u0003\u0002\u0002\u0002୦୧\u0003\u0002\u0002\u0002୧୨\u0003\u0002\u0002\u0002୨୩\u0007Š\u0002\u0002୩న\u0003\u0002\u0002\u0002୪୫\u00078\u0002\u0002୫୮\u0007ŝ\u0002\u0002୬୯\u0005Ű¹\u0002୭୯\u0007ś\u0002\u0002୮୬\u0003\u0002\u0002\u0002୮୭\u0003\u0002\u0002\u0002୯୰\u0003\u0002\u0002\u0002୰న\u0007Š\u0002\u0002ୱన\u0007ķ\u0002\u0002୲୳\u0007>\u0002\u0002୳న\u0007B\u0002\u0002୴\u0b78\u0007ĸ\u0002\u0002୵୶\u0007>\u0002\u0002୶\u0b78\u0007ė\u0002\u0002୷୴\u0003\u0002\u0002\u0002୷୵\u0003\u0002\u0002\u0002\u0b78\u0b7d\u0003\u0002\u0002\u0002\u0b79\u0b7a\u0007ŝ\u0002\u0002\u0b7a\u0b7b\u0005Ű¹\u0002\u0b7b\u0b7c\u0007Š\u0002\u0002\u0b7c\u0b7e\u0003\u0002\u0002\u0002\u0b7d\u0b79\u0003\u0002\u0002\u0002\u0b7d\u0b7e\u0003\u0002\u0002\u0002\u0b7eన\u0003\u0002\u0002\u0002\u0b7fన\u0007Ĺ\u0002\u0002\u0b80\u0b81\u0007>\u0002\u0002\u0b81న\u0007Ō\u0002\u0002ஂஃ\u0007Ŀ\u0002\u0002ஃ\u0b84\u0007ŝ\u0002\u0002\u0b84\u0b91\u0005Ű¹\u0002அஆ\u0007ŏ\u0002\u0002ஆஎ\u0005Ű¹\u0002இஈ\u0007ŏ\u0002\u0002ஈஉ\u0005Ű¹\u0002உஊ\u0007œ\u0002\u0002ஊ\u0b8b\u0005Ű¹\u0002\u0b8b\u0b8d\u0003\u0002\u0002\u0002\u0b8cஇ\u0003\u0002\u0002\u0002\u0b8dஐ\u0003\u0002\u0002\u0002எ\u0b8c\u0003\u0002\u0002\u0002எஏ\u0003\u0002\u0002\u0002ஏஒ\u0003\u0002\u0002\u0002ஐஎ\u0003\u0002\u0002\u0002\u0b91அ\u0003\u0002\u0002\u0002\u0b91ஒ\u0003\u0002\u0002\u0002ஒஓ\u0003\u0002\u0002\u0002ஓஔ\u0007Š\u0002\u0002ஔన\u0003\u0002\u0002\u0002க\u0b96\u0007ŀ\u0002\u0002\u0b96\u0b97\u0007ŝ\u0002\u0002\u0b97த\u0005Ű¹\u0002\u0b98ங\u0007ŏ\u0002\u0002ங\u0ba1\u0005Ű¹\u0002ச\u0b9b\u0007ŏ\u0002\u0002\u0b9bஜ\u0005Ű¹\u0002ஜ\u0b9d\u0007œ\u0002\u0002\u0b9dஞ\u0005Ű¹\u0002ஞ\u0ba0\u0003\u0002\u0002\u0002டச\u0003\u0002\u0002\u0002\u0ba0ண\u0003\u0002\u0002\u0002\u0ba1ட\u0003\u0002\u0002\u0002\u0ba1\u0ba2\u0003\u0002\u0002\u0002\u0ba2\u0ba5\u0003\u0002\u0002\u0002ண\u0ba1\u0003\u0002\u0002\u0002த\u0b98\u0003\u0002\u0002\u0002த\u0ba5\u0003\u0002\u0002\u0002\u0ba5\u0ba6\u0003\u0002\u0002\u0002\u0ba6\u0ba7\u0007Š\u0002\u0002\u0ba7న\u0003\u0002\u0002\u0002நன\u0007Ł\u0002\u0002னப\u0007ŝ\u0002\u0002பஷ\u0005Ű¹\u0002\u0bab\u0bac\u0007ŏ\u0002\u0002\u0bacழ\u0005Ű¹\u0002\u0badம\u0007ŏ\u0002\u0002மய\u0005Ű¹\u0002யர\u0007œ\u0002\u0002ரற\u0005Ű¹\u0002றள\u0003\u0002\u0002\u0002ல\u0bad\u0003\u0002\u0002\u0002ளஶ\u0003\u0002\u0002\u0002ழல\u0003\u0002\u0002\u0002ழவ\u0003\u0002\u0002\u0002வஸ\u0003\u0002\u0002\u0002ஶழ\u0003\u0002\u0002\u0002ஷ\u0bab\u0003\u0002\u0002\u0002ஷஸ\u0003\u0002\u0002\u0002ஸஹ\u0003\u0002\u0002\u0002ஹ\u0bba\u0007Š\u0002\u0002\u0bbaన\u0003\u0002\u0002\u0002\u0bbb\u0bbc\u0007ł\u0002\u0002\u0bbc\u0bbd\u0007ŝ\u0002\u0002\u0bbdொ\u0005Ű¹\u0002ாி\u0007ŏ\u0002\u0002ிே\u0005Ű¹\u0002ீு\u0007ŏ\u0002\u0002ுூ\u0005Ű¹\u0002ூ\u0bc3\u0007œ\u0002\u0002\u0bc3\u0bc4\u0005Ű¹\u0002\u0bc4ெ\u0003\u0002\u0002\u0002\u0bc5ீ\u0003\u0002\u0002\u0002ெ\u0bc9\u0003\u0002\u0002\u0002ே\u0bc5\u0003\u0002\u0002\u0002ேை\u0003\u0002\u0002\u0002ைோ\u0003\u0002\u0002\u0002\u0bc9ே\u0003\u0002\u0002\u0002ொா\u0003\u0002\u0002\u0002ொோ\u0003\u0002\u0002\u0002ோௌ\u0003\u0002\u0002\u0002ௌ்\u0007Š\u0002\u0002்న\u0003\u0002\u0002\u0002\u0bce\u0bcf\u0007Ń\u0002\u0002\u0bcfௐ\u0007ŝ\u0002\u0002ௐ\u0bdd\u0005Ű¹\u0002\u0bd1\u0bd2\u0007ŏ\u0002\u0002\u0bd2\u0bda\u0005Ű¹\u0002\u0bd3\u0bd4\u0007ŏ\u0002\u0002\u0bd4\u0bd5\u0005Ű¹\u0002\u0bd5\u0bd6\u0007œ\u0002\u0002\u0bd6ௗ\u0005Ű¹\u0002ௗ\u0bd9\u0003\u0002\u0002\u0002\u0bd8\u0bd3\u0003\u0002\u0002\u0002\u0bd9\u0bdc\u0003\u0002\u0002\u0002\u0bda\u0bd8\u0003\u0002\u0002\u0002\u0bda\u0bdb\u0003\u0002\u0002\u0002\u0bdb\u0bde\u0003\u0002\u0002\u0002\u0bdc\u0bda\u0003\u0002\u0002\u0002\u0bdd\u0bd1\u0003\u0002\u0002\u0002\u0bdd\u0bde\u0003\u0002\u0002\u0002\u0bde\u0bdf\u0003\u0002\u0002\u0002\u0bdf\u0be0\u0007Š\u0002\u0002\u0be0న\u0003\u0002\u0002\u0002\u0be1\u0be2\u0007ń\u0002\u0002\u0be2\u0be3\u0007ŝ\u0002\u0002\u0be3௰\u0005Ű¹\u0002\u0be4\u0be5\u0007ŏ\u0002\u0002\u0be5௭\u0005Ű¹\u0002௦௧\u0007ŏ\u0002\u0002௧௨\u0005Ű¹\u0002௨௩\u0007œ\u0002\u0002௩௪\u0005Ű¹\u0002௪௬\u0003\u0002\u0002\u0002௫௦\u0003\u0002\u0002\u0002௬௯\u0003\u0002\u0002\u0002௭௫\u0003\u0002\u0002\u0002௭௮\u0003\u0002\u0002\u0002௮௱\u0003\u0002\u0002\u0002௯௭\u0003\u0002\u0002\u0002௰\u0be4\u0003\u0002\u0002\u0002௰௱\u0003\u0002\u0002\u0002௱௲\u0003\u0002\u0002\u0002௲௳\u0007Š\u0002\u0002௳న\u0003\u0002\u0002\u0002௴௵\u0007Ņ\u0002\u0002௵௶\u0007ŝ\u0002\u0002௶\u0bfe\u0005Ű¹\u0002௷௸\u0007ŏ\u0002\u0002௸௹\u0005Ű¹\u0002௹௺\u0007œ\u0002\u0002௺\u0bfb\u0005Ű¹\u0002\u0bfb\u0bfd\u0003\u0002\u0002\u0002\u0bfc௷\u0003\u0002\u0002\u0002\u0bfd\u0c00\u0003\u0002\u0002\u0002\u0bfe\u0bfc\u0003\u0002\u0002\u0002\u0bfe\u0bff\u0003\u0002\u0002\u0002\u0bffఁ\u0003\u0002\u0002\u0002\u0c00\u0bfe\u0003\u0002\u0002\u0002ఁం\u0007Š\u0002\u0002ంన\u0003\u0002\u0002\u0002ః\u0c04\u0007ņ\u0002\u0002\u0c04అ\u0007ŝ\u0002\u0002అఋ\u0005Ű¹\u0002ఆఇ\u0007ŏ\u0002\u0002ఇఈ\u0005Ű¹\u0002ఈఉ\u0007œ\u0002\u0002ఉఊ\u0005Ű¹\u0002ఊఌ\u0003\u0002\u0002\u0002ఋఆ\u0003\u0002\u0002\u0002ఌ\u0c0d\u0003\u0002\u0002\u0002\u0c0dఋ\u0003\u0002\u0002\u0002\u0c0dఎ\u0003\u0002\u0002\u0002ఎ\u0c11\u0003\u0002\u0002\u0002ఏఐ\u0007ŏ\u0002\u0002ఐఒ\u0005Ű¹\u0002\u0c11ఏ\u0003\u0002\u0002\u0002\u0c11ఒ\u0003\u0002\u0002\u0002ఒఓ\u0003\u0002\u0002\u0002ఓఔ\u0007Š\u0002\u0002ఔన\u0003\u0002\u0002\u0002కఖ\u0007ô\u0002\u0002ఖగ\u0007ŝ\u0002\u0002గఘ\u0005Ű¹\u0002ఘఙ\u0007Š\u0002\u0002ఙన\u0003\u0002\u0002\u0002చఛ\u0007Ď\u0002\u0002ఛజ\u0007ŝ\u0002\u0002జఝ\u0005Ű¹\u0002ఝఞ\u0007t\u0002\u0002ఞడ\u0005Ű¹\u0002టఠ\u0007p\u0002\u0002ఠఢ\u0005Ű¹\u0002డట\u0003\u0002\u0002\u0002డఢ\u0003\u0002\u0002\u0002ఢణ\u0003\u0002\u0002\u0002ణత\u0007Š\u0002\u0002తన\u0003\u0002\u0002\u0002థన\u0007Ŋ\u0002\u0002దన\u0007Ō\u0002\u0002ధୟ\u0003\u0002\u0002\u0002ధୠ\u0003\u0002\u0002\u0002ధ୪\u0003\u0002\u0002\u0002ధୱ\u0003\u0002\u0002\u0002ధ୲\u0003\u0002\u0002\u0002ధ୷\u0003\u0002\u0002\u0002ధ\u0b7f\u0003\u0002\u0002\u0002ధ\u0b80\u0003\u0002\u0002\u0002ధஂ\u0003\u0002\u0002\u0002ధக\u0003\u0002\u0002\u0002ధந\u0003\u0002\u0002\u0002ధ\u0bbb\u0003\u0002\u0002\u0002ధ\u0bce\u0003\u0002\u0002\u0002ధ\u0be1\u0003\u0002\u0002\u0002ధ௴\u0003\u0002\u0002\u0002ధః\u0003\u0002\u0002\u0002ధక\u0003\u0002\u0002\u0002ధచ\u0003\u0002\u0002\u0002ధథ\u0003\u0002\u0002\u0002ధద\u0003\u0002\u0002\u0002నƍ\u0003\u0002\u0002\u0002\u0c29ప\u0005ƨÕ\u0002పబ\u0007ŝ\u0002\u0002ఫభ\u0005ƐÉ\u0002బఫ\u0003\u0002\u0002\u0002బభ\u0003\u0002\u0002\u0002భమ\u0003\u0002\u0002\u0002మయ\u0007Š\u0002\u0002యƏ\u0003\u0002\u0002\u0002రవ\u0005ƒÊ\u0002ఱల\u0007ŏ\u0002\u0002ల\u0c34\u0005ƒÊ\u0002ళఱ\u0003\u0002\u0002\u0002\u0c34ష\u0003\u0002\u0002\u0002వళ\u0003\u0002\u0002\u0002వశ\u0003\u0002\u0002\u0002శƑ\u0003\u0002\u0002\u0002షవ\u0003\u0002\u0002\u0002సా\u0006Ê\r\u0002హ\u0c3a\u0005ƨÕ\u0002\u0c3a\u0c3c\u0007œ\u0002\u0002\u0c3bఽ\u0007ŗ\u0002\u0002\u0c3c\u0c3b\u0003\u0002\u0002\u0002\u0c3cఽ\u0003\u0002\u0002\u0002ఽి\u0003\u0002\u0002\u0002ాహ\u0003\u0002\u0002\u0002ాి\u0003\u0002\u0002\u0002ిీ\u0003\u0002\u0002\u0002ీు\u0005Ű¹\u0002ుƓ\u0003\u0002\u0002\u0002ూ\u0c45\u0005Ď\u0088\u0002ృ\u0c45\u0005Ű¹\u0002ౄూ\u0003\u0002\u0002\u0002ౄృ\u0003\u0002\u0002\u0002\u0c45ƕ\u0003\u0002\u0002\u0002ె\u0c49\u0005ƢÒ\u0002ే\u0c49\u0005Ű¹\u0002ైె\u0003\u0002\u0002\u0002ైే\u0003\u0002\u0002\u0002\u0c49Ɨ\u0003\u0002\u0002\u0002ొ\u0c4e\u0007\u0081\u0002\u0002ో్\u0005ƚÎ\u0002ౌో\u0003\u0002\u0002\u0002్\u0c50\u0003\u0002\u0002\u0002\u0c4eౌ\u0003\u0002\u0002\u0002\u0c4e\u0c4f\u0003\u0002\u0002\u0002\u0c4fƙ\u0003\u0002\u0002\u0002\u0c50\u0c4e\u0003\u0002\u0002\u0002\u0c51\u0c52\u0007ţ\u0002\u0002\u0c52\u0c53\u0005ƨÕ\u0002\u0c53\u0c54\u0005Ű¹\u0002\u0c54\u0c5e\u0003\u0002\u0002\u0002ౕౖ\u0007ţ\u0002\u0002ౖ\u0c57\u0005ƨÕ\u0002\u0c57ౘ\u0007Ť\u0002\u0002ౘౙ\u0007œ\u0002\u0002ౙ\u0c5a\u0005Ű¹\u0002\u0c5a\u0c5e\u0003\u0002\u0002\u0002\u0c5b\u0c5c\u0007ţ\u0002\u0002\u0c5c\u0c5e\u0005ƨÕ\u0002\u0c5d\u0c51\u0003\u0002\u0002\u0002\u0c5dౕ\u0003\u0002\u0002\u0002\u0c5d\u0c5b\u0003\u0002\u0002\u0002\u0c5eƛ\u0003\u0002\u0002\u0002\u0c5fౠ\u0007\u0007\u0002\u0002ౠౡ\u0005ƞÐ\u0002ౡౢ\u0007Ţ\u0002\u0002ౢ\u0c65\u0003\u0002\u0002\u0002ౣ\u0c65\u0005ƠÑ\u0002\u0c64\u0c5f\u0003\u0002\u0002\u0002\u0c64ౣ\u0003\u0002\u0002\u0002\u0c65Ɲ\u0003\u0002\u0002\u0002౦౨\u000b\u0002\u0002\u0002౧౦\u0003\u0002\u0002\u0002౨౫\u0003\u0002\u0002\u0002౩౪\u0003\u0002\u0002\u0002౩౧\u0003\u0002\u0002\u0002౪Ɵ\u0003\u0002\u0002\u0002౫౩\u0003\u0002\u0002\u0002౬౭\u0007\u0082\u0002\u0002౭౮\u0005Ű¹\u0002౮ơ\u0003\u0002\u0002\u0002౯౾\u0007Ŭ\u0002\u0002\u0c70\u0c74\u0007ő\u0002\u0002\u0c71\u0c72\u0007\u0006\u0002\u0002\u0c72\u0c74\u0007ő\u0002\u0002\u0c73\u0c70\u0003\u0002\u0002\u0002\u0c73\u0c71\u0003\u0002\u0002\u0002\u0c73\u0c74\u0003\u0002\u0002\u0002\u0c74\u0c75\u0003\u0002\u0002\u0002\u0c75౺\u0005ƨÕ\u0002\u0c76\u0c77\u0007ő\u0002\u0002\u0c77౹\u0005ƨÕ\u0002౸\u0c76\u0003\u0002\u0002\u0002౹౼\u0003\u0002\u0002\u0002౺౸\u0003\u0002\u0002\u0002౺౻\u0003\u0002\u0002\u0002౻౾\u0003\u0002\u0002\u0002౼౺\u0003\u0002\u0002\u0002౽౯\u0003\u0002\u0002\u0002౽\u0c73\u0003\u0002\u0002\u0002౾ƣ\u0003\u0002\u0002\u0002౿\u0c80\u0007B\u0002\u0002\u0c80\u0c81\u0005ƪÖ\u0002\u0c81ƥ\u0003\u0002\u0002\u0002ಂಃ\u0007ė\u0002\u0002ಃ\u0c84\u0005ƪÖ\u0002\u0c84Ƨ\u0003\u0002\u0002\u0002ಅಈ\u0007Ť\u0002\u0002ಆಈ\u0005ƴÛ\u0002ಇಅ\u0003\u0002\u0002\u0002ಇಆ\u0003\u0002\u0002\u0002ಈƩ\u0003\u0002\u0002\u0002ಉಌ\u0007ť\u0002\u0002ಊಌ\u0007Ŧ\u0002\u0002ಋಉ\u0003\u0002\u0002\u0002ಋಊ\u0003\u0002\u0002\u0002ಌƫ\u0003\u0002\u0002\u0002\u0c8dಏ\t-\u0002\u0002ಎ\u0c8d\u0003\u0002\u0002\u0002ಎಏ\u0003\u0002\u0002\u0002ಏಐ\u0003\u0002\u0002\u0002ಐ\u0c91\u0007ŧ\u0002\u0002\u0c91ƭ\u0003\u0002\u0002\u0002ಒಔ\t-\u0002\u0002ಓಒ\u0003\u0002\u0002\u0002ಓಔ\u0003\u0002\u0002\u0002ಔಕ\u0003\u0002\u0002\u0002ಕಖ\u0007Ũ\u0002\u0002ಖƯ\u0003\u0002\u0002\u0002ಗಘ\t.\u0002\u0002ಘƱ\u0003\u0002\u0002\u0002ಙಚ\u0007Á\u0002\u0002ಚƳ\u0003\u0002\u0002\u0002ಛಜ\t/\u0002\u0002ಜƵ\u0003\u0002\u0002\u0002ƙƺƽǁǄǉǐǖǘǡǤǦȣȫȻɂɅɊɎɗɜɤɩɲɾʃʆʔʛʤʵʹˁˌ˖˞˥˩˭˲˶˻˿̷̛̖̟̬̱͈̃̍̑̾ͅ͏͖ͤͪ͜͟ͱͷͼ\u0382·ΊΐΞΨήγθνρφωϓϟϦϩϵϻϾЅАНПФгнчёѥѫѯѴѸѽҀ҅҈ҔқҠҥҩҮұһӇӎӖӤԃԅԊԎԓԚԝԠԦ\u052dԳԺՀՃՈՌՏՖ՜՟թղչրւ\u0588\u058bֳֶֹּֿ֖֥ׅ֮֟֫\u05cfךםפש\u05eeײ\u05fa\u05fe\u0603؇؉؎ؖ؛ءبثزغقموٌٕٙ٣ٰٷٹٽځډڔڝڥڭڱڹۋۭۙ۠ۤ۫۱ۺ܈\u070eܒܛܦܮܷܻ݁݇\u074bݕݠݫݯݱݵݹޅތޜޣޭ\u07b4\u07bb\u07bd߁߅ߊߍߑߔߟߢ߬ߵ\u07fcࠀࠄࠋࠏࠗࠝࠡࠬ࠳ࡀࡈࡌࡖ࡛\u0868\u0873\u087b\u087f\u0883\u0887\u0889\u088e\u0891\u0894\u0897\u089a\u089dࢠࢣࢦ\u08ad\u08b8\u08bc\u08bf\u08c3\u08ca\u08ce\u08d8\u08e0ࣰࣦࣹ࣪ࣼँऄऎओजडथमलीॊॏ॓ख़।०७॰ॷॿংঅঔছঞডথপর\u09b4িৃ\u09c6\u09caৎ\u09d1\u09d4\u09d8\u09de\u09e5৭৳৸\u0a04ਈ\u0a11ਕਟਤ\u0a3a\u0a3dੌੜਫ਼੩\u0a78\u0a84ઈઓગણધલષ઼ીૄૉ્\u0ad1૨૪\u0afc\u0afeଆଋଐକଢଧବ\u0b31ଶ\u0b3bୀ\u0b45େ\u0b4e\u0b51ଡ଼୦୮୷\u0b7dஎ\u0b91\u0ba1தழஷேொ\u0bda\u0bdd௭௰\u0bfe\u0c0d\u0c11డధబవ\u0c3cాౄై\u0c4e\u0c5d\u0c64౩\u0c73౺౽ಇಋಎಓ"}, "");
		_ATN = (new ATNDeserializer()).deserialize(_serializedATN.toCharArray());
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];

		for(i = 0; i < _ATN.getNumberOfDecisions(); ++i) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}

	}

	public static class Non_reserved_wordsContext extends ParserRuleContext {
		public TerminalNode T_ACTION() {
			return this.getToken(6, 0);
		}

		public TerminalNode T_ACTIVITY_COUNT() {
			return this.getToken(307, 0);
		}

		public TerminalNode T_ADD2() {
			return this.getToken(7, 0);
		}

		public TerminalNode T_ALL() {
			return this.getToken(8, 0);
		}

		public TerminalNode T_ALLOCATE() {
			return this.getToken(9, 0);
		}

		public TerminalNode T_ALTER() {
			return this.getToken(10, 0);
		}

		public TerminalNode T_AND() {
			return this.getToken(11, 0);
		}

		public TerminalNode T_ANSI_NULLS() {
			return this.getToken(12, 0);
		}

		public TerminalNode T_ANSI_PADDING() {
			return this.getToken(13, 0);
		}

		public TerminalNode T_AS() {
			return this.getToken(14, 0);
		}

		public TerminalNode T_ASC() {
			return this.getToken(15, 0);
		}

		public TerminalNode T_ASSOCIATE() {
			return this.getToken(16, 0);
		}

		public TerminalNode T_AT() {
			return this.getToken(17, 0);
		}

		public TerminalNode T_AUTO_INCREMENT() {
			return this.getToken(18, 0);
		}

		public TerminalNode T_AVG() {
			return this.getToken(19, 0);
		}

		public TerminalNode T_BATCHSIZE() {
			return this.getToken(20, 0);
		}

		public TerminalNode T_BEGIN() {
			return this.getToken(21, 0);
		}

		public TerminalNode T_BETWEEN() {
			return this.getToken(22, 0);
		}

		public TerminalNode T_BIGINT() {
			return this.getToken(23, 0);
		}

		public TerminalNode T_BINARY_DOUBLE() {
			return this.getToken(24, 0);
		}

		public TerminalNode T_BINARY_FLOAT() {
			return this.getToken(25, 0);
		}

		public TerminalNode T_BIT() {
			return this.getToken(27, 0);
		}

		public TerminalNode T_BODY() {
			return this.getToken(28, 0);
		}

		public TerminalNode T_BREAK() {
			return this.getToken(29, 0);
		}

		public TerminalNode T_BY() {
			return this.getToken(30, 0);
		}

		public TerminalNode T_BYTE() {
			return this.getToken(31, 0);
		}

		public TerminalNode T_CALL() {
			return this.getToken(32, 0);
		}

		public TerminalNode T_CALLER() {
			return this.getToken(33, 0);
		}

		public TerminalNode T_CASCADE() {
			return this.getToken(34, 0);
		}

		public TerminalNode T_CASE() {
			return this.getToken(35, 0);
		}

		public TerminalNode T_CASESPECIFIC() {
			return this.getToken(36, 0);
		}

		public TerminalNode T_CAST() {
			return this.getToken(37, 0);
		}

		public TerminalNode T_CHAR() {
			return this.getToken(38, 0);
		}

		public TerminalNode T_CHARACTER() {
			return this.getToken(39, 0);
		}

		public TerminalNode T_CHARSET() {
			return this.getToken(40, 0);
		}

		public TerminalNode T_CLIENT() {
			return this.getToken(41, 0);
		}

		public TerminalNode T_CLOSE() {
			return this.getToken(42, 0);
		}

		public TerminalNode T_CLUSTERED() {
			return this.getToken(43, 0);
		}

		public TerminalNode T_CMP() {
			return this.getToken(44, 0);
		}

		public TerminalNode T_COLLECTION() {
			return this.getToken(45, 0);
		}

		public TerminalNode T_COMMENT() {
			return this.getToken(46, 0);
		}

		public TerminalNode T_CONSTANT() {
			return this.getToken(47, 0);
		}

		public TerminalNode T_COPY() {
			return this.getToken(53, 0);
		}

		public TerminalNode T_COMMIT() {
			return this.getToken(48, 0);
		}

		public TerminalNode T_CONCAT() {
			return this.getToken(49, 0);
		}

		public TerminalNode T_CONDITION() {
			return this.getToken(50, 0);
		}

		public TerminalNode T_CONSTRAINT() {
			return this.getToken(51, 0);
		}

		public TerminalNode T_CONTINUE() {
			return this.getToken(52, 0);
		}

		public TerminalNode T_COUNT() {
			return this.getToken(54, 0);
		}

		public TerminalNode T_COUNT_BIG() {
			return this.getToken(55, 0);
		}

		public TerminalNode T_CREATE() {
			return this.getToken(56, 0);
		}

		public TerminalNode T_CREATION() {
			return this.getToken(57, 0);
		}

		public TerminalNode T_CREATOR() {
			return this.getToken(58, 0);
		}

		public TerminalNode T_CS() {
			return this.getToken(59, 0);
		}

		public TerminalNode T_CUME_DIST() {
			return this.getToken(308, 0);
		}

		public TerminalNode T_CURRENT() {
			return this.getToken(60, 0);
		}

		public TerminalNode T_CURRENT_DATE() {
			return this.getToken(309, 0);
		}

		public TerminalNode T_CURRENT_SCHEMA() {
			return this.getToken(61, 0);
		}

		public TerminalNode T_CURRENT_TIMESTAMP() {
			return this.getToken(310, 0);
		}

		public TerminalNode T_CURRENT_USER() {
			return this.getToken(311, 0);
		}

		public TerminalNode T_CURSOR() {
			return this.getToken(62, 0);
		}

		public TerminalNode T_DATABASE() {
			return this.getToken(63, 0);
		}

		public TerminalNode T_DATE() {
			return this.getToken(64, 0);
		}

		public TerminalNode T_DATETIME() {
			return this.getToken(65, 0);
		}

		public TerminalNode T_DAY() {
			return this.getToken(66, 0);
		}

		public TerminalNode T_DAYS() {
			return this.getToken(67, 0);
		}

		public TerminalNode T_DEC() {
			return this.getToken(68, 0);
		}

		public TerminalNode T_DECIMAL() {
			return this.getToken(69, 0);
		}

		public TerminalNode T_DECLARE() {
			return this.getToken(70, 0);
		}

		public TerminalNode T_DEFAULT() {
			return this.getToken(71, 0);
		}

		public TerminalNode T_DEFERRED() {
			return this.getToken(72, 0);
		}

		public TerminalNode T_DEFINED() {
			return this.getToken(73, 0);
		}

		public TerminalNode T_DEFINER() {
			return this.getToken(74, 0);
		}

		public TerminalNode T_DEFINITION() {
			return this.getToken(75, 0);
		}

		public TerminalNode T_DELETE() {
			return this.getToken(76, 0);
		}

		public TerminalNode T_DELIMITED() {
			return this.getToken(77, 0);
		}

		public TerminalNode T_DELIMITER() {
			return this.getToken(78, 0);
		}

		public TerminalNode T_DENSE_RANK() {
			return this.getToken(312, 0);
		}

		public TerminalNode T_DESC() {
			return this.getToken(79, 0);
		}

		public TerminalNode T_DESCRIBE() {
			return this.getToken(80, 0);
		}

		public TerminalNode T_DIAGNOSTICS() {
			return this.getToken(81, 0);
		}

		public TerminalNode T_DIR() {
			return this.getToken(82, 0);
		}

		public TerminalNode T_DIRECTORY() {
			return this.getToken(83, 0);
		}

		public TerminalNode T_DISTINCT() {
			return this.getToken(84, 0);
		}

		public TerminalNode T_DISTRIBUTE() {
			return this.getToken(85, 0);
		}

		public TerminalNode T_DO() {
			return this.getToken(86, 0);
		}

		public TerminalNode T_DOUBLE() {
			return this.getToken(87, 0);
		}

		public TerminalNode T_DROP() {
			return this.getToken(88, 0);
		}

		public TerminalNode T_DYNAMIC() {
			return this.getToken(89, 0);
		}

		public TerminalNode T_ENABLE() {
			return this.getToken(93, 0);
		}

		public TerminalNode T_ENGINE() {
			return this.getToken(95, 0);
		}

		public TerminalNode T_ESCAPED() {
			return this.getToken(96, 0);
		}

		public TerminalNode T_EXCEPT() {
			return this.getToken(97, 0);
		}

		public TerminalNode T_EXEC() {
			return this.getToken(98, 0);
		}

		public TerminalNode T_EXECUTE() {
			return this.getToken(99, 0);
		}

		public TerminalNode T_EXCEPTION() {
			return this.getToken(100, 0);
		}

		public TerminalNode T_EXCLUSIVE() {
			return this.getToken(101, 0);
		}

		public TerminalNode T_EXISTS() {
			return this.getToken(102, 0);
		}

		public TerminalNode T_EXIT() {
			return this.getToken(103, 0);
		}

		public TerminalNode T_FALSE() {
			return this.getToken(104, 0);
		}

		public TerminalNode T_FETCH() {
			return this.getToken(105, 0);
		}

		public TerminalNode T_FIELDS() {
			return this.getToken(106, 0);
		}

		public TerminalNode T_FILE() {
			return this.getToken(107, 0);
		}

		public TerminalNode T_FILES() {
			return this.getToken(108, 0);
		}

		public TerminalNode T_FIRST_VALUE() {
			return this.getToken(313, 0);
		}

		public TerminalNode T_FLOAT() {
			return this.getToken(109, 0);
		}

		public TerminalNode T_FOR() {
			return this.getToken(110, 0);
		}

		public TerminalNode T_FOREIGN() {
			return this.getToken(111, 0);
		}

		public TerminalNode T_FORMAT() {
			return this.getToken(112, 0);
		}

		public TerminalNode T_FOUND() {
			return this.getToken(113, 0);
		}

		public TerminalNode T_FROM() {
			return this.getToken(114, 0);
		}

		public TerminalNode T_FTP() {
			return this.getToken(115, 0);
		}

		public TerminalNode T_FULL() {
			return this.getToken(116, 0);
		}

		public TerminalNode T_FUNCTION() {
			return this.getToken(117, 0);
		}

		public TerminalNode T_GET() {
			return this.getToken(118, 0);
		}

		public TerminalNode T_GLOBAL() {
			return this.getToken(119, 0);
		}

		public TerminalNode T_GO() {
			return this.getToken(120, 0);
		}

		public TerminalNode T_GRANT() {
			return this.getToken(121, 0);
		}

		public TerminalNode T_GROUP() {
			return this.getToken(122, 0);
		}

		public TerminalNode T_HANDLER() {
			return this.getToken(123, 0);
		}

		public TerminalNode T_HASH() {
			return this.getToken(124, 0);
		}

		public TerminalNode T_HAVING() {
			return this.getToken(125, 0);
		}

		public TerminalNode T_HDFS() {
			return this.getToken(126, 0);
		}

		public TerminalNode T_HIVE() {
			return this.getToken(127, 0);
		}

		public TerminalNode T_HOST() {
			return this.getToken(128, 0);
		}

		public TerminalNode T_IDENTITY() {
			return this.getToken(129, 0);
		}

		public TerminalNode T_IF() {
			return this.getToken(130, 0);
		}

		public TerminalNode T_IGNORE() {
			return this.getToken(131, 0);
		}

		public TerminalNode T_IMMEDIATE() {
			return this.getToken(132, 0);
		}

		public TerminalNode T_IN() {
			return this.getToken(133, 0);
		}

		public TerminalNode T_INCLUDE() {
			return this.getToken(134, 0);
		}

		public TerminalNode T_INDEX() {
			return this.getToken(135, 0);
		}

		public TerminalNode T_INITRANS() {
			return this.getToken(136, 0);
		}

		public TerminalNode T_INNER() {
			return this.getToken(137, 0);
		}

		public TerminalNode T_INOUT() {
			return this.getToken(138, 0);
		}

		public TerminalNode T_INSERT() {
			return this.getToken(139, 0);
		}

		public TerminalNode T_INT() {
			return this.getToken(140, 0);
		}

		public TerminalNode T_INT2() {
			return this.getToken(141, 0);
		}

		public TerminalNode T_INT4() {
			return this.getToken(142, 0);
		}

		public TerminalNode T_INT8() {
			return this.getToken(143, 0);
		}

		public TerminalNode T_INTEGER() {
			return this.getToken(144, 0);
		}

		public TerminalNode T_INTERSECT() {
			return this.getToken(145, 0);
		}

		public TerminalNode T_INTERVAL() {
			return this.getToken(146, 0);
		}

		public TerminalNode T_INTO() {
			return this.getToken(147, 0);
		}

		public TerminalNode T_INVOKER() {
			return this.getToken(148, 0);
		}

		public TerminalNode T_ITEMS() {
			return this.getToken(151, 0);
		}

		public TerminalNode T_IS() {
			return this.getToken(149, 0);
		}

		public TerminalNode T_ISOPEN() {
			return this.getToken(150, 0);
		}

		public TerminalNode T_JOIN() {
			return this.getToken(152, 0);
		}

		public TerminalNode T_KEEP() {
			return this.getToken(153, 0);
		}

		public TerminalNode T_KEY() {
			return this.getToken(154, 0);
		}

		public TerminalNode T_KEYS() {
			return this.getToken(155, 0);
		}

		public TerminalNode T_LAG() {
			return this.getToken(314, 0);
		}

		public TerminalNode T_LANGUAGE() {
			return this.getToken(156, 0);
		}

		public TerminalNode T_LAST_VALUE() {
			return this.getToken(315, 0);
		}

		public TerminalNode T_LEAD() {
			return this.getToken(316, 0);
		}

		public TerminalNode T_LEAVE() {
			return this.getToken(157, 0);
		}

		public TerminalNode T_LEFT() {
			return this.getToken(158, 0);
		}

		public TerminalNode T_LIKE() {
			return this.getToken(159, 0);
		}

		public TerminalNode T_LIMIT() {
			return this.getToken(160, 0);
		}

		public TerminalNode T_LINES() {
			return this.getToken(161, 0);
		}

		public TerminalNode T_LOCAL() {
			return this.getToken(162, 0);
		}

		public TerminalNode T_LOCATION() {
			return this.getToken(163, 0);
		}

		public TerminalNode T_LOCATOR() {
			return this.getToken(164, 0);
		}

		public TerminalNode T_LOCATORS() {
			return this.getToken(165, 0);
		}

		public TerminalNode T_LOCKS() {
			return this.getToken(166, 0);
		}

		public TerminalNode T_LOG() {
			return this.getToken(167, 0);
		}

		public TerminalNode T_LOGGED() {
			return this.getToken(168, 0);
		}

		public TerminalNode T_LOGGING() {
			return this.getToken(169, 0);
		}

		public TerminalNode T_LOOP() {
			return this.getToken(170, 0);
		}

		public TerminalNode T_MAP() {
			return this.getToken(171, 0);
		}

		public TerminalNode T_MATCHED() {
			return this.getToken(172, 0);
		}

		public TerminalNode T_MAX() {
			return this.getToken(173, 0);
		}

		public TerminalNode T_MAXTRANS() {
			return this.getToken(174, 0);
		}

		public TerminalNode T_MERGE() {
			return this.getToken(175, 0);
		}

		public TerminalNode T_MESSAGE_TEXT() {
			return this.getToken(176, 0);
		}

		public TerminalNode T_MICROSECOND() {
			return this.getToken(177, 0);
		}

		public TerminalNode T_MICROSECONDS() {
			return this.getToken(178, 0);
		}

		public TerminalNode T_MIN() {
			return this.getToken(179, 0);
		}

		public TerminalNode T_MULTISET() {
			return this.getToken(180, 0);
		}

		public TerminalNode T_NCHAR() {
			return this.getToken(181, 0);
		}

		public TerminalNode T_NEW() {
			return this.getToken(182, 0);
		}

		public TerminalNode T_NVARCHAR() {
			return this.getToken(183, 0);
		}

		public TerminalNode T_NO() {
			return this.getToken(184, 0);
		}

		public TerminalNode T_NOCOMPRESS() {
			return this.getToken(186, 0);
		}

		public TerminalNode T_NOCOUNT() {
			return this.getToken(185, 0);
		}

		public TerminalNode T_NOLOGGING() {
			return this.getToken(187, 0);
		}

		public TerminalNode T_NONE() {
			return this.getToken(188, 0);
		}

		public TerminalNode T_NOT() {
			return this.getToken(189, 0);
		}

		public TerminalNode T_NOTFOUND() {
			return this.getToken(190, 0);
		}

		public TerminalNode T_NUMERIC() {
			return this.getToken(192, 0);
		}

		public TerminalNode T_NUMBER() {
			return this.getToken(193, 0);
		}

		public TerminalNode T_OBJECT() {
			return this.getToken(194, 0);
		}

		public TerminalNode T_OFF() {
			return this.getToken(195, 0);
		}

		public TerminalNode T_ON() {
			return this.getToken(196, 0);
		}

		public TerminalNode T_ONLY() {
			return this.getToken(197, 0);
		}

		public TerminalNode T_OPEN() {
			return this.getToken(198, 0);
		}

		public TerminalNode T_OR() {
			return this.getToken(199, 0);
		}

		public TerminalNode T_ORDER() {
			return this.getToken(200, 0);
		}

		public TerminalNode T_OUT() {
			return this.getToken(201, 0);
		}

		public TerminalNode T_OUTER() {
			return this.getToken(202, 0);
		}

		public TerminalNode T_OVER() {
			return this.getToken(203, 0);
		}

		public TerminalNode T_OVERWRITE() {
			return this.getToken(204, 0);
		}

		public TerminalNode T_OWNER() {
			return this.getToken(205, 0);
		}

		public TerminalNode T_PACKAGE() {
			return this.getToken(206, 0);
		}

		public TerminalNode T_PART_COUNT() {
			return this.getToken(323, 0);
		}

		public TerminalNode T_PART_LOC() {
			return this.getToken(324, 0);
		}

		public TerminalNode T_PARTITION() {
			return this.getToken(207, 0);
		}

		public TerminalNode T_PCTFREE() {
			return this.getToken(208, 0);
		}

		public TerminalNode T_PCTUSED() {
			return this.getToken(209, 0);
		}

		public TerminalNode T_PRECISION() {
			return this.getToken(211, 0);
		}

		public TerminalNode T_PRESERVE() {
			return this.getToken(212, 0);
		}

		public TerminalNode T_PRIMARY() {
			return this.getToken(213, 0);
		}

		public TerminalNode T_PRINT() {
			return this.getToken(214, 0);
		}

		public TerminalNode T_PROC() {
			return this.getToken(215, 0);
		}

		public TerminalNode T_PROCEDURE() {
			return this.getToken(216, 0);
		}

		public TerminalNode T_PWD() {
			return this.getToken(241, 0);
		}

		public TerminalNode T_QUERY_BAND() {
			return this.getToken(217, 0);
		}

		public TerminalNode T_QUOTED_IDENTIFIER() {
			return this.getToken(218, 0);
		}

		public TerminalNode T_RAISE() {
			return this.getToken(219, 0);
		}

		public TerminalNode T_RANK() {
			return this.getToken(325, 0);
		}

		public TerminalNode T_REAL() {
			return this.getToken(220, 0);
		}

		public TerminalNode T_REFERENCES() {
			return this.getToken(221, 0);
		}

		public TerminalNode T_REGEXP() {
			return this.getToken(222, 0);
		}

		public TerminalNode T_RR() {
			return this.getToken(239, 0);
		}

		public TerminalNode T_REPLACE() {
			return this.getToken(223, 0);
		}

		public TerminalNode T_RESIGNAL() {
			return this.getToken(224, 0);
		}

		public TerminalNode T_RESTRICT() {
			return this.getToken(225, 0);
		}

		public TerminalNode T_RESULT() {
			return this.getToken(226, 0);
		}

		public TerminalNode T_RESULT_SET_LOCATOR() {
			return this.getToken(227, 0);
		}

		public TerminalNode T_RETURN() {
			return this.getToken(228, 0);
		}

		public TerminalNode T_RETURNS() {
			return this.getToken(229, 0);
		}

		public TerminalNode T_REVERSE() {
			return this.getToken(230, 0);
		}

		public TerminalNode T_RIGHT() {
			return this.getToken(231, 0);
		}

		public TerminalNode T_RLIKE() {
			return this.getToken(232, 0);
		}

		public TerminalNode T_RS() {
			return this.getToken(240, 0);
		}

		public TerminalNode T_ROLE() {
			return this.getToken(233, 0);
		}

		public TerminalNode T_ROLLBACK() {
			return this.getToken(234, 0);
		}

		public TerminalNode T_ROW() {
			return this.getToken(235, 0);
		}

		public TerminalNode T_ROWS() {
			return this.getToken(236, 0);
		}

		public TerminalNode T_ROW_COUNT() {
			return this.getToken(238, 0);
		}

		public TerminalNode T_ROW_NUMBER() {
			return this.getToken(326, 0);
		}

		public TerminalNode T_SCHEMA() {
			return this.getToken(243, 0);
		}

		public TerminalNode T_SECURITY() {
			return this.getToken(244, 0);
		}

		public TerminalNode T_SEGMENT() {
			return this.getToken(245, 0);
		}

		public TerminalNode T_SEL() {
			return this.getToken(246, 0);
		}

		public TerminalNode T_SELECT() {
			return this.getToken(247, 0);
		}

		public TerminalNode T_SESSION() {
			return this.getToken(249, 0);
		}

		public TerminalNode T_SESSIONS() {
			return this.getToken(250, 0);
		}

		public TerminalNode T_SET() {
			return this.getToken(248, 0);
		}

		public TerminalNode T_SETS() {
			return this.getToken(251, 0);
		}

		public TerminalNode T_SHARE() {
			return this.getToken(252, 0);
		}

		public TerminalNode T_SIGNAL() {
			return this.getToken(253, 0);
		}

		public TerminalNode T_SIMPLE_DOUBLE() {
			return this.getToken(254, 0);
		}

		public TerminalNode T_SIMPLE_FLOAT() {
			return this.getToken(255, 0);
		}

		public TerminalNode T_SMALLDATETIME() {
			return this.getToken(257, 0);
		}

		public TerminalNode T_SMALLINT() {
			return this.getToken(258, 0);
		}

		public TerminalNode T_SQL() {
			return this.getToken(259, 0);
		}

		public TerminalNode T_SQLEXCEPTION() {
			return this.getToken(260, 0);
		}

		public TerminalNode T_SQLINSERT() {
			return this.getToken(261, 0);
		}

		public TerminalNode T_SQLSTATE() {
			return this.getToken(262, 0);
		}

		public TerminalNode T_SQLWARNING() {
			return this.getToken(263, 0);
		}

		public TerminalNode T_STEP() {
			return this.getToken(264, 0);
		}

		public TerminalNode T_STDEV() {
			return this.getToken(327, 0);
		}

		public TerminalNode T_STORAGE() {
			return this.getToken(265, 0);
		}

		public TerminalNode T_STRING() {
			return this.getToken(266, 0);
		}

		public TerminalNode T_SUBDIR() {
			return this.getToken(267, 0);
		}

		public TerminalNode T_SUBSTRING() {
			return this.getToken(268, 0);
		}

		public TerminalNode T_SUM() {
			return this.getToken(269, 0);
		}

		public TerminalNode T_SYSDATE() {
			return this.getToken(328, 0);
		}

		public TerminalNode T_SYS_REFCURSOR() {
			return this.getToken(270, 0);
		}

		public TerminalNode T_TABLE() {
			return this.getToken(271, 0);
		}

		public TerminalNode T_TABLESPACE() {
			return this.getToken(272, 0);
		}

		public TerminalNode T_TEMPORARY() {
			return this.getToken(273, 0);
		}

		public TerminalNode T_TERMINATED() {
			return this.getToken(274, 0);
		}

		public TerminalNode T_TEXTIMAGE_ON() {
			return this.getToken(275, 0);
		}

		public TerminalNode T_THEN() {
			return this.getToken(276, 0);
		}

		public TerminalNode T_TIMESTAMP() {
			return this.getToken(277, 0);
		}

		public TerminalNode T_TITLE() {
			return this.getToken(279, 0);
		}

		public TerminalNode T_TO() {
			return this.getToken(280, 0);
		}

		public TerminalNode T_TOP() {
			return this.getToken(281, 0);
		}

		public TerminalNode T_TRANSACTION() {
			return this.getToken(282, 0);
		}

		public TerminalNode T_TRIM() {
			return this.getToken(242, 0);
		}

		public TerminalNode T_TRUE() {
			return this.getToken(283, 0);
		}

		public TerminalNode T_TRUNCATE() {
			return this.getToken(284, 0);
		}

		public TerminalNode T_UNIQUE() {
			return this.getToken(287, 0);
		}

		public TerminalNode T_UPDATE() {
			return this.getToken(288, 0);
		}

		public TerminalNode T_UR() {
			return this.getToken(289, 0);
		}

		public TerminalNode T_USE() {
			return this.getToken(290, 0);
		}

		public TerminalNode T_USER() {
			return this.getToken(330, 0);
		}

		public TerminalNode T_USING() {
			return this.getToken(291, 0);
		}

		public TerminalNode T_VALUE() {
			return this.getToken(292, 0);
		}

		public TerminalNode T_VALUES() {
			return this.getToken(293, 0);
		}

		public TerminalNode T_VAR() {
			return this.getToken(294, 0);
		}

		public TerminalNode T_VARCHAR() {
			return this.getToken(295, 0);
		}

		public TerminalNode T_VARCHAR2() {
			return this.getToken(296, 0);
		}

		public TerminalNode T_VARYING() {
			return this.getToken(297, 0);
		}

		public TerminalNode T_VARIANCE() {
			return this.getToken(329, 0);
		}

		public TerminalNode T_VOLATILE() {
			return this.getToken(298, 0);
		}

		public TerminalNode T_WHILE() {
			return this.getToken(301, 0);
		}

		public TerminalNode T_WITH() {
			return this.getToken(302, 0);
		}

		public TerminalNode T_WITHOUT() {
			return this.getToken(303, 0);
		}

		public TerminalNode T_WORK() {
			return this.getToken(304, 0);
		}

		public TerminalNode T_XACT_ABORT() {
			return this.getToken(305, 0);
		}

		public TerminalNode T_XML() {
			return this.getToken(306, 0);
		}

		public Non_reserved_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 217;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterNon_reserved_words(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitNon_reserved_words(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitNon_reserved_words(this) : visitor.visitChildren(this);
		}
	}

	public static class Null_constContext extends ParserRuleContext {
		public TerminalNode T_NULL() {
			return this.getToken(191, 0);
		}

		public Null_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 216;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterNull_const(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitNull_const(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitNull_const(this) : visitor.visitChildren(this);
		}
	}

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode T_TRUE() {
			return this.getToken(283, 0);
		}

		public TerminalNode T_FALSE() {
			return this.getToken(104, 0);
		}

		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 215;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterBool_literal(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitBool_literal(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitBool_literal(this) : visitor.visitChildren(this);
		}
	}

	public static class Dec_numberContext extends ParserRuleContext {
		public TerminalNode L_DEC() {
			return this.getToken(358, 0);
		}

		public Dec_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 214;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterDec_number(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitDec_number(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitDec_number(this) : visitor.visitChildren(this);
		}
	}

	public static class Int_numberContext extends ParserRuleContext {
		public TerminalNode L_INT() {
			return this.getToken(357, 0);
		}

		public Int_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 213;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterInt_number(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitInt_number(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitInt_number(this) : visitor.visitChildren(this);
		}
	}

	public static class Double_quotedStringContext extends HplsqlParser.StringContext {
		public TerminalNode L_D_STRING() {
			return this.getToken(356, 0);
		}

		public Double_quotedStringContext(HplsqlParser.StringContext ctx) {
			this.copyFrom(ctx);
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterDouble_quotedString(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitDouble_quotedString(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitDouble_quotedString(this) : visitor.visitChildren(this);
		}
	}

	public static class Single_quotedStringContext extends HplsqlParser.StringContext {
		public TerminalNode L_S_STRING() {
			return this.getToken(355, 0);
		}

		public Single_quotedStringContext(HplsqlParser.StringContext ctx) {
			this.copyFrom(ctx);
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterSingle_quotedString(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitSingle_quotedString(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitSingle_quotedString(this) : visitor.visitChildren(this);
		}
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 212;
		}

		public StringContext() {
		}

		public void copyFrom(HplsqlParser.StringContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode L_ID() {
			return this.getToken(354, 0);
		}

		public HplsqlParser.Non_reserved_wordsContext non_reserved_words() {
			return (HplsqlParser.Non_reserved_wordsContext)this.getRuleContext(HplsqlParser.Non_reserved_wordsContext.class, 0);
		}

		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 211;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterIdent(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitIdent(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitIdent(this) : visitor.visitChildren(this);
		}
	}

	public static class Timestamp_literalContext extends ParserRuleContext {
		public TerminalNode T_TIMESTAMP() {
			return this.getToken(277, 0);
		}

		public HplsqlParser.StringContext string() {
			return (HplsqlParser.StringContext)this.getRuleContext(HplsqlParser.StringContext.class, 0);
		}

		public Timestamp_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 210;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterTimestamp_literal(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitTimestamp_literal(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitTimestamp_literal(this) : visitor.visitChildren(this);
		}
	}

	public static class Date_literalContext extends ParserRuleContext {
		public TerminalNode T_DATE() {
			return this.getToken(64, 0);
		}

		public HplsqlParser.StringContext string() {
			return (HplsqlParser.StringContext)this.getRuleContext(HplsqlParser.StringContext.class, 0);
		}

		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 209;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterDate_literal(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitDate_literal(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitDate_literal(this) : visitor.visitChildren(this);
		}
	}

	public static class File_nameContext extends ParserRuleContext {
		public TerminalNode L_FILE() {
			return this.getToken(362, 0);
		}

		public List<HplsqlParser.IdentContext> ident() {
			return this.getRuleContexts(HplsqlParser.IdentContext.class);
		}

		public HplsqlParser.IdentContext ident(int i) {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, i);
		}

		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 208;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterFile_name(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitFile_name(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitFile_name(this) : visitor.visitChildren(this);
		}
	}

	public static class Host_stmtContext extends ParserRuleContext {
		public TerminalNode T_HOST() {
			return this.getToken(128, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public Host_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 207;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterHost_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitHost_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitHost_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Host_cmdContext extends ParserRuleContext {
		public Host_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 206;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterHost_cmd(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitHost_cmd(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitHost_cmd(this) : visitor.visitChildren(this);
		}
	}

	public static class HostContext extends ParserRuleContext {
		public HplsqlParser.Host_cmdContext host_cmd() {
			return (HplsqlParser.Host_cmdContext)this.getRuleContext(HplsqlParser.Host_cmdContext.class, 0);
		}

		public HplsqlParser.Host_stmtContext host_stmt() {
			return (HplsqlParser.Host_stmtContext)this.getRuleContext(HplsqlParser.Host_stmtContext.class, 0);
		}

		public HostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 205;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterHost(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitHost(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitHost(this) : visitor.visitChildren(this);
		}
	}

	public static class Hive_itemContext extends ParserRuleContext {
		public TerminalNode T_SUB() {
			return this.getToken(353, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public TerminalNode L_ID() {
			return this.getToken(354, 0);
		}

		public TerminalNode T_EQUAL() {
			return this.getToken(337, 0);
		}

		public Hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 204;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterHive_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitHive_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitHive_item(this) : visitor.visitChildren(this);
		}
	}

	public static class HiveContext extends ParserRuleContext {
		public TerminalNode T_HIVE() {
			return this.getToken(127, 0);
		}

		public List<HplsqlParser.Hive_itemContext> hive_item() {
			return this.getRuleContexts(HplsqlParser.Hive_itemContext.class);
		}

		public HplsqlParser.Hive_itemContext hive_item(int i) {
			return (HplsqlParser.Hive_itemContext)this.getRuleContext(HplsqlParser.Hive_itemContext.class, i);
		}

		public HiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 203;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterHive(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitHive(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitHive(this) : visitor.visitChildren(this);
		}
	}

	public static class Expr_fileContext extends ParserRuleContext {
		public HplsqlParser.File_nameContext file_name() {
			return (HplsqlParser.File_nameContext)this.getRuleContext(HplsqlParser.File_nameContext.class, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public Expr_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 202;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExpr_file(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExpr_file(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExpr_file(this) : visitor.visitChildren(this);
		}
	}

	public static class Expr_selectContext extends ParserRuleContext {
		public HplsqlParser.Select_stmtContext select_stmt() {
			return (HplsqlParser.Select_stmtContext)this.getRuleContext(HplsqlParser.Select_stmtContext.class, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public Expr_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 201;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExpr_select(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExpr_select(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExpr_select(this) : visitor.visitChildren(this);
		}
	}

	public static class Func_paramContext extends ParserRuleContext {
		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_EQUAL() {
			return this.getToken(337, 0);
		}

		public TerminalNode T_GREATER() {
			return this.getToken(341, 0);
		}

		public Func_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 200;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterFunc_param(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitFunc_param(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitFunc_param(this) : visitor.visitChildren(this);
		}
	}

	public static class Expr_func_paramsContext extends ParserRuleContext {
		public List<HplsqlParser.Func_paramContext> func_param() {
			return this.getRuleContexts(HplsqlParser.Func_paramContext.class);
		}

		public HplsqlParser.Func_paramContext func_param(int i) {
			return (HplsqlParser.Func_paramContext)this.getRuleContext(HplsqlParser.Func_paramContext.class, i);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Expr_func_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 199;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExpr_func_params(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExpr_func_params(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_params(this) : visitor.visitChildren(this);
		}
	}

	public static class Expr_funcContext extends ParserRuleContext {
		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public HplsqlParser.Expr_func_paramsContext expr_func_params() {
			return (HplsqlParser.Expr_func_paramsContext)this.getRuleContext(HplsqlParser.Expr_func_paramsContext.class, 0);
		}

		public Expr_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 198;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExpr_func(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExpr_func(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExpr_func(this) : visitor.visitChildren(this);
		}
	}

	public static class Expr_spec_funcContext extends ParserRuleContext {
		public TerminalNode T_ACTIVITY_COUNT() {
			return this.getToken(307, 0);
		}

		public TerminalNode T_CAST() {
			return this.getToken(37, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public TerminalNode T_AS() {
			return this.getToken(14, 0);
		}

		public HplsqlParser.DtypeContext dtype() {
			return (HplsqlParser.DtypeContext)this.getRuleContext(HplsqlParser.DtypeContext.class, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public HplsqlParser.Dtype_lenContext dtype_len() {
			return (HplsqlParser.Dtype_lenContext)this.getRuleContext(HplsqlParser.Dtype_lenContext.class, 0);
		}

		public TerminalNode T_COUNT() {
			return this.getToken(54, 0);
		}

		public TerminalNode T_CURRENT_DATE() {
			return this.getToken(309, 0);
		}

		public TerminalNode T_CURRENT() {
			return this.getToken(60, 0);
		}

		public TerminalNode T_DATE() {
			return this.getToken(64, 0);
		}

		public TerminalNode T_CURRENT_TIMESTAMP() {
			return this.getToken(310, 0);
		}

		public TerminalNode T_TIMESTAMP() {
			return this.getToken(277, 0);
		}

		public TerminalNode T_CURRENT_USER() {
			return this.getToken(311, 0);
		}

		public TerminalNode T_USER() {
			return this.getToken(330, 0);
		}

		public TerminalNode T_MAX_PART_STRING() {
			return this.getToken(317, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public List<TerminalNode> T_EQUAL() {
			return this.getTokens(337);
		}

		public TerminalNode T_EQUAL(int i) {
			return this.getToken(337, i);
		}

		public TerminalNode T_MIN_PART_STRING() {
			return this.getToken(318, 0);
		}

		public TerminalNode T_MAX_PART_INT() {
			return this.getToken(319, 0);
		}

		public TerminalNode T_MIN_PART_INT() {
			return this.getToken(320, 0);
		}

		public TerminalNode T_MAX_PART_DATE() {
			return this.getToken(321, 0);
		}

		public TerminalNode T_MIN_PART_DATE() {
			return this.getToken(322, 0);
		}

		public TerminalNode T_PART_COUNT() {
			return this.getToken(323, 0);
		}

		public TerminalNode T_PART_LOC() {
			return this.getToken(324, 0);
		}

		public TerminalNode T_TRIM() {
			return this.getToken(242, 0);
		}

		public TerminalNode T_SUBSTRING() {
			return this.getToken(268, 0);
		}

		public TerminalNode T_FROM() {
			return this.getToken(114, 0);
		}

		public TerminalNode T_FOR() {
			return this.getToken(110, 0);
		}

		public TerminalNode T_SYSDATE() {
			return this.getToken(328, 0);
		}

		public Expr_spec_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 197;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExpr_spec_func(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExpr_spec_func(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExpr_spec_func(this) : visitor.visitChildren(this);
		}
	}

	public static class Expr_func_partition_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_PARTITION() {
			return this.getToken(207, 0);
		}

		public TerminalNode T_BY() {
			return this.getToken(30, 0);
		}

		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Expr_func_partition_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 196;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExpr_func_partition_by_clause(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExpr_func_partition_by_clause(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_partition_by_clause(this) : visitor.visitChildren(this);
		}
	}

	public static class Expr_func_over_clauseContext extends ParserRuleContext {
		public TerminalNode T_OVER() {
			return this.getToken(203, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public HplsqlParser.Expr_func_partition_by_clauseContext expr_func_partition_by_clause() {
			return (HplsqlParser.Expr_func_partition_by_clauseContext)this.getRuleContext(HplsqlParser.Expr_func_partition_by_clauseContext.class, 0);
		}

		public HplsqlParser.Order_by_clauseContext order_by_clause() {
			return (HplsqlParser.Order_by_clauseContext)this.getRuleContext(HplsqlParser.Order_by_clauseContext.class, 0);
		}

		public Expr_func_over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 195;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExpr_func_over_clause(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExpr_func_over_clause(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_over_clause(this) : visitor.visitChildren(this);
		}
	}

	public static class Expr_func_all_distinctContext extends ParserRuleContext {
		public TerminalNode T_ALL() {
			return this.getToken(8, 0);
		}

		public TerminalNode T_DISTINCT() {
			return this.getToken(84, 0);
		}

		public Expr_func_all_distinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 194;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExpr_func_all_distinct(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExpr_func_all_distinct(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_all_distinct(this) : visitor.visitChildren(this);
		}
	}

	public static class Expr_agg_window_funcContext extends ParserRuleContext {
		public TerminalNode T_AVG() {
			return this.getToken(19, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public HplsqlParser.Expr_func_all_distinctContext expr_func_all_distinct() {
			return (HplsqlParser.Expr_func_all_distinctContext)this.getRuleContext(HplsqlParser.Expr_func_all_distinctContext.class, 0);
		}

		public HplsqlParser.Expr_func_over_clauseContext expr_func_over_clause() {
			return (HplsqlParser.Expr_func_over_clauseContext)this.getRuleContext(HplsqlParser.Expr_func_over_clauseContext.class, 0);
		}

		public TerminalNode T_COUNT() {
			return this.getToken(54, 0);
		}

		public TerminalNode T_COUNT_BIG() {
			return this.getToken(55, 0);
		}

		public TerminalNode T_CUME_DIST() {
			return this.getToken(308, 0);
		}

		public TerminalNode T_DENSE_RANK() {
			return this.getToken(312, 0);
		}

		public TerminalNode T_FIRST_VALUE() {
			return this.getToken(313, 0);
		}

		public TerminalNode T_LAG() {
			return this.getToken(314, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public TerminalNode T_LAST_VALUE() {
			return this.getToken(315, 0);
		}

		public TerminalNode T_LEAD() {
			return this.getToken(316, 0);
		}

		public TerminalNode T_MAX() {
			return this.getToken(173, 0);
		}

		public TerminalNode T_MIN() {
			return this.getToken(179, 0);
		}

		public TerminalNode T_RANK() {
			return this.getToken(325, 0);
		}

		public TerminalNode T_ROW_NUMBER() {
			return this.getToken(326, 0);
		}

		public TerminalNode T_STDEV() {
			return this.getToken(327, 0);
		}

		public TerminalNode T_SUM() {
			return this.getToken(269, 0);
		}

		public TerminalNode T_VAR() {
			return this.getToken(294, 0);
		}

		public TerminalNode T_VARIANCE() {
			return this.getToken(329, 0);
		}

		public Expr_agg_window_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 193;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExpr_agg_window_func(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExpr_agg_window_func(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExpr_agg_window_func(this) : visitor.visitChildren(this);
		}
	}

	public static class Expr_cursor_attributeContext extends ParserRuleContext {
		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_ISOPEN() {
			return this.getToken(150, 0);
		}

		public TerminalNode T_FOUND() {
			return this.getToken(113, 0);
		}

		public TerminalNode T_NOTFOUND() {
			return this.getToken(190, 0);
		}

		public Expr_cursor_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 192;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExpr_cursor_attribute(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExpr_cursor_attribute(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExpr_cursor_attribute(this) : visitor.visitChildren(this);
		}
	}

	public static class Expr_case_searchedContext extends ParserRuleContext {
		public TerminalNode T_CASE() {
			return this.getToken(35, 0);
		}

		public TerminalNode T_END() {
			return this.getToken(94, 0);
		}

		public List<TerminalNode> T_WHEN() {
			return this.getTokens(299);
		}

		public TerminalNode T_WHEN(int i) {
			return this.getToken(299, i);
		}

		public List<HplsqlParser.Bool_exprContext> bool_expr() {
			return this.getRuleContexts(HplsqlParser.Bool_exprContext.class);
		}

		public HplsqlParser.Bool_exprContext bool_expr(int i) {
			return (HplsqlParser.Bool_exprContext)this.getRuleContext(HplsqlParser.Bool_exprContext.class, i);
		}

		public List<TerminalNode> T_THEN() {
			return this.getTokens(276);
		}

		public TerminalNode T_THEN(int i) {
			return this.getToken(276, i);
		}

		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public TerminalNode T_ELSE() {
			return this.getToken(90, 0);
		}

		public Expr_case_searchedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 191;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExpr_case_searched(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExpr_case_searched(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExpr_case_searched(this) : visitor.visitChildren(this);
		}
	}

	public static class Expr_case_simpleContext extends ParserRuleContext {
		public TerminalNode T_CASE() {
			return this.getToken(35, 0);
		}

		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public TerminalNode T_END() {
			return this.getToken(94, 0);
		}

		public List<TerminalNode> T_WHEN() {
			return this.getTokens(299);
		}

		public TerminalNode T_WHEN(int i) {
			return this.getToken(299, i);
		}

		public List<TerminalNode> T_THEN() {
			return this.getTokens(276);
		}

		public TerminalNode T_THEN(int i) {
			return this.getToken(276, i);
		}

		public TerminalNode T_ELSE() {
			return this.getToken(90, 0);
		}

		public Expr_case_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 190;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExpr_case_simple(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExpr_case_simple(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExpr_case_simple(this) : visitor.visitChildren(this);
		}
	}

	public static class Expr_caseContext extends ParserRuleContext {
		public HplsqlParser.Expr_case_simpleContext expr_case_simple() {
			return (HplsqlParser.Expr_case_simpleContext)this.getRuleContext(HplsqlParser.Expr_case_simpleContext.class, 0);
		}

		public HplsqlParser.Expr_case_searchedContext expr_case_searched() {
			return (HplsqlParser.Expr_case_searchedContext)this.getRuleContext(HplsqlParser.Expr_case_searchedContext.class, 0);
		}

		public Expr_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 189;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExpr_case(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExpr_case(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExpr_case(this) : visitor.visitChildren(this);
		}
	}

	public static class Expr_concat_itemContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public HplsqlParser.Expr_caseContext expr_case() {
			return (HplsqlParser.Expr_caseContext)this.getRuleContext(HplsqlParser.Expr_caseContext.class, 0);
		}

		public HplsqlParser.Expr_agg_window_funcContext expr_agg_window_func() {
			return (HplsqlParser.Expr_agg_window_funcContext)this.getRuleContext(HplsqlParser.Expr_agg_window_funcContext.class, 0);
		}

		public HplsqlParser.Expr_spec_funcContext expr_spec_func() {
			return (HplsqlParser.Expr_spec_funcContext)this.getRuleContext(HplsqlParser.Expr_spec_funcContext.class, 0);
		}

		public HplsqlParser.Expr_funcContext expr_func() {
			return (HplsqlParser.Expr_funcContext)this.getRuleContext(HplsqlParser.Expr_funcContext.class, 0);
		}

		public HplsqlParser.Expr_atomContext expr_atom() {
			return (HplsqlParser.Expr_atomContext)this.getRuleContext(HplsqlParser.Expr_atomContext.class, 0);
		}

		public Expr_concat_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 188;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExpr_concat_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExpr_concat_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExpr_concat_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Expr_concatContext extends ParserRuleContext {
		public List<HplsqlParser.Expr_concat_itemContext> expr_concat_item() {
			return this.getRuleContexts(HplsqlParser.Expr_concat_itemContext.class);
		}

		public HplsqlParser.Expr_concat_itemContext expr_concat_item(int i) {
			return (HplsqlParser.Expr_concat_itemContext)this.getRuleContext(HplsqlParser.Expr_concat_itemContext.class, i);
		}

		public List<TerminalNode> T_PIPE() {
			return this.getTokens(334);
		}

		public TerminalNode T_PIPE(int i) {
			return this.getToken(334, i);
		}

		public List<TerminalNode> T_CONCAT() {
			return this.getTokens(49);
		}

		public TerminalNode T_CONCAT(int i) {
			return this.getToken(49, i);
		}

		public Expr_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 187;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExpr_concat(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExpr_concat(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExpr_concat(this) : visitor.visitChildren(this);
		}
	}

	public static class Interval_itemContext extends ParserRuleContext {
		public TerminalNode T_DAY() {
			return this.getToken(66, 0);
		}

		public TerminalNode T_DAYS() {
			return this.getToken(67, 0);
		}

		public TerminalNode T_MICROSECOND() {
			return this.getToken(177, 0);
		}

		public TerminalNode T_MICROSECONDS() {
			return this.getToken(178, 0);
		}

		public Interval_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 186;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterInterval_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitInterval_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitInterval_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Expr_intervalContext extends ParserRuleContext {
		public TerminalNode T_INTERVAL() {
			return this.getToken(146, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public HplsqlParser.Interval_itemContext interval_item() {
			return (HplsqlParser.Interval_itemContext)this.getRuleContext(HplsqlParser.Interval_itemContext.class, 0);
		}

		public Expr_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 185;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExpr_interval(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExpr_interval(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExpr_interval(this) : visitor.visitChildren(this);
		}
	}

	public static class Expr_atomContext extends ParserRuleContext {
		public HplsqlParser.Date_literalContext date_literal() {
			return (HplsqlParser.Date_literalContext)this.getRuleContext(HplsqlParser.Date_literalContext.class, 0);
		}

		public HplsqlParser.Timestamp_literalContext timestamp_literal() {
			return (HplsqlParser.Timestamp_literalContext)this.getRuleContext(HplsqlParser.Timestamp_literalContext.class, 0);
		}

		public HplsqlParser.Bool_literalContext bool_literal() {
			return (HplsqlParser.Bool_literalContext)this.getRuleContext(HplsqlParser.Bool_literalContext.class, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public HplsqlParser.StringContext string() {
			return (HplsqlParser.StringContext)this.getRuleContext(HplsqlParser.StringContext.class, 0);
		}

		public HplsqlParser.Dec_numberContext dec_number() {
			return (HplsqlParser.Dec_numberContext)this.getRuleContext(HplsqlParser.Dec_numberContext.class, 0);
		}

		public HplsqlParser.Int_numberContext int_number() {
			return (HplsqlParser.Int_numberContext)this.getRuleContext(HplsqlParser.Int_numberContext.class, 0);
		}

		public HplsqlParser.Null_constContext null_const() {
			return (HplsqlParser.Null_constContext)this.getRuleContext(HplsqlParser.Null_constContext.class, 0);
		}

		public Expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 184;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExpr_atom(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExpr_atom(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExpr_atom(this) : visitor.visitChildren(this);
		}
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public HplsqlParser.Expr_intervalContext expr_interval() {
			return (HplsqlParser.Expr_intervalContext)this.getRuleContext(HplsqlParser.Expr_intervalContext.class, 0);
		}

		public HplsqlParser.Expr_concatContext expr_concat() {
			return (HplsqlParser.Expr_concatContext)this.getRuleContext(HplsqlParser.Expr_concatContext.class, 0);
		}

		public HplsqlParser.Expr_caseContext expr_case() {
			return (HplsqlParser.Expr_caseContext)this.getRuleContext(HplsqlParser.Expr_caseContext.class, 0);
		}

		public HplsqlParser.Expr_cursor_attributeContext expr_cursor_attribute() {
			return (HplsqlParser.Expr_cursor_attributeContext)this.getRuleContext(HplsqlParser.Expr_cursor_attributeContext.class, 0);
		}

		public HplsqlParser.Expr_agg_window_funcContext expr_agg_window_func() {
			return (HplsqlParser.Expr_agg_window_funcContext)this.getRuleContext(HplsqlParser.Expr_agg_window_funcContext.class, 0);
		}

		public HplsqlParser.Expr_spec_funcContext expr_spec_func() {
			return (HplsqlParser.Expr_spec_funcContext)this.getRuleContext(HplsqlParser.Expr_spec_funcContext.class, 0);
		}

		public HplsqlParser.Expr_funcContext expr_func() {
			return (HplsqlParser.Expr_funcContext)this.getRuleContext(HplsqlParser.Expr_funcContext.class, 0);
		}

		public HplsqlParser.Expr_atomContext expr_atom() {
			return (HplsqlParser.Expr_atomContext)this.getRuleContext(HplsqlParser.Expr_atomContext.class, 0);
		}

		public TerminalNode T_MUL() {
			return this.getToken(345, 0);
		}

		public TerminalNode T_DIV() {
			return this.getToken(335, 0);
		}

		public TerminalNode T_ADD() {
			return this.getToken(331, 0);
		}

		public TerminalNode T_SUB() {
			return this.getToken(353, 0);
		}

		public HplsqlParser.Interval_itemContext interval_item() {
			return (HplsqlParser.Interval_itemContext)this.getRuleContext(HplsqlParser.Interval_itemContext.class, 0);
		}

		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 183;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExpr(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExpr(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExpr(this) : visitor.visitChildren(this);
		}
	}

	public static class Bool_expr_binary_operatorContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() {
			return this.getToken(337, 0);
		}

		public TerminalNode T_EQUAL2() {
			return this.getToken(338, 0);
		}

		public TerminalNode T_NOTEQUAL() {
			return this.getToken(339, 0);
		}

		public TerminalNode T_NOTEQUAL2() {
			return this.getToken(340, 0);
		}

		public TerminalNode T_LESS() {
			return this.getToken(343, 0);
		}

		public TerminalNode T_LESSEQUAL() {
			return this.getToken(344, 0);
		}

		public TerminalNode T_GREATER() {
			return this.getToken(341, 0);
		}

		public TerminalNode T_GREATEREQUAL() {
			return this.getToken(342, 0);
		}

		public TerminalNode T_LIKE() {
			return this.getToken(159, 0);
		}

		public TerminalNode T_RLIKE() {
			return this.getToken(232, 0);
		}

		public TerminalNode T_REGEXP() {
			return this.getToken(222, 0);
		}

		public TerminalNode T_NOT() {
			return this.getToken(189, 0);
		}

		public Bool_expr_binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 182;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterBool_expr_binary_operator(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitBool_expr_binary_operator(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_binary_operator(this) : visitor.visitChildren(this);
		}
	}

	public static class Bool_expr_logical_operatorContext extends ParserRuleContext {
		public TerminalNode T_AND() {
			return this.getToken(11, 0);
		}

		public TerminalNode T_OR() {
			return this.getToken(199, 0);
		}

		public Bool_expr_logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 181;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterBool_expr_logical_operator(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitBool_expr_logical_operator(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_logical_operator(this) : visitor.visitChildren(this);
		}
	}

	public static class Bool_expr_binaryContext extends ParserRuleContext {
		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public HplsqlParser.Bool_expr_binary_operatorContext bool_expr_binary_operator() {
			return (HplsqlParser.Bool_expr_binary_operatorContext)this.getRuleContext(HplsqlParser.Bool_expr_binary_operatorContext.class, 0);
		}

		public Bool_expr_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 180;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterBool_expr_binary(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitBool_expr_binary(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_binary(this) : visitor.visitChildren(this);
		}
	}

	public static class Bool_expr_multi_inContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() {
			return this.getTokens(347);
		}

		public TerminalNode T_OPEN_P(int i) {
			return this.getToken(347, i);
		}

		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public List<TerminalNode> T_CLOSE_P() {
			return this.getTokens(350);
		}

		public TerminalNode T_CLOSE_P(int i) {
			return this.getToken(350, i);
		}

		public TerminalNode T_IN() {
			return this.getToken(133, 0);
		}

		public HplsqlParser.Select_stmtContext select_stmt() {
			return (HplsqlParser.Select_stmtContext)this.getRuleContext(HplsqlParser.Select_stmtContext.class, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public TerminalNode T_NOT() {
			return this.getToken(189, 0);
		}

		public Bool_expr_multi_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 179;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterBool_expr_multi_in(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitBool_expr_multi_in(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_multi_in(this) : visitor.visitChildren(this);
		}
	}

	public static class Bool_expr_single_inContext extends ParserRuleContext {
		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public TerminalNode T_IN() {
			return this.getToken(133, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public HplsqlParser.Select_stmtContext select_stmt() {
			return (HplsqlParser.Select_stmtContext)this.getRuleContext(HplsqlParser.Select_stmtContext.class, 0);
		}

		public TerminalNode T_NOT() {
			return this.getToken(189, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Bool_expr_single_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 178;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterBool_expr_single_in(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitBool_expr_single_in(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_single_in(this) : visitor.visitChildren(this);
		}
	}

	public static class Bool_expr_unaryContext extends ParserRuleContext {
		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public TerminalNode T_IS() {
			return this.getToken(149, 0);
		}

		public TerminalNode T_NULL() {
			return this.getToken(191, 0);
		}

		public TerminalNode T_NOT() {
			return this.getToken(189, 0);
		}

		public TerminalNode T_BETWEEN() {
			return this.getToken(22, 0);
		}

		public TerminalNode T_AND() {
			return this.getToken(11, 0);
		}

		public HplsqlParser.Bool_expr_single_inContext bool_expr_single_in() {
			return (HplsqlParser.Bool_expr_single_inContext)this.getRuleContext(HplsqlParser.Bool_expr_single_inContext.class, 0);
		}

		public HplsqlParser.Bool_expr_multi_inContext bool_expr_multi_in() {
			return (HplsqlParser.Bool_expr_multi_inContext)this.getRuleContext(HplsqlParser.Bool_expr_multi_inContext.class, 0);
		}

		public Bool_expr_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 177;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterBool_expr_unary(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitBool_expr_unary(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_unary(this) : visitor.visitChildren(this);
		}
	}

	public static class Bool_expr_atomContext extends ParserRuleContext {
		public HplsqlParser.Bool_expr_unaryContext bool_expr_unary() {
			return (HplsqlParser.Bool_expr_unaryContext)this.getRuleContext(HplsqlParser.Bool_expr_unaryContext.class, 0);
		}

		public HplsqlParser.Bool_expr_binaryContext bool_expr_binary() {
			return (HplsqlParser.Bool_expr_binaryContext)this.getRuleContext(HplsqlParser.Bool_expr_binaryContext.class, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public Bool_expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 176;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterBool_expr_atom(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitBool_expr_atom(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_atom(this) : visitor.visitChildren(this);
		}
	}

	public static class Bool_exprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public List<HplsqlParser.Bool_exprContext> bool_expr() {
			return this.getRuleContexts(HplsqlParser.Bool_exprContext.class);
		}

		public HplsqlParser.Bool_exprContext bool_expr(int i) {
			return (HplsqlParser.Bool_exprContext)this.getRuleContext(HplsqlParser.Bool_exprContext.class, i);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public TerminalNode T_NOT() {
			return this.getToken(189, 0);
		}

		public HplsqlParser.Bool_expr_atomContext bool_expr_atom() {
			return (HplsqlParser.Bool_expr_atomContext)this.getRuleContext(HplsqlParser.Bool_expr_atomContext.class, 0);
		}

		public HplsqlParser.Bool_expr_logical_operatorContext bool_expr_logical_operator() {
			return (HplsqlParser.Bool_expr_logical_operatorContext)this.getRuleContext(HplsqlParser.Bool_expr_logical_operatorContext.class, 0);
		}

		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 175;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterBool_expr(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitBool_expr(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitBool_expr(this) : visitor.visitChildren(this);
		}
	}

	public static class Describe_stmtContext extends ParserRuleContext {
		public HplsqlParser.Table_nameContext table_name() {
			return (HplsqlParser.Table_nameContext)this.getRuleContext(HplsqlParser.Table_nameContext.class, 0);
		}

		public TerminalNode T_DESCRIBE() {
			return this.getToken(80, 0);
		}

		public TerminalNode T_DESC() {
			return this.getToken(79, 0);
		}

		public TerminalNode T_TABLE() {
			return this.getToken(271, 0);
		}

		public Describe_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 174;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterDescribe_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitDescribe_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitDescribe_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode T_DELETE() {
			return this.getToken(76, 0);
		}

		public HplsqlParser.Table_nameContext table_name() {
			return (HplsqlParser.Table_nameContext)this.getRuleContext(HplsqlParser.Table_nameContext.class, 0);
		}

		public TerminalNode T_FROM() {
			return this.getToken(114, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public HplsqlParser.Where_clauseContext where_clause() {
			return (HplsqlParser.Where_clauseContext)this.getRuleContext(HplsqlParser.Where_clauseContext.class, 0);
		}

		public TerminalNode T_AS() {
			return this.getToken(14, 0);
		}

		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 173;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterDelete_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitDelete_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitDelete_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Merge_actionContext extends ParserRuleContext {
		public TerminalNode T_INSERT() {
			return this.getToken(139, 0);
		}

		public TerminalNode T_VALUES() {
			return this.getToken(293, 0);
		}

		public HplsqlParser.Insert_stmt_rowContext insert_stmt_row() {
			return (HplsqlParser.Insert_stmt_rowContext)this.getRuleContext(HplsqlParser.Insert_stmt_rowContext.class, 0);
		}

		public HplsqlParser.Insert_stmt_colsContext insert_stmt_cols() {
			return (HplsqlParser.Insert_stmt_colsContext)this.getRuleContext(HplsqlParser.Insert_stmt_colsContext.class, 0);
		}

		public TerminalNode T_UPDATE() {
			return this.getToken(288, 0);
		}

		public TerminalNode T_SET() {
			return this.getToken(248, 0);
		}

		public List<HplsqlParser.Assignment_stmt_itemContext> assignment_stmt_item() {
			return this.getRuleContexts(HplsqlParser.Assignment_stmt_itemContext.class);
		}

		public HplsqlParser.Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return (HplsqlParser.Assignment_stmt_itemContext)this.getRuleContext(HplsqlParser.Assignment_stmt_itemContext.class, i);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public HplsqlParser.Where_clauseContext where_clause() {
			return (HplsqlParser.Where_clauseContext)this.getRuleContext(HplsqlParser.Where_clauseContext.class, 0);
		}

		public TerminalNode T_DELETE() {
			return this.getToken(76, 0);
		}

		public Merge_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 172;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterMerge_action(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitMerge_action(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitMerge_action(this) : visitor.visitChildren(this);
		}
	}

	public static class Merge_conditionContext extends ParserRuleContext {
		public TerminalNode T_WHEN() {
			return this.getToken(299, 0);
		}

		public TerminalNode T_MATCHED() {
			return this.getToken(172, 0);
		}

		public TerminalNode T_THEN() {
			return this.getToken(276, 0);
		}

		public HplsqlParser.Merge_actionContext merge_action() {
			return (HplsqlParser.Merge_actionContext)this.getRuleContext(HplsqlParser.Merge_actionContext.class, 0);
		}

		public TerminalNode T_NOT() {
			return this.getToken(189, 0);
		}

		public TerminalNode T_AND() {
			return this.getToken(11, 0);
		}

		public HplsqlParser.Bool_exprContext bool_expr() {
			return (HplsqlParser.Bool_exprContext)this.getRuleContext(HplsqlParser.Bool_exprContext.class, 0);
		}

		public TerminalNode T_ELSE() {
			return this.getToken(90, 0);
		}

		public TerminalNode T_IGNORE() {
			return this.getToken(131, 0);
		}

		public Merge_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 171;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterMerge_condition(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitMerge_condition(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitMerge_condition(this) : visitor.visitChildren(this);
		}
	}

	public static class Merge_tableContext extends ParserRuleContext {
		public HplsqlParser.Table_nameContext table_name() {
			return (HplsqlParser.Table_nameContext)this.getRuleContext(HplsqlParser.Table_nameContext.class, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public HplsqlParser.Select_stmtContext select_stmt() {
			return (HplsqlParser.Select_stmtContext)this.getRuleContext(HplsqlParser.Select_stmtContext.class, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public TerminalNode T_AS() {
			return this.getToken(14, 0);
		}

		public Merge_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 170;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterMerge_table(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitMerge_table(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitMerge_table(this) : visitor.visitChildren(this);
		}
	}

	public static class Merge_stmtContext extends ParserRuleContext {
		public TerminalNode T_MERGE() {
			return this.getToken(175, 0);
		}

		public TerminalNode T_INTO() {
			return this.getToken(147, 0);
		}

		public List<HplsqlParser.Merge_tableContext> merge_table() {
			return this.getRuleContexts(HplsqlParser.Merge_tableContext.class);
		}

		public HplsqlParser.Merge_tableContext merge_table(int i) {
			return (HplsqlParser.Merge_tableContext)this.getRuleContext(HplsqlParser.Merge_tableContext.class, i);
		}

		public TerminalNode T_USING() {
			return this.getToken(291, 0);
		}

		public TerminalNode T_ON() {
			return this.getToken(196, 0);
		}

		public HplsqlParser.Bool_exprContext bool_expr() {
			return (HplsqlParser.Bool_exprContext)this.getRuleContext(HplsqlParser.Bool_exprContext.class, 0);
		}

		public List<HplsqlParser.Merge_conditionContext> merge_condition() {
			return this.getRuleContexts(HplsqlParser.Merge_conditionContext.class);
		}

		public HplsqlParser.Merge_conditionContext merge_condition(int i) {
			return (HplsqlParser.Merge_conditionContext)this.getRuleContext(HplsqlParser.Merge_conditionContext.class, i);
		}

		public Merge_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 169;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterMerge_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitMerge_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitMerge_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Update_upsertContext extends ParserRuleContext {
		public TerminalNode T_ELSE() {
			return this.getToken(90, 0);
		}

		public HplsqlParser.Insert_stmtContext insert_stmt() {
			return (HplsqlParser.Insert_stmtContext)this.getRuleContext(HplsqlParser.Insert_stmtContext.class, 0);
		}

		public Update_upsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 168;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterUpdate_upsert(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitUpdate_upsert(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitUpdate_upsert(this) : visitor.visitChildren(this);
		}
	}

	public static class Update_tableContext extends ParserRuleContext {
		public HplsqlParser.Table_nameContext table_name() {
			return (HplsqlParser.Table_nameContext)this.getRuleContext(HplsqlParser.Table_nameContext.class, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public HplsqlParser.Select_stmtContext select_stmt() {
			return (HplsqlParser.Select_stmtContext)this.getRuleContext(HplsqlParser.Select_stmtContext.class, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public TerminalNode T_AS() {
			return this.getToken(14, 0);
		}

		public Update_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 167;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterUpdate_table(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitUpdate_table(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitUpdate_table(this) : visitor.visitChildren(this);
		}
	}

	public static class Update_assignmentContext extends ParserRuleContext {
		public List<HplsqlParser.Assignment_stmt_itemContext> assignment_stmt_item() {
			return this.getRuleContexts(HplsqlParser.Assignment_stmt_itemContext.class);
		}

		public HplsqlParser.Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return (HplsqlParser.Assignment_stmt_itemContext)this.getRuleContext(HplsqlParser.Assignment_stmt_itemContext.class, i);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Update_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 166;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterUpdate_assignment(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitUpdate_assignment(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitUpdate_assignment(this) : visitor.visitChildren(this);
		}
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode T_UPDATE() {
			return this.getToken(288, 0);
		}

		public HplsqlParser.Update_tableContext update_table() {
			return (HplsqlParser.Update_tableContext)this.getRuleContext(HplsqlParser.Update_tableContext.class, 0);
		}

		public TerminalNode T_SET() {
			return this.getToken(248, 0);
		}

		public HplsqlParser.Update_assignmentContext update_assignment() {
			return (HplsqlParser.Update_assignmentContext)this.getRuleContext(HplsqlParser.Update_assignmentContext.class, 0);
		}

		public HplsqlParser.Where_clauseContext where_clause() {
			return (HplsqlParser.Where_clauseContext)this.getRuleContext(HplsqlParser.Where_clauseContext.class, 0);
		}

		public HplsqlParser.Update_upsertContext update_upsert() {
			return (HplsqlParser.Update_upsertContext)this.getRuleContext(HplsqlParser.Update_upsertContext.class, 0);
		}

		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 165;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterUpdate_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitUpdate_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitUpdate_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Select_options_itemContext extends ParserRuleContext {
		public TerminalNode T_LIMIT() {
			return this.getToken(160, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public TerminalNode T_WITH() {
			return this.getToken(302, 0);
		}

		public TerminalNode T_RR() {
			return this.getToken(239, 0);
		}

		public TerminalNode T_RS() {
			return this.getToken(240, 0);
		}

		public TerminalNode T_CS() {
			return this.getToken(59, 0);
		}

		public TerminalNode T_UR() {
			return this.getToken(289, 0);
		}

		public TerminalNode T_USE() {
			return this.getToken(290, 0);
		}

		public TerminalNode T_AND() {
			return this.getToken(11, 0);
		}

		public TerminalNode T_KEEP() {
			return this.getToken(153, 0);
		}

		public TerminalNode T_LOCKS() {
			return this.getToken(166, 0);
		}

		public TerminalNode T_EXCLUSIVE() {
			return this.getToken(101, 0);
		}

		public TerminalNode T_UPDATE() {
			return this.getToken(288, 0);
		}

		public TerminalNode T_SHARE() {
			return this.getToken(252, 0);
		}

		public Select_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 164;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterSelect_options_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitSelect_options_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitSelect_options_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Select_optionsContext extends ParserRuleContext {
		public List<HplsqlParser.Select_options_itemContext> select_options_item() {
			return this.getRuleContexts(HplsqlParser.Select_options_itemContext.class);
		}

		public HplsqlParser.Select_options_itemContext select_options_item(int i) {
			return (HplsqlParser.Select_options_itemContext)this.getRuleContext(HplsqlParser.Select_options_itemContext.class, i);
		}

		public Select_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 163;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterSelect_options(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitSelect_options(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitSelect_options(this) : visitor.visitChildren(this);
		}
	}

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_ORDER() {
			return this.getToken(200, 0);
		}

		public TerminalNode T_BY() {
			return this.getToken(30, 0);
		}

		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public List<TerminalNode> T_ASC() {
			return this.getTokens(15);
		}

		public TerminalNode T_ASC(int i) {
			return this.getToken(15, i);
		}

		public List<TerminalNode> T_DESC() {
			return this.getTokens(79);
		}

		public TerminalNode T_DESC(int i) {
			return this.getToken(79, i);
		}

		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 162;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterOrder_by_clause(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitOrder_by_clause(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitOrder_by_clause(this) : visitor.visitChildren(this);
		}
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode T_HAVING() {
			return this.getToken(125, 0);
		}

		public HplsqlParser.Bool_exprContext bool_expr() {
			return (HplsqlParser.Bool_exprContext)this.getRuleContext(HplsqlParser.Bool_exprContext.class, 0);
		}

		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 161;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterHaving_clause(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitHaving_clause(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitHaving_clause(this) : visitor.visitChildren(this);
		}
	}

	public static class Group_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_GROUP() {
			return this.getToken(122, 0);
		}

		public TerminalNode T_BY() {
			return this.getToken(30, 0);
		}

		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 160;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterGroup_by_clause(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitGroup_by_clause(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitGroup_by_clause(this) : visitor.visitChildren(this);
		}
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode T_WHERE() {
			return this.getToken(300, 0);
		}

		public HplsqlParser.Bool_exprContext bool_expr() {
			return (HplsqlParser.Bool_exprContext)this.getRuleContext(HplsqlParser.Bool_exprContext.class, 0);
		}

		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 159;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterWhere_clause(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitWhere_clause(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitWhere_clause(this) : visitor.visitChildren(this);
		}
	}

	public static class Table_nameContext extends ParserRuleContext {
		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 158;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterTable_name(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitTable_name(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitTable_name(this) : visitor.visitChildren(this);
		}
	}

	public static class From_alias_clauseContext extends ParserRuleContext {
		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_AS() {
			return this.getToken(14, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public List<TerminalNode> L_ID() {
			return this.getTokens(354);
		}

		public TerminalNode L_ID(int i) {
			return this.getToken(354, i);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public From_alias_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 157;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterFrom_alias_clause(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitFrom_alias_clause(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitFrom_alias_clause(this) : visitor.visitChildren(this);
		}
	}

	public static class From_table_values_rowContext extends ParserRuleContext {
		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public From_table_values_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 156;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterFrom_table_values_row(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitFrom_table_values_row(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitFrom_table_values_row(this) : visitor.visitChildren(this);
		}
	}

	public static class From_table_values_clauseContext extends ParserRuleContext {
		public TerminalNode T_TABLE() {
			return this.getToken(271, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public TerminalNode T_VALUES() {
			return this.getToken(293, 0);
		}

		public List<HplsqlParser.From_table_values_rowContext> from_table_values_row() {
			return this.getRuleContexts(HplsqlParser.From_table_values_rowContext.class);
		}

		public HplsqlParser.From_table_values_rowContext from_table_values_row(int i) {
			return (HplsqlParser.From_table_values_rowContext)this.getRuleContext(HplsqlParser.From_table_values_rowContext.class, i);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public HplsqlParser.From_alias_clauseContext from_alias_clause() {
			return (HplsqlParser.From_alias_clauseContext)this.getRuleContext(HplsqlParser.From_alias_clauseContext.class, 0);
		}

		public From_table_values_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 155;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterFrom_table_values_clause(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitFrom_table_values_clause(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitFrom_table_values_clause(this) : visitor.visitChildren(this);
		}
	}

	public static class From_join_type_clauseContext extends ParserRuleContext {
		public TerminalNode T_JOIN() {
			return this.getToken(152, 0);
		}

		public TerminalNode T_INNER() {
			return this.getToken(137, 0);
		}

		public TerminalNode T_LEFT() {
			return this.getToken(158, 0);
		}

		public TerminalNode T_RIGHT() {
			return this.getToken(231, 0);
		}

		public TerminalNode T_FULL() {
			return this.getToken(116, 0);
		}

		public TerminalNode T_OUTER() {
			return this.getToken(202, 0);
		}

		public From_join_type_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 154;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterFrom_join_type_clause(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitFrom_join_type_clause(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitFrom_join_type_clause(this) : visitor.visitChildren(this);
		}
	}

	public static class From_join_clauseContext extends ParserRuleContext {
		public TerminalNode T_COMMA() {
			return this.getToken(333, 0);
		}

		public HplsqlParser.From_table_clauseContext from_table_clause() {
			return (HplsqlParser.From_table_clauseContext)this.getRuleContext(HplsqlParser.From_table_clauseContext.class, 0);
		}

		public HplsqlParser.From_join_type_clauseContext from_join_type_clause() {
			return (HplsqlParser.From_join_type_clauseContext)this.getRuleContext(HplsqlParser.From_join_type_clauseContext.class, 0);
		}

		public TerminalNode T_ON() {
			return this.getToken(196, 0);
		}

		public HplsqlParser.Bool_exprContext bool_expr() {
			return (HplsqlParser.Bool_exprContext)this.getRuleContext(HplsqlParser.Bool_exprContext.class, 0);
		}

		public From_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 153;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterFrom_join_clause(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitFrom_join_clause(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitFrom_join_clause(this) : visitor.visitChildren(this);
		}
	}

	public static class From_subselect_clauseContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public HplsqlParser.Select_stmtContext select_stmt() {
			return (HplsqlParser.Select_stmtContext)this.getRuleContext(HplsqlParser.Select_stmtContext.class, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public HplsqlParser.From_alias_clauseContext from_alias_clause() {
			return (HplsqlParser.From_alias_clauseContext)this.getRuleContext(HplsqlParser.From_alias_clauseContext.class, 0);
		}

		public From_subselect_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 152;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterFrom_subselect_clause(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitFrom_subselect_clause(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitFrom_subselect_clause(this) : visitor.visitChildren(this);
		}
	}

	public static class From_table_name_clauseContext extends ParserRuleContext {
		public HplsqlParser.Table_nameContext table_name() {
			return (HplsqlParser.Table_nameContext)this.getRuleContext(HplsqlParser.Table_nameContext.class, 0);
		}

		public HplsqlParser.From_alias_clauseContext from_alias_clause() {
			return (HplsqlParser.From_alias_clauseContext)this.getRuleContext(HplsqlParser.From_alias_clauseContext.class, 0);
		}

		public From_table_name_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 151;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterFrom_table_name_clause(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitFrom_table_name_clause(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitFrom_table_name_clause(this) : visitor.visitChildren(this);
		}
	}

	public static class From_table_clauseContext extends ParserRuleContext {
		public HplsqlParser.From_table_name_clauseContext from_table_name_clause() {
			return (HplsqlParser.From_table_name_clauseContext)this.getRuleContext(HplsqlParser.From_table_name_clauseContext.class, 0);
		}

		public HplsqlParser.From_subselect_clauseContext from_subselect_clause() {
			return (HplsqlParser.From_subselect_clauseContext)this.getRuleContext(HplsqlParser.From_subselect_clauseContext.class, 0);
		}

		public HplsqlParser.From_table_values_clauseContext from_table_values_clause() {
			return (HplsqlParser.From_table_values_clauseContext)this.getRuleContext(HplsqlParser.From_table_values_clauseContext.class, 0);
		}

		public From_table_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 150;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterFrom_table_clause(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitFrom_table_clause(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitFrom_table_clause(this) : visitor.visitChildren(this);
		}
	}

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode T_FROM() {
			return this.getToken(114, 0);
		}

		public HplsqlParser.From_table_clauseContext from_table_clause() {
			return (HplsqlParser.From_table_clauseContext)this.getRuleContext(HplsqlParser.From_table_clauseContext.class, 0);
		}

		public List<HplsqlParser.From_join_clauseContext> from_join_clause() {
			return this.getRuleContexts(HplsqlParser.From_join_clauseContext.class);
		}

		public HplsqlParser.From_join_clauseContext from_join_clause(int i) {
			return (HplsqlParser.From_join_clauseContext)this.getRuleContext(HplsqlParser.From_join_clauseContext.class, i);
		}

		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 149;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterFrom_clause(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitFrom_clause(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitFrom_clause(this) : visitor.visitChildren(this);
		}
	}

	public static class Into_clauseContext extends ParserRuleContext {
		public TerminalNode T_INTO() {
			return this.getToken(147, 0);
		}

		public List<HplsqlParser.IdentContext> ident() {
			return this.getRuleContexts(HplsqlParser.IdentContext.class);
		}

		public HplsqlParser.IdentContext ident(int i) {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, i);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Into_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 148;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterInto_clause(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitInto_clause(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitInto_clause(this) : visitor.visitChildren(this);
		}
	}

	public static class Select_list_asteriskContext extends ParserRuleContext {
		public TerminalNode L_ID() {
			return this.getToken(354, 0);
		}

		public Select_list_asteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 147;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterSelect_list_asterisk(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitSelect_list_asterisk(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_asterisk(this) : visitor.visitChildren(this);
		}
	}

	public static class Select_list_aliasContext extends ParserRuleContext {
		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_AS() {
			return this.getToken(14, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public TerminalNode T_TITLE() {
			return this.getToken(279, 0);
		}

		public TerminalNode L_S_STRING() {
			return this.getToken(355, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public Select_list_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 146;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterSelect_list_alias(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitSelect_list_alias(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_alias(this) : visitor.visitChildren(this);
		}
	}

	public static class Select_list_itemContext extends ParserRuleContext {
		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public HplsqlParser.Select_list_asteriskContext select_list_asterisk() {
			return (HplsqlParser.Select_list_asteriskContext)this.getRuleContext(HplsqlParser.Select_list_asteriskContext.class, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_EQUAL() {
			return this.getToken(337, 0);
		}

		public HplsqlParser.Select_list_aliasContext select_list_alias() {
			return (HplsqlParser.Select_list_aliasContext)this.getRuleContext(HplsqlParser.Select_list_aliasContext.class, 0);
		}

		public Select_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 145;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterSelect_list_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitSelect_list_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Select_list_limitContext extends ParserRuleContext {
		public TerminalNode T_TOP() {
			return this.getToken(281, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public Select_list_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 144;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterSelect_list_limit(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitSelect_list_limit(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_limit(this) : visitor.visitChildren(this);
		}
	}

	public static class Select_list_setContext extends ParserRuleContext {
		public TerminalNode T_ALL() {
			return this.getToken(8, 0);
		}

		public TerminalNode T_DISTINCT() {
			return this.getToken(84, 0);
		}

		public Select_list_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 143;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterSelect_list_set(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitSelect_list_set(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_set(this) : visitor.visitChildren(this);
		}
	}

	public static class Select_listContext extends ParserRuleContext {
		public List<HplsqlParser.Select_list_itemContext> select_list_item() {
			return this.getRuleContexts(HplsqlParser.Select_list_itemContext.class);
		}

		public HplsqlParser.Select_list_itemContext select_list_item(int i) {
			return (HplsqlParser.Select_list_itemContext)this.getRuleContext(HplsqlParser.Select_list_itemContext.class, i);
		}

		public HplsqlParser.Select_list_setContext select_list_set() {
			return (HplsqlParser.Select_list_setContext)this.getRuleContext(HplsqlParser.Select_list_setContext.class, 0);
		}

		public HplsqlParser.Select_list_limitContext select_list_limit() {
			return (HplsqlParser.Select_list_limitContext)this.getRuleContext(HplsqlParser.Select_list_limitContext.class, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 142;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterSelect_list(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitSelect_list(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitSelect_list(this) : visitor.visitChildren(this);
		}
	}

	public static class Subselect_stmtContext extends ParserRuleContext {
		public HplsqlParser.Select_listContext select_list() {
			return (HplsqlParser.Select_listContext)this.getRuleContext(HplsqlParser.Select_listContext.class, 0);
		}

		public TerminalNode T_SELECT() {
			return this.getToken(247, 0);
		}

		public TerminalNode T_SEL() {
			return this.getToken(246, 0);
		}

		public HplsqlParser.Into_clauseContext into_clause() {
			return (HplsqlParser.Into_clauseContext)this.getRuleContext(HplsqlParser.Into_clauseContext.class, 0);
		}

		public HplsqlParser.From_clauseContext from_clause() {
			return (HplsqlParser.From_clauseContext)this.getRuleContext(HplsqlParser.From_clauseContext.class, 0);
		}

		public HplsqlParser.Where_clauseContext where_clause() {
			return (HplsqlParser.Where_clauseContext)this.getRuleContext(HplsqlParser.Where_clauseContext.class, 0);
		}

		public HplsqlParser.Group_by_clauseContext group_by_clause() {
			return (HplsqlParser.Group_by_clauseContext)this.getRuleContext(HplsqlParser.Group_by_clauseContext.class, 0);
		}

		public HplsqlParser.Having_clauseContext having_clause() {
			return (HplsqlParser.Having_clauseContext)this.getRuleContext(HplsqlParser.Having_clauseContext.class, 0);
		}

		public HplsqlParser.Order_by_clauseContext order_by_clause() {
			return (HplsqlParser.Order_by_clauseContext)this.getRuleContext(HplsqlParser.Order_by_clauseContext.class, 0);
		}

		public HplsqlParser.Select_optionsContext select_options() {
			return (HplsqlParser.Select_optionsContext)this.getRuleContext(HplsqlParser.Select_optionsContext.class, 0);
		}

		public Subselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 141;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterSubselect_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitSubselect_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitSubselect_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Fullselect_set_clauseContext extends ParserRuleContext {
		public TerminalNode T_UNION() {
			return this.getToken(286, 0);
		}

		public TerminalNode T_ALL() {
			return this.getToken(8, 0);
		}

		public TerminalNode T_EXCEPT() {
			return this.getToken(97, 0);
		}

		public TerminalNode T_INTERSECT() {
			return this.getToken(145, 0);
		}

		public Fullselect_set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 140;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterFullselect_set_clause(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitFullselect_set_clause(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitFullselect_set_clause(this) : visitor.visitChildren(this);
		}
	}

	public static class Fullselect_stmt_itemContext extends ParserRuleContext {
		public HplsqlParser.Subselect_stmtContext subselect_stmt() {
			return (HplsqlParser.Subselect_stmtContext)this.getRuleContext(HplsqlParser.Subselect_stmtContext.class, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public HplsqlParser.Fullselect_stmtContext fullselect_stmt() {
			return (HplsqlParser.Fullselect_stmtContext)this.getRuleContext(HplsqlParser.Fullselect_stmtContext.class, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public Fullselect_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 139;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterFullselect_stmt_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitFullselect_stmt_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitFullselect_stmt_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Fullselect_stmtContext extends ParserRuleContext {
		public List<HplsqlParser.Fullselect_stmt_itemContext> fullselect_stmt_item() {
			return this.getRuleContexts(HplsqlParser.Fullselect_stmt_itemContext.class);
		}

		public HplsqlParser.Fullselect_stmt_itemContext fullselect_stmt_item(int i) {
			return (HplsqlParser.Fullselect_stmt_itemContext)this.getRuleContext(HplsqlParser.Fullselect_stmt_itemContext.class, i);
		}

		public List<HplsqlParser.Fullselect_set_clauseContext> fullselect_set_clause() {
			return this.getRuleContexts(HplsqlParser.Fullselect_set_clauseContext.class);
		}

		public HplsqlParser.Fullselect_set_clauseContext fullselect_set_clause(int i) {
			return (HplsqlParser.Fullselect_set_clauseContext)this.getRuleContext(HplsqlParser.Fullselect_set_clauseContext.class, i);
		}

		public Fullselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 138;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterFullselect_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitFullselect_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitFullselect_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Cte_select_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public List<HplsqlParser.IdentContext> ident() {
			return this.getRuleContexts(HplsqlParser.IdentContext.class);
		}

		public HplsqlParser.IdentContext ident(int i) {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, i);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Cte_select_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 137;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCte_select_cols(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCte_select_cols(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCte_select_cols(this) : visitor.visitChildren(this);
		}
	}

	public static class Cte_select_stmt_itemContext extends ParserRuleContext {
		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_AS() {
			return this.getToken(14, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public HplsqlParser.Fullselect_stmtContext fullselect_stmt() {
			return (HplsqlParser.Fullselect_stmtContext)this.getRuleContext(HplsqlParser.Fullselect_stmtContext.class, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public HplsqlParser.Cte_select_colsContext cte_select_cols() {
			return (HplsqlParser.Cte_select_colsContext)this.getRuleContext(HplsqlParser.Cte_select_colsContext.class, 0);
		}

		public Cte_select_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 136;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCte_select_stmt_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCte_select_stmt_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCte_select_stmt_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Cte_select_stmtContext extends ParserRuleContext {
		public TerminalNode T_WITH() {
			return this.getToken(302, 0);
		}

		public List<HplsqlParser.Cte_select_stmt_itemContext> cte_select_stmt_item() {
			return this.getRuleContexts(HplsqlParser.Cte_select_stmt_itemContext.class);
		}

		public HplsqlParser.Cte_select_stmt_itemContext cte_select_stmt_item(int i) {
			return (HplsqlParser.Cte_select_stmt_itemContext)this.getRuleContext(HplsqlParser.Cte_select_stmt_itemContext.class, i);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Cte_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 135;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCte_select_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCte_select_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCte_select_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public HplsqlParser.Fullselect_stmtContext fullselect_stmt() {
			return (HplsqlParser.Fullselect_stmtContext)this.getRuleContext(HplsqlParser.Fullselect_stmtContext.class, 0);
		}

		public HplsqlParser.Cte_select_stmtContext cte_select_stmt() {
			return (HplsqlParser.Cte_select_stmtContext)this.getRuleContext(HplsqlParser.Cte_select_stmtContext.class, 0);
		}

		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 134;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterSelect_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitSelect_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitSelect_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Using_clauseContext extends ParserRuleContext {
		public TerminalNode T_USING() {
			return this.getToken(291, 0);
		}

		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Using_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 133;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterUsing_clause(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitUsing_clause(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitUsing_clause(this) : visitor.visitChildren(this);
		}
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode L_LABEL() {
			return this.getToken(363, 0);
		}

		public List<TerminalNode> T_LESS() {
			return this.getTokens(343);
		}

		public TerminalNode T_LESS(int i) {
			return this.getToken(343, i);
		}

		public TerminalNode L_ID() {
			return this.getToken(354, 0);
		}

		public List<TerminalNode> T_GREATER() {
			return this.getTokens(341);
		}

		public TerminalNode T_GREATER(int i) {
			return this.getToken(341, i);
		}

		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 132;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterLabel(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitLabel(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitLabel(this) : visitor.visitChildren(this);
		}
	}

	public static class For_range_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() {
			return this.getToken(110, 0);
		}

		public TerminalNode L_ID() {
			return this.getToken(354, 0);
		}

		public TerminalNode T_IN() {
			return this.getToken(133, 0);
		}

		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public TerminalNode T_DOT2() {
			return this.getToken(336, 0);
		}

		public List<TerminalNode> T_LOOP() {
			return this.getTokens(170);
		}

		public TerminalNode T_LOOP(int i) {
			return this.getToken(170, i);
		}

		public HplsqlParser.BlockContext block() {
			return (HplsqlParser.BlockContext)this.getRuleContext(HplsqlParser.BlockContext.class, 0);
		}

		public TerminalNode T_END() {
			return this.getToken(94, 0);
		}

		public TerminalNode T_REVERSE() {
			return this.getToken(230, 0);
		}

		public TerminalNode T_BY() {
			return this.getToken(30, 0);
		}

		public TerminalNode T_STEP() {
			return this.getToken(264, 0);
		}

		public For_range_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 131;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterFor_range_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitFor_range_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitFor_range_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class For_cursor_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() {
			return this.getToken(110, 0);
		}

		public TerminalNode L_ID() {
			return this.getToken(354, 0);
		}

		public TerminalNode T_IN() {
			return this.getToken(133, 0);
		}

		public HplsqlParser.Select_stmtContext select_stmt() {
			return (HplsqlParser.Select_stmtContext)this.getRuleContext(HplsqlParser.Select_stmtContext.class, 0);
		}

		public List<TerminalNode> T_LOOP() {
			return this.getTokens(170);
		}

		public TerminalNode T_LOOP(int i) {
			return this.getToken(170, i);
		}

		public HplsqlParser.BlockContext block() {
			return (HplsqlParser.BlockContext)this.getRuleContext(HplsqlParser.BlockContext.class, 0);
		}

		public TerminalNode T_END() {
			return this.getToken(94, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public For_cursor_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 130;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterFor_cursor_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitFor_cursor_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitFor_cursor_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class While_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_WHILE() {
			return this.getTokens(301);
		}

		public TerminalNode T_WHILE(int i) {
			return this.getToken(301, i);
		}

		public HplsqlParser.Bool_exprContext bool_expr() {
			return (HplsqlParser.Bool_exprContext)this.getRuleContext(HplsqlParser.Bool_exprContext.class, 0);
		}

		public HplsqlParser.BlockContext block() {
			return (HplsqlParser.BlockContext)this.getRuleContext(HplsqlParser.BlockContext.class, 0);
		}

		public TerminalNode T_END() {
			return this.getToken(94, 0);
		}

		public TerminalNode T_DO() {
			return this.getToken(86, 0);
		}

		public List<TerminalNode> T_LOOP() {
			return this.getTokens(170);
		}

		public TerminalNode T_LOOP(int i) {
			return this.getToken(170, i);
		}

		public TerminalNode T_THEN() {
			return this.getToken(276, 0);
		}

		public TerminalNode T_BEGIN() {
			return this.getToken(21, 0);
		}

		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 129;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterWhile_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitWhile_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitWhile_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Values_into_stmtContext extends ParserRuleContext {
		public TerminalNode T_VALUES() {
			return this.getToken(293, 0);
		}

		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public TerminalNode T_INTO() {
			return this.getToken(147, 0);
		}

		public List<HplsqlParser.IdentContext> ident() {
			return this.getRuleContexts(HplsqlParser.IdentContext.class);
		}

		public HplsqlParser.IdentContext ident(int i) {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, i);
		}

		public List<TerminalNode> T_OPEN_P() {
			return this.getTokens(347);
		}

		public TerminalNode T_OPEN_P(int i) {
			return this.getToken(347, i);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public List<TerminalNode> T_CLOSE_P() {
			return this.getTokens(350);
		}

		public TerminalNode T_CLOSE_P(int i) {
			return this.getToken(350, i);
		}

		public Values_into_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 128;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterValues_into_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitValues_into_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitValues_into_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Use_stmtContext extends ParserRuleContext {
		public TerminalNode T_USE() {
			return this.getToken(290, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public Use_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 127;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterUse_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitUse_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitUse_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Truncate_stmtContext extends ParserRuleContext {
		public TerminalNode T_TRUNCATE() {
			return this.getToken(284, 0);
		}

		public HplsqlParser.Table_nameContext table_name() {
			return (HplsqlParser.Table_nameContext)this.getRuleContext(HplsqlParser.Table_nameContext.class, 0);
		}

		public TerminalNode T_TABLE() {
			return this.getToken(271, 0);
		}

		public Truncate_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 126;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterTruncate_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitTruncate_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitTruncate_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Signal_stmtContext extends ParserRuleContext {
		public TerminalNode T_SIGNAL() {
			return this.getToken(253, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public Signal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 125;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterSignal_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitSignal_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitSignal_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Set_teradata_session_optionContext extends ParserRuleContext {
		public TerminalNode T_QUERY_BAND() {
			return this.getToken(217, 0);
		}

		public TerminalNode T_EQUAL() {
			return this.getToken(337, 0);
		}

		public TerminalNode T_FOR() {
			return this.getToken(110, 0);
		}

		public TerminalNode T_TRANSACTION() {
			return this.getToken(282, 0);
		}

		public TerminalNode T_SESSION() {
			return this.getToken(249, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public TerminalNode T_NONE() {
			return this.getToken(188, 0);
		}

		public TerminalNode T_UPDATE() {
			return this.getToken(288, 0);
		}

		public Set_teradata_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 124;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterSet_teradata_session_option(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitSet_teradata_session_option(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitSet_teradata_session_option(this) : visitor.visitChildren(this);
		}
	}

	public static class Set_mssql_session_optionContext extends ParserRuleContext {
		public TerminalNode T_ANSI_NULLS() {
			return this.getToken(12, 0);
		}

		public TerminalNode T_ANSI_PADDING() {
			return this.getToken(13, 0);
		}

		public TerminalNode T_NOCOUNT() {
			return this.getToken(185, 0);
		}

		public TerminalNode T_QUOTED_IDENTIFIER() {
			return this.getToken(218, 0);
		}

		public TerminalNode T_XACT_ABORT() {
			return this.getToken(305, 0);
		}

		public TerminalNode T_ON() {
			return this.getToken(196, 0);
		}

		public TerminalNode T_OFF() {
			return this.getToken(195, 0);
		}

		public Set_mssql_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 123;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterSet_mssql_session_option(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitSet_mssql_session_option(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitSet_mssql_session_option(this) : visitor.visitChildren(this);
		}
	}

	public static class Set_current_schema_optionContext extends ParserRuleContext {
		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public TerminalNode T_CURRENT_SCHEMA() {
			return this.getToken(61, 0);
		}

		public TerminalNode T_EQUAL() {
			return this.getToken(337, 0);
		}

		public TerminalNode T_SCHEMA() {
			return this.getToken(243, 0);
		}

		public TerminalNode T_CURRENT() {
			return this.getToken(60, 0);
		}

		public Set_current_schema_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 122;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterSet_current_schema_option(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitSet_current_schema_option(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitSet_current_schema_option(this) : visitor.visitChildren(this);
		}
	}

	public static class Set_session_optionContext extends ParserRuleContext {
		public HplsqlParser.Set_current_schema_optionContext set_current_schema_option() {
			return (HplsqlParser.Set_current_schema_optionContext)this.getRuleContext(HplsqlParser.Set_current_schema_optionContext.class, 0);
		}

		public HplsqlParser.Set_mssql_session_optionContext set_mssql_session_option() {
			return (HplsqlParser.Set_mssql_session_optionContext)this.getRuleContext(HplsqlParser.Set_mssql_session_optionContext.class, 0);
		}

		public HplsqlParser.Set_teradata_session_optionContext set_teradata_session_option() {
			return (HplsqlParser.Set_teradata_session_optionContext)this.getRuleContext(HplsqlParser.Set_teradata_session_optionContext.class, 0);
		}

		public Set_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 121;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterSet_session_option(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitSet_session_option(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitSet_session_option(this) : visitor.visitChildren(this);
		}
	}

	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode T_ROLLBACK() {
			return this.getToken(234, 0);
		}

		public TerminalNode T_WORK() {
			return this.getToken(304, 0);
		}

		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 120;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterRollback_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitRollback_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitRollback_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode T_RETURN() {
			return this.getToken(228, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 119;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterReturn_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitReturn_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitReturn_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Resignal_stmtContext extends ParserRuleContext {
		public TerminalNode T_RESIGNAL() {
			return this.getToken(224, 0);
		}

		public TerminalNode T_SQLSTATE() {
			return this.getToken(262, 0);
		}

		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public TerminalNode T_VALUE() {
			return this.getToken(292, 0);
		}

		public TerminalNode T_SET() {
			return this.getToken(248, 0);
		}

		public TerminalNode T_MESSAGE_TEXT() {
			return this.getToken(176, 0);
		}

		public TerminalNode T_EQUAL() {
			return this.getToken(337, 0);
		}

		public Resignal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 118;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterResignal_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitResignal_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitResignal_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Raise_stmtContext extends ParserRuleContext {
		public TerminalNode T_RAISE() {
			return this.getToken(219, 0);
		}

		public Raise_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 117;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterRaise_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitRaise_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitRaise_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode T_PRINT() {
			return this.getToken(214, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 116;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterPrint_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitPrint_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitPrint_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Index_mssql_storage_clauseContext extends ParserRuleContext {
		public TerminalNode T_WITH() {
			return this.getToken(302, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public List<HplsqlParser.IdentContext> ident() {
			return this.getRuleContexts(HplsqlParser.IdentContext.class);
		}

		public HplsqlParser.IdentContext ident(int i) {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, i);
		}

		public List<TerminalNode> T_EQUAL() {
			return this.getTokens(337);
		}

		public TerminalNode T_EQUAL(int i) {
			return this.getToken(337, i);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public List<HplsqlParser.Create_table_options_mssql_itemContext> create_table_options_mssql_item() {
			return this.getRuleContexts(HplsqlParser.Create_table_options_mssql_itemContext.class);
		}

		public HplsqlParser.Create_table_options_mssql_itemContext create_table_options_mssql_item(int i) {
			return (HplsqlParser.Create_table_options_mssql_itemContext)this.getRuleContext(HplsqlParser.Create_table_options_mssql_itemContext.class, i);
		}

		public Index_mssql_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 115;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterIndex_mssql_storage_clause(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitIndex_mssql_storage_clause(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitIndex_mssql_storage_clause(this) : visitor.visitChildren(this);
		}
	}

	public static class Index_storage_clauseContext extends ParserRuleContext {
		public HplsqlParser.Index_mssql_storage_clauseContext index_mssql_storage_clause() {
			return (HplsqlParser.Index_mssql_storage_clauseContext)this.getRuleContext(HplsqlParser.Index_mssql_storage_clauseContext.class, 0);
		}

		public Index_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 114;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterIndex_storage_clause(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitIndex_storage_clause(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitIndex_storage_clause(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_index_colContext extends ParserRuleContext {
		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_ASC() {
			return this.getToken(15, 0);
		}

		public TerminalNode T_DESC() {
			return this.getToken(79, 0);
		}

		public Create_index_colContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 113;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_index_col(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_index_col(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_index_col(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() {
			return this.getToken(56, 0);
		}

		public TerminalNode T_INDEX() {
			return this.getToken(135, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_ON() {
			return this.getToken(196, 0);
		}

		public HplsqlParser.Table_nameContext table_name() {
			return (HplsqlParser.Table_nameContext)this.getRuleContext(HplsqlParser.Table_nameContext.class, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public List<HplsqlParser.Create_index_colContext> create_index_col() {
			return this.getRuleContexts(HplsqlParser.Create_index_colContext.class);
		}

		public HplsqlParser.Create_index_colContext create_index_col(int i) {
			return (HplsqlParser.Create_index_colContext)this.getRuleContext(HplsqlParser.Create_index_colContext.class, i);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public TerminalNode T_UNIQUE() {
			return this.getToken(287, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 112;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_index_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_index_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_index_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode T_COMMIT() {
			return this.getToken(48, 0);
		}

		public TerminalNode T_WORK() {
			return this.getToken(304, 0);
		}

		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 111;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCommit_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCommit_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCommit_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Copy_ftp_optionContext extends ParserRuleContext {
		public TerminalNode T_USER() {
			return this.getToken(330, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public TerminalNode T_PWD() {
			return this.getToken(241, 0);
		}

		public TerminalNode T_DIR() {
			return this.getToken(82, 0);
		}

		public HplsqlParser.File_nameContext file_name() {
			return (HplsqlParser.File_nameContext)this.getRuleContext(HplsqlParser.File_nameContext.class, 0);
		}

		public TerminalNode T_FILES() {
			return this.getToken(108, 0);
		}

		public TerminalNode T_NEW() {
			return this.getToken(182, 0);
		}

		public TerminalNode T_OVERWRITE() {
			return this.getToken(204, 0);
		}

		public TerminalNode T_SUBDIR() {
			return this.getToken(267, 0);
		}

		public TerminalNode T_SESSIONS() {
			return this.getToken(250, 0);
		}

		public TerminalNode T_TO() {
			return this.getToken(280, 0);
		}

		public TerminalNode T_LOCAL() {
			return this.getToken(162, 0);
		}

		public Copy_ftp_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 110;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCopy_ftp_option(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCopy_ftp_option(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCopy_ftp_option(this) : visitor.visitChildren(this);
		}
	}

	public static class Copy_file_optionContext extends ParserRuleContext {
		public TerminalNode T_DELETE() {
			return this.getToken(76, 0);
		}

		public TerminalNode T_IGNORE() {
			return this.getToken(131, 0);
		}

		public TerminalNode T_OVERWRITE() {
			return this.getToken(204, 0);
		}

		public Copy_file_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 109;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCopy_file_option(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCopy_file_option(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCopy_file_option(this) : visitor.visitChildren(this);
		}
	}

	public static class Copy_optionContext extends ParserRuleContext {
		public TerminalNode T_AT() {
			return this.getToken(17, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_BATCHSIZE() {
			return this.getToken(20, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public TerminalNode T_DELIMITER() {
			return this.getToken(78, 0);
		}

		public TerminalNode T_SQLINSERT() {
			return this.getToken(261, 0);
		}

		public Copy_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 108;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCopy_option(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCopy_option(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCopy_option(this) : visitor.visitChildren(this);
		}
	}

	public static class Copy_targetContext extends ParserRuleContext {
		public HplsqlParser.File_nameContext file_name() {
			return (HplsqlParser.File_nameContext)this.getRuleContext(HplsqlParser.File_nameContext.class, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public Copy_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 107;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCopy_target(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCopy_target(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCopy_target(this) : visitor.visitChildren(this);
		}
	}

	public static class Copy_sourceContext extends ParserRuleContext {
		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public TerminalNode L_FILE() {
			return this.getToken(362, 0);
		}

		public Copy_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 106;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCopy_source(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCopy_source(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCopy_source(this) : visitor.visitChildren(this);
		}
	}

	public static class Copy_stmtContext extends ParserRuleContext {
		public TerminalNode T_COPY() {
			return this.getToken(53, 0);
		}

		public TerminalNode T_TO() {
			return this.getToken(280, 0);
		}

		public HplsqlParser.Copy_targetContext copy_target() {
			return (HplsqlParser.Copy_targetContext)this.getRuleContext(HplsqlParser.Copy_targetContext.class, 0);
		}

		public HplsqlParser.Table_nameContext table_name() {
			return (HplsqlParser.Table_nameContext)this.getRuleContext(HplsqlParser.Table_nameContext.class, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public HplsqlParser.Select_stmtContext select_stmt() {
			return (HplsqlParser.Select_stmtContext)this.getRuleContext(HplsqlParser.Select_stmtContext.class, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public TerminalNode T_HDFS() {
			return this.getToken(126, 0);
		}

		public List<HplsqlParser.Copy_optionContext> copy_option() {
			return this.getRuleContexts(HplsqlParser.Copy_optionContext.class);
		}

		public HplsqlParser.Copy_optionContext copy_option(int i) {
			return (HplsqlParser.Copy_optionContext)this.getRuleContext(HplsqlParser.Copy_optionContext.class, i);
		}

		public Copy_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 105;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCopy_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCopy_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCopy_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Copy_from_local_stmtContext extends ParserRuleContext {
		public TerminalNode T_COPY() {
			return this.getToken(53, 0);
		}

		public TerminalNode T_FROM() {
			return this.getToken(114, 0);
		}

		public TerminalNode T_LOCAL() {
			return this.getToken(162, 0);
		}

		public List<HplsqlParser.Copy_sourceContext> copy_source() {
			return this.getRuleContexts(HplsqlParser.Copy_sourceContext.class);
		}

		public HplsqlParser.Copy_sourceContext copy_source(int i) {
			return (HplsqlParser.Copy_sourceContext)this.getRuleContext(HplsqlParser.Copy_sourceContext.class, i);
		}

		public TerminalNode T_TO() {
			return this.getToken(280, 0);
		}

		public HplsqlParser.Copy_targetContext copy_target() {
			return (HplsqlParser.Copy_targetContext)this.getRuleContext(HplsqlParser.Copy_targetContext.class, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public List<HplsqlParser.Copy_file_optionContext> copy_file_option() {
			return this.getRuleContexts(HplsqlParser.Copy_file_optionContext.class);
		}

		public HplsqlParser.Copy_file_optionContext copy_file_option(int i) {
			return (HplsqlParser.Copy_file_optionContext)this.getRuleContext(HplsqlParser.Copy_file_optionContext.class, i);
		}

		public Copy_from_local_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 104;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCopy_from_local_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCopy_from_local_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCopy_from_local_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Copy_from_ftp_stmtContext extends ParserRuleContext {
		public TerminalNode T_COPY() {
			return this.getToken(53, 0);
		}

		public TerminalNode T_FROM() {
			return this.getToken(114, 0);
		}

		public TerminalNode T_FTP() {
			return this.getToken(115, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public List<HplsqlParser.Copy_ftp_optionContext> copy_ftp_option() {
			return this.getRuleContexts(HplsqlParser.Copy_ftp_optionContext.class);
		}

		public HplsqlParser.Copy_ftp_optionContext copy_ftp_option(int i) {
			return (HplsqlParser.Copy_ftp_optionContext)this.getRuleContext(HplsqlParser.Copy_ftp_optionContext.class, i);
		}

		public Copy_from_ftp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 103;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCopy_from_ftp_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCopy_from_ftp_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCopy_from_ftp_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Cmp_sourceContext extends ParserRuleContext {
		public HplsqlParser.Table_nameContext table_name() {
			return (HplsqlParser.Table_nameContext)this.getRuleContext(HplsqlParser.Table_nameContext.class, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public HplsqlParser.Select_stmtContext select_stmt() {
			return (HplsqlParser.Select_stmtContext)this.getRuleContext(HplsqlParser.Select_stmtContext.class, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public TerminalNode T_AT() {
			return this.getToken(17, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public HplsqlParser.Where_clauseContext where_clause() {
			return (HplsqlParser.Where_clauseContext)this.getRuleContext(HplsqlParser.Where_clauseContext.class, 0);
		}

		public Cmp_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 102;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCmp_source(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCmp_source(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCmp_source(this) : visitor.visitChildren(this);
		}
	}

	public static class Cmp_stmtContext extends ParserRuleContext {
		public TerminalNode T_CMP() {
			return this.getToken(44, 0);
		}

		public List<HplsqlParser.Cmp_sourceContext> cmp_source() {
			return this.getRuleContexts(HplsqlParser.Cmp_sourceContext.class);
		}

		public HplsqlParser.Cmp_sourceContext cmp_source(int i) {
			return (HplsqlParser.Cmp_sourceContext)this.getRuleContext(HplsqlParser.Cmp_sourceContext.class, i);
		}

		public TerminalNode T_COMMA() {
			return this.getToken(333, 0);
		}

		public TerminalNode T_ROW_COUNT() {
			return this.getToken(238, 0);
		}

		public TerminalNode T_SUM() {
			return this.getToken(269, 0);
		}

		public Cmp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 101;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCmp_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCmp_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCmp_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Close_stmtContext extends ParserRuleContext {
		public TerminalNode T_CLOSE() {
			return this.getToken(42, 0);
		}

		public TerminalNode L_ID() {
			return this.getToken(354, 0);
		}

		public Close_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 100;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterClose_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitClose_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitClose_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Fetch_stmtContext extends ParserRuleContext {
		public TerminalNode T_FETCH() {
			return this.getToken(105, 0);
		}

		public List<TerminalNode> L_ID() {
			return this.getTokens(354);
		}

		public TerminalNode L_ID(int i) {
			return this.getToken(354, i);
		}

		public TerminalNode T_INTO() {
			return this.getToken(147, 0);
		}

		public TerminalNode T_FROM() {
			return this.getToken(114, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Fetch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 99;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterFetch_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitFetch_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitFetch_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Open_stmtContext extends ParserRuleContext {
		public TerminalNode T_OPEN() {
			return this.getToken(198, 0);
		}

		public TerminalNode L_ID() {
			return this.getToken(354, 0);
		}

		public TerminalNode T_FOR() {
			return this.getToken(110, 0);
		}

		public HplsqlParser.Select_stmtContext select_stmt() {
			return (HplsqlParser.Select_stmtContext)this.getRuleContext(HplsqlParser.Select_stmtContext.class, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public Open_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 98;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterOpen_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitOpen_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitOpen_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Map_object_stmtContext extends ParserRuleContext {
		public TerminalNode T_MAP() {
			return this.getToken(171, 0);
		}

		public TerminalNode T_OBJECT() {
			return this.getToken(194, 0);
		}

		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public TerminalNode T_TO() {
			return this.getToken(280, 0);
		}

		public TerminalNode T_AT() {
			return this.getToken(17, 0);
		}

		public Map_object_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 97;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterMap_object_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitMap_object_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitMap_object_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Leave_stmtContext extends ParserRuleContext {
		public TerminalNode T_LEAVE() {
			return this.getToken(157, 0);
		}

		public TerminalNode L_ID() {
			return this.getToken(354, 0);
		}

		public Leave_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 96;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterLeave_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitLeave_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitLeave_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Grant_stmt_itemContext extends ParserRuleContext {
		public TerminalNode T_EXECUTE() {
			return this.getToken(99, 0);
		}

		public TerminalNode T_ON() {
			return this.getToken(196, 0);
		}

		public TerminalNode T_PROCEDURE() {
			return this.getToken(216, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public Grant_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 95;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterGrant_stmt_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitGrant_stmt_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitGrant_stmt_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Grant_stmtContext extends ParserRuleContext {
		public TerminalNode T_GRANT() {
			return this.getToken(121, 0);
		}

		public List<HplsqlParser.Grant_stmt_itemContext> grant_stmt_item() {
			return this.getRuleContexts(HplsqlParser.Grant_stmt_itemContext.class);
		}

		public HplsqlParser.Grant_stmt_itemContext grant_stmt_item(int i) {
			return (HplsqlParser.Grant_stmt_itemContext)this.getRuleContext(HplsqlParser.Grant_stmt_itemContext.class, i);
		}

		public TerminalNode T_TO() {
			return this.getToken(280, 0);
		}

		public TerminalNode T_ROLE() {
			return this.getToken(233, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Grant_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 94;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterGrant_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitGrant_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitGrant_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Get_diag_stmt_rowcount_itemContext extends ParserRuleContext {
		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_EQUAL() {
			return this.getToken(337, 0);
		}

		public TerminalNode T_ROW_COUNT() {
			return this.getToken(238, 0);
		}

		public Get_diag_stmt_rowcount_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 93;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterGet_diag_stmt_rowcount_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitGet_diag_stmt_rowcount_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitGet_diag_stmt_rowcount_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Get_diag_stmt_exception_itemContext extends ParserRuleContext {
		public TerminalNode T_EXCEPTION() {
			return this.getToken(100, 0);
		}

		public TerminalNode L_INT() {
			return this.getToken(357, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_EQUAL() {
			return this.getToken(337, 0);
		}

		public TerminalNode T_MESSAGE_TEXT() {
			return this.getToken(176, 0);
		}

		public Get_diag_stmt_exception_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 92;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterGet_diag_stmt_exception_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitGet_diag_stmt_exception_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitGet_diag_stmt_exception_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Get_diag_stmt_itemContext extends ParserRuleContext {
		public HplsqlParser.Get_diag_stmt_exception_itemContext get_diag_stmt_exception_item() {
			return (HplsqlParser.Get_diag_stmt_exception_itemContext)this.getRuleContext(HplsqlParser.Get_diag_stmt_exception_itemContext.class, 0);
		}

		public HplsqlParser.Get_diag_stmt_rowcount_itemContext get_diag_stmt_rowcount_item() {
			return (HplsqlParser.Get_diag_stmt_rowcount_itemContext)this.getRuleContext(HplsqlParser.Get_diag_stmt_rowcount_itemContext.class, 0);
		}

		public Get_diag_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 91;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterGet_diag_stmt_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitGet_diag_stmt_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitGet_diag_stmt_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Get_diag_stmtContext extends ParserRuleContext {
		public TerminalNode T_GET() {
			return this.getToken(118, 0);
		}

		public TerminalNode T_DIAGNOSTICS() {
			return this.getToken(81, 0);
		}

		public HplsqlParser.Get_diag_stmt_itemContext get_diag_stmt_item() {
			return (HplsqlParser.Get_diag_stmt_itemContext)this.getRuleContext(HplsqlParser.Get_diag_stmt_itemContext.class, 0);
		}

		public Get_diag_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 90;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterGet_diag_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitGet_diag_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitGet_diag_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Exit_stmtContext extends ParserRuleContext {
		public TerminalNode T_EXIT() {
			return this.getToken(103, 0);
		}

		public TerminalNode L_ID() {
			return this.getToken(354, 0);
		}

		public TerminalNode T_WHEN() {
			return this.getToken(299, 0);
		}

		public HplsqlParser.Bool_exprContext bool_expr() {
			return (HplsqlParser.Bool_exprContext)this.getRuleContext(HplsqlParser.Bool_exprContext.class, 0);
		}

		public Exit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 89;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExit_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExit_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExit_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Insert_directory_stmtContext extends ParserRuleContext {
		public TerminalNode T_INSERT() {
			return this.getToken(139, 0);
		}

		public TerminalNode T_OVERWRITE() {
			return this.getToken(204, 0);
		}

		public TerminalNode T_DIRECTORY() {
			return this.getToken(83, 0);
		}

		public HplsqlParser.Expr_fileContext expr_file() {
			return (HplsqlParser.Expr_fileContext)this.getRuleContext(HplsqlParser.Expr_fileContext.class, 0);
		}

		public HplsqlParser.Expr_selectContext expr_select() {
			return (HplsqlParser.Expr_selectContext)this.getRuleContext(HplsqlParser.Expr_selectContext.class, 0);
		}

		public TerminalNode T_LOCAL() {
			return this.getToken(162, 0);
		}

		public Insert_directory_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 88;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterInsert_directory_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitInsert_directory_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitInsert_directory_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Insert_stmt_rowContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Insert_stmt_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 87;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterInsert_stmt_row(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitInsert_stmt_row(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitInsert_stmt_row(this) : visitor.visitChildren(this);
		}
	}

	public static class Insert_stmt_rowsContext extends ParserRuleContext {
		public TerminalNode T_VALUES() {
			return this.getToken(293, 0);
		}

		public List<HplsqlParser.Insert_stmt_rowContext> insert_stmt_row() {
			return this.getRuleContexts(HplsqlParser.Insert_stmt_rowContext.class);
		}

		public HplsqlParser.Insert_stmt_rowContext insert_stmt_row(int i) {
			return (HplsqlParser.Insert_stmt_rowContext)this.getRuleContext(HplsqlParser.Insert_stmt_rowContext.class, i);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Insert_stmt_rowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 86;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterInsert_stmt_rows(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitInsert_stmt_rows(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitInsert_stmt_rows(this) : visitor.visitChildren(this);
		}
	}

	public static class Insert_stmt_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public List<HplsqlParser.IdentContext> ident() {
			return this.getRuleContexts(HplsqlParser.IdentContext.class);
		}

		public HplsqlParser.IdentContext ident(int i) {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, i);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Insert_stmt_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 85;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterInsert_stmt_cols(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitInsert_stmt_cols(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitInsert_stmt_cols(this) : visitor.visitChildren(this);
		}
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode T_INSERT() {
			return this.getToken(139, 0);
		}

		public HplsqlParser.Table_nameContext table_name() {
			return (HplsqlParser.Table_nameContext)this.getRuleContext(HplsqlParser.Table_nameContext.class, 0);
		}

		public TerminalNode T_OVERWRITE() {
			return this.getToken(204, 0);
		}

		public TerminalNode T_TABLE() {
			return this.getToken(271, 0);
		}

		public TerminalNode T_INTO() {
			return this.getToken(147, 0);
		}

		public HplsqlParser.Select_stmtContext select_stmt() {
			return (HplsqlParser.Select_stmtContext)this.getRuleContext(HplsqlParser.Select_stmtContext.class, 0);
		}

		public HplsqlParser.Insert_stmt_rowsContext insert_stmt_rows() {
			return (HplsqlParser.Insert_stmt_rowsContext)this.getRuleContext(HplsqlParser.Insert_stmt_rowsContext.class, 0);
		}

		public HplsqlParser.Insert_stmt_colsContext insert_stmt_cols() {
			return (HplsqlParser.Insert_stmt_colsContext)this.getRuleContext(HplsqlParser.Insert_stmt_colsContext.class, 0);
		}

		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 84;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterInsert_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitInsert_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitInsert_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Include_stmtContext extends ParserRuleContext {
		public TerminalNode T_INCLUDE() {
			return this.getToken(134, 0);
		}

		public HplsqlParser.File_nameContext file_name() {
			return (HplsqlParser.File_nameContext)this.getRuleContext(HplsqlParser.File_nameContext.class, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public Include_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 83;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterInclude_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitInclude_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitInclude_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode T_ELSE() {
			return this.getToken(90, 0);
		}

		public HplsqlParser.BlockContext block() {
			return (HplsqlParser.BlockContext)this.getRuleContext(HplsqlParser.BlockContext.class, 0);
		}

		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 82;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterElse_block(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitElse_block(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitElse_block(this) : visitor.visitChildren(this);
		}
	}

	public static class Elseif_blockContext extends ParserRuleContext {
		public HplsqlParser.Bool_exprContext bool_expr() {
			return (HplsqlParser.Bool_exprContext)this.getRuleContext(HplsqlParser.Bool_exprContext.class, 0);
		}

		public TerminalNode T_THEN() {
			return this.getToken(276, 0);
		}

		public HplsqlParser.BlockContext block() {
			return (HplsqlParser.BlockContext)this.getRuleContext(HplsqlParser.BlockContext.class, 0);
		}

		public TerminalNode T_ELSIF() {
			return this.getToken(92, 0);
		}

		public TerminalNode T_ELSEIF() {
			return this.getToken(91, 0);
		}

		public Elseif_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 81;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterElseif_block(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitElseif_block(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitElseif_block(this) : visitor.visitChildren(this);
		}
	}

	public static class If_tsql_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() {
			return this.getToken(130, 0);
		}

		public HplsqlParser.Bool_exprContext bool_expr() {
			return (HplsqlParser.Bool_exprContext)this.getRuleContext(HplsqlParser.Bool_exprContext.class, 0);
		}

		public List<HplsqlParser.Single_block_stmtContext> single_block_stmt() {
			return this.getRuleContexts(HplsqlParser.Single_block_stmtContext.class);
		}

		public HplsqlParser.Single_block_stmtContext single_block_stmt(int i) {
			return (HplsqlParser.Single_block_stmtContext)this.getRuleContext(HplsqlParser.Single_block_stmtContext.class, i);
		}

		public TerminalNode T_ELSE() {
			return this.getToken(90, 0);
		}

		public If_tsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 80;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterIf_tsql_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitIf_tsql_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitIf_tsql_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class If_plsql_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_IF() {
			return this.getTokens(130);
		}

		public TerminalNode T_IF(int i) {
			return this.getToken(130, i);
		}

		public HplsqlParser.Bool_exprContext bool_expr() {
			return (HplsqlParser.Bool_exprContext)this.getRuleContext(HplsqlParser.Bool_exprContext.class, 0);
		}

		public TerminalNode T_THEN() {
			return this.getToken(276, 0);
		}

		public HplsqlParser.BlockContext block() {
			return (HplsqlParser.BlockContext)this.getRuleContext(HplsqlParser.BlockContext.class, 0);
		}

		public TerminalNode T_END() {
			return this.getToken(94, 0);
		}

		public List<HplsqlParser.Elseif_blockContext> elseif_block() {
			return this.getRuleContexts(HplsqlParser.Elseif_blockContext.class);
		}

		public HplsqlParser.Elseif_blockContext elseif_block(int i) {
			return (HplsqlParser.Elseif_blockContext)this.getRuleContext(HplsqlParser.Elseif_blockContext.class, i);
		}

		public HplsqlParser.Else_blockContext else_block() {
			return (HplsqlParser.Else_blockContext)this.getRuleContext(HplsqlParser.Else_blockContext.class, 0);
		}

		public If_plsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 79;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterIf_plsql_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitIf_plsql_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitIf_plsql_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class If_stmtContext extends ParserRuleContext {
		public HplsqlParser.If_plsql_stmtContext if_plsql_stmt() {
			return (HplsqlParser.If_plsql_stmtContext)this.getRuleContext(HplsqlParser.If_plsql_stmtContext.class, 0);
		}

		public HplsqlParser.If_tsql_stmtContext if_tsql_stmt() {
			return (HplsqlParser.If_tsql_stmtContext)this.getRuleContext(HplsqlParser.If_tsql_stmtContext.class, 0);
		}

		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 78;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterIf_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitIf_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitIf_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Exec_stmtContext extends ParserRuleContext {
		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public TerminalNode T_EXEC() {
			return this.getToken(98, 0);
		}

		public TerminalNode T_EXECUTE() {
			return this.getToken(99, 0);
		}

		public TerminalNode T_IMMEDIATE() {
			return this.getToken(132, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public HplsqlParser.Expr_func_paramsContext expr_func_params() {
			return (HplsqlParser.Expr_func_paramsContext)this.getRuleContext(HplsqlParser.Expr_func_paramsContext.class, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public TerminalNode T_INTO() {
			return this.getToken(147, 0);
		}

		public List<TerminalNode> L_ID() {
			return this.getTokens(354);
		}

		public TerminalNode L_ID(int i) {
			return this.getToken(354, i);
		}

		public HplsqlParser.Using_clauseContext using_clause() {
			return (HplsqlParser.Using_clauseContext)this.getRuleContext(HplsqlParser.Using_clauseContext.class, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Exec_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 77;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExec_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExec_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExec_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class End_transaction_stmtContext extends ParserRuleContext {
		public TerminalNode T_END() {
			return this.getToken(94, 0);
		}

		public TerminalNode T_TRANSACTION() {
			return this.getToken(282, 0);
		}

		public End_transaction_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 76;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterEnd_transaction_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitEnd_transaction_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitEnd_transaction_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Drop_stmtContext extends ParserRuleContext {
		public TerminalNode T_DROP() {
			return this.getToken(88, 0);
		}

		public TerminalNode T_TABLE() {
			return this.getToken(271, 0);
		}

		public HplsqlParser.Table_nameContext table_name() {
			return (HplsqlParser.Table_nameContext)this.getRuleContext(HplsqlParser.Table_nameContext.class, 0);
		}

		public TerminalNode T_IF() {
			return this.getToken(130, 0);
		}

		public TerminalNode T_EXISTS() {
			return this.getToken(102, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public TerminalNode T_DATABASE() {
			return this.getToken(63, 0);
		}

		public TerminalNode T_SCHEMA() {
			return this.getToken(243, 0);
		}

		public Drop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 75;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterDrop_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitDrop_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitDrop_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_routine_optionContext extends ParserRuleContext {
		public TerminalNode T_LANGUAGE() {
			return this.getToken(156, 0);
		}

		public TerminalNode T_SQL() {
			return this.getToken(259, 0);
		}

		public TerminalNode T_SECURITY() {
			return this.getToken(244, 0);
		}

		public TerminalNode T_CREATOR() {
			return this.getToken(58, 0);
		}

		public TerminalNode T_DEFINER() {
			return this.getToken(74, 0);
		}

		public TerminalNode T_INVOKER() {
			return this.getToken(148, 0);
		}

		public TerminalNode T_OWNER() {
			return this.getToken(205, 0);
		}

		public TerminalNode T_RESULT() {
			return this.getToken(226, 0);
		}

		public TerminalNode T_SETS() {
			return this.getToken(251, 0);
		}

		public TerminalNode L_INT() {
			return this.getToken(357, 0);
		}

		public TerminalNode T_DYNAMIC() {
			return this.getToken(89, 0);
		}

		public Create_routine_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 74;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_routine_option(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_routine_option(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_routine_option(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_routine_optionsContext extends ParserRuleContext {
		public List<HplsqlParser.Create_routine_optionContext> create_routine_option() {
			return this.getRuleContexts(HplsqlParser.Create_routine_optionContext.class);
		}

		public HplsqlParser.Create_routine_optionContext create_routine_option(int i) {
			return (HplsqlParser.Create_routine_optionContext)this.getRuleContext(HplsqlParser.Create_routine_optionContext.class, i);
		}

		public Create_routine_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 73;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_routine_options(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_routine_options(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_routine_options(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_routine_param_itemContext extends ParserRuleContext {
		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public HplsqlParser.DtypeContext dtype() {
			return (HplsqlParser.DtypeContext)this.getRuleContext(HplsqlParser.DtypeContext.class, 0);
		}

		public TerminalNode T_IN() {
			return this.getToken(133, 0);
		}

		public TerminalNode T_OUT() {
			return this.getToken(201, 0);
		}

		public TerminalNode T_INOUT() {
			return this.getToken(138, 0);
		}

		public HplsqlParser.Dtype_lenContext dtype_len() {
			return (HplsqlParser.Dtype_lenContext)this.getRuleContext(HplsqlParser.Dtype_lenContext.class, 0);
		}

		public List<HplsqlParser.Dtype_attrContext> dtype_attr() {
			return this.getRuleContexts(HplsqlParser.Dtype_attrContext.class);
		}

		public HplsqlParser.Dtype_attrContext dtype_attr(int i) {
			return (HplsqlParser.Dtype_attrContext)this.getRuleContext(HplsqlParser.Dtype_attrContext.class, i);
		}

		public HplsqlParser.Dtype_defaultContext dtype_default() {
			return (HplsqlParser.Dtype_defaultContext)this.getRuleContext(HplsqlParser.Dtype_defaultContext.class, 0);
		}

		public Create_routine_param_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 72;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_routine_param_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_routine_param_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_routine_param_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_routine_paramsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public List<HplsqlParser.Create_routine_param_itemContext> create_routine_param_item() {
			return this.getRuleContexts(HplsqlParser.Create_routine_param_itemContext.class);
		}

		public HplsqlParser.Create_routine_param_itemContext create_routine_param_item(int i) {
			return (HplsqlParser.Create_routine_param_itemContext)this.getRuleContext(HplsqlParser.Create_routine_param_itemContext.class, i);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Create_routine_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 71;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_routine_params(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_routine_params(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_routine_params(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_procedure_stmtContext extends ParserRuleContext {
		public List<HplsqlParser.IdentContext> ident() {
			return this.getRuleContexts(HplsqlParser.IdentContext.class);
		}

		public HplsqlParser.IdentContext ident(int i) {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, i);
		}

		public HplsqlParser.Proc_blockContext proc_block() {
			return (HplsqlParser.Proc_blockContext)this.getRuleContext(HplsqlParser.Proc_blockContext.class, 0);
		}

		public TerminalNode T_PROCEDURE() {
			return this.getToken(216, 0);
		}

		public TerminalNode T_PROC() {
			return this.getToken(215, 0);
		}

		public TerminalNode T_ALTER() {
			return this.getToken(10, 0);
		}

		public TerminalNode T_CREATE() {
			return this.getToken(56, 0);
		}

		public TerminalNode T_REPLACE() {
			return this.getToken(223, 0);
		}

		public HplsqlParser.Create_routine_paramsContext create_routine_params() {
			return (HplsqlParser.Create_routine_paramsContext)this.getRuleContext(HplsqlParser.Create_routine_paramsContext.class, 0);
		}

		public HplsqlParser.Create_routine_optionsContext create_routine_options() {
			return (HplsqlParser.Create_routine_optionsContext)this.getRuleContext(HplsqlParser.Create_routine_optionsContext.class, 0);
		}

		public HplsqlParser.Declare_block_inplaceContext declare_block_inplace() {
			return (HplsqlParser.Declare_block_inplaceContext)this.getRuleContext(HplsqlParser.Declare_block_inplaceContext.class, 0);
		}

		public HplsqlParser.LabelContext label() {
			return (HplsqlParser.LabelContext)this.getRuleContext(HplsqlParser.LabelContext.class, 0);
		}

		public TerminalNode T_SEMICOLON() {
			return this.getToken(352, 0);
		}

		public TerminalNode T_AS() {
			return this.getToken(14, 0);
		}

		public TerminalNode T_IS() {
			return this.getToken(149, 0);
		}

		public TerminalNode T_OR() {
			return this.getToken(199, 0);
		}

		public Create_procedure_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 70;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_procedure_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_procedure_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_procedure_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Package_body_itemContext extends ParserRuleContext {
		public HplsqlParser.Declare_stmt_itemContext declare_stmt_item() {
			return (HplsqlParser.Declare_stmt_itemContext)this.getRuleContext(HplsqlParser.Declare_stmt_itemContext.class, 0);
		}

		public HplsqlParser.Create_function_stmtContext create_function_stmt() {
			return (HplsqlParser.Create_function_stmtContext)this.getRuleContext(HplsqlParser.Create_function_stmtContext.class, 0);
		}

		public HplsqlParser.Create_procedure_stmtContext create_procedure_stmt() {
			return (HplsqlParser.Create_procedure_stmtContext)this.getRuleContext(HplsqlParser.Create_procedure_stmtContext.class, 0);
		}

		public Package_body_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 69;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterPackage_body_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitPackage_body_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitPackage_body_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Package_bodyContext extends ParserRuleContext {
		public List<HplsqlParser.Package_body_itemContext> package_body_item() {
			return this.getRuleContexts(HplsqlParser.Package_body_itemContext.class);
		}

		public HplsqlParser.Package_body_itemContext package_body_item(int i) {
			return (HplsqlParser.Package_body_itemContext)this.getRuleContext(HplsqlParser.Package_body_itemContext.class, i);
		}

		public List<TerminalNode> T_SEMICOLON() {
			return this.getTokens(352);
		}

		public TerminalNode T_SEMICOLON(int i) {
			return this.getToken(352, i);
		}

		public Package_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 68;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterPackage_body(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitPackage_body(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitPackage_body(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_package_body_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() {
			return this.getToken(206, 0);
		}

		public TerminalNode T_BODY() {
			return this.getToken(28, 0);
		}

		public List<HplsqlParser.IdentContext> ident() {
			return this.getRuleContexts(HplsqlParser.IdentContext.class);
		}

		public HplsqlParser.IdentContext ident(int i) {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, i);
		}

		public HplsqlParser.Package_bodyContext package_body() {
			return (HplsqlParser.Package_bodyContext)this.getRuleContext(HplsqlParser.Package_bodyContext.class, 0);
		}

		public TerminalNode T_END() {
			return this.getToken(94, 0);
		}

		public TerminalNode T_AS() {
			return this.getToken(14, 0);
		}

		public TerminalNode T_IS() {
			return this.getToken(149, 0);
		}

		public TerminalNode T_ALTER() {
			return this.getToken(10, 0);
		}

		public TerminalNode T_CREATE() {
			return this.getToken(56, 0);
		}

		public TerminalNode T_REPLACE() {
			return this.getToken(223, 0);
		}

		public TerminalNode T_SEMICOLON() {
			return this.getToken(352, 0);
		}

		public TerminalNode T_OR() {
			return this.getToken(199, 0);
		}

		public Create_package_body_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 67;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_package_body_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_package_body_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_package_body_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Package_spec_itemContext extends ParserRuleContext {
		public HplsqlParser.Declare_stmt_itemContext declare_stmt_item() {
			return (HplsqlParser.Declare_stmt_itemContext)this.getRuleContext(HplsqlParser.Declare_stmt_itemContext.class, 0);
		}

		public TerminalNode T_FUNCTION() {
			return this.getToken(117, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public HplsqlParser.Create_function_returnContext create_function_return() {
			return (HplsqlParser.Create_function_returnContext)this.getRuleContext(HplsqlParser.Create_function_returnContext.class, 0);
		}

		public HplsqlParser.Create_routine_paramsContext create_routine_params() {
			return (HplsqlParser.Create_routine_paramsContext)this.getRuleContext(HplsqlParser.Create_routine_paramsContext.class, 0);
		}

		public TerminalNode T_PROCEDURE() {
			return this.getToken(216, 0);
		}

		public TerminalNode T_PROC() {
			return this.getToken(215, 0);
		}

		public Package_spec_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 66;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterPackage_spec_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitPackage_spec_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitPackage_spec_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Package_specContext extends ParserRuleContext {
		public List<HplsqlParser.Package_spec_itemContext> package_spec_item() {
			return this.getRuleContexts(HplsqlParser.Package_spec_itemContext.class);
		}

		public HplsqlParser.Package_spec_itemContext package_spec_item(int i) {
			return (HplsqlParser.Package_spec_itemContext)this.getRuleContext(HplsqlParser.Package_spec_itemContext.class, i);
		}

		public List<TerminalNode> T_SEMICOLON() {
			return this.getTokens(352);
		}

		public TerminalNode T_SEMICOLON(int i) {
			return this.getToken(352, i);
		}

		public Package_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 65;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterPackage_spec(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitPackage_spec(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitPackage_spec(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_package_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() {
			return this.getToken(206, 0);
		}

		public List<HplsqlParser.IdentContext> ident() {
			return this.getRuleContexts(HplsqlParser.IdentContext.class);
		}

		public HplsqlParser.IdentContext ident(int i) {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, i);
		}

		public HplsqlParser.Package_specContext package_spec() {
			return (HplsqlParser.Package_specContext)this.getRuleContext(HplsqlParser.Package_specContext.class, 0);
		}

		public TerminalNode T_END() {
			return this.getToken(94, 0);
		}

		public TerminalNode T_AS() {
			return this.getToken(14, 0);
		}

		public TerminalNode T_IS() {
			return this.getToken(149, 0);
		}

		public TerminalNode T_ALTER() {
			return this.getToken(10, 0);
		}

		public TerminalNode T_CREATE() {
			return this.getToken(56, 0);
		}

		public TerminalNode T_REPLACE() {
			return this.getToken(223, 0);
		}

		public TerminalNode T_SEMICOLON() {
			return this.getToken(352, 0);
		}

		public TerminalNode T_OR() {
			return this.getToken(199, 0);
		}

		public Create_package_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 64;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_package_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_package_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_package_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_function_returnContext extends ParserRuleContext {
		public HplsqlParser.DtypeContext dtype() {
			return (HplsqlParser.DtypeContext)this.getRuleContext(HplsqlParser.DtypeContext.class, 0);
		}

		public TerminalNode T_RETURN() {
			return this.getToken(228, 0);
		}

		public TerminalNode T_RETURNS() {
			return this.getToken(229, 0);
		}

		public HplsqlParser.Dtype_lenContext dtype_len() {
			return (HplsqlParser.Dtype_lenContext)this.getRuleContext(HplsqlParser.Dtype_lenContext.class, 0);
		}

		public Create_function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 63;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_function_return(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_function_return(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_function_return(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_function_stmtContext extends ParserRuleContext {
		public TerminalNode T_FUNCTION() {
			return this.getToken(117, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public HplsqlParser.Create_function_returnContext create_function_return() {
			return (HplsqlParser.Create_function_returnContext)this.getRuleContext(HplsqlParser.Create_function_returnContext.class, 0);
		}

		public HplsqlParser.Single_block_stmtContext single_block_stmt() {
			return (HplsqlParser.Single_block_stmtContext)this.getRuleContext(HplsqlParser.Single_block_stmtContext.class, 0);
		}

		public TerminalNode T_ALTER() {
			return this.getToken(10, 0);
		}

		public TerminalNode T_CREATE() {
			return this.getToken(56, 0);
		}

		public TerminalNode T_REPLACE() {
			return this.getToken(223, 0);
		}

		public HplsqlParser.Create_routine_paramsContext create_routine_params() {
			return (HplsqlParser.Create_routine_paramsContext)this.getRuleContext(HplsqlParser.Create_routine_paramsContext.class, 0);
		}

		public HplsqlParser.Declare_block_inplaceContext declare_block_inplace() {
			return (HplsqlParser.Declare_block_inplaceContext)this.getRuleContext(HplsqlParser.Declare_block_inplaceContext.class, 0);
		}

		public TerminalNode T_AS() {
			return this.getToken(14, 0);
		}

		public TerminalNode T_IS() {
			return this.getToken(149, 0);
		}

		public TerminalNode T_OR() {
			return this.getToken(199, 0);
		}

		public Create_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 62;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_function_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_function_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_function_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_database_optionContext extends ParserRuleContext {
		public TerminalNode T_COMMENT() {
			return this.getToken(46, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public TerminalNode T_LOCATION() {
			return this.getToken(163, 0);
		}

		public Create_database_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 61;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_database_option(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_database_option(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_database_option(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_database_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() {
			return this.getToken(56, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public TerminalNode T_DATABASE() {
			return this.getToken(63, 0);
		}

		public TerminalNode T_SCHEMA() {
			return this.getToken(243, 0);
		}

		public TerminalNode T_IF() {
			return this.getToken(130, 0);
		}

		public TerminalNode T_NOT() {
			return this.getToken(189, 0);
		}

		public TerminalNode T_EXISTS() {
			return this.getToken(102, 0);
		}

		public List<HplsqlParser.Create_database_optionContext> create_database_option() {
			return this.getRuleContexts(HplsqlParser.Create_database_optionContext.class);
		}

		public HplsqlParser.Create_database_optionContext create_database_option(int i) {
			return (HplsqlParser.Create_database_optionContext)this.getRuleContext(HplsqlParser.Create_database_optionContext.class, i);
		}

		public Create_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 60;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_database_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_database_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_database_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Dtype_defaultContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() {
			return this.getToken(337, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public TerminalNode T_COLON() {
			return this.getToken(332, 0);
		}

		public TerminalNode T_DEFAULT() {
			return this.getToken(71, 0);
		}

		public Dtype_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 59;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterDtype_default(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitDtype_default(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitDtype_default(this) : visitor.visitChildren(this);
		}
	}

	public static class Dtype_attrContext extends ParserRuleContext {
		public TerminalNode T_NULL() {
			return this.getToken(191, 0);
		}

		public TerminalNode T_NOT() {
			return this.getToken(189, 0);
		}

		public TerminalNode T_CHARACTER() {
			return this.getToken(39, 0);
		}

		public TerminalNode T_SET() {
			return this.getToken(248, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_CASESPECIFIC() {
			return this.getToken(36, 0);
		}

		public TerminalNode T_CS() {
			return this.getToken(59, 0);
		}

		public Dtype_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 58;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterDtype_attr(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitDtype_attr(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitDtype_attr(this) : visitor.visitChildren(this);
		}
	}

	public static class Dtype_lenContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public List<TerminalNode> L_INT() {
			return this.getTokens(357);
		}

		public TerminalNode L_INT(int i) {
			return this.getToken(357, i);
		}

		public TerminalNode T_MAX() {
			return this.getToken(173, 0);
		}

		public TerminalNode T_COMMA() {
			return this.getToken(333, 0);
		}

		public TerminalNode T_CHAR() {
			return this.getToken(38, 0);
		}

		public TerminalNode T_BYTE() {
			return this.getToken(31, 0);
		}

		public Dtype_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 57;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterDtype_len(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitDtype_len(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitDtype_len(this) : visitor.visitChildren(this);
		}
	}

	public static class DtypeContext extends ParserRuleContext {
		public TerminalNode T_CHAR() {
			return this.getToken(38, 0);
		}

		public TerminalNode T_BIGINT() {
			return this.getToken(23, 0);
		}

		public TerminalNode T_BINARY_DOUBLE() {
			return this.getToken(24, 0);
		}

		public TerminalNode T_BINARY_FLOAT() {
			return this.getToken(25, 0);
		}

		public TerminalNode T_BINARY_INTEGER() {
			return this.getToken(26, 0);
		}

		public TerminalNode T_BIT() {
			return this.getToken(27, 0);
		}

		public TerminalNode T_DATE() {
			return this.getToken(64, 0);
		}

		public TerminalNode T_DATETIME() {
			return this.getToken(65, 0);
		}

		public TerminalNode T_DEC() {
			return this.getToken(68, 0);
		}

		public TerminalNode T_DECIMAL() {
			return this.getToken(69, 0);
		}

		public TerminalNode T_DOUBLE() {
			return this.getToken(87, 0);
		}

		public TerminalNode T_PRECISION() {
			return this.getToken(211, 0);
		}

		public TerminalNode T_FLOAT() {
			return this.getToken(109, 0);
		}

		public TerminalNode T_INT() {
			return this.getToken(140, 0);
		}

		public TerminalNode T_INT2() {
			return this.getToken(141, 0);
		}

		public TerminalNode T_INT4() {
			return this.getToken(142, 0);
		}

		public TerminalNode T_INT8() {
			return this.getToken(143, 0);
		}

		public TerminalNode T_INTEGER() {
			return this.getToken(144, 0);
		}

		public TerminalNode T_NCHAR() {
			return this.getToken(181, 0);
		}

		public TerminalNode T_NVARCHAR() {
			return this.getToken(183, 0);
		}

		public TerminalNode T_NUMBER() {
			return this.getToken(193, 0);
		}

		public TerminalNode T_NUMERIC() {
			return this.getToken(192, 0);
		}

		public TerminalNode T_PLS_INTEGER() {
			return this.getToken(210, 0);
		}

		public TerminalNode T_REAL() {
			return this.getToken(220, 0);
		}

		public TerminalNode T_RESULT_SET_LOCATOR() {
			return this.getToken(227, 0);
		}

		public TerminalNode T_VARYING() {
			return this.getToken(297, 0);
		}

		public TerminalNode T_SIMPLE_FLOAT() {
			return this.getToken(255, 0);
		}

		public TerminalNode T_SIMPLE_DOUBLE() {
			return this.getToken(254, 0);
		}

		public TerminalNode T_SIMPLE_INTEGER() {
			return this.getToken(256, 0);
		}

		public TerminalNode T_SMALLINT() {
			return this.getToken(258, 0);
		}

		public TerminalNode T_SMALLDATETIME() {
			return this.getToken(257, 0);
		}

		public TerminalNode T_STRING() {
			return this.getToken(266, 0);
		}

		public TerminalNode T_SYS_REFCURSOR() {
			return this.getToken(270, 0);
		}

		public TerminalNode T_TIMESTAMP() {
			return this.getToken(277, 0);
		}

		public TerminalNode T_TINYINT() {
			return this.getToken(278, 0);
		}

		public TerminalNode T_VARCHAR() {
			return this.getToken(295, 0);
		}

		public TerminalNode T_VARCHAR2() {
			return this.getToken(296, 0);
		}

		public TerminalNode T_XML() {
			return this.getToken(306, 0);
		}

		public TerminalNode L_ID() {
			return this.getToken(354, 0);
		}

		public TerminalNode T_TYPE() {
			return this.getToken(285, 0);
		}

		public TerminalNode T_ROWTYPE() {
			return this.getToken(237, 0);
		}

		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 56;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterDtype(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitDtype(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitDtype(this) : visitor.visitChildren(this);
		}
	}

	public static class Alter_table_add_constraint_itemContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() {
			return this.getToken(213, 0);
		}

		public TerminalNode T_KEY() {
			return this.getToken(154, 0);
		}

		public List<TerminalNode> T_OPEN_P() {
			return this.getTokens(347);
		}

		public TerminalNode T_OPEN_P(int i) {
			return this.getToken(347, i);
		}

		public List<HplsqlParser.IdentContext> ident() {
			return this.getRuleContexts(HplsqlParser.IdentContext.class);
		}

		public HplsqlParser.IdentContext ident(int i) {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, i);
		}

		public List<TerminalNode> T_CLOSE_P() {
			return this.getTokens(350);
		}

		public TerminalNode T_CLOSE_P(int i) {
			return this.getToken(350, i);
		}

		public TerminalNode T_CLUSTERED() {
			return this.getToken(43, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public TerminalNode T_ENABLE() {
			return this.getToken(93, 0);
		}

		public HplsqlParser.Index_storage_clauseContext index_storage_clause() {
			return (HplsqlParser.Index_storage_clauseContext)this.getRuleContext(HplsqlParser.Index_storage_clauseContext.class, 0);
		}

		public List<TerminalNode> T_ASC() {
			return this.getTokens(15);
		}

		public TerminalNode T_ASC(int i) {
			return this.getToken(15, i);
		}

		public List<TerminalNode> T_DESC() {
			return this.getTokens(79);
		}

		public TerminalNode T_DESC(int i) {
			return this.getToken(79, i);
		}

		public TerminalNode T_FOREIGN() {
			return this.getToken(111, 0);
		}

		public TerminalNode T_REFERENCES() {
			return this.getToken(221, 0);
		}

		public HplsqlParser.Table_nameContext table_name() {
			return (HplsqlParser.Table_nameContext)this.getRuleContext(HplsqlParser.Table_nameContext.class, 0);
		}

		public List<HplsqlParser.Create_table_fk_actionContext> create_table_fk_action() {
			return this.getRuleContexts(HplsqlParser.Create_table_fk_actionContext.class);
		}

		public HplsqlParser.Create_table_fk_actionContext create_table_fk_action(int i) {
			return (HplsqlParser.Create_table_fk_actionContext)this.getRuleContext(HplsqlParser.Create_table_fk_actionContext.class, i);
		}

		public TerminalNode T_DEFAULT() {
			return this.getToken(71, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public TerminalNode T_FOR() {
			return this.getToken(110, 0);
		}

		public Alter_table_add_constraint_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 55;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterAlter_table_add_constraint_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitAlter_table_add_constraint_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitAlter_table_add_constraint_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public TerminalNode T_ADD2() {
			return this.getToken(7, 0);
		}

		public HplsqlParser.Alter_table_add_constraint_itemContext alter_table_add_constraint_item() {
			return (HplsqlParser.Alter_table_add_constraint_itemContext)this.getRuleContext(HplsqlParser.Alter_table_add_constraint_itemContext.class, 0);
		}

		public TerminalNode T_CONSTRAINT() {
			return this.getToken(51, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 54;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterAlter_table_add_constraint(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitAlter_table_add_constraint(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitAlter_table_add_constraint(this) : visitor.visitChildren(this);
		}
	}

	public static class Alter_table_itemContext extends ParserRuleContext {
		public HplsqlParser.Alter_table_add_constraintContext alter_table_add_constraint() {
			return (HplsqlParser.Alter_table_add_constraintContext)this.getRuleContext(HplsqlParser.Alter_table_add_constraintContext.class, 0);
		}

		public Alter_table_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 53;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterAlter_table_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitAlter_table_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitAlter_table_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_ALTER() {
			return this.getToken(10, 0);
		}

		public TerminalNode T_TABLE() {
			return this.getToken(271, 0);
		}

		public HplsqlParser.Table_nameContext table_name() {
			return (HplsqlParser.Table_nameContext)this.getRuleContext(HplsqlParser.Table_nameContext.class, 0);
		}

		public HplsqlParser.Alter_table_itemContext alter_table_item() {
			return (HplsqlParser.Alter_table_itemContext)this.getRuleContext(HplsqlParser.Alter_table_itemContext.class, 0);
		}

		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 52;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterAlter_table_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitAlter_table_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitAlter_table_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_table_options_mysql_itemContext extends ParserRuleContext {
		public TerminalNode T_AUTO_INCREMENT() {
			return this.getToken(18, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public TerminalNode T_EQUAL() {
			return this.getToken(337, 0);
		}

		public TerminalNode T_COMMENT() {
			return this.getToken(46, 0);
		}

		public TerminalNode T_CHARACTER() {
			return this.getToken(39, 0);
		}

		public TerminalNode T_SET() {
			return this.getToken(248, 0);
		}

		public TerminalNode T_CHARSET() {
			return this.getToken(40, 0);
		}

		public TerminalNode T_DEFAULT() {
			return this.getToken(71, 0);
		}

		public TerminalNode T_ENGINE() {
			return this.getToken(95, 0);
		}

		public Create_table_options_mysql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 51;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_table_options_mysql_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_table_options_mysql_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_mysql_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_table_options_mssql_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() {
			return this.getToken(196, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_TEXTIMAGE_ON() {
			return this.getToken(275, 0);
		}

		public Create_table_options_mssql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 50;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_table_options_mssql_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_table_options_mssql_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_mssql_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_table_hive_row_format_fieldsContext extends ParserRuleContext {
		public TerminalNode T_FIELDS() {
			return this.getToken(106, 0);
		}

		public TerminalNode T_TERMINATED() {
			return this.getToken(274, 0);
		}

		public List<TerminalNode> T_BY() {
			return this.getTokens(30);
		}

		public TerminalNode T_BY(int i) {
			return this.getToken(30, i);
		}

		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public TerminalNode T_ESCAPED() {
			return this.getToken(96, 0);
		}

		public TerminalNode T_COLLECTION() {
			return this.getToken(45, 0);
		}

		public TerminalNode T_ITEMS() {
			return this.getToken(151, 0);
		}

		public TerminalNode T_MAP() {
			return this.getToken(171, 0);
		}

		public TerminalNode T_KEYS() {
			return this.getToken(155, 0);
		}

		public TerminalNode T_LINES() {
			return this.getToken(161, 0);
		}

		public TerminalNode T_NULL() {
			return this.getToken(191, 0);
		}

		public TerminalNode T_DEFINED() {
			return this.getToken(73, 0);
		}

		public TerminalNode T_AS() {
			return this.getToken(14, 0);
		}

		public Create_table_hive_row_format_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 49;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_table_hive_row_format_fields(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_table_hive_row_format_fields(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_hive_row_format_fields(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_table_hive_row_formatContext extends ParserRuleContext {
		public TerminalNode T_ROW() {
			return this.getToken(235, 0);
		}

		public TerminalNode T_FORMAT() {
			return this.getToken(112, 0);
		}

		public TerminalNode T_DELIMITED() {
			return this.getToken(77, 0);
		}

		public List<HplsqlParser.Create_table_hive_row_format_fieldsContext> create_table_hive_row_format_fields() {
			return this.getRuleContexts(HplsqlParser.Create_table_hive_row_format_fieldsContext.class);
		}

		public HplsqlParser.Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields(int i) {
			return (HplsqlParser.Create_table_hive_row_format_fieldsContext)this.getRuleContext(HplsqlParser.Create_table_hive_row_format_fieldsContext.class, i);
		}

		public Create_table_hive_row_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 48;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_table_hive_row_format(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_table_hive_row_format(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_hive_row_format(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_table_options_hive_itemContext extends ParserRuleContext {
		public HplsqlParser.Create_table_hive_row_formatContext create_table_hive_row_format() {
			return (HplsqlParser.Create_table_hive_row_formatContext)this.getRuleContext(HplsqlParser.Create_table_hive_row_formatContext.class, 0);
		}

		public Create_table_options_hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 47;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_table_options_hive_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_table_options_hive_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_hive_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_table_options_db2_itemContext extends ParserRuleContext {
		public TerminalNode T_IN() {
			return this.getToken(133, 0);
		}

		public List<HplsqlParser.IdentContext> ident() {
			return this.getRuleContexts(HplsqlParser.IdentContext.class);
		}

		public HplsqlParser.IdentContext ident(int i) {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, i);
		}

		public TerminalNode T_WITH() {
			return this.getToken(302, 0);
		}

		public TerminalNode T_REPLACE() {
			return this.getToken(223, 0);
		}

		public TerminalNode T_DISTRIBUTE() {
			return this.getToken(85, 0);
		}

		public TerminalNode T_BY() {
			return this.getToken(30, 0);
		}

		public TerminalNode T_HASH() {
			return this.getToken(124, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public TerminalNode T_LOGGED() {
			return this.getToken(168, 0);
		}

		public TerminalNode T_NOT() {
			return this.getToken(189, 0);
		}

		public TerminalNode T_DEFINITION() {
			return this.getToken(75, 0);
		}

		public TerminalNode T_ONLY() {
			return this.getToken(197, 0);
		}

		public Create_table_options_db2_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 46;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_table_options_db2_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_table_options_db2_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_db2_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_table_options_ora_itemContext extends ParserRuleContext {
		public TerminalNode T_SEGMENT() {
			return this.getToken(245, 0);
		}

		public TerminalNode T_CREATION() {
			return this.getToken(57, 0);
		}

		public TerminalNode T_IMMEDIATE() {
			return this.getToken(132, 0);
		}

		public TerminalNode T_DEFERRED() {
			return this.getToken(72, 0);
		}

		public List<TerminalNode> L_INT() {
			return this.getTokens(357);
		}

		public TerminalNode L_INT(int i) {
			return this.getToken(357, i);
		}

		public TerminalNode T_PCTFREE() {
			return this.getToken(208, 0);
		}

		public TerminalNode T_PCTUSED() {
			return this.getToken(209, 0);
		}

		public TerminalNode T_INITRANS() {
			return this.getToken(136, 0);
		}

		public TerminalNode T_MAXTRANS() {
			return this.getToken(174, 0);
		}

		public TerminalNode T_NOCOMPRESS() {
			return this.getToken(186, 0);
		}

		public TerminalNode T_LOGGING() {
			return this.getToken(169, 0);
		}

		public TerminalNode T_NOLOGGING() {
			return this.getToken(187, 0);
		}

		public TerminalNode T_STORAGE() {
			return this.getToken(265, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public List<HplsqlParser.IdentContext> ident() {
			return this.getRuleContexts(HplsqlParser.IdentContext.class);
		}

		public HplsqlParser.IdentContext ident(int i) {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, i);
		}

		public TerminalNode T_TABLESPACE() {
			return this.getToken(272, 0);
		}

		public Create_table_options_ora_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 45;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_table_options_ora_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_table_options_ora_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_ora_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_table_options_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() {
			return this.getToken(196, 0);
		}

		public TerminalNode T_COMMIT() {
			return this.getToken(48, 0);
		}

		public TerminalNode T_ROWS() {
			return this.getToken(236, 0);
		}

		public TerminalNode T_DELETE() {
			return this.getToken(76, 0);
		}

		public TerminalNode T_PRESERVE() {
			return this.getToken(212, 0);
		}

		public HplsqlParser.Create_table_options_ora_itemContext create_table_options_ora_item() {
			return (HplsqlParser.Create_table_options_ora_itemContext)this.getRuleContext(HplsqlParser.Create_table_options_ora_itemContext.class, 0);
		}

		public HplsqlParser.Create_table_options_db2_itemContext create_table_options_db2_item() {
			return (HplsqlParser.Create_table_options_db2_itemContext)this.getRuleContext(HplsqlParser.Create_table_options_db2_itemContext.class, 0);
		}

		public HplsqlParser.Create_table_options_hive_itemContext create_table_options_hive_item() {
			return (HplsqlParser.Create_table_options_hive_itemContext)this.getRuleContext(HplsqlParser.Create_table_options_hive_itemContext.class, 0);
		}

		public HplsqlParser.Create_table_options_mssql_itemContext create_table_options_mssql_item() {
			return (HplsqlParser.Create_table_options_mssql_itemContext)this.getRuleContext(HplsqlParser.Create_table_options_mssql_itemContext.class, 0);
		}

		public HplsqlParser.Create_table_options_mysql_itemContext create_table_options_mysql_item() {
			return (HplsqlParser.Create_table_options_mysql_itemContext)this.getRuleContext(HplsqlParser.Create_table_options_mysql_itemContext.class, 0);
		}

		public Create_table_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 44;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_table_options_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_table_options_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_table_optionsContext extends ParserRuleContext {
		public List<HplsqlParser.Create_table_options_itemContext> create_table_options_item() {
			return this.getRuleContexts(HplsqlParser.Create_table_options_itemContext.class);
		}

		public HplsqlParser.Create_table_options_itemContext create_table_options_item(int i) {
			return (HplsqlParser.Create_table_options_itemContext)this.getRuleContext(HplsqlParser.Create_table_options_itemContext.class, i);
		}

		public Create_table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 43;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_table_options(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_table_options(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_table_preoptions_itemContext extends ParserRuleContext {
		public TerminalNode T_LOG() {
			return this.getToken(167, 0);
		}

		public TerminalNode T_NO() {
			return this.getToken(184, 0);
		}

		public Create_table_preoptions_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 42;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_table_preoptions_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_table_preoptions_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_preoptions_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_table_preoptionsContext extends ParserRuleContext {
		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public List<HplsqlParser.Create_table_preoptions_itemContext> create_table_preoptions_item() {
			return this.getRuleContexts(HplsqlParser.Create_table_preoptions_itemContext.class);
		}

		public HplsqlParser.Create_table_preoptions_itemContext create_table_preoptions_item(int i) {
			return (HplsqlParser.Create_table_preoptions_itemContext)this.getRuleContext(HplsqlParser.Create_table_preoptions_itemContext.class, i);
		}

		public Create_table_preoptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 41;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_table_preoptions(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_table_preoptions(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_preoptions(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_table_fk_actionContext extends ParserRuleContext {
		public TerminalNode T_ON() {
			return this.getToken(196, 0);
		}

		public TerminalNode T_UPDATE() {
			return this.getToken(288, 0);
		}

		public TerminalNode T_DELETE() {
			return this.getToken(76, 0);
		}

		public TerminalNode T_NO() {
			return this.getToken(184, 0);
		}

		public TerminalNode T_ACTION() {
			return this.getToken(6, 0);
		}

		public TerminalNode T_RESTRICT() {
			return this.getToken(225, 0);
		}

		public TerminalNode T_SET() {
			return this.getToken(248, 0);
		}

		public TerminalNode T_NULL() {
			return this.getToken(191, 0);
		}

		public TerminalNode T_DEFAULT() {
			return this.getToken(71, 0);
		}

		public TerminalNode T_CASCADE() {
			return this.getToken(34, 0);
		}

		public Create_table_fk_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 40;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_table_fk_action(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_table_fk_action(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_fk_action(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_table_column_consContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() {
			return this.getToken(213, 0);
		}

		public TerminalNode T_KEY() {
			return this.getToken(154, 0);
		}

		public List<TerminalNode> T_OPEN_P() {
			return this.getTokens(347);
		}

		public TerminalNode T_OPEN_P(int i) {
			return this.getToken(347, i);
		}

		public List<HplsqlParser.IdentContext> ident() {
			return this.getRuleContexts(HplsqlParser.IdentContext.class);
		}

		public HplsqlParser.IdentContext ident(int i) {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, i);
		}

		public List<TerminalNode> T_CLOSE_P() {
			return this.getTokens(350);
		}

		public TerminalNode T_CLOSE_P(int i) {
			return this.getToken(350, i);
		}

		public TerminalNode T_CLUSTERED() {
			return this.getToken(43, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public TerminalNode T_ENABLE() {
			return this.getToken(93, 0);
		}

		public HplsqlParser.Index_storage_clauseContext index_storage_clause() {
			return (HplsqlParser.Index_storage_clauseContext)this.getRuleContext(HplsqlParser.Index_storage_clauseContext.class, 0);
		}

		public List<TerminalNode> T_ASC() {
			return this.getTokens(15);
		}

		public TerminalNode T_ASC(int i) {
			return this.getToken(15, i);
		}

		public List<TerminalNode> T_DESC() {
			return this.getTokens(79);
		}

		public TerminalNode T_DESC(int i) {
			return this.getToken(79, i);
		}

		public TerminalNode T_FOREIGN() {
			return this.getToken(111, 0);
		}

		public TerminalNode T_REFERENCES() {
			return this.getToken(221, 0);
		}

		public HplsqlParser.Table_nameContext table_name() {
			return (HplsqlParser.Table_nameContext)this.getRuleContext(HplsqlParser.Table_nameContext.class, 0);
		}

		public List<HplsqlParser.Create_table_fk_actionContext> create_table_fk_action() {
			return this.getRuleContexts(HplsqlParser.Create_table_fk_actionContext.class);
		}

		public HplsqlParser.Create_table_fk_actionContext create_table_fk_action(int i) {
			return (HplsqlParser.Create_table_fk_actionContext)this.getRuleContext(HplsqlParser.Create_table_fk_actionContext.class, i);
		}

		public Create_table_column_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 39;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_table_column_cons(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_table_column_cons(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_column_cons(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_table_column_inline_consContext extends ParserRuleContext {
		public HplsqlParser.Dtype_defaultContext dtype_default() {
			return (HplsqlParser.Dtype_defaultContext)this.getRuleContext(HplsqlParser.Dtype_defaultContext.class, 0);
		}

		public TerminalNode T_NULL() {
			return this.getToken(191, 0);
		}

		public TerminalNode T_NOT() {
			return this.getToken(189, 0);
		}

		public TerminalNode T_PRIMARY() {
			return this.getToken(213, 0);
		}

		public TerminalNode T_KEY() {
			return this.getToken(154, 0);
		}

		public TerminalNode T_UNIQUE() {
			return this.getToken(287, 0);
		}

		public TerminalNode T_REFERENCES() {
			return this.getToken(221, 0);
		}

		public HplsqlParser.Table_nameContext table_name() {
			return (HplsqlParser.Table_nameContext)this.getRuleContext(HplsqlParser.Table_nameContext.class, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public List<HplsqlParser.Create_table_fk_actionContext> create_table_fk_action() {
			return this.getRuleContexts(HplsqlParser.Create_table_fk_actionContext.class);
		}

		public HplsqlParser.Create_table_fk_actionContext create_table_fk_action(int i) {
			return (HplsqlParser.Create_table_fk_actionContext)this.getRuleContext(HplsqlParser.Create_table_fk_actionContext.class, i);
		}

		public TerminalNode T_IDENTITY() {
			return this.getToken(129, 0);
		}

		public List<TerminalNode> L_INT() {
			return this.getTokens(357);
		}

		public TerminalNode L_INT(int i) {
			return this.getToken(357, i);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public TerminalNode T_AUTO_INCREMENT() {
			return this.getToken(18, 0);
		}

		public TerminalNode T_ENABLE() {
			return this.getToken(93, 0);
		}

		public Create_table_column_inline_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 38;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_table_column_inline_cons(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_table_column_inline_cons(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_column_inline_cons(this) : visitor.visitChildren(this);
		}
	}

	public static class Column_nameContext extends ParserRuleContext {
		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 37;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterColumn_name(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitColumn_name(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitColumn_name(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_table_columns_itemContext extends ParserRuleContext {
		public HplsqlParser.Column_nameContext column_name() {
			return (HplsqlParser.Column_nameContext)this.getRuleContext(HplsqlParser.Column_nameContext.class, 0);
		}

		public HplsqlParser.DtypeContext dtype() {
			return (HplsqlParser.DtypeContext)this.getRuleContext(HplsqlParser.DtypeContext.class, 0);
		}

		public HplsqlParser.Dtype_lenContext dtype_len() {
			return (HplsqlParser.Dtype_lenContext)this.getRuleContext(HplsqlParser.Dtype_lenContext.class, 0);
		}

		public List<HplsqlParser.Dtype_attrContext> dtype_attr() {
			return this.getRuleContexts(HplsqlParser.Dtype_attrContext.class);
		}

		public HplsqlParser.Dtype_attrContext dtype_attr(int i) {
			return (HplsqlParser.Dtype_attrContext)this.getRuleContext(HplsqlParser.Dtype_attrContext.class, i);
		}

		public List<HplsqlParser.Create_table_column_inline_consContext> create_table_column_inline_cons() {
			return this.getRuleContexts(HplsqlParser.Create_table_column_inline_consContext.class);
		}

		public HplsqlParser.Create_table_column_inline_consContext create_table_column_inline_cons(int i) {
			return (HplsqlParser.Create_table_column_inline_consContext)this.getRuleContext(HplsqlParser.Create_table_column_inline_consContext.class, i);
		}

		public HplsqlParser.Create_table_column_consContext create_table_column_cons() {
			return (HplsqlParser.Create_table_column_consContext)this.getRuleContext(HplsqlParser.Create_table_column_consContext.class, 0);
		}

		public TerminalNode T_CONSTRAINT() {
			return this.getToken(51, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public Create_table_columns_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 36;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_table_columns_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_table_columns_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_columns_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_table_columnsContext extends ParserRuleContext {
		public List<HplsqlParser.Create_table_columns_itemContext> create_table_columns_item() {
			return this.getRuleContexts(HplsqlParser.Create_table_columns_itemContext.class);
		}

		public HplsqlParser.Create_table_columns_itemContext create_table_columns_item(int i) {
			return (HplsqlParser.Create_table_columns_itemContext)this.getRuleContext(HplsqlParser.Create_table_columns_itemContext.class, i);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Create_table_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 35;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_table_columns(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_table_columns(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_columns(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_local_temp_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() {
			return this.getToken(56, 0);
		}

		public TerminalNode T_TABLE() {
			return this.getToken(271, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public HplsqlParser.Create_table_columnsContext create_table_columns() {
			return (HplsqlParser.Create_table_columnsContext)this.getRuleContext(HplsqlParser.Create_table_columnsContext.class, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public TerminalNode T_LOCAL() {
			return this.getToken(162, 0);
		}

		public TerminalNode T_TEMPORARY() {
			return this.getToken(273, 0);
		}

		public TerminalNode T_VOLATILE() {
			return this.getToken(298, 0);
		}

		public HplsqlParser.Create_table_preoptionsContext create_table_preoptions() {
			return (HplsqlParser.Create_table_preoptionsContext)this.getRuleContext(HplsqlParser.Create_table_preoptionsContext.class, 0);
		}

		public HplsqlParser.Create_table_optionsContext create_table_options() {
			return (HplsqlParser.Create_table_optionsContext)this.getRuleContext(HplsqlParser.Create_table_optionsContext.class, 0);
		}

		public TerminalNode T_SET() {
			return this.getToken(248, 0);
		}

		public TerminalNode T_MULTISET() {
			return this.getToken(180, 0);
		}

		public Create_local_temp_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 34;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_local_temp_table_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_local_temp_table_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_local_temp_table_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() {
			return this.getToken(56, 0);
		}

		public TerminalNode T_TABLE() {
			return this.getToken(271, 0);
		}

		public HplsqlParser.Table_nameContext table_name() {
			return (HplsqlParser.Table_nameContext)this.getRuleContext(HplsqlParser.Table_nameContext.class, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public HplsqlParser.Create_table_columnsContext create_table_columns() {
			return (HplsqlParser.Create_table_columnsContext)this.getRuleContext(HplsqlParser.Create_table_columnsContext.class, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public TerminalNode T_IF() {
			return this.getToken(130, 0);
		}

		public TerminalNode T_NOT() {
			return this.getToken(189, 0);
		}

		public TerminalNode T_EXISTS() {
			return this.getToken(102, 0);
		}

		public HplsqlParser.Create_table_optionsContext create_table_options() {
			return (HplsqlParser.Create_table_optionsContext)this.getRuleContext(HplsqlParser.Create_table_optionsContext.class, 0);
		}

		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 33;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCreate_table_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCreate_table_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Declare_temporary_table_itemContext extends ParserRuleContext {
		public TerminalNode T_TEMPORARY() {
			return this.getToken(273, 0);
		}

		public TerminalNode T_TABLE() {
			return this.getToken(271, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public HplsqlParser.Select_stmtContext select_stmt() {
			return (HplsqlParser.Select_stmtContext)this.getRuleContext(HplsqlParser.Select_stmtContext.class, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public HplsqlParser.Create_table_columnsContext create_table_columns() {
			return (HplsqlParser.Create_table_columnsContext)this.getRuleContext(HplsqlParser.Create_table_columnsContext.class, 0);
		}

		public TerminalNode T_GLOBAL() {
			return this.getToken(119, 0);
		}

		public HplsqlParser.Create_table_optionsContext create_table_options() {
			return (HplsqlParser.Create_table_optionsContext)this.getRuleContext(HplsqlParser.Create_table_optionsContext.class, 0);
		}

		public TerminalNode T_AS() {
			return this.getToken(14, 0);
		}

		public Declare_temporary_table_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 32;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterDeclare_temporary_table_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitDeclare_temporary_table_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitDeclare_temporary_table_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Declare_handler_itemContext extends ParserRuleContext {
		public TerminalNode T_HANDLER() {
			return this.getToken(123, 0);
		}

		public TerminalNode T_FOR() {
			return this.getToken(110, 0);
		}

		public HplsqlParser.Single_block_stmtContext single_block_stmt() {
			return (HplsqlParser.Single_block_stmtContext)this.getRuleContext(HplsqlParser.Single_block_stmtContext.class, 0);
		}

		public TerminalNode T_CONTINUE() {
			return this.getToken(52, 0);
		}

		public TerminalNode T_EXIT() {
			return this.getToken(103, 0);
		}

		public TerminalNode T_SQLEXCEPTION() {
			return this.getToken(260, 0);
		}

		public TerminalNode T_SQLWARNING() {
			return this.getToken(263, 0);
		}

		public TerminalNode T_NOT() {
			return this.getToken(189, 0);
		}

		public TerminalNode T_FOUND() {
			return this.getToken(113, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public Declare_handler_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 31;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterDeclare_handler_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitDeclare_handler_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitDeclare_handler_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Cursor_without_returnContext extends ParserRuleContext {
		public TerminalNode T_WITHOUT() {
			return this.getToken(303, 0);
		}

		public TerminalNode T_RETURN() {
			return this.getToken(228, 0);
		}

		public Cursor_without_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 30;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCursor_without_return(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCursor_without_return(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCursor_without_return(this) : visitor.visitChildren(this);
		}
	}

	public static class Cursor_with_returnContext extends ParserRuleContext {
		public TerminalNode T_WITH() {
			return this.getToken(302, 0);
		}

		public TerminalNode T_RETURN() {
			return this.getToken(228, 0);
		}

		public TerminalNode T_ONLY() {
			return this.getToken(197, 0);
		}

		public TerminalNode T_TO() {
			return this.getToken(280, 0);
		}

		public TerminalNode T_CALLER() {
			return this.getToken(33, 0);
		}

		public TerminalNode T_CLIENT() {
			return this.getToken(41, 0);
		}

		public Cursor_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 29;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCursor_with_return(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCursor_with_return(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCursor_with_return(this) : visitor.visitChildren(this);
		}
	}

	public static class Declare_cursor_itemContext extends ParserRuleContext {
		public TerminalNode T_IS() {
			return this.getToken(149, 0);
		}

		public TerminalNode T_AS() {
			return this.getToken(14, 0);
		}

		public TerminalNode T_FOR() {
			return this.getToken(110, 0);
		}

		public TerminalNode T_CURSOR() {
			return this.getToken(62, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public HplsqlParser.Select_stmtContext select_stmt() {
			return (HplsqlParser.Select_stmtContext)this.getRuleContext(HplsqlParser.Select_stmtContext.class, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public HplsqlParser.Cursor_with_returnContext cursor_with_return() {
			return (HplsqlParser.Cursor_with_returnContext)this.getRuleContext(HplsqlParser.Cursor_with_returnContext.class, 0);
		}

		public HplsqlParser.Cursor_without_returnContext cursor_without_return() {
			return (HplsqlParser.Cursor_without_returnContext)this.getRuleContext(HplsqlParser.Cursor_without_returnContext.class, 0);
		}

		public Declare_cursor_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 28;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterDeclare_cursor_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitDeclare_cursor_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitDeclare_cursor_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Declare_condition_itemContext extends ParserRuleContext {
		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_CONDITION() {
			return this.getToken(50, 0);
		}

		public Declare_condition_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 27;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterDeclare_condition_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitDeclare_condition_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitDeclare_condition_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Declare_var_itemContext extends ParserRuleContext {
		public List<HplsqlParser.IdentContext> ident() {
			return this.getRuleContexts(HplsqlParser.IdentContext.class);
		}

		public HplsqlParser.IdentContext ident(int i) {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, i);
		}

		public HplsqlParser.DtypeContext dtype() {
			return (HplsqlParser.DtypeContext)this.getRuleContext(HplsqlParser.DtypeContext.class, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public TerminalNode T_AS() {
			return this.getToken(14, 0);
		}

		public HplsqlParser.Dtype_lenContext dtype_len() {
			return (HplsqlParser.Dtype_lenContext)this.getRuleContext(HplsqlParser.Dtype_lenContext.class, 0);
		}

		public List<HplsqlParser.Dtype_attrContext> dtype_attr() {
			return this.getRuleContexts(HplsqlParser.Dtype_attrContext.class);
		}

		public HplsqlParser.Dtype_attrContext dtype_attr(int i) {
			return (HplsqlParser.Dtype_attrContext)this.getRuleContext(HplsqlParser.Dtype_attrContext.class, i);
		}

		public HplsqlParser.Dtype_defaultContext dtype_default() {
			return (HplsqlParser.Dtype_defaultContext)this.getRuleContext(HplsqlParser.Dtype_defaultContext.class, 0);
		}

		public TerminalNode T_CONSTANT() {
			return this.getToken(47, 0);
		}

		public Declare_var_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 26;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterDeclare_var_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitDeclare_var_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitDeclare_var_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Declare_stmt_itemContext extends ParserRuleContext {
		public HplsqlParser.Declare_cursor_itemContext declare_cursor_item() {
			return (HplsqlParser.Declare_cursor_itemContext)this.getRuleContext(HplsqlParser.Declare_cursor_itemContext.class, 0);
		}

		public HplsqlParser.Declare_var_itemContext declare_var_item() {
			return (HplsqlParser.Declare_var_itemContext)this.getRuleContext(HplsqlParser.Declare_var_itemContext.class, 0);
		}

		public HplsqlParser.Declare_condition_itemContext declare_condition_item() {
			return (HplsqlParser.Declare_condition_itemContext)this.getRuleContext(HplsqlParser.Declare_condition_itemContext.class, 0);
		}

		public HplsqlParser.Declare_handler_itemContext declare_handler_item() {
			return (HplsqlParser.Declare_handler_itemContext)this.getRuleContext(HplsqlParser.Declare_handler_itemContext.class, 0);
		}

		public HplsqlParser.Declare_temporary_table_itemContext declare_temporary_table_item() {
			return (HplsqlParser.Declare_temporary_table_itemContext)this.getRuleContext(HplsqlParser.Declare_temporary_table_itemContext.class, 0);
		}

		public Declare_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 25;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterDeclare_stmt_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitDeclare_stmt_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitDeclare_stmt_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Declare_block_inplaceContext extends ParserRuleContext {
		public List<HplsqlParser.Declare_stmt_itemContext> declare_stmt_item() {
			return this.getRuleContexts(HplsqlParser.Declare_stmt_itemContext.class);
		}

		public HplsqlParser.Declare_stmt_itemContext declare_stmt_item(int i) {
			return (HplsqlParser.Declare_stmt_itemContext)this.getRuleContext(HplsqlParser.Declare_stmt_itemContext.class, i);
		}

		public List<TerminalNode> T_SEMICOLON() {
			return this.getTokens(352);
		}

		public TerminalNode T_SEMICOLON(int i) {
			return this.getToken(352, i);
		}

		public Declare_block_inplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 24;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterDeclare_block_inplace(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitDeclare_block_inplace(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitDeclare_block_inplace(this) : visitor.visitChildren(this);
		}
	}

	public static class Declare_blockContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() {
			return this.getToken(70, 0);
		}

		public List<HplsqlParser.Declare_stmt_itemContext> declare_stmt_item() {
			return this.getRuleContexts(HplsqlParser.Declare_stmt_itemContext.class);
		}

		public HplsqlParser.Declare_stmt_itemContext declare_stmt_item(int i) {
			return (HplsqlParser.Declare_stmt_itemContext)this.getRuleContext(HplsqlParser.Declare_stmt_itemContext.class, i);
		}

		public List<TerminalNode> T_SEMICOLON() {
			return this.getTokens(352);
		}

		public TerminalNode T_SEMICOLON(int i) {
			return this.getToken(352, i);
		}

		public Declare_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 23;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterDeclare_block(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitDeclare_block(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitDeclare_block(this) : visitor.visitChildren(this);
		}
	}

	public static class Declare_stmtContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() {
			return this.getToken(70, 0);
		}

		public List<HplsqlParser.Declare_stmt_itemContext> declare_stmt_item() {
			return this.getRuleContexts(HplsqlParser.Declare_stmt_itemContext.class);
		}

		public HplsqlParser.Declare_stmt_itemContext declare_stmt_item(int i) {
			return (HplsqlParser.Declare_stmt_itemContext)this.getRuleContext(HplsqlParser.Declare_stmt_itemContext.class, i);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Declare_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 22;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterDeclare_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitDeclare_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitDeclare_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Call_stmtContext extends ParserRuleContext {
		public TerminalNode T_CALL() {
			return this.getToken(32, 0);
		}

		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public HplsqlParser.Expr_func_paramsContext expr_func_params() {
			return (HplsqlParser.Expr_func_paramsContext)this.getRuleContext(HplsqlParser.Expr_func_paramsContext.class, 0);
		}

		public Call_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 21;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterCall_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitCall_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitCall_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode T_BREAK() {
			return this.getToken(29, 0);
		}

		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 20;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterBreak_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitBreak_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitBreak_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Begin_transaction_stmtContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() {
			return this.getToken(21, 0);
		}

		public TerminalNode T_TRANSACTION() {
			return this.getToken(282, 0);
		}

		public Begin_transaction_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 19;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterBegin_transaction_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitBegin_transaction_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitBegin_transaction_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Associate_locator_stmtContext extends ParserRuleContext {
		public TerminalNode T_ASSOCIATE() {
			return this.getToken(16, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public List<HplsqlParser.IdentContext> ident() {
			return this.getRuleContexts(HplsqlParser.IdentContext.class);
		}

		public HplsqlParser.IdentContext ident(int i) {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, i);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public TerminalNode T_WITH() {
			return this.getToken(302, 0);
		}

		public TerminalNode T_PROCEDURE() {
			return this.getToken(216, 0);
		}

		public TerminalNode T_LOCATOR() {
			return this.getToken(164, 0);
		}

		public TerminalNode T_LOCATORS() {
			return this.getToken(165, 0);
		}

		public TerminalNode T_RESULT() {
			return this.getToken(226, 0);
		}

		public TerminalNode T_SET() {
			return this.getToken(248, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Associate_locator_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 18;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterAssociate_locator_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitAssociate_locator_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitAssociate_locator_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Allocate_cursor_stmtContext extends ParserRuleContext {
		public TerminalNode T_ALLOCATE() {
			return this.getToken(9, 0);
		}

		public List<HplsqlParser.IdentContext> ident() {
			return this.getRuleContexts(HplsqlParser.IdentContext.class);
		}

		public HplsqlParser.IdentContext ident(int i) {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, i);
		}

		public TerminalNode T_CURSOR() {
			return this.getToken(62, 0);
		}

		public TerminalNode T_FOR() {
			return this.getToken(110, 0);
		}

		public TerminalNode T_PROCEDURE() {
			return this.getToken(216, 0);
		}

		public TerminalNode T_RESULT() {
			return this.getToken(226, 0);
		}

		public TerminalNode T_SET() {
			return this.getToken(248, 0);
		}

		public Allocate_cursor_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 17;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterAllocate_cursor_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitAllocate_cursor_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitAllocate_cursor_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Assignment_stmt_select_itemContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() {
			return this.getToken(337, 0);
		}

		public List<TerminalNode> T_OPEN_P() {
			return this.getTokens(347);
		}

		public TerminalNode T_OPEN_P(int i) {
			return this.getToken(347, i);
		}

		public HplsqlParser.Select_stmtContext select_stmt() {
			return (HplsqlParser.Select_stmtContext)this.getRuleContext(HplsqlParser.Select_stmtContext.class, 0);
		}

		public List<TerminalNode> T_CLOSE_P() {
			return this.getTokens(350);
		}

		public TerminalNode T_CLOSE_P(int i) {
			return this.getToken(350, i);
		}

		public List<HplsqlParser.IdentContext> ident() {
			return this.getRuleContexts(HplsqlParser.IdentContext.class);
		}

		public HplsqlParser.IdentContext ident(int i) {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, i);
		}

		public TerminalNode T_COLON() {
			return this.getToken(332, 0);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Assignment_stmt_select_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 16;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterAssignment_stmt_select_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitAssignment_stmt_select_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitAssignment_stmt_select_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Assignment_stmt_multiple_itemContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() {
			return this.getTokens(347);
		}

		public TerminalNode T_OPEN_P(int i) {
			return this.getToken(347, i);
		}

		public List<HplsqlParser.IdentContext> ident() {
			return this.getRuleContexts(HplsqlParser.IdentContext.class);
		}

		public HplsqlParser.IdentContext ident(int i) {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, i);
		}

		public List<TerminalNode> T_CLOSE_P() {
			return this.getTokens(350);
		}

		public TerminalNode T_CLOSE_P(int i) {
			return this.getToken(350, i);
		}

		public TerminalNode T_EQUAL() {
			return this.getToken(337, 0);
		}

		public List<HplsqlParser.ExprContext> expr() {
			return this.getRuleContexts(HplsqlParser.ExprContext.class);
		}

		public HplsqlParser.ExprContext expr(int i) {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, i);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public TerminalNode T_COLON() {
			return this.getToken(332, 0);
		}

		public Assignment_stmt_multiple_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 15;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterAssignment_stmt_multiple_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitAssignment_stmt_multiple_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitAssignment_stmt_multiple_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Assignment_stmt_single_itemContext extends ParserRuleContext {
		public HplsqlParser.IdentContext ident() {
			return (HplsqlParser.IdentContext)this.getRuleContext(HplsqlParser.IdentContext.class, 0);
		}

		public TerminalNode T_EQUAL() {
			return this.getToken(337, 0);
		}

		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public TerminalNode T_COLON() {
			return this.getToken(332, 0);
		}

		public TerminalNode T_OPEN_P() {
			return this.getToken(347, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return this.getToken(350, 0);
		}

		public Assignment_stmt_single_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 14;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterAssignment_stmt_single_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitAssignment_stmt_single_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitAssignment_stmt_single_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Assignment_stmt_itemContext extends ParserRuleContext {
		public HplsqlParser.Assignment_stmt_single_itemContext assignment_stmt_single_item() {
			return (HplsqlParser.Assignment_stmt_single_itemContext)this.getRuleContext(HplsqlParser.Assignment_stmt_single_itemContext.class, 0);
		}

		public HplsqlParser.Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() {
			return (HplsqlParser.Assignment_stmt_multiple_itemContext)this.getRuleContext(HplsqlParser.Assignment_stmt_multiple_itemContext.class, 0);
		}

		public HplsqlParser.Assignment_stmt_select_itemContext assignment_stmt_select_item() {
			return (HplsqlParser.Assignment_stmt_select_itemContext)this.getRuleContext(HplsqlParser.Assignment_stmt_select_itemContext.class, 0);
		}

		public Assignment_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 13;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterAssignment_stmt_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitAssignment_stmt_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitAssignment_stmt_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Assignment_stmtContext extends ParserRuleContext {
		public TerminalNode T_SET() {
			return this.getToken(248, 0);
		}

		public HplsqlParser.Set_session_optionContext set_session_option() {
			return (HplsqlParser.Set_session_optionContext)this.getRuleContext(HplsqlParser.Set_session_optionContext.class, 0);
		}

		public List<HplsqlParser.Assignment_stmt_itemContext> assignment_stmt_item() {
			return this.getRuleContexts(HplsqlParser.Assignment_stmt_itemContext.class);
		}

		public HplsqlParser.Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return (HplsqlParser.Assignment_stmt_itemContext)this.getRuleContext(HplsqlParser.Assignment_stmt_itemContext.class, i);
		}

		public List<TerminalNode> T_COMMA() {
			return this.getTokens(333);
		}

		public TerminalNode T_COMMA(int i) {
			return this.getToken(333, i);
		}

		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 12;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterAssignment_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitAssignment_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitAssignment_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Expr_stmtContext extends ParserRuleContext {
		public HplsqlParser.ExprContext expr() {
			return (HplsqlParser.ExprContext)this.getRuleContext(HplsqlParser.ExprContext.class, 0);
		}

		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 11;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterExpr_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitExpr_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitExpr_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Null_stmtContext extends ParserRuleContext {
		public TerminalNode T_NULL() {
			return this.getToken(191, 0);
		}

		public Null_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 10;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterNull_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitNull_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitNull_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Exception_block_itemContext extends ParserRuleContext {
		public List<TerminalNode> T_WHEN() {
			return this.getTokens(299);
		}

		public TerminalNode T_WHEN(int i) {
			return this.getToken(299, i);
		}

		public TerminalNode L_ID() {
			return this.getToken(354, 0);
		}

		public TerminalNode T_THEN() {
			return this.getToken(276, 0);
		}

		public HplsqlParser.BlockContext block() {
			return (HplsqlParser.BlockContext)this.getRuleContext(HplsqlParser.BlockContext.class, 0);
		}

		public TerminalNode T_END() {
			return this.getToken(94, 0);
		}

		public Exception_block_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 9;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterException_block_item(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitException_block_item(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitException_block_item(this) : visitor.visitChildren(this);
		}
	}

	public static class Exception_blockContext extends ParserRuleContext {
		public TerminalNode T_EXCEPTION() {
			return this.getToken(100, 0);
		}

		public List<HplsqlParser.Exception_block_itemContext> exception_block_item() {
			return this.getRuleContexts(HplsqlParser.Exception_block_itemContext.class);
		}

		public HplsqlParser.Exception_block_itemContext exception_block_item(int i) {
			return (HplsqlParser.Exception_block_itemContext)this.getRuleContext(HplsqlParser.Exception_block_itemContext.class, i);
		}

		public Exception_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 8;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterException_block(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitException_block(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitException_block(this) : visitor.visitChildren(this);
		}
	}

	public static class Semicolon_stmtContext extends ParserRuleContext {
		public TerminalNode T_SEMICOLON() {
			return this.getToken(352, 0);
		}

		public Semicolon_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 7;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterSemicolon_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitSemicolon_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitSemicolon_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class StmtContext extends ParserRuleContext {
		public HplsqlParser.Assignment_stmtContext assignment_stmt() {
			return (HplsqlParser.Assignment_stmtContext)this.getRuleContext(HplsqlParser.Assignment_stmtContext.class, 0);
		}

		public HplsqlParser.Allocate_cursor_stmtContext allocate_cursor_stmt() {
			return (HplsqlParser.Allocate_cursor_stmtContext)this.getRuleContext(HplsqlParser.Allocate_cursor_stmtContext.class, 0);
		}

		public HplsqlParser.Alter_table_stmtContext alter_table_stmt() {
			return (HplsqlParser.Alter_table_stmtContext)this.getRuleContext(HplsqlParser.Alter_table_stmtContext.class, 0);
		}

		public HplsqlParser.Associate_locator_stmtContext associate_locator_stmt() {
			return (HplsqlParser.Associate_locator_stmtContext)this.getRuleContext(HplsqlParser.Associate_locator_stmtContext.class, 0);
		}

		public HplsqlParser.Begin_transaction_stmtContext begin_transaction_stmt() {
			return (HplsqlParser.Begin_transaction_stmtContext)this.getRuleContext(HplsqlParser.Begin_transaction_stmtContext.class, 0);
		}

		public HplsqlParser.Break_stmtContext break_stmt() {
			return (HplsqlParser.Break_stmtContext)this.getRuleContext(HplsqlParser.Break_stmtContext.class, 0);
		}

		public HplsqlParser.Call_stmtContext call_stmt() {
			return (HplsqlParser.Call_stmtContext)this.getRuleContext(HplsqlParser.Call_stmtContext.class, 0);
		}

		public HplsqlParser.Close_stmtContext close_stmt() {
			return (HplsqlParser.Close_stmtContext)this.getRuleContext(HplsqlParser.Close_stmtContext.class, 0);
		}

		public HplsqlParser.Cmp_stmtContext cmp_stmt() {
			return (HplsqlParser.Cmp_stmtContext)this.getRuleContext(HplsqlParser.Cmp_stmtContext.class, 0);
		}

		public HplsqlParser.Copy_from_ftp_stmtContext copy_from_ftp_stmt() {
			return (HplsqlParser.Copy_from_ftp_stmtContext)this.getRuleContext(HplsqlParser.Copy_from_ftp_stmtContext.class, 0);
		}

		public HplsqlParser.Copy_from_local_stmtContext copy_from_local_stmt() {
			return (HplsqlParser.Copy_from_local_stmtContext)this.getRuleContext(HplsqlParser.Copy_from_local_stmtContext.class, 0);
		}

		public HplsqlParser.Copy_stmtContext copy_stmt() {
			return (HplsqlParser.Copy_stmtContext)this.getRuleContext(HplsqlParser.Copy_stmtContext.class, 0);
		}

		public HplsqlParser.Commit_stmtContext commit_stmt() {
			return (HplsqlParser.Commit_stmtContext)this.getRuleContext(HplsqlParser.Commit_stmtContext.class, 0);
		}

		public HplsqlParser.Create_database_stmtContext create_database_stmt() {
			return (HplsqlParser.Create_database_stmtContext)this.getRuleContext(HplsqlParser.Create_database_stmtContext.class, 0);
		}

		public HplsqlParser.Create_function_stmtContext create_function_stmt() {
			return (HplsqlParser.Create_function_stmtContext)this.getRuleContext(HplsqlParser.Create_function_stmtContext.class, 0);
		}

		public HplsqlParser.Create_index_stmtContext create_index_stmt() {
			return (HplsqlParser.Create_index_stmtContext)this.getRuleContext(HplsqlParser.Create_index_stmtContext.class, 0);
		}

		public HplsqlParser.Create_local_temp_table_stmtContext create_local_temp_table_stmt() {
			return (HplsqlParser.Create_local_temp_table_stmtContext)this.getRuleContext(HplsqlParser.Create_local_temp_table_stmtContext.class, 0);
		}

		public HplsqlParser.Create_package_stmtContext create_package_stmt() {
			return (HplsqlParser.Create_package_stmtContext)this.getRuleContext(HplsqlParser.Create_package_stmtContext.class, 0);
		}

		public HplsqlParser.Create_package_body_stmtContext create_package_body_stmt() {
			return (HplsqlParser.Create_package_body_stmtContext)this.getRuleContext(HplsqlParser.Create_package_body_stmtContext.class, 0);
		}

		public HplsqlParser.Create_procedure_stmtContext create_procedure_stmt() {
			return (HplsqlParser.Create_procedure_stmtContext)this.getRuleContext(HplsqlParser.Create_procedure_stmtContext.class, 0);
		}

		public HplsqlParser.Create_table_stmtContext create_table_stmt() {
			return (HplsqlParser.Create_table_stmtContext)this.getRuleContext(HplsqlParser.Create_table_stmtContext.class, 0);
		}

		public HplsqlParser.Declare_stmtContext declare_stmt() {
			return (HplsqlParser.Declare_stmtContext)this.getRuleContext(HplsqlParser.Declare_stmtContext.class, 0);
		}

		public HplsqlParser.Delete_stmtContext delete_stmt() {
			return (HplsqlParser.Delete_stmtContext)this.getRuleContext(HplsqlParser.Delete_stmtContext.class, 0);
		}

		public HplsqlParser.Describe_stmtContext describe_stmt() {
			return (HplsqlParser.Describe_stmtContext)this.getRuleContext(HplsqlParser.Describe_stmtContext.class, 0);
		}

		public HplsqlParser.Drop_stmtContext drop_stmt() {
			return (HplsqlParser.Drop_stmtContext)this.getRuleContext(HplsqlParser.Drop_stmtContext.class, 0);
		}

		public HplsqlParser.End_transaction_stmtContext end_transaction_stmt() {
			return (HplsqlParser.End_transaction_stmtContext)this.getRuleContext(HplsqlParser.End_transaction_stmtContext.class, 0);
		}

		public HplsqlParser.Exec_stmtContext exec_stmt() {
			return (HplsqlParser.Exec_stmtContext)this.getRuleContext(HplsqlParser.Exec_stmtContext.class, 0);
		}

		public HplsqlParser.Exit_stmtContext exit_stmt() {
			return (HplsqlParser.Exit_stmtContext)this.getRuleContext(HplsqlParser.Exit_stmtContext.class, 0);
		}

		public HplsqlParser.Fetch_stmtContext fetch_stmt() {
			return (HplsqlParser.Fetch_stmtContext)this.getRuleContext(HplsqlParser.Fetch_stmtContext.class, 0);
		}

		public HplsqlParser.For_cursor_stmtContext for_cursor_stmt() {
			return (HplsqlParser.For_cursor_stmtContext)this.getRuleContext(HplsqlParser.For_cursor_stmtContext.class, 0);
		}

		public HplsqlParser.For_range_stmtContext for_range_stmt() {
			return (HplsqlParser.For_range_stmtContext)this.getRuleContext(HplsqlParser.For_range_stmtContext.class, 0);
		}

		public HplsqlParser.If_stmtContext if_stmt() {
			return (HplsqlParser.If_stmtContext)this.getRuleContext(HplsqlParser.If_stmtContext.class, 0);
		}

		public HplsqlParser.Include_stmtContext include_stmt() {
			return (HplsqlParser.Include_stmtContext)this.getRuleContext(HplsqlParser.Include_stmtContext.class, 0);
		}

		public HplsqlParser.Insert_stmtContext insert_stmt() {
			return (HplsqlParser.Insert_stmtContext)this.getRuleContext(HplsqlParser.Insert_stmtContext.class, 0);
		}

		public HplsqlParser.Insert_directory_stmtContext insert_directory_stmt() {
			return (HplsqlParser.Insert_directory_stmtContext)this.getRuleContext(HplsqlParser.Insert_directory_stmtContext.class, 0);
		}

		public HplsqlParser.Get_diag_stmtContext get_diag_stmt() {
			return (HplsqlParser.Get_diag_stmtContext)this.getRuleContext(HplsqlParser.Get_diag_stmtContext.class, 0);
		}

		public HplsqlParser.Grant_stmtContext grant_stmt() {
			return (HplsqlParser.Grant_stmtContext)this.getRuleContext(HplsqlParser.Grant_stmtContext.class, 0);
		}

		public HplsqlParser.Leave_stmtContext leave_stmt() {
			return (HplsqlParser.Leave_stmtContext)this.getRuleContext(HplsqlParser.Leave_stmtContext.class, 0);
		}

		public HplsqlParser.Map_object_stmtContext map_object_stmt() {
			return (HplsqlParser.Map_object_stmtContext)this.getRuleContext(HplsqlParser.Map_object_stmtContext.class, 0);
		}

		public HplsqlParser.Merge_stmtContext merge_stmt() {
			return (HplsqlParser.Merge_stmtContext)this.getRuleContext(HplsqlParser.Merge_stmtContext.class, 0);
		}

		public HplsqlParser.Open_stmtContext open_stmt() {
			return (HplsqlParser.Open_stmtContext)this.getRuleContext(HplsqlParser.Open_stmtContext.class, 0);
		}

		public HplsqlParser.Print_stmtContext print_stmt() {
			return (HplsqlParser.Print_stmtContext)this.getRuleContext(HplsqlParser.Print_stmtContext.class, 0);
		}

		public HplsqlParser.Raise_stmtContext raise_stmt() {
			return (HplsqlParser.Raise_stmtContext)this.getRuleContext(HplsqlParser.Raise_stmtContext.class, 0);
		}

		public HplsqlParser.Resignal_stmtContext resignal_stmt() {
			return (HplsqlParser.Resignal_stmtContext)this.getRuleContext(HplsqlParser.Resignal_stmtContext.class, 0);
		}

		public HplsqlParser.Return_stmtContext return_stmt() {
			return (HplsqlParser.Return_stmtContext)this.getRuleContext(HplsqlParser.Return_stmtContext.class, 0);
		}

		public HplsqlParser.Rollback_stmtContext rollback_stmt() {
			return (HplsqlParser.Rollback_stmtContext)this.getRuleContext(HplsqlParser.Rollback_stmtContext.class, 0);
		}

		public HplsqlParser.Select_stmtContext select_stmt() {
			return (HplsqlParser.Select_stmtContext)this.getRuleContext(HplsqlParser.Select_stmtContext.class, 0);
		}

		public HplsqlParser.Signal_stmtContext signal_stmt() {
			return (HplsqlParser.Signal_stmtContext)this.getRuleContext(HplsqlParser.Signal_stmtContext.class, 0);
		}

		public HplsqlParser.Update_stmtContext update_stmt() {
			return (HplsqlParser.Update_stmtContext)this.getRuleContext(HplsqlParser.Update_stmtContext.class, 0);
		}

		public HplsqlParser.Use_stmtContext use_stmt() {
			return (HplsqlParser.Use_stmtContext)this.getRuleContext(HplsqlParser.Use_stmtContext.class, 0);
		}

		public HplsqlParser.Truncate_stmtContext truncate_stmt() {
			return (HplsqlParser.Truncate_stmtContext)this.getRuleContext(HplsqlParser.Truncate_stmtContext.class, 0);
		}

		public HplsqlParser.Values_into_stmtContext values_into_stmt() {
			return (HplsqlParser.Values_into_stmtContext)this.getRuleContext(HplsqlParser.Values_into_stmtContext.class, 0);
		}

		public HplsqlParser.While_stmtContext while_stmt() {
			return (HplsqlParser.While_stmtContext)this.getRuleContext(HplsqlParser.While_stmtContext.class, 0);
		}

		public HplsqlParser.LabelContext label() {
			return (HplsqlParser.LabelContext)this.getRuleContext(HplsqlParser.LabelContext.class, 0);
		}

		public HplsqlParser.HiveContext hive() {
			return (HplsqlParser.HiveContext)this.getRuleContext(HplsqlParser.HiveContext.class, 0);
		}

		public HplsqlParser.HostContext host() {
			return (HplsqlParser.HostContext)this.getRuleContext(HplsqlParser.HostContext.class, 0);
		}

		public HplsqlParser.Null_stmtContext null_stmt() {
			return (HplsqlParser.Null_stmtContext)this.getRuleContext(HplsqlParser.Null_stmtContext.class, 0);
		}

		public HplsqlParser.Expr_stmtContext expr_stmt() {
			return (HplsqlParser.Expr_stmtContext)this.getRuleContext(HplsqlParser.Expr_stmtContext.class, 0);
		}

		public HplsqlParser.Semicolon_stmtContext semicolon_stmt() {
			return (HplsqlParser.Semicolon_stmtContext)this.getRuleContext(HplsqlParser.Semicolon_stmtContext.class, 0);
		}

		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 6;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterStmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitStmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitStmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Proc_blockContext extends ParserRuleContext {
		public HplsqlParser.Begin_end_blockContext begin_end_block() {
			return (HplsqlParser.Begin_end_blockContext)this.getRuleContext(HplsqlParser.Begin_end_blockContext.class, 0);
		}

		public List<HplsqlParser.StmtContext> stmt() {
			return this.getRuleContexts(HplsqlParser.StmtContext.class);
		}

		public HplsqlParser.StmtContext stmt(int i) {
			return (HplsqlParser.StmtContext)this.getRuleContext(HplsqlParser.StmtContext.class, i);
		}

		public TerminalNode T_GO() {
			return this.getToken(120, 0);
		}

		public Proc_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 5;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterProc_block(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitProc_block(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitProc_block(this) : visitor.visitChildren(this);
		}
	}

	public static class Block_endContext extends ParserRuleContext {
		public TerminalNode T_END() {
			return this.getToken(94, 0);
		}

		public Block_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 4;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterBlock_end(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitBlock_end(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitBlock_end(this) : visitor.visitChildren(this);
		}
	}

	public static class Single_block_stmtContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() {
			return this.getToken(21, 0);
		}

		public HplsqlParser.BlockContext block() {
			return (HplsqlParser.BlockContext)this.getRuleContext(HplsqlParser.BlockContext.class, 0);
		}

		public HplsqlParser.Block_endContext block_end() {
			return (HplsqlParser.Block_endContext)this.getRuleContext(HplsqlParser.Block_endContext.class, 0);
		}

		public HplsqlParser.Exception_blockContext exception_block() {
			return (HplsqlParser.Exception_blockContext)this.getRuleContext(HplsqlParser.Exception_blockContext.class, 0);
		}

		public HplsqlParser.StmtContext stmt() {
			return (HplsqlParser.StmtContext)this.getRuleContext(HplsqlParser.StmtContext.class, 0);
		}

		public TerminalNode T_SEMICOLON() {
			return this.getToken(352, 0);
		}

		public Single_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 3;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterSingle_block_stmt(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitSingle_block_stmt(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitSingle_block_stmt(this) : visitor.visitChildren(this);
		}
	}

	public static class Begin_end_blockContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() {
			return this.getToken(21, 0);
		}

		public HplsqlParser.BlockContext block() {
			return (HplsqlParser.BlockContext)this.getRuleContext(HplsqlParser.BlockContext.class, 0);
		}

		public HplsqlParser.Block_endContext block_end() {
			return (HplsqlParser.Block_endContext)this.getRuleContext(HplsqlParser.Block_endContext.class, 0);
		}

		public HplsqlParser.Declare_blockContext declare_block() {
			return (HplsqlParser.Declare_blockContext)this.getRuleContext(HplsqlParser.Declare_blockContext.class, 0);
		}

		public HplsqlParser.Exception_blockContext exception_block() {
			return (HplsqlParser.Exception_blockContext)this.getRuleContext(HplsqlParser.Exception_blockContext.class, 0);
		}

		public Begin_end_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 2;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterBegin_end_block(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitBegin_end_block(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitBegin_end_block(this) : visitor.visitChildren(this);
		}
	}

	public static class BlockContext extends ParserRuleContext {
		public List<HplsqlParser.Begin_end_blockContext> begin_end_block() {
			return this.getRuleContexts(HplsqlParser.Begin_end_blockContext.class);
		}

		public HplsqlParser.Begin_end_blockContext begin_end_block(int i) {
			return (HplsqlParser.Begin_end_blockContext)this.getRuleContext(HplsqlParser.Begin_end_blockContext.class, i);
		}

		public List<HplsqlParser.StmtContext> stmt() {
			return this.getRuleContexts(HplsqlParser.StmtContext.class);
		}

		public HplsqlParser.StmtContext stmt(int i) {
			return (HplsqlParser.StmtContext)this.getRuleContext(HplsqlParser.StmtContext.class, i);
		}

		public List<TerminalNode> T_GO() {
			return this.getTokens(120);
		}

		public TerminalNode T_GO(int i) {
			return this.getToken(120, i);
		}

		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 1;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterBlock(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitBlock(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitBlock(this) : visitor.visitChildren(this);
		}
	}

	public static class ProgramContext extends ParserRuleContext {
		public HplsqlParser.BlockContext block() {
			return (HplsqlParser.BlockContext)this.getRuleContext(HplsqlParser.BlockContext.class, 0);
		}

		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public int getRuleIndex() {
			return 0;
		}

		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).enterProgram(this);
			}

		}

		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) {
				((HplsqlListener)listener).exitProgram(this);
			}

		}

		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			return visitor instanceof HplsqlVisitor ? ((HplsqlVisitor<? extends T>)visitor).visitProgram(this) : visitor.visitChildren(this);
		}
	}
}
