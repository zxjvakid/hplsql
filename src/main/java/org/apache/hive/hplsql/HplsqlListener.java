//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.apache.hive.hplsql;

import org.antlr.v4.runtime.tree.ParseTreeListener;
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

public interface HplsqlListener extends ParseTreeListener {
	void enterProgram(ProgramContext var1);

	void exitProgram(ProgramContext var1);

	void enterBlock(BlockContext var1);

	void exitBlock(BlockContext var1);

	void enterBegin_end_block(Begin_end_blockContext var1);

	void exitBegin_end_block(Begin_end_blockContext var1);

	void enterSingle_block_stmt(Single_block_stmtContext var1);

	void exitSingle_block_stmt(Single_block_stmtContext var1);

	void enterBlock_end(Block_endContext var1);

	void exitBlock_end(Block_endContext var1);

	void enterProc_block(Proc_blockContext var1);

	void exitProc_block(Proc_blockContext var1);

	void enterStmt(StmtContext var1);

	void exitStmt(StmtContext var1);

	void enterSemicolon_stmt(Semicolon_stmtContext var1);

	void exitSemicolon_stmt(Semicolon_stmtContext var1);

	void enterException_block(Exception_blockContext var1);

	void exitException_block(Exception_blockContext var1);

	void enterException_block_item(Exception_block_itemContext var1);

	void exitException_block_item(Exception_block_itemContext var1);

	void enterNull_stmt(Null_stmtContext var1);

	void exitNull_stmt(Null_stmtContext var1);

	void enterExpr_stmt(Expr_stmtContext var1);

	void exitExpr_stmt(Expr_stmtContext var1);

	void enterAssignment_stmt(Assignment_stmtContext var1);

	void exitAssignment_stmt(Assignment_stmtContext var1);

	void enterAssignment_stmt_item(Assignment_stmt_itemContext var1);

	void exitAssignment_stmt_item(Assignment_stmt_itemContext var1);

	void enterAssignment_stmt_single_item(Assignment_stmt_single_itemContext var1);

	void exitAssignment_stmt_single_item(Assignment_stmt_single_itemContext var1);

	void enterAssignment_stmt_multiple_item(Assignment_stmt_multiple_itemContext var1);

	void exitAssignment_stmt_multiple_item(Assignment_stmt_multiple_itemContext var1);

	void enterAssignment_stmt_select_item(Assignment_stmt_select_itemContext var1);

	void exitAssignment_stmt_select_item(Assignment_stmt_select_itemContext var1);

	void enterAllocate_cursor_stmt(Allocate_cursor_stmtContext var1);

	void exitAllocate_cursor_stmt(Allocate_cursor_stmtContext var1);

	void enterAssociate_locator_stmt(Associate_locator_stmtContext var1);

	void exitAssociate_locator_stmt(Associate_locator_stmtContext var1);

	void enterBegin_transaction_stmt(Begin_transaction_stmtContext var1);

	void exitBegin_transaction_stmt(Begin_transaction_stmtContext var1);

	void enterBreak_stmt(Break_stmtContext var1);

	void exitBreak_stmt(Break_stmtContext var1);

	void enterCall_stmt(Call_stmtContext var1);

	void exitCall_stmt(Call_stmtContext var1);

	void enterDeclare_stmt(Declare_stmtContext var1);

	void exitDeclare_stmt(Declare_stmtContext var1);

	void enterDeclare_block(Declare_blockContext var1);

	void exitDeclare_block(Declare_blockContext var1);

	void enterDeclare_block_inplace(Declare_block_inplaceContext var1);

	void exitDeclare_block_inplace(Declare_block_inplaceContext var1);

	void enterDeclare_stmt_item(Declare_stmt_itemContext var1);

	void exitDeclare_stmt_item(Declare_stmt_itemContext var1);

	void enterDeclare_var_item(Declare_var_itemContext var1);

	void exitDeclare_var_item(Declare_var_itemContext var1);

	void enterDeclare_condition_item(Declare_condition_itemContext var1);

	void exitDeclare_condition_item(Declare_condition_itemContext var1);

	void enterDeclare_cursor_item(Declare_cursor_itemContext var1);

	void exitDeclare_cursor_item(Declare_cursor_itemContext var1);

	void enterCursor_with_return(Cursor_with_returnContext var1);

