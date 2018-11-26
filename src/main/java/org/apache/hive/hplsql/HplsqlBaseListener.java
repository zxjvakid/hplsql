//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.apache.hive.hplsql;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
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

public class HplsqlBaseListener implements HplsqlListener {
	public HplsqlBaseListener() {
	}

	public void enterProgram(ProgramContext ctx) {
	}

	public void exitProgram(ProgramContext ctx) {
	}

	public void enterBlock(BlockContext ctx) {
	}

	public void exitBlock(BlockContext ctx) {
	}

	public void enterBegin_end_block(Begin_end_blockContext ctx) {
	}

	public void exitBegin_end_block(Begin_end_blockContext ctx) {
	}

	public void enterSingle_block_stmt(Single_block_stmtContext ctx) {
	}

	public void exitSingle_block_stmt(Single_block_stmtContext ctx) {
	}

	public void enterBlock_end(Block_endContext ctx) {
	}

	public void exitBlock_end(Block_endContext ctx) {
	}

	public void enterProc_block(Proc_blockContext ctx) {
	}

	public void exitProc_block(Proc_blockContext ctx) {
	}

	public void enterStmt(StmtContext ctx) {
	}

	public void exitStmt(StmtContext ctx) {
	}

	public void enterSemicolon_stmt(Semicolon_stmtContext ctx) {
	}

	public void exitSemicolon_stmt(Semicolon_stmtContext ctx) {
	}

	public void enterException_block(Exception_blockContext ctx) {
	}

	public void exitException_block(Exception_blockContext ctx) {
	}

	public void enterException_block_item(Exception_block_itemContext ctx) {
	}

	public void exitException_block_item(Exception_block_itemContext ctx) {
	}

	public void enterNull_stmt(Null_stmtContext ctx) {
	}

	public void exitNull_stmt(Null_stmtContext ctx) {
	}

	public void enterExpr_stmt(Expr_stmtContext ctx) {
	}

	public void exitExpr_stmt(Expr_stmtContext ctx) {
	}

	public void enterAssignment_stmt(Assignment_stmtContext ctx) {
	}

	public void exitAssignment_stmt(Assignment_stmtContext ctx) {
	}

	public void enterAssignment_stmt_item(Assignment_stmt_itemContext ctx) {
	}

	public void exitAssignment_stmt_item(Assignment_stmt_itemContext ctx) {
	}

	public void enterAssignment_stmt_single_item(Assignment_stmt_single_itemContext ctx) {
	}

	public void exitAssignment_stmt_single_item(Assignment_stmt_single_itemContext ctx) {
	}

	public void enterAssignment_stmt_multiple_item(Assignment_stmt_multiple_itemContext ctx) {
	}

	public void exitAssignment_stmt_multiple_item(Assignment_stmt_multiple_itemContext ctx) {
	}

	public void enterAssignment_stmt_select_item(Assignment_stmt_select_itemContext ctx) {
	}

	public void exitAssignment_stmt_select_item(Assignment_stmt_select_itemContext ctx) {
	}

	public void enterAllocate_cursor_stmt(Allocate_cursor_stmtContext ctx) {
	}

	public void exitAllocate_cursor_stmt(Allocate_cursor_stmtContext ctx) {
	}

	public void enterAssociate_locator_stmt(Associate_locator_stmtContext ctx) {
	}

	public void exitAssociate_locator_stmt(Associate_locator_stmtContext ctx) {
	}

	public void enterBegin_transaction_stmt(Begin_transaction_stmtContext ctx) {
	}

	public void exitBegin_transaction_stmt(Begin_transaction_stmtContext ctx) {
	}

	public void enterBreak_stmt(Break_stmtContext ctx) {
	}

	public void exitBreak_stmt(Break_stmtContext ctx) {
	}

	public void enterCall_stmt(Call_stmtContext ctx) {
	}

	public void exitCall_stmt(Call_stmtContext ctx) {
	}

	public void enterDeclare_stmt(Declare_stmtContext ctx) {
	}

	public void exitDeclare_stmt(Declare_stmtContext ctx) {
	}

	public void enterDeclare_block(Declare_blockContext ctx) {
	}

	public void exitDeclare_block(Declare_blockContext ctx) {
	}

	public void enterDeclare_block_inplace(Declare_block_inplaceContext ctx) {
	}

	public void exitDeclare_block_inplace(Declare_block_inplaceContext ctx) {
	}

	public void enterDeclare_stmt_item(Declare_stmt_itemContext ctx) {
	}

	public void exitDeclare_stmt_item(Declare_stmt_itemContext ctx) {
	}

