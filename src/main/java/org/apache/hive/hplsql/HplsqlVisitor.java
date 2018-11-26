//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.apache.hive.hplsql;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.apache.hive.hplsql.HplsqlParser.Allocate_cursor_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Alter_table_add_constraintContext;
import org.apache.hive.hplsql.HplsqlParser.Alter_table_add_constraint_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Alter_table_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Alter_table_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Assignment_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Assignment_stmt_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Assignment_stmt_multiple_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Assignment_stmt_select_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Assignment_stmt_single_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Associate_locator_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Begin_end_blockContext;
import org.apache.hive.hplsql.HplsqlParser.Begin_transaction_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.BlockContext;
import org.apache.hive.hplsql.HplsqlParser.Block_endContext;
import org.apache.hive.hplsql.HplsqlParser.Bool_exprContext;
import org.apache.hive.hplsql.HplsqlParser.Bool_expr_atomContext;
import org.apache.hive.hplsql.HplsqlParser.Bool_expr_binaryContext;
import org.apache.hive.hplsql.HplsqlParser.Bool_expr_binary_operatorContext;
import org.apache.hive.hplsql.HplsqlParser.Bool_expr_logical_operatorContext;
import org.apache.hive.hplsql.HplsqlParser.Bool_expr_multi_inContext;
import org.apache.hive.hplsql.HplsqlParser.Bool_expr_single_inContext;
import org.apache.hive.hplsql.HplsqlParser.Bool_expr_unaryContext;
import org.apache.hive.hplsql.HplsqlParser.Bool_literalContext;
import org.apache.hive.hplsql.HplsqlParser.Break_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Call_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Close_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Cmp_sourceContext;
import org.apache.hive.hplsql.HplsqlParser.Cmp_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Column_nameContext;
import org.apache.hive.hplsql.HplsqlParser.Commit_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Copy_file_optionContext;
import org.apache.hive.hplsql.HplsqlParser.Copy_from_ftp_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Copy_from_local_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Copy_ftp_optionContext;
import org.apache.hive.hplsql.HplsqlParser.Copy_optionContext;
import org.apache.hive.hplsql.HplsqlParser.Copy_sourceContext;
import org.apache.hive.hplsql.HplsqlParser.Copy_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Copy_targetContext;
import org.apache.hive.hplsql.HplsqlParser.Create_database_optionContext;
import org.apache.hive.hplsql.HplsqlParser.Create_database_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Create_function_returnContext;
import org.apache.hive.hplsql.HplsqlParser.Create_function_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Create_index_colContext;
import org.apache.hive.hplsql.HplsqlParser.Create_index_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Create_local_temp_table_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Create_package_body_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Create_package_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Create_procedure_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Create_routine_optionContext;
import org.apache.hive.hplsql.HplsqlParser.Create_routine_optionsContext;
import org.apache.hive.hplsql.HplsqlParser.Create_routine_param_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Create_routine_paramsContext;
import org.apache.hive.hplsql.HplsqlParser.Create_table_column_consContext;
import org.apache.hive.hplsql.HplsqlParser.Create_table_column_inline_consContext;
import org.apache.hive.hplsql.HplsqlParser.Create_table_columnsContext;
import org.apache.hive.hplsql.HplsqlParser.Create_table_columns_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Create_table_fk_actionContext;
import org.apache.hive.hplsql.HplsqlParser.Create_table_hive_row_formatContext;
import org.apache.hive.hplsql.HplsqlParser.Create_table_hive_row_format_fieldsContext;
import org.apache.hive.hplsql.HplsqlParser.Create_table_optionsContext;
import org.apache.hive.hplsql.HplsqlParser.Create_table_options_db2_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Create_table_options_hive_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Create_table_options_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Create_table_options_mssql_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Create_table_options_mysql_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Create_table_options_ora_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Create_table_preoptionsContext;
import org.apache.hive.hplsql.HplsqlParser.Create_table_preoptions_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Create_table_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Cte_select_colsContext;
import org.apache.hive.hplsql.HplsqlParser.Cte_select_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Cte_select_stmt_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Cursor_with_returnContext;
import org.apache.hive.hplsql.HplsqlParser.Cursor_without_returnContext;
import org.apache.hive.hplsql.HplsqlParser.Date_literalContext;
import org.apache.hive.hplsql.HplsqlParser.Dec_numberContext;
import org.apache.hive.hplsql.HplsqlParser.Declare_blockContext;
import org.apache.hive.hplsql.HplsqlParser.Declare_block_inplaceContext;
import org.apache.hive.hplsql.HplsqlParser.Declare_condition_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Declare_cursor_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Declare_handler_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Declare_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Declare_stmt_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Declare_temporary_table_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Declare_var_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Delete_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Describe_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Double_quotedStringContext;
import org.apache.hive.hplsql.HplsqlParser.Drop_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.DtypeContext;
import org.apache.hive.hplsql.HplsqlParser.Dtype_attrContext;
import org.apache.hive.hplsql.HplsqlParser.Dtype_defaultContext;
import org.apache.hive.hplsql.HplsqlParser.Dtype_lenContext;
import org.apache.hive.hplsql.HplsqlParser.Else_blockContext;
import org.apache.hive.hplsql.HplsqlParser.Elseif_blockContext;
import org.apache.hive.hplsql.HplsqlParser.End_transaction_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Exception_blockContext;
import org.apache.hive.hplsql.HplsqlParser.Exception_block_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Exec_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Exit_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.ExprContext;
import org.apache.hive.hplsql.HplsqlParser.Expr_agg_window_funcContext;
import org.apache.hive.hplsql.HplsqlParser.Expr_atomContext;
import org.apache.hive.hplsql.HplsqlParser.Expr_caseContext;
import org.apache.hive.hplsql.HplsqlParser.Expr_case_searchedContext;
import org.apache.hive.hplsql.HplsqlParser.Expr_case_simpleContext;
import org.apache.hive.hplsql.HplsqlParser.Expr_concatContext;
import org.apache.hive.hplsql.HplsqlParser.Expr_concat_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Expr_cursor_attributeContext;
import org.apache.hive.hplsql.HplsqlParser.Expr_fileContext;
import org.apache.hive.hplsql.HplsqlParser.Expr_funcContext;
import org.apache.hive.hplsql.HplsqlParser.Expr_func_all_distinctContext;
import org.apache.hive.hplsql.HplsqlParser.Expr_func_over_clauseContext;
import org.apache.hive.hplsql.HplsqlParser.Expr_func_paramsContext;
import org.apache.hive.hplsql.HplsqlParser.Expr_func_partition_by_clauseContext;
import org.apache.hive.hplsql.HplsqlParser.Expr_intervalContext;
import org.apache.hive.hplsql.HplsqlParser.Expr_selectContext;
import org.apache.hive.hplsql.HplsqlParser.Expr_spec_funcContext;
import org.apache.hive.hplsql.HplsqlParser.Expr_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Fetch_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.File_nameContext;
import org.apache.hive.hplsql.HplsqlParser.For_cursor_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.For_range_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.From_alias_clauseContext;
import org.apache.hive.hplsql.HplsqlParser.From_clauseContext;
import org.apache.hive.hplsql.HplsqlParser.From_join_clauseContext;
import org.apache.hive.hplsql.HplsqlParser.From_join_type_clauseContext;
import org.apache.hive.hplsql.HplsqlParser.From_subselect_clauseContext;
import org.apache.hive.hplsql.HplsqlParser.From_table_clauseContext;
import org.apache.hive.hplsql.HplsqlParser.From_table_name_clauseContext;
import org.apache.hive.hplsql.HplsqlParser.From_table_values_clauseContext;
import org.apache.hive.hplsql.HplsqlParser.From_table_values_rowContext;
import org.apache.hive.hplsql.HplsqlParser.Fullselect_set_clauseContext;
import org.apache.hive.hplsql.HplsqlParser.Fullselect_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Fullselect_stmt_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Func_paramContext;
import org.apache.hive.hplsql.HplsqlParser.Get_diag_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Get_diag_stmt_exception_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Get_diag_stmt_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Get_diag_stmt_rowcount_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Grant_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Grant_stmt_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Group_by_clauseContext;
import org.apache.hive.hplsql.HplsqlParser.Having_clauseContext;
import org.apache.hive.hplsql.HplsqlParser.HiveContext;
import org.apache.hive.hplsql.HplsqlParser.Hive_itemContext;
import org.apache.hive.hplsql.HplsqlParser.HostContext;
import org.apache.hive.hplsql.HplsqlParser.Host_cmdContext;
import org.apache.hive.hplsql.HplsqlParser.Host_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.IdentContext;
import org.apache.hive.hplsql.HplsqlParser.If_plsql_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.If_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.If_tsql_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Include_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Index_mssql_storage_clauseContext;
import org.apache.hive.hplsql.HplsqlParser.Index_storage_clauseContext;
import org.apache.hive.hplsql.HplsqlParser.Insert_directory_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Insert_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Insert_stmt_colsContext;
import org.apache.hive.hplsql.HplsqlParser.Insert_stmt_rowContext;
import org.apache.hive.hplsql.HplsqlParser.Insert_stmt_rowsContext;
import org.apache.hive.hplsql.HplsqlParser.Int_numberContext;
import org.apache.hive.hplsql.HplsqlParser.Interval_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Into_clauseContext;
import org.apache.hive.hplsql.HplsqlParser.LabelContext;
import org.apache.hive.hplsql.HplsqlParser.Leave_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Map_object_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Merge_actionContext;
import org.apache.hive.hplsql.HplsqlParser.Merge_conditionContext;
import org.apache.hive.hplsql.HplsqlParser.Merge_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Merge_tableContext;
import org.apache.hive.hplsql.HplsqlParser.Non_reserved_wordsContext;
import org.apache.hive.hplsql.HplsqlParser.Null_constContext;
import org.apache.hive.hplsql.HplsqlParser.Null_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Open_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Order_by_clauseContext;
import org.apache.hive.hplsql.HplsqlParser.Package_bodyContext;
import org.apache.hive.hplsql.HplsqlParser.Package_body_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Package_specContext;
import org.apache.hive.hplsql.HplsqlParser.Package_spec_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Print_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Proc_blockContext;
import org.apache.hive.hplsql.HplsqlParser.ProgramContext;
import org.apache.hive.hplsql.HplsqlParser.Raise_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Resignal_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Return_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Rollback_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Select_listContext;
import org.apache.hive.hplsql.HplsqlParser.Select_list_aliasContext;
import org.apache.hive.hplsql.HplsqlParser.Select_list_asteriskContext;
import org.apache.hive.hplsql.HplsqlParser.Select_list_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Select_list_limitContext;
import org.apache.hive.hplsql.HplsqlParser.Select_list_setContext;
import org.apache.hive.hplsql.HplsqlParser.Select_optionsContext;
import org.apache.hive.hplsql.HplsqlParser.Select_options_itemContext;
import org.apache.hive.hplsql.HplsqlParser.Select_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Semicolon_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Set_current_schema_optionContext;
import org.apache.hive.hplsql.HplsqlParser.Set_mssql_session_optionContext;
import org.apache.hive.hplsql.HplsqlParser.Set_session_optionContext;
import org.apache.hive.hplsql.HplsqlParser.Set_teradata_session_optionContext;
import org.apache.hive.hplsql.HplsqlParser.Signal_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Single_block_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Single_quotedStringContext;
import org.apache.hive.hplsql.HplsqlParser.StmtContext;
import org.apache.hive.hplsql.HplsqlParser.Subselect_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Table_nameContext;
import org.apache.hive.hplsql.HplsqlParser.Timestamp_literalContext;
import org.apache.hive.hplsql.HplsqlParser.Truncate_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Update_assignmentContext;
import org.apache.hive.hplsql.HplsqlParser.Update_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Update_tableContext;
import org.apache.hive.hplsql.HplsqlParser.Update_upsertContext;
import org.apache.hive.hplsql.HplsqlParser.Use_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Using_clauseContext;
import org.apache.hive.hplsql.HplsqlParser.Values_into_stmtContext;
import org.apache.hive.hplsql.HplsqlParser.Where_clauseContext;
import org.apache.hive.hplsql.HplsqlParser.While_stmtContext;