	void exitCursor_with_return(Cursor_with_returnContext var1);

	void enterCursor_without_return(Cursor_without_returnContext var1);

	void exitCursor_without_return(Cursor_without_returnContext var1);

	void enterDeclare_handler_item(Declare_handler_itemContext var1);

	void exitDeclare_handler_item(Declare_handler_itemContext var1);

	void enterDeclare_temporary_table_item(Declare_temporary_table_itemContext var1);

	void exitDeclare_temporary_table_item(Declare_temporary_table_itemContext var1);

	void enterCreate_table_stmt(Create_table_stmtContext var1);

	void exitCreate_table_stmt(Create_table_stmtContext var1);

	void enterCreate_local_temp_table_stmt(Create_local_temp_table_stmtContext var1);

	void exitCreate_local_temp_table_stmt(Create_local_temp_table_stmtContext var1);

	void enterCreate_table_columns(Create_table_columnsContext var1);

	void exitCreate_table_columns(Create_table_columnsContext var1);

	void enterCreate_table_columns_item(Create_table_columns_itemContext var1);

	void exitCreate_table_columns_item(Create_table_columns_itemContext var1);

	void enterColumn_name(Column_nameContext var1);

	void exitColumn_name(Column_nameContext var1);

	void enterCreate_table_column_inline_cons(Create_table_column_inline_consContext var1);

	void exitCreate_table_column_inline_cons(Create_table_column_inline_consContext var1);

	void enterCreate_table_column_cons(Create_table_column_consContext var1);

	void exitCreate_table_column_cons(Create_table_column_consContext var1);

	void enterCreate_table_fk_action(Create_table_fk_actionContext var1);

	void exitCreate_table_fk_action(Create_table_fk_actionContext var1);

	void enterCreate_table_preoptions(Create_table_preoptionsContext var1);

	void exitCreate_table_preoptions(Create_table_preoptionsContext var1);

	void enterCreate_table_preoptions_item(Create_table_preoptions_itemContext var1);

	void exitCreate_table_preoptions_item(Create_table_preoptions_itemContext var1);

	void enterCreate_table_options(Create_table_optionsContext var1);

	void exitCreate_table_options(Create_table_optionsContext var1);

	void enterCreate_table_options_item(Create_table_options_itemContext var1);

	void exitCreate_table_options_item(Create_table_options_itemContext var1);

	void enterCreate_table_options_ora_item(Create_table_options_ora_itemContext var1);

	void exitCreate_table_options_ora_item(Create_table_options_ora_itemContext var1);

	void enterCreate_table_options_db2_item(Create_table_options_db2_itemContext var1);

	void exitCreate_table_options_db2_item(Create_table_options_db2_itemContext var1);

	void enterCreate_table_options_hive_item(Create_table_options_hive_itemContext var1);

	void exitCreate_table_options_hive_item(Create_table_options_hive_itemContext var1);

	void enterCreate_table_hive_row_format(Create_table_hive_row_formatContext var1);

	void exitCreate_table_hive_row_format(Create_table_hive_row_formatContext var1);

	void enterCreate_table_hive_row_format_fields(Create_table_hive_row_format_fieldsContext var1);

	void exitCreate_table_hive_row_format_fields(Create_table_hive_row_format_fieldsContext var1);

	void enterCreate_table_options_mssql_item(Create_table_options_mssql_itemContext var1);

	void exitCreate_table_options_mssql_item(Create_table_options_mssql_itemContext var1);

	void enterCreate_table_options_mysql_item(Create_table_options_mysql_itemContext var1);

	void exitCreate_table_options_mysql_item(Create_table_options_mysql_itemContext var1);

	void enterAlter_table_stmt(Alter_table_stmtContext var1);

	void exitAlter_table_stmt(Alter_table_stmtContext var1);

	void enterAlter_table_item(Alter_table_itemContext var1);

	void exitAlter_table_item(Alter_table_itemContext var1);

	void enterAlter_table_add_constraint(Alter_table_add_constraintContext var1);

	void exitAlter_table_add_constraint(Alter_table_add_constraintContext var1);

	void enterAlter_table_add_constraint_item(Alter_table_add_constraint_itemContext var1);

	void exitAlter_table_add_constraint_item(Alter_table_add_constraint_itemContext var1);

	void enterDtype(DtypeContext var1);