	public void enterDeclare_var_item(Declare_var_itemContext ctx) {
	}

	public void exitDeclare_var_item(Declare_var_itemContext ctx) {
	}

	public void enterDeclare_condition_item(Declare_condition_itemContext ctx) {
	}

	public void exitDeclare_condition_item(Declare_condition_itemContext ctx) {
	}

	public void enterDeclare_cursor_item(Declare_cursor_itemContext ctx) {
	}

	public void exitDeclare_cursor_item(Declare_cursor_itemContext ctx) {
	}

	public void enterCursor_with_return(Cursor_with_returnContext ctx) {
	}

	public void exitCursor_with_return(Cursor_with_returnContext ctx) {
	}

	public void enterCursor_without_return(Cursor_without_returnContext ctx) {
	}

	public void exitCursor_without_return(Cursor_without_returnContext ctx) {
	}

	public void enterDeclare_handler_item(Declare_handler_itemContext ctx) {
	}

	public void exitDeclare_handler_item(Declare_handler_itemContext ctx) {
	}

	public void enterDeclare_temporary_table_item(Declare_temporary_table_itemContext ctx) {
	}

	public void exitDeclare_temporary_table_item(Declare_temporary_table_itemContext ctx) {
	}

	public void enterCreate_table_stmt(Create_table_stmtContext ctx) {
	}

	public void exitCreate_table_stmt(Create_table_stmtContext ctx) {
	}

	public void enterCreate_local_temp_table_stmt(Create_local_temp_table_stmtContext ctx) {
	}

	public void exitCreate_local_temp_table_stmt(Create_local_temp_table_stmtContext ctx) {
	}

	public void enterCreate_table_columns(Create_table_columnsContext ctx) {
	}

	public void exitCreate_table_columns(Create_table_columnsContext ctx) {
	}

	public void enterCreate_table_columns_item(Create_table_columns_itemContext ctx) {
	}

	public void exitCreate_table_columns_item(Create_table_columns_itemContext ctx) {
	}

	public void enterColumn_name(Column_nameContext ctx) {
	}

	public void exitColumn_name(Column_nameContext ctx) {
	}

	public void enterCreate_table_column_inline_cons(Create_table_column_inline_consContext ctx) {
	}

	public void exitCreate_table_column_inline_cons(Create_table_column_inline_consContext ctx) {
	}

	public void enterCreate_table_column_cons(Create_table_column_consContext ctx) {
	}

	public void exitCreate_table_column_cons(Create_table_column_consContext ctx) {
	}

	public void enterCreate_table_fk_action(Create_table_fk_actionContext ctx) {
	}

	public void exitCreate_table_fk_action(Create_table_fk_actionContext ctx) {
	}

	public void enterCreate_table_preoptions(Create_table_preoptionsContext ctx) {
	}

	public void exitCreate_table_preoptions(Create_table_preoptionsContext ctx) {
	}

	public void enterCreate_table_preoptions_item(Create_table_preoptions_itemContext ctx) {
	}

	public void exitCreate_table_preoptions_item(Create_table_preoptions_itemContext ctx) {
	}

	public void enterCreate_table_options(Create_table_optionsContext ctx) {
	}

	public void exitCreate_table_options(Create_table_optionsContext ctx) {
	}

	public void enterCreate_table_options_item(Create_table_options_itemContext ctx) {
	}

	public void exitCreate_table_options_item(Create_table_options_itemContext ctx) {
	}

	public void enterCreate_table_options_ora_item(Create_table_options_ora_itemContext ctx) {
	}

	public void exitCreate_table_options_ora_item(Create_table_options_ora_itemContext ctx) {
	}

	public void enterCreate_table_options_db2_item(Create_table_options_db2_itemContext ctx) {
	}

	public void exitCreate_table_options_db2_item(Create_table_options_db2_itemContext ctx) {
	}

	public void enterCreate_table_options_hive_item(Create_table_options_hive_itemContext ctx) {
	}

	public void exitCreate_table_options_hive_item(Create_table_options_hive_itemContext ctx) {
	}

	public void enterCreate_table_hive_row_format(Create_table_hive_row_formatContext ctx) {
	}

	public void exitCreate_table_hive_row_format(Create_table_hive_row_formatContext ctx) {
	}

	public void enterCreate_table_hive_row_format_fields(Create_table_hive_row_format_fieldsContext ctx) {
	}

	public void exitCreate_table_hive_row_format_fields(Create_table_hive_row_format_fieldsContext ctx) {
	}

	public void enterCreate_table_options_mssql_item(Create_table_options_mssql_itemContext ctx) {
	}

	public void exitCreate_table_options_mssql_item(Create_table_options_mssql_itemContext ctx) {
	}