public interface HplsqlVisitor<T> extends ParseTreeVisitor<T> {
	T visitProgram(ProgramContext var1);

	T visitBlock(BlockContext var1);

	T visitBegin_end_block(Begin_end_blockContext var1);

	T visitSingle_block_stmt(Single_block_stmtContext var1);

	T visitBlock_end(Block_endContext var1);

	T visitProc_block(Proc_blockContext var1);

	T visitStmt(StmtContext var1);

	T visitSemicolon_stmt(Semicolon_stmtContext var1);

	T visitException_block(Exception_blockContext var1);

	T visitException_block_item(Exception_block_itemContext var1);

	T visitNull_stmt(Null_stmtContext var1);

	T visitExpr_stmt(Expr_stmtContext var1);

	T visitAssignment_stmt(Assignment_stmtContext var1);

	T visitAssignment_stmt_item(Assignment_stmt_itemContext var1);

	T visitAssignment_stmt_single_item(Assignment_stmt_single_itemContext var1);

	T visitAssignment_stmt_multiple_item(Assignment_stmt_multiple_itemContext var1);

	T visitAssignment_stmt_select_item(Assignment_stmt_select_itemContext var1);

	T visitAllocate_cursor_stmt(Allocate_cursor_stmtContext var1);

	T visitAssociate_locator_stmt(Associate_locator_stmtContext var1);