	void exitDtype(DtypeContext var1);

	void enterDtype_len(Dtype_lenContext var1);

	void exitDtype_len(Dtype_lenContext var1);

	void enterDtype_attr(Dtype_attrContext var1);

	void exitDtype_attr(Dtype_attrContext var1);

	void enterDtype_default(Dtype_defaultContext var1);

	void exitDtype_default(Dtype_defaultContext var1);

	void enterCreate_database_stmt(Create_database_stmtContext var1);

	void exitCreate_database_stmt(Create_database_stmtContext var1);

	void enterCreate_database_option(Create_database_optionContext var1);

	void exitCreate_database_option(Create_database_optionContext var1);

	void enterCreate_function_stmt(Create_function_stmtContext var1);

	void exitCreate_function_stmt(Create_function_stmtContext var1);

	void enterCreate_function_return(Create_function_returnContext var1);

	void exitCreate_function_return(Create_function_returnContext var1);

	void enterCreate_package_stmt(Create_package_stmtContext var1);

	void exitCreate_package_stmt(Create_package_stmtContext var1);

	void enterPackage_spec(Package_specContext var1);

	void exitPackage_spec(Package_specContext var1);

	void enterPackage_spec_item(Package_spec_itemContext var1);

	void exitPackage_spec_item(Package_spec_itemContext var1);

	void enterCreate_package_body_stmt(Create_package_body_stmtContext var1);

	void exitCreate_package_body_stmt(Create_package_body_stmtContext var1);

	void enterPackage_body(Package_bodyContext var1);

	void exitPackage_body(Package_bodyContext var1);

	void enterPackage_body_item(Package_body_itemContext var1);

	void exitPackage_body_item(Package_body_itemContext var1);

	void enterCreate_procedure_stmt(Create_procedure_stmtContext var1);

	void exitCreate_procedure_stmt(Create_procedure_stmtContext var1);

	void enterCreate_routine_params(Create_routine_paramsContext var1);

	void exitCreate_routine_params(Create_routine_paramsContext var1);

	void enterCreate_routine_param_item(Create_routine_param_itemContext var1);

	void exitCreate_routine_param_item(Create_routine_param_itemContext var1);

	void enterCreate_routine_options(Create_routine_optionsContext var1);

	void exitCreate_routine_options(Create_routine_optionsContext var1);

	void enterCreate_routine_option(Create_routine_optionContext var1);

	void exitCreate_routine_option(Create_routine_optionContext var1);

	void enterDrop_stmt(Drop_stmtContext var1);

	void exitDrop_stmt(Drop_stmtContext var1);

	void enterEnd_transaction_stmt(End_transaction_stmtContext var1);

	void exitEnd_transaction_stmt(End_transaction_stmtContext var1);

	void enterExec_stmt(Exec_stmtContext var1);

	void exitExec_stmt(Exec_stmtContext var1);

	void enterIf_stmt(If_stmtContext var1);

	void exitIf_stmt(If_stmtContext var1);

	void enterIf_plsql_stmt(If_plsql_stmtContext var1);

	void exitIf_plsql_stmt(If_plsql_stmtContext var1);

	void enterIf_tsql_stmt(If_tsql_stmtContext var1);

	void exitIf_tsql_stmt(If_tsql_stmtContext var1);

	void enterElseif_block(Elseif_blockContext var1);

	void exitElseif_block(Elseif_blockContext var1);

	void enterElse_block(Else_blockContext var1);

	void exitElse_block(Else_blockContext var1);

	void enterInclude_stmt(Include_stmtContext var1);

	void exitInclude_stmt(Include_stmtContext var1);

	void enterInsert_stmt(Insert_stmtContext var1);

	void exitInsert_stmt(Insert_stmtContext var1);

	void enterInsert_stmt_cols(Insert_stmt_colsContext var1);

	void exitInsert_stmt_cols(Insert_stmt_colsContext var1);

	void enterInsert_stmt_rows(Insert_stmt_rowsContext var1);

	void exitInsert_stmt_rows(Insert_stmt_rowsContext var1);

	void enterInsert_stmt_row(Insert_stmt_rowContext var1);

	void exitInsert_stmt_row(Insert_stmt_rowContext var1);

	void enterInsert_directory_stmt(Insert_directory_stmtContext var1);

