package com.db.nace.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nace")
public class Nace {

	int naceOrder;
	int nacelevel;
	double naceCode;
	double naceParent;
	String description;
	String itemSummaryMain;
	String itemSummarySub;
	String rulings;
	String excludesSummary;
	int refToISIC;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getNaceOrder() {
		return naceOrder;
	}

	public void setNaceOrder(int naceOrder) {
		this.naceOrder = naceOrder;
	}

	@Column(name = "nace_level", nullable = false)
	public int getNacelevel() {
		return nacelevel;
	}

	public void setNacelevel(int nacelevel) {
		this.nacelevel = nacelevel;
	}

	@Column(name = "nace_code", nullable = false)
	public double getNaceCode() {
		return naceCode;
	}

	public void setNaceCode(double naceCode) {
		this.naceCode = naceCode;
	}

	@Column(name = "nace_parent", nullable = false)
	public double getNaceParent() {
		return naceParent;
	}

	public void setNaceParent(double naceParent) {
		this.naceParent = naceParent;
	}

	@Column(name = "description", nullable = false)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "itemSummaryMain", nullable = false)
	public String getItemSummaryMain() {
		return itemSummaryMain;
	}

	public void setItemSummaryMain(String itemSummaryMain) {
		this.itemSummaryMain = itemSummaryMain;
	}

	@Column(name = "itemSummarySub", nullable = false)
	public String getItemSummarySub() {
		return itemSummarySub;
	}

	public void setItemSummarySub(String itemSummarySub) {
		this.itemSummarySub = itemSummarySub;
	}

	@Column(name = "rulings", nullable = false)
	public String getRulings() {
		return rulings;
	}

	public void setRulings(String rulings) {
		this.rulings = rulings;
	}

	@Column(name = "excludesSummary", nullable = false)
	public String getExcludesSummary() {
		return excludesSummary;
	}

	public void setExcludesSummary(String excludesSummary) {
		this.excludesSummary = excludesSummary;
	}

	@Column(name = "refToISIC", nullable = false)
	public int getRefToISIC() {
		return refToISIC;
	}

	public void setRefToISIC(int refToISIC) {
		this.refToISIC = refToISIC;
	}
}