	T visitBegin_transaction_stmt(Begin_transaction_stmtContext var1);

	T visitBreak_stmt(Break_stmtContext var1);

	T visitCall_stmt(Call_stmtContext var1);

	T visitDeclare_stmt(Declare_stmtContext var1);

	T visitDeclare_block(Declare_blockContext var1);

	T visitDeclare_block_inplace(Declare_block_inplaceContext var1);

	T visitDeclare_stmt_item(Declare_stmt_itemContext var1);

	T visitDeclare_var_item(Declare_var_itemContext var1);

	T visitDeclare_condition_item(Declare_condition_itemContext var1);

	T visitDeclare_cursor_item(Declare_cursor_itemContext var1);

	T visitCursor_with_return(Cursor_with_returnContext var1);

	T visitCursor_without_return(Cursor_without_returnContext var1);

	T visitDeclare_handler_item(Declare_handler_itemContext var1);

	T visitDeclare_temporary_table_item(Declare_temporary_table_itemContext var1);

	T visitCreate_table_stmt(Create_table_stmtContext var1);

	T visitCreate_local_temp_table_stmt(Create_local_temp_table_stmtContext var1);

	T visitCreate_table_columns(Create_table_columnsContext var1);

	T visitCreate_table_columns_item(Create_table_columns_itemContext var1);