	void exitInsert_directory_stmt(Insert_directory_stmtContext var1);

	void enterExit_stmt(Exit_stmtContext var1);

	void exitExit_stmt(Exit_stmtContext var1);

	void enterGet_diag_stmt(Get_diag_stmtContext var1);

	void exitGet_diag_stmt(Get_diag_stmtContext var1);

	void enterGet_diag_stmt_item(Get_diag_stmt_itemContext var1);

	void exitGet_diag_stmt_item(Get_diag_stmt_itemContext var1);

	void enterGet_diag_stmt_exception_item(Get_diag_stmt_exception_itemContext var1);

	void exitGet_diag_stmt_exception_item(Get_diag_stmt_exception_itemContext var1);

	void enterGet_diag_stmt_rowcount_item(Get_diag_stmt_rowcount_itemContext var1);

	void exitGet_diag_stmt_rowcount_item(Get_diag_stmt_rowcount_itemContext var1);

	void enterGrant_stmt(Grant_stmtContext var1);

	void exitGrant_stmt(Grant_stmtContext var1);

	void enterGrant_stmt_item(Grant_stmt_itemContext var1);

	void exitGrant_stmt_item(Grant_stmt_itemContext var1);

	void enterLeave_stmt(Leave_stmtContext var1);

	void exitLeave_stmt(Leave_stmtContext var1);

	void enterMap_object_stmt(Map_object_stmtContext var1);

	void exitMap_object_stmt(Map_object_stmtContext var1);

	void enterOpen_stmt(Open_stmtContext var1);

	void exitOpen_stmt(Open_stmtContext var1);

	void enterFetch_stmt(Fetch_stmtContext var1);

	void exitFetch_stmt(Fetch_stmtContext var1);

	void enterClose_stmt(Close_stmtContext var1);

	void exitClose_stmt(Close_stmtContext var1);

	void enterCmp_stmt(Cmp_stmtContext var1);

	void exitCmp_stmt(Cmp_stmtContext var1);

	void enterCmp_source(Cmp_sourceContext var1);

	void exitCmp_source(Cmp_sourceContext var1);

	void enterCopy_from_ftp_stmt(Copy_from_ftp_stmtContext var1);

	void exitCopy_from_ftp_stmt(Copy_from_ftp_stmtContext var1);

	void enterCopy_from_local_stmt(Copy_from_local_stmtContext var1);

	void exitCopy_from_local_stmt(Copy_from_local_stmtContext var1);

	void enterCopy_stmt(Copy_stmtContext var1);

	void exitCopy_stmt(Copy_stmtContext var1);

	void enterCopy_source(Copy_sourceContext var1);

	void exitCopy_source(Copy_sourceContext var1);

	void enterCopy_target(Copy_targetContext var1);

	void exitCopy_target(Copy_targetContext var1);

	void enterCopy_option(Copy_optionContext var1);

	void exitCopy_option(Copy_optionContext var1);

	void enterCopy_file_option(Copy_file_optionContext var1);

	void exitCopy_file_option(Copy_file_optionContext var1);

	void enterCopy_ftp_option(Copy_ftp_optionContext var1);

	void exitCopy_ftp_option(Copy_ftp_optionContext var1);

	void enterCommit_stmt(Commit_stmtContext var1);

	void exitCommit_stmt(Commit_stmtContext var1);

	void enterCreate_index_stmt(Create_index_stmtContext var1);

	void exitCreate_index_stmt(Create_index_stmtContext var1);

	void enterCreate_index_col(Create_index_colContext var1);

	void exitCreate_index_col(Create_index_colContext var1);

	void enterIndex_storage_clause(Index_storage_clauseContext var1);

	void exitIndex_storage_clause(Index_storage_clauseContext var1);

	void enterIndex_mssql_storage_clause(Index_mssql_storage_clauseContext var1);

	void exitIndex_mssql_storage_clause(Index_mssql_storage_clauseContext var1);

	void enterPrint_stmt(Print_stmtContext var1);

	void exitPrint_stmt(Print_stmtContext var1);

	void enterRaise_stmt(Raise_stmtContext var1);

	void exitRaise_stmt(Raise_stmtContext var1);

	void enterResignal_stmt(Resignal_stmtContext var1);

	void exitResignal_stmt(Resignal_stmtContext var1);