	public void enterCreate_table_options_mysql_item(Create_table_options_mysql_itemContext ctx) {
	}

	public void exitCreate_table_options_mysql_item(Create_table_options_mysql_itemContext ctx) {
	}

	public void enterAlter_table_stmt(Alter_table_stmtContext ctx) {
	}

	public void exitAlter_table_stmt(Alter_table_stmtContext ctx) {
	}

	public void enterAlter_table_item(Alter_table_itemContext ctx) {
	}

	public void exitAlter_table_item(Alter_table_itemContext ctx) {
	}

	public void enterAlter_table_add_constraint(Alter_table_add_constraintContext ctx) {
	}

	public void exitAlter_table_add_constraint(Alter_table_add_constraintContext ctx) {
	}

	public void enterAlter_table_add_constraint_item(Alter_table_add_constraint_itemContext ctx) {
	}

	public void exitAlter_table_add_constraint_item(Alter_table_add_constraint_itemContext ctx) {
	}

	public void enterDtype(DtypeContext ctx) {
	}

	public void exitDtype(DtypeContext ctx) {
	}

	public void enterDtype_len(Dtype_lenContext ctx) {
	}

	public void exitDtype_len(Dtype_lenContext ctx) {
	}

	public void enterDtype_attr(Dtype_attrContext ctx) {
	}

	public void exitDtype_attr(Dtype_attrContext ctx) {
	}

	public void enterDtype_default(Dtype_defaultContext ctx) {
	}

	public void exitDtype_default(Dtype_defaultContext ctx) {
	}

	public void enterCreate_database_stmt(Create_database_stmtContext ctx) {
	}

	public void exitCreate_database_stmt(Create_database_stmtContext ctx) {
	}

	public void enterCreate_database_option(Create_database_optionContext ctx) {
	}

	public void exitCreate_database_option(Create_database_optionContext ctx) {
	}

	public void enterCreate_function_stmt(Create_function_stmtContext ctx) {
	}

	public void exitCreate_function_stmt(Create_function_stmtContext ctx) {
	}

	public void enterCreate_function_return(Create_function_returnContext ctx) {
	}

	public void exitCreate_function_return(Create_function_returnContext ctx) {
	}

	public void enterCreate_package_stmt(Create_package_stmtContext ctx) {
	}

	public void exitCreate_package_stmt(Create_package_stmtContext ctx) {
	}

	public void enterPackage_spec(Package_specContext ctx) {
	}

	public void exitPackage_spec(Package_specContext ctx) {
	}

	public void enterPackage_spec_item(Package_spec_itemContext ctx) {
	}

	public void exitPackage_spec_item(Package_spec_itemContext ctx) {
	}

	public void enterCreate_package_body_stmt(Create_package_body_stmtContext ctx) {
	}

	public void exitCreate_package_body_stmt(Create_package_body_stmtContext ctx) {
	}

	public void enterPackage_body(Package_bodyContext ctx) {
	}

	public void exitPackage_body(Package_bodyContext ctx) {
	}

	public void enterPackage_body_item(Package_body_itemContext ctx) {
	}

	public void exitPackage_body_item(Package_body_itemContext ctx) {
	}

	public void enterCreate_procedure_stmt(Create_procedure_stmtContext ctx) {
	}

	public void exitCreate_procedure_stmt(Create_procedure_stmtContext ctx) {
	}

	public void enterCreate_routine_params(Create_routine_paramsContext ctx) {
	}

	public void exitCreate_routine_params(Create_routine_paramsContext ctx) {
	}

	public void enterCreate_routine_param_item(Create_routine_param_itemContext ctx) {
	}

	public void exitCreate_routine_param_item(Create_routine_param_itemContext ctx) {
	}

	public void enterCreate_routine_options(Create_routine_optionsContext ctx) {
	}

	public void exitCreate_routine_options(Create_routine_optionsContext ctx) {
	}

	public void enterCreate_routine_option(Create_routine_optionContext ctx) {
	}

	public void exitCreate_routine_option(Create_routine_optionContext ctx) {
	}

	public void enterDrop_stmt(Drop_stmtContext ctx) {
	}

	public void exitDrop_stmt(Drop_stmtContext ctx) {
	}

	public void enterEnd_transaction_stmt(End_transaction_stmtContext ctx) {
	}

	public void exitEnd_transaction_stmt(End_transaction_stmtContext ctx) {
	}

	public void enterExec_stmt(Exec_stmtContext ctx) {
	}

	public void exitExec_stmt(Exec_stmtContext ctx) {
	}