	T visitColumn_name(Column_nameContext var1);

	T visitCreate_table_column_inline_cons(Create_table_column_inline_consContext var1);

	T visitCreate_table_column_cons(Create_table_column_consContext var1);

	T visitCreate_table_fk_action(Create_table_fk_actionContext var1);

	T visitCreate_table_preoptions(Create_table_preoptionsContext var1);

	T visitCreate_table_preoptions_item(Create_table_preoptions_itemContext var1);

	T visitCreate_table_options(Create_table_optionsContext var1);

	T visitCreate_table_options_item(Create_table_options_itemContext var1);

	T visitCreate_table_options_ora_item(Create_table_options_ora_itemContext var1);

	T visitCreate_table_options_db2_item(Create_table_options_db2_itemContext var1);

	T visitCreate_table_options_hive_item(Create_table_options_hive_itemContext var1);

	T visitCreate_table_hive_row_format(Create_table_hive_row_formatContext var1);

	T visitCreate_table_hive_row_format_fields(Create_table_hive_row_format_fieldsContext var1);

	T visitCreate_table_options_mssql_item(Create_table_options_mssql_itemContext var1);

	T visitCreate_table_options_mysql_item(Create_table_options_mysql_itemContext var1);

	T visitAlter_table_stmt(Alter_table_stmtContext var1);