	void enterReturn_stmt(Return_stmtContext var1);

	void exitReturn_stmt(Return_stmtContext var1);

	void enterRollback_stmt(Rollback_stmtContext var1);

	void exitRollback_stmt(Rollback_stmtContext var1);

	void enterSet_session_option(Set_session_optionContext var1);

	void exitSet_session_option(Set_session_optionContext var1);

	void enterSet_current_schema_option(Set_current_schema_optionContext var1);

	void exitSet_current_schema_option(Set_current_schema_optionContext var1);

	void enterSet_mssql_session_option(Set_mssql_session_optionContext var1);

	void exitSet_mssql_session_option(Set_mssql_session_optionContext var1);

	void enterSet_teradata_session_option(Set_teradata_session_optionContext var1);

	void exitSet_teradata_session_option(Set_teradata_session_optionContext var1);

	void enterSignal_stmt(Signal_stmtContext var1);

	void exitSignal_stmt(Signal_stmtContext var1);

	void enterTruncate_stmt(Truncate_stmtContext var1);

	void exitTruncate_stmt(Truncate_stmtContext var1);

	void enterUse_stmt(Use_stmtContext var1);

	void exitUse_stmt(Use_stmtContext var1);

	void enterValues_into_stmt(Values_into_stmtContext var1);

	void exitValues_into_stmt(Values_into_stmtContext var1);

	void enterWhile_stmt(While_stmtContext var1);

	void exitWhile_stmt(While_stmtContext var1);

	void enterFor_cursor_stmt(For_cursor_stmtContext var1);

	void exitFor_cursor_stmt(For_cursor_stmtContext var1);

	void enterFor_range_stmt(For_range_stmtContext var1);

	void exitFor_range_stmt(For_range_stmtContext var1);

	void enterLabel(LabelContext var1);

	void exitLabel(LabelContext var1);

	void enterUsing_clause(Using_clauseContext var1);

	void exitUsing_clause(Using_clauseContext var1);

	void enterSelect_stmt(Select_stmtContext var1);

	void exitSelect_stmt(Select_stmtContext var1);

	void enterCte_select_stmt(Cte_select_stmtContext var1);

	void exitCte_select_stmt(Cte_select_stmtContext var1);

	void enterCte_select_stmt_item(Cte_select_stmt_itemContext var1);

	void exitCte_select_stmt_item(Cte_select_stmt_itemContext var1);

	void enterCte_select_cols(Cte_select_colsContext var1);

	void exitCte_select_cols(Cte_select_colsContext var1);

	void enterFullselect_stmt(Fullselect_stmtContext var1);

	void exitFullselect_stmt(Fullselect_stmtContext var1);

	void enterFullselect_stmt_item(Fullselect_stmt_itemContext var1);

	void exitFullselect_stmt_item(Fullselect_stmt_itemContext var1);

	void enterFullselect_set_clause(Fullselect_set_clauseContext var1);

	void exitFullselect_set_clause(Fullselect_set_clauseContext var1);

	void enterSubselect_stmt(Subselect_stmtContext var1);

	void exitSubselect_stmt(Subselect_stmtContext var1);

	void enterSelect_list(Select_listContext var1);

	void exitSelect_list(Select_listContext var1);

	void enterSelect_list_set(Select_list_setContext var1);

	void exitSelect_list_set(Select_list_setContext var1);

	void enterSelect_list_limit(Select_list_limitContext var1);

	void exitSelect_list_limit(Select_list_limitContext var1);

	void enterSelect_list_item(Select_list_itemContext var1);

	void exitSelect_list_item(Select_list_itemContext var1);

	void enterSelect_list_alias(Select_list_aliasContext var1);

	void exitSelect_list_alias(Select_list_aliasContext var1);

	void enterSelect_list_asterisk(Select_list_asteriskContext var1);

	void exitSelect_list_asterisk(Select_list_asteriskContext var1);

	void enterInto_clause(Into_clauseContext var1);

	void exitInto_clause(Into_clauseContext var1);

	void enterFrom_clause(From_clauseContext var1);

	void exitFrom_clause(From_clauseContext var1);

	void enterFrom_table_clause(From_table_clauseContext var1);

	void exitFrom_table_clause(From_table_clauseContext var1);

	void enterFrom_table_name_clause(From_table_name_clauseContext var1);