	public void enterIf_stmt(If_stmtContext ctx) {
	}

	public void exitIf_stmt(If_stmtContext ctx) {
	}

	public void enterIf_plsql_stmt(If_plsql_stmtContext ctx) {
	}

	public void exitIf_plsql_stmt(If_plsql_stmtContext ctx) {
	}

	public void enterIf_tsql_stmt(If_tsql_stmtContext ctx) {
	}

	public void exitIf_tsql_stmt(If_tsql_stmtContext ctx) {
	}

	public void enterElseif_block(Elseif_blockContext ctx) {
	}

	public void exitElseif_block(Elseif_blockContext ctx) {
	}

	public void enterElse_block(Else_blockContext ctx) {
	}

	public void exitElse_block(Else_blockContext ctx) {
	}

	public void enterInclude_stmt(Include_stmtContext ctx) {
	}

	public void exitInclude_stmt(Include_stmtContext ctx) {
	}

	public void enterInsert_stmt(Insert_stmtContext ctx) {
	}

	public void exitInsert_stmt(Insert_stmtContext ctx) {
	}

	public void enterInsert_stmt_cols(Insert_stmt_colsContext ctx) {
	}

	public void exitInsert_stmt_cols(Insert_stmt_colsContext ctx) {
	}

	public void enterInsert_stmt_rows(Insert_stmt_rowsContext ctx) {
	}

	public void exitInsert_stmt_rows(Insert_stmt_rowsContext ctx) {
	}

	public void enterInsert_stmt_row(Insert_stmt_rowContext ctx) {
	}

	public void exitInsert_stmt_row(Insert_stmt_rowContext ctx) {
	}

	public void enterInsert_directory_stmt(Insert_directory_stmtContext ctx) {
	}

	public void exitInsert_directory_stmt(Insert_directory_stmtContext ctx) {
	}

	public void enterExit_stmt(Exit_stmtContext ctx) {
	}

	public void exitExit_stmt(Exit_stmtContext ctx) {
	}

	public void enterGet_diag_stmt(Get_diag_stmtContext ctx) {
	}

	public void exitGet_diag_stmt(Get_diag_stmtContext ctx) {
	}

	public void enterGet_diag_stmt_item(Get_diag_stmt_itemContext ctx) {
	}

	public void exitGet_diag_stmt_item(Get_diag_stmt_itemContext ctx) {
	}

	public void enterGet_diag_stmt_exception_item(Get_diag_stmt_exception_itemContext ctx) {
	}

	public void exitGet_diag_stmt_exception_item(Get_diag_stmt_exception_itemContext ctx) {
	}

	public void enterGet_diag_stmt_rowcount_item(Get_diag_stmt_rowcount_itemContext ctx) {
	}

	public void exitGet_diag_stmt_rowcount_item(Get_diag_stmt_rowcount_itemContext ctx) {
	}

	public void enterGrant_stmt(Grant_stmtContext ctx) {
	}

	public void exitGrant_stmt(Grant_stmtContext ctx) {
	}

	public void enterGrant_stmt_item(Grant_stmt_itemContext ctx) {
	}

	public void exitGrant_stmt_item(Grant_stmt_itemContext ctx) {
	}

	public void enterLeave_stmt(Leave_stmtContext ctx) {
	}

	public void exitLeave_stmt(Leave_stmtContext ctx) {
	}

	public void enterMap_object_stmt(Map_object_stmtContext ctx) {
	}

	public void exitMap_object_stmt(Map_object_stmtContext ctx) {
	}

	public void enterOpen_stmt(Open_stmtContext ctx) {
	}

	public void exitOpen_stmt(Open_stmtContext ctx) {
	}

	public void enterFetch_stmt(Fetch_stmtContext ctx) {
	}

	public void exitFetch_stmt(Fetch_stmtContext ctx) {
	}

	public void enterClose_stmt(Close_stmtContext ctx) {
	}

	public void exitClose_stmt(Close_stmtContext ctx) {
	}

	public void enterCmp_stmt(Cmp_stmtContext ctx) {
	}

	public void exitCmp_stmt(Cmp_stmtContext ctx) {
	}

	public void enterCmp_source(Cmp_sourceContext ctx) {
	}

	public void exitCmp_source(Cmp_sourceContext ctx) {
	}

	public void enterCopy_from_ftp_stmt(Copy_from_ftp_stmtContext ctx) {
	}

	public void exitCopy_from_ftp_stmt(Copy_from_ftp_stmtContext ctx) {
	}

	public void enterCopy_from_local_stmt(Copy_from_local_stmtContext ctx) {
	}

	public void exitCopy_from_local_stmt(Copy_from_local_stmtContext ctx) {
	}