	T visitAlter_table_item(Alter_table_itemContext var1);

	T visitAlter_table_add_constraint(Alter_table_add_constraintContext var1);

	T visitAlter_table_add_constraint_item(Alter_table_add_constraint_itemContext var1);

	T visitDtype(DtypeContext var1);

	T visitDtype_len(Dtype_lenContext var1);

	T visitDtype_attr(Dtype_attrContext var1);

	T visitDtype_default(Dtype_defaultContext var1);

	T visitCreate_database_stmt(Create_database_stmtContext var1);

	T visitCreate_database_option(Create_database_optionContext var1);

	T visitCreate_function_stmt(Create_function_stmtContext var1);

	T visitCreate_function_return(Create_function_returnContext var1);

	T visitCreate_package_stmt(Create_package_stmtContext var1);

	T visitPackage_spec(Package_specContext var1);

	T visitPackage_spec_item(Package_spec_itemContext var1);

	T visitCreate_package_body_stmt(Create_package_body_stmtContext var1);

	T visitPackage_body(Package_bodyContext var1);

	T visitPackage_body_item(Package_body_itemContext var1);

	T visitCreate_procedure_stmt(Create_procedure_stmtContext var1);

	T visitCreate_routine_params(Create_routine_paramsContext var1);

	T visitCreate_routine_param_item(Create_routine_param_itemContext var1);

	T visitCreate_routine_options(Create_routine_optionsContext var1);

	T visitCreate_routine_option(Create_routine_optionContext var1);

	T visitDrop_stmt(Drop_stmtContext var1);

	T visitEnd_transaction_stmt(End_transaction_stmtContext var1);

	T visitExec_stmt(Exec_stmtContext var1);

	T visitIf_stmt(If_stmtContext var1);

	T visitIf_plsql_stmt(If_plsql_stmtContext var1);

	T visitIf_tsql_stmt(If_tsql_stmtContext var1);

	T visitElseif_block(Elseif_blockContext var1);

	T visitElse_block(Else_blockContext var1);

	T visitInclude_stmt(Include_stmtContext var1);

	T visitInsert_stmt(Insert_stmtContext var1);

	T visitInsert_stmt_cols(Insert_stmt_colsContext var1);

	T visitInsert_stmt_rows(Insert_stmt_rowsContext var1);

	T visitInsert_stmt_row(Insert_stmt_rowContext var1);

	T visitInsert_directory_stmt(Insert_directory_stmtContext var1);

	T visitExit_stmt(Exit_stmtContext var1);

	T visitGet_diag_stmt(Get_diag_stmtContext var1);

	T visitGet_diag_stmt_item(Get_diag_stmt_itemContext var1);

	T visitGet_diag_stmt_exception_item(Get_diag_stmt_exception_itemContext var1);

	T visitGet_diag_stmt_rowcount_item(Get_diag_stmt_rowcount_itemContext var1);

	T visitGrant_stmt(Grant_stmtContext var1);

	T visitGrant_stmt_item(Grant_stmt_itemContext var1);

	T visitLeave_stmt(Leave_stmtContext var1);

	T visitMap_object_stmt(Map_object_stmtContext var1);

