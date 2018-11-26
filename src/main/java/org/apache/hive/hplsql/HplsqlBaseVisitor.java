//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.apache.hive.hplsql;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
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

public class HplsqlBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements HplsqlVisitor<T> {
	public HplsqlBaseVisitor() {
	}

	public T visitProgram(ProgramContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitBlock(BlockContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitBegin_end_block(Begin_end_blockContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitSingle_block_stmt(Single_block_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitBlock_end(Block_endContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitProc_block(Proc_blockContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitStmt(StmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitSemicolon_stmt(Semicolon_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitException_block(Exception_blockContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitException_block_item(Exception_block_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitNull_stmt(Null_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExpr_stmt(Expr_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitAssignment_stmt(Assignment_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitAssignment_stmt_item(Assignment_stmt_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitAssignment_stmt_single_item(Assignment_stmt_single_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitAssignment_stmt_multiple_item(Assignment_stmt_multiple_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitAssignment_stmt_select_item(Assignment_stmt_select_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitAllocate_cursor_stmt(Allocate_cursor_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitAssociate_locator_stmt(Associate_locator_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitBegin_transaction_stmt(Begin_transaction_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitBreak_stmt(Break_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCall_stmt(Call_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitDeclare_stmt(Declare_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitDeclare_block(Declare_blockContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitDeclare_block_inplace(Declare_block_inplaceContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitDeclare_stmt_item(Declare_stmt_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitDeclare_var_item(Declare_var_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitDeclare_condition_item(Declare_condition_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitDeclare_cursor_item(Declare_cursor_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCursor_with_return(Cursor_with_returnContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCursor_without_return(Cursor_without_returnContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitDeclare_handler_item(Declare_handler_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitDeclare_temporary_table_item(Declare_temporary_table_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_table_stmt(Create_table_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_local_temp_table_stmt(Create_local_temp_table_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_table_columns(Create_table_columnsContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_table_columns_item(Create_table_columns_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitColumn_name(Column_nameContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_table_column_inline_cons(Create_table_column_inline_consContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_table_column_cons(Create_table_column_consContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_table_fk_action(Create_table_fk_actionContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_table_preoptions(Create_table_preoptionsContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_table_preoptions_item(Create_table_preoptions_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_table_options(Create_table_optionsContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_table_options_item(Create_table_options_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_table_options_ora_item(Create_table_options_ora_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_table_options_db2_item(Create_table_options_db2_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_table_options_hive_item(Create_table_options_hive_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_table_hive_row_format(Create_table_hive_row_formatContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_table_hive_row_format_fields(Create_table_hive_row_format_fieldsContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_table_options_mssql_item(Create_table_options_mssql_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_table_options_mysql_item(Create_table_options_mysql_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitAlter_table_stmt(Alter_table_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitAlter_table_item(Alter_table_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitAlter_table_add_constraint(Alter_table_add_constraintContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitAlter_table_add_constraint_item(Alter_table_add_constraint_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitDtype(DtypeContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitDtype_len(Dtype_lenContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitDtype_attr(Dtype_attrContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitDtype_default(Dtype_defaultContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_database_stmt(Create_database_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_database_option(Create_database_optionContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_function_stmt(Create_function_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_function_return(Create_function_returnContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_package_stmt(Create_package_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitPackage_spec(Package_specContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitPackage_spec_item(Package_spec_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_package_body_stmt(Create_package_body_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitPackage_body(Package_bodyContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitPackage_body_item(Package_body_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_procedure_stmt(Create_procedure_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_routine_params(Create_routine_paramsContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_routine_param_item(Create_routine_param_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_routine_options(Create_routine_optionsContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_routine_option(Create_routine_optionContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitDrop_stmt(Drop_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitEnd_transaction_stmt(End_transaction_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExec_stmt(Exec_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitIf_stmt(If_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitIf_plsql_stmt(If_plsql_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitIf_tsql_stmt(If_tsql_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitElseif_block(Elseif_blockContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitElse_block(Else_blockContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitInclude_stmt(Include_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitInsert_stmt(Insert_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitInsert_stmt_cols(Insert_stmt_colsContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitInsert_stmt_rows(Insert_stmt_rowsContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitInsert_stmt_row(Insert_stmt_rowContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitInsert_directory_stmt(Insert_directory_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExit_stmt(Exit_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitGet_diag_stmt(Get_diag_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitGet_diag_stmt_item(Get_diag_stmt_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitGet_diag_stmt_exception_item(Get_diag_stmt_exception_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitGet_diag_stmt_rowcount_item(Get_diag_stmt_rowcount_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitGrant_stmt(Grant_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitGrant_stmt_item(Grant_stmt_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitLeave_stmt(Leave_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitMap_object_stmt(Map_object_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitOpen_stmt(Open_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitFetch_stmt(Fetch_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitClose_stmt(Close_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCmp_stmt(Cmp_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCmp_source(Cmp_sourceContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCopy_from_ftp_stmt(Copy_from_ftp_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCopy_from_local_stmt(Copy_from_local_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCopy_stmt(Copy_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCopy_source(Copy_sourceContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCopy_target(Copy_targetContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCopy_option(Copy_optionContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCopy_file_option(Copy_file_optionContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCopy_ftp_option(Copy_ftp_optionContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCommit_stmt(Commit_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_index_stmt(Create_index_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCreate_index_col(Create_index_colContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitIndex_storage_clause(Index_storage_clauseContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitIndex_mssql_storage_clause(Index_mssql_storage_clauseContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitPrint_stmt(Print_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitRaise_stmt(Raise_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitResignal_stmt(Resignal_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitReturn_stmt(Return_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitRollback_stmt(Rollback_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitSet_session_option(Set_session_optionContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitSet_current_schema_option(Set_current_schema_optionContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitSet_mssql_session_option(Set_mssql_session_optionContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitSet_teradata_session_option(Set_teradata_session_optionContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitSignal_stmt(Signal_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitTruncate_stmt(Truncate_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitUse_stmt(Use_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitValues_into_stmt(Values_into_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitWhile_stmt(While_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitFor_cursor_stmt(For_cursor_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitFor_range_stmt(For_range_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitLabel(LabelContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitUsing_clause(Using_clauseContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitSelect_stmt(Select_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCte_select_stmt(Cte_select_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCte_select_stmt_item(Cte_select_stmt_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitCte_select_cols(Cte_select_colsContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitFullselect_stmt(Fullselect_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitFullselect_stmt_item(Fullselect_stmt_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitFullselect_set_clause(Fullselect_set_clauseContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitSubselect_stmt(Subselect_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitSelect_list(Select_listContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitSelect_list_set(Select_list_setContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitSelect_list_limit(Select_list_limitContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitSelect_list_item(Select_list_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitSelect_list_alias(Select_list_aliasContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitSelect_list_asterisk(Select_list_asteriskContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitInto_clause(Into_clauseContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitFrom_clause(From_clauseContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitFrom_table_clause(From_table_clauseContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitFrom_table_name_clause(From_table_name_clauseContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitFrom_subselect_clause(From_subselect_clauseContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitFrom_join_clause(From_join_clauseContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitFrom_join_type_clause(From_join_type_clauseContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitFrom_table_values_clause(From_table_values_clauseContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitFrom_table_values_row(From_table_values_rowContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitFrom_alias_clause(From_alias_clauseContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitTable_name(Table_nameContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitWhere_clause(Where_clauseContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitGroup_by_clause(Group_by_clauseContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitHaving_clause(Having_clauseContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitOrder_by_clause(Order_by_clauseContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitSelect_options(Select_optionsContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitSelect_options_item(Select_options_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitUpdate_stmt(Update_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitUpdate_assignment(Update_assignmentContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitUpdate_table(Update_tableContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitUpdate_upsert(Update_upsertContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitMerge_stmt(Merge_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitMerge_table(Merge_tableContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitMerge_condition(Merge_conditionContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitMerge_action(Merge_actionContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitDelete_stmt(Delete_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitDescribe_stmt(Describe_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitBool_expr(Bool_exprContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitBool_expr_atom(Bool_expr_atomContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitBool_expr_unary(Bool_expr_unaryContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitBool_expr_single_in(Bool_expr_single_inContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitBool_expr_multi_in(Bool_expr_multi_inContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitBool_expr_binary(Bool_expr_binaryContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitBool_expr_logical_operator(Bool_expr_logical_operatorContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitBool_expr_binary_operator(Bool_expr_binary_operatorContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExpr(ExprContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExpr_atom(Expr_atomContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExpr_interval(Expr_intervalContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitInterval_item(Interval_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExpr_concat(Expr_concatContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExpr_concat_item(Expr_concat_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExpr_case(Expr_caseContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExpr_case_simple(Expr_case_simpleContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExpr_case_searched(Expr_case_searchedContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExpr_cursor_attribute(Expr_cursor_attributeContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExpr_agg_window_func(Expr_agg_window_funcContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExpr_func_all_distinct(Expr_func_all_distinctContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExpr_func_over_clause(Expr_func_over_clauseContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExpr_func_partition_by_clause(Expr_func_partition_by_clauseContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExpr_spec_func(Expr_spec_funcContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExpr_func(Expr_funcContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExpr_func_params(Expr_func_paramsContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitFunc_param(Func_paramContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExpr_select(Expr_selectContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitExpr_file(Expr_fileContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitHive(HiveContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitHive_item(Hive_itemContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitHost(HostContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitHost_cmd(Host_cmdContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitHost_stmt(Host_stmtContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitFile_name(File_nameContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitDate_literal(Date_literalContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitTimestamp_literal(Timestamp_literalContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitIdent(IdentContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitSingle_quotedString(Single_quotedStringContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitDouble_quotedString(Double_quotedStringContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitInt_number(Int_numberContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitDec_number(Dec_numberContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitBool_literal(Bool_literalContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitNull_const(Null_constContext ctx) {
		return this.visitChildren(ctx);
	}

	public T visitNon_reserved_words(Non_reserved_wordsContext ctx) {
		return this.visitChildren(ctx);
	}
}