	public void enterCopy_stmt(Copy_stmtContext ctx) {
	}

	public void exitCopy_stmt(Copy_stmtContext ctx) {
	}

	public void enterCopy_source(Copy_sourceContext ctx) {
	}

	public void exitCopy_source(Copy_sourceContext ctx) {
	}

	public void enterCopy_target(Copy_targetContext ctx) {
	}

	public void exitCopy_target(Copy_targetContext ctx) {
	}

	public void enterCopy_option(Copy_optionContext ctx) {
	}

	public void exitCopy_option(Copy_optionContext ctx) {
	}

	public void enterCopy_file_option(Copy_file_optionContext ctx) {
	}

	public void exitCopy_file_option(Copy_file_optionContext ctx) {
	}

	public void enterCopy_ftp_option(Copy_ftp_optionContext ctx) {
	}

	public void exitCopy_ftp_option(Copy_ftp_optionContext ctx) {
	}

	public void enterCommit_stmt(Commit_stmtContext ctx) {
	}

	public void exitCommit_stmt(Commit_stmtContext ctx) {
	}

	public void enterCreate_index_stmt(Create_index_stmtContext ctx) {
	}

	public void exitCreate_index_stmt(Create_index_stmtContext ctx) {
	}

	public void enterCreate_index_col(Create_index_colContext ctx) {
	}

	public void exitCreate_index_col(Create_index_colContext ctx) {
	}

	public void enterIndex_storage_clause(Index_storage_clauseContext ctx) {
	}

	public void exitIndex_storage_clause(Index_storage_clauseContext ctx) {
	}

	public void enterIndex_mssql_storage_clause(Index_mssql_storage_clauseContext ctx) {
	}

	public void exitIndex_mssql_storage_clause(Index_mssql_storage_clauseContext ctx) {
	}

	public void enterPrint_stmt(Print_stmtContext ctx) {
	}

	public void exitPrint_stmt(Print_stmtContext ctx) {
	}

	public void enterRaise_stmt(Raise_stmtContext ctx) {
	}

	public void exitRaise_stmt(Raise_stmtContext ctx) {
	}

	public void enterResignal_stmt(Resignal_stmtContext ctx) {
	}

	public void exitResignal_stmt(Resignal_stmtContext ctx) {
	}

	public void enterReturn_stmt(Return_stmtContext ctx) {
	}

	public void exitReturn_stmt(Return_stmtContext ctx) {
	}

	public void enterRollback_stmt(Rollback_stmtContext ctx) {
	}

	public void exitRollback_stmt(Rollback_stmtContext ctx) {
	}

	public void enterSet_session_option(Set_session_optionContext ctx) {
	}

	public void exitSet_session_option(Set_session_optionContext ctx) {
	}

	public void enterSet_current_schema_option(Set_current_schema_optionContext ctx) {
	}

	public void exitSet_current_schema_option(Set_current_schema_optionContext ctx) {
	}

	public void enterSet_mssql_session_option(Set_mssql_session_optionContext ctx) {
	}

	public void exitSet_mssql_session_option(Set_mssql_session_optionContext ctx) {
	}

	public void enterSet_teradata_session_option(Set_teradata_session_optionContext ctx) {
	}

	public void exitSet_teradata_session_option(Set_teradata_session_optionContext ctx) {
	}

	public void enterSignal_stmt(Signal_stmtContext ctx) {
	}

	public void exitSignal_stmt(Signal_stmtContext ctx) {
	}

	public void enterTruncate_stmt(Truncate_stmtContext ctx) {
	}

	public void exitTruncate_stmt(Truncate_stmtContext ctx) {
	}

	public void enterUse_stmt(Use_stmtContext ctx) {
	}

	public void exitUse_stmt(Use_stmtContext ctx) {
	}

	public void enterValues_into_stmt(Values_into_stmtContext ctx) {
	}

	public void exitValues_into_stmt(Values_into_stmtContext ctx) {
	}

	public void enterWhile_stmt(While_stmtContext ctx) {
	}

	public void exitWhile_stmt(While_stmtContext ctx) {
	}

	public void enterFor_cursor_stmt(For_cursor_stmtContext ctx) {
	}

	public void exitFor_cursor_stmt(For_cursor_stmtContext ctx) {
	}

	public void enterFor_range_stmt(For_range_stmtContext ctx) {
	}

	public void exitFor_range_stmt(For_range_stmtContext ctx) {
	}

	public void enterLabel(LabelContext ctx) {
	}

	public void exitLabel(LabelContext ctx) {
	}

	public void enterUsing_clause(Using_clauseContext ctx) {
	}