	T visitOpen_stmt(Open_stmtContext var1);

	T visitFetch_stmt(Fetch_stmtContext var1);

	T visitClose_stmt(Close_stmtContext var1);

	T visitCmp_stmt(Cmp_stmtContext var1);

	T visitCmp_source(Cmp_sourceContext var1);

	T visitCopy_from_ftp_stmt(Copy_from_ftp_stmtContext var1);

	T visitCopy_from_local_stmt(Copy_from_local_stmtContext var1);

	T visitCopy_stmt(Copy_stmtContext var1);

	T visitCopy_source(Copy_sourceContext var1);

	T visitCopy_target(Copy_targetContext var1);

	T visitCopy_option(Copy_optionContext var1);

	T visitCopy_file_option(Copy_file_optionContext var1);

	T visitCopy_ftp_option(Copy_ftp_optionContext var1);

	T visitCommit_stmt(Commit_stmtContext var1);

	T visitCreate_index_stmt(Create_index_stmtContext var1);

	T visitCreate_index_col(Create_index_colContext var1);

	T visitIndex_storage_clause(Index_storage_clauseContext var1);

	T visitIndex_mssql_storage_clause(Index_mssql_storage_clauseContext var1);

	T visitPrint_stmt(Print_stmtContext var1);

	T visitRaise_stmt(Raise_stmtContext var1);

	T visitResignal_stmt(Resignal_stmtContext var1);

	T visitReturn_stmt(Return_stmtContext var1);

	T visitRollback_stmt(Rollback_stmtContext var1);

	T visitSet_session_option(Set_session_optionContext var1);

	T visitSet_current_schema_option(Set_current_schema_optionContext var1);

	T visitSet_mssql_session_option(Set_mssql_session_optionContext var1);

	T visitSet_teradata_session_option(Set_teradata_session_optionContext var1);

	T visitSignal_stmt(Signal_stmtContext var1);

	T visitTruncate_stmt(Truncate_stmtContext var1);

	T visitUse_stmt(Use_stmtContext var1);

	T visitValues_into_stmt(Values_into_stmtContext var1);

	T visitWhile_stmt(While_stmtContext var1);

	T visitFor_cursor_stmt(For_cursor_stmtContext var1);

	T visitFor_range_stmt(For_range_stmtContext var1);

	T visitLabel(LabelContext var1);

	T visitUsing_clause(Using_clauseContext var1);

	T visitSelect_stmt(Select_stmtContext var1);

	T visitCte_select_stmt(Cte_select_stmtContext var1);

	T visitCte_select_stmt_item(Cte_select_stmt_itemContext var1);

	T visitCte_select_cols(Cte_select_colsContext var1);

	T visitFullselect_stmt(Fullselect_stmtContext var1);

	T visitFullselect_stmt_item(Fullselect_stmt_itemContext var1);

	T visitFullselect_set_clause(Fullselect_set_clauseContext var1);

	T visitSubselect_stmt(Subselect_stmtContext var1);

	T visitSelect_list(Select_listContext var1);

	T visitSelect_list_set(Select_list_setContext var1);

	T visitSelect_list_limit(Select_list_limitContext var1);

	T visitSelect_list_item(Select_list_itemContext var1);

	T visitSelect_list_alias(Select_list_aliasContext var1);

	T visitSelect_list_asterisk(Select_list_asteriskContext var1);

	T visitInto_clause(Into_clauseContext var1);

	T visitFrom_clause(From_clauseContext var1);

	T visitFrom_table_clause(From_table_clauseContext var1);

	T visitFrom_table_name_clause(From_table_name_clauseContext var1);

	T visitFrom_subselect_clause(From_subselect_clauseContext var1);

	T visitFrom_join_clause(From_join_clauseContext var1);

	T visitFrom_join_type_clause(From_join_type_clauseContext var1);

	T visitFrom_table_values_clause(From_table_values_clauseContext var1);

	T visitFrom_table_values_row(From_table_values_rowContext var1);

