package com.tsp_cns_mon.pub_tsp_cns_all_bre_data_rule_publish;
/**
 * This class was automatically generated by the data modeler tool.
 */

public class data_user_defined_multi implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Long code_count;
	private java.util.List<java.lang.Long> user_defined_codes;

	public data_user_defined_multi() {
	}

	public java.lang.Long getCode_count() {
		return this.code_count;
	}

	public void setCode_count(java.lang.Long code_count) {
		this.code_count = code_count;
	}

	public java.util.List<java.lang.Long> getUser_defined_codes() {
		return this.user_defined_codes;
	}

	public void setUser_defined_codes(
			java.util.List<java.lang.Long> user_defined_codes) {
		this.user_defined_codes = user_defined_codes;
	}

	public data_user_defined_multi(java.lang.Long code_count,
			java.util.List<java.lang.Long> user_defined_codes) {
		this.code_count = code_count;
		this.user_defined_codes = user_defined_codes;
	}

}