	public void exitUsing_clause(Using_clauseContext ctx) {
	}

	public void enterSelect_stmt(Select_stmtContext ctx) {
	}

	public void exitSelect_stmt(Select_stmtContext ctx) {
	}

	public void enterCte_select_stmt(Cte_select_stmtContext ctx) {
	}

	public void exitCte_select_stmt(Cte_select_stmtContext ctx) {
	}

	public void enterCte_select_stmt_item(Cte_select_stmt_itemContext ctx) {
	}

	public void exitCte_select_stmt_item(Cte_select_stmt_itemContext ctx) {
	}

	public void enterCte_select_cols(Cte_select_colsContext ctx) {
	}

	public void exitCte_select_cols(Cte_select_colsContext ctx) {
	}

	public void enterFullselect_stmt(Fullselect_stmtContext ctx) {
	}

	public void exitFullselect_stmt(Fullselect_stmtContext ctx) {
	}

	public void enterFullselect_stmt_item(Fullselect_stmt_itemContext ctx) {
	}

	public void exitFullselect_stmt_item(Fullselect_stmt_itemContext ctx) {
	}

	public void enterFullselect_set_clause(Fullselect_set_clauseContext ctx) {
	}

	public void exitFullselect_set_clause(Fullselect_set_clauseContext ctx) {
	}

	public void enterSubselect_stmt(Subselect_stmtContext ctx) {
	}

	public void exitSubselect_stmt(Subselect_stmtContext ctx) {
	}

	public void enterSelect_list(Select_listContext ctx) {
	}

	public void exitSelect_list(Select_listContext ctx) {
	}

	public void enterSelect_list_set(Select_list_setContext ctx) {
	}

	public void exitSelect_list_set(Select_list_setContext ctx) {
	}

	public void enterSelect_list_limit(Select_list_limitContext ctx) {
	}

	public void exitSelect_list_limit(Select_list_limitContext ctx) {
	}

	public void enterSelect_list_item(Select_list_itemContext ctx) {
	}

	public void exitSelect_list_item(Select_list_itemContext ctx) {
	}

	public void enterSelect_list_alias(Select_list_aliasContext ctx) {
	}

	public void exitSelect_list_alias(Select_list_aliasContext ctx) {
	}

	public void enterSelect_list_asterisk(Select_list_asteriskContext ctx) {
	}

	public void exitSelect_list_asterisk(Select_list_asteriskContext ctx) {
	}

	public void enterInto_clause(Into_clauseContext ctx) {
	}

	public void exitInto_clause(Into_clauseContext ctx) {
	}

	public void enterFrom_clause(From_clauseContext ctx) {
	}

	public void exitFrom_clause(From_clauseContext ctx) {
	}

	public void enterFrom_table_clause(From_table_clauseContext ctx) {
	}

	public void exitFrom_table_clause(From_table_clauseContext ctx) {
	}

	public void enterFrom_table_name_clause(From_table_name_clauseContext ctx) {
	}

	public void exitFrom_table_name_clause(From_table_name_clauseContext ctx) {
	}

	public void enterFrom_subselect_clause(From_subselect_clauseContext ctx) {
	}

	public void exitFrom_subselect_clause(From_subselect_clauseContext ctx) {
	}

	public void enterFrom_join_clause(From_join_clauseContext ctx) {
	}

	public void exitFrom_join_clause(From_join_clauseContext ctx) {
	}

	public void enterFrom_join_type_clause(From_join_type_clauseContext ctx) {
	}

	public void exitFrom_join_type_clause(From_join_type_clauseContext ctx) {
	}

	public void enterFrom_table_values_clause(From_table_values_clauseContext ctx) {
	}

	public void exitFrom_table_values_clause(From_table_values_clauseContext ctx) {
	}

	public void enterFrom_table_values_row(From_table_values_rowContext ctx) {
	}

	public void exitFrom_table_values_row(From_table_values_rowContext ctx) {
	}

	public void enterFrom_alias_clause(From_alias_clauseContext ctx) {
	}

	public void exitFrom_alias_clause(From_alias_clauseContext ctx) {
	}

	public void enterTable_name(Table_nameContext ctx) {
	}

	public void exitTable_name(Table_nameContext ctx) {
	}

	public void enterWhere_clause(Where_clauseContext ctx) {
	}

	public void exitWhere_clause(Where_clauseContext ctx) {
	}

	public void enterGroup_by_clause(Group_by_clauseContext ctx) {
	}

	public void exitGroup_by_clause(Group_by_clauseContext ctx) {
	}

	public void enterHaving_clause(Having_clauseContext ctx) {
	}