	T visitFrom_alias_clause(From_alias_clauseContext var1);

	T visitTable_name(Table_nameContext var1);

	T visitWhere_clause(Where_clauseContext var1);

	T visitGroup_by_clause(Group_by_clauseContext var1);

	T visitHaving_clause(Having_clauseContext var1);

	T visitOrder_by_clause(Order_by_clauseContext var1);

	T visitSelect_options(Select_optionsContext var1);

	T visitSelect_options_item(Select_options_itemContext var1);

	T visitUpdate_stmt(Update_stmtContext var1);

	T visitUpdate_assignment(Update_assignmentContext var1);

	T visitUpdate_table(Update_tableContext var1);

	T visitUpdate_upsert(Update_upsertContext var1);

	T visitMerge_stmt(Merge_stmtContext var1);

	T visitMerge_table(Merge_tableContext var1);

	T visitMerge_condition(Merge_conditionContext var1);

	T visitMerge_action(Merge_actionContext var1);

	T visitDelete_stmt(Delete_stmtContext var1);

	T visitDescribe_stmt(Describe_stmtContext var1);

	T visitBool_expr(Bool_exprContext var1);

	T visitBool_expr_atom(Bool_expr_atomContext var1);

	T visitBool_expr_unary(Bool_expr_unaryContext var1);

	T visitBool_expr_single_in(Bool_expr_single_inContext var1);

	T visitBool_expr_multi_in(Bool_expr_multi_inContext var1);

	T visitBool_expr_binary(Bool_expr_binaryContext var1);

	T visitBool_expr_logical_operator(Bool_expr_logical_operatorContext var1);

	T visitBool_expr_binary_operator(Bool_expr_binary_operatorContext var1);

	T visitExpr(ExprContext var1);

	T visitExpr_atom(Expr_atomContext var1);

	T visitExpr_interval(Expr_intervalContext var1);

	T visitInterval_item(Interval_itemContext var1);

	T visitExpr_concat(Expr_concatContext var1);

	T visitExpr_concat_item(Expr_concat_itemContext var1);

	T visitExpr_case(Expr_caseContext var1);

	T visitExpr_case_simple(Expr_case_simpleContext var1);

	T visitExpr_case_searched(Expr_case_searchedContext var1);

	T visitExpr_cursor_attribute(Expr_cursor_attributeContext var1);

	T visitExpr_agg_window_func(Expr_agg_window_funcContext var1);

	T visitExpr_func_all_distinct(Expr_func_all_distinctContext var1);

	T visitExpr_func_over_clause(Expr_func_over_clauseContext var1);

	T visitExpr_func_partition_by_clause(Expr_func_partition_by_clauseContext var1);

	T visitExpr_spec_func(Expr_spec_funcContext var1);

	T visitExpr_func(Expr_funcContext var1);

	T visitExpr_func_params(Expr_func_paramsContext var1);

	T visitFunc_param(Func_paramContext var1);

	T visitExpr_select(Expr_selectContext var1);

	T visitExpr_file(Expr_fileContext var1);

	T visitHive(HiveContext var1);

	T visitHive_item(Hive_itemContext var1);

	T visitHost(HostContext var1);

	T visitHost_cmd(Host_cmdContext var1);

	T visitHost_stmt(Host_stmtContext var1);

	T visitFile_name(File_nameContext var1);

	T visitDate_literal(Date_literalContext var1);

	T visitTimestamp_literal(Timestamp_literalContext var1);

	T visitIdent(IdentContext var1);

	T visitSingle_quotedString(Single_quotedStringContext var1);

	T visitDouble_quotedString(Double_quotedStringContext var1);

	T visitInt_number(Int_numberContext var1);

	T visitDec_number(Dec_numberContext var1);

	T visitBool_literal(Bool_literalContext var1);

	T visitNull_const(Null_constContext var1);

	T visitNon_reserved_words(Non_reserved_wordsContext var1);
}