	void exitFrom_table_name_clause(From_table_name_clauseContext var1);

	void enterFrom_subselect_clause(From_subselect_clauseContext var1);

	void exitFrom_subselect_clause(From_subselect_clauseContext var1);

	void enterFrom_join_clause(From_join_clauseContext var1);

	void exitFrom_join_clause(From_join_clauseContext var1);

	void enterFrom_join_type_clause(From_join_type_clauseContext var1);

	void exitFrom_join_type_clause(From_join_type_clauseContext var1);

	void enterFrom_table_values_clause(From_table_values_clauseContext var1);

	void exitFrom_table_values_clause(From_table_values_clauseContext var1);

	void enterFrom_table_values_row(From_table_values_rowContext var1);

	void exitFrom_table_values_row(From_table_values_rowContext var1);

	void enterFrom_alias_clause(From_alias_clauseContext var1);

	void exitFrom_alias_clause(From_alias_clauseContext var1);

	void enterTable_name(Table_nameContext var1);

	void exitTable_name(Table_nameContext var1);

	void enterWhere_clause(Where_clauseContext var1);

	void exitWhere_clause(Where_clauseContext var1);

	void enterGroup_by_clause(Group_by_clauseContext var1);

	void exitGroup_by_clause(Group_by_clauseContext var1);

	void enterHaving_clause(Having_clauseContext var1);

	void exitHaving_clause(Having_clauseContext var1);

	void enterOrder_by_clause(Order_by_clauseContext var1);

	void exitOrder_by_clause(Order_by_clauseContext var1);

	void enterSelect_options(Select_optionsContext var1);

	void exitSelect_options(Select_optionsContext var1);

	void enterSelect_options_item(Select_options_itemContext var1);

	void exitSelect_options_item(Select_options_itemContext var1);

	void enterUpdate_stmt(Update_stmtContext var1);

	void exitUpdate_stmt(Update_stmtContext var1);

	void enterUpdate_assignment(Update_assignmentContext var1);

	void exitUpdate_assignment(Update_assignmentContext var1);

	void enterUpdate_table(Update_tableContext var1);

	void exitUpdate_table(Update_tableContext var1);

	void enterUpdate_upsert(Update_upsertContext var1);

	void exitUpdate_upsert(Update_upsertContext var1);

	void enterMerge_stmt(Merge_stmtContext var1);

	void exitMerge_stmt(Merge_stmtContext var1);

	void enterMerge_table(Merge_tableContext var1);

	void exitMerge_table(Merge_tableContext var1);

	void enterMerge_condition(Merge_conditionContext var1);

	void exitMerge_condition(Merge_conditionContext var1);

	void enterMerge_action(Merge_actionContext var1);

	void exitMerge_action(Merge_actionContext var1);

	void enterDelete_stmt(Delete_stmtContext var1);

	void exitDelete_stmt(Delete_stmtContext var1);

	void enterDescribe_stmt(Describe_stmtContext var1);

	void exitDescribe_stmt(Describe_stmtContext var1);

	void enterBool_expr(Bool_exprContext var1);

	void exitBool_expr(Bool_exprContext var1);

	void enterBool_expr_atom(Bool_expr_atomContext var1);

	void exitBool_expr_atom(Bool_expr_atomContext var1);

	void enterBool_expr_unary(Bool_expr_unaryContext var1);

	void exitBool_expr_unary(Bool_expr_unaryContext var1);

	void enterBool_expr_single_in(Bool_expr_single_inContext var1);

	void exitBool_expr_single_in(Bool_expr_single_inContext var1);

	void enterBool_expr_multi_in(Bool_expr_multi_inContext var1);

	void exitBool_expr_multi_in(Bool_expr_multi_inContext var1);

	void enterBool_expr_binary(Bool_expr_binaryContext var1);

	void exitBool_expr_binary(Bool_expr_binaryContext var1);

	void enterBool_expr_logical_operator(Bool_expr_logical_operatorContext var1);

	void exitBool_expr_logical_operator(Bool_expr_logical_operatorContext var1);

	void enterBool_expr_binary_operator(Bool_expr_binary_operatorContext var1);

	void exitBool_expr_binary_operator(Bool_expr_binary_operatorContext var1);

	void enterExpr(ExprContext var1);

	void exitExpr(ExprContext var1);