	public void exitHaving_clause(Having_clauseContext ctx) {
	}

	public void enterOrder_by_clause(Order_by_clauseContext ctx) {
	}

	public void exitOrder_by_clause(Order_by_clauseContext ctx) {
	}

	public void enterSelect_options(Select_optionsContext ctx) {
	}

	public void exitSelect_options(Select_optionsContext ctx) {
	}

	public void enterSelect_options_item(Select_options_itemContext ctx) {
	}

	public void exitSelect_options_item(Select_options_itemContext ctx) {
	}

	public void enterUpdate_stmt(Update_stmtContext ctx) {
	}

	public void exitUpdate_stmt(Update_stmtContext ctx) {
	}

	public void enterUpdate_assignment(Update_assignmentContext ctx) {
	}

	public void exitUpdate_assignment(Update_assignmentContext ctx) {
	}

	public void enterUpdate_table(Update_tableContext ctx) {
	}

	public void exitUpdate_table(Update_tableContext ctx) {
	}

	public void enterUpdate_upsert(Update_upsertContext ctx) {
	}

	public void exitUpdate_upsert(Update_upsertContext ctx) {
	}

	public void enterMerge_stmt(Merge_stmtContext ctx) {
	}

	public void exitMerge_stmt(Merge_stmtContext ctx) {
	}

	public void enterMerge_table(Merge_tableContext ctx) {
	}

	public void exitMerge_table(Merge_tableContext ctx) {
	}

	public void enterMerge_condition(Merge_conditionContext ctx) {
	}

	public void exitMerge_condition(Merge_conditionContext ctx) {
	}

	public void enterMerge_action(Merge_actionContext ctx) {
	}

	public void exitMerge_action(Merge_actionContext ctx) {
	}

	public void enterDelete_stmt(Delete_stmtContext ctx) {
	}

	public void exitDelete_stmt(Delete_stmtContext ctx) {
	}

	public void enterDescribe_stmt(Describe_stmtContext ctx) {
	}

	public void exitDescribe_stmt(Describe_stmtContext ctx) {
	}

	public void enterBool_expr(Bool_exprContext ctx) {
	}

	public void exitBool_expr(Bool_exprContext ctx) {
	}

	public void enterBool_expr_atom(Bool_expr_atomContext ctx) {
	}

	public void exitBool_expr_atom(Bool_expr_atomContext ctx) {
	}

	public void enterBool_expr_unary(Bool_expr_unaryContext ctx) {
	}

	public void exitBool_expr_unary(Bool_expr_unaryContext ctx) {
	}

	public void enterBool_expr_single_in(Bool_expr_single_inContext ctx) {
	}

	public void exitBool_expr_single_in(Bool_expr_single_inContext ctx) {
	}

	public void enterBool_expr_multi_in(Bool_expr_multi_inContext ctx) {
	}

	public void exitBool_expr_multi_in(Bool_expr_multi_inContext ctx) {
	}

	public void enterBool_expr_binary(Bool_expr_binaryContext ctx) {
	}

	public void exitBool_expr_binary(Bool_expr_binaryContext ctx) {
	}

	public void enterBool_expr_logical_operator(Bool_expr_logical_operatorContext ctx) {
	}

	public void exitBool_expr_logical_operator(Bool_expr_logical_operatorContext ctx) {
	}

	public void enterBool_expr_binary_operator(Bool_expr_binary_operatorContext ctx) {
	}

	public void exitBool_expr_binary_operator(Bool_expr_binary_operatorContext ctx) {
	}

	public void enterExpr(ExprContext ctx) {
	}

	public void exitExpr(ExprContext ctx) {
	}

	public void enterExpr_atom(Expr_atomContext ctx) {
	}

	public void exitExpr_atom(Expr_atomContext ctx) {
	}

	public void enterExpr_interval(Expr_intervalContext ctx) {
	}

	public void exitExpr_interval(Expr_intervalContext ctx) {
	}

	public void enterInterval_item(Interval_itemContext ctx) {
	}

	public void exitInterval_item(Interval_itemContext ctx) {
	}

	public void enterExpr_concat(Expr_concatContext ctx) {
	}

	public void exitExpr_concat(Expr_concatContext ctx) {
	}

	public void enterExpr_concat_item(Expr_concat_itemContext ctx) {
	}

	public void exitExpr_concat_item(Expr_concat_itemContext ctx) {
	}

	public void enterExpr_case(Expr_caseContext ctx) {
	}

	public void exitExpr_case(Expr_caseContext ctx) {
	}

	public void enterExpr_case_simple(Expr_case_simpleContext ctx) {
	}