	void enterExpr_atom(Expr_atomContext var1);

	void exitExpr_atom(Expr_atomContext var1);

	void enterExpr_interval(Expr_intervalContext var1);

	void exitExpr_interval(Expr_intervalContext var1);

	void enterInterval_item(Interval_itemContext var1);

	void exitInterval_item(Interval_itemContext var1);

	void enterExpr_concat(Expr_concatContext var1);

	void exitExpr_concat(Expr_concatContext var1);

	void enterExpr_concat_item(Expr_concat_itemContext var1);

	void exitExpr_concat_item(Expr_concat_itemContext var1);

	void enterExpr_case(Expr_caseContext var1);

	void exitExpr_case(Expr_caseContext var1);

	void enterExpr_case_simple(Expr_case_simpleContext var1);

	void exitExpr_case_simple(Expr_case_simpleContext var1);

	void enterExpr_case_searched(Expr_case_searchedContext var1);

	void exitExpr_case_searched(Expr_case_searchedContext var1);

	void enterExpr_cursor_attribute(Expr_cursor_attributeContext var1);

	void exitExpr_cursor_attribute(Expr_cursor_attributeContext var1);

	void enterExpr_agg_window_func(Expr_agg_window_funcContext var1);

	void exitExpr_agg_window_func(Expr_agg_window_funcContext var1);

	void enterExpr_func_all_distinct(Expr_func_all_distinctContext var1);

	void exitExpr_func_all_distinct(Expr_func_all_distinctContext var1);

	void enterExpr_func_over_clause(Expr_func_over_clauseContext var1);

	void exitExpr_func_over_clause(Expr_func_over_clauseContext var1);

	void enterExpr_func_partition_by_clause(Expr_func_partition_by_clauseContext var1);

	void exitExpr_func_partition_by_clause(Expr_func_partition_by_clauseContext var1);

	void enterExpr_spec_func(Expr_spec_funcContext var1);

	void exitExpr_spec_func(Expr_spec_funcContext var1);

	void enterExpr_func(Expr_funcContext var1);

	void exitExpr_func(Expr_funcContext var1);

	void enterExpr_func_params(Expr_func_paramsContext var1);

	void exitExpr_func_params(Expr_func_paramsContext var1);

	void enterFunc_param(Func_paramContext var1);

	void exitFunc_param(Func_paramContext var1);

	void enterExpr_select(Expr_selectContext var1);

	void exitExpr_select(Expr_selectContext var1);

	void enterExpr_file(Expr_fileContext var1);

	void exitExpr_file(Expr_fileContext var1);

	void enterHive(HiveContext var1);

	void exitHive(HiveContext var1);

	void enterHive_item(Hive_itemContext var1);

	void exitHive_item(Hive_itemContext var1);

	void enterHost(HostContext var1);

	void exitHost(HostContext var1);

	void enterHost_cmd(Host_cmdContext var1);

	void exitHost_cmd(Host_cmdContext var1);

	void enterHost_stmt(Host_stmtContext var1);

	void exitHost_stmt(Host_stmtContext var1);

	void enterFile_name(File_nameContext var1);

	void exitFile_name(File_nameContext var1);

	void enterDate_literal(Date_literalContext var1);

	void exitDate_literal(Date_literalContext var1);

	void enterTimestamp_literal(Timestamp_literalContext var1);

	void exitTimestamp_literal(Timestamp_literalContext var1);

	void enterIdent(IdentContext var1);

	void exitIdent(IdentContext var1);

	void enterSingle_quotedString(Single_quotedStringContext var1);

	void exitSingle_quotedString(Single_quotedStringContext var1);

	void enterDouble_quotedString(Double_quotedStringContext var1);

	void exitDouble_quotedString(Double_quotedStringContext var1);

	void enterInt_number(Int_numberContext var1);

	void exitInt_number(Int_numberContext var1);

	void enterDec_number(Dec_numberContext var1);

	void exitDec_number(Dec_numberContext var1);

	void enterBool_literal(Bool_literalContext var1);

	void exitBool_literal(Bool_literalContext var1);

	void enterNull_const(Null_constContext var1);

	void exitNull_const(Null_constContext var1);

	void enterNon_reserved_words(Non_reserved_wordsContext var1);

	void exitNon_reserved_words(Non_reserved_wordsContext var1);
}