	public void exitExpr_case_simple(Expr_case_simpleContext ctx) {
	}

	public void enterExpr_case_searched(Expr_case_searchedContext ctx) {
	}

	public void exitExpr_case_searched(Expr_case_searchedContext ctx) {
	}

	public void enterExpr_cursor_attribute(Expr_cursor_attributeContext ctx) {
	}

	public void exitExpr_cursor_attribute(Expr_cursor_attributeContext ctx) {
	}

	public void enterExpr_agg_window_func(Expr_agg_window_funcContext ctx) {
	}

	public void exitExpr_agg_window_func(Expr_agg_window_funcContext ctx) {
	}

	public void enterExpr_func_all_distinct(Expr_func_all_distinctContext ctx) {
	}

	public void exitExpr_func_all_distinct(Expr_func_all_distinctContext ctx) {
	}

	public void enterExpr_func_over_clause(Expr_func_over_clauseContext ctx) {
	}

	public void exitExpr_func_over_clause(Expr_func_over_clauseContext ctx) {
	}

	public void enterExpr_func_partition_by_clause(Expr_func_partition_by_clauseContext ctx) {
	}

	public void exitExpr_func_partition_by_clause(Expr_func_partition_by_clauseContext ctx) {
	}

	public void enterExpr_spec_func(Expr_spec_funcContext ctx) {
	}

	public void exitExpr_spec_func(Expr_spec_funcContext ctx) {
	}

	public void enterExpr_func(Expr_funcContext ctx) {
	}

	public void exitExpr_func(Expr_funcContext ctx) {
	}

	public void enterExpr_func_params(Expr_func_paramsContext ctx) {
	}

	public void exitExpr_func_params(Expr_func_paramsContext ctx) {
	}

	public void enterFunc_param(Func_paramContext ctx) {
	}

	public void exitFunc_param(Func_paramContext ctx) {
	}

	public void enterExpr_select(Expr_selectContext ctx) {
	}

	public void exitExpr_select(Expr_selectContext ctx) {
	}

	public void enterExpr_file(Expr_fileContext ctx) {
	}

	public void exitExpr_file(Expr_fileContext ctx) {
	}

	public void enterHive(HiveContext ctx) {
	}

	public void exitHive(HiveContext ctx) {
	}

	public void enterHive_item(Hive_itemContext ctx) {
	}

	public void exitHive_item(Hive_itemContext ctx) {
	}

	public void enterHost(HostContext ctx) {
	}

	public void exitHost(HostContext ctx) {
	}

	public void enterHost_cmd(Host_cmdContext ctx) {
	}

	public void exitHost_cmd(Host_cmdContext ctx) {
	}

	public void enterHost_stmt(Host_stmtContext ctx) {
	}

	public void exitHost_stmt(Host_stmtContext ctx) {
	}

	public void enterFile_name(File_nameContext ctx) {
	}

	public void exitFile_name(File_nameContext ctx) {
	}

	public void enterDate_literal(Date_literalContext ctx) {
	}

	public void exitDate_literal(Date_literalContext ctx) {
	}

	public void enterTimestamp_literal(Timestamp_literalContext ctx) {
	}

	public void exitTimestamp_literal(Timestamp_literalContext ctx) {
	}

	public void enterIdent(IdentContext ctx) {
	}

	public void exitIdent(IdentContext ctx) {
	}

	public void enterSingle_quotedString(Single_quotedStringContext ctx) {
	}

	public void exitSingle_quotedString(Single_quotedStringContext ctx) {
	}

	public void enterDouble_quotedString(Double_quotedStringContext ctx) {
	}

	public void exitDouble_quotedString(Double_quotedStringContext ctx) {
	}

	public void enterInt_number(Int_numberContext ctx) {
	}

	public void exitInt_number(Int_numberContext ctx) {
	}

	public void enterDec_number(Dec_numberContext ctx) {
	}

	public void exitDec_number(Dec_numberContext ctx) {
	}

	public void enterBool_literal(Bool_literalContext ctx) {
	}

	public void exitBool_literal(Bool_literalContext ctx) {
	}

	public void enterNull_const(Null_constContext ctx) {
	}

	public void exitNull_const(Null_constContext ctx) {
	}

	public void enterNon_reserved_words(Non_reserved_wordsContext ctx) {
	}

	public void exitNon_reserved_words(Non_reserved_wordsContext ctx) {
	}

	public void enterEveryRule(ParserRuleContext ctx) {
	}

	public void exitEveryRule(ParserRuleContext ctx) {
	}

	public void visitTerminal(TerminalNode node) {
	}

	public void visitErrorNode(ErrorNode node) {
	}
}
